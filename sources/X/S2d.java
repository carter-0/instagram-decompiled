package X;

import android.webkit.JavascriptInterface;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.secure.securewebview.SecureWebView;
import org.json.JSONException;
import org.json.JSONObject;

public final class S2d {
    public SecureWebView A00;
    public String A01;
    public String A02;
    public final C58840Ae A03;
    public final String A04 = S2d.class.getSimpleName();

    @JavascriptInterface
    public final void log(String str) {
        0qQ.A0B(str, 0);
        String str2 = this.A04;
        try {
            JSONObject A17 = C66580MXl.A17(str);
            String string = A17.getString("event");
            String string2 = A17.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            V1W valueOf = V1W.valueOf(Pxe.A0y("surface", A17));
            String string3 = A17.getString("extra_data_json");
            0Aj A0d = C51969G9p.A0d(this.A03, "commerce_third_party_marketing_tag_fire");
            if (A0d.isSampled()) {
                A0d.AAJ("event_type", string);
                A0d.AAJ("global_site_tag_id", string2);
                A0d.A8M(valueOf, "surface");
                A0d.AAJ("extra_data_json", string3);
                A0d.Cgf();
            }
        } catch (JSONException e) {
            0KC.A0F(str2, "JSONException when parsing message from WebView", e);
        }
    }

    public S2d(C307786Rm r2) {
        this.A03 = AnonymousClass0kN.A02(C308206Td.A0A(r2));
    }
}
