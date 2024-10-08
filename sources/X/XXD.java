package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class XXD {
    public static final void A00(0wc r8, C254523sc r9) {
        Long l;
        ArrayList arrayList;
        ArrayList arrayList2;
        0Aj A0e = AnonymousClass7TE.A0e(r8, AnonymousClass000.A00(3376));
        0jB A01 = r9.A01();
        if (A0e.isSampled()) {
            String A1C = C51966G9m.A1C(C271774jZ.A5I, A01);
            String str = "";
            if (A1C == null) {
                A1C = str;
            }
            C51965G9l.A1I(A0e, A1C);
            long j = 0;
            JTQ.A0z(A0e, DbY.A04(C21053XCe.A0b(C271774jZ.A0Z, A01)));
            String A1C2 = C51966G9m.A1C(C271774jZ.A2v, A01);
            if (A1C2 == null) {
                A1C2 = str;
            }
            A0e.AAJ("follow_status", A1C2);
            A0e.A9F("m_t", Long.valueOf(DbY.A04(C21053XCe.A0b(C271774jZ.A5a, A01))));
            A0e.A9F("m_ts", Long.valueOf(DbY.A04(C21053XCe.A0b(C271774jZ.A8x, A01))));
            String A1C3 = C51966G9m.A1C(C271774jZ.A8A, A01);
            if (A1C3 != null) {
                str = A1C3;
            }
            A0e.AAJ("source_of_action", str);
            C21054XCf.A0M(A0e, A01);
            C21054XCf.A1T(A0e, A01);
            C21055XCg.A1D(A0e, A01, C51966G9m.A13(C271774jZ.A11, A01), "carousel_media_id_int");
            C21053XCe.A12(A0e, A01);
            C21053XCe.A0z(A0e, A01);
            C21054XCf.A0f(A0e, A01);
            C21054XCf.A0J(A0e, A01);
            C21055XCg.A1G(A0e, A01, "ranking_session_id", C51966G9m.A1C(C271774jZ.A6q, A01));
            Number A0b = C21053XCe.A0b(C271774jZ.A2P, A01);
            if (A0b != null) {
                l = Long.valueOf((long) A0b.doubleValue());
            } else {
                l = null;
            }
            A0e.A9F("elapsed_time_since_last_item", l);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A0D(A0e, A01);
            C21054XCf.A0K(A0e, A01);
            C21054XCf.A0i(A0e, A01);
            C21054XCf.A1K(A0e, A01);
            C21054XCf.A14(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            C21054XCf.A0o(A0e, A01);
            C21054XCf.A1I(A0e, A01);
            C21054XCf.A0F(A0e, A01);
            C21054XCf.A12(A0e, A01);
            C21055XCg.A0o(A0e, A01);
            AbstractCollection A0f = C21053XCe.A0f(A01);
            if (A0f != null) {
                arrayList = AnonymousClass7TF.A0p(A0f);
                Iterator it = A0f.iterator();
                while (it.hasNext()) {
                    JTS.A1V(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A0e.AAe("tagged_user_ids", arrayList);
            C21053XCe.A0w(A0e, C271774jZ.A12, A01);
            C21054XCf.A0W(A0e, A01);
            C21054XCf.A1B(A0e, A01);
            C21054XCf.A1M(A0e, A01);
            A0e.A9F("entity_page_id", C21054XCf.A06(C271774jZ.A2b, A01));
            C21053XCe.A11(A0e, A01);
            C21054XCf.A0B(A0e, A01);
            C21054XCf.A1W(A0e, A01);
            C21054XCf.A18(A0e, A01);
            C21055XCg.A0x(A0e, A01);
            C21055XCg.A0y(A0e, A01);
            C21055XCg.A11(A0e, A01);
            C21053XCe.A0p(A0e, G9t.A0k(0qQ.A0K(A01.A01(C271774jZ.A4M), true) ? 1 : 0));
            C21054XCf.A1V(A0e, A01);
            A0e.A9F("main_feed_carousel_starting_media_id", C21054XCf.A06(C271774jZ.A5A, A01));
            C21054XCf.A0s(A0e, A01);
            C21055XCg.A0j(A0e, A01);
            A0e.A9F("normalized_feed_position", C51966G9m.A13(C271774jZ.A68, A01));
            if (0qQ.A0K(A01.A01(C271774jZ.A41), true)) {
                j = 1;
            }
            A0e.A9F("is_checkout_enabled", Long.valueOf(j));
            C21054XCf.A0A(A0e, A01);
            C21053XCe.A13(A0e, A01);
            A0e.A9F("merchant_id", C21054XCf.A06(C271774jZ.A5e, A01));
            AbstractCollection A0e2 = C21053XCe.A0e(A01);
            if (A0e2 != null) {
                arrayList2 = AnonymousClass7TF.A0p(A0e2);
                Iterator it2 = A0e2.iterator();
                while (it2.hasNext()) {
                    JTS.A1V(arrayList2, it2);
                }
            } else {
                arrayList2 = null;
            }
            A0e.AAe("product_ids", arrayList2);
            C21053XCe.A17(A0e, (Map) A01.A01(C271774jZ.A6l));
            C21054XCf.A0x(A0e, A01);
            C21053XCe.A0v(A0e, C271774jZ.A0C, A01);
            C21054XCf.A0q(A0e, A01);
            A0e.AAe("sponsor_tag_ids", (List) C21055XCg.A0I(A0e, A01));
            C21054XCf.A0e(A0e, A01);
            C21054XCf.A0y(A0e, A01);
            C21055XCg.A17(A0e, A01);
            A0e.AAJ("rank_token", C51966G9m.A1C(C271774jZ.A6r, A01));
            A0e.AAJ("search_session_id", C51966G9m.A1C(C271774jZ.A7p, A01));
            A0e.AAJ("query_text", C51966G9m.A1C(C271774jZ.A6n, A01));
            C21054XCf.A1P(A0e, A01);
            0bb r1 = new 0bb();
            r1.A06("search_session_id", (String) null);
            r1.A06("serp_session_id", (String) null);
            r1.A06("query_text", (String) null);
            r1.A06("rank_token", (String) null);
            A0e.AAK(r1, "search_context");
            A0e.AAJ(AnonymousClass000.A00(265), C324716zm.A00());
            A0e.Cgf();
        }
    }
}
