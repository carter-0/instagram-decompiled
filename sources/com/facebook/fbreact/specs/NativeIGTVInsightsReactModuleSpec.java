package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGTVInsightsReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGIGTVInsightsReactModule";

    public abstract String getName();

    @ReactMethod
    public abstract void seekToTime(double d);

    public NativeIGTVInsightsReactModuleSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
