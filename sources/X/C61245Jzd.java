package X;

/* renamed from: X.Jzd  reason: case insensitive filesystem */
public final class C61245Jzd extends AnonymousClass0T0 implements MR2 {
    public final C61083JwL A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61245Jzd) {
                C61245Jzd jzd = (C61245Jzd) obj;
                if (!0qQ.A0K(this.A01, jzd.A01) || !0qQ.A0K(this.A00, jzd.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C61245Jzd(C61083JwL jwL, String str) {
        this.A01 = str;
        this.A00 = jwL;
    }
}
