package X;

/* renamed from: X.Vw1  reason: case insensitive filesystem */
public final class C18649Vw1 {
    public final Integer A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18649Vw1) {
                C18649Vw1 vw1 = (C18649Vw1) obj;
                if (!(Float.compare(this.A01, vw1.A01) == 0 && this.A00 == vw1.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final W08 A00(float f, float f2) {
        if (this.A00 == AnonymousClass05K.A01) {
            float f3 = this.A01 / 100.0f;
            return new W08(f3 * f, f3 * f2);
        }
        float f4 = this.A01;
        return new W08(f4, f4);
    }

    public final int hashCode() {
        String str;
        int floatToIntBits = Float.floatToIntBits(this.A01) * 31;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "PERCENT";
        } else {
            str = "POINT";
        }
        return floatToIntBits + str.hashCode() + intValue;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("LengthPercentage(value=");
        sb.append(this.A01);
        sb.append(", type=");
        if (this.A00.intValue() != 0) {
            str = "PERCENT";
        } else {
            str = "POINT";
        }
        return C51975G9x.A0i(str, sb);
    }

    public C18649Vw1(Integer num, float f) {
        this.A01 = f;
        this.A00 = num;
    }

    public C18649Vw1() {
        this(AnonymousClass05K.A00, 0.0f);
    }
}
