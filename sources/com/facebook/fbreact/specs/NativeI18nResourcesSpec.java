package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeI18nResourcesSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18nResources";

    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getOverrideContent(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getTranslation(String str, ReadableArray readableArray);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean isEnabled();

    public NativeI18nResourcesSpec(QZK qzk) {
        super(qzk);
    }
}
