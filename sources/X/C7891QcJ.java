package X;

import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.instagram.neko.playables.activity.PlayableProgressBar;

/* renamed from: X.QcJ  reason: case insensitive filesystem */
public final class C7891QcJ extends S7B {
    public boolean A00;
    public final /* synthetic */ R8W A01;

    public C7891QcJ(R8W r8w) {
        this.A01 = r8w;
    }

    public final void A02(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean A1b = C51973G9u.A1b(webView, webResourceRequest, webResourceError);
        super.A02(webView, webResourceRequest, webResourceError);
        this.A00 = A1b;
    }

    public final void A03(WebView webView, String str) {
        AnonymousClass7TG.A1N(webView, str);
        super.A03(webView, str);
        PlayableProgressBar playableProgressBar = this.A01.A02;
        if (playableProgressBar == null) {
            0qQ.A0F("playableProgressBar");
            throw AnonymousClass00P.createAndThrow();
        }
        playableProgressBar.A00(100);
        if (!this.A00) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("javascript:");
            A1A.append("FbPlayableAd = {");
            A1A.append("onCTAClick() {");
            A1A.append("var isTrusted = Boolean(event && event.isTrusted);");
            A1A.append("SecureFbPlayableAd.onCTAClick(isTrusted);");
            A1A.append("},");
            A1A.append("initializeLogging(endpoint_url) {");
            A1A.append("SecureFbPlayableAd.initializeLogging(endpoint_url);");
            A1A.append("},");
            A1A.append("logGameLoad() {");
            A1A.append("SecureFbPlayableAd.initializeLogging();");
            A1A.append("},");
            A1A.append("logButtonClick(name, x, y) {");
            A1A.append("SecureFbPlayableAd.logButtonClick(name, x, y);");
            A1A.append("},");
            A1A.append("logLevelComplete(level_name) {");
            A1A.append("SecureFbPlayableAd.logLevelComplete(level_name);");
            A1A.append("},");
            A1A.append("logEndCardShowUp() {");
            A1A.append("SecureFbPlayableAd.logEndCardShowUp();");
            A1A.append("},");
            String A0l = AnonymousClass7TF.A0l("};", A1A);
            0qQ.A07(A0l);
            webView.evaluateJavascript(A0l, (ValueCallback) null);
        }
    }
}
