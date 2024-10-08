package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeRedBoxSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RedBox";

    @ReactMethod
    public abstract void dismiss();

    public abstract String getName();

    @ReactMethod
    public abstract void setExtraData(ReadableMap readableMap, String str);

    public NativeRedBoxSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
