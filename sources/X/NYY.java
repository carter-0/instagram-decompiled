package X;

public final class NYY extends AnonymousClass7FV implements AnonymousClass7FW {
    public final AnonymousClass7FE A00;
    public final Boolean A01;
    public final CharSequence A02;
    public final String A03;
    public final String A04;
    public final AnonymousClass7FT A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NYY(AnonymousClass7FT r2, AnonymousClass7FE r3, Boolean bool, CharSequence charSequence, String str, String str2, boolean z) {
        super(r2);
        0qQ.A0B(charSequence, 2);
        this.A04 = str;
        this.A02 = charSequence;
        this.A03 = str2;
        this.A01 = bool;
        this.A00 = r3;
        this.A05 = r2;
        this.A06 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYY) {
                NYY nyy = (NYY) obj;
                if (!0qQ.A0K(this.A04, nyy.A04) || !0qQ.A0K(this.A02, nyy.A02) || !0qQ.A0K(this.A03, nyy.A03) || !0qQ.A0K(this.A01, nyy.A01) || !0qQ.A0K(this.A00, nyy.A00) || !0qQ.A0K(this.A05, nyy.A05) || this.A06 != nyy.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E = AnonymousClass7TG.A0E(this.A04) * 31;
        return DbS.A06(this.A06, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A00, (((AnonymousClass7TF.A07(this.A02, A0E) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31)));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
