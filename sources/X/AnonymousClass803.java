package X;

/* renamed from: X.803  reason: invalid class name */
public final class AnonymousClass803 extends AnonymousClass804 {
    public C339977kU A00;

    public AnonymousClass803(C339977kU r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass803) && this.A00 == ((AnonymousClass803) obj).A00);
    }

    public final String getTypeName() {
        return "SIDE_BY_SIDE";
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass803() {
        this(C339977kU.VERTICAL);
    }
}
