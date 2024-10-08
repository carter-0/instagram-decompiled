package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeJSCHeapCaptureSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "JSCHeapCapture";

    @ReactMethod
    public abstract void captureComplete(String str, String str2);

    public String getName() {
        return NAME;
    }

    public NativeJSCHeapCaptureSpec(QZK qzk) {
        super(qzk);
    }
}
