package X;

public final class OQI {
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.NHO parseFromJson(X.16F r6) {
        /*
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.NHO r0 = new X.NHO     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            r0.<init>()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            X.16L r4 = X.16L.A0D     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            if (r1 == r4) goto L_0x0016
            r6.A0z()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            goto L_0x0099
        L_0x0016:
            X.16L r1 = r6.A1J()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            X.16L r3 = X.16L.A09     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            if (r1 == r3) goto L_0x009a
            java.lang.String r5 = X.AnonymousClass7TE.A17(r6)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            java.lang.String r1 = "total_participant_requests"
            boolean r1 = r1.equals(r5)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            if (r1 == 0) goto L_0x0034
            int r1 = r6.A1D()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            r0.A00 = r1     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
        L_0x0030:
            r6.A0z()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            goto L_0x0016
        L_0x0034:
            java.lang.String r1 = "total_thread_participants"
            boolean r1 = r1.equals(r5)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            if (r1 == 0) goto L_0x0043
            int r1 = r6.A1D()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            r0.A01 = r1     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            goto L_0x0030
        L_0x0043:
            java.lang.String r1 = "cursor"
            boolean r1 = r1.equals(r5)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            r2 = 0
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r6)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            r0.A02 = r1     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            goto L_0x0030
        L_0x0053:
            java.lang.String r1 = "users"
            boolean r1 = r1.equals(r5)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            if (r1 == 0) goto L_0x0076
            X.16L r3 = r6.A11()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            if (r3 != r1) goto L_0x0073
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
        L_0x0067:
            X.16L r3 = r6.A1J()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            if (r3 == r1) goto L_0x0073
            X.C41846B3n.A1E(r6, r2)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            goto L_0x0067
        L_0x0073:
            r0.A04 = r2     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            goto L_0x0030
        L_0x0076:
            java.lang.String r1 = "requester_usernames"
            boolean r1 = r1.equals(r5)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            if (r1 == 0) goto L_0x0095
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            if (r1 != r4) goto L_0x0092
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
        L_0x0088:
            X.16L r1 = r6.A1J()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            if (r1 == r3) goto L_0x0092
            X.C41847B3o.A1M(r6, r2)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            goto L_0x0088
        L_0x0092:
            r0.A03 = r2     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            goto L_0x0030
        L_0x0095:
            X.1XY.A01(r6, r0, r5)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009b }
            goto L_0x0030
        L_0x0099:
            r0 = 0
        L_0x009a:
            return r0
        L_0x009b:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x00a1:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OQI.parseFromJson(X.16F):X.NHO");
    }
}
