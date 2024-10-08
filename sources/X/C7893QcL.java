package X;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* renamed from: X.QcL  reason: case insensitive filesystem */
public final class C7893QcL extends S7B {
    public final long A00;
    public final /* synthetic */ SOF A01;

    public final void A00(WebView webView, int i, String str, String str2) {
        DbZ.A0t(0, webView, str, str2);
        super.A00(webView, i, str, str2);
        this.A01.A02(this.A00, i, str);
    }

    public C7893QcL(SOF sof, long j) {
        this.A01 = sof;
        this.A00 = j;
    }

    public final void A01(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AnonymousClass7TG.A1T(webView, sslErrorHandler, sslError);
        super.A01(webView, sslErrorHandler, sslError);
        this.A01.A02(this.A00, sslError.getPrimaryError(), "");
    }

    public final void A03(WebView webView, String str) {
        AnonymousClass7TG.A1N(webView, str);
        super.A03(webView, str);
        SOF sof = this.A01;
        long j = this.A00;
        synchronized (sof) {
            C10844Rz4 rz4 = (C10844Rz4) sof.A03.get(Long.valueOf(j));
            if (rz4 != null) {
                rz4.A04 = AnonymousClass05K.A0C;
                rz4.A01 = sof.A01.now() - rz4.A02;
                SOF.A00(sof, j);
                SOF.A01(sof, j);
            }
        }
    }
}
