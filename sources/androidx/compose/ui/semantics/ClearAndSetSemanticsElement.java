package androidx.compose.ui.semantics;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass5SV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C286355Ve;
import X.C288765cR;

public final class ClearAndSetSemanticsElement extends AnonymousClass5QP implements C286355Ve {
    public final 0sP A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ClearAndSetSemanticsElement) && 0qQ.A0K(this.A00, ((ClearAndSetSemanticsElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.5cR] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        0sP r3 = this.A00;
        ? r0 = new C267794cD();
        r0.A02 = false;
        r0.A01 = true;
        r0.A00 = r3;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        ((C288765cR) r2).A00 = this.A00;
    }

    public final AnonymousClass5SV BsC() {
        AnonymousClass5SV r1 = new AnonymousClass5SV();
        r1.A01 = false;
        r1.A00 = true;
        this.A00.invoke(r1);
        return r1;
    }

    public ClearAndSetSemanticsElement(0sP r1) {
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClearAndSetSemanticsElement(properties=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
