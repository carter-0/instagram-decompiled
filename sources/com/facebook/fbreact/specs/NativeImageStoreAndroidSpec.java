package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeImageStoreAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImageStoreManager";

    @ReactMethod
    public abstract void getBase64ForTag(String str, Callback callback, Callback callback2);

    public String getName() {
        return "ImageStoreManager";
    }

    public NativeImageStoreAndroidSpec(QZK qzk) {
        super(qzk);
    }
}
