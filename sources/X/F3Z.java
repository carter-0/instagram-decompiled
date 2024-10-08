package X;

public final class F3Z {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof F3Z) && this.A00 == ((F3Z) obj).A00);
    }

    public final String toString() {
        return 002.A0K("RenderSummary(createdAt=", ')', this.A00);
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public F3Z(long j) {
        this.A00 = j;
    }
}
