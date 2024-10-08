package X;

public final class II0 implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public II0(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x0064;
                case 2: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r5.A03
            X.30x r3 = (X.C2357130x) r3
            com.instagram.common.session.UserSession r0 = r3.A0J
            X.60k r1 = X.C3018660j.A01(r0)
            X.Nmo r0 = X.C69506Nmo.A0K
            r1.A0D(r0)
            java.lang.Object r2 = r5.A02
            X.ITb r2 = (X.C57214ITb) r2
            java.lang.Object r1 = r5.A01
            X.IUi r1 = (X.C57247IUi) r1
            X.4ac r0 = X.C266954ac.CLICKED_HIDE
            X.C2357130x.A00(r2, r1, r0, r3)
        L_0x0021:
            return
        L_0x0022:
            if (r6 == 0) goto L_0x0021
            X.3lr r3 = X.C41845B3m.A0U(r6)
            if (r3 == 0) goto L_0x0021
            X.HNI r2 = X.HNI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 0
            r0 = 1963(0x7ab, float:2.751E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Enum r1 = r3.getOptionalEnumField(r1, r0, r2)
            if (r1 == 0) goto L_0x0045
            X.HNI r0 = X.HNI.FREE_BA_EXPERIENCE
            if (r1 != r0) goto L_0x0059
            java.lang.Object r1 = r5.A03
            X.0rm r1 = (X.0rm) r1
            java.lang.String r0 = "afs"
        L_0x0043:
            r1.A00 = r0
        L_0x0045:
            java.lang.Object r2 = r5.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r5.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r5.A03
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            X.I3C.A02(r2, r1, r0)
            return
        L_0x0059:
            X.HNI r0 = X.HNI.CONTEXTUAL_ADS_EXPERIENCE
            if (r1 != r0) goto L_0x0045
            java.lang.Object r1 = r5.A03
            X.0rm r1 = (X.0rm) r1
            java.lang.String r0 = "afs_contextual_ads"
            goto L_0x0043
        L_0x0064:
            if (r6 == 0) goto L_0x00b4
            X.3lr r3 = X.C41845B3m.A0U(r6)
            if (r3 == 0) goto L_0x00b4
            java.lang.Class<X.Bmh> r2 = X.C42913Bmh.class
            r0 = 4272(0x10b0, float:5.986E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -460811967(0xffffffffe4889141, float:-2.015379E22)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x00b4
            java.lang.Class<X.Bmg> r2 = X.C42912Bmg.class
            java.lang.String r1 = "request"
            r0 = -314990674(0xffffffffed399fae, float:-3.5904855E27)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x00b4
            X.EWy r2 = X.C48132EWy.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 1
            java.lang.String r0 = "status"
            java.lang.Enum r1 = r3.getOptionalEnumField(r1, r0, r2)
        L_0x0093:
            X.EWy r0 = X.C48132EWy.CANCELED
            if (r1 != r0) goto L_0x00a0
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A03
            r1.invoke(r0)
        L_0x00a0:
            X.1xC r3 = X.1xC.A01
            X.6ap r2 = X.DbS.A0a()
            java.lang.Object r1 = r5.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131973141(0x7f135415, float:1.958331E38)
            X.DbS.A19(r1, r2, r0)
            X.DbY.A1K(r3, r2)
            return
        L_0x00b4:
            r1 = 0
            goto L_0x0093
        L_0x00b6:
            r4 = 0
            if (r6 == 0) goto L_0x0108
            X.3lr r3 = X.C41845B3m.A0U(r6)
            if (r3 == 0) goto L_0x0108
            java.lang.Class<com.instagram.schools.management.data.RemoveUserSchoolResponseImpl$XdtRemoveUserSchool> r2 = com.instagram.schools.management.data.RemoveUserSchoolResponseImpl.XdtRemoveUserSchool.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -1016451167(0xffffffffc36a2fa1, float:-234.18605)
            java.lang.String r0 = "xdt_remove_user_school"
            X.3lr r3 = r3.A05(r2, r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.schools.management.data.RemoveUserSchoolResponseImpl.XdtRemoveUserSchool"
            X.0qQ.A0C(r3, r0)
            if (r3 == 0) goto L_0x0108
            X.HNH r2 = X.HNH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 0
            java.lang.String r0 = "status"
            java.lang.Enum r1 = r3.getOptionalEnumField(r1, r0, r2)
        L_0x00dc:
            X.HNH r0 = X.HNH.SCHOOL_REMOVAL_SUCCESS
            if (r1 != r0) goto L_0x0105
            X.0eE r2 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r5.A03
            X.Hrd r0 = (X.C56031Hrd) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            com.instagram.user.model.User r0 = r2.A01(r1)
            X.4Cl r0 = r0.A03
            r0.El7(r4)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            java.lang.String r1 = r1.A06
            X.INe r0 = new X.INe
            r0.<init>(r1)
            r2.A00(r0)
            java.lang.Object r0 = r5.A02
        L_0x0101:
            X.DbS.A1U(r0)
            return
        L_0x0105:
            java.lang.Object r0 = r5.A01
            goto L_0x0101
        L_0x0108:
            r1 = r4
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.II0.invoke(X.3JD):void");
    }
}
