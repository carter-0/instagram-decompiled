package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeBugReportingSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BugReporting";

    public abstract String getName();

    @ReactMethod
    public abstract void setExtraData(ReadableMap readableMap, ReadableMap readableMap2);

    @ReactMethod
    public abstract void startReportAProblemFlow();

    public NativeBugReportingSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
