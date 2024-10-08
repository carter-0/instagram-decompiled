package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6gG  reason: invalid class name and case insensitive filesystem */
public final class C313326gG implements AnonymousClass0lh {
    public final UserSession A00;
    public final Map A01;
    public final Map A02;

    public C313326gG(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        Map linkedHashMap = new LinkedHashMap();
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36320541264257626L)) {
            linkedHashMap = Collections.synchronizedMap(linkedHashMap);
            0qQ.A07(linkedHashMap);
        }
        this.A01 = linkedHashMap;
        Map hashMap = new HashMap();
        if (182.A06(r4, this.A00, 36320541264257626L)) {
            hashMap = Collections.synchronizedMap(hashMap);
            0qQ.A07(hashMap);
        }
        this.A02 = hashMap;
    }

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        C17509VYn vYn = (C17509VYn) this.A02.remove(str);
        if (vYn != null) {
            V3Z v3z = vYn.A02;
            GVI gvi = v3z.A01;
            if (gvi != null) {
                gvi.A00();
            }
            v3z.A01 = null;
            v3z.A00 = null;
            C234502xy r1 = vYn.A01;
            r1.EHu(false);
            this.A01.put(str, r1);
        }
    }

    public final void A00() {
        Map map = this.A01;
        for (Map.Entry value : map.entrySet()) {
            ((C234502xy) value.getValue()).release();
        }
        map.clear();
    }

    public final void onSessionWillEnd() {
        A00();
    }
}
