package X;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: X.Thd  reason: case insensitive filesystem */
public interface C13810Thd {
    WebViewProviderBoundaryInterface ANN(WebView webView);

    ProfileStoreBoundaryInterface BhH();

    StaticsBoundaryInterface BzH();

    String[] CGI();

    WebkitToCompatConverterBoundaryInterface CGJ();
}
