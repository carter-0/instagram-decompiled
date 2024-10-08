package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8ed  reason: invalid class name and case insensitive filesystem */
public final class C360468ed implements Collection<C360448eb>, C62650uo {
    public final byte[] A00;

    public final /* synthetic */ byte[] A00() {
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
        byte[] bArr = this.A00;
        if (!collection.isEmpty()) {
            for (Object next : collection) {
                if (!(next instanceof C360448eb)) {
                    return false;
                }
                byte b = ((C360448eb) next).A00;
                int length = bArr.length;
                int i = 0;
                while (i < length) {
                    if (b != bArr[i]) {
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
        if (obj instanceof C360448eb) {
            byte b = ((C360448eb) obj).A00;
            byte[] bArr = this.A00;
            int length = bArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (b != bArr[i]) {
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
        byte[] bArr = this.A00;
        if (!(obj instanceof C360468ed) || !0qQ.A0K(bArr, ((C360468ed) obj).A00)) {
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
        return new C41293ArZ(this.A00);
    }

    public final /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public final String toString() {
        return 002.A0S("UByteArray(storage=", Arrays.toString(this.A00), ')');
    }

    public /* synthetic */ C360468ed(byte[] bArr) {
        this.A00 = bArr;
    }
}
