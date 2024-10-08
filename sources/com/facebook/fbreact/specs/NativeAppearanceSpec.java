package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAppearanceSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Appearance";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getColorScheme();

    public String getName() {
        return "Appearance";
    }

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void setColorScheme(String str);

    public NativeAppearanceSpec(QZK qzk) {
        super(qzk);
    }
}
