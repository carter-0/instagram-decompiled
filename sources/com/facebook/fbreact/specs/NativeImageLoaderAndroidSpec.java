package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeImageLoaderAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImageLoader";

    @ReactMethod
    public abstract void abortRequest(double d);

    public abstract String getName();

    @ReactMethod
    public abstract void getSize(String str, C13904TjR tjR);

    @ReactMethod
    public abstract void getSizeWithHeaders(String str, ReadableMap readableMap, C13904TjR tjR);

    @ReactMethod
    public abstract void prefetchImage(String str, double d, C13904TjR tjR);

    @ReactMethod
    public abstract void queryCache(ReadableArray readableArray, C13904TjR tjR);

    public NativeImageLoaderAndroidSpec(QZK qzk) {
        super(qzk);
    }
}
