package X;

/* renamed from: X.D2t  reason: case insensitive filesystem */
public final class C45720D2t {
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.CGE parseFromJson(X.16F r5) {
        /*
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.CGE r1 = new X.CGE     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.<init>()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r3 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x017b
        L_0x0016:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r3 == r0) goto L_0x017c
            java.lang.String r3 = X.AnonymousClass7TE.A17(r5)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            java.lang.String r0 = "viewer_count"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x0034
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A02 = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
        L_0x0030:
            r5.A0z()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0016
        L_0x0034:
            java.lang.String r0 = "viewer_count_avatars"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r4 = 0
            if (r0 == 0) goto L_0x005b
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r3 != r0) goto L_0x0055
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
        L_0x0049:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r3 == r0) goto L_0x0055
            X.C41846B3n.A1E(r5, r4)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0049
        L_0x0055:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A08 = r4     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x005b:
            java.lang.String r0 = "total_unique_viewer_count"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x006a
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A01 = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x006a:
            java.lang.String r0 = "broadcast_status"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = r5.A1Q()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            X.4wI r0 = X.C278144wL.A00(r0)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A03 = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x007d:
            java.lang.String r0 = "is_policy_violation"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x008c
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A0D = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x008c:
            java.lang.String r0 = "policy_violation_reason"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A07 = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x009b:
            java.lang.String r0 = "is_top_live_eligible"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A0F = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x00aa:
            java.lang.String r0 = "cobroadcaster_ids"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x00ce
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r3 != r0) goto L_0x00ca
            java.util.HashSet r4 = X.AnonymousClass7TE.A1F()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
        L_0x00be:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r3 == r0) goto L_0x00ca
            X.AnonymousClass7TG.A1F(r5, r4)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x00be
        L_0x00ca:
            r1.A09 = r4     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x00ce:
            r0 = 3101(0xc1d, float:4.345E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x00e2
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A00 = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x00e2:
            java.lang.String r0 = "live_resource"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x00f2
            X.L5K r0 = X.C63477Kxg.parseFromJson(r5)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A06 = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x00f2:
            java.lang.String r0 = "request_to_join_enabled"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x0102
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A0G = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x0102:
            java.lang.String r0 = "cmp_policy_violation"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x0112
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A0A = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x0112:
            r0 = 677(0x2a5, float:9.49E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x0126
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A0C = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x0126:
            java.lang.String r0 = "is_moderated_session"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x0136
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A0B = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x0136:
            java.lang.String r0 = "sup_active"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x0146
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A0E = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x0146:
            java.lang.String r0 = "charity"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x0156
            X.Cv8 r0 = X.C45150CrD.parseFromJson(r5)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A04 = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x0156:
            java.lang.String r0 = "user_pay_info"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x0166
            X.L7F r0 = X.C45151CrE.parseFromJson(r5)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A05 = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x0166:
            java.lang.String r0 = "user_pay_max_amount_reached"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            if (r0 == 0) goto L_0x0176
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            r1.A0H = r0     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x0176:
            X.1XY.A01(r5, r1, r3)     // Catch:{ IOException -> 0x0183, Exception -> 0x017d }
            goto L_0x0030
        L_0x017b:
            r1 = 0
        L_0x017c:
            return r1
        L_0x017d:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0183:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45720D2t.parseFromJson(X.16F):X.CGE");
    }
}
