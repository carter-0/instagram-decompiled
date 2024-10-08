package X;

/* renamed from: X.TFv  reason: case insensitive filesystem */
public final /* synthetic */ class C12962TFv implements Runnable {
    public final /* synthetic */ C10740RxJ A00;
    public final /* synthetic */ S1P A01;

    public /* synthetic */ C12962TFv(C10740RxJ rxJ, S1P s1p) {
        this.A00 = rxJ;
        this.A01 = s1p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x013d A[Catch:{ RKj -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0145 A[Catch:{ RKj -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014d A[Catch:{ RKj -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0155 A[Catch:{ RKj -> 0x0164 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            X.RxJ r6 = r14.A00
            X.S1P r3 = r14.A01
            X.SO5 r1 = r6.A01     // Catch:{ RKj -> 0x0164 }
            X.RRG r0 = r6.A02     // Catch:{ RKj -> 0x0164 }
            java.lang.String r9 = r0.A00()     // Catch:{ RKj -> 0x0164 }
            X.RxI r0 = r1.A02(r9)     // Catch:{ RKj -> 0x0164 }
            X.RyU r2 = r0.A03     // Catch:{ RKj -> 0x0164 }
            long r4 = r2.A01     // Catch:{ RKj -> 0x0164 }
            r0 = 0
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x015e
            android.content.Context r7 = r6.A00     // Catch:{ RKj -> 0x0164 }
            android.content.pm.PackageManager r8 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002c }
            if (r8 == 0) goto L_0x002c
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r7 = r8.getPackageInfo(r9, r7)     // Catch:{ NameNotFoundException -> 0x002c }
            if (r7 == 0) goto L_0x002c
            long r0 = r7.firstInstallTime     // Catch:{ RKj -> 0x0164 }
        L_0x002c:
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x015e
            org.json.JSONObject r7 = X.DbS.A11()     // Catch:{ JSONException -> 0x00b3 }
            long r0 = r2.A05     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r8 = "referrer_click_timestamp_seconds"
            r7.put(r8, r0)     // Catch:{ JSONException -> 0x00b3 }
            long r0 = r2.A02     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r8 = "install_begin_timestamp_seconds"
            r7.put(r8, r0)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "first_install_time"
            r7.put(r0, r4)     // Catch:{ JSONException -> 0x00b3 }
            int r1 = r2.A00     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "installed_version_code"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r1 = r2.A04     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "installed_version_name"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r1 = r2.A07     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "installation_method_type"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r1 = r2.A03     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "installation_uuid"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            X.SOK r5 = r2.A06     // Catch:{ JSONException -> 0x00b3 }
            org.json.JSONObject r4 = X.DbS.A11()     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r1 = r5.A05     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "utm_source"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r1 = r5.A04     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "utm_medium"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r1 = r5.A00     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "utm_campaign"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r1 = r5.A01     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "utm_content"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r1 = r5.A06     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "utm_term"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r1 = r5.A07     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "utm_id"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r1 = r5.A03     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "impression_id"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r1 = r5.A02     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "custom_data"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r0 = "utm"
            r7.put(r0, r4)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x00b3 }
            goto L_0x00e1
        L_0x00b3:
            r10 = move-exception
            r7 = 0
            X.T69 r0 = r3.A00     // Catch:{ RKj -> 0x0164 }
            X.0lg r9 = r0.A01     // Catch:{ RKj -> 0x0164 }
            java.lang.String r8 = r3.A01     // Catch:{ RKj -> 0x0164 }
            java.lang.String r5 = "InstallReferrerRegistrar_JSON_PARSING_FAILED"
            java.lang.String r4 = "raw referrer failed to parse"
            java.lang.String r1 = " : "
            java.lang.String r0 = r10.getMessage()     // Catch:{ RKj -> 0x0164 }
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = ""
        L_0x00ca:
            java.lang.String r0 = X.002.A11(r5, r1, r4, r1, r0)     // Catch:{ RKj -> 0x0164 }
            java.lang.String r4 = X.Pxg.A0o(r9)     // Catch:{ RKj -> 0x0164 }
            X.1Ln r1 = X.Pxh.A0N(r9, r0)     // Catch:{ RKj -> 0x0164 }
            if (r4 == 0) goto L_0x00de
            java.lang.String r0 = "pigeon_session_id"
            r1.A0R(r0, r4)     // Catch:{ RKj -> 0x0164 }
        L_0x00de:
            X.Pxh.A1A(r1, r8, r7)     // Catch:{ RKj -> 0x0164 }
        L_0x00e1:
            X.SOK r0 = r2.A06     // Catch:{ RKj -> 0x0164 }
            java.lang.String r10 = r0.A01     // Catch:{ RKj -> 0x0164 }
            java.lang.String r9 = r0.A00     // Catch:{ RKj -> 0x0164 }
            java.lang.String r8 = r0.A05     // Catch:{ RKj -> 0x0164 }
            java.lang.String r5 = r0.A04     // Catch:{ RKj -> 0x0164 }
            long r0 = r2.A02     // Catch:{ RKj -> 0x0164 }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ RKj -> 0x0164 }
            long r0 = r2.A05     // Catch:{ RKj -> 0x0164 }
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch:{ RKj -> 0x0164 }
            java.lang.String r2 = r3.A01     // Catch:{ RKj -> 0x0164 }
            X.T69 r0 = r3.A00     // Catch:{ RKj -> 0x0164 }
            X.0lg r0 = r0.A01     // Catch:{ RKj -> 0x0164 }
            java.lang.String r12 = X.Pxg.A0o(r0)     // Catch:{ RKj -> 0x0164 }
            X.0wc r13 = X.AnonymousClass0kN.A02(r0)     // Catch:{ RKj -> 0x0164 }
            java.lang.String r1 = "instagram_android_install_with_referrer"
            X.0kJ r0 = r13.A00     // Catch:{ RKj -> 0x0164 }
            X.0Aj r13 = r13.A00(r0, r1)     // Catch:{ RKj -> 0x0164 }
            r0 = 285(0x11d, float:4.0E-43)
            X.1Ln r1 = new X.1Ln     // Catch:{ RKj -> 0x0164 }
            r1.<init>(r13, r0)     // Catch:{ RKj -> 0x0164 }
            if (r9 == 0) goto L_0x011c
            java.lang.String r0 = "utm_campaign"
            r1.A0R(r0, r9)     // Catch:{ RKj -> 0x0164 }
        L_0x011c:
            r9 = 1
            if (r10 == 0) goto L_0x0122
            if (r8 == 0) goto L_0x0134
            goto L_0x0125
        L_0x0122:
            if (r8 == 0) goto L_0x013b
            goto L_0x012d
        L_0x0125:
            java.lang.String r0 = "ig_contact_invite"
            boolean r0 = r8.equals(r0)     // Catch:{ RKj -> 0x0164 }
            if (r0 != r9) goto L_0x0134
        L_0x012d:
            java.lang.String r0 = "utm_source"
            r1.A0R(r0, r8)     // Catch:{ RKj -> 0x0164 }
            goto L_0x013b
        L_0x0134:
            java.lang.String r0 = "utm_content"
            r1.A0R(r0, r10)     // Catch:{ RKj -> 0x0164 }
            goto L_0x0122
        L_0x013b:
            if (r5 == 0) goto L_0x0143
            java.lang.String r0 = "utm_medium"
            r1.A0R(r0, r5)     // Catch:{ RKj -> 0x0164 }
        L_0x0143:
            if (r12 == 0) goto L_0x014b
            java.lang.String r0 = "pigeon_session_id"
            r1.A0R(r0, r12)     // Catch:{ RKj -> 0x0164 }
        L_0x014b:
            if (r4 == 0) goto L_0x0153
            java.lang.String r0 = "referrer_click_timestamp_seconds"
            r1.A0Q(r0, r4)     // Catch:{ RKj -> 0x0164 }
        L_0x0153:
            if (r11 == 0) goto L_0x015a
            java.lang.String r0 = "install_begin_timestamp_seconds"
            r1.A0Q(r0, r11)     // Catch:{ RKj -> 0x0164 }
        L_0x015a:
            X.Pxh.A1A(r1, r2, r7)     // Catch:{ RKj -> 0x0164 }
            return
        L_0x015e:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u     // Catch:{ RKj -> 0x0164 }
            r3.A00(r0)     // Catch:{ RKj -> 0x0164 }
            return
        L_0x0164:
            r2 = move-exception
            X.Tfa r1 = r6.A03
            java.lang.String r0 = "OxygenInstallSDK_UNEXPECTED_STATE_EXCEPTION"
            r1.Ew3(r0, r2)
            X.RFF r0 = r2.A00
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0181
            r0 = 3
            if (r1 == r0) goto L_0x017e
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x017a:
            r3.A00(r0)
            return
        L_0x017e:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x017a
        L_0x0181:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12962TFv.run():void");
    }
}
