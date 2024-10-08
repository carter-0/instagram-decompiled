package X;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;
import com.instagram.business.instantexperiences.ui.InstantExperiencesWebViewContainerLayout;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.Executors;

/* renamed from: X.SQu  reason: case insensitive filesystem */
public final class C11382SQu {
    public final Context A00;
    public final C9218RTv A01;
    public final SF6 A02;
    public final C10662Rvw A03;
    public final S3A A04;
    public final C9219RTw A05;
    public final IGInstantExperiencesParameters A06;
    public final C10624RvI A07;
    public final R8a A08;
    public final C7370Q8t A09;
    public final UserSession A0A;
    public final List A0B = Pxf.A0v();
    public final List A0C = Pxf.A0v();
    public final Stack A0D = new Stack();
    public final C13547TcJ A0E = new C12020Skh(this);
    public final C13549TcL A0F = new C12024Skl(this);
    public final InstantExperiencesWebViewContainerLayout A0G;

    /* JADX WARNING: type inference failed for: r7v0, types: [X.QcU, java.lang.Object, android.webkit.WebView] */
    public static final C7902QcU A00(C11382SQu sQu) {
        C7902QcU qcU;
        ? qcU2 = new C7902QcU(sQu.A00, sQu.A05);
        Q93 q93 = new Q93(qcU2, Executors.newSingleThreadExecutor());
        q93.A00 = sQu.A04;
        qcU2.setWebViewClient(q93);
        UserSession userSession = sQu.A0A;
        qcU2.addJavascriptInterface(new C11043S7c(q93, sQu.A06, new C11241SHb(sQu.A02, sQu.A03, qcU2, sQu.A08, userSession)), "_FBExtensions");
        String A0g = 002.A0g(1Ch.A00(), " ", 0mp.A06("%s %s %s", new Object[]{"FBExtensions/0.1", "IGInstantExperience/0.1", "(autofill-enabled)"}));
        0qQ.A07(A0g);
        CookieManager.getInstance().setAcceptThirdPartyCookies(qcU2, true);
        WebSettings settings = qcU2.getSettings();
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setUserAgentString(002.A0g(settings.getUserAgentString(), " ", A0g));
        qcU2.setWebChromeClient(sQu.A09);
        q93.A04.add(new C12022Skj(sQu));
        C10624RvI rvI = sQu.A07;
        if (rvI.A00 == -1) {
            rvI.A00 = System.currentTimeMillis();
        }
        q93.A06.add(new C10183Rnz(SCI.A00));
        Stack stack = sQu.A0D;
        if (!stack.empty() && (qcU = (C7902QcU) stack.peek()) != null) {
            Q93 q932 = qcU.A00;
            0qQ.A07(q932);
            q932.A05.remove(sQu.A0F);
        }
        Q93 q933 = qcU2.A00;
        0qQ.A07(q933);
        q933.A05.add(sQu.A0F);
        q933.A03.add(sQu.A0E);
        stack.push(qcU2);
        sQu.A0G.setWebView(qcU2);
        return qcU2;
    }

    public static String A01(InstantExperiencesBrowserChrome instantExperiencesBrowserChrome) {
        return ((WebView) instantExperiencesBrowserChrome.A08.A0D.peek()).getUrl();
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.QcU, android.view.View, android.webkit.WebView] */
    public static final void A02(C11382SQu sQu) {
        Stack stack = sQu.A0D;
        if (stack.size() > 1) {
            WebView webView = (WebView) stack.pop();
            webView.setVisibility(8);
            InstantExperiencesWebViewContainerLayout instantExperiencesWebViewContainerLayout = sQu.A0G;
            instantExperiencesWebViewContainerLayout.removeView(webView);
            webView.loadUrl(ReactWebViewManager.BLANK_URL);
            webView.setTag((Object) null);
            webView.clearHistory();
            webView.removeAllViews();
            webView.onPause();
            webView.destroy();
            ? r3 = (C7902QcU) stack.peek();
            if (r3 != 0) {
                r3.setVisibility(0);
                r3.onResume();
                instantExperiencesWebViewContainerLayout.setWebView(r3);
                S3A s3a = sQu.A04;
                s3a.A01.execute(new TFQ(r3, s3a));
            }
        }
    }

    public C11382SQu(Context context, ProgressBar progressBar, C9218RTv rTv, SF6 sf6, C10662Rvw rvw, C9219RTw rTw, IGInstantExperiencesParameters iGInstantExperiencesParameters, R8a r8a, InstantExperiencesWebViewContainerLayout instantExperiencesWebViewContainerLayout, UserSession userSession) {
        AnonymousClass7TG.A1Q(userSession, instantExperiencesWebViewContainerLayout);
        C51969G9p.A1N(iGInstantExperiencesParameters, 7, progressBar);
        this.A0A = userSession;
        this.A01 = rTv;
        this.A0G = instantExperiencesWebViewContainerLayout;
        this.A09 = new C7370Q8t(context, progressBar, this);
        this.A00 = context;
        this.A05 = rTw;
        this.A08 = r8a;
        this.A06 = iGInstantExperiencesParameters;
        this.A02 = sf6;
        this.A03 = rvw;
        this.A04 = new S3A(Executors.newSingleThreadExecutor(), TO0.A00);
        this.A07 = new C10624RvI(iGInstantExperiencesParameters, userSession);
        A00(this);
    }
}
