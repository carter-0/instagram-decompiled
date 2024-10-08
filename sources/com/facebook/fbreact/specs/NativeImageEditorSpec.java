package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeImageEditorSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImageEditingManager";

    @ReactMethod
    public abstract void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2);

    public abstract String getName();

    public NativeImageEditorSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
