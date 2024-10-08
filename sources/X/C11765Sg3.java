package X;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: X.Sg3  reason: case insensitive filesystem */
public final class C11765Sg3 implements C13810Thd {
    public static final String[] A00 = new String[0];

    public final WebViewProviderBoundaryInterface ANN(WebView webView) {
        throw AnonymousClass7TE.A1B("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public final ProfileStoreBoundaryInterface BhH() {
        throw AnonymousClass7TE.A1B("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public final StaticsBoundaryInterface BzH() {
        throw AnonymousClass7TE.A1B("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public final String[] CGI() {
        return A00;
    }

    public final WebkitToCompatConverterBoundaryInterface CGJ() {
        throw AnonymousClass7TE.A1B("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
