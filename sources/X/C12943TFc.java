package X;

import com.facebook.browser.lite.webview.SystemWebView;

/* renamed from: X.TFc  reason: case insensitive filesystem */
public final class C12943TFc implements Runnable {
    public final /* synthetic */ C7576QKr A00;
    public final /* synthetic */ String A01;

    public C12943TFc(C7576QKr qKr, String str) {
        this.A00 = qKr;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.QcV, android.webkit.WebView] */
    public final void run() {
        QLA qla = this.A00.A00;
        if (qla != null) {
            ((SystemWebView) qla).A04.loadUrl(this.A01);
        }
    }
}
