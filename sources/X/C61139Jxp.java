package X;

/* renamed from: X.Jxp  reason: case insensitive filesystem */
public final class C61139Jxp extends AnonymousClass0T0 implements C66384MPq {
    public final 2EG A00;
    public final String A01 = "https://help.instagram.com/523408036294825";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61139Jxp) {
                C61139Jxp jxp = (C61139Jxp) obj;
                if (!0qQ.A0K(this.A01, jxp.A01) || this.A00 != jxp.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C61139Jxp(2EG r2) {
        this.A00 = r2;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }
}
