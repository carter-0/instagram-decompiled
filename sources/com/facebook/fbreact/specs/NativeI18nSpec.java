package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeI18nSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18n";

    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getOverrideContent(String str);

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void setLocale(String str);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeI18nSpec(QZK qzk) {
        super(qzk);
    }
}
