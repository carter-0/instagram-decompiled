package com.instagram.jni.igblur;

import X.0dV;
import X.AnonymousClass49D;
import com.facebook.jni.HybridData;

public final class IgBlur {
    public static final AnonymousClass49D Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    public final native void functionToBlur(Object obj, int i, int i2);

    public final native void iterativeBoxBlur(Object obj, int i, int i2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.49D, java.lang.Object] */
    static {
        0dV.A0C("igblur");
    }
}
