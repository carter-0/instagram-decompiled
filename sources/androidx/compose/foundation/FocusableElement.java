package androidx.compose.foundation;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C287605aT;

public final class FocusableElement extends AnonymousClass5QP {
    public final C287605aT A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusableElement) && 0qQ.A0K(this.A00, ((FocusableElement) obj).A00));
    }

    public final int hashCode() {
        C287605aT r0 = this.A00;
        if (r0 != null) {
            return r0.hashCode();
        }
        return 0;
    }

    public FocusableElement(C287605aT r1) {
        this.A00 = r1;
    }
}
