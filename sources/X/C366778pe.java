package X;

/* renamed from: X.8pe  reason: invalid class name and case insensitive filesystem */
public final class C366778pe {
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C366768pd parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.8pd r0 = new X.8pd     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            r0.<init>()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r2 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            goto L_0x00cc
        L_0x0016:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r2 == r1) goto L_0x00cd
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            r5.A1J()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            java.lang.String r1 = "composer_config"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r1 == 0) goto L_0x0037
            X.8uN r1 = X.C369318uM.parseFromJson(r5)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            r0.A01 = r1     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
        L_0x0033:
            r5.A0z()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            goto L_0x0016
        L_0x0037:
            java.lang.String r1 = "static_stickers"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            r4 = 0
            if (r1 == 0) goto L_0x0065
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r2 != r1) goto L_0x005f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            r4.<init>()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
        L_0x004d:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r2 == r1) goto L_0x005f
            X.6nz r1 = X.C369248u6.parseFromJson(r5)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r1 == 0) goto L_0x004d
            r4.add(r1)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            goto L_0x004d
        L_0x005f:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            r0.A02 = r4     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            goto L_0x0033
        L_0x0065:
            java.lang.String r1 = "version"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r1 == 0) goto L_0x0071
            r5.A1D()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            goto L_0x0033
        L_0x0071:
            java.lang.String r1 = "layout_name"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r1 == 0) goto L_0x0089
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r2 == r1) goto L_0x0085
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
        L_0x0085:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            goto L_0x0033
        L_0x0089:
            java.lang.String r1 = "sticker_tray"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r1 == 0) goto L_0x00b7
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r2 != r1) goto L_0x00b0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            r4.<init>()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
        L_0x009e:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r2 == r1) goto L_0x00b0
            X.8u4 r1 = X.C369228u3.parseFromJson(r5)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r1 == 0) goto L_0x009e
            r4.add(r1)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            goto L_0x009e
        L_0x00b0:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            r0.A03 = r4     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            goto L_0x0033
        L_0x00b7:
            java.lang.String r1 = "stories_sticker_drop_info"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            if (r1 == 0) goto L_0x00c7
            X.8uP r1 = X.C393489wW.parseFromJson(r5)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            r0.A00 = r1     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            goto L_0x0033
        L_0x00c7:
            X.1XY.A01(r5, r0, r2)     // Catch:{ IOException -> 0x00d5, Exception -> 0x00ce }
            goto L_0x0033
        L_0x00cc:
            r0 = 0
        L_0x00cd:
            return r0
        L_0x00ce:
            r0 = move-exception
            X.1Pf r1 = new X.1Pf
            r1.<init>(r0)
            throw r1
        L_0x00d5:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366778pe.parseFromJson(X.16F):X.8pd");
    }
}
