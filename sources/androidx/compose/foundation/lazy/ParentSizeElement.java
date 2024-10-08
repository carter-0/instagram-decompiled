package androidx.compose.foundation.lazy;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C270284gU;

public final class ParentSizeElement extends AnonymousClass5QP {
    public final float A00;
    public final C270284gU A01;
    public final C270284gU A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.A00 == parentSizeElement.A00 && 0qQ.A0K(this.A02, parentSizeElement.A02) && 0qQ.A0K(this.A01, parentSizeElement.A01);
    }

    public final int hashCode() {
        int i;
        C270284gU r0 = this.A02;
        int i2 = 0;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C270284gU r02 = this.A01;
        if (r02 != null) {
            i2 = r02.hashCode();
        }
        return ((i3 + i2) * 31) + Float.floatToIntBits(this.A00);
    }

    public ParentSizeElement(C270284gU r1, C270284gU r2, float f) {
        this.A00 = f;
        this.A02 = r1;
        this.A01 = r2;
    }
}
