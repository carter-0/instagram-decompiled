package com.facebook.hyperthrift;

import X.RVQ;

public abstract class HyperThriftBase$Builder {
    public int A00 = -1;
    public final Object[] A01;

    public static final Object[] A01(Object[] objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    public static void A00(Object[] objArr, int i) {
        objArr[i] = RVQ.A00(objArr[i]);
    }

    public HyperThriftBase$Builder(int i) {
        this.A01 = new Object[i];
    }
}
