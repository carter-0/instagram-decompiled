package androidx.compose.ui.draw;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;

public final class DrawWithContentElement extends AnonymousClass5QP {
    public final 0sP A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DrawWithContentElement) && 0qQ.A0K(this.A00, ((DrawWithContentElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DrawWithContentElement(onDraw=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public DrawWithContentElement(0sP r1) {
        this.A00 = r1;
    }
}
