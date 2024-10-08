package X;

public final class K2H extends C62709Kl9 {
    public final C61037Jvb A00;
    public final String A01;

    public K2H(C61037Jvb jvb, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = jvb;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2H) {
                K2H k2h = (K2H) obj;
                if (!0qQ.A0K(this.A01, k2h.A01) || !0qQ.A0K(this.A00, k2h.A00)) {
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
}
