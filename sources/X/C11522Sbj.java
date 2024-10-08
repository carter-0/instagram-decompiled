package X;

import android.webkit.DownloadListener;
import android.webkit.WebView;

/* renamed from: X.Sbj  reason: case insensitive filesystem */
public final class C11522Sbj implements DownloadListener {
    public final /* synthetic */ WebView A00;
    public final /* synthetic */ R8Q A01;

    public C11522Sbj(WebView webView, R8Q r8q) {
        this.A01 = r8q;
        this.A00 = webView;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        SQY.A00(this.A01.requireContext(), str, false);
        WebView webView = this.A00;
        if (0qQ.A0K(str, webView.getUrl()) && webView.canGoBack()) {
            webView.goBack();
        }
    }
}
