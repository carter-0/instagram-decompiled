package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGInsightsStoryPresenterReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGInsightsStoryPresenterReactModule";

    public abstract String getName();

    @ReactMethod
    public abstract void openStoryViewerForMediaIDs(ReadableArray readableArray, String str, double d, String str2);

    public NativeIGInsightsStoryPresenterReactModuleSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
