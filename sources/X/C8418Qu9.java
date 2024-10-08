package X;

/* renamed from: X.Qu9  reason: case insensitive filesystem */
public final class C8418Qu9 extends T99 {
    public final Object A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C8418Qu9) {
            return this.A00.equals(((C8418Qu9) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public final String toString() {
        return 002.A0g("Optional.of(", this.A00.toString(), ")");
    }

    public C8418Qu9(Object obj) {
        this.A00 = obj;
    }
}
