package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;
import com.instagram.android.R;

/* renamed from: X.Wll  reason: case insensitive filesystem */
public final class C20125Wll implements Runnable {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;
    public final /* synthetic */ String A01;

    public C20125Wll(DefaultBrowserLiteChrome defaultBrowserLiteChrome, String str) {
        this.A00 = defaultBrowserLiteChrome;
        this.A01 = str;
    }

    public final void run() {
        FragmentActivity activity;
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
        C340027ka r0 = defaultBrowserLiteChrome.A05;
        if (r0 != null && (activity = r0.getActivity()) != null) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, this.A01);
            A0f.A03(defaultBrowserLiteChrome.findViewById(R.id.ig_browser_menu_button));
            A0f.A01();
            A0f.A0B = false;
            A0f.A0A = true;
            A0f.A00().A07(defaultBrowserLiteChrome.A07);
        }
    }
}
