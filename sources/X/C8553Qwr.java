package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.Qwr  reason: case insensitive filesystem */
public abstract class C8553Qwr extends C13245TRl implements List, RandomAccess {
    public static final C8559Qwx A00 = new C8558Qww(C8552Qwq.A02, 0);

    public static C8553Qwr A01(Object obj) {
        Object[] objArr = {obj};
        C9723Rfg.A00(objArr, 1);
        return A03(objArr, 1);
    }

    @Deprecated
    public final C8553Qwr A09() {
        return this;
    }

    public final boolean equals(Object obj) {
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
                        if (C9729Rfm.A00(get(i), list.get(i))) {
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
                        if (hasNext2) {
                            if (!C9729Rfm.A00(it.next(), it2.next())) {
                                break;
                            }
                        } else {
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

    public static C8553Qwr A00() {
        return C8552Qwq.A02;
    }

    public static C8553Qwr A02(Collection collection) {
        Object[] array;
        int length;
        if (collection instanceof C13245TRl) {
            C8553Qwr A09 = ((C13245TRl) collection).A09();
            if (!A09.A07()) {
                return A09;
            }
            array = A09.toArray();
            length = array.length;
        } else {
            array = collection.toArray();
            length = array.length;
            C9723Rfg.A00(array, length);
        }
        return A03(array, length);
    }

    public static C8553Qwr A03(Object[] objArr, int i) {
        if (i == 0) {
            return C8552Qwq.A02;
        }
        return new C8552Qwq(objArr, i);
    }

    public int A08(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    /* renamed from: A0A */
    public C8553Qwr subList(int i, int i2) {
        C11396SRp.A03(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C8552Qwq.A02;
        }
        return new C8551Qwp(this, i, i3);
    }

    /* renamed from: A0B */
    public final C8559Qwx listIterator(int i) {
        C11396SRp.A02(i, size());
        if (isEmpty()) {
            return A00;
        }
        return new C8558Qww(this, i);
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
