package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeKeyboardObserverSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "KeyboardObserver";

    @ReactMethod
    public abstract void addListener(String str);

    public abstract String getName();

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeKeyboardObserverSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
