package X;

import androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5Pw  reason: invalid class name and case insensitive filesystem */
public final class C285135Pw<T> implements Set<T>, C62650uo {
    public final 01p A00;

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object A04 : collection) {
                if (!this.A00.A04(A04)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final Iterator iterator() {
        return AnonymousClass2YZ.A03(new ScatterSetWrapper$iterator$1(this, (AnonymousClass4D7) null));
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
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

    public final boolean contains(Object obj) {
        return this.A00.A04(obj);
    }

    public final boolean isEmpty() {
        if (this.A00.A01 == 0) {
            return true;
        }
        return false;
    }

    public final /* bridge */ int size() {
        return this.A00.A01;
    }

    public C285135Pw(01p r1) {
        this.A00 = r1;
    }
}
