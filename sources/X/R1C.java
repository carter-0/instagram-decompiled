package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public final class R1C<E> extends QzX<E> implements SortedSet<E> {
    public final Comparator comparator() {
        return ((SortedSet) this.A01).comparator();
    }

    public final Object first() {
        Iterator it = this.A01.iterator();
        1UV r2 = this.A00;
        it.getClass();
        r2.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (r2.apply(next)) {
                return next;
            }
        }
        throw Pxe.A1C();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.SortedSet, X.TRe] */
    public final SortedSet headSet(Object obj) {
        return new C13238TRe(this.A00, ((SortedSet) this.A01).headSet(obj));
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.A01;
        while (true) {
            Object last = sortedSet.last();
            if (this.A00.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.SortedSet, X.TRe] */
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C13238TRe(this.A00, ((SortedSet) this.A01).subSet(obj, obj2));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.SortedSet, X.TRe] */
    public final SortedSet tailSet(Object obj) {
        return new C13238TRe(this.A00, ((SortedSet) this.A01).tailSet(obj));
    }
}
