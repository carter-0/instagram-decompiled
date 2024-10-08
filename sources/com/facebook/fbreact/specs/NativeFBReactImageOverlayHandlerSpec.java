package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeFBReactImageOverlayHandlerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FBReactImageOverlayHandler";

    public abstract String getName();

    @ReactMethod
    public abstract void processImage(ReadableMap readableMap, Callback callback);

    public NativeFBReactImageOverlayHandlerSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
