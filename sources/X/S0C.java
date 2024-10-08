package X;

import android.webkit.JavascriptInterface;

public final class S0C {
    public final C13546TcI A00;

    @JavascriptInterface
    public void log(String str) {
        try {
            this.A00.onLog(str);
        } catch (Exception e) {
            0KC.A05(S0C.class, "Log message failed", e);
        }
    }

    public S0C(C13546TcI tcI) {
        this.A00 = tcI;
    }
}
