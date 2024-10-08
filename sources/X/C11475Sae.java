package X;

import android.view.View;
import com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome;
import com.instagram.android.R;

/* renamed from: X.Sae  reason: case insensitive filesystem */
public final class C11475Sae implements View.OnClickListener {
    public final /* synthetic */ BwPBrowserLiteChrome A00;

    public C11475Sae(BwPBrowserLiteChrome bwPBrowserLiteChrome) {
        this.A00 = bwPBrowserLiteChrome;
    }

    public final void onClick(View view) {
        int i;
        int A05 = AnonymousClass0fD.A05(-1238948325);
        BwPBrowserLiteChrome bwPBrowserLiteChrome = this.A00;
        if (bwPBrowserLiteChrome.A08 == null) {
            i = 1744043234;
        } else {
            if (view.getId() == R.id.ig_bwp_browser_close_button) {
                bwPBrowserLiteChrome.A08.AI4(1, (String) null);
            }
            i = -2070466138;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
