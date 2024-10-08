package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeI18nManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18nManager";

    @ReactMethod
    public abstract void allowRTL(boolean z);

    @ReactMethod
    public abstract void forceRTL(boolean z);

    public String getName() {
        return NAME;
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void swapLeftAndRightInRTL(boolean z);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeI18nManagerSpec(QZK qzk) {
        super(qzk);
    }
}
