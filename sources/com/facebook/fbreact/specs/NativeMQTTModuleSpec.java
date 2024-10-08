package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeMQTTModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "MQTTModule";

    public abstract String getName();

    @ReactMethod
    public abstract void subscribe(String str, String str2);

    @ReactMethod
    public abstract void unsubscribe(String str);

    public NativeMQTTModuleSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
