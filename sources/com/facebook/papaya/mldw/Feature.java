package com.facebook.papaya.mldw;

import X.0dV;
import com.facebook.jni.HybridData;
import com.google.common.collect.ImmutableList;

public class Feature {
    public final HybridData mHybridData;

    private native ImmutableList nativeGetColumnNames();

    private native int nativeGetColumns();

    private native long nativeGetFeatureId();

    private native ImmutableList nativeGetRow(int i);

    private native ImmutableList nativeGetRows(ImmutableList immutableList);

    private native int nativeGetRowsNumber();

    private native void nativeToKeyValuePair(int i);

    static {
        0dV.A0C("papaya-mldw");
    }

    public Feature(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
