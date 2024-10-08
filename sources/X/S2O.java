package X;

public final class S2O {
    public int A00 = -1;
    public int A01 = -1;
    public long A02;
    public final int[] A03 = new int[10];

    public final void A00(int i) {
        int i2;
        int i3 = (this.A00 + 1) % 10;
        this.A00 = i3;
        int i4 = this.A01;
        if (i3 == i4) {
            this.A02 -= (long) this.A03[i4];
            i2 = (i4 + 1) % 10;
        } else {
            if (i4 == -1) {
                i2 = 0;
            }
            this.A03[i3] = i;
            this.A02 += (long) i;
        }
        this.A01 = i2;
        this.A03[i3] = i;
        this.A02 += (long) i;
    }
}
