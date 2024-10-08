package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class XX9 {
    public static final void A00(0wc r14, C254523sc r15, AnonymousClass4DU r16) {
        XSF xsf;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        List list;
        0bb r7;
        0bb r11;
        0bb r72;
        List list2;
        ArrayList arrayList2;
        List<0jB> list3;
        long j;
        List list4;
        Long A0n;
        0xF r112;
        Long l;
        long j2;
        Long A0n2;
        Long A0n3;
        0Aj A0e = AnonymousClass7TE.A0e(r14, AnonymousClass000.A00(4886));
        0jB A01 = r15.A01();
        0xF r8 = r15.A00().A06;
        if (A0e.isSampled()) {
            0j9 r2 = C271774jZ.A5I;
            C51965G9l.A1I(A0e, C51966G9m.A1C(r2, A01));
            C21054XCf.A1T(A0e, A01);
            A0e.A8D(TraceFieldType.Duration, C21053XCe.A0Y(C271774jZ.A2K, A01));
            LinkedHashMap linkedHashMap2 = null;
            A0e.A9F("percent_visible", C21054XCf.A07(r8.A03("percent_visible")));
            String A05 = r8.A05("visibility_unit");
            if (0qQ.A0K(A05, "feed_unit")) {
                xsf = XSF.FEED_UNIT;
            } else if (0qQ.A0K(A05, "viewport")) {
                xsf = XSF.VIEWPORT;
            } else {
                xsf = null;
            }
            A0e.A8M(xsf, "visibility_unit");
            0j9 r10 = C271774jZ.A0Z;
            C21055XCg.A1B(A0e, A01, C51966G9m.A13(r10, A01), "a_pk");
            C21054XCf.A1S(A0e, A01);
            C21055XCg.A0h(A0e, C271774jZ.A5a, A01);
            0j9 r9 = C271774jZ.A0C;
            C21053XCe.A0v(A0e, r9, A01);
            A0e.A9F("has_been_loaded", C21055XCg.A0Q(C271774jZ.A3R, A01));
            C21054XCf.A0q(A0e, A01);
            C21055XCg.A0z(A0e, A01);
            A0e.A9F("dark_mode_state", C21054XCf.A07(C21053XCe.A0b(C271774jZ.A1z, A01)));
            C21054XCf.A1L(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A0e(A0e, A01);
            C21055XCg.A0u(A0e, A01);
            C21054XCf.A0z(A0e, A01);
            C21054XCf.A0Y(A0e, A01);
            C21055XCg.A15(A0e, A01);
            C21054XCf.A1C(A0e, A01);
            C21054XCf.A1P(A0e, A01);
            C21054XCf.A0r(A0e, A01);
            C21055XCg.A1F(A0e, A01, "inventory_source", C51966G9m.A1C(C271774jZ.A3q, A01));
            C21054XCf.A1U(A0e, A01);
            C21054XCf.A0b(A0e, A01);
            C21053XCe.A10(A0e, A01);
            C21054XCf.A0m(A0e, A01);
            A0e.A7p("is_highlights_sourced", C21053XCe.A0W(C271774jZ.A4K, A01));
            C21054XCf.A13(A0e, A01);
            A0e.A9F("unseen_reel_size", (Long) null);
            A0e.A8D("time_remaining", C21053XCe.A0Y(C271774jZ.A94, A01));
            A0e.AAe("header_layout", (List) null);
            C21054XCf.A0a(A0e, A01);
            A0e.A7p("has_translation", r8.A01("has_translation"));
            A0e.A9H(AnonymousClass000.A00(514), (Map) null);
            C21054XCf.A0V(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21055XCg.A0g(A0e, C271774jZ.A6S, A01);
            C21054XCf.A1J(A0e, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21054XCf.A0Z(A0e, A01);
            C21054XCf.A0v(A0e, A01);
            C21055XCg.A13(A0e, A01);
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A9g, A01);
            if (A0d != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    Double A0p = 012.A0p(AnonymousClass7TE.A18(it));
                    if (A0p != null) {
                        A1C.add(A0p);
                    }
                }
                arrayList = 00k.A0U(A1C);
            } else {
                arrayList = null;
            }
            A0e.AAe("video_to_carousel_cut_secs", arrayList);
            A0e.AAe("sponsor_tag_ids", (List) C21055XCg.A0I(A0e, A01));
            C21054XCf.A1V(A0e, A01);
            A0e.AAK((0bb) null, "toolbar_layout");
            AbstractList abstractList = (AbstractList) A01.A01(C271774jZ.A8N);
            if (abstractList != null) {
                linkedHashMap = AnonymousClass7TE.A1H();
                int size = abstractList.size();
                for (int i = 0; i < size; i++) {
                    0xF A00 = ((0jB) abstractList.get(i)).A00();
                    Long A0d2 = DbZ.A0d(A00.A05("sticker_id"));
                    String A052 = A00.A05("sticker_type");
                    if (A052 != null) {
                        0bb r6 = new 0bb();
                        r6.A06("sticker_type", A052);
                        r6.A05("sticker_id", A0d2);
                        linkedHashMap.put(Long.valueOf((long) i), r6);
                    }
                }
            } else {
                linkedHashMap = null;
            }
            A0e.A9H("sticker_types", linkedHashMap);
            A0e.AAe("carousel_transformation_cards", (List) A01.A01(C271774jZ.A17));
            A0e.A9F("carousel_transformation_type", (Long) null);
            C21055XCg.A0o(A0e, A01);
            C21054XCf.A12(A0e, A01);
            C21055XCg.A0m(A0e, A01);
            A0e.AAJ(AnonymousClass000.A00(4648), r16.getModuleName());
            A0e.AAJ("reason", C51966G9m.A1C(C271774jZ.A6s, A01));
            C21055XCg.A1G(A0e, A01, "application_state", C51966G9m.A1C(C271774jZ.A0Q, A01));
            C21054XCf.A0n(A0e, A01);
            C21055XCg.A1C(A0e, A01, C51966G9m.A13(C271774jZ.A9I, A01), "top_likers_count");
            C21054XCf.A0j(A0e, A01);
            AbstractCollection A0d3 = C21053XCe.A0d(C271774jZ.A1e, A01);
            if (A0d3 != null) {
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0d3);
                Iterator it2 = A0d3.iterator();
                while (it2.hasNext()) {
                    AbstractMap abstractMap = (AbstractMap) it2.next();
                    0bb r113 = new 0bb();
                    String A002 = C273654mx.A00(866);
                    String A0r = DbS.A0r(A002, abstractMap);
                    long j3 = 0;
                    if (A0r == null || (A0n3 = 00y.A0n(10, A0r)) == null) {
                        j2 = 0;
                    } else {
                        j2 = A0n3.longValue();
                    }
                    C21053XCe.A1B(r113, A002, j2);
                    String A003 = C273654mx.A00(867);
                    String A0r2 = DbS.A0r(A003, abstractMap);
                    if (!(A0r2 == null || (A0n2 = 00y.A0n(10, A0r2)) == null)) {
                        j3 = A0n2.longValue();
                    }
                    C21053XCe.A1B(r113, A003, j3);
                    A0p2.add(r113);
                }
                list = 00k.A0a(A0p2);
            } else {
                list = null;
            }
            A0e.AAe("client_ad_creative_optimization_output", list);
            C21054XCf.A0s(A0e, A01);
            C21054XCf.A1W(A0e, A01);
            C21054XCf.A0L(A0e, A01);
            0j0 r62 = r8.A00;
            Object A02 = r62.A02("profile_shop_link");
            if (!(A02 instanceof 0xF) || (r112 = (0xF) A02) == null) {
                r7 = null;
            } else {
                r7 = new 0bb();
                String A004 = AnonymousClass000.A00(89);
                String A053 = r112.A05(A004);
                Long l2 = null;
                if (A053 != null) {
                    l = 00y.A0n(10, A053);
                } else {
                    l = null;
                }
                r7.A05(A004, l);
                r7.A05("merchant_id", C21054XCf.A05(r112, "merchant_id"));
                String A054 = r112.A05("product_id");
                if (A054 != null) {
                    l2 = 00y.A0n(10, A054);
                }
                r7.A05("product_id", l2);
                C21053XCe.A18(r7, r112, AnonymousClass000.A00(1811));
            }
            A0e.AAK(r7, "profile_shop_link");
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            0jB A012 = A01.A01(C271774jZ.A81);
            if (A012 != null) {
                0xF A005 = A012.A00();
                r11 = new 0bb();
                String A1C2 = C51966G9m.A1C(C271774jZ.A5e, A012);
                if (A1C2 == null || (A0n = 00y.A0n(10, A1C2)) == null) {
                    j = 0;
                } else {
                    j = A0n.longValue();
                }
                r11.A05("merchant_id", Long.valueOf(j));
                String A055 = A005.A05("shopping_sticker_id");
                if (A055 == null) {
                    A055 = "";
                }
                r11.A06("shopping_sticker_id", A055);
                AbstractCollection A0e2 = C21053XCe.A0e(A012);
                if (A0e2 != null) {
                    ArrayList A1C3 = AnonymousClass7TE.A1C();
                    Iterator it3 = A0e2.iterator();
                    while (it3.hasNext()) {
                        C21055XCg.A1W(A1C3, it3);
                    }
                    list4 = 00k.A0a(A1C3);
                } else {
                    list4 = null;
                }
                r11.A07("product_ids", list4);
            } else {
                r11 = null;
            }
            A0e.AAK(r11, "shopping_sticker_info");
            A0e.A7p("is_below_eof", C21053XCe.A0W(C271774jZ.A3y, A01));
            A0e.A9F("merchant_id", C21054XCf.A06(C271774jZ.A5e, A01));
            C21053XCe.A12(A0e, A01);
            C21055XCg.A0i(A0e, A01);
            C21053XCe.A0x(A0e, C271774jZ.A12, A01);
            C21054XCf.A0W(A0e, A01);
            C21054XCf.A0T(A0e, A01);
            C21054XCf.A0A(A0e, A01);
            C21053XCe.A13(A0e, A01);
            A0e.A9F("upcoming_event_id", C21054XCf.A06(C271774jZ.A9Y, A01));
            C21054XCf.A0u(A0e, A01);
            A0e.AAe("tagged_user_ids", (List) A01.A01(C271774jZ.A8j));
            0jB A0D = C21053XCe.A0D(A01);
            if (A0D != null) {
                0xF A006 = A0D.A00();
                r72 = new 0bb();
                C21055XCg.A1M(r72, A0D);
                C21054XCf.A1a(r72, A0D);
                C21053XCe.A19(r72, A0D);
                r72.A04("media_height", C21053XCe.A0X(A006, "media_height"));
                r72.A04("media_width", C21053XCe.A0X(A006, "media_width"));
                r72.A04("caption_font_size", C21053XCe.A0X(A006, "caption_font_size"));
                r72.A05("caption_num_char_showed", C21054XCf.A05(A006, "caption_num_char_showed"));
                r72.A05("caption_num_hashtags_showed", C21054XCf.A05(A006, "caption_num_hashtags_showed"));
                r72.A05("caption_num_lines_showed", C21054XCf.A05(A006, "caption_num_lines_showed"));
                r72.A05("caption_num_lines_total", C21054XCf.A05(A006, "caption_num_lines_total"));
                r72.A05("caption_num_mentions_showed", C21054XCf.A05(A006, "caption_num_mentions_showed"));
                r72.A04("caption_position_start_x", C21053XCe.A0X(A006, "caption_position_start_x"));
                r72.A04("caption_position_start_y", C21053XCe.A0X(A006, "caption_position_start_y"));
                C21053XCe.A18(r72, A006, "caption_text_color");
                C21055XCg.A1J(r72, A006);
                r72.A04("caption_line_height", C21053XCe.A0X(A006, "caption_line_height"));
                r72.A04("caption_height", C21053XCe.A0X(A006, "caption_height"));
                r72.A04("caption_width", C21053XCe.A0X(A006, "caption_width"));
                r72.A03("is_caption_fully_displayed", A006.A01("is_caption_fully_displayed"));
                C21053XCe.A18(r72, A006, "background_color_caption");
                C21055XCg.A1L(r72, A006, "caption_background_color_alpha");
                r72.A04("media_position_start_x", A006.A02("media_position_start_x"));
                r72.A04("media_position_start_y", A006.A02("media_position_start_y"));
                r72.A03("caption_doesnt_fit", A006.A01("caption_doesnt_fit"));
                C21053XCe.A18(r72, A006, "template_id");
                r72.A08("stickers", (Map) null);
                r72.A05("has_headline", A006.A04("has_headline"));
                r72.A03("media_is_visible", A006.A01("media_is_visible"));
                r72.A05("auto_cropping_height", A006.A04("auto_cropping_height"));
                r72.A05("auto_cropping_start_x_position", A006.A04("auto_cropping_start_x_position"));
                r72.A05("auto_cropping_start_y_position", A006.A04("auto_cropping_start_y_position"));
                r72.A05("auto_cropping_width", A006.A04("auto_cropping_width"));
            } else {
                r72 = null;
            }
            A0e.AAK(r72, "media_layout");
            C21054XCf.A16(A0e, A01);
            Object A022 = r62.A02("c_pk_list");
            if (!(A022 instanceof List) || (list3 = (List) A022) == null) {
                list2 = null;
            } else {
                ArrayList A0p3 = AnonymousClass7TF.A0p(list3);
                for (0jB A007 : list3) {
                    0xF A008 = A007.A00();
                    String A056 = A008.A05(AnonymousClass000.A00(2902));
                    String A057 = A008.A05(C273654mx.A00(624));
                    if (A057 == null) {
                        A057 = "";
                    }
                    LinkedHashMap A1H = AnonymousClass7TE.A1H();
                    if (A056 != null) {
                        A1H.put(A056, A057);
                    }
                    A0p3.add(A1H);
                }
                list2 = 00k.A0a(A0p3);
            }
            A0e.AAe("c_pk_list", list2);
            C21055XCg.A1E(A0e, A01, C21055XCg.A0M(A0e, r10, r9, A01), "ad_id_long");
            String A009 = AnonymousClass000.A00(5202);
            A0e.A9F(A009, r8.A04(A009));
            A0e.A9F("author_id", C21054XCf.A06(C271774jZ.A0Y, A01));
            C51965G9l.A1E(A0e, C21054XCf.A06(r2, A01));
            C21054XCf.A1G(A0e, A01);
            C21055XCg.A17(A0e, A01);
            C21055XCg.A0w(A0e, A01);
            A0e.A8D("media_time_remaining", C21053XCe.A0Y(C271774jZ.A5Z, A01));
            A0e.A8D("media_time_paused", C21053XCe.A0Y(C271774jZ.A5T, A01));
            A0e.A8D("media_time_to_load", C21053XCe.A0Y(C271774jZ.A5Q, A01));
            C21054XCf.A1D(A0e, A01);
            C21054XCf.A0x(A0e, A01);
            C21054XCf.A0l(A0e, A01);
            A0e.A9F("hscroll_seed_ad_id", C21054XCf.A06(C271774jZ.A3b, A01));
            C21054XCf.A0g(A0e, A01);
            A0e.A9F("multi_ads_first_ad_id", C21054XCf.A06(C271774jZ.A5t, A01));
            C21054XCf.A19(A0e, A01);
            A0e.A9F("multi_ads_type", C51966G9m.A13(C271774jZ.A5w, A01));
            C21054XCf.A0k(A0e, A01);
            C21054XCf.A0N(A0e, A01);
            C21055XCg.A16(A0e, A01);
            AbstractCollection A0e3 = C21053XCe.A0e(A01);
            if (A0e3 != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                Iterator it4 = A0e3.iterator();
                while (it4.hasNext()) {
                    C21055XCg.A1W(arrayList2, it4);
                }
            } else {
                arrayList2 = 0sn.A00;
            }
            A0e.AAe("product_ids", arrayList2);
            AbstractMap A0g = C21053XCe.A0g(A01);
            if (A0g != null) {
                linkedHashMap2 = C21054XCf.A08(A0g);
                Iterator A0s = AnonymousClass7TF.A0s(A0g);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    linkedHashMap2.put(A1J.getKey(), A1J.getValue());
                }
            }
            C21053XCe.A17(A0e, linkedHashMap2);
            C21054XCf.A15(A0e, A01);
            A0e.Cgf();
        }
    }
}
