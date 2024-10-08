package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.shopify.checkout.models.Authentication;
import com.shopify.checkout.models.CheckoutOptions;
import com.shopify.checkout.models.Defaults;
import com.shopify.checkout.models.errors.ParsableInternalErrorCode;
import com.shopify.checkout.models.errors.ParsableInternalErrorPayload;
import com.shopify.checkout.models.errors.ParsableInternalErrorReasons;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;

public final class Q97 extends WebViewClient {
    public WebView A00;
    public QQ0 A01;
    public C10328RqQ A02;
    public Authentication A03;
    public CheckoutOptions A04;
    public RqR A05;
    public C9871Rik A06;
    public String A07;
    public 0sJ A08;
    public final 0sL A09;

    public final void onPageFinished(WebView webView, String str) {
        AnonymousClass7TF.A1H(webView, str);
        super.onPageFinished(webView, str);
        webView.scrollTo(0, 0);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Map A1E;
        if (webResourceRequest != null) {
            RqR rqR = this.A05;
            String str = null;
            if (rqR != null) {
                String A0j = AnonymousClass7TF.A0j(rqR.A00.name());
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                if (requestHeaders != null) {
                    str = requestHeaders.get("Sec-CH-Prefers-Color-Scheme");
                }
                if (str == null && A0j.length() > 0 && webResourceRequest.isForMainFrame()) {
                    Map<String, String> requestHeaders2 = webResourceRequest.getRequestHeaders();
                    if (requestHeaders2 != null) {
                        A1E = new LinkedHashMap(requestHeaders2);
                    } else {
                        A1E = AnonymousClass7TE.A1E();
                    }
                    A1E.put("Sec-CH-Prefers-Color-Scheme", A0j);
                    Authentication authentication = this.A03;
                    if (authentication != null) {
                        String A022 = C250863mB.A03.A02(authentication, C360578eo.A00(C20520Wt0.A00));
                        if (this.A05 != null) {
                            A1E.put("Shopify-Checkout-Sheet-Protocol-Consumer", A022);
                        }
                    }
                    if (webView != null) {
                        webView.loadUrl(Pxf.A0c(webResourceRequest), A1E);
                    }
                    return true;
                }
            }
            0qQ.A0F("checkoutProtocolConfig");
            throw AnonymousClass00P.createAndThrow();
        }
        return false;
    }

    private final void A00(ParsableInternalErrorCode parsableInternalErrorCode, Exception exc) {
        C255463uA[] r0 = ParsableInternalErrorPayload.A04;
        ParsableInternalErrorPayload parsableInternalErrorPayload = new ParsableInternalErrorPayload(parsableInternalErrorCode, exc.toString());
        C10328RqQ rqQ = this.A02;
        if (rqQ != null) {
            QQ0 qq0 = rqQ.A00;
            String A002 = QQ0.A00(AnonymousClass7TE.A1I(parsableInternalErrorPayload));
            SUF suf = qq0.A01;
            if (suf != null) {
                String str = qq0.A0B;
                if (str == null) {
                    str = "";
                }
                suf.A0E(str, qq0.A06, qq0.A0A, qq0.A03, A002, qq0.A09, qq0.A02);
            }
        }
    }

    public static void A01(Q97 q97, Exception exc, Integer num, String str) {
        C19856Wgb wgb = new C19856Wgb(exc, num, str);
        C10328RqQ rqQ = q97.A02;
        if (rqQ != null) {
            QQ0 qq0 = rqQ.A00;
            List singletonList = Collections.singletonList(wgb);
            0qQ.A07(singletonList);
            qq0.A02(singletonList);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Defaults defaults;
        CheckoutOptions checkoutOptions = this.A04;
        if (!(checkoutOptions == null || (defaults = checkoutOptions.A01) == null)) {
            try {
                if (this.A06 == null) {
                    0qQ.A0F("scriptBuilder");
                    throw AnonymousClass00P.createAndThrow();
                }
                C250873mC r1 = C250863mB.A03;
                C255463uA[] r0 = Defaults.A04;
                String A0S = 002.A0S("window.mobileCheckoutSdkIdentity = ", r1.A02(defaults, C20527Wt8.A00), ';');
                WebView webView2 = this.A00;
                if (webView2 != null) {
                    webView2.evaluateJavascript(A0S, (ValueCallback) null);
                }
            } catch (Exception e) {
                A01(this, e, AnonymousClass05K.A0C, "fail_to_encode_buyer_identity");
            }
        }
        CheckoutOptions checkoutOptions2 = this.A04;
        if (checkoutOptions2 != null && checkoutOptions2.A03) {
            try {
                WebView webView3 = this.A00;
                if (webView3 != null) {
                    if (this.A06 != null) {
                        webView3.evaluateJavascript("\n      (function() {\n          var open = XMLHttpRequest.prototype.open;\n          XMLHttpRequest.prototype.open = function(method, url, async, user, password) {\n              // Intercept XHR requests and send details to native side\n              const body = JSON.stringify({\n                  method: method,\n                  url: url,\n                  async: async\n              });\n              window.CheckoutSheetProtocolConsumer.postMessage(JSON.stringify(\n                  {\n                      name: 'interceptXHR',\n                      body: body\n                  }\n              ));\n              open.call(this, method, url, async, user, password);\n          };\n      })();\n      ", (ValueCallback) null);
                    }
                    0qQ.A0F("scriptBuilder");
                    throw AnonymousClass00P.createAndThrow();
                }
                WebView webView4 = this.A00;
                if (webView4 != null) {
                    if (this.A06 != null) {
                        webView4.evaluateJavascript("\n        (function() {\n            var originalFetch = window.fetch;\n            window.fetch = function(url, options) {\n                // Intercept Fetch API requests and send details to native side\n                window.CheckoutSheetProtocolConsumer.postMessage(JSON.stringify(\n                    {\n                        name: 'interceptFetch',\n                        body: JSON.stringify({\n                            url: url,\n                            options: options\n                        })\n                    }\n                    ));\n                return originalFetch.apply(this, arguments);\n            };\n        })();\n        ", (ValueCallback) null);
                    }
                    0qQ.A0F("scriptBuilder");
                    throw AnonymousClass00P.createAndThrow();
                }
            } catch (Exception e2) {
                A01(this, e2, AnonymousClass05K.A0N, "meta_only_error_fail_to_run_injected_script");
            }
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public Q97(QQ0 qq0) {
        this.A09 = new C59344JFw(qq0, 30);
        this.A08 = new JK0(qq0, 2);
        this.A01 = qq0;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        RKW rkw = new RKW(webResourceError, webResourceRequest, (WebResourceResponse) null);
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            A01(this, rkw, AnonymousClass05K.A00, "webview_on_error");
        }
        ParsableInternalErrorCode parsableInternalErrorCode = ParsableInternalErrorCode.A03;
        EnumEntries enumEntries = ParsableInternalErrorReasons.A01;
        A00(parsableInternalErrorCode, rkw);
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        RKW rkw = new RKW((WebResourceError) null, webResourceRequest, webResourceResponse);
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            A01(this, rkw, AnonymousClass05K.A00, "webview_on_error");
        }
        ParsableInternalErrorCode parsableInternalErrorCode = ParsableInternalErrorCode.A03;
        EnumEntries enumEntries = ParsableInternalErrorReasons.A01;
        A00(parsableInternalErrorCode, rkw);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri uri;
        Map<String, String> map;
        String format = new DateTimeFormatterBuilder().appendInstant(0).toFormatter().withZone(ZoneId.systemDefault()).format(Instant.now());
        0sJ r4 = this.A08;
        String str = null;
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        String valueOf = String.valueOf(uri);
        if (webResourceRequest != null) {
            map = webResourceRequest.getRequestHeaders();
            str = webResourceRequest.getMethod();
        } else {
            map = null;
        }
        String valueOf2 = String.valueOf(str);
        0qQ.A0A(format);
        r4.invoke(valueOf, map, valueOf2, format);
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
