package com.google.common.collect;

import X.17k;
import X.1WJ;
import X.C13959TmM;
import X.S79;
import com.google.common.collect.ImmutableSortedMultiset;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

public final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public static final ImmutableSortedMultiset A03 = new RegularImmutableSortedMultiset(NaturalOrdering.A00);
    public static final long[] A04 = {0};
    public final transient int A00;
    public final transient int A01;
    public final transient long[] A02;
    public final transient RegularImmutableSortedSet elementSet;

    public final boolean A0B() {
        if (this.A01 > 0 || this.A00 < this.A02.length - 1) {
            return true;
        }
        return false;
    }

    public final ImmutableSortedMultiset A0J(int i, int i2) {
        int i3 = this.A00;
        17k.A03(i, i2, i3);
        if (i == i2) {
            Comparator comparator = A0I().comparator();
            if (NaturalOrdering.A00.equals(comparator)) {
                return A03;
            }
            return new RegularImmutableSortedMultiset(comparator);
        } else if (i == 0 && i2 == i3) {
            return this;
        } else {
            return new RegularImmutableSortedMultiset(this.elementSet.A0H(i, i2), this.A02, this.A01 + i, i2 - i);
        }
    }

    public final int AKq(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.elementSet;
        if (obj == null) {
            return 0;
        }
        try {
            int binarySearch = Collections.binarySearch(regularImmutableSortedSet.elements, obj, regularImmutableSortedSet.A01);
            if (binarySearch < 0) {
                return 0;
            }
            long[] jArr = this.A02;
            int i = this.A01 + binarySearch;
            return (int) (jArr[i + 1] - jArr[i]);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    public final /* bridge */ /* synthetic */ NavigableSet ARC() {
        return this.elementSet;
    }

    public final /* bridge */ /* synthetic */ Set ARD() {
        return this.elementSet;
    }

    public final int size() {
        long[] jArr = this.A02;
        int i = this.A01;
        return 1WJ.A02(jArr[this.A00 + i] - jArr[i]);
    }

    public Object writeReplace() {
        return new ImmutableSortedMultiset.SerializedForm(this);
    }

    public RegularImmutableSortedMultiset(Comparator comparator) {
        this.elementSet = ImmutableSortedSet.A06(comparator);
        this.A02 = A04;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final S79 AVj() {
        if (isEmpty()) {
            return null;
        }
        return A0E(0);
    }

    public final /* bridge */ /* synthetic */ C13959TmM CL8(BoundType boundType, Object obj) {
        return A0G(boundType, obj);
    }

    public final S79 CfO() {
        if (isEmpty()) {
            return null;
        }
        return A0E(this.A00 - 1);
    }

    public final /* bridge */ /* synthetic */ C13959TmM EzU(BoundType boundType, Object obj) {
        return A0H(boundType, obj);
    }

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet regularImmutableSortedSet, long[] jArr, int i, int i2) {
        this.elementSet = regularImmutableSortedSet;
        this.A02 = jArr;
        this.A01 = i;
        this.A00 = i2;
    }
}
