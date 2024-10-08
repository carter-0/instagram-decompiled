package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class XWy {
    public static final void A00(0wc r7, C254523sc r8, AnonymousClass4DU r9) {
        Long l;
        LinkedHashMap linkedHashMap;
        Map map;
        Map map2;
        LinkedHashMap linkedHashMap2;
        Map map3;
        Map map4;
        0Aj A0e = AnonymousClass7TE.A0e(r7, AnonymousClass000.A00(1472));
        0jB A01 = r8.A01();
        if (A0e.isSampled()) {
            C21054XCf.A1K(A0e, A01);
            C21055XCg.A1A(A0e, A01, C51966G9m.A13(C271774jZ.A5K, A01), "media_id");
            C51969G9p.A19(A0e, r9);
            C21054XCf.A1M(A0e, A01);
            C21054XCf.A17(A0e, A01);
            C21055XCg.A0o(A0e, A01);
            C21054XCf.A1L(A0e, A01);
            C21054XCf.A0L(A0e, A01);
            C21054XCf.A0z(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21054XCf.A0o(A0e, A01);
            C21055XCg.A0p(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A1R(A0e, A01);
            C21054XCf.A0k(A0e, A01);
            C21055XCg.A1D(A0e, A01, C51966G9m.A13(C271774jZ.A7b, A01), "reel_viewer_position");
            C21053XCe.A12(A0e, A01);
            C21054XCf.A0J(A0e, A01);
            0j9 r6 = C271774jZ.A12;
            C21053XCe.A0w(A0e, r6, A01);
            A0e.A9F("carousel_media_id_int", C51966G9m.A13(C271774jZ.A11, A01));
            C21053XCe.A0z(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            C21054XCf.A0f(A0e, A01);
            0j9 r72 = C271774jZ.A0Z;
            A0e.AAJ("a_pk", String.valueOf(A01.A01(r72)));
            C21054XCf.A0e(A0e, A01);
            String A1C = C51966G9m.A1C(C271774jZ.A0B, A01);
            Long l2 = null;
            if (A1C != null) {
                l = DbV.A0q(A1C);
            } else {
                l = null;
            }
            A0e.A9F("ad_id", l);
            C21054XCf.A0a(A0e, A01);
            C21054XCf.A1F(A0e, A01);
            C21055XCg.A1B(A0e, A01, C51966G9m.A13(C271774jZ.A2J, A01), "dr_ad_type");
            C21054XCf.A0M(A0e, A01);
            C21054XCf.A0K(A0e, A01);
            A0e.A7p("is_head_load", (Boolean) null);
            A0e.A7p("is_organic_media_tracked", (Boolean) null);
            C21054XCf.A0j(A0e, A01);
            C21055XCg.A1G(A0e, A01, "is_programmatic_scroll", C51966G9m.A1C(C271774jZ.A4g, A01));
            C21054XCf.A0H(A0e, A01);
            0j9 r4 = C271774jZ.A5a;
            C21055XCg.A0h(A0e, r4, A01);
            0xF A00 = A01.A00();
            0bb r82 = new 0bb();
            r82.A06("is_showreel_native", C21053XCe.A0c(C271774jZ.A4p, A01));
            r82.A04("media_height", C21054XCf.A03(A00, "media_height"));
            r82.A04("media_width", C21054XCf.A03(A00, "media_width"));
            r82.A05("caption_font_size", C21055XCg.A0O(A00, "caption_font_size"));
            r82.A04("caption_position_start_x", C21054XCf.A03(A00, "caption_position_start_x"));
            r82.A04("caption_position_start_y", C21054XCf.A03(A00, "caption_position_start_y"));
            r82.A04("caption_line_height", C21054XCf.A03(A00, "caption_line_height"));
            r82.A04("caption_height", C21054XCf.A03(A00, "caption_line_height"));
            r82.A04("caption_width", C21054XCf.A03(A00, "caption_width"));
            C21055XCg.A1K(r82, A00, C21055XCg.A0J(A00, "is_caption_fully_displayed"));
            r82.A05("caption_num_char_showed", C21055XCg.A0O(A00, "caption_num_char_showed"));
            r82.A05("caption_num_hashtags_showed", C21055XCg.A0O(A00, "caption_num_hashtags_showed"));
            r82.A05("caption_num_lines_showed", C21055XCg.A0O(A00, "caption_num_lines_showed"));
            r82.A05("caption_num_lines_total", C21055XCg.A0O(A00, "caption_num_lines_total"));
            r82.A05("caption_num_mentions_showed", C21055XCg.A0O(A00, "caption_num_mentions_showed"));
            C21055XCg.A1L(r82, A00, "caption_text_color");
            r82.A05("screen_density", C21055XCg.A0R(C271774jZ.A7l, A01));
            r82.A05("screen_width", C21055XCg.A0N(r82, A01, C21055XCg.A0R(C271774jZ.A7m, A01)));
            A0e.AAK(r82, "media_layout");
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            C21054XCf.A1A(A0e, A01);
            C21055XCg.A0u(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A0Q(A0e, A01);
            C21054XCf.A1S(A0e, A01);
            C21054XCf.A0n(A0e, A01);
            C21054XCf.A0q(A0e, A01);
            C21054XCf.A0S(A0e, A01);
            C21054XCf.A1T(A0e, A01);
            C21055XCg.A15(A0e, A01);
            C21055XCg.A0f(A0e, r4, A01);
            C21054XCf.A0i(A0e, A01);
            C21055XCg.A0z(A0e, A01);
            C21054XCf.A0t(A0e, A01);
            C21054XCf.A1J(A0e, A01);
            C21054XCf.A1U(A0e, A01);
            C21053XCe.A10(A0e, A01);
            C21053XCe.A0x(A0e, r6, A01);
            C21054XCf.A16(A0e, A01);
            C21054XCf.A0Y(A0e, A01);
            C21054XCf.A0m(A0e, A01);
            A0e.A9H("header_layout", (Map) null);
            C21055XCg.A0q(A0e, A01);
            C21054XCf.A13(A0e, A01);
            A0e.A9F("unseen_reel_size", (Long) null);
            C21054XCf.A0r(A0e, A01);
            C21054XCf.A1I(A0e, A01);
            A0e.A9F("author_id", C21055XCg.A0P(C271774jZ.A0Y, A01));
            C21054XCf.A18(A0e, A01);
            C21054XCf.A0V(A0e, A01);
            C21055XCg.A0s(A0e, A01);
            AbstractCollection abstractCollection = (AbstractCollection) C21055XCg.A0I(A0e, A01);
            if (abstractCollection != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(abstractCollection);
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    C21055XCg.A1V(A0p, it);
                }
                linkedHashMap = C21053XCe.A0i(A0p);
            } else {
                linkedHashMap = null;
            }
            A0e.A9H("sponsor_tag_ids", linkedHashMap);
            C21054XCf.A12(A0e, A01);
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A9g, A01);
            if (A0d != null) {
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0d);
                Iterator it2 = A0d.iterator();
                while (it2.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it2);
                    AnonymousClass7TF.A1I(DbV.A0q(A18), C21053XCe.A0a(A18), A0p2);
                }
                map = 0Yt.A08(A0p2);
            } else {
                map = null;
            }
            A0e.A9H("video_to_carousel_cut_secs", map);
            C21054XCf.A1W(A0e, A01);
            C21055XCg.A14(A0e, A01);
            C21055XCg.A0m(A0e, A01);
            AbstractCollection A0d2 = C21053XCe.A0d(C271774jZ.A17, A01);
            if (A0d2 != null) {
                ArrayList A0p3 = AnonymousClass7TF.A0p(A0d2);
                Iterator it3 = A0d2.iterator();
                while (it3.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(it3);
                    AnonymousClass7TF.A1I(DbV.A0q(A182), A182, A0p3);
                }
                map2 = 0Yt.A08(A0p3);
            } else {
                map2 = null;
            }
            A0e.A9H("carousel_transformation_cards", map2);
            C21054XCf.A1V(A0e, A01);
            C21055XCg.A10(A0e, A01);
            A0e.A9F("merchant_id", C21055XCg.A0P(C271774jZ.A5e, A01));
            A0e.AAe("c_pk_list", (List) null);
            A0e.A9F("a_pk_long", C51966G9m.A13(r72, A01));
            C21055XCg.A1E(A0e, A01, C51966G9m.A13(C271774jZ.A0C, A01), "ad_id_long");
            A0e.AAK((0bb) null, "toolbar_layout");
            A0e.A9F("carousel_transformation_type", (Long) null);
            A0e.A9H("sticker_types", (Map) null);
            C21054XCf.A0s(A0e, A01);
            C21053XCe.A0y(A0e, A01);
            A0e.A9H("client_ad_creative_optimization_output", (Map) null);
            C21055XCg.A17(A0e, A01);
            C21054XCf.A11(A0e, A01);
            C21054XCf.A0x(A0e, A01);
            AbstractMap A0g = C21053XCe.A0g(A01);
            if (A0g != null) {
                linkedHashMap2 = C21054XCf.A08(A0g);
                Iterator A0s = AnonymousClass7TF.A0s(A0g);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    Object key = A1J.getKey();
                    Iterable iterable = (Iterable) A1J.getValue();
                    ArrayList A0p4 = AnonymousClass7TF.A0p(iterable);
                    Iterator it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        C21055XCg.A1V(A0p4, it4);
                    }
                    linkedHashMap2.put(key, 0Yt.A08(A0p4));
                }
            } else {
                linkedHashMap2 = null;
            }
            C21053XCe.A17(A0e, linkedHashMap2);
            C21055XCg.A16(A0e, A01);
            C21054XCf.A1Q(A0e, A01);
            A0e.AAJ("host_media_pk", C51966G9m.A1C(C271774jZ.A3X, A01));
            C21054XCf.A1H(A0e, A01);
            C21054XCf.A0l(A0e, A01);
            C21054XCf.A0P(A0e, A01);
            A0e.A9F("hscroll_seed_ad_id", C21055XCg.A0P(C271774jZ.A3b, A01));
            C21054XCf.A0Z(A0e, A01);
            C21054XCf.A0v(A0e, A01);
            C21056XCh.A0G(A0e, A01, C21055XCg.A0P(C271774jZ.A5t, A01));
            C21054XCf.A19(A0e, A01);
            A0e.A7p("is_below_eof", (Boolean) null);
            A0e.A9F("upcoming_event_id", C21055XCg.A0P(C271774jZ.A9Y, A01));
            C21054XCf.A0O(A0e, A01);
            C21054XCf.A0N(A0e, A01);
            C21054XCf.A0d(A0e, A01);
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                ArrayList A0p5 = AnonymousClass7TF.A0p(A0f);
                Iterator it5 = A0f.iterator();
                while (it5.hasNext()) {
                    C21055XCg.A1X(A0p5, it5);
                }
                map3 = 0Yt.A08(A0p5);
            } else {
                map3 = null;
            }
            C21053XCe.A16(A0e, map3);
            C21054XCf.A10(A0e, A01);
            A0e.AAJ("survey_id", C51966G9m.A1C(C271774jZ.A8U, A01));
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                ArrayList A0p6 = AnonymousClass7TF.A0p(A0e2);
                Iterator it6 = A0e2.iterator();
                while (it6.hasNext()) {
                    C21055XCg.A1X(A0p6, it6);
                }
                map4 = 0Yt.A08(A0p6);
            } else {
                map4 = null;
            }
            A0e.A9H("product_ids", map4);
            C21054XCf.A0u(A0e, A01);
            C21054XCf.A0C(A0e, A01);
            C21055XCg.A0n(A0e, A01);
            A0e.A9H("carousel_media_product_ids", (Map) null);
            A0e.A9F("seed_ad_id", C21055XCg.A0P(C271774jZ.A7q, A01));
            C21054XCf.A0g(A0e, A01);
            String A1C2 = C51966G9m.A1C(C271774jZ.A2u, A01);
            if (A1C2 != null) {
                l2 = DbV.A0q(A1C2);
            }
            A0e.A9F("first_hscroll_item_ad_id", l2);
            A0e.A9F("horizontal_position_on_hscroll", C51966G9m.A13(C271774jZ.A3W, A01));
            A0e.A9F("vertical_position_on_feed_of_ads", C51966G9m.A13(C271774jZ.A9d, A01));
            A0e.A9F("position_in_multi_ads_unit", C51966G9m.A13(C271774jZ.A6Y, A01));
            A0e.A7p(AnonymousClass000.A00(3442), C21053XCe.A0W(C271774jZ.A4S, A01));
            C21054XCf.A09(A0e, A01);
            A0e.Cgf();
        }
    }
}
