package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AccessibilityInfo";

    @ReactMethod
    public abstract void announceForAccessibility(String str);

    public abstract String getName();

    @ReactMethod
    public abstract void getRecommendedTimeoutMillis(double d, Callback callback);

    @ReactMethod
    public abstract void isAccessibilityServiceEnabled(Callback callback);

    @ReactMethod
    public abstract void isHighTextContrastEnabled(Callback callback);

    @ReactMethod
    public abstract void isReduceMotionEnabled(Callback callback);

    @ReactMethod
    public abstract void isTouchExplorationEnabled(Callback callback);

    @ReactMethod
    public abstract void setAccessibilityFocus(double d);

    public NativeAccessibilityInfoSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
