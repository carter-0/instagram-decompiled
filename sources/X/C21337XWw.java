package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.XWw  reason: case insensitive filesystem */
public abstract class C21337XWw {
    public static final void A00(0wc r11, C254523sc r12, AnonymousClass4DU r13) {
        ArrayList arrayList;
        long j;
        Double d;
        0bb r10;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        Long l;
        Long l2;
        Long A0n;
        Long l3;
        0Aj A0e = AnonymousClass7TE.A0e(r11, AnonymousClass000.A00(1471));
        0jB A01 = r12.A01();
        if (A0e.isSampled()) {
            String A1C = C51966G9m.A1C(C271774jZ.A5I, A01);
            if (A1C == null) {
                A1C = "";
            }
            C51965G9l.A1I(A0e, A1C);
            long j2 = 0;
            C51965G9l.A1E(A0e, Long.valueOf(DbY.A04(C21053XCe.A0b(C271774jZ.A5K, A01))));
            A0e.A9F("media_author_id", Long.valueOf(DbY.A04(C21053XCe.A0b(C271774jZ.A5E, A01))));
            C51969G9p.A19(A0e, r13);
            C21054XCf.A1T(A0e, A01);
            C21054XCf.A0M(A0e, A01);
            C21054XCf.A1K(A0e, A01);
            0j9 r9 = C271774jZ.A0C;
            A0e.A9F("ad_id", C51966G9m.A13(r9, A01));
            C21054XCf.A0e(A0e, A01);
            A0e.A9F(C273654mx.A00(1432), C51966G9m.A13(C271774jZ.A03, A01));
            C21053XCe.A12(A0e, A01);
            C21053XCe.A0z(A0e, A01);
            C21054XCf.A0f(A0e, A01);
            C21054XCf.A0J(A0e, A01);
            C21055XCg.A1D(A0e, A01, C51966G9m.A13(C271774jZ.A11, A01), "carousel_media_id_int");
            0bb r2 = null;
            A0e.A8D("current_play_time", C21053XCe.A0Z(C21053XCe.A0b(C271774jZ.A1w, A01)));
            C21054XCf.A1J(A0e, A01);
            C21055XCg.A1G(A0e, A01, "ranking_session_id", C51966G9m.A1C(C271774jZ.A6q, A01));
            C21054XCf.A0T(A0e, A01);
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(A0e2);
                Iterator it = A0e2.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    if (A18 != null) {
                        l3 = DbV.A0q(A18);
                    } else {
                        l3 = null;
                    }
                    A0p.add(l3);
                }
                arrayList = 00k.A0U(A0p);
            } else {
                arrayList = null;
            }
            A0e.AAe("product_ids", arrayList);
            A0e.A9F("product_id", C21055XCg.A0P(C271774jZ.A6i, A01));
            String A1C2 = C51966G9m.A1C(C271774jZ.A5e, A01);
            if (A1C2 == null || (A0n = 00y.A0n(10, A1C2)) == null) {
                j = -1;
            } else {
                j = A0n.longValue();
            }
            A0e.A9F("merchant_id", Long.valueOf(j));
            C21054XCf.A1L(A0e, A01);
            C21054XCf.A0K(A0e, A01);
            C21054XCf.A1A(A0e, A01);
            C21055XCg.A12(A0e, A01);
            C21054XCf.A14(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A0o(A0e, A01);
            C21055XCg.A0p(A0e, A01);
            C21055XCg.A11(A0e, A01);
            C21053XCe.A0s(A0e, C271774jZ.A3P, A01);
            Number A0b = C21053XCe.A0b(C271774jZ.A3g, A01);
            if (A0b != null) {
                d = Double.valueOf((double) A0b.intValue());
            } else {
                d = null;
            }
            A0e.A8D("igtv_video_width", d);
            A0e.A9F("push_down_offset", C21054XCf.A07(C21053XCe.A0b(C271774jZ.A0U, A01)));
            C21055XCg.A0x(A0e, A01);
            C21054XCf.A18(A0e, A01);
            A0e.A9F("seed_ad_id", C21055XCg.A0P(C271774jZ.A7q, A01));
            A0e.A9F("hscroll_seed_ad_id", C21055XCg.A0P(C271774jZ.A3b, A01));
            C21055XCg.A19(A0e, A01, C21055XCg.A0P(C271774jZ.A2u, A01));
            C21055XCg.A1B(A0e, A01, C21055XCg.A0P(C271774jZ.A5t, A01), "multi_ads_first_ad_id");
            C21054XCf.A1S(A0e, A01);
            0j9 r112 = C271774jZ.A0Z;
            C21053XCe.A0u(A0e, r112, A01);
            0j9 r5 = C271774jZ.A5a;
            C21053XCe.A0t(A0e, r5, A01);
            C21055XCg.A0f(A0e, r5, A01);
            C21054XCf.A0i(A0e, A01);
            C21054XCf.A0D(A0e, A01);
            C21055XCg.A0e(A0e, C271774jZ.A8x, A01);
            C21054XCf.A0h(A0e, A01);
            0jB A0D = C21053XCe.A0D(A01);
            if (A0D == null) {
                r10 = null;
            } else {
                0xF A00 = A0D.A00();
                r10 = new 0bb();
                C21054XCf.A1a(r10, A0D);
                r10.A04("media_height", C21054XCf.A03(A00, "media_height"));
                r10.A05("media_width", C21055XCg.A0O(A00, "media_width"));
                r10.A05("caption_font_size", C21055XCg.A0O(A00, "caption_font_size"));
                r10.A04("caption_position_start_x", C21054XCf.A03(A00, "caption_position_start_x"));
                r10.A04("caption_position_start_y", C21054XCf.A03(A00, "caption_position_start_y"));
                r10.A04("caption_line_height", C21054XCf.A03(A00, "caption_line_height"));
                r10.A04("caption_height", C21054XCf.A03(A00, "caption_line_height"));
                r10.A04("caption_width", C21054XCf.A03(A00, "caption_width"));
                C21055XCg.A1K(r10, A00, C21055XCg.A0J(A00, "is_caption_fully_displayed"));
                r10.A05("caption_num_char_showed", C21055XCg.A0O(A00, "caption_num_char_showed"));
                r10.A05("caption_num_hashtags_showed", C21055XCg.A0O(A00, "caption_num_hashtags_showed"));
                r10.A05("caption_num_lines_showed", C21055XCg.A0O(A00, "caption_num_lines_showed"));
                r10.A05("caption_num_lines_total", C21055XCg.A0O(A00, "caption_num_lines_total"));
                r10.A05("caption_num_mentions_showed", C21055XCg.A0O(A00, "caption_num_mentions_showed"));
                C21055XCg.A1L(r10, A00, "caption_text_color");
                r10.A05("screen_density", C21055XCg.A0R(C271774jZ.A7l, A0D));
                r10.A05("screen_width", C21055XCg.A0N(r10, A0D, C21055XCg.A0R(C271774jZ.A7m, A0D)));
            }
            A0e.AAK(r10, "media_layout");
            C21054XCf.A0w(A0e, A01);
            C21054XCf.A0t(A0e, A01);
            C21055XCg.A0l(A0e, A01);
            A0e.A9F("dr_ad_type", C51966G9m.A13(C271774jZ.A2J, A01));
            C21054XCf.A1I(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            0j9 r52 = C271774jZ.A12;
            C21053XCe.A0x(A0e, r52, A01);
            C21053XCe.A0w(A0e, r52, A01);
            C21054XCf.A16(A0e, A01);
            C21054XCf.A0B(A0e, A01);
            A0e.A9F("author_id", C21055XCg.A0P(C271774jZ.A0Y, A01));
            C21054XCf.A0y(A0e, A01);
            A0e.A9F("ad_id", C21055XCg.A0M(A0e, r112, r9, A01));
            C21055XCg.A1E(A0e, A01, C51966G9m.A13(r9, A01), "ad_id_long");
            C21054XCf.A0s(A0e, A01);
            C21054XCf.A0a(A0e, A01);
            C21053XCe.A0y(A0e, A01);
            AbstractCollection abstractCollection = (AbstractCollection) C21055XCg.A0I(A0e, A01);
            if (abstractCollection != null) {
                ArrayList A0p2 = AnonymousClass7TF.A0p(abstractCollection);
                Iterator it2 = abstractCollection.iterator();
                while (it2.hasNext()) {
                    C21055XCg.A1V(A0p2, it2);
                }
                linkedHashMap = C21053XCe.A0i(A0p2);
            } else {
                linkedHashMap = null;
            }
            A0e.A9H("sponsor_tag_ids", linkedHashMap);
            A0e.AAe("c_pk_list", (List) null);
            C21054XCf.A1W(A0e, A01);
            C21054XCf.A0j(A0e, A01);
            C21054XCf.A1V(A0e, A01);
            C21055XCg.A0m(A0e, A01);
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            C21054XCf.A0A(A0e, A01);
            C21054XCf.A12(A0e, A01);
            A0e.AAJ("topic_cluster_status", (String) null);
            C21054XCf.A1D(A0e, A01);
            A0e.A9H("client_ad_creative_optimization_output", (Map) null);
            C21055XCg.A17(A0e, A01);
            C21054XCf.A0x(A0e, A01);
            C21054XCf.A0l(A0e, A01);
            C21054XCf.A0Q(A0e, A01);
            C21055XCg.A16(A0e, A01);
            C21054XCf.A0P(A0e, A01);
            C21054XCf.A0N(A0e, A01);
            Integer num = AnonymousClass05K.A0j;
            A0e.A9H("product_merchant_ids", (Map) A01.A01(new 0j9(num, "product_merchant_ids")));
            A0e.A9F("upcoming_event_id", C21055XCg.A0P(C271774jZ.A9Y, A01));
            0j9 r92 = C271774jZ.A5S;
            A0e.A9F("media_owner_id", C51966G9m.A13(r92, A01));
            C21054XCf.A10(A0e, A01);
            A0e.A9F("main_feed_carousel_starting_media_id", C21055XCg.A0P(C271774jZ.A5A, A01));
            A0e.A7p("is_below_eof", (Boolean) null);
            C21054XCf.A0u(A0e, A01);
            C21054XCf.A0v(A0e, A01);
            C21054XCf.A0Z(A0e, A01);
            A0e.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C21055XCg.A0P(C271774jZ.A9T, A01));
            C21054XCf.A1Y(A0e, A01, num, "container_module");
            C21054XCf.A1Y(A0e, A01, num, "contextual_ads_category");
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                ArrayList A0p3 = AnonymousClass7TF.A0p(A0f);
                Iterator it3 = A0f.iterator();
                while (it3.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(it3);
                    if (A182 != null) {
                        l = DbV.A0q(A182);
                        l2 = DbV.A0q(A182);
                    } else {
                        l = null;
                        l2 = null;
                    }
                    AnonymousClass7TF.A1I(l, l2, A0p3);
                }
                linkedHashMap2 = C21053XCe.A0i(A0p3);
            } else {
                linkedHashMap2 = null;
            }
            C21053XCe.A16(A0e, linkedHashMap2);
            C21054XCf.A0d(A0e, A01);
            C21054XCf.A0O(A0e, A01);
            A0e.A9F("connection_id", C21055XCg.A0P(C271774jZ.A1X, A01));
            C21055XCg.A0n(A0e, A01);
            if (AnonymousClass7TF.A1Y(A01.A01(C271774jZ.A4M), true)) {
                j2 = 1;
            }
            C21053XCe.A0p(A0e, j2);
            C21054XCf.A1M(A0e, A01);
            A0e.A9F("media_owner_id_long", C51966G9m.A13(r92, A01));
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A2I, A01);
            if (A0d != null) {
                ArrayList A0p4 = AnonymousClass7TF.A0p(A0d);
                Iterator it4 = A0d.iterator();
                while (it4.hasNext()) {
                    C21055XCg.A1V(A0p4, it4);
                }
                linkedHashMap3 = C21053XCe.A0i(A0p4);
            } else {
                linkedHashMap3 = null;
            }
            A0e.A9H("drops_product_ids", linkedHashMap3);
            C21054XCf.A0C(A0e, A01);
            C21054XCf.A0p(A0e, A01);
            A0e.A9F("counter_id", C21055XCg.A0P(C271774jZ.A1g, A01));
            A0e.A9F("counter_sid", C21055XCg.A0P(C271774jZ.A1h, A01));
            A0e.AAK((0bb) null, "multi_ads_extra");
            A0e.A9H("carousel_media_product_ids", (Map) null);
            C21054XCf.A0V(A0e, A01);
            C21054XCf.A1X(A0e, A01, num);
            0jB A012 = A01.A01(C271774jZ.A20);
            if (A012 != null) {
                r2 = new 0bb();
                C21055XCg.A1N(r2, A012);
                r2.A04("remaining_time", C21053XCe.A0Y(C271774jZ.A24, A012));
            }
            A0e.AAK(r2, AnonymousClass000.A00(279));
            C21054XCf.A09(A0e, A01);
            DbX.A1L(A0e);
        }
    }
}
