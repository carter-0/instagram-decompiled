package X;

public final class S5f {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S5f) {
                S5f s5f = (S5f) obj;
                if (!0qQ.A0K(this.A01, s5f.A01) || this.A00 != s5f.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0l("AuthTicketCapabilities(name=", this.A01, ", ttl=", ')', this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + this.A00;
    }

    public S5f(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
