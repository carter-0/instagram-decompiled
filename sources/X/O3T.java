package X;

public abstract class O3T {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.OHf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C70710OHf parseFromJson(X.16F r7) {
        /*
            r3 = 0
            X.0qQ.A0B(r7, r3)
            X.OHf r2 = new X.OHf     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            r2.<init>()     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            X.16L r0 = r7.A11()     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            X.16L r4 = X.16L.A0D     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 == r4) goto L_0x0016
            r7.A0z()     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            goto L_0x00ca
        L_0x0016:
            X.16L r0 = r7.A1J()     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            X.16L r5 = X.16L.A09     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 == r5) goto L_0x00b8
            java.lang.String r6 = X.AnonymousClass7TE.A17(r7)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            java.lang.String r0 = "context"
            boolean r0 = r0.equals(r6)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            r1 = 0
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            r2.A04 = r0     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
        L_0x0031:
            r7.A0z()     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            goto L_0x0016
        L_0x0035:
            java.lang.String r0 = "enabled"
            boolean r0 = r0.equals(r6)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 == 0) goto L_0x0044
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r7)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            r2.A03 = r0     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            goto L_0x0031
        L_0x0044:
            java.lang.String r0 = "report_tags"
            boolean r0 = r0.equals(r6)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 == 0) goto L_0x006d
            X.16L r5 = r7.A11()     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r5 != r0) goto L_0x006a
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
        L_0x0058:
            X.16L r5 = r7.A1J()     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r5 == r0) goto L_0x006a
            X.OGY r0 = X.O3S.parseFromJson(r7)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 == 0) goto L_0x0058
            r1.add(r0)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            goto L_0x0058
        L_0x006a:
            r2.A06 = r1     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            goto L_0x0031
        L_0x006d:
            boolean r0 = X.C41845B3m.A1E(r6)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 == 0) goto L_0x007a
            X.OKa r0 = X.O3N.parseFromJson(r7)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            r2.A02 = r0     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            goto L_0x0031
        L_0x007a:
            java.lang.String r0 = "subtitle"
            boolean r0 = r0.equals(r6)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 == 0) goto L_0x0089
            X.OKa r0 = X.O3N.parseFromJson(r7)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            r2.A01 = r0     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            goto L_0x0031
        L_0x0089:
            java.lang.String r0 = "footer"
            boolean r0 = r0.equals(r6)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 == 0) goto L_0x0098
            X.OKa r0 = X.O3N.parseFromJson(r7)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            r2.A00 = r0     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            goto L_0x0031
        L_0x0098:
            java.lang.String r0 = "report_info"
            boolean r0 = r0.equals(r6)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 == 0) goto L_0x0031
            X.16L r0 = r7.A11()     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 != r4) goto L_0x00b4
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
        L_0x00aa:
            X.16L r0 = r7.A1J()     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 == r5) goto L_0x00b4
            X.C41847B3o.A1M(r7, r1)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            goto L_0x00aa
        L_0x00b4:
            r2.A05 = r1     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            goto L_0x0031
        L_0x00b8:
            java.lang.Boolean r0 = r2.A03     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            if (r0 != 0) goto L_0x00cb
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            r2.A03 = r0     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            java.lang.String r1 = "StartFRXReport Response"
            java.lang.String r0 = "'enabled' flag was null"
            X.0wb.A03(r1, r0)     // Catch:{ IOException -> 0x00d2, Exception -> 0x00cc }
            return r2
        L_0x00ca:
            r2 = 0
        L_0x00cb:
            return r2
        L_0x00cc:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x00d2:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O3T.parseFromJson(X.16F):X.OHf");
    }
}
