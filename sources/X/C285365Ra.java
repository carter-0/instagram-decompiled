package X;

/* renamed from: X.5Ra  reason: invalid class name and case insensitive filesystem */
public final class C285365Ra {
    public final float A00;
    public final float A01;

    public final float[] A00() {
        float f = this.A00;
        float f2 = this.A01;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C285365Ra) {
                C285365Ra r5 = (C285365Ra) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        return 002.A0U("WhitePoint(x=", ", y=", ')', this.A00, this.A01);
    }

    public C285365Ra(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
