package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.4nN  reason: invalid class name and case insensitive filesystem */
public abstract class C273904nN {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C273914nO parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.4nO r0 = new X.4nO     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            r0.<init>()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            goto L_0x00db
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r2 == r1) goto L_0x00dc
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            r4.A1J()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            java.lang.String r1 = "asset_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r1 == 0) goto L_0x003f
            java.lang.String r2 = r4.A1Q()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            java.util.Map r1 = X.C273924nP.A01     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            X.4nP r1 = (X.C273924nP) r1     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            r0.A01 = r1     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
        L_0x003b:
            r4.A0z()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            goto L_0x0016
        L_0x003f:
            java.lang.String r1 = "id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            r3 = 0
            if (r1 == 0) goto L_0x0057
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r2 == r1) goto L_0x0054
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
        L_0x0054:
            r0.A03 = r3     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            goto L_0x003b
        L_0x0057:
            java.lang.String r1 = "ids"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r1 == 0) goto L_0x0089
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r2 != r1) goto L_0x0086
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            r3.<init>()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
        L_0x006c:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r2 == r1) goto L_0x0086
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r2 == r1) goto L_0x006c
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r1 == 0) goto L_0x006c
            r3.add(r1)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            goto L_0x006c
        L_0x0086:
            r0.A06 = r3     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            goto L_0x003b
        L_0x0089:
            java.lang.String r1 = "story_sticker_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r1 == 0) goto L_0x00a0
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r2 == r1) goto L_0x009d
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
        L_0x009d:
            r0.A04 = r3     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            goto L_0x003b
        L_0x00a0:
            java.lang.String r1 = "story_sticker_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r1 == 0) goto L_0x00b7
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r2 == r1) goto L_0x00b4
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
        L_0x00b4:
            r0.A05 = r3     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            goto L_0x003b
        L_0x00b7:
            java.lang.String r1 = "selected_index"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r1 == 0) goto L_0x00c7
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            r0.A00 = r1     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            goto L_0x003b
        L_0x00c7:
            java.lang.String r1 = "is_outside_suggested_margins"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            if (r1 == 0) goto L_0x003b
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            r0.A02 = r1     // Catch:{ IOException -> 0x00e4, Exception -> 0x00dd }
            goto L_0x003b
        L_0x00db:
            r0 = 0
        L_0x00dc:
            return r0
        L_0x00dd:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00e4:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273904nN.parseFromJson(X.16F):X.4nO");
    }

    public static void A00(17Z r2, C273914nO r3) {
        r2.A0c();
        C273924nP r0 = r3.A01;
        if (r0 != null) {
            r2.A0R("asset_type", r0.A00);
        }
        String str = r3.A03;
        if (str != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        if (r3.A06 != null) {
            16P.A03(r2, "ids");
            for (String str2 : r3.A06) {
                if (str2 != null) {
                    r2.A0t(str2);
                }
            }
            r2.A0Y();
        }
        String str3 = r3.A04;
        if (str3 != null) {
            r2.A0R("story_sticker_id", str3);
        }
        String str4 = r3.A05;
        if (str4 != null) {
            r2.A0R("story_sticker_type", str4);
        }
        r2.A0P("selected_index", r3.A00);
        Boolean bool = r3.A02;
        if (bool != null) {
            r2.A0S("is_outside_suggested_margins", bool.booleanValue());
        }
        r2.A0Z();
    }
}
