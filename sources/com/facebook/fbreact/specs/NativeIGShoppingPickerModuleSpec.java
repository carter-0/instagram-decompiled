package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGShoppingPickerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGShoppingPickerModule";

    public abstract String getName();

    @ReactMethod
    public abstract void openPicker(String str, ReadableArray readableArray, double d);

    public NativeIGShoppingPickerModuleSpec(QZK qzk) {
        super(qzk);
    }
}
