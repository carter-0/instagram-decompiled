package com.facebook.fbreact.specs;

import X.C13948Tm8;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeSafeAreaSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SafeArea";

    public String getName() {
        return "SafeArea";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract C13948Tm8 safeAreaInsets();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean setSupportsOrientationChange(boolean z);

    public NativeSafeAreaSpec(QZK qzk) {
        super(qzk);
    }
}
