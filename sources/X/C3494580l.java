package X;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.80l  reason: invalid class name and case insensitive filesystem */
public final class C3494580l {
    public static final C3494580l A03 = new C3494580l(new LinkedHashMap(), new HashMap());
    public final LinkedHashMap A00;
    public final Set A01 = new HashSet();
    public final Map A02;

    public final LinkedHashSet A01(C358088aL r3) {
        0qQ.A0B(r3, 0);
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.A00.get(r3);
        if (linkedHashSet != null) {
            return linkedHashSet;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("camera tool not available: ");
        sb.append(r3);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean A03(C358088aL r5) {
        for (Object next : this.A00.values()) {
            0qQ.A07(next);
            Iterator it = ((AbstractCollection) next).iterator();
            0qQ.A07(it);
            while (true) {
                if (it.hasNext()) {
                    Object next2 = it.next();
                    0qQ.A07(next2);
                    if (next2 == r5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A04(C358088aL r4, C358088aL r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        Map map = this.A02;
        Set set = (Set) map.get(r4);
        Set set2 = (Set) map.get(r5);
        if (set == null || set2 == null || !set.contains(r5) || !set2.contains(r4)) {
            return true;
        }
        return false;
    }

    public final LinkedHashSet A00() {
        return new LinkedHashSet(this.A00.keySet());
    }

    public final void A02(Set set) {
        Set entrySet = this.A00.entrySet();
        0qQ.A07(entrySet);
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!set.contains(entry.getKey())) {
                it.remove();
            } else {
                Iterator it2 = ((AbstractCollection) entry.getValue()).iterator();
                0qQ.A07(it2);
                while (it2.hasNext()) {
                    Object next = it2.next();
                    0qQ.A07(next);
                    if (!set.contains(next)) {
                        it2.remove();
                    }
                }
            }
        }
    }

    public C3494580l(LinkedHashMap linkedHashMap, Map map) {
        this.A00 = linkedHashMap;
        this.A02 = map;
    }
}
