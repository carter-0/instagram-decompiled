package X;

public final class K0Z extends C62949Kp1 {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K0Z) {
                K0Z k0z = (K0Z) obj;
                if (!0qQ.A0K(this.A00, k0z.A00) || this.A01 != k0z.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public K0Z(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
