package X;

import com.google.common.collect.NaturalOrdering;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: X.Rfz  reason: case insensitive filesystem */
public abstract class C9741Rfz {
    public static boolean A00(Iterable iterable, Comparator comparator) {
        Object comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = NaturalOrdering.A00;
            }
        } else if (!(iterable instanceof C13974Tmc)) {
            return false;
        } else {
            comparator2 = ((C13974Tmc) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
