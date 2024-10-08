package X;

/* renamed from: X.D0g  reason: case insensitive filesystem */
public final class C45656D0g {
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C43827CEt parseFromJson(X.16F r13) {
        /*
            r3 = 0
            X.0qQ.A0B(r13, r3)
            X.CEt r1 = new X.CEt     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r1.<init>()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.16L r0 = r13.A11()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.16L r2 = X.16L.A0D     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == r2) goto L_0x0016
            r13.A0z()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r1 = 0
            return r1
        L_0x0016:
            X.16L r0 = r13.A1J()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.16L r6 = X.16L.A09     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == r6) goto L_0x013a
            java.lang.String r5 = X.AnonymousClass7TE.A17(r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            java.lang.String r0 = "client_hints"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x0034
            X.3Ic r0 = X.AnonymousClass3OP.parseFromJson(r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r1.A02 = r0     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
        L_0x0030:
            r13.A0z()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0016
        L_0x0034:
            java.lang.String r0 = "container_module"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r4 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r1.A09 = r0     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0030
        L_0x0044:
            java.lang.String r0 = "is_shell_response"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x0053
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r1.A06 = r0     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0030
        L_0x0053:
            java.lang.String r0 = "items"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x007f
            X.16L r5 = r13.A11()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r5 != r0) goto L_0x0079
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
        L_0x0067:
            X.16L r5 = r13.A1J()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r5 == r0) goto L_0x0079
            X.BB0 r0 = X.C44216Cad.parseFromJson(r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x0067
            r4.add(r0)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0067
        L_0x0079:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r1.A0B = r4     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0030
        L_0x007f:
            java.lang.String r0 = "items_with_ads"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x00a8
            X.16L r5 = r13.A11()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r5 != r0) goto L_0x00a5
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
        L_0x0093:
            X.16L r5 = r13.A1J()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r5 == r0) goto L_0x00a5
            X.JwC r0 = X.C44215Cac.parseFromJson(r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x0093
            r4.add(r0)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0093
        L_0x00a5:
            r1.A0C = r4     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0030
        L_0x00a8:
            java.lang.String r0 = "media_id_to_brand_safety_content_blocklist_map"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x00d2
            X.16L r5 = r13.A11()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r5 != r0) goto L_0x00ce
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
        L_0x00bc:
            X.16L r5 = r13.A1J()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r5 == r0) goto L_0x00ce
            com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl r0 = X.B5H.parseFromJson(r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x00bc
            r4.add(r0)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x00bc
        L_0x00ce:
            r1.A0D = r4     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0030
        L_0x00d2:
            java.lang.String r0 = "media_id_to_brand_safety_severity_map"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x00f2
            X.16L r0 = r13.A11()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 != r2) goto L_0x00ee
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
        L_0x00e4:
            X.16L r0 = r13.A1J()     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == r6) goto L_0x00ee
            X.C41847B3o.A1N(r13, r4)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x00e4
        L_0x00ee:
            r1.A0A = r4     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0030
        L_0x00f2:
            java.lang.String r0 = "paging_info"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x0105
            X.4sZ r0 = X.C276094sY.parseFromJson(r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.0qQ.A0B(r0, r3)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r1.A04 = r0     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0030
        L_0x0105:
            java.lang.String r0 = "preload_distance"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x0115
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r1.A08 = r0     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0030
        L_0x0115:
            java.lang.String r0 = "ranking_info"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x0125
            com.instagram.api.schemas.RankingInfo r0 = X.V85.parseFromJson(r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r1.A05 = r0     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0030
        L_0x0125:
            java.lang.String r0 = "unable_to_load_chaining_media"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            if (r0 == 0) goto L_0x0135
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r1.A07 = r0     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0030
        L_0x0135:
            X.1XY.A01(r13, r1, r5)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            goto L_0x0030
        L_0x013a:
            X.3Ic r3 = r1.A02     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            java.lang.String r9 = r1.A09     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            java.lang.Boolean r6 = r1.A06     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            java.util.List r11 = r1.A0B     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.0qQ.A0A(r11)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            java.util.List r12 = r1.A0C     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            java.util.List r13 = r1.A0D     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            java.util.HashMap r10 = r1.A0A     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.4sZ r4 = r1.A04     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.0qQ.A0A(r4)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            java.lang.Integer r8 = r1.A08     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            com.instagram.api.schemas.RankingInfo r5 = r1.A05     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            java.lang.Boolean r7 = r1.A07     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            X.BBP r2 = new X.BBP     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            r1.A03 = r2     // Catch:{ IOException -> 0x0164, Exception -> 0x015e }
            return r1
        L_0x015e:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0164:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45656D0g.parseFromJson(X.16F):X.CEt");
    }
}
