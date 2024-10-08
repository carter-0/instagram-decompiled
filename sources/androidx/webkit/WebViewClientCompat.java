package androidx.webkit;

import X.AnonymousClass7TE;
import X.C10153RnU;
import X.C9890Rj5;
import X.Pxf;
import X.SDO;
import X.SL3;
import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    public static final String[] A00 = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    public final void onPageCommitVisible(WebView webView, String str) {
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public final boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    public final String[] getSupportedFeatures() {
        return A00;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        Object A002 = SL3.A00(WebResourceErrorBoundaryInterface.class, invocationHandler);
        if (SDO.A00("WEB_RESOURCE_ERROR_GET_CODE") && SDO.A00("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            C10153RnU rnU = C9890Rj5.A00;
            WebResourceError webResourceError = (WebResourceError) rnU.A00.convertWebResourceError(Proxy.getInvocationHandler(A002));
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), Pxf.A0c(webResourceRequest));
        }
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        Object A002 = SL3.A00(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        if (SDO.A00("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            C10153RnU rnU = C9890Rj5.A00;
            ((SafeBrowsingResponse) rnU.A00.convertSafeBrowsingResponse(Proxy.getInvocationHandler(A002))).showInterstitial(true);
            return;
        }
        throw AnonymousClass7TE.A1B("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, Pxf.A0c(webResourceRequest));
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (SDO.A00("WEB_RESOURCE_ERROR_GET_CODE") && SDO.A00("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            if (webResourceError == null) {
                C10153RnU rnU = C9890Rj5.A00;
                webResourceError = (WebResourceError) rnU.A00.convertWebResourceError(Proxy.getInvocationHandler((Object) null));
            }
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), Pxf.A0c(webResourceRequest));
        }
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (SDO.A00("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            if (safeBrowsingResponse == null) {
                C10153RnU rnU = C9890Rj5.A00;
                safeBrowsingResponse = (SafeBrowsingResponse) rnU.A00.convertSafeBrowsingResponse(Proxy.getInvocationHandler((Object) null));
            }
            safeBrowsingResponse.showInterstitial(true);
            return;
        }
        throw AnonymousClass7TE.A1B("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
