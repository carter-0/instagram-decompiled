package X;

public final class ONC {
    public final String A00;

    public ONC(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ONC) && 0qQ.A0K(this.A00, ((ONC) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return G9w.A0k("OffsiteDataKey(securityOrigin=", this.A00);
    }
}
