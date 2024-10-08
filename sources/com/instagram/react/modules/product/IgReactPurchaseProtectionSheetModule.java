package com.instagram.react.modules.product;

import X.0lg;
import X.C18773W0w;
import X.QZK;
import X.TE2;
import com.facebook.fbreact.specs.NativeIGPurchaseProtectionSheetModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.session.UserSession;

@ReactModule(name = "IGPurchaseProtectionSheetNativeModule")
public class IgReactPurchaseProtectionSheetModule extends NativeIGPurchaseProtectionSheetModuleSpec {
    public static final String MODULE_NAME = "IGPurchaseProtectionSheetNativeModule";
    public final UserSession mUserSession;

    public String getName() {
        return "IGPurchaseProtectionSheetNativeModule";
    }

    public void openBottomSheet(double d) {
        C18773W0w.A01(new TE2(this));
    }

    public IgReactPurchaseProtectionSheetModule(QZK qzk, 0lg r2) {
        super(qzk);
        this.mUserSession = (UserSession) r2;
    }
}
