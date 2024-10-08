package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDeviceEventManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DeviceEventManager";

    public String getName() {
        return "DeviceEventManager";
    }

    @ReactMethod
    public abstract void invokeDefaultBackPressHandler();

    public NativeDeviceEventManagerSpec(QZK qzk) {
        super(qzk);
    }
}
