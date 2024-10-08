package X;

import com.facebook.browser.lite.webview.SystemWebView;

public final class TBM implements Runnable {
    public final /* synthetic */ QLA A00;

    public TBM(QLA qla) {
        this.A00 = qla;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.QcV, android.webkit.WebView] */
    public final void run() {
        ((SystemWebView) this.A00).A04.reload();
    }
}
