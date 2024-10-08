package X;

import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.webview.ReactWebViewManager;

public final class TGB implements Runnable {
    public final /* synthetic */ S1F A00;
    public final /* synthetic */ String A01;

    public TGB(S1F s1f, String str) {
        this.A00 = s1f;
        this.A01 = str;
    }

    public final void run() {
        S1F s1f = this.A00;
        String parseOrigin = ReactWebViewManager.parseOrigin(s1f.A01.getUrl());
        Q8z q8z = s1f.A00;
        ReactWebViewManager.dispatchEvent(q8z, new C7841QbO(UIManagerHelper.A01(q8z), q8z.getId(), this.A01, parseOrigin));
    }
}
