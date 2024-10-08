package androidx.compose.foundation.layout;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;
import androidx.compose.ui.Alignment;

public final class BoxChildDataElement extends AnonymousClass5QP {
    public final Alignment A00;
    public final boolean A01;
    public final 0sP A02;

    public final boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        return boxChildDataElement != null && 0qQ.A0K(this.A00, boxChildDataElement.A00) && this.A01 == boxChildDataElement.A01;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }

    public BoxChildDataElement(Alignment alignment, 0sP r2, boolean z) {
        this.A00 = alignment;
        this.A01 = z;
        this.A02 = r2;
    }
}
