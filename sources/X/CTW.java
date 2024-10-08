package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CTW extends CU4 {
    public final double A00;
    public final double A01;
    public final float A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;

    public CTW() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (DefaultConstructorMarker) null, 0.0d, 0.0d, 0.0f, 1023, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CTW) {
                CTW ctw = (CTW) obj;
                if (Float.compare(this.A02, ctw.A02) != 0 || !0qQ.A0K(this.A04, ctw.A04) || !0qQ.A0K(this.A03, ctw.A03) || Double.compare(this.A01, ctw.A01) != 0 || Double.compare(this.A00, ctw.A00) != 0 || !0qQ.A0K(this.A05, ctw.A05) || !0qQ.A0K(this.A06, ctw.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((Float.floatToIntBits(this.A02) * 31) + C54732HQn.A00()) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31 * 31;
    }

    public /* synthetic */ CTW(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, DefaultConstructorMarker defaultConstructorMarker, double d, double d2, float f, int i, boolean z) {
        this.A02 = 0.35f;
        this.A04 = 2;
        this.A03 = 4;
        this.A01 = 0.5d;
        this.A00 = 0.5d;
        this.A05 = 2;
        this.A06 = 2;
    }
}
