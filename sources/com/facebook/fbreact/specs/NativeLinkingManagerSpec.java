package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeLinkingManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "LinkingManager";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void canOpenURL(String str, C13904TjR tjR);

    @ReactMethod
    public abstract void getInitialURL(C13904TjR tjR);

    public abstract String getName();

    @ReactMethod
    public abstract void openSettings(C13904TjR tjR);

    @ReactMethod
    public abstract void openURL(String str, C13904TjR tjR);

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeLinkingManagerSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
