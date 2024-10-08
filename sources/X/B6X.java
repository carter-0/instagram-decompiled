package X;

public abstract class B6X {
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C273664mz A00(X.AnonymousClass3JD r13, com.instagram.common.session.UserSession r14) {
        /*
            X.AnonymousClass7TG.A1N(r13, r14)
            java.lang.Object r4 = r13.Bny()
            X.3ls r4 = (X.C250673ls) r4
            boolean r0 = r4 instanceof X.C1U
            if (r0 == 0) goto L_0x0083
            X.3lr r4 = (X.C250663lr) r4
            java.lang.Class<X.C1T> r2 = X.C1T.class
            r3 = 0
            java.lang.String r1 = "xdt_api__v1__profile_timeline(_request_data:$_request_data,user_id:$user_id)"
            r0 = -749156127(0xffffffffd358c8e1, float:-9.3108312E11)
        L_0x0017:
            X.3lr r2 = r4.getOptionalTreeField(r3, r1, r2, r0)
            java.lang.Class<X.C1l> r1 = X.C43585C1l.class
            r0 = -745647686(0xffffffffd38e51ba, float:-1.222513E12)
            X.3lr r2 = r2.reinterpretRequired(r3, r1, r0)
            X.0qQ.A0A(r2)
            X.1E5 r1 = X.1E4.A00(r14)
            java.lang.Class<X.B6Y> r0 = X.B6Y.class
            com.facebook.pando.TreeJNI r10 = r2.reinterpret(r0)
            X.17P r10 = (X.17P) r10
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            X.1E9 r2 = new X.1E9
            r2.<init>(r1, r0, r3)
            r0 = -1202000768(0xffffffffb85aec80, float:-5.2195508E-5)
            java.lang.Boolean r12 = r10.getOptionalBooleanValueByHashCode(r0)
            r1 = -1100413608(0xffffffffbe690558, float:-0.22755945)
            java.lang.Class<X.CIZ> r0 = X.CIZ.class
            com.facebook.pando.TreeJNI r0 = r10.A05(r1, r0)
            X.3Id r0 = (X.C239783Id) r0
            r9 = 0
            if (r0 == 0) goto L_0x0081
            X.3Ic r7 = r0.F1N(r2)
        L_0x0055:
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r1 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            r0 = 100526016(0x5fde7c0, float:2.3877137E-35)
            com.google.common.collect.ImmutableList r0 = r10.A08(r0, r1)
            if (r0 == 0) goto L_0x0092
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0068:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r1 = r3.next()
            com.instagram.feed.media.ImmutablePandoMediaDict r1 = (com.instagram.feed.media.ImmutablePandoMediaDict) r1
            X.1Xv r0 = X.1Xj.A0h
            X.0qQ.A0A(r1)
            X.1Xj r0 = X.1Xv.A00(r2, r1)
            r5.add(r0)
            goto L_0x0068
        L_0x0081:
            r7 = r9
            goto L_0x0055
        L_0x0083:
            boolean r0 = r4 instanceof X.C1S
            if (r0 == 0) goto L_0x01a6
            X.3lr r4 = (X.C250663lr) r4
            java.lang.Class<X.C1R> r2 = X.C1R.class
            r3 = 0
            java.lang.String r1 = "xdt_api__v1__profile_timeline_by_username(request_data:$request_data,username:$username)"
            r0 = -1129149909(0xffffffffbcb28a2b, float:-0.0217944)
            goto L_0x0017
        L_0x0092:
            r5 = 0
        L_0x0093:
            r4 = 10
            if (r5 == 0) goto L_0x00b3
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r3 = r5.iterator()
        L_0x009f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = r3.next()
            X.1Xj r0 = (X.1Xj) r0
            X.17K r0 = r2.A00(r0)
            r1.add(r0)
            goto L_0x009f
        L_0x00b3:
            r1 = r9
        L_0x00b4:
            r0 = -1081138730(0xffffffffbf8f21d6, float:-1.1182201)
            r10.A0j(r0)
            r0 = 1024940639(0x3d175a5f, float:0.03695142)
            java.lang.Boolean r11 = r10.getOptionalBooleanValueByHashCode(r0)
            r0 = 1314516130(0x4e59eca2, float:9.1404096E8)
            java.lang.String r6 = r10.A0j(r0)
            r0 = -1896634307(0xffffffff8ef3a83d, float:-6.0066133E-30)
            r10.getOptionalIntValueByHashCode(r0)
            r0 = -879187555(0xffffffffcb98a99d, float:-2.0009786E7)
            java.lang.String r8 = r10.A0i(r0)
            r3 = 1371611613(0x51c121dd, float:1.03687102E11)
            java.lang.Class<X.CNa> r0 = X.CNa.class
            com.google.common.collect.ImmutableList r0 = r10.A08(r3, r0)
            if (r0 == 0) goto L_0x00fc
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x00e8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r3.next()
            X.DRm r0 = (X.C46231DRm) r0
            X.UNQ r0 = r0.F8A(r2)
            r9.add(r0)
            goto L_0x00e8
        L_0x00fc:
            r0 = 1750174712(0x68518bf8, float:3.9582263E24)
            java.lang.String r5 = r10.A0i(r0)
            com.instagram.user.model.ImmutablePandoUserDict r0 = X.C41846B3n.A0Z(r10)
            if (r0 == 0) goto L_0x0112
            com.instagram.user.model.User r0 = X.C41845B3m.A0b(r2, r0)
            if (r0 == 0) goto L_0x0112
            r2.A00(r0)
        L_0x0112:
            X.4mz r3 = new X.4mz
            r3.<init>()
            if (r1 != 0) goto L_0x0128
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342160960611489470(0x208106fc000916be, double:4.063848839346029E-152)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x012a
            X.0sn r1 = X.0sn.A00
        L_0x0128:
            r3.A06 = r1
        L_0x012a:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317951398057665(0x8106fc000d16c1, double:3.0309569325593004E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x014d
            java.util.List r0 = r3.A06
            java.util.Iterator r1 = r0.iterator()
        L_0x013d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014d
            java.lang.Object r0 = r1.next()
            X.1Xj r0 = (X.1Xj) r0
            r0.A3x(r14)
            goto L_0x013d
        L_0x014d:
            r3.A03 = r9
            r3.A02 = r5
            r3.A01 = r8
            r1 = 0
            boolean r0 = X.AnonymousClass7TG.A1X(r11)
            r3.A08 = r0
            if (r12 == 0) goto L_0x0160
            boolean r1 = r12.booleanValue()
        L_0x0160:
            r3.A07 = r1
            if (r6 == 0) goto L_0x0166
            r3.A04 = r6
        L_0x0166:
            if (r7 == 0) goto L_0x016a
            r3.A01 = r7
        L_0x016a:
            boolean r0 = r13 instanceof X.1XU
            if (r0 == 0) goto L_0x0181
            r2 = r13
            X.1XU r2 = (X.1XU) r2
            if (r2 == 0) goto L_0x0181
            long r0 = r2.AjP()
            r3.EQG(r0)
            long r0 = r2.AjJ()
            r3.EQE(r0)
        L_0x0181:
            boolean r0 = r13 instanceof X.AnonymousClass3JC
            if (r0 == 0) goto L_0x01a5
            X.3JC r13 = (X.AnonymousClass3JC) r13
            if (r13 == 0) goto L_0x01a5
            com.facebook.pando.Summary r0 = r13.A00
            java.util.Map r1 = r0.trackedResponseHeaders
            if (r1 == 0) goto L_0x01a5
            java.lang.String r0 = "X-IG-Request-Elapsed-Time-MS"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x01a5
            java.lang.Long r0 = X.00y.A0n(r4, r0)
            if (r0 == 0) goto L_0x01a5
            long r0 = r0.longValue()
            r3.mServerElapsedTime = r0
        L_0x01a5:
            return r3
        L_0x01a6:
            java.lang.String r1 = "Unexpected Response type"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B6X.A00(X.3JD, com.instagram.common.session.UserSession):X.4mz");
    }
}
