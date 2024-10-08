package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class XWz {
    public static final void A00(0wc r21, C254523sc r22, AnonymousClass4DU r23) {
        String str;
        LinkedHashMap linkedHashMap;
        0bb r4;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        String A05;
        Double d;
        LinkedHashMap linkedHashMap6;
        double d2;
        double d3;
        double d4;
        long j;
        double d5;
        double d6;
        double d7;
        long j2;
        long j3;
        Double A0p;
        Long A0n;
        Long A0n2;
        Long A0n3;
        Double A0p2;
        Double A0p3;
        Double A0p4;
        Long A0n4;
        Double A0p5;
        Double A0p6;
        Double A0p7;
        0Aj A0e = AnonymousClass7TE.A0e(r21, "instagram_ad_influencer_profile");
        0jB A01 = r22.A01();
        if (A0e.isSampled()) {
            C21054XCf.A0e(A0e, A01);
            A0e.AAJ("from", C51966G9m.A1C(C271774jZ.A2z, A01));
            C21054XCf.A1T(A0e, A01);
            A0e.AAJ("url", C51966G9m.A1C(C271774jZ.A9a, A01));
            A0e.AAJ("source_of_tapping", C51966G9m.A1C(C271774jZ.A8C, A01));
            C21054XCf.A0J(A0e, A01);
            C21055XCg.A0v(A0e, A01);
            Serializable A012 = A01.A01(C271774jZ.A9H);
            Long l = null;
            if (A012 != null) {
                str = A012.toString();
            } else {
                str = null;
            }
            A0e.AAJ("top_followers_count", str);
            C21054XCf.A15(A0e, A01);
            C21054XCf.A0j(A0e, A01);
            C21055XCg.A1B(A0e, A01, C51966G9m.A13(C271774jZ.A0Z, A01), "a_pk");
            C21054XCf.A0H(A0e, A01);
            C21053XCe.A0t(A0e, C271774jZ.A5a, A01);
            C21054XCf.A1S(A0e, A01);
            AbstractCollection abstractCollection = (AbstractCollection) C21055XCg.A0I(A0e, A01);
            if (abstractCollection != null) {
                linkedHashMap = DbS.A0x(C21055XCg.A00(abstractCollection));
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    Long valueOf = Long.valueOf(Pxg.A0H(it));
                    linkedHashMap.put(valueOf, valueOf);
                }
            } else {
                linkedHashMap = null;
            }
            A0e.A9H("sponsor_tag_ids", linkedHashMap);
            C21053XCe.A0v(A0e, C271774jZ.A0C, A01);
            A0e.A7p("is_unpublished", C21053XCe.A0W(C271774jZ.A4x, A01));
            C21055XCg.A0e(A0e, C271774jZ.A8x, A01);
            C21054XCf.A0w(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A0D(A0e, A01);
            C21055XCg.A0o(A0e, A01);
            C21055XCg.A1G(A0e, A01, "entity_follow_status", C51966G9m.A1C(C271774jZ.A2Y, A01));
            C21054XCf.A0M(A0e, A01);
            C21054XCf.A0i(A0e, A01);
            C21054XCf.A1N(A0e, A01);
            C21054XCf.A1W(A0e, A01);
            C21054XCf.A1K(A0e, A01);
            C21054XCf.A0K(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21055XCg.A0g(A0e, C271774jZ.A6S, A01);
            C21053XCe.A12(A0e, A01);
            C21053XCe.A0z(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            C21054XCf.A0R(A0e, A01);
            C21055XCg.A15(A0e, A01);
            C21054XCf.A1U(A0e, A01);
            C21053XCe.A10(A0e, A01);
            0j9 r2 = C271774jZ.A12;
            C21053XCe.A0w(A0e, r2, A01);
            C21054XCf.A1L(A0e, A01);
            C21054XCf.A1F(A0e, A01);
            C21055XCg.A1C(A0e, A01, C51966G9m.A13(C271774jZ.A9I, A01), "top_likers_count");
            C21054XCf.A0s(A0e, A01);
            C21053XCe.A0x(A0e, r2, A01);
            A0e.A9H("header_layout", (Map) null);
            C21054XCf.A0m(A0e, A01);
            C21054XCf.A0z(A0e, A01);
            C21054XCf.A0Y(A0e, A01);
            C21055XCg.A0q(A0e, A01);
            C21054XCf.A0a(A0e, A01);
            C21054XCf.A13(A0e, A01);
            C21054XCf.A0r(A0e, A01);
            A0e.AAK((0bb) null, "toolbar_layout");
            C21054XCf.A0x(A0e, A01);
            0jB A0D = C21053XCe.A0D(A01);
            if (A0D != null) {
                0xF A00 = A0D.A00();
                r4 = new 0bb();
                r4.A04("screen_density", C21053XCe.A0Y(C271774jZ.A7l, A0D));
                r4.A04("screen_height", C21053XCe.A0Y(C271774jZ.A7m, A0D));
                r4.A04("screen_width", C21053XCe.A0Y(C271774jZ.A7n, A0D));
                C21054XCf.A1a(r4, A0D);
                C21053XCe.A19(r4, A0D);
                String A052 = A00.A05("media_height");
                Long l2 = null;
                if (A052 != null) {
                    d = 012.A0p(A052);
                } else {
                    d = null;
                }
                r4.A04("media_height", d);
                r4.A04("media_width", C21053XCe.A0X(A00, "media_width"));
                C21055XCg.A1J(r4, A00);
                r4.A04("caption_font_size", C21053XCe.A0X(A00, "caption_font_size"));
                r4.A05("caption_num_char_showed", C21054XCf.A05(A00, "caption_num_char_showed"));
                r4.A05("caption_num_hashtags_showed", C21054XCf.A05(A00, "caption_num_hashtags_showed"));
                r4.A05("caption_num_lines_showed", C21054XCf.A05(A00, "caption_num_lines_showed"));
                r4.A05("caption_num_lines_total", C21054XCf.A05(A00, "caption_num_lines_total"));
                r4.A05("caption_num_mentions_showed", C21054XCf.A05(A00, "caption_num_mentions_showed"));
                r4.A04("caption_position_start_x", C21053XCe.A0X(A00, "caption_position_start_x"));
                r4.A04("caption_position_start_y", C21053XCe.A0X(A00, "caption_position_start_y"));
                r4.A04("caption_line_height", C21053XCe.A0X(A00, "caption_line_height"));
                r4.A04("caption_height", C21053XCe.A0X(A00, "caption_line_height"));
                r4.A04("caption_width", C21053XCe.A0X(A00, "caption_width"));
                r4.A03("is_caption_fully_displayed", C21055XCg.A0J(A00, "is_caption_fully_displayed"));
                C21053XCe.A18(r4, A00, "caption_text_color");
                C21053XCe.A18(r4, A00, "background_color_caption");
                C21055XCg.A1L(r4, A00, "caption_background_color_alpha");
                r4.A04("media_position_start_x", C21053XCe.A0X(A00, "media_position_start_x"));
                r4.A04("media_position_start_y", C21053XCe.A0X(A00, "media_position_start_y"));
                r4.A03("caption_doesnt_fit", A00.A01("caption_doesnt_fit"));
                ArrayList A06 = A00.A06("stickers");
                if (A06 != null) {
                    linkedHashMap6 = AnonymousClass7TE.A1H();
                    Iterator it2 = A06.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof 0jB) {
                            0xF A002 = ((0jB) next).A00();
                            0bb r24 = new 0bb();
                            String A053 = A002.A05("center_x");
                            double d8 = -1.0d;
                            if (A053 == null || (A0p7 = 012.A0p(A053)) == null) {
                                d2 = -1.0d;
                            } else {
                                d2 = A0p7.doubleValue();
                            }
                            C21053XCe.A1A(r24, "center_x", d2);
                            String A054 = A002.A05("center_y");
                            if (A054 == null || (A0p6 = 012.A0p(A054)) == null) {
                                d3 = -1.0d;
                            } else {
                                d3 = A0p6.doubleValue();
                            }
                            C21053XCe.A1A(r24, "center_y", d3);
                            String A055 = A002.A05(IgReactMediaPickerNativeModule.HEIGHT);
                            if (A055 == null || (A0p5 = 012.A0p(A055)) == null) {
                                d4 = -1.0d;
                            } else {
                                d4 = A0p5.doubleValue();
                            }
                            C21053XCe.A1A(r24, IgReactMediaPickerNativeModule.HEIGHT, d4);
                            String A056 = A002.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            long j4 = -1;
                            if (A056 == null || (A0n4 = 00y.A0n(10, A056)) == null) {
                                j = -1;
                            } else {
                                j = A0n4.longValue();
                            }
                            C21053XCe.A1B(r24, PublicKeyCredentialControllerUtility.JSON_KEY_ID, j);
                            String A057 = A002.A05("rotation");
                            if (A057 == null || (A0p4 = 012.A0p(A057)) == null) {
                                d5 = -1.0d;
                            } else {
                                d5 = A0p4.doubleValue();
                            }
                            C21053XCe.A1A(r24, "rotation", d5);
                            String A058 = A002.A05("scale_x");
                            if (A058 == null || (A0p3 = 012.A0p(A058)) == null) {
                                d6 = -1.0d;
                            } else {
                                d6 = A0p3.doubleValue();
                            }
                            C21053XCe.A1A(r24, "scale_x", d6);
                            String A059 = A002.A05("scale_y");
                            if (A059 == null || (A0p2 = 012.A0p(A059)) == null) {
                                d7 = -1.0d;
                            } else {
                                d7 = A0p2.doubleValue();
                            }
                            C21053XCe.A1A(r24, "scale_y", d7);
                            String A0510 = A002.A05("screen_density");
                            if (A0510 == null || (A0n3 = 00y.A0n(10, A0510)) == null) {
                                j2 = -1;
                            } else {
                                j2 = A0n3.longValue();
                            }
                            C21053XCe.A1B(r24, "screen_density", j2);
                            String A0511 = A002.A05("screen_height");
                            if (A0511 == null || (A0n2 = 00y.A0n(10, A0511)) == null) {
                                j3 = -1;
                            } else {
                                j3 = A0n2.longValue();
                            }
                            C21053XCe.A1B(r24, "screen_height", j3);
                            String A0512 = A002.A05("screen_width");
                            if (!(A0512 == null || (A0n = 00y.A0n(10, A0512)) == null)) {
                                j4 = A0n.longValue();
                            }
                            C21053XCe.A1B(r24, "screen_width", j4);
                            String A0513 = A002.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A0513 == null) {
                                A0513 = "-1";
                            }
                            r24.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0513);
                            String A0514 = A002.A05(IgReactMediaPickerNativeModule.WIDTH);
                            if (!(A0514 == null || (A0p = 012.A0p(A0514)) == null)) {
                                d8 = A0p.doubleValue();
                            }
                            C21053XCe.A1A(r24, IgReactMediaPickerNativeModule.WIDTH, d8);
                            linkedHashMap6.put((Long) null, r24);
                        }
                    }
                } else {
                    linkedHashMap6 = null;
                }
                r4.A08("stickers", linkedHashMap6);
                C21053XCe.A18(r4, A00, "template_id");
                r4.A05("has_headline", C21054XCf.A05(A00, "has_headline"));
                r4.A03("media_is_visible", C21055XCg.A0J(A00, "media_is_visible"));
                r4.A05("auto_cropping_height", C21054XCf.A05(A00, "auto_cropping_height"));
                r4.A05("auto_cropping_start_x_position", C21054XCf.A05(A00, "auto_cropping_start_x_position"));
                r4.A05("auto_cropping_start_y_position", C21054XCf.A05(A00, "auto_cropping_start_y_position"));
                String A0515 = A00.A05("auto_cropping_width");
                if (A0515 != null) {
                    l2 = 00y.A0n(10, A0515);
                }
                r4.A05("auto_cropping_width", l2);
            } else {
                r4 = null;
            }
            A0e.AAK(r4, "media_layout");
            C21054XCf.A0V(A0e, A01);
            C21054XCf.A1V(A0e, A01);
            C21055XCg.A0s(A0e, A01);
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A9g, A01);
            if (A0d != null) {
                linkedHashMap2 = DbS.A0x(C21055XCg.A00(A0d));
                Iterator it3 = A0d.iterator();
                while (it3.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it3);
                    linkedHashMap2.put(DbV.A0q(A18), C21053XCe.A0a(A18));
                }
            } else {
                linkedHashMap2 = null;
            }
            A0e.A9H("video_to_carousel_cut_secs", linkedHashMap2);
            AbstractCollection A0d2 = C21053XCe.A0d(C271774jZ.A8N, A01);
            if (A0d2 != null) {
                linkedHashMap3 = AnonymousClass7TE.A1H();
                Iterator it4 = A0d2.iterator();
                while (it4.hasNext()) {
                    0xF A003 = ((0jB) it4.next()).A00();
                    Long A04 = A003.A04("sticker_id");
                    if (!(A04 == null || (A05 = A003.A05("sticker_type")) == null)) {
                        0bb r0 = new 0bb();
                        r0.A05("sticker_id", A04);
                        r0.A06("sticker_type", A05);
                        linkedHashMap3.put(A04, r0);
                    }
                }
            } else {
                linkedHashMap3 = null;
            }
            A0e.A9H("sticker_types", linkedHashMap3);
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            AbstractCollection A0d3 = C21053XCe.A0d(C271774jZ.A17, A01);
            if (A0d3 != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it5 = A0d3.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    String str2 = (String) next2;
                    0qQ.A0B(str2, 0);
                    if (00y.A0n(10, str2) != null) {
                        A1C.add(next2);
                    }
                }
                linkedHashMap4 = DbS.A0x(C21055XCg.A00(A1C));
                Iterator it6 = A1C.iterator();
                while (it6.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(it6);
                    linkedHashMap4.put(DbV.A0q(A182), A182);
                }
            } else {
                linkedHashMap4 = null;
            }
            A0e.A9H("carousel_transformation_cards", linkedHashMap4);
            A0e.A9F("carousel_transformation_type", (Long) null);
            C21054XCf.A1D(A0e, A01);
            C21053XCe.A11(A0e, A01);
            A0e.A9F("entity_page_id", C21054XCf.A06(C271774jZ.A2b, A01));
            C21055XCg.A0m(A0e, A01);
            C21054XCf.A0L(A0e, A01);
            C21054XCf.A1B(A0e, A01);
            C21055XCg.A17(A0e, A01);
            C21054XCf.A0u(A0e, A01);
            C21054XCf.A0l(A0e, A01);
            C21055XCg.A16(A0e, A01);
            C21054XCf.A0A(A0e, A01);
            C21054XCf.A0Z(A0e, A01);
            C21054XCf.A0v(A0e, A01);
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                linkedHashMap5 = DbS.A0x(C21055XCg.A00(A0f));
                Iterator it7 = A0f.iterator();
                while (it7.hasNext()) {
                    C21055XCg.A1Y(it7, linkedHashMap5);
                }
            } else {
                linkedHashMap5 = null;
            }
            C21053XCe.A16(A0e, linkedHashMap5);
            C21054XCf.A0X(A0e, A01);
            C21055XCg.A0d(A0e, r23, A01, C51966G9m.A13(C271774jZ.A5E, A01), "media_author_id");
            C21055XCg.A1D(A0e, A01, 1L, "is_prod");
            C21055XCg.A0k(A0e, A01);
            C21054XCf.A1C(A0e, A01);
            C21054XCf.A0k(A0e, A01);
            A0e.A9F("seed_ad_id", C21054XCf.A06(C271774jZ.A7q, A01));
            A0e.A9F("hscroll_seed_ad_id", C21054XCf.A06(C271774jZ.A3b, A01));
            C21055XCg.A19(A0e, A01, C21054XCf.A06(C271774jZ.A2u, A01));
            String A1C2 = C51966G9m.A1C(C271774jZ.A5t, A01);
            if (A1C2 != null) {
                l = 00y.A0n(10, A1C2);
            }
            A0e.A9F("multi_ads_first_ad_id", l);
            A0e.A7p(C273654mx.A00(322), C21053XCe.A0W(C271774jZ.A4W, A01));
            C21055XCg.A0r(A0e, A01);
            DbX.A1L(A0e);
        }
    }
}
