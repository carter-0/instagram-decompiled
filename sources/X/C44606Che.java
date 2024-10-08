package X;

/* renamed from: X.Che  reason: case insensitive filesystem */
public abstract class C44606Che {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.CsH] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C45206CsH parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.CsH r1 = new X.CsH     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            r1.<init>()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r2 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            goto L_0x00b2
        L_0x0016:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r2 == r0) goto L_0x00b3
            java.lang.String r2 = X.AnonymousClass7TE.A17(r5)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            boolean r0 = X.C41845B3m.A1E(r2)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            r4 = 0
            if (r0 == 0) goto L_0x003c
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r2 == r0) goto L_0x0035
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
        L_0x0035:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
        L_0x0038:
            r5.A0z()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            goto L_0x0016
        L_0x003c:
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x0051
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r2 == r0) goto L_0x0035
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            goto L_0x0035
        L_0x0051:
            boolean r0 = X.C41845B3m.A1C(r2)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x0064
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r2 == r0) goto L_0x0035
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            goto L_0x0035
        L_0x0064:
            r0 = 1074(0x432, float:1.505E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x007d
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r2 == r0) goto L_0x0035
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            goto L_0x0035
        L_0x007d:
            java.lang.String r0 = "admined_pages"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x00a6
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r2 != r0) goto L_0x00a3
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
        L_0x0091:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r2 == r0) goto L_0x00a3
            X.BBT r0 = X.CUP.parseFromJson(r5)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x0091
            r4.add(r0)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            goto L_0x0091
        L_0x00a3:
            r1.A00 = r4     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            goto L_0x0038
        L_0x00a6:
            java.lang.String r0 = "payment_method_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x0038
            X.C41846B3n.A1A(r5)     // Catch:{ IOException -> 0x00ba, Exception -> 0x00b4 }
            goto L_0x0038
        L_0x00b2:
            r1 = 0
        L_0x00b3:
            return r1
        L_0x00b4:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x00ba:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44606Che.parseFromJson(X.16F):X.CsH");
    }
}
