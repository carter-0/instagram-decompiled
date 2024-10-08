package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIntentAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IntentAndroid";

    @ReactMethod
    public abstract void canOpenURL(String str, C13904TjR tjR);

    @ReactMethod
    public abstract void getInitialURL(C13904TjR tjR);

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void openSettings(C13904TjR tjR);

    @ReactMethod
    public abstract void openURL(String str, C13904TjR tjR);

    @ReactMethod
    public abstract void sendIntent(String str, ReadableArray readableArray, C13904TjR tjR);

    public NativeIntentAndroidSpec(QZK qzk) {
        super(qzk);
    }
}
