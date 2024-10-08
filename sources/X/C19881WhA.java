package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WhA  reason: case insensitive filesystem */
public final class C19881WhA implements Iterable, C62650uo {
    public final List A00 = new ArrayList();

    public final void A00(List list) {
        for (Object next : list) {
            0qQ.A0B(next, 0);
            JTR.A1T(next, this.A00);
        }
    }

    public final Iterator iterator() {
        return this.A00.iterator();
    }
}
