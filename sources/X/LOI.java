package X;

public final class LOI {
    public int A00;
    public long A01;
    public C278114wI A02 = C278114wI.UNKNOWN;
    public Integer A03 = AnonymousClass05K.A00;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C313616gj A07;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01a7, code lost:
        X.C313616gj.A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01aa, code lost:
        X.C313616gj.A02(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.LOI r12) {
        /*
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x0261
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
        L_0x0006:
            java.lang.Integer r0 = r12.A03
            if (r0 == r4) goto L_0x0038
            r12.A03 = r4
            X.6gj r5 = r12.A07
            X.6Jt r8 = r5.A01
            if (r8 == 0) goto L_0x0020
            int r0 = r4.intValue()
            switch(r0) {
                case 0: goto L_0x01af;
                case 1: goto L_0x0142;
                case 2: goto L_0x01b4;
                case 3: goto L_0x004e;
                case 4: goto L_0x0134;
                case 5: goto L_0x0019;
                case 6: goto L_0x006e;
                default: goto L_0x0019;
            }
        L_0x0019:
            r8.A01()
            r0 = 1
            r8.A03(r0)
        L_0x0020:
            X.0tS r0 = X.DbT.A0h()
            boolean r0 = r0.A0W()
            if (r0 == 0) goto L_0x0038
            android.content.Context r1 = X.C60960kU.A00
            int r0 = r4.intValue()
            switch(r0) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0048;
                case 2: goto L_0x0045;
                case 3: goto L_0x0042;
                case 4: goto L_0x003f;
                case 5: goto L_0x003c;
                case 6: goto L_0x0039;
                default: goto L_0x0033;
            }
        L_0x0033:
            java.lang.String r0 = "NO_ERROR"
        L_0x0035:
            X.C59689JTv.A09(r1, r0)
        L_0x0038:
            return
        L_0x0039:
            java.lang.String r0 = "SSI_CHECKPOINTED"
            goto L_0x0035
        L_0x003c:
            java.lang.String r0 = "RETURN_FROM_COBROADCAST"
            goto L_0x0035
        L_0x003f:
            java.lang.String r0 = "VIEWER_COBROADCASTING"
            goto L_0x0035
        L_0x0042:
            java.lang.String r0 = "BROADCASTER_END"
            goto L_0x0035
        L_0x0045:
            java.lang.String r0 = "BROADCASTER_INTERRUPT"
            goto L_0x0035
        L_0x0048:
            java.lang.String r0 = "VIEWER_FATAL"
            goto L_0x0035
        L_0x004b:
            java.lang.String r0 = "VIEWER_LOADING"
            goto L_0x0035
        L_0x004e:
            X.3uh r2 = r8.A02
            if (r2 == 0) goto L_0x0020
            X.6gh r1 = r5.A0R
            java.lang.String r0 = "finished"
            r1.A00(r2, r8, r0)
            java.lang.String r1 = r2.A0j
            X.0qQ.A07(r1)
            com.instagram.common.session.UserSession r0 = r5.A0N
            X.C239403Gi.A03(r0, r1)
            android.view.ViewGroup r1 = r8.A0V
            X.M58 r0 = new X.M58
            r0.<init>(r5)
            r1.post(r0)
            goto L_0x0020
        L_0x006e:
            X.3uh r2 = r8.A02
            if (r2 == 0) goto L_0x0020
            X.6gh r1 = r5.A0R
            java.lang.String r0 = "ssi_checkpointed"
            r1.A00(r2, r8, r0)
            java.lang.String r1 = r2.A0j
            X.0qQ.A07(r1)
            com.instagram.common.session.UserSession r0 = r5.A0N
            X.C239403Gi.A03(r0, r1)
            X.6Jt r6 = r5.A01
            if (r6 == 0) goto L_0x0020
            X.C313616gj.A01(r5)
            r2 = 0
            r3 = 0
            r6.A03(r3)
            android.view.ViewGroup r0 = r6.A0V
            android.content.Context r10 = r0.getContext()
            r0 = 2130970205(0x7f04065d, float:1.7549114E38)
            int r1 = X.2Yu.A0H(r10, r0)
            r0 = 1
            X.JZP.A03(r6, r1, r0)
            r0 = 2131963106(0x7f132ce2, float:1.9562956E38)
            java.lang.String r1 = X.C51967G9n.A0p(r10, r0)
            r0 = 2131965438(0x7f1335fe, float:1.9567686E38)
            java.lang.String r7 = X.C51967G9n.A0p(r10, r0)
            X.JZS r9 = r6.A0e
            android.view.View r0 = r9.A01
            r0.setVisibility(r3)
            X.0eM r8 = r9.A04
            android.widget.TextView r0 = X.JTQ.A0A(r8)
            r0.setText(r1)
            X.JTS.A1W(r8, r3)
            X.0eM r1 = r9.A05
            android.widget.TextView r0 = X.JTQ.A0A(r1)
            r0.setText(r7)
            X.JTS.A1W(r1, r3)
            X.0eM r1 = r9.A06
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            r7 = 8
            r0.setVisibility(r7)
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            r0.setOnClickListener(r2)
            X.JdD r12 = r9.A00
            if (r12 != 0) goto L_0x010b
            r0 = 2131963105(0x7f132ce1, float:1.9562954E38)
            java.lang.String r11 = r10.getString(r0)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            float r2 = r1.getDimension(r0)
            int r1 = X.C51968G9o.A04(r10)
            int r0 = X.2Yu.A0C(r10)
            int r0 = r10.getColor(r0)
            X.JdD r12 = new X.JdD
            r12.<init>(r11, r2, r1, r0)
            X.2cs r0 = r12.A03
            r0.A03()
        L_0x010b:
            r9.A00 = r12
            X.0eM r0 = r9.A02
            android.view.View r2 = X.AnonymousClass7TH.A06(r0)
            boolean r0 = X.0oI.A0C(r10)
            if (r0 != 0) goto L_0x0121
            r2.setVisibility(r7)
            X.JTS.A1W(r8, r7)
            goto L_0x01aa
        L_0x0121:
            X.JdD r0 = r9.A00
            r2.setBackground(r0)
            r1 = 18
            X.WBC r0 = new X.WBC
            r0.<init>(r6, r1)
            X.AnonymousClass0fU.A00(r0, r2)
            r2.setVisibility(r3)
            goto L_0x01aa
        L_0x0134:
            X.6gh r2 = r5.A0R
            X.3uh r1 = r8.A02
            r0 = 2817(0xb01, float:3.947E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A00(r1, r8, r0)
            goto L_0x01a7
        L_0x0142:
            X.6gh r2 = r5.A0R
            X.3uh r1 = r8.A02
            java.lang.String r0 = "error"
            r2.A00(r1, r8, r0)
            r3 = 0
            r2 = 1
            r8.A03(r3)
            android.view.ViewGroup r0 = r8.A0V
            android.content.Context r1 = r0.getContext()
            r0 = 2130970205(0x7f04065d, float:1.7549114E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.JZP.A03(r8, r0, r2)
            android.view.View r0 = r8.A0Q
            r0.setVisibility(r3)
            android.view.View r0 = r8.A0R
            r0.setVisibility(r3)
            X.JZS r2 = r8.A0e
            android.view.View r0 = r2.A01
            r0.setVisibility(r3)
            X.0eM r0 = r2.A05
            X.JTS.A1W(r0, r3)
            android.widget.TextView r1 = X.JTQ.A0A(r0)
            r0 = 2131965445(0x7f133605, float:1.95677E38)
            r1.setText(r0)
            X.0eM r0 = r2.A04
            X.JTS.A1W(r0, r3)
            android.widget.TextView r1 = X.JTQ.A0A(r0)
            r0 = 2131965444(0x7f133604, float:1.9567698E38)
            r1.setText(r0)
            X.0eM r0 = r2.A02
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r1 = 8
            r0.setVisibility(r1)
            X.0eM r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            X.L2M r0 = (X.L2M) r0
            android.widget.LinearLayout r0 = r0.A00
            r0.setVisibility(r1)
        L_0x01a7:
            X.C313616gj.A01(r5)
        L_0x01aa:
            X.C313616gj.A02(r5)
            goto L_0x0020
        L_0x01af:
            X.JZP.A02(r8)
            goto L_0x0020
        L_0x01b4:
            boolean r0 = X.C313616gj.A04(r5)
            if (r0 == 0) goto L_0x0020
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x0020
            r7 = 0
            r1 = 1
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            X.JZP.A03(r8, r0, r7)
            r8.A03(r1)
            X.JZS r6 = r8.A0e
            X.0eM r3 = r6.A03
            java.lang.Object r0 = r3.getValue()
            X.3Nc r0 = (X.C240913Nc) r0
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x01fa
            android.view.View r2 = X.JTR.A0W(r3)
            com.instagram.ui.widget.bannertoast.BannerToast r2 = (com.instagram.ui.widget.bannertoast.BannerToast) r2
            android.content.Context r1 = r2.getContext()
            r0 = 2130970332(0x7f0406dc, float:1.7549371E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A16(r1, r2, r0)
            X.LzY r0 = new X.LzY
            r0.<init>(r8)
            r2.A01 = r0
            r0 = 2131965439(0x7f1335ff, float:1.9567688E38)
            r2.setText(r0)
        L_0x01fa:
            android.view.View r3 = X.JTR.A0W(r3)
            com.instagram.ui.widget.bannertoast.BannerToast r3 = (com.instagram.ui.widget.bannertoast.BannerToast) r3
            com.instagram.ui.widget.bannertoast.BannerToast.A00(r3)
            int r0 = r3.getHeight()
            if (r0 != 0) goto L_0x0258
            X.M4y r2 = new X.M4y
            r2.<init>(r3)
            r0 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r2, r0)
        L_0x0213:
            android.view.View r0 = r6.A01
            r0.setVisibility(r7)
            X.0eM r0 = r6.A05
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r3 = 8
            r0.setVisibility(r3)
            X.0eM r0 = r6.A02
            X.JTS.A1W(r0, r3)
            X.0eM r0 = r6.A07
            java.lang.Object r0 = r0.getValue()
            X.L2M r0 = (X.L2M) r0
            android.widget.LinearLayout r0 = r0.A00
            r0.setVisibility(r3)
            X.0eM r2 = r6.A04
            android.view.View r0 = X.AnonymousClass7TH.A06(r2)
            android.view.ViewGroup r1 = X.C3019160o.A01(r0)
            r0 = 0
            r1.setLayoutTransition(r0)
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r2)
            X.C51969G9p.A1M(r0)
            X.0eM r0 = r6.A06
            X.JTS.A1W(r0, r3)
            X.4gL r0 = r5.A00
            if (r0 == 0) goto L_0x0020
            X.C313616gj.A00(r0, r5)
            goto L_0x0020
        L_0x0258:
            X.2cs r0 = r3.A00
            r0.getClass()
            r0.A03()
            goto L_0x0213
        L_0x0261:
            r7 = 0
            int r1 = r12.A00
            r0 = 5
            if (r1 < r0) goto L_0x026b
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0006
        L_0x026b:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r3 = r12.A01
            long r5 = r5 - r3
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x027e
            r12.A05 = r7
            java.lang.Integer r4 = X.AnonymousClass05K.A15
            goto L_0x0006
        L_0x027e:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x028e
            X.4wI r1 = r12.A02
            X.4wI r0 = X.C278114wI.INTERRUPTED
            if (r1 != r0) goto L_0x028e
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            goto L_0x0006
        L_0x028e:
            boolean r0 = r12.A05
            if (r0 == 0) goto L_0x0296
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            goto L_0x0006
        L_0x0296:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOI.A00(X.LOI):void");
    }

    public final boolean A01() {
        Integer num = this.A03;
        if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0u) {
            return true;
        }
        return false;
    }

    public LOI(C313616gj r2) {
        this.A07 = r2;
    }
}
