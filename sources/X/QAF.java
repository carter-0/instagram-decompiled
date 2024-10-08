package X;

import com.facebook.secure.securewebview.SecureWebView;

public final class QAF extends 00I {
    public SecureWebView A00;

    public QAF() {
        super(false);
    }

    public final void A01() {
        boolean z;
        SecureWebView secureWebView = this.A00;
        if (secureWebView == null || !secureWebView.canGoBack()) {
            z = false;
        } else {
            this.A00.goBack();
            z = this.A00.canGoBack();
        }
        A04(z);
    }
}
