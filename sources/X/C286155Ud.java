package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* renamed from: X.5Ud  reason: invalid class name and case insensitive filesystem */
public final class C286155Ud implements Collection<C291785hs>, C62650uo {
    public static final C286155Ud A02 = new C286155Ud(0sn.A00);
    public final int A00;
    public final List A01;

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C286155Ud) && 0qQ.A0K(this.A01, ((C286155Ud) obj).A01));
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return 0q3.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return 0q3.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C291785hs)) {
            return false;
        }
        return this.A01.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.A01.containsAll(collection);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public final Iterator iterator() {
        return this.A01.iterator();
    }

    public final /* bridge */ int size() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocaleList(localeList=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C286155Ud(List list) {
        this.A01 = list;
        this.A00 = list.size();
    }
}
