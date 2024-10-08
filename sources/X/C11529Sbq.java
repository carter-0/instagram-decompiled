package X;

import android.graphics.Picture;
import android.webkit.WebView;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.webview.ReactWebViewManager;

/* renamed from: X.Sbq  reason: case insensitive filesystem */
public final class C11529Sbq implements WebView.PictureListener {
    public final /* synthetic */ ReactWebViewManager A00;

    public C11529Sbq(ReactWebViewManager reactWebViewManager) {
        this.A00 = reactWebViewManager;
    }

    public final void onNewPicture(WebView webView, Picture picture) {
        ReactWebViewManager.dispatchEvent(webView, new C7839QbM(UIManagerHelper.A01(webView), webView.getId(), webView.getWidth(), webView.getContentHeight()));
    }
}
