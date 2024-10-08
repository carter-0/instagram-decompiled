package X;

public final class K2A extends C62707Kl7 {
    public final 2EG A00;
    public final String A01;

    public K2A(2EG r2, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2A) {
                K2A k2a = (K2A) obj;
                if (!0qQ.A0K(this.A01, k2a.A01) || this.A00 != k2a.A00) {
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
