package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class Q91 extends WebViewClient {
    public final /* synthetic */ Q5J A00;

    public Q91(Q5J q5j) {
        this.A00 = q5j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "fbconnect://success"
            boolean r0 = r11.startsWith(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0095
            X.Q5J r3 = r9.A00
            r6 = 0
            android.os.Bundle r7 = X.C11406SSd.A01(r11)
            java.lang.String r0 = "error"
            java.lang.String r5 = r7.getString(r0)
            if (r5 != 0) goto L_0x001e
            java.lang.String r0 = "error_type"
            java.lang.String r5 = r7.getString(r0)
        L_0x001e:
            java.lang.String r0 = "error_msg"
            java.lang.String r8 = r7.getString(r0)
            if (r8 != 0) goto L_0x0034
            java.lang.String r0 = "error_message"
            java.lang.String r8 = r7.getString(r0)
            if (r8 != 0) goto L_0x0034
            java.lang.String r0 = "error_description"
            java.lang.String r8 = r7.getString(r0)
        L_0x0034:
            java.lang.String r0 = "error_code"
            java.lang.String r1 = r7.getString(r0)
            boolean r0 = X.C11406SSd.A05(r1)
            r4 = -1
            if (r0 != 0) goto L_0x0050
            if (r1 == 0) goto L_0x0048
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0050 }
            goto L_0x0051
        L_0x0048:
            java.lang.String r1 = "errorCodeString is null"
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ NumberFormatException -> 0x0050 }
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x0050 }
            throw r0     // Catch:{ NumberFormatException -> 0x0050 }
        L_0x0050:
            r1 = -1
        L_0x0051:
            boolean r0 = X.C11406SSd.A05(r5)
            if (r0 == 0) goto L_0x0070
            boolean r0 = X.C11406SSd.A05(r8)
            if (r0 == 0) goto L_0x0070
            if (r1 != r4) goto L_0x0070
            X.TcU r1 = r3.A04
            if (r1 == 0) goto L_0x006f
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x006f
            r3.A07 = r2
            r1.D50(r7, r6)
            r3.dismiss()
        L_0x006f:
            return r2
        L_0x0070:
            if (r5 == 0) goto L_0x0086
            java.lang.String r0 = "access_denied"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0086
        L_0x0082:
            r3.cancel()
            return r2
        L_0x0086:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r1 == r0) goto L_0x0082
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.Rnu r0 = new X.Rnu
            r0.<init>(r1)
            r3.A02(r0)
            return r2
        L_0x0095:
            java.lang.String r0 = "fbconnect://cancel"
            boolean r0 = r11.startsWith(r0)
            if (r0 == 0) goto L_0x00a3
            X.Q5J r0 = r9.A00
            r0.cancel()
            return r2
        L_0x00a3:
            java.lang.String r0 = "touch"
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x00ae
            r2 = 0
            return r2
        L_0x00ae:
            android.net.Uri r1 = X.0cp.A03(r11)
            X.Q5J r0 = r9.A00
            android.content.Context r0 = r0.getContext()
            X.0kR.A0F(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q91.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Q5J q5j = this.A00;
        if (!q5j.A06) {
            q5j.A00.dismiss();
        }
        q5j.A02.setBackgroundColor(0);
        q5j.A01.setVisibility(0);
        q5j.A03.setVisibility(0);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Q5J q5j = this.A00;
        if (!q5j.A06) {
            AnonymousClass0fN.A00(q5j.A00);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.A00.A02(new C10179Rnu(AnonymousClass05K.A0C));
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        sslErrorHandler.cancel();
        this.A00.A02(new C10179Rnu(AnonymousClass05K.A0C));
    }
}
