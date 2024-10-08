package X;

/* renamed from: X.35q  reason: invalid class name and case insensitive filesystem */
public final class C2369235q implements 1wn {
    public final /* synthetic */ C227802jw A00;
    public final /* synthetic */ AnonymousClass35W A01;

    public C2369235q(C227802jw r1, AnonymousClass35W r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0202, code lost:
        if (X.182.A06(X.0Tu.A05, r12.A02, 36315262747741294L) != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0249, code lost:
        if (X.182.A06(X.0Tu.A05, ((X.C2368035d) r10).A01, 36316714446623336L) == false) goto L_0x024b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r23
            r0 = 231056164(0xdc5a324, float:1.2180337E-30)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.36h r1 = (X.C2370936h) r1
            r0 = -1327023491(0xffffffffb0e73a7d, float:-1.6824085E-9)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r2 = 0
            X.0qQ.A0B(r1, r2)
            r12 = r22
            X.35W r11 = r12.A01
            java.lang.ref.WeakReference r0 = r11.A0b
            java.lang.Object r5 = r0.get()
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            if (r5 != 0) goto L_0x0031
            r0 = -1857213871(0xffffffff914d2a51, float:-1.6184688E-28)
        L_0x0027:
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1112605952(0x42510500, float:52.254883)
            X.AnonymousClass0fD.A0A(r0, r9)
            return
        L_0x0031:
            X.3Q2 r1 = r1.A00
            com.instagram.pendingmedia.model.constants.ShareType r8 = r1.A0E()
            X.3QD r4 = r1.A1f
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            if (r4 == r0) goto L_0x0041
            r0 = -717619806(0xffffffffd539fda2, float:-1.27811872E13)
            goto L_0x0027
        L_0x0041:
            boolean r0 = X.C39598A1o.A00(r1)
            if (r0 == 0) goto L_0x004d
            com.instagram.common.session.UserSession r4 = r11.A0T
            r0 = 0
            X.C45155CrI.A00(r4, r0)
        L_0x004d:
            androidx.fragment.app.FragmentActivity r6 = r5.getActivity()
            if (r6 != 0) goto L_0x0057
            r0 = 400766919(0x17e337c7, float:1.4683611E-24)
            goto L_0x0027
        L_0x0057:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r5 = r11.A0T
            com.instagram.user.model.User r10 = r0.A01(r5)
            X.1Xj r7 = r1.A1C
            if (r7 != 0) goto L_0x0067
            r0 = -1623165213(0xffffffff9f4076e3, float:-4.0755922E-20)
            goto L_0x0027
        L_0x0067:
            X.DU2 r0 = r7.A1E()
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L_0x0112
            java.lang.String r12 = r7.getId()
            if (r12 == 0) goto L_0x029d
            X.7Pr r0 = new X.7Pr
            r0.<init>(r5)
            X.7Pu r11 = r0.A00()
            X.C49892FBu.A02()
            X.E0f r10 = new X.E0f
            r10.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "media_id"
            r1.putString(r0, r12)
            r10.setArguments(r1)
            r11.A02(r6, r10)
        L_0x0096:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            if (r8 != r0) goto L_0x010d
            java.lang.String r7 = r7.getId()
            if (r7 == 0) goto L_0x02a6
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319428865957271(0x81085400001d97, double:3.031891289208297E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x010d
            X.W3U r0 = X.W3U.A00
            X.0xa r1 = X.W3U.A02(r5, r0)
            r0 = 3235(0xca3, float:4.533E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x010d
            X.J6T r4 = new X.J6T
            r4.<init>((int) r2, (java.lang.Object) r6, (java.lang.Object) r5)
            r0 = -2
            X.1NY r6 = new X.1NY
            r6.<init>(r5, r0)
            java.lang.String r10 = "api/"
            java.lang.String r11 = "v1/"
            java.lang.String r12 = "commerce/"
            java.lang.String r13 = "community/"
            java.lang.String r14 = "featured_products/"
            java.lang.String r15 = "auto_approve_nudge_eligibility/"
            java.lang.String r16 = "%s/"
            r6.A05()
            r6.A02()
            java.lang.String r1 = X.002.A15(r10, r11, r12, r13, r14, r15, r16)
            X.0qQ.A07(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            java.lang.String r0 = X.0mp.A06(r1, r0)
            r6.A0A(r0)
            java.lang.Class<X.GyT> r1 = X.C54044GyT.class
            java.lang.Class<X.Huk> r0 = X.C56217Huk.class
            r6.A0Q(r1, r0)
            X.1OC r1 = r6.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ShoppingFeaturedProductAutoApproveNudgeResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ShoppingFeaturedProductAutoApproveNudgeResponse>>"
            X.0qQ.A0C(r1, r0)
            X.H49 r0 = new X.H49
            r0.<init>(r4)
            r1.A00 = r0
            r0 = 1933075208(0x73386308, float:1.460863E31)
            X.1ES.A06(r1, r0, r2)
        L_0x010d:
            r0 = -289036415(0xffffffffeec5a781, float:-3.0585523E28)
            goto L_0x0027
        L_0x0112:
            boolean r0 = X.C323926yK.A02(r5, r10)
            if (r0 == 0) goto L_0x01b0
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            if (r8 == r0) goto L_0x0120
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS
            if (r8 != r0) goto L_0x01b0
        L_0x0120:
            X.2jw r11 = r12.A00
            r13 = 1
            int r0 = X.C323926yK.A00(r5)
            java.lang.String r10 = r6.getString(r0)
            X.0qQ.A07(r10)
            r1 = 2131971919(0x7f134f4f, float:1.958083E38)
            java.lang.String r0 = X.C323926yK.A01(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r14 = r6.getString(r1, r0)
            X.0qQ.A07(r14)
            r1 = 2131971918(0x7f134f4e, float:1.9580829E38)
            java.lang.String r0 = X.C323926yK.A01(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r10}
            java.lang.String r12 = r6.getString(r1, r0)
            X.0qQ.A07(r12)
            r0 = 2131963043(0x7f132ca3, float:1.9562828E38)
            java.lang.String r16 = r6.getString(r0)
            X.0qQ.A07(r16)
            r0 = 2131963042(0x7f132ca2, float:1.9562826E38)
            java.lang.String r15 = r6.getString(r0)
            X.0qQ.A07(r15)
            X.0Tu r10 = X.0Tu.A05
            r0 = 36323899926916695(0x810c6500002e57, double:3.034718806162554E-306)
            boolean r0 = X.182.A06(r10, r5, r0)
            X.1xC r10 = X.1xC.A01
            X.6ap r1 = new X.6ap
            r1.<init>()
            if (r0 == 0) goto L_0x017c
            r14 = r16
        L_0x017c:
            r1.A0D = r14
            if (r0 == 0) goto L_0x0181
            r12 = r15
        L_0x0181:
            r1.A0I = r12
            r0 = 8000(0x1f40, float:1.121E-41)
            r1.A01 = r0
            r1.A0J = r13
            r1.A0R = r13
            r1.A01()
            r0 = 2131968321(0x7f134141, float:1.9573533E38)
            java.lang.String r0 = r6.getString(r0)
            X.0qQ.A07(r0)
            r1.A0G = r0
            X.WYH r0 = new X.WYH
            r0.<init>(r6, r11, r5)
            r1.A0A(r0)
            X.Dc2 r1 = r1.A00()
            X.3GP r0 = new X.3GP
            r0.<init>(r1)
            r10.A01(r0)
            goto L_0x0096
        L_0x01b0:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS
            com.instagram.pendingmedia.model.constants.ShareType[] r0 = new com.instagram.pendingmedia.model.constants.ShareType[]{r0}
            java.util.HashSet r0 = X.0sc.A05(r0)
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0250
            X.35Z r10 = r11.A01
            X.2jw r0 = r12.A00
            r15 = 12
            X.9Md r14 = new X.9Md
            r18 = r8
            r19 = r7
            r20 = r1
            r21 = r11
            r16 = r6
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
        L_0x01d7:
            boolean r11 = r10 instanceof X.AnonymousClass35Z
            if (r11 == 0) goto L_0x0239
            r12 = r10
            X.35Z r12 = (X.AnonymousClass35Z) r12
            X.1Xy r0 = r7.A0C
            X.1sQ r1 = r0.getClipsMetadata()
            r0 = 1
            if (r1 == 0) goto L_0x01f5
            java.lang.Boolean r1 = r1.Ca8()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x024b
        L_0x01f5:
            com.instagram.common.session.UserSession r13 = r12.A02
            X.0Tu r12 = X.0Tu.A05
            r0 = 36315262747741294(0x81048a00010c6e, double:3.0292566192729015E-306)
            boolean r0 = X.182.A06(r12, r13, r0)
            if (r0 == 0) goto L_0x024b
        L_0x0204:
            com.instagram.common.session.UserSession r13 = r10.A03
            r0 = -2
            X.1NY r12 = new X.1NY
            r12.<init>(r13, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r12.A08(r0)
            if (r11 == 0) goto L_0x0236
            java.lang.String r0 = "clips/check_clips_celebration_eligibility/"
        L_0x0215:
            r12.A0A(r0)
            java.lang.Class<X.OOh> r11 = X.C70852OOh.class
            X.0bH r1 = new X.0bH
            r1.<init>(r13)
            X.1NS r0 = new X.1NS
            r0.<init>(r1, r11)
            r12.A02 = r0
            X.1OC r1 = r12.A0M()
            X.NM0 r0 = new X.NM0
            r0.<init>(r10, r7, r14)
            r1.A00 = r0
            X.1ES.A03(r1)
            goto L_0x0096
        L_0x0236:
            java.lang.String r0 = "feed/check_post_celebration_eligibility/"
            goto L_0x0215
        L_0x0239:
            r0 = r10
            X.35d r0 = (X.C2368035d) r0
            com.instagram.common.session.UserSession r13 = r0.A01
            X.0Tu r12 = X.0Tu.A05
            r0 = 36316714446623336(0x8105dc00001268, double:3.030174679491427E-306)
            boolean r0 = X.182.A06(r12, r13, r0)
            if (r0 != 0) goto L_0x0204
        L_0x024b:
            r14.invoke()
            goto L_0x0096
        L_0x0250:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            com.instagram.pendingmedia.model.constants.ShareType[] r0 = new com.instagram.pendingmedia.model.constants.ShareType[]{r0}
            java.util.HashSet r0 = X.0sc.A05(r0)
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0275
            X.35d r10 = r11.A00
            r15 = 15
            X.9Ma r14 = new X.9Ma
            r16 = r6
            r17 = r8
            r18 = r11
            r19 = r7
            r20 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20)
            goto L_0x01d7
        L_0x0275:
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A03
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0286
            X.1ZU r0 = X.C48794EkH.A00()
            r0.A03(r6, r5, r7)
            goto L_0x0096
        L_0x0286:
            X.35e r10 = r11.A0Z
            boolean r0 = r10.A01(r1, r8)
            if (r0 == 0) goto L_0x0096
            X.1Xj r1 = r1.A1C
            if (r1 == 0) goto L_0x0096
            X.3kK r0 = r11.A0Y
            java.lang.String r0 = r0.getSessionId()
            r10.A00(r6, r1, r8, r0)
            goto L_0x0096
        L_0x029d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r4)
            r0 = 1302354650(0x4da05ada, float:3.36288576E8)
            goto L_0x02ae
        L_0x02a6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r4)
            r0 = -1857734522(0xffffffff91453886, float:-1.5557977E-28)
        L_0x02ae:
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2369235q.onEvent(java.lang.Object):void");
    }
}
