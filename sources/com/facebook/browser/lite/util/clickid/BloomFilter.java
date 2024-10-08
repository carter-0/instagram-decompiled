package com.facebook.browser.lite.util.clickid;

import X.0dV;
import X.0qQ;
import X.XUO;
import com.facebook.jni.HybridData;

public final class BloomFilter {
    public static final XUO Companion = new Object();
    public final HybridData mHybridData;

    public BloomFilter(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0(int i, int i2, byte[] bArr);

    public final native boolean add(long j);

    public final native boolean contains(long j);

    public final native byte[] getBits();

    public final native int getNumBits();

    public final native int getNumHashes();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XUO, java.lang.Object] */
    static {
        0dV.A0C("clickid");
    }
}
