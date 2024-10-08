package X;

public final class Fl6 implements AnonymousClass08W {
    public static final Fl6 A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d2, code lost:
        r7.A01 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r12, X.AnonymousClass6Tm r13) {
        /*
            r0 = 0
            r4 = 1
            X.4tV r6 = X.DbY.A0P(r13, r0)
            java.util.List r2 = r13.A00
            java.lang.Object r3 = r2.get(r4)
            X.68u r3 = (X.C3034368u) r3
            int r1 = r2.size()
            r5 = 0
            r0 = 4
            if (r1 < r0) goto L_0x0027
            java.lang.String r10 = X.Dba.A0d(r2)
        L_0x001a:
            java.lang.String r0 = ""
            java.lang.String r2 = X.DbV.A10(r6, r0)
            boolean r0 = X.00l.A0W(r2)
            if (r0 == 0) goto L_0x0029
            return r5
        L_0x0027:
            r10 = r5
            goto L_0x001a
        L_0x0029:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r2)
            java.lang.String r0 = "headers"
            java.lang.String r6 = r1.getString(r0)
            java.lang.String r0 = "registration_response"
            java.lang.String r9 = r1.getString(r0)
            X.08y r2 = X.09i.A0A
            X.Fl6 r0 = A00
            X.0aP r11 = r2.A03(r0)
            X.0qQ.A0A(r6)
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ 1Aw -> 0x00d5 }
            r1.<init>()     // Catch:{ 1Aw -> 0x00d5 }
            X.R2k r0 = new X.R2k     // Catch:{ 1Aw -> 0x00d5 }
            r0.<init>()     // Catch:{ 1Aw -> 0x00d5 }
            java.lang.reflect.Type r0 = r0.type     // Catch:{ 1Aw -> 0x00d5 }
            java.lang.Object r8 = r1.A09(r6, r0)     // Catch:{ 1Aw -> 0x00d5 }
            X.0qQ.A07(r8)     // Catch:{ 1Aw -> 0x00d5 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ 1Aw -> 0x00d5 }
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()     // Catch:{ 1Aw -> 0x00d5 }
            java.util.Iterator r6 = X.AnonymousClass7TF.A0u(r8)     // Catch:{ 1Aw -> 0x00d5 }
        L_0x0062:
            boolean r0 = r6.hasNext()     // Catch:{ 1Aw -> 0x00d5 }
            if (r0 == 0) goto L_0x0085
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r6)     // Catch:{ 1Aw -> 0x00d5 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ 1Aw -> 0x00d5 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 1Aw -> 0x00d5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 1Aw -> 0x00d5 }
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ 1Aw -> 0x00d5 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ 1Aw -> 0x00d5 }
            X.0qQ.A07(r0)     // Catch:{ 1Aw -> 0x00d5 }
            r7.put(r1, r0)     // Catch:{ 1Aw -> 0x00d5 }
            goto L_0x0062
        L_0x0085:
            java.lang.String r6 = "https://i.instagram.com/api/v1/bloks/apps/com.bloks.www.bloks.caa.reg.tos.async/"
            X.1HV r1 = new X.1HV     // Catch:{ 1Aw -> 0x00d5 }
            r1.<init>(r11)     // Catch:{ 1Aw -> 0x00d5 }
            java.net.URI r0 = new java.net.URI     // Catch:{ 1Aw -> 0x00d5 }
            r0.<init>(r6)     // Catch:{ 1Aw -> 0x00d5 }
            r1.FJR(r0, r7)     // Catch:{ 1Aw -> 0x00d5 }
            X.1ND r7 = X.1ND.A00(r11)     // Catch:{ 1Aw -> 0x00d5 }
            X.0qQ.A07(r7)     // Catch:{ 1Aw -> 0x00d5 }
            java.util.Iterator r8 = X.AnonymousClass7TF.A0u(r8)     // Catch:{ 1Aw -> 0x00d5 }
        L_0x009f:
            boolean r0 = r8.hasNext()     // Catch:{ 1Aw -> 0x00d5 }
            if (r0 == 0) goto L_0x00cd
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r8)     // Catch:{ 1Aw -> 0x00d5 }
            java.lang.String r6 = X.DbT.A13(r0)     // Catch:{ 1Aw -> 0x00d5 }
            java.lang.String r1 = X.DbS.A0s(r0)     // Catch:{ 1Aw -> 0x00d5 }
            r0 = 1060(0x424, float:1.485E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ 1Aw -> 0x00d5 }
            if (r6 == 0) goto L_0x009f
            boolean r0 = r6.equalsIgnoreCase(r0)     // Catch:{ 1Aw -> 0x00d5 }
            if (r0 == 0) goto L_0x009f
            int r0 = r1.length()     // Catch:{ 1Aw -> 0x00d5 }
            if (r0 <= 0) goto L_0x00d0
            r7.A02(r1)     // Catch:{ 1Aw -> 0x00d5 }
            java.lang.String r0 = "contextChange3"
            r7.A00 = r0     // Catch:{ 1Aw -> 0x00d5 }
            goto L_0x00e8
        L_0x00cd:
            java.lang.String r0 = "contextChange3_missing"
            goto L_0x00d2
        L_0x00d0:
            java.lang.String r0 = "contextChange3_empty"
        L_0x00d2:
            r7.A01 = r0     // Catch:{ 1Aw -> 0x00d5 }
            goto L_0x00e8
        L_0x00d5:
            r6 = move-exception
            X.1ND r1 = X.1ND.A00(r11)
            X.0qQ.A07(r1)
            java.lang.String r0 = "contextChange3_exception"
            r1.A01 = r0
            java.lang.String r1 = "BKBloksActionCaaHandleLoginResponseForContextChangeImpl"
            java.lang.String r0 = "Exception parsing JSON"
            X.0KC.A0F(r1, r0, r6)
        L_0x00e8:
            X.16F r0 = X.16P.A00(r9)     // Catch:{ JSONException -> 0x0151 }
            X.DwQ r0 = X.F7K.parseFromJson(r0)     // Catch:{ JSONException -> 0x0151 }
            com.instagram.user.model.User r1 = r0.A01     // Catch:{ JSONException -> 0x0151 }
            X.0qQ.A07(r1)     // Catch:{ JSONException -> 0x0151 }
            if (r10 != 0) goto L_0x00fa
            X.EXD r13 = X.EXD.A05     // Catch:{ JSONException -> 0x0151 }
            goto L_0x00fe
        L_0x00fa:
            X.EXD r13 = X.C49204Er9.A00(r10)     // Catch:{ JSONException -> 0x0151 }
        L_0x00fe:
            if (r13 != 0) goto L_0x0102
            X.EXD r13 = X.EXD.A05     // Catch:{ JSONException -> 0x0151 }
        L_0x0102:
            r10 = r12
            androidx.fragment.app.Fragment r9 = X.DbU.A0H(r12)     // Catch:{ JSONException -> 0x0151 }
            com.instagram.registration.model.RegFlowExtras r12 = new com.instagram.registration.model.RegFlowExtras     // Catch:{ JSONException -> 0x0151 }
            r12.<init>()     // Catch:{ JSONException -> 0x0151 }
            X.EQ1 r8 = new X.EQ1     // Catch:{ JSONException -> 0x0151 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ JSONException -> 0x0151 }
            r8.A02(r0)     // Catch:{ JSONException -> 0x0151 }
            if (r3 == 0) goto L_0x0151
            X.6Rm r6 = r10.A03     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            X.0qQ.A0C(r6, r0)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r1.getId()     // Catch:{ JSONException -> 0x0151 }
            android.os.Bundle r1 = X.DbX.A0C(r0)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = "IS_SIGN_UP_FLOW"
            r1.putBoolean(r0, r4)     // Catch:{ JSONException -> 0x0151 }
            com.instagram.common.session.UserSession r2 = r2.A06(r1)     // Catch:{ JSONException -> 0x0151 }
            X.2nJ r0 = r6.A02     // Catch:{ JSONException -> 0x0151 }
            X.2nI r0 = (X.C229382nI) r0     // Catch:{ JSONException -> 0x0151 }
            androidx.fragment.app.Fragment r1 = r0.A02     // Catch:{ JSONException -> 0x0151 }
            r1.getClass()     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.fragment.IgDialogFragmentCompat"
            X.0qQ.A0C(r1, r0)     // Catch:{ JSONException -> 0x0151 }
            X.2nI r4 = X.C229382nI.A03(r1, r2, r5)     // Catch:{ JSONException -> 0x0151 }
            X.Di0 r3 = X.C46620Di0.A00(r3)     // Catch:{ JSONException -> 0x0151 }
            android.content.Context r2 = r6.A00     // Catch:{ JSONException -> 0x0151 }
            X.6Tm r1 = X.AnonymousClass6Tm.A01     // Catch:{ JSONException -> 0x0151 }
            X.0sm r0 = X.0Yt.A0E()     // Catch:{ JSONException -> 0x0151 }
            java.lang.Object r0 = X.C307886Rw.A02(r2, r3, r4, r1, r0)     // Catch:{ JSONException -> 0x0151 }
            return r0
        L_0x0151:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fl6.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
