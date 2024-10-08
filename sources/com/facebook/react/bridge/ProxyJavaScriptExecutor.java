package com.facebook.react.bridge;

import X.SBO;
import com.facebook.jni.HybridData;

public abstract class ProxyJavaScriptExecutor extends JavaScriptExecutor {
    public static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    static {
        SBO.A00();
    }
}
