package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeVibrationSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Vibration";

    @ReactMethod
    public abstract void cancel();

    public abstract String getName();

    @ReactMethod
    public abstract void vibrate(double d);

    @ReactMethod
    public abstract void vibrateByPattern(ReadableArray readableArray, double d);

    public NativeVibrationSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
