package X;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7f5  reason: invalid class name and case insensitive filesystem */
public final class C336727f5 {
    public Set A00 = 0sl.A00;

    public final void A00(Map map, Map map2, int i, int i2) {
        0qQ.A0B(map, 0);
        0qQ.A0B(map2, 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        0sh it = new 2HY(i, i2).iterator();
        while (it.hasNext()) {
            Collection collection = (Collection) map.get(Integer.valueOf(it.A00()));
            if (collection != null) {
                linkedHashSet.addAll(collection);
            }
        }
        Set A0k = 00k.A0k(linkedHashSet);
        for (Object obj : 094.A02(this.A00, A0k)) {
            map2.get(obj);
        }
        this.A00 = A0k;
    }
}
