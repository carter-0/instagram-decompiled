package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeRelayNativeQueryVariablesSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RelayNativeQueryVariables";

    public abstract String getName();

    public abstract Map getTypedExportedConstants();

    public NativeRelayNativeQueryVariablesSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final Map getConstants() {
        throw AnonymousClass00P.createAndThrow();
    }
}
