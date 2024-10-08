package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAsyncLocalStorageSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AsyncLocalStorage";

    @ReactMethod
    public abstract void clear(Callback callback);

    @ReactMethod
    public abstract void getAllKeys(Callback callback);

    public abstract String getName();

    @ReactMethod
    public abstract void multiGet(ReadableArray readableArray, Callback callback);

    @ReactMethod
    public abstract void multiMerge(ReadableArray readableArray, Callback callback);

    @ReactMethod
    public abstract void multiRemove(ReadableArray readableArray, Callback callback);

    @ReactMethod
    public abstract void multiSet(ReadableArray readableArray, Callback callback);

    public NativeAsyncLocalStorageSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
