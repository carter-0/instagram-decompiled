package X;

import android.content.Context;
import android.webkit.WebView;

/* renamed from: X.Spi  reason: case insensitive filesystem */
public final class C12228Spi implements C253183qL {
    public final /* synthetic */ C276544tV A00;

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public C12228Spi(C276544tV r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        WebView webView = (WebView) obj;
        if (!this.A00.A0R(43, false)) {
            return null;
        }
        webView.getSettings().setUserAgentString(1Ch.A01(webView.getSettings().getUserAgentString()));
        return null;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        WebView webView = (WebView) obj;
        if (this.A00.A0R(43, false)) {
            webView.getSettings().setUserAgentString((String) null);
        }
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
