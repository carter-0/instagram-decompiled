package X;

import java.util.Comparator;

/* renamed from: X.Ijo  reason: case insensitive filesystem */
public final class C57995Ijo implements Comparator {
    public final int compare(Object obj, Object obj2) {
        int i;
        C233472vm r0 = (C233472vm) ((C376489Ie) obj).A04;
        int i2 = -1;
        if (r0 != null) {
            i = r0.A09();
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        C233472vm r02 = (C233472vm) ((C376489Ie) obj2).A04;
        if (r02 != null) {
            i2 = r02.A09();
        }
        return 29b.A00(valueOf, Integer.valueOf(i2));
    }
}
