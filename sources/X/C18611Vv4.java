package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Vv4  reason: case insensitive filesystem */
public final class C18611Vv4 {
    public final ConcurrentMap A00 = new ConcurrentHashMap();
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C18611Vv4(UserSession userSession, String str, String str2, String str3, String str4) {
        DbW.A1N(userSession, 1, str4);
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A05 = str4;
    }

    public static final void A00(C18611Vv4 vv4, String str, int i) {
        ConcurrentMap concurrentMap = vv4.A00;
        Integer valueOf = Integer.valueOf(i);
        C14441TwP twP = new C14441TwP(vv4.A01, 32318480);
        twP.A00 = System.currentTimeMillis();
        twP.A01(str, (String) null);
        twP.A00("search_session_id", vv4.A03);
        twP.A00("serp_session_id", vv4.A04);
        twP.A00("tab_type", vv4.A05);
        twP.A03.put("page_count", valueOf);
        concurrentMap.put(valueOf, twP);
    }

    public final void A01() {
        ConcurrentMap concurrentMap = this.A00;
        for (Object next : 00k.A0a(concurrentMap.keySet())) {
            0qQ.A0A(next);
            C14441TwP twP = (C14441TwP) concurrentMap.get(next);
            if (twP != null) {
                twP.A01("SERP_EXIT_NAVIGATION", (String) null);
                twP.A02(4);
            }
            concurrentMap.remove(next);
        }
    }

    public final void A02(int i) {
        ConcurrentMap concurrentMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        C14441TwP twP = (C14441TwP) concurrentMap.get(valueOf);
        if (twP != null) {
            twP.A01("SERP_RESULTS_DISPLAYED", (String) null);
            twP.A02(2);
        }
        concurrentMap.remove(valueOf);
    }
}
