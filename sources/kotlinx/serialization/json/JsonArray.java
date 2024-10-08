package kotlinx.serialization.json;

import X.00k;
import X.0q3;
import X.0qQ;
import X.0sP;
import X.C255463uA;
import X.C62650uo;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonArraySerializer.class)
public final class JsonArray extends JsonElement implements List<JsonElement>, C62650uo {
    public static final Companion Companion = new Object();
    public final List A00;

    public final class Companion {
        public final C255463uA serializer() {
            return JsonArraySerializer.A01;
        }
    }

    public JsonArray(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

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
        0qQ.A0B(collection, 0);
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
        0qQ.A0B(objArr, 0);
        return 0q3.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        0qQ.A0B(obj, 0);
        return this.A00.contains(obj);
    }

    public final boolean equals(Object obj) {
        return 0qQ.A0K(this.A00, obj);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        0qQ.A0B(obj, 0);
        return this.A00.indexOf(obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        0qQ.A0B(obj, 0);
        return this.A00.lastIndexOf(obj);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public final String toString() {
        return 00k.A0P(",", "[", "]", this.A00, (0sP) null);
    }
}
