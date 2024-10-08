package X;

/* renamed from: X.2z3  reason: invalid class name and case insensitive filesystem */
public final class C235002z3 {
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0228, code lost:
        if (new X.C234002wp(r9).A03() == false) goto L_0x022a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0xI A00(com.instagram.common.session.UserSession r9, X.1Xl r10, X.AnonymousClass4DU r11, X.AnonymousClass3W1 r12, X.C249763kK r13, X.C254213s7 r14, java.lang.String r15, java.lang.String r16) {
        /*
            r8 = this;
            X.1Xj r1 = r10.BPf()
            java.lang.String r5 = r13.getSessionId()
            X.0xI r2 = X.0xI.A00(r11, r15)
            java.lang.String r3 = r1.getId()
            java.lang.String r0 = "m_pk"
            r2.A0C(r0, r3)
            boolean r0 = X.AnonymousClass3WX.A02(r10, r11)
            if (r0 == 0) goto L_0x01df
            java.lang.String r0 = X.C231122qu.A06(r9, r10)
        L_0x001f:
            java.lang.String r3 = "tracking_token"
            if (r0 == 0) goto L_0x0026
            r2.A0C(r3, r0)
        L_0x0026:
            X.1iA r0 = r1.BR7()
            int r0 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "m_t"
            r2.A08(r3, r0)
            java.lang.String r0 = "nav_chain"
            r3 = r16
            if (r16 == 0) goto L_0x003e
            r2.A0C(r0, r3)
        L_0x003e:
            java.util.List r0 = r1.A0e
            java.lang.String r3 = X.C243413Yr.A00(r0)
            java.lang.String r0 = "delivery_flags"
            if (r3 == 0) goto L_0x004b
            r2.A0C(r0, r3)
        L_0x004b:
            int r0 = r12.getPosition()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "m_ix"
            r2.A08(r3, r0)
            int r4 = r12.A0W
            java.lang.String r3 = "recs_ix"
            r0 = -1
            if (r4 == r0) goto L_0x0066
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.A08(r0, r3)
        L_0x0066:
            r4 = 21
            r3 = 10
            r0 = 4
            java.lang.String r0 = X.C21058XCk.A01(r4, r3, r0)
            if (r5 == 0) goto L_0x0074
            r2.A0C(r0, r5)
        L_0x0074:
            X.1Xy r0 = r1.A0C
            java.lang.String r4 = r0.BIl()
            java.lang.String r0 = "inventory_source"
            if (r4 == 0) goto L_0x0081
            r2.A0C(r0, r4)
        L_0x0081:
            X.1Xy r0 = r1.A0C
            java.lang.String r4 = r0.getMezqlToken()
            java.lang.String r0 = "mezql_token"
            if (r4 == 0) goto L_0x008e
            r2.A0C(r0, r4)
        L_0x008e:
            X.1Xy r0 = r1.A0C
            java.lang.String r4 = r0.getLoggingInfoToken()
            java.lang.String r0 = "ranking_info_token"
            if (r4 == 0) goto L_0x009b
            r2.A0C(r0, r4)
        L_0x009b:
            java.lang.String r4 = r1.A0R
            java.lang.String r0 = "feed_request_id"
            if (r4 == 0) goto L_0x00a4
            r2.A0C(r0, r4)
        L_0x00a4:
            java.lang.Boolean r4 = r12.A0y
            java.lang.String r0 = "media_caption_has_see_more"
            if (r4 == 0) goto L_0x00ad
            r2.A09(r0, r4)
        L_0x00ad:
            boolean r0 = X.AnonymousClass3WX.A02(r10, r11)
            if (r0 == 0) goto L_0x00be
            java.lang.String r4 = X.C231122qu.A07(r9, r1)
            java.lang.String r0 = "ad_id"
            if (r4 == 0) goto L_0x00be
            r2.A0C(r0, r4)
        L_0x00be:
            java.lang.String r0 = "instagram_ad_vpvd_imp"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00e3
            X.5mM r4 = X.C294385mM.A00
            java.lang.Class<X.5mN> r0 = X.C294395mN.class
            java.lang.Object r0 = r9.A01(r0, r4)
            X.5mN r0 = (X.C294395mN) r0
            java.util.Map r4 = r0.A00
            java.lang.String r0 = r1.getId()
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "ifu_status"
            if (r4 == 0) goto L_0x00e3
            r2.A0C(r0, r4)
        L_0x00e3:
            X.C300025wP.A00(r2, r14)
            java.lang.String r4 = r11.getModuleName()
            r0 = 5
            X.0qQ.A0B(r4, r0)
            X.0xF r5 = new X.0xF
            r5.<init>()
            boolean r0 = X.C294375mL.A00(r12)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_paged"
            X.0xF.A00(r5, r4, r0)
            X.0rQ r0 = new X.0rQ
            r0.<init>(r9)
            boolean r0 = r0.A05(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_tall"
            X.0xF.A00(r5, r4, r0)
            int r0 = r14.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "view_height"
            X.0xF.A00(r5, r4, r0)
            int r0 = r14.A01
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "view_width"
            X.0xF.A00(r5, r4, r0)
            java.lang.String r0 = "view_metadata"
            r2.A05(r5, r0)
            boolean r0 = r11 instanceof X.C232682uF
            if (r0 == 0) goto L_0x013f
            r0 = r11
            X.2uF r0 = (X.C232682uF) r0
            X.0jB r0 = r0.E4l(r1)
            X.0xF r0 = r0.A00()
            r2.A04(r0)
        L_0x013f:
            r0 = 24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "imp_logger_ver"
            r2.A08(r1, r0)
            boolean r0 = r10 instanceof X.AnonymousClass3OA
            if (r0 == 0) goto L_0x017d
            r4 = r10
            X.3OA r4 = (X.AnonymousClass3OA) r4
            boolean r0 = r4.A0x
            if (r0 == 0) goto L_0x017d
            boolean r0 = X.AnonymousClass3WX.A02(r10, r11)
            if (r0 == 0) goto L_0x017d
            java.lang.String r1 = r4.A0S
            java.lang.String r0 = "ad_id"
            if (r1 == 0) goto L_0x0164
            r2.A0C(r0, r1)
        L_0x0164:
            java.lang.String r1 = r4.A0f
            java.lang.String r0 = "host_media_pk"
            if (r1 == 0) goto L_0x016d
            r2.A0C(r0, r1)
        L_0x016d:
            int r0 = r12.getPosition()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "chaining_position"
            if (r1 == 0) goto L_0x017d
            r2.A0B(r0, r1)
        L_0x017d:
            boolean r0 = X.AnonymousClass3WX.A02(r10, r11)
            if (r0 == 0) goto L_0x01ca
            android.util.Pair r4 = r12.A03()
            android.util.Pair r5 = r12.A04()
            X.1Xj r0 = r10.BPf()
            java.lang.Integer r1 = r0.A2J()
            java.lang.String r0 = "brs_threshold"
            if (r1 == 0) goto L_0x019a
            r2.A08(r1, r0)
        L_0x019a:
            if (r5 == 0) goto L_0x01b2
            java.lang.Object r1 = r5.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "organic_media_id_before"
            if (r1 == 0) goto L_0x01a7
            r2.A0C(r0, r1)
        L_0x01a7:
            java.lang.Object r1 = r5.second
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "organic_media_id_after"
            if (r1 == 0) goto L_0x01b2
            r2.A0C(r0, r1)
        L_0x01b2:
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r1 = r4.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r0 = "organic_brs_severity_before"
            if (r1 == 0) goto L_0x01bf
            r2.A08(r1, r0)
        L_0x01bf:
            java.lang.Object r1 = r4.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r0 = "organic_brs_severity_after"
            if (r1 == 0) goto L_0x01ca
            r2.A08(r1, r0)
        L_0x01ca:
            X.1Xj r0 = r10.BPf()
            java.lang.String r0 = r0.getId()
            java.lang.String r4 = X.C231122qu.A0H(r9, r0)
            boolean r0 = X.AnonymousClass3WX.A02(r10, r11)
            if (r0 == 0) goto L_0x020b
            if (r4 == 0) goto L_0x020b
            goto L_0x01eb
        L_0x01df:
            X.1Xj r0 = r10.BPf()
            X.1Xy r0 = r0.A0C
            java.lang.String r0 = r0.getOrganicTrackingToken()
            goto L_0x001f
        L_0x01eb:
            java.lang.String r1 = "host_profile_id"
            java.lang.Long r0 = X.00y.A0n(r3, r4)     // Catch:{ NumberFormatException -> 0x01f5 }
            r2.A0B(r1, r0)     // Catch:{ NumberFormatException -> 0x01f5 }
            goto L_0x020b
        L_0x01f5:
            X.0wj r3 = X.0wj.A01
            r1 = 817902424(0x30c03358, float:1.3984431E-9)
            r0 = 448(0x1c0, float:6.28E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r4)
            X.0f9 r0 = r3.AEf(r0, r1)
            r0.report()
        L_0x020b:
            boolean r0 = X.AnonymousClass3WX.A02(r10, r11)
            if (r0 == 0) goto L_0x02af
            java.lang.String r1 = r11.getModuleName()
            java.lang.String r0 = "feed"
            r5 = 0
            boolean r0 = X.00l.A0d(r1, r0, r5)
            if (r0 == 0) goto L_0x022a
            X.2wp r0 = new X.2wp
            r0.<init>(r9)
            boolean r0 = r0.A03()
            r4 = 1
            if (r0 != 0) goto L_0x022b
        L_0x022a:
            r4 = 0
        L_0x022b:
            java.lang.String r1 = r11.getModuleName()
            java.lang.String r0 = "clips"
            boolean r0 = X.00l.A0d(r1, r0, r5)
            if (r0 == 0) goto L_0x0245
            X.0Tu r3 = X.0Tu.A06
            r0 = 36322916379404959(0x810b8000002a9f, double:3.034096806755704E-306)
            boolean r0 = X.182.A06(r3, r9, r0)
            if (r0 == 0) goto L_0x0245
            r5 = 1
        L_0x0245:
            X.1Xj r3 = r10.BPf()
            if (r4 == 0) goto L_0x0302
            X.2wp r0 = new X.2wp
            r0.<init>(r9)
            r7 = 0
            r6 = 1
            X.2ws r1 = r0.A04
            boolean r0 = r0.A05(r3)
            if (r0 == 0) goto L_0x02af
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.2wr r0 = r1.A01
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r3 = X.0Tu.A06
            r0 = 36324840524755349(0x810d4000003195, double:3.0353136440232024E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 != 0) goto L_0x0279
            r0 = 2974(0xb9e, float:4.167E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.add(r0)
        L_0x0279:
            boolean r0 = X.HQQ.A04
            if (r0 == 0) goto L_0x0282
            java.lang.String r0 = "framework_limitation"
            r4.add(r0)
        L_0x0282:
            boolean r0 = X.HQQ.A03
            if (r0 == 0) goto L_0x028f
            r0 = 2238(0x8be, float:3.136E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.add(r0)
        L_0x028f:
            boolean r0 = X.HQQ.A02
            if (r0 == 0) goto L_0x029c
            r0 = 2136(0x858, float:2.993E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.add(r0)
        L_0x029c:
            boolean r3 = r4.isEmpty()
            r0 = 785(0x311, float:1.1E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            if (r3 == 0) goto L_0x02f1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.A09(r1, r0)
        L_0x02af:
            boolean r0 = X.AnonymousClass3WX.A02(r10, r11)
            if (r0 == 0) goto L_0x02ee
            X.0Tu r3 = X.0Tu.A05
            r0 = 36329805506953551(0x8111c40000414f, double:3.038453518757724E-306)
            boolean r0 = X.182.A06(r3, r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x02e9
            X.1Xj r0 = r10.BPf()
            X.1Xy r0 = r0.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x02ef
            X.1rp r0 = r0.AZY()
            if (r0 == 0) goto L_0x02ef
            X.1Xj r0 = r10.BPf()
            X.1Xy r0 = r0.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x02ef
            r0.Bh3()
            r0 = 1
        L_0x02e5:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x02e9:
            java.lang.String r0 = "music_cover_shown"
            r2.A09(r0, r1)
        L_0x02ee:
            return r2
        L_0x02ef:
            r0 = 0
            goto L_0x02e5
        L_0x02f1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r2.A09(r1, r0)
            r0 = 647(0x287, float:9.07E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A0D(r0, r4)
            goto L_0x02af
        L_0x0302:
            if (r5 == 0) goto L_0x02af
            X.2wp r4 = new X.2wp
            r4.<init>(r9)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.2ws r0 = r4.A04
            com.instagram.common.session.UserSession r0 = r0.A00
            X.HEL r0 = X.C55136Hck.A00(r0)
            java.util.concurrent.ConcurrentHashMap r6 = r0.A00
            java.lang.String r0 = r3.getId()
            java.lang.Object r0 = r6.get(r0)
            X.GlH r0 = (X.C53269GlH) r0
            r5 = 1
            if (r0 == 0) goto L_0x02af
            boolean r0 = r0.A01
            if (r0 != r5) goto L_0x02af
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = r3.getId()
            java.lang.Object r0 = r6.get(r0)
            X.GlH r0 = (X.C53269GlH) r0
            if (r0 == 0) goto L_0x0342
            boolean r0 = r0.A02
            if (r0 != r5) goto L_0x0342
            java.lang.String r0 = "ineligible_ad_format"
            r1.add(r0)
        L_0x0342:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0353
            r0 = 647(0x287, float:9.07E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A0D(r0, r1)
        L_0x0353:
            java.lang.Boolean r1 = r4.A01(r3)
            r0 = 785(0x311, float:1.1E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A09(r0, r1)
            java.lang.String r1 = r3.getId()
            if (r1 == 0) goto L_0x02af
            X.HEL r0 = X.C55136Hck.A00(r9)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            X.GlH r1 = (X.C53269GlH) r1
            if (r1 == 0) goto L_0x02af
            r0 = 0
            r1.A00 = r0
            goto L_0x02af
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235002z3.A00(com.instagram.common.session.UserSession, X.1Xl, X.4DU, X.3W1, X.3kK, X.3s7, java.lang.String, java.lang.String):X.0xI");
    }
}
