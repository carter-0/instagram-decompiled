package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class FdJ implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public FdJ(C307896Rx r1, C277014uI r2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = r2;
                this.A02 = r1;
                break;
            default:
                this.A02 = r2;
                this.A01 = r1;
                break;
        }
    }

    public static void A00(C310336ap r1, Object obj, Object obj2, int i) {
        r1.A0A = new FdJ(i, obj, obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r1 = X.AnonymousClass6Tm.A01;
        r0 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0131, code lost:
        r0.A08();
        r0.A0C(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0137, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        X.DbS.A1R(r1, r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onButtonClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 2: goto L_0x004c;
                case 3: goto L_0x0043;
                case 4: goto L_0x003e;
                case 5: goto L_0x0166;
                case 6: goto L_0x0144;
                case 7: goto L_0x0012;
                case 8: goto L_0x0138;
                case 9: goto L_0x00fb;
                case 10: goto L_0x0013;
                case 11: goto L_0x00df;
                case 12: goto L_0x00bb;
                case 13: goto L_0x009b;
                case 14: goto L_0x008f;
                case 15: goto L_0x0057;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r9.A01
            X.4uI r2 = (X.C277014uI) r2
            if (r2 == 0) goto L_0x0012
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = r9.A02
        L_0x000f:
            X.DbS.A1R(r1, r2, r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r1 = r9.A02
            X.2sS r1 = (X.C231822sS) r1
            java.lang.Object r0 = r9.A01
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            X.1Xj r4 = r0.A1C
            if (r4 == 0) goto L_0x0012
            androidx.fragment.app.Fragment r2 = r1.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment"
            X.0qQ.A0C(r2, r0)
            com.instagram.common.session.UserSession r3 = r1.A02
            r6 = 0
            X.4DU r5 = r1.A03
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x003b
            r0 = 4600(0x11f8, float:6.446E-42)
        L_0x0033:
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            X.C46395DeI.A0U(r2, r3, r4, r5, r6, r7)
            return
        L_0x003b:
            r0 = 4780(0x12ac, float:6.698E-42)
            goto L_0x0033
        L_0x003e:
            java.lang.Object r2 = r9.A02
            X.4uI r2 = (X.C277014uI) r2
            goto L_0x0052
        L_0x0043:
            java.lang.Object r0 = r9.A02
            X.4tV r0 = (X.C276544tV) r0
            X.4uI r2 = r0.A09()
            goto L_0x0050
        L_0x004c:
            java.lang.Object r2 = r9.A02
            X.4uI r2 = (X.C277014uI) r2
        L_0x0050:
            if (r2 == 0) goto L_0x0012
        L_0x0052:
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = r9.A01
            goto L_0x000f
        L_0x0057:
            java.lang.Object r1 = r9.A02
            X.6Z5 r1 = (X.AnonymousClass6Z5) r1
            X.6i2 r0 = r1.A04
            if (r0 == 0) goto L_0x006c
            X.6ix r2 = r0.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            java.lang.String r5 = "ig_stories_consumption"
            java.lang.String r6 = "mux_aqr_toast"
            r7 = 1
            r4 = r3
            r2.A00(r3, r4, r5, r6, r7)
        L_0x006c:
            X.GUi r2 = X.C63556Kz5.A01
            com.instagram.common.session.UserSession r5 = r1.A09
            if (r5 != 0) goto L_0x007a
            X.DbS.A17()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007a:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.FragmentActivity r3 = X.DbT.A0E(r0)
            r4 = 0
            java.lang.String r6 = "ig_stories_consumption"
            java.lang.String r7 = "mux_aqr_toast"
            r0 = 62
            java.lang.String r8 = X.C66579MXk.A00(r0)
            r2.A02(r3, r4, r5, r6, r7, r8)
            return
        L_0x008f:
            java.lang.Object r1 = r9.A02
            X.FnN r1 = (X.C51031FnN) r1
            java.lang.Object r0 = r9.A01
            X.Tzd r0 = (X.C14631Tzd) r0
            X.C51031FnN.A00(r0, r1)
            return
        L_0x009b:
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r3 = r9.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r9.A02
            X.0lg r2 = (X.0lg) r2
            r0 = 633(0x279, float:8.87E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.SFz r1 = new X.SFz
            r1.<init>((java.lang.String) r0)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r0 = r3.getString(r0)
            X.C49906FEe.A01(r3, r2, r4, r1, r0)
            return
        L_0x00bb:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            r0 = 31
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.String r0 = "upsell"
            r3.putString(r1, r0)
            java.lang.Object r2 = r9.A02
            X.0lg r2 = (X.0lg) r2
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.Object r4 = r9.A01
            android.app.Activity r4 = (android.app.Activity) r4
            r0 = 47
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.DbS.A0b(r4, r3, r2, r1, r0)
            goto L_0x0131
        L_0x00df:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            java.lang.Object r4 = r9.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.6Yo r3 = X.DbS.A0M(r0, r4)
            X.1a1 r2 = X.C46447Df9.A02()
            java.lang.String r1 = "edit_profile"
            java.lang.String r0 = "edit_profile_link"
            X.Dfc r0 = X.C46548Dgp.A00(r4, r0, r1)
            X.C46474Dfc.A03(r3, r4, r2, r0)
            return
        L_0x00fb:
            java.lang.Object r3 = r9.A02
            X.0lg r3 = (X.0lg) r3
            java.lang.Object r4 = r9.A01
            android.app.Activity r4 = (android.app.Activity) r4
            r0 = 1619(0x653, float:2.269E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r0 = 31
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.putString(r0, r1)
            r0 = 3306(0xcea, float:4.633E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1274(0x4fa, float:1.785E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            r0 = 47
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.DbS.A0b(r4, r2, r3, r1, r0)
        L_0x0131:
            r0.A08()
            r0.A0C(r4)
            return
        L_0x0138:
            java.lang.Object r1 = r9.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r9.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.C49242Erl.A00(r1, r0)
            return
        L_0x0144:
            java.lang.Object r2 = r9.A02
            X.02m r2 = (X.02m) r2
            r1 = 834865936(0x31c30b10, float:5.6765046E-9)
            java.lang.String r0 = "delete_more"
            r2.markerPoint(r1, r0)
            r0 = 2
            r2.markerEnd(r1, r0)
            java.lang.Object r0 = r9.A01
            X.Dg2 r0 = (X.C46499Dg2) r0
            X.Ma2 r3 = r0.A00
            r0 = 1392(0x570, float:1.95E-42)
            java.lang.String r2 = X.C273654mx.A00(r0)
            r1 = 1
            r0 = 0
            r3.A17(r0, r2, r1)
            return
        L_0x0166:
            java.lang.Object r0 = r9.A02
            X.FEo r0 = (X.FEo) r0
            android.content.Context r1 = r0.A01
            X.0iw r2 = r0.A03
            com.instagram.common.session.UserSession r3 = r0.A04
            java.lang.Object r0 = r9.A01
            java.util.List r6 = X.AnonymousClass7TE.A1I(r0)
            r0 = 156(0x9c, float:2.19E-43)
            java.lang.String r4 = X.C66579MXk.A00(r0)
            r0 = 895(0x37f, float:1.254E-42)
            java.lang.String r5 = X.C66579MXk.A00(r0)
            X.O36.A00(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FdJ.onButtonClick(android.view.View):void");
    }

    public final void onDismiss() {
        if (6 - this.A00 == 0) {
            ((02m) this.A02).markerEnd(834865936, 2);
        }
    }

    public final void onShow() {
        if (6 - this.A00 == 0) {
            ((02m) this.A02).markerStart(834865936);
        }
    }

    public FdJ(Activity activity, UserSession userSession, int i) {
        this.A00 = i;
        this.A02 = userSession;
        this.A01 = activity;
    }

    public FdJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
