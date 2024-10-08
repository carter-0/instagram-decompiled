package X;

/* renamed from: X.47u  reason: invalid class name and case insensitive filesystem */
public abstract class C2609847u {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C2609947v parseFromJson(X.16F r6) {
        /*
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.47v r2 = new X.47v     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.<init>()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r1 == r0) goto L_0x0016
            r6.A0z()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0135
        L_0x0016:
            X.16L r1 = r6.A1J()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r1 == r0) goto L_0x00fd
            java.lang.String r1 = r6.A0q()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r6.A1J()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            java.lang.String r0 = "expiring_media_action_summary"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 == 0) goto L_0x0037
            X.5Dg r0 = X.C272064k2.parseFromJson(r6)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.A01 = r0     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
        L_0x0033:
            r6.A0z()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0016
        L_0x0037:
            java.lang.String r0 = "media"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 == 0) goto L_0x0046
            X.1Xj r0 = X.1Xj.A00(r6)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.A02 = r0     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0033
        L_0x0046:
            java.lang.String r0 = "pending_media"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 == 0) goto L_0x0055
            X.3Q2 r0 = X.AnonymousClass3Q1.parseFromJson(r6)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.A03 = r0     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0033
        L_0x0055:
            java.lang.String r0 = "pending_media_key"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r5 = 0
            if (r0 == 0) goto L_0x006d
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r1 == r0) goto L_0x006a
            java.lang.String r5 = r6.A1P()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
        L_0x006a:
            r2.A07 = r5     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0033
        L_0x006d:
            java.lang.String r0 = "duration_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 == 0) goto L_0x0080
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.A04 = r0     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0033
        L_0x0080:
            java.lang.String r0 = "waveform_data"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 == 0) goto L_0x00ad
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r1 != r0) goto L_0x00aa
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r5.<init>()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
        L_0x0095:
            X.16L r1 = r6.A1J()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r1 == r0) goto L_0x00aa
            double r3 = r6.A0U()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            java.lang.Float r0 = new java.lang.Float     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r5.add(r0)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0095
        L_0x00aa:
            r2.A09 = r5     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0033
        L_0x00ad:
            java.lang.String r0 = "waveform_sampling_frequency_hz"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 == 0) goto L_0x00c1
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.A05 = r0     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0033
        L_0x00c1:
            java.lang.String r0 = "seen_count"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 == 0) goto L_0x00d1
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.A00 = r0     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0033
        L_0x00d1:
            java.lang.String r0 = "url_expire_at_secs"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 == 0) goto L_0x00e5
            long r0 = r6.A0y()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.A06 = r0     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0033
        L_0x00e5:
            java.lang.String r0 = "view_mode"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 == 0) goto L_0x0033
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r1 == r0) goto L_0x00f9
            java.lang.String r5 = r6.A1P()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
        L_0x00f9:
            r2.A08 = r5     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            goto L_0x0033
        L_0x00fd:
            X.3Q2 r1 = r2.A03     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r1 == 0) goto L_0x0136
            java.lang.String r0 = r2.A07     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 != 0) goto L_0x0109
            java.lang.String r0 = r1.A35     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.A07 = r0     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
        L_0x0109:
            java.lang.Integer r0 = r2.A04     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 != 0) goto L_0x011a
            X.4n7 r0 = r1.A1L     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r0.getClass()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            int r0 = r0.A00     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.A04 = r0     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
        L_0x011a:
            java.util.List r0 = r2.A09     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 != 0) goto L_0x0127
            X.3Q2 r0 = r2.A03     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            java.util.List r0 = r0.A4r     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r0.getClass()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.A09 = r0     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
        L_0x0127:
            java.lang.Integer r0 = r2.A05     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            if (r0 != 0) goto L_0x0136
            X.3Q2 r0 = r2.A03     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            java.lang.Integer r0 = r0.A2H     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r0.getClass()     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            r2.A05 = r0     // Catch:{ IOException -> 0x013e, Exception -> 0x0137 }
            return r2
        L_0x0135:
            r2 = 0
        L_0x0136:
            return r2
        L_0x0137:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x013e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2609847u.parseFromJson(X.16F):X.47v");
    }

    public static void A00(17Z r3, C2609947v r4) {
        r3.A0c();
        if (r4.A01 != null) {
            r3.A0q("expiring_media_action_summary");
            C272064k2.A00(r3, r4.A01);
        }
        if (r4.A02 != null) {
            r3.A0q("media");
            1Xj r1 = r4.A02;
            1Xv r0 = 1Xj.A0h;
            1Xv.A07(r3, r1);
        }
        if (r4.A03 != null) {
            r3.A0q("pending_media");
            AnonymousClass3Q1.A01(r3, r4.A03);
        }
        String str = r4.A07;
        if (str != null) {
            r3.A0R("pending_media_key", str);
        }
        Integer num = r4.A04;
        if (num != null) {
            r3.A0P("duration_ms", num.intValue());
        }
        if (r4.A09 != null) {
            16P.A03(r3, "waveform_data");
            for (Number number : r4.A09) {
                if (number != null) {
                    r3.A0f(number.floatValue());
                }
            }
            r3.A0Y();
        }
        Integer num2 = r4.A05;
        if (num2 != null) {
            r3.A0P("waveform_sampling_frequency_hz", num2.intValue());
        }
        r3.A0P("seen_count", r4.A00);
        Long l = r4.A06;
        if (l != null) {
            r3.A0Q("url_expire_at_secs", l.longValue());
        }
        String str2 = r4.A08;
        if (str2 != null) {
            r3.A0R("view_mode", str2);
        }
        r3.A0Z();
    }
}
