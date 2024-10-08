package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.QzA  reason: case insensitive filesystem */
public class C8669QzA extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8669QzA(C13240TRg tRg, AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, List list) {
        super(tRg, abstractMapBasedMultimap, obj, list);
        this.A00 = abstractMapBasedMultimap;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.QzA, X.TRg] */
    public final void add(int i, Object obj) {
        A01();
        boolean isEmpty = this.A00.isEmpty();
        ((List) this.A00).add(i, obj);
        this.A00.A00++;
        if (isEmpty) {
            A00();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.AbstractCollection, X.QzA, X.TRg] */
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.A00).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.A00.size();
        this.A00.A00 += size2 - size;
        if (size != 0) {
            return addAll;
        }
        A00();
        return addAll;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QzA, X.TRg] */
    public final Object get(int i) {
        A01();
        return ((List) this.A00).get(i);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QzA, X.TRg] */
    public final int indexOf(Object obj) {
        A01();
        return ((List) this.A00).indexOf(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QzA, X.TRg] */
    public final int lastIndexOf(Object obj) {
        A01();
        return ((List) this.A00).lastIndexOf(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QzA, X.TRg] */
    public final ListIterator listIterator(int i) {
        A01();
        return new C8668Qz9(this, i);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.QzA, X.TRg] */
    public final Object remove(int i) {
        A01();
        Object remove = ((List) this.A00).remove(i);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        abstractMapBasedMultimap.A00--;
        A02();
        return remove;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QzA, X.TRg] */
    public final Object set(int i, Object obj) {
        A01();
        return ((List) this.A00).set(i, obj);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.QzA, X.TRg] */
    public final List subList(int i, int i2) {
        A01();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        Object obj = this.A02;
        List subList = ((List) this.A00).subList(i, i2);
        C13240TRg tRg = this.A01;
        if (tRg == null) {
            tRg = this;
        }
        if (subList instanceof RandomAccess) {
            return new C8669QzA(tRg, abstractMapBasedMultimap, obj, subList);
        }
        return new C8669QzA(tRg, abstractMapBasedMultimap, obj, subList);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QzA, X.TRg] */
    public final ListIterator listIterator() {
        A01();
        return new C8668Qz9(this);
    }
}
