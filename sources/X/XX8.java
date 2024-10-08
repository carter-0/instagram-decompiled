package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class XX8 {
    public static final void A00(0wc r18, C254523sc r19, AnonymousClass4DU r20) {
        LinkedHashMap linkedHashMap;
        C263944Ny r0;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap3;
        long j;
        ArrayList arrayList3;
        Long A0n;
        0Aj A0e = AnonymousClass7TE.A0e(r18, "instagram_ad_unsave");
        0jB A01 = r19.A01();
        0xF r192 = r19.A00().A06;
        if (A0e.isSampled()) {
            A0e.A9O("is_previewable_video_ad", Boolean.valueOf(AnonymousClass7TG.A1X(C21053XCe.A0W(C271774jZ.A4b, A01))));
            A0e.A9O("is_multi_ads", Boolean.valueOf(AnonymousClass7TG.A1X(C21053XCe.A0W(C271774jZ.A4V, A01))));
            A0e.A9O("is_below_eof", false);
            0j9 r11 = C271774jZ.A0Z;
            C21055XCg.A1B(A0e, A01, C51966G9m.A13(r11, A01), "a_pk");
            C21054XCf.A0H(A0e, A01);
            0j9 r12 = C271774jZ.A5a;
            C21053XCe.A0t(A0e, r12, A01);
            C21054XCf.A1S(A0e, A01);
            C21055XCg.A1G(A0e, A01, "tracking_token", C51966G9m.A1C(C271774jZ.A9L, A01));
            0j9 r6 = C271774jZ.A0C;
            C21053XCe.A0v(A0e, r6, A01);
            C21055XCg.A0e(A0e, C271774jZ.A8x, A01);
            A0e.AAJ("save_item_type", C51966G9m.A1C(C271774jZ.A7k, A01));
            C21054XCf.A0w(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A0D(A0e, A01);
            C21054XCf.A0e(A0e, A01);
            C21055XCg.A1F(A0e, A01, "inventory_source", C51966G9m.A1C(C271774jZ.A3q, A01));
            C21054XCf.A1W(A0e, A01);
            C21055XCg.A0i(A0e, A01);
            C21053XCe.A12(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            0j9 r8 = C271774jZ.A12;
            C21053XCe.A0w(A0e, r8, A01);
            C21054XCf.A1J(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21055XCg.A0g(A0e, C271774jZ.A6S, A01);
            C21054XCf.A12(A0e, A01);
            C21055XCg.A0o(A0e, A01);
            C21054XCf.A0s(A0e, A01);
            C21055XCg.A0l(A0e, A01);
            C21055XCg.A1C(A0e, A01, C51966G9m.A13(C271774jZ.A4B, A01), "is_dark_mode");
            C21054XCf.A0x(A0e, A01);
            AbstractCollection abstractCollection = (AbstractCollection) C21055XCg.A0I(A0e, A01);
            0bb r5 = null;
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
            C21053XCe.A0x(A0e, r8, A01);
            C21054XCf.A1V(A0e, A01);
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            C21055XCg.A10(A0e, A01);
            0j9 r10 = C271774jZ.A5e;
            String A1C = C51966G9m.A1C(r10, A01);
            if (A1C != null) {
                r0 = C263944Ny.A00(A1C);
            } else {
                r0 = null;
            }
            A0e.AAE(r0, "merchant_id");
            0j9 r82 = C271774jZ.A6j;
            AbstractCollection A0d = C21053XCe.A0d(r82, A01);
            if (A0d != null) {
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0d);
                Iterator it2 = A0d.iterator();
                while (it2.hasNext()) {
                    C21054XCf.A1b(A0p2, it2);
                }
                arrayList = AnonymousClass7TE.A1D(00k.A0X(A0p2));
            } else {
                arrayList = null;
            }
            A0e.AAe("product_ids", arrayList);
            AbstractMap A0g = C21053XCe.A0g(A01);
            if (A0g != null) {
                LinkedHashMap A08 = C21054XCf.A08(A0g);
                Iterator A0s = AnonymousClass7TF.A0s(A0g);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    Object key = A1J.getKey();
                    Iterable<Number> iterable = (Iterable) A1J.getValue();
                    LinkedHashMap A0x = DbS.A0x(C21055XCg.A00(iterable));
                    for (Number number : iterable) {
                        A0x.put(C51968G9o.A0v(number), C51968G9o.A0v(number));
                    }
                    A08.put(key, 0Yt.A03(A0x));
                }
                linkedHashMap2 = 0Yt.A03(A08);
            } else {
                linkedHashMap2 = null;
            }
            C21053XCe.A17(A0e, linkedHashMap2);
            C21055XCg.A0m(A0e, A01);
            C21054XCf.A1D(A0e, A01);
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                arrayList2 = AnonymousClass7TF.A0p(A0f);
                Iterator it3 = A0f.iterator();
                while (it3.hasNext()) {
                    JTS.A1V(arrayList2, it3);
                }
            } else {
                arrayList2 = null;
            }
            A0e.AAe("tagged_user_ids", arrayList2);
            C21055XCg.A17(A0e, A01);
            0j9 r2 = C271774jZ.A5S;
            A0e.A9F("media_owner_id", C51966G9m.A13(r2, A01));
            C21054XCf.A0l(A0e, A01);
            A0e.A9F("main_feed_carousel_starting_media_id", C21054XCf.A06(C271774jZ.A5A, A01));
            C21055XCg.A16(A0e, A01);
            C21054XCf.A0L(A0e, A01);
            C21054XCf.A0u(A0e, A01);
            C21054XCf.A0p(A0e, A01);
            A0e.A9F("counter_id", C21054XCf.A06(C271774jZ.A1g, A01));
            A0e.A9F("counter_sid", C21054XCf.A06(C271774jZ.A1h, A01));
            C21053XCe.A0s(A0e, C271774jZ.A3P, A01);
            C21055XCg.A11(A0e, A01);
            A0e.A9F("connection_id", C21054XCf.A06(C271774jZ.A1X, A01));
            C21054XCf.A14(A0e, A01);
            C21055XCg.A0n(A0e, A01);
            C21054XCf.A16(A0e, A01);
            C21054XCf.A0Z(A0e, A01);
            C21054XCf.A0v(A0e, A01);
            C21053XCe.A0p(A0e, G9t.A0k(AnonymousClass7TF.A1Y(A01.A01(C271774jZ.A4M), true) ? 1 : 0));
            C21054XCf.A0V(A0e, A01);
            ArrayList arrayList4 = (ArrayList) A01.A01(C271774jZ.A2I);
            if (arrayList4 != null) {
                ArrayList A1D = AnonymousClass7TE.A1D(arrayList4);
                ArrayList A0p3 = AnonymousClass7TF.A0p(A1D);
                Iterator it4 = A1D.iterator();
                while (it4.hasNext()) {
                    C21055XCg.A1V(A0p3, it4);
                }
                linkedHashMap3 = C21053XCe.A0i(A0p3);
            } else {
                linkedHashMap3 = null;
            }
            A0e.A9H("drops_product_ids", linkedHashMap3);
            C21054XCf.A0d(A0e, A01);
            C21055XCg.A0d(A0e, r20, A01, C51966G9m.A13(C271774jZ.A5K, A01), "media_id");
            C21055XCg.A1D(A0e, A01, 1L, "is_prod");
            C21055XCg.A0k(A0e, A01);
            C21055XCg.A1A(A0e, A01, C21054XCf.A06(C271774jZ.A6i, A01), "product_id");
            C21055XCg.A0f(A0e, r12, A01);
            C21054XCf.A0t(A0e, A01);
            A0e.A9F("author_id", C21054XCf.A06(C271774jZ.A0Y, A01));
            A0e.AAe("c_pk_list", (List) null);
            C21055XCg.A1E(A0e, A01, C21055XCg.A0M(A0e, r11, r6, A01), "ad_id_long");
            C21054XCf.A0a(A0e, A01);
            A0e.AAJ("topic_cluster_status", (String) null);
            A0e.A9H("client_ad_creative_optimization_output", (Map) null);
            C21056XCh.A0G(A0e, A01, C21054XCf.A06(C271774jZ.A5t, A01));
            A0e.A9F("hscroll_seed_ad_id", C21054XCf.A06(C271774jZ.A3b, A01));
            C21054XCf.A19(A0e, A01);
            C21054XCf.A10(A0e, A01);
            C21054XCf.A0N(A0e, A01);
            Integer num = AnonymousClass05K.A0j;
            C21054XCf.A1Y(A0e, A01, num, "container_module");
            C21054XCf.A1Y(A0e, A01, num, "contextual_ads_category");
            A0e.A9F("first_hscroll_item_ad_id", C21054XCf.A06(C271774jZ.A2u, A01));
            A0e.A9F("seed_ad_id", C21054XCf.A06(C271774jZ.A7q, A01));
            A0e.A9F("upcoming_event_id", C21054XCf.A06(C271774jZ.A9Y, A01));
            A0e.A9F("media_owner_id_long", C51966G9m.A13(r2, A01));
            A0e.A9F("recs_ix", C21054XCf.A05(r192, "recs_ix"));
            C21055XCg.A0y(A0e, A01);
            A0e.AAK((0bb) null, "multi_ads_extra");
            C21054XCf.A0B(A0e, A01);
            A0e.A7p(AnonymousClass000.A00(315), Pxi.A0R(A01.A01(C271774jZ.A4f), RealtimeSubscription.GRAPHQL_MQTT_VERSION));
            C21054XCf.A0G(A0e, A01);
            C21054XCf.A1H(A0e, A01);
            0jB A012 = A01.A01(C271774jZ.A81);
            if (A012 != null) {
                0xF A00 = A012.A00();
                r5 = new 0bb();
                String A1C2 = C51966G9m.A1C(r10, A012);
                if (A1C2 == null || (A0n = 00y.A0n(10, A1C2)) == null) {
                    j = -1;
                } else {
                    j = A0n.longValue();
                }
                C21053XCe.A1B(r5, "merchant_id", j);
                AbstractCollection A0d2 = C21053XCe.A0d(r82, A012);
                if (A0d2 != null) {
                    ArrayList A0p4 = AnonymousClass7TF.A0p(A0d2);
                    Iterator it5 = A0d2.iterator();
                    while (it5.hasNext()) {
                        C21054XCf.A1b(A0p4, it5);
                    }
                    arrayList3 = AnonymousClass7TE.A1D(00k.A0X(A0p4));
                } else {
                    arrayList3 = null;
                }
                r5.A07("product_ids", arrayList3);
                String A05 = A00.A05("shopping_sticker_id");
                if (A05 == null) {
                    A05 = "";
                }
                r5.A06("shopping_sticker_id", A05);
            }
            A0e.AAK(r5, "shopping_sticker_info");
            C21054XCf.A09(A0e, A01);
            A0e.Cgf();
        }
    }
}
