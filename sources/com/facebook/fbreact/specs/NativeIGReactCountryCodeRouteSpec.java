package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGReactCountryCodeRouteSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactCountryCodeRoute";

    @ReactMethod
    public abstract void extractCountryCodeAndNumber(String str, C13904TjR tjR);

    public abstract String getName();

    @ReactMethod
    public abstract void presentCountryCodeSelector(String str, Callback callback);

    public NativeIGReactCountryCodeRouteSpec(QZK qzk) {
        super(qzk);
    }
}
