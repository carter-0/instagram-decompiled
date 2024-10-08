package X;

public final class S41 {
    public final Object A00;

    public S41(Object obj) {
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof S41) && this.A00 == ((S41) obj).A00);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.A00) * 31) - 822222022;
    }
}
