package X;

/* renamed from: X.Ej9  reason: case insensitive filesystem */
public abstract class C48724Ej9 {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.EtM, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.EtM parseFromJson(X.16F r5) {
        /*
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.EtM r0 = new X.EtM     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            r0.<init>()     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            if (r2 == r1) goto L_0x0015
            r5.A0z()     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            goto L_0x0069
        L_0x0015:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            if (r2 == r1) goto L_0x006a
            java.lang.String r2 = X.AnonymousClass7TE.A17(r5)     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            java.lang.String r1 = "product_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            r3 = 0
            if (r1 == 0) goto L_0x003d
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            if (r2 == r1) goto L_0x0036
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
        L_0x0036:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
        L_0x0039:
            r5.A0z()     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            goto L_0x0015
        L_0x003d:
            java.lang.String r1 = "violations_data"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            if (r1 == 0) goto L_0x0039
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            if (r2 != r1) goto L_0x0063
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
        L_0x0051:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            if (r2 == r1) goto L_0x0063
            X.ExL r1 = X.C48725EjA.parseFromJson(r5)     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            if (r1 == 0) goto L_0x0051
            r3.add(r1)     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            goto L_0x0051
        L_0x0063:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            r0.A00 = r3     // Catch:{ IOException -> 0x0071, Exception -> 0x006b }
            goto L_0x0039
        L_0x0069:
            r0 = 0
        L_0x006a:
            return r0
        L_0x006b:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0071:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48724Ej9.parseFromJson(X.16F):X.EtM");
    }
}
