package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.Ktb  reason: case insensitive filesystem */
public abstract class C63230Ktb {
    public static final LinkedHashSet A00(Set set, Set set2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(set.size() + set2.size());
        Iterator it = set.iterator();
        while (true) {
            if (it.hasNext()) {
                linkedHashSet.add(it.next());
                if (linkedHashSet.size() == 50) {
                    break;
                }
            } else {
                for (Object add : set2) {
                    linkedHashSet.add(add);
                    if (linkedHashSet.size() == 50) {
                        return linkedHashSet;
                    }
                }
            }
        }
        return linkedHashSet;
    }
}
