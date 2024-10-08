package com.google.common.collect;

import X.17k;
import X.C249803kO;
import X.SK2;
import com.google.common.collect.RegularImmutableMultiset;

public abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    public final ImmutableList A0C() {
        return new ImmutableList<E>() {
            /* JADX WARNING: type inference failed for: r0v0, types: [com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableCollection] */
            public final boolean A0B() {
                return IndexedImmutableSet.this.A0B();
            }

            public final Object get(int i) {
                IndexedImmutableSet indexedImmutableSet = IndexedImmutableSet.this;
                if (!(indexedImmutableSet instanceof RegularImmutableMultiset.ElementSet)) {
                    return ImmutableMultiset.this.A0E(i);
                }
                SK2 sk2 = RegularImmutableMultiset.this.A01;
                17k.A01(i, sk2.A02);
                return sk2.A06[i];
            }

            /* JADX WARNING: type inference failed for: r0v0, types: [com.google.common.collect.IndexedImmutableSet, java.util.AbstractCollection] */
            public final int size() {
                return IndexedImmutableSet.this.size();
            }

            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableCollection] */
    public final int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableCollection] */
    public final C249803kO iterator() {
        return asList().iterator();
    }

    public Object writeReplace() {
        return IndexedImmutableSet.super.writeReplace();
    }
}
