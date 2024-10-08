package com.facebook.fbreact.specs;

import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGPromoteMigrationReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGPromoteMigrationReactModule";

    public abstract String getName();

    @ReactMethod
    public abstract void postDataFromCreateEditAudienceScreen(double d, String str);

    @ReactMethod
    public abstract void postDataFromDestinationWebsiteScreen(double d, String str, String str2);

    public NativeIGPromoteMigrationReactModuleSpec(QZK qzk) {
        super(qzk);
    }
}
