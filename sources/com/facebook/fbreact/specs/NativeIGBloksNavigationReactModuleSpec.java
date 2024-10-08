package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGBloksNavigationReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGBloksNavigationReactModule";

    public abstract String getName();

    @ReactMethod
    public abstract void navigate(double d, String str, String str2, ReadableMap readableMap);

    @ReactMethod
    public abstract void runAction(double d, String str, ReadableMap readableMap);

    public NativeIGBloksNavigationReactModuleSpec(QZK qzk) {
        super(qzk);
    }
}
