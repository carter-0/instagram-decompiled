package com.instagram.react.modules.product;

import X.002;
import X.0qQ;
import X.0xY;
import X.0xa;
import X.1Au;
import X.1Av;
import X.AnonymousClass1Nd;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbU;
import X.Pxe;
import X.QZK;
import android.os.Bundle;
import com.facebook.fbreact.specs.NativeIGGeoGatingReactModuleSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

@ReactModule(name = "IGGeoGatingReactModule")
public class IgReactGeoGatingModule extends NativeIGGeoGatingReactModuleSpec {
    public static final String FRAGMENT_ARGUMENTS = "fragment_arguments";
    public static final String MODULE_NAME = "IGGeoGatingReactModule";
    public UserSession mUserSession;

    public String getName() {
        return "IGGeoGatingReactModule";
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.1qK, java.lang.Object] */
    public void updateGeoGatingSettings(boolean z, ReadableArray readableArray, String str) {
        UserSession userSession = this.mUserSession;
        if (userSession != null) {
            1Av A00 = 1Au.A00(userSession);
            A00.A14(str, z);
            HashSet A1F = AnonymousClass7TE.A1F();
            for (int i = 0; i < readableArray.size(); i++) {
                A1F.add(readableArray.getString(i));
            }
            0qQ.A0B(str, 0);
            0xa r3 = A00.A01;
            0xY AR4 = r3.AR4();
            AR4.ED3(002.A0R(str, "_limit_location_list"));
            0xY A0e = DbU.A0e(AR4, r3);
            A0e.E5h(002.A0R(str, "_limit_location_list"), A1F);
            A0e.apply();
            if (str.equals("feed")) {
                AnonymousClass1Nd.A00(userSession).A05(new Object());
            }
        }
    }

    public void setupNativeModule() {
        UserSession userSession;
        if (Pxe.A0T(this).A00() == null || Pxe.A0T(this).A00().getIntent() == null) {
            userSession = null;
        } else {
            Bundle A06 = DbU.A06(Pxe.A0T(this).A00());
            A06.getClass();
            if (A06.getBundle(FRAGMENT_ARGUMENTS) != null) {
                A06 = A06.getBundle(FRAGMENT_ARGUMENTS);
            }
            userSession = DbS.A0U(A06);
        }
        this.mUserSession = userSession;
    }

    public IgReactGeoGatingModule(QZK qzk) {
        super(qzk);
    }
}
