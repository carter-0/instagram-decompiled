package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAlertManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AlertManager";

    @ReactMethod
    public abstract void alertWithArgs(ReadableMap readableMap, Callback callback);

    public abstract String getName();

    public NativeAlertManagerSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
