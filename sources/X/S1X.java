package X;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public final class S1X {
    public final QQ0 A00;
    public final Q97 A01;

    public final void A00(String str) {
        String str2;
        String str3;
        RIW riw;
        String str4;
        String asString;
        QQ0 qq0 = this.A00;
        SUF suf = qq0.A01;
        if (suf != null) {
            String str5 = qq0.A02;
            String str6 = "";
            0Aj A0e = AnonymousClass7TE.A0e(suf.A0C(), "shopify_onsite_sdk_webview_curl_performed");
            if (A0e.isSampled()) {
                RIZ riz = RIZ.JS_INJECTION;
                try {
                    Gson gson = suf.A01;
                    Class<JsonElement> cls = JsonElement.class;
                    JsonObject asJsonObject = ((JsonElement) gson.A08(str, cls)).getAsJsonObject();
                    JsonElement jsonElement = asJsonObject.get("url");
                    if (jsonElement == null || (str2 = jsonElement.getAsString()) == null) {
                        str2 = str6;
                    }
                    JsonElement jsonElement2 = asJsonObject.get("method");
                    if (jsonElement2 == null || (asString = jsonElement2.getAsString()) == null) {
                        str3 = str6;
                    } else {
                        str3 = AnonymousClass7TF.A0k(asString);
                    }
                    if (str3.length() > 0) {
                        riw = RIW.valueOf(AnonymousClass7TF.A0k(str3));
                    } else {
                        riw = RIW.CONNECT;
                    }
                    JsonElement jsonElement3 = asJsonObject.get("body");
                    if (jsonElement3 == null || (str4 = ((JsonElement) gson.A05(jsonElement3, cls)).getAsString()) == null) {
                        str4 = str6;
                    }
                    A0e.A8M(riw, "api_request_method");
                    A0e.AAJ("api_endpoint", str2);
                    A0e.AAJ("request_body", str4);
                    String str7 = str5;
                    if (str5 == null) {
                        str7 = str6;
                    }
                    A0e.AAJ("checkout_session_id", str7);
                    A0e.A8M(riz, "request_type");
                    A0e.Cgf();
                } catch (Exception e) {
                    A0e.A8M(RIW.CONNECT, "api_request_method");
                    A0e.AAJ("api_endpoint", str6);
                    A0e.AAJ("request_body", str6);
                    if (str5 == null) {
                        str5 = str6;
                    }
                    A0e.AAJ("checkout_session_id", str5);
                    String message = e.getMessage();
                    if (message != null) {
                        str6 = message;
                    }
                    A0e.AAJ("error_message", str6);
                    A0e.AAJ("error_stacktrace", 2Og.A00(e));
                    A0e.A8M(riz, "request_type");
                    A0e.Cgf();
                }
            }
        }
    }

    public S1X(QQ0 qq0, Q97 q97) {
        this.A00 = qq0;
        this.A01 = q97;
    }
}
