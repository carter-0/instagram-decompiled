package androidx.compose.foundation;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass7TE;
import X.C267794cD;
import X.C267804cE;
import X.C267944cV;
import X.C287085Yy;
import X.C287615aU;
import X.C52936GfA;

public final class IndicationModifierElement extends AnonymousClass5QP {
    public final C287085Yy A00;
    public final C287615aU A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IndicationModifierElement) {
                IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
                if (!0qQ.A0K(this.A01, indicationModifierElement.A01) || !0qQ.A0K(this.A00, indicationModifierElement.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.GfA, X.4cD, X.4cV] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        C267804cE AKt = this.A00.AKt(this.A01);
        ? r0 = new C267944cV();
        r0.A00 = AKt;
        r0.A0H(AKt);
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r3) {
        C52936GfA gfA = (C52936GfA) r3;
        C267804cE AKt = this.A00.AKt(this.A01);
        gfA.A0I(gfA.A00);
        gfA.A00 = AKt;
        gfA.A0H(AKt);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public IndicationModifierElement(C287085Yy r1, C287615aU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
