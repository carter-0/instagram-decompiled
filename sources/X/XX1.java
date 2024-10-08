package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class XX1 {
    public static final void A00(0wc r6, C254523sc r7, AnonymousClass4DU r8) {
        String str;
        Long l;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        0Aj A0e = AnonymousClass7TE.A0e(r6, "instagram_ad_like");
        0jB A01 = r7.A01();
        if (A0e.isSampled()) {
            String A1C = C51966G9m.A1C(C271774jZ.A8A, A01);
            if (A1C == null) {
                A1C = "";
            }
            A0e.AAJ("source_of_action", A1C);
            C21054XCf.A0H(A0e, A01);
            C21054XCf.A0e(A0e, A01);
            C21054XCf.A1T(A0e, A01);
            C21054XCf.A0M(A0e, A01);
            ArrayList arrayList2 = (ArrayList) A01.A01(C271774jZ.A2q);
            0bb r2 = null;
            if (arrayList2 != null) {
                str = (String) 00k.A0O(arrayList2, 0);
            } else {
                str = null;
            }
            A0e.AAJ("feed_sticker_media_id", str);
            C21053XCe.A0t(A0e, C271774jZ.A5a, A01);
            A0e.A9F("m_ix", C51966G9m.A13(C271774jZ.A3m, A01));
            C21054XCf.A0a(A0e, A01);
            A0e.A9F("gap_to_last_ad", C51966G9m.A13(C271774jZ.A33, A01));
            C21054XCf.A0n(A0e, A01);
            C21054XCf.A0S(A0e, A01);
            C21054XCf.A1N(A0e, A01);
            C21055XCg.A1B(A0e, A01, C51966G9m.A13(C271774jZ.A14, A01), "carousel_opt_in_position");
            A0e.A9F("reel_gap_to_last_ad", C51966G9m.A13(C271774jZ.A7R, A01));
            A0e.A9F("reel_gap", C51966G9m.A13(C271774jZ.A7P, A01));
            A0e.A9H(AnonymousClass000.A00(1296), (Map) A01.A01(C271774jZ.A0q));
            A0e.A8D(AnonymousClass000.A00(1233), C21053XCe.A0Y(C271774jZ.A1M, A01));
            A0e.A8D("timespent", C21053XCe.A0Y(C271774jZ.A99, A01));
            A0e.A8D(AnonymousClass000.A00(1211), C21053XCe.A0Y(C271774jZ.A0o, A01));
            C21053XCe.A0v(A0e, C271774jZ.A0C, A01);
            C21053XCe.A0u(A0e, C271774jZ.A0Z, A01);
            A0e.AAJ("source_of_like", C51966G9m.A1C(C271774jZ.A8B, A01));
            C21055XCg.A0e(A0e, C271774jZ.A8x, A01);
            C21055XCg.A0z(A0e, A01);
            C21055XCg.A1F(A0e, A01, "release_channel", C51966G9m.A1C(C271774jZ.A7c, A01));
            C21054XCf.A1W(A0e, A01);
            C21055XCg.A0i(A0e, A01);
            C21053XCe.A12(A0e, A01);
            C21054XCf.A0W(A0e, A01);
            C21053XCe.A0w(A0e, C271774jZ.A12, A01);
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21055XCg.A0g(A0e, C271774jZ.A6S, A01);
            A0e.AAJ(C21058XCk.A00(), C51966G9m.A1C(C271774jZ.A7x, A01));
            C21054XCf.A1F(A0e, A01);
            C21055XCg.A1C(A0e, A01, C51966G9m.A13(C271774jZ.A4B, A01), "is_dark_mode");
            A0e.AAK((0bb) null, "location_info");
            C21053XCe.A0x(A0e, C271774jZ.A13, A01);
            C21054XCf.A0A(A0e, A01);
            String A1C2 = C51966G9m.A1C(C271774jZ.A5e, A01);
            if (A1C2 != null) {
                l = C263944Ny.A00(A1C2).A00;
            } else {
                l = null;
            }
            A0e.A9F("merchant_id", l);
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(A0e2);
                Iterator it = A0e2.iterator();
                while (it.hasNext()) {
                    C21054XCf.A1b(A0p, it);
                }
                arrayList = AnonymousClass7TE.A1D(00k.A0X(A0p));
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
                    A08.put(A1J.getKey(), 00k.A0U((Collection) A1J.getValue()));
                }
                linkedHashMap = 0Yt.A03(A08);
            } else {
                linkedHashMap = null;
            }
            C21053XCe.A17(A0e, linkedHashMap);
            C21053XCe.A13(A0e, A01);
            C21054XCf.A0s(A0e, A01);
            C21054XCf.A1V(A0e, A01);
            A0e.AAe("sponsor_tag_ids", (List) C21055XCg.A0I(A0e, A01));
            C21054XCf.A12(A0e, A01);
            C21055XCg.A0o(A0e, A01);
            A0e.A9F("normalized_feed_position", C51966G9m.A13(C271774jZ.A68, A01));
            C21055XCg.A0m(A0e, A01);
            C21054XCf.A0y(A0e, A01);
            C21054XCf.A1D(A0e, A01);
            C21054XCf.A0x(A0e, A01);
            A0e.A9F("reel_gap_to_last_netego", C51966G9m.A13(C271774jZ.A7S, A01));
            A0e.AAe("drops_product_ids", (List) A01.A01(C271774jZ.A2I));
            C21055XCg.A16(A0e, A01);
            C21054XCf.A0X(A0e, A01);
            C51969G9p.A19(A0e, r8);
            C21054XCf.A17(A0e, A01);
            C21054XCf.A1M(A0e, A01);
            C21054XCf.A1R(A0e, A01);
            A0e.A9F("reel_position", C51966G9m.A13(C271774jZ.A7U, A01));
            C21054XCf.A0f(A0e, A01);
            C21055XCg.A1D(A0e, A01, C51966G9m.A13(C271774jZ.A11, A01), "carousel_media_id_int");
            C21055XCg.A0t(A0e, A01);
            A0e.A9F("is_prod", 1L);
            C21054XCf.A0k(A0e, A01);
            C21055XCg.A1A(A0e, A01, C51966G9m.A13(C271774jZ.A6k, A01), "product_id");
            C21054XCf.A0R(A0e, A01);
            A0e.A9F("reel_size", C51966G9m.A13(C271774jZ.A7V, A01));
            C21054XCf.A0z(A0e, A01);
            C21055XCg.A15(A0e, A01);
            C21054XCf.A0g(A0e, A01);
            A0e.A9F("multi_ads_type", C51966G9m.A13(C271774jZ.A5w, A01));
            C21054XCf.A19(A0e, A01);
            A0e.A9F("position_in_multi_ads_unit", C51966G9m.A13(C271774jZ.A6Y, A01));
            A0e.A9F("multi_ads_first_ad_id", C21054XCf.A06(C271774jZ.A5t, A01));
            A0e.AAJ("intent_aware_ads_trigger_type", C51966G9m.A1C(C271774jZ.A3p, A01));
            0jB A012 = A01.A01(C271774jZ.A20);
            if (A012 != null) {
                r2 = new 0bb();
                C21055XCg.A1N(r2, A012);
                r2.A04("remaining_time", C21053XCe.A0Y(C271774jZ.A24, A012));
            }
            A0e.AAK(r2, AnonymousClass000.A00(279));
            C21054XCf.A09(A0e, A01);
            A0e.Cgf();
        }
    }
}
