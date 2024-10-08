package androidx.compose.foundation.layout;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C287245Zp;

public final class VerticalAlignElement extends AnonymousClass5QP {
    public final C287245Zp A00;

    public final boolean equals(Object obj) {
        VerticalAlignElement verticalAlignElement;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalAlignElement) || (verticalAlignElement = (VerticalAlignElement) obj) == null) {
            return false;
        }
        return 0qQ.A0K(this.A00, verticalAlignElement.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public VerticalAlignElement(C287245Zp r1) {
        this.A00 = r1;
    }
}
