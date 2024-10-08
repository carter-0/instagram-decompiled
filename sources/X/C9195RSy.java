package X;

/* renamed from: X.RSy  reason: case insensitive filesystem */
public abstract class C9195RSy {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r2 == null) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Boolean A00(X.C307896Rx r22, X.AnonymousClass6Tm r23) {
        /*
            r1 = 0
            r21 = 1
            r8 = r22
            X.6Rm r0 = r8.A03
            if (r0 == 0) goto L_0x010f
            android.content.Context r7 = r0.A00
            r0 = r23
            java.lang.Object r15 = r0.A03(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.0qQ.A0C(r15, r0)
            X.4tV r15 = (X.C276544tV) r15
            r3 = 16950(0x4236, float:2.3752E-41)
            int r2 = r15.A04
            r0 = 0
            if (r3 == r2) goto L_0x0028
            java.lang.String r2 = "BKBloksActionCaaPasskeyCreatePasskeyImpl"
            java.lang.String r1 = "Invalid options"
            X.0KC.A0C(r2, r1)
        L_0x0027:
            return r0
        L_0x0028:
            r2 = 38
            X.4uI r9 = r15.A0A(r2)
            if (r9 == 0) goto L_0x0027
            X.4uI r10 = r15.A08()
            if (r10 == 0) goto L_0x0027
            r2 = 45
            X.4uI r11 = r15.A0A(r2)
            if (r11 == 0) goto L_0x0027
            java.lang.String r2 = r15.A0J()
            if (r2 != 0) goto L_0x0047
            java.lang.String r2 = "{}"
        L_0x0047:
            org.json.JSONObject r3 = X.C66580MXl.A17(r2)
            r2 = 50
            java.lang.String r2 = r15.A0K(r2)
            if (r2 == 0) goto L_0x005d
            byte[] r4 = X.Pxg.A1X(r2)     // Catch:{ IllegalArgumentException -> 0x0060 }
            X.QOu r2 = new X.QOu     // Catch:{ IllegalArgumentException -> 0x0060 }
            r2.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0060 }
            goto L_0x0061
        L_0x005d:
            X.QOu r2 = com.facebook.caa.shared.passkey.PasskeyService.A08
            goto L_0x0063
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r2 == 0) goto L_0x005d
        L_0x0063:
            r5 = 9
            X.JwI r14 = new X.JwI
            r14.<init>((X.QOu) r2)
            java.lang.String r17 = r15.A0E()
            if (r17 != 0) goto L_0x0083
            java.lang.String r4 = "rp"
            boolean r2 = r3.has(r4)
            if (r2 == 0) goto L_0x00b0
            org.json.JSONObject r4 = r3.getJSONObject(r4)
            java.lang.String r2 = "id"
            java.lang.String r17 = r4.getString(r2)
        L_0x0083:
            if (r17 != 0) goto L_0x009f
            java.lang.String r4 = "rpid"
        L_0x0088:
            java.lang.String r3 = "' parameter is missing"
            r2 = 39
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r1.append(r2)
            java.lang.String r1 = X.Pxg.A0s(r4, r3, r1)
            X.6Tm r1 = X.Pxj.A0a(r1)
            X.C299275ur.A00(r8, r1, r10)
            return r0
        L_0x009f:
            java.lang.String r20 = r15.A0D()
            if (r20 != 0) goto L_0x00ab
            java.lang.String r2 = "challenge"
            java.lang.String r20 = r3.optString(r2)
        L_0x00ab:
            if (r20 != 0) goto L_0x00b3
            java.lang.String r4 = "challenge"
            goto L_0x0088
        L_0x00b0:
            r17 = 0
            goto L_0x0083
        L_0x00b3:
            r2 = 44
            boolean r3 = r15.A0R(r2, r1)
            r2 = 49
            boolean r19 = r15.A0R(r2, r1)
            X.QOu r2 = com.facebook.caa.shared.passkey.PasskeyService.A08
            r2 = 48
            X.4uI r12 = r15.A0A(r2)
            java.lang.String r2 = "device_key_signature"
            X.0eP r4 = X.C66581MXm.A14(r2, r3)
            java.lang.String r3 = "prefer_immediately_available_credentials"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r19)
            java.util.LinkedHashMap r13 = X.DbY.A0p(r3, r2, r4)
            com.facebook.caa.shared.passkey.PasskeyService r6 = new com.facebook.caa.shared.passkey.PasskeyService
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.Pzd r13 = new X.Pzd
            r16 = r6
            r18 = r1
            r13.<init>((java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.String) r17, (int) r18, (boolean) r19)
            X.Pzd r2 = new X.Pzd
            r16 = r2
            r17 = r6
            r18 = r7
            r19 = r13
            r22 = r1
            r16.<init>((java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.String) r20, (int) r21, (boolean) r22)
            X.2Fg r1 = new X.2Fg
            r1.<init>(r7, r0)
            X.2Fj r4 = r1.A05
            r1 = 3
            X.Sdq r3 = new X.Sdq
            r3.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r4)
            X.19S r2 = X.AnonymousClass1HX.A00()
            X.JTi r1 = new X.JTi
            r1.<init>(r3, r4, r0, r5)
            X.AnonymousClass7TE.A1Z(r1, r2)
            return r0
        L_0x010f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9195RSy.A00(X.6Rx, X.6Tm):java.lang.Boolean");
    }
}
