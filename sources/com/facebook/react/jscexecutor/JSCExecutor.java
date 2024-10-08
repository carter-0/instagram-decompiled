package com.facebook.react.jscexecutor;

import X.0dV;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;

public abstract class JSCExecutor extends JavaScriptExecutor {
    public static final native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    static {
        0dV.A0C("jscexecutor");
    }
}
