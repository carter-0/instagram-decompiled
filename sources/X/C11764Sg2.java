package X;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: X.Sg2  reason: case insensitive filesystem */
public final class C11764Sg2 implements C13810Thd {
    public final WebViewProviderFactoryBoundaryInterface A00;

    public final WebViewProviderBoundaryInterface ANN(WebView webView) {
        return (WebViewProviderBoundaryInterface) SL3.A00(WebViewProviderBoundaryInterface.class, this.A00.createWebView(webView));
    }

    public final ProfileStoreBoundaryInterface BhH() {
        return (ProfileStoreBoundaryInterface) SL3.A00(ProfileStoreBoundaryInterface.class, this.A00.getProfileStore());
    }

    public final StaticsBoundaryInterface BzH() {
        return (StaticsBoundaryInterface) SL3.A00(StaticsBoundaryInterface.class, this.A00.getStatics());
    }

    public final String[] CGI() {
        return this.A00.getSupportedFeatures();
    }

    public final WebkitToCompatConverterBoundaryInterface CGJ() {
        return (WebkitToCompatConverterBoundaryInterface) SL3.A00(WebkitToCompatConverterBoundaryInterface.class, this.A00.getWebkitToCompatConverter());
    }

    public C11764Sg2(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.A00 = webViewProviderFactoryBoundaryInterface;
    }
}
