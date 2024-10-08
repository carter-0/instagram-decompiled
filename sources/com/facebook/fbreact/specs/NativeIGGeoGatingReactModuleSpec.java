package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGGeoGatingReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGGeoGatingReactModule";

    public abstract String getName();

    @ReactMethod
    public abstract void setupNativeModule();

    @ReactMethod
    public abstract void updateGeoGatingSettings(boolean z, ReadableArray readableArray, String str);

    public NativeIGGeoGatingReactModuleSpec(QZK qzk) {
        super(qzk);
    }
}
