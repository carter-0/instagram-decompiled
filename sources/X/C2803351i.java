package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.51i  reason: invalid class name and case insensitive filesystem */
public final class C2803351i {
    public final UserSession A00;
    public final C242813Wa A01;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (X.C247643gg.A0A(r0, r5) != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C2803451j A00(com.instagram.common.session.UserSession r18, X.1Xj r19, boolean r20) {
        /*
            r1 = 0
            r0 = r18
            X.0qQ.A0B(r0, r1)
            r1 = 1
            r5 = r19
            X.0qQ.A0B(r5, r1)
            X.1wP r1 = X.1wN.A00(r0)
            X.3OA r1 = r1.A00(r5)
            r4 = 0
            if (r1 == 0) goto L_0x00d7
            X.1Xj r1 = r1.A0J
            X.1Xy r1 = r1.A0C
            X.3lZ r1 = r1.getInjected()
            if (r1 == 0) goto L_0x00d9
            X.3yF r3 = r1.ByK()
            if (r3 == 0) goto L_0x00da
            com.instagram.api.schemas.SponsoredAdsDisclaimerType r2 = r3.BKP()
        L_0x002b:
            com.instagram.api.schemas.SponsoredAdsDisclaimerType r1 = com.instagram.api.schemas.SponsoredAdsDisclaimerType.BASIC_ADS
            if (r2 != r1) goto L_0x003e
            if (r3 == 0) goto L_0x003e
            java.lang.String r1 = r3.BKL()
            if (r1 == 0) goto L_0x003e
            int r1 = r1.length()
            if (r1 == 0) goto L_0x003e
            r4 = r3
        L_0x003e:
            X.3xx r2 = X.C231122qu.A02(r0, r5)
            com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement r1 = com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement.ABOVE_IMAGE
            java.lang.String r11 = X.C247573gZ.A00(r1, r2)
            boolean r14 = r5.A5D()
            boolean r15 = r5.CcK()
            java.lang.String r7 = r5.getId()
            java.lang.String r2 = "Required value was null."
            if (r7 == 0) goto L_0x00e3
            com.instagram.user.model.User r1 = r5.A2A(r0)
            if (r1 == 0) goto L_0x00d4
            boolean r16 = X.AnonymousClass3ZQ.A03(r1)
        L_0x0062:
            java.lang.String r8 = X.C231122qu.A0E(r0, r5)
            if (r8 == 0) goto L_0x00dd
            r6 = 0
            if (r4 == 0) goto L_0x00d1
            java.lang.String r9 = r4.BKL()
            java.lang.String r10 = r4.Agq()
            boolean r1 = r4.BAh()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
        L_0x007b:
            boolean r1 = X.C247643gg.A07(r0, r5)
            if (r1 != 0) goto L_0x0089
            boolean r1 = X.C247643gg.A0A(r0, r5)
            r17 = 0
            if (r1 == 0) goto L_0x008b
        L_0x0089:
            r17 = 1
        L_0x008b:
            boolean r18 = X.C247643gg.A08(r0, r5)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36324037365935820(0x810c8500012ecc, double:3.034805723151671E-306)
            boolean r1 = X.182.A06(r3, r0, r1)
            r19 = 1
            if (r1 == 0) goto L_0x00ce
            if (r11 == 0) goto L_0x00ce
            int r1 = r11.length()
            if (r1 <= 0) goto L_0x00ce
        L_0x00a6:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r1 = X.C231122qu.A00(r0, r5)
            if (r1 == 0) goto L_0x00b2
            java.lang.String r12 = r1.BqY()
            if (r12 != 0) goto L_0x00b4
        L_0x00b2:
            java.lang.String r12 = ""
        L_0x00b4:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r0, r5)
            if (r0 == 0) goto L_0x00c6
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r0.BTY()
            if (r0 == 0) goto L_0x00c6
            java.lang.String r13 = r0.BCi()
            if (r13 != 0) goto L_0x00c8
        L_0x00c6:
            java.lang.String r13 = ""
        L_0x00c8:
            X.51j r4 = new X.51j
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r4
        L_0x00ce:
            r19 = 0
            goto L_0x00a6
        L_0x00d1:
            r9 = r6
            r10 = r6
            goto L_0x007b
        L_0x00d4:
            r16 = 0
            goto L_0x0062
        L_0x00d7:
            r3 = r4
            goto L_0x00da
        L_0x00d9:
            r3 = 0
        L_0x00da:
            r2 = r4
            goto L_0x002b
        L_0x00dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00e3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2803351i.A00(com.instagram.common.session.UserSession, X.1Xj, boolean):X.51j");
    }

    public C2803351i(UserSession userSession, C242813Wa r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
