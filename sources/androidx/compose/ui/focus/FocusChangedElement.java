package androidx.compose.ui.focus;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C52896GeW;

public final class FocusChangedElement extends AnonymousClass5QP {
    public final 0sP A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusChangedElement) && 0qQ.A0K(this.A00, ((FocusChangedElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.GeW] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        0sP r1 = this.A00;
        ? r0 = new C267794cD();
        r0.A00 = r1;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        ((C52896GeW) r2).A00 = this.A00;
    }

    public FocusChangedElement(0sP r1) {
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FocusChangedElement(onFocusChanged=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
