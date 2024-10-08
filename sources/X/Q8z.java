package X;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.views.webview.ReactWebViewManager;

public final class Q8z extends WebView implements C13773Tgo {
    public Q92 A00;
    public String A01;
    public boolean A02;
    public boolean A03;

    public final void onHostPause() {
    }

    public final void onHostResume() {
    }

    public Q92 getReactWebViewClient() {
        return this.A00;
    }

    public final void onHostDestroy() {
        if (this.A02) {
            CookieManager.getInstance().removeAllCookies(new C11523Sbk(1));
        }
        setWebViewClient((WebViewClient) null);
        destroy();
    }

    public void setClearCookiesOnExit(boolean z) {
        this.A02 = z;
    }

    public void setInjectedJavaScript(String str) {
        this.A01 = str;
    }

    public void setMessagingEnabled(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            if (z) {
                addJavascriptInterface(new S1F(this, this), ReactWebViewManager.BRIDGE_NAME);
                if (this.A03) {
                    evaluateJavascript("(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})", (ValueCallback) null);
                    return;
                }
                return;
            }
            removeJavascriptInterface(ReactWebViewManager.BRIDGE_NAME);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.A00 = (Q92) webViewClient;
    }
}
