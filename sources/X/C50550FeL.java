package X;

import android.view.View;

/* renamed from: X.FeL  reason: case insensitive filesystem */
public final class C50550FeL implements G7C {
    public final Dd4 A00;

    public C50550FeL(Dd4 dd4) {
        this.A00 = dd4;
    }

    public final boolean AFM(C48087EVf eVf, C283155Gi r4, int i) {
        AnonymousClass7TG.A1N(r4, eVf);
        if (r4.A05 == C283195Gm.FOLLOW_REQUEST && eVf == C48087EVf.CONTAINER && r4.A04.A1D.getValue() != null) {
            return true;
        }
        return false;
    }

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r6, int i) {
        AnonymousClass7TG.A1N(r6, eVf);
        this.A00.DgD(C47179Dru.A00(jv7, eVf, i), r6, i);
    }
}
