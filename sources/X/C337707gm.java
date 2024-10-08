package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7gm  reason: invalid class name and case insensitive filesystem */
public final class C337707gm {
    public Map A00 = new HashMap();
    public Map A01 = new HashMap();

    public static C337707gm A00(C337707gm r7) {
        C337707gm r6 = new C337707gm();
        Map map = r7.A00;
        if (!map.isEmpty()) {
            for (Object next : map.keySet()) {
                r6.A00.put(next, new ArrayList((Collection) map.get(next)));
            }
            Map map2 = r7.A01;
            for (Object next2 : map2.keySet()) {
                r6.A01.put(next2, new ArrayList((Collection) map2.get(next2)));
            }
        }
        return r6;
    }

    public static void A01(Map map, Map map2, String str) {
        Collection collection = (Collection) map2.get(str);
        List list = (List) map.remove(str);
        if (collection != null) {
            if (list != null) {
                list.removeAll(collection);
            } else {
                return;
            }
        } else if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            map.put(str, list);
        }
    }
}
