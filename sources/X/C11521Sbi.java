package X;

import android.webkit.DownloadListener;
import android.webkit.WebView;

/* renamed from: X.Sbi  reason: case insensitive filesystem */
public final class C11521Sbi implements DownloadListener {
    public final /* synthetic */ R8R A00;

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        0qQ.A0B(str, 0);
        R8R r8r = this.A00;
        SQY.A00(r8r.requireContext(), str, false);
        WebView webView = r8r.A02;
        if (webView != null && str.equals(webView.getUrl()) && webView.canGoBack()) {
            webView.goBack();
        }
    }

    public C11521Sbi(R8R r8r) {
        this.A00 = r8r;
    }
}
