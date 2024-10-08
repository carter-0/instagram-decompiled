package X;

public final class NYI extends AnonymousClass7FV implements AnonymousClass7FF, C3270379d, AnonymousClass7FW {
    public final AnonymousClass7FE A00;
    public final C69603Nol A01;
    public final CharSequence A02;
    public final String A03;
    public final AnonymousClass7FT A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NYI(AnonymousClass7FT r2, AnonymousClass7FE r3, C69603Nol nol, CharSequence charSequence, String str) {
        super(r2);
        0qQ.A0B(str, 3);
        this.A01 = nol;
        this.A02 = charSequence;
        this.A03 = str;
        this.A00 = r3;
        this.A04 = r2;
        this.A05 = charSequence.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYI) {
                NYI nyi = (NYI) obj;
                if (!0qQ.A0K(this.A01, nyi.A01) || !0qQ.A0K(this.A02, nyi.A02) || !0qQ.A0K(this.A03, nyi.A03) || !0qQ.A0K(this.A00, nyi.A00) || !0qQ.A0K(this.A04, nyi.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String ArN() {
        return this.A05;
    }

    public final boolean CUQ() {
        return this.A00.A00;
    }

    public final boolean CUR() {
        return this.A00.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)))));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
