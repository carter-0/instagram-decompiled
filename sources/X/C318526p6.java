package X;

/* renamed from: X.6p6  reason: invalid class name and case insensitive filesystem */
public final class C318526p6 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C318516p5 parseFromJson(X.16F r12) {
        /*
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.6p5 r2 = new X.6p5     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            r2.<init>()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            X.16L r1 = r12.A11()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r1 == r0) goto L_0x0016
            r12.A0z()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            r2 = 0
            return r2
        L_0x0016:
            X.16L r1 = r12.A1J()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r1 == r0) goto L_0x00ff
            java.lang.String r1 = r12.A0q()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            r12.A1J()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            java.lang.String r0 = "avatar_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            r3 = 0
            if (r0 == 0) goto L_0x0040
            X.16L r1 = r12.A11()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r1 == r0) goto L_0x003a
            java.lang.String r3 = r12.A1P()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
        L_0x003a:
            r2.A05 = r3     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
        L_0x003c:
            r12.A0z()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            goto L_0x0016
        L_0x0040:
            java.lang.String r0 = "avatar_revision_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r0 == 0) goto L_0x0057
            X.16L r1 = r12.A11()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r1 == r0) goto L_0x0054
            java.lang.String r3 = r12.A1P()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
        L_0x0054:
            r2.A06 = r3     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            goto L_0x003c
        L_0x0057:
            java.lang.String r0 = "avatar_sticker_profiles"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r0 == 0) goto L_0x0081
            X.16L r1 = r12.A11()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r1 != r0) goto L_0x007e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            r3.<init>()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
        L_0x006c:
            X.16L r1 = r12.A1J()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r1 == r0) goto L_0x007e
            X.6tC r0 = X.C320916tA.parseFromJson(r12)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r0 == 0) goto L_0x006c
            r3.add(r0)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            goto L_0x006c
        L_0x007e:
            r2.A09 = r3     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            goto L_0x003c
        L_0x0081:
            java.lang.String r0 = "avatar_style"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r0 == 0) goto L_0x0098
            X.16L r1 = r12.A11()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r1 == r0) goto L_0x0095
            java.lang.String r3 = r12.A1P()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
        L_0x0095:
            r2.A07 = r3     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            goto L_0x003c
        L_0x0098:
            java.lang.String r0 = "background_choice"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r0 == 0) goto L_0x00a7
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r0 = X.JVG.parseFromJson(r12)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            r2.A00 = r0     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            goto L_0x003c
        L_0x00a7:
            java.lang.String r0 = "coin_flip_enabled"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r12.A0d()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            r2.A02 = r0     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            goto L_0x003c
        L_0x00ba:
            java.lang.String r0 = "has_deprecated_pose"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r12.A0d()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            r2.A03 = r0     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            goto L_0x003c
        L_0x00ce:
            java.lang.String r0 = "is_coin_flip_tied_to_avatar"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r12.A0d()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            r2.A04 = r0     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            goto L_0x003c
        L_0x00e2:
            java.lang.String r0 = "sticker_pack_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r0 == 0) goto L_0x00fa
            X.16L r1 = r12.A11()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            if (r1 == r0) goto L_0x00f6
            java.lang.String r3 = r12.A1P()     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
        L_0x00f6:
            r2.A08 = r3     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            goto L_0x003c
        L_0x00fa:
            X.1XY.A01(r12, r2, r1)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            goto L_0x003c
        L_0x00ff:
            java.lang.String r8 = r2.A05     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            java.lang.String r9 = r2.A06     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            java.util.List r12 = r2.A09     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            X.0qQ.A0A(r12)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            java.lang.String r10 = r2.A07     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r4 = r2.A00     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            java.lang.Boolean r5 = r2.A02     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            java.lang.Boolean r6 = r2.A03     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            java.lang.Boolean r7 = r2.A04     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            java.lang.String r11 = r2.A08     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            X.6pC r3 = new X.6pC     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            r2.A01 = r3     // Catch:{ IOException -> 0x0123, Exception -> 0x011c }
            return r2
        L_0x011c:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0123:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C318526p6.parseFromJson(X.16F):X.6p5");
    }
}
