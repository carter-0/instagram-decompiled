package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.TRj  reason: case insensitive filesystem */
public abstract class C13243TRj extends AbstractCollection implements Serializable {
    public static final Object[] A00 = Pxe.A1b();

    public abstract boolean contains(Object obj);

    public final int A00() {
        if (this instanceof C8540Qwe) {
            return 0;
        }
        if (this instanceof C8534QwY) {
            C8534QwY qwY = (C8534QwY) this;
            return qwY.A02.A00() + qwY.A00;
        }
        throw C66580MXl.A11();
    }

    public final int A01(Object[] objArr) {
        C8535QwZ qwZ;
        if (this instanceof C8536Qwa) {
            qwZ = ((C8536Qwa) this).A00;
        } else if (this instanceof C8537Qwb) {
            C8537Qwb qwb = (C8537Qwb) this;
            qwZ = qwb.A00;
            if (qwZ == null) {
                qwZ = new C8533QwX(qwb);
                qwb.A00 = qwZ;
            }
        } else {
            C8535QwZ qwZ2 = (C8535QwZ) this;
            if (qwZ2 instanceof C8540Qwe) {
                C8540Qwe qwe = (C8540Qwe) qwZ2;
                Object[] objArr2 = qwe.A01;
                int i = qwe.A00;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                return i;
            }
            int size = qwZ2.size();
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = qwZ2.get(i2);
            }
            return size;
        }
        return qwZ.A01(objArr);
    }

    public final Object[] A02() {
        if (this instanceof C8540Qwe) {
            return ((C8540Qwe) this).A01;
        }
        if (this instanceof C8534QwY) {
            return ((C8534QwY) this).A02.A02();
        }
        return null;
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
        int A002;
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] A02 = A02();
            if (A02 == null) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            } else {
                int A003 = A00();
                if (this instanceof C8540Qwe) {
                    A002 = ((C8540Qwe) this).A00;
                } else if (this instanceof C8534QwY) {
                    C8534QwY qwY = (C8534QwY) this;
                    A002 = qwY.A02.A00() + qwY.A00 + qwY.A01;
                } else {
                    throw C66580MXl.A11();
                }
                return Arrays.copyOfRange(A02, A003, A002, objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        A01(objArr);
        return objArr;
    }

    public final Object[] toArray() {
        return toArray(A00);
    }
}
