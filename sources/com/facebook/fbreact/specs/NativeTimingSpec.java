package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeTimingSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Timing";

    @ReactMethod
    public abstract void createTimer(double d, double d2, double d3, boolean z);

    @ReactMethod
    public abstract void deleteTimer(double d);

    public String getName() {
        return "Timing";
    }

    @ReactMethod
    public abstract void setSendIdleEvents(boolean z);

    public NativeTimingSpec(QZK qzk) {
        super(qzk);
    }
}
