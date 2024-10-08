package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeHeadlessJsTaskSupportSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "HeadlessJsTaskSupport";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void notifyTaskFinished(double d);

    @ReactMethod
    public abstract void notifyTaskRetry(double d, C13904TjR tjR);

    public NativeHeadlessJsTaskSupportSpec(QZK qzk) {
        super(qzk);
    }
}
