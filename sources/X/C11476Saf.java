package X;

import android.net.Uri;
import android.view.View;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome;
import java.util.HashMap;

/* renamed from: X.Saf  reason: case insensitive filesystem */
public final class C11476Saf implements View.OnClickListener {
    public final /* synthetic */ BwPBrowserLiteChrome A00;

    public C11476Saf(BwPBrowserLiteChrome bwPBrowserLiteChrome) {
        this.A00 = bwPBrowserLiteChrome;
    }

    public final void onClick(View view) {
        int i;
        int A05 = AnonymousClass0fD.A05(2041236149);
        BwPBrowserLiteChrome bwPBrowserLiteChrome = this.A00;
        if (bwPBrowserLiteChrome.A09 == null) {
            i = 2051885182;
        } else {
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("action", "bwp_more_options_menu_action");
            A1E.put("current_url", ((BrowserLiteFragment) bwPBrowserLiteChrome.A09).A0l);
            Uri uri = ((BrowserLiteFragment) bwPBrowserLiteChrome.A09).A07;
            if (uri != null) {
                A1E.put("url", uri.toString());
            }
            SRY.A00().A07(bwPBrowserLiteChrome.A01, A1E);
            i = -656352307;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
