package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class XX7 {
    public static final void A00(0wc r7, C254523sc r8, AnonymousClass4DU r9) {
        0bb r6;
        LinkedHashMap linkedHashMap;
        long j;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2;
        String str;
        Long A0n;
        Double d;
        0Aj A0e = AnonymousClass7TE.A0e(r7, "instagram_ad_unlike");
        0jB A01 = r8.A01();
        if (A0e.isSampled()) {
            C21054XCf.A0c(A0e, A01);
            C21054XCf.A0H(A0e, A01);
            C21054XCf.A1S(A0e, A01);
            C21055XCg.A1G(A0e, A01, "tracking_token", C51966G9m.A1C(C271774jZ.A9L, A01));
            C21053XCe.A0u(A0e, C271774jZ.A0Z, A01);
            C21053XCe.A0t(A0e, C271774jZ.A5a, A01);
            A0e.AAJ("source_of_like", C51966G9m.A1C(C271774jZ.A8B, A01));
            C21053XCe.A0v(A0e, C271774jZ.A0C, A01);
            C21055XCg.A0e(A0e, C271774jZ.A8x, A01);
            0jB A0D = C21053XCe.A0D(A01);
            0bb r2 = null;
            if (A0D != null) {
                0xF A00 = A0D.A00();
                r6 = new 0bb();
                C21054XCf.A1a(r6, A0D);
                String A05 = A00.A05("media_height");
                if (A05 != null) {
                    d = C21053XCe.A0a(A05);
                } else {
                    d = null;
                }
                r6.A04("media_height", d);
                r6.A05("media_width", C21055XCg.A0O(A00, "media_width"));
                r6.A05("caption_font_size", C21055XCg.A0O(A00, "caption_font_size"));
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
                r6.A05("caption_num_mentions_showed", C21055XCg.A0O(A00, "caption_num_mentions_showed"));
                C21055XCg.A1L(r6, A00, "caption_text_color");
                r6.A05("screen_density", C21055XCg.A0R(C271774jZ.A7l, A0D));
                r6.A05("screen_width", C21055XCg.A0N(r6, A0D, C21055XCg.A0R(C271774jZ.A7m, A0D)));
            } else {
                r6 = null;
            }
            A0e.AAK(r6, "media_layout");
            C21055XCg.A0z(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21055XCg.A1F(A0e, A01, "inventory_source", C51966G9m.A1C(C271774jZ.A3q, A01));
            C21054XCf.A0e(A0e, A01);
            C21054XCf.A1W(A0e, A01);
            C21055XCg.A0i(A0e, A01);
            C21053XCe.A12(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            C21053XCe.A0w(A0e, C271774jZ.A12, A01);
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21055XCg.A0g(A0e, C271774jZ.A6S, A01);
            C21054XCf.A12(A0e, A01);
            A0e.A9F("entity_id", C51966G9m.A13(C271774jZ.A2Z, A01));
            A0e.AAJ("entity_name", C51966G9m.A1C(C271774jZ.A2a, A01));
            C21054XCf.A0s(A0e, A01);
            A0e.AAJ("entity_type", C51966G9m.A1C(C271774jZ.A2d, A01));
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
            C21054XCf.A0x(A0e, A01);
            C21054XCf.A0y(A0e, A01);
            C21055XCg.A0l(A0e, A01);
            C21055XCg.A1C(A0e, A01, C51966G9m.A13(C271774jZ.A4B, A01), "is_dark_mode");
            C21054XCf.A1V(A0e, A01);
            C21053XCe.A0x(A0e, C271774jZ.A13, A01);
            C21055XCg.A10(A0e, A01);
            String A1C = C51966G9m.A1C(C271774jZ.A5e, A01);
            if (A1C == null || (A0n = 00y.A0n(10, A1C)) == null) {
                j = -1;
            } else {
                j = A0n.longValue();
            }
            A0e.A9F("merchant_id", Long.valueOf(j));
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0e2);
                Iterator it2 = A0e2.iterator();
                while (it2.hasNext()) {
                    C21054XCf.A1b(A0p2, it2);
                }
                arrayList = AnonymousClass7TE.A1D(00k.A0X(A0p2));
            } else {
                arrayList = null;
            }
            A0e.AAe("product_ids", arrayList);
            C21053XCe.A17(A0e, (Map) null);
            A0e.A9F("tap_type", (Long) null);
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            C21053XCe.A13(A0e, A01);
            C21055XCg.A0m(A0e, A01);
            C21054XCf.A1D(A0e, A01);
            C21054XCf.A0Q(A0e, A01);
            C21055XCg.A17(A0e, A01);
            A0e.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C21055XCg.A0P(C271774jZ.A9T, A01));
            C21054XCf.A0d(A0e, A01);
            C21054XCf.A0O(A0e, A01);
            A0e.A9F("min_consumed_media_gap_to_previous_ad", C51966G9m.A13(C271774jZ.A5j, A01));
            A0e.A9F("min_consumed_media_gap_to_previous_netego", C51966G9m.A13(C271774jZ.A5k, A01));
            A0e.A9F("min_consumed_reel_gap_to_previous_ad", C51966G9m.A13(C271774jZ.A5h, A01));
            A0e.A9F("min_consumed_reel_gap_to_previous_netego", C51966G9m.A13(C271774jZ.A5i, A01));
            C21054XCf.A0v(A0e, A01);
            C21054XCf.A0l(A0e, A01);
            A0e.A9F("main_feed_carousel_starting_media_id", C21055XCg.A0P(C271774jZ.A5A, A01));
            C21054XCf.A0P(A0e, A01);
            C21054XCf.A0C(A0e, A01);
            C21054XCf.A0L(A0e, A01);
            C21054XCf.A0u(A0e, A01);
            C21054XCf.A0p(A0e, A01);
            A0e.A9F("counter_id", C21055XCg.A0P(C271774jZ.A1g, A01));
            A0e.A9F("counter_sid", C21055XCg.A0P(C271774jZ.A1h, A01));
            C21055XCg.A16(A0e, A01);
            C21054XCf.A1O(A0e, A01);
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                ArrayList A0p3 = AnonymousClass7TF.A0p(A0f);
                Iterator it3 = A0f.iterator();
                while (it3.hasNext()) {
                    C21055XCg.A1X(A0p3, it3);
                }
                linkedHashMap2 = C21053XCe.A0i(A0p3);
            } else {
                linkedHashMap2 = null;
            }
            C21053XCe.A16(A0e, linkedHashMap2);
            C21053XCe.A0s(A0e, C271774jZ.A3P, A01);
            C21055XCg.A11(A0e, A01);
            C21054XCf.A0V(A0e, A01);
            A0e.A9F(Pxd.A00(77), (Long) null);
            A0e.AAJ("connection_type", (String) null);
            A0e.A9F("sponsor_tag_id", C21055XCg.A0P(C271774jZ.A8I, A01));
            A0e.AAJ("url", (String) null);
            A0e.AAK((0bb) null, "extra");
            C21054XCf.A16(A0e, A01);
            C21054XCf.A1H(A0e, A01);
            C21054XCf.A0X(A0e, A01);
            A0e.A9F("tags", (Long) null);
            C21055XCg.A0d(A0e, r9, A01, C51966G9m.A13(C271774jZ.A5E, A01), "media_author_id");
            C21055XCg.A1D(A0e, A01, 1L, "is_prod");
            C21055XCg.A0k(A0e, A01);
            A0e.A9F("product_id", C51966G9m.A13(C271774jZ.A6k, A01));
            A0e.AAK((0bb) null, "location_info");
            C21054XCf.A0a(A0e, A01);
            A0e.A8D(AnonymousClass000.A00(1211), C21053XCe.A0Y(C271774jZ.A0o, A01));
            A0e.A9F("gap_to_last_ad", C51966G9m.A13(C271774jZ.A33, A01));
            C21054XCf.A1N(A0e, A01);
            A0e.A9F("reel_gap", C51966G9m.A13(C271774jZ.A7P, A01));
            A0e.A9H(AnonymousClass000.A00(1296), (Map) A01.A01(C271774jZ.A0q));
            A0e.A8D(AnonymousClass000.A00(1233), C21053XCe.A0Y(C271774jZ.A1M, A01));
            A0e.A8D("timespent", C21053XCe.A0Y(C271774jZ.A99, A01));
            ArrayList arrayList2 = (ArrayList) A01.A01(C271774jZ.A2q);
            if (arrayList2 != null) {
                str = (String) 00k.A0O(arrayList2, 0);
            } else {
                str = null;
            }
            A0e.AAJ("feed_sticker_media_id", str);
            0jB A012 = A01.A01(C271774jZ.A20);
            if (A012 != null) {
                r2 = new 0bb();
                C21055XCg.A1N(r2, A012);
                r2.A04("remaining_time", C21053XCe.A0Y(C271774jZ.A24, A012));
            }
            A0e.AAK(r2, AnonymousClass000.A00(279));
            C21054XCf.A09(A0e, A01);
            A0e.Cgf();
        }
    }
}
