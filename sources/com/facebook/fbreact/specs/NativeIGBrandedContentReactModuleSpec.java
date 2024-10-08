package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGBrandedContentReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGBrandedContentReactModule";

    public abstract String getName();

    @ReactMethod
    public abstract void openAdCreationPartners(double d);

    @ReactMethod
    public abstract void openAllowlistedPartners(double d, ReadableArray readableArray);

    @ReactMethod
    public abstract void openRequestAdCreationAccess(double d);

    @ReactMethod
    public abstract void updateWhitelistSettings(boolean z, boolean z2, String str, String str2, C13904TjR tjR);

    public NativeIGBrandedContentReactModuleSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
