package X;

import java.util.Map;

/* renamed from: X.XWt  reason: case insensitive filesystem */
public abstract class C21334XWt {
    public static final void A00(0wc r7, C254523sc r8) {
        0bb r6;
        Double d;
        0Aj A0e = AnonymousClass7TE.A0e(r7, "instagram_ad_action_failed");
        0jB A01 = r8.A01();
        if (A0e.isSampled()) {
            long j = 0;
            JTQ.A0z(A0e, DbY.A04(C21053XCe.A0b(C271774jZ.A0Z, A01)));
            String A1C = C51966G9m.A1C(C271774jZ.A2v, A01);
            String str = "";
            if (A1C == null) {
                A1C = str;
            }
            A0e.AAJ("follow_status", A1C);
            String A1C2 = C51966G9m.A1C(C271774jZ.A2z, A01);
            if (A1C2 == null) {
                A1C2 = str;
            }
            A0e.AAJ("from", A1C2);
            String A1C3 = C51966G9m.A1C(C271774jZ.A5I, A01);
            if (A1C3 == null) {
                A1C3 = str;
            }
            C51965G9l.A1I(A0e, A1C3);
            Number A0b = C21053XCe.A0b(C271774jZ.A5a, A01);
            if (A0b != null) {
                j = A0b.longValue();
            }
            A0e.A9F("m_t", Long.valueOf(j));
            String A1C4 = C51966G9m.A1C(C271774jZ.A8A, A01);
            if (A1C4 == null) {
                A1C4 = str;
            }
            A0e.AAJ("source_of_action", A1C4);
            String A1C5 = C51966G9m.A1C(C271774jZ.A9L, A01);
            if (A1C5 != null) {
                str = A1C5;
            }
            A0e.AAJ("tracking_token", str);
            A0e.AAJ("ad_id", C51966G9m.A1C(C271774jZ.A0B, A01));
            A0e.AAJ("open_target", (String) null);
            C21054XCf.A0e(A0e, A01);
            C21055XCg.A1G(A0e, A01, "url", C51966G9m.A1C(C271774jZ.A9a, A01));
            A0e.A9F("dr_ad_type", C51966G9m.A13(C271774jZ.A2J, A01));
            C21054XCf.A0M(A0e, A01);
            C21055XCg.A0l(A0e, A01);
            C21055XCg.A0i(A0e, A01);
            C21053XCe.A12(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            0j9 r5 = C271774jZ.A12;
            C21053XCe.A0x(A0e, r5, A01);
            A0e.A7p("supports_cta", (Boolean) null);
            C21055XCg.A0e(A0e, C271774jZ.A8x, A01);
            C21054XCf.A0h(A0e, A01);
            A0e.AAJ("a_i", C51966G9m.A1C(C271774jZ.A9M, A01));
            0jB A0D = C21053XCe.A0D(A01);
            if (A0D != null) {
                0xF A00 = A0D.A00();
                r6 = new 0bb();
                C21055XCg.A1M(r6, A0D);
                C21054XCf.A1a(r6, A0D);
                C21053XCe.A19(r6, A0D);
                C21055XCg.A1J(r6, A00);
                String A05 = A00.A05("caption_font_size");
                Double d2 = null;
                if (A05 != null) {
                    d = C21053XCe.A0a(A05);
                } else {
                    d = null;
                }
                r6.A04("caption_font_size", d);
                r6.A05("caption_num_char_showed", C21055XCg.A0O(A00, "caption_num_char_showed"));
                r6.A05("caption_num_hashtags_showed", C21055XCg.A0O(A00, "caption_num_hashtags_showed"));
                r6.A05("caption_num_lines_showed", C21055XCg.A0O(A00, "caption_num_lines_showed"));
                r6.A05("caption_num_lines_total", C21055XCg.A0O(A00, "caption_num_lines_total"));
                r6.A05("caption_num_mentions_showed", C21055XCg.A0O(A00, "caption_num_mentions_showed"));
                r6.A04("caption_position_start_x", C21054XCf.A03(A00, "caption_position_start_x"));
                r6.A04("caption_position_start_y", C21054XCf.A03(A00, "caption_position_start_y"));
                r6.A04("caption_line_height", C21054XCf.A03(A00, "caption_line_height"));
                r6.A04("caption_height", C21054XCf.A03(A00, "caption_line_height"));
                r6.A04("caption_width", C21054XCf.A03(A00, "caption_width"));
                r6.A03("is_caption_fully_displayed", C21055XCg.A0J(A00, "is_caption_fully_displayed"));
                C21053XCe.A18(r6, A00, "caption_text_color");
                C21053XCe.A18(r6, A00, "background_color_caption");
                C21055XCg.A1L(r6, A00, "caption_background_color_alpha");
                r6.A04("media_height", C21054XCf.A03(A00, "media_height"));
                String A052 = A00.A05("media_width");
                if (A052 != null) {
                    d2 = C21053XCe.A0a(A052);
                }
                r6.A04("media_width", d2);
            } else {
                r6 = null;
            }
            A0e.AAK(r6, "media_layout");
            C21054XCf.A0K(A0e, A01);
            A0e.A9F("entity_page_id", C21055XCg.A0P(C271774jZ.A2b, A01));
            C21053XCe.A11(A0e, A01);
            C21054XCf.A1B(A0e, A01);
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            C21054XCf.A0o(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A1D(A0e, A01);
            C21054XCf.A1I(A0e, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21054XCf.A0s(A0e, A01);
            C21055XCg.A0m(A0e, A01);
            C21054XCf.A1N(A0e, A01);
            A0e.AAJ("ad_intent", C51966G9m.A1C(C271774jZ.A0E, A01));
            C21054XCf.A0Q(A0e, A01);
            C21054XCf.A0A(A0e, A01);
            C21054XCf.A0P(A0e, A01);
            C21053XCe.A0w(A0e, r5, A01);
            C21054XCf.A0Z(A0e, A01);
            C21054XCf.A0v(A0e, A01);
            A0e.A7p("incorrect_code_path", (Boolean) null);
            C21055XCg.A16(A0e, A01);
            A0e.AAJ("thumbnail_id", C51966G9m.A1C(C271774jZ.A1Q, A01));
            C21054XCf.A1K(A0e, A01);
            C21054XCf.A0i(A0e, A01);
            C21054XCf.A1L(A0e, A01);
            C21054XCf.A0t(A0e, A01);
            C21054XCf.A1J(A0e, A01);
            C21055XCg.A0z(A0e, A01);
            C21054XCf.A0j(A0e, A01);
            C21055XCg.A0o(A0e, A01);
            C21054XCf.A0B(A0e, A01);
            C21053XCe.A10(A0e, A01);
            C21055XCg.A0u(A0e, A01);
            A0e.AAJ("tray_session_id", C51966G9m.A1C(C271774jZ.A7X, A01));
            C21054XCf.A1U(A0e, A01);
            C21054XCf.A0T(A0e, A01);
            A0e.A9F("merchant_id", C21055XCg.A0P(C271774jZ.A5e, A01));
            A0e.A9F("sponsor_tag_count", C51966G9m.A13(C271774jZ.A8F, A01));
            A0e.A9H("sponsor_tag_ids", (Map) null);
            C21055XCg.A0q(A0e, A01);
            A0e.A9H("product_ids", (Map) null);
            C21053XCe.A17(A0e, (Map) null);
            A0e.A8D("device_height", C21053XCe.A0Y(C271774jZ.A29, A01));
            A0e.A8D("device_width", C21053XCe.A0Y(C271774jZ.A2A, A01));
            A0e.A8D("screen_density", C21053XCe.A0Y(C271774jZ.A7l, A01));
            A0e.A8D("screen_height", C21053XCe.A0Y(C271774jZ.A7m, A01));
            A0e.A8D("screen_width", C21053XCe.A0Y(C271774jZ.A7n, A01));
            C21054XCf.A1Q(A0e, A01);
            C21054XCf.A1H(A0e, A01);
            C21054XCf.A1V(A0e, A01);
            C21054XCf.A11(A0e, A01);
            C21053XCe.A13(A0e, A01);
            C21054XCf.A1W(A0e, A01);
            C21054XCf.A12(A0e, A01);
            C21054XCf.A0L(A0e, A01);
            A0e.A9H("carousel_media_product_ids", (Map) null);
            A0e.A8D("end_x_position", C21055XCg.A0K(C271774jZ.A2S, A01));
            A0e.A8D("end_y_position", C21055XCg.A0K(C271774jZ.A2T, A01));
            A0e.A8D("start_x_position", C21055XCg.A0K(C271774jZ.A8L, A01));
            A0e.A8D("start_y_position", C21055XCg.A0K(C271774jZ.A8M, A01));
            A0e.A8D("x_velocity", C21055XCg.A0K(C271774jZ.A9u, A01));
            A0e.A8D("y_velocity", C21055XCg.A0K(C271774jZ.A9v, A01));
            A0e.A9H("drops_product_ids", (Map) null);
            C21054XCf.A0u(A0e, A01);
            C21055XCg.A13(A0e, A01);
            A0e.A9H("video_to_carousel_cut_secs", (Map) null);
            A0e.A9F("is_igtv", (Long) null);
            C21054XCf.A0x(A0e, A01);
            C21054XCf.A0d(A0e, A01);
            A0e.A9F("main_feed_carousel_starting_media_id", C21055XCg.A0P(C271774jZ.A5A, A01));
            C21053XCe.A16(A0e, (Map) null);
            A0e.A9H("carousel_transformation_cards", (Map) null);
            A0e.A7p("is_below_eof", (Boolean) null);
            C21055XCg.A17(A0e, A01);
            A0e.Cgf();
        }
    }
}
