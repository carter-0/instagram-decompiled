package X;

import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.ConcurrentHashMultiset;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3W5  reason: invalid class name */
public abstract class AnonymousClass3W5<E> extends AbstractCollection<E> implements AnonymousClass3W6<E> {
    public transient Set A00;
    public transient Set A01;

    public int A03() {
        return ((ConcurrentHashMultiset) this).A00.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r1 = new java.util.concurrent.atomic.AtomicInteger(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r4.putIfAbsent(r8, r1) == null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r6 = r7
            com.google.common.collect.ConcurrentHashMultiset r6 = (com.google.common.collect.ConcurrentHashMultiset) r6
            r8.getClass()
            if (r9 != 0) goto L_0x000d
            int r5 = r6.AKq(r8)
        L_0x000c:
            return r5
        L_0x000d:
            java.lang.String r1 = "occurrences"
            if (r9 > 0) goto L_0x0021
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r1 = X.002.A0b(r1, r0, r9)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0021:
            java.util.concurrent.ConcurrentMap r4 = r6.A00
            r4.getClass()
            java.lang.Object r3 = r4.get(r8)     // Catch:{ ClassCastException | NullPointerException -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            r5 = 0
            if (r3 != 0) goto L_0x003f
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r9)
            java.lang.Object r3 = r4.putIfAbsent(r8, r0)
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            if (r3 != 0) goto L_0x003f
            return r5
        L_0x003f:
            int r2 = r3.get()
            if (r2 == 0) goto L_0x0050
            int r0 = X.SN3.A00(r2, r9)     // Catch:{ ArithmeticException -> 0x0063 }
            boolean r0 = r3.compareAndSet(r2, r0)     // Catch:{ ArithmeticException -> 0x0063 }
            if (r0 == 0) goto L_0x003f
            goto L_0x0062
        L_0x0050:
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r9)
            java.lang.Object r0 = r4.putIfAbsent(r8, r1)
            if (r0 == 0) goto L_0x000c
            boolean r0 = r4.replace(r8, r3, r1)
            if (r0 == 0) goto L_0x0021
            return r5
        L_0x0062:
            return r2
        L_0x0063:
            java.lang.String r1 = "Overflow adding "
            java.lang.String r0 = " occurrences to a count of "
            java.lang.String r1 = X.002.A02(r9, r2, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3W5.A04(java.lang.Object, int):int");
    }

    public Iterator A06() {
        ConcurrentHashMultiset concurrentHashMultiset = (ConcurrentHashMultiset) this;
        return new Qzs(concurrentHashMultiset, new C8661Qz2(concurrentHashMultiset));
    }

    public int ECy(Object obj, int i) {
        Object obj2;
        int i2;
        int max;
        ConcurrentMap concurrentMap = ((ConcurrentHashMultiset) this).A00;
        concurrentMap.getClass();
        try {
            obj2 = concurrentMap.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj2;
        if (atomicInteger != null) {
            do {
                i2 = atomicInteger.get();
                if (i2 != 0) {
                    max = Math.max(0, i2 - i);
                }
            } while (!atomicInteger.compareAndSet(i2, max));
            if (max != 0) {
                return i2;
            }
            concurrentMap.remove(obj, atomicInteger);
            return i2;
        }
        return 0;
    }

    public final boolean add(Object obj) {
        A04(obj, 1);
        return true;
    }

    public abstract void clear();

    public final boolean remove(Object obj) {
        return ECy(obj, 1) > 0;
    }

    public Set A02() {
        if (this instanceof ConcurrentHashMultiset) {
            return new Qzw(((ConcurrentHashMultiset) this).A00.keySet());
        }
        return new R12(this);
    }

    public Iterator A05() {
        throw new AssertionError(Pxd.A00(103));
    }

    public Set ARD() {
        Set set = this.A00;
        if (set != null) {
            return set;
        }
        Set A02 = A02();
        this.A00 = A02;
        return A02;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.R14} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.QzN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.R14} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.R14} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.R14} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set entrySet() {
        /*
            r2 = this;
            java.util.Set r0 = r2.A01
            if (r0 != 0) goto L_0x0012
            r1 = r2
            boolean r0 = r2 instanceof com.google.common.collect.ConcurrentHashMultiset
            if (r0 == 0) goto L_0x0013
            com.google.common.collect.ConcurrentHashMultiset r1 = (com.google.common.collect.ConcurrentHashMultiset) r1
            X.QzN r0 = new X.QzN
            r0.<init>(r1)
        L_0x0010:
            r2.A01 = r0
        L_0x0012:
            return r0
        L_0x0013:
            X.R14 r0 = new X.R14
            r0.<init>(r2)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3W5.entrySet():java.util.Set");
    }

    public final boolean removeAll(Collection collection) {
        if (collection instanceof AnonymousClass3W6) {
            collection = ((AnonymousClass3W6) collection).ARD();
        }
        return ARD().removeAll(collection);
    }

    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection instanceof AnonymousClass3W6) {
            AnonymousClass3W6 r5 = (AnonymousClass3W6) collection;
            if (r5 instanceof AbstractMapBasedMultiset) {
                AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) r5;
                if (abstractMapBasedMultiset.isEmpty()) {
                    return false;
                }
                SK2 sk2 = abstractMapBasedMultiset.A01;
                int A02 = sk2.A02();
                while (A02 >= 0) {
                    17k.A01(A02, sk2.A02);
                    Object obj = sk2.A06[A02];
                    SK2 sk22 = abstractMapBasedMultiset.A01;
                    17k.A01(A02, sk22.A02);
                    A04(obj, sk22.A05[A02]);
                    sk2 = abstractMapBasedMultiset.A01;
                    A02 = sk2.A03(A02);
                }
                return true;
            } else if (r5.isEmpty()) {
                return false;
            } else {
                for (S79 s79 : r5.entrySet()) {
                    A04(s79.A01(), s79.A00());
                }
                return true;
            }
        } else if (!collection.isEmpty()) {
            return C11307SKv.A02(this, collection.iterator());
        } else {
            return false;
        }
    }

    public final boolean contains(Object obj) {
        if (AKq(obj) > 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return C9740Rfy.A00(this, obj);
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof AnonymousClass3W6) {
            collection = ((AnonymousClass3W6) collection).ARD();
        }
        return ARD().retainAll(collection);
    }

    public final String toString() {
        return entrySet().toString();
    }
}
