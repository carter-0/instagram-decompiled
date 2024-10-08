package X;

/* renamed from: X.Seh  reason: case insensitive filesystem */
public final class C11684Seh implements C13809Thc {
    public final C11389SRd A00 = Pxe.A0P(4);
    public final C11688Sel A01 = new C11688Sel(-1, -1, "image/webp");

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final void CMU(YBZ ybz) {
        this.A01.CMU(ybz);
    }

    public final int E67(C13910TlA tlA, C21363XYr xYr) {
        return this.A01.E67(tlA, xYr);
    }

    public final void EKu(long j, long j2) {
        this.A01.EKu(j, j2);
    }

    public final boolean Evx(C13910TlA tlA) {
        C11389SRd sRd = this.A00;
        sRd.A0M(4);
        tlA.E2F(sRd.A02, 0, 4);
        if (sRd.A0C() != 1380533830) {
            return false;
        }
        tlA.AAu(4);
        C13910TlA.A00(sRd, tlA, 4);
        if (sRd.A0C() == 1464156752) {
            return true;
        }
        return false;
    }
}
