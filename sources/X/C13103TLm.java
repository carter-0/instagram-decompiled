package X;

import java.util.Comparator;

/* renamed from: X.TLm  reason: case insensitive filesystem */
public final /* synthetic */ class C13103TLm implements Comparator {
    public final /* synthetic */ 0sP[] A00;

    public /* synthetic */ C13103TLm(0sP[] r1) {
        this.A00 = r1;
    }

    public final int compare(Object obj, Object obj2) {
        0sP[] r4 = this.A00;
        0qQ.A0B(r4, 0);
        for (0sP r0 : r4) {
            int A002 = 29b.A00((Comparable) r0.invoke(obj), (Comparable) r0.invoke(obj2));
            if (A002 != 0) {
                return A002;
            }
        }
        return 0;
    }
}
