package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.QzB  reason: case insensitive filesystem */
public final class C8670QzB extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8670QzB(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, Set set) {
        super((C13240TRg) null, abstractMapBasedMultimap, obj, set);
        this.A00 = abstractMapBasedMultimap;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.AbstractCollection, X.QzB, X.TRg] */
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean A05 = C281945Ae.A05(collection, (Set) this.A00);
        if (!A05) {
            return A05;
        }
        int size2 = this.A00.size();
        this.A00.A00 += size2 - size;
        A02();
        return A05;
    }
}
