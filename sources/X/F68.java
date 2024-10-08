package X;

public final class F68 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.FA8} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.EM5 parseFromJson(X.16F r9) {
        /*
            r3 = 0
            X.0qQ.A0B(r9, r3)
            X.EM5 r0 = new X.EM5     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.<init>()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            X.16L r2 = X.16L.A0D     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == r2) goto L_0x0016
            r9.A0z()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x01ef
        L_0x0016:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            X.16L r7 = X.16L.A09     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == r7) goto L_0x01f0
            java.lang.String r4 = X.AnonymousClass7TE.A17(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            java.lang.String r1 = "code"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x0034
            int r1 = r9.A1D()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A00 = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
        L_0x0030:
            r9.A0z()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0016
        L_0x0034:
            boolean r1 = X.C41845B3m.A1B(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 != 0) goto L_0x01e7
            java.lang.String r1 = "logged_in_user"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 != 0) goto L_0x01e7
            java.lang.String r1 = "created_user"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 != 0) goto L_0x01e7
            java.lang.String r1 = "token"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r5 = 0
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A0C = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x005a:
            java.lang.String r1 = "dryrun_passed"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x0069
            boolean r1 = r9.A0d()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A0G = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x0069:
            java.lang.String r1 = "username_suggestions"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x008c
            X.16L r4 = r9.A11()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r4 != r1) goto L_0x0089
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
        L_0x007d:
            X.16L r4 = r9.A1J()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r4 == r1) goto L_0x0089
            X.AnonymousClass7TG.A1F(r9, r5)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x007d
        L_0x0089:
            r0.A0E = r5     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x008c:
            java.lang.String r1 = "username_suggestions_with_metadata"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x009b
            X.F2H r1 = X.C49111Epa.parseFromJson(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A04 = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x009b:
            java.lang.String r1 = "buttons"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x00c5
            X.16L r4 = r9.A11()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r4 != r1) goto L_0x00c1
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
        L_0x00af:
            X.16L r4 = r9.A1J()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r4 == r1) goto L_0x00c1
            X.Ez0 r1 = X.C48969En7.parseFromJson(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x00af
            r5.add(r1)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x00af
        L_0x00c1:
            r0.A0F = r5     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x00c5:
            java.lang.String r1 = "fb_access_token"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x00d5
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A07 = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x00d5:
            java.lang.String r1 = "new_account_nux"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x00e5
            X.Eu9 r1 = X.C48967En5.parseFromJson(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A02 = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x00e5:
            java.lang.String r1 = "errors"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x0160
            X.16L r4 = r9.A11()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r4 != r2) goto L_0x0147
            java.lang.StringBuilder r8 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
        L_0x00fb:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == r7) goto L_0x014f
            int r1 = r8.length()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 <= 0) goto L_0x010c
            r1 = 44
            r8.append(r1)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
        L_0x010c:
            java.lang.String r1 = r9.A0q()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r8.append(r1)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r9.A1J()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
        L_0x0116:
            X.16L r4 = r9.A1J()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r4 == r1) goto L_0x00fb
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r5 = 10
            if (r1 != r2) goto L_0x0139
            X.Eu8 r4 = X.C48964En2.parseFromJson(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            int r1 = r6.length()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 <= 0) goto L_0x0133
            r6.append(r5)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
        L_0x0133:
            java.lang.String r1 = r4.A00     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
        L_0x0135:
            r6.append(r1)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0116
        L_0x0139:
            int r1 = r6.length()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 <= 0) goto L_0x0142
            r6.append(r5)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
        L_0x0142:
            java.lang.String r1 = r9.A1P()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0135
        L_0x0147:
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r4 != r1) goto L_0x015c
            r9.A0z()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x015c
        L_0x014f:
            java.lang.String r4 = r8.toString()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            java.lang.String r1 = r6.toString()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            X.FA8 r5 = new X.FA8     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r5.<init>(r4, r1)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
        L_0x015c:
            r0.A01 = r5     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x0160:
            java.lang.String r1 = "force_qe_sync"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x0170
            boolean r1 = r9.A0d()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A0H = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x0170:
            java.lang.String r1 = "tos_version"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x0180
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A0B = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x0180:
            java.lang.String r1 = "mac_login_nonce"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x0190
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A0A = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x0190:
            java.lang.String r1 = X.DcV.A01()     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x01a2
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A0D = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x01a2:
            java.lang.String r1 = "content"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x01b2
            com.instagram.nux.cal.model.SignupContent r1 = X.C49034EoE.parseFromJson(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A03 = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x01b2:
            java.lang.String r1 = "help_url"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x01c2
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A08 = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x01c2:
            java.lang.String r1 = "help_url_text"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x01d2
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A09 = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x01d2:
            java.lang.String r1 = "bolded_text"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x01e2
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A06 = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x01e2:
            X.F6K.A00(r9, r0, r4)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x01e7:
            com.instagram.user.model.User r1 = X.C41845B3m.A0a(r9, r3)     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            r0.A05 = r1     // Catch:{ IOException -> 0x01f7, Exception -> 0x01f1 }
            goto L_0x0030
        L_0x01ef:
            r0 = 0
        L_0x01f0:
            return r0
        L_0x01f1:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x01f7:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F68.parseFromJson(X.16F):X.EM5");
    }
}
