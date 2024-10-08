package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeClipboardSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Clipboard";

    public String getName() {
        return "Clipboard";
    }

    @ReactMethod
    public abstract void getString(C13904TjR tjR);

    @ReactMethod
    public abstract void setString(String str);

    public NativeClipboardSpec(QZK qzk) {
        super(qzk);
    }
}
