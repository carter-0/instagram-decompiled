package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: X.TRk  reason: case insensitive filesystem */
public abstract class C13244TRk extends AbstractCollection implements Serializable {
    public static final Object[] A00 = Pxe.A1b();

    public abstract boolean contains(Object obj);

    public final int A03() {
        if (this instanceof C8453Quy) {
            return ((C8453Quy) this).A01.A03();
        }
        if (this instanceof C8452Qux) {
            return ((C8452Qux) this).A00;
        }
        if (this instanceof C8447Qus) {
            return ((C8447Qus) this).A00;
        }
        if (this instanceof C8445Quq) {
            C8445Quq quq = (C8445Quq) this;
            return quq.A02.A04() + quq.A00 + quq.A01;
        }
        throw C66580MXl.A11();
    }

    public final int A04() {
        if (this instanceof C8453Quy) {
            return ((C8453Quy) this).A01.A04();
        }
        if ((this instanceof C8452Qux) || (this instanceof C8447Qus)) {
            return 0;
        }
        if (this instanceof C8445Quq) {
            C8445Quq quq = (C8445Quq) this;
            return quq.A02.A04() + quq.A00;
        }
        throw C66580MXl.A11();
    }

    public final int A05(Object[] objArr) {
        Object[] objArr2;
        int i;
        if (this instanceof C8450Quv) {
            objArr[0] = ((C8450Quv) this).A00;
            return 1;
        } else if (this instanceof C8453Quy) {
            return ((C8453Quy) this).A01.A05(objArr);
        } else {
            if (this instanceof C8452Qux) {
                C8452Qux qux = (C8452Qux) this;
                objArr2 = qux.A01;
                i = qux.A00;
            } else if (this instanceof C8448Qut) {
                C8448Qut qut = (C8448Qut) this;
                if (qut instanceof C8447Qus) {
                    C8447Qus qus = (C8447Qus) qut;
                    objArr2 = qus.A01;
                    i = qus.A00;
                } else {
                    int size = qut.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        objArr[i2] = qut.get(i2);
                    }
                    return size;
                }
            } else {
                TM0 A06 = A06();
                int i3 = 0;
                while (A06.hasNext()) {
                    objArr[i3] = A06.next();
                    i3++;
                }
                return i3;
            }
            System.arraycopy(objArr2, 0, objArr, 0, i);
            return i;
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.Qv3, java.lang.Object, X.TM0] */
    public final TM0 A06() {
        C8448Qut A08;
        if (this instanceof C8450Quv) {
            Object obj = ((C8450Quv) this).A00;
            ? obj2 = new Object();
            obj2.A00 = obj;
            return obj2;
        }
        if (this instanceof C8453Quy) {
            A08 = ((C8453Quy) this).A01;
        } else if ((this instanceof C8452Qux) || (this instanceof C8451Quw)) {
            A08 = ((C8443Quo) this).A08();
        } else {
            A08 = (C8448Qut) this;
        }
        return A08.listIterator(0);
    }

    public final Object[] A07() {
        if (this instanceof C8453Quy) {
            return ((C8453Quy) this).A01.A07();
        }
        if (this instanceof C8452Qux) {
            return ((C8452Qux) this).A01;
        }
        if (this instanceof C8447Qus) {
            return ((C8447Qus) this).A01;
        }
        if (this instanceof C8445Quq) {
            return ((C8445Quq) this).A02.A07();
        }
        return null;
    }

    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
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
            Object[] A07 = A07();
            if (A07 != null) {
                return Arrays.copyOfRange(A07, A04(), A03(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        A05(objArr);
        return objArr;
    }

    public final Object[] toArray() {
        return toArray(A00);
    }
}
