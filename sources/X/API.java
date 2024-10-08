package X;

import android.webkit.DownloadListener;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;

public final class API implements DownloadListener {
    public final /* synthetic */ BrowserLiteFragment A00;
    public final /* synthetic */ QLA A01;

    public API(BrowserLiteFragment browserLiteFragment, QLA qla) {
        this.A00 = browserLiteFragment;
        this.A01 = qla;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.QcV, android.webkit.WebView] */
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        BrowserLiteFragment browserLiteFragment = this.A00;
        if (!browserLiteFragment.A0f(str)) {
            QLA qla = this.A01;
            if (!str.equals(qla.A05())) {
                return;
            }
            if (qla.A0G()) {
                ((SystemWebView) qla).A04.goBack();
            } else if (browserLiteFragment.A1M.size() > 1) {
                BrowserLiteFragment.A0D(browserLiteFragment);
            } else {
                BrowserLiteFragment.A0G(browserLiteFragment, "ON_DOWNLOAD_START");
                browserLiteFragment.AI4(4, str);
            }
        }
    }
}
