package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class XX0 {
    public static final void A00(0wc r19, C254523sc r20) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        0bb r4;
        LinkedHashMap linkedHashMap4;
        Long l;
        double d;
        0xF A00;
        Long A04;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        0Aj A0e = AnonymousClass7TE.A0e(r19, AnonymousClass000.A00(1473));
        0jB A01 = r20.A01();
        if (A0e.isSampled()) {
            C21053XCe.A0u(A0e, C271774jZ.A0Z, A01);
            C21055XCg.A1B(A0e, A01, C51966G9m.A13(C271774jZ.A0C, A01), "ad_id");
            C21054XCf.A0H(A0e, A01);
            C21055XCg.A0h(A0e, C271774jZ.A5a, A01);
            C21054XCf.A1S(A0e, A01);
            Integer num = AnonymousClass05K.A0j;
            C21054XCf.A1Y(A0e, A01, num, "sticker_type");
            C21054XCf.A1T(A0e, A01);
            C21055XCg.A0u(A0e, A01);
            C21054XCf.A0z(A0e, A01);
            C21054XCf.A0Y(A0e, A01);
            C21054XCf.A1P(A0e, A01);
            C21055XCg.A15(A0e, A01);
            C21054XCf.A0r(A0e, A01);
            C21054XCf.A0a(A0e, A01);
            Double d2 = null;
            A0e.AAe("header_layout", (List) null);
            C21054XCf.A0m(A0e, A01);
            A0e.A8D("time_remaining", C21053XCe.A0Y(C271774jZ.A94, A01));
            C21054XCf.A1L(A0e, A01);
            C21054XCf.A1Y(A0e, A01, num, "hashtag");
            C21054XCf.A1Y(A0e, A01, num, C273654mx.A00(2445));
            C21054XCf.A1U(A0e, A01);
            A0e.A8D("current_play_time", C21055XCg.A0K(C271774jZ.A1w, A01));
            A0e.A9F("interact_result", C51966G9m.A13(new 0j9(num, "interact_result"), A01));
            A0e.A9F("sticker_id", C51966G9m.A13(new 0j9(num, "sticker_id"), A01));
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A0q(A0e, A01);
            C21053XCe.A10(A0e, A01);
            C21054XCf.A0b(A0e, A01);
            C21054XCf.A1C(A0e, A01);
            A0e.A9F("elapsed_time_since_last_item", C21055XCg.A0R(C271774jZ.A2P, A01));
            C21055XCg.A0s(A0e, A01);
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A9g, A01);
            if (A0d != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(A0d);
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    A0p.add(012.A0p(AnonymousClass7TE.A18(it)));
                }
                arrayList = AnonymousClass7TE.A1D(00k.A0X(A0p));
            } else {
                arrayList = null;
            }
            A0e.AAe("video_to_carousel_cut_secs", arrayList);
            A0e.AAJ(C273654mx.A00(166), C51966G9m.A1C(C271774jZ.A5d, A01));
            C21054XCf.A1Y(A0e, A01, num, AnonymousClass000.A00(4082));
            C21054XCf.A0e(A0e, A01);
            C21054XCf.A0V(A0e, A01);
            A0e.AAe("sponsor_tag_ids", (List) C21055XCg.A0I(A0e, A01));
            C21054XCf.A0x(A0e, A01);
            C21055XCg.A0m(A0e, A01);
            A0e.A9F("media_dwell_time", C21055XCg.A0R(C271774jZ.A5F, A01));
            A0e.A9F("media_time_elapsed", C21055XCg.A0R(C271774jZ.A5Y, A01));
            A0e.A9F("media_time_paused", C21055XCg.A0R(C271774jZ.A5T, A01));
            A0e.A9F("media_time_remaining", C21055XCg.A0R(C271774jZ.A5Z, A01));
            A0e.A9F("media_time_to_load", C21055XCg.A0R(C271774jZ.A5Q, A01));
            C21054XCf.A0T(A0e, A01);
            C21054XCf.A0A(A0e, A01);
            C21054XCf.A0I(A0e, A01);
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0e2);
                Iterator it2 = A0e2.iterator();
                while (it2.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it2);
                    if (A18 != null) {
                        l4 = DbV.A0q(A18);
                        l5 = DbV.A0q(A18);
                    } else {
                        l4 = null;
                        l5 = null;
                    }
                    AnonymousClass7TF.A1I(l4, l5, A0p2);
                }
                linkedHashMap = C21053XCe.A0i(A0p2);
            } else {
                linkedHashMap = null;
            }
            A0e.A9H("product_ids", linkedHashMap);
            A0e.A9H("product_merchant_ids", (Map) A01.A01(new 0j9(num, "product_merchant_ids")));
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                ArrayList A0p3 = AnonymousClass7TF.A0p(A0f);
                Iterator it3 = A0f.iterator();
                while (it3.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(it3);
                    if (A182 != null) {
                        l2 = DbV.A0q(A182);
                        l3 = DbV.A0q(A182);
                    } else {
                        l2 = null;
                        l3 = null;
                    }
                    AnonymousClass7TF.A1I(l2, l3, A0p3);
                }
                linkedHashMap2 = C21053XCe.A0i(A0p3);
            } else {
                linkedHashMap2 = null;
            }
            C21053XCe.A16(A0e, linkedHashMap2);
            C21055XCg.A17(A0e, A01);
            AbstractCollection A0d2 = C21053XCe.A0d(C271774jZ.A8N, A01);
            if (A0d2 != null) {
                linkedHashMap3 = AnonymousClass7TE.A1H();
                Iterator it4 = A0d2.iterator();
                while (it4.hasNext()) {
                    0jB r0 = (0jB) it4.next();
                    if (!(r0 == null || (A04 = A00.A04("sticker_id")) == null)) {
                        long longValue = A04.longValue();
                        String A05 = (A00 = r0.A00()).A05("sticker_type");
                        if (A05 != null) {
                            0bb r1 = new 0bb();
                            r1.A06("sticker_id", String.valueOf(longValue));
                            r1.A06("sticker_type", A05);
                            linkedHashMap3.put(A04, r1);
                        }
                    }
                }
            } else {
                linkedHashMap3 = null;
            }
            A0e.A9H("sticker_types", linkedHashMap3);
            C21054XCf.A0D(A0e, A01);
            C21054XCf.A13(A0e, A01);
            A0e.A7p(C273654mx.A00(315), (Boolean) null);
            0jB A0D = C21053XCe.A0D(A01);
            if (A0D != null) {
                0xF A002 = A0D.A00();
                r4 = new 0bb();
                C21055XCg.A1J(r4, A002);
                r4.A03("caption_doesnt_fit", A002.A01("caption_doesnt_fit"));
                String A052 = A002.A05("caption_font_size");
                LinkedHashMap linkedHashMap5 = null;
                if (A052 != null) {
                    l = DbV.A0q(A052);
                } else {
                    l = null;
                }
                r4.A05("caption_font_size", l);
                r4.A04("caption_height", C21054XCf.A03(A002, "caption_line_height"));
                r4.A04("caption_line_height", C21054XCf.A03(A002, "caption_line_height"));
                r4.A05("caption_num_char_showed", C21055XCg.A0O(A002, "caption_num_char_showed"));
                r4.A05("caption_num_hashtags_showed", C21055XCg.A0O(A002, "caption_num_hashtags_showed"));
                r4.A05("caption_num_lines_showed", C21055XCg.A0O(A002, "caption_num_lines_showed"));
                r4.A05("caption_num_lines_total", C21055XCg.A0O(A002, "caption_num_lines_total"));
                r4.A05("caption_num_mentions_showed", C21055XCg.A0O(A002, "caption_num_mentions_showed"));
                r4.A04("caption_position_start_x", C21054XCf.A03(A002, "caption_position_start_x"));
                r4.A04("caption_position_start_y", C21054XCf.A03(A002, "caption_position_start_y"));
                C21053XCe.A18(r4, A002, "caption_text_color");
                r4.A04("caption_width", C21054XCf.A03(A002, "caption_width"));
                r4.A03("is_caption_fully_displayed", C21055XCg.A0J(A002, "is_caption_fully_displayed"));
                r4.A04("media_height", C21054XCf.A03(A002, "media_height"));
                r4.A04("media_position_start_x", C21054XCf.A03(A002, "media_position_start_x"));
                r4.A04("media_position_start_y", C21054XCf.A03(A002, "media_position_start_y"));
                r4.A04("media_width", C21054XCf.A03(A002, "media_width"));
                r4.A05("screen_density", C21055XCg.A0R(C271774jZ.A7l, A0D));
                r4.A05("screen_height", C21055XCg.A0R(C271774jZ.A7m, A0D));
                r4.A05("screen_width", C21055XCg.A0R(C271774jZ.A7n, A0D));
                C21053XCe.A18(r4, A002, "background_color_caption");
                C21055XCg.A1L(r4, A002, "caption_background_color_alpha");
                ArrayList A06 = A002.A06("stickers");
                if (A06 != null) {
                    linkedHashMap5 = AnonymousClass7TE.A1H();
                    Iterator it5 = A06.iterator();
                    while (it5.hasNext()) {
                        Object next = it5.next();
                        if (next instanceof 0jB) {
                            0xF A003 = ((0jB) next).A00();
                            0bb r2 = new 0bb();
                            Double A02 = A003.A02("center_x");
                            double d3 = -1.0d;
                            if (A02 != null) {
                                d = A02.doubleValue();
                            } else {
                                d = -1.0d;
                            }
                            C21053XCe.A1A(r2, "center_x", d);
                            C21053XCe.A1A(r2, "center_y", C21056XCh.A00(A003, "center_y"));
                            C21053XCe.A1A(r2, IgReactMediaPickerNativeModule.HEIGHT, C21056XCh.A00(A003, IgReactMediaPickerNativeModule.HEIGHT));
                            C21053XCe.A1A(r2, "rotation", C21056XCh.A00(A003, "rotation"));
                            C21053XCe.A1A(r2, "scale_x", C21056XCh.A00(A003, "scale_x"));
                            C21053XCe.A1A(r2, "scale_y", C21056XCh.A00(A003, "scale_y"));
                            long j = -1;
                            C21053XCe.A1B(r2, "screen_density", JTS.A06(A003.A04("screen_density")));
                            C21053XCe.A1B(r2, "screen_height", JTS.A06(A003.A04("screen_height")));
                            Long A042 = A003.A04("screen_width");
                            if (A042 != null) {
                                j = A042.longValue();
                            }
                            C21053XCe.A1B(r2, "screen_width", j);
                            String A053 = A003.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A053 == null) {
                                A053 = "-1";
                            }
                            r2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A053);
                            Double A022 = A003.A02(IgReactMediaPickerNativeModule.WIDTH);
                            if (A022 != null) {
                                d3 = A022.doubleValue();
                            }
                            C21053XCe.A1A(r2, IgReactMediaPickerNativeModule.WIDTH, d3);
                            linkedHashMap5.put((Long) null, r2);
                        }
                    }
                }
                r4.A08("stickers", linkedHashMap5);
                C21053XCe.A18(r4, A002, "template_id");
                C21053XCe.A18(r4, A002, "frame_front_color_bottom");
                C21053XCe.A18(r4, A002, "frame_front_color_top");
            } else {
                r4 = null;
            }
            A0e.AAK(r4, "media_layout");
            C21054XCf.A1W(A0e, A01);
            A0e.AAK((0bb) null, "toolbar_layout");
            C21054XCf.A1V(A0e, A01);
            AbstractCollection A0d3 = C21053XCe.A0d(C271774jZ.A17, A01);
            if (A0d3 != null) {
                linkedHashMap4 = DbS.A0x(C21055XCg.A00(A0d3));
                Iterator it6 = A0d3.iterator();
                while (it6.hasNext()) {
                    C21055XCg.A1Z(it6, linkedHashMap4);
                }
            } else {
                linkedHashMap4 = null;
            }
            A0e.A9H("carousel_transformation_cards", linkedHashMap4);
            A0e.A9F("carousel_transformation_type", (Long) null);
            Number A0b = C21053XCe.A0b(C271774jZ.A68, A01);
            if (A0b != null) {
                d2 = Double.valueOf((double) A0b.longValue());
            }
            C21053XCe.A14(A0e, d2);
            C21054XCf.A0M(A0e, A01);
            C21054XCf.A1K(A0e, A01);
            C21054XCf.A0i(A0e, A01);
            C21054XCf.A0K(A0e, A01);
            C21054XCf.A0L(A0e, A01);
            C21055XCg.A0n(A0e, A01);
            DbX.A1L(A0e);
        }
    }
}
