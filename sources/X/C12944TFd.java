package X;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;

/* renamed from: X.TFd  reason: case insensitive filesystem */
public final class C12944TFd implements Runnable {
    public final /* synthetic */ PrefetchCacheEntry A00;
    public final /* synthetic */ S3N A01;

    public C12944TFd(PrefetchCacheEntry prefetchCacheEntry, S3N s3n) {
        this.A01 = s3n;
        this.A00 = prefetchCacheEntry;
    }

    public final void run() {
        S3N s3n = this.A01;
        WebView webView = s3n.A01;
        if (webView == null) {
            com.facebook.secure.webkit.WebView webView2 = new com.facebook.secure.webkit.WebView(s3n.A07);
            WebSettings settings = webView2.getSettings();
            settings.setAllowFileAccess(false);
            try {
                settings.setJavaScriptEnabled(true);
            } catch (NullPointerException unused) {
            }
            settings.setBlockNetworkLoads(true);
            webView2.setWebViewClient(new Q95(s3n, 0));
            s3n.A01 = webView2;
        } else {
            webView.stopLoading();
        }
        PrefetchCacheEntry prefetchCacheEntry = this.A00;
        String str = prefetchCacheEntry.A03;
        s3n.A04 = str;
        s3n.A03 = prefetchCacheEntry;
        s3n.A00 = System.currentTimeMillis();
        s3n.A01.loadUrl(str);
    }
}
