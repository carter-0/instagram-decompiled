package X;

/* renamed from: X.IHx  reason: case insensitive filesystem */
public final class C56928IHx implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;

    public C56928IHx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca A[LOOP:1: B:35:0x00ca->B:36:0x00db, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00de A[LOOP:2: B:38:0x00de->B:39:0x00ef, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0159;
                case 1: goto L_0x00f2;
                case 2: goto L_0x0069;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r9.A01
            X.H0D r4 = (X.H0D) r4
            X.0eM r0 = r4.A03
            java.lang.Object r0 = r0.getValue()
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.hide()
            if (r10 == 0) goto L_0x0063
            X.3lr r3 = X.C41845B3m.A0U(r10)
            if (r3 == 0) goto L_0x0063
            java.lang.Class<com.instagram.schools.management.data.RemoveUserSchoolResponseImpl$XdtRemoveUserSchool> r2 = com.instagram.schools.management.data.RemoveUserSchoolResponseImpl.XdtRemoveUserSchool.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -1016451167(0xffffffffc36a2fa1, float:-234.18605)
            java.lang.String r0 = "xdt_remove_user_school"
            X.3lr r3 = r3.A05(r2, r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.schools.management.data.RemoveUserSchoolResponseImpl.XdtRemoveUserSchool"
            X.0qQ.A0C(r3, r0)
            if (r3 == 0) goto L_0x0063
            X.HNH r2 = X.HNH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 0
            java.lang.String r0 = "status"
            java.lang.Enum r1 = r3.getOptionalEnumField(r1, r0, r2)
        L_0x0039:
            X.HNH r0 = X.HNH.SCHOOL_REMOVAL_SUCCESS
            if (r1 != r0) goto L_0x0065
            X.0eE r0 = X.AnonymousClass0t1.A01
            X.0eM r3 = r4.A05
            com.instagram.user.model.User r0 = X.DbX.A0l(r0, r3)
            r1 = 0
            X.4Cl r0 = r0.A03
            r0.El7(r1)
            X.1Ng r2 = X.DbX.A0R(r3)
            java.lang.String r1 = X.DbU.A0u(r3)
            X.INe r0 = new X.INe
            r0.<init>(r1)
            r2.A00(r0)
            X.JPX r0 = r4.A01
            if (r0 == 0) goto L_0x0062
            r0.Dgx()
        L_0x0062:
            return
        L_0x0063:
            r1 = 0
            goto L_0x0039
        L_0x0065:
            X.H0D.A00(r4)
            return
        L_0x0069:
            r7 = 1
            if (r10 == 0) goto L_0x00bf
            X.3lr r8 = X.C41845B3m.A0U(r10)
            if (r8 == 0) goto L_0x00bf
            java.lang.Class<com.instagram.schools.management.data.ResendOTPEmailResponseImpl$XdtResendOtpEmail> r6 = com.instagram.schools.management.data.ResendOTPEmailResponseImpl.XdtResendOtpEmail.class
            X.3sh r0 = X.C250663lr.Companion
            r5 = -334163(0xfffffffffffae6ad, float:NaN)
            r4 = 0
            r0 = 4246(0x1096, float:5.95E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            X.3lr r2 = r8.getRequiredTreeField(r4, r3, r6, r5)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.schools.management.data.ResendOTPEmailResponseImpl.XdtResendOtpEmail"
            X.0qQ.A0C(r2, r1)
            if (r2 == 0) goto L_0x00ad
            java.lang.String r0 = "success"
            boolean r0 = r2.getCoercedBooleanField(r4, r0)
            if (r0 != r7) goto L_0x00ad
            java.lang.Object r0 = r9.A01
            X.Hrd r0 = (X.C56031Hrd) r0
            X.05G r3 = r0.A01
        L_0x0099:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.GnQ r1 = (X.C53393GnQ) r1
            X.HLs r0 = X.C54635HLs.SUCCESS
            X.GnQ r0 = X.C53393GnQ.A00((com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (X.HM5) null, (X.HM6) null, r0, r1, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 126975, false)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0099
            return
        L_0x00ad:
            X.3lr r2 = r8.A05(r6, r3, r5)
            X.0qQ.A0C(r2, r1)
            if (r2 == 0) goto L_0x00bf
            X.HNJ r1 = X.HNJ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "error"
            java.lang.Enum r2 = r2.getOptionalEnumField(r7, r0, r1)
            goto L_0x00c0
        L_0x00bf:
            r2 = 0
        L_0x00c0:
            X.HNJ r1 = X.HNJ.RATE_LIMIT_REACHED
            java.lang.Object r0 = r9.A01
            X.Hrd r0 = (X.C56031Hrd) r0
            X.05G r3 = r0.A01
            if (r2 != r1) goto L_0x00de
        L_0x00ca:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.GnQ r1 = (X.C53393GnQ) r1
            X.HLs r0 = X.C54635HLs.RATE_LIMITED
            X.GnQ r0 = X.C53393GnQ.A00((com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (X.HM5) null, (X.HM6) null, r0, r1, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 126975, false)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x00ca
            return
        L_0x00de:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.GnQ r1 = (X.C53393GnQ) r1
            X.HLs r0 = X.C54635HLs.NETWORK_ERROR
            X.GnQ r0 = X.C53393GnQ.A00((com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (X.HM5) null, (X.HM6) null, r0, r1, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 126975, false)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x00de
            return
        L_0x00f2:
            r6 = 0
            if (r10 == 0) goto L_0x014a
            X.3lr r8 = X.C41845B3m.A0U(r10)
            if (r8 == 0) goto L_0x014a
            java.lang.Class<X.Bgh> r7 = X.C42684Bgh.class
            r4 = 0
            r0 = 4232(0x1088, float:5.93E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r2 = 1807796872(0x6bc0ca88, float:4.6614037E26)
            X.3lr r1 = r8.getRequiredTreeField(r4, r3, r7, r2)
            java.lang.String r0 = "summary"
            java.lang.String r5 = r1.getRequiredStringField(r4, r0)
            X.0qQ.A07(r5)
            X.3lr r4 = r8.getRequiredTreeField(r4, r3, r7, r2)
            java.lang.Class<X.Bgg> r3 = X.C42683Bgg.class
            r2 = 1
            java.lang.String r1 = "media"
            r0 = -2147377220(0xffffffff80019fbc, float:-1.49137E-40)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x0148
            r0 = 4110(0x100e, float:5.76E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getOptionalStringField(r2, r0)
        L_0x0130:
            X.Hkh r2 = new X.Hkh
            r2.<init>(r5, r0)
            java.lang.Object r1 = r9.A01
            X.2YL r1 = (X.2YL) r1
            X.6oS r4 = X.C318116oQ.A00(r1)
            r0 = 21
            X.ImQ r3 = new X.ImQ
            r3.<init>(r2, r1, r6, r0)
        L_0x0144:
            X.AnonymousClass7TE.A1Z(r3, r4)
            return
        L_0x0148:
            r0 = r6
            goto L_0x0130
        L_0x014a:
            java.lang.Object r1 = r9.A01
            X.2YL r1 = (X.2YL) r1
            X.6oS r4 = X.C318116oQ.A00(r1)
            r0 = 3
            X.MFR r3 = new X.MFR
            r3.<init>(r1, r6, r0)
            goto L_0x0144
        L_0x0159:
            java.lang.Object r0 = r9.A01
            X.QGH r0 = (X.QGH) r0
            X.2IR r0 = r0.A04
            if (r0 == 0) goto L_0x0165
            r0.onSuccess(r10)
            return
        L_0x0165:
            java.lang.String r0 = "deletionCallback"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56928IHx.invoke(X.3JD):void");
    }
}
