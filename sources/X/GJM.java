package X;

public final class GJM extends AnonymousClass0T0 implements JN3 {
    public final int A00;
    public final JN2 A01;

    public GJM(JN2 jn2, int i) {
        0qQ.A0B(jn2, 1);
        this.A01 = jn2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GJM) {
                GJM gjm = (GJM) obj;
                if (!0qQ.A0K(this.A01, gjm.A01) || this.A00 != gjm.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }
}
