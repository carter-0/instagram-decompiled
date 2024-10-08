package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8oC  reason: invalid class name and case insensitive filesystem */
public final class C366108oC implements C366088oA {
    public final ArrayList A00 = new ArrayList();

    public final void FK1(Long l) {
        long j;
        Iterator it = this.A00.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            C39704A5u a5u = (C39704A5u) next;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            List list = a5u.A02;
            ArrayList arrayList = new ArrayList();
            for (Object next2 : list) {
                if (((Number) next2).longValue() <= j) {
                    arrayList.add(next2);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = list.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((Number) it2.next()).longValue() != ((Number) 00k.A0K(arrayList)).longValue()) {
                        i++;
                    } else if (i >= 0) {
                        List list2 = a5u.A01;
                        if (i < list2.size()) {
                            C366728pZ.A01(a5u.A00, (float[]) list2.get(i));
                        }
                    }
                }
            }
        }
    }
}
