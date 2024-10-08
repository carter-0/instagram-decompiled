package X;

import android.view.View;

/* renamed from: X.FeF  reason: case insensitive filesystem */
public final class C50544FeF implements G7C {
    public final Dd4 A00;

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r7, int i) {
        AnonymousClass7TF.A1H(r7, eVf);
        this.A00.D8v(C47179Dru.A00(jv7, eVf, i), r7, i, false);
    }

    public C50544FeF(Dd4 dd4) {
        this.A00 = dd4;
    }

    public final boolean AFM(C48087EVf eVf, C283155Gi r4, int i) {
        AnonymousClass7TG.A1N(r4, eVf);
        if (r4.A05 != C283195Gm.DIRECT_SHARE) {
            return false;
        }
        if (eVf == C48087EVf.END_IMAGE || eVf == C48087EVf.CONTAINER) {
            return true;
        }
        return false;
    }
}
