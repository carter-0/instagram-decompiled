package com.facebook.fbreact.igford;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C13904TjR;
import X.C66581MXm;
import X.QZK;
import X.RQ4;
import X.RVD;
import X.Xr6;
import com.facebook.fbreact.specs.NativeIGFordDirectModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.ultralight.UL;
import java.util.Map;

@ReactModule(name = "IGFordDirectModule")
public final class ReactIGFordDirectModule extends NativeIGFordDirectModuleSpec {
    public static final RVD Companion = new Object();
    public static final String NAME = "IGFordDirectModule";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactIGFordDirectModule(QZK qzk) {
        super(qzk);
        0qQ.A0B(qzk, 1);
        RQ4.A00 = qzk;
    }

    public void addListener(String str) {
    }

    public void removeListeners(double d) {
    }

    public Map getTypedExportedConstants() {
        Xr6.A00(UL.id._UL__ULSEP_com_oculus_igd_bootstrap_IgvrBootstrapManager_ULSEP_BINDING_ID);
        throw AnonymousClass7TE.A11("isIGDBuild");
    }

    public void getString(String str, C13904TjR tjR) {
        String format = String.format("%s-back", C66581MXm.A1b(str, AnonymousClass7TG.A1Z(str, tjR) ? 1 : 0));
        0qQ.A07(format);
        tjR.resolve(format);
    }
}
