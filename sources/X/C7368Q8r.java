package X;

import android.net.Uri;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import net.trustly.android.sdk.views.TrustlyView;

/* renamed from: X.Q8r  reason: case insensitive filesystem */
public final class C7368Q8r extends WebChromeClient {
    public final /* synthetic */ TrustlyView A00;
    public final /* synthetic */ TrustlyView A01;

    public C7368Q8r(TrustlyView trustlyView, TrustlyView trustlyView2) {
        this.A00 = trustlyView;
        this.A01 = trustlyView2;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        String extra = hitTestResult.getExtra();
        if (hitTestResult.getType() == 0) {
            Q9m q9m = new Q9m(webView.getContext());
            this.A01.addView(q9m);
            ((WebView.WebViewTransport) message.obj).setWebView(q9m.A00);
            message.sendToTarget();
            return true;
        }
        new SO4().A01().A00(webView.getContext(), Uri.parse(extra));
        return false;
    }
}
