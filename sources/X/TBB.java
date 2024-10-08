package X;

import android.webkit.PermissionRequest;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;

public final class TBB implements Runnable {
    public final /* synthetic */ FHY A00;

    public TBB(FHY fhy) {
        this.A00 = fhy;
    }

    public final void run() {
        FHY fhy = this.A00;
        BrowserLiteWebChromeClient browserLiteWebChromeClient = (BrowserLiteWebChromeClient) fhy.A01;
        if (browserLiteWebChromeClient.A0G) {
            ((PermissionRequest) fhy.A03).deny();
            browserLiteWebChromeClient.A0G = false;
        }
    }
}
