package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGPostInsightsReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGPostInsightsReactModule";

    @ReactMethod
    public abstract void didFinishLoading(double d);

    public abstract String getName();

    @ReactMethod
    public abstract void toggleNavigationBar(double d, boolean z);

    public NativeIGPostInsightsReactModuleSpec(QZK qzk) {
        super(qzk);
    }
}
