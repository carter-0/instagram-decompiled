package X;

import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: X.S3m  reason: case insensitive filesystem */
public final class C10978S3m {
    public WebViewProviderBoundaryInterface A00;

    public final void A00() {
        this.A00.removeWebMessageListener("fbpayIAWIFrameBridge");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.TPr] */
    public final void A01(TZi tZi, String[] strArr) {
        WebViewProviderBoundaryInterface webViewProviderBoundaryInterface = this.A00;
        ? obj = new Object();
        obj.A00 = tZi;
        webViewProviderBoundaryInterface.addWebMessageListener("fbpayIAWIFrameBridge", strArr, new TLM(obj));
    }

    public C10978S3m(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.A00 = webViewProviderBoundaryInterface;
    }
}
