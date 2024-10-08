package X;

import android.view.View;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;
import com.instagram.android.R;

/* renamed from: X.Sag  reason: case insensitive filesystem */
public final class C11477Sag implements View.OnClickListener {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;

    public C11477Sag(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.A00 = defaultBrowserLiteChrome;
    }

    public final void onClick(View view) {
        int i;
        int A05 = AnonymousClass0fD.A05(-1010635941);
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
        if (defaultBrowserLiteChrome.A05 == null) {
            i = 1921912918;
        } else {
            if (view.getId() == R.id.ig_browser_close_button) {
                defaultBrowserLiteChrome.A05.AI4(1, defaultBrowserLiteChrome.A0C);
            }
            i = -1178825071;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
