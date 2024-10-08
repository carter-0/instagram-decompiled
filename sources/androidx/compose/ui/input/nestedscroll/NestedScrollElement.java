package androidx.compose.ui.input.nestedscroll;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5WO;

public final class NestedScrollElement extends AnonymousClass5QP {
    public final AnonymousClass5WO A00;
    public final NestedScrollDispatcher A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (!0qQ.A0K(nestedScrollElement.A00, this.A00) || !0qQ.A0K(nestedScrollElement.A01, this.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A00.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.A01;
        if (nestedScrollDispatcher != null) {
            i = nestedScrollDispatcher.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public NestedScrollElement(AnonymousClass5WO r1, NestedScrollDispatcher nestedScrollDispatcher) {
        this.A00 = r1;
        this.A01 = nestedScrollDispatcher;
    }
}
