package X;

import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;

public final class APV implements C13907Tl7 {
    public final /* synthetic */ BrowserLiteFragment A00;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public APV(BrowserLiteFragment browserLiteFragment) {
        this.A00 = browserLiteFragment;
    }

    public final void onPause(AnonymousClass07Z r3) {
        BrowserLiteFragment browserLiteFragment = this.A00;
        BrowserLiteFragment.A0E(browserLiteFragment, browserLiteFragment.C8U());
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.QcV, android.webkit.WebView] */
    public final void onResume(AnonymousClass07Z r2) {
        QLA C8U = this.A00.C8U();
        if (C8U != null) {
            ? r0 = ((SystemWebView) C8U).A04;
            r0.onResume();
            r0.resumeTimers();
        }
    }
}
