package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.WqU  reason: case insensitive filesystem */
public final class C20388WqU<T> implements List<T>, AnonymousClass07u {
    public int A00;
    public int A01;
    public final int A02;
    public final AnonymousClass6HD A03;

    public final boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final Object[] toArray() {
        return 0q3.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return 0q3.A01(this, objArr);
    }

    private final void A00() {
        if (this.A03.A01() != this.A01) {
            throw new ConcurrentModificationException();
        }
    }

    public final /* bridge */ int size() {
        return this.A00;
    }

    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            C18086VlG.A00(C273654mx.A00(2397));
            throw AnonymousClass00P.createAndThrow();
        }
        A00();
        AnonymousClass6HD r1 = this.A03;
        int i3 = this.A02;
        return new C20388WqU(r1, i + i3, i2 + i3);
    }

    public C20388WqU(AnonymousClass6HD r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = i;
        this.A01 = r2.A01();
        this.A00 = i2 - i;
    }

    public final boolean add(Object obj) {
        A00();
        AnonymousClass6HD r2 = this.A03;
        r2.add(this.A02 + size(), obj);
        this.A00 = size() + 1;
        this.A01 = r2.A01();
        return true;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        String A002;
        int i;
        AnonymousClass6HG r3;
        Snapshot A003;
        boolean z;
        if (size() > 0) {
            A00();
            AnonymousClass6HD r7 = this.A03;
            int i2 = this.A02;
            int size = size() + i2;
            do {
                Object obj = C18284Vp7.A00;
                synchronized (obj) {
                    AnonymousClass5P2 r1 = r7.A00;
                    A002 = C273654mx.A00(847);
                    0qQ.A0C(r1, A002);
                    AnonymousClass6HI r12 = (AnonymousClass6HI) AnonymousClass5P3.A08((AnonymousClass6HI) r1);
                    i = r12.A00;
                    r3 = r12.A02;
                }
                0qQ.A0A(r3);
                C20583WvB AEq = r3.AEq();
                AEq.subList(i2, size).clear();
                AnonymousClass6HG A0P = AEq.A0P();
                if (0qQ.A0K(A0P, r3)) {
                    break;
                }
                AnonymousClass5P2 r13 = r7.A00;
                0qQ.A0C(r13, A002);
                synchronized (AnonymousClass5P3.A07) {
                    A003 = AnonymousClass5P3.A00();
                    AnonymousClass6HI r2 = (AnonymousClass6HI) AnonymousClass5P3.A02(A003, r7, r13);
                    synchronized (obj) {
                        int i3 = r2.A00;
                        z = true;
                        if (i3 == i) {
                            r2.A02 = A0P;
                            r2.A00 = i3 + 1;
                            r2.A01++;
                        } else {
                            z = false;
                        }
                    }
                }
                AnonymousClass5P3.A0H(A003, r7);
            } while (!z);
            this.A00 = 0;
            this.A01 = r7.A01();
        }
    }

    public final boolean contains(Object obj) {
        return Pxf.A1R(indexOf(obj));
    }

    public final Object get(int i) {
        A00();
        C18284Vp7.A00(i, size());
        return this.A03.get(this.A02 + i);
    }

    public final int indexOf(Object obj) {
        A00();
        int i = this.A02;
        0sh it = C229632nm.A0C(i, size() + i).iterator();
        while (it.hasNext()) {
            int A002 = it.A00();
            if (0qQ.A0K(obj, this.A03.get(A002))) {
                return A002 - i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(size());
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final int lastIndexOf(Object obj) {
        A00();
        int i = this.A02;
        int size = i + size();
        do {
            size--;
            if (size < i) {
                return -1;
            }
        } while (!0qQ.A0K(obj, this.A03.get(size)));
        return size - i;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.0rk] */
    public final ListIterator listIterator(int i) {
        A00();
        ? obj = new Object();
        obj.A00 = i - 1;
        return new C20390WqW(this, obj);
    }

    public final /* bridge */ Object remove(int i) {
        A00();
        AnonymousClass6HD r2 = this.A03;
        Object remove = r2.remove(this.A02 + i);
        this.A00 = size() - 1;
        this.A01 = r2.A01();
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    public final boolean retainAll(Collection collection) {
        String A002;
        int i;
        AnonymousClass6HG r3;
        Snapshot A003;
        boolean z;
        A00();
        AnonymousClass6HD r6 = this.A03;
        int i2 = this.A02;
        int size = size() + i2;
        int size2 = r6.size();
        do {
            Object obj = C18284Vp7.A00;
            synchronized (obj) {
                AnonymousClass5P2 r1 = r6.A00;
                A002 = C273654mx.A00(847);
                0qQ.A0C(r1, A002);
                AnonymousClass6HI r12 = (AnonymousClass6HI) AnonymousClass5P3.A08((AnonymousClass6HI) r1);
                i = r12.A00;
                r3 = r12.A02;
            }
            0qQ.A0A(r3);
            C20583WvB AEq = r3.AEq();
            AEq.subList(i2, size).retainAll(collection);
            AnonymousClass6HG A0P = AEq.A0P();
            if (0qQ.A0K(A0P, r3)) {
                break;
            }
            AnonymousClass5P2 r13 = r6.A00;
            0qQ.A0C(r13, A002);
            synchronized (AnonymousClass5P3.A07) {
                A003 = AnonymousClass5P3.A00();
                AnonymousClass6HI r2 = (AnonymousClass6HI) AnonymousClass5P3.A02(A003, r6, r13);
                synchronized (obj) {
                    int i3 = r2.A00;
                    z = true;
                    if (i3 == i) {
                        r2.A02 = A0P;
                        r2.A00 = i3 + 1;
                        r2.A01++;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass5P3.A0H(A003, r6);
        } while (!z);
        int size3 = size2 - r6.size();
        if (size3 <= 0) {
            return false;
        }
        this.A01 = r6.A01();
        this.A00 = size() - size3;
        return true;
    }

    public final Object set(int i, Object obj) {
        C18284Vp7.A00(i, size());
        A00();
        AnonymousClass6HD r2 = this.A03;
        Object obj2 = r2.set(i + this.A02, obj);
        this.A01 = r2.A01();
        return obj2;
    }

    public final void add(int i, Object obj) {
        A00();
        AnonymousClass6HD r1 = this.A03;
        r1.add(this.A02 + i, obj);
        this.A00 = size() + 1;
        this.A01 = r1.A01();
    }

    public final boolean addAll(int i, Collection collection) {
        A00();
        AnonymousClass6HD r3 = this.A03;
        boolean addAll = r3.addAll(i + this.A02, collection);
        if (addAll) {
            this.A00 = size() + collection.size();
            this.A01 = r3.A01();
        }
        return addAll;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
