package X;

/* renamed from: X.7kV  reason: invalid class name and case insensitive filesystem */
public final class C339987kV extends AnonymousClass804 {
    public float A00 = 1.0f;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C339987kV) && Float.compare(this.A00, ((C339987kV) obj).A00) == 0);
    }

    public final String getTypeName() {
        return "PICTURE_IN_PICTURE";
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }
}
