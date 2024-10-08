package com.facebook.cvat.ctsmartcreation.ctautoenhance;

import X.0dV;
import X.CUA;
import com.facebook.jni.HybridData;

public final class CTColorEnhance {
    public static final CUA Companion = new Object();
    public final HybridData mHybridData = initHybridNative();

    private final native HybridData initHybridNative();

    private final native void nativeRender(int i, int i2, int i3, int i4, int i5, int i6, float f);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CUA, java.lang.Object] */
    static {
        0dV.A0C("ctcolorenhance-native");
    }
}
