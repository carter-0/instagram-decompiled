package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.TMh  reason: case insensitive filesystem */
public final class C13123TMh implements List<C267794cD>, C62650uo {
    public final int A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass5T7 A02;

    public final Object[] toArray() {
        return 0q3.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return 0q3.A01(this, objArr);
    }

    public C13123TMh(AnonymousClass5T7 r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C267794cD)) {
            return false;
        }
        return JTQ.A1O(indexOf(obj), -1);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        Object obj = this.A02.A04[i + this.A01];
        0qQ.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C267794cD)) {
            return -1;
        }
        int i = this.A01;
        int i2 = i;
        int i3 = this.A00;
        if (i > i3) {
            return -1;
        }
        while (!0qQ.A0K(this.A02.A04[i], obj)) {
            if (i == i3) {
                return -1;
            }
            i++;
        }
        return i - i2;
    }

    public final Iterator iterator() {
        AnonymousClass5T7 r3 = this.A02;
        int i = this.A01;
        return new C13129TMn(r3, i, i, this.A00);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        int i;
        int i2;
        if (!(obj instanceof C267794cD) || (i2 = this.A01) > (i = this.A00)) {
            return -1;
        }
        while (!0qQ.A0K(this.A02.A04[i], obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    public final ListIterator listIterator(int i) {
        AnonymousClass5T7 r3 = this.A02;
        int i2 = this.A01;
        return new C13129TMn(r3, i + i2, i2, this.A00);
    }

    public final /* bridge */ int size() {
        return this.A00 - this.A01;
    }

    public final List subList(int i, int i2) {
        AnonymousClass5T7 r2 = this.A02;
        int i3 = this.A01;
        return new C13123TMh(r2, i + i3, i3 + i2);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw Pxh.A0s();
    }

    public final boolean addAll(int i, Collection collection) {
        throw Pxh.A0s();
    }

    public final void clear() {
        throw Pxh.A0s();
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(size());
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw Pxh.A0s();
    }

    public final boolean removeAll(Collection collection) {
        throw Pxh.A0s();
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw Pxh.A0s();
    }

    public final boolean retainAll(Collection collection) {
        throw Pxh.A0s();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw Pxh.A0s();
    }

    public final void sort(Comparator comparator) {
        throw Pxh.A0s();
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw Pxh.A0s();
    }

    public final boolean addAll(Collection collection) {
        throw Pxh.A0s();
    }

    public final ListIterator listIterator() {
        AnonymousClass5T7 r3 = this.A02;
        int i = this.A01;
        return new C13129TMn(r3, i, i, this.A00);
    }

    public final boolean remove(Object obj) {
        throw Pxh.A0s();
    }
}
