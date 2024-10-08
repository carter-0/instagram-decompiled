package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeCameraRollManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CameraRollManager";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void getPhotos(ReadableMap readableMap, C13904TjR tjR);

    @ReactMethod
    public abstract void saveToCameraRoll(String str, String str2, C13904TjR tjR);

    public NativeCameraRollManagerSpec(QZK qzk) {
        super(qzk);
    }
}
