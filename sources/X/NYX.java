package X;

public final class NYX extends AnonymousClass7FV implements AnonymousClass7FW {
    public final C376649Iu A00;
    public final AnonymousClass7FT A01;
    public final AnonymousClass7FE A02;
    public final C69607Nop A03;
    public final C69608Noq A04;
    public final AnonymousClass0eM A05 = C73909Plk.A00(this, 31);
    public final AnonymousClass1Xp A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYX) {
                NYX nyx = (NYX) obj;
                if (!0qQ.A0K(this.A00, nyx.A00) || !0qQ.A0K(this.A06, nyx.A06) || !0qQ.A0K(this.A03, nyx.A03) || !0qQ.A0K(this.A04, nyx.A04) || !0qQ.A0K(this.A02, nyx.A02) || !0qQ.A0K(this.A01, nyx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C69607Nop nop = this.A03;
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TF.A07(nop, ((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31));
    }

    public NYX(C376649Iu r2, AnonymousClass1Xp r3, AnonymousClass7FT r4, AnonymousClass7FE r5, C69607Nop nop, C69608Noq noq) {
        super(r4);
        this.A00 = r2;
        this.A06 = r3;
        this.A03 = nop;
        this.A04 = noq;
        this.A02 = r5;
        this.A01 = r4;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
