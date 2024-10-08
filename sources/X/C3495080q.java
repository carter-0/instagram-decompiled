package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.80q  reason: invalid class name and case insensitive filesystem */
public abstract class C3495080q {
    public static final Map A00(Map map, Set set, boolean z) {
        HashSet hashSet;
        if (map == null) {
            map = new HashMap();
        }
        for (Object next : set) {
            if (!map.containsKey(next)) {
                if (z) {
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        for (Object obj : (Set) entry.getValue()) {
                            if (next == obj) {
                                hashSet.add(key);
                            }
                        }
                    }
                } else {
                    hashSet = new HashSet(set);
                }
                map.put(next, hashSet);
            }
        }
        return map;
    }
}
