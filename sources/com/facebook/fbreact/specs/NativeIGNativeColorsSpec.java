package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeIGNativeColorsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGNativeColors";

    public abstract String getName();

    public abstract Map getTypedExportedConstants();

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeIGNativeColorsSpec(QZK qzk) {
        super(qzk);
    }
}
