package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3bi  reason: invalid class name and case insensitive filesystem */
public abstract class C244763bi {
    public static final void A02(Object obj, Object obj2, List list, List list2, List list3, List list4, Map map) {
        C244233ar r0;
        if (list == null || list.isEmpty()) {
            if (list2 != null) {
                list3.addAll(list2);
            }
        } else if (list2 == null || list2.isEmpty()) {
            list4.addAll(list);
        } else {
            HashMap hashMap = new HashMap(list2.size());
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                C244233ar r3 = (C244233ar) list2.get(i);
                Class CAe = r3.A00.CAe();
                if (!(map == null || (r0 = (C244233ar) map.get(CAe)) == null)) {
                    boolean Ete = r3.A00.Ete(r0.A01, r3.A01, obj, obj2);
                    hashMap.put(CAe, Boolean.valueOf(Ete));
                    if (!Ete) {
                    }
                }
                list3.add(r3);
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C244233ar r2 = (C244233ar) list.get(i2);
                Class CAe2 = r2.A00.CAe();
                if (!hashMap.containsKey(CAe2) || 0qQ.A0K(hashMap.get(CAe2), true)) {
                    list4.add(r2);
                }
            }
        }
    }

    public static final void A01(C244233ar r4, List list, Map map) {
        Class CAe = r4.A00.CAe();
        if (map.put(CAe, r4) != null) {
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    if (!0qQ.A0K(((C244233ar) list.get(size)).A00.CAe(), CAe)) {
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    } else {
                        list.remove(size);
                        break;
                    }
                }
            }
            throw new IllegalStateException("Binder Map and Binder List out of sync!");
        }
        list.add(r4);
    }

    public static final String A00(String str) {
        if (str.length() <= 127) {
            return str;
        }
        String substring = str.substring(0, 127);
        0qQ.A07(substring);
        return substring;
    }
}
