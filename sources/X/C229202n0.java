package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2n0  reason: invalid class name and case insensitive filesystem */
public abstract class C229202n0 implements C250603lj {
    public static final long A06 = TimeUnit.SECONDS.toMillis(1);
    public static final long A07 = TimeUnit.MINUTES.toMillis(1);
    public final long A00;
    public final long A01;
    public final 1Bk A02;
    public final C229312nB A03;
    public final C229222n2 A04;
    public final C229322nC A05;

    public C229202n0(1Bk r5, C229222n2 r6, long j) {
        C229312nB r3 = new C229312nB(r5, C61410nE.A00);
        C229322nC r0 = new C229322nC(0.5f);
        long j2 = A07;
        this.A03 = r3;
        this.A05 = r0;
        this.A04 = r6;
        this.A02 = r5;
        this.A01 = j;
        this.A00 = r5.A0G("override_staleTime_in_testMode", false) ? TimeUnit.MINUTES.toMillis(0) : j2;
    }

    public void A00(Object obj, long j, Object obj2) {
        if (this instanceof C234742ya) {
            return;
        }
        if ((this instanceof C229192mz) || (this instanceof C230032oo)) {
            ((Number) obj2).intValue();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.lang.Object r26, long r27, java.lang.Object r29) {
        /*
            r25 = this;
            r1 = r25
            r5 = r29
            r4 = r26
            boolean r0 = r1 instanceof X.C230032oo
            r14 = r27
            if (r0 == 0) goto L_0x004a
            X.2oo r1 = (X.C230032oo) r1
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Number r5 = (java.lang.Number) r5
            int r9 = r5.intValue()
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r4.first
            X.3UH r0 = (X.AnonymousClass3UH) r0
            java.lang.Object r2 = r4.second
            X.3UL r2 = (X.AnonymousClass3UL) r2
            if (r0 == 0) goto L_0x0047
            if (r2 == 0) goto L_0x0047
            X.2ok r1 = r1.A00
            int r8 = r0.A01
            java.lang.String r4 = r0.A0C
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            java.lang.String r6 = r0.A0F
            if (r6 != 0) goto L_0x0036
            java.lang.String r6 = ""
        L_0x0036:
            java.lang.String r7 = r0.A0I
            com.google.common.collect.ImmutableList r0 = r2.getSocialContextFacepileUsers()
            if (r0 == 0) goto L_0x0048
            int r10 = r0.size()
        L_0x0042:
            java.lang.String r5 = "profile"
            r1.DpJ(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0047:
            return
        L_0x0048:
            r10 = 0
            goto L_0x0042
        L_0x004a:
            boolean r0 = r1 instanceof X.C234742ya
            if (r0 == 0) goto L_0x01b7
            r0 = r1
            X.2ya r0 = (X.C234742ya) r0
            X.1Xj r4 = (X.1Xj) r4
            X.4HA r5 = (X.AnonymousClass4HA) r5
            r9 = 0
            X.0qQ.A0B(r4, r9)
            r7 = 1
            X.0qQ.A0B(r5, r7)
            com.instagram.common.session.UserSession r6 = r0.A00
            X.4DU r3 = r0.A01
            X.3W1 r8 = r5.A01
            int r10 = r5.A00
            X.0wc r2 = X.AnonymousClass0kN.A01(r3, r6)
            java.lang.String r1 = "instagram_organic_carousel_viewed_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r5 = r2.A00(r0, r1)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x0047
            r0 = -1
            if (r10 == r0) goto L_0x0047
            X.1Xj r13 = r4.A1c(r10)
            if (r13 == 0) goto L_0x0047
            X.1Xj r12 = r4.A1c(r9)
            com.instagram.user.model.User r11 = r4.A2A(r6)
            java.lang.String r1 = r13.getId()
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x031e
            java.lang.String r0 = "carousel_media_id"
            r5.AAJ(r0, r1)
            int r0 = r4.A0o()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "carousel_size"
            r5.A9F(r0, r1)
            long r0 = X.C294185m0.A00(r6, r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_author_id"
            r5.A9F(r0, r1)
            java.lang.String r1 = r3.getModuleName()
            java.lang.String r0 = "module_name"
            r5.AAJ(r0, r1)
            java.lang.String r0 = r13.A2n()
            if (r0 == 0) goto L_0x0318
            r9 = 10
            java.lang.Long r1 = X.00y.A0n(r9, r0)
            java.lang.String r0 = "carousel_media_id_int"
            r5.A9F(r0, r1)
            java.lang.String r0 = r4.A2n()
            if (r0 == 0) goto L_0x0312
            java.lang.Long r1 = X.00y.A0n(r9, r0)
            java.lang.String r0 = "carousel_container_media_id"
            r5.A9F(r0, r1)
            long r0 = (long) r10
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "carousel_index"
            r5.A9F(r0, r1)
            X.1iA r0 = r13.BR7()
            X.5wb r0 = r0.A00()
            long r0 = r0.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "carousel_media_type"
            r5.A9F(r0, r1)
            X.1Xy r0 = r4.A0C
            java.lang.String r0 = r0.BOq()
            if (r0 == 0) goto L_0x01b4
            java.lang.String r0 = X.1Xv.A06(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x010a:
            java.lang.String r0 = "carousel_starting_media_id"
            r5.A9F(r0, r1)
            java.util.List r0 = r4.A0e
            java.lang.String r1 = X.C243413Yr.A00(r0)
            java.lang.String r0 = "delivery_flags"
            r5.AAJ(r0, r1)
            java.lang.String r1 = r4.A0R
            java.lang.String r0 = "feed_request_id"
            r5.AAJ(r0, r1)
            X.1Xy r0 = r4.A0C
            java.lang.String r1 = r0.BIl()
            java.lang.String r0 = "inventory_source"
            r5.AAJ(r0, r1)
            int r0 = r8.getPosition()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "m_ix"
            r5.A9F(r0, r1)
            java.lang.String r1 = X.C294185m0.A09(r4)
            java.lang.String r0 = "m_pk"
            r5.AAJ(r0, r1)
            X.1iA r0 = r4.BR7()
            X.5wb r0 = r0.A00()
            long r0 = r0.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_type"
            r5.A9F(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "post_impression_column_override"
            r5.A7p(r0, r1)
            java.lang.String r1 = X.C61970qY.A07()
            java.lang.String r0 = "radio_type"
            r5.AAJ(r0, r1)
            java.lang.String r1 = X.C294185m0.A07(r6, r4, r3)
            java.lang.String r0 = "tracking_token"
            r5.AAJ(r0, r1)
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            int r0 = r0.A00()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "is_dark_mode"
            r5.A9F(r0, r1)
            if (r12 == 0) goto L_0x019f
            java.lang.String r1 = r12.A2n()
            if (r1 == 0) goto L_0x030c
            java.lang.Long r1 = X.00y.A0n(r9, r1)
            java.lang.String r0 = "carousel_cover_media_id_int"
            r5.A9F(r0, r1)
            java.lang.String r1 = r12.getId()
            java.lang.String r0 = "carousel_cover_media_id"
            r5.AAJ(r0, r1)
        L_0x019f:
            if (r11 == 0) goto L_0x01b0
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.FollowStatus r0 = r11.B6o()
            java.lang.String r1 = X.1aC.A06(r0)
            java.lang.String r0 = "entity_follow_status"
            r5.AAJ(r0, r1)
        L_0x01b0:
            r5.Cgf()
            return
        L_0x01b4:
            r1 = 0
            goto L_0x010a
        L_0x01b7:
            boolean r0 = r1 instanceof X.C229192mz
            if (r0 == 0) goto L_0x02c3
            r6 = r1
            X.2mz r6 = (X.C229192mz) r6
            X.5s6 r4 = (X.C297645s6) r4
            java.lang.Number r5 = (java.lang.Number) r5
            int r13 = r5.intValue()
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r3 = r4.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego"
            X.0qQ.A0C(r3, r0)
            X.3Y6 r3 = (X.AnonymousClass3Y6) r3
            X.1Xj r5 = r4.A01
            X.1Xy r0 = r5.A0C
            java.util.List r0 = r0.C8S()
            if (r0 == 0) goto L_0x02c0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02c0
            X.JwC r0 = r3.A01
            if (r0 == 0) goto L_0x02bd
            java.lang.Object r2 = r0.A00
            X.JwC r2 = (X.C61074JwC) r2
        L_0x01eb:
            r0 = 0
            if (r2 == 0) goto L_0x01f6
            java.lang.Object r1 = r2.A00
            X.JwI r1 = (X.C61080JwI) r1
            if (r1 == 0) goto L_0x01f6
            java.lang.Object r0 = r1.A00
        L_0x01f6:
            com.instagram.api.schemas.RIXUCoverElementMetadataType r1 = com.instagram.api.schemas.RIXUCoverElementMetadataType.LIKED_BY_FACEPILE_WITH_HEART
            if (r0 == r1) goto L_0x021a
            if (r2 == 0) goto L_0x02c0
            java.lang.Object r0 = r2.A01
            X.JwI r0 = (X.C61080JwI) r0
            if (r0 == 0) goto L_0x0206
            java.lang.Object r0 = r0.A00
            if (r0 == r1) goto L_0x021a
        L_0x0206:
            java.lang.Object r0 = r2.A02
            X.JwI r0 = (X.C61080JwI) r0
            if (r0 == 0) goto L_0x0210
            java.lang.Object r0 = r0.A00
            if (r0 == r1) goto L_0x021a
        L_0x0210:
            java.lang.Object r0 = r2.A03
            X.JwI r0 = (X.C61080JwI) r0
            if (r0 == 0) goto L_0x02c0
            java.lang.Object r0 = r0.A00
            if (r0 != r1) goto L_0x02c0
        L_0x021a:
            r12 = 1
        L_0x021b:
            com.instagram.common.session.UserSession r9 = r6.A01
            X.0iw r11 = r6.A00
            java.lang.String r10 = r4.A03
            com.instagram.api.schemas.ClipsIFUType r8 = r4.A00
            r7 = 4
            r6 = 2
            r4 = 5
            r0 = 3
            X.0qQ.A0B(r3, r0)
            X.0wc r2 = X.AnonymousClass0kN.A01(r11, r9)
            java.lang.String r1 = "instagram_clips_in_feed_unit_card_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            java.lang.String r1 = r11.getModuleName()
            java.lang.String r0 = "containermodule"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "tray_session_id"
            r2.AAJ(r0, r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.String r0 = "client_position"
            r2.A8k(r0, r1)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.User r0 = r5.A2A(r9)
            if (r0 == 0) goto L_0x02bb
            com.instagram.user.model.FollowStatus r0 = r0.B6o()
        L_0x0259:
            java.lang.String r1 = X.1aC.A06(r0)
            java.lang.String r0 = "follow_status"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r5.getId()
            if (r1 == 0) goto L_0x0324
            java.lang.String r0 = "m_pk"
            r2.AAJ(r0, r1)
            X.1Xy r0 = r5.A0C
            java.lang.String r1 = r0.getLoggingInfoToken()
            java.lang.String r0 = "ranking_info_token"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            java.lang.String r0 = "timespent"
            r2.A9F(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "is_social_thumbnails_visible"
            r2.A7p(r0, r1)
            int r0 = r8.ordinal()
            if (r0 == r7) goto L_0x02ad
            if (r0 == r4) goto L_0x02aa
            if (r0 != r6) goto L_0x02a6
            X.5OC r1 = X.AnonymousClass5OC.FEED_MUSIC_DROPS
        L_0x02a1:
            java.lang.String r0 = "action_source"
            r2.A8M(r1, r0)
        L_0x02a6:
            r2.Cgf()
            return
        L_0x02aa:
            X.5OC r1 = X.AnonymousClass5OC.FEED_TRENDING
            goto L_0x02a1
        L_0x02ad:
            com.instagram.clips.intf.ClipsViewerSource r1 = r3.A01()
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_SUGGESTED_FEED_CONTEXTUAL_CHAIN
            if (r1 != r0) goto L_0x02b8
            X.5OC r1 = X.AnonymousClass5OC.EXPLORE_MEDIA_CHAIN_SUGGESTED
            goto L_0x02a1
        L_0x02b8:
            X.5OC r1 = X.AnonymousClass5OC.FEED_SUGGESTED
            goto L_0x02a1
        L_0x02bb:
            r0 = 0
            goto L_0x0259
        L_0x02bd:
            r2 = 0
            goto L_0x01eb
        L_0x02c0:
            r12 = 0
            goto L_0x021b
        L_0x02c3:
            r2 = r1
            X.2p4 r2 = (X.AnonymousClass2p4) r2
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.Object r7 = r4.second
            X.Vc5 r7 = (X.C17674Vc5) r7
            java.lang.Object r3 = r4.first
            X.3UH r3 = (X.AnonymousClass3UH) r3
            java.lang.String r8 = r3.A0C
            if (r8 != 0) goto L_0x02d8
            java.lang.String r8 = ""
        L_0x02d8:
            java.lang.Integer r0 = X.C18214Vne.A00(r7)
            r0.getClass()
            int r1 = r0.intValue()
            r13 = 0
            if (r1 == r13) goto L_0x0340
            r0 = 1
            if (r1 == r0) goto L_0x032c
            r0 = 2
            if (r1 != r0) goto L_0x0047
            X.2p0 r2 = r2.A00
            int r21 = r5.intValue()
            int r1 = r3.A01
            java.lang.String r0 = r3.A0F
            if (r0 != 0) goto L_0x02fa
            java.lang.String r0 = ""
        L_0x02fa:
            java.lang.String r19 = "topic_card"
            r16 = r2
            r17 = r7
            r18 = r8
            r20 = r0
            r22 = r1
            r23 = r14
            r16.DLJ(r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x030c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0312:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0318:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x031e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0324:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x032c:
            X.2p0 r6 = r2.A00
            int r11 = r5.intValue()
            int r12 = r3.A01
            java.lang.String r10 = r3.A0F
            if (r10 != 0) goto L_0x033a
            java.lang.String r10 = ""
        L_0x033a:
            java.lang.String r9 = "preview"
            r6.DLO(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0340:
            X.2p0 r2 = r2.A00
            int r21 = r5.intValue()
            int r1 = r3.A01
            java.lang.String r0 = r3.A0F
            if (r0 != 0) goto L_0x034e
            java.lang.String r0 = ""
        L_0x034e:
            java.lang.String r19 = "preview"
            r16 = r2
            r17 = r7
            r18 = r8
            r20 = r0
            r22 = r1
            r23 = r14
            r16.DLH(r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229202n0.A01(java.lang.Object, long, java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r7, X.C252093oY r8) {
        /*
            r6 = this;
            java.lang.Integer r1 = r8.CEk(r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0022
            float r1 = r8.CFe(r7)
            X.2nC r4 = r6.A05
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            java.lang.String r3 = r7.A05
            float r2 = r8.CFe(r7)
            long r0 = r8.BlK()
            r4.A01(r3, r2, r0)
        L_0x0021:
            return
        L_0x0022:
            java.lang.Integer r1 = r8.CEk(r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0078
            float r1 = r8.CFe(r7)
            X.2nC r5 = r6.A05
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0078
            java.lang.String r2 = r7.A05
            long r0 = r8.BlK()
            long r3 = r5.A00(r2, r0)
            X.01r r0 = r5.A01
            r0.remove(r2)
        L_0x0045:
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0021
            X.2n2 r0 = r6.A04
            java.lang.String r5 = r0.BK2(r7)
            X.2nB r2 = r6.A03
            X.1Bk r0 = r2.A00
            boolean r0 = r0.A0F(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0068
            java.lang.Object r1 = r7.A03
            java.lang.Object r0 = r7.A04
            r6.A01(r1, r3, r0)
        L_0x0064:
            r2.A02(r5)
            return
        L_0x0068:
            long r0 = r6.A00
            boolean r0 = r2.A03(r5, r0)
            if (r0 == 0) goto L_0x0021
            java.lang.Object r1 = r7.A03
            java.lang.Object r0 = r7.A04
            r6.A00(r1, r3, r0)
            goto L_0x0064
        L_0x0078:
            r3 = -1
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229202n0.ATF(X.30Y, X.3oY):void");
    }

    public C229202n0(1Bk r7, C229222n2 r8) {
        C229312nB r5 = new C229312nB(r7, C61410nE.A00);
        C229322nC r0 = new C229322nC(0.5f);
        long j = A06;
        long j2 = A07;
        this.A03 = r5;
        this.A05 = r0;
        this.A04 = r8;
        this.A02 = r7;
        this.A01 = j;
        this.A00 = r7.A0G("override_staleTime_in_testMode", false) ? TimeUnit.MINUTES.toMillis(0) : j2;
    }
}
