package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class XX6 {
    public static final void A00(0wc r17, C254523sc r18) {
        double d;
        long j;
        long j2;
        ArrayList arrayList;
        Long l;
        double d2;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(r17, AnonymousClass000.A00(3363));
        0jB A01 = r18.A01();
        0xF r2 = r18.A00().A06;
        if (A0e.isSampled()) {
            Number A0b = C21053XCe.A0b(C271774jZ.A98, A01);
            if (A0b != null) {
                d = (double) A0b.longValue();
            } else {
                d = 0.0d;
            }
            A0e.A8D("timespent", Double.valueOf(d));
            long j3 = -1;
            A0e.A9F("reel_position", Long.valueOf(JTS.A06(C21053XCe.A0b(C271774jZ.A7U, A01))));
            A0e.A9F("reel_size", Long.valueOf(JTS.A06(C21053XCe.A0b(C271774jZ.A7V, A01))));
            Number A0b2 = C21053XCe.A0b(C271774jZ.A7s, A01);
            if (A0b2 != null) {
                j3 = A0b2.longValue();
            }
            A0e.A9F("segment_index", Long.valueOf(j3));
            long j4 = 0;
            JTQ.A0z(A0e, DbY.A04(C21053XCe.A0b(C271774jZ.A0Z, A01)));
            String A1C = C51966G9m.A1C(C271774jZ.A0B, A01);
            if (A1C == null || (A10 = AnonymousClass7TE.A10(A1C)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            A0e.A9F("ad_id", Long.valueOf(j));
            String A1C2 = C51966G9m.A1C(C271774jZ.A2v, A01);
            String str = "";
            String str2 = str;
            if (A1C2 == null) {
                A1C2 = str;
            }
            A0e.AAJ("follow_status", A1C2);
            String A1C3 = C51966G9m.A1C(C271774jZ.A5I, A01);
            if (A1C3 == null) {
                A1C3 = str;
            }
            C51965G9l.A1I(A0e, A1C3);
            A0e.A9F("m_t", Long.valueOf(DbY.A04(C21053XCe.A0b(C271774jZ.A5a, A01))));
            Number A0b3 = C21053XCe.A0b(C271774jZ.A8x, A01);
            if (A0b3 != null) {
                j4 = A0b3.longValue();
            }
            A0e.A9F("m_ts", Long.valueOf(j4));
            String A1C4 = C51966G9m.A1C(C271774jZ.A7T, A01);
            if (A1C4 == null) {
                A1C4 = str;
            }
            A0e.AAJ("reel_id", A1C4);
            String A1C5 = C51966G9m.A1C(C271774jZ.A7Y, A01);
            if (A1C5 == null) {
                A1C5 = str;
            }
            A0e.AAJ("reel_type", A1C5);
            String A1C6 = C51966G9m.A1C(C271774jZ.A8A, A01);
            if (A1C6 == null) {
                A1C6 = str;
            }
            A0e.AAJ("source_of_action", A1C6);
            String A1C7 = C51966G9m.A1C(C271774jZ.A9L, A01);
            if (A1C7 == null) {
                A1C7 = str;
            }
            A0e.AAJ("tracking_token", A1C7);
            String A1C8 = C51966G9m.A1C(C271774jZ.A7X, A01);
            if (A1C8 == null) {
                A1C8 = str;
            }
            A0e.AAJ("tray_session_id", A1C8);
            String A1C9 = C51966G9m.A1C(C271774jZ.A9i, A01);
            if (A1C9 != null) {
                str = A1C9;
            }
            A0e.AAJ("viewer_session_id", str);
            Long A13 = C51966G9m.A13(C271774jZ.A7b, A01);
            if (A13 != null) {
                A0e.A9F("reel_viewer_position", A13);
            }
            Double A0Y = C21053XCe.A0Y(C271774jZ.A8z, A01);
            if (A0Y != null) {
                A0e.A8D("time_elapsed", A0Y);
            }
            Long A132 = C51966G9m.A13(C271774jZ.A7r, A01);
            if (A132 != null) {
                A0e.A9F("segment_count", A132);
            }
            String A1C10 = C51966G9m.A1C(C271774jZ.A8O, A01);
            if (A1C10 != null) {
                A0e.AAJ("story_ranking_token", A1C10);
            }
            Boolean A0W = C21053XCe.A0W(C271774jZ.A4z, A01);
            if (A0W != null) {
                A0e.A7p("is_video_to_carousel", A0W);
            }
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A9g, A01);
            if (A0d != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(A0d);
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    A0p.add(C21053XCe.A0a(AnonymousClass7TE.A18(it)));
                }
                A0e.AAe("video_to_carousel_cut_secs", A0p);
            }
            String A1C11 = C51966G9m.A1C(C271774jZ.A42, A01);
            if (A1C11 != null) {
                A0e.AAJ("is_coming_from", A1C11);
            }
            Boolean A0W2 = C21053XCe.A0W(C271774jZ.A4K, A01);
            if (A0W2 != null) {
                A0e.A7p("is_highlights_sourced", A0W2);
            }
            Long A133 = C51966G9m.A13(C271774jZ.A7y, A01);
            if (A133 != null) {
                A0e.A9F("session_reel_counter", A133);
            }
            Double A0Y2 = C21053XCe.A0Y(C271774jZ.A94, A01);
            if (A0Y2 != null) {
                A0e.A8D("time_remaining", A0Y2);
            }
            Long A134 = C51966G9m.A13(C271774jZ.A0D, A01);
            if (A134 != null) {
                A0e.A9F("ad_inserted_position", A134);
            }
            String A1C12 = C51966G9m.A1C(C271774jZ.A6Z, A01);
            if (A1C12 != null) {
                A0e.AAJ("post_id", A1C12);
            }
            String A00 = AnonymousClass000.A00(514);
            ArrayList A06 = r2.A06(A00);
            if (A06 != null) {
                A0e.AAe(A00, A06);
            }
            Boolean A012 = r2.A01("has_translation");
            if (A012 != null) {
                A0e.A7p("has_translation", A012);
            }
            Long A135 = C51966G9m.A13(C271774jZ.A0I, A01);
            if (A135 != null) {
                A0e.A9F("ad_position_from_server", A135);
            }
            Long A136 = C51966G9m.A13(C271774jZ.A7W, A01);
            if (A136 != null) {
                A0e.A9F("reel_start_position", A136);
            }
            String A1C13 = C51966G9m.A1C(C271774jZ.A7c, A01);
            if (A1C13 != null) {
                A0e.AAJ("release_channel", A1C13);
            }
            Long A137 = C51966G9m.A13(C271774jZ.A9J, A01);
            if (A137 != null) {
                A0e.A9F("top_liker_count", A137);
            }
            Double A0Y3 = C21053XCe.A0Y(C271774jZ.A2P, A01);
            if (A0Y3 != null) {
                A0e.A8D("elapsed_time_since_last_item", A0Y3);
            }
            Boolean A0W3 = C21053XCe.A0W(C271774jZ.A3t, A01);
            if (A0W3 != null) {
                A0e.A7p("is_acp_delivered", A0W3);
            }
            Number A0b4 = C21053XCe.A0b(C271774jZ.A1z, A01);
            if (A0b4 != null) {
                A0e.A9F("dark_mode_state", C51969G9p.A0r(A0b4));
            }
            Long A138 = C51966G9m.A13(C271774jZ.A4B, A01);
            if (A138 != null) {
                A0e.A9F("is_dark_mode", A138);
            }
            String A1C14 = C51966G9m.A1C(C271774jZ.A00, A01);
            if (A1C14 != null) {
                A0e.AAJ("action", A1C14);
            }
            0jB A0D = C21053XCe.A0D(A01);
            if (A0D != null) {
                0xF A002 = A0D.A00();
                0bb r4 = new 0bb();
                r4.A00.put("is_showreel_native", Boolean.valueOf(AnonymousClass7TG.A1X(C21053XCe.A0W(C271774jZ.A4p, A0D))));
                r4.A03("caption_doesnt_fit", A002.A01("caption_doesnt_fit"));
                String A05 = A002.A05("caption_font_size");
                ArrayList arrayList2 = null;
                if (A05 != null) {
                    l = 00y.A0n(10, A05);
                } else {
                    l = null;
                }
                r4.A05("caption_font_size", l);
                r4.A04("caption_height", C21053XCe.A0X(A002, "caption_height"));
                r4.A04("caption_line_height", C21053XCe.A0X(A002, "caption_line_height"));
                r4.A05("caption_num_char_showed", C21055XCg.A0O(A002, "caption_num_char_showed"));
                r4.A05("caption_num_lines_showed", C21055XCg.A0O(A002, "caption_num_lines_showed"));
                r4.A05("caption_num_lines_total", C21055XCg.A0O(A002, "caption_num_lines_total"));
                r4.A04("caption_position_start_x", C21054XCf.A03(A002, "caption_position_start_x"));
                r4.A04("caption_position_start_y", C21054XCf.A03(A002, "caption_position_start_y"));
                r4.A04("caption_width", C21054XCf.A03(A002, "caption_width"));
                r4.A03("is_caption_fully_displayed", C21055XCg.A0J(A002, "is_caption_fully_displayed"));
                r4.A04("media_height", C21054XCf.A03(A002, "media_height"));
                r4.A05("media_position_start_x", C21055XCg.A0O(A002, "media_position_start_x"));
                r4.A04("media_position_start_y", C21054XCf.A03(A002, "media_position_start_y"));
                r4.A04("media_width", C21054XCf.A03(A002, "media_width"));
                r4.A05("screen_density", C21055XCg.A0R(C271774jZ.A7l, A0D));
                r4.A05("screen_height", C21055XCg.A0R(C271774jZ.A7m, A0D));
                r4.A05("screen_width", C21055XCg.A0R(C271774jZ.A7n, A0D));
                C21055XCg.A1J(r4, A002);
                C21053XCe.A18(r4, A002, "caption_text_color");
                r4.A05("num_hashtags_showed", C21055XCg.A0O(A002, "num_hashtags_showed"));
                r4.A05("num_mentions_showed", C21055XCg.A0O(A002, "num_mentions_showed"));
                r4.A03("is_double_logging", A002.A01("is_double_logging"));
                C21053XCe.A18(r4, A002, "background_color_caption");
                C21053XCe.A18(r4, A002, "caption_background_color_alpha");
                C21055XCg.A1L(r4, A002, AnonymousClass000.A00(4695));
                r4.A05("caption_num_hashtags_showed", C21055XCg.A0O(A002, "caption_num_hashtags_showed"));
                r4.A05("caption_num_mentions_showed", C21055XCg.A0O(A002, "caption_num_mentions_showed"));
                ArrayList A062 = A002.A06("stickers");
                if (A062 != null) {
                    arrayList2 = AnonymousClass7TE.A1C();
                    Iterator it2 = A062.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof 0jB) {
                            0xF A003 = ((0jB) next).A00();
                            0bb r22 = new 0bb();
                            Double A02 = A003.A02("center_x");
                            double d3 = -1.0d;
                            if (A02 != null) {
                                d2 = A02.doubleValue();
                            } else {
                                d2 = -1.0d;
                            }
                            C21053XCe.A1A(r22, "center_x", d2);
                            C21053XCe.A1A(r22, "center_y", C21056XCh.A00(A003, "center_y"));
                            C21053XCe.A1A(r22, IgReactMediaPickerNativeModule.HEIGHT, C21056XCh.A00(A003, IgReactMediaPickerNativeModule.HEIGHT));
                            long j5 = -1;
                            C21053XCe.A1B(r22, PublicKeyCredentialControllerUtility.JSON_KEY_ID, JTS.A06(A003.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                            C21053XCe.A1A(r22, "rotation", C21056XCh.A00(A003, "rotation"));
                            C21053XCe.A1A(r22, "scale_x", C21056XCh.A00(A003, "scale_x"));
                            C21053XCe.A1A(r22, "scale_y", C21056XCh.A00(A003, "scale_y"));
                            C21053XCe.A1B(r22, "screen_density", JTS.A06(A003.A04("screen_density")));
                            C21053XCe.A1B(r22, "screen_height", JTS.A06(A003.A04("screen_height")));
                            Long A04 = A003.A04("screen_width");
                            if (A04 != null) {
                                j5 = A04.longValue();
                            }
                            C21053XCe.A1B(r22, "screen_width", j5);
                            String A052 = A003.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A052 == null) {
                                A052 = "-1";
                            }
                            r22.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A052);
                            Double A022 = A003.A02(IgReactMediaPickerNativeModule.WIDTH);
                            if (A022 != null) {
                                d3 = A022.doubleValue();
                            }
                            C21053XCe.A1A(r22, IgReactMediaPickerNativeModule.WIDTH, d3);
                            arrayList2.add(r22);
                        }
                    }
                }
                r4.A07("stickers", arrayList2);
                A0e.AAK(r4, "media_layout");
            }
            ArrayList arrayList3 = (ArrayList) A01.A01(C271774jZ.A17);
            if (arrayList3 != null) {
                A0e.AAe("carousel_transformation_cards", arrayList3);
            }
            String A1C15 = C51966G9m.A1C(C271774jZ.A3q, A01);
            if (A1C15 != null) {
                A0e.AAJ("inventory_source", A1C15);
            }
            String A1C16 = C51966G9m.A1C(C271774jZ.A26, A01);
            if (A1C16 != null) {
                A0e.AAJ("delivery_flags", A1C16);
            }
            String A1C17 = C51966G9m.A1C(C271774jZ.A88, A01);
            if (A1C17 != null) {
                A0e.AAJ("feed_request_id", A1C17);
            }
            Boolean A0W4 = C21053XCe.A0W(C271774jZ.A4l, A01);
            if (A0W4 != null) {
                A0e.A7p("is_second_channel_enabled", A0W4);
            }
            Boolean A0W5 = C21053XCe.A0W(C271774jZ.A4G, A01);
            if (A0W5 != null) {
                A0e.A7p("is_eof", A0W5);
            }
            String A1C18 = C51966G9m.A1C(C271774jZ.A0l, A01);
            if (A1C18 != null) {
                A0e.AAJ("byline_text", A1C18);
            }
            String A1C19 = C51966G9m.A1C(C271774jZ.A8D, A01);
            if (A1C19 != null) {
                A0e.AAJ("sponsored_label_text", A1C19);
            }
            Long A139 = C51966G9m.A13(C271774jZ.A8F, A01);
            if (A139 != null) {
                A0e.A9F("sponsor_tag_count", A139);
            }
            ArrayList arrayList4 = (ArrayList) A01.A01(C271774jZ.A8H);
            if (arrayList4 != null) {
                A0e.AAe("sponsor_tag_ids", arrayList4);
            }
            String A1C20 = C51966G9m.A1C(C271774jZ.A60, A01);
            if (A1C20 != null) {
                A0e.AAJ("nav_chain", A1C20);
            }
            Boolean A0W6 = C21053XCe.A0W(C271774jZ.A3s, A01);
            if (A0W6 != null) {
                A0e.A7p("is_ad", A0W6);
            }
            0j9 r8 = C271774jZ.A6j;
            AbstractCollection A0d2 = C21053XCe.A0d(r8, A01);
            if (A0d2 != null) {
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0d2);
                Iterator it3 = A0d2.iterator();
                while (it3.hasNext()) {
                    JTS.A1V(A0p2, it3);
                }
                A0e.AAe("product_ids", A0p2);
            }
            Boolean A0W7 = C21053XCe.A0W(C271774jZ.A41, A01);
            if (A0W7 != null) {
                A0e.A7p("is_checkout_enabled", A0W7);
            }
            Boolean A0W8 = C21053XCe.A0W(C271774jZ.A4O, A01);
            if (A0W8 != null) {
                A0e.A7p("is_influencer", A0W8);
            }
            Long A1310 = C51966G9m.A13(C271774jZ.A5S, A01);
            if (A1310 != null) {
                A0e.A9F("media_owner_id", A1310);
            }
            0j9 r7 = C271774jZ.A5e;
            String A1C21 = C51966G9m.A1C(r7, A01);
            if (A1C21 != null) {
                A0e.A9F("merchant_id", DbV.A0q(A1C21));
            }
            0jB A013 = A01.A01(C271774jZ.A81);
            if (A013 != null) {
                0xF A004 = A013.A00();
                0bb r3 = new 0bb();
                String A1C22 = C51966G9m.A1C(r7, A013);
                if (A1C22 != null) {
                    j2 = Long.parseLong(A1C22);
                } else {
                    j2 = 0;
                }
                r3.A05("merchant_id", Long.valueOf(j2));
                AbstractCollection A0d3 = C21053XCe.A0d(r8, A013);
                if (A0d3 != null) {
                    arrayList = AnonymousClass7TE.A1C();
                    Iterator it4 = A0d3.iterator();
                    while (it4.hasNext()) {
                        C21055XCg.A1W(arrayList, it4);
                    }
                } else {
                    arrayList = 0sn.A00;
                }
                r3.A07("product_ids", arrayList);
                String A053 = A004.A05("shopping_sticker_id");
                if (A053 == null) {
                    A053 = str2;
                }
                r3.A06("shopping_sticker_id", A053);
                A0e.AAK(r3, "shopping_sticker_info");
            }
            A0e.Cgf();
        }
    }
}
