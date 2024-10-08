package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import net.trustly.android.sdk.views.TrustlyView;

public final class Q94 extends WebViewClient {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Q94(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        if (this.A00 != 0) {
            super.onPageCommitVisible(webView, str);
        } else if (((Fragment) this.A02).mArguments != null) {
            ((WebView) this.A01).evaluateJavascript("javascript:(function() {window.addEventListener('resize', (event) => { var ratio = window.innerWidth / 320 < window.innerHeight / 567 ? window.innerWidth / 320 : window.innerHeight / 567;document.body.style.zoom = ratio;document.body.style.backgroundColor = 'black';var container = document.getElementsByClassName('publicIGAdPreviewContainer')[0];container.style = 'width: auto;';setTimeout(function(){document.getElementsByClassName('_86t img')[0].style.pointerEvents = 'auto';document.getElementsByClassName('_86t img')[0].onclick = function() {window.js_interface.interfacedUIMethod();};document.getElementsByClassName('_86n')[0].setAttribute('align', 'left');}, 300);});})();", (ValueCallback) null);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        WebView webView2 = webView;
        String str2 = str;
        switch (this.A00) {
            case 0:
                AnonymousClass7TF.A1H(webView2, str2);
                super.onPageFinished(webView2, str2);
                R8Q r8q = (R8Q) this.A02;
                BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = r8q.A03;
                if (boostWebViewAdPreviewFragment$Config == null) {
                    0qQ.A0F("config");
                    throw AnonymousClass00P.createAndThrow();
                }
                boolean z = boostWebViewAdPreviewFragment$Config.A0E;
                if (z && r8q.getActivity() != null) {
                    String str3 = boostWebViewAdPreviewFragment$Config.A03;
                    String str4 = boostWebViewAdPreviewFragment$Config.A01;
                    boolean z2 = boostWebViewAdPreviewFragment$Config.A0D;
                    boolean z3 = boostWebViewAdPreviewFragment$Config.A08;
                    boolean z4 = boostWebViewAdPreviewFragment$Config.A09;
                    boolean z5 = boostWebViewAdPreviewFragment$Config.A0A;
                    boolean z6 = boostWebViewAdPreviewFragment$Config.A0B;
                    boolean z7 = boostWebViewAdPreviewFragment$Config.A0C;
                    boolean z8 = boostWebViewAdPreviewFragment$Config.A07;
                    boolean z9 = boostWebViewAdPreviewFragment$Config.A04;
                    boolean z10 = boostWebViewAdPreviewFragment$Config.A06;
                    String str5 = boostWebViewAdPreviewFragment$Config.A00;
                    String str6 = str3;
                    String str7 = str5;
                    boolean z11 = z;
                    r8q.A03 = new BoostWebViewAdPreviewFragment$Config(str6, str4, webView2.getTitle(), str7, z11, z2, boostWebViewAdPreviewFragment$Config.A05, z4, z5, z6, z7, z3, z8, z9, z10);
                    Dbb.A0u(r8q);
                }
                AnonymousClass7TH.A0R(r8q.A00);
                WebView webView3 = (WebView) this.A01;
                webView3.setVisibility(0);
                webView3.getUrl();
                if ("file:///android_asset/webview_error.html".equals(str2)) {
                    Pxj.A14(DbV.A05(r8q), webView2);
                    return;
                }
                return;
            case 1:
                R8M r8m = (R8M) this.A01;
                r8m.A02.setVisibility(8);
                super.onPageFinished(webView2, str2);
                if ("file:///android_asset/webview_error.html".equals(str2)) {
                    Pxj.A14(DbV.A05(r8m), webView2);
                }
                if (r8m.A04 != AnonymousClass05K.A00) {
                    r8m.A07 = r8m.A01.getTitle();
                    FragmentActivity activity = r8m.getActivity();
                    17k.A07(activity, "Activity expected to be not null");
                    2dZ.A0t.A03(activity).A0T();
                    return;
                }
                return;
            default:
                TrustlyView trustlyView = (TrustlyView) this.A01;
                trustlyView.A06.loadUrl("javascript:TrustlyNativeSDK.resize(document.body.scrollWidth, document.body.scrollHeight)");
                int intValue = trustlyView.A00.intValue();
                if (intValue == 3) {
                    trustlyView.A00 = AnonymousClass05K.A0Y;
                } else if (intValue == 1) {
                    trustlyView.A00 = AnonymousClass05K.A0C;
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("page", "widget");
                    A1E.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "load");
                }
                String title = webView2.getTitle();
                if (title != null) {
                    Matcher matcher = Pattern.compile("[0-9]+").matcher(title);
                    while (matcher.find()) {
                        long parseLong = Long.parseLong(matcher.group()) / 100;
                        C13681Teq teq = trustlyView.A04;
                        if (teq != null && (parseLong == 4 || parseLong == 5)) {
                            teq.CI2(this.A02, AnonymousClass7TE.A1E());
                        }
                    }
                    return;
                }
                return;
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (1 - this.A00 != 0) {
            super.onPageStarted(webView, str, bitmap);
        } else {
            ((R8M) this.A01).A02.setVisibility(0);
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C13681Teq teq;
        if (2 - this.A00 != 0) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            return;
        }
        boolean z = true;
        try {
            z = true ^ Pxf.A0c(webResourceRequest).matches(".*\\.svg\\.png\\.jpg\\.jpeg\\.css\\.gif\\.webp");
        } catch (Exception unused) {
            ((TrustlyView) this.A01).A04.CI2(this.A02, AnonymousClass7TE.A1E());
        }
        if (!TrustlyView.A09 && (teq = ((TrustlyView) this.A01).A04) != null && z) {
            teq.CI2(this.A02, AnonymousClass7TE.A1E());
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.A00 != 0) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            return;
        }
        0qQ.A0B(sslErrorHandler, 1);
        sslErrorHandler.cancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c8, code lost:
        r16.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02cb, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0352, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0379, code lost:
        return super.shouldOverrideUrlLoading(r6, r3);
     */
    @kotlin.Deprecated(message = "Deprecated in Java")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r18, java.lang.String r19) {
        /*
            r17 = this;
            r7 = r17
            int r0 = r7.A00
            r3 = r19
            r6 = r18
            switch(r0) {
                case 0: goto L_0x0206;
                case 1: goto L_0x00d1;
                default: goto L_0x000b;
            }
        L_0x000b:
            if (r19 == 0) goto L_0x0375
            java.lang.Object r5 = r7.A01
            net.trustly.android.sdk.views.TrustlyView r5 = (net.trustly.android.sdk.views.TrustlyView) r5
            java.lang.String r0 = r5.A02
            boolean r0 = r3.startsWith(r0)
            r2 = 1
            if (r0 == 0) goto L_0x008c
            X.Teq r8 = r5.A05
        L_0x001c:
            if (r8 == 0) goto L_0x0375
            java.lang.Object r9 = r7.A02
            android.net.Uri r7 = android.net.Uri.parse(r3)
            java.lang.String r10 = r7.getEncodedQuery()
            if (r10 != 0) goto L_0x0057
            java.util.Set r5 = java.util.Collections.emptySet()
        L_0x002e:
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "requestSignature=.*"
            java.lang.String r0 = ""
            java.lang.String r1 = r3.replaceAll(r1, r0)
            java.lang.String r0 = "url"
            r4.put(r0, r1)
            java.util.Iterator r3 = r5.iterator()
        L_0x0045:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x034f
            java.lang.String r1 = X.AnonymousClass7TE.A18(r3)
            java.lang.String r0 = r7.getQueryParameter(r1)
            r4.put(r1, r0)
            goto L_0x0045
        L_0x0057:
            java.util.LinkedHashSet r6 = X.DbS.A0y()
            r5 = 0
        L_0x005c:
            r0 = 38
            int r4 = r10.indexOf(r0, r5)
            r1 = -1
            if (r4 != r1) goto L_0x0069
            int r4 = r10.length()
        L_0x0069:
            r0 = 61
            int r0 = r10.indexOf(r0, r5)
            if (r0 > r4) goto L_0x0073
            if (r0 != r1) goto L_0x0074
        L_0x0073:
            r0 = r4
        L_0x0074:
            java.lang.String r0 = r10.substring(r5, r0)
            java.lang.String r0 = android.net.Uri.decode(r0)
            r6.add(r0)
            int r5 = r4 + 1
            int r0 = r10.length()
            if (r5 < r0) goto L_0x005c
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r6)
            goto L_0x002e
        L_0x008c:
            java.lang.String r0 = r5.A01
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0097
            X.Teq r8 = r5.A04
            goto L_0x001c
        L_0x0097:
            java.lang.String r0 = "msg://"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0375
            java.lang.String r0 = "msg://push?"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0352
            r0 = 11
            java.lang.String r1 = r3.substring(r0)
            java.lang.String r0 = "\\|"
            java.lang.String[] r4 = r1.split(r0)
            r0 = 0
            r1 = r4[r0]
            java.lang.String r0 = "PayWithMyBank.createTransaction"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0352
            int r0 = r4.length
            java.lang.String r3 = "paymentProviderId"
            java.util.Map r1 = r5.A03
            if (r0 <= r2) goto L_0x00ce
            r0 = r4[r2]
        L_0x00ca:
            r1.put(r3, r0)
            return r2
        L_0x00ce:
            java.lang.String r0 = ""
            goto L_0x00ca
        L_0x00d1:
            android.net.Uri r5 = X.0cp.A03(r3)
            java.lang.Object r4 = r7.A01
            X.R8M r4 = (X.R8M) r4
            java.lang.String r1 = r4.A06
            r2 = 1
            if (r1 == 0) goto L_0x00ec
            java.lang.String r0 = r5.getHost()
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00ec
            r6.loadUrl(r3)
            return r2
        L_0x00ec:
            java.lang.String r1 = r5.getScheme()
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0375
            java.lang.String r1 = r5.getHost()
            java.lang.String r0 = "checkpoint"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x014a
            java.lang.String r1 = r5.getPath()
            java.lang.String r0 = "/dismiss"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011c
            java.lang.String r1 = r5.getPath()
            java.lang.String r0 = "/switch"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x014a
        L_0x011c:
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x0352
            java.lang.String r1 = r5.getPath()
            java.lang.String r0 = "/switch"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0144
            com.instagram.common.session.UserSession r0 = r4.A03
            X.FZ1 r0 = X.F5E.A00(r0)
            r0.A01()
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            android.content.Context r1 = r0.getBaseContext()
            com.instagram.common.session.UserSession r0 = r4.A03
            X.F5E.A01(r1, r5, r0)
        L_0x0144:
            androidx.fragment.app.FragmentActivity r16 = r4.getActivity()
            goto L_0x02c8
        L_0x014a:
            java.lang.Integer r1 = r4.A04
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            if (r1 != r9) goto L_0x01aa
            java.lang.String r1 = r5.getHost()
            java.lang.String r0 = "reported"
            boolean r0 = r0.equals(r1)
            java.lang.String r8 = "action"
            if (r0 == 0) goto L_0x035c
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131972220(0x7f13507c, float:1.9581441E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A07 = r0
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
            r4.A00 = r0
            r0 = 0
            r4.A08 = r0
            java.lang.Integer r0 = r4.A05
            if (r0 != r9) goto L_0x038e
            com.instagram.common.session.UserSession r0 = r4.A03
            X.3Js r3 = X.C240133Js.A00(r0)
            java.lang.String r0 = "source"
            java.lang.String r1 = r5.getQueryParameter(r0)
            java.lang.String r0 = "selfinjurydone"
            boolean r0 = r0.equals(r1)
            r3.A02 = r0
            com.instagram.common.session.UserSession r0 = r4.A03
            X.3Js r3 = X.C240133Js.A00(r0)
            java.lang.String r1 = r5.getQueryParameter(r8)
            java.lang.String r0 = "falsenews"
            boolean r0 = r0.equals(r1)
            r3.A01 = r0
            com.instagram.common.session.UserSession r0 = r4.A03
            X.3Js r0 = X.C240133Js.A00(r0)
            r0.A00 = r2
            goto L_0x038e
        L_0x01aa:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x038e
            java.lang.String r1 = r5.getHost()
            java.lang.String r0 = "feedback_sent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r1 = r7.A02
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131962390(0x7f132a16, float:1.9561504E38)
            java.lang.String r0 = r4.getString(r0)
            X.C59689JTv.A09(r1, r0)
            goto L_0x038e
        L_0x01ca:
            java.lang.String r1 = r5.getHost()
            java.lang.String r0 = "promote"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x038e
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r0 = r4.A03
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "pk"
            r3.putString(r0, r1)
            com.instagram.common.session.UserSession r0 = r4.A03
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "accessToken"
            r3.putString(r0, r1)
            java.lang.String r1 = "entryPoint"
            java.lang.String r0 = "webview"
            r3.putString(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            java.lang.String r0 = "Activity expected to be not null"
            X.17k.A07(r1, r0)
            com.instagram.common.session.UserSession r0 = r4.A03
            X.FHB.A09(r3, r1, r0)
            goto L_0x038e
        L_0x0206:
            r9 = 0
            X.AnonymousClass7TF.A1H(r6, r3)
            java.lang.Object r5 = r7.A02
            X.R8Q r5 = (X.R8Q) r5
            X.0bY r0 = r5.A08
            r2 = 1
            android.net.Uri r8 = X.0cp.A01(r0, r3)
            if (r8 != 0) goto L_0x0219
            r2 = 0
            return r2
        L_0x0219:
            java.lang.String r10 = "uri"
            java.lang.String r11 = X.DbT.A10(r8)
            com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config r1 = r5.A03
            java.lang.String r15 = "config"
            r4 = 0
            if (r1 == 0) goto L_0x0392
            boolean r0 = r1.A08
            java.lang.String r14 = "Required value was null."
            if (r0 == 0) goto L_0x024d
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x024d
            android.net.Uri r0 = X.0cp.A03(r0)
            java.lang.String r1 = r0.getHost()
        L_0x0239:
            androidx.fragment.app.FragmentActivity r16 = r5.requireActivity()
            if (r1 == 0) goto L_0x024f
            java.lang.String r0 = r8.getHost()
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x024f
            r6.loadUrl(r11)
            return r2
        L_0x024d:
            r1 = r4
            goto L_0x0239
        L_0x024f:
            java.lang.String r12 = r8.getScheme()
            if (r12 == 0) goto L_0x0268
            java.util.Set r0 = X.R8Q.A0A
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x0268
            android.content.Intent r0 = X.Pxe.A0F(r8)
            boolean r0 = X.0kR.A0H(r0, r5)
            if (r0 == 0) goto L_0x0268
            return r2
        L_0x0268:
            java.lang.String r11 = r8.getPath()
            java.lang.String r1 = r8.getHost()
            if (r12 == 0) goto L_0x0375
            java.lang.String r0 = "instagram"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0375
            java.lang.String r12 = r8.getPath()
            java.lang.String r13 = r8.getHost()
            if (r13 == 0) goto L_0x02cc
            java.lang.String r0 = "checkpoint"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x02cc
            if (r12 == 0) goto L_0x02cc
            java.lang.String r0 = "/dismiss"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x029e
            java.lang.String r0 = "/switch"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x02cc
        L_0x029e:
            if (r11 == 0) goto L_0x02c8
            java.lang.String r0 = "/switch"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x02c8
            X.0eM r1 = r5.A09
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x02c8
            X.0lg r0 = X.DbT.A0X(r1)
            X.FZ1 r0 = X.F5E.A00(r0)
            r0.A01()
            X.0lg r1 = X.DbT.A0X(r1)
            if (r1 == 0) goto L_0x02c8
            android.content.Context r0 = r16.getBaseContext()
            X.F5E.A01(r0, r8, r1)
        L_0x02c8:
            r16.finish()
            return r2
        L_0x02cc:
            java.lang.String r0 = "browser"
            if (r1 == 0) goto L_0x0353
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x032e
            if (r11 == 0) goto L_0x032e
            java.lang.String r0 = "/dismiss"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x032e
            java.lang.String r0 = "message"
            java.lang.String r1 = r8.getQueryParameter(r0)
            if (r1 == 0) goto L_0x02f4
            android.content.Context r0 = r5.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
            X.C59689JTv.A03(r0, r1, r4, r9)
        L_0x02f4:
            java.lang.String r0 = "action"
            java.lang.String r1 = r8.getQueryParameter(r0)
            com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config r0 = r5.A03
            if (r0 == 0) goto L_0x0392
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x02c8
            if (r1 == 0) goto L_0x02c8
            java.lang.String r0 = "updated"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02c8
            X.0eM r0 = r5.A09
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            if (r3 == 0) goto L_0x02c8
            X.1E8 r1 = X.1E7.A00(r3)
            com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config r0 = r5.A03
            if (r0 == 0) goto L_0x0392
            java.lang.String r0 = r0.A00
            X.1Xj r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x02c8
            X.1Xy r0 = r1.A0C
            r0.EdA(r4)
            r1.AE7(r3)
            goto L_0x02c8
        L_0x032e:
            if (r1 == 0) goto L_0x0353
            java.lang.String r0 = r8.getQueryParameter(r10)
            if (r0 == 0) goto L_0x0353
            java.lang.String r1 = r8.getQueryParameter(r10)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0352
            if (r1 == 0) goto L_0x034a
            android.net.Uri r0 = X.0cp.A03(r1)
            X.0kR.A04(r0, r5)
            return r2
        L_0x034a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x034f:
            r8.CI2(r9, r4)
        L_0x0352:
            return r2
        L_0x0353:
            com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config r0 = r5.A03
            if (r0 == 0) goto L_0x0392
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0375
            return r2
        L_0x035c:
            java.lang.String r1 = r5.getHost()
            java.lang.String r0 = "native-action"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x037a
            java.lang.String r1 = r5.getQueryParameter(r8)
            java.lang.String r0 = "direct-message"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x037a
        L_0x0375:
            boolean r2 = super.shouldOverrideUrlLoading(r6, r3)
            return r2
        L_0x037a:
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131972171(0x7f13504b, float:1.9581342E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A07 = r0
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            r4.A00 = r0
            r4.A08 = r2
        L_0x038e:
            X.Dbb.A0u(r4)
            return r2
        L_0x0392:
            X.0qQ.A0F(r15)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q94.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    @Deprecated(message = "Deprecated in Java")
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.A00) {
            case 0:
                DbZ.A0t(0, webView, str, str2);
                super.onReceivedError(webView, i, str, str2);
                FragmentActivity activity = ((Fragment) this.A02).getActivity();
                if (activity != null) {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putInt(TraceFieldType.ErrorCode, i);
                    activity.getSupportFragmentManager().A0z("on_failure", A0a);
                    break;
                }
                break;
            case 1:
                super.onReceivedError(webView, i, str, str2);
                ((R8M) this.A01).A02.setVisibility(8);
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                return;
        }
        webView.loadUrl("file:///android_asset/webview_error.html");
    }
}
