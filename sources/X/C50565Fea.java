package X;

import android.view.View;

/* renamed from: X.Fea  reason: case insensitive filesystem */
public final class C50565Fea implements G7C {
    public final Dd4 A00;

    public C50565Fea(Dd4 dd4) {
        this.A00 = dd4;
    }

    public final boolean AFM(C48087EVf eVf, C283155Gi r5, int i) {
        AnonymousClass7TG.A1N(r5, eVf);
        if (eVf == C48087EVf.END_IMAGE && C46518DgL.A30 == r5.A03()) {
            return true;
        }
        return false;
    }

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r6, int i) {
        AnonymousClass7TG.A1N(r6, eVf);
        this.A00.DgD(C47179Dru.A00(jv7, eVf, i), r6, i);
    }
}
