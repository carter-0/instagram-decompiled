package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeActionSheetManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ActionSheetManager";

    @ReactMethod
    public abstract void dismissActionSheet();

    public abstract String getName();

    @ReactMethod
    public abstract void showActionSheetWithOptions(ReadableMap readableMap, Callback callback);

    @ReactMethod
    public abstract void showShareActionSheetWithOptions(ReadableMap readableMap, Callback callback, Callback callback2);

    public NativeActionSheetManagerSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
