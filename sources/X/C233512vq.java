package X;

/* renamed from: X.2vq  reason: invalid class name and case insensitive filesystem */
public final class C233512vq implements C233522vr {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final C228812mN A04;

    public final int BRQ() {
        return this.A02;
    }

    public final int BRR() {
        return this.A03;
    }

    public final void Crw(int i, Object obj) {
        C228812mN r2 = this.A04;
        if (r2.CcL(obj)) {
            this.A00 = i;
            this.A02 = 0;
        } else if (r2.CYA(obj)) {
            this.A01 = i;
            this.A03 = 0;
        }
    }

    public final void Cs7(int i) {
        if (i >= this.A00) {
            this.A02++;
        }
    }

    public final void Cs8(int i) {
        if (i >= this.A01) {
            this.A03++;
        }
    }

    public C233512vq(C228812mN r1) {
        this.A04 = r1;
    }
}
