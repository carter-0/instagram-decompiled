package androidx.compose.foundation.layout;

import X.0sP;
import X.AnonymousClass5QP;
import X.C289095d0;

public final class SizeElement extends AnonymousClass5QP {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final boolean A04;
    public final 0sP A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SizeElement) {
                SizeElement sizeElement = (SizeElement) obj;
                if (!C289095d0.A01(this.A03, sizeElement.A03) || !C289095d0.A01(this.A02, sizeElement.A02) || !C289095d0.A01(this.A01, sizeElement.A01) || !C289095d0.A01(this.A00, sizeElement.A00) || this.A04 != sizeElement.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int floatToIntBits = ((((((Float.floatToIntBits(this.A03) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00)) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return floatToIntBits + i;
    }

    public SizeElement(0sP r1, float f, float f2, float f3, float f4, boolean z) {
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A04 = z;
        this.A05 = r1;
    }
}
