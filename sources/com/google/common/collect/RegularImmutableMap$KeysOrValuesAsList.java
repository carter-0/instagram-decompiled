package com.google.common.collect;

import X.17k;

public final class RegularImmutableMap$KeysOrValuesAsList extends ImmutableList<Object> {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    public final boolean A0B() {
        return true;
    }

    public final Object get(int i) {
        17k.A01(i, this.A01);
        Object obj = this.A02[(i * 2) + this.A00];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.A01;
    }

    public RegularImmutableMap$KeysOrValuesAsList(Object[] objArr, int i, int i2) {
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
