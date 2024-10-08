package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.instagram.android.R;

/* renamed from: X.Q8t  reason: case insensitive filesystem */
public final class C7370Q8t extends WebChromeClient {
    public final Context A00;
    public final C10373RrA A01;
    public final /* synthetic */ C11382SQu A02;

    public final void onCloseWindow(WebView webView) {
        0qQ.A0B(webView, 0);
        C11382SQu sQu = this.A02;
        if (webView == sQu.A0D.peek()) {
            C11382SQu.A02(sQu);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.QcU, android.webkit.WebView] */
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        AnonymousClass7TF.A1C(webView, 0, message);
        C11382SQu sQu = this.A02;
        0qQ.A0B(webView, 0);
        if (webView != sQu.A0D.peek() || !z2) {
            return false;
        }
        ? A002 = C11382SQu.A00(sQu);
        Object obj = message.obj;
        if (!(obj instanceof WebView.WebViewTransport)) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
        ((WebView.WebViewTransport) obj).setWebView(A002);
        message.sendToTarget();
        return true;
    }

    public C7370Q8t(Context context, ProgressBar progressBar, C11382SQu sQu) {
        this.A02 = sQu;
        this.A00 = context;
        this.A01 = new C10373RrA(progressBar);
    }

    public final Bitmap getDefaultVideoPoster() {
        try {
            return BitmapFactory.decodeResource(this.A00.getResources(), R.drawable.play_icon);
        } catch (Exception unused) {
            return super.getDefaultVideoPoster();
        }
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        AnonymousClass7TF.A0D().post(new TIK(webView, this.A01, i));
        C7902QcU qcU = (C7902QcU) webView;
        if (i > 10) {
            qcU.A00("(function() {\n  if (!('__FBLoadedIndicator' in window) \n      && typeof(_FBIXLoggingBridge) !== 'undefined') {\n    window.__FBLoadedIndicator = true;\n    _FBIXLoggingBridge.log('FB_IX_PAGE_READY' + window.location.href);\n  }\n}());");
        }
    }
}
