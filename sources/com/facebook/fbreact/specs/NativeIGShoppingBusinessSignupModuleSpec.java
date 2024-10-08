package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGShoppingBusinessSignupModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGShoppingSignupReactModule";

    public abstract String getName();

    @ReactMethod
    public abstract void registerGetStarted(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void registerNotInterestedInShopping();

    @ReactMethod
    public abstract void syncShoppingOnboardingState(Callback callback, Callback callback2);

    public NativeIGShoppingBusinessSignupModuleSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
