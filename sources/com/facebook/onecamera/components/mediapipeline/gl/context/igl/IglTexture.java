package com.facebook.onecamera.components.mediapipeline.gl.context.igl;

import X.0dV;
import X.C393109vu;
import com.facebook.jni.HybridData;
import java.util.Map;

public final class IglTexture {
    public static final C393109vu Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native int getHandle();

    public final native int getHeight();

    public final native Map getParams();

    public final native int getTarget();

    public final native int getWidth();

    public final native void release();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9vu] */
    static {
        0dV.A0C("mediapipeline-igl-context");
    }

    public IglTexture(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
