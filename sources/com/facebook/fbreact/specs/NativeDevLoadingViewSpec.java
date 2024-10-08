package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDevLoadingViewSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevLoadingView";

    public abstract String getName();

    @ReactMethod
    public abstract void hide();

    @ReactMethod
    public abstract void showMessage(String str, Double d, Double d2);

    public NativeDevLoadingViewSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
