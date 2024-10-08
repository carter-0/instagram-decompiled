package androidx.compose.foundation.layout;

import X.0sP;
import X.AnonymousClass5QP;

public final class IntrinsicHeightElement extends AnonymousClass5QP {
    public final Integer A00;
    public final boolean A01 = true;
    public final 0sP A02;

    public IntrinsicHeightElement(Integer num, 0sP r3) {
        this.A00 = num;
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        IntrinsicHeightElement intrinsicHeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicHeightElement) {
            intrinsicHeightElement = (IntrinsicHeightElement) obj;
        } else {
            intrinsicHeightElement = null;
        }
        return intrinsicHeightElement != null && this.A00 == intrinsicHeightElement.A00 && this.A01 == intrinsicHeightElement.A01;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "Min";
        } else {
            str = "Max";
        }
        int hashCode = (str.hashCode() + intValue) * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
