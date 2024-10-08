package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeFrameRateLoggerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FrameRateLogger";

    @ReactMethod
    public abstract void beginScroll();

    @ReactMethod
    public abstract void endScroll();

    public abstract String getName();

    @ReactMethod
    public abstract void setContext(String str);

    @ReactMethod
    public abstract void setGlobalOptions(ReadableMap readableMap);

    public NativeFrameRateLoggerSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
