package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeCompassionResourceModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CompassionResourceModule";

    @ReactMethod
    public abstract void closeCompassionResource(double d);

    public abstract String getName();

    public NativeCompassionResourceModuleSpec(QZK qzk) {
        super(qzk);
    }
}
