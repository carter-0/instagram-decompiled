package X;

public enum DcU {
    SUNDAY(0, 1, "SUNDAY"),
    MONDAY(1, 2, "MONDAY"),
    TUESDAY(2, 3, "TUESDAY"),
    WEDNESDAY(3, 4, "WEDNESDAY"),
    THURSDAY(4, 5, "THURSDAY"),
    FRIDAY(5, 6, "FRIDAY"),
    SATURDAY(6, 7, "SATURDAY");
    
    public final int A00;
    public final int A01;
    public final String A02;

    /* access modifiers changed from: public */
    static {
        DcU[] dcUArr;
        A03 = 0oU.A00(dcUArr);
    }

    /* access modifiers changed from: public */
    DcU(int i, int i2, String str) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }
}
