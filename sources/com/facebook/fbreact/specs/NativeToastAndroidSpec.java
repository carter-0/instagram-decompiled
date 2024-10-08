package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeToastAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ToastAndroid";

    public String getName() {
        return "ToastAndroid";
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void show(String str, double d);

    @ReactMethod
    public abstract void showWithGravity(String str, double d, double d2);

    @ReactMethod
    public abstract void showWithGravityAndOffset(String str, double d, double d2, double d3, double d4);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeToastAndroidSpec(QZK qzk) {
        super(qzk);
    }
}
