package X;

public final class W08 {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W08) {
                W08 w08 = (W08) obj;
                if (!(Float.compare(this.A00, w08.A00) == 0 && Float.compare(this.A01, w08.A01) == 0)) {
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
        return 002.A0U("CornerRadii(horizontal=", ", vertical=", ')', this.A00, this.A01);
    }

    public static W08 A00(W08 w08) {
        return new W08(W2U.A01(w08.A00), W2U.A01(w08.A01));
    }

    public W08(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public W08() {
        this(0.0f, 0.0f);
    }
}
