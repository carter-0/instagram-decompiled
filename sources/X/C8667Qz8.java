package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* renamed from: X.Qz8  reason: case insensitive filesystem */
public final class C8667Qz8 extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8667Qz8(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap navigableMap) {
        super(abstractMapBasedMultimap, navigableMap);
        this.A00 = abstractMapBasedMultimap;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz8, X.R1F] */
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.A00)).ceilingKey(obj);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Qz8, X.R1F] */
    public final NavigableSet descendingSet() {
        return new C8667Qz8(this.A00, ((NavigableMap) ((SortedMap) this.A00)).descendingMap());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz8, X.R1F] */
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.A00)).floorKey(obj);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Qz8, X.R1F] */
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C8667Qz8(this.A00, ((NavigableMap) ((SortedMap) this.A00)).headMap(obj, z));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz8, X.R1F] */
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.A00)).higherKey(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz8, X.R1F] */
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.A00)).lowerKey(obj);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Qz8, X.R1F] */
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C8667Qz8(this.A00, ((NavigableMap) ((SortedMap) this.A00)).subMap(obj, z, obj2, z2));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Qz8, X.R1F] */
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C8667Qz8(this.A00, ((NavigableMap) ((SortedMap) this.A00)).tailMap(obj, z));
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractCollection, X.Qz8] */
    public final Object pollFirst() {
        Iterator it = iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }
}
