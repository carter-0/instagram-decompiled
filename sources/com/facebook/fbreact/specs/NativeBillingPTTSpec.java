package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeBillingPTTSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BillingPTT";

    public abstract String getName();

    @ReactMethod
    public abstract void getPTT(String str, ReadableMap readableMap, ReadableMap readableMap2, String str2, String str3, C13904TjR tjR);

    public abstract Map getTypedExportedConstants();

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeBillingPTTSpec(QZK qzk) {
        super(qzk);
    }
}
