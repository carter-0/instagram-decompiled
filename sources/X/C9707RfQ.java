package X;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: X.RfQ  reason: case insensitive filesystem */
public abstract class C9707RfQ {
    public static boolean A00(Iterable iterable, Comparator comparator) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = C8456Qv1.A00;
            }
        } else if (!(iterable instanceof C13973Tmb)) {
            return false;
        } else {
            obj = ((C8453Quy) ((C13973Tmb) iterable)).A02;
        }
        return comparator.equals(obj);
    }
}
