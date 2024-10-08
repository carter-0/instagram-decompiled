package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeLeadGenHelperSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "LeadGenHelper";

    public abstract String getName();

    @ReactMethod
    public abstract void onAppPrepareToClose();

    @ReactMethod
    public abstract void onScroll(double d);

    @ReactMethod
    public abstract void openAdUrl(String str, String str2, double d, double d2, String str3);

    @ReactMethod
    public abstract void openDialer(String str, String str2, double d, double d2, String str3);

    @ReactMethod
    public abstract void submitForm(String str, String str2);

    public NativeLeadGenHelperSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
