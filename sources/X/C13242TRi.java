package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.TRi  reason: case insensitive filesystem */
public abstract class C13242TRi extends AbstractCollection implements Serializable {
    public static final Object[] A00 = Pxe.A1b();

    public abstract boolean contains(Object obj);

    public final int A00() {
        if (this instanceof C8517QwD) {
            return 0;
        }
        if (this instanceof C8515QwB) {
            C8515QwB qwB = (C8515QwB) this;
            return qwB.A02.A00() + qwB.A00;
        }
        throw C66580MXl.A11();
    }

    public final int A01(Object[] objArr) {
        C8518QwE qwE;
        if (this instanceof C8519QwF) {
            qwE = ((C8519QwF) this).A00;
        } else if (this instanceof C8520QwG) {
            C8520QwG qwG = (C8520QwG) this;
            qwE = qwG.A00;
            if (qwE == null) {
                qwE = new C8514QwA(qwG);
                qwG.A00 = qwE;
            }
        } else {
            C8518QwE qwE2 = (C8518QwE) this;
            if (qwE2 instanceof C8517QwD) {
                C8517QwD qwD = (C8517QwD) qwE2;
                Object[] objArr2 = qwD.A01;
                int i = qwD.A00;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                return i;
            }
            int size = qwE2.size();
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = qwE2.get(i2);
            }
            return size;
        }
        return qwE.A01(objArr);
    }

    public final Object[] A02() {
        if (this instanceof C8517QwD) {
            return ((C8517QwD) this).A01;
        }
        if (this instanceof C8515QwB) {
            return ((C8515QwB) this).A02.A02();
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
                if (this instanceof C8517QwD) {
                    A002 = ((C8517QwD) this).A00;
                } else if (this instanceof C8515QwB) {
                    C8515QwB qwB = (C8515QwB) this;
                    A002 = qwB.A02.A00() + qwB.A00 + qwB.A01;
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
