package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.XWs  reason: case insensitive filesystem */
public abstract class C21333XWs {
    public static final void A00(0wc r12, C254523sc r13, AnonymousClass4DU r14) {
        String str;
        0bb r1;
        String str2;
        ArrayList arrayList;
        Long l;
        List list;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList3;
        0bb r5;
        0bb r52;
        0bb r53;
        0bb r15;
        String A05;
        String A052;
        Double d;
        0Aj A0e = AnonymousClass7TE.A0e(r12, "instagram_ad_action");
        0jB A01 = r13.A01();
        0xF r132 = r13.A00().A06;
        if (A0e.isSampled()) {
            A0e.AAJ("a_i", C51966G9m.A1C(C271774jZ.A9M, A01));
            0j9 r6 = C271774jZ.A0Z;
            C21053XCe.A0u(A0e, r6, A01);
            C21054XCf.A0e(A0e, A01);
            0j9 r7 = C271774jZ.A0C;
            C21053XCe.A0v(A0e, r7, A01);
            C21054XCf.A0a(A0e, A01);
            A0e.AAJ("ad_intent", C51966G9m.A1C(C271774jZ.A0E, A01));
            C21053XCe.A10(A0e, A01);
            C21054XCf.A1F(A0e, A01);
            C21053XCe.A12(A0e, A01);
            C21054XCf.A0J(A0e, A01);
            0j9 r0 = C271774jZ.A12;
            C21053XCe.A0w(A0e, r0, A01);
            C21053XCe.A0z(A0e, A01);
            Serializable A012 = A01.A01(r0);
            Long l2 = null;
            if (A012 != null) {
                str = A012.toString();
            } else {
                str = null;
            }
            A0e.AAJ("carousel_media_type", str);
            C21055XCg.A1C(A0e, A01, C51966G9m.A13(C271774jZ.A15, A01), "carousel_size");
            A0e.A8D("end_x_position", C21055XCg.A0K(C271774jZ.A2S, A01));
            A0e.A8D("end_y_position", C21055XCg.A0K(C271774jZ.A2T, A01));
            C21054XCf.A0c(A0e, A01);
            A0e.AAJ("from", C51966G9m.A1C(C271774jZ.A2z, A01));
            C21054XCf.A0M(A0e, A01);
            C21054XCf.A0K(A0e, A01);
            C21054XCf.A0j(A0e, A01);
            C21055XCg.A1G(A0e, A01, "is_programmatic_scroll", C51966G9m.A1C(C271774jZ.A4g, A01));
            0j9 r54 = C271774jZ.A5I;
            C51965G9l.A1I(A0e, C51966G9m.A1C(r54, A01));
            0j9 r10 = C271774jZ.A5a;
            C21055XCg.A0h(A0e, r10, A01);
            0jB A0D = C21053XCe.A0D(A01);
            if (A0D != null) {
                0qQ.A0A(r132);
                r1 = new 0bb();
                C21055XCg.A1M(r1, A0D);
                C21054XCf.A1a(r1, A0D);
                C21053XCe.A19(r1, A0D);
                0j9 r11 = C271774jZ.A5c;
                r1.A04("media_width", C21053XCe.A0Y(r11, A0D));
                r1.A04("media_height", C21053XCe.A0Y(r11, A0D));
                C21055XCg.A1J(r1, r132);
                String A053 = r132.A05("caption_font_size");
                Boolean bool = null;
                if (A053 != null) {
                    d = C21053XCe.A0a(A053);
                } else {
                    d = null;
                }
                r1.A04("caption_font_size", d);
                r1.A05("caption_num_char_showed", C21055XCg.A0O(r132, "caption_num_char_showed"));
                r1.A05("caption_num_hashtags_showed", C21055XCg.A0O(r132, "caption_num_hashtags_showed"));
                r1.A05("caption_num_lines_showed", C21055XCg.A0O(r132, "caption_num_lines_showed"));
                r1.A05("caption_num_lines_total", C21055XCg.A0O(r132, "caption_num_lines_total"));
                r1.A05("caption_num_mentions_showed", C21055XCg.A0O(r132, "caption_num_mentions_showed"));
                r1.A04("caption_position_start_x", C21054XCf.A03(r132, "caption_position_start_x"));
                r1.A04("caption_position_start_y", C21054XCf.A03(r132, "caption_position_start_y"));
                r1.A04("caption_line_height", C21054XCf.A03(r132, "caption_line_height"));
                r1.A04("caption_height", C21054XCf.A03(r132, "caption_line_height"));
                r1.A04("caption_width", C21054XCf.A03(r132, "caption_width"));
                String A054 = r132.A05("is_caption_fully_displayed");
                if (A054 != null) {
                    bool = Boolean.valueOf(Boolean.parseBoolean(A054));
                }
                r1.A03("is_caption_fully_displayed", bool);
                C21053XCe.A18(r1, r132, "caption_text_color");
                C21053XCe.A18(r1, r132, "background_color_caption");
                C21055XCg.A1L(r1, r132, "caption_background_color_alpha");
            } else {
                r1 = null;
            }
            A0e.AAK(r1, "media_layout");
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            C21054XCf.A1A(A0e, A01);
            C21055XCg.A0u(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A1J(A0e, A01);
            C21054XCf.A0Y(A0e, A01);
            C21054XCf.A1S(A0e, A01);
            A0e.A8D("start_x_position", C21055XCg.A0K(C271774jZ.A8L, A01));
            A0e.A8D("start_y_position", C21055XCg.A0K(C271774jZ.A8M, A01));
            C21054XCf.A0r(A0e, A01);
            A0e.AAJ("thumbnail_id", C51966G9m.A1C(C271774jZ.A1Q, A01));
            A0e.AAJ("top_followers_count", C21053XCe.A0c(C271774jZ.A9H, A01));
            C21054XCf.A0q(A0e, A01);
            C21054XCf.A0S(A0e, A01);
            C21054XCf.A1T(A0e, A01);
            C21054XCf.A0k(A0e, A01);
            A0e.AAJ("tray_session_id", C51966G9m.A1C(C271774jZ.A7X, A01));
            A0e.AAJ("url", C51966G9m.A1C(C271774jZ.A9a, A01));
            C21054XCf.A0B(A0e, A01);
            A0e.A8D("x_velocity", C21055XCg.A0K(C271774jZ.A9u, A01));
            A0e.A8D("y_velocity", C21055XCg.A0K(C271774jZ.A9v, A01));
            C21054XCf.A0E(A0e, A01);
            ArrayList arrayList4 = (ArrayList) A01.A01(C271774jZ.A2q);
            if (arrayList4 != null) {
                str2 = (String) 00k.A0O(arrayList4, 0);
            } else {
                str2 = null;
            }
            A0e.AAJ("feed_sticker_media_id", str2);
            C21054XCf.A15(A0e, A01);
            C21055XCg.A1D(A0e, A01, C51966G9m.A13(C271774jZ.A11, A01), "carousel_media_id_int");
            C21054XCf.A0f(A0e, A01);
            C51969G9p.A19(A0e, r14);
            C21055XCg.A1A(A0e, A01, C21055XCg.A0Q(r54, A01), "media_id");
            C21054XCf.A1K(A0e, A01);
            A0e.AAJ("source_of_like", C51966G9m.A1C(C271774jZ.A8B, A01));
            A0e.AAK((0bb) null, "location_info");
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = A0e2.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    0qQ.A0B(A18, 0);
                    Long A10 = AnonymousClass7TE.A10(A18);
                    if (A10 != null) {
                        A1C.add(A10);
                    }
                }
                arrayList = 00k.A0U(A1C);
            } else {
                arrayList = null;
            }
            A0e.AAe("product_ids", arrayList);
            A0e.AAe("drop_product_ids", (List) null);
            A0e.AAe("mentioned_product_ids", (List) null);
            ArrayList A06 = r132.A06("shared_product_ids");
            if (A06 == null) {
                A06 = null;
            }
            A0e.AAe("shared_product_ids", A06);
            0j9 r55 = C271774jZ.A6k;
            A0e.A9F("product_id", C51966G9m.A13(r55, A01));
            String A1C2 = C51966G9m.A1C(C271774jZ.A5e, A01);
            if (A1C2 != null) {
                l = DbV.A0q(A1C2);
            } else {
                l = null;
            }
            A0e.A9F("merchant_id", l);
            C21054XCf.A0T(A0e, A01);
            A0e.A7p("can_add_to_bag", r132.A01("can_add_to_bag"));
            C21054XCf.A1X(A0e, A01, AnonymousClass05K.A0j);
            A0e.AAe(C273654mx.A00(167), (List) null);
            A0e.AAJ("shopping_session_id", C51966G9m.A1C(C271774jZ.A80, A01));
            if (A01.A01(C271774jZ.A0k) == null || (A052 = r132.A05("incentive_id")) == null) {
                list = 0sn.A00;
            } else {
                0bb r8 = new 0bb();
                r8.A06("display_type", "visible");
                r8.A05(AnonymousClass000.A00(3019), DbV.A0q(A052));
                list = AnonymousClass7TE.A1I(r8);
            }
            A0e.AAe(AnonymousClass000.A00(3813), list);
            C21054XCf.A0G(A0e, A01);
            A0e.AAJ(AnonymousClass000.A00(277), (String) null);
            C21054XCf.A1M(A0e, A01);
            C21054XCf.A17(A0e, A01);
            C21054XCf.A0z(A0e, A01);
            C21054XCf.A18(A0e, A01);
            A0e.AAJ("topic_cluster_type", C51966G9m.A1C(C271774jZ.A9G, A01));
            A0e.AAJ("topic_cluster_id", C51966G9m.A1C(C271774jZ.A9D, A01));
            A0e.AAJ("topic_cluster_title", C51966G9m.A1C(C271774jZ.A9F, A01));
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A0o(A0e, A01);
            C21054XCf.A1L(A0e, A01);
            C21055XCg.A12(A0e, A01);
            C21053XCe.A11(A0e, A01);
            A0e.A9F("entity_page_id", C21055XCg.A0Q(C271774jZ.A2b, A01));
            C21054XCf.A1B(A0e, A01);
            C21055XCg.A0y(A0e, A01);
            C21054XCf.A0t(A0e, A01);
            C21055XCg.A0t(A0e, A01);
            C21054XCf.A11(A0e, A01);
            C21054XCf.A1Q(A0e, A01);
            A0e.AAJ("host_media_pk", C51966G9m.A1C(C271774jZ.A3X, A01));
            A0e.A9F("placement_page_type", (Long) null);
            A0e.A7p(C273654mx.A00(322), C21053XCe.A0W(C271774jZ.A4W, A01));
            A0e.A9F("media_type", C51966G9m.A13(r10, A01));
            String A1C3 = C51966G9m.A1C(C271774jZ.A09, A01);
            if (A1C3 == null) {
                A1C3 = C21053XCe.A0c(C271774jZ.A08, A01);
            }
            A0e.AAJ("cta_state", A1C3);
            A0e.A9F("media_index", C51966G9m.A13(C271774jZ.A5L, A01));
            C21054XCf.A0i(A0e, A01);
            C21055XCg.A0z(A0e, A01);
            C21055XCg.A0q(A0e, A01);
            A0e.A7p("is_cta_delay_enabled", (Boolean) null);
            A0e.A8D("cta_min_delay_time", (Double) null);
            A0e.A7p("is_cta_default_color_enabled", (Boolean) null);
            A0e.A7p("is_cta_scroll_aware_enabled", (Boolean) null);
            C21054XCf.A0m(A0e, A01);
            A0e.AAe("header_layout", (List) null);
            C21054XCf.A13(A0e, A01);
            A0e.A9F("unseen_reel_size", (Long) null);
            C21054XCf.A1U(A0e, A01);
            A0e.A8D("device_height", C21053XCe.A0Y(C271774jZ.A29, A01));
            A0e.A8D("device_width", C21053XCe.A0Y(C271774jZ.A2A, A01));
            A0e.A8D("screen_density", C21053XCe.A0Y(C271774jZ.A7l, A01));
            A0e.A9F("screen_height", C21055XCg.A0R(C271774jZ.A7m, A01));
            A0e.A9F("screen_width", C21055XCg.A0R(C271774jZ.A7n, A01));
            C21054XCf.A0V(A0e, A01);
            C21054XCf.A1I(A0e, A01);
            C21055XCg.A13(A0e, A01);
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A9g, A01);
            if (A0d != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(A0d);
                Iterator it2 = A0d.iterator();
                while (it2.hasNext()) {
                    A0p.add(012.A0p(AnonymousClass7TE.A18(it2)));
                }
                arrayList2 = AnonymousClass7TE.A1D(00k.A0X(A0p));
            } else {
                arrayList2 = null;
            }
            A0e.AAe("video_to_carousel_cut_secs", arrayList2);
            A0e.AAJ("cta_style_when_clicked", (String) null);
            C21055XCg.A0m(A0e, A01);
            A0e.AAK((0bb) null, "toolbar_layout");
            A0e.AAe("sponsor_tag_ids", (List) C21055XCg.A0I(A0e, A01));
            A0e.AAe("carousel_transformation_cards", (List) A01.A01(C271774jZ.A17));
            C21054XCf.A1W(A0e, A01);
            C21054XCf.A0A(A0e, A01);
            AbstractMap A0g = C21053XCe.A0g(A01);
            if (A0g != null) {
                LinkedHashMap A08 = C21054XCf.A08(A0g);
                Iterator A0s = AnonymousClass7TF.A0s(A0g);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    A08.put(A1J.getKey(), 00k.A0U((Collection) A1J.getValue()));
                }
                linkedHashMap = 0Yt.A03(A08);
            } else {
                linkedHashMap = null;
            }
            C21053XCe.A17(A0e, linkedHashMap);
            A0e.A9F("carousel_transformation_type", (Long) null);
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                linkedHashMap2 = DbS.A0x(C21055XCg.A00(A0f));
                Iterator it3 = A0f.iterator();
                while (it3.hasNext()) {
                    C21055XCg.A1Y(it3, linkedHashMap2);
                }
            } else {
                linkedHashMap2 = null;
            }
            C21053XCe.A16(A0e, linkedHashMap2);
            C21054XCf.A1V(A0e, A01);
            C21054XCf.A0s(A0e, A01);
            A0e.A7p(AnonymousClass000.A00(312), (Boolean) null);
            C21053XCe.A13(A0e, A01);
            AbstractCollection A0d2 = C21053XCe.A0d(C271774jZ.A8N, A01);
            if (A0d2 != null) {
                arrayList3 = AnonymousClass7TE.A1C();
                Iterator it4 = A0d2.iterator();
                while (it4.hasNext()) {
                    it4.next();
                    String A055 = r132.A05("sticker_id");
                    if (!(A055 == null || (A05 = r132.A05("sticker_type")) == null)) {
                        0bb r02 = new 0bb();
                        r02.A06("sticker_id", A055);
                        r02.A06("sticker_type", A05);
                        arrayList3.add(r02);
                    }
                }
            } else {
                arrayList3 = null;
            }
            A0e.AAe("sticker_types", arrayList3);
            C21054XCf.A12(A0e, A01);
            C21054XCf.A1H(A0e, A01);
            A0e.AAJ("log_auditor_session", (String) null);
            A0e.A9F("seed_ad_id", C21055XCg.A0P(C271774jZ.A7q, A01));
            A0e.A9F("hscroll_seed_ad_id", C21055XCg.A0P(C271774jZ.A3b, A01));
            A0e.A9F(C273654mx.A00(729), C21055XCg.A0P(C271774jZ.A3d, A01));
            A0e.A9F(C273654mx.A00(728), C21055XCg.A0P(C271774jZ.A3c, A01));
            C21055XCg.A19(A0e, A01, C21055XCg.A0P(C271774jZ.A2u, A01));
            A0e.A9F("multi_ads_first_ad_id", C21055XCg.A0P(C271774jZ.A5t, A01));
            A0e.AAJ("intent_aware_ads_trigger_type", C51966G9m.A1C(C271774jZ.A3p, A01));
            C21054XCf.A16(A0e, A01);
            A0e.A9F("ad_id_long", C21055XCg.A0M(A0e, r6, r7, A01));
            A0e.AAe("c_pk_list", (List) null);
            A0e.A8D("tap_x_position", C21053XCe.A0Y(C271774jZ.A8q, A01));
            A0e.A8D("tap_y_position", C21053XCe.A0Y(C271774jZ.A8r, A01));
            A0e.A9F("author_id", C51966G9m.A13(r6, A01));
            A0e.A9F("product_id_long", C51966G9m.A13(r55, A01));
            C21054XCf.A1G(A0e, A01);
            C21053XCe.A0y(A0e, A01);
            A0e.A9H("client_ad_creative_optimization_output", (Map) null);
            C21055XCg.A17(A0e, A01);
            C51969G9p.A1A(A0e, r14);
            A0e.AAJ("contextual_ads_category", C51966G9m.A1C(C271774jZ.A1c, A01));
            A0e.AAJ("opt_in_state", (String) null);
            C21054XCf.A10(A0e, A01);
            C21054XCf.A0l(A0e, A01);
            C21054XCf.A0x(A0e, A01);
            C21054XCf.A0N(A0e, A01);
            0jB A013 = A01.A01(C271774jZ.A75);
            if (A013 == null) {
                r5 = null;
            } else {
                r5 = new 0bb();
                r5.A06("body", C51966G9m.A1C(C271774jZ.A76, A013));
                r5.A03("has_image", C21053XCe.A0W(C271774jZ.A7A, A013));
                r5.A06("style", C51966G9m.A1C(C271774jZ.A7G, A013));
                C21055XCg.A1O(r5, A013, A013.A01(C271774jZ.A7I));
                r5.A06("source_of_tapping", C51966G9m.A1C(C271774jZ.A7F, A013));
            }
            A0e.AAK(r5, "reels_mid_scene_info");
            0jB A014 = A01.A01(C271774jZ.A6y);
            if (A014 == null) {
                r52 = null;
            } else {
                r52 = new 0bb();
                r52.A06(AnonymousClass000.A00(2959), C51966G9m.A1C(C271774jZ.A6x, A014));
                r52.A06(AnonymousClass000.A00(2960), C51966G9m.A1C(C271774jZ.A6z, A014));
                r52.A06(AnonymousClass000.A00(2961), C51966G9m.A1C(C271774jZ.A70, A014));
                r52.A05(AnonymousClass000.A00(2962), C51966G9m.A13(C271774jZ.A71, A014));
            }
            A0e.AAK(r52, AnonymousClass000.A00(3863));
            A0e.AAJ("cta_action", (String) null);
            A0e.AAK((0bb) null, AnonymousClass000.A00(4574));
            A0e.A9F("host_profile_id", C51966G9m.A13(C271774jZ.A3Y, A01));
            C21054XCf.A1C(A0e, A01);
            0jB A015 = A01.A01(C271774jZ.A1O);
            if (A015 == null) {
                r53 = null;
            } else {
                r53 = new 0bb();
                r53.A05("thumbnail_click_index", C51966G9m.A13(C271774jZ.A1K, A015));
                r53.A05("collection_product_id", C51966G9m.A13(C271774jZ.A1P, A015));
            }
            A0e.AAK(r53, "product_extension_collection_info");
            0jB A016 = A01.A01(C271774jZ.A20);
            Long l3 = null;
            if (A016 == null) {
                r15 = null;
            } else {
                r15 = new 0bb();
                C21055XCg.A1N(r15, A016);
                Number A0b = C21053XCe.A0b(C271774jZ.A21, A016);
                if (A0b != null) {
                    l3 = C51969G9p.A0r(A0b);
                }
                r15.A05(AnonymousClass000.A00(2575), l3);
            }
            A0e.AAK(r15, AnonymousClass000.A00(3864));
            A0e.A8D("ad_tag_width", C21055XCg.A0K(C271774jZ.A0O, A01));
            A0e.A8D("ad_tag_height", C21055XCg.A0K(C271774jZ.A0N, A01));
            C21055XCg.A0r(A0e, A01);
            A0e.A7p("is_dwell_tap_to_iab_enabled", C21053XCe.A0W(C271774jZ.A4E, A01));
            A0e.AAJ(C273654mx.A00(138), C51966G9m.A1C(C271774jZ.A28, A01));
            Number A0b2 = C21053XCe.A0b(C271774jZ.A5f, A01);
            if (A0b2 != null) {
                l2 = C51969G9p.A0r(A0b2);
            }
            A0e.A9F(C273654mx.A00(342), l2);
            A0e.Cgf();
        }
    }
}
