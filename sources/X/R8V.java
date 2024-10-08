package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.List;

public final class R8V extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AdHideReasonsFragment";
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public WebView A05;
    public String A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbW.A1B(r3, 2131972172);
        r3.ErJ(new F3V(AnonymousClass05K.A00).A00());
    }

    public final String getModuleName() {
        return C273654mx.A00(1435);
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        WebSettings settings;
        String str;
        WebSettings settings2;
        WebSettings settings3;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        WebView webView = this.A05;
        if (!(webView == null || (settings3 = webView.getSettings()) == null)) {
            settings3.setJavaScriptEnabled(true);
        }
        WebView webView2 = this.A05;
        if (!(webView2 == null || (settings = webView2.getSettings()) == null)) {
            WebView webView3 = this.A05;
            if (webView3 == null || (settings2 = webView3.getSettings()) == null || (str = settings2.getUserAgentString()) == null) {
                str = "";
            }
            settings.setUserAgentString(1Ch.A01(str));
        }
        Context requireContext = requireContext();
        String str2 = "/ads/flag/ad";
        if (!this.A04) {
            str2 = 0mp.A06("%s?ad_id=%s", new Object[]{str2, this.A06});
        }
        String A022 = SQU.A02(requireContext, 1Ma.A03(str2));
        0qQ.A07(A022);
        Context context = getContext();
        if (context != null) {
            A022 = SQU.A02(context, A022);
        }
        WebView webView4 = this.A05;
        if (webView4 != null) {
            webView4.loadUrl(A022);
        }
        WebView webView5 = this.A05;
        if (webView5 != null) {
            webView5.setWebViewClient(new Q95(this, 4));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        0lg A0X;
        int A022 = AnonymousClass0fD.A02(-925064809);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("AdHideReasonsFragment.FEED_ITEM_ID");
        this.A00 = requireArguments.getInt("AdHideReasonsFragment.MEDIA_AD_CAROUSEL_INDEX");
        this.A04 = DbT.A1X(requireArguments, "AdHideReasonsFragment.IS_SURVEY");
        this.A03 = requireArguments.getString("AdHideReasonsFragment.TOKEN");
        this.A02 = requireArguments.getString("AdHideReasonsFragment.SOURCE");
        this.A06 = requireArguments.getString("AdHideReasonsFragment.AD_ID");
        if (!(getContext() == null || (A0X = DbT.A0X(this.A07)) == null)) {
            SAX.A00(A0X, (List) null);
        }
        R8V.super.onCreate(bundle);
        AnonymousClass0fD.A09(1998526837, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-412484804);
        WebView webView = this.A05;
        if (webView != null) {
            webView.destroy();
        }
        com.facebook.secure.webkit.WebView webView2 = new com.facebook.secure.webkit.WebView(requireActivity());
        this.A05 = webView2;
        AnonymousClass0fD.A09(180160496, A022);
        return webView2;
    }
}
