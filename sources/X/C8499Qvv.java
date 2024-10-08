package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.Qvv  reason: case insensitive filesystem */
public abstract class C8499Qvv extends C13241TRh implements List, RandomAccess {
    public static final C8506Qw2 A00 = new C8505Qw1(C8498Qvu.A02, 0);

    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    boolean hasNext2 = it2.hasNext();
                    if (hasNext) {
                        if (!hasNext2 || ((next = it.next()) != (next2 = it2.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!hasNext2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (Pxi.A1X(obj, this, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            int size = size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!Pxi.A1X(obj, this, size));
            return size;
        }
        return -1;
    }

    /* renamed from: A03 */
    public final C8499Qvv subList(int i, int i2) {
        if (this instanceof C8497Qvt) {
            C8497Qvt qvt = (C8497Qvt) this;
            C11305SKq.A02(i, i2, qvt.A01);
            C8499Qvv qvv = qvt.A02;
            int i3 = qvt.A00;
            return qvv.subList(i + i3, i2 + i3);
        }
        C11305SKq.A02(i, i2, size());
        int i4 = i2 - i;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return C8498Qvu.A02;
        }
        return new C8497Qvt(this, i, i4);
    }

    /* renamed from: A04 */
    public final C8506Qw2 listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw Pxe.A0k(C11305SKq.A00("index", i, size));
        } else if (isEmpty()) {
            return A00;
        } else {
            return new C8505Qw1(this, i);
        }
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw C66580MXl.A11();
    }

    public final boolean contains(Object obj) {
        return Pxf.A1R(indexOf(obj));
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = AnonymousClass7TE.A0N(get(i2), i * 31);
        }
        return i;
    }

    @Deprecated
    public final Object remove(int i) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw C66580MXl.A11();
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }
}
