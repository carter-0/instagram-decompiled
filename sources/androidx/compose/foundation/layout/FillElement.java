package androidx.compose.foundation.layout;

import X.AnonymousClass5QP;
import X.XU6;

public final class FillElement extends AnonymousClass5QP {
    public final float A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FillElement) {
                FillElement fillElement = (FillElement) obj;
                if (!(this.A01 == fillElement.A01 && this.A00 == fillElement.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (XU6.A00(this.A01) * 31) + Float.floatToIntBits(this.A00);
    }

    public FillElement(Integer num, float f) {
        this.A01 = num;
        this.A00 = f;
    }
}
