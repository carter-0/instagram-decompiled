package X;

import java.util.Iterator;
import java.util.List;

public final class SGQ {
    public static final SGQ A00 = new Object();

    public final int countBframe(List list) {
        0qQ.A0B(list, 0);
        Iterator it = list.iterator();
        int i = 0;
        long j = Long.MIN_VALUE;
        while (it.hasNext()) {
            long A0H = Pxg.A0H(it);
            if (A0H > j) {
                j = A0H;
            } else {
                i++;
            }
        }
        return i;
    }
}
