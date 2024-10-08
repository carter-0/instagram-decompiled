package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.android.R;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

public final class QCO extends Fragment implements C13610Tdc {
    public RQU A00;
    public Set A01;
    public QmY A02;
    public String A03;

    public final boolean onBackPressed() {
        RQU rqu = this.A00;
        if (rqu == null || !rqu.A00.canGoBack()) {
            return false;
        }
        this.A00.A00.goBack();
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.RQU] */
    public final void onViewCreated(View view, Bundle bundle) {
        ? obj = new Object();
        obj.A01 = (ProgressBar) view.requireViewById(R.id.fbpay_auth_progress_bar);
        WebView webView = (WebView) view.requireViewById(R.id.auth_web_view);
        obj.A00 = webView;
        this.A00 = obj;
        webView.setFocusable(true);
        this.A00.A00.setFocusableInTouchMode(true);
        WebSettings settings = this.A00.A00.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        Pxj.A1C(settings);
        this.A00.A00.setWebChromeClient(new Q8v(this, 1));
        this.A00.A00.setWebViewClient(new Q95(this, 2));
        if (!TextUtils.isEmpty(this.A03)) {
            this.A00.A00.loadUrl(this.A03);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1455285550);
        QCO.super.onCreate(bundle);
        this.A02 = (QmY) AnonymousClass2E0.A03().A03(getActivity(), QmY.class);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = bundle2.getString("WEB_FRAGMENT_LOAD_URL");
            this.A01 = AnonymousClass7TE.A1F();
            String[] stringArray = bundle2.getStringArray("WEB_FRAGMENT_INTERCEPT_URLS");
            if (stringArray != null) {
                for (String uri : stringArray) {
                    try {
                        this.A01.add(new URI(uri));
                    } catch (URISyntaxException unused) {
                    }
                }
            }
        }
        AnonymousClass0fD.A09(-271611429, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(846859192);
        QmY qmY = this.A02;
        C13609Tdb tdb = qmY.A01;
        View A0C = DbT.A0C(((C12465Sux) tdb).A00, viewGroup, qmY.A00);
        0qQ.A07(A0C);
        AnonymousClass0fD.A09(-742202134, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1110457254);
        QCO.super.onDestroyView();
        WebView webView = this.A00.A00;
        webView.loadUrl(ReactWebViewManager.BLANK_URL);
        webView.clearCache(true);
        webView.setTag((Object) null);
        webView.clearHistory();
        webView.removeAllViews();
        webView.onPause();
        webView.destroy();
        this.A00 = null;
        AnonymousClass0fD.A09(1501645186, A022);
    }
}
