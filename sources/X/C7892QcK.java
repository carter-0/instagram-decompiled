package X;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: X.QcK  reason: case insensitive filesystem */
public final class C7892QcK extends S7B {
    public C10725Rx3 A00;

    public final void A02(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.A02(webView, webResourceRequest, webResourceError);
        C10725Rx3 rx3 = this.A00;
        if (rx3 != null) {
            int errorCode = webResourceError.getErrorCode();
            String charSequence = webResourceError.getDescription().toString();
            String A0c = Pxf.A0c(webResourceRequest);
            C276544tV r3 = rx3.A04;
            C277014uI A09 = r3.A09();
            if (A09 != null) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("domain", A0c);
                C66581MXm.A1S(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, A1E, errorCode);
                A1E.put(DevServerEntity.COLUMN_DESCRIPTION, charSequence);
                C307886Rw.A03(rx3.A03, r3, Pxj.A0a(A1E), A09);
            }
        }
    }

    public final void A03(WebView webView, String str) {
        super.A03(webView, str);
        C10725Rx3 rx3 = this.A00;
        if (rx3 != null) {
            C276544tV r3 = rx3.A04;
            String str2 = "";
            String A0H = r3.A0H();
            if (A0H != null) {
                str2 = A0H;
            }
            String str3 = "";
            String A0I = r3.A0I();
            if (A0I != null) {
                str3 = A0I;
            }
            String str4 = "";
            String A0G = r3.A0G();
            if (A0G != null) {
                str4 = A0G;
            }
            if ("POST".equals(str4) && !"".equals(str3) && str.contains("<html> <head>  <script> function post(input) { var sourceURI = input['inlineUrl'];var params = input['bodyParams'];var method = \"POST\"; var form = document.createElement(\"form\"); form.setAttribute(\"method\", method);   form.setAttribute(\"action\", sourceURI); var jsonObj = JSON.parse(params);for(var key in jsonObj) { if(jsonObj.hasOwnProperty(key)) { var hiddenField = document.createElement(\"input\");   hiddenField.setAttribute(\"type\", \"hidden\");    hiddenField.setAttribute(\"name\", key);      hiddenField.setAttribute(\"value\", jsonObj[key]);          form.appendChild(hiddenField); } } document.body.appendChild(form);form.submit(); }   </script>  </head> <body></body> </html>")) {
                try {
                    rx3.A01.evaluateJavascript(String.format("post(%s)", new Object[]{DbS.A11().put("inlineUrl", str2).put("bodyParams", str3).toString()}), (ValueCallback) null);
                } catch (JSONException e) {
                    1Kn.A03("json exception body params needs to be in json format", e);
                }
            }
            C10523Rtc rtc = rx3.A02;
            rtc.A01 = str;
            if (rtc.A02) {
                rtc.A00.A04(rx3.A01.canGoBack());
            }
            C277014uI A0A = r3.A0A(52);
            if (A0A != null) {
                C307886Rw.A03(rx3.A03, r3, DbY.A0Q(str), A0A);
            }
        }
    }

    public final void A04(WebView webView, String str, Bitmap bitmap) {
        super.A04(webView, str, bitmap);
        C10725Rx3 rx3 = this.A00;
        if (rx3 != null) {
            C276544tV r5 = rx3.A04;
            C277014uI A0A = r5.A0A(51);
            if (A0A != null) {
                C307886Rw.A03(rx3.A03, r5, Pxj.A0a(str), A0A);
            }
            if (r5.A0R(44, true)) {
                C277014uI A08 = r5.A08();
                C10523Rtc rtc = rx3.A02;
                if (!str.equals(rtc.A01) && A08 != null) {
                    C307886Rw.A03(rx3.A03, r5, Pxj.A0a(str), A08);
                }
                C277014uI A0A2 = r5.A0A(48);
                if (!str.equals(rtc.A01) && A0A2 != null) {
                    C308276Tl A0T = DbU.A0T(str);
                    C307786Rm r0 = rx3.A03;
                    A0T.A03(r0, 1);
                    DbT.A1R(r0, r5, A0T, A0A2);
                }
            }
        }
    }
}
