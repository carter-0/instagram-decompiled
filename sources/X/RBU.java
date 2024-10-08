package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.browser.lite.webview.SystemWebView;

public final class RBU extends C2806552w {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RBU(int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.QcV, android.webkit.WebView] */
    public final void onClick(View view) {
        Uri A002;
        switch (this.A00) {
            case 0:
                0qQ.A0B(view, 0);
                SHX shx = C46725DkE.A02;
                if (shx == null) {
                    0qQ.A0F("warningListener");
                    throw AnonymousClass00P.createAndThrow();
                }
                0hq childFragmentManager = shx.A04.getChildFragmentManager();
                childFragmentManager.getClass();
                childFragmentManager.A0c();
                C10379RrG rrG = shx.A03;
                ((SystemWebView) rrG.A01).A04.loadUrl("https://help.instagram.com/563153788532689");
                rrG.A00.A00 = true;
                C13801ThK thK = shx.A01;
                if (thK != null) {
                    thK.ClJ(shx.A02);
                }
                SHX.A00(shx);
                return;
            case 2:
            case 3:
                Context A0C = JTP.A0C(view, 0);
                Uri A01 = 0cp.A01(SQU.A00, "https://help.instagram.com/519522125107875");
                if (A01 != null && (A002 = SQU.A00(A0C, A01)) != null) {
                    0kR.A0F(A0C, A002);
                    return;
                }
                return;
            default:
                super.onClick(view);
                return;
        }
    }
}
