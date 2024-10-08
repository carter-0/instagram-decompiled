package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeIGReactAlertBarSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactAlertBar";

    public abstract String getName();

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void showErrors(ReadableMap readableMap);

    @ReactMethod
    public abstract void showMessage(String str, double d);

    public NativeIGReactAlertBarSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final Map getConstants() {
        throw AnonymousClass00P.createAndThrow();
    }
}
