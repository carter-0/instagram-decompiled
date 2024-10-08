package X;

import android.util.SparseArray;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class OND {
    public final SparseArray A00 = new SparseArray();

    public final LinkedHashSet A00(String str) {
        Collection collection;
        0qQ.A0B(str, 0);
        LinkedHashSet A0y = DbS.A0y();
        if (str.length() != 0) {
            Map map = (Map) this.A00.get(str.charAt(0));
            if (!(map == null || !map.containsKey(str) || (collection = (Collection) map.get(str)) == null)) {
                A0y.addAll(collection);
            }
        }
        return A0y;
    }

    public final LinkedHashSet A01(String str) {
        0qQ.A0B(str, 0);
        LinkedHashSet A0y = DbS.A0y();
        if (str.length() != 0) {
            Map map = (Map) this.A00.get(str.charAt(0));
            if (map != null) {
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    String A13 = DbT.A13(A1J);
                    Collection collection = (Collection) A1J.getValue();
                    0qQ.A0B(A13, 0);
                    if (A13.startsWith(str)) {
                        A0y.addAll(collection);
                    }
                }
            }
        }
        return A0y;
    }

    public final void A02(String str, Object obj) {
        char charAt = str.charAt(0);
        SparseArray sparseArray = this.A00;
        Map map = (Map) sparseArray.get(charAt);
        if (map == null) {
            map = AnonymousClass7TE.A1H();
            sparseArray.put(charAt, map);
        }
        Set set = (Set) map.get(str);
        if (set == null) {
            set = DbS.A0y();
            map.put(str, set);
        }
        set.add(obj);
    }
}
