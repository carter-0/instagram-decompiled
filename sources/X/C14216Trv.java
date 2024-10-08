package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Trv  reason: case insensitive filesystem */
public final class C14216Trv {
    public final ConcurrentMap A00 = new ConcurrentHashMap();
    public final UserSession A01;

    public C14216Trv(UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A01 = userSession;
    }

    public final void A03(String str) {
        0qQ.A0B(str, 0);
        C14441TwP twP = (C14441TwP) this.A00.get(str);
        if (twP != null) {
            twP.A01("SEARCH_QUERY_REQUEST_COMPLETE", "query_fail");
        }
    }

    public final void A04(String str, String str2, int i, int i2, boolean z) {
        0qQ.A0B(str, 0);
        A00(this, str, str2, i, i2, z);
        A02(this, str, "SEARCH_QUERY_RESULTS_DISPLAYED", 2);
    }

    public static final void A00(C14216Trv trv, String str, String str2, int i, int i2, boolean z) {
        C14441TwP twP = (C14441TwP) trv.A00.get(str);
        if (twP != null) {
            twP.A00("rank_token", str2);
            Boolean valueOf = Boolean.valueOf(z);
            ConcurrentMap concurrentMap = twP.A03;
            concurrentMap.put("is_query_previously_cached", valueOf);
            C66580MXl.A1T("fetched_results_count", concurrentMap, i);
            C66580MXl.A1T("displayed_results_count", concurrentMap, i2);
        }
    }

    public static final void A01(C14216Trv trv, String str, String str2, String str3, String str4, int i, boolean z) {
        ConcurrentMap concurrentMap = trv.A00;
        if (!concurrentMap.containsKey(str)) {
            C14441TwP twP = new C14441TwP(trv.A01, 32309250);
            twP.A00 = System.currentTimeMillis();
            twP.A01(str2, (String) null);
            twP.A00("search_session_id", str3);
            twP.A00("tab_type", str4);
            Boolean valueOf = Boolean.valueOf(z);
            ConcurrentMap concurrentMap2 = twP.A03;
            concurrentMap2.put("is_null_state", valueOf);
            C66580MXl.A1T("page_count", concurrentMap2, i);
            concurrentMap.put(str, twP);
        }
    }

    public static final void A02(C14216Trv trv, String str, String str2, short s) {
        ConcurrentMap concurrentMap = trv.A00;
        C14441TwP twP = (C14441TwP) concurrentMap.get(str);
        if (twP != null) {
            twP.A01(str2, (String) null);
            twP.A02(s);
            concurrentMap.remove(str);
        }
    }
}
