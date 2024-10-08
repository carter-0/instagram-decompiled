package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.android.R;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;

public final class QCD extends Fragment {
    public WebView A00;
    public ProgressBar A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final HashSet A05 = AnonymousClass7TE.A1F();

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        this.A00 = (WebView) view.requireViewById(R.id.auth_web_view);
        ProgressBar progressBar = (ProgressBar) view.requireViewById(R.id.fbpay_auth_progress_bar);
        this.A01 = progressBar;
        if (progressBar == null) {
            str = "progressBar";
        } else {
            progressBar.setVisibility(8);
            WebView webView = this.A00;
            if (webView != null) {
                webView.setFocusable(true);
                WebView webView2 = this.A00;
                if (webView2 != null) {
                    webView2.setFocusableInTouchMode(true);
                    WebView webView3 = this.A00;
                    if (webView3 != null) {
                        WebSettings settings = webView3.getSettings();
                        0qQ.A07(settings);
                        settings.setJavaScriptEnabled(true);
                        settings.setJavaScriptCanOpenWindowsAutomatically(true);
                        settings.setSupportMultipleWindows(true);
                        Pxj.A1C(settings);
                        Q95 q95 = new Q95(this, 1);
                        WebView webView4 = this.A00;
                        if (webView4 != null) {
                            webView4.setWebViewClient(q95);
                            WebView webView5 = this.A00;
                            if (webView5 != null) {
                                webView5.setWebChromeClient(new Q8v(this, 0));
                                AnonymousClass2E0 A052 = AnonymousClass2E0.A05();
                                AnonymousClass2E0.A0K(A052);
                                02V.A03(A052.A00.A0L, "WebViewHelper Factory is not provided!");
                                A052.A00.A0L.get();
                                String str2 = this.A03;
                                str = "loadUrl";
                                WebView webView6 = this.A00;
                                if (str2 != null) {
                                    if (webView6 != null) {
                                        String str3 = this.A02;
                                        if (str3 != null) {
                                            webView6.postUrl(str3, C66582MXn.A1a(str2));
                                            return;
                                        }
                                    }
                                } else if (webView6 != null) {
                                    String str4 = this.A02;
                                    if (str4 != null) {
                                        webView6.loadUrl(str4);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("webView");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-199607994);
        QCD.super.onCreate(bundle);
        String string = requireArguments().getString("WEB_VIEW_URL");
        if (string != null) {
            this.A02 = string;
            this.A03 = requireArguments().getString("WEB_VIEW_POST_DATA");
            this.A04 = requireArguments().getBoolean("WEB_VIEW_FULL_SCREEN");
            String[] stringArray = requireArguments().getStringArray("WEB_VIEW_ALLOWED_INTERCEPT_URLS");
            if (stringArray != null) {
                for (String uri : stringArray) {
                    try {
                        this.A05.add(new URI(uri));
                    } catch (URISyntaxException unused) {
                    }
                }
                AnonymousClass0fD.A09(-1524415750, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -1714515283;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 1039439227;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1351919041);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(Pxj.A0K(this, layoutInflater));
        AnonymousClass2E0.A0H();
        View inflate = cloneInContext.inflate(R.layout.fbpay_auth_ig_web_view, viewGroup, false);
        if (this.A04) {
            0qQ.A0A(inflate);
            AnonymousClass7TF.A0G(inflate, R.id.web_view_layout).setMinimumHeight(AnonymousClass7TF.A0E(requireContext()).heightPixels);
        }
        AnonymousClass0fD.A09(-1443457826, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2142151378);
        QCD.super.onDestroyView();
        WebView webView = this.A00;
        if (webView != null) {
            webView.loadUrl(ReactWebViewManager.BLANK_URL);
            WebView webView2 = this.A00;
            if (webView2 != null) {
                webView2.clearCache(true);
                CookieManager.getInstance().removeAllCookie();
                WebView webView3 = this.A00;
                if (webView3 != null) {
                    webView3.setTag((Object) null);
                    WebView webView4 = this.A00;
                    if (webView4 != null) {
                        webView4.clearHistory();
                        WebView webView5 = this.A00;
                        if (webView5 != null) {
                            webView5.removeAllViews();
                            WebView webView6 = this.A00;
                            if (webView6 != null) {
                                webView6.onPause();
                                WebView webView7 = this.A00;
                                if (webView7 != null) {
                                    webView7.destroy();
                                    AnonymousClass0fD.A09(85637932, A022);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("webView");
        throw AnonymousClass00P.createAndThrow();
    }
}
