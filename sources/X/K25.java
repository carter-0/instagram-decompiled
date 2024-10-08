package X;

public final class K25 extends C62705Kl5 {
    public final C266444Yx A00;
    public final C266444Yx A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K25) {
                K25 k25 = (K25) obj;
                if (!0qQ.A0K(this.A01, k25.A01) || !0qQ.A0K(this.A00, k25.A00)) {
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

    public K25(C266444Yx r1, C266444Yx r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
