package X;

import android.view.View;

/* renamed from: X.FeV  reason: case insensitive filesystem */
public final class C50560FeV implements G7C {
    public final Dd4 A00;

    public final boolean AFM(C48087EVf eVf, C283155Gi r4, int i) {
        0qQ.A0B(r4, 0);
        String A07 = r4.A07();
        if (A07 == null || A07.length() == 0 || r4.A04.A1D.getValue() != null) {
            return false;
        }
        return true;
    }

    public C50560FeV(Dd4 dd4) {
        this.A00 = dd4;
    }

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r7, int i) {
        AnonymousClass7TG.A1N(r7, eVf);
        C47179Dru A002 = C47179Dru.A00(jv7, eVf, i);
        Boolean bool = r7.A04.A0J;
        if ((bool == null || !bool.booleanValue()) && r7.A08() == null && r7.A00 != 5) {
            this.A00.D4k(A002, r7, i);
            return;
        }
        Dd4 dd4 = this.A00;
        String A07 = r7.A07();
        if (A07 != null) {
            dd4.DPt(A002, r7, A07, i);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
