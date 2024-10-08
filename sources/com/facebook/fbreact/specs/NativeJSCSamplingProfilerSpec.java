package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeJSCSamplingProfilerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "JSCSamplingProfiler";

    public abstract String getName();

    @ReactMethod
    public abstract void operationComplete(double d, String str, String str2);

    public NativeJSCSamplingProfilerSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
