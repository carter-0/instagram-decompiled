package X;

import android.content.Context;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: X.Q8s  reason: case insensitive filesystem */
public final class C7369Q8s extends WebChromeClient {
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (!z2) {
            return false;
        }
        String extra = webView.getHitTestResult().getExtra();
        Context context = webView.getContext();
        if (extra == null) {
            return false;
        }
        new SO4().A01().A00(context, 0cp.A03(extra));
        return true;
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }
}
