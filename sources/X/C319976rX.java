package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.profile.analytics.ProfileSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.6rX  reason: invalid class name and case insensitive filesystem */
public final class C319976rX {
    public static final C319976rX A00 = new Object();

    public static final C319986rY A00(UserSession userSession, User user) {
        0qQ.A0B(userSession, 1);
        if (user != null) {
            if (userSession.A06.equals(user.getId())) {
                return C319986rY.SELF;
            }
            if (AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A05) {
                return C319986rY.FOLLOWING;
            }
        }
        return C319986rY.NOT_FOLLOWING;
    }

    public static final void A03(C3263576k r16, C69445Nlp nlp, UserSession userSession, C319986rY r19, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        C319986rY r4 = r19;
        0qQ.A0B(r4, 3);
        A02(r16, nlp, new 0xG(str), userSession, r4, (Boolean) null, (Boolean) null, Integer.valueOf(i), (Long) null, (Long) null, (Long) null, str2, str3, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str5, str6, (String) null, (String) null, (String) null, (String) null);
    }

    public static final void A04(AnonymousClass0iw r17, UserSession userSession, C319986rY r19, Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        A02((C3263576k) null, (C69445Nlp) null, r17, userSession, r19, (Boolean) null, (Boolean) null, (Integer) null, (Long) null, (Long) null, l, str, str2, str3, str4, str5, str6, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public static final void A05(AnonymousClass0iw r22, UserSession userSession, C319986rY r24, String str, String str2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        C319986rY r4 = r24;
        0qQ.A0B(r4, 3);
        A02((C3263576k) null, (C69445Nlp) null, r22, userSession2, r4, (Boolean) null, (Boolean) null, (Integer) null, (Long) null, (Long) null, (Long) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public static final void A06(AnonymousClass0iw r21, UserSession userSession, C319986rY r23, String str, String str2, String str3) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        C319986rY r4 = r23;
        0qQ.A0B(r4, 3);
        A02((C3263576k) null, (C69445Nlp) null, r21, userSession2, r4, (Boolean) null, (Boolean) null, (Integer) null, (Long) null, (Long) null, (Long) null, str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public static final void A07(AnonymousClass0iw r20, UserSession userSession, C319986rY r22, String str, String str2, String str3, String str4) {
        A02((C3263576k) null, (C69445Nlp) null, r20, userSession, r22, (Boolean) null, (Boolean) null, (Integer) null, (Long) null, (Long) null, (Long) null, str, str2, (String) null, str3, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public static final void A08(AnonymousClass0iw r19, UserSession userSession, C319986rY r21, String str, String str2, String str3, String str4, String str5) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass0iw r2 = r19;
        0qQ.A0B(r2, 1);
        String str6 = str;
        0qQ.A0B(str6, 2);
        A02((C3263576k) null, (C69445Nlp) null, r2, userSession2, r21, (Boolean) null, (Boolean) null, (Integer) null, (Long) null, (Long) null, (Long) null, str6, str2, str5, str3, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public static final void A09(AnonymousClass0iw r18, UserSession userSession, C319986rY r20, String str, String str2, String str3, String str4, String str5, String str6) {
        C319986rY r4 = r20;
        0qQ.A0B(r4, 3);
        A02((C3263576k) null, (C69445Nlp) null, r18, userSession, r4, (Boolean) null, (Boolean) null, (Integer) null, (Long) null, (Long) null, (Long) null, str, str2, str6, str3, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str5, (String) null, (String) null, (String) null);
    }

    public static final void A0A(AnonymousClass0iw r17, UserSession userSession, C319986rY r19, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C319986rY r4 = r19;
        0qQ.A0B(r4, 3);
        A02((C3263576k) null, (C69445Nlp) null, r17, userSession, r4, (Boolean) null, (Boolean) null, (Integer) null, (Long) null, (Long) null, (Long) null, str, str2, str7, str3, str4, (String) null, (String) null, (String) null, str5, str6, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public static final void A0B(AnonymousClass0iw r1, UserSession userSession, boolean z) {
        String str;
        0qQ.A0B(userSession, 0);
        if (z) {
            str = "click";
        } else {
            str = "impression";
        }
        0wc A01 = AnonymousClass0kN.A01(r1, userSession);
        0Aj A002 = A01.A00(A01.A00, "nme_waterfall_event");
        A002.AAJ("stage", "profile_editing");
        A002.AAJ("substage", "profile");
        A002.AAJ("event", str);
        A002.AAJ("surface", "profile_screen");
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "nme_ig_verified_profile_editing");
        A002.AAJ("event_target", "profile_editing_banner");
        A002.Cgf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.AnonymousClass0iw r7, com.instagram.common.session.UserSession r8, X.1iA r9, java.lang.Long r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.List r19, java.util.List r20, int r21, int r22) {
        /*
            r6 = this;
            r5 = 0
            X.0wc r2 = X.AnonymousClass0kN.A01(r7, r8)
            java.lang.String r1 = "instagram_thumbnail_click"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            r3 = 0
            r1 = r17
            if (r17 == 0) goto L_0x0019
            r0 = 10
            java.lang.Long r4 = X.00y.A0n(r0, r1)     // Catch:{ NumberFormatException -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r4 = r3
        L_0x001a:
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00e0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "is_top_post"
            r2.A7p(r0, r1)
            java.lang.String r0 = "id"
            r2.AAJ(r0, r11)
            java.lang.String r0 = "starting_media_id"
            r2.A9F(r0, r4)
            r1 = r21
            r0 = r22
            java.lang.String r1 = X.C320166rs.A00(r1, r0)
            java.lang.String r0 = "position"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "m_pk"
            r2.AAJ(r0, r11)
            java.lang.String r0 = "pivot_page_session_id"
            r1 = r18
            r2.AAJ(r0, r1)
            java.lang.String r0 = "product_ids"
            r1 = r19
            r2.AAe(r0, r1)
            r1 = r20
            if (r20 == 0) goto L_0x0078
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r1.next()
            X.4Ny r0 = (X.C263944Ny) r0
            java.lang.Long r0 = r0.A00
            r3.add(r0)
            goto L_0x0066
        L_0x0078:
            java.lang.String r0 = "merchant_ids"
            r2.AAe(r0, r3)
            java.lang.String r0 = "ranking_info_token"
            r2.AAJ(r0, r12)
            java.lang.String r0 = "app_attribution_id"
            r2.AAJ(r0, r13)
            if (r14 == 0) goto L_0x00b5
            if (r10 == 0) goto L_0x00b5
            X.B8t r1 = new X.B8t
            r1.<init>()
            java.lang.String r0 = "chain_type"
            r1.A06(r0, r14)
            r0 = 2793(0xae9, float:3.914E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A05(r0, r10)
        L_0x009e:
            java.lang.String r0 = "clip_chain_metadata"
            r2.AAK(r1, r0)
            if (r9 == 0) goto L_0x00ae
            X.5wb r1 = r9.A00()
            java.lang.String r0 = "media_type"
            r2.A8M(r1, r0)
        L_0x00ae:
            if (r15 == 0) goto L_0x00e0
            r3 = r16
            if (r16 == 0) goto L_0x00e0
            goto L_0x00b7
        L_0x00b5:
            r1 = 0
            goto L_0x009e
        L_0x00b7:
            long r0 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x00bc }
            goto L_0x00be
        L_0x00bc:
            r0 = -1
        L_0x00be:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "entity_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "entity_name"
            r2.AAJ(r0, r3)
            java.lang.String r0 = "entity_page_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "entity_page_name"
            r2.AAJ(r0, r3)
            java.lang.String r1 = X.AnonymousClass1K6.A00
            java.lang.String r0 = "canonical_nav_chain"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C319976rX.A0C(X.0iw, com.instagram.common.session.UserSession, X.1iA, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, int):void");
    }

    public final void A0D(AnonymousClass0iw r28, UserSession userSession, C319986rY r30, String str, String str2, String str3, String str4) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass0iw r2 = r28;
        0qQ.A0B(r2, 1);
        A02((C3263576k) null, (C69445Nlp) null, r2, userSession2, r30, (Boolean) null, (Boolean) null, (Integer) null, (Long) null, (Long) null, (Long) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str3, str4);
    }

    public final void A0E(UserSession userSession, C319986rY r12, String str, String str2, String str3, String str4) {
        0qQ.A0B(r12, 3);
        A04(new 0xG(str), userSession, r12, (Long) null, str2, str3, str4, (String) null, (String) null, (String) null);
    }

    public static final C319986rY A01(FollowStatus followStatus) {
        if (followStatus == FollowStatus.A05) {
            return C319986rY.FOLLOWING;
        }
        return C319986rY.NOT_FOLLOWING;
    }

    public static final void A02(C3263576k r8, C69445Nlp nlp, AnonymousClass0iw r10, UserSession userSession, C319986rY r12, Boolean bool, Boolean bool2, Integer num, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        String str17;
        Long l4;
        int i;
        String str18;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r10, 1);
        AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
        r0.A00 = r10;
        0wc A002 = r0.A00();
        0Aj A003 = A002.A00(A002.A00, "ig_profile_action");
        ProfileSession profileSession = (ProfileSession) AnonymousClass3LJ.A00(userSession).A00.get(String.valueOf(System.identityHashCode(r10)));
        0bb r5 = null;
        if (profileSession == null || (str17 = profileSession.A00) == null) {
            ProfileSession profileSession2 = C71342cb.A00(userSession).A04;
            if (profileSession2 != null) {
                str17 = profileSession2.A00;
            } else {
                str17 = null;
            }
        }
        if (A003.isSampled()) {
            A003.AAJ("action", str);
            A003.AAJ("follow_status", r12.A00);
            String str19 = str2;
            if (str2 != null) {
                l4 = 00y.A0n(10, str19);
            } else {
                l4 = null;
            }
            A003.A9F("profile_user_id", l4);
            A003.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            Long l5 = null;
            A003.A9F("product_id", (Long) null);
            A003.AAJ("product_collection_type", (String) null);
            A003.AAJ("click_point", str3);
            A003.AAJ("media_id_attribution", str4);
            A003.AAJ("media_tracking_token_attribution", str5);
            A003.AAJ("subscribed_status", str6);
            A003.AAJ("starting_clips_media_id", str7);
            A003.AAJ("starting_clips_media_ranking_token", str8);
            A003.AAJ("ranking_info_token", str13);
            String str20 = str9;
            if (str9 != null) {
                l5 = 00y.A0n(10, str20);
            }
            A003.A9F("hashtag_id", l5);
            A003.AAJ("hashtag_name", str10);
            A003.AAJ("direct_thread_id", str11);
            if (num != null) {
                i = 0;
                if (num.intValue() == 1) {
                    i = 1;
                }
            } else {
                i = AnonymousClass972.MUTABLE_FLAG_MASK;
            }
            if (i != Integer.MIN_VALUE) {
                A003.A8k("profile_user_type", Integer.valueOf(i));
            } else {
                A003.AAJ("profile_user_type", (String) null);
            }
            A003.AAJ(TraceFieldType.RequestID, str12);
            A003.A8M(r8, "direct_source");
            A003.A8M(nlp, "direct_source_type");
            A003.A9F("time_on_profile", l);
            A003.A9F("badge_num_notifs", l2);
            A003.AAJ("highlight_reel_id_str", str14);
            A003.A7p("seen_state_ring", bool);
            SearchContext searchContext = C324636ze.A00(userSession).A00;
            if (searchContext != null) {
                r5 = new 0bb();
                r5.A06("search_session_id", searchContext.A05);
                r5.A06("rank_token", searchContext.A03);
                r5.A06("query_text", searchContext.A02);
                r5.A06("serp_session_id", searchContext.A06);
                r5.A06("click_id", searchContext.A00);
            }
            A003.AAK(r5, "search_context");
            A003.A9F("num_profile_banners", l3);
            A003.AAJ("h2g_migration_status", str15);
            A003.AAJ("h2g_migration_screen_toggle_end_state", str16);
            if (bool2 != null) {
                if (bool2.equals(true)) {
                    str18 = "CARDS";
                } else {
                    str18 = "DEFAULT";
                }
                A003.AAJ("highlight_cover_size", str18);
            }
            if (str17 != null) {
                A003.AAJ("profile_session_id", str17);
            }
            A003.Cgf();
        }
    }
}
