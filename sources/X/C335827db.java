package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7db  reason: invalid class name and case insensitive filesystem */
public abstract class C335827db {
    public static final C247733gp A00(1E6 r1, C65211bM r2) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r1, 1);
        return new C247733gp(r2.FDw(r1));
    }

    public static final List A01(1E6 r3, List list) {
        0qQ.A0B(r3, 1);
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A00(r3, (C65211bM) it.next()));
        }
        return arrayList;
    }
}
