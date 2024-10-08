package X;

public final class LJ4 {
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C61292K1d parseFromJson(X.16F r9) {
        /*
            r5 = 0
            X.0qQ.A0B(r9, r5)
            X.K1d r4 = new X.K1d     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r4.<init>()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.16L r0 = r9.A11()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.16L r3 = X.16L.A0D     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == r3) goto L_0x0016
            r9.A0z()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x01dd
        L_0x0016:
            X.16L r0 = r9.A1J()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.16L r8 = X.16L.A09     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == r8) goto L_0x0163
            java.lang.String r1 = X.AnonymousClass7TE.A17(r9)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r7 = 0
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r4.A03 = r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
        L_0x0031:
            r9.A0z()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0016
        L_0x0035:
            java.lang.String r0 = "type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x0053
            java.lang.String r1 = r9.A1Q()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.0qQ.A0B(r1, r5)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.util.Map r0 = X.C62573Ki6.A01     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.Ki6 r0 = (X.C62573Ki6) r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 != 0) goto L_0x0050
            X.Ki6 r0 = X.C62573Ki6.UNRECOGNIZED     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
        L_0x0050:
            r4.A00 = r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x0053:
            java.lang.String r0 = "title"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r4.A08 = r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x0062:
            java.lang.String r0 = "description"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r4.A05 = r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x0071:
            java.lang.String r0 = "items"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x0094
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r1 != r0) goto L_0x0091
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
        L_0x0085:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r1 == r0) goto L_0x0091
            X.C41846B3n.A1D(r9, r7)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0085
        L_0x0091:
            r4.A0A = r7     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x0094:
            java.lang.String r0 = "live_items"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x00be
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r1 != r0) goto L_0x00ba
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
        L_0x00a8:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r1 == r0) goto L_0x00ba
            X.4gL r0 = X.C45893D9w.parseFromJson(r9)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x00a8
            r7.add(r0)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x00a8
        L_0x00ba:
            r4.A0B = r7     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x00be:
            java.lang.String r0 = "max_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r4.A06 = r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x00ce:
            java.lang.String r0 = "more_available"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x00de
            boolean r0 = r9.A0d()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r4.A0D = r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x00de:
            java.lang.String r0 = "encoded_paging_token"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r4.A04 = r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x00ee:
            java.lang.String r0 = "user_dict"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x0100
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            com.instagram.user.model.User r0 = X.1aC.A00(r9, r5)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r4.A02 = r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x0100:
            r0 = 3938(0xf62, float:5.518E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x013e
            X.16L r0 = r9.A11()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 != r3) goto L_0x013a
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
        L_0x0116:
            X.16L r0 = r9.A1J()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == r8) goto L_0x0139
            java.lang.String r2 = r9.A1P()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r9.A1J()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r1 != r0) goto L_0x012f
            r6.put(r2, r7)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0116
        L_0x012f:
            X.Koc r0 = X.C63295Kue.parseFromJson(r9)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x0116
            r6.put(r2, r0)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0116
        L_0x0139:
            r7 = r6
        L_0x013a:
            r4.A09 = r7     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x013e:
            java.lang.String r0 = "has_post_live_on_profile"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x014e
            boolean r0 = r9.A0d()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r4.A0C = r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x014e:
            java.lang.String r0 = "destination_client_configs"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x015e
            X.K0z r0 = X.C63294Kud.parseFromJson(r9)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r4.A01 = r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x015e:
            X.1XY.A01(r9, r4, r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0031
        L_0x0163:
            java.util.List r0 = r4.A0A     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
        L_0x0169:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x01a4
            X.1Xj r2 = X.C51966G9m.A0t(r3)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            boolean r0 = X.C61292K1d.A00(r2)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 != 0) goto L_0x017d
            r3.remove()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0169
        L_0x017d:
            java.util.Map r1 = r4.A0F     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.lang.String r0 = r2.getId()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r1.put(r0, r2)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.util.HashMap r1 = r4.A09     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.lang.String r0 = r2.A30()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.Koc r0 = (X.C62924Koc) r0     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x0169
            java.lang.String r2 = r2.A30()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            int r0 = r0.A00     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.util.Map r1 = X.C63531Kyg.A00     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r1.put(r2, r0)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x0169
        L_0x01a4:
            java.util.List r0 = r4.A0B     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x01de
            java.util.Iterator r3 = r0.iterator()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
        L_0x01ac:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 == 0) goto L_0x01de
            java.lang.Object r2 = r3.next()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            X.4gL r2 = (X.C270194gL) r2     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            com.instagram.common.typedurl.ImageUrl r0 = r2.A02()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            if (r0 != 0) goto L_0x01d2
            java.lang.String r1 = "id: "
            java.lang.String r0 = r2.A0X     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r0.getClass()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.lang.String r0 = "InvalidLiveBroadcastInIGTVFeed"
            X.0wb.A03(r0, r1)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r3.remove()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x01ac
        L_0x01d2:
            java.util.Map r1 = r4.A0E     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            java.lang.String r0 = r2.A0X     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r0.getClass()     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            r1.put(r0, r2)     // Catch:{ IOException -> 0x01e5, Exception -> 0x01df }
            goto L_0x01ac
        L_0x01dd:
            r4 = 0
        L_0x01de:
            return r4
        L_0x01df:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x01e5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJ4.parseFromJson(X.16F):X.K1d");
    }
}
