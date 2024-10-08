package X;

/* renamed from: X.9Z9  reason: invalid class name */
public final class AnonymousClass9Z9 extends C21288XSt {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass9Z9) && this.A00 == ((AnonymousClass9Z9) obj).A00);
    }

    public final String toString() {
        return 002.A0K("AiInputLong(number=", ')', this.A00);
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public AnonymousClass9Z9(long j) {
        this.A00 = j;
    }
}
