package com.instagram.react.modules.product;

import X.QZK;
import com.facebook.fbreact.specs.NativeIGPostInsightsReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGPostInsightsReactModule")
public class IgReactPostInsightsModule extends NativeIGPostInsightsReactModuleSpec {
    public static final String MODULE_NAME = "IGPostInsightsReactModule";

    public String getName() {
        return "IGPostInsightsReactModule";
    }

    public void toggleNavigationBar(double d, boolean z) {
        getCurrentActivity();
    }

    public IgReactPostInsightsModule(QZK qzk) {
        super(qzk);
    }

    public void didFinishLoading(double d) {
        getCurrentActivity();
    }
}
