package com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces;

import X.AnonymousClass00P;
import com.facebook.jni.HybridData;

public abstract class ComponentSyncListener {
    public HybridData mHybridData;

    public final native void flushLogs();

    public ComponentSyncListener() {
        throw AnonymousClass00P.createAndThrow();
    }
}
