package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGReactApiHelperSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactApiHelper";

    @ReactMethod
    public abstract void getApiUrlWithPath(String str, C13904TjR tjR);

    @ReactMethod
    public abstract void getHttpHeaders(C13904TjR tjR);

    public abstract String getName();

    public NativeIGReactApiHelperSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
