package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.4VO  reason: invalid class name */
public abstract class AnonymousClass4VO {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4VP parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.4VP r0 = new X.4VP     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            r0.<init>()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            if (r2 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            goto L_0x00a3
        L_0x0016:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            if (r2 == r1) goto L_0x00a4
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            r5.A1J()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            java.lang.String r1 = "name"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            r4 = 0
            if (r1 == 0) goto L_0x0043
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            if (r2 == r1) goto L_0x003a
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
        L_0x003a:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            r0.A02 = r4     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
        L_0x003f:
            r5.A0z()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            goto L_0x0016
        L_0x0043:
            java.lang.String r1 = "required"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            if (r1 == 0) goto L_0x0052
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            r0.A04 = r1     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            goto L_0x003f
        L_0x0052:
            java.lang.String r1 = "int_value"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            if (r1 == 0) goto L_0x006d
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            X.16L r1 = X.16L.A0I     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            if (r2 != r1) goto L_0x006a
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
        L_0x006a:
            r0.A01 = r4     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            goto L_0x003f
        L_0x006d:
            java.lang.String r1 = "bool_value"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            if (r1 == 0) goto L_0x008c
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            X.16L r1 = X.16L.A0K     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            if (r2 == r1) goto L_0x0081
            X.16L r1 = X.16L.A0F     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            if (r2 != r1) goto L_0x0089
        L_0x0081:
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
        L_0x0089:
            r0.A00 = r4     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            goto L_0x003f
        L_0x008c:
            java.lang.String r1 = "string_value"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            if (r1 == 0) goto L_0x003f
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            if (r2 == r1) goto L_0x00a0
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
        L_0x00a0:
            r0.A03 = r4     // Catch:{ IOException -> 0x00ac, Exception -> 0x00a5 }
            goto L_0x003f
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            return r0
        L_0x00a5:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VO.parseFromJson(X.16F):X.4VP");
    }

    public static void A00(17Z r2, AnonymousClass4VP r3) {
        r2.A0c();
        String str = r3.A02;
        if (str != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        r2.A0S("required", r3.A04);
        Integer num = r3.A01;
        if (num != null) {
            r2.A0P("int_value", num.intValue());
        }
        Boolean bool = r3.A00;
        if (bool != null) {
            r2.A0S("bool_value", bool.booleanValue());
        }
        String str2 = r3.A03;
        if (str2 != null) {
            r2.A0R("string_value", str2);
        }
        r2.A0Z();
    }
}
