package X;

import android.webkit.PermissionRequest;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;

public final class TBC implements Runnable {
    public final /* synthetic */ SV4 A00;

    public TBC(SV4 sv4) {
        this.A00 = sv4;
    }

    public final void run() {
        SV4 sv4 = this.A00;
        BrowserLiteWebChromeClient browserLiteWebChromeClient = (BrowserLiteWebChromeClient) sv4.A01;
        if (browserLiteWebChromeClient.A0G) {
            ((PermissionRequest) sv4.A03).deny();
            browserLiteWebChromeClient.A0G = false;
        }
    }
}
