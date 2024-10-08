package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeIGReactDimensionsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactDimensions";

    public abstract String getName();

    public abstract Map getTypedExportedConstants();

    public NativeIGReactDimensionsSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final Map getConstants() {
        throw AnonymousClass00P.createAndThrow();
    }
}
