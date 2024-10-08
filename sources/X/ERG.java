package X;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public final class ERG extends R8R implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "OpenWebViewWithUrlChangeFragment";
    public WebView A00;
    public C49450Evr A01;
    public ExK A02;
    public C50323FYd A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final boolean A03(Uri uri, WebView webView) {
        C49450Evr evr = this.A01;
        if (evr != null) {
            Boolean bool = (Boolean) C299275ur.A00(evr.A00, DbY.A0Q(DbT.A10(uri)), evr.A01);
            if (bool != null && bool.booleanValue()) {
                ExK exK = this.A02;
                if (exK != null) {
                    C299275ur.A00(exK.A01, DbT.A0V(DbU.A0T(DbT.A10(uri)), false), exK.A02);
                    C50323FYd fYd = exK.A00;
                    fYd.A00 = null;
                    fYd.A01 = null;
                }
                DbT.A1K(this);
                return true;
            }
        }
        return super.A03(uri, webView);
    }

    public final boolean onBackPressed() {
        String str;
        WebView webView = this.A00;
        if (webView == null || (str = webView.getUrl()) == null) {
            str = "";
        }
        ExK exK = this.A02;
        if (exK == null) {
            return false;
        }
        C299275ur.A00(exK.A01, DbT.A0V(DbU.A0T(str), true), exK.A02);
        C50323FYd fYd = exK.A00;
        fYd.A00 = null;
        fYd.A01 = null;
        return false;
    }

    public final void A02(WebView webView) {
        webView.getSettings().setDomStorageEnabled(true);
        WebSettings settings = webView.getSettings();
        String userAgentString = webView.getSettings().getUserAgentString();
        0qQ.A07(userAgentString);
        settings.setUserAgentString(1Ch.A01(userAgentString));
        this.A00 = webView;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1890748346);
        super.onCreate(bundle);
        0lg A0R = DbY.A0R(this.A04);
        C50323FYd fYd = (C50323FYd) A0R.A01(C50323FYd.class, new MMG(A0R, 2));
        this.A03 = fYd;
        if (fYd == null) {
            0qQ.A0F("callbackHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = fYd.A00;
        this.A02 = fYd.A01;
        AnonymousClass0fD.A09(-515673935, A022);
    }
}
