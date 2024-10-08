package X;

public final class S5K {
    public final String A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S5K)) {
            return false;
        }
        return this.A00.equals(((S5K) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        return 002.A0g("Encoding{name=\"", this.A00, "\"}");
    }

    public S5K(String str) {
        this.A00 = str;
    }
}
