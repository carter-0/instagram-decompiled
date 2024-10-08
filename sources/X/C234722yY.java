package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.Serializable;

/* renamed from: X.2yY  reason: invalid class name and case insensitive filesystem */
public final class C234722yY extends C229202n0 {
    public final UserSession A00;
    public final C232852uY A01;
    public final AnonymousClass4DU A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C234722yY(1Bk r2, UserSession userSession, C229222n2 r4, C232852uY r5, AnonymousClass4DU r6) {
        super(r2, r4);
        0qQ.A0B(r4, 4);
        this.A00 = userSession;
        this.A01 = r5;
        this.A02 = r6;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        Long l;
        Long valueOf;
        Long l2;
        Long l3;
        long j2;
        Long l4;
        Long l5;
        Long l6;
        String str;
        long j3;
        Long l7;
        Long l8;
        1Xj r14 = (1Xj) obj;
        AnonymousClass3W1 r6 = (AnonymousClass3W1) obj2;
        0qQ.A0B(r14, 0);
        0qQ.A0B(r6, 1);
        C232852uY r13 = this.A01;
        AnonymousClass4DU r15 = this.A02;
        C254523sc A05 = r13.A05(r14, r15, "viewed_impression", r6.getPosition(), r6.A0W);
        if (A05 != null) {
            A05.A03();
            C233822wX.A0X(A05, r14, r6.A03);
            C233822wX.A0Y(A05, r14, r6.A03);
            UserSession userSession = this.A00;
            0wc A012 = AnonymousClass0kN.A01(r15, userSession);
            0Aj A002 = A012.A00(A012.A00, "instagram_organic_sub_viewed_impression");
            if (A002.isSampled()) {
                0jB A013 = A05.A01();
                0xF r5 = A05.A00().A06;
                int i = r6.A03;
                C294175lz A04 = C294165ly.A04(r14);
                A002.AAJ("follow_status", C294185m0.A06(userSession, r14));
                A002.A9F("carousel_media_id_int", (Long) A013.A01(C271774jZ.A11));
                String A2n = r14.A2n();
                if (A2n != null) {
                    A002.A9F("carousel_container_media_id", 00y.A0n(10, A2n));
                    A002.A9F("carousel_cover_media_id_int", (Long) A013.A01(C271774jZ.A0y));
                    A002.A9F("sponsor_tag_count", (Long) A013.A01(C271774jZ.A8F));
                    A002.AAJ("m_pk", C294185m0.A09(r14));
                    A002.AAJ("tracking_token", C294185m0.A07(userSession, r14, r15));
                    A002.A9F("m_t", Long.valueOf((long) r14.BR7().A00));
                    A002.A9F("hashtag_id", C254443sU.A04(A013, r14));
                    A002.A9O("feed_sticker_media_id", A013.A01(C271774jZ.A2q));
                    A002.AAJ("inventory_source", r14.A0C.BIl());
                    A002.A9F("carousel_index", Long.valueOf((long) i));
                    A002.A7p("is_app_backgrounded", Boolean.valueOf(14i.A08()));
                    A002.AAJ("last_navigation_module", C71342cb.A00(userSession).A03());
                    A002.AAJ("application_state", AnonymousClass5BB.A00());
                    A002.AAJ("hashtag_name", C254443sU.A0C(A013, r14));
                    A002.AAJ("hashtag_feed_type", (String) A013.A01(C298085sr.A00));
                    A002.AAJ("module_name", r15.getModuleName());
                    Integer valueOf2 = Integer.valueOf(i);
                    A002.AAJ("carousel_media_id", C294185m0.A0B(r14, valueOf2));
                    0j9 r12 = C271774jZ.A16;
                    A002.A9F("carousel_starting_media_id", (Long) A013.A01(r12));
                    A002.AAJ("carousel_cover_media_id", (String) A013.A01(C271774jZ.A0x));
                    A002.AAJ("reel_id", (String) A013.A01(C271774jZ.A7T));
                    A002.AAJ("tray_session_id", (String) A013.A01(C271774jZ.A7X));
                    A002.AAJ("viewer_session_id", (String) A013.A01(C271774jZ.A9i));
                    A002.AAJ("ranking_session_id", (String) A013.A01(C271774jZ.A6q));
                    A002.AAJ("chaining_session_id", (String) A013.A01(C271774jZ.A1C));
                    A002.A9F("chaining_position", (Long) A013.A01(C271774jZ.A1A));
                    A002.AAJ("action", C294185m0.A08(r14));
                    A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) A013.A01(C271774jZ.A2e));
                    A002.AAJ("checkout_session_id", r5.A05("checkout_session_id"));
                    A002.A7p("is_checkout_enabled", A04.A01);
                    A002.A7p("can_add_to_bag", r5.A01("can_add_to_bag"));
                    A002.AAE(A04.A00, "merchant_id");
                    A002.AAJ("prior_module", (String) A013.A01(C271774jZ.A6h));
                    String str2 = (String) A013.A01(C271774jZ.A6i);
                    Long l9 = null;
                    if (str2 != null) {
                        l = 00y.A0n(10, str2);
                    } else {
                        l = null;
                    }
                    A002.A9F("product_id", l);
                    A002.AAe("product_ids", A04.A03);
                    int position = r6.getPosition();
                    if (position == -1) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf((long) position);
                    }
                    A002.A9F("m_ix", valueOf);
                    String A052 = r5.A05("chaining_seed_media_id");
                    if (A052 != null) {
                        l2 = 00y.A0n(10, A052);
                    } else {
                        l2 = null;
                    }
                    A002.A9F("chaining_seed_media_id", l2);
                    A002.A9F("chaining_seed_author_id", (Long) A013.A01(C271774jZ.A1B));
                    A002.AAJ("topic_cluster_id", (String) A013.A01(C271774jZ.A9D));
                    A002.AAJ("topic_cluster_title", (String) A013.A01(C271774jZ.A9F));
                    A002.AAJ("topic_cluster_type", (String) A013.A01(C271774jZ.A9G));
                    A002.AAJ("topic_cluster_debug_info", (String) A013.A01(C271774jZ.A9C));
                    A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r5.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                    A002.AAJ("source_of_action", (String) A013.A01(C271774jZ.A8A));
                    A002.A8D("elapsed_time_since_last_item", (Double) A013.A01(C271774jZ.A2P));
                    A002.A9F("m_ts", Long.valueOf(r14.A1A()));
                    A002.A7p("is_acp_delivered", false);
                    A002.AAJ("a_pk", String.valueOf(C294185m0.A00(userSession, r14)));
                    A002.A7p("is_ad", Boolean.valueOf(r14.CcK()));
                    A002.A9F("imp_logger_ver", 24L);
                    A002.AAJ(C21058XCk.A01(21, 10, 4), (String) A013.A01(C271774jZ.A7x));
                    A002.AAJ("delivery_flags", C243413Yr.A00(r14.A0e));
                    A002.AAJ("feed_request_id", (String) A013.A01(C271774jZ.A88));
                    A002.A7p("is_eof", r14.A0C.CSj());
                    A002.A7p("is_highlights_sourced", (Boolean) A013.A01(C271774jZ.A4K));
                    A002.A9F("reel_size", (Long) A013.A01(C271774jZ.A7V));
                    A002.A9F("session_reel_counter", (Long) A013.A01(C271774jZ.A7y));
                    A002.A9F("reel_viewer_position", (Long) A013.A01(C271774jZ.A7b));
                    A002.AAJ("reel_type", (String) A013.A01(C271774jZ.A7Y));
                    A002.A8D("time_elapsed", (Double) A013.A01(C271774jZ.A8z));
                    A002.A8D("media_dwell_time", (Double) A013.A01(C271774jZ.A5F));
                    A002.A8D("media_time_paused", (Double) A013.A01(C271774jZ.A5T));
                    A002.A9F("tray_position", (Long) A013.A01(C271774jZ.A9P));
                    A002.A8D("media_time_elapsed", Double.valueOf(-1.0d));
                    A002.A8D("media_time_remaining", (Double) A013.A01(C271774jZ.A5Z));
                    A002.A8D("media_time_to_load", (Double) A013.A01(C271774jZ.A5Q));
                    A002.A9F("reel_position", (Long) A013.A01(C271774jZ.A7U));
                    A002.A9F("reel_start_position", (Long) A013.A01(C271774jZ.A7W));
                    A002.A7p("is_video_to_carousel", (Boolean) A013.A01(C271774jZ.A4z));
                    A002.A9F("carousel_size", C294185m0.A05(r14, valueOf2));
                    A002.A9F("carousel_m_t", C294185m0.A04(r14, valueOf2));
                    A002.AAJ("story_ranking_token", (String) A013.A01(C271774jZ.A8O));
                    A002.AAJ("entity_type", (String) A013.A01(C297705sC.A06));
                    A002.A9F("entity_id", (Long) A013.A01(C271774jZ.A2Z));
                    A002.AAJ("entity_name", (String) A013.A01(C271774jZ.A2a));
                    A002.AAJ("entity_follow_status", C294185m0.A06(userSession, r14));
                    A002.AAJ("media_thumbnail_section", (String) A013.A01(AnonymousClass5m1.A00));
                    A002.AAJ("entity_page_name", (String) A013.A01(C297705sC.A02));
                    A002.A9F("entity_page_id", C254443sU.A03(A013));
                    A002.A9F("main_feed_carousel_starting_media_id", (Long) A013.A01(r12));
                    A002.AAJ("mezql_token", r14.A0C.getMezqlToken());
                    A002.AAJ("connection_id", r14.A0C.getConnectionId());
                    A002.AAJ("parent_m_pk", (String) A013.A01(C271774jZ.A6S));
                    A002.A7p("is_igtv", Boolean.valueOf(r14.A5Y()));
                    A002.AAJ("audience", (String) A013.A01(C271774jZ.A0W));
                    A002.AAJ("hashtag_follow_status", C254443sU.A0B(A013, r14));
                    A002.AAJ("endpoint_type", (String) A013.A01(C271774jZ.A2R));
                    A002.AAJ("collection_id", (String) A013.A01(C271774jZ.A1L));
                    A002.AAJ("collection_name", (String) A013.A01(C271774jZ.A1N));
                    A002.A9F("is_live_streaming", r5.A04("is_live_streaming"));
                    0j9 r122 = C271774jZ.A01;
                    String str3 = (String) A013.A01(r122);
                    if (str3 != null) {
                        l3 = 00y.A0n(10, str3);
                    } else {
                        l3 = null;
                    }
                    A002.A9F("actor_id", l3);
                    A002.A9F("is_live_questions", r5.A04("is_live_questions"));
                    if (AnonymousClass1GD.A03()) {
                        j2 = 1;
                    } else {
                        j2 = 0;
                    }
                    A002.A9F("is_dark_mode", Long.valueOf(j2));
                    A002.A9F("media_loading_progress", Long.valueOf((long) r6.A02()));
                    A002.A9F("tab_index", (Long) A013.A01(C271774jZ.A8i));
                    A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    A002.A9F("guest_id", r5.A04("guest_id"));
                    Integer A03 = r5.A03("is_replay");
                    if (A03 != null) {
                        l4 = Long.valueOf((long) A03.intValue());
                    } else {
                        l4 = null;
                    }
                    A002.A9F("is_replay", l4);
                    A002.A8D("time_remaining", (Double) A013.A01(C271774jZ.A94));
                    A002.A7p("has_media_loaded", Boolean.valueOf(r6.A0o()));
                    A002.AAJ("is_coming_from", (String) A013.A01(C271774jZ.A42));
                    String str4 = (String) A013.A01(C271774jZ.A6Z);
                    if (str4 != null) {
                        l5 = 00y.A0n(10, str4);
                    } else {
                        l5 = null;
                    }
                    A002.A9F("post_id", l5);
                    A002.A9F("effect_id", (Long) A013.A01(C271774jZ.A2O));
                    A002.A9F("media_face_effect_id", (Long) A013.A01(C271774jZ.A5G));
                    A002.A9F("carousel_media_type", C294185m0.A04(r14, valueOf2));
                    String str5 = (String) A013.A01(C271774jZ.A9Q);
                    if (str5 != null) {
                        l6 = 00y.A0n(10, str5);
                    } else {
                        l6 = null;
                    }
                    A002.A9F("tray_pos_excl_own_story", l6);
                    A002.AAJ("ranking_info_token", (String) A013.A01(C271774jZ.A6p));
                    A002.AAJ("reply_type", r5.A05("reply_type"));
                    A002.AAJ("ad_id", (String) A013.A01(C271774jZ.A0B));
                    A002.AAJ("explore_topic_session_id", (String) A013.A01(C271774jZ.A2g));
                    0j9 r11 = C271774jZ.A9J;
                    A002.A9F("top_liker_count", (Long) A013.A01(r11));
                    A002.A9F("reel_gap_to_last_ad", (Long) A013.A01(C271774jZ.A7R));
                    A002.A9F("reel_gap_to_last_netego", (Long) A013.A01(C271774jZ.A7S));
                    A002.AAJ("search_session_id", (String) A013.A01(C271774jZ.A7p));
                    A002.AAJ("discovery_session_id", (String) A013.A01(C271774jZ.A2F));
                    A002.A7p("is_influencer", (Boolean) A013.A01(C271774jZ.A4O));
                    A002.A9F("media_type", (Long) A013.A01(C271774jZ.A5a));
                    Serializable A014 = A013.A01(C271774jZ.A6W);
                    if (A014 != null) {
                        str = A014.toString();
                    } else {
                        str = null;
                    }
                    A002.AAJ("position", str);
                    A002.A7p("is_besties_reel", (Boolean) A013.A01(C271774jZ.A40));
                    A002.A7p("is_main_feed_client_bump_item", r5.A01("is_main_feed_client_bump_item"));
                    A002.AAJ("impression_token", r5.A05("impression_token"));
                    A002.AAJ("algorithm", r5.A05("algorithm"));
                    A002.A9H("product_merchant_ids", A04.A09);
                    A002.AAJ("is_programmatic_scroll", (String) A013.A01(C271774jZ.A4g));
                    A002.AAJ("media_tags_hashtag_name", (String) A013.A01(C271774jZ.A5V));
                    A002.A9F("media_tags_total_hashtags", (Long) A013.A01(C271774jZ.A5W));
                    A002.A7p("is_besties_media", (Boolean) A013.A01(C271774jZ.A3z));
                    String A2n2 = r14.A2n();
                    if (A2n2 != null) {
                        A002.A9F("media_id", 00y.A0n(10, A2n2));
                        A002.A7p("is_image_loaded", Boolean.valueOf(r6.A0o()));
                        if (C71342cb.A00(userSession).A03 != null) {
                            j3 = 1;
                        } else {
                            j3 = 0;
                        }
                        A002.A9F("nav_in_transit", Long.valueOf(j3));
                        A002.A9F("ad_position_from_server", (Long) A013.A01(C271774jZ.A0I));
                        A002.A7p("is_reshare", r5.A01("is_reshare"));
                        A002.A9F("top_followers_count", (Long) A013.A01(C271774jZ.A9H));
                        A002.A9F("top_likers_count", (Long) A013.A01(r11));
                        A002.A9F("dr_ad_type", (Long) A013.A01(C271774jZ.A2J));
                        A002.AAJ("sponsored_label_text", (String) A013.A01(C271774jZ.A8D));
                        A002.A9F("min_consumed_media_gap_to_previous_ad", (Long) A013.A01(C271774jZ.A5h));
                        A002.A9F("min_consumed_media_gap_to_previous_netego", (Long) A013.A01(C271774jZ.A5i));
                        A002.A9F("min_consumed_reel_gap_to_previous_ad", (Long) A013.A01(C271774jZ.A5j));
                        A002.A9F("min_consumed_reel_gap_to_previous_netego", (Long) A013.A01(C271774jZ.A5k));
                        A002.AAJ("feed_type", r5.A05("feed_type"));
                        String str6 = (String) A013.A01(C271774jZ.A9T);
                        if (str6 != null) {
                            l7 = 00y.A0n(10, str6);
                        } else {
                            l7 = null;
                        }
                        A002.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, l7);
                        A002.A7p("impression_logger_validate", (Boolean) A013.A01(C271774jZ.A3i));
                        A002.A7p("is_internal_build", (Boolean) A013.A01(C271774jZ.A4P));
                        A002.AAJ("entity_page_type", r5.A05("entity_page_type"));
                        A002.AAJ("rank_token", (String) A013.A01(C297695sB.A01));
                        A002.A7p("is_top_post", r5.A01("is_top_post"));
                        A002.A9F("carousel_opt_in_position", (Long) A013.A01(C271774jZ.A14));
                        A002.AAJ("counter_channel", (String) A013.A01(C271774jZ.A1f));
                        String str7 = (String) A013.A01(C271774jZ.A1g);
                        if (str7 != null) {
                            l8 = 00y.A0n(10, str7);
                        } else {
                            l8 = null;
                        }
                        A002.A9F("counter_id", l8);
                        String str8 = (String) A013.A01(C271774jZ.A1h);
                        if (str8 != null) {
                            l9 = 00y.A0n(10, str8);
                        }
                        A002.A9F("counter_sid", l9);
                        A002.A9F("next_max_id", (Long) A013.A01(C271774jZ.A65));
                        A002.A9F(TraceFieldType.BroadcastId, r5.A04(TraceFieldType.BroadcastId));
                        A002.AAJ("a_i", (String) A013.A01(r122));
                        A002.AAJ("tray_rank_token", r5.A05("tray_rank_token"));
                        A002.AAJ("byline_text", (String) A013.A01(C271774jZ.A0l));
                        A002.A9F("ad_inserted_position", (Long) A013.A01(C271774jZ.A0D));
                        A002.A9F("sponsor_tag_id", r5.A04("bc_tagged_partner"));
                        A002.AAJ("playback_format", r5.A05("playback_format"));
                        A002.A7p("is_pride_media", (Boolean) A013.A01(C271774jZ.A4d));
                        A002.A7p("is_pride_reel", (Boolean) A013.A01(C271774jZ.A4e));
                        A002.Cgf();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, long j, Object obj2) {
        Long valueOf;
        long j2;
        String str;
        Long l;
        long j3;
        Long l2;
        1Xj r12 = (1Xj) obj;
        AnonymousClass3W1 r6 = (AnonymousClass3W1) obj2;
        0qQ.A0B(r12, 0);
        0qQ.A0B(r6, 1);
        C232852uY r11 = this.A01;
        AnonymousClass4DU r13 = this.A02;
        C254523sc A05 = r11.A05(r12, r13, "viewed_impression", r6.getPosition(), r6.A0W);
        if (A05 != null) {
            A05.A03();
            C233822wX.A0X(A05, r12, r6.A03);
            C233822wX.A0Y(A05, r12, r6.A03);
            UserSession userSession = this.A00;
            0wc A012 = AnonymousClass0kN.A01(r13, userSession);
            0Aj A002 = A012.A00(A012.A00, "instagram_organic_viewed_impression");
            if (A002.isSampled()) {
                0jB A013 = A05.A01();
                0xF r5 = A05.A00().A06;
                int i = r6.A03;
                C294175lz A04 = C294165ly.A04(r12);
                A002.A9F("a_pk", Long.valueOf(C294185m0.A00(userSession, r12)));
                A002.AAJ("action", C294185m0.A08(r12));
                A002.AAJ("application_state", AnonymousClass5BB.A00());
                A002.A9F("carousel_media_id_int", (Long) A013.A01(C271774jZ.A11));
                String A2n = r12.A2n();
                if (A2n != null) {
                    A002.A9F("carousel_container_media_id", 00y.A0n(10, A2n));
                    A002.AAJ("carousel_cover_media_id", (String) A013.A01(C271774jZ.A0x));
                    A002.A9F("carousel_index", Long.valueOf((long) i));
                    Integer valueOf2 = Integer.valueOf(i);
                    A002.A9F("carousel_m_t", C294185m0.A04(r12, valueOf2));
                    A002.AAJ("carousel_media_id", C294185m0.A0B(r12, valueOf2));
                    A002.A9F("carousel_media_type", C294185m0.A04(r12, valueOf2));
                    A002.A9F("carousel_size", C294185m0.A05(r12, valueOf2));
                    A002.A9F("carousel_starting_media_id", (Long) A013.A01(C271774jZ.A16));
                    A002.AAJ("connection_id", r12.A0C.getConnectionId());
                    A002.A9O("feed_sticker_media_id", A013.A01(C271774jZ.A2q));
                    A002.A9O("is_replay", r5.A03("is_replay"));
                    A002.AAJ("endpoint_type", (String) A013.A01(C271774jZ.A2R));
                    A002.A9F("chaining_position", (Long) A013.A01(C271774jZ.A1A));
                    A002.AAJ("chaining_session_id", (String) A013.A01(C271774jZ.A1C));
                    A002.A9F("entity_page_id", C254443sU.A03(A013));
                    A002.AAJ("entity_page_name", (String) A013.A01(C297705sC.A02));
                    A002.AAJ("entity_type", (String) A013.A01(C297705sC.A06));
                    A002.AAJ("follow_status", C294185m0.A06(userSession, r12));
                    A002.A7p("has_media_loaded", Boolean.valueOf(r6.A0o()));
                    A002.AAJ("hashtag_feed_type", (String) A013.A01(C298085sr.A00));
                    A002.AAJ("hashtag_follow_status", C254443sU.A0B(A013, r12));
                    A002.A9F("hashtag_id", C254443sU.A04(A013, r12));
                    A002.AAJ("hashtag_name", C254443sU.A0C(A013, r12));
                    A002.A9F("imp_logger_ver", 24L);
                    A002.AAJ("inventory_source", r12.A0C.BIl());
                    A002.A7p("is_app_backgrounded", Boolean.valueOf(14i.A08()));
                    A002.A7p("is_checkout_enabled", A04.A01);
                    A002.A7p("is_eof", r12.A0C.CSj());
                    int position = r6.getPosition();
                    if (position == -1) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf((long) position);
                    }
                    A002.A9F("m_ix", valueOf);
                    A002.AAJ("m_pk", C294185m0.A09(r12));
                    A002.A9F("m_t", Long.valueOf((long) r12.BR7().A00));
                    A002.A9F("m_ts", Long.valueOf(r12.A1A()));
                    A002.AAJ("media_thumbnail_section", (String) A013.A01(AnonymousClass5m1.A00));
                    A002.A8D("media_time_elapsed", Double.valueOf(-1.0d));
                    A002.AAE(A04.A00, "merchant_id");
                    A002.AAJ("mezql_token", r12.A0C.getMezqlToken());
                    A002.AAJ("parent_m_pk", (String) A013.A01(C271774jZ.A6S));
                    A002.AAe("product_ids", A04.A03);
                    A002.AAJ("reel_id", (String) A013.A01(C271774jZ.A7T));
                    A002.A9F("reel_position", (Long) A013.A01(C271774jZ.A7U));
                    A002.A9F("reel_size", (Long) A013.A01(C271774jZ.A7V));
                    A002.A9F("reel_start_position", (Long) A013.A01(C271774jZ.A7W));
                    A002.AAJ("reel_type", (String) A013.A01(C271774jZ.A7Y));
                    A002.A9F("reel_viewer_position", (Long) A013.A01(C271774jZ.A7b));
                    A002.A9F("session_reel_counter", (Long) A013.A01(C271774jZ.A7y));
                    A002.AAJ("source_of_action", (String) A013.A01(C271774jZ.A8A));
                    A002.A9F("sponsor_tag_count", (Long) A013.A01(C271774jZ.A8F));
                    A002.AAJ("story_ranking_token", (String) A013.A01(C271774jZ.A8O));
                    A002.AAe("tagged_user_ids", C254443sU.A0J(r12));
                    A002.A8D("time_elapsed", (Double) A013.A01(C271774jZ.A8z));
                    A002.A8D("time_remaining", (Double) A013.A01(C271774jZ.A94));
                    A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r5.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                    A002.AAJ("topic_cluster_debug_info", (String) A013.A01(C271774jZ.A9C));
                    A002.AAJ("topic_cluster_id", (String) A013.A01(C271774jZ.A9D));
                    A002.AAJ("topic_cluster_title", (String) A013.A01(C271774jZ.A9F));
                    A002.AAJ("topic_cluster_type", (String) A013.A01(C271774jZ.A9G));
                    A002.AAJ("tracking_token", C294185m0.A07(userSession, r12, r13));
                    A002.A9F("tray_position", (Long) A013.A01(C271774jZ.A9P));
                    A002.AAJ("tray_session_id", (String) A013.A01(C271774jZ.A7X));
                    A002.AAJ("viewer_session_id", (String) A013.A01(C271774jZ.A9i));
                    A002.A7p("can_add_to_bag", r5.A01("can_add_to_bag"));
                    A002.A8D("elapsed_time_since_last_item", (Double) A013.A01(C271774jZ.A2P));
                    A002.A7p("is_acp_delivered", false);
                    A002.A7p("is_ad", Boolean.valueOf(r12.CcK()));
                    A002.A7p("is_highlights_sourced", (Boolean) A013.A01(C271774jZ.A4K));
                    A002.AAJ(C21058XCk.A01(21, 10, 4), (String) A013.A01(C271774jZ.A7x));
                    A002.AAJ("delivery_flags", C243413Yr.A00(r12.A0e));
                    A002.AAJ("feed_request_id", (String) A013.A01(C271774jZ.A88));
                    A002.A9F("entity_id", (Long) A013.A01(C271774jZ.A2Z));
                    A002.AAJ("entity_name", (String) A013.A01(C271774jZ.A2a));
                    A002.AAJ("entity_follow_status", C294185m0.A06(userSession, r12));
                    A002.A7p("is_igtv", Boolean.valueOf(r12.A5Y()));
                    if (AnonymousClass1GD.A03()) {
                        j2 = 1;
                    } else {
                        j2 = 0;
                    }
                    A002.A9F("is_dark_mode", Long.valueOf(j2));
                    A002.A9F("media_loading_progress", Long.valueOf((long) r6.A02()));
                    A002.AAJ("audience", (String) A013.A01(C271774jZ.A0W));
                    A002.A9F("tab_index", (Long) A013.A01(C271774jZ.A8i));
                    A002.AAJ("collection_id", (String) A013.A01(C271774jZ.A1L));
                    A002.AAJ("collection_name", (String) A013.A01(C271774jZ.A1N));
                    A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    A002.A9F("is_live_streaming", r5.A04("is_live_streaming"));
                    A002.A9F("is_live_questions", r5.A04("is_live_questions"));
                    A002.A9H("product_merchant_ids", A04.A09);
                    A002.A7p("is_influencer", (Boolean) A013.A01(C271774jZ.A4O));
                    A002.A9F("effect_id", (Long) A013.A01(C271774jZ.A2O));
                    A002.A9F("media_face_effect_id", (Long) A013.A01(C271774jZ.A5G));
                    A002.AAJ("ranking_info_token", (String) A013.A01(C271774jZ.A6p));
                    A002.AAJ("reply_type", r5.A05("reply_type"));
                    A002.A9F("guest_id", r5.A04("guest_id"));
                    A002.A9F("top_liker_count", (Long) A013.A01(C271774jZ.A9J));
                    A002.A9F("top_followers_count", (Long) A013.A01(C271774jZ.A9H));
                    A002.A9F("top_likers_count", (Long) A013.A01(C271774jZ.A9I));
                    A002.A9F("dr_ad_type", (Long) A013.A01(C271774jZ.A2J));
                    A002.A7p("is_besties_reel", (Boolean) A013.A01(C271774jZ.A40));
                    A002.AAJ("search_session_id", (String) A013.A01(C271774jZ.A7p));
                    A002.AAJ("is_programmatic_scroll", (String) A013.A01(C271774jZ.A4g));
                    A002.AAJ("discovery_session_id", (String) A013.A01(C271774jZ.A2F));
                    A002.AAJ("feed_type", r5.A05("feed_type"));
                    A002.AAJ("media_tags_hashtag_name", (String) A013.A01(C271774jZ.A5V));
                    A002.A9F("media_tags_total_hashtags", (Long) A013.A01(C271774jZ.A5W));
                    A002.A7p("is_besties_media", (Boolean) A013.A01(C271774jZ.A3z));
                    A002.AAJ("impression_token", r5.A05("impression_token"));
                    String A2n2 = r12.A2n();
                    if (A2n2 != null) {
                        A002.A9F("media_id", 00y.A0n(10, A2n2));
                        A002.A9F("media_author_id", (Long) A013.A01(C271774jZ.A5E));
                        A002.A9F("media_type", (Long) A013.A01(C271774jZ.A5a));
                        Serializable A014 = A013.A01(C271774jZ.A6W);
                        Long l3 = null;
                        if (A014 != null) {
                            str = A014.toString();
                        } else {
                            str = null;
                        }
                        A002.AAJ("position", str);
                        A002.A9F("reel_gap_to_last_ad", (Long) A013.A01(C271774jZ.A7R));
                        A002.A9F("reel_gap_to_last_netego", (Long) A013.A01(C271774jZ.A7S));
                        A002.A7p("is_reshare", r5.A01("is_reshare"));
                        A002.A9F("ad_position_from_server", (Long) A013.A01(C271774jZ.A0I));
                        A002.AAJ("entity_page_type", r5.A05("entity_page_type"));
                        A002.AAJ("rank_token", (String) A013.A01(C297695sB.A01));
                        A002.A7p("impression_logger_validate", (Boolean) A013.A01(C271774jZ.A3i));
                        A002.A9F("min_consumed_media_gap_to_previous_ad", (Long) A013.A01(C271774jZ.A5h));
                        A002.A9F("min_consumed_media_gap_to_previous_netego", (Long) A013.A01(C271774jZ.A5i));
                        A002.A9F("min_consumed_reel_gap_to_previous_ad", (Long) A013.A01(C271774jZ.A5j));
                        A002.A9F("min_consumed_reel_gap_to_previous_netego", (Long) A013.A01(C271774jZ.A5k));
                        A002.AAJ("explore_topic_session_id", (String) A013.A01(C271774jZ.A2g));
                        A002.A7p("is_pride_media", (Boolean) A013.A01(C271774jZ.A4d));
                        A002.A7p("is_pride_reel", (Boolean) A013.A01(C271774jZ.A4e));
                        A002.AAJ("algorithm", r5.A05("algorithm"));
                        String str2 = (String) A013.A01(C271774jZ.A9T);
                        if (str2 != null) {
                            l = 00y.A0n(10, str2);
                        } else {
                            l = null;
                        }
                        A002.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, l);
                        A002.A7p("is_top_post", r5.A01("is_top_post"));
                        A002.A7p("is_image_loaded", Boolean.valueOf(r6.A0o()));
                        if (C71342cb.A00(userSession).A03 != null) {
                            j3 = 1;
                        } else {
                            j3 = 0;
                        }
                        A002.A9F("nav_in_transit", Long.valueOf(j3));
                        A002.A9F("next_max_id", (Long) A013.A01(C271774jZ.A65));
                        A002.A7p("is_main_feed_client_bump_item", r5.A01("is_main_feed_client_bump_item"));
                        A002.AAJ("tray_rank_token", r5.A05("tray_rank_token"));
                        A002.A7p("is_internal_build", (Boolean) A013.A01(C271774jZ.A4P));
                        A002.AAJ("counter_channel", (String) A013.A01(C271774jZ.A1f));
                        String str3 = (String) A013.A01(C271774jZ.A1g);
                        if (str3 != null) {
                            l2 = 00y.A0n(10, str3);
                        } else {
                            l2 = null;
                        }
                        A002.A9F("counter_id", l2);
                        String str4 = (String) A013.A01(C271774jZ.A1h);
                        if (str4 != null) {
                            l3 = 00y.A0n(10, str4);
                        }
                        A002.A9F("counter_sid", l3);
                        A002.A9F("carousel_opt_in_position", (Long) A013.A01(C271774jZ.A14));
                        A002.AAJ("chaining_feed_session_id", r5.A05("chaining_feed_session_id"));
                        A002.AAJ("sponsored_label_text", (String) A013.A01(C271774jZ.A8D));
                        A002.A9F(TraceFieldType.BroadcastId, r5.A04(TraceFieldType.BroadcastId));
                        A002.A9F("sponsor_tag_id", r5.A04("bc_tagged_partner"));
                        A002.AAJ("a_i", (String) A013.A01(C271774jZ.A01));
                        A002.A9F("ad_inserted_position", (Long) A013.A01(C271774jZ.A0D));
                        A002.AAJ("byline_text", (String) A013.A01(C271774jZ.A0l));
                        A002.A9F("carousel_cover_media_id_int", (Long) A013.A01(C271774jZ.A0y));
                        A002.AAJ("module_name", r13.getModuleName());
                        A002.Cgf();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }
}
