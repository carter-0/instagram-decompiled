package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8eW  reason: invalid class name and case insensitive filesystem */
public final class C360398eW implements Collection<C360378eU>, C62650uo {
    public final short[] A00;

    public final /* synthetic */ short[] A00() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
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
        short[] sArr = this.A00;
        if (!collection.isEmpty()) {
            for (Object next : collection) {
                if (!(next instanceof C360378eU)) {
                    return false;
                }
                short s = ((C360378eU) next).A00;
                int length = sArr.length;
                int i = 0;
                while (i < length) {
                    if (s != sArr[i]) {
                        i++;
                    } else if (i < 0) {
                        return false;
                    }
                }
                return false;
            }
        }
        return true;
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
        0qQ.A0B(objArr, 0);
        return 0q3.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C360378eU) {
            short s = ((C360378eU) obj).A00;
            short[] sArr = this.A00;
            int length = sArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (s != sArr[i]) {
                    i++;
                } else if (i < 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        short[] sArr = this.A00;
        if (!(obj instanceof C360398eW) || !0qQ.A0K(sArr, ((C360398eW) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final boolean isEmpty() {
        if (this.A00.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C41296Arc(this.A00);
    }

    public final /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public final String toString() {
        return 002.A0S("UShortArray(storage=", Arrays.toString(this.A00), ')');
    }

    public /* synthetic */ C360398eW(short[] sArr) {
        this.A00 = sArr;
    }
}
