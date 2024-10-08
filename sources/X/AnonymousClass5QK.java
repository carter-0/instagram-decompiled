package X;

/* renamed from: X.5QK  reason: invalid class name */
public final class AnonymousClass5QK implements AnonymousClass5QJ {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5QK) && Float.compare(this.A00, ((AnonymousClass5QK) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return 002.A0F("LinearFontScaleConverter(fontScale=", ')', this.A00);
    }

    public final float AJw(float f) {
        return f / this.A00;
    }

    public final float AK0(float f) {
        return f * this.A00;
    }

    public AnonymousClass5QK(float f) {
        this.A00 = f;
    }
}
