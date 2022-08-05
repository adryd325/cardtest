package com.adryd.cardtest;

import java.util.ArrayList;
import java.util.List;

public class TLVParser {
    private List<TLVEntry> values;
    private byte[] workingData;

    public TLVParser() {
        values = new ArrayList<>();
    }

    public void parse(byte[] data) {
        // TLV parsing... oh god oh fuck
        this.workingData = data;
        int prevLength = 0;
        while (true) {
            if (this.workingData.length == 0) {
                break;
            }
            if (prevLength == this.workingData.length) {
                break;
            }
            prevLength = this.workingData.length;

            for (int i = 0; i < 2; i++) {
                byte[] match = new byte[i + 1];
                System.arraycopy(this.workingData, 0, match, 0, i + 1);
                if (TLVTags.TagMap.containsKey(Util.byteArrayToHexString(match))) {
                    TLVTags.TLVTag tag = TLVTags.TagMap.get(Util.byteArrayToHexString(match));
                    this.trim(i + 1);
                    int length = this.trim(1)[0];
                    byte[] parsedData = this.trim(length);
                    System.out.println(tag.getName());
                    System.out.println(Util.byteArrayToHexString(parsedData));
                    System.out.println(Util.byteArrayToSafeString(parsedData));
                    System.out.println();
                    if (tag.getDataType() == TLVTags.TLVDataType.NESTED) {
                        new TLVParser().parse(parsedData);
                    }
                    break;
                }
            }
        }
    }

    private byte[] trim(int bytes) {
        byte[] newArray = new byte[this.workingData.length - bytes];
        if (this.workingData.length - bytes >= 0)
            System.arraycopy(this.workingData, bytes, newArray, 0, this.workingData.length - bytes);

        byte[] retVal = new byte[bytes];
        System.arraycopy(this.workingData, 0, retVal, 0, bytes);

        this.workingData = newArray;
        return retVal;
    }
}
