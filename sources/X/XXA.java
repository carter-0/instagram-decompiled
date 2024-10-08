package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class XXA {
    public static final void A00(0wc r19, C254523sc r20, AnonymousClass4DU r21, Long l, Long l2) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        0bb r9;
        Dd8 dd8;
        long j;
        ArrayList arrayList3;
        0Aj A0e = AnonymousClass7TE.A0e(r19, AnonymousClass000.A00(1483));
        0jB A01 = r20.A01();
        0xF r8 = r20.A00().A06;
        if (A0e.isSampled()) {
            C21054XCf.A0l(A0e, A01);
            ArrayList arrayList4 = null;
            A0e.A9F(AnonymousClass000.A00(5310), (Long) null);
            C21054XCf.A0H(A0e, A01);
            0j9 r5 = C271774jZ.A9D;
            A0e.AAJ("topic_cluster_id", C51966G9m.A1C(r5, A01));
            A0e.AAJ("topic_cluster_title", C51966G9m.A1C(C271774jZ.A9F, A01));
            0j9 r3 = C271774jZ.A9G;
            A0e.AAJ("topic_cluster_type", C51966G9m.A1C(r3, A01));
            C21054XCf.A18(A0e, A01);
            C21054XCf.A0o(A0e, A01);
            C21055XCg.A0t(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21053XCe.A0s(A0e, C298085sr.A01, A01);
            C21053XCe.A0r(A0e, C298085sr.A03, A01);
            C21054XCf.A0E(A0e, A01);
            A0e.AAJ("hashtag_feed_type", C51966G9m.A1C(C271774jZ.A3N, A01));
            C21054XCf.A14(A0e, A01);
            0j9 r4 = C271774jZ.A0Z;
            C21053XCe.A0u(A0e, r4, A01);
            C21053XCe.A0q(A0e, r8, "algorithm");
            A0e.AAJ("dest_topic_cluster_id", C51966G9m.A1C(r5, A01));
            A0e.AAJ(AnonymousClass000.A00(4699), C51966G9m.A1C(r3, A01));
            A0e.A9F(TraceFieldType.Duration, C21055XCg.A0R(C271774jZ.A2K, A01));
            C21053XCe.A0q(A0e, r8, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            C21053XCe.A0q(A0e, r8, "impression_token");
            A0e.AAJ("loop_count", (String) null);
            0j9 r0 = C271774jZ.A5a;
            C21053XCe.A0t(A0e, r0, A01);
            A0e.A9F("media_type", C51966G9m.A13(r0, A01));
            C21054XCf.A1I(A0e, A01);
            C21054XCf.A1S(A0e, A01);
            A0e.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C21055XCg.A0O(r8, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
            A0e.A9F("visible_item_count", (Long) null);
            C21054XCf.A1M(A0e, A01);
            A0e.AAJ("rank_token", C51966G9m.A1C(C271774jZ.A6r, A01));
            C51969G9p.A19(A0e, r21);
            C21054XCf.A1T(A0e, A01);
            C21054XCf.A0M(A0e, A01);
            C21055XCg.A1A(A0e, A01, C51966G9m.A13(C271774jZ.A5K, A01), "media_id");
            C21054XCf.A1K(A0e, A01);
            0j9 r92 = C271774jZ.A0C;
            C21053XCe.A0v(A0e, r92, A01);
            C21054XCf.A0e(A0e, A01);
            C21054XCf.A1J(A0e, A01);
            C21055XCg.A1G(A0e, A01, "ranking_session_id", C51966G9m.A1C(C271774jZ.A6q, A01));
            C21053XCe.A12(A0e, A01);
            C21053XCe.A0z(A0e, A01);
            C21054XCf.A0f(A0e, A01);
            C21054XCf.A0J(A0e, A01);
            C21055XCg.A1D(A0e, A01, C51966G9m.A13(C271774jZ.A11, A01), "carousel_media_id_int");
            C21055XCg.A0u(A0e, A01);
            C21054XCf.A0z(A0e, A01);
            C21054XCf.A0k(A0e, A01);
            C21055XCg.A15(A0e, A01);
            0j9 r192 = C271774jZ.A6j;
            AbstractCollection A0d = C21053XCe.A0d(r192, A01);
            if (A0d != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(A0d);
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    JTS.A1V(A0p, it);
                }
                arrayList = 00k.A0U(A0p);
            } else {
                arrayList = null;
            }
            A0e.AAe("product_ids", arrayList);
            A0e.AAe("mentioned_product_ids", (List) null);
            ArrayList A06 = r8.A06("shared_product_ids");
            if (A06 == null) {
                A06 = null;
            }
            A0e.AAe("shared_product_ids", A06);
            A0e.A9F("product_id", C21054XCf.A06(C271774jZ.A6i, A01));
            0j9 r13 = C271774jZ.A5e;
            A0e.A9F("merchant_id", C21054XCf.A06(r13, A01));
            C21054XCf.A0T(A0e, A01);
            A0e.A7p("can_add_to_bag", r8.A01("can_add_to_bag"));
            C21054XCf.A1X(A0e, A01, AnonymousClass05K.A0j);
            A0e.AAJ("shopping_session_id", C51966G9m.A1C(C271774jZ.A80, A01));
            C21054XCf.A0G(A0e, A01);
            A0e.AAJ(AnonymousClass000.A00(277), (String) null);
            C21054XCf.A1L(A0e, A01);
            C21054XCf.A0K(A0e, A01);
            C21054XCf.A1A(A0e, A01);
            C21055XCg.A12(A0e, A01);
            C21053XCe.A11(A0e, A01);
            A0e.A9F("entity_page_id", C21054XCf.A06(C271774jZ.A2b, A01));
            C21054XCf.A1B(A0e, A01);
            C21055XCg.A0y(A0e, A01);
            C21054XCf.A0c(A0e, A01);
            A0e.AAJ("log_auditor_session", (String) null);
            A0e.AAK((0bb) null, "search_context");
            A0e.A9F(AnonymousClass000.A00(2695), (Long) null);
            A0e.AAJ("source_of_tapping", C51966G9m.A1C(C271774jZ.A8C, A01));
            A0e.A9F("media_index", C51966G9m.A13(C271774jZ.A5L, A01));
            C21054XCf.A0U(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21055XCg.A0z(A0e, A01);
            C21054XCf.A0t(A0e, A01);
            C21054XCf.A12(A0e, A01);
            A0e.A7p("is_unpublished", C21053XCe.A0W(C271774jZ.A4x, A01));
            C21054XCf.A1N(A0e, A01);
            C21054XCf.A0i(A0e, A01);
            C21054XCf.A1F(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            0j9 r10 = C271774jZ.A12;
            C21053XCe.A0x(A0e, r10, A01);
            C21054XCf.A1U(A0e, A01);
            C21054XCf.A0Y(A0e, A01);
            C21055XCg.A0q(A0e, A01);
            C21054XCf.A0m(A0e, A01);
            A0e.A9F("post_id", C21055XCg.A0P(C271774jZ.A6Z, A01));
            A0e.A9F("unseen_reel_size", (Long) null);
            A0e.A9F("tray_pos_excl_own_story", C21054XCf.A06(C271774jZ.A9Q, A01));
            C21054XCf.A0r(A0e, A01);
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                linkedHashMap = DbS.A0x(C21055XCg.A00(A0f));
                Iterator it2 = A0f.iterator();
                while (it2.hasNext()) {
                    C21055XCg.A1Y(it2, linkedHashMap);
                }
            } else {
                linkedHashMap = null;
            }
            C21053XCe.A16(A0e, linkedHashMap);
            C21054XCf.A0F(A0e, A01);
            C21053XCe.A0w(A0e, r10, A01);
            C21054XCf.A16(A0e, A01);
            A0e.A9F("author_id", C21055XCg.A0P(C271774jZ.A0Y, A01));
            AbstractCollection A0d2 = C21053XCe.A0d(C271774jZ.A2q, A01);
            if (A0d2 != null) {
                arrayList2 = AnonymousClass7TF.A0p(A0d2);
                Iterator it3 = A0d2.iterator();
                while (it3.hasNext()) {
                    JTS.A1V(arrayList2, it3);
                }
            } else {
                arrayList2 = null;
            }
            A0e.AAe("feed_sticker_media_id", arrayList2);
            A0e.AAe("c_pk_list", (List) null);
            C21055XCg.A1E(A0e, A01, C51966G9m.A13(r4, A01), "a_pk_long");
            A0e.A9F("effect_id", C51966G9m.A13(C271774jZ.A2O, A01));
            A0e.A9F(AnonymousClass000.A00(1334), (Long) null);
            A0e.A9F(C273654mx.A00(812), C51966G9m.A13(C271774jZ.A5G, A01));
            C21054XCf.A1O(A0e, A01);
            A0e.A9F("main_feed_carousel_starting_media_id", C21054XCf.A06(C271774jZ.A5A, A01));
            C21054XCf.A0a(A0e, A01);
            A0e.A9F("tab_index", C51966G9m.A13(C271774jZ.A8i, A01));
            A0e.A9F("recs_ix", C21055XCg.A0O(r8, "recs_ix"));
            C21054XCf.A1W(A0e, A01);
            C21054XCf.A0s(A0e, A01);
            C21053XCe.A0y(A0e, A01);
            AbstractCollection A0d3 = C21053XCe.A0d(C271774jZ.A8N, A01);
            if (A0d3 != null) {
                linkedHashMap2 = AnonymousClass7TE.A1H();
                Iterator it4 = A0d3.iterator();
                while (it4.hasNext()) {
                    it4.next();
                    Long A04 = r8.A04("sticker_id");
                    if (A04 != null) {
                        long longValue = A04.longValue();
                        String A05 = r8.A05("sticker_type");
                        if (A05 != null) {
                            0bb r1 = new 0bb();
                            r1.A06("sticker_id", String.valueOf(longValue));
                            r1.A06("sticker_type", A05);
                            linkedHashMap2.put(A04, r1);
                        }
                    }
                }
            } else {
                linkedHashMap2 = null;
            }
            A0e.A9H("sticker_types", linkedHashMap2);
            A0e.AAJ("audience", C51966G9m.A1C(C271774jZ.A0W, A01));
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            C21054XCf.A1V(A0e, A01);
            C21054XCf.A1G(A0e, A01);
            C21054XCf.A1R(A0e, A01);
            A0e.A9F("feed_recs_post_position", C51966G9m.A13(C271774jZ.A2r, A01));
            C21053XCe.A13(A0e, A01);
            C21053XCe.A0q(A0e, r8, "chaining_feed_session_id");
            C21054XCf.A0q(A0e, A01);
            C21054XCf.A0n(A0e, A01);
            C21055XCg.A1C(A0e, A01, C51966G9m.A13(C271774jZ.A9I, A01), "top_likers_count");
            AbstractCollection abstractCollection = (AbstractCollection) C21055XCg.A0I(A0e, A01);
            if (abstractCollection != null) {
                LinkedHashMap A0x = DbS.A0x(C21055XCg.A00(abstractCollection));
                Iterator it5 = abstractCollection.iterator();
                while (it5.hasNext()) {
                    Long valueOf = Long.valueOf(Pxg.A0H(it5));
                    A0x.put(valueOf, valueOf);
                }
                linkedHashMap3 = 0Yt.A03(A0x);
            } else {
                linkedHashMap3 = null;
            }
            A0e.A9H("sponsor_tag_ids", linkedHashMap3);
            A0e.AAJ("search_session_id", C51966G9m.A1C(C271774jZ.A7p, A01));
            A0e.AAJ("query_text", C51966G9m.A1C(C271774jZ.A6n, A01));
            C21053XCe.A0q(A0e, r8, "entity_page_type");
            C21054XCf.A0A(A0e, A01);
            C21055XCg.A17(A0e, A01);
            A0e.A9F("sponsor_id_clicked_on", C21055XCg.A0P(C271774jZ.A8E, A01));
            C21054XCf.A1D(A0e, A01);
            A0e.AAe("header_layout", (List) null);
            C21053XCe.A10(A0e, A01);
            A0e.A9F("upcoming_event_id", C21055XCg.A0P(C271774jZ.A9Y, A01));
            A0e.AAJ(AnonymousClass000.A00(77), C51966G9m.A1C(C271774jZ.A2F, A01));
            C21054XCf.A0x(A0e, A01);
            AbstractMap A0g = C21053XCe.A0g(A01);
            if (A0g != null) {
                linkedHashMap4 = C21054XCf.A08(A0g);
                Iterator A0s = AnonymousClass7TF.A0s(A0g);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    Object key = A1J.getKey();
                    Iterable iterable = (Iterable) A1J.getValue();
                    LinkedHashMap A0x2 = DbS.A0x(C21055XCg.A00(iterable));
                    for (Object next : iterable) {
                        A0x2.put(next, next);
                    }
                    linkedHashMap4.put(key, A0x2);
                }
            } else {
                linkedHashMap4 = null;
            }
            C21053XCe.A17(A0e, linkedHashMap4);
            C21053XCe.A0q(A0e, r8, "feed_type");
            A0e.A9F("ad_id_long", C51966G9m.A13(r92, A01));
            C21054XCf.A0u(A0e, A01);
            A0e.A9H("product_mention_ids", (Map) null);
            0jB A012 = A01.A01(C271774jZ.A81);
            if (A012 != null) {
                r9 = new 0bb();
                String A1C = C51966G9m.A1C(r13, A012);
                if (A1C != null) {
                    j = Long.parseLong(A1C);
                } else {
                    j = 0;
                }
                C21053XCe.A1B(r9, "merchant_id", j);
                AbstractCollection A0d4 = C21053XCe.A0d(r192, A012);
                if (A0d4 != null) {
                    arrayList3 = AnonymousClass7TE.A1C();
                    Iterator it6 = A0d4.iterator();
                    while (it6.hasNext()) {
                        C21055XCg.A1W(arrayList3, it6);
                    }
                } else {
                    arrayList3 = 0sn.A00;
                }
                r9.A07("product_ids", arrayList3);
                String A052 = r8.A05("shopping_sticker_id");
                if (A052 == null) {
                    A052 = "";
                }
                r9.A06("shopping_sticker_id", A052);
            } else {
                r9 = null;
            }
            A0e.AAK(r9, "shopping_sticker_info");
            C21055XCg.A16(A0e, A01);
            C21054XCf.A0j(A0e, A01);
            C21053XCe.A0q(A0e, r8, C273654mx.A00(365));
            C21054XCf.A0C(A0e, A01);
            A0e.A7p("is_top_post", C21055XCg.A0J(r8, "is_top_post"));
            A0e.A7p("guide_open_status", (Boolean) null);
            C21054XCf.A1H(A0e, A01);
            A0e.A9H("sponsor_ids", (Map) null);
            A0e.AAJ(AnonymousClass000.A00(4756), (String) null);
            C21053XCe.A0q(A0e, r8, "checkout_session_id");
            C21053XCe.A0q(A0e, r8, AnonymousClass000.A00(1380));
            A0e.A7p("is_on_sale", (Boolean) null);
            A0e.A9F("product_image_count", (Long) null);
            0bb r12 = new 0bb();
            r12.A06("search_session_id", (String) null);
            r12.A06("serp_session_id", (String) null);
            r12.A06("query_text", (String) null);
            r12.A06("rank_token", (String) null);
            A0e.AAK(r12, "search_context");
            A0e.A9F(C273654mx.A00(123), l);
            A0e.A9F(AnonymousClass000.A00(521), l2);
            A0e.AAJ(C273654mx.A00(415), C51966G9m.A1C(C271774jZ.A9N, A01));
            AbstractCollection A0d5 = C21053XCe.A0d(C271774jZ.A9O, A01);
            if (A0d5 != null) {
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0d5);
                Iterator it7 = A0d5.iterator();
                while (it7.hasNext()) {
                    Object next2 = it7.next();
                    Dd8[] values = Dd8.values();
                    int i = 0;
                    int length = values.length;
                    while (true) {
                        if (i >= length) {
                            dd8 = null;
                            break;
                        }
                        dd8 = values[i];
                        if (0qQ.A0K(dd8.A00, next2)) {
                            break;
                        }
                        i++;
                    }
                    A0p2.add(dd8);
                }
                arrayList4 = A0p2;
            }
            A0e.AAe(C273654mx.A00(416), arrayList4);
            DbX.A1L(A0e);
        }
    }
}
