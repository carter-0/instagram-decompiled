package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.android.webview.chromium.membrane.HeliumWebViewExtensions;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLandingPageFinishedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;

public abstract class QLA extends RRE implements B0S {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public Intent A0A;
    public A31 A0B;
    public C10185Ro1 A0C;
    public C10727Rx5 A0D;
    public BrowserLiteWebChromeClient A0E;
    public C10376RrD A0F;
    public C10729Rx8 A0G;
    public C10664Rvy A0H;
    public B0S A0I;
    public Boolean A0J;
    public Boolean A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public S78 A0d;

    public final BrowserLiteWebChromeClient A03() {
        BrowserLiteWebChromeClient browserLiteWebChromeClient;
        Q8q q8q = ((SystemWebView) this).A02;
        if (q8q == null || (browserLiteWebChromeClient = q8q.A00) == null) {
            return null;
        }
        return browserLiteWebChromeClient;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.QcV, android.view.View] */
    public final Q8n A04() {
        SystemWebView systemWebView = (SystemWebView) this;
        Q8n q8n = new Q8n();
        boolean z = systemWebView.A0N;
        ? r0 = systemWebView.A04;
        if (z) {
            C7903QcV.A01(q8n, r0);
            return q8n;
        }
        r0.onProvideAutofillVirtualStructure(q8n, 0);
        return q8n;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Q98, android.webkit.WebViewClient] */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.QcV, android.webkit.WebView] */
    public final void A0D(S78 s78) {
        SystemWebView systemWebView = (SystemWebView) this;
        ? webViewClient = new WebViewClient();
        webViewClient.A00 = s78;
        systemWebView.A03 = webViewClient;
        systemWebView.A04.setWebViewClient(webViewClient);
        HeliumWebViewExtensions heliumWebViewExtensions = systemWebView.A01;
        if (heliumWebViewExtensions != null) {
            heliumWebViewExtensions.setShareDelegate(systemWebView.A03);
        }
        this.A0d = s78;
    }

    public final void A0F(String str) {
        A0E((C13705TfO) null, str, true);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.QcV, android.webkit.WebView] */
    public final boolean A0G() {
        if (((SystemWebView) this).A04.canGoBack()) {
            T9q A012 = A01();
            if (A012.A01.size() >= 2 && A012.A00 == 1) {
                String str = A012.A00(0).A03;
                String str2 = A012.A00(1).A03;
                if (ReactWebViewManager.BLANK_URL.equals(str) || TextUtils.equals(str, str2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.QcV, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.QLA r6) {
        /*
            X.Rx8 r5 = r6.A0G
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0061
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0061
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0061
            int r0 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L_0x0018
            int r0 = r5.A01
            if (r0 == r1) goto L_0x0061
        L_0x0018:
            r0 = r6
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            android.content.Context r2 = r0.getContext()
            r4 = 1
            X.0qQ.A0B(r2, r4)
            java.lang.ref.WeakReference r1 = X.C9119RPr.A00
            if (r1 == 0) goto L_0x0034
            r0 = 0
            java.lang.Object r3 = r1.get()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x005c
            X.C9119RPr.A00 = r0
        L_0x0034:
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131886134(0x7f120036, float:1.9406838E38)
            java.io.InputStreamReader r2 = X.Pxg.A0a(r1, r0)
            java.lang.String r3 = X.1r9.A00(r2)     // Catch:{ all -> 0x0044 }
            goto L_0x004b
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x004b:
            r2.close()
            int r1 = r3.length()
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 >= r0) goto L_0x005c
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r3)
            X.C9119RPr.A00 = r0
        L_0x005c:
            r6.A0F(r3)
            r5.A02 = r4
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QLA.A00(X.QLA):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r1 != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A05() {
        /*
            r4 = this;
            X.Ro1 r0 = r4.A0C
            if (r0 == 0) goto L_0x0029
            com.facebook.browser.lite.BrowserLiteFragment r0 = r0.A00
            java.util.List r0 = r0.A0o
            java.util.Iterator r2 = r0.iterator()
        L_0x000c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r2.next()
            X.TlR r0 = (X.C13923TlR) r0
            java.lang.String r1 = r0.getUrl()
            if (r1 == 0) goto L_0x000c
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000c
        L_0x0024:
            if (r1 == 0) goto L_0x0029
        L_0x0026:
            return r1
        L_0x0027:
            r1 = 0
            goto L_0x0024
        L_0x0029:
            r1 = 0
            X.T9q r3 = r4.A01()     // Catch:{ all -> 0x0051 }
            java.util.List r2 = r3.A01     // Catch:{ all -> 0x0051 }
            int r0 = r2.size()     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0037
            goto L_0x003e
        L_0x0037:
            int r0 = r3.A00     // Catch:{ all -> 0x0051 }
            X.TA1 r0 = r3.A00(r0)     // Catch:{ all -> 0x0051 }
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x0051
            int r0 = r2.size()     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0049
            r0 = 0
            goto L_0x004f
        L_0x0049:
            int r0 = r3.A00     // Catch:{ all -> 0x0051 }
            X.TA1 r0 = r3.A00(r0)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x0051 }
        L_0x0051:
            if (r1 == 0) goto L_0x0059
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0026
        L_0x0059:
            r0 = r4
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            java.lang.String r1 = r0.getUrl()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QLA.A05():java.lang.String");
    }

    public final String A06() {
        if (this.A0J.booleanValue()) {
            return "";
        }
        String str = this.A0L;
        if (str != null) {
            return str;
        }
        String A072 = A07(0);
        this.A0L = A072;
        return A072;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QcV, android.view.View, android.webkit.WebView, android.view.ViewGroup] */
    public final void A08() {
        ? r1 = ((SystemWebView) this).A04;
        r1.loadUrl(ReactWebViewManager.BLANK_URL);
        r1.setTag((Object) null);
        r1.clearHistory();
        r1.removeAllViews();
        try {
            r1.onPause();
        } catch (Exception unused) {
        }
        A02();
        this.A0Y = true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: type inference failed for: r0v23, types: [X.QcV, android.view.View] */
    public final void A09(long j) {
        C10727Rx5 rx5;
        C10727Rx5 rx52;
        IABEvent iABLandingPageInteractiveEvent;
        long j2;
        String stringExtra;
        Bundle extras;
        long j3 = j;
        if (!A0H() && this.A04 < j) {
            this.A04 = j3;
            Intent intent = this.A0A;
            if (!(intent == null || (extras = intent.getExtras()) == null || !extras.getBoolean("BrowserLiteIntent.EXTRA_EXECUTE_ADS_PREVIEW_JS", false))) {
                A0F("var f = function () {  var preview = document.body.getElementsByTagName('div')[0];  var width = window.innerWidth    || window.outerWidth     || document.documentElement.clientWidth     || document.body.clientWidth     || document.body.offsetWidth     || screen.width;  var ratio = width / 320.0 || 1;  var scale = 'scale(' + ratio + ',' + ratio + ')';  preview.style.transform = scale;  preview.style.webkitTransform = scale;  preview.style.position = 'relative';  preview.style.transformOrigin = 'top left';  preview.style.webkitTransformOrigin = 'top left';};f();");
                extras.putBoolean("BrowserLiteIntent.EXTRA_EXECUTE_ADS_PREVIEW_JS", false);
            }
            long j4 = this.A06;
            if (j4 != -1) {
                SQO.A01("BrowserLiteWebView", "==DomContentLoaded: %d ms==", Pxf.A1W(j - j4));
            }
        }
        if (!this.A0S && (rx52 = this.A0D) != null) {
            SSR.A00().A05("BLWV.onDOMContentLoaded", j3);
            BrowserLiteFragment browserLiteFragment = rx52.A03;
            if (!browserLiteFragment.A0w) {
                browserLiteFragment.A0w = true;
                browserLiteFragment.A0i = Long.valueOf(j3);
                BrowserLiteFragment.A0F(browserLiteFragment, this, j3);
                A9z a9z = browserLiteFragment.A0d;
                String str = (String) browserLiteFragment.A0V.BH6().A02();
                if (!a9z.A0p) {
                    iABLandingPageInteractiveEvent = IABEvent.A04;
                } else {
                    Parcelable.Creator creator = IABEvent.CREATOR;
                    String str2 = a9z.A0Z;
                    long j5 = a9z.A0B;
                    long now = a9z.A0m.now();
                    ZonedValue zonedValue = a9z.A0Q;
                    int i = a9z.A07;
                    int i2 = a9z.A06;
                    boolean z = a9z.A0g;
                    iABLandingPageInteractiveEvent = new IABLandingPageInteractiveEvent(zonedValue, str2, str, a9z.A0W, i, i2, j5, now, a9z.A0L, z);
                }
                browserLiteFragment.CjX(browserLiteFragment.A08, iABLandingPageInteractiveEvent, browserLiteFragment.A0e);
                browserLiteFragment.A0Y.A01 = SystemClock.elapsedRealtime();
                SPF spf = browserLiteFragment.A0J;
                long j6 = 0;
                if (spf != null && spf.A03()) {
                    if (browserLiteFragment.A0T() != null) {
                        j2 = Long.parseLong(browserLiteFragment.A0T());
                    } else {
                        j2 = 0;
                    }
                    String A0S2 = browserLiteFragment.A0S();
                    Intent intent2 = browserLiteFragment.A06;
                    if (intent2 == null) {
                        stringExtra = null;
                    } else {
                        stringExtra = intent2.getStringExtra("BWP_MEDIA_ID");
                    }
                    HashMap A0f = Dba.A0f("pageLoadSource", "NEWS_FEED");
                    A0f.put("tokenSource", RUC.A00(browserLiteFragment.A0J.A03.A01));
                    A0f.put("is_organic", String.valueOf(browserLiteFragment.A0J.A02));
                    A0f.put("media_id", stringExtra);
                    SRY.A00().A04(j2, "PAGE_LOADED", A0S2, A0f);
                }
                SHI shi = browserLiteFragment.A0I;
                if (shi != null && shi.A01()) {
                    if (browserLiteFragment.A0T() != null) {
                        j6 = Long.parseLong(browserLiteFragment.A0T());
                    }
                    String A0S3 = browserLiteFragment.A0S();
                    HashMap A0f2 = Dba.A0f("pageLoadSource", "NEWS_FEED");
                    A0f2.put("tokenSource", RU9.A00(browserLiteFragment.A0I.A02.A01));
                    SRY.A00().A03(j6, "PAGE_LOADED", A0S3, A0f2);
                }
            }
            List<C13923TlR> list = browserLiteFragment.A0o;
            if (list != null) {
                StringBuilder A012 = SSR.A01("onDomLoaded");
                for (C13923TlR D9l : list) {
                    D9l.D9l(this);
                }
                SSR.A03(A012);
            }
            this.A0S = true;
        }
        if (!this.A0U && (rx5 = this.A0D) != null) {
            SSR.A00().A05("BLWV.onPageInteractive", j3);
            BrowserLiteFragment browserLiteFragment2 = rx5.A03;
            BrowserLiteFragment.A0H(browserLiteFragment2, "BLWV.onPageInteractive");
            browserLiteFragment2.A1L.add(A05());
            if (!rx5.A02) {
                rx5.A02 = true;
                browserLiteFragment2.A0r = true;
            }
            if (browserLiteFragment2.A0v && browserLiteFragment2.A0c != null) {
                ((SystemWebView) this).A04.setBackgroundColor(-1);
            }
            List<C13923TlR> list2 = browserLiteFragment2.A0o;
            if (list2 != null) {
                StringBuilder A013 = SSR.A01("onPageInteractive");
                for (C13923TlR DW4 : list2) {
                    DW4.DW4(this, j3);
                }
                SSR.A03(A013);
            }
            Bundle bundleExtra = browserLiteFragment2.A06.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
            String stringExtra2 = browserLiteFragment2.A06.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY");
            boolean booleanExtra = browserLiteFragment2.A06.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY", true);
            if (!TextUtils.isEmpty(stringExtra2)) {
                if (bundleExtra == null) {
                    bundleExtra = AnonymousClass7TE.A0a();
                }
                bundleExtra.putString("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY", stringExtra2);
                bundleExtra.putBoolean("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY", booleanExtra);
            }
            SRY sry = browserLiteFragment2.A0L;
            SRY.A02(new QJo(bundleExtra, sry, A05(), browserLiteFragment2.A0P(), j3), sry, false);
            C39896ADy aDy = browserLiteFragment2.A0W;
            if (aDy != null) {
                if (aDy.A00 == -1) {
                    aDy.A00 = Instant.now().getEpochSecond();
                }
                ? obj = new Object();
                aDy.A09.execute(new C20127Wln(aDy, obj));
                obj.addListener(new Ai5(rx5), browserLiteFragment2.A0q);
            }
            this.A0U = true;
        }
    }

    public final void A0C(Intent intent) {
        this.A0A = intent;
        C10664Rvy rvy = this.A0H;
        rvy.A02 = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_NAVIGATION_TIMING_LOGGER_ENABLED", true);
        rvy.A03 = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_INTERACTION_TO_NEXT_PAINT_LOGGING_ENABLED", false);
        this.A0O = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_PAYMENT_ENABLED", false);
        this.A0N = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_FRAMEWORK_FORM_DETECTION_LOGGING", false);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r4.onFailure();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r6 == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r6 != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        ((com.facebook.browser.lite.webview.SystemWebView) r3).A04.loadUrl(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.C13705TfO r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = "javascript: "
            java.lang.String r2 = X.002.A0R(r0, r5)
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x001c
            r0 = 2
            X.Sbl r1 = new X.Sbl     // Catch:{ IllegalStateException -> 0x0019 }
            r1.<init>(r4, r0)     // Catch:{ IllegalStateException -> 0x0019 }
            r0 = r3
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0     // Catch:{ IllegalStateException -> 0x0019 }
            X.QcV r0 = r0.A04     // Catch:{ IllegalStateException -> 0x0019 }
            r0.evaluateJavascript(r5, r1)     // Catch:{ IllegalStateException -> 0x0019 }
            return
        L_0x0019:
            if (r6 == 0) goto L_0x0026
            goto L_0x001e
        L_0x001c:
            if (r6 == 0) goto L_0x0026
        L_0x001e:
            r0 = r3
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            r0.loadUrl(r2)
        L_0x0026:
            if (r4 == 0) goto L_0x002b
            r4.onFailure()
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QLA.A0E(X.TfO, java.lang.String, boolean):void");
    }

    public final String A07(int i) {
        T9q A012 = A01();
        if (A012.A01.size() > i) {
            return A012.A00(i).A03;
        }
        return A05();
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.QcV, android.view.View] */
    public final void A0A(long j) {
        IABEvent iABLandingPageFinishedEvent;
        if (!A0H()) {
            long j2 = this.A05;
            if (j2 < j && j2 == -1 && j != -1) {
                this.A05 = j;
                C10727Rx5 rx5 = this.A0D;
                if (rx5 != null) {
                    BrowserLiteFragment browserLiteFragment = rx5.A03;
                    Intent intent = browserLiteFragment.A06;
                    if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_TRANSPARENT_IAB_ENABLED", false)) {
                        FrameLayout frameLayout = browserLiteFragment.A0C;
                        if (frameLayout != null) {
                            frameLayout.setBackgroundColor(-1);
                        }
                        ((SystemWebView) this).A04.setBackgroundColor(-1);
                    }
                    SSR.A00().A05("BLWV.onLoadEvent", j);
                    if (!browserLiteFragment.A0x) {
                        String A062 = A06();
                        browserLiteFragment.A0x = true;
                        A9z a9z = browserLiteFragment.A0d;
                        if (a9z.A0p) {
                            a9z.A0F = j;
                        }
                        browserLiteFragment.A0V.BH6().A0B(A062);
                        BrowserLiteFragment.A0B(browserLiteFragment.A06, browserLiteFragment);
                        A9z a9z2 = browserLiteFragment.A0d;
                        if (!a9z2.A0p) {
                            iABLandingPageFinishedEvent = IABEvent.A04;
                        } else {
                            Parcelable.Creator creator = IABEvent.CREATOR;
                            iABLandingPageFinishedEvent = new IABLandingPageFinishedEvent(a9z2.A0Q, a9z2.A0Z, A062, a9z2.A0c, a9z2.A0F, a9z2.A0m.now());
                        }
                        browserLiteFragment.CjX(browserLiteFragment.A08, iABLandingPageFinishedEvent, browserLiteFragment.A0e);
                    }
                }
                SQO.A01("BrowserLiteWebView", "==onLoadEventEnd: %d ms==", Pxf.A1W(this.A05 - this.A06));
            }
        }
    }

    public final void A0B(long j) {
        if (!A0H()) {
            long j2 = this.A07;
            if (j2 < j && j2 == -1) {
                this.A07 = j;
                long j3 = this.A06;
                if (j3 != -1) {
                    SQO.A01("BrowserLiteWebView", "onResponseEnd: %d ms", Pxf.A1W(j - j3));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.QcV, android.webkit.WebView] */
    public final boolean A0H() {
        if (A0G() || ((SystemWebView) this).A04.canGoForward()) {
            return true;
        }
        return false;
    }
}
