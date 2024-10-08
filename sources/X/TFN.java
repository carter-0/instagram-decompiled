package X;

import android.webkit.ValueCallback;

public final class TFN implements Runnable {
    public final /* synthetic */ C7902QcU A00;
    public final /* synthetic */ String A01;

    public TFN(C7902QcU qcU, String str) {
        this.A00 = qcU;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.QcU, android.webkit.WebView] */
    public final void run() {
        ? r3 = this.A00;
        String str = this.A01;
        String A0R = 002.A0R("javascript: ", str);
        try {
            r3.evaluateJavascript(str, (ValueCallback) null);
        } catch (IllegalStateException unused) {
            r3.loadUrl(A0R);
        }
    }
}
