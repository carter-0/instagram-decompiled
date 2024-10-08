package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.C13947Tm7;
import X.C13948Tm8;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeRelayChunkedPrefetcherSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RelayChunkedPrefetcher";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String generateHashWithActorID(String str, String str2, ReadableMap readableMap);

    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract C13947Tm7 getPrefetchedQueryIDs();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract C13948Tm8 provideResponseIfAvailableSync(String str);

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeRelayChunkedPrefetcherSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
