package com.adryd.cardtest;

public enum Commands {
    SELECT(0x00, 0xA4, 0x04, 0x00),
    GET_PROCESSING_OPTIONS(0x80, 0xA8, 0x00, 0x00);
    public final int cla;
    public final int ins;
    public final int p1;
    public final int p2;

    Commands(int cla, int ins, int p1, int p2) {
        this.cla = cla;
        this.ins = ins;
        this.p1 = p1;
        this.p2 = p2;
    }

}
