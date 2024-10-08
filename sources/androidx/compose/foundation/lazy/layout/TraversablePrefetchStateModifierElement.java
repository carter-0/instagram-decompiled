package androidx.compose.foundation.lazy.layout;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass6H8;

public final class TraversablePrefetchStateModifierElement extends AnonymousClass5QP {
    public final AnonymousClass6H8 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof TraversablePrefetchStateModifierElement) && 0qQ.A0K(this.A00, ((TraversablePrefetchStateModifierElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TraversablePrefetchStateModifierElement(prefetchState=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public TraversablePrefetchStateModifierElement(AnonymousClass6H8 r1) {
        this.A00 = r1;
    }
}
