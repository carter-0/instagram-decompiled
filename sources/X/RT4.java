package X;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.facebook.quicklog.QuickPerformanceLogger;

public abstract class RT4 {
    public static final Object A00(AnonymousClass6Tm r14) {
        String A0g = DbY.A0g(r14);
        int A04 = DbW.A04(r14.A03(1), "null cannot be cast to non-null type kotlin.Number");
        RR5 rr5 = C10071Rm8.A00;
        if (rr5 == null) {
            return null;
        }
        QQ0 qq0 = (QQ0) rr5;
        0qQ.A0B(A0g, 0);
        QuickPerformanceLogger quickPerformanceLogger = C11401SRw.A00;
        Integer num = qq0.A08;
        String str = qq0.A0B;
        String str2 = str;
        if (str == null) {
            str = "";
        }
        String str3 = qq0.A0A;
        AnonymousClass7TF.A1B(num, 0, str3);
        Integer A02 = C11401SRw.A02(num);
        if (A02 != null) {
            QuickPerformanceLogger quickPerformanceLogger2 = C11401SRw.A00;
            if (quickPerformanceLogger2 != null) {
                quickPerformanceLogger2.markerStart(A02.intValue());
            }
            C11401SRw.A03(A02.intValue(), str, str3, "2024-10");
        }
        SUF suf = qq0.A01;
        if (suf != null) {
            if (str2 == null) {
                str2 = "";
            }
            long j = qq0.A06;
            String str4 = qq0.A03;
            String A09 = 002.A09(A04, "{\"line_id\":\"", A0g, "\",\"quantity\":\"", "\"}");
            String str5 = qq0.A09;
            String str6 = qq0.A02;
            C51973G9u.A0r(3, str4, A09, str5);
            0Aj A0e = AnonymousClass7TE.A0e(suf.A0C(), "client_load_metacheckoutsdk_init");
            if (A0e.isSampled()) {
                A0e.AAJ(Q2M.A00(), str3);
                Pxh.A18(SUF.A03(suf), A0e);
                0bb r13 = new 0bb();
                SUF.A09(r13, suf, "cart_update");
                Pxi.A1B(A0e, r13, DbY.A0q("checkout_url", SUF.A06(str4), AnonymousClass7TE.A1L("csp_version", "2024-10"), AnonymousClass7TE.A1L("shopify_sdk_payload", A09)));
                0bb r2 = new 0bb();
                r2.A07("seller_ids", SUF.A07(j));
                r2.A06("commerce_checkout_session_id", str6);
                QKY qky = (QKY) suf;
                QKY.A01(r2, qky);
                r2.A06("iaw_session_id", str2);
                SUF.A0A(r2, suf, qky.A01, str2);
                Pxj.A1D(A0e, r2, str5);
            }
        }
        Q97 q97 = qq0.A07.A00;
        WebView webView = q97.A00;
        if (webView == null) {
            return null;
        }
        if (q97.A06 == null) {
            0qQ.A0F("scriptBuilder");
            throw AnonymousClass00P.createAndThrow();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("window.Shopify.CheckoutSheetProtocol.postMessage");
        A1A.append("('updateCart', { detail: { lineId: '");
        A1A.append(A0g);
        A1A.append("', quantity: ");
        A1A.append(A04);
        webView.evaluateJavascript(AnonymousClass7TF.A0l(" }});", A1A), (ValueCallback) null);
        return null;
    }
}
