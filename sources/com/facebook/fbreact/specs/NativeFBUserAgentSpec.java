package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeFBUserAgentSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FBUserAgent";

    public abstract String getName();

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void getWebViewLikeUserAgent(Callback callback);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeFBUserAgentSpec(QZK qzk) {
        super(qzk);
    }
}
