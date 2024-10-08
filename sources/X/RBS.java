package X;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import java.util.regex.Pattern;

public final class RBS extends R8R implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "SecureWebViewWithUrlChangeFragment";
    public WebView A00;
    public T7P A01;
    public String A02;
    public C13665TeW A03;
    public TeX A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final boolean A03(Uri uri, WebView webView) {
        Boolean FMg;
        C13665TeW teW = this.A03;
        if (teW == null || (FMg = teW.FMg(DbT.A10(uri))) == null || !FMg.booleanValue()) {
            String A10 = DbT.A10(0cp.A03(uri.toString()));
            if (!00l.A0d(A10, "/oauth/login", false)) {
                return super.A03(uri, webView);
            }
            if (1AW.A06(0Tu.A05, 18307126300517878L)) {
                new SO4().A01().A00(requireContext(), 0cp.A03(A10));
                return true;
            }
            SUL sul = new SUL(requireActivity(), AnonymousClass7TE.A0l(this.A05), 2EG.A44, A10, false);
            Pattern pattern = 0mp.A00;
            sul.A0M = A10;
            sul.A0N = "instagram";
            sul.A0j = true;
            sul.A1D = true;
            sul.A0A();
            return true;
        }
        this.A02 = uri.toString();
        TeX teX = this.A04;
        if (teX != null) {
            teX.FNQ(DbT.A10(uri), false);
        }
        DbT.A1K(this);
        return true;
    }

    public final boolean onBackPressed() {
        String str;
        WebView webView = this.A00;
        if (webView == null || (str = webView.getUrl()) == null) {
            str = "";
        }
        TeX teX = this.A04;
        if (teX == null) {
            return false;
        }
        teX.FNQ(str, true);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int A022 = AnonymousClass0fD.A02(-1883514931);
        super.onCreate(bundle);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && bundle3.containsKey("redirected_from_deeplink") && (bundle2 = this.mArguments) != null && bundle2.getBoolean("redirected_from_deeplink")) {
            DbT.A1K(this);
        }
        AnonymousClass0eM r4 = this.A05;
        0lg A0X = DbT.A0X(r4);
        0qQ.A0B(A0X, 0);
        T7P t7p = (T7P) A0X.A01(T7P.class, new MMG(A0X, 0));
        this.A01 = t7p;
        if (t7p != null) {
            C13665TeW teW = t7p.A00;
            if (teW == null) {
                Bundle bundle4 = this.mArguments;
                if (bundle4 == null || !bundle4.containsKey("completion_path")) {
                    teW = null;
                } else {
                    teW = new C12746T5g(this);
                }
            }
            this.A03 = teW;
            T7P t7p2 = this.A01;
            if (t7p2 != null) {
                TeX teX = t7p2.A01;
                if (teX == null) {
                    teX = new C12748T5i(this, AnonymousClass7TE.A0l(r4));
                }
                this.A04 = teX;
                AnonymousClass0fD.A09(-2064115550, A022);
                return;
            }
        }
        0qQ.A0F("callbackHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(254417205);
        this.A00 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-505800018, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1645477829);
        super.onResume();
        WebView webView = this.A00;
        if (webView != null) {
            webView.resumeTimers();
        }
        WebView webView2 = this.A00;
        if (webView2 != null) {
            webView2.loadUrl("javascript:window.Trustly.proceedToChooseAccount();");
        }
        AnonymousClass0fD.A09(-1186412032, A022);
    }
}
