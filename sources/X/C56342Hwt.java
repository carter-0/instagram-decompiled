package X;

/* renamed from: X.Hwt  reason: case insensitive filesystem */
public final class C56342Hwt {
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.HE8 parseFromJson(X.16F r9) {
        /*
            r8 = 0
            X.0qQ.A0B(r9, r8)
            X.HE8 r1 = new X.HE8     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            r1.<init>()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            X.16L r0 = r9.A11()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            X.16L r7 = X.16L.A0D     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r0 == r7) goto L_0x0016
            r9.A0z()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            goto L_0x00b0
        L_0x0016:
            X.16L r0 = r9.A1J()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            X.16L r6 = X.16L.A09     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r0 == r6) goto L_0x00b1
            java.lang.String r2 = X.AnonymousClass7TE.A17(r9)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            java.lang.String r0 = "has_related_media"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0034
            boolean r0 = r9.A0d()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            r1.A03 = r0     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
        L_0x0030:
            r9.A0z()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            goto L_0x0016
        L_0x0034:
            java.lang.String r0 = "items"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            r5 = 0
            if (r0 == 0) goto L_0x005e
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r2 != r0) goto L_0x005b
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
        L_0x0049:
            X.16L r2 = r9.A1J()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r2 == r0) goto L_0x005b
            X.Hj6 r0 = X.C52768GcL.parseFromJson(r9)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0049
            r5.add(r0)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            goto L_0x0049
        L_0x005b:
            r1.A01 = r5     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            goto L_0x0030
        L_0x005e:
            r0 = 44
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0071
            boolean r0 = r9.A0d()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            r1.A02 = r0     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            goto L_0x0030
        L_0x0071:
            java.lang.String r0 = "media_contributors"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x00ac
            X.16L r0 = r9.A11()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r0 != r7) goto L_0x00a9
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
        L_0x0083:
            X.16L r0 = r9.A1J()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r0 == r6) goto L_0x00a8
            java.lang.String r3 = r9.A1P()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            r9.A1J()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r2 != r0) goto L_0x009c
            r4.put(r3, r5)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            goto L_0x0083
        L_0x009c:
            com.instagram.common.typedurl.SimpleImageUrl r0 = com.instagram.user.model.User.A08     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            com.instagram.user.model.User r0 = X.1aC.A00(r9, r8)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0083
            r4.put(r3, r0)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            goto L_0x0083
        L_0x00a8:
            r5 = r4
        L_0x00a9:
            r1.A00 = r5     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            goto L_0x0030
        L_0x00ac:
            X.C55111HcK.A00(r9, r1, r2)     // Catch:{ IOException -> 0x00b8, Exception -> 0x00b2 }
            goto L_0x0030
        L_0x00b0:
            r1 = 0
        L_0x00b1:
            return r1
        L_0x00b2:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x00b8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56342Hwt.parseFromJson(X.16F):X.HE8");
    }
}
