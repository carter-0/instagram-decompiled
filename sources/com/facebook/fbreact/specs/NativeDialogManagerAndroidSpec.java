package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeDialogManagerAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DialogManagerAndroid";

    public String getName() {
        return NAME;
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void showAlert(ReadableMap readableMap, Callback callback, Callback callback2);

    public final Map getConstants() {
        return DialogModule.CONSTANTS;
    }

    public NativeDialogManagerAndroidSpec(QZK qzk) {
        super(qzk);
    }
}
