package X;

/* renamed from: X.Vnd  reason: case insensitive filesystem */
public final class C18213Vnd {
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C15256UXq parseFromJson(X.16F r6) {
        /*
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.UXq r0 = new X.UXq     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            r0.<init>()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            X.16L r2 = X.16L.A0D     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == r2) goto L_0x0016
            r6.A0z()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x00e1
        L_0x0016:
            X.16L r1 = r6.A1J()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            X.16L r5 = X.16L.A09     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == r5) goto L_0x00e2
            java.lang.String r4 = X.AnonymousClass7TE.A17(r6)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            java.lang.String r1 = "header"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == 0) goto L_0x0034
            X.V3i r1 = X.VEJ.parseFromJson(r6)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            r0.A03 = r1     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
        L_0x0030:
            r6.A0z()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0016
        L_0x0034:
            java.lang.String r1 = "header_state_selector_in_bloks"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            r0.A07 = r1     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0030
        L_0x0043:
            java.lang.String r1 = "units"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            r3 = 0
            if (r1 == 0) goto L_0x006e
            X.16L r4 = r6.A11()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r4 != r1) goto L_0x006b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            r3.<init>()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
        L_0x0059:
            X.16L r4 = r6.A1J()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r4 == r1) goto L_0x006b
            X.Cvr r1 = X.C44829Clf.parseFromJson(r6)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == 0) goto L_0x0059
            r3.add(r1)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0059
        L_0x006b:
            r0.A06 = r3     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0030
        L_0x006e:
            java.lang.String r1 = "state_selector"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == 0) goto L_0x007d
            X.V3h r1 = X.VEI.parseFromJson(r6)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            r0.A02 = r1     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0030
        L_0x007d:
            java.lang.String r1 = "url_path_to_module_id"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == 0) goto L_0x009d
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 != r2) goto L_0x009a
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            r3.<init>()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
        L_0x0090:
            X.16L r1 = r6.A1J()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == r5) goto L_0x009a
            X.C41847B3o.A1M(r6, r3)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0090
        L_0x009a:
            r0.A05 = r3     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0030
        L_0x009d:
            java.lang.String r1 = "url"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == 0) goto L_0x00ac
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r6)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            r0.A04 = r1     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0030
        L_0x00ac:
            java.lang.String r1 = "share_unit"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == 0) goto L_0x00bc
            com.instagram.infocenter.model.ShareInfo r1 = X.VEH.parseFromJson(r6)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            r0.A01 = r1     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0030
        L_0x00bc:
            java.lang.String r1 = "info_glyph_unit"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == 0) goto L_0x00cc
            X.V3C r1 = X.VEE.parseFromJson(r6)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            r0.A00 = r1     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0030
        L_0x00cc:
            java.lang.String r1 = "is_sunset"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            if (r1 == 0) goto L_0x00dc
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            r0.A08 = r1     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0030
        L_0x00dc:
            X.1XY.A01(r6, r0, r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e3 }
            goto L_0x0030
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            return r0
        L_0x00e3:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00ea:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18213Vnd.parseFromJson(X.16F):X.UXq");
    }
}
