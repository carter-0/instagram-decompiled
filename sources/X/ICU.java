package X;

import android.content.Context;
import android.view.View;

public final class ICU implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ JR4 A02;
    public final /* synthetic */ JSM A03;
    public final /* synthetic */ C57244IUf A04;
    public final /* synthetic */ H7Y A05;

    public ICU(Context context, JR4 jr4, JSM jsm, C57244IUf iUf, H7Y h7y, int i) {
        this.A05 = h7y;
        this.A04 = iUf;
        this.A00 = i;
        this.A02 = jr4;
        this.A03 = jsm;
        this.A01 = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            r0 = -1108181202(0xffffffffbdf27f2e, float:-0.11840664)
            int r6 = X.AnonymousClass0fD.A05(r0)
            X.H7Y r1 = r9.A05
            X.GW3 r5 = r1.A01
            boolean r0 = r5.isSelected()
            r0 = r0 ^ 1
            r5.setSelected(r0)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            X.H7Y.A00(r0, r5, r1)
            X.IUf r3 = r9.A04
            int r1 = r9.A00
            boolean r0 = r5.isSelected()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.util.Map r1 = r3.A02
            if (r0 == 0) goto L_0x0089
            X.HLH r0 = X.HLH.SELECTED
        L_0x002d:
            r1.put(r2, r0)
            X.JR4 r4 = r9.A02
            X.JSM r3 = r9.A03
            boolean r0 = r5.isSelected()
            java.lang.String r7 = "see_more"
            X.IL4 r4 = (X.IL4) r4
            X.0wc r1 = r4.A00
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "instagram_ads_feedback_interface_response"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r4.A04
            if (r0 == 0) goto L_0x0086
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0086
            long r0 = r0.longValue()
        L_0x005a:
            X.IL4.A01(r2, r4, r0)
            java.lang.String r0 = r4.A05
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = ""
        L_0x0063:
            X.IL4.A03(r2, r4, r0)
            java.lang.String r8 = "interests"
            java.lang.String r0 = "question_id"
            r2.AAJ(r0, r8)
            java.lang.String r0 = "answer_id"
            long r0 = X.IL4.A00(r2, r4, r0, r7)
            X.IL4.A02(r2, r4, r0)
            X.Gk3 r1 = new X.Gk3
            r1.<init>()
            java.lang.String r0 = r3.getName()
            if (r0 != 0) goto L_0x00d5
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0086:
            r0 = 0
            goto L_0x005a
        L_0x0089:
            X.HLH r0 = X.HLH.UNSELECTED
            goto L_0x002d
        L_0x008c:
            java.lang.String r0 = "instagram_ads_feedback_interface_undo"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r4.A04
            if (r0 == 0) goto L_0x00d2
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x00d2
            long r0 = r0.longValue()
        L_0x00a6:
            X.IL4.A01(r2, r4, r0)
            java.lang.String r0 = r4.A05
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = ""
        L_0x00af:
            X.IL4.A03(r2, r4, r0)
            java.lang.String r8 = "interests"
            java.lang.String r0 = "question_id"
            r2.AAJ(r0, r8)
            java.lang.String r0 = "answer_id"
            long r0 = X.IL4.A00(r2, r4, r0, r7)
            X.IL4.A02(r2, r4, r0)
            X.Gk4 r1 = new X.Gk4
            r1.<init>()
            java.lang.String r0 = r3.getName()
            if (r0 != 0) goto L_0x00d5
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00d2:
            r0 = 0
            goto L_0x00a6
        L_0x00d5:
            java.lang.String r0 = X.C51976G9y.A0K(r1, r3, r0)
            X.IL4.A04(r1, r3, r0)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)
            r2.AAe(r8, r0)
            r2.Cgf()
        L_0x00e6:
            android.content.Context r4 = r9.A01
            boolean r0 = r5.isSelected()
            if (r0 == 0) goto L_0x012f
            r0 = 7
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r4, r0)
            r0 = r4
            com.instagram.base.activity.BaseFragmentActivity r0 = (com.instagram.base.activity.BaseFragmentActivity) r0
            X.3M8 r3 = r0.Bx5()
            java.lang.Integer r1 = r3.A0B
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x012f
            X.6ap r2 = X.DbS.A0a()
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131964437(0x7f133215, float:1.9565656E38)
            X.DbT.A1D(r1, r2, r0)
            r0 = 2131238110(0x7f081cde, float:1.809249E38)
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r0)
            int r0 = X.2Yu.A05(r4)
            int r0 = r4.getColor(r0)
            if (r1 == 0) goto L_0x0128
            r2.A08(r1, r0)
            r2.A02()
        L_0x0128:
            X.Dc2 r0 = r2.A00()
            r3.A0A(r0)
        L_0x012f:
            r0 = 1962167165(0x74f44b7d, float:1.5484027E32)
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ICU.onClick(android.view.View):void");
    }
}
