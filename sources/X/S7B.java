package X;

import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.endtoend.EndToEnd;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class S7B {
    public ArrayList A00 = AnonymousClass7TE.A1C();
    public final WebViewClient A01 = new WebViewClient();

    @Deprecated
    public void A00(WebView webView, int i, String str, String str2) {
        this.A01.onReceivedError(webView, i, str, str2);
    }

    public void A02(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A01.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void A03(WebView webView, String str) {
        this.A01.onPageFinished(webView, str);
    }

    public void A04(WebView webView, String str, Bitmap bitmap) {
        this.A01.onPageStarted(webView, str, bitmap);
    }

    public void A01(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        SslCertificate certificate = sslError.getCertificate();
        if (EndToEnd.isRunningEndToEndTest() && certificate != null) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                if (JTQ.A1Y(it.next(), certificate.toString())) {
                    sslErrorHandler.proceed();
                    return;
                }
            }
        }
        this.A01.onReceivedSslError(webView, sslErrorHandler, sslError);
    }
}
