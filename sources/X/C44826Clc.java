package X;

/* renamed from: X.Clc  reason: case insensitive filesystem */
public abstract class C44826Clc {
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.CGB parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.CGB r1 = new X.CGB     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            r1.<init>()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r2 == r0) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x011c
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r2 == r0) goto L_0x011d
            java.lang.String r2 = X.AnonymousClass7TE.A17(r4)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            boolean r0 = X.C41845B3m.A1C(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            r3 = 0
            if (r0 == 0) goto L_0x003e
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r2 == r0) goto L_0x0035
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
        L_0x0035:
            java.util.Map r0 = X.C62572Ki5.A01     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            r0.get(r3)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
        L_0x003a:
            r4.A0z()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x0016
        L_0x003e:
            java.lang.String r0 = "item"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x004d
            X.1Xj r0 = X.1Xj.A00(r4)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            r1.A01 = r0     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x003a
        L_0x004d:
            java.lang.String r0 = "channel"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x005c
            X.K1d r0 = X.LJ4.parseFromJson(r4)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            r1.A02 = r0     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x003a
        L_0x005c:
            boolean r0 = X.C41845B3m.A1E(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x006b
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r2 != r0) goto L_0x00ca
            goto L_0x003a
        L_0x006b:
            boolean r0 = X.C41845B3m.A1Q(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x007a
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r2 != r0) goto L_0x00ca
            goto L_0x003a
        L_0x007a:
            java.lang.String r0 = "image_url"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x0089
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.16h.A00(r4)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            r1.A00 = r0     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x003a
        L_0x0089:
            java.lang.String r0 = "image_color"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x009a
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r2 != r0) goto L_0x00ca
            goto L_0x003a
        L_0x009a:
            java.lang.String r0 = "logging_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x00a9
            X.CEw r0 = X.C44828Cle.parseFromJson(r4)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            r1.A06 = r0     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x003a
        L_0x00a9:
            java.lang.String r0 = "layout_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x00b8
            X.CEv r0 = X.C44827Cld.parseFromJson(r4)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            r1.A05 = r0     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x003a
        L_0x00b8:
            java.lang.String r0 = "recommendation_reason"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x00cf
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r2 != r0) goto L_0x00ca
            goto L_0x003a
        L_0x00ca:
            r4.A1P()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x003a
        L_0x00cf:
            java.lang.String r0 = "users"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x00f3
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r2 != r0) goto L_0x00ef
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
        L_0x00e3:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r2 == r0) goto L_0x00ef
            X.C41846B3n.A1E(r4, r3)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x00e3
        L_0x00ef:
            r1.A07 = r3     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x003a
        L_0x00f3:
            r0 = 2820(0xb04, float:3.952E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x0107
            X.Cu4 r0 = X.C44825Clb.parseFromJson(r4)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            r1.A04 = r0     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x003a
        L_0x0107:
            java.lang.String r0 = "upsell"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            if (r0 == 0) goto L_0x0117
            X.Csp r0 = X.C44824Cla.parseFromJson(r4)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            r1.A03 = r0     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x003a
        L_0x0117:
            X.1XY.A01(r4, r1, r2)     // Catch:{ IOException -> 0x0124, Exception -> 0x011e }
            goto L_0x003a
        L_0x011c:
            r1 = 0
        L_0x011d:
            return r1
        L_0x011e:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0124:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44826Clc.parseFromJson(X.16F):X.CGB");
    }
}
