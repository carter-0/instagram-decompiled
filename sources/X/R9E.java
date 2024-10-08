package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.secure.securewebview.SecureWebView;

public final class R9E extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new C7363Q8g(context);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r12, C276544tV r13, Object obj) {
        ViewGroup viewGroup = (ViewGroup) view;
        AnonymousClass7TG.A1T(viewGroup, r12, r13);
        S2d s2d = (S2d) C307476Qg.A06(r12, r13);
        if (s2d != null) {
            SecureWebView secureWebView = s2d.A00;
            if (secureWebView == null) {
                secureWebView = new SecureWebView(r12.A00);
                Pxk.A0T(secureWebView);
                Pxk.A0S(secureWebView);
                secureWebView.getSettings().setJavaScriptEnabled(true);
                secureWebView.addJavascriptInterface(s2d, "_MetaCommerceThirdPartyMarketingTag");
                s2d.A00 = secureWebView;
            }
            viewGroup.addView(secureWebView);
            String A0D = r13.A0D();
            if (A0D != null) {
                String A0F = r13.A0F();
                if (A0F != null) {
                    SecureWebView secureWebView2 = s2d.A00;
                    if (secureWebView2 == null) {
                        return null;
                    }
                    if (A0D.equals(s2d.A01) && A0F.equals(s2d.A02)) {
                        return null;
                    }
                    s2d.A02 = A0F;
                    s2d.A01 = A0D;
                    secureWebView2.loadDataWithBaseURL(A0D, A0F, ReactWebViewManager.HTML_MIME_TYPE, ReactWebViewManager.HTML_ENCODING, (String) null);
                    return null;
                }
                throw AnonymousClass7TE.A15("source cannot be null");
            }
            throw AnonymousClass7TE.A15("baseUrl cannot be null");
        }
        throw AnonymousClass7TE.A15("A controller was defined for this component but none was found");
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r3, C276544tV r4, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        0qQ.A0B(viewGroup, 0);
        viewGroup.removeAllViews();
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0N(C276544tV r6, C276544tV r7, Object obj, Object obj2) {
        DbY.A1S(r6, r7);
        String A0D = r6.A0D();
        if (A0D != null) {
            String A0D2 = r7.A0D();
            if (A0D2 != null) {
                String A0F = r6.A0F();
                if (A0F != null) {
                    String A0F2 = r7.A0F();
                    if (A0F2 == null) {
                        throw AnonymousClass7TE.A15("source cannot be null");
                    } else if (!A0D.equals(A0D2) || !A0F.equals(A0F2)) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    throw AnonymousClass7TE.A15("source cannot be null");
                }
            } else {
                throw AnonymousClass7TE.A15("baseUrl cannot be null");
            }
        } else {
            throw AnonymousClass7TE.A15("baseUrl cannot be null");
        }
    }
}
