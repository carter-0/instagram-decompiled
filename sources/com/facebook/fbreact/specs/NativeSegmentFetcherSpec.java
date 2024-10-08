package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeSegmentFetcherSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SegmentFetcher";

    @ReactMethod
    public abstract void fetchSegment(double d, ReadableMap readableMap, Callback callback);

    public abstract String getName();

    @ReactMethod
    public abstract void getSegment(double d, ReadableMap readableMap, Callback callback);

    public NativeSegmentFetcherSpec(QZK qzk) {
        super(qzk);
    }
}
