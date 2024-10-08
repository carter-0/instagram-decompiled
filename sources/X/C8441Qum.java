package X;

/* renamed from: X.Qum  reason: case insensitive filesystem */
public final class C8441Qum extends T9A {
    public final Object A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C8441Qum) {
            return this.A00.equals(((C8441Qum) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public final String toString() {
        return 002.A0g("Optional.of(", this.A00.toString(), ")");
    }

    public C8441Qum(Object obj) {
        this.A00 = obj;
    }
}
