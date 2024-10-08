package androidx.compose.ui.input.key;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;

public final class KeyInputElement extends AnonymousClass5QP {
    public final 0sP A00;
    public final 0sP A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KeyInputElement) {
                KeyInputElement keyInputElement = (KeyInputElement) obj;
                if (!0qQ.A0K(this.A00, keyInputElement.A00) || !0qQ.A0K(this.A01, keyInputElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        0sP r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        0sP r02 = this.A01;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyInputElement(onKeyEvent=");
        sb.append(this.A00);
        sb.append(", onPreKeyEvent=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public KeyInputElement(0sP r1, 0sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
