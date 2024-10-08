package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGReactAPISpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactAPI";

    @ReactMethod
    public abstract void get(String str, ReadableMap readableMap, C13904TjR tjR);

    public abstract String getName();

    @ReactMethod
    public abstract void post(String str, ReadableMap readableMap, C13904TjR tjR);

    public NativeIGReactAPISpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
