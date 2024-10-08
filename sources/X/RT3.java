package X;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.facebook.quicklog.QuickPerformanceLogger;

public abstract class RT3 {
    public static final Object A00(AnonymousClass6Tm r16) {
        String str;
        String str2;
        RR5 rr5 = C10071Rm8.A00;
        C276544tV r0 = (C276544tV) DbT.A0p(r16, 0);
        if (r0 != null) {
            str = r0.A0D();
        } else {
            str = null;
        }
        if (rr5 != null) {
            QQ0 qq0 = (QQ0) rr5;
            QuickPerformanceLogger quickPerformanceLogger = C11401SRw.A00;
            Integer num = qq0.A08;
            String str3 = qq0.A0B;
            String str4 = str3;
            if (str3 == null) {
                str3 = "";
            }
            String str5 = qq0.A0A;
            AnonymousClass7TF.A1B(num, 0, str5);
            Integer A01 = C11401SRw.A01(num);
            if (A01 != null) {
                QuickPerformanceLogger quickPerformanceLogger2 = C11401SRw.A00;
                if (quickPerformanceLogger2 != null) {
                    quickPerformanceLogger2.markerStart(A01.intValue());
                }
                C11401SRw.A03(A01.intValue(), str3, str5, "2024-10");
            }
            if (str == null) {
                str2 = "false";
            } else {
                str2 = "true";
            }
            SUF suf = qq0.A01;
            if (suf != null) {
                String A0g = 002.A0g("{\"token_exists\":\"", str2, "\"}");
                if (str4 == null) {
                    str4 = "";
                }
                long j = qq0.A06;
                String str6 = qq0.A03;
                String str7 = qq0.A09;
                String str8 = qq0.A02;
                C51973G9u.A0r(0, A0g, str6, str7);
                0Aj A0e = AnonymousClass7TE.A0e(suf.A0C(), "client_load_metacheckoutsdk_init");
                if (A0e.isSampled()) {
                    A0e.AAJ(Q2M.A00(), str5);
                    A0e.A8M(SUF.A03(suf), "product_type");
                    A0e.A8M(C2818559v.ANDROID, "platform");
                    A0e.A9F("actual_event_time", Long.valueOf(AnonymousClass7TG.A0I()));
                    0bb r13 = new 0bb();
                    SUF.A09(r13, suf, "complete_checkout");
                    Pxi.A1B(A0e, r13, DbY.A0q("shopify_sdk_payload", A0g, SUF.A08(str6), AnonymousClass7TE.A1L("csp_version", "2024-10")));
                    0bb r2 = new 0bb();
                    r2.A07("seller_ids", SUF.A07(j));
                    r2.A06("commerce_checkout_session_id", str8);
                    r2.A06("external_session_id", SUF.A05(suf, str4));
                    r2.A06("iaw_session_id", str4);
                    Pxj.A1D(A0e, r2, str7);
                }
            }
            Q97 q97 = qq0.A07.A00;
            if (str != null) {
                WebView webView = q97.A00;
                if (webView != null) {
                    if (q97.A06 != null) {
                        webView.evaluateJavascript(002.A0u("window.Shopify.CheckoutSheetProtocol.postMessage", "('progress', { detail: { sessionId: '", str, "' }});"), (ValueCallback) null);
                    }
                }
            } else {
                WebView webView2 = q97.A00;
                if (webView2 != null) {
                    if (q97.A06 != null) {
                        webView2.evaluateJavascript(002.A0R("window.Shopify.CheckoutSheetProtocol.postMessage", "('progress');"), (ValueCallback) null);
                        return null;
                    }
                }
            }
            0qQ.A0F("scriptBuilder");
            throw AnonymousClass00P.createAndThrow();
        }
        return null;
    }
}
