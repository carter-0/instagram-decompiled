package com.facebook.react.uimanager;

import X.0dV;
import com.facebook.react.bridge.RuntimeExecutor;

public final class ComponentNameResolverBinding {
    public static final ComponentNameResolverBinding INSTANCE = new Object();

    public static final native void install(RuntimeExecutor runtimeExecutor, Object obj);

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.react.uimanager.ComponentNameResolverBinding, java.lang.Object] */
    static {
        0dV.A0C("uimanagerjni");
    }
}
