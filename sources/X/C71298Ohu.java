package X;

import android.view.View;

/* renamed from: X.Ohu  reason: case insensitive filesystem */
public final class C71298Ohu implements View.OnClickListener {
    public final /* synthetic */ C329847Kl A00;

    public C71298Ohu(C329847Kl r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-1651877040);
        C329847Kl r1 = this.A00;
        C329107Hp r0 = r1.A0L;
        r0.A00();
        r0.A00.A16();
        C70965OTm oTm = r1.A04;
        if (oTm == null) {
            str = "bottomSheetController";
        } else {
            NgM ngM = new NgM();
            ngM.A00 = oTm;
            C255273tr r02 = oTm.A00;
            if (r02 == null) {
                str = "source";
            } else {
                ngM.A01 = r02;
                C331127Pr A0W = DbS.A0W(oTm.A05);
                A0W.A1O = true;
                C331157Pu A002 = C72959PQr.A00(A0W, oTm, 6);
                oTm.A01 = A002;
                A002.A03(oTm.A04, ngM);
                AnonymousClass0fD.A0C(1267124514, A05);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
