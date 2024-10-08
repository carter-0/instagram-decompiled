package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Ye  reason: invalid class name and case insensitive filesystem */
public final class C243293Ye {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011f, code lost:
        if (X.182.A06(r4, r9, 2342164074462913594L) == false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0135, code lost:
        if (r3.BR7() == X.1iA.A0Q) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass9J3 A00(X.1Xj r21, X.AnonymousClass4DU r22, X.AnonymousClass3W1 r23, java.lang.String r24) {
        /*
            r20 = this;
            r19 = 0
            r13 = 1
            r0 = 2
            r4 = r22
            X.0qQ.A0B(r4, r0)
            r2 = r20
            com.instagram.common.session.UserSession r9 = r2.A00
            r3 = r21
            boolean r0 = r3.CcK()
            r6 = 0
            r11 = r23
            r12 = r24
            if (r0 == 0) goto L_0x00b7
            int r1 = r11.A0E
            X.2rv r0 = X.C231592rv.AD_CTA
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.APP_INSTALL_CTA
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.COLLECTION_CTA
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.IGBIO_PRODUCT_MEDIA_BAR_CTA
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.PROFESSIONAL_ORGANIC_MEDIA_BAR_CTA
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.SHOPPING_CTA
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.MEDIA_FUNDRAISER
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.MEDIA_FUNDRAISER_DONATE_BUTTON
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.UPCOMING_LIVE_EVENT_MEDIA_BAR_CTA
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.UPCOMING_ONLINE_EVENT_MEDIA_BAR_CTA
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.MEDIA_OPEN_CAROUSEL_REVIEW_CTA
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.MEDIA_OPEN_CAROUSEL_TURN_ON_CTA
            int r0 = r0.ordinal()
            if (r1 == r0) goto L_0x0084
            X.2rv r0 = X.C231592rv.BOOST_GUIDANCE_CTA
            int r0 = r0.ordinal()
            if (r1 != r0) goto L_0x00b7
        L_0x0084:
            java.lang.String r1 = r4.getModuleName()
            java.lang.String r0 = "feed_contextual_ads_chain"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0144
            X.0Tu r5 = X.0Tu.A05
            r0 = 36312887645505045(0x81026100e10615, double:3.0277545950549286E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x009f:
            X.0qQ.A0A(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r3.A5H()
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "cta_extension_tap_on_ufi"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00d0
        L_0x00b6:
            r6 = 1
        L_0x00b7:
            X.3ZH r10 = r3.A1Y()
            r0 = 7
            X.9MG r1 = new X.9MG
            r1.<init>(r0, r11, r2, r3)
            r0 = 21
            X.9IE r8 = new X.9IE
            r8.<init>((java.lang.Object) r1, (int) r0)
            X.9J3 r7 = new X.9J3
            if (r6 == 0) goto L_0x014a
            r7.<init>((X.AnonymousClass9IE) r8, (com.instagram.common.session.UserSession) r9, (X.AnonymousClass3ZH) r10, (X.AnonymousClass3W1) r11, (java.lang.String) r12, (boolean) r13)
            return r7
        L_0x00d0:
            java.lang.String r1 = r4.getModuleName()
            java.lang.String r0 = "feed_timeline"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00fa
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "feed_contextual_profile"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00b7
        L_0x00ec:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321065249481789(0x8109d1000f243d, double:3.0329261447383897E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 != 0) goto L_0x00fa
            goto L_0x00b7
        L_0x00fa:
            X.0Tu r4 = X.0Tu.A05
            r0 = 2342164074463044668(0x208109d1000d243c, double:4.066489121324222E-152)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r3.A5H()
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "cta_extension_tap_on_ufi"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0121
            r0 = 2342164074462913594(0x208109d1000b243a, double:4.066489121213083E-152)
            boolean r0 = X.182.A06(r4, r9, r0)
            r6 = 1
            if (r0 != 0) goto L_0x00b7
        L_0x0121:
            r6 = 0
            goto L_0x00b7
        L_0x0123:
            boolean r0 = r3.A5D()
            if (r0 != 0) goto L_0x0139
            boolean r0 = r3.CeS()
            if (r0 != 0) goto L_0x0139
            X.1iA r1 = r3.BR7()
            X.1iA r0 = X.1iA.A0Q
            if (r1 != r0) goto L_0x00b7
            goto L_0x00b6
        L_0x0139:
            r0 = 2342164074462913594(0x208109d1000b243a, double:4.066489121213083E-152)
            boolean r6 = X.182.A06(r4, r9, r0)
            goto L_0x00b7
        L_0x0144:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            goto L_0x009f
        L_0x014a:
            r13 = r7
            r14 = r8
            r15 = r9
            r16 = r10
            r17 = r11
            r18 = r12
            r13.<init>((X.AnonymousClass9IE) r14, (com.instagram.common.session.UserSession) r15, (X.AnonymousClass3ZH) r16, (X.AnonymousClass3W1) r17, (java.lang.String) r18, (boolean) r19)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243293Ye.A00(X.1Xj, X.4DU, X.3W1, java.lang.String):X.9J3");
    }

    public C243293Ye(UserSession userSession) {
        this.A00 = userSession;
    }
}
