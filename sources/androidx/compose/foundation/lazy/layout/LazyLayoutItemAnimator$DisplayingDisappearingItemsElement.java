package androidx.compose.foundation.lazy.layout;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass6H4;

public final class LazyLayoutItemAnimator$DisplayingDisappearingItemsElement extends AnonymousClass5QP {
    public final AnonymousClass6H4 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && 0qQ.A0K(this.A00, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisplayingDisappearingItemsElement(animator=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public LazyLayoutItemAnimator$DisplayingDisappearingItemsElement(AnonymousClass6H4 r1) {
        this.A00 = r1;
    }
}
