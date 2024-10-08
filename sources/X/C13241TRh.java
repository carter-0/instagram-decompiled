package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.TRh  reason: case insensitive filesystem */
public abstract class C13241TRh extends AbstractCollection implements Serializable {
    public static final Object[] A00 = Pxe.A1b();

    public abstract boolean contains(Object obj);

    public final int A00() {
        if (this instanceof C8498Qvu) {
            return 0;
        }
        if (this instanceof C8497Qvt) {
            C8497Qvt qvt = (C8497Qvt) this;
            return qvt.A02.A00() + qvt.A00;
        }
        throw C66580MXl.A11();
    }

    public final int A01(Object[] objArr) {
        C8499Qvv qvv;
        if (this instanceof C8504Qw0) {
            qvv = ((C8504Qw0) this).A00;
        } else if (this instanceof C8500Qvw) {
            C8500Qvw qvw = (C8500Qvw) this;
            qvv = qvw.A00;
            if (qvv == null) {
                qvv = new C8502Qvy(qvw);
                qvw.A00 = qvv;
            }
        } else {
            C8499Qvv qvv2 = (C8499Qvv) this;
            if (qvv2 instanceof C8498Qvu) {
                C8498Qvu qvu = (C8498Qvu) qvv2;
                Object[] objArr2 = qvu.A01;
                int i = qvu.A00;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                return i;
            }
            int size = qvv2.size();
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = qvv2.get(i2);
            }
            return size;
        }
        return qvv.A01(objArr);
    }

    public final Object[] A02() {
        if (this instanceof C8498Qvu) {
            return ((C8498Qvu) this).A01;
        }
        if (this instanceof C8497Qvt) {
            return ((C8497Qvt) this).A02.A02();
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
                if (this instanceof C8498Qvu) {
                    A002 = ((C8498Qvu) this).A00;
                } else if (this instanceof C8497Qvt) {
                    C8497Qvt qvt = (C8497Qvt) this;
                    A002 = qvt.A02.A00() + qvt.A00 + qvt.A01;
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
