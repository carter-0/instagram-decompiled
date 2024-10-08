package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeRelayConfigSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RelayAPIConfig";

    public abstract String getName();

    @ReactMethod
    public void getSandbox(Callback callback) {
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public void setSandbox(String str) {
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeRelayConfigSpec(QZK qzk) {
        super(qzk);
    }
}
