package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeI18nAssetsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18nAssets";

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getAssetContent(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double getDictionarySize();

    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getString(String str);

    @ReactMethod
    public abstract void invalidateCaches();

    @ReactMethod
    public abstract void resetDictionary();

    public NativeI18nAssetsSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
