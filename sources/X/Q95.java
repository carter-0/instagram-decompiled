package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.proxygen.TraceFieldType;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import net.trustly.android.sdk.views.TrustlyView;

public final class Q95 extends WebViewClient {
    public final int A00;
    public final Object A01;

    public Q95(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        WebView webView2;
        String string;
        if (6 - this.A00 != 0) {
            super.onPageCommitVisible(webView, str);
            return;
        }
        R8R r8r = (R8R) this.A01;
        Bundle bundle = r8r.mArguments;
        if (bundle != null && (webView2 = r8r.A02) != null && (string = bundle.getString("SimpleWebViewFragment.ARG_JAVASCRIPT")) != null) {
            webView2.evaluateJavascript(string, (ValueCallback) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r8, java.lang.String r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x009a;
                case 1: goto L_0x0073;
                case 2: goto L_0x008c;
                case 3: goto L_0x005e;
                case 4: goto L_0x0005;
                case 5: goto L_0x0065;
                case 6: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onPageFinished(r8, r9)
        L_0x0008:
            return
        L_0x0009:
            r4 = 0
            X.AnonymousClass7TF.A1H(r8, r9)
            super.onPageFinished(r8, r9)
            java.lang.Object r3 = r7.A01
            X.R8R r3 = (X.R8R) r3
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            java.util.Set r0 = X.R8R.A07
            com.instagram.simplewebview.SimpleWebViewConfig r2 = r3.A04
            if (r2 == 0) goto L_0x00f3
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x003f
            if (r1 == 0) goto L_0x003f
            X.SFz r1 = new X.SFz
            r1.<init>((com.instagram.simplewebview.SimpleWebViewConfig) r2)
            java.lang.String r0 = r8.getTitle()
            r1.A02 = r0
            com.instagram.simplewebview.SimpleWebViewConfig r0 = new com.instagram.simplewebview.SimpleWebViewConfig
            r0.<init>(r1)
            r3.A04 = r0
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = r0.A04(r3)
            r0.A0T()
        L_0x003f:
            android.view.View r0 = r3.A00
            X.AnonymousClass7TH.A0R(r0)
            android.webkit.WebView r0 = r3.A02
            if (r0 == 0) goto L_0x004e
            r0.setVisibility(r4)
            r0.getUrl()
        L_0x004e:
            java.lang.String r0 = "file:///android_asset/webview_error.html"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0008
            android.content.res.Resources r0 = X.DbV.A05(r3)
            X.Pxj.A14(r0, r8)
            return
        L_0x005e:
            java.lang.Object r0 = r7.A01
            X.QCR r0 = (X.QCR) r0
            com.fbpay.hub.common.view.HubProgressBar r1 = r0.A00
            goto L_0x0094
        L_0x0065:
            super.onPageFinished(r8, r9)
            java.lang.Object r0 = r7.A01
            X.E4U r0 = (X.E4U) r0
            android.widget.ImageView r1 = r0.A00
            if (r1 != 0) goto L_0x0094
            java.lang.String r0 = "loadingIndicator"
            goto L_0x0084
        L_0x0073:
            X.AnonymousClass7TG.A1N(r8, r9)
            super.onPageFinished(r8, r9)
            java.lang.Object r0 = r7.A01
            X.QCD r0 = (X.QCD) r0
            android.widget.ProgressBar r1 = r0.A01
            if (r1 != 0) goto L_0x0094
            java.lang.String r0 = "progressBar"
        L_0x0084:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008c:
            java.lang.Object r0 = r7.A01
            X.QCO r0 = (X.QCO) r0
            X.RQU r0 = r0.A00
            android.widget.ProgressBar r1 = r0.A01
        L_0x0094:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x009a:
            java.lang.Object r3 = r7.A01
            X.S3N r3 = (X.S3N) r3
            monitor-enter(r3)
            r5 = 0
            r3.A06 = r5     // Catch:{ all -> 0x00f0 }
            java.util.List r0 = r3.A05     // Catch:{ all -> 0x00f0 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00f0 }
            if (r0 != 0) goto L_0x00d4
            X.SRY r4 = r3.A02     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = r3.A04     // Catch:{ all -> 0x00f0 }
            java.util.List r1 = r3.A05     // Catch:{ all -> 0x00f0 }
            X.QJf r0 = new X.QJf     // Catch:{ all -> 0x00f0 }
            r0.<init>(r4, r2, r1)     // Catch:{ all -> 0x00f0 }
            X.SRY.A02(r0, r4, r5)     // Catch:{ all -> 0x00f0 }
            java.lang.String r6 = "Took %d ms to finish extract %d resource %s"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f0 }
            long r0 = r3.A00     // Catch:{ all -> 0x00f0 }
            long r4 = r4 - r0
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00f0 }
            java.util.List r0 = r3.A05     // Catch:{ all -> 0x00f0 }
            java.lang.Integer r1 = X.C51968G9o.A0t(r0)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x00f0 }
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r1, r0}     // Catch:{ all -> 0x00f0 }
            X.SQO.A03(r6, r0)     // Catch:{ all -> 0x00f0 }
        L_0x00d4:
            r0 = 0
            r3.A04 = r0     // Catch:{ all -> 0x00f0 }
            java.util.LinkedList r0 = X.Pxe.A1A()     // Catch:{ all -> 0x00f0 }
            java.util.List r0 = java.util.Collections.synchronizedList(r0)     // Catch:{ all -> 0x00f0 }
            r3.A05 = r0     // Catch:{ all -> 0x00f0 }
            java.util.LinkedList r0 = r3.A08     // Catch:{ all -> 0x00f0 }
            java.lang.Object r0 = r0.pollFirst()     // Catch:{ all -> 0x00f0 }
            com.facebook.browser.lite.ipc.PrefetchCacheEntry r0 = (com.facebook.browser.lite.ipc.PrefetchCacheEntry) r0     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00ee
            r3.A00(r0)     // Catch:{ all -> 0x00f0 }
        L_0x00ee:
            monitor-exit(r3)
            return
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q95.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        View view;
        switch (this.A00) {
            case 1:
                AnonymousClass7TF.A1H(webView, str);
                super.onPageStarted(webView, str, bitmap);
                ProgressBar progressBar = ((QCD) this.A01).A01;
                if (progressBar == null) {
                    0qQ.A0F("progressBar");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    progressBar.setVisibility(0);
                    return;
                }
            case 2:
                view = ((QCO) this.A01).A00.A01;
                break;
            case 3:
                view = ((QCR) this.A01).A00;
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                return;
        }
        view.setVisibility(0);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (6 - this.A00 != 0) {
            super.onReceivedError(webView, i, str, str2);
            return;
        }
        DbZ.A0t(0, webView, str, str2);
        super.onReceivedError(webView, i, str, str2);
        FragmentActivity activity = ((Fragment) this.A01).getActivity();
        if (activity != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putInt(TraceFieldType.ErrorCode, i);
            activity.getSupportFragmentManager().A0z("on_failure", A0a);
        }
        webView.loadUrl("file:///android_asset/webview_error.html");
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Fragment fragment;
        Bundle bundle;
        switch (this.A00) {
            case 1:
                fragment = (Fragment) this.A01;
                bundle = AnonymousClass7TE.A0a();
                bundle.putBoolean("WEB_VIEW_RESULT_ERROR_ENCOUNTERED", true);
                bundle.putString("WEB_VIEW_RESULT_ERROR_MESSAGE_FOR_LOGGING", "Webview received http error");
                break;
            case 2:
                fragment = (Fragment) this.A01;
                int statusCode = webResourceResponse.getStatusCode();
                String reasonPhrase = webResourceResponse.getReasonPhrase();
                bundle = AnonymousClass7TE.A0a();
                bundle.putString("ERROR_MESSAGE", reasonPhrase);
                bundle.putInt("ERROR_CODE", statusCode);
                break;
            case 3:
                int statusCode2 = webResourceResponse.getStatusCode();
                String reasonPhrase2 = webResourceResponse.getReasonPhrase();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("error", reasonPhrase2);
                A0a.putInt(TraceFieldType.ErrorCode, statusCode2);
                C11093S9u.A00(A0a, (Fragment) this.A01, false);
                return;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                return;
        }
        C11093S9u.A01(bundle, fragment, false);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (6 - this.A00 != 0) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            return;
        }
        0qQ.A0B(sslErrorHandler, 1);
        sslErrorHandler.cancel();
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (this.A00 != 0) {
            return super.shouldInterceptRequest(webView, str);
        }
        S3N s3n = (S3N) this.A01;
        String str2 = s3n.A04;
        if (str2 == null) {
            return null;
        }
        if (str2.equals(str)) {
            PrefetchCacheEntry prefetchCacheEntry = s3n.A03;
            0qQ.A0B(prefetchCacheEntry, 0);
            String str3 = prefetchCacheEntry.A01;
            if (str3 == null) {
                return null;
            }
            try {
                return new WebResourceResponse(prefetchCacheEntry.A02, prefetchCacheEntry.A00, new BufferedInputStream(new FileInputStream(str3)));
            } catch (FileNotFoundException unused) {
                return null;
            }
        } else if (!C11429STt.A06(C11429STt.A03(str)) || s3n.A05.size() >= 50) {
            return null;
        } else {
            s3n.A05.add(str);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        return super.shouldOverrideUrlLoading(r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018b, code lost:
        r1.putString(r0, r15);
        X.C11093S9u.A01(r1, r2, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r14, java.lang.String r15) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 1: goto L_0x011a;
                case 2: goto L_0x00ce;
                case 3: goto L_0x0079;
                case 4: goto L_0x0021;
                case 5: goto L_0x0005;
                case 6: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r2 = super.shouldOverrideUrlLoading(r14, r15)
            return r2
        L_0x000a:
            X.AnonymousClass7TG.A1N(r14, r15)
            X.0bY r0 = X.R8R.A06
            r2 = 1
            android.net.Uri r1 = X.0cp.A01(r0, r15)
            if (r1 == 0) goto L_0x0196
            java.lang.Object r0 = r13.A01
            X.R8R r0 = (X.R8R) r0
            boolean r0 = r0.A03(r1, r14)
            if (r0 == 0) goto L_0x0005
            return r2
        L_0x0021:
            r0 = 1
            X.0qQ.A0B(r15, r0)
            java.lang.String r1 = "instagram://hide/\\?reason=.*"
            X.11S r0 = new X.11S
            r0.<init>(r1)
            boolean r0 = r0.A08(r15)
            r1 = 0
            if (r0 == 0) goto L_0x0196
            java.lang.Object r6 = r13.A01
            X.R8V r6 = (X.R8V) r6
            boolean r0 = r6.A04
            r4 = 25
            if (r0 == 0) goto L_0x0059
            X.0eM r0 = r6.A07
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            if (r3 == 0) goto L_0x0054
            java.lang.String r2 = r6.A01
            if (r2 == 0) goto L_0x0054
            java.lang.String r1 = r6.A03
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = X.C66580MXl.A0z(r15, r4)
            X.C55002HaZ.A00(r3, r6, r2, r1, r0)
        L_0x0054:
            X.DbT.A1J(r6)
            goto L_0x0192
        L_0x0059:
            java.lang.String r8 = r6.A01
            if (r8 == 0) goto L_0x0054
            X.0eM r0 = r6.A07
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r9 = r6.A03
            int r12 = r6.A00
            java.lang.String r10 = X.C66580MXl.A0z(r15, r4)
            java.lang.String r11 = r6.A02
            if (r11 != 0) goto L_0x0071
            java.lang.String r11 = ""
        L_0x0071:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            X.C233822wX.A0T(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0054
        L_0x0079:
            java.lang.Object r3 = r13.A01
            X.QCR r3 = (X.QCR) r3
            java.net.URI r5 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0194 }
            r5.<init>(r15)     // Catch:{ URISyntaxException -> 0x0194 }
            java.util.Set r0 = r3.A03     // Catch:{ URISyntaxException -> 0x0194 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ URISyntaxException -> 0x0194 }
        L_0x0088:
            boolean r0 = r4.hasNext()     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x0194
            java.lang.Object r2 = r4.next()     // Catch:{ URISyntaxException -> 0x0194 }
            java.net.URI r2 = (java.net.URI) r2     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r1 = r5.getScheme()     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r0 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x0194 }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = r5.getHost()     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r0 = r2.getHost()     // Catch:{ URISyntaxException -> 0x0194 }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = r5.getPath()     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r0 = r2.getPath()     // Catch:{ URISyntaxException -> 0x0194 }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x0088
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "web_fragment_intercepted_url"
            r1.putString(r0, r15)
            r0 = 1
            X.C11093S9u.A00(r1, r3, r0)
            goto L_0x0192
        L_0x00ce:
            java.lang.Object r2 = r13.A01
            X.QCO r2 = (X.QCO) r2
            java.net.URI r5 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0194 }
            r5.<init>(r15)     // Catch:{ URISyntaxException -> 0x0194 }
            java.util.Set r0 = r2.A01     // Catch:{ URISyntaxException -> 0x0194 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ URISyntaxException -> 0x0194 }
        L_0x00dd:
            boolean r0 = r4.hasNext()     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x0194
            java.lang.Object r3 = r4.next()     // Catch:{ URISyntaxException -> 0x0194 }
            java.net.URI r3 = (java.net.URI) r3     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r1 = r5.getScheme()     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r0 = r3.getScheme()     // Catch:{ URISyntaxException -> 0x0194 }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = r5.getHost()     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r0 = r3.getHost()     // Catch:{ URISyntaxException -> 0x0194 }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = r5.getPath()     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r0 = r3.getPath()     // Catch:{ URISyntaxException -> 0x0194 }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x00dd
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "WEB_FRAGMENT_INTERCEPTED_URL"
            goto L_0x018b
        L_0x011a:
            if (r15 == 0) goto L_0x0194
            java.lang.Object r2 = r13.A01
            X.QCD r2 = (X.QCD) r2
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0194 }
            r3.<init>(r15)     // Catch:{ URISyntaxException -> 0x0194 }
            java.util.HashSet r0 = r2.A05     // Catch:{ URISyntaxException -> 0x0194 }
            java.util.Iterator r5 = X.AnonymousClass7TE.A1G(r0)     // Catch:{ URISyntaxException -> 0x0194 }
        L_0x012b:
            boolean r0 = r5.hasNext()     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x0194
            java.lang.Object r4 = X.AnonymousClass7TF.A0a(r5)     // Catch:{ URISyntaxException -> 0x0194 }
            java.net.URI r4 = (java.net.URI) r4     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r0 = r4.getScheme()     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x0151
            int r0 = r0.length()     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x0151
            java.lang.String r1 = r4.getScheme()     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r0 = r3.getScheme()     // Catch:{ URISyntaxException -> 0x0194 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x012b
        L_0x0151:
            java.lang.String r0 = r4.getHost()     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x016b
            int r0 = r0.length()     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x016b
            java.lang.String r1 = r4.getHost()     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r0 = r3.getHost()     // Catch:{ URISyntaxException -> 0x0194 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x012b
        L_0x016b:
            java.lang.String r0 = r4.getPath()     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x0185
            int r0 = r0.length()     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x0185
            java.lang.String r1 = r4.getPath()     // Catch:{ URISyntaxException -> 0x0194 }
            java.lang.String r0 = r3.getPath()     // Catch:{ URISyntaxException -> 0x0194 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ URISyntaxException -> 0x0194 }
            if (r0 == 0) goto L_0x012b
        L_0x0185:
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "WEB_VIEW_RESULT_INTERCEPT_URL"
        L_0x018b:
            r1.putString(r0, r15)
            r0 = 1
            X.C11093S9u.A01(r1, r2, r0)
        L_0x0192:
            r2 = 1
            return r2
        L_0x0194:
            r2 = 0
            return r2
        L_0x0196:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q95.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (7 - this.A00 != 0) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        String A0c = Pxf.A0c(webResourceRequest);
        if (!TrustlyView.A09 && ((!A0c.contains("paywithmybank.com") && !A0c.contains("trustly.one")) || !A0c.contains("/oauth/login/"))) {
            return true;
        }
        C10917S0u A012 = new SO4().A01();
        Intent intent = A012.A00;
        intent.setPackage("com.android.chrome");
        intent.addFlags(67108864);
        A012.A00(webView.getContext(), Uri.parse(A0c));
        return true;
    }
}
