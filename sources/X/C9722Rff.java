package X;

import java.util.Iterator;

/* renamed from: X.Rff  reason: case insensitive filesystem */
public abstract class C9722Rff {
    public static Object A00(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
