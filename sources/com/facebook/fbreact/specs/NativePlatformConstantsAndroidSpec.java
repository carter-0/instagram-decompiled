package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativePlatformConstantsAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PlatformConstants";

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getAndroidID();

    public String getName() {
        return NAME;
    }

    public abstract Map getTypedExportedConstants();

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativePlatformConstantsAndroidSpec(QZK qzk) {
        super(qzk);
    }
}
