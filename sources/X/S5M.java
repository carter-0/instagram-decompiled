package X;

public final class S5M {
    public final String A00;

    public S5M(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof S5M) && 0qQ.A0K(this.A00, ((S5M) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return 002.A0S("AuthenticationError(error=", this.A00, ')');
    }
}
