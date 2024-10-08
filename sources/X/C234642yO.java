package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2yO  reason: invalid class name and case insensitive filesystem */
public final class C234642yO extends C230372pW {
    public final UserSession A00;
    public final C232852uY A01;
    public final AnonymousClass4DU A02;

    public C234642yO(1Bk r2, UserSession userSession, C232852uY r4, AnonymousClass4DU r5) {
        super(r2, new C234652yP());
        this.A00 = userSession;
        this.A01 = r4;
        this.A02 = r5;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        0jB r4;
        C294175lz r3;
        Long valueOf;
        Long l;
        String str;
        long j;
        String str2;
        String str3;
        C263944Ny r1;
        Boolean bool;
        List list;
        Map map;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z;
        String str11;
        Long l2;
        String str12;
        String str13;
        String str14;
        Long l3;
        long j2;
        String str15;
        String str16;
        Long l4;
        Boolean bool2;
        String str17;
        String str18;
        String str19;
        int intValue;
        1Xj r10 = (1Xj) obj;
        AnonymousClass4HA r12 = (AnonymousClass4HA) obj2;
        0qQ.A0B(r10, 0);
        0qQ.A0B(r12, 1);
        AnonymousClass3W1 r0 = r12.A01;
        UserSession userSession = this.A00;
        int position = r0.getPosition();
        int i = r12.A00;
        Integer valueOf2 = Integer.valueOf(r0.A0W);
        AnonymousClass4DU r11 = this.A02;
        C232852uY r6 = this.A01;
        0qQ.A0B(r6, 6);
        0wc A002 = AnonymousClass0kN.A00(r11, 0kJ.A03, userSession);
        0Aj A003 = A002.A00(A002.A00, "instagram_organic_carousel_impression");
        0t0 A012 = AnonymousClass0eN.A01(new AnonymousClass9L2(userSession, 31));
        if (A003.isSampled()) {
            Long l5 = null;
            if (r11 instanceof C232682uF) {
                r4 = ((C232682uF) r11).E4l(r10);
            } else {
                r4 = null;
            }
            ArrayList A3K = r10.A3K(true);
            if (A3K == null || !(!A3K.isEmpty())) {
                r3 = null;
            } else {
                r3 = C294165ly.A05(r10, Integer.valueOf(i));
            }
            A003.AAJ("module_name", r11.getModuleName());
            A003.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A003.AAJ("m_pk", r10.getId());
            A003.A9F("m_t", Long.valueOf((long) r10.BR7().A00));
            if (position == -1) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf((long) position);
            }
            A003.A9F("m_ix", valueOf);
            User A2A = r10.A2A(userSession);
            if (A2A != null) {
                l = 00y.A0n(10, A2A.getId());
            } else {
                l = null;
            }
            A003.A9F("a_pk", l);
            A003.AAJ(C21058XCk.A01(21, 10, 4), C254443sU.A0A(r4, r6));
            A003.A9F("m_ts", Long.valueOf(r10.A1A()));
            if (r4 != null) {
                str = (String) r4.A01(C271774jZ.A6S);
            } else {
                str = null;
            }
            A003.AAJ("parent_m_pk", str);
            A003.A9F("carousel_m_t", C254443sU.A07(r10, i));
            A003.AAJ("inventory_source", r10.A0C.BIl());
            A003.AAJ("delivery_flags", C243413Yr.A00(r10.A0e));
            if (AnonymousClass1GD.A03()) {
                j = 1;
            } else {
                j = 0;
            }
            A003.A9F("is_dark_mode", Long.valueOf(j));
            if (r4 != null) {
                str2 = (String) r4.A01(C271774jZ.A9i);
            } else {
                str2 = null;
            }
            A003.AAJ("viewer_session_id", str2);
            A003.AAJ("tracking_token", C254443sU.A0E(userSession, r10, r11));
            A003.AAJ("ranking_info_token", r10.A0C.getLoggingInfoToken());
            A003.AAJ("mezql_token", r10.A0C.getMezqlToken());
            if (r4 != null) {
                str3 = (String) r4.A01(C14073TpN.A00);
            } else {
                str3 = null;
            }
            A003.AAJ("search_session_id", str3);
            A003.A9F("carousel_index", C254443sU.A06(r10, i));
            A003.AAJ("carousel_media_id", C254443sU.A0H(r10, i));
            A003.AAJ("carousel_cover_media_id", C254443sU.A0G(r10, i));
            A003.A9F("carousel_size", C254443sU.A08(r10, i));
            if (r3 != null) {
                r1 = r3.A00;
            } else {
                r1 = null;
            }
            A003.AAE(r1, "merchant_id");
            if (r3 != null) {
                bool = r3.A01;
            } else {
                bool = null;
            }
            A003.A7p("is_checkout_enabled", bool);
            if (r3 != null) {
                list = r3.A03;
            } else {
                list = null;
            }
            A003.AAe("product_ids", list);
            if (r3 != null) {
                map = r3.A08;
            } else {
                map = null;
            }
            A003.A9H("product_merchant_ids", map);
            if (r4 != null) {
                str4 = (String) r4.A01(C271774jZ.A9D);
            } else {
                str4 = null;
            }
            A003.AAJ("topic_cluster_id", str4);
            if (r4 != null) {
                str5 = (String) r4.A01(C271774jZ.A9F);
            } else {
                str5 = null;
            }
            A003.AAJ("topic_cluster_title", str5);
            if (r4 != null) {
                str6 = (String) r4.A01(C271774jZ.A9G);
            } else {
                str6 = null;
            }
            A003.AAJ("topic_cluster_type", str6);
            if (r4 != null) {
                str7 = (String) r4.A01(C271774jZ.A9C);
            } else {
                str7 = null;
            }
            A003.AAJ("topic_cluster_debug_info", str7);
            if (r4 != null) {
                str8 = (String) r4.A01(C297705sC.A00);
            } else {
                str8 = null;
            }
            A003.AAJ("entity_follow_status", str8);
            A003.A9F("entity_id", C254443sU.A02(r4));
            if (r4 != null) {
                str9 = (String) r4.A01(C297705sC.A02);
            } else {
                str9 = null;
            }
            A003.AAJ("entity_name", str9);
            if (r4 != null) {
                str10 = (String) r4.A01(C297705sC.A06);
            } else {
                str10 = null;
            }
            A003.AAJ("entity_type", str10);
            A003.A9F("entity_page_id", C254443sU.A03(r4));
            A003.AAJ("entity_page_name", C254443sU.A09(r4));
            A003.A7p("is_eof", r10.A0C.CSj());
            Long l6 = null;
            if (!(valueOf2 == null || (intValue = valueOf2.intValue()) == -1)) {
                l6 = Long.valueOf((long) intValue);
            }
            A003.A9F("recs_ix", l6);
            A003.AAJ("feed_request_id", r10.A0R);
            if (r10.A5Y()) {
                z = true;
            } else {
                z = null;
            }
            A003.A7p("is_igtv", z);
            A003.AAJ("source_of_action", r11.getModuleName());
            if (r4 != null) {
                str11 = (String) r4.A01(C271774jZ.A1C);
            } else {
                str11 = null;
            }
            A003.AAJ("chaining_session_id", str11);
            if (r4 != null) {
                l2 = (Long) r4.A01(C271774jZ.A1A);
            } else {
                l2 = null;
            }
            A003.A9F("chaining_position", l2);
            A003.AAJ("last_navigation_module", C71342cb.A00(userSession).A0D);
            if (r4 != null) {
                str12 = (String) r4.A01(C52240GKh.A00);
            } else {
                str12 = null;
            }
            A003.AAJ("collection_id", str12);
            if (r4 != null) {
                str13 = (String) r4.A01(C52240GKh.A01);
            } else {
                str13 = null;
            }
            A003.AAJ("collection_name", str13);
            A003.A9F("hashtag_id", C254443sU.A04(r4, r10));
            A003.AAJ("hashtag_name", C254443sU.A0C(r4, r10));
            if (r4 != null) {
                str14 = (String) r4.A01(C298085sr.A00);
            } else {
                str14 = null;
            }
            A003.AAJ("hashtag_feed_type", str14);
            A003.A7p("is_app_backgrounded", Boolean.valueOf(14i.A08()));
            if (r10.A4z()) {
                l3 = Long.valueOf((long) r10.A6i().length);
            } else {
                l3 = null;
            }
            A003.A9F("sponsor_tag_count", l3);
            A003.AAJ("action", C254443sU.A0F(r10));
            A003.AAJ("follow_status", C254443sU.A0D(userSession, r10));
            A003.A8D("elapsed_time_since_last_item", Double.valueOf(-1.0d));
            A003.A7p("is_acp_delivered", false);
            if (C71342cb.A00(userSession).A03 != null) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            A003.A9F("nav_in_transit", Long.valueOf(j2));
            A003.A9F("imp_logger_ver", 24L);
            if (r4 != null) {
                str15 = (String) r4.A01(AnonymousClass5m1.A00);
            } else {
                str15 = null;
            }
            A003.AAJ("media_thumbnail_section", str15);
            A003.AAe("tagged_user_ids", C254443sU.A0J(r10));
            String A0I = C254443sU.A0I(r10, i);
            if (A0I != null) {
                l5 = 00y.A0n(10, A0I);
            }
            A003.A9F("main_feed_carousel_starting_media_id", l5);
            A003.AAJ("connection_id", r10.A0C.getConnectionId());
            if (r4 != null) {
                str16 = (String) r4.A01(C271774jZ.A2R);
            } else {
                str16 = null;
            }
            A003.AAJ("endpoint_type", str16);
            A003.AAJ("hashtag_follow_status", C254443sU.A0B(r4, r10));
            if (r4 != null) {
                l4 = (Long) r4.A01(AnonymousClass5m1.A01);
            } else {
                l4 = null;
            }
            A003.A9F("tab_index", l4);
            if (r3 != null) {
                bool2 = Boolean.valueOf(r10.A6X(userSession));
            } else {
                bool2 = null;
            }
            A003.A7p("is_influencer", bool2);
            A003.AAJ("ad_id", C231122qu.A07(userSession, r10));
            A003.A9F("top_liker_count", C254443sU.A05(userSession, r10));
            if (r4 != null) {
                str17 = (String) r4.A01(C297705sC.A05);
            } else {
                str17 = null;
            }
            A003.AAJ("entity_page_type", str17);
            if (r4 != null) {
                str18 = (String) r4.A01(C297695sB.A01);
            } else {
                str18 = null;
            }
            A003.AAJ("rank_token", str18);
            C249763kK r02 = r6.A01;
            if (r02 != null) {
                str19 = r02.getSessionId();
            } else {
                str19 = null;
            }
            A003.AAJ("ranking_session_id", str19);
            A003.A9F("dark_mode_state", Long.valueOf((long) AnonymousClass0xl.A00(C61170le.A00).A00()));
            A003.A7p("post_impression_column_override", true);
            A012.getValue();
            A003.AAJ("direct_reshare_hub_session_id", (String) null);
            A003.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A003.AAJ("device_aspect_ratio_category", C254473sX.A00);
            A003.AAJ("device_fold_orientation", C254483sY.A00);
            A003.AAJ("device_fold_state", C254493sZ.A00);
            A003.A7p("device_is_in_multi_window_mode", C254503sa.A00);
            A003.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        0jB r6;
        C294175lz r5;
        C294175lz r4;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        Map map;
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j8;
        Long valueOf;
        String str8;
        String str9;
        String str10;
        ArrayList arrayList;
        Long l2;
        String str11;
        String str12;
        String str13;
        String str14;
        List list;
        List list2;
        C263944Ny r1;
        Map map2;
        Boolean bool;
        Long A0n;
        Long A0n2;
        ArrayList A3K;
        1Xj r13 = (1Xj) obj;
        AnonymousClass4HA r12 = (AnonymousClass4HA) obj2;
        0qQ.A0B(r13, 0);
        0qQ.A0B(r12, 1);
        AnonymousClass3W1 r21 = r12.A01;
        UserSession userSession = this.A00;
        int i = r12.A00;
        AnonymousClass4DU r10 = this.A02;
        C232852uY r9 = this.A01;
        0qQ.A0B(r9, 5);
        0wc A002 = AnonymousClass0kN.A00(r10, 0kJ.A03, userSession);
        0Aj A003 = A002.A00(A002.A00, "instagram_organic_carousel_sub_impression");
        if (A003.isSampled()) {
            if (r10 instanceof C232682uF) {
                r6 = ((C232682uF) r10).E4l(r13);
            } else {
                r6 = null;
            }
            1Xj A1c = r13.A1c(i);
            if (A1c == null || (A3K = A1c.A3K(true)) == null || !(!A3K.isEmpty())) {
                r5 = null;
            } else {
                r5 = C294165ly.A04(r13);
            }
            ArrayList A3K2 = r13.A3K(true);
            if (A3K2 == null || !(!A3K2.isEmpty())) {
                r4 = null;
            } else {
                r4 = C294165ly.A05(r13, Integer.valueOf(i));
            }
            String A0H = C254443sU.A0H(r13, i);
            String str15 = "";
            if (A0H == null) {
                A0H = str15;
            }
            String A0G = C254443sU.A0G(r13, i);
            String A06 = 1Xv.A06(A0H);
            0qQ.A0B(A06, 0);
            Long A0n3 = 00y.A0n(10, A06);
            long j9 = -1;
            if (A0n3 != null) {
                j = A0n3.longValue();
            } else {
                j = -1;
            }
            A003.A9F("carousel_media_id_int", Long.valueOf(j));
            String str16 = A0G;
            if (A0G == null) {
                str16 = str15;
            }
            String A062 = 1Xv.A06(str16);
            0qQ.A0B(A062, 0);
            Long A0n4 = 00y.A0n(10, A062);
            if (A0n4 != null) {
                j2 = A0n4.longValue();
            } else {
                j2 = -1;
            }
            A003.A9F("carousel_cover_media_id_int", Long.valueOf(j2));
            A003.AAJ("application_state", AnonymousClass5BB.A00());
            if (A0G == null) {
                A0G = str15;
            }
            A003.AAJ("carousel_cover_media_id", A0G);
            A003.A9F("carousel_index", Long.valueOf((long) i));
            String id = r13.getId();
            if (id != null) {
                String A063 = 1Xv.A06(id);
                0qQ.A0B(A063, 0);
                Long A0n5 = 00y.A0n(10, A063);
                if (A0n5 != null) {
                    j3 = A0n5.longValue();
                } else {
                    j3 = -1;
                }
                A003.A9F("carousel_container_media_id", Long.valueOf(j3));
                A003.AAJ("carousel_media_id", A0H);
                Long A07 = C254443sU.A07(r13, i);
                if (A07 != null) {
                    j4 = A07.longValue();
                } else {
                    j4 = -1;
                }
                A003.A9F("carousel_media_type", Long.valueOf(j4));
                Long A08 = C254443sU.A08(r13, i);
                if (A08 != null) {
                    j5 = A08.longValue();
                } else {
                    j5 = -1;
                }
                A003.A9F("carousel_size", Long.valueOf(j5));
                String A004 = C243413Yr.A00(r13.A0e);
                if (A004 == null) {
                    A004 = str15;
                }
                A003.AAJ("delivery_flags", A004);
                String str17 = r13.A0R;
                if (str17 == null) {
                    str17 = str15;
                }
                A003.AAJ("feed_request_id", str17);
                String BIl = r13.A0C.BIl();
                if (BIl == null) {
                    BIl = str15;
                }
                A003.AAJ("inventory_source", BIl);
                String id2 = r13.getId();
                if (id2 == null) {
                    id2 = str15;
                }
                A003.AAJ("m_pk", id2);
                A003.A9F("media_loading_progress", Long.valueOf(C254443sU.A00(r13, r21)));
                long j10 = (long) r13.BR7().A00;
                if (Long.valueOf(j10) == null) {
                    j10 = -1;
                }
                A003.A9F("media_type", Long.valueOf(j10));
                A003.A7p("post_impression_column_override", true);
                String loggingInfoToken = r13.A0C.getLoggingInfoToken();
                if (loggingInfoToken == null) {
                    loggingInfoToken = str15;
                }
                A003.AAJ("ranking_info_token", loggingInfoToken);
                String A0A = C254443sU.A0A(r6, r9);
                if (A0A == null) {
                    A0A = str15;
                }
                A003.AAJ(C21058XCk.A01(21, 10, 4), A0A);
                String str18 = AnonymousClass1QI.A00.A02.A00;
                if (str18 == null) {
                    str18 = str15;
                }
                A003.AAJ("nav_chain", str18);
                String A0E = C254443sU.A0E(userSession, r13, r10);
                if (A0E == null) {
                    A0E = str15;
                }
                A003.AAJ("tracking_token", A0E);
                String A064 = 1Xv.A06(A0H);
                if (A064 == null || (A0n2 = 00y.A0n(10, A064)) == null) {
                    j6 = -1;
                } else {
                    j6 = A0n2.longValue();
                }
                A003.A9F("media_id", Long.valueOf(j6));
                User A2A = r13.A2A(userSession);
                if (A2A == null || (A0n = 00y.A0n(10, A2A.getId())) == null) {
                    j7 = -1;
                } else {
                    j7 = A0n.longValue();
                }
                A003.A9F("media_author_id", Long.valueOf(j7));
                A003.AAJ("module_name", r10.getModuleName());
                if (r5 != null) {
                    map = r5.A07;
                } else {
                    map = null;
                }
                A003.A9H("carousel_media_product_ids", map);
                String str19 = null;
                A003.A9F("carousel_opt_in_position", (Long) null);
                String A0I = C254443sU.A0I(r13, i);
                if (A0I != null) {
                    str15 = A0I;
                }
                String A065 = 1Xv.A06(str15);
                0qQ.A0B(A065, 0);
                Long A0n6 = 00y.A0n(10, A065);
                if (A0n6 != null) {
                    j9 = A0n6.longValue();
                }
                A003.A9F("carousel_starting_media_id", Long.valueOf(j9));
                A003.AAJ("chaining_feed_session_id", (String) null);
                if (r6 != null) {
                    l = (Long) r6.A01(C271774jZ.A1A);
                } else {
                    l = null;
                }
                A003.A9F("chaining_position", l);
                if (r6 != null) {
                    str19 = (String) r6.A01(C271774jZ.A1C);
                }
                A003.AAJ("chaining_session_id", str19);
                A003.A9F("chaining_seed_author_id", (Long) null);
                A003.A9F("chaining_seed_media_id", (Long) null);
                if (r6 != null) {
                    str = (String) r6.A01(C52240GKh.A00);
                } else {
                    str = null;
                }
                A003.AAJ("collection_id", str);
                if (r6 != null) {
                    str2 = (String) r6.A01(C52240GKh.A01);
                } else {
                    str2 = null;
                }
                A003.AAJ("collection_name", str2);
                A003.AAJ("connection_id", r13.A0C.getConnectionId());
                A003.A9F("dr_ad_type", (Long) null);
                if (r6 != null) {
                    str3 = (String) r6.A01(C271774jZ.A2R);
                } else {
                    str3 = null;
                }
                A003.AAJ("endpoint_type", str3);
                if (r6 != null) {
                    str4 = (String) r6.A01(C297705sC.A00);
                } else {
                    str4 = null;
                }
                A003.AAJ("entity_follow_status", str4);
                A003.A9F("entity_id", C254443sU.A02(r6));
                if (r6 != null) {
                    str5 = (String) r6.A01(C297705sC.A02);
                } else {
                    str5 = null;
                }
                A003.AAJ("entity_name", str5);
                A003.A9F("entity_page_id", C254443sU.A03(r6));
                A003.AAJ("entity_page_name", C254443sU.A09(r6));
                if (r6 != null) {
                    str6 = (String) r6.A01(C297705sC.A06);
                } else {
                    str6 = null;
                }
                A003.AAJ("entity_type", str6);
                A003.AAJ("explore_topic_session_id", (String) null);
                A003.AAJ("gating_type", (String) null);
                if (r6 != null) {
                    str7 = (String) r6.A01(C298085sr.A00);
                } else {
                    str7 = null;
                }
                A003.AAJ("hashtag_feed_type", str7);
                A003.AAJ("hashtag_follow_status", C254443sU.A0B(r6, r13));
                A003.A9F("hashtag_id", C254443sU.A04(r6, r13));
                A003.AAJ("hashtag_name", C254443sU.A0C(r6, r13));
                A003.A7p("is_acp_delivered", false);
                A003.A7p("is_ad", (Boolean) null);
                if (AnonymousClass1GD.A03()) {
                    j8 = 1;
                } else {
                    j8 = 0;
                }
                A003.A9F("is_dark_mode", Long.valueOf(j8));
                A003.A7p("is_eof", r13.A0C.CSj());
                int position = r21.getPosition();
                if (position == -1) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf((long) position);
                }
                A003.A9F("m_ix", valueOf);
                if (r6 != null) {
                    str8 = (String) r6.A01(AnonymousClass5m1.A00);
                } else {
                    str8 = null;
                }
                A003.AAJ("media_thumbnail_section", str8);
                A003.AAJ("mezql_token", r13.A0C.getMezqlToken());
                if (r6 != null) {
                    str9 = (String) r6.A01(C271774jZ.A6S);
                } else {
                    str9 = null;
                }
                A003.AAJ("parent_m_pk", str9);
                C249763kK r0 = r9.A01;
                if (r0 != null) {
                    str10 = r0.getSessionId();
                } else {
                    str10 = null;
                }
                A003.AAJ("ranking_session_id", str10);
                A003.A9F("sponsor_tag_id", (Long) null);
                if (r13.A4z()) {
                    List<String> A0a = 00k.A0a(03t.A0I(r13.A6i()));
                    arrayList = new ArrayList(0Yv.A1E(A0a, 10));
                    for (String parseLong : A0a) {
                        arrayList.add(Long.valueOf(Long.parseLong(parseLong)));
                    }
                } else {
                    arrayList = null;
                }
                A003.AAe("sponsor_tag_ids", arrayList);
                if (r6 != null) {
                    l2 = (Long) r6.A01(AnonymousClass5m1.A01);
                } else {
                    l2 = null;
                }
                A003.A9F("tab_index", l2);
                A003.AAe("tagged_user_ids", C254443sU.A0J(r13));
                if (r6 != null) {
                    str11 = (String) r6.A01(C271774jZ.A9C);
                } else {
                    str11 = null;
                }
                A003.AAJ("topic_cluster_debug_info", str11);
                if (r6 != null) {
                    str12 = (String) r6.A01(C271774jZ.A9D);
                } else {
                    str12 = null;
                }
                A003.AAJ("topic_cluster_id", str12);
                if (r6 != null) {
                    str13 = (String) r6.A01(C271774jZ.A9F);
                } else {
                    str13 = null;
                }
                A003.AAJ("topic_cluster_title", str13);
                if (r6 != null) {
                    str14 = (String) r6.A01(C271774jZ.A9G);
                } else {
                    str14 = null;
                }
                A003.AAJ("topic_cluster_type", str14);
                A003.AAJ("action", C254443sU.A0F(r13));
                if (r4 != null) {
                    list = r4.A03;
                } else {
                    list = null;
                }
                A003.AAe("product_ids", list);
                if (r4 != null) {
                    list2 = r4.A02;
                } else {
                    list2 = null;
                }
                A003.AAe("drop_product_ids", list2);
                A003.AAe("shared_product_ids", (List) null);
                if (r4 != null) {
                    r1 = r4.A00;
                } else {
                    r1 = null;
                }
                A003.AAE(r1, "merchant_id");
                A003.A9F("product_id", (Long) null);
                if (r4 != null) {
                    map2 = r4.A08;
                } else {
                    map2 = null;
                }
                A003.A9H("product_merchant_ids", map2);
                if (r4 != null) {
                    bool = r4.A01;
                } else {
                    bool = null;
                }
                A003.A7p("is_checkout_enabled", bool);
                A003.A9F("reel_size", (Long) null);
                A003.A9F("reel_position", (Long) null);
                A003.A9F("tray_position", (Long) null);
                A003.A9F("reel_viewer_position", (Long) null);
                A003.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                A003.AAJ("device_aspect_ratio_category", C254473sX.A00);
                A003.AAJ("device_fold_orientation", C254483sY.A00);
                A003.AAJ("device_fold_state", C254493sZ.A00);
                A003.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                A003.Cgf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
