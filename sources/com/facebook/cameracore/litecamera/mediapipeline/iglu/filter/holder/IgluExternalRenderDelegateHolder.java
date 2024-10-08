package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder;

import X.0dV;
import X.C392509uv;
import com.facebook.jni.HybridData;

public final class IgluExternalRenderDelegateHolder {
    public static final C392509uv Companion = new Object();
    public HybridData mHybridData;

    public static final native HybridData initHybrid(FilterWeakPtr filterWeakPtr, IgluExternalRenderDelegateWrapper igluExternalRenderDelegateWrapper);

    private final native void releaseNative();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9uv, java.lang.Object] */
    static {
        0dV.A0C("mediapipeline-iglufilter-holder");
    }

    public final void release() {
        releaseNative();
    }
}
