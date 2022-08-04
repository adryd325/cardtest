package com.adryd.cardtest;

import javax.smartcardio.*;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    // Is there seriously no builtin for this
    public static String byteArrayToHexString(byte[] byteArray) {
        String str = "";
        for (byte b : byteArray) {
            str = str.concat(String.format("%02X", b));
        }
        return str;
    }

    // Java has everything but also nothing
    public static byte[] hexStringToByteArray(String str) {
        if(str.startsWith("0x")) { // Get rid of potential prefix
            str = str.substring(2);
        }

        if(str.length() % 2 != 0) { // If string is not of even length
            str = '0' + str; // Assume leading zeroes were left out
        }

        byte[] result = new byte[str.length() / 2];
        for(int i = 0; i < str.length(); i += 2) {
            String nextByte = str.charAt(i) + "" + str.charAt(i + 1);
            // To avoid overflow, parse as int and truncate:
            result[i / 2] = (byte) Integer.parseInt(nextByte, 16);
        }
        return result;
    }


    public static void printBytes(byte[] byteArray) {
        System.out.println((new String(byteArray, StandardCharsets.US_ASCII)).replaceAll("[^!-~]", "."));
        System.out.println(byteArrayToHexString(byteArray));
    }


    public static ResponseAPDU sendCommand(CardChannel channel, Commands command, byte[] data, int ne) throws CardException {
        return sendCommand(channel, command.cla, command.ins, command.p1, command.p2, data, ne);
    }

    public static ResponseAPDU sendCommand(CardChannel channel, int cla, int ins, int p1, int p2, byte[] data, int ne) throws CardException {
        CommandAPDU apdu = new CommandAPDU(cla, ins, p1, p2, data, ne);
        System.out.println("Sending: ");
        printBytes(apdu.getBytes());
        ResponseAPDU response = channel.transmit(apdu);
        System.out.println("Received: ");
        printBytes(response.getBytes());
        System.out.println();
        return response;
    }

    public static void main(String[] argv) throws CardException, CharacterCodingException {

        TerminalFactory factory = TerminalFactory.getDefault();

        // Filter out things that aren't actually card readers
        List<CardTerminal> validTerminals = factory.terminals().list().stream().filter((cardTerminal) ->
                {
                    try {
                        return !cardTerminal.toString().startsWith("PC/SC terminal Yubico YubiKey") &&
                                !cardTerminal.toString().startsWith("PC/SC terminal SoloKeys Solo 2") &&
                                cardTerminal.isCardPresent();
                    } catch (CardException e) {
                        throw new RuntimeException(e);
                    }
                }
        ).toList();

        if (validTerminals.isEmpty()) {
            System.out.println("No terminals available");
            return;
        }

        CardTerminal terminal = validTerminals.get(0);
        Card card = terminal.connect("*");

        System.out.println("terminal: " + terminal.toString());
        System.out.println("card: " + card);
        System.out.println("atr: " + Arrays.toString(card.getATR().getBytes()));
        System.out.println();

        CardChannel channel = card.getBasicChannel();
        ResponseAPDU onepay = sendCommand(channel, Commands.SELECT, "1PAY.SYS.DDF01".getBytes(), 0x100);
        ResponseAPDU twopay = sendCommand(channel, Commands.SELECT, "2PAY.SYS.DDF01".getBytes(), 0x100);

        Set<byte[]> foundAids = new HashSet<>();
        // Pretend we decoded tlv and don't just add known values
        // Interac
        foundAids.add(hexStringToByteArray("A0000002771010"));
        // Visa
        foundAids.add(hexStringToByteArray("A0000000031010"));
        // Mastercard
        foundAids.add(hexStringToByteArray("A0000000041010"));

        // Example response for VISA CREDIT emv test card
        byte[] PDOLResponse = hexStringToByteArray("9F02060000000000019F1A02007C");

        for (byte [] aid : foundAids) {
            ResponseAPDU applicationResponse = sendCommand(channel, Commands.SELECT, aid, 0x100);

            // Pretend we decoded tlv
            byte[] PODL = hexStringToByteArray("9F59039F5A019F02069F1A025F2A029F37049F5801");
        }
        card.disconnect(false);
    }
}
