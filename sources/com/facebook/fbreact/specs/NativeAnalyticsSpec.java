package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAnalyticsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Analytics";

    public abstract String getName();

    @ReactMethod
    public abstract void logCounter(String str, double d);

    @ReactMethod
    public abstract void logEvent(String str, ReadableMap readableMap, String str2);

    @ReactMethod
    public abstract void logRealtimeEvent(String str, ReadableMap readableMap, String str2);

    public NativeAnalyticsSpec(QZK qzk) {
        super(qzk);
    }
}
