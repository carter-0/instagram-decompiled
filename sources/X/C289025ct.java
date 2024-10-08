package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.5ct  reason: invalid class name and case insensitive filesystem */
public final class C289025ct<T> implements List<T>, AnonymousClass07u {
    public final C285045Pl A00;

    public final Iterator iterator() {
        return new C13130TMo(this, 0);
    }

    public final Object[] toArray() {
        return 0q3.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return 0q3.A01(this, objArr);
    }

    public final boolean add(Object obj) {
        return this.A00.A09(obj);
    }

    public final boolean addAll(Collection collection) {
        C285045Pl r1 = this.A00;
        return r1.A08(r1.A00, collection);
    }

    public final void clear() {
        this.A00.A01();
    }

    public final boolean contains(Object obj) {
        return this.A00.A0A(obj);
    }

    public final boolean containsAll(Collection collection) {
        C285045Pl r2 = this.A00;
        for (Object A0A : collection) {
            if (!r2.A0A(A0A)) {
                return false;
            }
        }
        return true;
    }

    public final int indexOf(Object obj) {
        C285045Pl r0 = this.A00;
        int i = r0.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = r0.A02;
            while (!0qQ.A0K(obj, objArr[i2])) {
                i2++;
                if (i2 >= i) {
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.A00.A00 == 0) {
            return true;
        }
        return false;
    }

    public final int lastIndexOf(Object obj) {
        C285045Pl r1 = this.A00;
        int i = r1.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = r1.A02;
            while (!0qQ.A0K(obj, objArr[i2])) {
                i2--;
                if (i2 < 0) {
                }
            }
            return i2;
        }
        return -1;
    }

    public final ListIterator listIterator(int i) {
        return new C13130TMo(this, i);
    }

    public final boolean removeAll(Collection collection) {
        C285045Pl r4 = this.A00;
        if (collection.isEmpty()) {
            return false;
        }
        int i = r4.A00;
        for (Object A0B : collection) {
            r4.A0B(A0B);
        }
        if (i != r4.A00) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection collection) {
        C285045Pl r4 = this.A00;
        int i = r4.A00;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(r4.A02[i2])) {
                r4.A00(i2);
            }
        }
        if (i == r4.A00) {
            return false;
        }
        return true;
    }

    public final /* bridge */ int size() {
        return this.A00.A00;
    }

    public C289025ct(C285045Pl r1) {
        this.A00 = r1;
    }

    public final Object get(int i) {
        C289035cu.A00(this, i);
        return this.A00.A02[i];
    }

    public final /* bridge */ Object remove(int i) {
        C289035cu.A00(this, i);
        return this.A00.A00(i);
    }

    public final Object set(int i, Object obj) {
        C289035cu.A00(this, i);
        Object[] objArr = this.A00.A02;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final List subList(int i, int i2) {
        C289035cu.A01(this, i, i2);
        return new C13124TMi(this, i, i2);
    }

    public final void add(int i, Object obj) {
        this.A00.A04(i, obj);
    }

    public final boolean addAll(int i, Collection collection) {
        return this.A00.A08(i, collection);
    }

    public final ListIterator listIterator() {
        return new C13130TMo(this, 0);
    }

    public final boolean remove(Object obj) {
        return this.A00.A0B(obj);
    }
}
