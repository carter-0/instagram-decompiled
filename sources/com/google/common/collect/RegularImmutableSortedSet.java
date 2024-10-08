package com.google.common.collect;

import X.C249803kO;
import java.util.Collections;
import java.util.Comparator;

public final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    public static final RegularImmutableSortedSet A00 = new RegularImmutableSortedSet(ImmutableList.of(), NaturalOrdering.A00);
    public final transient ImmutableList elements;

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.elements, obj, this.A01) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.common.collect.ImmutableSortedSet, java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
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
            int r1 = r7.size()
            int r0 = r8.size()
            if (r1 != r0) goto L_0x0048
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0049
            java.util.Comparator r4 = r7.A01
            boolean r0 = X.C9741Rfz.A00(r8, r4)
            if (r0 == 0) goto L_0x0044
            java.util.Iterator r3 = r8.iterator()
            com.google.common.collect.ImmutableList r0 = r7.elements     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            X.3kO r2 = r0.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableSortedSet.equals(java.lang.Object):boolean");
    }

    public final int A08() {
        return this.elements.A08();
    }

    public final int A09() {
        return this.elements.A09();
    }

    public final Object[] A0A() {
        return this.elements.A0A();
    }

    public final boolean A0B() {
        return this.elements.A0B();
    }

    public final int A0F(Object obj, boolean z) {
        ImmutableList immutableList = this.elements;
        obj.getClass();
        int binarySearch = Collections.binarySearch(immutableList, obj, comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    public final int A0G(Object obj, boolean z) {
        ImmutableList immutableList = this.elements;
        obj.getClass();
        int binarySearch = Collections.binarySearch(immutableList, obj, comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (!z) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.common.collect.ImmutableSortedSet, java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public final RegularImmutableSortedSet A0H(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new RegularImmutableSortedSet(this.elements.subList(i, i2), this.A01);
        }
        return ImmutableSortedSet.A06(this.A01);
    }

    public final ImmutableList asList() {
        return this.elements;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.common.collect.ImmutableSortedSet, java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 130 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r0 != 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r3.hasNext() != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r2 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsAll(java.util.Collection r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.AnonymousClass3W6
            if (r0 == 0) goto L_0x000a
            X.3W6 r8 = (X.AnonymousClass3W6) r8
            java.util.Set r8 = r8.ARD()
        L_0x000a:
            java.util.Comparator r0 = r7.comparator()
            boolean r0 = X.C9741Rfz.A00(r8, r0)
            if (r0 == 0) goto L_0x0058
            int r0 = r8.size()
            r6 = 1
            if (r0 <= r6) goto L_0x0058
            com.google.common.collect.ImmutableList r0 = r7.elements
            X.3kO r4 = r0.iterator()
            java.util.Iterator r3 = r8.iterator()
            boolean r0 = r4.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x005c
            java.lang.Object r2 = r3.next()
            java.lang.Object r1 = r4.next()
            goto L_0x0039
        L_0x0035:
            java.lang.Object r1 = r4.next()     // Catch:{ ClassCastException | NullPointerException -> 0x0057 }
        L_0x0039:
            java.util.Comparator r0 = r7.A01     // Catch:{ ClassCastException | NullPointerException -> 0x0057 }
            int r0 = r0.compare(r1, r2)     // Catch:{ ClassCastException | NullPointerException -> 0x0057 }
            if (r0 >= 0) goto L_0x0048
            boolean r0 = r4.hasNext()     // Catch:{ ClassCastException | NullPointerException -> 0x0057 }
            if (r0 == 0) goto L_0x005c
            goto L_0x0035
        L_0x0048:
            if (r0 != 0) goto L_0x0057
            boolean r0 = r3.hasNext()     // Catch:{ ClassCastException | NullPointerException -> 0x0057 }
            if (r0 != 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            java.lang.Object r2 = r3.next()     // Catch:{ ClassCastException | NullPointerException -> 0x0057 }
            goto L_0x0039
        L_0x0056:
            return r6
        L_0x0057:
            return r5
        L_0x0058:
            boolean r5 = com.google.common.collect.RegularImmutableSortedSet.super.containsAll(r8)
        L_0x005c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableSortedSet.containsAll(java.util.Collection):boolean");
    }

    public final int copyIntoArray(Object[] objArr, int i) {
        return this.elements.copyIntoArray(objArr, i);
    }

    public final C249803kO iterator() {
        return this.elements.iterator();
    }

    public final int size() {
        return this.elements.size();
    }

    public RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.elements = immutableList;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
