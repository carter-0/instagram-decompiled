package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.secure.securewebview.SecureWebView;

public final class Q96 extends WebViewClient {
    public boolean A00 = false;
    public final S7B A01;

    private boolean A00(WebView webView, String str, boolean z) {
        Integer A012;
        C10725Rx3 rx3;
        if (!(webView instanceof SecureWebView)) {
            return false;
        }
        SecureWebView secureWebView = (SecureWebView) webView;
        this.A00 = true;
        S4j s4j = secureWebView.A01;
        if (z) {
            A012 = s4j.A00(secureWebView.getContext(), str);
        } else {
            A012 = s4j.A01(str);
        }
        boolean A1a = C51969G9p.A1a(A012, AnonymousClass05K.A00);
        S7B s7b = this.A01;
        if ((s7b instanceof C7892QcK) && (rx3 = ((C7892QcK) s7b).A00) != null) {
            C276544tV r6 = rx3.A04;
            if (!r6.A0R(44, true)) {
                C277014uI A08 = r6.A08();
                C10523Rtc rtc = rx3.A02;
                if (!str.equals(rtc.A01) && A08 != null) {
                    C307886Rw.A03(rx3.A03, r6, DbY.A0Q(str), A08);
                }
                C277014uI A0A = r6.A0A(48);
                if (!str.equals(rtc.A01) && A0A != null) {
                    C308276Tl A0P = DbS.A0P();
                    A0P.A03(str, 0);
                    C307786Rm r0 = rx3.A03;
                    A0P.A03(r0, 1);
                    DbT.A1R(r0, r6, A0P, A0A);
                }
            }
        }
        if (!A1a) {
            return false;
        }
        this.A00 = false;
        return true;
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.A01.A01.doUpdateVisitedHistory(webView, str, z);
    }

    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.A01.A01.onFormResubmission(webView, message, message2);
    }

    public final void onLoadResource(WebView webView, String str) {
        this.A01.A01.onLoadResource(webView, str);
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        this.A01.A01.onPageCommitVisible(webView, str);
    }

    public final void onPageFinished(WebView webView, String str) {
        this.A01.A03(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof SecureWebView) {
            if (this.A00) {
                this.A00 = false;
            }
            this.A01.A04(webView, str, bitmap);
        }
    }

    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.A01.A01.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A01.A02(webView, webResourceRequest, webResourceError);
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.A01.A01.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.A01.A01.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.A01.A01.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A01.A01(webView, sslErrorHandler, sslError);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.A01.A01.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        this.A01.A01.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    public final void onScaleChanged(WebView webView, float f, float f2) {
        this.A01.A01.onScaleChanged(webView, f, f2);
    }

    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.A01.A01.onUnhandledKeyEvent(webView, keyEvent);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.A01.A01.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.A01.A01.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public Q96(S7B s7b) {
        this.A01 = s7b;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A00(webView, Pxf.A0c(webResourceRequest), AnonymousClass7TF.A1P(webResourceRequest.isForMainFrame() ? 1 : 0));
    }

    @Deprecated
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.A01.A00(webView, i, str, str2);
    }

    @Deprecated
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A00(webView, str, true);
    }
}
