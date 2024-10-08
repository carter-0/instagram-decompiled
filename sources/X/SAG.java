package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.facebook.secure.securewebview.SecureWebView;
import com.instagram.common.session.UserSession;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;

public abstract class SAG {
    public static final void A01(SecureWebView secureWebView, UserSession userSession, List list) {
        List<HttpCookie> list2;
        secureWebView.getSettings().setSaveFormData(false);
        secureWebView.getSettings().setSavePassword(false);
        secureWebView.getSettings().setSupportZoom(false);
        secureWebView.getSettings().setBuiltInZoomControls(false);
        secureWebView.getSettings().setSupportMultipleWindows(true);
        secureWebView.getSettings().setDisplayZoomControls(false);
        secureWebView.getSettings().setUseWideViewPort(false);
        secureWebView.getSettings().setJavaScriptEnabled(true);
        secureWebView.getSettings().setDatabaseEnabled(true);
        secureWebView.getSettings().setDomStorageEnabled(true);
        secureWebView.getSettings().setDatabasePath(AnonymousClass1F2.A00().AXT((1LJ) null, 239398057).getPath());
        secureWebView.getSettings().setMixedContentMode(0);
        secureWebView.setVerticalScrollBarEnabled(false);
        secureWebView.setHorizontalScrollBarEnabled(false);
        String userAgentString = secureWebView.getSettings().getUserAgentString();
        0qQ.A07(userAgentString);
        secureWebView.getSettings().setUserAgentString(1Ch.A01(userAgentString));
        CookieManager.getInstance().setAcceptThirdPartyCookies(secureWebView, true);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36312531148473502L);
        Context context = secureWebView.getContext();
        if (A06) {
            0qQ.A07(context);
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String A18 = AnonymousClass7TE.A18(it);
                    if (A18 != null && A18.length() != 0 && C66580MXl.A1a("fr=", 1, A18)) {
                        list2 = HttpCookie.parse(A18);
                        break;
                    }
                }
            }
            list2 = null;
        } else {
            0qQ.A07(context);
            list2 = null;
        }
        SAX.A00(userSession, list2);
    }

    public static final void A00(SecureWebView secureWebView) {
        if (secureWebView != null) {
            try {
                secureWebView.stopLoading();
                secureWebView.resumeTimers();
                secureWebView.setTag((Object) null);
                secureWebView.clearHistory();
                secureWebView.removeAllViews();
                secureWebView.setOnTouchListener((View.OnTouchListener) null);
                secureWebView.setWebChromeClient(new WebChromeClient());
                secureWebView.setWebViewClient(new WebViewClient());
                secureWebView.clearView();
                secureWebView.onPause();
                secureWebView.destroy();
                if (secureWebView.getParent() instanceof ViewGroup) {
                    C3019160o.A01(secureWebView).removeView(secureWebView);
                }
            } catch (Exception unused) {
            }
        }
    }
}
