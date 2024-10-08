package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class Q93 extends WebViewClient {
    public S3A A00;
    public Executor A01;
    public final List A02 = Pxf.A0v();
    public final List A03 = Pxf.A0v();
    public final List A04 = Pxf.A0v();
    public final List A05 = Pxf.A0v();
    public final List A06 = Pxf.A0v();

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        this.A01.execute(new TIM(webResourceRequest, webView, this));
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.RTx] */
    public Q93(C7902QcU qcU, Executor executor) {
        this.A01 = executor;
        qcU.addJavascriptInterface(new S0C(new C12017Ske(qcU, this)), "_FBIXLoggingBridge");
        ? obj = new Object();
        C10184Ro0 ro0 = new C10184Ro0(this);
        this.A04.add(new C12021Ski(obj));
        this.A02.add(new C12018Skf(ro0, obj));
    }

    public final void A00(String str) {
        if (!AnonymousClass5He.A00(str) && C11429STt.A04(Uri.parse(str))) {
            this.A01.execute(new TFO(this, str));
            S3A s3a = this.A00;
            if (s3a != null) {
                s3a.A00(str);
            }
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.A01.execute(new TIL(webView, this, str));
        A00(str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        A00(str);
        S3A s3a = this.A00;
        if (s3a != null) {
            s3a.A00.execute(new TFP((C7902QcU) webView, s3a));
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (AnonymousClass5He.A00(str) || ReactWebViewManager.BLANK_URL.equals(str)) {
            return true;
        }
        S3A s3a = this.A00;
        if (s3a != null) {
            List list = s3a.A05;
            synchronized (list) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass7TE.A11("shouldOverrideUrlLoading");
                }
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return null;
    }
}
