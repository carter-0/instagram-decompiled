package X;

/* renamed from: X.96K  reason: invalid class name */
public final class AnonymousClass96K {
    public final boolean A00;
    public final Class A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass96K)) {
            return false;
        }
        AnonymousClass96K r4 = (AnonymousClass96K) obj;
        if (!r4.A01.equals(this.A01) || r4.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A01.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.A00).hashCode();
    }

    public AnonymousClass96K(Class cls, boolean z) {
        this.A01 = cls;
        this.A00 = z;
    }
}
