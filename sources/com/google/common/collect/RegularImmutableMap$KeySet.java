package com.google.common.collect;

import X.C249803kO;

public final class RegularImmutableMap$KeySet<K> extends ImmutableSet<K> {
    public final transient ImmutableList A00;
    public final transient ImmutableMap A01;

    public final boolean A0B() {
        return true;
    }

    public final ImmutableList asList() {
        return this.A00;
    }

    public final boolean contains(Object obj) {
        if (this.A01.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final int copyIntoArray(Object[] objArr, int i) {
        return this.A00.copyIntoArray(objArr, i);
    }

    public final int size() {
        return this.A01.size();
    }

    public RegularImmutableMap$KeySet(ImmutableList immutableList, ImmutableMap immutableMap) {
        this.A01 = immutableMap;
        this.A00 = immutableList;
    }

    public Object writeReplace() {
        return RegularImmutableMap$KeySet.super.writeReplace();
    }

    public final C249803kO iterator() {
        return this.A00.iterator();
    }
}
