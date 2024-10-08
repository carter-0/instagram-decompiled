package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;
import com.instagram.business.instantexperiences.ui.InstantExperiencesWebViewContainerLayout;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

public final class R8a extends C273374mT implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "InstantExperiencesBrowserFragment";
    public C12753T5n A00;
    public C12754T5o A01;
    public boolean A02 = false;
    public IGInstantExperiencesParameters A03;
    public C10286Rpk A04;
    public InstantExperiencesBrowserChrome A05;
    public C11382SQu A06;

    public final String getModuleName() {
        return "instant_experiences_browser";
    }

    public final boolean onBackPressed() {
        C11382SQu sQu = this.A06;
        Stack stack = sQu.A0D;
        WebView webView = (WebView) stack.peek();
        if (webView == null) {
            return false;
        }
        if (webView.canGoBack()) {
            webView.goBack();
            return true;
        } else if (stack.size() <= 1) {
            return false;
        } else {
            C11382SQu.A02(sQu);
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.Sm0] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: type inference failed for: r11v0, types: [X.RTw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.RTv, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String message;
        int A022 = AnonymousClass0fD.A02(733139151);
        View inflate = layoutInflater.inflate(R.layout.instant_experiences_browser_fragment, viewGroup, false);
        C11035S6n s6n = new C11035S6n(getSession());
        C11238SGy sGy = new C11238SGy(requireContext(), C3270479e.A00(requireContext()).A00);
        CallerContext callerContext = Sm0.A06;
        UserSession session = getSession();
        Bundle requireArguments = requireArguments();
        ? obj = new Object();
        obj.A05 = false;
        obj.A04 = AnonymousClass7TE.A1C();
        obj.A03 = AnonymousClass7TE.A1E();
        obj.A02 = session;
        obj.A00 = requireArguments;
        obj.A01 = sGy;
        SF6 sf6 = new SF6(obj, s6n, Executors.newSingleThreadExecutor(), Executors.newSingleThreadExecutor());
        sf6.A03.execute(new TFL(sf6, new C12015SkZ(sf6, new Object())));
        C10662Rvw rvw = new C10662Rvw(sf6, sGy, s6n, Executors.newSingleThreadExecutor());
        TO4 to4 = new TO4((Object) this, 4);
        String string = requireArguments().getString("website_url");
        try {
            IGInstantExperiencesParameters iGInstantExperiencesParameters = new IGInstantExperiencesParameters(002.A11("{\"whitelisted_domains\": \"https://fbplugins.herokuapp.com\", \"feature_list\": {\"is_autofill_enabled\": true, \"is_autofill_save_enabled\": true, \"is_payment_enabled\": true}, \"page_name\": \"IX Test\",\"business_id\": \"", requireArguments().getString("business_id"), "\",\"website_uri\": \"", string, "\"}"), Long.valueOf(new Random().nextLong()));
            this.A03 = iGInstantExperiencesParameters;
            String string2 = requireArguments().getString("source");
            17k.A07(string2, "Source cannot be null");
            iGInstantExperiencesParameters.A01 = string2;
            this.A03.A02 = requireArguments().getString("surface");
            this.A03.A00 = requireArguments().getString("app_id");
            this.A05 = (InstantExperiencesBrowserChrome) inflate.requireViewById(R.id.instant_experiences_browser_chrome);
            View findViewById = inflate.findViewById(R.id.instant_experiences_browser_progress_bar);
            this.A00 = new C12753T5n();
            this.A01 = new C12754T5o(rvw, getSession(), to4);
            this.A04 = new C10286Rpk(to4);
            Context requireContext = requireContext();
            UserSession session2 = getSession();
            ? obj2 = new Object();
            ? obj3 = new Object();
            IGInstantExperiencesParameters iGInstantExperiencesParameters2 = this.A03;
            findViewById.getClass();
            C11382SQu sQu = new C11382SQu(requireContext, (ProgressBar) findViewById, obj3, sf6, rvw, obj2, iGInstantExperiencesParameters2, this, (InstantExperiencesWebViewContainerLayout) inflate.requireViewById(R.id.instant_experiences_webview_container), session2);
            this.A06 = sQu;
            InstantExperiencesBrowserChrome instantExperiencesBrowserChrome = this.A05;
            UserSession session3 = getSession();
            instantExperiencesBrowserChrome.A08 = sQu;
            instantExperiencesBrowserChrome.A09 = session3;
            instantExperiencesBrowserChrome.A0A = new TO4((Object) instantExperiencesBrowserChrome, 3);
            instantExperiencesBrowserChrome.A06 = DbU.A0G(instantExperiencesBrowserChrome, R.id.instant_experiences_chrome_title);
            instantExperiencesBrowserChrome.A05 = DbU.A0G(instantExperiencesBrowserChrome, R.id.instant_experiences_chrome_subtitle);
            instantExperiencesBrowserChrome.A04 = DbU.A0G(instantExperiencesBrowserChrome, R.id.instant_experiences_chrome_loading);
            instantExperiencesBrowserChrome.A03 = DbU.A0F(instantExperiencesBrowserChrome, R.id.instant_experiences_overflow_menu);
            instantExperiencesBrowserChrome.A06.setVisibility(8);
            instantExperiencesBrowserChrome.A05.setVisibility(8);
            instantExperiencesBrowserChrome.A04.setVisibility(0);
            C11382SQu sQu2 = instantExperiencesBrowserChrome.A08;
            sQu2.A0B.add(new C12019Skg(instantExperiencesBrowserChrome));
            ImageView A0F = DbU.A0F(instantExperiencesBrowserChrome, R.id.instant_experiences_back_button);
            instantExperiencesBrowserChrome.A02 = A0F;
            A0F.setColorFilter(-7829368);
            instantExperiencesBrowserChrome.A03.setColorFilter(-7829368);
            FrameLayout frameLayout = (FrameLayout) instantExperiencesBrowserChrome.requireViewById(R.id.instant_experiences_back_button_container);
            instantExperiencesBrowserChrome.A01 = frameLayout;
            frameLayout.setOnClickListener(new C11495SbI(instantExperiencesBrowserChrome, 6));
            instantExperiencesBrowserChrome.A03.setOnClickListener(new FP5(instantExperiencesBrowserChrome, 9));
            this.A05.A07 = new C12755T5p(this);
            ArrayList A1C = AnonymousClass7TE.A1C();
            A1C.add(this.A00);
            A1C.add(this.A01);
            C10286Rpk rpk = this.A04;
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            S27 s27 = new S27(rpk, A1C, atomicBoolean);
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                ((C13666Tea) it.next()).BzA().A00.add(s27);
            }
            inflate.getViewTreeObserver().addOnGlobalLayoutListener(new C56827IDy(1, inflate, s27, atomicBoolean));
            s27.A00();
            WebView webView = (WebView) this.A06.A0D.peek();
            webView.getClass();
            string.getClass();
            webView.loadUrl(string);
            this.A02 = false;
            AnonymousClass0fD.A09(1710480561, A022);
            return inflate;
        } catch (JSONException e) {
            Class<R8a> cls = R8a.class;
            if (e.getMessage() == null) {
                message = "No error details";
            } else {
                message = e.getMessage();
            }
            0KC.A05(cls, message, e);
            IllegalStateException A0z = AnonymousClass7TE.A0z("mIXParams cannot be null");
            AnonymousClass0fD.A09(997043351, A022);
            throw A0z;
        }
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-584013345);
        super.onDestroy();
        AnonymousClass0fD.A09(-1063733712, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-384031703);
        R8a.super.onPause();
        AnonymousClass0fD.A09(-1588754703, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1154434063);
        super.onResume();
        AnonymousClass0fD.A09(1216117113, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-646118361);
        R8a.super.onStop();
        AnonymousClass0fD.A09(-949994176, A022);
    }
}
