package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5uA  reason: invalid class name and case insensitive filesystem */
public final class C298865uA extends AbstractCollection<V> {
    public final /* synthetic */ MapMakerInternalMap A00;

    public C298865uA(MapMakerInternalMap mapMakerInternalMap) {
        this.A00 = mapMakerInternalMap;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new AnonymousClass58S(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }

    public final Object[] toArray(Object[] objArr) {
        ArrayList arrayList = new ArrayList(size());
        C11307SKv.A02(arrayList, iterator());
        return arrayList.toArray(objArr);
    }

    public final Object[] toArray() {
        ArrayList arrayList = new ArrayList(size());
        C11307SKv.A02(arrayList, iterator());
        return arrayList.toArray();
    }
}
