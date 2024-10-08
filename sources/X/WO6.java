package X;

public final class WO6 implements X6L {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WO6(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b1, code lost:
        r5.A07(r2, r1, r3, "FB Login failed or cancelled");
        X.C13990Tnq.A0w(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        X.0qQ.A0F(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DED() {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0014;
                case 4: goto L_0x0005;
                case 5: goto L_0x0058;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r6.A02
            X.6Rx r2 = (X.C307896Rx) r2
            java.lang.Object r1 = r6.A01
            X.4uI r1 = (X.C277014uI) r1
            X.6Tm r0 = X.AnonymousClass6Tm.A01
            X.C299275ur.A00(r2, r0, r1)
            return
        L_0x0014:
            java.lang.Object r4 = r6.A02
            X.Uac r4 = (X.C15328Uac) r4
            X.3As r0 = r4.A0H
            if (r0 != 0) goto L_0x0026
            java.lang.String r2 = "recyclerViewProxy"
        L_0x001e:
            X.0qQ.A0F(r2)
        L_0x0021:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0026:
            r2 = 0
            r0.EaP(r2)
            X.3AD r0 = r4.A0J
            java.lang.String r1 = "pullToRefresh"
            if (r0 == 0) goto L_0x0062
            r0.setIsLoading(r2)
            X.3AD r0 = r4.A0J
            if (r0 == 0) goto L_0x0062
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x0051
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A0K
            if (r0 != 0) goto L_0x0042
            java.lang.String r2 = "loadingSpinner"
            goto L_0x001e
        L_0x0042:
            X.JTO.A1X(r0)
            X.UdV r1 = r4.A0B
            if (r1 != 0) goto L_0x004c
            java.lang.String r2 = "promoteAdToolsAdapter"
            goto L_0x001e
        L_0x004c:
            java.util.List r0 = r4.A0e
            r1.A01(r0)
        L_0x0051:
            X.VwK r5 = r4.A07
            if (r5 != 0) goto L_0x0098
            java.lang.String r2 = "adsManagerLogger"
            goto L_0x001e
        L_0x0058:
            java.lang.Object r4 = r6.A02
            X.Uab r4 = (X.C15327Uab) r4
            X.3As r0 = r4.A04
            if (r0 != 0) goto L_0x0066
            java.lang.String r1 = "recyclerViewProxy"
        L_0x0062:
            X.0qQ.A0F(r1)
            goto L_0x0021
        L_0x0066:
            r1 = 0
            r0.EaP(r1)
            X.3AD r0 = r4.A05
            java.lang.String r2 = "pullToRefresh"
            if (r0 == 0) goto L_0x001e
            r0.setIsLoading(r1)
            X.3AD r0 = r4.A05
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x0091
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A06
            if (r0 != 0) goto L_0x0082
            java.lang.String r1 = "loadingSpinner"
            goto L_0x0062
        L_0x0082:
            X.JTO.A1X(r0)
            X.UdV r1 = r4.A02
            if (r1 != 0) goto L_0x008c
            java.lang.String r1 = "pastPromotionsAdapter"
            goto L_0x0062
        L_0x008c:
            java.util.List r0 = r4.A0H
            r1.A01(r0)
        L_0x0091:
            X.VwK r5 = r4.A01
            if (r5 != 0) goto L_0x00a5
            java.lang.String r1 = "adsManagerLogger"
            goto L_0x0062
        L_0x0098:
            java.lang.Object r0 = r6.A01
            X.WOi r0 = (X.C19176WOi) r0
            java.lang.String r3 = r0.BYo()
            java.lang.String r2 = "promotion_list"
            java.lang.String r1 = "paused"
            goto L_0x00b1
        L_0x00a5:
            java.lang.Object r0 = r6.A01
            X.WOi r0 = (X.C19176WOi) r0
            java.lang.String r3 = r0.BYo()
            java.lang.String r2 = "past_promotion_list"
            java.lang.String r1 = "active"
        L_0x00b1:
            java.lang.String r0 = "FB Login failed or cancelled"
            r5.A07(r2, r1, r3, r0)
            X.C13990Tnq.A0w(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WO6.DED():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bd, code lost:
        r3 = X.C46649DiU.A04(r0, r2);
        r2 = r5.requireActivity();
        r0 = new com.instagram.bloks.hosting.IgBloksScreenConfig((X.0lg) X.AnonymousClass7TE.A0l(r5.A0f));
        r0.A0U = r4;
        r3.A0D(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Doe(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x00d6;
                case 1: goto L_0x0091;
                case 2: goto L_0x0059;
                case 3: goto L_0x002a;
                case 4: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.Object r6 = r7.A02
            X.Uab r6 = (X.C15327Uab) r6
            java.lang.Object r1 = r7.A01
            X.WOi r1 = (X.C19176WOi) r1
            X.Vvg r5 = r6.A03
            if (r5 != 0) goto L_0x003d
            java.lang.String r0 = "pastPromotionsDataFetcher"
        L_0x0017:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001f:
            java.lang.Object r6 = r7.A02
            X.Uac r6 = (X.C15328Uac) r6
            X.VwK r5 = r6.A07
            if (r5 != 0) goto L_0x00ea
            java.lang.String r0 = "adsManagerLogger"
            goto L_0x0017
        L_0x002a:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.Object r6 = r7.A02
            X.Uac r6 = (X.C15328Uac) r6
            java.lang.Object r5 = r7.A01
            X.WOi r5 = (X.C19176WOi) r5
            X.Vvg r4 = r6.A0C
            if (r4 != 0) goto L_0x0111
            java.lang.String r0 = "promoteAdsManagerDataFetcher"
            goto L_0x0017
        L_0x003d:
            java.lang.String r4 = r1.BYo()
            java.lang.String r3 = r1.A0F
            r0 = 3
            X.Ufl r2 = new X.Ufl
            r2.<init>(r0, r1, r6)
            com.instagram.common.session.UserSession r1 = r5.A02
            X.WGU r0 = X.WGU.A00(r1)
            java.lang.String r0 = r0.A03
            X.1OC r0 = X.C18146VmM.A01(r1, r4, r3, r8, r0)
            X.C18641Vvg.A00(r5, r2, r0)
            return
        L_0x0059:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Object r5 = r7.A02
            X.Uac r5 = (X.C15328Uac) r5
            android.content.Context r1 = r5.requireContext()
            r0 = 2131952248(0x7f130278, float:1.9540933E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r1, r0)
            java.lang.Object r3 = r7.A01
            X.WOi r3 = (X.C19176WOi) r3
            java.lang.String r1 = r3.BYo()
            java.lang.String r0 = "media_id"
            r2.put(r0, r1)
            java.lang.String r0 = "fb_auth_token"
            r2.put(r0, r8)
            java.lang.String r1 = r3.A0F
            if (r1 != 0) goto L_0x0089
            java.lang.String r1 = ""
        L_0x0089:
            java.lang.String r0 = "boosted_id"
            r2.put(r0, r1)
            java.lang.String r0 = "com.instagram.ads.rejection_details.RejectionDetailsScreen"
            goto L_0x00bd
        L_0x0091:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Object r5 = r7.A02
            X.Uac r5 = (X.C15328Uac) r5
            android.content.Context r1 = r5.requireContext()
            r0 = 2131970834(0x7f134b12, float:1.957863E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r1, r0)
            java.lang.Object r0 = r7.A01
            X.X9b r0 = (X.C21004X9b) r0
            java.lang.String r1 = r0.BYo()
            java.lang.String r0 = "media_id"
            r2.put(r0, r1)
            java.lang.String r0 = "fb_auth_token"
            r2.put(r0, r8)
            java.lang.String r0 = "com.instagram.ads.awpt_not_delivering_reason_screen.AwPTNotDeliveringReasonScreen"
        L_0x00bd:
            X.DiU r3 = X.C46649DiU.A04(r0, r2)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.0eM r0 = r5.A0f
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r0.<init>((X.0lg) r1)
            r0.A0U = r4
            r3.A0D(r2, r0)
            return
        L_0x00d6:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.6Tm r2 = X.DbY.A0Q(r8)
            java.lang.Object r1 = r7.A02
            X.6Rx r1 = (X.C307896Rx) r1
            java.lang.Object r0 = r7.A01
            X.4uI r0 = (X.C277014uI) r0
            X.C299275ur.A00(r1, r2, r0)
            return
        L_0x00ea:
            java.lang.Object r4 = r7.A01
            X.WOi r4 = (X.C19176WOi) r4
            java.lang.String r3 = r4.BYo()
            r2 = 0
            java.lang.String r1 = "promotion_list"
            java.lang.String r0 = "pay_now"
            r5.A08(r1, r0, r3, r2)
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.0eM r0 = r6.A0f
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.WOC r1 = new X.WOC
            r1.<init>(r6, r4)
            r0 = 0
            X.C18676VwZ.A02(r3, r1, r2, r0)
            X.C15328Uac.A09(r6)
            return
        L_0x0111:
            java.lang.String r3 = r5.BYo()
            java.lang.String r2 = r5.A0F
            r1 = 2
            X.Ufl r0 = new X.Ufl
            r0.<init>(r1, r5, r6)
            r4.A03(r0, r3, r2, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WO6.Doe(java.lang.String):void");
    }
}
