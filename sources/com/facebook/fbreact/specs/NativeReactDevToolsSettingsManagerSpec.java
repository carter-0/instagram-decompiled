package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeReactDevToolsSettingsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ReactDevToolsSettingsManager";

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getGlobalHookSettings();

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void setGlobalHookSettings(String str);

    public NativeReactDevToolsSettingsManagerSpec(QZK qzk) {
        super(qzk);
    }
}
