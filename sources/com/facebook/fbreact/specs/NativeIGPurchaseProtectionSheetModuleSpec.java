package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGPurchaseProtectionSheetModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGPurchaseProtectionSheetNativeModule";

    public abstract String getName();

    @ReactMethod
    public abstract void openBottomSheet(double d);

    public NativeIGPurchaseProtectionSheetModuleSpec(QZK qzk) {
        super(qzk);
    }
}
