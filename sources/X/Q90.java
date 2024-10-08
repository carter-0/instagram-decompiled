package X;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class Q90 extends WebViewClient {
    public final String A00;
    public final /* synthetic */ C11377SQo A01;

    public Q90(C11377SQo sQo, String str) {
        0qQ.A0B(str, 2);
        this.A01 = sQo;
        this.A00 = str;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        DbZ.A0t(0, webView, str, str2);
        super.onReceivedError(webView, i, str, str2);
        C11377SQo.A01(this.A01, this.A00);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001d A[LOOP:0: B:6:0x001d->B:9:0x002b, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r5, java.lang.String r6) {
        /*
            r4 = this;
            X.AnonymousClass7TG.A1N(r5, r6)
            super.onPageFinished(r5, r6)
            X.SQo r3 = r4.A01
            java.lang.String r0 = r4.A00
            monitor-enter(r3)
            java.util.Map r1 = r3.A05     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x002f }
            X.VRk r0 = (X.C17331VRk) r0     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            java.lang.Integer r2 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x002f }
            r0.A00 = r2     // Catch:{ all -> 0x002f }
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r1)     // Catch:{ all -> 0x002f }
        L_0x001d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = X.C51971G9r.A0p(r1)     // Catch:{ all -> 0x002f }
            X.VRk r0 = (X.C17331VRk) r0     // Catch:{ all -> 0x002f }
            java.lang.Integer r0 = r0.A00     // Catch:{ all -> 0x002f }
            if (r0 == r2) goto L_0x001d
        L_0x002d:
            monitor-exit(r3)
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q90.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AnonymousClass7TG.A1T(webView, sslErrorHandler, sslError);
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C11377SQo.A01(this.A01, this.A00);
    }
}
