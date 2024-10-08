package X;

import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;
import java.util.Stack;

public final class TB9 implements Runnable {
    public final /* synthetic */ BrowserLiteFragment A00;

    public TB9(BrowserLiteFragment browserLiteFragment) {
        this.A00 = browserLiteFragment;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.QcV, android.webkit.WebView] */
    public final void run() {
        Stack stack = this.A00.A1M;
        if (!stack.isEmpty()) {
            ((SystemWebView) ((RRE) stack.peek())).A04.reload();
        }
    }
}
