package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

public final class RKW extends Exception {
    public final WebResourceError A00;
    public final WebResourceRequest A01;
    public final WebResourceResponse A02;

    public RKW(WebResourceError webResourceError, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.A01 = webResourceRequest;
        this.A00 = webResourceError;
        this.A02 = webResourceResponse;
    }
}
