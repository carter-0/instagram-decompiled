package androidx.compose.foundation.layout;

import X.AnonymousClass5QP;
import X.C289095d0;

public final class UnspecifiedConstraintsElement extends AnonymousClass5QP {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!C289095d0.A01(this.A01, unspecifiedConstraintsElement.A01) || !C289095d0.A01(this.A00, unspecifiedConstraintsElement.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00);
    }

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
