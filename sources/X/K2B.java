package X;

public final class K2B extends C62707Kl7 {
    public final C266444Yx A00;
    public final C266444Yx A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2B) {
                K2B k2b = (K2B) obj;
                if (!0qQ.A0K(this.A01, k2b.A01) || !0qQ.A0K(this.A00, k2b.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public K2B(C266444Yx r1, C266444Yx r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
