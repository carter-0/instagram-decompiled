package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.TRe  reason: case insensitive filesystem */
public class C13238TRe<E> extends AbstractCollection<E> {
    public final 1UV A00;
    public final Collection A01;

    public final boolean add(Object obj) {
        17k.A0E(this.A00.apply(obj));
        return this.A01.add(obj);
    }

    public final void clear() {
        Collection collection = this.A01;
        1UV r4 = this.A00;
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            C11307SKv.A01(r4, collection.iterator());
            return;
        }
        List list = (List) collection;
        r4.getClass();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!r4.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException | UnsupportedOperationException unused) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size <= i) {
                                break;
                            } else if (r4.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        while (true) {
                            i--;
                            if (i >= i2) {
                                list.remove(i);
                            } else {
                                return;
                            }
                        }
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
    }

    public final boolean contains(Object obj) {
        Collection collection = this.A01;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.A00.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r2 == -1) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isEmpty() {
        /*
            r4 = this;
            java.util.Collection r0 = r4.A01
            X.1UV r3 = r4.A00
            java.util.Iterator r1 = r0.iterator()
            java.lang.String r0 = "predicate"
            X.17k.A07(r3, r0)
            r2 = 0
        L_0x000f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()
            boolean r0 = r3.apply(r0)
            if (r0 == 0) goto L_0x0027
            r1 = -1
            r0 = 1
            if (r2 != r1) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r0 = r0 ^ 1
            return r0
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13238TRe.isEmpty():boolean");
    }

    public final Iterator iterator() {
        Iterator it = this.A01.iterator();
        1UV r1 = this.A00;
        it.getClass();
        r1.getClass();
        return new C8662Qz3(r1, it);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.A01.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.A00.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.A01.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.A00.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object apply : this.A01) {
            if (this.A00.apply(apply)) {
                i++;
            }
        }
        return i;
    }

    public C13238TRe(1UV r1, Collection collection) {
        this.A01 = collection;
        this.A00 = r1;
    }

    public final boolean addAll(Collection collection) {
        for (Object apply : collection) {
            17k.A0E(this.A00.apply(apply));
        }
        return this.A01.addAll(collection);
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean remove(Object obj) {
        if (!contains(obj) || !this.A01.remove(obj)) {
            return false;
        }
        return true;
    }

    public final Object[] toArray(Object[] objArr) {
        return C11307SKv.A00(this).toArray(objArr);
    }

    public final Object[] toArray() {
        return C11307SKv.A00(this).toArray();
    }
}
