package X;

public enum RFp {
    DEFAULT_CELL(2, 11),
    ACCORDION_CELL(4, 11),
    ACCORDION_HOVERED_CELL(11, 11),
    ACCORDION_HEADER_CELL(4, 4),
    ACCORDION_PUX_CELL(4, 4);
    
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    /* access modifiers changed from: public */
    static {
        RFp[] rFpArr;
        A04 = 0oU.A00(rFpArr);
    }

    /* access modifiers changed from: public */
    RFp(int i, int i2) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = 11;
        this.A03 = 4;
    }
}
