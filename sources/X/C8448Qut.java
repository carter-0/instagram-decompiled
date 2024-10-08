package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.Qut  reason: case insensitive filesystem */
public abstract class C8448Qut extends C13244TRk implements List, RandomAccess {
    public static final C8460Qv5 A00 = new C8459Qv4(C8447Qus.A02, 0);

    public static C8448Qut A00(Object[] objArr) {
        if (objArr.length != 0) {
            Object[] objArr2 = (Object[]) objArr.clone();
            int length = objArr2.length;
            int i = 0;
            while (i < length) {
                if (objArr2[i] != null) {
                    i++;
                } else {
                    throw Pxg.A0h(i);
                }
            }
            if (length != 0) {
                return new C8447Qus(objArr2, length);
            }
        }
        return C8447Qus.A02;
    }

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

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final C8448Qut A08() {
        if (this instanceof C8446Qur) {
            return ((C8446Qur) this).A00;
        }
        if (size() <= 1) {
            return this;
        }
        return new C8446Qur(this);
    }

    /* renamed from: A09 */
    public final C8448Qut subList(int i, int i2) {
        if (this instanceof C8445Quq) {
            C8445Quq quq = (C8445Quq) this;
            SKo.A02(i, i2, quq.A01);
            int i3 = quq.A00;
            return quq.A02.subList(i + i3, i2 + i3);
        } else if (this instanceof C8446Qur) {
            C8448Qut qut = ((C8446Qur) this).A00;
            SKo.A02(i, i2, qut.size());
            return qut.subList(qut.size() - i2, qut.size() - i).A08();
        } else {
            SKo.A02(i, i2, size());
            int i4 = i2 - i;
            if (i4 == size()) {
                return this;
            }
            if (i4 == 0) {
                return C8447Qus.A02;
            }
            return new C8445Quq(this, i, i4);
        }
    }

    public final int indexOf(Object obj) {
        if (this instanceof C8446Qur) {
            C8448Qut qut = ((C8446Qur) this).A00;
            int lastIndexOf = qut.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return Pxe.A0A(qut) - lastIndexOf;
            }
            return -1;
        }
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

    public final int lastIndexOf(Object obj) {
        if (this instanceof C8446Qur) {
            C8448Qut qut = ((C8446Qur) this).A00;
            int indexOf = qut.indexOf(obj);
            if (indexOf >= 0) {
                return Pxe.A0A(qut) - indexOf;
            }
            return -1;
        }
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

    /* renamed from: A0A */
    public final C8460Qv5 listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw Pxe.A0k(SKo.A00("index", i, size));
        } else if (isEmpty()) {
            return A00;
        } else {
            return new C8459Qv4(this, i);
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

    public boolean contains(Object obj) {
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
