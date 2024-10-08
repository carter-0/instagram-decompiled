package androidx.compose.foundation.layout;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C287265Zr;

public final class HorizontalAlignElement extends AnonymousClass5QP {
    public final C287265Zr A00;

    public final boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalAlignElement) || (horizontalAlignElement = (HorizontalAlignElement) obj) == null) {
            return false;
        }
        return 0qQ.A0K(this.A00, horizontalAlignElement.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public HorizontalAlignElement(C287265Zr r1) {
        this.A00 = r1;
    }
}
