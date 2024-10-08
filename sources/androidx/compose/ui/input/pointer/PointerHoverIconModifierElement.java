package androidx.compose.ui.input.pointer;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass7TE;
import X.C267794cD;
import X.C286445Wj;
import X.C52696Gb8;
import X.C54732HQn;
import X.G9t;
import X.GQ7;
import X.J6M;

public final class PointerHoverIconModifierElement extends AnonymousClass5QP {
    public final C286445Wj A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof PointerHoverIconModifierElement) && 0qQ.A0K(this.A00, ((PointerHoverIconModifierElement) obj).A00));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.Gb8] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        C286445Wj r1 = this.A00;
        ? r0 = new C267794cD();
        r0.A00 = r1;
        return r0;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.0r1, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void A01(C267794cD r3) {
        C52696Gb8 gb8 = (C52696Gb8) r3;
        C286445Wj r1 = this.A00;
        if (!0qQ.A0K(gb8.A00, r1)) {
            gb8.A00 = r1;
            if (gb8.A01) {
                ? obj = new Object();
                obj.A00 = true;
                GQ7.A03(gb8, J6M.A00(obj, 28));
                if (obj.A00) {
                    C52696Gb8.A01(gb8);
                }
            }
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + C54732HQn.A00();
    }

    public PointerHoverIconModifierElement(C286445Wj r1) {
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PointerHoverIconModifierElement(icon=");
        A1A.append(this.A00);
        A1A.append(", overrideDescendants=");
        return G9t.A1C(A1A, false);
    }
}
