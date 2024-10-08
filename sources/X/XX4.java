package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class XX4 {
    public static final void A00(0wc r15, C254523sc r16) {
        String str;
        Map map;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        0xF A00;
        Long A04;
        Long l5;
        Double d;
        0Aj A0e = AnonymousClass7TE.A0e(r15, AnonymousClass000.A00(1478));
        0jB A01 = r16.A01();
        if (A0e.isSampled()) {
            String A1C = C51966G9m.A1C(C271774jZ.A2v, A01);
            String str2 = "";
            if (A1C == null) {
                A1C = str2;
            }
            A0e.AAJ("follow_status", A1C);
            String A1C2 = C51966G9m.A1C(C271774jZ.A5I, A01);
            if (A1C2 == null) {
                A1C2 = str2;
            }
            C51965G9l.A1I(A0e, A1C2);
            long j = 0;
            A0e.A9F("m_t", Long.valueOf(DbY.A04(C21053XCe.A0b(C271774jZ.A5a, A01))));
            String A1C3 = C51966G9m.A1C(C271774jZ.A8A, A01);
            if (A1C3 == null) {
                A1C3 = str2;
            }
            A0e.AAJ("source_of_action", A1C3);
            String A1C4 = C51966G9m.A1C(C271774jZ.A9L, A01);
            if (A1C4 == null) {
                A1C4 = str2;
            }
            A0e.AAJ("tracking_token", A1C4);
            String A1C5 = C51966G9m.A1C(C271774jZ.A6o, A01);
            if (A1C5 != null) {
                str2 = A1C5;
            }
            A0e.AAJ("radio_type", str2);
            0j9 r9 = C271774jZ.A0Z;
            Serializable A012 = A01.A01(r9);
            if (A012 != null) {
                str = A012.toString();
            } else {
                str = null;
            }
            A0e.AAJ("a_pk", str);
            C21054XCf.A0e(A0e, A01);
            0j9 r6 = C271774jZ.A0C;
            A0e.AAJ("ad_id", C21053XCe.A0c(r6, A01));
            C21054XCf.A0a(A0e, A01);
            C21053XCe.A10(A0e, A01);
            C21054XCf.A1F(A0e, A01);
            C21053XCe.A12(A0e, A01);
            C21054XCf.A0J(A0e, A01);
            0j9 r0 = C271774jZ.A12;
            C21053XCe.A0w(A0e, r0, A01);
            C21053XCe.A0z(A0e, A01);
            A0e.AAJ("carousel_media_type", C21053XCe.A0c(r0, A01));
            C21055XCg.A1C(A0e, A01, C51966G9m.A13(C271774jZ.A15, A01), "carousel_size");
            C21054XCf.A0M(A0e, A01);
            C21054XCf.A0K(A0e, A01);
            C21054XCf.A0u(A0e, A01);
            C21055XCg.A1G(A0e, A01, "is_programmatic_scroll", C51966G9m.A1C(C271774jZ.A4g, A01));
            C21054XCf.A0U(A0e, A01);
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            A0e.AAJ("production_build", C21053XCe.A0c(C271774jZ.A2h, A01));
            C21055XCg.A0u(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A1J(A0e, A01);
            C21054XCf.A0n(A0e, A01);
            C21054XCf.A0q(A0e, A01);
            C21054XCf.A0S(A0e, A01);
            C21055XCg.A15(A0e, A01);
            C21054XCf.A0j(A0e, A01);
            C21054XCf.A1K(A0e, A01);
            C21054XCf.A0i(A0e, A01);
            C21055XCg.A0z(A0e, A01);
            C21054XCf.A1L(A0e, A01);
            C21054XCf.A0t(A0e, A01);
            C21054XCf.A1U(A0e, A01);
            C21054XCf.A0Y(A0e, A01);
            C21054XCf.A0m(A0e, A01);
            C21054XCf.A0z(A0e, A01);
            A0e.AAe("header_layout", (List) null);
            C21055XCg.A0q(A0e, A01);
            C21054XCf.A13(A0e, A01);
            A0e.A9F("unseen_reel_size", (Long) null);
            C21054XCf.A0r(A0e, A01);
            C21054XCf.A16(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21055XCg.A0g(A0e, C271774jZ.A6S, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            A0e.A9F("author_id", C21055XCg.A0Q(C271774jZ.A0Y, A01));
            C51965G9l.A1E(A0e, (Long) null);
            A0e.AAe("c_pk_list", (List) null);
            C21055XCg.A1E(A0e, A01, C21055XCg.A0M(A0e, r9, r6, A01), "ad_id_long");
            C21055XCg.A0s(A0e, A01);
            C21054XCf.A0V(A0e, A01);
            C21055XCg.A0o(A0e, A01);
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A9g, A01);
            if (A0d != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(A0d);
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    if (A18 != null) {
                        l5 = 00y.A0n(10, A18);
                        d = 012.A0p(A18);
                    } else {
                        l5 = null;
                        d = null;
                    }
                    AnonymousClass7TF.A1I(l5, d, A0p);
                }
                map = 0Yt.A08(A0p);
            } else {
                map = null;
            }
            A0e.A9H("video_to_carousel_cut_secs", map);
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
            C21054XCf.A12(A0e, A01);
            C21055XCg.A14(A0e, A01);
            C21054XCf.A1W(A0e, A01);
            AbstractCollection A0d2 = C21053XCe.A0d(C271774jZ.A17, A01);
            if (A0d2 != null) {
                linkedHashMap2 = DbS.A0x(C21055XCg.A00(A0d2));
                Iterator it3 = A0d2.iterator();
                while (it3.hasNext()) {
                    C21055XCg.A1Z(it3, linkedHashMap2);
                }
            } else {
                linkedHashMap2 = null;
            }
            A0e.A9H("carousel_transformation_cards", linkedHashMap2);
            C21055XCg.A0m(A0e, A01);
            C21054XCf.A1V(A0e, A01);
            A0e.AAK((0bb) null, "toolbar_layout");
            C21054XCf.A0s(A0e, A01);
            A0e.A9F("carousel_transformation_type", (Long) null);
            A0e.A9F("carousel_container_media_id", C51966G9m.A13(C271774jZ.A0w, A01));
            C21055XCg.A10(A0e, A01);
            A0e.A9F("merchant_id", C21054XCf.A06(C271774jZ.A5e, A01));
            C21053XCe.A0y(A0e, A01);
            List<0jB> list = (List) A01.A01(C271774jZ.A8N);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            if (list != null) {
                for (0jB r02 : list) {
                    if (!(r02 == null || (A04 = A00.A04("sticker_id")) == null)) {
                        long longValue = A04.longValue();
                        String A05 = (A00 = r02.A00()).A05("sticker_type");
                        if (A05 != null) {
                            0bb r3 = new 0bb();
                            r3.A06("sticker_id", String.valueOf(longValue));
                            r3.A06("sticker_type", A05);
                            A1H.put(A04, r3);
                        }
                    }
                }
            }
            A0e.A9H("sticker_types", A1H);
            A0e.AAJ("topic_cluster_status", (String) null);
            A0e.A9H("client_ad_creative_optimization_output", (Map) null);
            C21054XCf.A11(A0e, A01);
            C21055XCg.A17(A0e, A01);
            C21054XCf.A0x(A0e, A01);
            C21054XCf.A1Q(A0e, A01);
            C21054XCf.A1H(A0e, A01);
            A0e.A9F("hscroll_seed_ad_id", C21054XCf.A06(C271774jZ.A3b, A01));
            C21056XCh.A0G(A0e, A01, C21054XCf.A06(C271774jZ.A5t, A01));
            C21055XCg.A16(A0e, A01);
            C21054XCf.A19(A0e, A01);
            C21054XCf.A0k(A0e, A01);
            C21054XCf.A0g(A0e, A01);
            C21054XCf.A0l(A0e, A01);
            A0e.A7p("is_below_eof", (Boolean) null);
            C21054XCf.A0N(A0e, A01);
            C21054XCf.A10(A0e, A01);
            A0e.A9F("upcoming_event_id", C21054XCf.A06(C271774jZ.A9Y, A01));
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                ArrayList A0p3 = AnonymousClass7TF.A0p(A0f);
                Iterator it4 = A0f.iterator();
                while (it4.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(it4);
                    if (A182 != null) {
                        l3 = 00y.A0n(10, A182);
                        l4 = 00y.A0n(10, A182);
                    } else {
                        l3 = null;
                        l4 = null;
                    }
                    AnonymousClass7TF.A1I(l3, l4, A0p3);
                }
                linkedHashMap3 = C21053XCe.A0i(A0p3);
            } else {
                linkedHashMap3 = null;
            }
            C21053XCe.A16(A0e, linkedHashMap3);
            Integer num = AnonymousClass05K.A0j;
            C21054XCf.A1Y(A0e, A01, num, "container_module");
            A0e.AAJ("contextual_ads_category", (String) null);
            A0e.A9F("first_hscroll_item_ad_id", C21054XCf.A06(C271774jZ.A2u, A01));
            A0e.A9F("seed_ad_id", C21054XCf.A06(C271774jZ.A7q, A01));
            C21055XCg.A0n(A0e, A01);
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                ArrayList A0p4 = AnonymousClass7TF.A0p(A0e2);
                Iterator it5 = A0e2.iterator();
                while (it5.hasNext()) {
                    String A183 = AnonymousClass7TE.A18(it5);
                    if (A183 != null) {
                        l = 00y.A0n(10, A183);
                        l2 = 00y.A0n(10, A183);
                    } else {
                        l = null;
                        l2 = null;
                    }
                    AnonymousClass7TF.A1I(l, l2, A0p4);
                }
                linkedHashMap4 = C21053XCe.A0i(A0p4);
            } else {
                linkedHashMap4 = null;
            }
            A0e.A9H("product_ids", linkedHashMap4);
            if (AnonymousClass7TF.A1Y(A01.A01(C271774jZ.A4M), true)) {
                j = 1;
            }
            C21053XCe.A0p(A0e, j);
            C21054XCf.A0d(A0e, A01);
            A0e.A9H("carousel_media_product_ids", (Map) null);
            C21054XCf.A0Z(A0e, A01);
            C21054XCf.A0v(A0e, A01);
            C21053XCe.A13(A0e, A01);
            A0e.A9H("product_merchant_ids", (Map) A01.A01(new 0j9(num, "product_merchant_ids")));
            C21054XCf.A09(A0e, A01);
            A0e.Cgf();
        }
    }
}
