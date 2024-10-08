package X;

import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.ReverseOrdering;
import java.util.Comparator;

/* renamed from: X.4Qt  reason: invalid class name and case insensitive filesystem */
public abstract class C264654Qt implements Comparator {
    public int compare(Object obj, Object obj2) {
        return ((ComparatorOrdering) this).comparator.compare(obj, obj2);
    }

    public static C264654Qt A00(Comparator comparator) {
        if (comparator instanceof C264654Qt) {
            return (C264654Qt) comparator;
        }
        return new ComparatorOrdering(comparator);
    }

    public C264654Qt A01() {
        return new ReverseOrdering(this);
    }
}
