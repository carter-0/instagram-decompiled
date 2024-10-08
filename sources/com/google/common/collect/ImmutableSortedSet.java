package com.google.common.collect;

import X.17k;
import X.1Kw;
import X.AnonymousClass7TE;
import X.C13974Tmc;
import X.C66580MXl;
import X.Dba;
import X.Pxe;
import X.R0Q;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, C13974Tmc<E> {
    public static final long serialVersionUID = 912559;
    public transient ImmutableSortedSet A00;
    public final transient Comparator A01;

    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Comparator comparator;
        public final Object[] elements;

        public Object readResolve() {
            R0Q r0q = new R0Q(this.comparator);
            r0q.A08(this.elements);
            return R0Q.A02(r0q);
        }

        public SerializedForm(Object[] objArr, Comparator comparator2) {
            this.comparator = comparator2;
            this.elements = objArr;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public final Object ceiling(Object obj) {
        ? r2 = (RegularImmutableSortedSet) this;
        int A0G = r2.A0G(obj, true);
        if (A0G == r2.size()) {
            return null;
        }
        return r2.elements.get(A0G);
    }

    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return ((RegularImmutableSortedSet) this).elements.reverse().iterator();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public final Object first() {
        ? r1 = (RegularImmutableSortedSet) this;
        if (!r1.isEmpty()) {
            return AnonymousClass7TE.A13(r1.elements);
        }
        throw Pxe.A1C();
    }

    public final Object floor(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int A0F = regularImmutableSortedSet.A0F(obj, true) - 1;
        if (A0F == -1) {
            return null;
        }
        return regularImmutableSortedSet.elements.get(A0F);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public final Object higher(Object obj) {
        ? r2 = (RegularImmutableSortedSet) this;
        int A0G = r2.A0G(obj, false);
        if (A0G == r2.size()) {
            return null;
        }
        return r2.elements.get(A0G);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public final Object last() {
        ? r2 = (RegularImmutableSortedSet) this;
        if (!r2.isEmpty()) {
            return r2.elements.get(Pxe.A0A(r2));
        }
        throw Pxe.A1C();
    }

    public final Object lower(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int A0F = regularImmutableSortedSet.A0F(obj, false) - 1;
        if (A0F == -1) {
            return null;
        }
        return regularImmutableSortedSet.elements.get(A0F);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        17k.A0E(Dba.A1U(this.A01.compare(obj, obj2)));
        ? r2 = (RegularImmutableSortedSet) this;
        RegularImmutableSortedSet A0H = r2.A0H(r2.A0G(obj, true), r2.size());
        return A0H.A0H(0, A0H.A0F(obj2, false));
    }

    public static RegularImmutableSortedSet A06(Comparator comparator) {
        if (NaturalOrdering.A00.equals(comparator)) {
            return RegularImmutableSortedSet.A00;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = RegularImmutableSortedSet.A00;
        return new RegularImmutableSortedSet(ImmutableList.of(), comparator);
    }

    public static RegularImmutableSortedSet A07(Comparator comparator, Object[] objArr, int i) {
        if (i == 0) {
            return A06(comparator);
        }
        1Kw.A00(objArr, i);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        RegularImmutableSortedSet regularImmutableSortedSet = RegularImmutableSortedSet.A00;
        return new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArr, i2), comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [com.google.common.collect.ImmutableSortedSet, java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    /* renamed from: A0E */
    public final ImmutableSortedSet descendingSet() {
        ImmutableSortedSet immutableSortedSet = this.A00;
        if (immutableSortedSet == null) {
            ? r1 = (RegularImmutableSortedSet) this;
            Comparator reverseOrder = Collections.reverseOrder(r1.A01);
            if (r1.isEmpty()) {
                immutableSortedSet = A06(reverseOrder);
            } else {
                immutableSortedSet = new RegularImmutableSortedSet(r1.elements.reverse(), reverseOrder);
            }
            this.A00 = immutableSortedSet;
            immutableSortedSet.A00 = this;
        }
        return immutableSortedSet;
    }

    public final Comparator comparator() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.common.collect.ImmutableSortedSet, java.util.AbstractCollection] */
    public Object writeReplace() {
        return new SerializedForm(toArray(), this.A01);
    }

    public ImmutableSortedSet(Comparator comparator) {
        this.A01 = comparator;
    }

    public final /* bridge */ /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0H(0, regularImmutableSortedSet.A0F(obj, z));
    }

    @Deprecated
    public final Object pollFirst() {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final Object pollLast() {
        throw C66580MXl.A11();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public final /* bridge */ /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        ? r2 = (RegularImmutableSortedSet) this;
        return r2.A0H(r2.A0G(obj, z), r2.size());
    }

    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0H(0, regularImmutableSortedSet.A0F(obj, false));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public final /* bridge */ /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        17k.A0E(Dba.A1U(this.A01.compare(obj, obj2)));
        ? r2 = (RegularImmutableSortedSet) this;
        RegularImmutableSortedSet A0H = r2.A0H(r2.A0G(obj, z), r2.size());
        return A0H.A0H(0, A0H.A0F(obj2, z2));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        ? r2 = (RegularImmutableSortedSet) this;
        return r2.A0H(r2.A0G(obj, true), r2.size());
    }
}
