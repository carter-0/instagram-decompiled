package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeAppStateSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AppState";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void getCurrentAppState(Callback callback, Callback callback2);

    public String getName() {
        return "AppState";
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void removeListeners(double d);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeAppStateSpec(QZK qzk) {
        super(qzk);
    }
}
