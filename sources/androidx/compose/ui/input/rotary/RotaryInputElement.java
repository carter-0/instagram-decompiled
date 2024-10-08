package androidx.compose.ui.input.rotary;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;

public final class RotaryInputElement extends AnonymousClass5QP {
    public final 0sP A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof RotaryInputElement) && 0qQ.A0K(this.A00, ((RotaryInputElement) obj).A00));
    }

    public final int hashCode() {
        0sP r0 = this.A00;
        return (r0 == null ? 0 : r0.hashCode()) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RotaryInputElement(onRotaryScrollEvent=");
        sb.append(this.A00);
        sb.append(", onPreRotaryScrollEvent=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }

    public RotaryInputElement(0sP r1) {
        this.A00 = r1;
    }
}
