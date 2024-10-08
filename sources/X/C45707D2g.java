package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.D2g  reason: case insensitive filesystem */
public abstract class C45707D2g {
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C45320CuO parseFromJson(X.16F r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.CuO r1 = new X.CuO     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            r1.<init>()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            X.16L r0 = r8.A11()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            X.16L r5 = X.16L.A0D     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            if (r0 == r5) goto L_0x0015
            r8.A0z()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            goto L_0x0082
        L_0x0015:
            X.16L r0 = r8.A1J()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            X.16L r7 = X.16L.A09     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            if (r0 == r7) goto L_0x0083
            java.lang.String r2 = X.AnonymousClass7TE.A17(r8)     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            r3 = 0
            if (r0 == 0) goto L_0x005c
            X.16L r0 = r8.A11()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            if (r0 != r5) goto L_0x0059
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
        L_0x0038:
            X.16L r0 = r8.A1J()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            if (r0 == r7) goto L_0x0058
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            X.16L r2 = X.C41845B3m.A0W(r8)     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            if (r2 != r0) goto L_0x004e
            r6.put(r4, r3)     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            goto L_0x0038
        L_0x004e:
            X.CtF r0 = X.C45112CqU.parseFromJson(r8)     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            if (r0 == 0) goto L_0x0038
            r6.put(r4, r0)     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            goto L_0x0038
        L_0x0058:
            r3 = r6
        L_0x0059:
            r1.A00 = r3     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            goto L_0x007e
        L_0x005c:
            java.lang.String r0 = "grid_impressions"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            if (r0 == 0) goto L_0x007e
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            if (r2 != r0) goto L_0x007c
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
        L_0x0070:
            X.16L r2 = r8.A1J()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            if (r2 == r0) goto L_0x007c
            X.AnonymousClass7TG.A1F(r8, r3)     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            goto L_0x0070
        L_0x007c:
            r1.A01 = r3     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
        L_0x007e:
            r8.A0z()     // Catch:{ IOException -> 0x008a, Exception -> 0x0084 }
            goto L_0x0015
        L_0x0082:
            r1 = 0
        L_0x0083:
            return r1
        L_0x0084:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x008a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45707D2g.parseFromJson(X.16F):X.CuO");
    }

    public static void A00(17Z r3, C45320CuO cuO) {
        r3.A0c();
        if (cuO.A00 != null) {
            r3.A0q(C273654mx.A00(160));
            r3.A0c();
            Iterator A0s = AnonymousClass7TF.A0s(cuO.A00);
            while (A0s.hasNext()) {
                Map.Entry entry = (Map.Entry) A0s.next();
                if (!16P.A04(r3, entry)) {
                    r3.A0c();
                    r3.A0P(AnonymousClass000.A00(1929), ((C45252CtF) entry.getValue()).A00);
                    r3.A0Z();
                }
            }
            r3.A0Z();
        }
        if (cuO.A01 != null) {
            16P.A03(r3, "grid_impressions");
            Iterator it = cuO.A01.iterator();
            while (it.hasNext()) {
                C41846B3n.A18(r3, it);
            }
            r3.A0Y();
        }
        r3.A0Z();
    }
}
