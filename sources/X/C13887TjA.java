package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* renamed from: X.TjA  reason: case insensitive filesystem */
public interface C13887TjA {
    public static final SB4 A00 = SB4.A00;

    WebResourceResponse handleRequest(WebResourceRequest webResourceRequest, S78 s78, C10380RrH rrH);

    void maybeCallTrListeners(String str);
}
