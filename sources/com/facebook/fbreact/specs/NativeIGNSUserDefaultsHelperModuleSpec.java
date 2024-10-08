package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGNSUserDefaultsHelperModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGNSUserDefaultsHelperModule";

    @ReactMethod
    public abstract void getBoolValueForKey(String str, Callback callback);

    public abstract String getName();

    @ReactMethod
    public abstract void setBoolValue(boolean z, String str);

    public NativeIGNSUserDefaultsHelperModuleSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
