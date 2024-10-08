package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class XXB {
    public static final void A00(0wc r9, C254523sc r10, AnonymousClass4DU r11, Long l, Long l2) {
        Map map;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        Dd8 dd8;
        Long l3;
        Long l4;
        0Aj A0e = AnonymousClass7TE.A0e(r9, AnonymousClass000.A00(3373));
        0jB A01 = r10.A01();
        0xF r3 = r10.A00().A06;
        if (A0e.isSampled()) {
            String A1C = C51966G9m.A1C(C271774jZ.A5I, A01);
            if (A1C == null) {
                A1C = "";
            }
            C51965G9l.A1I(A0e, A1C);
            C21055XCg.A1B(A0e, A01, C51966G9m.A13(C271774jZ.A0Z, A01), "a_pk");
            C21054XCf.A1S(A0e, A01);
            C21055XCg.A1G(A0e, A01, "tracking_token", C51966G9m.A1C(C271774jZ.A9L, A01));
            C21055XCg.A0h(A0e, C271774jZ.A5a, A01);
            C21055XCg.A0z(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A1W(A0e, A01);
            C21054XCf.A0M(A0e, A01);
            C21054XCf.A1K(A0e, A01);
            C21054XCf.A0i(A0e, A01);
            C21054XCf.A0K(A0e, A01);
            C21054XCf.A14(A0e, A01);
            C21054XCf.A0F(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A17(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A12(A0e, A01);
            C21054XCf.A12(A0e, A01);
            C21054XCf.A0o(A0e, A01);
            C21054XCf.A1I(A0e, A01);
            ArrayList arrayList = null;
            A0e.A9H("c_pk_list", (Map) null);
            C21054XCf.A1B(A0e, A01);
            C21053XCe.A11(A0e, A01);
            A0e.A9F("entity_page_id", C21055XCg.A0P(C271774jZ.A2b, A01));
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(A0f);
                Iterator it = A0f.iterator();
                while (it.hasNext()) {
                    C21055XCg.A1X(A0p, it);
                }
                map = 0Yt.A08(A0p);
            } else {
                map = null;
            }
            C21053XCe.A16(A0e, map);
            C21053XCe.A12(A0e, A01);
            C21055XCg.A0i(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            0j9 r6 = C271774jZ.A12;
            C21053XCe.A0w(A0e, r6, A01);
            C21054XCf.A0s(A0e, A01);
            C21053XCe.A0r(A0e, C271774jZ.A3Q, A01);
            C21054XCf.A0E(A0e, A01);
            C21053XCe.A0s(A0e, C271774jZ.A3P, A01);
            C21054XCf.A1O(A0e, A01);
            C21054XCf.A0y(A0e, A01);
            C21055XCg.A0j(A0e, A01);
            C21054XCf.A0x(A0e, A01);
            C51969G9p.A19(A0e, r11);
            C21054XCf.A0f(A0e, A01);
            C21055XCg.A0y(A0e, A01);
            C21054XCf.A1F(A0e, A01);
            C21054XCf.A1L(A0e, A01);
            A0e.A9F("recs_ix", C21055XCg.A0O(r3, "recs_ix"));
            C21054XCf.A0t(A0e, A01);
            C21054XCf.A1V(A0e, A01);
            C21053XCe.A0v(A0e, C271774jZ.A0C, A01);
            C21054XCf.A0q(A0e, A01);
            C21054XCf.A0e(A0e, A01);
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
            C21053XCe.A0x(A0e, r6, A01);
            C21054XCf.A1M(A0e, A01);
            String A00 = C273654mx.A00(320);
            A0e.A7p(A00, C21055XCg.A0J(r3, A00));
            C21053XCe.A0q(A0e, r3, C273654mx.A00(2399));
            C21053XCe.A0q(A0e, r3, C273654mx.A00(3112));
            C21053XCe.A0q(A0e, r3, C273654mx.A00(3113));
            C21053XCe.A0q(A0e, r3, C273654mx.A00(3145));
            C21053XCe.A0q(A0e, r3, "referrer");
            C21053XCe.A0q(A0e, r3, C273654mx.A00(3253));
            C21053XCe.A0q(A0e, r3, C273654mx.A00(3275));
            A0e.AAJ("url", C51966G9m.A1C(C271774jZ.A9a, A01));
            C21053XCe.A0q(A0e, r3, "impression_token");
            C21054XCf.A0A(A0e, A01);
            C21054XCf.A1D(A0e, A01);
            C21055XCg.A16(A0e, A01);
            C21055XCg.A1A(A0e, A01, C51966G9m.A13(C271774jZ.A5K, A01), "media_id");
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            A0e.A7p("is_top_post", C21055XCg.A0J(r3, "is_top_post"));
            C21055XCg.A17(A0e, A01);
            A0e.A9H("shared_product_ids", (Map) null);
            C21054XCf.A0L(A0e, A01);
            C21054XCf.A0l(A0e, A01);
            C21055XCg.A0n(A0e, A01);
            A0e.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C21055XCg.A0P(C271774jZ.A9T, A01));
            A0e.A9F("upcoming_event_id", C21055XCg.A0P(C271774jZ.A9Y, A01));
            A0e.A7p("pwa", C21055XCg.A0J(r3, "pwa"));
            C21054XCf.A0T(A0e, A01);
            C21054XCf.A0v(A0e, A01);
            C21054XCf.A0Z(A0e, A01);
            C21053XCe.A0q(A0e, r3, "entity_page_type");
            A0e.AAJ("rank_token", C51966G9m.A1C(C271774jZ.A6r, A01));
            A0e.AAJ("search_session_id", C51966G9m.A1C(C271774jZ.A7p, A01));
            C21054XCf.A0n(A0e, A01);
            C21055XCg.A1C(A0e, A01, C51966G9m.A13(C271774jZ.A9I, A01), "top_likers_count");
            C21054XCf.A0C(A0e, A01);
            A0e.AAJ("audience", C51966G9m.A1C(C271774jZ.A0W, A01));
            C21054XCf.A0V(A0e, A01);
            C21054XCf.A0I(A0e, A01);
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                ArrayList A0p3 = AnonymousClass7TF.A0p(A0e2);
                Iterator it3 = A0e2.iterator();
                while (it3.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it3);
                    if (A18 != null) {
                        l3 = DbV.A0q(A18);
                        l4 = DbV.A0q(A18);
                    } else {
                        l3 = null;
                        l4 = null;
                    }
                    AnonymousClass7TF.A1I(l3, l4, A0p3);
                }
                linkedHashMap2 = C21053XCe.A0i(A0p3);
            } else {
                linkedHashMap2 = null;
            }
            A0e.A9H("product_ids", linkedHashMap2);
            AbstractMap A0g = C21053XCe.A0g(A01);
            if (A0g != null) {
                linkedHashMap3 = C21054XCf.A08(A0g);
                Iterator A0s = AnonymousClass7TF.A0s(A0g);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    Object key = A1J.getKey();
                    Iterable iterable = (Iterable) A1J.getValue();
                    ArrayList A0p4 = AnonymousClass7TF.A0p(iterable);
                    Iterator it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        C21055XCg.A1V(A0p4, it4);
                    }
                    linkedHashMap3.put(key, 0Yt.A08(A0p4));
                }
            } else {
                linkedHashMap3 = null;
            }
            C21053XCe.A17(A0e, linkedHashMap3);
            A0e.AAJ("byline_text", C51966G9m.A1C(C271774jZ.A0l, A01));
            C21054XCf.A0p(A0e, A01);
            A0e.A9F("counter_id", C21055XCg.A0P(C271774jZ.A1g, A01));
            A0e.A9F("counter_sid", C21055XCg.A0P(C271774jZ.A1h, A01));
            A0e.AAJ("sponsored_label_text", C51966G9m.A1C(C271774jZ.A8D, A01));
            C21054XCf.A16(A0e, A01);
            A0e.A9F("sponsor_tag_id", C21055XCg.A0P(C271774jZ.A8I, A01));
            C21053XCe.A13(A0e, A01);
            C21053XCe.A0q(A0e, r3, "chaining_feed_session_id");
            C21055XCg.A0p(A0e, A01);
            C21055XCg.A1D(A0e, A01, C51966G9m.A13(C271774jZ.A11, A01), "carousel_media_id_int");
            A0e.AAJ("query_text", C51966G9m.A1C(C271774jZ.A6n, A01));
            A0e.A8D(C273654mx.A00(339), C21053XCe.A0Y(C271774jZ.A5U, A01));
            0bb r1 = new 0bb();
            r1.A06("search_session_id", (String) null);
            r1.A06("serp_session_id", (String) null);
            r1.A06("query_text", (String) null);
            r1.A06("rank_token", (String) null);
            A0e.AAK(r1, "search_context");
            A0e.A9F(C273654mx.A00(123), l);
            A0e.A9F(AnonymousClass000.A00(521), l2);
            A0e.AAJ(C273654mx.A00(415), C51966G9m.A1C(C271774jZ.A9N, A01));
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A9O, A01);
            if (A0d != null) {
                ArrayList A0p5 = AnonymousClass7TF.A0p(A0d);
                Iterator it5 = A0d.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    Dd8[] values = Dd8.values();
                    int i = 0;
                    int length = values.length;
                    while (true) {
                        if (i >= length) {
                            dd8 = null;
                            break;
                        }
                        dd8 = values[i];
                        if (0qQ.A0K(dd8.A00, next)) {
                            break;
                        }
                        i++;
                    }
                    A0p5.add(dd8);
                }
                arrayList = A0p5;
            }
            A0e.AAe(C273654mx.A00(416), arrayList);
            A0e.AAe(C273654mx.A00(2396), (List) A01.A01(C271774jZ.A2y));
            A0e.AAe(C273654mx.A00(2183), (List) A01.A01(C271774jZ.A2x));
            A0e.AAJ(AnonymousClass000.A00(4570), AnonymousClass1K6.A00);
            A0e.AAJ(AnonymousClass000.A00(265), C324716zm.A00());
            A0e.Cgf();
        }
    }
}
