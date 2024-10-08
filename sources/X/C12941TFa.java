package X;

import com.facebook.browser.lite.webview.SystemWebView;

/* renamed from: X.TFa  reason: case insensitive filesystem */
public final class C12941TFa implements Runnable {
    public final /* synthetic */ QLA A00;
    public final /* synthetic */ String A01;

    public C12941TFa(QLA qla, String str) {
        this.A00 = qla;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.QcV, android.webkit.WebView] */
    public final void run() {
        QLA qla = this.A00;
        ((SystemWebView) qla).A04.loadUrl(this.A01);
    }
}
