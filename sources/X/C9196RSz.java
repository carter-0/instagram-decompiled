package X;

/* renamed from: X.RSz  reason: case insensitive filesystem */
public abstract class C9196RSz {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Boolean A00(X.C307896Rx r18, X.AnonymousClass6Tm r19) {
        /*
            r7 = 0
            r14 = r18
            X.6Rm r0 = r14.A03
            if (r0 == 0) goto L_0x01a2
            android.content.Context r13 = r0.A00
            r0 = r19
            java.lang.Object r6 = r0.A03(r7)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.0qQ.A0C(r6, r0)
            X.4tV r6 = (X.C276544tV) r6
            r1 = 16951(0x4237, float:2.3753E-41)
            int r0 = r6.A04
            r5 = 0
            if (r1 == r0) goto L_0x0026
            java.lang.String r1 = "BKBloksActionCaaPasskeyUsePasskeyImpl"
            java.lang.String r0 = "Invalid options"
            X.0KC.A0C(r1, r0)
            return r5
        L_0x0026:
            java.lang.String r0 = r6.A0G()
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "{}"
        L_0x002f:
            org.json.JSONObject r8 = X.C66580MXl.A17(r0)
            java.lang.String r4 = r6.A0I()
            if (r4 != 0) goto L_0x004c
            java.lang.String r1 = "rp"
            boolean r0 = r8.has(r1)
            if (r0 == 0) goto L_0x0085
            org.json.JSONObject r1 = r8.getJSONObject(r1)
            java.lang.String r0 = "id"
            java.lang.String r4 = r1.getString(r0)
        L_0x004c:
            r3 = 38
            if (r4 != 0) goto L_0x0070
            X.4uI r4 = r6.A0A(r3)
            java.lang.String r3 = "rpid"
        L_0x0057:
            java.lang.String r2 = "' parameter is missing"
            r1 = 39
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            r0.append(r1)
            java.lang.String r1 = X.Pxg.A0s(r3, r2, r0)
            if (r4 == 0) goto L_0x0087
            X.6Tm r0 = X.Pxj.A0a(r1)
            X.C299275ur.A00(r14, r0, r4)
            return r5
        L_0x0070:
            java.lang.String r2 = r6.A0F()
            if (r2 != 0) goto L_0x007c
            java.lang.String r0 = "challenge"
            java.lang.String r2 = r8.optString(r0)
        L_0x007c:
            if (r2 != 0) goto L_0x008d
            X.4uI r4 = r6.A0A(r3)
            java.lang.String r3 = "challenge"
            goto L_0x0057
        L_0x0085:
            r4 = 0
            goto L_0x004c
        L_0x0087:
            java.lang.String r0 = "PasskeyUtil"
            X.0KC.A0C(r0, r1)
            return r5
        L_0x008d:
            r0 = 43
            boolean r8 = r6.A0R(r0, r7)
            r0 = 45
            boolean r10 = r6.A0R(r0, r7)
            r0 = 50
            java.lang.String r0 = r6.A0K(r0)
            if (r0 == 0) goto L_0x00ab
            byte[] r1 = X.Pxg.A1X(r0)     // Catch:{ IllegalArgumentException -> 0x00ad }
            X.QOu r0 = new X.QOu     // Catch:{ IllegalArgumentException -> 0x00ad }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x00ad }
            goto L_0x00ae
        L_0x00ab:
            r1 = r5
            goto L_0x00b5
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            if (r0 == 0) goto L_0x00ab
            X.JwI r1 = new X.JwI
            r1.<init>((X.QOu) r0)
        L_0x00b5:
            X.QOu r0 = com.facebook.caa.shared.passkey.PasskeyService.A08
            r0 = 40
            X.4uI r15 = r6.A0A(r0)
            X.4uI r16 = r6.A0A(r3)
            r0 = 44
            X.4uI r17 = r6.A0A(r0)
            r0 = 48
            X.4uI r18 = r6.A0A(r0)
            java.lang.String r0 = "device_key_signature"
            X.0eP r9 = X.C66581MXm.A14(r0, r8)
            java.lang.String r8 = "prefer_immediately_available_credentials"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            java.util.LinkedHashMap r19 = X.DbY.A0p(r8, r0, r9)
            com.facebook.caa.shared.passkey.PasskeyService r12 = new com.facebook.caa.shared.passkey.PasskeyService
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0 = 49
            boolean r0 = r6.A0R(r0, r7)
            java.lang.String r2 = r12.A05(r13, r2, r5, r0)
            r0 = 35
            java.util.List r11 = r6.A0N(r0)
            X.0qQ.A07(r11)
            java.lang.String r7 = "allowCredentials"
            org.json.JSONObject r6 = X.DbS.A11()
            java.lang.String r0 = "challenge"
            org.json.JSONObject r8 = r6.put(r0, r2)
            java.lang.String r2 = "timeout"
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            org.json.JSONObject r8 = r8.put(r2, r0)
            java.lang.String r2 = "userVerification"
            java.lang.String r0 = "required"
            org.json.JSONObject r2 = r8.put(r2, r0)
            java.lang.String r0 = "rpId"
            r2.put(r0, r4)
            boolean r0 = X.AnonymousClass7TE.A1b(r11)
            if (r0 == 0) goto L_0x0165
            org.json.JSONArray r8 = X.Pxe.A1E()
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r11)
            java.util.Iterator r11 = r11.iterator()
        L_0x012e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0150
            java.lang.Object r4 = r11.next()
            org.json.JSONObject r2 = X.DbS.A11()
            java.lang.String r0 = "id"
            org.json.JSONObject r4 = r2.put(r0, r4)
            java.lang.String r2 = "type"
            java.lang.String r0 = "public-key"
            org.json.JSONObject r0 = r4.put(r2, r0)
            r9.add(r0)
            goto L_0x012e
        L_0x0150:
            java.util.Iterator r2 = r9.iterator()
        L_0x0154:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r0 = r2.next()
            r8.put(r0)
            goto L_0x0154
        L_0x0162:
            r6.put(r7, r8)
        L_0x0165:
            if (r1 == 0) goto L_0x0174
            java.lang.Object r0 = r1.A00
            X.QOu r0 = (X.QOu) r0
            byte[] r0 = r0.A00
            java.lang.String r0 = X.Pxg.A0z(r0)
            X.C9231RUi.A00(r0, r6)
        L_0x0174:
            java.lang.String r4 = X.DbT.A10(r6)
            X.0sl r2 = X.0sl.A00
            X.QAn r0 = new X.QAn
            r0.<init>(r4, r2)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.Rqc r4 = new X.Rqc
            r4.<init>(r0, r10)
            r2 = 1627928636(0x6108383c, float:1.5705058E20)
            r0 = 3
            X.19S r2 = X.AnonymousClass1HX.A01(r2, r0)
            X.0qQ.A07(r2)
            X.MHP r0 = new X.MHP
            r6 = r0
            r7 = r12
            r8 = r4
            r9 = r1
            r10 = r5
            r11 = r3
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (X.AnonymousClass4D7) r10, (int) r11)
            X.AnonymousClass7TE.A1Z(r0, r2)
            return r5
        L_0x01a2:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9196RSz.A00(X.6Rx, X.6Tm):java.lang.Boolean");
    }
}
