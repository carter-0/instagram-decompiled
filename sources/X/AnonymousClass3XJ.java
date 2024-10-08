package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3XJ  reason: invalid class name */
public final class AnonymousClass3XJ {
    public static final void A00(2TR r5, AnonymousClass3XJ r6, Exception exc, String str) {
        Iterator it = r5.A0s.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            2Vz r2 = (2Vz) it.next();
            2V1 r1 = r2.A04;
            if (0qQ.A0K(r1.A08(), str)) {
                2Vb.A01(r2.A03, r1, exc);
                break;
            }
        }
        int size = r5.A0f.size();
        for (int i = 0; i < size; i++) {
            2TR r22 = (2TR) r5.A0f.get(i);
            List list = r22.A0s;
            if (00p.A0k(str, ((2Vz) list.get(list.size() - 1)).A04.A08(), false)) {
                A00(r22, r6, exc, str);
            }
        }
    }

    public static final void A01(2VC r5) {
        Map map = r5.A08;
        if (!map.isEmpty()) {
            HashSet hashSet = r5.A03;
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!hashSet.contains(next)) {
                    map.remove(next);
                }
            }
        }
    }
}
