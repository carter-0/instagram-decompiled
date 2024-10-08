package com.instagram.react.modules.product;

import X.0lg;
import X.0qQ;
import X.C13007THp;
import X.C13904TjR;
import X.C18773W0w;
import X.C3270479e;
import X.C66580MXl;
import X.Pxe;
import X.QZK;
import com.facebook.fbreact.specs.NativeIGReactCountryCodeRouteSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGReactCountryCodeRoute")
public class IgReactCountryCodeRoute extends NativeIGReactCountryCodeRouteSpec {
    public static final String MODULE_NAME = "IGReactCountryCodeRoute";
    public final 0lg mSession;

    public String getName() {
        return "IGReactCountryCodeRoute";
    }

    public IgReactCountryCodeRoute(QZK qzk, 0lg r2) {
        super(qzk);
        this.mSession = r2;
    }

    public void extractCountryCodeAndNumber(String str, C13904TjR tjR) {
        String str2;
        int length;
        QZK A0T = Pxe.A0T(this);
        0qQ.A0B(A0T, 0);
        String str3 = C3270479e.A00(A0T).A00;
        String str4 = C3270479e.A00(A0T).A01;
        String A00 = C3270479e.A00(A0T).A00();
        if (!(str == null || str.length() == 0)) {
            if (C66580MXl.A1a(str4, 1, str)) {
                length = str4.length();
            } else if (C66580MXl.A1a(A00, 1, str)) {
                length = A00.length();
            }
            str2 = C66580MXl.A0z(str, length);
            WritableNativeMap A0U = Pxe.A0U();
            A0U.putString("country", str3);
            A0U.putString("countryCode", str4);
            A0U.putString("phoneNumber", str2);
            tjR.resolve(A0U);
        }
        str2 = "";
        WritableNativeMap A0U2 = Pxe.A0U();
        A0U2.putString("country", str3);
        A0U2.putString("countryCode", str4);
        A0U2.putString("phoneNumber", str2);
        tjR.resolve(A0U2);
    }

    public void presentCountryCodeSelector(String str, Callback callback) {
        if (Pxe.A0T(this).A00() != null) {
            C18773W0w.A01(new C13007THp(callback, this));
        }
    }
}
