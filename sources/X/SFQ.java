package X;

public final class SFQ {
    public int A00;
    public int A01;
    public S0V A02;
    public boolean A03;
    public final int A04;

    public SFQ(int i, int i2, int i3) {
        this.A00 = i;
        this.A04 = i3;
        this.A01 = i2;
        this.A03 = false;
    }

    public SFQ(SF8 sf8) {
        this.A00 = sf8.A00;
        this.A04 = sf8.A02;
        this.A01 = sf8.A01;
        this.A03 = sf8.A03;
    }
}
