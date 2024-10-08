package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Hra  reason: case insensitive filesystem */
public final class C56028Hra {
    public final 1Av A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public C56028Hra(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = 1Au.A00(userSession);
        List A18 = DbV.A18(this.A00.A01.C1q("feed_refresh_instructions"), ",");
        ArrayList A0r = AnonymousClass7TG.A0r(A18);
        Iterator it = A18.iterator();
        while (it.hasNext()) {
            List A182 = DbV.A18(AnonymousClass7TE.A18(it), ":");
            if (A182.size() == 2) {
                this.A01.put(A182.get(0), Integer.valueOf(Integer.parseInt(AnonymousClass7TE.A19(A182, 1))));
            }
            A0r.add(C60340gF.A00);
        }
    }

    public final void A01(Map map) {
        ConcurrentHashMap concurrentHashMap = this.A01;
        Set keySet = concurrentHashMap.keySet();
        0qQ.A07(keySet);
        Set<Object> A02 = 094.A02(map.keySet(), keySet);
        ArrayList A0v = DbS.A0v(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        boolean z = false;
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            int A0M = AnonymousClass7TE.A0M(A1J.getValue());
            Number number = (Number) concurrentHashMap.put(key, Integer.valueOf(A0M));
            if (number == null || number.intValue() != A0M) {
                z = true;
            }
            A0v.add(C60340gF.A00);
        }
        if (!A02.isEmpty()) {
            ArrayList A0r = AnonymousClass7TG.A0r(A02);
            for (Object remove : A02) {
                A0r.add(concurrentHashMap.remove(remove));
            }
        } else if (!z) {
            return;
        }
        1Av r5 = this.A00;
        ArrayList A0v2 = DbS.A0v(concurrentHashMap.size());
        Iterator A0s = AnonymousClass7TF.A0s(concurrentHashMap);
        while (A0s.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s);
            A0v2.add(002.A0G(DbT.A13(A1J2), ':', AnonymousClass7TE.A0M(A1J2.getValue())));
        }
        String A0z = DbT.A0z(",", A0v2, (0sP) null);
        0xa r2 = r5.A01;
        0xY AR4 = r2.AR4();
        AR4.ED3("feed_refresh_instructions");
        AR4.apply();
        0xY AR42 = r2.AR4();
        AR42.E5g("feed_refresh_instructions", A0z);
        AR42.apply();
    }

    public final Integer A00(1FI r4, boolean z) {
        String str;
        String str2;
        int ordinal = r4.ordinal();
        if (ordinal == 2) {
            str = "warm_start_refresh_timer_in_s";
        } else if (ordinal != 15) {
            return null;
        } else {
            str = "auto_refresh_timer_in_s";
        }
        ConcurrentHashMap concurrentHashMap = this.A01;
        if (z) {
            str2 = "on_peak_";
        } else {
            str2 = "";
        }
        return (Integer) concurrentHashMap.get(002.A0R(str2, str));
    }
}
