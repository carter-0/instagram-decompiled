package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.QwZ  reason: case insensitive filesystem */
public abstract class C8535QwZ extends C13243TRj implements List, RandomAccess {
    public static final C8548Qwm A00 = new C8547Qwl(C8540Qwe.A02, 0);

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
                        if (C9718Rfb.A00(get(i), list.get(i))) {
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
                            if (!C9718Rfb.A00(it.next(), it2.next())) {
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

    /* renamed from: A03 */
    public final C8535QwZ subList(int i, int i2) {
        if (this instanceof C8534QwY) {
            C8534QwY qwY = (C8534QwY) this;
            C11306SKs.A02(i, i2, qwY.A01);
            C8535QwZ qwZ = qwY.A02;
            int i3 = qwY.A00;
            return qwZ.subList(i + i3, i2 + i3);
        }
        C11306SKs.A02(i, i2, size());
        int i4 = i2 - i;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return C8540Qwe.A02;
        }
        return new C8534QwY(this, i, i4);
    }

    /* renamed from: A04 */
    public final C8548Qwm listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw Pxe.A0k(C11306SKs.A00("index", i, size));
        } else if (isEmpty()) {
            return A00;
        } else {
            return new C8547Qwl(this, i);
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
