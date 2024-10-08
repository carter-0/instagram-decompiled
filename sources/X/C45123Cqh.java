package X;

/* renamed from: X.Cqh  reason: case insensitive filesystem */
public abstract class C45123Cqh {
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C230262pI parseFromJson(X.16F r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.2pI r1 = new X.2pI     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            r1.<init>()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            X.16L r0 = r8.A11()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            X.16L r3 = X.16L.A0D     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == r3) goto L_0x0016
            r8.A0z()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0139
        L_0x0016:
            X.16L r0 = r8.A1J()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            X.16L r5 = X.16L.A09     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == r5) goto L_0x013a
            java.lang.String r2 = X.AnonymousClass7TE.A17(r8)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            java.lang.String r0 = "request_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            r4 = 0
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            r1.A02 = r0     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
        L_0x0031:
            r8.A0z()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0016
        L_0x0035:
            r0 = 3936(0xf60, float:5.516E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == 0) goto L_0x006f
            X.16L r0 = r8.A11()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 != r3) goto L_0x006c
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
        L_0x004b:
            X.16L r0 = r8.A1J()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == r5) goto L_0x006b
            java.lang.String r6 = r8.A1P()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            X.16L r2 = X.C41845B3m.A0W(r8)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r2 != r0) goto L_0x0061
            r7.put(r6, r4)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x004b
        L_0x0061:
            X.6Ue r0 = X.C45708D2h.parseFromJson(r8)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == 0) goto L_0x004b
            r7.put(r6, r0)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x004b
        L_0x006b:
            r4 = r7
        L_0x006c:
            r1.A03 = r4     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0031
        L_0x006f:
            r0 = 4013(0xfad, float:5.623E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == 0) goto L_0x00a9
            X.16L r0 = r8.A11()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 != r3) goto L_0x00a6
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
        L_0x0085:
            X.16L r0 = r8.A1J()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == r5) goto L_0x00a5
            java.lang.String r6 = r8.A1P()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            X.16L r2 = X.C41845B3m.A0W(r8)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r2 != r0) goto L_0x009b
            r7.put(r6, r4)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0085
        L_0x009b:
            X.6Ue r0 = X.C45708D2h.parseFromJson(r8)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == 0) goto L_0x0085
            r7.put(r6, r0)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0085
        L_0x00a5:
            r4 = r7
        L_0x00a6:
            r1.A05 = r4     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0031
        L_0x00a9:
            r0 = 3937(0xf61, float:5.517E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == 0) goto L_0x00cd
            X.16L r0 = r8.A11()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 != r3) goto L_0x00c9
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
        L_0x00bf:
            X.16L r0 = r8.A1J()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == r5) goto L_0x00c9
            X.C41847B3o.A1M(r8, r4)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x00bf
        L_0x00c9:
            r1.A04 = r4     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0031
        L_0x00cd:
            r0 = 4014(0xfae, float:5.625E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == 0) goto L_0x00f1
            X.16L r0 = r8.A11()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 != r3) goto L_0x00ed
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
        L_0x00e3:
            X.16L r0 = r8.A1J()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == r5) goto L_0x00ed
            X.C41847B3o.A1M(r8, r4)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x00e3
        L_0x00ed:
            r1.A06 = r4     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0031
        L_0x00f1:
            r0 = 4791(0x12b7, float:6.714E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == 0) goto L_0x0119
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r2 != r0) goto L_0x0115
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
        L_0x0109:
            X.16L r2 = r8.A1J()     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r2 == r0) goto L_0x0115
            X.AnonymousClass7TG.A1F(r8, r4)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0109
        L_0x0115:
            r1.A07 = r4     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0031
        L_0x0119:
            java.lang.String r0 = "container_module"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == 0) goto L_0x0129
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            r1.A01 = r0     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0031
        L_0x0129:
            java.lang.String r0 = "notification_type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r8)     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            r1.A00 = r0     // Catch:{ IOException -> 0x0141, Exception -> 0x013b }
            goto L_0x0031
        L_0x0139:
            r1 = 0
        L_0x013a:
            return r1
        L_0x013b:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0141:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45123Cqh.parseFromJson(X.16F):X.2pI");
    }
}
