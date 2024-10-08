package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;
import java.util.Map;

public abstract class HVE {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.1qK, java.lang.Object] */
    public static final void A00(Context context, UserSession userSession, JPO jpo, 1Xj r19, AnonymousClass4DU r20, String str, String str2, String str3, int i, boolean z, boolean z2) {
        C243363Yl r9;
        String str4;
        Long l;
        Long l2;
        0bb r3;
        Context context2 = context;
        AnonymousClass4DU r6 = r20;
        DbW.A1O(context2, 4, r6);
        if (z) {
            r9 = C243363Yl.LIKED;
        } else {
            r9 = C243363Yl.NOT_LIKED;
        }
        UserSession userSession2 = userSession;
        AnonymousClass1Nd.A00(userSession2).A00(new Object());
        1Xj r10 = r19;
        C54994HaR.A00(userSession2, r10.A1a(), r9, r10);
        Integer num = AnonymousClass05K.A00;
        int i2 = i;
        Integer valueOf = Integer.valueOf(i2);
        C56622I4z.A03(context2, r6, userSession2, jpo, r9, r10, (SearchContext) null, num, valueOf, valueOf, C51967G9n.A0j(), (Long) null, str, (String) null, (Map) null, false, z2);
        C243363Yl r2 = C243363Yl.LIKED;
        if (r9 == r2) {
            str4 = "like";
        } else {
            str4 = "unlike";
        }
        C254523sc A0c = C51967G9n.A0c(userSession2, r10, r6, str4);
        A0c.A09(i2);
        A0c.A6y = "button";
        A0c.A6Y = r10.A0C.BjE();
        if (str2 != null) {
            l = C51971G9r.A0n(0, 1Xv.A06(str2));
        } else {
            l = null;
        }
        A0c.A3K = l;
        if (str3 != null) {
            l2 = C51971G9r.A0n(0, 1Xv.A06(str3));
        } else {
            l2 = null;
        }
        A0c.A3J = l2;
        0wc A01 = AnonymousClass0kN.A01(r6, userSession2);
        if (HVN.A00(r10, r6)) {
            if (r9 == r2) {
                XX1.A00(A01, A0c, r6);
            } else {
                XX7.A00(A01, A0c, r6);
            }
        } else if (r9 == r2) {
            0Aj A0e = AnonymousClass7TE.A0e(A01, "instagram_organic_like");
            0jB A012 = A0c.A01();
            if (A0e.isSampled()) {
                String A1C = C51966G9m.A1C(C271774jZ.A5I, A012);
                if (A1C == null) {
                    A1C = "";
                }
                C51965G9l.A1I(A0e, A1C);
                C51965G9l.A1L(A0e, C51966G9m.A1C(C271774jZ.A9L, A012));
                A0e.AAJ("source_of_action", C51966G9m.A1C(C271774jZ.A8A, A012));
                A0e.AAJ("source_of_like", C51966G9m.A1C(C271774jZ.A8B, A012));
                C51965G9l.A1K(A0e, C51966G9m.A1C(C271774jZ.A60, A012));
                A0e.A9F("m_t", C51966G9m.A13(C271774jZ.A5a, A012));
                A0e.A9F("m_ts", C51966G9m.A13(C271774jZ.A8x, A012));
                A0e.A9F("m_ix", C51966G9m.A13(C271774jZ.A3m, A012));
                A0e.A9F("a_pk", C51966G9m.A13(C271774jZ.A0Z, A012));
                A0e.AAJ("follow_status", C51966G9m.A1C(C271774jZ.A2v, A012));
                A0e.AAJ("delivery_flags", C51966G9m.A1C(C271774jZ.A26, A012));
                A0e.AAJ(AnonymousClass000.A00(5178), C51966G9m.A1C(C271774jZ.A7c, A012));
                A0e.A7p("is_acp_delivered", (Boolean) A012.A01(C271774jZ.A3t));
                C51965G9l.A1Q(A0e, C51966G9m.A1C(C271774jZ.A6p, A012));
                A0e.A7p("production_build", (Boolean) A012.A01(C271774jZ.A2h));
                A0e.A9F("scans", C51966G9m.A13(C271774jZ.A1x, A012));
                A0e.A7p(C273654mx.A00(776), (Boolean) A012.A01(C271774jZ.A4O));
                A0e.AAJ("search_session_id", C51966G9m.A1C(C271774jZ.A7p, A012));
                A0e.AAJ("serp_session_id", C51966G9m.A1C(C271774jZ.A7v, A012));
                A0e.AAJ("query_text", C51966G9m.A1C(C271774jZ.A6n, A012));
                A0e.AAJ("rank_token", C51966G9m.A1C(C271774jZ.A6r, A012));
                HashMap hashMap = (HashMap) A012.A01(C271774jZ.A7o);
                if (hashMap != null) {
                    SearchContext A00 = C55137Hcl.A00(hashMap);
                    r3 = new 0bb();
                    r3.A06("search_session_id", A00.A05);
                    r3.A06("serp_session_id", A00.A06);
                    r3.A06("query_text", A00.A02);
                    r3.A06("rank_token", A00.A03);
                    r3.A06("click_id", A00.A00);
                } else {
                    r3 = null;
                }
                A0e.AAK(r3, "search_context");
                A0e.A9F("barcelona_source_reply_id", C51966G9m.A13(C271774jZ.A0b, A012));
                A0e.A9F("barcelona_source_quote_post_id", C51966G9m.A13(C271774jZ.A0a, A012));
                A0e.AAJ(AnonymousClass000.A00(265), C324716zm.A00());
                A0e.Cgf();
            }
        } else {
            XXE.A00(A01, A0c, r6);
        }
    }
}
