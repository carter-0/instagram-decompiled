package X;

/* renamed from: X.Cpp  reason: case insensitive filesystem */
public abstract class C45072Cpp {
    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.BB9 parseFromJson(X.16F r8) {
        /*
            r6 = 0
            X.0qQ.A0B(r8, r6)
            X.BB9 r1 = new X.BB9     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            r1.<init>()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r2 == r0) goto L_0x0015
            r8.A0z()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            goto L_0x0093
        L_0x0015:
            X.16L r2 = r8.A1J()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r2 == r0) goto L_0x0094
            java.lang.String r2 = X.AnonymousClass7TE.A17(r8)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            java.lang.String r0 = "merchant"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            r3 = 1
            if (r0 == 0) goto L_0x0037
            com.instagram.user.model.User r0 = X.C41845B3m.A0a(r8, r6)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.0qQ.A0B(r0, r6)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            r1.A00 = r0     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
        L_0x0033:
            r8.A0z()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            goto L_0x0015
        L_0x0037:
            r0 = 346(0x15a, float:4.85E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            r7 = 0
            if (r0 == 0) goto L_0x005f
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r2 != r0) goto L_0x005c
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
        L_0x0050:
            X.16L r2 = r8.A1J()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r2 == r0) goto L_0x005c
            X.AnonymousClass7TG.A1F(r8, r7)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            goto L_0x0050
        L_0x005c:
            r1.A02 = r7     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            goto L_0x0033
        L_0x005f:
            r0 = 941(0x3ad, float:1.319E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r0 == 0) goto L_0x0033
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r2 == r0) goto L_0x0077
            java.lang.String r7 = r8.A1P()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
        L_0x0077:
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r3)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            int r4 = r5.length     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            r3 = 0
        L_0x007d:
            if (r3 >= r4) goto L_0x008c
            r2 = r5[r3]     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            java.lang.String r0 = "storefront_relevance_sorted"
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r0 != 0) goto L_0x008d
            int r3 = r3 + 1
            goto L_0x007d
        L_0x008c:
            r2 = 0
        L_0x008d:
            X.0qQ.A0B(r2, r6)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            r1.A01 = r2     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            goto L_0x0033
        L_0x0093:
            r1 = 0
        L_0x0094:
            return r1
        L_0x0095:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x009b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45072Cpp.parseFromJson(X.16F):X.BB9");
    }
}
