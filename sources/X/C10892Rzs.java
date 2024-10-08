package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.Rzs  reason: case insensitive filesystem */
public final class C10892Rzs {
    public final String A00(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                A1A.append(Pxj.A0e(next, next));
                while (it.hasNext()) {
                    A1A.append("\n");
                    Object next2 = it.next();
                    A1A.append(Pxj.A0e(next2, next2));
                }
            }
            return A1A.toString();
        } catch (IOException e) {
            throw Pxe.A0e(e);
        }
    }
}
