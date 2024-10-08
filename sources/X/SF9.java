package X;

public final class SF9 {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public SF9(int i, int i2, String str) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = str;
    }

    public SF9(int i, int i2, String str, boolean z) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = z;
        this.A03 = str;
    }
}
