package X;

/* renamed from: X.9BM  reason: invalid class name */
public abstract class AnonymousClass9BM {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, com.instagram.accountlinking.model.AccountFamily] */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.accountlinking.model.AccountFamily parseFromJson(X.16F r8) {
        /*
            r3 = 0
            X.0qQ.A0B(r8, r3)
            com.instagram.accountlinking.model.AccountFamily r1 = new com.instagram.accountlinking.model.AccountFamily     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            r1.<init>()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r2 == r0) goto L_0x0016
            r8.A0z()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            goto L_0x00d2
        L_0x0016:
            X.16L r2 = r8.A1J()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r2 == r0) goto L_0x00d3
            java.lang.String r2 = r8.A0q()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            r8.A1J()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            java.lang.String r0 = "user_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            r4 = 0
            if (r0 == 0) goto L_0x0040
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r2 == r0) goto L_0x003a
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
        L_0x003a:
            r1.A02 = r4     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
        L_0x003c:
            r8.A0z()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            goto L_0x0016
        L_0x0040:
            java.lang.String r0 = "type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x0068
            java.lang.String r7 = r8.A1Q()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            X.9BP[] r6 = X.AnonymousClass9BP.values()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            int r5 = r6.length     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            r4 = 0
        L_0x0052:
            if (r4 >= r5) goto L_0x0063
            r2 = r6[r4]     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            java.lang.String r0 = r2.name()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r0 != 0) goto L_0x0065
            int r4 = r4 + 1
            goto L_0x0052
        L_0x0063:
            X.9BP r2 = X.AnonymousClass9BP.UNKNOWN     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
        L_0x0065:
            r1.A00 = r2     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            goto L_0x003c
        L_0x0068:
            java.lang.String r0 = "account"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x0079
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            com.instagram.user.model.User r0 = X.1aC.A00(r8, r3)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            r1.A01 = r0     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            goto L_0x003c
        L_0x0079:
            java.lang.String r0 = "main_accounts"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x00a5
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r2 != r0) goto L_0x00a2
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            r4.<init>()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
        L_0x008e:
            X.16L r2 = r8.A1J()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r2 == r0) goto L_0x00a2
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            com.instagram.user.model.User r0 = X.1aC.A00(r8, r3)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x008e
            r4.add(r0)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            goto L_0x008e
        L_0x00a2:
            r1.A04 = r4     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            goto L_0x003c
        L_0x00a5:
            java.lang.String r0 = "child_accounts"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x003c
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r2 != r0) goto L_0x00ce
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            r4.<init>()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
        L_0x00ba:
            X.16L r2 = r8.A1J()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r2 == r0) goto L_0x00ce
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            com.instagram.user.model.User r0 = X.1aC.A00(r8, r3)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x00ba
            r4.add(r0)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            goto L_0x00ba
        L_0x00ce:
            r1.A03 = r4     // Catch:{ IOException -> 0x00db, Exception -> 0x00d4 }
            goto L_0x003c
        L_0x00d2:
            r1 = 0
        L_0x00d3:
            return r1
        L_0x00d4:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00db:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BM.parseFromJson(X.16F):com.instagram.accountlinking.model.AccountFamily");
    }
}
