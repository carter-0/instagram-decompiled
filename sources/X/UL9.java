package X;

public final class UL9 extends AnonymousClass0T0 {
    public final C56078HsR A00;
    public final C56078HsR A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UL9) {
                UL9 ul9 = (UL9) obj;
                if (!0qQ.A0K(this.A01, ul9.A01) || !0qQ.A0K(this.A00, ul9.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = ((AnonymousClass7TG.A0C(this.A01) * 31 * 31) + AnonymousClass7TG.A0C(this.A00)) * 31;
        int A002 = C54732HQn.A00();
        return ((((((A0C + A002) * 31 * 31 * 31 * 31) + A002) * 31) + A002) * 31) + A002;
    }

    public UL9(C56078HsR hsR, C56078HsR hsR2) {
        this.A01 = hsR;
        this.A00 = hsR2;
    }

    public UL9() {
        this((C56078HsR) null, (C56078HsR) null);
    }
}
