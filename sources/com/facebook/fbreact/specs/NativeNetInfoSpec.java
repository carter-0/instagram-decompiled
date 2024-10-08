package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeNetInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NetInfo";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void getCurrentConnectivity(C13904TjR tjR);

    public abstract String getName();

    @ReactMethod
    public abstract void isConnectionMetered(C13904TjR tjR);

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeNetInfoSpec(QZK qzk) {
        super(qzk);
    }
}
