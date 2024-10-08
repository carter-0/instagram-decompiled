package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeFBLinkingAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FBLinkingAndroid";

    @ReactMethod
    public abstract void canOpenURL(String str, String str2, C13904TjR tjR);

    public String getName() {
        return "FBLinkingAndroid";
    }

    @ReactMethod
    public abstract void openURL(String str, String str2, C13904TjR tjR);

    public NativeFBLinkingAndroidSpec(QZK qzk) {
        super(qzk);
    }
}
