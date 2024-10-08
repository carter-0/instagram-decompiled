package com.instagram.react.modules.product;

import X.AnonymousClass7TF;
import X.QZK;
import X.TE0;
import com.facebook.fbreact.specs.NativeCompassionResourceModuleSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "CompassionResourceModule")
public class IgReactCompassionResourceModule extends NativeCompassionResourceModuleSpec {
    public static final String MODULE_NAME = "CompassionResourceModule";

    public String getName() {
        return "CompassionResourceModule";
    }

    public void closeCompassionResource(double d) {
        AnonymousClass7TF.A0D().post(new TE0(this));
    }

    public IgReactCompassionResourceModule(QZK qzk) {
        super(qzk);
    }
}
