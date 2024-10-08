package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.instagram.android.R;
import java.util.List;

public final class R8L extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SponsoredAboutFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbW.A1B(r3, 2131974138);
        r3.ErJ(new F3V(AnonymousClass05K.A00).A00());
    }

    public final String getModuleName() {
        return "sponsored_about";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        WebView webView = (WebView) AnonymousClass7TF.A0F(view, R.id.webView);
        webView.setScrollbarFadingEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        WebSettings settings = webView.getSettings();
        String userAgentString = webView.getSettings().getUserAgentString();
        0qQ.A07(userAgentString);
        settings.setUserAgentString(1Ch.A01(userAgentString));
        Bundle requireArguments = requireArguments();
        String A02 = SQU.A02(requireContext(), 1Ma.A03(0mp.A06("/xwoiynko?tracking_token=%s&show_ad_choices=%d&locale=%s", new Object[]{requireArguments.getString("tracking_token"), Integer.valueOf(requireArguments.getBoolean("show_ad_choices") ? 1 : 0), AnonymousClass1Q2.A02()})));
        0qQ.A07(A02);
        if (getContext() != null) {
            SAX.A00(DbT.A0X(this.A00), (List) null);
        }
        webView.loadUrl(A02);
        webView.setWebViewClient(new WebViewClient());
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-237442045);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_sponsored_about, viewGroup, false);
        AnonymousClass0fD.A09(1940013879, A02);
        return inflate;
    }

    public final void onPause() {
        AnonymousClass2ZP r1;
        int A02 = AnonymousClass0fD.A02(714403569);
        R8L.super.onPause();
        Activity rootActivity = getRootActivity();
        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
            r1.Enj(0);
        }
        AnonymousClass0fD.A09(-1379059924, A02);
    }

    public final void onResume() {
        AnonymousClass2ZP r1;
        int A02 = AnonymousClass0fD.A02(-60719492);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
            r1.Enj(8);
        }
        AnonymousClass0fD.A09(-649973083, A02);
    }
}
