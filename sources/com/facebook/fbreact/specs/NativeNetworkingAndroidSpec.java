package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeNetworkingAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Networking";

    @ReactMethod
    public abstract void abortRequest(double d);

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void clearCookies(Callback callback);

    public abstract String getName();

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void sendRequest(String str, String str2, double d, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d2, boolean z2);

    public NativeNetworkingAndroidSpec(QZK qzk) {
        super(qzk);
    }
}
