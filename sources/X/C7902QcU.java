package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import com.facebook.secure.webkit.WebView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QcU  reason: case insensitive filesystem */
public final class C7902QcU extends WebView {
    public Q93 A00;
    public C9219RTw A01;
    public boolean A02 = true;
    public final List A03 = AnonymousClass7TE.A1C();

    public C7902QcU(Context context, C9219RTw rTw) {
        super(context, (AttributeSet) null, 16842885);
        this.A01 = rTw;
    }

    public Q93 getWebViewClient() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.QcU, android.webkit.WebView] */
    public final void A00(String str) {
        Looper mainLooper = Looper.getMainLooper();
        if (Looper.myLooper() == mainLooper) {
            String A0R = 002.A0R("javascript: ", str);
            try {
                evaluateJavascript(str, (ValueCallback) null);
            } catch (IllegalStateException unused) {
                loadUrl(A0R);
            }
        } else {
            new Handler(mainLooper).post(new TFN(this, str));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.QcU, android.view.View, android.webkit.WebView] */
    public final void onDraw(Canvas canvas) {
        C7902QcU.super.onDraw(canvas);
        if (this.A02 && computeVerticalScrollRange() > getHeight()) {
            this.A02 = false;
            Iterator it = this.A03.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("onFirstScrollReady");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.QcU, android.webkit.WebView] */
    public void setWebViewClient(WebViewClient webViewClient) {
        C7902QcU.super.setWebViewClient(webViewClient);
        this.A00 = (Q93) webViewClient;
    }
}
