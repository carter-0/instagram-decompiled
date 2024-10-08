package X;

import android.view.View;

/* renamed from: X.UsR  reason: case insensitive filesystem */
public final class C16300UsR extends AnonymousClass7AK {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16300UsR(UZS uzs, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = uzs;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00be, code lost:
        r0 = "session";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00da, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e1, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f3, code lost:
        r1 = X.Dba.A0J(r4, r2, X.2EG.A34, "https://www.facebook.com/business/help/719892839342050");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0120, code lost:
        r1.A0S = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0122, code lost:
        r1.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0125, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x00e2;
                case 2: goto L_0x00fc;
                case 3: goto L_0x0011;
                case 4: goto L_0x009e;
                case 5: goto L_0x0083;
                case 6: goto L_0x00c1;
                case 7: goto L_0x0069;
                case 8: goto L_0x0069;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r7)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r5 = r6.A01
            X.UbT r5 = (X.C15375UbT) r5
            com.instagram.common.session.UserSession r0 = r5.A00
            if (r0 == 0) goto L_0x00be
            X.7Pr r4 = new X.7Pr
            r4.<init>(r0)
            r1 = 0
            X.Wdf r0 = new X.Wdf
            r0.<init>(r1)
            r4.A0T = r0
            r3 = 2130772095(0x7f01007f, float:1.7147299E38)
            r2 = 2130772066(0x7f010062, float:1.714724E38)
            r1 = 2130772064(0x7f010060, float:1.7147236E38)
            r0 = 2130772097(0x7f010081, float:1.7147303E38)
            r4.A04(r3, r2, r1, r0)
            androidx.fragment.app.Fragment r0 = r5.requireParentFragment()
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheetFragment"
            X.0qQ.A0C(r0, r3)
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r0
            X.7Pu r0 = r0.A02
            if (r0 == 0) goto L_0x0010
            com.instagram.common.session.UserSession r0 = r5.A00
            if (r0 == 0) goto L_0x00be
            X.WGU r2 = X.WGU.A00(r0)
            X.UzE r1 = X.C16678UzE.REGULATED_CATEGORY_LEARN_MORE
            java.lang.String r0 = "regulated_category_learn_more_link"
            r2.A0F(r1, r0)
            androidx.fragment.app.Fragment r0 = r5.requireParentFragment()
            X.0qQ.A0C(r0, r3)
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r0
            X.7Pu r1 = r0.A02
            if (r1 == 0) goto L_0x0010
            X.UZD r0 = new X.UZD
            r0.<init>()
            r1.A0F(r0, r4)
            return
        L_0x0069:
            java.lang.Object r0 = r6.A01
            X.UZS r0 = (X.UZS) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r1 = X.2EG.A34
            java.lang.String r0 = "https://www.facebook.com/policies/ads"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "promote_simple_error"
            goto L_0x0120
        L_0x0083:
            java.lang.Object r1 = r6.A01
            X.UZc r1 = (X.C15274UZc) r1
            X.0eM r0 = r1.A0J
            X.7Pr r0 = X.DbX.A0f(r0)
            X.7Pu r2 = r0.A00()
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            X.UZ5 r0 = new X.UZ5
            r0.<init>()
            r2.A02(r1, r0)
            return
        L_0x009e:
            java.lang.Object r0 = r6.A01
            X.UbT r0 = (X.C15375UbT) r0
            android.content.Context r3 = r0.requireContext()
            com.instagram.common.session.UserSession r2 = r0.A00
            if (r2 == 0) goto L_0x00be
            X.2EG r1 = X.2EG.A34
            java.lang.String r0 = "https://www.facebook.com/business/help/544219649587656?id=288762101909005"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "promote"
            goto L_0x0120
        L_0x00b5:
            java.lang.Object r1 = r6.A01
            X.X95 r1 = (X.X95) r1
            r0 = 0
            r1.D7A(r0)
            return
        L_0x00be:
            java.lang.String r0 = "session"
            goto L_0x00da
        L_0x00c1:
            java.lang.Object r3 = r6.A01
            X.UaS r3 = (X.C15320UaS) r3
            X.WGU r2 = r3.A0B
            if (r2 == 0) goto L_0x00d0
            X.UzE r1 = X.C16678UzE.TAIWAN_FINSERV_LEARN_MORE
            java.lang.String r0 = "taiwan_finserv_toggle"
            r2.A0F(r1, r0)
        L_0x00d0:
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            com.instagram.common.session.UserSession r2 = r3.A0H
            if (r2 != 0) goto L_0x00f3
            java.lang.String r0 = "userSession"
        L_0x00da:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e2:
            java.lang.Object r3 = r6.A01
            X.ViU r3 = (X.C17939ViU) r3
            X.WGU r2 = r3.A03
            X.UzE r1 = X.C16678UzE.TAIWAN_FINSERV_LEARN_MORE
            java.lang.String r0 = "taiwan_finserv_toggle"
            r2.A0F(r1, r0)
            androidx.fragment.app.FragmentActivity r4 = r3.A02
            com.instagram.common.session.UserSession r2 = r3.A07
        L_0x00f3:
            X.2EG r1 = X.2EG.A34
            java.lang.String r0 = "https://www.facebook.com/business/help/719892839342050"
            X.SUL r1 = X.Dba.A0J(r4, r2, r1, r0)
            goto L_0x0122
        L_0x00fc:
            java.lang.Object r4 = r6.A01
            X.UZd r4 = (X.C15275UZd) r4
            X.0eM r0 = r4.A0G
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r2 = X.C16678UzE.ERROR
            java.lang.String r1 = "view_advertising_policies"
            r0 = 0
            X.WGU.A03(r2, r3, r0, r1)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            com.instagram.common.session.UserSession r2 = X.C15275UZd.A03(r4)
            X.2EG r1 = X.2EG.A34
            java.lang.String r0 = "https://www.facebook.com/policies/ads"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "promote_error"
        L_0x0120:
            r1.A0S = r0
        L_0x0122:
            r1.A0A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16300UsR.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16300UsR(C15274UZc uZc, int i) {
        super(Integer.valueOf(i));
        this.A00 = 5;
        this.A01 = uZc;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16300UsR(C15275UZd uZd, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = uZd;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16300UsR(View.OnClickListener onClickListener, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = onClickListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16300UsR(C15375UbT ubT, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = ubT;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16300UsR(C15320UaS uaS, int i) {
        super(Integer.valueOf(i));
        this.A00 = 6;
        this.A01 = uaS;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16300UsR(C17939ViU viU, int i) {
        super(Integer.valueOf(i));
        this.A00 = 1;
        this.A01 = viU;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16300UsR(X95 x95, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = x95;
    }
}
