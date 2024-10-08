package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6IN  reason: invalid class name */
public final class AnonymousClass6IN implements Collection<Object>, C62650uo {
    public final Set A00 = new LinkedHashSet();

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.A00.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return 0q3.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return 0q3.A01(this, objArr);
    }

    public /* synthetic */ AnonymousClass6IN(Set set, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return this.A00.add(obj);
    }

    public final void clear() {
        this.A00.clear();
    }

    public final Iterator iterator() {
        return this.A00.iterator();
    }

    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        return this.A00.remove(collection);
    }

    public final boolean retainAll(Collection collection) {
        return this.A00.retainAll(collection);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public AnonymousClass6IN() {
    }
}
