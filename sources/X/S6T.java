package X;

import android.webkit.JavascriptInterface;
import com.facebook.browser.lite.webview.SystemWebView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;

public class S6T {
    public WeakReference A00;
    public Map A01 = AnonymousClass7TE.A1H();
    public boolean A02;
    public final C13705TfO A03 = new C12054Slh(this, 0);
    public final C10981S3p A04;
    public final C13705TfO A05 = new C12053Slg();

    public void A01(QLA qla, String str) {
        qla.A0E(this.A05, Pxe.A12(Locale.ROOT, "fbpay.sendMessage(\"%s\")", C66581MXm.A1b(str, 1)), false);
    }

    @JavascriptInterface
    public final void sendMessage(String str) {
        0qQ.A0B(str, 0);
        this.A04.A01(str, (String) null);
    }

    public S6T(C10981S3p s3p) {
        this.A04 = s3p;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.QcV, android.webkit.WebView] */
    public void A00(QLA qla) {
        this.A00 = C51965G9l.A0v(qla);
        ((SystemWebView) qla).A04.addJavascriptInterface(this, "fbpayIAWBridge");
    }
}
