package androidx.compose.ui.focus;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5WQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C56547I1b;

public final class FocusRequesterElement extends AnonymousClass5QP {
    public final C56547I1b A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusRequesterElement) && 0qQ.A0K(this.A00, ((FocusRequesterElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.5WQ] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        C56547I1b i1b = this.A00;
        ? r0 = new C267794cD();
        r0.A00 = i1b;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        AnonymousClass5WQ r22 = (AnonymousClass5WQ) r2;
        r22.A00.A00.A0B(r22);
        C56547I1b i1b = this.A00;
        r22.A00 = i1b;
        i1b.A00.A09(r22);
    }

    public FocusRequesterElement(C56547I1b i1b) {
        this.A00 = i1b;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FocusRequesterElement(focusRequester=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
