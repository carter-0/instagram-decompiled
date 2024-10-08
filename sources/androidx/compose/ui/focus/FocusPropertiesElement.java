package androidx.compose.ui.focus;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C285225Qg;

public final class FocusPropertiesElement extends AnonymousClass5QP {
    public final C285225Qg A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusPropertiesElement) && 0qQ.A0K(this.A00, ((FocusPropertiesElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FocusPropertiesElement(scope=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public FocusPropertiesElement(C285225Qg r1) {
        this.A00 = r1;
    }
}
