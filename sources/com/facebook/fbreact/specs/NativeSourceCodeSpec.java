package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeSourceCodeSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SourceCode";

    public String getName() {
        return NAME;
    }

    public abstract Map getTypedExportedConstants();

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeSourceCodeSpec(QZK qzk) {
        super(qzk);
    }
}
