package X;

import android.webkit.WebView;
import com.instagram.neko.playables.activity.PlayableProgressBar;

/* renamed from: X.QcE  reason: case insensitive filesystem */
public final class C7888QcE extends S0R {
    public final /* synthetic */ R8W A00;

    public final void A00(WebView webView, int i) {
        0qQ.A0B(webView, 0);
        super.A00(webView, i);
        PlayableProgressBar playableProgressBar = this.A00.A02;
        if (playableProgressBar == null) {
            0qQ.A0F("playableProgressBar");
            throw AnonymousClass00P.createAndThrow();
        } else {
            playableProgressBar.A00(i);
        }
    }

    public C7888QcE(R8W r8w) {
        this.A00 = r8w;
    }
}
