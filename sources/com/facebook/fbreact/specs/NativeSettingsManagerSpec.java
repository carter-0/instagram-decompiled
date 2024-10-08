package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeSettingsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SettingsManager";

    @ReactMethod
    public abstract void deleteValues(ReadableArray readableArray);

    public abstract String getName();

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void setValues(ReadableMap readableMap);

    public NativeSettingsManagerSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final Map getConstants() {
        throw AnonymousClass00P.createAndThrow();
    }
}
