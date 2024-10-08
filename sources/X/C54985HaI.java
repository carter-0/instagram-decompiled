package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.HaI  reason: case insensitive filesystem */
public abstract class C54985HaI {
    public static final void A00(List list, List list2, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55727HmO hmO = (C55727HmO) it.next();
            if (0qQ.A0K(hmO.A01.name(), str)) {
                list2.add(hmO);
                list.remove(hmO);
                return;
            }
        }
    }
}
