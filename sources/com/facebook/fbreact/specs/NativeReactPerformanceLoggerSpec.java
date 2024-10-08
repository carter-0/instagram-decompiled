package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeReactPerformanceLoggerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ReactPerformanceLogger";

    @ReactMethod
    public void finish(String str) {
    }

    public abstract String getName();

    @ReactMethod
    public abstract void logEvents(ReadableMap readableMap);

    public NativeReactPerformanceLoggerSpec(QZK qzk) {
        super(qzk);
    }
}
