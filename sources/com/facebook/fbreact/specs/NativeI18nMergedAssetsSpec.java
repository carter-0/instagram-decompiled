package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeI18nMergedAssetsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18nMergedAssets";

    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getString(double d);

    public NativeI18nMergedAssetsSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
