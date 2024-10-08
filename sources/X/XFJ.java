package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class XFJ {
    public static final void A00(0wc r9, UserSession userSession, C254523sc r11, AnonymousClass4DU r12) {
        String str;
        0bb r8;
        double d;
        ArrayList arrayList;
        Long l;
        0bb r6;
        ArrayList arrayList2;
        Double d2;
        LinkedHashMap linkedHashMap;
        0bb r2;
        Double d3;
        0Aj A0e = AnonymousClass7TE.A0e(r9, "instagram_ad_sub_impression");
        0jB A01 = r11.A01();
        if (A0e.isSampled()) {
            C21054XCf.A0H(A0e, A01);
            C21053XCe.A0t(A0e, C271774jZ.A5a, A01);
            C21054XCf.A0E(A0e, A01);
            ArrayList arrayList3 = (ArrayList) A01.A01(C271774jZ.A2q);
            Long l2 = null;
            if (arrayList3 != null) {
                str = (String) 00k.A0O(arrayList3, 0);
            } else {
                str = null;
            }
            A0e.AAJ("feed_sticker_media_id", str);
            C21054XCf.A0M(A0e, A01);
            C21054XCf.A0J(A0e, A01);
            C21053XCe.A0v(A0e, C271774jZ.A0C, A01);
            C21054XCf.A1T(A0e, A01);
            C21055XCg.A1G(A0e, A01, "action", C51966G9m.A1C(C271774jZ.A00, A01));
            C21054XCf.A0a(A0e, A01);
            A0e.A9F("reel_gap", C51966G9m.A13(C271774jZ.A7P, A01));
            A0e.A9F("gap_to_last_ad", C51966G9m.A13(C271774jZ.A33, A01));
            C21054XCf.A0n(A0e, A01);
            C21054XCf.A0S(A0e, A01);
            C21055XCg.A1B(A0e, A01, C51966G9m.A13(C271774jZ.A14, A01), "carousel_opt_in_position");
            C21055XCg.A0v(A0e, A01);
            C21054XCf.A15(A0e, A01);
            C21054XCf.A1Q(A0e, A01);
            A0e.AAJ("host_media_pk", C51966G9m.A1C(C271774jZ.A3X, A01));
            C21054XCf.A17(A0e, A01);
            A0e.AAJ("media_layout_encoded_string", C51966G9m.A1C(C271774jZ.A5O, A01));
            A0e.A7p("mop_should_double_logging", C21053XCe.A0W(C271774jZ.A5n, A01));
            A0e.A7p("mop_should_rollout", C21053XCe.A0W(C271774jZ.A5o, A01));
            A0e.A7p("is_zoomed_out", C21053XCe.A0W(C271774jZ.A50, A01));
            C21054XCf.A0D(A0e, A01);
            C21054XCf.A1K(A0e, A01);
            C21055XCg.A1A(A0e, A01, C51966G9m.A13(C271774jZ.A5K, A01), "media_id");
            C51969G9p.A19(A0e, r12);
            C21054XCf.A11(A0e, A01);
            C21053XCe.A12(A0e, A01);
            C21053XCe.A0z(A0e, A01);
            C21054XCf.A0f(A0e, A01);
            C21055XCg.A1D(A0e, A01, C51966G9m.A13(C271774jZ.A11, A01), "carousel_media_id_int");
            C21054XCf.A1C(A0e, A01);
            C21054XCf.A0k(A0e, A01);
            A0e.A9F("position", C51966G9m.A13(C271774jZ.A6W, A01));
            C21054XCf.A1R(A0e, A01);
            C21054XCf.A1M(A0e, A01);
            C21054XCf.A1L(A0e, A01);
            C21054XCf.A0K(A0e, A01);
            C21055XCg.A12(A0e, A01);
            C21054XCf.A14(A0e, A01);
            A0e.A8D("media_dwell_time", C21053XCe.A0Y(C271774jZ.A5F, A01));
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A0o(A0e, A01);
            C21055XCg.A0p(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21054XCf.A18(A0e, A01);
            A0e.A8D("media_time_elapsed", C21053XCe.A0Y(C271774jZ.A5Y, A01));
            C21055XCg.A18(A0e, A01, C21053XCe.A0Y(C271774jZ.A5T, A01), "media_time_paused");
            C21054XCf.A0t(A0e, A01);
            C21054XCf.A0R(A0e, A01);
            C21054XCf.A0z(A0e, A01);
            C21055XCg.A15(A0e, A01);
            A0e.A7p("is_highlights_sourced", C21053XCe.A0W(C271774jZ.A4K, A01));
            C21054XCf.A0r(A0e, A01);
            0jB A012 = A01.A01(C271774jZ.A1t);
            if (A012 == null) {
                r8 = null;
            } else {
                r8 = new 0bb();
                Number A0b = C21053XCe.A0b(C271774jZ.A1q, A012);
                double d4 = -1.0d;
                if (A0b != null) {
                    d = A0b.doubleValue();
                } else {
                    d = -1.0d;
                }
                r8.A04(IgReactMediaPickerNativeModule.HEIGHT, Double.valueOf(d));
                Number A0b2 = C21053XCe.A0b(C271774jZ.A1v, A012);
                if (A0b2 != null) {
                    d4 = A0b2.doubleValue();
                }
                r8.A04(IgReactMediaPickerNativeModule.WIDTH, Double.valueOf(d4));
            }
            A0e.AAK(r8, "cta_sticker_size_info_in_dp_pt");
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(A0e2);
                Iterator it = A0e2.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    0qQ.A0B(str2, 0);
                    A0p.add(00y.A0n(10, str2));
                }
                arrayList = AnonymousClass7TE.A1D(00k.A0X(A0p));
            } else {
                arrayList = null;
            }
            A0e.AAe("product_ids", arrayList);
            A0e.A9F("product_id", C51966G9m.A13(C271774jZ.A6k, A01));
            String A1C = C51966G9m.A1C(C271774jZ.A5e, A01);
            if (A1C != null) {
                l = C263944Ny.A00(A1C).A00;
            } else {
                l = null;
            }
            A0e.A9F("merchant_id", l);
            C21054XCf.A0T(A0e, A01);
            A0e.A7p("post_impression_column_override", C21053XCe.A0W(C271774jZ.A6O, A01));
            C21054XCf.A1O(A0e, A01);
            A0e.A7p("is_second_channel_enabled", C21053XCe.A0W(C271774jZ.A4l, A01));
            C21054XCf.A1A(A0e, A01);
            A0e.A9H("two_measurement_debugging_fields", (Map) A01.A01(C271774jZ.A9S));
            A0e.A9F("hscroll_seed_ad_id", C21055XCg.A0P(C271774jZ.A3b, A01));
            C21055XCg.A19(A0e, A01, C21055XCg.A0P(C271774jZ.A2u, A01));
            A0e.A9F("multi_ads_first_ad_id", C21055XCg.A0P(C271774jZ.A5t, A01));
            A0e.AAJ("intent_aware_ads_trigger_type", C51966G9m.A1C(C271774jZ.A3p, A01));
            C21054XCf.A1S(A0e, A01);
            C21053XCe.A0u(A0e, C271774jZ.A0Z, A01);
            0j9 r22 = C271774jZ.A8x;
            C21055XCg.A0e(A0e, r22, A01);
            C21054XCf.A0w(A0e, A01);
            C21054XCf.A0Y(A0e, A01);
            C21054XCf.A1P(A0e, A01);
            A0e.A9F("ad_request_position", C51966G9m.A13(C271774jZ.A0L, A01));
            A0e.A9F("reel_viewer_entry_position", C51966G9m.A13(C271774jZ.A7Z, A01));
            A0e.A9F("ad_received_position", C51966G9m.A13(C271774jZ.A0J, A01));
            0jB A0D = C21053XCe.A0D(A01);
            if (A0D != null) {
                0xF A00 = A0D.A00();
                r6 = new 0bb();
                C21054XCf.A1a(r6, A0D);
                r6.A04("media_height", C21053XCe.A0Y(C271774jZ.A5H, A0D));
                r6.A04("media_width", C21053XCe.A0Y(C271774jZ.A5c, A0D));
                String A05 = A00.A05("caption_font_size");
                Long l3 = null;
                if (A05 != null) {
                    d3 = C21053XCe.A0a(A05);
                } else {
                    d3 = null;
                }
                r6.A04("caption_font_size", d3);
                r6.A04("caption_position_start_x", C21054XCf.A03(A00, "caption_position_start_x"));
                r6.A04("caption_position_start_y", C21054XCf.A03(A00, "caption_position_start_y"));
                r6.A04("caption_line_height", C21054XCf.A03(A00, "caption_line_height"));
                r6.A04("caption_height", C21054XCf.A03(A00, "caption_line_height"));
                r6.A04("caption_width", C21054XCf.A03(A00, "caption_width"));
                C21055XCg.A1K(r6, A00, C21055XCg.A0J(A00, "is_caption_fully_displayed"));
                r6.A05("caption_num_char_showed", C21055XCg.A0O(A00, "caption_num_char_showed"));
                r6.A05("caption_num_hashtags_showed", C21055XCg.A0O(A00, "caption_num_hashtags_showed"));
                r6.A05("caption_num_lines_showed", C21055XCg.A0O(A00, "caption_num_lines_showed"));
                r6.A05("caption_num_lines_total", C21055XCg.A0O(A00, "caption_num_lines_total"));
                String A052 = A00.A05("caption_num_mentions_showed");
                if (A052 != null) {
                    l3 = DbV.A0q(A052);
                }
                r6.A05("caption_num_mentions_showed", l3);
                C21053XCe.A18(r6, A00, "caption_text_color");
                C21053XCe.A19(r6, A0D);
                C21053XCe.A18(r6, A00, "headline_text_showed");
                C21055XCg.A1M(r6, A0D);
            } else {
                r6 = null;
            }
            A0e.AAK(r6, "media_layout");
            C21054XCf.A1U(A0e, A01);
            C21053XCe.A10(A0e, A01);
            C21054XCf.A0b(A0e, A01);
            A0e.A9F("reel_gap_to_last_ad", C51966G9m.A13(C271774jZ.A7R, A01));
            Long A13 = C51966G9m.A13(C271774jZ.A7S, A01);
            if (A13 == null) {
                A13 = null;
            }
            A0e.A9F("reel_gap_to_last_netego", A13);
            A0e.A9F("ad_consumed_media_gap", C51966G9m.A13(C271774jZ.A06, A01));
            A0e.A9F("netego_consumed_media_gap", C51966G9m.A13(C271774jZ.A61, A01));
            A0e.A9F("min_consumed_media_gap_to_previous_ad", C51966G9m.A13(C271774jZ.A5j, A01));
            A0e.A9F("min_consumed_media_gap_to_previous_netego", C51966G9m.A13(C271774jZ.A5k, A01));
            A0e.A9F("min_consumed_reel_gap_to_previous_ad", C51966G9m.A13(C271774jZ.A5h, A01));
            A0e.A9F("min_consumed_reel_gap_to_previous_netego", C51966G9m.A13(C271774jZ.A5i, A01));
            A0e.A9F("priority_index", C51966G9m.A13(C271774jZ.A6g, A01));
            A0e.A9F("highest_position_rule", C51966G9m.A13(C271774jZ.A3U, A01));
            A0e.A9F("max_reel_gap_to_previous_item", C51966G9m.A13(C271774jZ.A5B, A01));
            A0e.A9F("min_media_gap_to_previous_item", C51966G9m.A13(C271774jZ.A5l, A01));
            A0e.A8D("time_gap_to_previous_item_in_sec", C21053XCe.A0Y(C271774jZ.A91, A01));
            C21054XCf.A0h(A0e, A01);
            A0e.A9F("consumed_media_gap", C51966G9m.A13(C271774jZ.A1Z, A01));
            C21054XCf.A1W(A0e, A01);
            A0e.A9F("consumed_media_gap_highest_position", C51966G9m.A13(C271774jZ.A1a, A01));
            A0e.A9F("reel_gap_highest_position", C51966G9m.A13(C271774jZ.A7Q, A01));
            A0e.A9F("imp_logger_ver", C51966G9m.A13(C271774jZ.A51, A01));
            A0e.AAJ("previous_media_pk", C51966G9m.A1C(C271774jZ.A6a, A01));
            A0e.AAJ("next_media_pk", C51966G9m.A1C(C271774jZ.A66, A01));
            A0e.AAJ("is_app_backgrounded", C51966G9m.A1C(C271774jZ.A3x, A01));
            A0e.AAJ("last_navigation_module", C51966G9m.A1C(C271774jZ.A56, A01));
            A0e.A9F("nav_in_transit", C21055XCg.A0P(C271774jZ.A5z, A01));
            C21054XCf.A0i(A0e, A01);
            C21054XCf.A1F(A0e, A01);
            A0e.AAJ("current_module", r12.getModuleName());
            Long A132 = C51966G9m.A13(C271774jZ.A34, A01);
            if (A132 == null) {
                A132 = null;
            }
            A0e.A9F("gap_to_last_netego", A132);
            A0e.A8D("time_remaining", C21053XCe.A0Y(C271774jZ.A94, A01));
            C21054XCf.A0m(A0e, A01);
            A0e.AAJ("async_ad_source", C51966G9m.A1C(C271774jZ.A0V, A01));
            C21054XCf.A13(A0e, A01);
            C21054XCf.A0v(A0e, A01);
            C21054XCf.A1I(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            C21054XCf.A1V(A0e, A01);
            C21053XCe.A0w(A0e, C271774jZ.A12, A01);
            A0e.A7p("is_holdout", C21053XCe.A0W(C271774jZ.A4L, A01));
            C21054XCf.A0x(A0e, A01);
            A0e.AAe("sticker_types", (List) null);
            A0e.AAe("sponsor_tag_ids", (List) C21055XCg.A0I(A0e, A01));
            C21055XCg.A0s(A0e, A01);
            C21055XCg.A14(A0e, A01);
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A9g, A01);
            if (A0d != null) {
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0d);
                Iterator it2 = A0d.iterator();
                while (it2.hasNext()) {
                    A0p2.add(012.A0p((String) it2.next()));
                }
                arrayList2 = AnonymousClass7TE.A1D(00k.A0X(A0p2));
            } else {
                arrayList2 = null;
            }
            A0e.AAe("video_to_carousel_cut_secs", arrayList2);
            C21053XCe.A0x(A0e, C271774jZ.A13, A01);
            A0e.AAe("carousel_transformation_cards", (List) A01.A01(C271774jZ.A17));
            A0e.A9F("carousel_transformation_type", (Long) null);
            A0e.AAJ("impression_type", C51966G9m.A1C(C271774jZ.A3j, A01));
            A0e.AAK((0bb) null, "toolbar_layout");
            C21054XCf.A12(A0e, A01);
            C21054XCf.A0s(A0e, A01);
            A0e.AAJ("byline_text", C51966G9m.A1C(C271774jZ.A0l, A01));
            A0e.A7p("is_pride_media", C21053XCe.A0W(C271774jZ.A4d, A01));
            A0e.A7p("is_besties_media", C21053XCe.A0W(C271774jZ.A3z, A01));
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            C21054XCf.A0A(A0e, A01);
            C21054XCf.A1D(A0e, A01);
            A0e.AAe("tagged_user_ids", (List) A01.A01(C271774jZ.A8j));
            A0e.A7p("is_image_loaded", C21053XCe.A0W(C271774jZ.A4N, A01));
            C21055XCg.A16(A0e, A01);
            C21054XCf.A0Q(A0e, A01);
            C21054XCf.A1H(A0e, A01);
            A0e.AAJ("disclaimer_text", C51966G9m.A1C(C271774jZ.A2C, A01));
            A0e.AAJ("disclaimer_title", C51966G9m.A1C(C271774jZ.A2D, A01));
            C21054XCf.A0P(A0e, A01);
            A0e.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C21055XCg.A0P(C271774jZ.A9T, A01));
            A0e.AAJ("channel_pk", C51966G9m.A1C(C271774jZ.A1E, A01));
            C21054XCf.A0d(A0e, A01);
            A0e.A9F("ad_delivery_position", C51966G9m.A13(C271774jZ.A0A, A01));
            A0e.A7p("is_first_ad_in_the_session", C21053XCe.A0W(C271774jZ.A4H, A01));
            C21054XCf.A0O(A0e, A01);
            A0e.AAJ("cache_key", C51966G9m.A1C(C271774jZ.A0m, A01));
            A0e.AAJ("call_stack", C51966G9m.A1C(C271774jZ.A0n, A01));
            A0e.A8D("time_interval_since_reference_date", C21053XCe.A0Y(C271774jZ.A92, A01));
            Number A0b3 = C21053XCe.A0b(r22, A01);
            if (A0b3 != null) {
                d2 = Double.valueOf((double) A0b3.longValue());
            } else {
                d2 = null;
            }
            A0e.A8D("time_stamp", d2);
            A0e.A9F("main_feed_carousel_starting_media_id", C21055XCg.A0P(C271774jZ.A5A, A01));
            AbstractMap A0g = C21053XCe.A0g(A01);
            if (A0g != null) {
                LinkedHashMap A08 = C21054XCf.A08(A0g);
                Iterator A0s = AnonymousClass7TF.A0s(A0g);
                while (A0s.hasNext()) {
                    Map.Entry entry = (Map.Entry) A0s.next();
                    A08.put(entry.getKey(), 00k.A0U((Collection) entry.getValue()));
                }
                linkedHashMap = 0Yt.A03(A08);
            } else {
                linkedHashMap = null;
            }
            C21053XCe.A17(A0e, linkedHashMap);
            C21053XCe.A13(A0e, A01);
            A0e.AAJ("next_inventory_source", C51966G9m.A1C(C271774jZ.A67, A01));
            A0e.AAJ("prev_inventory_source", C51966G9m.A1C(C271774jZ.A6b, A01));
            C21054XCf.A1J(A0e, A01);
            A0e.AAJ("sponsored_label_text", C51966G9m.A1C(C271774jZ.A8D, A01));
            0jB A013 = A01.A01(C271774jZ.A75);
            if (A013 == null) {
                r2 = null;
            } else {
                r2 = new 0bb();
                r2.A06("body", C51966G9m.A1C(C271774jZ.A76, A013));
                r2.A03("has_image", C21053XCe.A0W(C271774jZ.A7A, A013));
                r2.A06("style", C51966G9m.A1C(C271774jZ.A7G, A013));
                C21055XCg.A1O(r2, A013, A013.A01(C271774jZ.A7I));
            }
            A0e.AAK(r2, "reels_mid_scene_info");
            A0e.A7p("is_merlin_double_logging_enabled", C21053XCe.A0W(C271774jZ.A4U, A01));
            A0e.A7p("is_demo", C21053XCe.A0W(C271774jZ.A4C, A01));
            A0e.AAJ("delivery_context", C51966G9m.A1C(C271774jZ.A25, A01));
            A0e.A7p("is_reels_sync_flow_enabled", C21053XCe.A0W(C271774jZ.A4r, A01));
            A0e.A9F("brs_threshold", C21054XCf.A07(C21053XCe.A0b(C271774jZ.A0i, A01)));
            A0e.AAJ("organic_media_id_before", C51966G9m.A1C(C271774jZ.A6N, A01));
            A0e.A9F("organic_brs_severity_before", C21054XCf.A07(C21053XCe.A0b(C271774jZ.A6J, A01)));
            A0e.AAJ("organic_media_id_after", C51966G9m.A1C(C271774jZ.A6M, A01));
            A0e.A9F("organic_brs_severity_after", C21054XCf.A07(C21053XCe.A0b(C271774jZ.A6I, A01)));
            A0e.A9F("view_state_item_type_before", C21054XCf.A07(C21053XCe.A0b(C271774jZ.A9k, A01)));
            Number A0b4 = C21053XCe.A0b(C271774jZ.A9j, A01);
            if (A0b4 != null) {
                l2 = C51969G9p.A0r(A0b4);
            }
            A0e.A9F("view_state_item_type_after", l2);
            C21054XCf.A09(A0e, A01);
            if (C228342lQ.A02(userSession)) {
                A0e.AAJ("basic_ads_graphql_tier", C228342lQ.A01(1Au.A00(userSession)).toString());
                A0e.AAJ("basic_ads_launcher_tier", C228342lQ.A00(userSession).toString());
            }
            DbX.A1L(A0e);
        }
    }
}
