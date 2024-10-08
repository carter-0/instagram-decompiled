package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class XX5 {
    public static final void A00(0wc r13, C254523sc r14, AnonymousClass4DU r15) {
        LinkedHashMap linkedHashMap;
        C263944Ny r8;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        0Aj A0e = AnonymousClass7TE.A0e(r13, AnonymousClass000.A00(1479));
        0jB A01 = r14.A01();
        if (A0e.isSampled()) {
            long j = 0;
            JTQ.A0z(A0e, DbY.A04(C21053XCe.A0b(C271774jZ.A0Z, A01)));
            String A1C = C51966G9m.A1C(C271774jZ.A2v, A01);
            String str = "";
            if (A1C == null) {
                A1C = str;
            }
            A0e.AAJ("follow_status", A1C);
            0j9 r7 = C271774jZ.A5I;
            String A1C2 = C51966G9m.A1C(r7, A01);
            if (A1C2 == null) {
                A1C2 = str;
            }
            C51965G9l.A1I(A0e, A1C2);
            A0e.A9F("m_t", Long.valueOf(DbY.A04(C21053XCe.A0b(C271774jZ.A5a, A01))));
            String A1C3 = C51966G9m.A1C(C271774jZ.A9L, A01);
            if (A1C3 != null) {
                str = A1C3;
            }
            A0e.AAJ("tracking_token", str);
            C21055XCg.A1G(A0e, A01, "source_of_action", C51966G9m.A1C(C271774jZ.A8A, A01));
            C21053XCe.A0v(A0e, C271774jZ.A0C, A01);
            C21055XCg.A0e(A0e, C271774jZ.A8x, A01);
            A0e.AAJ("save_item_type", C51966G9m.A1C(C271774jZ.A7k, A01));
            C21055XCg.A0z(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A0e(A0e, A01);
            C21055XCg.A1F(A0e, A01, "inventory_source", C51966G9m.A1C(C271774jZ.A3q, A01));
            C21054XCf.A1W(A0e, A01);
            C21053XCe.A12(A0e, A01);
            C21055XCg.A0i(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            0j9 r11 = C271774jZ.A12;
            C21053XCe.A0w(A0e, r11, A01);
            C21054XCf.A1J(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21055XCg.A0g(A0e, C271774jZ.A6S, A01);
            C21054XCf.A12(A0e, A01);
            C21055XCg.A0o(A0e, A01);
            C21054XCf.A0s(A0e, A01);
            C21054XCf.A0x(A0e, A01);
            C21055XCg.A0l(A0e, A01);
            C21055XCg.A1C(A0e, A01, C51966G9m.A13(C271774jZ.A4B, A01), "is_dark_mode");
            AbstractCollection abstractCollection = (AbstractCollection) C21055XCg.A0I(A0e, A01);
            Long l = null;
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
            C21054XCf.A1V(A0e, A01);
            C21053XCe.A0x(A0e, r11, A01);
            C21053XCe.A14(A0e, C21055XCg.A0L(A01));
            C21055XCg.A10(A0e, A01);
            String A1C4 = C51966G9m.A1C(C271774jZ.A5e, A01);
            if (A1C4 != null) {
                r8 = C263944Ny.A00(A1C4);
            } else {
                r8 = null;
            }
            A0e.AAE(r8, "merchant_id");
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0e2);
                Iterator it2 = A0e2.iterator();
                while (it2.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it2);
                    0qQ.A0B(A18, 0);
                    A0p2.add(00y.A0n(10, A18));
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
            C21054XCf.A1D(A0e, A01);
            C21055XCg.A0m(A0e, A01);
            C21055XCg.A17(A0e, A01);
            C21053XCe.A13(A0e, A01);
            A0e.A9F("main_feed_carousel_starting_media_id", C21054XCf.A06(C271774jZ.A5A, A01));
            C21054XCf.A0l(A0e, A01);
            C21054XCf.A0p(A0e, A01);
            A0e.A9F("counter_id", C21054XCf.A06(C271774jZ.A1g, A01));
            A0e.A9F("counter_sid", C21054XCf.A06(C271774jZ.A1h, A01));
            C21054XCf.A0L(A0e, A01);
            if (AnonymousClass7TF.A1Y(A01.A01(C271774jZ.A4M), true)) {
                j = 1;
            }
            C21053XCe.A0p(A0e, j);
            C21054XCf.A0u(A0e, A01);
            C21055XCg.A16(A0e, A01);
            C21054XCf.A0V(A0e, A01);
            C21053XCe.A0s(A0e, C271774jZ.A3P, A01);
            C21055XCg.A11(A0e, A01);
            ArrayList arrayList2 = (ArrayList) A01.A01(C271774jZ.A8j);
            if (arrayList2 != null) {
                ArrayList A1D = AnonymousClass7TE.A1D(arrayList2);
                ArrayList A0p3 = AnonymousClass7TF.A0p(A1D);
                Iterator it3 = A1D.iterator();
                while (it3.hasNext()) {
                    C21055XCg.A1X(A0p3, it3);
                }
                linkedHashMap3 = C21053XCe.A0i(A0p3);
            } else {
                linkedHashMap3 = null;
            }
            C21053XCe.A16(A0e, linkedHashMap3);
            C21054XCf.A14(A0e, A01);
            C21055XCg.A0n(A0e, A01);
            A0e.A9F("connection_id", C21054XCf.A06(C271774jZ.A1X, A01));
            ArrayList arrayList3 = (ArrayList) A01.A01(C271774jZ.A2I);
            if (arrayList3 != null) {
                ArrayList A1D2 = AnonymousClass7TE.A1D(arrayList3);
                ArrayList A0p4 = AnonymousClass7TF.A0p(A1D2);
                Iterator it4 = A1D2.iterator();
                while (it4.hasNext()) {
                    C21055XCg.A1V(A0p4, it4);
                }
                linkedHashMap4 = C21053XCe.A0i(A0p4);
            } else {
                linkedHashMap4 = null;
            }
            A0e.A9H("drops_product_ids", linkedHashMap4);
            C21054XCf.A16(A0e, A01);
            A0e.A7p(AnonymousClass000.A00(315), Pxi.A0R(A01.A01(C271774jZ.A4f), RealtimeSubscription.GRAPHQL_MQTT_VERSION));
            C21054XCf.A0t(A0e, A01);
            C21054XCf.A0G(A0e, A01);
            A0e.A9F("product_id", C21054XCf.A06(C271774jZ.A6i, A01));
            C21055XCg.A0d(A0e, r15, A01, C51966G9m.A13(C271774jZ.A5K, A01), "media_id");
            C21055XCg.A1D(A0e, A01, 1L, "is_prod");
            C21055XCg.A0k(A0e, A01);
            A0e.AAJ("m_pk_temp", C51966G9m.A1C(r7, A01));
            A0e.A9F("hscroll_seed_ad_id", C21054XCf.A06(C271774jZ.A3b, A01));
            C21055XCg.A19(A0e, A01, C21054XCf.A06(C271774jZ.A2u, A01));
            String A1C5 = C51966G9m.A1C(C271774jZ.A5t, A01);
            if (A1C5 != null) {
                l = 00y.A0n(10, A1C5);
            }
            A0e.A9F("multi_ads_first_ad_id", l);
            C21054XCf.A09(A0e, A01);
            A0e.Cgf();
        }
    }
}
