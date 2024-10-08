package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.SKv  reason: case insensitive filesystem */
public abstract class C11307SKv {
    public static ArrayList A00(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        ArrayList arrayList = new ArrayList();
        A02(arrayList, it);
        return arrayList;
    }

    public static void A01(1UV r1, Iterator it) {
        r1.getClass();
        while (it.hasNext()) {
            if (r1.apply(it.next())) {
                it.remove();
            }
        }
    }

    public static boolean A02(Collection collection, Iterator it) {
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}
