package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGSharedPreferencesModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGSharedPreferencesModule";

    @ReactMethod
    public abstract void getBoolean(String str, String str2, boolean z, C13904TjR tjR);

    public abstract String getName();

    @ReactMethod
    public abstract void getString(String str, String str2, String str3, C13904TjR tjR);

    public NativeIGSharedPreferencesModuleSpec(QZK qzk) {
        super(qzk);
    }
}
