package X;

/* renamed from: X.Seg  reason: case insensitive filesystem */
public final class C11683Seg implements C13809Thc {
    public final C11389SRd A00 = Pxe.A0P(4);
    public final C11688Sel A01 = new C11688Sel(-1, -1, "image/heif");

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final boolean Evx(C13910TlA tlA) {
        tlA.AAu(4);
        C11389SRd sRd = this.A00;
        sRd.A0M(4);
        tlA.E2F(sRd.A02, 0, 4);
        if (sRd.A0C() == 1718909296) {
            C13910TlA.A00(sRd, tlA, 4);
            if (sRd.A0C() != 1751476579) {
                return false;
            }
            return true;
        }
        return false;
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
}
