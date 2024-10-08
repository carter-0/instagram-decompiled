package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2uT  reason: invalid class name and case insensitive filesystem */
public final class C232802uT extends C252313ou {
    public final UserSession A00;
    public final AnonymousClass0eK A01;
    public final AnonymousClass0eK A02;
    public final AnonymousClass0eK A03;
    public final AnonymousClass0eK A04;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.4OC] */
    public final void A0A(0xI r8, C263934Nx r9) {
        0qQ.A0B(r8, 0);
        ? obj = new Object();
        if ("video_should_start".equals(r8.A04)) {
            String str = (String) this.A04.get();
            obj.A0b = str;
            if (str != null) {
                r8.A0C("trigger", str);
            }
        }
        C257443xP r5 = (C257443xP) this.A02.get();
        C257443xP r3 = (C257443xP) this.A03.get();
        C257443xP r4 = (C257443xP) this.A01.get();
        boolean z = true;
        if (r5.A06()) {
            Integer valueOf = Integer.valueOf(((C282575Du) r5.A03()).A00);
            obj.A07 = valueOf;
            if (valueOf != null) {
                r8.A08(valueOf, "carousel_index");
            }
            Integer valueOf2 = Integer.valueOf(((C282575Du) r5.A03()).A02);
            obj.A09 = valueOf2;
            if (valueOf2 != null) {
                r8.A08(valueOf2, "carousel_size");
            }
            Integer valueOf3 = Integer.valueOf(((C282575Du) r5.A03()).A01);
            obj.A08 = valueOf3;
            if (valueOf3 != null) {
                r8.A08(valueOf3, "carousel_m_t");
            }
            String str2 = ((C282575Du) r5.A03()).A04;
            obj.A0S = str2;
            r8.A0C("carousel_media_id", str2);
            String str3 = ((C282575Du) r5.A03()).A03;
            obj.A0R = str3;
            r8.A0C("carousel_cover_media_id", str3);
            if (((C282575Du) r5.A03()).A05) {
                obj.A0B = 1;
                r8.A08(1, "is_dash_eligible");
                obj.A0U = "dash";
                r8.A0C("playback_format", "dash");
            }
            if (r3.A06()) {
                String mezqlToken = ((1Xj) r3.A03()).A0C.getMezqlToken();
                if (mezqlToken != null) {
                    r8.A0C("mezql_token", mezqlToken);
                }
                String loggingInfoToken = ((1Xj) r3.A03()).A0C.getLoggingInfoToken();
                if (loggingInfoToken != null) {
                    r8.A0C("ranking_info_token", loggingInfoToken);
                }
            }
        }
        boolean A06 = r3.A06();
        if (A06) {
            boolean A51 = ((1Xj) r3.A03()).A51();
            if (!A51 || !AnonymousClass3WP.A07(this.A00)) {
                z = false;
            }
            Boolean valueOf4 = Boolean.valueOf(A51);
            obj.A04 = valueOf4;
            if (valueOf4 != null) {
                r8.A09("video_subtitles_available", valueOf4);
            }
            Boolean valueOf5 = Boolean.valueOf(z);
            obj.A05 = valueOf5;
            if (valueOf5 != null) {
                r8.A09("video_subtitles_displayed", valueOf5);
            }
            0xF r1 = obj.A01;
            if (r1 != null) {
                r8.A05(r1, "adhoc_data");
            }
        }
        if (r4.A06() && ((AnonymousClass3W1) r4.A03()).A2p && A06 && ((1Xj) r3.A03()).A5G()) {
            obj.A0Z = "clips_netego";
            r8.A0C("subtype", "clips_netego");
        }
        if (r9 != null) {
            r9.A07 = obj;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d3, code lost:
        if (X.AnonymousClass3WP.A07(r4.A00) == false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C263974Ob A0D(X.C263974Ob r5, X.1Xj r6) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            X.0qQ.A0B(r5, r0)
            super.A0D(r5, r6)
            X.0eK r0 = r4.A02
            java.lang.Object r2 = r0.get()
            X.3xP r2 = (X.C257443xP) r2
            X.0eK r0 = r4.A03
            java.lang.Object r3 = r0.get()
            X.3xP r3 = (X.C257443xP) r3
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r2.A03()
            X.5Du r0 = (X.C282575Du) r0
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "feed_carousel_index"
            r5.A05(r0, r1)
            java.lang.Object r0 = r2.A03()
            X.5Du r0 = (X.C282575Du) r0
            int r0 = r0.A02
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "feed_carousel_size"
            r5.A05(r0, r1)
            java.lang.Object r0 = r2.A03()
            X.5Du r0 = (X.C282575Du) r0
            int r0 = r0.A01
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "feed_carousel_media_type"
            r5.A05(r0, r1)
            java.lang.Object r0 = r2.A03()
            X.5Du r0 = (X.C282575Du) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "feed_carousel_media_id"
            r5.A06(r0, r1)
            java.lang.Object r0 = r2.A03()
            X.5Du r0 = (X.C282575Du) r0
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "feed_carousel_cover_media_id"
            r5.A06(r0, r1)
            java.lang.Object r0 = r2.A03()
            X.5Du r0 = (X.C282575Du) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0082
            java.lang.String r1 = "dash"
            java.lang.String r0 = "video_format"
            r5.A06(r0, r1)
        L_0x0082:
            boolean r0 = r3.A06()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r3.A03()
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            java.lang.String r2 = r0.getMezqlToken()
            java.lang.Object r0 = r3.A03()
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            java.lang.String r1 = r0.getLoggingInfoToken()
            if (r2 == 0) goto L_0x00a7
            java.lang.String r0 = "mezql_token"
            r5.A06(r0, r2)
        L_0x00a7:
            if (r1 == 0) goto L_0x00ae
            java.lang.String r0 = "ranking_info_token"
            r5.A06(r0, r1)
        L_0x00ae:
            boolean r0 = r3.A06()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r3.A03()
            X.1Xj r0 = (X.1Xj) r0
            boolean r1 = r0.A51()
            if (r1 == 0) goto L_0x00d5
            java.lang.Object r0 = r3.A03()
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r0.A5Y()
            if (r0 == 0) goto L_0x00d5
            com.instagram.common.session.UserSession r0 = r4.A00
            boolean r0 = X.AnonymousClass3WP.A07(r0)
            r2 = 1
            if (r0 != 0) goto L_0x00d6
        L_0x00d5:
            r2 = 0
        L_0x00d6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "captions_available"
            r5.A03(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "captions_displayed"
            r5.A03(r0, r1)
        L_0x00e8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232802uT.A0D(X.4Ob, X.1Xj):X.4Ob");
    }

    public C232802uT(UserSession userSession, AnonymousClass4DU r5, String str, AnonymousClass0eK r7, AnonymousClass0eK r8, AnonymousClass0eK r9, AnonymousClass0eK r10) {
        super(userSession, r5, str, 182.A06(0Tu.A05, userSession, 36320004391640944L));
        this.A00 = userSession;
        this.A02 = r7;
        this.A04 = r8;
        this.A03 = r9;
        this.A01 = r10;
    }

    public final String A03(1Xj r3) {
        C257443xP r1 = (C257443xP) this.A02.get();
        if (r1.A06()) {
            return ((C282575Du) r1.A03()).A04;
        }
        String id = r3.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
