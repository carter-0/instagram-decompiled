package X;

import java.util.Iterator;
import java.util.List;

public abstract class SA7 {
    public static Object A00(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return C66582MXn.A0r(list);
            }
            throw Pxe.A1C();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static String A01(Iterable iterable) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('[');
        boolean z = true;
        for (Object append : iterable) {
            if (!z) {
                Pxe.A1Y(A1A);
            }
            z = false;
            A1A.append(append);
        }
        return Pxg.A0w(A1A);
    }
}
