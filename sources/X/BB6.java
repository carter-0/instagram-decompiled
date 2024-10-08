package X;

public final class BB6 extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BB6) {
                BB6 bb6 = (BB6) obj;
                if (!0qQ.A0K(this.A01, bb6.A01) || !0qQ.A0K(this.A00, bb6.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public BB6(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
