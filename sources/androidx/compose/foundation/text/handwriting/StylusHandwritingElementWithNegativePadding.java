package androidx.compose.foundation.text.handwriting;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C52937GfB;
import X.C62320sa;

public final class StylusHandwritingElementWithNegativePadding extends AnonymousClass5QP {
    public final C62320sa A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof StylusHandwritingElementWithNegativePadding) && 0qQ.A0K(this.A00, ((StylusHandwritingElementWithNegativePadding) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        return new C52937GfB(this.A00);
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        ((C52937GfB) r2).A00 = this.A00;
    }

    public StylusHandwritingElementWithNegativePadding(C62320sa r1) {
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
