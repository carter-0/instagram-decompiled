package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.C13904TjR;
import X.C13947Tm7;
import X.C13948Tm8;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeRelayPrefetcherSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RelayPrefetcher";

    @ReactMethod
    public abstract void clear();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String generateHashWithActorID(String str, String str2, ReadableMap readableMap);

    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract C13947Tm7 getPrefetchedQueryIDs();

    @ReactMethod
    public abstract void provideResponseIfAvailable(String str, C13904TjR tjR);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract C13948Tm8 provideResponseIfAvailableSync(String str);

    public NativeRelayPrefetcherSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
