package X;

/* renamed from: X.5ae  reason: invalid class name and case insensitive filesystem */
public final class C287715ae extends C287725af {
    public float A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C287715ae) || ((C287715ae) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return 002.A0N("AnimationVector1D: value = ", this.A00);
    }
}
