package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.XWv  reason: case insensitive filesystem */
public abstract class C21336XWv {
    public static final void A00(0wc r12, C254523sc r13) {
        0bb r9;
        LinkedHashMap linkedHashMap;
        Map map;
        LinkedHashMap linkedHashMap2;
        Map map2;
        0bb r6;
        Long l;
        Long l2;
        Double d;
        0Aj A0e = AnonymousClass7TE.A0e(r12, "instagram_ad_carousel_impression");
        0jB A01 = r13.A01();
        0xF r2 = r13.A00().A06;
        if (A0e.isSampled()) {
            C21054XCf.A0H(A0e, A01);
            C21055XCg.A1G(A0e, A01, "tracking_token", C51966G9m.A1C(C271774jZ.A9L, A01));
            C21055XCg.A0i(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            C21053XCe.A12(A0e, A01);
            A0e.A7p("post_impression_column_override", C21053XCe.A0W(C271774jZ.A6O, A01));
            0j9 r62 = C271774jZ.A5a;
            C21053XCe.A0t(A0e, r62, A01);
            A0e.AAJ("a_pk", C51966G9m.A1C(C271774jZ.A0Y, A01));
            C21054XCf.A0c(A0e, A01);
            C21054XCf.A0U(A0e, A01);
            C21054XCf.A1S(A0e, A01);
            C21054XCf.A0q(A0e, A01);
            0j9 r7 = C271774jZ.A12;
            C21053XCe.A0w(A0e, r7, A01);
            0j9 r8 = C271774jZ.A0C;
            C21053XCe.A0v(A0e, r8, A01);
            0jB A0D = C21053XCe.A0D(A01);
            if (A0D != null) {
                0xF A00 = A0D.A00();
                r9 = new 0bb();
                C21054XCf.A1a(r9, A0D);
                String A05 = A00.A05("media_height");
                Long l3 = null;
                if (A05 != null) {
                    d = C21053XCe.A0a(A05);
                } else {
                    d = null;
                }
                r9.A04("media_height", d);
                r9.A04("media_width", C21054XCf.A03(A00, "media_width"));
                r9.A04("caption_font_size", C21054XCf.A03(A00, "caption_font_size"));
                r9.A04("caption_position_start_x", C21054XCf.A03(A00, "caption_position_start_x"));
                r9.A04("caption_position_start_y", C21054XCf.A03(A00, "caption_position_start_y"));
                r9.A04("caption_line_height", C21054XCf.A03(A00, "caption_line_height"));
                r9.A04("caption_height", C21054XCf.A03(A00, "caption_line_height"));
                r9.A04("caption_width", C21054XCf.A03(A00, "caption_width"));
                C21055XCg.A1K(r9, A00, C21055XCg.A0J(A00, "is_caption_fully_displayed"));
                r9.A05("caption_num_char_showed", C21055XCg.A0O(A00, "caption_num_char_showed"));
                r9.A05("caption_num_hashtags_showed", C21055XCg.A0O(A00, "caption_num_hashtags_showed"));
                r9.A05("caption_num_lines_showed", C21055XCg.A0O(A00, "caption_num_lines_showed"));
                r9.A05("caption_num_lines_total", C21055XCg.A0O(A00, "caption_num_lines_total"));
                String A052 = A00.A05("caption_num_mentions_showed");
                if (A052 != null) {
                    l3 = DbV.A0q(A052);
                }
                r9.A05("caption_num_mentions_showed", l3);
                C21055XCg.A1L(r9, A00, "caption_text_color");
                C21055XCg.A1M(r9, A0D);
            } else {
                r9 = null;
            }
            A0e.AAK(r9, "media_layout");
            C21054XCf.A0Z(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21055XCg.A0z(A0e, A01);
            A0e.A9F("dark_mode_state", C21054XCf.A07(C21053XCe.A0b(C271774jZ.A1z, A01)));
            C21054XCf.A1L(A0e, A01);
            C21054XCf.A0e(A0e, A01);
            C21054XCf.A1K(A0e, A01);
            C21054XCf.A0M(A0e, A01);
            C21054XCf.A0i(A0e, A01);
            C21054XCf.A0K(A0e, A01);
            C21054XCf.A1J(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21055XCg.A0g(A0e, C271774jZ.A6S, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21055XCg.A1C(A0e, A01, C51966G9m.A13(r62, A01), "media_type");
            C21055XCg.A0l(A0e, A01);
            C21054XCf.A1M(A0e, A01);
            C21054XCf.A14(A0e, A01);
            C21054XCf.A0t(A0e, A01);
            C21054XCf.A16(A0e, A01);
            0j9 r63 = C271774jZ.A0Z;
            A0e.A9F("author_id", C51966G9m.A13(r63, A01));
            C21054XCf.A0X(A0e, A01);
            A0e.AAe("c_pk_list", (List) null);
            C21055XCg.A1E(A0e, A01, C21055XCg.A0M(A0e, r63, r8, A01), "ad_id_long");
            C21055XCg.A0o(A0e, A01);
            C21053XCe.A0x(A0e, r7, A01);
            C21054XCf.A0a(A0e, A01);
            A0e.A9F("carousel_container_media_id", C51966G9m.A13(C271774jZ.A0w, A01));
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
            C21054XCf.A1V(A0e, A01);
            A0e.AAJ("topic_cluster_status", (String) null);
            C21054XCf.A1W(A0e, A01);
            C21054XCf.A12(A0e, A01);
            C21054XCf.A0A(A0e, A01);
            0j9 r11 = C271774jZ.A5e;
            A0e.A9F("merchant_id", C21055XCg.A0P(r11, A01));
            0j9 r64 = C271774jZ.A5S;
            A0e.A9F("media_owner_id", C51966G9m.A13(r64, A01));
            A0e.A9H("client_ad_creative_optimization_output", (Map) null);
            A0e.A9F("media_owner_id_long", C51966G9m.A13(r64, A01));
            C21055XCg.A0m(A0e, A01);
            C21055XCg.A17(A0e, A01);
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            A0e.A9F("hscroll_seed_ad_id", C21055XCg.A0P(C271774jZ.A3b, A01));
            C21054XCf.A0g(A0e, A01);
            C21056XCh.A0G(A0e, A01, C21055XCg.A0P(C271774jZ.A5t, A01));
            C21054XCf.A0l(A0e, A01);
            C21054XCf.A0x(A0e, A01);
            C21054XCf.A19(A0e, A01);
            0j9 r92 = C271774jZ.A6j;
            AbstractCollection A0d = C21053XCe.A0d(r92, A01);
            if (A0d != null) {
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0d);
                Iterator it2 = A0d.iterator();
                while (it2.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it2);
                    if (A18 != null) {
                        l2 = DbV.A0q(A18);
                    } else {
                        l2 = null;
                    }
                    AnonymousClass7TF.A1I(l2, A18, A0p2);
                }
                map = 0Yt.A08(A0p2);
            } else {
                map = null;
            }
            A0e.A9H("product_ids", map);
            AbstractMap A0g = C21053XCe.A0g(A01);
            if (A0g != null) {
                linkedHashMap2 = C21054XCf.A08(A0g);
                Iterator A0s = AnonymousClass7TF.A0s(A0g);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    Object key = A1J.getKey();
                    Iterable iterable = (Iterable) A1J.getValue();
                    ArrayList A0p3 = AnonymousClass7TF.A0p(iterable);
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        C21055XCg.A1V(A0p3, it3);
                    }
                    linkedHashMap2.put(key, 0Yt.A08(A0p3));
                }
            } else {
                linkedHashMap2 = null;
            }
            C21053XCe.A17(A0e, linkedHashMap2);
            C21054XCf.A0T(A0e, A01);
            C21054XCf.A0L(A0e, A01);
            C21054XCf.A0N(A0e, A01);
            A0e.A9F("main_feed_carousel_starting_media_id", C21055XCg.A0P(C271774jZ.A5A, A01));
            C21054XCf.A10(A0e, A01);
            A0e.A7p("is_below_eof", (Boolean) null);
            C21054XCf.A0Q(A0e, A01);
            C21054XCf.A0O(A0e, A01);
            C21054XCf.A1D(A0e, A01);
            C21054XCf.A0j(A0e, A01);
            A0e.A7p("is_ad_tag_enabled", C21053XCe.A0W(C271774jZ.A3u, A01));
            C21055XCg.A0n(A0e, A01);
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                ArrayList A0p4 = AnonymousClass7TF.A0p(A0f);
                Iterator it4 = A0f.iterator();
                while (it4.hasNext()) {
                    C21055XCg.A1X(A0p4, it4);
                }
                map2 = 0Yt.A08(A0p4);
            } else {
                map2 = null;
            }
            C21053XCe.A16(A0e, map2);
            A0e.AAK((0bb) null, "multi_ads_extra");
            C21054XCf.A0u(A0e, A01);
            C21054XCf.A0p(A0e, A01);
            A0e.A9F("counter_id", C21055XCg.A0P(C271774jZ.A1g, A01));
            A0e.A9F("counter_sid", C21055XCg.A0P(C271774jZ.A1h, A01));
            A0e.A9F("connection_id", C21055XCg.A0P(C271774jZ.A1X, A01));
            C21054XCf.A0P(A0e, A01);
            C21053XCe.A0s(A0e, C271774jZ.A3P, A01);
            C21055XCg.A11(A0e, A01);
            C21054XCf.A0C(A0e, A01);
            A0e.A9H("carousel_media_product_ids", (Map) null);
            A0e.A9F("recs_ix", C21055XCg.A0O(r2, "recs_ix"));
            C21054XCf.A1R(A0e, A01);
            C21054XCf.A0s(A0e, A01);
            A0e.A9F("feed_recs_post_position", (Long) null);
            C21055XCg.A16(A0e, A01);
            C21054XCf.A17(A0e, A01);
            C21054XCf.A0V(A0e, A01);
            A0e.A9F("collection_id", C21055XCg.A0P(C271774jZ.A1L, A01));
            A0e.AAJ("collection_name", C51966G9m.A1C(C271774jZ.A1N, A01));
            A0e.A9F("carousel_ad_id", (Long) null);
            A0e.AAJ("carousel_image_url", (String) null);
            C21054XCf.A0d(A0e, A01);
            0jB A012 = A01.A01(C271774jZ.A81);
            if (A012 != null) {
                0xF A002 = A012.A00();
                r6 = new 0bb();
                String A1C = C51966G9m.A1C(r11, A012);
                Map map3 = null;
                if (A1C != null) {
                    l = DbV.A0q(A1C);
                } else {
                    l = null;
                }
                r6.A05("merchant_id", l);
                AbstractCollection A0d2 = C21053XCe.A0d(r92, A012);
                if (A0d2 != null) {
                    ArrayList A0p5 = AnonymousClass7TF.A0p(A0d2);
                    Iterator it5 = A0d2.iterator();
                    while (it5.hasNext()) {
                        C21055XCg.A1X(A0p5, it5);
                    }
                    map3 = 0Yt.A08(A0p5);
                }
                r6.A08("product_ids", map3);
                String A053 = A002.A05("shopping_sticker_id");
                if (A053 == null) {
                    A053 = "";
                }
                r6.A06("shopping_sticker_id", A053);
            } else {
                r6 = null;
            }
            A0e.AAK(r6, "shopping_sticker_info");
            A0e.AAJ("carouwel_cover_media_id", (String) null);
            A0e.A9F("start_process_time", (Long) null);
            A0e.AAJ("store_id", (String) null);
            C21055XCg.A0r(A0e, A01);
            A0e.Cgf();
        }
    }
}
