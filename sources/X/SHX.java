package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.browser.lite.webview.SystemWebView;

public final class SHX {
    public Context A00;
    public C13801ThK A01;
    public String A02;
    public final C10379RrG A03;
    public final C340027ka A04;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.QcV, android.view.View] */
    public static void A00(SHX shx) {
        C340027ka r2 = shx.A04;
        QLA C8U = r2.C8U();
        C8U.getClass();
        C8U.A0b = false;
        ((SystemWebView) r2.C8U()).A04.setImportantForAccessibility(0);
    }

    public final void A01() {
        C340027ka r2 = this.A04;
        0hq childFragmentManager = r2.getChildFragmentManager();
        childFragmentManager.getClass();
        childFragmentManager.A0c();
        r2.Eow(0);
        QLA C8U = r2.C8U();
        C8U.getClass();
        if (!C8U.A0G() && !r2.DIV(true)) {
            r2.AI4(2, this.A02);
        }
        A00(this);
    }

    public SHX(Context context, C10379RrG rrG, C340027ka r4, String str, boolean z) {
        this.A04 = r4;
        this.A03 = rrG;
        this.A00 = context;
        this.A02 = str;
        if (z) {
            Intent intent = r4.getIntent();
            intent.getClass();
            this.A01 = C9224RUb.A00(intent);
        }
    }
}
