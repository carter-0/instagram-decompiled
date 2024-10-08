package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativePermissionsAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PermissionsAndroid";

    @ReactMethod
    public abstract void checkPermission(String str, C13904TjR tjR);

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void requestMultiplePermissions(ReadableArray readableArray, C13904TjR tjR);

    @ReactMethod
    public abstract void requestPermission(String str, C13904TjR tjR);

    @ReactMethod
    public abstract void shouldShowRequestPermissionRationale(String str, C13904TjR tjR);

    public NativePermissionsAndroidSpec(QZK qzk) {
        super(qzk);
    }
}
