package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeFileReaderModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FileReaderModule";

    public abstract String getName();

    @ReactMethod
    public abstract void readAsDataURL(ReadableMap readableMap, C13904TjR tjR);

    @ReactMethod
    public abstract void readAsText(ReadableMap readableMap, String str, C13904TjR tjR);

    public NativeFileReaderModuleSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
