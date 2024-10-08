package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.6HC  reason: invalid class name */
public final class AnonymousClass6HC implements List<AnonymousClass6JH>, C62650uo {
    public final List A00 = new AnonymousClass6HD();

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsAll(Collection collection) {
        return this.A00.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return this.A00.iterator();
    }

    public final ListIterator listIterator() {
        return this.A00.listIterator();
    }

    public final ListIterator listIterator(int i) {
        return this.A00.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List subList(int i, int i2) {
        return this.A00.subList(i, i2);
    }

    public final Object[] toArray() {
        return 0q3.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return 0q3.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof AnonymousClass6JH)) {
            return false;
        }
        return this.A00.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof AnonymousClass6JH)) {
            return -1;
        }
        return this.A00.indexOf(obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof AnonymousClass6JH)) {
            return -1;
        }
        return this.A00.lastIndexOf(obj);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }
}
