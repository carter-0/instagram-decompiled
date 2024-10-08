package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeLogBoxSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "LogBox";

    public String getName() {
        return "LogBox";
    }

    @ReactMethod
    public abstract void hide();

    @ReactMethod
    public abstract void show();

    public NativeLogBoxSpec(QZK qzk) {
        super(qzk);
    }
}
