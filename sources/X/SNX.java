package X;

public final class SNX {
    public int A00;
    public boolean A01;
    public final int A02;
    public final RFZ A03;
    public final boolean A04;

    public SNX(RFZ rfz, int i) {
        this.A03 = rfz;
        this.A04 = false;
        this.A02 = i;
        this.A01 = false;
        this.A00 = 0;
    }

    public SNX(RFZ rfz, int i, int i2, boolean z, boolean z2) {
        this.A03 = rfz;
        this.A04 = z;
        this.A02 = i;
        this.A01 = z2;
        this.A00 = i2;
    }

    public SNX(RFZ rfz) {
        this.A03 = rfz;
        this.A04 = false;
        this.A02 = 0;
        this.A01 = false;
        this.A00 = 0;
    }
}
