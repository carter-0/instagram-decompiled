package com.google.common.collect;

import X.17k;

public class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList A01 = new RegularImmutableList(new Object[0], 0);
    public final transient int A00;
    public final transient Object[] array;

    public final int A09() {
        return 0;
    }

    public final boolean A0B() {
        return false;
    }

    public final int A08() {
        return this.A00;
    }

    public final Object[] A0A() {
        return this.array;
    }

    public final int copyIntoArray(Object[] objArr, int i) {
        Object[] objArr2 = this.array;
        int i2 = this.A00;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    public final Object get(int i) {
        17k.A01(i, this.A00);
        Object obj = this.array[i];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.A00;
    }

    public RegularImmutableList(Object[] objArr, int i) {
        this.array = objArr;
        this.A00 = i;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
