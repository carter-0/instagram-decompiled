package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;

public final class ERH extends R8R implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "IACWebviewFragment";
    public SimpleWebViewConfig A00;
    public C252213ok A01;
    public AnonymousClass3E6 A02;
    public String A03;

    public final boolean A03(Uri uri, WebView webView) {
        AnonymousClass0wW r4 = this.A03;
        if (r4 != null) {
            String obj = uri.toString();
            if (0qQ.A0K(obj, "https://instagram.com/linking/iac_monetization_status")) {
                Context context = getContext();
                HashMap A1E = AnonymousClass7TE.A1E();
                HashMap A1E2 = AnonymousClass7TE.A1E();
                HashMap A0v = DbX.A0v();
                IgBloksScreenConfig A0N = DbS.A0N(r4);
                A0N.A0P = AnonymousClass05K.A01;
                C46649DiU diU = new C46649DiU(C359608dC.A01(A1E), A1E2, "com.bloks.www.ig.creator_monetization.screens.creator_monetization_status");
                C46649DiU.A0B(diU, 719983200);
                diU.A03 = null;
                diU.A02 = null;
                diU.A04 = null;
                diU.A0H(A0v);
                diU.A0D(context, A0N);
                return true;
            }
            Integer num = AnonymousClass05K.A01;
            if (0qQ.A0K(obj, "https://instagram.com/linking/iac_monetization_support_inbox")) {
                C46649DiU A04 = C46649DiU.A04("com.instagram.pro_home.monetization_platform.support.contact_support_screen", AnonymousClass7TE.A1E());
                FragmentActivity requireActivity = requireActivity();
                IgBloksScreenConfig A0N2 = DbS.A0N(r4);
                A0N2.A0P = num;
                A04.A0D(requireActivity, A0N2);
                return true;
            } else if (!0qQ.A0K(obj, "https://instagram.com/linking/iac_professional_dashboard")) {
                return super.A03(uri, webView);
            } else {
                HashMap A1E3 = AnonymousClass7TE.A1E();
                A1E3.put("origin", "self_profile");
                C229382nI A032 = C229382nI.A03(this, r4, (2el) null);
                C360678ey A022 = C359988do.A02((AnonymousClass1O9) null, r4, "com.instagram.pro_home.action", A1E3);
                E86.A01(A022, A032, r4, 0);
                1ES.A03(A022);
                return true;
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final boolean onBackPressed() {
        WebView webView = this.A02;
        if (webView == null) {
            return super.onBackPressed();
        }
        String url = webView.getUrl();
        String str = this.A03;
        if (str == null) {
            0qQ.A0F("liveChatUrl");
            throw AnonymousClass00P.createAndThrow();
        } else if (url != null && url.equals(str)) {
            return false;
        } else {
            WebView webView2 = this.A02;
            if (webView2 == null) {
                return true;
            }
            webView2.goBack();
            return true;
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        SimpleWebViewConfig simpleWebViewConfig;
        int A022 = AnonymousClass0fD.A02(-1073977154);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            str = bundle2.getString("IACWebviewFragment.LIVE_CHAT_URL_KEY");
        }
        if (str != null) {
            this.A03 = str;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (simpleWebViewConfig = (SimpleWebViewConfig) bundle3.getParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG")) == null) {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -1127538672;
            } else {
                this.A00 = simpleWebViewConfig;
                Activity rootActivity = getRootActivity();
                UserSession userSession = this.A03;
                DbS.A1Z(userSession);
                int A0G = 2Yu.A0G(rootActivity, 0Pn.A01(userSession));
                this.A02 = AnonymousClass3E4.A01(this, false, false);
                this.A01 = new FZI(this, A0G);
                AnonymousClass0fD.A09(-364047269, A022);
                return;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -646488503;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(129280892);
        super.onStart();
        AnonymousClass3E6 r1 = this.A02;
        String str = "keyboardHeightChangeDetector";
        if (r1 != null) {
            C252213ok r0 = this.A01;
            if (r0 == null) {
                str = "onKeyboardHeightChangeListener";
            } else {
                r1.A9Y(r0);
                AnonymousClass3E6 r12 = this.A02;
                if (r12 != null) {
                    r12.DmJ(getRootActivity());
                    AnonymousClass0fD.A09(1990900736, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-982738957);
        super.onStop();
        AnonymousClass3E6 r2 = this.A02;
        String str = "keyboardHeightChangeDetector";
        if (r2 != null) {
            C252213ok r0 = this.A01;
            if (r0 == null) {
                str = "onKeyboardHeightChangeListener";
            } else {
                r2.EEH(r0);
                AnonymousClass3E6 r02 = this.A02;
                if (r02 != null) {
                    r02.onStop();
                    AnonymousClass0fD.A09(-406493147, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
