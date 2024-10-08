package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XWu  reason: case insensitive filesystem */
public abstract class C21335XWu {
    public static final void A00(0wc r10, C254523sc r11, AnonymousClass4DU r12) {
        String str;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        Double d;
        Long l;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        Double d2;
        0Aj A0e = AnonymousClass7TE.A0e(r10, AnonymousClass000.A00(1470));
        0jB A01 = r11.A01();
        if (A0e.isSampled()) {
            C21054XCf.A0e(A0e, A01);
            A0e.AAJ("from", C51966G9m.A1C(C271774jZ.A2z, A01));
            C21054XCf.A1T(A0e, A01);
            A0e.AAJ("url", C51966G9m.A1C(C271774jZ.A9a, A01));
            A0e.AAJ("source_of_tapping", C51966G9m.A1C(C271774jZ.A8C, A01));
            C21054XCf.A0J(A0e, A01);
            C21055XCg.A0v(A0e, A01);
            Serializable A012 = A01.A01(C271774jZ.A9H);
            Long l2 = null;
            if (A012 != null) {
                str = A012.toString();
            } else {
                str = null;
            }
            A0e.AAJ("top_followers_count", str);
            C21054XCf.A15(A0e, A01);
            C21054XCf.A0j(A0e, A01);
            C21054XCf.A0H(A0e, A01);
            C21054XCf.A0c(A0e, A01);
            C21054XCf.A1S(A0e, A01);
            C21053XCe.A0u(A0e, C271774jZ.A0Z, A01);
            0j9 r7 = C271774jZ.A5a;
            C21053XCe.A0t(A0e, r7, A01);
            A0e.A9F("ad_id", C21055XCg.A0Q(C271774jZ.A0B, A01));
            A0e.A7p("is_unpublished", C21053XCe.A0W(C271774jZ.A4x, A01));
            C21055XCg.A0e(A0e, C271774jZ.A8x, A01);
            C21055XCg.A0z(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A1W(A0e, A01);
            C21055XCg.A0o(A0e, A01);
            C21054XCf.A12(A0e, A01);
            C21055XCg.A1F(A0e, A01, "inventory_source", C51966G9m.A1C(C271774jZ.A3q, A01));
            A0e.A9F("m_ix", C51966G9m.A13(C271774jZ.A3m, A01));
            C21054XCf.A1N(A0e, A01);
            C21055XCg.A15(A0e, A01);
            C21054XCf.A0R(A0e, A01);
            C21054XCf.A1U(A0e, A01);
            C21053XCe.A10(A0e, A01);
            C21053XCe.A0z(A0e, A01);
            C21053XCe.A12(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            0j9 r5 = C271774jZ.A12;
            C21053XCe.A0w(A0e, r5, A01);
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21055XCg.A0g(A0e, C271774jZ.A6S, A01);
            C21054XCf.A0s(A0e, A01);
            C21054XCf.A0x(A0e, A01);
            C21054XCf.A1L(A0e, A01);
            C21054XCf.A0S(A0e, A01);
            C21054XCf.A1F(A0e, A01);
            A0e.A9F("dr_ad_type", C51966G9m.A13(C271774jZ.A2J, A01));
            C21055XCg.A0q(A0e, A01);
            C21054XCf.A0a(A0e, A01);
            C21054XCf.A0Y(A0e, A01);
            C21054XCf.A0m(A0e, A01);
            C21054XCf.A0z(A0e, A01);
            A0e.A9H("header_layout", (Map) null);
            C21054XCf.A13(A0e, A01);
            C21054XCf.A0r(A0e, A01);
            A0e.AAK((0bb) null, "toolbar_layout");
            C21054XCf.A1V(A0e, A01);
            C21053XCe.A0x(A0e, r5, A01);
            A0e.A9H("sticker_types", (Map) null);
            C21054XCf.A0V(A0e, A01);
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
            A0e.A9F("sponsor_id_clicked_on", C21054XCf.A06(C271774jZ.A8E, A01));
            C21055XCg.A0s(A0e, A01);
            C21055XCg.A10(A0e, A01);
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A17, A01);
            if (A0d != null) {
                linkedHashMap2 = DbS.A0x(C21055XCg.A00(A0d));
                Iterator it2 = A0d.iterator();
                while (it2.hasNext()) {
                    C21055XCg.A1Z(it2, linkedHashMap2);
                }
            } else {
                linkedHashMap2 = null;
            }
            A0e.A9H("carousel_transformation_cards", linkedHashMap2);
            A0e.A9F("carousel_transformation_type", (Long) null);
            AbstractCollection A0d2 = C21053XCe.A0d(C271774jZ.A9g, A01);
            if (A0d2 != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it3 = A0d2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    String str2 = (String) next;
                    0qQ.A0B(str2, 0);
                    if (00y.A0n(10, str2) != null) {
                        A1C.add(next);
                    }
                }
                linkedHashMap3 = DbS.A0x(C21055XCg.A00(A1C));
                Iterator it4 = A1C.iterator();
                while (it4.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it4);
                    linkedHashMap3.put(DbV.A0q(A18), C21053XCe.A0a(A18));
                }
            } else {
                linkedHashMap3 = null;
            }
            A0e.A9H("video_to_carousel_cut_secs", linkedHashMap3);
            A0e.AAJ("text", C51966G9m.A1C(C271774jZ.A8u, A01));
            C21054XCf.A0Q(A0e, A01);
            C21053XCe.A11(A0e, A01);
            A0e.A9F("entity_page_id", C21054XCf.A06(C271774jZ.A2b, A01));
            C21054XCf.A0L(A0e, A01);
            0j9 r8 = C271774jZ.A68;
            Number A0b = C21053XCe.A0b(r8, A01);
            if (A0b != null) {
                d = Double.valueOf((double) A0b.longValue());
            } else {
                d = null;
            }
            C21053XCe.A14(A0e, d);
            C21054XCf.A1D(A0e, A01);
            C21054XCf.A0P(A0e, A01);
            0j9 r1 = C271774jZ.A5e;
            if (A01.A01(r1) != null) {
                l = DbV.A0q(C51966G9m.A1C(r1, A01));
            } else {
                l = null;
            }
            A0e.A9F("merchant_id", l);
            C21054XCf.A0d(A0e, A01);
            C21055XCg.A17(A0e, A01);
            C21055XCg.A0m(A0e, A01);
            C21054XCf.A1B(A0e, A01);
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Iterator it5 = A0e2.iterator();
                while (it5.hasNext()) {
                    C21055XCg.A1W(A1C2, it5);
                }
                arrayList = 00k.A0U(A1C2);
            } else {
                arrayList = null;
            }
            A0e.AAe("product_ids", arrayList);
            AbstractMap A0g = C21053XCe.A0g(A01);
            if (A0g != null) {
                linkedHashMap4 = C21054XCf.A08(A0g);
                Iterator A0s = AnonymousClass7TF.A0s(A0g);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    Object key = A1J.getKey();
                    Iterable iterable = (Iterable) A1J.getValue();
                    LinkedHashMap A0x = DbS.A0x(C21055XCg.A00(iterable));
                    for (Object next2 : iterable) {
                        A0x.put(next2, next2);
                    }
                    linkedHashMap4.put(key, A0x);
                }
            } else {
                linkedHashMap4 = null;
            }
            C21053XCe.A17(A0e, linkedHashMap4);
            C21054XCf.A0v(A0e, A01);
            C21054XCf.A0Z(A0e, A01);
            A0e.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C21054XCf.A06(C271774jZ.A9T, A01));
            C21054XCf.A1Q(A0e, A01);
            C21054XCf.A1H(A0e, A01);
            C21055XCg.A0n(A0e, A01);
            C21054XCf.A0O(A0e, A01);
            C21054XCf.A11(A0e, A01);
            C21053XCe.A13(A0e, A01);
            C21054XCf.A0t(A0e, A01);
            A0e.A9F("main_feed_carousel_starting_media_id", C21054XCf.A06(C271774jZ.A5A, A01));
            C21054XCf.A0p(A0e, A01);
            A0e.A9F("counter_id", C21054XCf.A06(C271774jZ.A1g, A01));
            A0e.A9F("counter_sid", C21054XCf.A06(C271774jZ.A1h, A01));
            C21055XCg.A16(A0e, A01);
            C21054XCf.A0l(A0e, A01);
            C21054XCf.A0k(A0e, A01);
            C21054XCf.A0u(A0e, A01);
            C21054XCf.A0C(A0e, A01);
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                linkedHashMap5 = DbS.A0x(C21055XCg.A00(A0f));
                Iterator it6 = A0f.iterator();
                while (it6.hasNext()) {
                    C21055XCg.A1Y(it6, linkedHashMap5);
                }
            } else {
                linkedHashMap5 = null;
            }
            C21053XCe.A16(A0e, linkedHashMap5);
            C21053XCe.A0p(A0e, G9t.A0k(AnonymousClass7TF.A1Y(A01.A01(C271774jZ.A4M), true) ? 1 : 0));
            C21054XCf.A14(A0e, A01);
            C21054XCf.A16(A0e, A01);
            A0e.A9F(C273654mx.A00(2118), C21054XCf.A06(C271774jZ.A0j, A01));
            A0e.A9F("connection_id", C21054XCf.A06(C271774jZ.A1X, A01));
            Number A0b2 = C21053XCe.A0b(r8, A01);
            if (A0b2 != null) {
                d2 = Double.valueOf((double) A0b2.longValue());
            } else {
                d2 = null;
            }
            A0e.A8D("norialized_feed_position", d2);
            C21054XCf.A0X(A0e, A01);
            C21055XCg.A0d(A0e, r12, A01, C51966G9m.A13(C271774jZ.A5E, A01), "media_author_id");
            C21055XCg.A1D(A0e, A01, 1L, "is_prod");
            C21055XCg.A0k(A0e, A01);
            A0e.A9F("product_id", C51966G9m.A13(C271774jZ.A6k, A01));
            C21054XCf.A1C(A0e, A01);
            A0e.AAJ("log_auditor_session", (String) null);
            A0e.A9F("media_type", C51966G9m.A13(r7, A01));
            C21054XCf.A1J(A0e, A01);
            A0e.A9F("media_index", C51966G9m.A13(C271774jZ.A5L, A01));
            A0e.A9F("unseen_reel_size", (Long) null);
            C21053XCe.A0y(A0e, A01);
            A0e.A9H("client_ad_creative_optimization_output", (Map) null);
            A0e.A9F("upcoming_event_id", C21054XCf.A06(C271774jZ.A9Y, A01));
            A0e.A9F("seed_ad_id", C21054XCf.A06(C271774jZ.A7q, A01));
            A0e.A9F("hscroll_seed_ad_id", C21054XCf.A06(C271774jZ.A3b, A01));
            C21055XCg.A19(A0e, A01, C21054XCf.A06(C271774jZ.A2u, A01));
            A0e.A7p("should_navigate_to_profile_and_browse", C21053XCe.A0W(C271774jZ.A82, A01));
            C21055XCg.A1E(A0e, A01, C21054XCf.A06(C271774jZ.A5t, A01), "multi_ads_first_ad_id");
            C21055XCg.A0r(A0e, A01);
            C21054XCf.A09(A0e, A01);
            Number A0b3 = C21053XCe.A0b(C271774jZ.A5f, A01);
            if (A0b3 != null) {
                l2 = C51969G9p.A0r(A0b3);
            }
            A0e.A9F(C273654mx.A00(342), l2);
            DbX.A1L(A0e);
        }
    }
}
