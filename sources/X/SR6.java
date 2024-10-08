package X;

public final class SR6 {
    public int A00;
    public int A01;
    public int A02;
    public final byte[] A03;

    public /* synthetic */ SR6() {
    }

    public static int A00(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long A01(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public final void A02() {
        this.A02 = 0;
        int i = this.A00 + this.A01;
        this.A00 = i;
        if (i > 0) {
            this.A01 = i;
            this.A00 = i - i;
            return;
        }
        this.A01 = 0;
    }

    public /* synthetic */ SR6(byte[] bArr) {
        this();
        this.A02 = Integer.MAX_VALUE;
        this.A03 = bArr;
        this.A00 = 0;
    }
}
