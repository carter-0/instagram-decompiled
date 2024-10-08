package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeSoundManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SoundManager";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void playTouchSound();

    public NativeSoundManagerSpec(QZK qzk) {
        super(qzk);
    }
}
