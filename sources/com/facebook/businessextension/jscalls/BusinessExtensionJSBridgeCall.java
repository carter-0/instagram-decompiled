package com.facebook.businessextension.jscalls;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C10947S2f;
import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import org.json.JSONObject;

public abstract class BusinessExtensionJSBridgeCall extends BrowserLiteJSBridgeCall {
    public static C10947S2f A03(Bundle bundle, String str) {
        String string = bundle.getString("callbackID");
        if (string == null) {
            return null;
        }
        String string2 = bundle.getString("callback_result");
        0qQ.A0B(str, 1);
        return new C10947S2f(str, string, string2, (String) null, true);
    }

    public static Bundle A01(String str, JSONObject jSONObject) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("callbackID", str);
        A0a.putString("callback_result", jSONObject.toString());
        return A0a;
    }

    public static Bundle A02(JSONObject jSONObject) {
        Bundle A0a = AnonymousClass7TE.A0a();
        if (jSONObject.has("callbackID")) {
            A0a.putString("callbackID", jSONObject.getString("callbackID"));
        }
        return A0a;
    }
}
