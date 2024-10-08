package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.views.BrowserLiteErrorScreen;
import com.facebook.browser.lite.webview.SystemWebView;
import java.util.Locale;

public abstract class S78 {
    public C10537Rtr A04(String str) {
        return new C10537Rtr((Long) null, (String) null, (String) null);
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.QcV, android.webkit.WebView] */
    public void A06(QLA qla, String str) {
        Uri A01;
        QL8 ql8 = (QL8) this;
        SSR.A00().A04("BLWVC.onPageFinished");
        Bundle bundle = null;
        ql8.A07 = null;
        int i = 0;
        if (!(ql8.A0G == null || (A01 = 0cp.A01(QL8.A0R, str)) == null)) {
            A01.getScheme();
        }
        if (ql8.A09) {
            long currentTimeMillis = System.currentTimeMillis();
            if (qla.A07 < 0) {
                qla.A0B(currentTimeMillis);
            }
            if (qla.A04 < 0) {
                qla.A09(currentTimeMillis);
            }
            if (qla.A05 < 0) {
                qla.A0A(currentTimeMillis);
            }
        }
        if (ql8.A09) {
            ql8.A09 = false;
            int i2 = ql8.A01;
            Integer valueOf = Integer.valueOf(i2);
            int i3 = ql8.A02;
            SQO.A01("BrowserLiteFragment", "prefetched: %d, total resources: %d, prefetch rate: %.2f%%", valueOf, Integer.valueOf(i3), Float.valueOf((((float) i2) * 100.0f) / ((float) Math.max(1, i3))));
        } else {
            Object[] objArr = {str};
            if (SQO.A00) {
                String.format((Locale) null, "onPageFinished %s", objArr);
            }
        }
        ql8.A0A(str);
        SRY sry = ql8.A0F;
        BrowserLiteFragment browserLiteFragment = ql8.A0E;
        if (browserLiteFragment != null) {
            bundle = browserLiteFragment.A08;
            i = browserLiteFragment.A0P();
        }
        SRY.A02(new QJm(bundle, sry, str, i), sry, false);
        if (browserLiteFragment != null) {
            browserLiteFragment.A0r = true;
            if (browserLiteFragment.C8U() == qla && !ql8.A0A) {
                browserLiteFragment.A0c(((SystemWebView) qla).A04.getTitle());
            }
        }
        for (C13922TlQ DW1 : ql8.A08) {
            DW1.DW1(qla, str);
        }
        if (browserLiteFragment == null) {
            return;
        }
        if (ql8.A0A) {
            BrowserLiteErrorScreen browserLiteErrorScreen = browserLiteFragment.A0a;
            if (browserLiteErrorScreen != null) {
                SlN slN = (SlN) browserLiteErrorScreen.A02;
                if (slN.A01 < 10) {
                    slN.A02.postDelayed(slN.A03, (long) slN.A00);
                }
            }
            BrowserLiteErrorScreen browserLiteErrorScreen2 = browserLiteFragment.A0b;
            if (browserLiteErrorScreen2 != null) {
                SlN slN2 = (SlN) browserLiteErrorScreen2.A02;
                if (slN2.A01 < 10) {
                    slN2.A02.postDelayed(slN2.A03, (long) slN2.A00);
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass7TH.A0R(browserLiteFragment.A0a);
        AnonymousClass7TH.A0R(browserLiteFragment.A0b);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [X.SlN, X.TZv, java.lang.Object] */
    public boolean A07(RenderProcessGoneDetail renderProcessGoneDetail, QLA qla) {
        String str;
        boolean z;
        QL8 ql8 = (QL8) this;
        SSR.A00().A04("BLWVC.onRenderProcessGone");
        0fA r2 = ql8.A0I;
        if (r2 != null) {
            0f9 AEf = r2.AEf("iab_render_process_gone", 19805434);
            if (C249113j9.A00 != null) {
                z = C272854lX.A03;
            } else {
                z = false;
            }
            AEf.ABR("using_helium", z);
            AEf.report();
        }
        BrowserLiteFragment browserLiteFragment = ql8.A0E;
        if (browserLiteFragment == null) {
            return false;
        }
        C391409su r22 = C391409su.A1P;
        Integer num = AnonymousClass05K.A0C;
        if (renderProcessGoneDetail.didCrash()) {
            str = "crash";
        } else {
            str = "kill";
        }
        browserLiteFragment.A0b(r22, num, str);
        Intent intent = ql8.A0D;
        if (intent.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_SHOW_RENDERER_CRASH_RECOVERY_SCREEN", false)) {
            SSR.A00().A04("BLWVC.onRenderProcessGone.showMessage");
            BrowserLiteErrorScreen browserLiteErrorScreen = browserLiteFragment.A0b;
            BrowserLiteErrorScreen browserLiteErrorScreen2 = null;
            if (browserLiteErrorScreen == null) {
                View view = browserLiteFragment.mView;
                if (view != null) {
                    view.findViewById(0);
                }
            } else {
                browserLiteErrorScreen2 = browserLiteErrorScreen;
            }
            browserLiteFragment.A0b = browserLiteErrorScreen2;
            if (browserLiteErrorScreen2 == null) {
                return true;
            }
            C13415TZv tZv = browserLiteFragment.A0T;
            C13415TZv tZv2 = tZv;
            if (tZv == null) {
                ? obj = new Object();
                obj.A01 = 0;
                obj.A00 = 0;
                obj.A02 = new Handler();
                obj.A03 = new TFR(obj, qla);
                browserLiteFragment.A0T = obj;
                tZv2 = obj;
            }
            browserLiteErrorScreen2.A02 = tZv2;
            return true;
        } else if (ql8.A00 < intent.getIntExtra("BrowserLiteIntent.EXTRA_RENDERER_CRASH_SILENT_RECOVERY_COUNT", 0)) {
            SSR.A00().A04("BLWVC.onRenderProcessGone.silentRecovery");
            SB5.A00(new TB9(browserLiteFragment));
            ql8.A00++;
            return true;
        } else {
            BrowserLiteFragment.A0G(browserLiteFragment, "RENDER_PROCESS_GONE");
            browserLiteFragment.AI4(4, (String) null);
            return true;
        }
    }

    public final boolean A08(QLA qla, String str) {
        if (!(this instanceof QL8)) {
            return false;
        }
        QL8 ql8 = (QL8) this;
        SQO.A01("BrowserLiteFragment", "shouldOverrideUrlLoading %s", str);
        try {
            if ("intent".equalsIgnoreCase(0cp.A01(QL8.A0R, str).getScheme())) {
                SQO.A01("BrowserLiteFragment", "Using default BrowserLiteWebView URL handling for intent navigation for %s", str);
                return false;
            }
        } catch (NullPointerException e) {
            if (SQO.A00) {
                Log.e("BrowserLiteFragment", "shouldOverrideUrlLoading error", e);
            }
        }
        boolean A02 = QL8.A02(ql8, qla, (Boolean) null, (Boolean) null, str);
        if (A02) {
            return A02;
        }
        ql8.A07 = str;
        return A02;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.0bY] */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(android.webkit.WebResourceRequest r3, boolean r4) {
        /*
            java.util.Map r3 = r3.getRequestHeaders()
            r2 = 0
            if (r3 == 0) goto L_0x0028
            java.lang.String r0 = "Origin"
            java.lang.String r1 = X.DbT.A11(r0, r3)
            if (r4 == 0) goto L_0x0017
            if (r1 != 0) goto L_0x0019
            java.lang.String r0 = "Referer"
            java.lang.String r1 = X.DbU.A0r(r0, r3)
        L_0x0017:
            if (r1 == 0) goto L_0x0028
        L_0x0019:
            X.0TC r0 = new X.0TC
            r0.<init>()
            android.net.Uri r0 = X.0cp.A00(r0, r1)
            if (r0 == 0) goto L_0x0028
            java.lang.String r2 = r0.getHost()
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S78.A03(android.webkit.WebResourceRequest, boolean):java.lang.String");
    }

    public void A05(WebResourceError webResourceError, WebResourceRequest webResourceRequest, QLA qla) {
        if (webResourceRequest.isForMainFrame()) {
            webResourceError.getErrorCode();
            webResourceError.getDescription().toString();
            webResourceRequest.getUrl().toString();
        }
    }
}
