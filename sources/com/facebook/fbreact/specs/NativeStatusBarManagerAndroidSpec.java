package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeStatusBarManagerAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "StatusBarManager";

    public String getName() {
        return "StatusBarManager";
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void setColor(double d, boolean z);

    @ReactMethod
    public abstract void setHidden(boolean z);

    @ReactMethod
    public abstract void setStyle(String str);

    @ReactMethod
    public abstract void setTranslucent(boolean z);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeStatusBarManagerAndroidSpec(QZK qzk) {
        super(qzk);
    }
}
