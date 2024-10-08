package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: X.Quy  reason: case insensitive filesystem */
public final class C8453Quy extends C8443Quo implements NavigableSet, C13973Tmb {
    public static final C8453Quy A03 = new C8453Quy(C8447Qus.A02, C8456Qv1.A00);
    public transient C8453Quy A00;
    public final transient C8448Qut A01;
    public final transient Comparator A02;

    public final Comparator comparator() {
        return this.A02;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.A01, obj, this.A02) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 == r7) goto L_0x0049
            boolean r0 = r8 instanceof java.util.Set
            r5 = 0
            if (r0 == 0) goto L_0x0048
            java.util.Set r8 = (java.util.Set) r8
            X.Qut r2 = r7.A01
            int r1 = r2.size()
            int r0 = r8.size()
            if (r1 != r0) goto L_0x0048
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0049
            java.util.Comparator r4 = r7.A02
            boolean r0 = X.C9707RfQ.A00(r8, r4)
            if (r0 == 0) goto L_0x0044
            java.util.Iterator r3 = r8.iterator()
            X.Qv5 r2 = r2.listIterator(r5)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
        L_0x002c:
            boolean r0 = r2.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r2.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            java.lang.Object r0 = r3.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            if (r0 == 0) goto L_0x0048
            int r0 = r4.compare(r1, r0)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            if (r0 == 0) goto L_0x002c
            return r5
        L_0x0043:
            return r5
        L_0x0044:
            boolean r5 = r7.containsAll(r8)
        L_0x0048:
            return r5
        L_0x0049:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8453Quy.equals(java.lang.Object):boolean");
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, obj2, true, false);
    }

    static {
        C8460Qv5 qv5 = C8448Qut.A00;
    }

    public static C8453Quy A02(Comparator comparator) {
        if (C8456Qv1.A00.equals(comparator)) {
            return A03;
        }
        C8460Qv5 qv5 = C8448Qut.A00;
        return new C8453Quy(C8447Qus.A02, comparator);
    }

    /* renamed from: A09 */
    public final C8453Quy descendingSet() {
        C8453Quy quy = this.A00;
        if (quy == null) {
            Comparator reverseOrder = Collections.reverseOrder(this.A02);
            if (isEmpty()) {
                quy = A02(reverseOrder);
            } else {
                quy = new C8453Quy(this.A01.A08(), reverseOrder);
            }
            this.A00 = quy;
            quy.A00 = this;
        }
        return quy;
    }

    public final C8453Quy A0A(int i, int i2) {
        if (i == 0) {
            if (i2 == this.A01.size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return A02(this.A02);
        }
        C8448Qut qut = this.A01;
        return new C8453Quy(qut.subList(i, i2), this.A02);
    }

    public final Object ceiling(Object obj) {
        C8448Qut qut = this.A01;
        obj.getClass();
        int binarySearch = Collections.binarySearch(qut, obj, this.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        if (binarySearch == qut.size()) {
            return null;
        }
        return qut.get(binarySearch);
    }

    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.A02;
        if (!C9707RfQ.A00(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C8460Qv5 A0A = this.A01.listIterator(0);
        Iterator it = collection.iterator();
        if (!A0A.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = A0A.next();
        while (true) {
            try {
                int compare = comparator.compare(next2, next);
                if (compare >= 0) {
                    if (compare != 0) {
                        break;
                    } else if (!it.hasNext()) {
                        return true;
                    } else {
                        next = it.next();
                    }
                } else if (!A0A.hasNext()) {
                    return false;
                } else {
                    next2 = A0A.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return this.A01.A08().listIterator(0);
    }

    public final Object higher(Object obj) {
        C8448Qut qut = this.A01;
        obj.getClass();
        int binarySearch = Collections.binarySearch(qut, obj, this.A02);
        int i = binarySearch ^ -1;
        if (binarySearch >= 0) {
            i = binarySearch + 1;
        }
        if (i == qut.size()) {
            return null;
        }
        return qut.get(i);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.A01.listIterator(0);
    }

    public final int size() {
        return this.A01.size();
    }

    public C8453Quy(C8448Qut qut, Comparator comparator) {
        this.A02 = comparator;
        this.A01 = qut;
    }

    /* renamed from: A0B */
    public final C8453Quy subSet(Object obj, Object obj2, boolean z, boolean z2) {
        obj.getClass();
        obj2.getClass();
        Comparator comparator = this.A02;
        if (comparator.compare(obj, obj2) <= 0) {
            C8448Qut qut = this.A01;
            int binarySearch = Collections.binarySearch(qut, obj, comparator);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            } else if (!z) {
                binarySearch++;
            }
            C8453Quy A0A = A0A(binarySearch, qut.size());
            int binarySearch2 = Collections.binarySearch(A0A.A01, obj2, A0A.A02);
            if (binarySearch2 < 0) {
                binarySearch2 ^= -1;
            } else if (z2) {
                binarySearch2++;
            }
            return A0A.A0A(0, binarySearch2);
        }
        throw Pxe.A0g();
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw C66580MXl.A11();
    }

    public final Object first() {
        if (!isEmpty()) {
            return AnonymousClass7TE.A13(this.A01);
        }
        throw Pxe.A1C();
    }

    public final Object floor(Object obj) {
        obj.getClass();
        C8448Qut qut = this.A01;
        int binarySearch = Collections.binarySearch(qut, obj, this.A02);
        int i = binarySearch ^ -1;
        if (binarySearch >= 0) {
            i = binarySearch + 1;
        }
        int i2 = i - 1;
        if (i2 == -1) {
            return null;
        }
        return qut.get(i2);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.A01, obj, this.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else if (z) {
            binarySearch++;
        }
        return A0A(0, binarySearch);
    }

    public final Object last() {
        if (!isEmpty()) {
            C8448Qut qut = this.A01;
            return qut.get(Pxe.A0A(qut));
        }
        throw Pxe.A1C();
    }

    public final Object lower(Object obj) {
        obj.getClass();
        C8448Qut qut = this.A01;
        int binarySearch = Collections.binarySearch(qut, obj, this.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        int i = binarySearch - 1;
        if (i == -1) {
            return null;
        }
        return qut.get(i);
    }

    @Deprecated
    public final Object pollFirst() {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final Object pollLast() {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final Object removeFirst() {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final Object removeLast() {
        throw C66580MXl.A11();
    }

    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        C8448Qut qut = this.A01;
        int binarySearch = Collections.binarySearch(qut, obj, this.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else if (!z) {
            binarySearch++;
        }
        return A0A(binarySearch, qut.size());
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.A01, obj, this.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        return A0A(0, binarySearch);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        C8448Qut qut = this.A01;
        int binarySearch = Collections.binarySearch(qut, obj, this.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        return A0A(binarySearch, qut.size());
    }
}
