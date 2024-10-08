package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.TMi  reason: case insensitive filesystem */
public final class C13124TMi<T> implements List<T>, AnonymousClass07u {
    public int A00;
    public final int A01;
    public final List A02;

    public final Iterator iterator() {
        return new C13130TMo(this, 0);
    }

    public final Object[] toArray() {
        return 0q3.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return 0q3.A01(this, objArr);
    }

    public final void add(int i, Object obj) {
        this.A02.add(i + this.A01, obj);
        this.A00++;
    }

    public final boolean addAll(int i, Collection collection) {
        this.A02.addAll(i + this.A01, collection);
        this.A00 += collection.size();
        return AnonymousClass7TF.A1R(collection.size());
    }

    public final void clear() {
        int i = this.A00 - 1;
        int i2 = this.A01;
        if (i2 <= i) {
            while (true) {
                this.A02.remove(i);
                if (i == i2) {
                    break;
                }
                i--;
            }
        }
        this.A00 = i2;
    }

    public final boolean contains(Object obj) {
        int i = this.A00;
        for (int i2 = this.A01; i2 < i; i2++) {
            if (0qQ.A0K(this.A02.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    public final int indexOf(Object obj) {
        int i = this.A01;
        int i2 = i;
        int i3 = this.A00;
        while (i < i3) {
            if (0qQ.A0K(this.A02.get(i), obj)) {
                return i - i2;
            }
            i++;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1S(this.A00, this.A01);
    }

    public final int lastIndexOf(Object obj) {
        int i = this.A00 - 1;
        int i2 = this.A01;
        if (i2 > i) {
            return -1;
        }
        while (!0qQ.A0K(this.A02.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    public final ListIterator listIterator(int i) {
        return new C13130TMo(this, i);
    }

    public final boolean remove(Object obj) {
        int i = this.A00;
        for (int i2 = this.A01; i2 < i; i2++) {
            List list = this.A02;
            if (0qQ.A0K(list.get(i2), obj)) {
                list.remove(i2);
                this.A00--;
                return true;
            }
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        int i = this.A00;
        for (Object remove : collection) {
            remove(remove);
        }
        return JTQ.A1O(i, this.A00);
    }

    public final boolean retainAll(Collection collection) {
        int i = this.A00;
        int i2 = i - 1;
        int i3 = this.A01;
        if (i3 <= i2) {
            while (true) {
                List list = this.A02;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.A00--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return JTQ.A1O(i, this.A00);
    }

    public final /* bridge */ int size() {
        return this.A00 - this.A01;
    }

    public C13124TMi(List list, int i, int i2) {
        this.A02 = list;
        this.A01 = i;
        this.A00 = i2;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        C289035cu.A00(this, i);
        return this.A02.get(i + this.A01);
    }

    public final Object set(int i, Object obj) {
        C289035cu.A00(this, i);
        return this.A02.set(i + this.A01, obj);
    }

    public final List subList(int i, int i2) {
        C289035cu.A01(this, i, i2);
        return new C13124TMi(this, i, i2);
    }

    public final boolean add(Object obj) {
        List list = this.A02;
        int i = this.A00;
        this.A00 = i + 1;
        list.add(i, obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        this.A02.addAll(this.A00, collection);
        this.A00 += collection.size();
        return AnonymousClass7TF.A1R(collection.size());
    }

    public final ListIterator listIterator() {
        return new C13130TMo(this, 0);
    }

    public final /* bridge */ Object remove(int i) {
        C289035cu.A00(this, i);
        this.A00--;
        return this.A02.remove(i + this.A01);
    }
}
