package X;

/* renamed from: X.FfZ  reason: case insensitive filesystem */
public final class C50618FfZ implements G64 {
    public final int A00;
    public final Object A01;

    public C50618FfZ(C49923FEy fEy, int i) {
        this.A00 = i;
        this.A01 = fEy;
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [X.63P, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CHr(androidx.fragment.app.FragmentActivity r21) {
        /*
            r20 = this;
            r2 = r20
            int r1 = r2.A00
            r0 = r21
            switch(r1) {
                case 0: goto L_0x0185;
                case 1: goto L_0x0122;
                case 2: goto L_0x00da;
                case 3: goto L_0x006c;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A01
            X.FEy r1 = (X.C49923FEy) r1
            X.F0t r2 = X.C49923FEy.A00(r1)
            X.DbT.A15()
            X.Jtv r1 = r2.A03
            java.lang.String r9 = r1.A04
            java.lang.String r8 = r1.A03
            com.instagram.common.typedurl.ImageUrl r7 = r1.A00
            java.lang.Integer r1 = r1.A01
            java.lang.String r6 = X.C49774F6h.A01(r1)
            X.0aP r4 = r2.A02
            boolean r3 = r2.A07
            X.E4P r5 = new X.E4P
            r5.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "USER_ID"
            r2.putString(r1, r9)
            java.lang.String r1 = "USERNAME"
            r2.putString(r1, r8)
            java.lang.String r1 = "PROFILE_PIC_URL"
            r2.putParcelable(r1, r7)
            java.lang.String r1 = "ORIGINATING_ACCOUNT_SOURCE"
            r2.putString(r1, r6)
            X.DbU.A1C(r2)
            java.lang.String r1 = "IS_FROM_NDX"
            r2.putBoolean(r1, r3)
            r5.setArguments(r2)
            X.6Yo r4 = X.DbS.A0M(r0, r4)
            r3 = 2130772045(0x7f01004d, float:1.7147197E38)
            r2 = 2130772041(0x7f010049, float:1.714719E38)
            r1 = 2130772043(0x7f01004b, float:1.7147193E38)
            r0 = 2130772044(0x7f01004c, float:1.7147195E38)
            r4.A0A(r3, r2, r1, r0)
            r4.A0D(r5)
            r4.A04()
            return
        L_0x006c:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A01
            X.FEy r1 = (X.C49923FEy) r1
            X.F0t r12 = X.C49923FEy.A00(r1)
            X.3Ii r2 = r12.A05
            r8 = 0
            X.G3g r1 = X.C51822G3g.A00
            java.lang.Object r2 = X.C49775F6i.A00(r2, r1)
            X.4dm r2 = (X.C268654dm) r2
            X.F2t r15 = X.C46413Dea.A03(r2)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<com.instagram.login.api.TwoFacResponse>"
            X.0qQ.A0C(r2, r1)
            X.4do r2 = (X.C268674do) r2
            java.lang.Object r3 = r2.A00
            r1 = r3
            X.Dvv r1 = (X.C47361Dvv) r1
            X.Ebh r1 = X.C44960Cnu.A00(r1)
            java.lang.String r19 = r1.A06()
            X.0aP r7 = r12.A02
            X.4DH r5 = X.C49853F9s.A00(r0)
            if (r5 == 0) goto L_0x00d6
            com.facebook.common.callercontext.CallerContext r1 = X.EEM.A0B
            X.DiE r9 = r12.A04
            X.0xG r6 = X.C49853F9s.A00
            X.EEM r4 = new X.EEM
            r10 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r9 = r0
            com.instagram.base.activity.IgFragmentActivity r9 = (com.instagram.base.activity.IgFragmentActivity) r9
            X.F23 r14 = new X.F23
            r14.<init>(r5, r7)
            X.Fdc r8 = new X.Fdc
            r10 = r5
            r11 = r6
            r13 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.Jtv r1 = r12.A03
            java.lang.String r2 = r1.A03
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.login.api.LoginResponse"
            X.0qQ.A0C(r3, r1)
            X.EM4 r3 = (X.EM4) r3
            r14 = r7
            r17 = r8
            r18 = r2
            r13 = r0
            r16 = r3
            X.F6O.A01(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x00d6:
            java.lang.String r2 = "SignInNavigation"
            goto L_0x016e
        L_0x00da:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A01
            X.FEy r1 = (X.C49923FEy) r1
            X.F0t r1 = X.C49923FEy.A00(r1)
            X.3Ii r2 = r1.A05
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x011b
            java.lang.String r1 = "null cannot be cast to non-null type com.meta.kotlin.Try.Failure<com.instagram.common.api.base.ApiError<Response of com.instagram.nux.aymh.responsehandlers.LoginParameters>>"
            X.0qQ.A0C(r2, r1)
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r2 = r2.A00
            X.4dm r2 = (X.C268654dm) r2
            boolean r1 = r2 instanceof X.C268674do
            if (r1 != 0) goto L_0x011b
            boolean r1 = r2 instanceof X.C268664dn
            if (r1 == 0) goto L_0x011d
            X.4dn r2 = (X.C268664dn) r2
            java.lang.Throwable r1 = r2.A00
            if (r1 == 0) goto L_0x011b
            java.lang.Throwable r1 = r1.getCause()
        L_0x0109:
            boolean r3 = r1 instanceof java.lang.SecurityException
            r1 = 2131961740(0x7f13278c, float:1.9560185E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r0, r1)
            r1 = 2131968258(0x7f134102, float:1.9573406E38)
            if (r3 == 0) goto L_0x017d
            r1 = 2131972964(0x7f135364, float:1.958295E38)
            goto L_0x017d
        L_0x011b:
            r1 = 0
            goto L_0x0109
        L_0x011d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0122:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A01
            X.FEy r1 = (X.C49923FEy) r1
            X.F0t r3 = X.C49923FEy.A00(r1)
            X.3Ii r2 = r3.A05
            X.G3g r1 = X.C51822G3g.A00
            java.lang.Object r2 = X.C49775F6i.A00(r2, r1)
            X.4dm r2 = (X.C268654dm) r2
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<com.instagram.login.api.TwoFacResponse>"
            X.0qQ.A0C(r2, r1)
            X.4do r2 = (X.C268674do) r2
            java.lang.Object r2 = r2.A00
            r1 = r2
            X.Dvv r1 = (X.C47361Dvv) r1
            X.Ebh r1 = X.C44960Cnu.A00(r1)
            X.0aP r6 = r3.A02
            X.4DH r4 = X.C49853F9s.A00(r0)
            if (r4 == 0) goto L_0x016c
            com.facebook.common.callercontext.CallerContext r0 = X.EEM.A0B
            X.DiE r8 = r3.A04
            X.0xG r5 = X.C49853F9s.A00
            r7 = 0
            X.EEM r3 = new X.EEM
            r9 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.login.api.FacebookSignUpResponse"
            X.0qQ.A0C(r2, r0)
            X.EM5 r2 = (X.EM5) r2
            java.lang.String r0 = r1.A05()
            r3.A0C(r2, r0, r7, r7)
            return
        L_0x016c:
            java.lang.String r2 = "FacebookSignInNavigation"
        L_0x016e:
            java.lang.String r1 = "could not find current fragment"
            X.0wb.A03(r2, r1)
            r1 = 2131961740(0x7f13278c, float:1.9560185E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r0, r1)
            r1 = 2131963032(0x7f132c98, float:1.9562806E38)
        L_0x017d:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r0, r1)
            X.C49952FGh.A06(r0, r1, r2)
            return
        L_0x0185:
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r6 = r2.A01
            X.FEy r6 = (X.C49923FEy) r6
            X.FfW r1 = X.C49853F9s.A01
            java.lang.Class<X.F0t> r4 = X.C49662F0t.class
            java.lang.Object r1 = X.C49923FEy.A01(r6, r4)
            X.F0t r1 = (X.C49662F0t) r1
            X.Jtv r1 = r1.A03
            java.lang.Object r7 = r1.A02
            r3 = 5
            boolean r1 = r7 instanceof X.C15050ULg
            if (r1 == 0) goto L_0x0213
            r2 = r7
            X.ULg r2 = (X.C15050ULg) r2
            int r1 = r2.A02
            if (r1 != r3) goto L_0x0213
            r1 = 93
            java.lang.String r1 = X.Pxd.A00(r1)
            X.0qQ.A0C(r7, r1)
            java.lang.String r12 = r2.A00
            if (r12 == 0) goto L_0x0213
            java.lang.Class<com.instagram.user.model.User> r1 = com.instagram.user.model.User.class
            java.lang.Object r2 = X.C49923FEy.A01(r6, r1)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r1 = X.DbU.A0p(r2)
            android.net.Uri r9 = X.0cp.A03(r1)
            java.lang.String r10 = r2.getUsername()
            r13 = 0
            java.lang.String r11 = r2.getFullName()
            java.lang.String r1 = ""
            if (r11 != 0) goto L_0x01d2
            r11 = r1
        L_0x01d2:
            if (r9 != 0) goto L_0x01db
            android.net.Uri r9 = X.0cp.A03(r1)
            X.0qQ.A07(r9)
        L_0x01db:
            com.google.android.gms.auth.api.credentials.Credential r8 = new com.google.android.gms.auth.api.credentials.Credential
            r14 = r13
            r15 = r13
            r16 = r13
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            X.DuC r7 = X.C47283DuC.A00
            X.63K r3 = X.C10136RnD.A04
            X.63O r2 = new X.63O
            r2.<init>()
            X.DuD r1 = new X.DuD
            r1.<init>((android.app.Activity) r0, (X.AnonymousClass63L) r7, (X.AnonymousClass63K) r3, (X.AnonymousClass63P) r2)
            X.63S r2 = r1.A05
            r1 = 196(0xc4, float:2.75E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            X.AnonymousClass3Qk.A03(r2, r1)
            X.Qtp r1 = new X.Qtp
            r1.<init>(r8, r2)
            X.Qts r1 = r2.A07(r1)
            X.9GD r3 = X.SMT.A00(r1)
            r2 = 1
            X.Syv r1 = new X.Syv
            r1.<init>(r0, r2)
            r3.A03(r1)
        L_0x0213:
            java.lang.Object r1 = X.C49923FEy.A01(r6, r4)
            X.F0t r1 = (X.C49662F0t) r1
            boolean r4 = r1.A07
            r3 = 0
            java.lang.Class<com.instagram.common.session.UserSession> r1 = com.instagram.common.session.UserSession.class
            java.lang.Object r2 = X.C49923FEy.A01(r6, r1)
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.0xG r1 = X.C49853F9s.A00
            if (r4 == 0) goto L_0x0238
            double r8 = X.DbS.A01()
            r13 = 1
            r10 = r5
            r11 = r5
            r12 = r5
            r4 = r0
            r5 = r3
            r6 = r1
            r7 = r2
            X.C46413Dea.A07(r4, r5, r6, r7, r8, r10, r11, r12, r13)
            return
        L_0x0238:
            X.C46413Dea.A05(r0, r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50618FfZ.CHr(androidx.fragment.app.FragmentActivity):void");
    }
}
