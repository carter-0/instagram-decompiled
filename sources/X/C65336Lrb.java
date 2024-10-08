package X;

/* renamed from: X.Lrb  reason: case insensitive filesystem */
public final class C65336Lrb implements XBw {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;
    public final int A04;

    public final void CFQ(VY1 vy1) {
        0qQ.A0B(vy1, 0);
        vy1.A02 = 0;
        vy1.A03 = 0;
        int i = this.A01;
        int i2 = this.A04;
        if (i != i2) {
            vy1.A02 = (i2 - i) / 2;
        } else {
            int i3 = this.A00;
            int i4 = this.A03;
            if (i3 != i4) {
                vy1.A03 = (i4 - i3) / 2;
            }
        }
        vy1.A01 = i;
        vy1.A00 = this.A00;
    }

    public final void cleanup() {
    }

    public final int B86() {
        return 0;
    }

    public final int Blj() {
        return this.A00;
    }

    public final int Blp() {
        return this.A01;
    }

    public final void EiS(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final int getHeight() {
        return this.A03;
    }

    public final int getWidth() {
        return this.A04;
    }

    public C65336Lrb(int i, int i2, boolean z) {
        this.A04 = i;
        this.A03 = i2;
        this.A02 = z;
        this.A01 = i;
        this.A00 = i2;
    }
}
