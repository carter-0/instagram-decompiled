package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.secure.securewebview.SecureWebView;
import org.json.JSONException;
import org.json.JSONObject;

public final class R9H extends C14097Tpp {
    public final C58840Ae A00;

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r8, C276544tV r9, Object obj) {
        WebView webView = (WebView) view;
        DbY.A1S(webView, r9);
        String A0D = r9.A0D();
        if (A0D != null) {
            String A0F = r9.A0F();
            if (A0F != null) {
                webView.loadDataWithBaseURL(A0D, A0F, ReactWebViewManager.HTML_MIME_TYPE, ReactWebViewManager.HTML_ENCODING, (String) null);
                return null;
            }
            throw AnonymousClass7TE.A15("source cannot be null");
        }
        throw AnonymousClass7TE.A15("baseUrl cannot be null");
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        SecureWebView secureWebView = new SecureWebView(context);
        Pxk.A0T(secureWebView);
        Pxk.A0S(secureWebView);
        secureWebView.getSettings().setJavaScriptEnabled(true);
        secureWebView.addJavascriptInterface(this, "_MetaCommerceThirdPartyMarketingTag");
        return secureWebView;
    }

    @JavascriptInterface
    public final void log(String str) {
        0qQ.A0B(str, 0);
        try {
            JSONObject A17 = C66580MXl.A17(str);
            String string = A17.getString("event");
            String string2 = A17.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            V1W valueOf = V1W.valueOf(Pxe.A0y("surface", A17));
            String string3 = A17.getString("extra_data_json");
            0Aj A0d = C51969G9p.A0d(this.A00, "commerce_third_party_marketing_tag_fire");
            if (A0d.isSampled()) {
                A0d.AAJ("event_type", string);
                A0d.AAJ("global_site_tag_id", string2);
                A0d.A8M(valueOf, "surface");
                A0d.AAJ("extra_data_json", string3);
                A0d.Cgf();
            }
        } catch (JSONException e) {
            0KC.A0F("BkBloksComponentsCommerceMarketingTagRenderUnit", "JSONException when parsing message from WebView", e);
        }
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r3, C276544tV r4, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        0qQ.A0B(viewGroup, 0);
        viewGroup.removeAllViews();
    }

    public R9H(C307786Rm r2, C276544tV r3) {
        super(r2, r3);
        this.A00 = AnonymousClass0kN.A02(C308206Td.A0A(r2));
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }
}
