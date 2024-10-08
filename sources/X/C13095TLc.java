package X;

import java.util.Comparator;

/* renamed from: X.TLc  reason: case insensitive filesystem */
public final class C13095TLc implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Q1O q1o = (Q1O) obj;
        Q1O q1o2 = (Q1O) obj2;
        Long l = q1o.A02;
        Long l2 = q1o2.A02;
        if (l.equals(l2)) {
            l2 = q1o2.A01;
            l = q1o.A01;
        }
        return l2.compareTo(l);
    }
}
