package com.adryd.cardtest;

import java.nio.charset.StandardCharsets;

public class Util {
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
        if (str.startsWith("0x")) { // Get rid of potential prefix
            str = str.substring(2);
        }

        if (str.length() % 2 != 0) { // If string is not of even length
            str = '0' + str; // Assume leading zeroes were left out
        }

        byte[] result = new byte[str.length() / 2];
        for (int i = 0; i < str.length(); i += 2) {
            String nextByte = str.charAt(i) + "" + str.charAt(i + 1);
            // To avoid overflow, parse as int and truncate:
            result[i / 2] = (byte) Integer.parseInt(nextByte, 16);
        }
        return result;
    }

    public static String byteArrayToSafeString(byte[] byteArray) {
        return (new String(byteArray, StandardCharsets.US_ASCII)).replaceAll("[^!-~]", ".");
    }
}
