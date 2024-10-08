package X;

import android.net.Uri;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.webview.chromium.membrane.AppHostedShareDelegate;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;

public final class Q98 extends WebViewClient implements AppHostedShareDelegate {
    public S78 A00;

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        S78 s78 = this.A00;
        SystemWebView A002 = C7903QcV.A00(webView);
        if (s78 instanceof QL8) {
            SQO.A03("doUpdateVisitedHistory %s", new Object[]{str});
            SSR.A00().A04("BLWVC.doUpdateVisitedHistory");
            for (C13922TlQ AQ3 : ((QL8) s78).A08) {
                AQ3.AQ3(A002, str, z);
            }
        }
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        S78 s78 = this.A00;
        if (s78 instanceof QL8) {
            QL8 ql8 = (QL8) s78;
            SSR.A00().A04("BLWVC.onPageCommitVisible");
            if (ql8.A09) {
                A9z a9z = ql8.A0E.A0d;
                long currentTimeMillis = System.currentTimeMillis();
                if (a9z.A0p) {
                    a9z.A0A = currentTimeMillis;
                }
            }
            if (!ql8.A0A) {
                BrowserLiteFragment browserLiteFragment = ql8.A0E;
                AnonymousClass7TH.A0R(browserLiteFragment.A0a);
                AnonymousClass7TH.A0R(browserLiteFragment.A0b);
            }
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        this.A00.A06(C7903QcV.A00(webView), str);
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b1, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageStarted(android.webkit.WebView r15, java.lang.String r16, android.graphics.Bitmap r17) {
        /*
            r14 = this;
            X.S78 r8 = r14.A00
            com.facebook.browser.lite.webview.SystemWebView r6 = X.C7903QcV.A00(r15)
            boolean r0 = r8 instanceof X.QL8
            if (r0 == 0) goto L_0x01c9
            X.QL8 r8 = (X.QL8) r8
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLWVC.onPageStarted"
            r1.A04(r0)
            r5 = 1
            r4 = 0
            r7 = r16
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "onPageStarted %s"
            X.SQO.A03(r0, r1)
            r8.A0A = r4
            r8.A07 = r7
            long r0 = r8.A03
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0035
            long r0 = java.lang.System.currentTimeMillis()
            r8.A03 = r0
        L_0x0035:
            java.lang.String r0 = "file:///android_asset/"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0053
            X.SRY r3 = r8.A0F
            java.lang.String r2 = r6.A05()
            android.content.Intent r1 = r8.A0D
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_TRACKING"
            android.os.Bundle r1 = r1.getBundleExtra(r0)
            X.QJl r0 = new X.QJl
            r0.<init>(r1, r3, r2, r7)
            X.SRY.A02(r0, r3, r4)
        L_0x0053:
            java.util.List r0 = r8.A08
            java.util.Iterator r1 = r0.iterator()
        L_0x0059:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r1.next()
            X.TlQ r0 = (X.C13922TlQ) r0
            r0.DWB(r7)
            goto L_0x0059
        L_0x0069:
            r6.A0U = r4
            r6.A0S = r4
            r6.A0V = r5
            X.Rx5 r3 = r6.A0D
            if (r3 == 0) goto L_0x0154
            android.net.Uri r1 = android.net.Uri.parse(r7)
            X.0bq r0 = X.C11429STt.A00
            java.lang.String r1 = r1.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00a1
            java.util.Set r0 = X.C11429STt.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "/dialog/oauth"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x00a1
            com.facebook.browser.lite.BrowserLiteFragment r0 = r3.A03
            X.A9z r1 = r0.A0d
            boolean r0 = r1.A0p
            if (r0 == 0) goto L_0x00a1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A0R = r0
        L_0x00a1:
            com.facebook.browser.lite.BrowserLiteFragment r2 = r3.A03
            boolean r0 = r2.A0r
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r2.A0y
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = r6.A0L
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = r6.A07(r4)
            r6.A0L = r0
        L_0x00b5:
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00e1
            r2.A0y = r5
            X.A9z r1 = r2.A0d
            long r10 = java.lang.System.currentTimeMillis()
            boolean r0 = r1.A0p
            if (r0 == 0) goto L_0x01a5
            r1.A0H = r10
            android.os.Parcelable$Creator r0 = com.facebook.iabeventlogging.model.IABEvent.CREATOR
            java.lang.String r9 = r1.A0Z
            X.0JP r0 = r1.A0m
            long r12 = r0.now()
            com.facebook.privacy.zone.api.ZonedValue r8 = r1.A0Q
            com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent r7 = new com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent
            r7.<init>(r8, r9, r10, r12)
        L_0x00da:
            android.os.Bundle r1 = r2.A08
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r2.A0e
            r2.CjX(r1, r7, r0)
        L_0x00e1:
            X.SPF r1 = r2.A0J
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0115
            X.QLA r7 = r3.A04
            X.0eP r0 = X.S8E.A00(r1)
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0115
            X.Sbo r1 = X.C11527Sbo.A00
            java.lang.String r0 = "window.localStorage.setItem('session-aa-os-name', 'Android');"
            com.facebook.browser.lite.webview.SystemWebView r7 = (com.facebook.browser.lite.webview.SystemWebView) r7
            X.QcV r8 = r7.A04
            r8.evaluateJavascript(r0, r1)
            java.lang.String r7 = "window.localStorage.setItem('session-aa-os-version', '"
            int r1 = X.RUA.A00()
            java.lang.String r0 = "');"
            java.lang.String r1 = X.002.A0c(r7, r0, r1)
            X.Sbp r0 = X.C11528Sbp.A00
            r8.evaluateJavascript(r1, r0)
        L_0x0115:
            X.SHI r1 = r2.A0I
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0154
            X.QLA r2 = r3.A04
            android.util.Pair r1 = X.S8D.A00(r1)
            java.lang.Object r0 = r1.first
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0154
            java.lang.Object r0 = r1.second
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "For url %s, setting local storage"
            X.SQO.A03(r0, r1)
            java.lang.String r1 = "window.localStorage.setItem('session-aa-os-name', 'Android');"
            X.Sbm r0 = X.C11525Sbm.A00
            com.facebook.browser.lite.webview.SystemWebView r2 = (com.facebook.browser.lite.webview.SystemWebView) r2
            X.QcV r3 = r2.A04
            r3.evaluateJavascript(r1, r0)
            java.lang.String r2 = "window.localStorage.setItem('session-aa-os-version', '"
            int r1 = X.RU6.A00()
            java.lang.String r0 = "');"
            java.lang.String r1 = X.002.A0c(r2, r0, r1)
            X.Sbn r0 = X.C11526Sbn.A00
            r3.evaluateJavascript(r1, r0)
        L_0x0154:
            X.Rx8 r7 = r6.A0G
            r7.A03 = r5
            r7.A02 = r4
            X.QLA.A00(r6)
            int r2 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L_0x016e
            java.lang.String r1 = "(function () { window.__outer_height_override__ = "
            java.lang.String r0 = "; })()"
            java.lang.String r0 = X.002.A0c(r1, r0, r2)
            r6.A0F(r0)
        L_0x016e:
            int r2 = r7.A01
            if (r2 == r3) goto L_0x017d
            java.lang.String r1 = "(function () { window.__screen_top_override__ = "
            java.lang.String r0 = "; })()"
            java.lang.String r0 = X.002.A0c(r1, r0, r2)
            r6.A0F(r0)
        L_0x017d:
            X.Rvy r1 = r6.A0H
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x01c9
            X.QLA r4 = r1.A01
            android.content.Context r2 = r1.A00
            X.0qQ.A0B(r2, r5)
            java.lang.ref.WeakReference r1 = X.C9120RPs.A00
            if (r1 == 0) goto L_0x0199
            r0 = 0
            java.lang.Object r3 = r1.get()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x01c6
            X.C9120RPs.A00 = r0
        L_0x0199:
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131886136(0x7f120038, float:1.9406842E38)
            java.io.InputStreamReader r2 = X.Pxg.A0a(r1, r0)
            goto L_0x01a9
        L_0x01a5:
            com.facebook.iabeventlogging.model.IABEmptyEvent r7 = com.facebook.iabeventlogging.model.IABEvent.A04
            goto L_0x00da
        L_0x01a9:
            java.lang.String r3 = X.1r9.A00(r2)     // Catch:{ all -> 0x01ae }
            goto L_0x01b5
        L_0x01ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01b0 }
        L_0x01b0:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x01b5:
            r2.close()
            int r1 = r3.length()
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 >= r0) goto L_0x01c6
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r3)
            X.C9120RPs.A00 = r0
        L_0x01c6:
            r4.A0F(r3)
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q98.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00.A05(webResourceError, webResourceRequest, C7903QcV.A00(webView));
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        S78 s78 = this.A00;
        C10191Ro7 ro7 = new C10191Ro7(httpAuthHandler);
        if (s78 instanceof QL8) {
            SSR.A00().A04("BLWVC.onReceivedHttpAuthRequest");
        }
        ro7.A00.cancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        if (com.facebook.react.views.webview.ReactWebViewManager.BLANK_URL.equals(r1) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        if (r1 != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        if (r1.equals(r7) == false) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceivedSslError(android.webkit.WebView r9, android.webkit.SslErrorHandler r10, android.net.http.SslError r11) {
        /*
            r8 = this;
            X.S78 r2 = r8.A00
            com.facebook.browser.lite.webview.SystemWebView r5 = X.C7903QcV.A00(r9)
            X.Ro6 r3 = new X.Ro6
            r3.<init>(r10)
            boolean r0 = r2 instanceof X.QL8
            if (r0 == 0) goto L_0x00b8
            X.QL8 r2 = (X.QL8) r2
            java.lang.String r0 = r11.toString()
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "onReceivedSslError %s"
            X.SQO.A03(r0, r1)
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLWVC.onReceivedSslError"
            r1.A04(r0)
            com.facebook.browser.lite.BrowserLiteFragment r4 = r2.A0E
            X.QLA r0 = r4.C8U()
            if (r0 != r5) goto L_0x00b8
            java.lang.String r7 = r11.getUrl()
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x0088
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0097
            android.net.Uri r0 = r4.A07
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0097
        L_0x0049:
            android.net.Uri r0 = r4.A07
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = r11.getUrl()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005d
            boolean r0 = r5.A0c
            if (r0 != 0) goto L_0x006f
        L_0x005d:
            android.net.http.SslError r0 = r2.A04
            if (r0 != 0) goto L_0x006f
            r2.A04 = r11
            X.A9z r5 = r4.A0d
            int r1 = r11.getPrimaryError()
            boolean r0 = r5.A0p
            if (r0 == 0) goto L_0x006f
            r5.A03 = r1
        L_0x006f:
            X.TiP r0 = r2.A0G
            if (r0 == 0) goto L_0x00a2
            android.content.Intent r1 = r2.A0D
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_NEW_SSL_ERROR_SCREEN_ENABLED"
            boolean r0 = r1.getBooleanExtra(r0, r6)
            if (r0 == 0) goto L_0x00a2
            r11.getUrl()
            X.7kb r0 = r2.A0H
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            r0.A0Q(r3)
            return
        L_0x0088:
            java.lang.String r1 = r5.A05()
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = "about:blank"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0049
            goto L_0x009b
        L_0x0097:
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L_0x00b8
        L_0x009b:
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x00b8
            goto L_0x0049
        L_0x00a2:
            X.QC4 r2 = new X.QC4
            r2.<init>()
            r2.A00 = r4
            X.0hq r0 = r4.mFragmentManager
            X.0s1 r1 = new X.0s1
            r1.<init>(r0)
            java.lang.String r0 = "SSLDialog"
            r1.A0B(r2, r0)
            r1.A01()
        L_0x00b8:
            android.webkit.SslErrorHandler r0 = r3.A00
            r0.cancel()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q98.onReceivedSslError(android.webkit.WebView, android.webkit.SslErrorHandler, android.net.http.SslError):void");
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.A00.A07(renderProcessGoneDetail, C7903QcV.A00(webView));
    }

    public final void onShare(String str, String str2, Uri uri, AppHostedShareDelegate.ShareResultCallback shareResultCallback) {
        if (this.A00 instanceof QL8) {
            shareResultCallback.onResult(AppHostedShareDelegate.ShareResult.OK);
            return;
        }
        throw AnonymousClass7TE.A0z("onShare must be overridden");
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        S78 s78 = this.A00;
        SystemWebView A002 = C7903QcV.A00(webView);
        if (s78 instanceof QL8) {
            QL8 ql8 = (QL8) s78;
            C13887TjA tjA = ql8.A0E.A0X;
            ql8.A05 = tjA;
            if (tjA != null && C9225RUc.A00(webResourceRequest, tjA)) {
                return ql8.A05.handleRequest(webResourceRequest, ql8, ql8.A06);
            }
            Uri url = webResourceRequest.getUrl();
            WebResourceResponse A003 = QL8.A00(url, ql8, S78.A03(webResourceRequest, ql8.A0D.getBooleanExtra("BrowserLiteIntent.EXTRA_ENABLE_GET_DOMAIN_FROM_REFERER_HEADER", false)));
            if (A003 == null) {
                return QL8.A01(ql8, A002, url.toString());
            }
            return A003;
        }
        Pxf.A0c(webResourceRequest);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r9, android.webkit.WebResourceRequest r10) {
        /*
            r8 = this;
            X.S78 r2 = r8.A00
            com.facebook.browser.lite.webview.SystemWebView r5 = X.C7903QcV.A00(r9)
            boolean r0 = r2 instanceof X.QL8
            if (r0 == 0) goto L_0x00c3
            X.QL8 r2 = (X.QL8) r2
            java.lang.String r4 = X.Pxf.A0c(r10)
            java.lang.String r6 = "BrowserLiteFragment"
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "shouldOverrideUrlLoading %s"
            X.SQO.A01(r6, r0, r1)
            java.lang.String r0 = r5.A05()
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = r5.A05()
            android.net.Uri r1 = X.C11429STt.A01(r0)
            if (r1 == 0) goto L_0x0094
            java.lang.String r0 = r1.getHost()
            if (r0 == 0) goto L_0x0094
            java.lang.String r1 = r1.getHost()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = ".facebook.com"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = ".instagram.com"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0094
        L_0x004d:
            r7 = 1
        L_0x004e:
            boolean r0 = r10.isForMainFrame()
            if (r0 != 0) goto L_0x0077
            boolean r0 = r10.hasGesture()
            if (r0 != 0) goto L_0x0077
            if (r7 != 0) goto L_0x0077
            android.net.Uri r0 = r10.getUrl()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r0 = "intent"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0077
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "Blocking intent navigation with no user gesture for %s"
        L_0x0072:
            X.SQO.A01(r6, r0, r1)
            r1 = 1
            return r1
        L_0x0077:
            boolean r0 = r10.hasGesture()
            if (r0 != 0) goto L_0x0096
            boolean r0 = r10.isRedirect()
            if (r0 != 0) goto L_0x0096
            boolean r0 = r5.A0c
            if (r0 == 0) goto L_0x0096
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0096
            if (r7 != 0) goto L_0x0096
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "Blocking url change with no user gesture and no redirect for %s"
            goto L_0x0072
        L_0x0094:
            r7 = 0
            goto L_0x004e
        L_0x0096:
            boolean r0 = r10.isForMainFrame()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10.isRedirect()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = X.QL8.A02(r2, r5, r1, r0, r4)
            if (r1 != 0) goto L_0x00ae
            r2.A07 = r4
        L_0x00ae:
            X.0TC r0 = X.QL8.A0R
            android.net.Uri r0 = X.0cp.A00(r0, r4)
            if (r1 == 0) goto L_0x00c1
            if (r0 == 0) goto L_0x00c1
            boolean r0 = X.C11429STt.A04(r0)
            if (r0 != 0) goto L_0x00c1
        L_0x00be:
            r2.A0B = r3
            return r1
        L_0x00c1:
            r3 = 0
            goto L_0x00be
        L_0x00c3:
            java.lang.String r0 = X.Pxf.A0c(r10)
            boolean r1 = r2.A08(r5, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q98.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }

    public final void onLoadResource(WebView webView, String str) {
    }

    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        clientCertRequest.cancel();
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return false;
    }

    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        message.sendToTarget();
    }

    public final void onScaleChanged(WebView webView, float f, float f2) {
    }

    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
    }

    @Deprecated
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        S78 s78 = this.A00;
        SystemWebView A002 = C7903QcV.A00(webView);
        if (!(s78 instanceof QL8)) {
            return null;
        }
        QL8 ql8 = (QL8) s78;
        WebResourceResponse A003 = QL8.A00(0cp.A03(str), ql8, "");
        if (A003 == null) {
            return QL8.A01(ql8, A002, str);
        }
        return A003;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.A00.A08(C7903QcV.A00(webView), str);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
    }
}
