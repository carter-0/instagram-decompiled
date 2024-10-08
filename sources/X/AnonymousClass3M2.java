package X;

/* renamed from: X.3M2  reason: invalid class name */
public final class AnonymousClass3M2 extends 2Cl {
    public final /* synthetic */ 2Aq A00;

    public final int getRunnableId() {
        return 1440554863;
    }

    public AnonymousClass3M2(2Aq r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0075, code lost:
        if (X.182.A06(r3, r6, 36316001482116961L) != false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r19 = this;
            r0 = r19
            X.2Aq r12 = r0.A00
            com.instagram.common.session.UserSession r6 = r12.A05
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r3 = r0.A01(r6)
            X.3FW r10 = new X.3FW
            r10.<init>(r6)
            X.2B1 r2 = X.2B0.A01
            r9 = 0
            X.0qQ.A0B(r6, r9)
            X.0xa r1 = r2.A07(r6)
            java.lang.String r0 = "HAS_EVER_ENABLED_QUIET_MODE"
            boolean r0 = r1.getBoolean(r0, r9)
            if (r0 != 0) goto L_0x0077
            boolean r0 = r3.A1Z()
            if (r0 != 0) goto L_0x0077
            boolean r0 = r3.A2N()
            if (r0 != 0) goto L_0x0077
            X.3FW r0 = new X.3FW
            r0.<init>(r6)
            com.instagram.common.session.UserSession r4 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36597476459023176(0x82053600040b48, double:3.2077297066709663E-306)
            long r17 = X.182.A01(r3, r4, r0)
            r0 = 36597476458892103(0x82053600020b47, double:3.207729706588075E-306)
            long r4 = X.182.A01(r3, r4, r0)
            long r15 = X.C280074zx.A00()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r15 = r15 / r13
            long r7 = r17 + r15
            int r0 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            long r15 = r15 + r4
            if (r0 < 0) goto L_0x005c
            r0 = 86400(0x15180, double:4.26873E-319)
            long r15 = r15 + r0
        L_0x005c:
            r0 = 1
            long r7 = r7 + r0
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 / r13
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0077
            r0 = 36316001482116961(0x81053600010f61, double:3.029723797866718E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0083
        L_0x0077:
            X.0xa r1 = r2.A07(r6)
            java.lang.String r0 = "BYPASS_QUIET_MODE_UPSELL_CHECKS"
            boolean r0 = r1.getBoolean(r0, r9)
            if (r0 == 0) goto L_0x012a
        L_0x0083:
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            java.util.ArrayList r0 = X.I3D.A00(r6, r5)
            int r3 = r0.size()
            X.0Tu r7 = X.0Tu.A05
            r0 = 36597476459809612(0x82053600100b4c, double:3.2077297071683116E-306)
            long r0 = X.182.A01(r7, r6, r0)
            int r2 = (int) r0
            if (r3 >= r2) goto L_0x012a
            X.2ZQ r8 = X.C71172bH.A00()
            boolean r0 = r8 instanceof android.content.Context
            if (r0 == 0) goto L_0x00ca
            X.2MD r15 = X.2MD.A01()
            android.content.Context r8 = (android.content.Context) r8
            X.0qQ.A0B(r8, r9)
            X.0t1 r0 = X.0eE.A00(r6)
            com.instagram.user.model.User r14 = r0.A00()
            X.3FW r4 = new X.3FW
            r4.<init>(r6)
            r0 = 2131239292(0x7f08217c, float:1.8094887E38)
            android.graphics.drawable.Drawable r1 = r8.getDrawable(r0)
            X.2ZQ r3 = X.C71172bH.A00()
            if (r3 != 0) goto L_0x012c
            r0 = 0
        L_0x00c7:
            r15.A09(r0)
        L_0x00ca:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            X.I3D.A02(r6, r5, r0)
            X.FUy r0 = new X.FUy
            r0.<init>(r12)
            X.DcM r5 = X.F8V.A00(r0, r6)
            long r0 = r12.A0O()
            X.F10 r6 = r10.A03(r0)
            java.lang.String r16 = "in_app_upsell"
            com.instagram.common.session.UserSession r4 = r5.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 36316001482116961(0x81053600010f61, double:3.029723797866718E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "upsell_in_app_notif_enabled"
            X.0eP r3 = new X.0eP
            r3.<init>(r0, r1)
            r0 = 36597476459809612(0x82053600100b4c, double:3.2077297071683116E-306)
            long r0 = X.182.A01(r2, r4, r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "in_app_upsell_impressions_limit"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            X.0eP[] r0 = new X.0eP[]{r3, r0}
            java.util.LinkedHashMap r18 = X.0Yt.A06(r0)
            java.lang.String r15 = "ig_quiet_mode_in_app_upsell_impression"
            r7 = 0
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r17 = r7
            X.DcM.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x012a:
            r0 = 0
            return r0
        L_0x012c:
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.String r0 = r6.A06
            X.OIS r2 = X.OU0.A00(r0)
            r0 = 4161(0x1041, float:5.831E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0G = r0
            r2.A01 = r1
            r0 = 2131971199(0x7f134c7f, float:1.957937E38)
            java.lang.String r0 = r8.getString(r0)
            r2.A0H = r0
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.LOCAL
            r2.A03 = r0
            r11 = 2131971198(0x7f134c7e, float:1.9579369E38)
            r0 = 36597476459023176(0x82053600040b48, double:3.2077297066709663E-306)
            long r0 = X.182.A01(r7, r6, r0)
            java.lang.String r13 = X.FGR.A02(r8, r0, r9)
            r0 = 36597476458892103(0x82053600020b47, double:3.207729706588075E-306)
            long r0 = X.182.A01(r7, r6, r0)
            java.lang.String r0 = X.FGR.A02(r8, r0, r9)
            java.lang.Object[] r0 = new java.lang.Object[]{r13, r0}
            java.lang.String r0 = r8.getString(r11, r0)
            r2.A0E = r0
            r0 = 36597476459285321(0x82053600080b49, double:3.207729706836748E-306)
            long r0 = X.182.A01(r7, r6, r0)
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r7
            r2.A00 = r0
            X.Fcr r0 = new X.Fcr
            r0.<init>(r3, r6, r14, r4)
            r2.A08 = r0
            X.OU0 r0 = new X.OU0
            r0.<init>(r2)
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3M2.call():java.lang.Object");
    }
}
