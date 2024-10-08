package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractSetMultimap;
import com.google.common.collect.ImmutableEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: X.Qz7  reason: case insensitive filesystem */
public final class C8666Qz7 extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8666Qz7(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap navigableMap) {
        super(abstractMapBasedMultimap, navigableMap);
        this.A00 = abstractMapBasedMultimap;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.R0x] */
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.A00)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return A00(ceilingEntry);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.R0x] */
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.A00)).ceilingKey(obj);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Qz7, X.R0x] */
    public final NavigableMap descendingMap() {
        return new C8666Qz7(this.A00, ((NavigableMap) ((SortedMap) this.A00)).descendingMap());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.R0x] */
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.A00)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return A00(firstEntry);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.R0x] */
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.A00)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return A00(floorEntry);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.R0x] */
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.A00)).floorKey(obj);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Qz7, X.R0x] */
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C8666Qz7(this.A00, ((NavigableMap) ((SortedMap) this.A00)).headMap(obj, z));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.R0x] */
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.A00)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return A00(higherEntry);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.R0x] */
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.A00)).higherKey(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.R0x] */
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.A00)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return A00(lastEntry);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.R0x] */
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.A00)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return A00(lowerEntry);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.R0x] */
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.A00)).lowerKey(obj);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Qz7, X.R0x] */
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C8666Qz7(this.A00, ((NavigableMap) ((SortedMap) this.A00)).subMap(obj, z, obj2, z2));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Qz7, X.R0x] */
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C8666Qz7(this.A00, ((NavigableMap) ((SortedMap) this.A00)).tailMap(obj, z));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.Qz4] */
    public final /* bridge */ /* synthetic */ SortedSet A01() {
        return C8666Qz7.super.keySet();
    }

    public final ImmutableEntry A02(Iterator it) {
        Object unmodifiableList;
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry A1J = AnonymousClass7TE.A1J(it);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        Collection A08 = abstractMapBasedMultimap.A08();
        A08.addAll(Pxe.A18(A1J));
        it.remove();
        Object key = A1J.getKey();
        if (abstractMapBasedMultimap instanceof AbstractSetMultimap) {
            unmodifiableList = Collections.unmodifiableSet((Set) A08);
        } else {
            unmodifiableList = Collections.unmodifiableList((List) A08);
        }
        return new ImmutableEntry(key, unmodifiableList);
    }

    public final NavigableSet descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.Qz4] */
    public final /* bridge */ /* synthetic */ Set keySet() {
        return C8666Qz7.super.keySet();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Qz7, X.Qz4] */
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) C8666Qz7.super.keySet();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractMap, X.Qz7] */
    public final Map.Entry pollFirstEntry() {
        return A02(AnonymousClass7TF.A0s(this));
    }

    public final Map.Entry pollLastEntry() {
        return A02(descendingMap().entrySet().iterator());
    }
}
