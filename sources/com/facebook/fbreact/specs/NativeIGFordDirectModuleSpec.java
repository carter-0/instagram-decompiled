package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeIGFordDirectModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGFordDirectModule";

    @ReactMethod
    public abstract void addListener(String str);

    public String getName() {
        return "IGFordDirectModule";
    }

    @ReactMethod
    public abstract void getString(String str, C13904TjR tjR);

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void removeListeners(double d);

    public final Map getConstants() {
        getTypedExportedConstants();
        throw AnonymousClass00P.createAndThrow();
    }

    public NativeIGFordDirectModuleSpec(QZK qzk) {
        super(qzk);
    }
}
