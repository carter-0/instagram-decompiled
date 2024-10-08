package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGMediaPickerReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGMediaPickerNativeModule";

    public abstract String getName();

    @ReactMethod
    public abstract void openNativePhotoPicker(double d, boolean z);

    public NativeIGMediaPickerReactModuleSpec(QZK qzk) {
        super(qzk);
    }
}
