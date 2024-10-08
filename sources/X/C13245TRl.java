package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: X.TRl  reason: case insensitive filesystem */
public abstract class C13245TRl extends AbstractCollection implements Serializable {
    public static final Object[] A00 = Pxe.A1b();

    public Object[] A06() {
        return null;
    }

    public abstract boolean A07();

    public abstract int A08(Object[] objArr, int i);

    public abstract C8553Qwr A09();

    public abstract boolean contains(Object obj);

    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public int A04() {
        throw C66580MXl.A11();
    }

    public int A05() {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final void clear() {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw C66580MXl.A11();
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] A06 = A06();
            if (A06 != null) {
                return Arrays.copyOfRange(A06, A05(), A04(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        A08(objArr, 0);
        return objArr;
    }

    public final Object[] toArray() {
        return toArray(A00);
    }
}
