package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CTV extends CU4 {
    public final double A00 = 0.5d;
    public final double A01 = 0.5d;
    public final float A02 = 1.0f;
    public final Integer A03 = 3;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CTV) {
                CTV ctv = (CTV) obj;
                if (!(Float.compare(this.A02, ctv.A02) == 0 && 0qQ.A0K(this.A03, ctv.A03) && Double.compare(this.A01, ctv.A01) == 0 && Double.compare(this.A00, ctv.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CTV(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, DefaultConstructorMarker defaultConstructorMarker, double d, double d2, float f, int i, boolean z, boolean z2) {
    }

    public final int hashCode() {
        int A002 = C54732HQn.A00();
        return (((((((((Float.floatToIntBits(this.A02) * 31) + A002) * 31 * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31 * 31 * 31 * 31 * 31) + A002;
    }

    public CTV() {
    }
}
