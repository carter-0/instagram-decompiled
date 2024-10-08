package com.instagram.pdqhashing;

import X.0dV;
import X.C63358Kvf;
import com.facebook.jni.HybridData;

public final class PDQHashingBridge {
    public static final C63358Kvf Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(String str);

    public final native String getHashWithQuality(String str, int i, Integer num);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.Kvf] */
    static {
        0dV.A0C("pdqhashing");
    }

    public PDQHashingBridge(String str) {
        this.mHybridData = initHybrid(str);
    }
}
