package X;

/* renamed from: X.SfN  reason: case insensitive filesystem */
public final class C11726SfN implements C13763Tgb {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C11389SRd A04;

    public final int B6R() {
        return -1;
    }

    public final int BpA() {
        return this.A03;
    }

    public final int E6b() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A05();
        }
        if (i == 16) {
            return this.A04.A08();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.A00 & 15;
        }
        int A05 = this.A04.A05();
        this.A00 = A05;
        return (A05 & 240) >> 4;
    }

    public C11726SfN(QEK qek) {
        C11389SRd sRd = qek.A00;
        this.A04 = sRd;
        this.A02 = Pxe.A07(sRd, 12) & 255;
        this.A03 = sRd.A07();
    }
}
