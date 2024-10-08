package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.8s1  reason: invalid class name and case insensitive filesystem */
public final class C368068s1 {
    public final List A00(Set set) {
        0qQ.A0B(set, 0);
        List list = C368118s6.A03;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (set.contains(((C368148s9) next).A04)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
