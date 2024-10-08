package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Rfa  reason: case insensitive filesystem */
public abstract class C9717Rfa {
    public static boolean A00(Collection collection, Set set) {
        boolean z;
        collection.getClass();
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            z = false;
            for (Object remove : collection) {
                z |= set.remove(remove);
            }
        } else {
            Iterator it = set.iterator();
            z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
