package X;

import android.os.Bundle;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;

/* renamed from: X.Sl9  reason: case insensitive filesystem */
public final class C12047Sl9 implements C13551TcN {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;

    public C12047Sl9(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.A00 = defaultBrowserLiteChrome;
    }

    public final void D1z(C11347SOg sOg) {
        C340027ka r2;
        Bundle bundle;
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
        C340037kb r3 = defaultBrowserLiteChrome.A06;
        if (r3 != null && (r2 = defaultBrowserLiteChrome.A05) != null && (bundle = defaultBrowserLiteChrome.A01) != null) {
            sOg.A03(defaultBrowserLiteChrome.getContext(), bundle, r2, r3);
            QA3 qa3 = defaultBrowserLiteChrome.A04;
            if (qa3 != null && qa3.isShowing()) {
                defaultBrowserLiteChrome.A04.dismiss();
                defaultBrowserLiteChrome.A04 = null;
            }
        }
    }
}
