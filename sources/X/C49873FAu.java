package X;

/* renamed from: X.FAu  reason: case insensitive filesystem */
public final class C49873FAu {
    public static final C49873FAu A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: X.6qu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0417 A[Catch:{ JSONException -> 0x041f }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x026a A[Catch:{ JSONException -> 0x041f }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x029b A[Catch:{ JSONException -> 0x041f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C307896Rx r40, X.AnonymousClass6Tm r41) {
        /*
            r39 = this;
            java.lang.String r26 = "credential_type"
            r11 = 0
            r6 = 1
            r7 = r41
            X.4tV r3 = X.DbY.A0P(r7, r11)
            java.lang.String r1 = ""
            java.lang.String r8 = X.DbV.A10(r3, r1)
            r0 = 41
            boolean r25 = r3.A0R(r0, r11)
            r38 = r40
            X.0lg r9 = X.C308206Td.A0B(r38)
            r0 = 36
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r9, r0)
            X.0aP r9 = (X.AnonymousClass0aP) r9
            X.02m r5 = X.02m.A0p
            X.0qQ.A07(r5)
            boolean r0 = X.00l.A0W(r8)
            r24 = 0
            r23 = 3
            r4 = 2293785(0x230019, float:3.214277E-39)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "success_response_empty"
            r5.markerAnnotate(r4, r0, r6)
            r0 = r23
            r5.markerEnd(r4, r0)
        L_0x0043:
            return r24
        L_0x0044:
            r2 = r1
            java.lang.String r0 = r3.A0F()
            if (r0 == 0) goto L_0x004c
            r2 = r0
        L_0x004c:
            java.util.Map r0 = X.EWC.A01
            java.lang.Object r10 = r0.get(r2)
            X.EWC r10 = (X.EWC) r10
            if (r10 != 0) goto L_0x0058
            X.EWC r10 = X.EWC.UNKNOWN
        L_0x0058:
            r2 = r1
            java.lang.String r0 = r3.A0H()
            if (r0 == 0) goto L_0x0060
            r2 = r0
        L_0x0060:
            java.util.Map r0 = X.EWB.A01
            java.lang.Object r3 = r0.get(r2)
            X.EWB r3 = (X.EWB) r3
            if (r3 != 0) goto L_0x006c
            X.EWB r3 = X.EWB.UNKNOWN
        L_0x006c:
            X.4uI r22 = X.DbX.A0S(r7, r6)
            X.6qu r21 = new X.6qu
            r21.<init>()
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x041f }
            r7.<init>(r8)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "headers"
            java.lang.String r2 = r7.getString(r0)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "login_response"
            java.lang.String r20 = r7.getString(r0)     // Catch:{ JSONException -> 0x041f }
            X.16F r0 = X.16P.A00(r20)     // Catch:{ JSONException -> 0x041f }
            X.EM4 r8 = X.FCB.parseFromJson(r0)     // Catch:{ JSONException -> 0x041f }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x041f }
            r7.<init>(r2)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "IG-Set-Authorization"
            java.lang.String r19 = r7.getString(r0)     // Catch:{ JSONException -> 0x041f }
            androidx.fragment.app.FragmentActivity r7 = X.C308206Td.A04(r38)     // Catch:{ JSONException -> 0x041f }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x041f }
            r0 = r20
            r12.<init>(r0)     // Catch:{ JSONException -> 0x041f }
            r0 = r26
            java.lang.String r18 = r12.optString(r0)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "auto_login_sso"
            boolean r17 = r12.optBoolean(r0)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "is_lisa_sso_login"
            boolean r16 = r12.optBoolean(r0)     // Catch:{ JSONException -> 0x041f }
            X.0qQ.A0A(r2)     // Catch:{ JSONException -> 0x041f }
            com.google.gson.Gson r12 = new com.google.gson.Gson     // Catch:{ 1Aw -> 0x0181 }
            r12.<init>()     // Catch:{ 1Aw -> 0x0181 }
            X.R2j r0 = new X.R2j     // Catch:{ 1Aw -> 0x0181 }
            r0.<init>()     // Catch:{ 1Aw -> 0x0181 }
            java.lang.reflect.Type r0 = r0.type     // Catch:{ 1Aw -> 0x0181 }
            java.lang.Object r14 = r12.A09(r2, r0)     // Catch:{ 1Aw -> 0x0181 }
            X.0qQ.A07(r14)     // Catch:{ 1Aw -> 0x0181 }
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ 1Aw -> 0x0181 }
            java.util.HashMap r15 = X.AnonymousClass7TE.A1E()     // Catch:{ 1Aw -> 0x0181 }
            java.util.Iterator r13 = X.AnonymousClass7TF.A0u(r14)     // Catch:{ 1Aw -> 0x0181 }
        L_0x00d6:
            boolean r0 = r13.hasNext()     // Catch:{ 1Aw -> 0x0181 }
            if (r0 == 0) goto L_0x00f0
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r13)     // Catch:{ 1Aw -> 0x0181 }
            java.lang.Object r12 = r0.getKey()     // Catch:{ 1Aw -> 0x0181 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 1Aw -> 0x0181 }
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)     // Catch:{ 1Aw -> 0x0181 }
            r15.put(r12, r0)     // Catch:{ 1Aw -> 0x0181 }
            goto L_0x00d6
        L_0x00f0:
            java.lang.String r0 = "https://i.instagram.com/api/v1/bloks/apps/com.bloks.www.bloks.caa.login.async.send_login_request/"
            X.1HV r13 = new X.1HV     // Catch:{ 1Aw -> 0x0181 }
            r13.<init>(r9)     // Catch:{ 1Aw -> 0x0181 }
            java.net.URI r12 = new java.net.URI     // Catch:{ 1Aw -> 0x0181 }
            r12.<init>(r0)     // Catch:{ 1Aw -> 0x0181 }
            r13.FJR(r12, r15)     // Catch:{ 1Aw -> 0x0181 }
            X.1ND r12 = X.1ND.A00(r9)     // Catch:{ 1Aw -> 0x0181 }
            X.0qQ.A07(r12)     // Catch:{ 1Aw -> 0x0181 }
            java.util.Iterator r15 = X.AnonymousClass7TF.A0u(r14)     // Catch:{ 1Aw -> 0x0181 }
        L_0x010a:
            boolean r0 = r15.hasNext()     // Catch:{ 1Aw -> 0x0181 }
            if (r0 == 0) goto L_0x0138
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r15)     // Catch:{ 1Aw -> 0x0181 }
            java.lang.String r14 = X.DbT.A13(r0)     // Catch:{ 1Aw -> 0x0181 }
            java.lang.String r13 = X.DbS.A0s(r0)     // Catch:{ 1Aw -> 0x0181 }
            r0 = 1060(0x424, float:1.485E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ 1Aw -> 0x0181 }
            if (r14 == 0) goto L_0x010a
            boolean r0 = r14.equalsIgnoreCase(r0)     // Catch:{ 1Aw -> 0x0181 }
            if (r0 == 0) goto L_0x010a
            int r0 = r13.length()     // Catch:{ 1Aw -> 0x0181 }
            if (r0 <= 0) goto L_0x013b
            r12.A02(r13)     // Catch:{ 1Aw -> 0x0181 }
            java.lang.String r0 = "handleLogin3"
            r12.A00 = r0     // Catch:{ 1Aw -> 0x0181 }
            goto L_0x013f
        L_0x0138:
            java.lang.String r0 = "handleLogin3_missing"
            goto L_0x013d
        L_0x013b:
            java.lang.String r0 = "handleLogin3_empty"
        L_0x013d:
            r12.A01 = r0     // Catch:{ 1Aw -> 0x0181 }
        L_0x013f:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0178 }
            r12.<init>(r2)     // Catch:{ JSONException -> 0x0178 }
            java.lang.String r0 = "IG-Set-Password-Encryption-Pub-Key"
            java.lang.String r13 = r12.getString(r0)     // Catch:{ JSONException -> 0x0178 }
            X.0qQ.A07(r13)     // Catch:{ JSONException -> 0x0178 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0178 }
            r12.<init>(r2)     // Catch:{ JSONException -> 0x0178 }
            java.lang.String r0 = "IG-Set-Password-Encryption-Key-Id"
            java.lang.String r12 = r12.getString(r0)     // Catch:{ JSONException -> 0x0178 }
            X.0qQ.A07(r12)     // Catch:{ JSONException -> 0x0178 }
            int r0 = r13.length()     // Catch:{ JSONException -> 0x0178 }
            if (r0 == 0) goto L_0x0194
            int r0 = r12.length()     // Catch:{ JSONException -> 0x0178 }
            if (r0 == 0) goto L_0x0194
            X.5jf r2 = X.C292875jf.A01     // Catch:{ JSONException -> 0x0178 }
            if (r2 != 0) goto L_0x0174
            android.content.Context r0 = X.C60960kU.A00     // Catch:{ JSONException -> 0x0178 }
            X.5jf r2 = new X.5jf     // Catch:{ JSONException -> 0x0178 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0178 }
            X.C292875jf.A01 = r2     // Catch:{ JSONException -> 0x0178 }
        L_0x0174:
            r2.A01(r13, r12)     // Catch:{ JSONException -> 0x0178 }
            goto L_0x0194
        L_0x0178:
            r12 = move-exception
            java.lang.String r2 = "BKBloksActionCaaHandleLoginResponseImpl"
            java.lang.String r0 = "Exception parsing JSON"
            X.0KC.A0F(r2, r0, r12)     // Catch:{ 1Aw -> 0x0181 }
            goto L_0x0194
        L_0x0181:
            r12 = move-exception
            X.1ND r2 = X.1ND.A00(r9)     // Catch:{ JSONException -> 0x041f }
            X.0qQ.A07(r2)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "handleLogin3_exception"
            r2.A01 = r0     // Catch:{ JSONException -> 0x041f }
            java.lang.String r2 = "BKBloksActionCaaHandleLoginResponseImpl"
            java.lang.String r0 = "Exception parsing JSON"
            X.0KC.A0F(r2, r0, r12)     // Catch:{ JSONException -> 0x041f }
        L_0x0194:
            X.0tS r2 = X.DbT.A0h()     // Catch:{ JSONException -> 0x041f }
            java.util.Set r12 = r2.A09()     // Catch:{ JSONException -> 0x041f }
            com.instagram.user.model.User r0 = r8.A00     // Catch:{ JSONException -> 0x041f }
            boolean r0 = X.DbV.A1a(r0, r12)     // Catch:{ JSONException -> 0x041f }
            if (r0 == 0) goto L_0x01b5
            java.util.Set r12 = r2.A09()     // Catch:{ JSONException -> 0x041f }
            com.instagram.user.model.User r0 = r8.A00     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = r0.getId()     // Catch:{ JSONException -> 0x041f }
            java.util.Set r0 = X.094.A03(r0, r12)     // Catch:{ JSONException -> 0x041f }
            r2.A0H(r0)     // Catch:{ JSONException -> 0x041f }
        L_0x01b5:
            if (r17 == 0) goto L_0x020f
            X.0xm r12 = X.DbS.A0e()     // Catch:{ JSONException -> 0x041f }
            java.lang.String r13 = "fb_sso_login"
            X.0qQ.A0A(r18)     // Catch:{ JSONException -> 0x041f }
            java.util.Locale r14 = java.util.Locale.ROOT     // Catch:{ JSONException -> 0x041f }
            r0 = r18
            boolean r0 = X.Dbb.A1b(r0, r13, r14)     // Catch:{ JSONException -> 0x041f }
            if (r0 == 0) goto L_0x0220
            X.0xa r13 = r12.A00     // Catch:{ JSONException -> 0x041f }
            X.0xY r14 = r13.AR4()     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "auth_login_should_show_snackbar_fb"
            r14.E5T(r0, r6)     // Catch:{ JSONException -> 0x041f }
            r14.apply()     // Catch:{ JSONException -> 0x041f }
            java.lang.String r14 = "auto_login_launched_url"
            r15 = r1
            java.lang.String r0 = r13.getString(r14, r1)     // Catch:{ JSONException -> 0x041f }
            if (r0 == 0) goto L_0x01e2
            r15 = r0
        L_0x01e2:
            int r0 = r15.length()     // Catch:{ JSONException -> 0x041f }
            if (r0 == 0) goto L_0x023d
            X.0qQ.A0B(r1, r11)     // Catch:{ JSONException -> 0x041f }
            X.0xY r0 = r13.AR4()     // Catch:{ JSONException -> 0x041f }
            r0.E5g(r14, r1)     // Catch:{ JSONException -> 0x041f }
            r0.apply()     // Catch:{ JSONException -> 0x041f }
            android.net.Uri r0 = X.DbT.A09(r15)     // Catch:{ JSONException -> 0x041f }
            java.util.Set r1 = r0.getQueryParameterNames()     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "xapp_session_id"
            boolean r0 = r1.contains(r0)     // Catch:{ JSONException -> 0x041f }
            if (r0 == 0) goto L_0x023d
            X.0xY r1 = r13.AR4()     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "auth_login_should_show_snackbar_fb_switcher"
            r1.E5T(r0, r6)     // Catch:{ JSONException -> 0x041f }
            goto L_0x023a
        L_0x020f:
            if (r16 == 0) goto L_0x0258
            X.0xa r0 = X.DbV.A0d()     // Catch:{ JSONException -> 0x041f }
            X.0xY r1 = r0.AR4()     // Catch:{ JSONException -> 0x041f }
            r0 = 3764(0xeb4, float:5.274E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ JSONException -> 0x041f }
            goto L_0x0252
        L_0x0220:
            java.lang.String r13 = "msgr_sso_login"
            r0 = r18
            java.lang.String r1 = r0.toLowerCase(r14)     // Catch:{ JSONException -> 0x041f }
            X.0qQ.A07(r1)     // Catch:{ JSONException -> 0x041f }
            boolean r0 = r13.equals(r1)     // Catch:{ JSONException -> 0x041f }
            if (r0 == 0) goto L_0x026b
            X.0xY r1 = X.DbS.A0d(r12)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "auth_login_should_show_snackbar_msgr"
            r1.E5T(r0, r6)     // Catch:{ JSONException -> 0x041f }
        L_0x023a:
            r1.apply()     // Catch:{ JSONException -> 0x041f }
        L_0x023d:
            long r0 = X.AnonymousClass7TG.A0I()     // Catch:{ JSONException -> 0x041f }
            X.0xa r14 = r12.A00     // Catch:{ JSONException -> 0x041f }
            X.0xY r13 = r14.AR4()     // Catch:{ JSONException -> 0x041f }
            java.lang.String r12 = "last_auto_login_time"
            r13.E5c(r12, r0)     // Catch:{ JSONException -> 0x041f }
            X.0xY r1 = X.DbU.A0e(r13, r14)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "auto_login_success_before"
        L_0x0252:
            r1.E5T(r0, r6)     // Catch:{ JSONException -> 0x041f }
            r1.apply()     // Catch:{ JSONException -> 0x041f }
        L_0x0258:
            X.0qQ.A0A(r18)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r18)     // Catch:{ JSONException -> 0x041f }
            r0 = r26
            r5.markerAnnotate(r4, r0, r1)     // Catch:{ JSONException -> 0x041f }
            int r1 = r10.ordinal()     // Catch:{ JSONException -> 0x041f }
            if (r1 == r11) goto L_0x029b
            goto L_0x0292
        L_0x026b:
            java.lang.String r0 = "fblite_sso_login"
            X.0qQ.A07(r1)     // Catch:{ JSONException -> 0x041f }
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x041f }
            if (r0 == 0) goto L_0x0280
            X.0xY r1 = X.DbS.A0d(r12)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "auth_login_should_show_snackbar_fblite"
            r1.E5T(r0, r6)     // Catch:{ JSONException -> 0x041f }
            goto L_0x023a
        L_0x0280:
            java.lang.String r0 = "local_auth_login"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x041f }
            if (r0 == 0) goto L_0x023d
            X.0xY r1 = X.DbS.A0d(r12)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "auth_login_should_show_snackbar_local_auth"
            r1.E5T(r0, r6)     // Catch:{ JSONException -> 0x041f }
            goto L_0x023a
        L_0x0292:
            if (r1 == r6) goto L_0x02e0
            r0 = 2
            if (r1 == r0) goto L_0x02e0
            r0 = 4
            if (r1 != r0) goto L_0x02e0
            goto L_0x02cc
        L_0x029b:
            X.0qQ.A0B(r9, r11)     // Catch:{ JSONException -> 0x041f }
            boolean r0 = X.C46629Di9.A00(r9)     // Catch:{ JSONException -> 0x041f }
            if (r0 != 0) goto L_0x02bf
            boolean r0 = X.C46629Di9.A01(r9)     // Catch:{ JSONException -> 0x041f }
            if (r0 == 0) goto L_0x02bf
        L_0x02aa:
            X.0qQ.A0A(r19)     // Catch:{ JSONException -> 0x041f }
            X.EMD r10 = new X.EMD     // Catch:{ JSONException -> 0x041f }
            r7 = r21
            r1 = r38
            r0 = r19
            r10.<init>(r7, r1, r9, r0)     // Catch:{ JSONException -> 0x041f }
            r10.A04(r8)     // Catch:{ JSONException -> 0x041f }
        L_0x02bb:
            X.EWB r0 = X.EWB.REGISTRATION     // Catch:{ JSONException -> 0x041f }
            goto L_0x03fb
        L_0x02bf:
            boolean r0 = X.C46629Di9.A00(r9)     // Catch:{ JSONException -> 0x041f }
            if (r0 != 0) goto L_0x02e0
            boolean r0 = X.C46629Di9.A01(r9)     // Catch:{ JSONException -> 0x041f }
            if (r0 != 0) goto L_0x02e0
            goto L_0x02aa
        L_0x02cc:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x041f }
            r0 = r20
            r1.<init>(r0)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "fb_access_token"
            boolean r0 = r1.has(r0)     // Catch:{ JSONException -> 0x041f }
            if (r0 != 0) goto L_0x0310
            java.lang.String r0 = "fb_access_token_missing"
            r5.markerAnnotate(r4, r0, r6)     // Catch:{ JSONException -> 0x041f }
        L_0x02e0:
            X.0qQ.A0A(r19)     // Catch:{ JSONException -> 0x041f }
            androidx.fragment.app.FragmentActivity r26 = X.C308206Td.A04(r38)     // Catch:{ JSONException -> 0x041f }
            X.DiE r32 = X.C46634DiE.A0z     // Catch:{ JSONException -> 0x041f }
            X.0iw r28 = X.C308206Td.A08(r38)     // Catch:{ JSONException -> 0x041f }
            java.lang.Integer r33 = X.AnonymousClass05K.A0j     // Catch:{ JSONException -> 0x041f }
            androidx.fragment.app.FragmentActivity r0 = X.C308206Td.A04(r38)     // Catch:{ JSONException -> 0x041f }
            android.net.Uri r27 = X.C46413Dea.A00(r0)     // Catch:{ JSONException -> 0x041f }
            X.EDe r0 = new X.EDe     // Catch:{ JSONException -> 0x041f }
            r29 = r9
            r30 = r24
            r31 = r24
            r34 = r19
            r35 = r24
            r36 = r24
            r37 = r10
            r25 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ JSONException -> 0x041f }
            r0.A04(r8)     // Catch:{ JSONException -> 0x041f }
            goto L_0x02bb
        L_0x0310:
            java.lang.String r10 = "fb_user_id"
            java.lang.String r16 = r1.getString(r10)     // Catch:{ JSONException -> 0x041f }
            X.0qQ.A07(r16)     // Catch:{ JSONException -> 0x041f }
            X.6Rm r0 = X.C308206Td.A09(r38)     // Catch:{ JSONException -> 0x041f }
            android.content.Context r1 = r0.A00     // Catch:{ JSONException -> 0x041f }
            com.instagram.user.model.User r0 = r8.A00     // Catch:{ JSONException -> 0x041f }
            r17 = r0
            X.0qQ.A07(r17)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = r8.A07     // Catch:{ JSONException -> 0x041f }
            java.lang.String r13 = "aymh"
            X.0xG r27 = X.DbS.A0O(r13)     // Catch:{ JSONException -> 0x041f }
            r26 = r1
            r28 = r9
            r29 = r17
            r30 = r0
            r31 = r11
            com.instagram.common.session.UserSession r8 = X.C46413Dea.A02(r26, r27, r28, r29, r30, r31)     // Catch:{ JSONException -> 0x041f }
            X.0qQ.A0A(r8)     // Catch:{ JSONException -> 0x041f }
            X.27y r9 = X.27u.A00(r8)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r1 = "BKBloksActionCaaHandleLoginResponseImpl"
            com.facebook.common.callercontext.CallerContext.A01(r1)     // Catch:{ JSONException -> 0x041f }
            r0 = r24
            r9.A00(r0)     // Catch:{ JSONException -> 0x041f }
            X.2Ly r12 = X.2Lv.A00(r8)     // Catch:{ JSONException -> 0x041f }
            com.facebook.common.callercontext.CallerContext r9 = com.facebook.common.callercontext.CallerContext.A01(r1)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r1 = "ig_login_util"
            r12.A02(r9, r0, r1)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r1 = r17.getUsername()     // Catch:{ JSONException -> 0x041f }
            com.instagram.common.typedurl.ImageUrl r0 = r17.Bh3()     // Catch:{ JSONException -> 0x041f }
            X.FGv.A03(r0, r1)     // Catch:{ JSONException -> 0x041f }
            X.0Tu r9 = X.0Tu.A05     // Catch:{ JSONException -> 0x041f }
            r0 = 36327649433434703(0x810fce00013a4f, double:3.037090009182593E-306)
            boolean r0 = X.182.A06(r9, r8, r0)     // Catch:{ JSONException -> 0x041f }
            if (r0 == 0) goto L_0x0381
            java.lang.String r1 = "Credential type - "
            r0 = r18
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ JSONException -> 0x041f }
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r6)     // Catch:{ JSONException -> 0x041f }
            r0.show()     // Catch:{ JSONException -> 0x041f }
        L_0x0381:
            if (r25 == 0) goto L_0x03e0
            X.0xG r15 = X.DbS.A0O(r13)     // Catch:{ JSONException -> 0x041f }
            android.net.Uri r14 = X.C46413Dea.A00(r7)     // Catch:{ JSONException -> 0x041f }
            if (r14 == 0) goto L_0x0399
            android.net.Uri$Builder r9 = r14.buildUpon()     // Catch:{ JSONException -> 0x041f }
            java.lang.String r1 = "fresh_sign_in"
            java.lang.String r0 = "1"
            android.net.Uri r14 = X.DbV.A08(r9, r1, r0)     // Catch:{ JSONException -> 0x041f }
        L_0x0399:
            java.lang.String r12 = X.DbU.A0p(r17)     // Catch:{ JSONException -> 0x041f }
            X.0qQ.A07(r12)     // Catch:{ JSONException -> 0x041f }
            X.0qQ.A0B(r7, r6)     // Catch:{ JSONException -> 0x041f }
            X.FFt r0 = X.C49940FFt.A00()     // Catch:{ JSONException -> 0x041f }
            X.DfZ r1 = r0.A03()     // Catch:{ JSONException -> 0x041f }
            X.F1e r0 = new X.F1e     // Catch:{ JSONException -> 0x041f }
            r0.<init>(r8)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r13 = "com.bloks.www.caa.login.login_with_fb_nux"
            com.instagram.bloks.hosting.IgBloksScreenConfig r9 = r0.A00     // Catch:{ JSONException -> 0x041f }
            r9.A0R = r13     // Catch:{ JSONException -> 0x041f }
            X.E7h r8 = new X.E7h     // Catch:{ JSONException -> 0x041f }
            r8.<init>(r11, r7, r14, r15)     // Catch:{ JSONException -> 0x041f }
            r9.A03 = r8     // Catch:{ JSONException -> 0x041f }
            r0.A00(r1)     // Catch:{ JSONException -> 0x041f }
            r0 = r16
            java.util.HashMap r8 = X.Dba.A0f(r10, r0)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r1 = r3.A00     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "login_source"
            r8.put(r0, r1)     // Catch:{ JSONException -> 0x041f }
            java.lang.String r0 = "ig_profile_pic"
            r8.put(r0, r12)     // Catch:{ JSONException -> 0x041f }
            X.DiU r1 = X.C46649DiU.A04(r13, r8)     // Catch:{ JSONException -> 0x041f }
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            r1.A00 = r0     // Catch:{ JSONException -> 0x041f }
            r1.A0F(r7, r9)     // Catch:{ JSONException -> 0x041f }
            goto L_0x02bb
        L_0x03e0:
            X.0xG r10 = X.DbS.A0O(r13)     // Catch:{ JSONException -> 0x041f }
            android.net.Uri r0 = X.C46413Dea.A00(r7)     // Catch:{ JSONException -> 0x041f }
            if (r0 == 0) goto L_0x03f6
            android.net.Uri$Builder r9 = r0.buildUpon()     // Catch:{ JSONException -> 0x041f }
            java.lang.String r1 = "fresh_sign_in"
            java.lang.String r0 = "1"
            android.net.Uri r0 = X.DbV.A08(r9, r1, r0)     // Catch:{ JSONException -> 0x041f }
        L_0x03f6:
            X.C46413Dea.A04(r7, r0, r10, r8)     // Catch:{ JSONException -> 0x041f }
            goto L_0x02bb
        L_0x03fb:
            boolean r8 = X.AnonymousClass7TF.A1W(r3, r0)
            X.0s0 r1 = r2.A0E     // Catch:{ JSONException -> 0x041f }
            X.0YZ[] r7 = X.0tS.A4G     // Catch:{ JSONException -> 0x041f }
            r0 = 233(0xe9, float:3.27E-43)
            X.AnonymousClass7TF.A1J(r2, r1, r7, r0, r8)     // Catch:{ JSONException -> 0x041f }
            X.EWB r0 = X.EWB.ACCOUNT_RECOVERY     // Catch:{ JSONException -> 0x041f }
            boolean r3 = X.AnonymousClass7TF.A1W(r3, r0)
            X.0s0 r1 = r2.A0D     // Catch:{ JSONException -> 0x041f }
            r0 = 234(0xea, float:3.28E-43)
            X.AnonymousClass7TF.A1J(r2, r1, r7, r0, r3)     // Catch:{ JSONException -> 0x041f }
            if (r22 == 0) goto L_0x0043
            r1 = r22
            r0 = r38
            X.DbS.A1Q(r0, r1)     // Catch:{ JSONException -> 0x041f }
            return r24
        L_0x041f:
            java.lang.String r0 = "json_parse_exception"
            r5.markerAnnotate(r4, r0, r6)
            r0 = r23
            r5.markerEnd(r4, r0)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49873FAu.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
