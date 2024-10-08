package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CTX extends CU4 {
    public final double A00;
    public final double A01;
    public final float A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;

    public CTX() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (DefaultConstructorMarker) null, 0.0d, 0.0d, 0.0f, 1023, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CTX) {
                CTX ctx = (CTX) obj;
                if (Float.compare(this.A02, ctx.A02) != 0 || !0qQ.A0K(this.A04, ctx.A04) || !0qQ.A0K(this.A03, ctx.A03) || Double.compare(this.A01, ctx.A01) != 0 || Double.compare(this.A00, ctx.A00) != 0 || !0qQ.A0K(this.A05, ctx.A05) || !0qQ.A0K(this.A06, ctx.A06)) {
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

    public /* synthetic */ CTX(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, DefaultConstructorMarker defaultConstructorMarker, double d, double d2, float f, int i, boolean z) {
        this.A02 = 0.2f;
        this.A04 = 2;
        this.A03 = 1;
        this.A01 = 0.5d;
        this.A00 = 0.5d;
        this.A05 = 2;
        this.A06 = 2;
    }
}
