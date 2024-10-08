package X;

/* renamed from: X.5ag  reason: invalid class name and case insensitive filesystem */
public final class C287735ag extends C287725af {
    public float A00;
    public float A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C287735ag)) {
            return false;
        }
        C287735ag r4 = (C287735ag) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        return 002.A0a("AnimationVector2D: v1 = ", ", v2 = ", this.A00, this.A01);
    }

    public C287735ag(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
