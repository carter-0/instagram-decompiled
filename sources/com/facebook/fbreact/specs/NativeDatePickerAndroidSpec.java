package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDatePickerAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DatePickerAndroid";

    public String getName() {
        return "DatePickerAndroid";
    }

    @ReactMethod
    public abstract void open(ReadableMap readableMap, C13904TjR tjR);

    public NativeDatePickerAndroidSpec(QZK qzk) {
        super(qzk);
    }
}
