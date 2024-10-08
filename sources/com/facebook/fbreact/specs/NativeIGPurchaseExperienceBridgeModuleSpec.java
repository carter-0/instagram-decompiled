package com.facebook.fbreact.specs;

import X.C13904TjR;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGPurchaseExperienceBridgeModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGPurchaseExperienceBridgeModule";

    @ReactMethod
    public abstract void authenticate(double d, ReadableMap readableMap, C13904TjR tjR);

    @ReactMethod
    public abstract void checkoutConfirmationWillDismiss();

    @ReactMethod
    public abstract void dismissCheckout(double d, ReadableArray readableArray, boolean z, boolean z2);

    public abstract String getName();

    @ReactMethod
    public abstract void initCheckout(double d, ReadableMap readableMap);

    @ReactMethod
    public abstract void onPaymentSuccess(String str, boolean z, String str2, ReadableArray readableArray, ReadableArray readableArray2);

    @ReactMethod
    public abstract void openConnectFlow(double d, String str, String str2, C13904TjR tjR);

    @ReactMethod
    public abstract void openPaypalConsentFlow(double d, String str, String str2, String str3, C13904TjR tjR);

    @ReactMethod
    public abstract void openShopPayFlow(double d, String str, String str2, C13904TjR tjR);

    @ReactMethod
    public abstract void openShopPayInterstitial(double d, String str, String str2, C13904TjR tjR);

    @ReactMethod
    public abstract void sharePurchaseToStory(double d, String str, String str2);

    public NativeIGPurchaseExperienceBridgeModuleSpec(QZK qzk) {
        super(qzk);
    }
}
