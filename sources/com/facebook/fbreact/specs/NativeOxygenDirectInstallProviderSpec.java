package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeOxygenDirectInstallProviderSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "OxygenDirectInstallProvider";

    public abstract String getName();

    @ReactMethod
    public abstract void install(String str, double d, Callback callback, Callback callback2);

    public NativeOxygenDirectInstallProviderSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
