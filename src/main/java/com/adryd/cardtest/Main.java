package com.adryd.cardtest;

import javax.smartcardio.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void printBytes(byte[] byteArray) {
        System.out.println((new String(byteArray, StandardCharsets.US_ASCII)).replaceAll("[^!-~]", "."));
        System.out.println(Util.byteArrayToHexString(byteArray));
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

    public static void main(String[] argv) throws CardException {


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

        TLVParser payParser = new TLVParser();
        payParser.parse(twopay.getData());

        Set<byte[]> foundAids = new HashSet<>();
        // Pretend we decoded tlv and don't just add known values
        // Interac
        foundAids.add(Util.hexStringToByteArray("A0000002771010"));
        // Visa
        foundAids.add(Util.hexStringToByteArray("A0000000031010"));
        // Mastercard
        foundAids.add(Util.hexStringToByteArray("A0000000041010"));

        // Example response for VISA CREDIT emv test card
        byte[] PDOLResponse = Util.hexStringToByteArray("9F02060000000000019F1A02007C");

        for (byte[] aid : foundAids) {
            ResponseAPDU applicationResponse = sendCommand(channel, Commands.SELECT, aid, 0x100);
            TLVParser aidParser = new TLVParser();
            aidParser.parse(applicationResponse.getData());

            // Pretend we decoded tlv
            byte[] PODL = Util.hexStringToByteArray("9F59039F5A019F02069F1A025F2A029F37049F5801");
        }
        card.disconnect(false);
    }
}
