package com.google.common.collect;

import X.C13959TmM;
import X.S79;
import com.google.common.collect.ImmutableSortedMultiset;
import java.util.NavigableSet;
import java.util.Set;

public final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public final transient ImmutableSortedMultiset A00;

    public final boolean A0B() {
        return this.A00.A0B();
    }

    public final int AKq(Object obj) {
        return this.A00.AKq(obj);
    }

    public final S79 AVj() {
        return this.A00.CfO();
    }

    public final S79 CfO() {
        return this.A00.AVj();
    }

    public final int size() {
        return this.A00.size();
    }

    public Object writeReplace() {
        return new ImmutableSortedMultiset.SerializedForm(this);
    }

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset immutableSortedMultiset) {
        this.A00 = immutableSortedMultiset;
    }

    public final /* bridge */ /* synthetic */ NavigableSet ARC() {
        return A0I();
    }

    public final /* bridge */ /* synthetic */ Set ARD() {
        return A0I();
    }

    public final /* bridge */ /* synthetic */ C13959TmM CL8(BoundType boundType, Object obj) {
        return A0G(boundType, obj);
    }

    public final /* bridge */ /* synthetic */ C13959TmM EzU(BoundType boundType, Object obj) {
        return A0H(boundType, obj);
    }
}
