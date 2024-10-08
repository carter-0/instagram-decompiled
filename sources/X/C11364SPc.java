package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.webview.chromium.membrane.HeliumWebViewExtensions;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.SPc  reason: case insensitive filesystem */
public abstract class C11364SPc {
    public Context A00 = null;
    public Intent A01 = null;
    public View A02 = null;
    public C340027ka A03 = null;
    public C340037kb A04 = null;
    public C13847TiP A05 = null;

    public final boolean EsT(QLA qla, String str) {
        return false;
    }

    public boolean EsV(QLA qla, Boolean bool, Boolean bool2, String str) {
        return false;
    }

    public void destroy() {
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
    }

    public final String getUrl() {
        return null;
    }

    public static CheckoutHandler A02(QL1 ql1) {
        AnonymousClass0eM r0 = ql1.A08;
        if (r0 != null) {
            return (CheckoutHandler) r0.getValue();
        }
        0qQ.A0F("checkoutHandler");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void AQ3(QLA qla, String str, boolean z) {
        C7607QOp qOp;
        String str2 = str;
        QLA qla2 = qla;
        if (this instanceof C7583QKy) {
            C7583QKy qKy = (C7583QKy) this;
            AnonymousClass7TG.A1N(qla2, str2);
            SPF spf = SPF.A06;
            if (spf != null && spf.A02() && (str2 = spf.A01.A02) == null) {
                str2 = "";
            }
            C10535Rto rto = qKy.A00;
            if (rto != null && !0qQ.A0K(rto.A01, str2)) {
                C7583QKy.A00(qKy);
            }
            C10535Rto rto2 = qKy.A00;
            if (rto2 == null) {
                rto2 = new C10535Rto(System.currentTimeMillis());
                qKy.A00 = rto2;
            }
            rto2.A01 = str2;
        } else if (this instanceof C7582QKx) {
            C7582QKx qKx = (C7582QKx) this;
            boolean A1Z = AnonymousClass7TG.A1Z(qla2, str2);
            SFP sfp = qKx.A00;
            if (sfp == null) {
                sfp = new SFP(C51968G9o.A0u(), DbS.A0y(), A1Z);
                qKx.A00 = sfp;
            }
            if (sfp.A03 == A1Z) {
                sfp.A04.add(str2);
            }
        } else if (this instanceof C7580QKv) {
            C7580QKv qKv = (C7580QKv) this;
            STY sty = qKv.A07;
            if (qKv.A0Q && sty != null) {
                if (qKv.A0Y) {
                    C10860RzL rzL = qKv.A0b.A00;
                    QP6 qp6 = rzL.A06;
                    Map map = (Map) qp6.A01;
                    if (map != null && !map.isEmpty()) {
                        String str3 = qKv.A0e;
                        0qQ.A0B(str3, 0);
                        String str4 = null;
                        String A0c = AnonymousClass7TF.A0c();
                        if (qKv.A04 != null) {
                            str4 = rzL.A0P.A03;
                        }
                        String A022 = C11429STt.A02(qla2.A04().A06);
                        String A023 = C11392SRg.A02(rzL);
                        String str5 = rzL.A0P.A01;
                        if (!map.isEmpty()) {
                            ArrayList A0e = Dba.A0e(map);
                            if (!A0e.isEmpty()) {
                                Bundle A024 = qKv.A02();
                                if (A024 == null) {
                                    A024 = C10804RyQ.A00(str5, A023, str4, A0c, str3, A022, A0e);
                                } else {
                                    A024.putAll(C10804RyQ.A00(str5, A023, str4, A0c, str3, A022, A0e));
                                }
                                SRY A002 = SRY.A00();
                                HashMap A1E = AnonymousClass7TE.A1E();
                                A1E.put("action", "BrowserLiteIntent.IAB_AUTOFILL_CROWDSOURCING_PREDICTIONS");
                                SRY.A02(new QJx(A024, A002, A1E, 2), A002, false);
                            }
                        }
                        qp6.A01 = null;
                    }
                }
                C270254gR r6 = qKv.A0b;
                if (DbY.A1Z(0Tu.A05, r6.A04.A00, 36322860551973503L)) {
                    sty.A0K((AutofillData) null, str2, false);
                }
                C10860RzL rzL2 = sty.A0T.A00;
                QP6 qp62 = rzL2.A04;
                if (!(qp62 == null || (qOp = (C7607QOp) qp62.A01) == null || !sty.A0O)) {
                    sty.A0F((C7607QOp) rzL2.A04.A01, C11391SRf.A00(qOp), "ALL_NAVIGATION");
                    sty.A0O = false;
                    rzL2.A04 = null;
                }
                ((Map) r6.A00.A0K.A02).clear();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r1v25, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r1v46, types: [X.0iw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v14, types: [X.QcV, android.view.View, android.webkit.WebView] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004f, code lost:
        if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0278, code lost:
        if (r2 != null) goto L_0x0184;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CrW(X.QLA r22) {
        /*
            r21 = this;
            r2 = r21
            r0 = r22
            boolean r1 = r2 instanceof X.C7580QKv
            if (r1 == 0) goto L_0x00e5
            r4 = r2
            X.QKv r4 = (X.C7580QKv) r4
            X.4gR r15 = r4.A0b
            X.SJh r9 = r15.A02
            r8 = 772802708(0x2e100894, float:3.2749428E-11)
            r3 = 0
            r7 = 0
            java.lang.Integer r6 = r9.A00(r7, r8, r3)
            java.lang.String r1 = "addJavascriptInterfaceStart"
            r9.A02(r6, r7, r1, r8)
            java.lang.ref.WeakReference r18 = X.C51965G9l.A0v(r4)
            android.content.Intent r13 = r4.A01
            X.S5W r14 = r4.A0a
            X.S0F r1 = r4.A0c
            com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r12 = new com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy
            r17 = r0
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.lang.String r5 = r12.A06()
            r1 = r0
            com.facebook.browser.lite.webview.SystemWebView r1 = (com.facebook.browser.lite.webview.SystemWebView) r1
            X.QcV r2 = r1.A04
            r2.addJavascriptInterface(r12, r5)
            com.instagram.common.session.UserSession r5 = r4.A0d
            X.0xa r10 = X.AnonymousClass7TE.A0q(r5)
            java.lang.String r1 = "internal_autofill_js_od_override"
            java.lang.String r10 = r10.getString(r1, r7)
            if (r10 == 0) goto L_0x0051
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            r1 = 1
            if (r11 == 0) goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            boolean r1 = X.C66581MXm.A1a(r1)
            if (r1 == 0) goto L_0x007d
            android.content.Context r11 = r4.A00
            r1 = 1
            X.0qQ.A0B(r10, r1)
            if (r11 == 0) goto L_0x006d
            java.lang.String r1 = "Internal Autofill JS OD Override: "
            java.lang.String r1 = X.002.A0R(r1, r10)
            android.widget.Toast r1 = android.widget.Toast.makeText(r11, r1, r3)
            r1.show()
        L_0x006d:
            java.lang.String r1 = "beta"
            boolean r1 = r10.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x007d
            android.webkit.WebSettings r3 = r2.getSettings()
            r1 = 2
            r3.setCacheMode(r1)
        L_0x007d:
            java.lang.String r1 = "addJavascriptInterfaceEnd"
            r9.A02(r6, r7, r1, r8)
            boolean r1 = r4.A0Q
            if (r1 == 0) goto L_0x00af
            java.lang.String r1 = "setupAutofillListenerStart"
            r9.A02(r6, r7, r1, r8)
            X.RrD r1 = new X.RrD
            r1.<init>(r4, r0)
            r0.A0F = r1
            java.lang.String r1 = "setupAutofillListenerEnd"
            r9.A02(r6, r7, r1, r8)
            X.STY r3 = r4.A07
            if (r3 == 0) goto L_0x00af
            android.content.Context r2 = r2.getContext()
            X.QLA r1 = r3.A07
            if (r1 != 0) goto L_0x00a7
            r3.A07 = r0
        L_0x00a7:
            X.TR6 r1 = new X.TR6
            r1.<init>(r2, r3)
            r1.start()
        L_0x00af:
            java.util.Map r1 = r4.A0j
            r1.put(r0, r12)
            X.SJQ r3 = r4.A0B
            android.content.Context r1 = r4.A00
            X.S0G r2 = r4.A0A
            r3.A01(r1, r15, r2)
            android.content.Context r1 = r4.A00
            r3.A03(r1, r15, r2)
            r9.A01(r6, r7, r8)
            X.TR3 r1 = new X.TR3
            r1.<init>(r4)
            r1.start()
            X.0nO r2 = X.0nY.A00()
            X.RA9 r1 = new X.RA9
            r1.<init>(r4, r0)
            r2.ATE(r1)
            java.lang.ref.WeakReference r1 = X.C51965G9l.A0v(r4)
            X.S5u r0 = new X.S5u
            r0.<init>(r15, r5, r1)
            r4.A09 = r0
        L_0x00e4:
            return
        L_0x00e5:
            boolean r1 = r2 instanceof X.QL1
            if (r1 == 0) goto L_0x0158
            X.QL1 r2 = (X.QL1) r2
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            r2.A06 = r1
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r2)
            X.7ka r5 = r2.A03     // Catch:{ all -> 0x0378 }
            if (r5 == 0) goto L_0x00e4
            X.S3p r1 = new X.S3p     // Catch:{ all -> 0x0378 }
            r1.<init>(r2)     // Catch:{ all -> 0x0378 }
            r2.A00 = r1     // Catch:{ all -> 0x0378 }
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()     // Catch:{ all -> 0x0378 }
            if (r1 == 0) goto L_0x012f
            r3 = 39
            X.IwR r1 = new X.IwR     // Catch:{ all -> 0x0378 }
            r1.<init>((int) r3, (java.lang.Object) r5, (java.lang.Object) r2)     // Catch:{ all -> 0x0378 }
            X.0t0 r9 = X.AnonymousClass0eN.A01(r1)     // Catch:{ all -> 0x0378 }
            r2.A08 = r9     // Catch:{ all -> 0x0378 }
            X.S3p r4 = r2.A00     // Catch:{ all -> 0x0378 }
            if (r4 == 0) goto L_0x0366
            com.instagram.common.session.UserSession r7 = r2.A02     // Catch:{ all -> 0x0378 }
            java.util.ArrayList r8 = r2.A07     // Catch:{ all -> 0x0378 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Lazy<com.instagram.facebookpay.offsite.inappwebviewer.IgIAWCheckoutHandler>"
            X.0qQ.A0C(r9, r1)     // Catch:{ all -> 0x0378 }
            com.facebook.iabadscontext.IABAdsContext r1 = r2.A0B     // Catch:{ all -> 0x0378 }
            if (r1 == 0) goto L_0x0156
            com.facebook.iabadscontext.IABAdsContext r6 = r1.A00()     // Catch:{ all -> 0x0378 }
        L_0x0128:
            X.QhG r3 = new X.QhG     // Catch:{ all -> 0x0378 }
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0378 }
            r2.A03 = r3     // Catch:{ all -> 0x0378 }
        L_0x012f:
            X.S3p r6 = r2.A00     // Catch:{ all -> 0x0378 }
            if (r6 == 0) goto L_0x036d
            com.instagram.common.session.UserSession r5 = X.C11431STx.A00()     // Catch:{ all -> 0x0378 }
            X.0Tu r1 = X.0Tu.A05     // Catch:{ all -> 0x0378 }
            r3 = 36313514696771623(0x8102f3000c0827, double:3.028151144800845E-306)
            boolean r1 = X.182.A06(r1, r5, r3)     // Catch:{ all -> 0x0378 }
            if (r1 == 0) goto L_0x0150
            X.QKZ r1 = new X.QKZ     // Catch:{ all -> 0x0378 }
            r1.<init>(r6)     // Catch:{ all -> 0x0378 }
        L_0x0149:
            r1.A00(r0)     // Catch:{ all -> 0x0378 }
            r2.A01 = r1     // Catch:{ all -> 0x0378 }
            goto L_0x0365
        L_0x0150:
            X.S6T r1 = new X.S6T     // Catch:{ all -> 0x0378 }
            r1.<init>(r6)     // Catch:{ all -> 0x0378 }
            goto L_0x0149
        L_0x0156:
            r6 = 0
            goto L_0x0128
        L_0x0158:
            boolean r1 = r2 instanceof X.C7576QKr
            if (r1 == 0) goto L_0x027c
            r6 = r2
            X.QKr r6 = (X.C7576QKr) r6
            r8 = 0
            X.7ka r9 = r6.A03
            if (r9 == 0) goto L_0x0267
            r3 = r6
            X.QKc r3 = (X.C7571QKc) r3
            com.facebook.iabadscontext.IABAdsContext r10 = r3.A02
            java.util.Map r2 = r10.A0C
            X.RFY r1 = X.RFY.IAB_META_CHECKOUT_SDK
            java.lang.Object r4 = r2.get(r1)
            com.facebook.iabadscontext.DisclaimerText r4 = (com.facebook.iabadscontext.DisclaimerText) r4
            if (r4 == 0) goto L_0x0267
            java.util.List r2 = r4.A01
            r5 = 0
            if (r2 == 0) goto L_0x0277
            java.lang.Object r1 = X.00k.A0O(r2, r8)
            com.facebook.iabadscontext.DisclaimerBodyUrlRanges r1 = (com.facebook.iabadscontext.DisclaimerBodyUrlRanges) r1
            if (r1 == 0) goto L_0x0277
            int r7 = r1.A01
        L_0x0184:
            java.lang.Object r1 = X.00k.A0O(r2, r8)
            com.facebook.iabadscontext.DisclaimerBodyUrlRanges r1 = (com.facebook.iabadscontext.DisclaimerBodyUrlRanges) r1
            if (r1 == 0) goto L_0x018e
            int r5 = r1.A00
        L_0x018e:
            int r5 = r5 + r7
            com.instagram.common.session.UserSession r14 = r3.A03
            java.lang.String r15 = r3.A02
            java.lang.String r3 = r10.A09
            java.lang.String r10 = r10.A08
            java.lang.String r2 = r4.A00
            com.facebook.browser.lite.BrowserLiteFragment r9 = (com.facebook.browser.lite.BrowserLiteFragment) r9
            android.view.View r4 = r9.A0B
            if (r4 == 0) goto L_0x0267
            r1 = 2131441324(0x7f0b36ac, float:1.8504656E38)
            android.view.View r4 = r4.findViewById(r1)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            if (r4 == 0) goto L_0x0267
            r1 = 2131629399(0x7f0e1557, float:1.8886118E38)
            android.view.View r13 = X.JTP.A0H(r4, r1)
            X.0qQ.A07(r13)
            android.content.Context r12 = r9.getContext()
            r1 = 2131441322(0x7f0b36aa, float:1.8504652E38)
            android.view.View r4 = X.AnonymousClass7TE.A0b(r13, r1)
            if (r12 == 0) goto L_0x01db
            android.view.ViewTreeObserver r1 = r13.getViewTreeObserver()
            X.Sbb r11 = new X.Sbb
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r1.addOnGlobalLayoutListener(r11)
            r1 = 2131100052(0x7f060194, float:1.7812475E38)
            X.DbT.A16(r12, r13, r1)
            r1 = 2131100340(0x7f0602b4, float:1.7813059E38)
            X.DbT.A16(r12, r4, r1)
        L_0x01db:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            X.Q8J r1 = new X.Q8J
            r16 = r12
            r17 = r14
            r18 = r15
            r19 = r3
            r20 = r8
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r4.append(r2)
            r9 = 33
            r4.setSpan(r1, r7, r5, r9)
            r1 = 2131441325(0x7f0b36ad, float:1.8504658E38)
            android.view.View r3 = X.AnonymousClass7TE.A0b(r13, r1)
            X.0Tu r11 = X.0Tu.A05
            r1 = 36315992892313435(0x81053400030f5b, double:3.02971836564038E-306)
            boolean r1 = X.182.A06(r11, r14, r1)
            if (r1 == 0) goto L_0x026a
            if (r10 == 0) goto L_0x023c
            r1 = 2131441327(0x7f0b36af, float:1.8504662E38)
            android.view.View r3 = r13.findViewById(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            if (r3 == 0) goto L_0x0229
            r3.setVisibility(r8)
            com.instagram.common.typedurl.SimpleImageUrl r2 = new com.instagram.common.typedurl.SimpleImageUrl
            r2.<init>(r10)
            X.T5t r1 = new X.T5t
            r1.<init>()
            r3.setUrl(r2, r1)
        L_0x0229:
            r1 = 2131441328(0x7f0b36b0, float:1.8504665E38)
            android.view.View r1 = r13.findViewById(r1)
            if (r1 == 0) goto L_0x0235
            r1.setVisibility(r8)
        L_0x0235:
            r1 = 2131441326(0x7f0b36ae, float:1.850466E38)
            android.view.View r3 = r13.findViewById(r1)
        L_0x023c:
            android.widget.TextView r3 = (android.widget.TextView) r3
            X.DbX.A1G(r3, r4)
            if (r12 == 0) goto L_0x0267
            r1 = 2131100377(0x7f0602d9, float:1.7813134E38)
            int r2 = r12.getColor(r1)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r2)
            r4.setSpan(r1, r8, r7, r9)
            r1 = 2131100361(0x7f0602c9, float:1.7813101E38)
            int r2 = r12.getColor(r1)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r2)
            r4.setSpan(r1, r7, r5, r9)
            r1 = 2131951857(0x7f1300f1, float:1.954014E38)
            X.DbU.A12(r12, r3, r1)
        L_0x0267:
            r6.A00 = r0
            return
        L_0x026a:
            r1 = 2131441329(0x7f0b36b1, float:1.8504667E38)
            android.view.View r1 = r13.findViewById(r1)
            if (r1 == 0) goto L_0x023c
            r1.setVisibility(r8)
            goto L_0x023c
        L_0x0277:
            r7 = 0
            if (r2 == 0) goto L_0x018e
            goto L_0x0184
        L_0x027c:
            boolean r1 = r2 instanceof X.C7579QKu
            if (r1 == 0) goto L_0x029c
            r4 = r2
            X.QKu r4 = (X.C7579QKu) r4
            android.content.Intent r1 = r4.A01
            com.facebook.browser.lite.extensions.promoautofill.base.PromoAutofillJSBridgeProxy r3 = new com.facebook.browser.lite.extensions.promoautofill.base.PromoAutofillJSBridgeProxy
            r3.<init>(r1, r4, r0)
            java.lang.String r2 = r3.A06()
            r1 = r0
            com.facebook.browser.lite.webview.SystemWebView r1 = (com.facebook.browser.lite.webview.SystemWebView) r1
            X.QcV r1 = r1.A04
            r1.addJavascriptInterface(r3, r2)
            java.util.HashMap r1 = r4.A06
            r1.put(r0, r3)
            return
        L_0x029c:
            boolean r1 = r2 instanceof X.C7573QKo
            if (r1 == 0) goto L_0x0332
            X.QKo r2 = (X.C7573QKo) r2
            boolean r3 = r2.A03
            if (r3 == 0) goto L_0x030f
            boolean r1 = r2.A01
            if (r1 == 0) goto L_0x030f
            boolean r1 = r2.A00
            if (r1 != 0) goto L_0x00e4
            X.SRY r5 = X.SRY.A00()
            X.7ka r6 = r2.A03
            r4 = 0
            if (r6 != 0) goto L_0x032c
            r6 = r4
            r1 = r4
        L_0x02b9:
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r7 = r0.A04
            android.webkit.WebSettings r8 = r7.getSettings()
            X.RIg r10 = X.RIg.IG_FEED_BROWSER_PEEK
            if (r1 == 0) goto L_0x032a
            X.0JP r0 = r1.A0m
            long r13 = r0.now()
            java.lang.String r12 = r1.A0Z
            com.facebook.privacy.zone.api.ZonedValue r11 = r1.A0Q
            long r0 = r1.A0L
            com.facebook.iabeventlogging.model.IABNonViewableEvent r9 = new com.facebook.iabeventlogging.model.IABNonViewableEvent
            r15 = r13
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r15, r17)
        L_0x02d9:
            if (r6 == 0) goto L_0x0328
            com.facebook.browser.lite.BrowserLiteFragment r6 = (com.facebook.browser.lite.BrowserLiteFragment) r6
            android.os.Bundle r1 = r6.A08
        L_0x02df:
            X.7ka r0 = r2.A03
            if (r0 == 0) goto L_0x02e7
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            com.facebook.privacy.zone.policy.ZonePolicy r4 = r0.A0e
        L_0x02e7:
            r5.A06(r1, r9, r4)
            android.webkit.WebSettings r6 = r7.getSettings()
            java.lang.String r5 = r8.getUserAgentString()
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = " NV/"
            r4.append(r0)
            r0 = 6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r4)
            java.lang.String r0 = X.002.A0R(r5, r0)
            r6.setUserAgentString(r0)
            r0 = 1
            r2.A00 = r0
        L_0x030f:
            if (r3 == 0) goto L_0x031d
            X.7ka r2 = r2.A03
            if (r2 == 0) goto L_0x00e4
            X.REW r1 = X.REW.PEEK
        L_0x0317:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r2.FMM(r1, r0)
            return
        L_0x031d:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x00e4
            X.7ka r2 = r2.A03
            if (r2 == 0) goto L_0x00e4
            X.REW r1 = X.REW.FULL_SHEET
            goto L_0x0317
        L_0x0328:
            r1 = r4
            goto L_0x02df
        L_0x032a:
            r9 = r4
            goto L_0x02d9
        L_0x032c:
            r1 = r6
            com.facebook.browser.lite.BrowserLiteFragment r1 = (com.facebook.browser.lite.BrowserLiteFragment) r1
            X.A9z r1 = r1.A0d
            goto L_0x02b9
        L_0x0332:
            boolean r0 = r2 instanceof X.C7577QKs
            if (r0 == 0) goto L_0x00e4
            r3 = r2
            X.QKs r3 = (X.C7577QKs) r3
            X.7ka r2 = r3.A03
            if (r2 == 0) goto L_0x00e4
            r0 = r2
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            android.view.View r1 = r0.A0B
            if (r1 == 0) goto L_0x00e4
            int r0 = r3.A01()
            android.view.View r1 = r1.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x00e4
            int r0 = r3.A00()
            android.view.View r1 = X.JTP.A0H(r1, r0)
            r0 = 2131428926(0x7f0b063e, float:1.847951E38)
            android.widget.LinearLayout r0 = X.Pxe.A0M(r1, r0)
            r3.A00 = r0
            r3.A03(r1, r2)
            return
        L_0x0365:
            return
        L_0x0366:
            java.lang.String r0 = "messageHandlerCallback"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0378 }
            goto L_0x0373
        L_0x036d:
            java.lang.String r0 = "messageHandlerCallback"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0378 }
        L_0x0373:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0378 }
            throw r0     // Catch:{ all -> 0x0378 }
        L_0x0378:
            r0 = move-exception
            X.QL1.A01(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11364SPc.CrW(X.QLA):void");
    }

    public final void CwH(Fragment fragment) {
        C8124QhG qhG;
        if (this instanceof QL1) {
            QL1 ql1 = (QL1) this;
            0qQ.A0B(fragment, 0);
            if ((fragment instanceof C8134QhS) && (qhG = ql1.A03) != null) {
                ((C8134QhS) fragment).A0J(qhG.getEcpHandler());
            }
        }
    }

    public final void Cz8() {
        if (this instanceof C7578QKt) {
            C7578QKt.A00((C7578QKt) this);
        } else if (this instanceof C7580QKv) {
            C7580QKv qKv = (C7580QKv) this;
            STY sty = qKv.A07;
            if (qKv.A0Q && sty != null) {
                qKv.A0U = false;
                qKv.A0V = false;
                sty.A09();
                C7607QOp qOp = (C7607QOp) sty.A0T.A00.A05.A01;
                if (!(sty.A0E == null || qOp == null)) {
                    sty.A0F(qOp, C11391SRf.A00(qOp), "IAB_CLOSE");
                }
                C11288SJh sJh = qKv.A0b.A02;
                if (sJh.A00.A09(true)) {
                    sJh.A01.endAllInstancesOfMarker(772805755, 615);
                }
            }
        }
    }

    public final void D9l(QLA qla) {
        if (this instanceof C7580QKv) {
            C7580QKv qKv = (C7580QKv) this;
            C7580QKv.A01(qKv, qla);
            qKv.A0b.A00.A0P.A03 = qla.A05();
        } else if (this instanceof C7582QKx) {
            long currentTimeMillis = System.currentTimeMillis();
            SFP sfp = ((C7582QKx) this).A00;
            if (sfp != null && sfp.A01 == null) {
                sfp.A01 = Long.valueOf(currentTimeMillis);
            }
        } else if (this instanceof QL1) {
            QL1.A00((QL1) this);
        }
    }

    public void DDj(Context context, Intent intent, View view, C340027ka r4, C13847TiP tiP, C340037kb r6) {
        this.A00 = context;
        this.A01 = intent;
        this.A02 = view;
        this.A03 = r4;
        this.A04 = r6;
        this.A05 = tiP;
    }

    public final boolean DIU() {
        C8124QhG qhG;
        if (!(this instanceof QL1) || (qhG = ((QL1) this).A03) == null) {
            return false;
        }
        qhG.A00.AZu().A01();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r7.A00 == r9) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DIZ(android.content.Intent r14, java.lang.String r15) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C7580QKv
            if (r0 == 0) goto L_0x0122
            r5 = r13
            X.QKv r5 = (X.C7580QKv) r5
            r2 = 0
            X.STY r4 = r5.A07
            java.lang.String r0 = "ACTION_PROMPT_IAB_AUTOFILL_ON_EXIT_BROWSER"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x009e
            if (r4 == 0) goto L_0x0104
            X.4gR r6 = r5.A0b
            X.RzL r8 = r6.A00
            X.1yd r1 = r6.A04
            r10 = 0
            boolean r0 = X.SPo.A01(r8, r1, r2)
            if (r0 != 0) goto L_0x0027
            boolean r0 = X.SPo.A02(r8, r1, r2)
            if (r0 == 0) goto L_0x0104
        L_0x0027:
            X.JwI r0 = r8.A0H
            java.lang.Object r0 = r0.A00
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0055
            X.7kb r0 = r5.A04
            if (r0 == 0) goto L_0x0055
            X.QLA r0 = r0.C8U()
            if (r0 == 0) goto L_0x0055
            X.JVf r7 = r8.A02
            if (r7 == 0) goto L_0x0056
            java.lang.Object r3 = r7.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r1 = 3
            X.JwM r0 = new X.JwM
            r0.<init>((java.lang.Integer) r9, (java.lang.Integer) r2, (java.lang.Integer) r2, (int) r1)
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r7.A00
            if (r0 != r9) goto L_0x0056
        L_0x0055:
            return r10
        L_0x0056:
            X.Jvc r7 = r8.A0P
            r2 = 1
            r7.A04 = r2
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r5.A0C
            if (r0 == 0) goto L_0x009f
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x009f
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r5.A0C
        L_0x0067:
            X.7kb r1 = r5.A04
            X.QLA r3 = r1.C8U()
            java.util.Map r1 = r5.A0j
            java.lang.Object r3 = r1.get(r3)
            com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r3 = (com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy) r3
            android.os.Bundle r8 = r5.A02()
            if (r3 == 0) goto L_0x009e
            if (r8 == 0) goto L_0x009e
            X.4gR r1 = r4.A0T
            X.RzL r1 = r1.A00
            X.QP6 r1 = r1.A07
            if (r1 == 0) goto L_0x00e7
            java.lang.Object r1 = r1.A01
            X.QOp r1 = (X.C7607QOp) r1
            if (r1 == 0) goto L_0x00e7
            com.fbpay.w3c.CardDetails r1 = X.C11391SRf.A00(r1)
            boolean r1 = X.C11391SRf.A03(r1)
            if (r1 == 0) goto L_0x00e7
            X.7kb r1 = r5.A04
            if (r1 == 0) goto L_0x009e
            java.lang.String r1 = r7.A03
            r4.A0K(r0, r1, r2)
        L_0x009e:
            return r2
        L_0x009f:
            X.QP6 r0 = r8.A07
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r0.A00
            X.QOt r0 = (X.QOt) r0
            if (r0 == 0) goto L_0x00dd
            java.util.Map r1 = X.RUS.A00(r0)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r0.<init>((java.util.Map) r1)
            boolean r1 = r0.A02()
            if (r1 != 0) goto L_0x0067
            r0 = 0
            X.7kb r1 = r5.A04
            if (r1 == 0) goto L_0x0067
            java.lang.String r3 = r7.A03
            java.util.Map r1 = r4.A0W
            java.lang.Object r0 = r1.getOrDefault(r3, r0)
            X.SGp r0 = (X.SGp) r0
            if (r0 == 0) goto L_0x00ce
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r0.A00
            if (r0 == 0) goto L_0x00ce
            goto L_0x0067
        L_0x00ce:
            java.util.Map r1 = r5.A0g
            java.lang.String r0 = r7.A03
            java.lang.String r0 = X.C11429STt.A02(r0)
            java.lang.Object r0 = r1.get(r0)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            goto L_0x0067
        L_0x00dd:
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r0.<init>((java.util.Map) r1)
            goto L_0x0067
        L_0x00e7:
            if (r0 != 0) goto L_0x00ff
            X.SJq r5 = r6.A01
            X.RzL r0 = r5.A00
            java.lang.Integer r4 = X.C11392SRg.A00(r0)
            r3 = 0
            r0 = 511(0x1ff, float:7.16E-43)
            X.GnK r1 = new X.GnK
            r1.<init>(r3, r3, r0)
            java.lang.String r0 = "NUX_PERSONALIZATION_CACHE_MISSED"
            r5.A02(r8, r1, r4, r0)
            return r2
        L_0x00ff:
            r1 = 0
            r5.A08(r8, r3, r0, r1)
            return r2
        L_0x0104:
            android.content.Context r7 = r5.A00
            X.4gR r6 = r5.A0b
            r4 = 1
            X.0qQ.A0B(r6, r4)
            if (r7 == 0) goto L_0x0122
            X.RzL r5 = r6.A00
            X.Tnz r3 = r5.A0A
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0122
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0122
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0124
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0124
        L_0x0122:
            r10 = 0
            return r10
        L_0x0124:
            X.Ro4 r0 = r6.A03
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "autofill_passkey_opt_in_cache_key"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x0122
            X.1yd r0 = r6.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0122
            X.Jvc r0 = r5.A0P
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "iab_session_id"
            java.util.LinkedHashMap r9 = X.C66582MXn.A0y(r0, r1)
            X.TYH r11 = X.TYH.A00
            X.TYG r12 = X.TYG.A00
            X.TWk r10 = X.TWk.A00
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            X.C9230RUh.A00(r7, r8, r9, r10, r11, r12)
            r3.A01 = r2
            r3.A03 = r2
            r3.A00 = r2
            r3.A02 = r4
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11364SPc.DIZ(android.content.Intent, java.lang.String):boolean");
    }

    public final void DOE(QLA qla, String str) {
        Object obj;
        if (this instanceof C7580QKv) {
            obj = ((C7580QKv) this).A0j.get(qla);
        } else if (this instanceof C7579QKu) {
            AnonymousClass7TG.A1N(qla, str);
            obj = ((C7579QKu) this).A06.get(qla);
        } else {
            return;
        }
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = (BrowserLiteJSBridgeProxy) obj;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.A0A(str);
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.QcV, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v33, types: [X.QcV, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v40, types: [X.0iw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v53, types: [X.0iw, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01cc, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01cf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r1 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        if (r1 != null) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DW1(X.QLA r8, java.lang.String r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C7575QKq
            if (r0 == 0) goto L_0x00ec
            r3 = r7
            X.QKq r3 = (X.C7575QKq) r3
            X.AnonymousClass7TG.A1N(r8, r9)
            X.11S r0 = r3.A05
            boolean r0 = r0.A08(r9)
            if (r0 == 0) goto L_0x007b
            com.instagram.common.session.UserSession r2 = r3.A01
            java.lang.String r6 = r3.A02
            com.facebook.iabadscontext.IgPromoAdsExtension r1 = r3.A00
            if (r1 == 0) goto L_0x0075
            java.util.List r0 = r1.A02
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            com.facebook.iabadscontext.IgPromoAdsPromoCode r0 = (com.facebook.iabadscontext.IgPromoAdsPromoCode) r0
            if (r0 == 0) goto L_0x0075
            java.lang.String r5 = r0.A00
        L_0x0028:
            java.util.List r0 = r1.A02
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            com.facebook.iabadscontext.IgPromoAdsPromoCode r0 = (com.facebook.iabadscontext.IgPromoAdsPromoCode) r0
            if (r0 == 0) goto L_0x0079
            java.lang.String r4 = r0.A01
        L_0x0036:
            java.lang.String r3 = r3.A03
            X.T5u r0 = new X.T5u
            r0.<init>()
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r2)
            java.lang.String r0 = "ig_promo_ads_checkout_page"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0072
            long r0 = java.lang.Long.parseLong(r6)
            X.C51970G9q.A17(r2, r0)
            if (r5 == 0) goto L_0x0073
            java.lang.Long r1 = X.DbV.A0q(r5)
        L_0x005a:
            java.lang.String r0 = "offer_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "promo_code"
            r2.AAJ(r0, r4)
            java.lang.String r0 = "url"
            r2.AAJ(r0, r9)
            X.C51965G9l.A1L(r2, r3)
            r2.Cgf()
        L_0x0072:
            return
        L_0x0073:
            r1 = 0
            goto L_0x005a
        L_0x0075:
            r5 = 0
            if (r1 == 0) goto L_0x0079
            goto L_0x0028
        L_0x0079:
            r4 = 0
            goto L_0x0036
        L_0x007b:
            X.11S r0 = r3.A04
            boolean r0 = r0.A08(r9)
            if (r0 == 0) goto L_0x0072
            com.instagram.common.session.UserSession r2 = r3.A01
            java.lang.String r6 = r3.A02
            com.facebook.iabadscontext.IgPromoAdsExtension r1 = r3.A00
            if (r1 == 0) goto L_0x00e6
            java.util.List r0 = r1.A02
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            com.facebook.iabadscontext.IgPromoAdsPromoCode r0 = (com.facebook.iabadscontext.IgPromoAdsPromoCode) r0
            if (r0 == 0) goto L_0x00e6
            java.lang.String r5 = r0.A00
        L_0x0099:
            java.util.List r0 = r1.A02
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            com.facebook.iabadscontext.IgPromoAdsPromoCode r0 = (com.facebook.iabadscontext.IgPromoAdsPromoCode) r0
            if (r0 == 0) goto L_0x00ea
            java.lang.String r4 = r0.A01
        L_0x00a7:
            java.lang.String r3 = r3.A03
            X.T5u r0 = new X.T5u
            r0.<init>()
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r2)
            java.lang.String r0 = "ig_promo_ads_checkout_confirmation_page"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0072
            long r0 = java.lang.Long.parseLong(r6)
            X.C51970G9q.A17(r2, r0)
            if (r5 == 0) goto L_0x00e4
            java.lang.Long r1 = X.DbV.A0q(r5)
        L_0x00cb:
            java.lang.String r0 = "offer_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "promo_code"
            r2.AAJ(r0, r4)
            java.lang.String r0 = "url"
            r2.AAJ(r0, r9)
            X.C51965G9l.A1L(r2, r3)
            r2.Cgf()
            return
        L_0x00e4:
            r1 = 0
            goto L_0x00cb
        L_0x00e6:
            r5 = 0
            if (r1 == 0) goto L_0x00ea
            goto L_0x0099
        L_0x00ea:
            r4 = 0
            goto L_0x00a7
        L_0x00ec:
            boolean r0 = r7 instanceof X.C7578QKt
            if (r0 == 0) goto L_0x0121
            r3 = r7
            X.QKt r3 = (X.C7578QKt) r3
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0072
            r0 = 1
            r3.A01 = r0
            if (r8 == 0) goto L_0x0072
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x010c
            r2 = 0
            r0 = 2
            X.Slh r1 = new X.Slh
            r1.<init>(r3, r0)
            java.lang.String r0 = "(function(){ return document.documentElement.innerHTML.length; })();"
            r8.A0E(r1, r0, r2)
        L_0x010c:
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0072
            X.QLA r0 = r3.A00
            if (r0 == 0) goto L_0x0072
            X.TBN r1 = new X.TBN
            r1.<init>(r3)
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            r0.post(r1)
            return
        L_0x0121:
            boolean r0 = r7 instanceof X.C7582QKx
            if (r0 == 0) goto L_0x013a
            r2 = r7
            X.QKx r2 = (X.C7582QKx) r2
            X.SFP r1 = r2.A00
            if (r1 == 0) goto L_0x0072
            java.lang.Long r0 = r1.A01
            if (r0 == 0) goto L_0x0072
            java.lang.Long r0 = X.C51968G9o.A0u()
            r1.A00 = r0
            X.C7582QKx.A00(r2)
            return
        L_0x013a:
            boolean r0 = r7 instanceof X.C7580QKv
            if (r0 == 0) goto L_0x0145
            r0 = r7
            X.QKv r0 = (X.C7580QKv) r0
            X.C7580QKv.A01(r0, r8)
            return
        L_0x0145:
            boolean r0 = r7 instanceof X.QL1
            if (r0 == 0) goto L_0x0164
            r4 = r7
            X.QL1 r4 = (X.QL1) r4
            X.AnonymousClass7TG.A1N(r8, r9)
            com.instagram.common.session.UserSession r3 = X.C11431STx.A00()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313514698016820(0x8102f3001f0834, double:3.028151145588313E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0072
            X.QL1.A00(r4)
            return
        L_0x0164:
            boolean r0 = r7 instanceof X.C7581QKw
            if (r0 == 0) goto L_0x0175
            r2 = r7
            X.QKw r2 = (X.C7581QKw) r2
            java.lang.Integer r1 = r2.A0C
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0072
            r2.A02()
            return
        L_0x0175:
            boolean r0 = r7 instanceof X.C7579QKu
            if (r0 == 0) goto L_0x0072
            r5 = r7
            X.QKu r5 = (X.C7579QKu) r5
            boolean r4 = X.AnonymousClass7TG.A1Z(r8, r9)
            com.instagram.common.session.UserSession r3 = r5.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313579124099222(0x81030200370896, double:3.028191888902247E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01b6
            r0 = r8
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            android.content.Context r2 = r0.getContext()
            X.0qQ.A0B(r2, r4)
            java.lang.ref.WeakReference r1 = X.C9117RPp.A00
            if (r1 == 0) goto L_0x01aa
            r0 = 0
            java.lang.Object r3 = r1.get()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x01e1
            X.C9117RPp.A00 = r0
        L_0x01aa:
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131886131(0x7f120033, float:1.9406832E38)
            java.io.InputStreamReader r2 = X.Pxg.A0a(r1, r0)
            goto L_0x01c4
        L_0x01b6:
            X.SRY r0 = X.SRY.A00()
            com.facebook.browser.lite.extensions.promoautofill.instagram.IgPromoAutofillController$injectPromoJS$1 r1 = new com.facebook.browser.lite.extensions.promoautofill.instagram.IgPromoAutofillController$injectPromoJS$1
            r1.<init>(r5, r8)
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r0.A06
            if (r0 == 0) goto L_0x0072
            goto L_0x01e5
        L_0x01c4:
            java.lang.String r3 = X.1r9.A00(r2)     // Catch:{ all -> 0x01c9 }
            goto L_0x01d0
        L_0x01c9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01cb }
        L_0x01cb:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x01d0:
            r2.close()
            int r1 = r3.length()
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 >= r0) goto L_0x01e1
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r3)
            X.C9117RPp.A00 = r0
        L_0x01e1:
            r8.A0F(r3)
            return
        L_0x01e5:
            r0.AUq(r1)     // Catch:{ RemoteException -> 0x01e9 }
            goto L_0x01f2
        L_0x01e9:
            r2 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in fetchAutofillScript"
            X.0KC.A0J(r1, r0, r2)
            return
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11364SPc.DW1(X.QLA, java.lang.String):void");
    }

    public final void DW4(QLA qla, long j) {
        C340027ka r0;
        View view;
        View findViewById;
        HeliumWebViewExtensions heliumWebViewExtensions;
        if (this instanceof C7578QKt) {
            C7578QKt qKt = (C7578QKt) this;
            qKt.A00 = qla;
            if (!qKt.A02) {
                if (qKt.A0F) {
                    if (!qKt.A0G || (heliumWebViewExtensions = ((SystemWebView) qla).A01) == null) {
                        qla.A0E(new C12054Slh(qKt, 3), "(function() {\n  return simHash();\n\n  // Generates a Simhash for the page to detect cloaking.\n  // https://arxiv.org/pdf/1710.01387.pdf\n  function simHash() {\n    const countsText = [];\n    const countsDOM = [];\n      // Initialize a counts array with 64 zeros.\n    for (let i = 0; i < 64; i++) {\n      countsText.push(0);\n      countsDOM.push(0);\n    }\n\n    hashText(countsText);\n    // Copy counts from text only to text and dom\n    const countsTextAndDOM = countsText.slice();\n    hashDomNode(document.documentElement, countsDOM, countsTextAndDOM);\n    return {\n      \"text_and_dom\": generateFinalHash(countsTextAndDOM),\n      \"text_only\": generateFinalHash(countsText),\n      \"dom_only\": generateFinalHash(countsDOM),\n    };\n  }\n\n  // Hash unigrams, bigrams and trigrams in text.\n  function hashText(counts) {\n    // https://github.com/fergiemcdowall/stopword/blob/master/lib/stopwords_en.js\n    // TODO: Internationalization.\n    const stopWords = new Set([\n      'about', 'after', 'all', 'also', 'am', 'an', 'and', 'another', 'any',\n      'are', 'as', 'at', 'be', 'because', 'been', 'before', 'being', 'between',\n      'both', 'but', 'by', 'came', 'can', 'come', 'could', 'did', 'do', 'each',\n      'for', 'from', 'get', 'got', 'has', 'had', 'he', 'have', 'her', 'here',\n      'him', 'himself', 'his', 'how', 'if', 'in', 'into', 'is', 'it', 'like',\n      'make', 'many', 'me', 'might', 'more', 'most', 'much', 'must', 'my',\n      'never', 'now', 'of', 'on', 'only', 'or', 'other', 'our', 'out', 'over',\n      'said', 'same', 'see', 'should', 'since', 'some', 'still', 'such', 'take',\n      'than', 'that', 'the', 'their', 'them', 'then', 'there', 'these', 'they',\n      'this', 'those', 'through', 'to', 'too', 'under', 'up', 'very', 'was',\n      'way', 'we', 'well', 'were', 'what', 'where', 'which', 'while', 'who',\n      'with', 'would', 'you', 'your', 'a', 'i']);\n\n    const words = (document.body.textContent.match(/\\b\\S+\\b/g) || [])\n      .map(word => word.toLowerCase())\n      .filter(word => word.length > 2 && !stopWords.has(word));\n\n    for (let i = 0; i < words.length; i++) {\n      hashAndUpdateCounts(words[i], counts);\n      if (i < words.length - 1)\n        hashAndUpdateCounts(`${words[i]},${words[i + 1]}`, counts);\n      if (i < words.length - 2)\n        hashAndUpdateCounts(\n          `${words[i]},${words[i + 1]},${words[i + 2]}`,\n          counts);\n    }\n  }\n\n  // Traverses the DOM tree depth-first, hashing each node + node-parent pair\n  // and updating counts.\n  function hashDomNode(domNode, counts, countsTextAndDOM, parentString) {\n    let domNodeString = stringifyDomNode(domNode);\n    for (let i = 0; i < domNode.children.length; i++) {\n      hashDomNode(domNode.children[i], counts, countsTextAndDOM, domNodeString);\n    }\n\n    if (parentString) {\n      domNodeString = `${parentString},${domNodeString}`;\n    }\n\n    hashAndUpdateCounts(domNodeString, counts);\n    hashAndUpdateCounts(domNodeString, countsTextAndDOM);\n  }\n\n  // We include the tag name, and the attribute list.\n  function stringifyDomNode(domNode) {\n    let str = `${domNode.tagName}[`;\n    for (let i = 0; i < domNode.attributes.length; i++) {\n      str += `${domNode.attributes[i].nodeName},`;\n    }\n\n    str += \"]\";\n    return str;\n  }\n\n  // Generates the final hash from counts.\n  function generateFinalHash(counts) {\n    let simHash = \"\";\n    for (let i = 0; i < counts.length; i += 4) {\n      let int16 = 0;\n      for (let j = 0; j < 4; j++) {\n        if (counts[i + j] >= 0) {\n          int16 += Math.pow(2, j);\n        }\n      }\n\n      simHash = int16.toString(16) + simHash;\n    }\n\n    return simHash;\n  }\n\n  // Implementation of FNV-1a (64 bit) hash function.\n  // https://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function\n  // Cryptographic hash functions (e.g. md5, sha) are designed to be secure, not\n  // fast. For our purposes, FNV-1a is a great candidate in terms of speed and\n  // uniqueness.\n  // https://softwareengineering.stackexchange.com/questions/49550/which-hashing-algorithm-is-best-for-uniqueness-and-speed/145633#145633\n  function hashAndUpdateCounts(str, counts) {\n    // Use 4 parts of 16 bits to manipulate and generate the 64 bit hash. The\n    // maximum value of a 64 bit unsigned int falls above\n    // Number.MAX_SAFE_INTEGER (25^3 - 1) in JavaScript. Since multiplication\n    // of two 32 bit numbers can still go above that value, we resort to using\n    // 16 bit parts to make multiplication convenient.\n\n    // 64 bit FNV offset basis: 0xcbf29ce484222325\n    let hash00 = 0x2325;\n    let hash16 = 0x8422;\n    let hash32 = 0x9ce4;\n    let hash48 = 0xcbf2;\n\n    // 64 bit FNV prime: 2**40 + 2**8 + 0xb3 = 1099511628211\n    const fnvp00 = 0xb3 + Math.pow(2, 8);\n    const fnvp16 = 0;\n    const fnvp32 = Math.pow(2, 8);\n    const fnvp48 = 0;\n\n    for (let i = 0; i < str.length; i++) {\n      // XOR with each byte of data\n      hash00 ^= str.charCodeAt(i);\n\n      // Multiply by FNV prime, part by part.\n      const temp00 = hash00 * fnvp00;\n\n      const temp16 = (temp00 >>> 16) +\n                     hash16 * fnvp00 +\n                     hash00 * fnvp16;\n\n      const temp32 = (temp16 >>> 16) +\n                     hash32 * fnvp00 +\n                     hash16 * fnvp16 +\n                     hash00 * fnvp32;\n\n      const temp48 = (temp32 >>> 16) +\n                     hash48 * fnvp00 +\n                     hash32 * fnvp16 +\n                     hash16 * fnvp32 +\n                     hash00 * fnvp48;\n\n      hash00 = temp00 & 0xffff;\n      hash16 = temp16 & 0xffff;\n      hash32 = temp32 & 0xffff;\n      hash48 = temp48 & 0xffff;\n    }\n\n    // Update counts using each hash part.\n    updateCounts(hash00, 0, counts);\n    updateCounts(hash16, 16, counts);\n    updateCounts(hash32, 32, counts);\n    updateCounts(hash48, 48, counts);\n  }\n\n  function updateCounts(uint16, offset, counts) {\n    for (let i = 0; i < 16; i++) {\n      counts[offset + i] = uint16 & (0x1 << i)\n        ? counts[offset + i] + 1\n        : counts[offset + i] - 1;\n    }\n  }\n})();\n", false);
                    } else {
                        heliumWebViewExtensions.evaluateJavaScriptOnAllFrames("(function() {\n  return simHash();\n\n  // Generates a Simhash for the page to detect cloaking.\n  // https://arxiv.org/pdf/1710.01387.pdf\n  function simHash() {\n    const countsText = [];\n    const countsDOM = [];\n      // Initialize a counts array with 64 zeros.\n    for (let i = 0; i < 64; i++) {\n      countsText.push(0);\n      countsDOM.push(0);\n    }\n\n    hashText(countsText);\n    // Copy counts from text only to text and dom\n    const countsTextAndDOM = countsText.slice();\n    hashDomNode(document.documentElement, countsDOM, countsTextAndDOM);\n    return {\n      \"text_and_dom\": generateFinalHash(countsTextAndDOM),\n      \"text_only\": generateFinalHash(countsText),\n      \"dom_only\": generateFinalHash(countsDOM),\n    };\n  }\n\n  // Hash unigrams, bigrams and trigrams in text.\n  function hashText(counts) {\n    // https://github.com/fergiemcdowall/stopword/blob/master/lib/stopwords_en.js\n    // TODO: Internationalization.\n    const stopWords = new Set([\n      'about', 'after', 'all', 'also', 'am', 'an', 'and', 'another', 'any',\n      'are', 'as', 'at', 'be', 'because', 'been', 'before', 'being', 'between',\n      'both', 'but', 'by', 'came', 'can', 'come', 'could', 'did', 'do', 'each',\n      'for', 'from', 'get', 'got', 'has', 'had', 'he', 'have', 'her', 'here',\n      'him', 'himself', 'his', 'how', 'if', 'in', 'into', 'is', 'it', 'like',\n      'make', 'many', 'me', 'might', 'more', 'most', 'much', 'must', 'my',\n      'never', 'now', 'of', 'on', 'only', 'or', 'other', 'our', 'out', 'over',\n      'said', 'same', 'see', 'should', 'since', 'some', 'still', 'such', 'take',\n      'than', 'that', 'the', 'their', 'them', 'then', 'there', 'these', 'they',\n      'this', 'those', 'through', 'to', 'too', 'under', 'up', 'very', 'was',\n      'way', 'we', 'well', 'were', 'what', 'where', 'which', 'while', 'who',\n      'with', 'would', 'you', 'your', 'a', 'i']);\n\n    const words = (document.body.textContent.match(/\\b\\S+\\b/g) || [])\n      .map(word => word.toLowerCase())\n      .filter(word => word.length > 2 && !stopWords.has(word));\n\n    for (let i = 0; i < words.length; i++) {\n      hashAndUpdateCounts(words[i], counts);\n      if (i < words.length - 1)\n        hashAndUpdateCounts(`${words[i]},${words[i + 1]}`, counts);\n      if (i < words.length - 2)\n        hashAndUpdateCounts(\n          `${words[i]},${words[i + 1]},${words[i + 2]}`,\n          counts);\n    }\n  }\n\n  // Traverses the DOM tree depth-first, hashing each node + node-parent pair\n  // and updating counts.\n  function hashDomNode(domNode, counts, countsTextAndDOM, parentString) {\n    let domNodeString = stringifyDomNode(domNode);\n    for (let i = 0; i < domNode.children.length; i++) {\n      hashDomNode(domNode.children[i], counts, countsTextAndDOM, domNodeString);\n    }\n\n    if (parentString) {\n      domNodeString = `${parentString},${domNodeString}`;\n    }\n\n    hashAndUpdateCounts(domNodeString, counts);\n    hashAndUpdateCounts(domNodeString, countsTextAndDOM);\n  }\n\n  // We include the tag name, and the attribute list.\n  function stringifyDomNode(domNode) {\n    let str = `${domNode.tagName}[`;\n    for (let i = 0; i < domNode.attributes.length; i++) {\n      str += `${domNode.attributes[i].nodeName},`;\n    }\n\n    str += \"]\";\n    return str;\n  }\n\n  // Generates the final hash from counts.\n  function generateFinalHash(counts) {\n    let simHash = \"\";\n    for (let i = 0; i < counts.length; i += 4) {\n      let int16 = 0;\n      for (let j = 0; j < 4; j++) {\n        if (counts[i + j] >= 0) {\n          int16 += Math.pow(2, j);\n        }\n      }\n\n      simHash = int16.toString(16) + simHash;\n    }\n\n    return simHash;\n  }\n\n  // Implementation of FNV-1a (64 bit) hash function.\n  // https://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function\n  // Cryptographic hash functions (e.g. md5, sha) are designed to be secure, not\n  // fast. For our purposes, FNV-1a is a great candidate in terms of speed and\n  // uniqueness.\n  // https://softwareengineering.stackexchange.com/questions/49550/which-hashing-algorithm-is-best-for-uniqueness-and-speed/145633#145633\n  function hashAndUpdateCounts(str, counts) {\n    // Use 4 parts of 16 bits to manipulate and generate the 64 bit hash. The\n    // maximum value of a 64 bit unsigned int falls above\n    // Number.MAX_SAFE_INTEGER (25^3 - 1) in JavaScript. Since multiplication\n    // of two 32 bit numbers can still go above that value, we resort to using\n    // 16 bit parts to make multiplication convenient.\n\n    // 64 bit FNV offset basis: 0xcbf29ce484222325\n    let hash00 = 0x2325;\n    let hash16 = 0x8422;\n    let hash32 = 0x9ce4;\n    let hash48 = 0xcbf2;\n\n    // 64 bit FNV prime: 2**40 + 2**8 + 0xb3 = 1099511628211\n    const fnvp00 = 0xb3 + Math.pow(2, 8);\n    const fnvp16 = 0;\n    const fnvp32 = Math.pow(2, 8);\n    const fnvp48 = 0;\n\n    for (let i = 0; i < str.length; i++) {\n      // XOR with each byte of data\n      hash00 ^= str.charCodeAt(i);\n\n      // Multiply by FNV prime, part by part.\n      const temp00 = hash00 * fnvp00;\n\n      const temp16 = (temp00 >>> 16) +\n                     hash16 * fnvp00 +\n                     hash00 * fnvp16;\n\n      const temp32 = (temp16 >>> 16) +\n                     hash32 * fnvp00 +\n                     hash16 * fnvp16 +\n                     hash00 * fnvp32;\n\n      const temp48 = (temp32 >>> 16) +\n                     hash48 * fnvp00 +\n                     hash32 * fnvp16 +\n                     hash16 * fnvp32 +\n                     hash00 * fnvp48;\n\n      hash00 = temp00 & 0xffff;\n      hash16 = temp16 & 0xffff;\n      hash32 = temp32 & 0xffff;\n      hash48 = temp48 & 0xffff;\n    }\n\n    // Update counts using each hash part.\n    updateCounts(hash00, 0, counts);\n    updateCounts(hash16, 16, counts);\n    updateCounts(hash32, 32, counts);\n    updateCounts(hash48, 48, counts);\n  }\n\n  function updateCounts(uint16, offset, counts) {\n    for (let i = 0; i < 16; i++) {\n      counts[offset + i] = uint16 & (0x1 << i)\n        ? counts[offset + i] + 1\n        : counts[offset + i] - 1;\n    }\n  }\n})();\n", new C11524Sbl(qKt, 1));
                        return;
                    }
                }
                qla.A0E(new C12054Slh(qKt, 4), "(function () { \n  return getDOMTagCounts();\n  function getDOMTagCounts() { \n    const allElements = document.documentElement.getElementsByTagName(\"*\");\n    const tagToCount = {};\n    for (let i = 0; i < allElements.length; i++) {\n      const nodeName = allElements.item(i).nodeName.toUpperCase();\n      if (!(nodeName in tagToCount)) {\n        tagToCount[nodeName] = 0;\n      }\n      tagToCount[nodeName]++;\n    }\n    return tagToCount;\n  }\n})();", false);
            }
        } else if (this instanceof C7580QKv) {
            C7580QKv qKv = (C7580QKv) this;
            C7580QKv.A01(qKv, qla);
            qKv.A02 = SystemClock.elapsedRealtime();
        } else if (this instanceof C7582QKx) {
            SFP sfp = ((C7582QKx) this).A00;
            if (sfp != null && sfp.A01 == null) {
                sfp.A01 = Long.valueOf(j);
            }
        } else if (this instanceof C7576QKr) {
            C7576QKr qKr = (C7576QKr) this;
            QPy qPy = qKr.A01;
            if (qPy != null && qPy.A05 && (r0 = qKr.A03) != null && (view = ((BrowserLiteFragment) r0).A0B) != null && (findViewById = view.findViewById(R.id.shops_lite_disclaimer_layout)) != null) {
                SB5.A00(new TBL(findViewById));
            }
        } else if (this instanceof C7581QKw) {
            C7581QKw qKw = (C7581QKw) this;
            qKw.A07 = true;
            if (qKw.A0C == AnonymousClass05K.A01) {
                qKw.A02();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019f, code lost:
        if (r13 != null) goto L_0x016a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DWB(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = r1 instanceof X.C7578QKt
            r11 = r20
            if (r0 == 0) goto L_0x0077
            r2 = r1
            X.QKt r2 = (X.C7578QKt) r2
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0481
            android.net.Uri r1 = X.Pxg.A0L(r11)
            if (r1 == 0) goto L_0x0481
            java.lang.String r0 = r1.getHost()
            if (r0 == 0) goto L_0x0481
            java.util.Map r0 = r2.A0C
            java.lang.Object r10 = r0.get(r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.util.List r3 = r2.A06
            java.lang.String r12 = r1.getHost()
            java.lang.String r0 = r1.getPath()
            java.security.MessageDigest r4 = r2.A05
            r13 = 0
            if (r4 == 0) goto L_0x0044
            r4.reset()
            byte[] r0 = r0.getBytes()
            r4.update(r0)
            byte[] r0 = r4.digest()
            java.lang.String r13 = X.0JX.A01(r0)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
        L_0x0044:
            java.lang.String r1 = r1.getHost()
            java.lang.String r0 = "www."
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 4
            java.lang.String r1 = r1.substring(r0)
        L_0x0056:
            r14 = 0
            if (r4 == 0) goto L_0x006b
            r4.reset()
            byte[] r0 = r1.getBytes()
            r4.update(r0)
            byte[] r0 = r4.digest()
            java.lang.String r14 = X.0JX.A01(r0)     // Catch:{ UnsupportedEncodingException -> 0x006b }
        L_0x006b:
            X.T9H r9 = new X.T9H
            r9.<init>(r10, r11, r12, r13, r14)
            r3.add(r9)
            r0 = 0
            r2.A01 = r0
            return
        L_0x0077:
            boolean r0 = r1 instanceof X.C7580QKv
            if (r0 == 0) goto L_0x03b4
            r5 = r1
            X.QKv r5 = (X.C7580QKv) r5
            X.4gR r8 = r5.A0b
            X.RzL r4 = r8.A00
            X.JTb r0 = r4.A09
            r3 = 0
            r0.A00 = r3
            X.STY r2 = r5.A07
            boolean r0 = r5.A0Q
            if (r0 == 0) goto L_0x0398
            if (r2 == 0) goto L_0x0398
            X.7kb r0 = r5.A04
            if (r0 == 0) goto L_0x009b
            X.Jvc r1 = r4.A0P
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            java.lang.String r0 = r0.A0l
            r1.A03 = r0
        L_0x009b:
            X.QP6 r0 = r4.A05
            java.lang.Object r0 = r0.A00
            X.QOt r0 = (X.QOt) r0
            if (r0 == 0) goto L_0x01f0
            java.util.Map r0 = X.RUS.A00(r0)
        L_0x00a7:
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r9 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r9.<init>((java.util.Map) r0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            X.JwM r1 = r4.A0L
            java.lang.Object r0 = r1.A01
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "USAGE_PAYMENT_FORM_COMPLETION"
            X.RRP r0 = r2.A06(r0)
            X.SUR.A0B(r8, r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A01 = r0
        L_0x00c5:
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r5.A0C
            if (r0 == 0) goto L_0x01c0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01c0
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r5.A0C
        L_0x00d1:
            if (r0 != 0) goto L_0x0101
            boolean r0 = r9.A02()
            if (r0 != 0) goto L_0x00da
            r9 = 0
        L_0x00da:
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r5.A0C
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00e6
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r9 = r5.A0C
        L_0x00e6:
            r0 = r9
            if (r9 != 0) goto L_0x0101
            java.util.List r0 = r2.A0F
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01bd
            java.util.List r0 = r2.A0F
            java.lang.Object r0 = r0.get(r3)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            if (r0 == 0) goto L_0x01bd
            boolean r1 = r0.A03()
            if (r1 == 0) goto L_0x01bd
        L_0x0101:
            r2.A0D = r7
            r2.A0K(r0, r11, r3)
            X.4gR r9 = r2.A0T
            X.RzL r6 = r9.A00
            X.QP6 r0 = r6.A05
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0124
            java.lang.Long r0 = r2.A0E
            if (r0 == 0) goto L_0x0124
            X.Q8n r0 = r2.A03
            if (r0 != 0) goto L_0x01b5
            r1 = 0
        L_0x0119:
            java.lang.String r0 = "AUTOFILL_PAGE_NAVIGATION"
            X.RRP r0 = r2.A06(r0)
            r0.A0D = r1
            X.SUR.A0C(r9, r2, r0)
        L_0x0124:
            r2.A09()
            X.1yd r9 = r8.A04
            X.SJq r8 = r8.A01
            android.os.Bundle r18 = r5.A02()
            android.content.Context r10 = r5.A00
            int r17 = X.DbW.A02(r3, r9, r8)
            com.instagram.common.session.UserSession r12 = r9.A00
            X.0Tu r11 = X.0Tu.A05
            r0 = 36322860550662766(0x810b7300592a6e, double:3.034061500434337E-306)
            boolean r0 = X.DbY.A1Z(r11, r12, r0)
            if (r0 == 0) goto L_0x032f
            X.JwM r0 = r4.A03
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            X.0qQ.A0B(r0, r3)
            java.util.LinkedList r11 = X.Pxe.A1A()
            java.util.Iterator r16 = r0.iterator()
            r13 = 0
            r14 = r13
            r12 = r13
        L_0x0158:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01f6
            java.lang.Object r1 = r16.next()
            X.REJ r1 = (X.REJ) r1
            if (r13 == 0) goto L_0x0167
            r12 = r13
        L_0x0167:
            if (r14 == 0) goto L_0x019f
            r13 = r14
        L_0x016a:
            if (r12 == 0) goto L_0x0194
            X.REJ r0 = X.REJ.AUTOFILL
            if (r1 != r0) goto L_0x0194
            X.REJ r0 = X.REJ.EVENT_INPUT_HIDDEN
            if (r13 != r0) goto L_0x0194
            X.REJ r0 = X.REJ.EVENT_INPUT_SHOWN
            if (r12 != r0) goto L_0x0194
            X.REV r0 = X.REV.ACCEPTED_SYSTEM_AUTOFILL
        L_0x017a:
            boolean r14 = r11.isEmpty()
            if (r14 != 0) goto L_0x018f
            X.REV r14 = X.REV.ACCEPTED_SYSTEM_AUTOFILL
            if (r0 != r14) goto L_0x018f
            java.lang.Object r15 = r11.peekLast()
            X.REV r14 = X.REV.DECLINED_SYSTEM_AUTOFILL
            if (r15 != r14) goto L_0x018f
            r11.pollLast()
        L_0x018f:
            r11.add(r0)
        L_0x0192:
            r14 = r1
            goto L_0x0158
        L_0x0194:
            X.REJ r0 = X.REJ.EVENT_INPUT_HIDDEN
            if (r1 != r0) goto L_0x01a2
            X.REJ r0 = X.REJ.EVENT_INPUT_SHOWN
            if (r13 != r0) goto L_0x01a5
            X.REV r0 = X.REV.DECLINED_SYSTEM_AUTOFILL
            goto L_0x017a
        L_0x019f:
            if (r13 == 0) goto L_0x01a2
            goto L_0x016a
        L_0x01a2:
            if (r1 != 0) goto L_0x01a5
            goto L_0x0192
        L_0x01a5:
            int r14 = r1.ordinal()
            r0 = r17
            if (r14 == r0) goto L_0x01b2
            if (r14 != r3) goto L_0x0192
            X.REV r0 = X.REV.PROMPTED_SYSTEM_AUTOFILL
            goto L_0x017a
        L_0x01b2:
            X.REV r0 = X.REV.NOT_PROMPTED_SYSTEM_AUTOFILL
            goto L_0x017a
        L_0x01b5:
            java.lang.String r0 = r0.A06
            java.lang.String r1 = X.C11429STt.A02(r0)
            goto L_0x0119
        L_0x01bd:
            r0 = 0
            goto L_0x0101
        L_0x01c0:
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x01c9
            r0 = r9
            goto L_0x0101
        L_0x01c9:
            X.Jvc r10 = r4.A0P
            java.lang.String r6 = r10.A03
            java.util.Map r1 = r2.A0W
            r0 = 0
            java.lang.Object r6 = r1.getOrDefault(r6, r0)
            X.SGp r6 = (X.SGp) r6
            java.util.Map r1 = r5.A0g
            r0 = 2
            X.0qQ.A0B(r1, r0)
            if (r6 == 0) goto L_0x01e2
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r6.A00
            if (r0 != 0) goto L_0x00d1
        L_0x01e2:
            java.lang.String r0 = r10.A03
            java.lang.String r0 = X.C11429STt.A02(r0)
            java.lang.Object r0 = r1.get(r0)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            goto L_0x00d1
        L_0x01f0:
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            goto L_0x00a7
        L_0x01f6:
            X.JwM r0 = r4.A03
            java.lang.Object r1 = r0.A01
            X.QOv r1 = (X.QOv) r1
            if (r10 == 0) goto L_0x02a3
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02a3
            java.util.List r0 = r1.A00
            java.util.LinkedHashMap r12 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r13 = r0.iterator()
        L_0x0210:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0229
            java.lang.Object r1 = r13.next()
            r0 = r1
            X.MbG r0 = (X.C66709MbG) r0
            java.lang.Object r0 = r0.A02
            java.lang.Object r0 = X.JTS.A0h(r0, r12)
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L_0x0210
        L_0x0229:
            java.util.ArrayList r13 = X.JTQ.A0f(r12)
            java.util.Iterator r16 = X.AnonymousClass7TF.A0s(r12)
        L_0x0231:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x027e
            java.lang.Object r0 = X.C51971G9r.A0p(r16)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r15 = r0.iterator()
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0279
            java.lang.Object r12 = r15.next()
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0275
            r0 = r12
            X.MbG r0 = (X.C66709MbG) r0
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
        L_0x025c:
            java.lang.Object r14 = r15.next()
            r0 = r14
            X.MbG r0 = (X.C66709MbG) r0
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x026f
            r12 = r14
            r1 = r0
        L_0x026f:
            boolean r0 = r15.hasNext()
            if (r0 != 0) goto L_0x025c
        L_0x0275:
            r13.add(r12)
            goto L_0x0231
        L_0x0279:
            java.util.NoSuchElementException r0 = X.Pxe.A1C()
            throw r0
        L_0x027e:
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r13)
            java.util.Iterator r13 = r13.iterator()
        L_0x0286:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02a8
            java.lang.Object r1 = r13.next()
            X.MbG r1 = (X.C66709MbG) r1
            java.lang.Object r0 = r1.A03
            r0.toString()
            long r0 = r1.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "DETECTION_TIMESTAMP"
            X.AnonymousClass7TF.A1I(r0, r1, r12)
            goto L_0x0286
        L_0x02a3:
            X.0sm r10 = X.0Yt.A0E()
            goto L_0x02ce
        L_0x02a8:
            java.lang.Class<android.view.autofill.AutofillManager> r0 = android.view.autofill.AutofillManager.class
            java.lang.Object r0 = r10.getSystemService(r0)
            android.view.autofill.AutofillManager r0 = (android.view.autofill.AutofillManager) r0
            android.content.ComponentName r0 = r0.getAutofillServiceComponentName()
            if (r0 == 0) goto L_0x02bc
            java.lang.String r1 = r0.flattenToShortString()
            if (r1 != 0) goto L_0x02be
        L_0x02bc:
            java.lang.String r1 = ""
        L_0x02be:
            java.lang.String r0 = "SERVICE_NAME"
            X.0eP r10 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = r12.toString()
            java.lang.String r0 = "DETECTIONS"
            java.util.LinkedHashMap r10 = X.DbY.A0p(r0, r1, r10)
        L_0x02ce:
            java.util.Iterator r14 = r11.iterator()
        L_0x02d2:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x032f
            java.lang.Object r0 = r14.next()
            X.REV r0 = (X.REV) r0
            java.lang.String r11 = r0.name()
            X.JwM r0 = r4.A03
            java.lang.Object r0 = r0.A00
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r12 = r0.keySet()
            java.util.Set r0 = X.SDK.A08
            boolean r0 = r0.containsAll(r12)
            if (r0 == 0) goto L_0x0304
            java.lang.Integer r13 = X.AnonymousClass05K.A0j
        L_0x02f6:
            r12 = 0
            r0 = 510(0x1fe, float:7.15E-43)
            X.GnK r1 = new X.GnK
            r1.<init>(r12, r10, r0)
            r0 = r18
            r8.A01(r0, r1, r13, r11)
            goto L_0x02d2
        L_0x0304:
            java.util.Set r0 = X.SDK.A03
            X.0qQ.A08(r0)
            java.util.Set r0 = X.00k.A0l(r0, r12)
            boolean r1 = X.C66580MXl.A1b(r0)
            java.util.Set r0 = X.SDK.A0A
            X.0qQ.A08(r0)
            java.util.Set r0 = X.00k.A0l(r0, r12)
            boolean r0 = X.C66580MXl.A1b(r0)
            if (r1 == 0) goto L_0x0327
            if (r0 == 0) goto L_0x0325
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            goto L_0x02f6
        L_0x0325:
            r13 = r7
            goto L_0x02f6
        L_0x0327:
            if (r0 == 0) goto L_0x032c
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            goto L_0x02f6
        L_0x032c:
            java.lang.Integer r13 = X.AnonymousClass05K.A0Y
            goto L_0x02f6
        L_0x032f:
            android.content.Intent r7 = r5.A01
            r1 = 0
            if (r7 == 0) goto L_0x033d
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_USER_META_DISABLED"
            boolean r0 = r7.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x033d
            r1 = 1
        L_0x033d:
            boolean r0 = X.RUU.A00(r4, r9, r1)
            if (r0 == 0) goto L_0x0350
            r8 = 0
            r12 = 7
            r13 = 4
            X.JwM r7 = new X.JwM
            r9 = r8
            r10 = r8
            r11 = r8
            r7.<init>((X.QOv) r8, (java.util.List) r9, (java.util.Map) r10, (kotlin.jvm.internal.DefaultConstructorMarker) r11, (int) r12, (int) r13)
            r4.A03 = r7
        L_0x0350:
            r2.A0S = r3
            r2.A0N = r3
            r1 = 0
            r2.A0E = r1
            X.JwM r0 = r6.A0K
            r0.A00 = r1
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r2.A0K = r0
            X.Jvc r1 = r6.A0P
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r1.A00 = r0
            r2.A0P = r3
            r2.A0Q = r3
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r2.A0J = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r2.A0I = r0
            X.QP6 r0 = new X.QP6
            r0.<init>()
            r6.A05 = r0
            boolean r0 = r2.A0L
            if (r0 != 0) goto L_0x038c
            X.QP6 r1 = r6.A06
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r1.A02 = r0
        L_0x038c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A0D = r0
            X.Tnz r0 = r6.A0A
            r0.A01 = r3
            r0.A03 = r3
            r0.A00 = r3
        L_0x0398:
            X.SHm r0 = r5.A0Z
            if (r0 == 0) goto L_0x03a3
            r0.A05 = r3
            java.util.List r0 = r0.A04
            r0.clear()
        L_0x03a3:
            X.JwM r0 = r4.A0K
            java.lang.Object r0 = r0.A02
            java.util.Map r0 = (java.util.Map) r0
            r0.clear()
            X.QP4 r0 = new X.QP4
            r0.<init>()
            r4.A00 = r0
            return
        L_0x03b4:
            boolean r0 = r1 instanceof X.C7582QKx
            if (r0 == 0) goto L_0x03e3
            r4 = r1
            X.QKx r4 = (X.C7582QKx) r4
            r3 = 0
            X.0qQ.A0B(r11, r3)
            X.SFP r0 = r4.A00
            if (r0 == 0) goto L_0x03ca
            java.lang.Long r0 = r0.A01
            if (r0 == 0) goto L_0x03ca
            X.C7582QKx.A00(r4)
        L_0x03ca:
            X.SFP r2 = r4.A00
            if (r2 != 0) goto L_0x03dd
            java.lang.Long r1 = X.C51968G9o.A0u()
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            X.SFP r2 = new X.SFP
            r2.<init>(r1, r0, r3)
            r4.A00 = r2
        L_0x03dd:
            java.util.LinkedHashSet r0 = r2.A04
            r0.add(r11)
            return
        L_0x03e3:
            boolean r0 = r1 instanceof X.QL1
            if (r0 == 0) goto L_0x0481
            r5 = r1
            X.QL1 r5 = (X.QL1) r5
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.String r0 = r5.A04
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 != 0) goto L_0x0435
            java.lang.String r0 = r5.A04
            java.lang.String r1 = X.C9649ReT.A00(r0)
            java.lang.String r0 = X.C9649ReT.A00(r11)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0426
            X.7ka r4 = r5.A03
            if (r4 == 0) goto L_0x0426
            com.instagram.common.session.UserSession r3 = X.C11431STx.A00()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313514696837160(0x8102f3000d0828, double:3.028151144842291E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0426
            X.4Co r0 = r5.A09
            r1 = 1
            if (r0 == 0) goto L_0x044a
            boolean r0 = r0.isActive()
            if (r0 != r1) goto L_0x044a
        L_0x0426:
            r5.A04 = r11
            X.QhG r0 = r5.A03
            if (r0 == 0) goto L_0x0435
            X.Til r0 = r0.A00
            X.RRI r0 = r0.AZu()
            r0.A01()
        L_0x0435:
            com.instagram.common.session.UserSession r3 = X.C11431STx.A00()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313514698016820(0x8102f3001f0834, double:3.028151145588313E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0481
            X.QL1.A00(r5)
            return
        L_0x044a:
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x0458
            X.TFZ r0 = new X.TFZ
            r0.<init>(r5, r4)
            r1.runOnUiThread(r0)
        L_0x0458:
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            r0 = 0
            if (r1 == 0) goto L_0x047e
            X.07V r1 = r1.getLifecycle()
            X.0xx r4 = X.C71772f0.A00(r1)
            X.SDh r1 = X.AnonymousClass2E0.A0B()
            X.2F6 r1 = r1.A00
            X.12V r1 = r1.A00
            X.12U r1 = (X.AnonymousClass12U) r1
            X.4CZ r3 = r1.A04
            r2 = 27
            X.JTh r1 = new X.JTh
            r1.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r0, (int) r2)
            X.1Er r0 = X.1Eo.A04(r3, r1, r4)
        L_0x047e:
            r5.A09 = r0
            goto L_0x0426
        L_0x0481:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11364SPc.DWB(java.lang.String):void");
    }

    public final void DWO(boolean z) {
        C7607QOp qOp;
        if (this instanceof C7580QKv) {
            C7580QKv qKv = (C7580QKv) this;
            STY sty = qKv.A07;
            if (qKv.A0Q && sty != null && (qOp = (C7607QOp) sty.A0T.A00.A05.A01) != null && sty.A0E != null) {
                sty.A0F(qOp, C11391SRf.A00(qOp), "IAB_PAUSE");
            }
        } else if (this instanceof C7583QKy) {
            C7583QKy.A00((C7583QKy) this);
        } else if (this instanceof C7582QKx) {
            C7582QKx.A00((C7582QKx) this);
        }
    }

    public final void DjT(String str) {
        C10535Rto rto;
        if ((this instanceof C7583QKy) && (rto = ((C7583QKy) this).A00) != null) {
            rto.A00 = str;
        }
    }

    public final void Dll(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        S55 s55;
        if ((this instanceof C7580QKv) && (s55 = ((C7580QKv) this).A08) != null && z != z2) {
            s55.A04 = z2;
            if (s55.A08.A00.A0L.A02 != AnonymousClass05K.A01 || !z2) {
                s55.A00();
            } else {
                s55.A01();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r11.A0A(false) == false) goto L_0x00d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DsY(android.view.MotionEvent r15, android.view.View r16) {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.C7580QKv
            if (r0 == 0) goto L_0x002e
            r1 = r14
            X.QKv r1 = (X.C7580QKv) r1
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L_0x002e
            X.STY r8 = r1.A07
            if (r8 == 0) goto L_0x002e
            boolean r0 = r8.A0N
            if (r0 == 0) goto L_0x002e
            r5 = 1
            int r0 = r15.getAction()
            if (r5 != r0) goto L_0x002e
            X.4gR r9 = r8.A0T
            X.SJh r4 = r9.A02
            r7 = 0
            r3 = 772808057(0x2e101d79, float:3.2767986E-11)
            r12 = 0
            java.lang.Integer r2 = r4.A00(r12, r3, r7)
            X.QLA r0 = r8.A07
            if (r0 != 0) goto L_0x002f
            r4.A01(r2, r12, r3)
        L_0x002e:
            return
        L_0x002f:
            X.QKv r1 = r8.A04
            java.lang.String r0 = r0.A05()
            java.lang.String r6 = X.C11429STt.A02(r0)
            if (r6 == 0) goto L_0x00d8
            java.util.Map r0 = r1.A0i
            java.lang.Object r0 = r0.get(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d8
            X.RzL r6 = r9.A00
            X.Jvc r0 = r6.A0P
            java.lang.String r0 = r0.A03
            boolean r0 = r1.A0K(r0)
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "updateSavedDataStart"
            r4.A02(r2, r12, r0, r3)
            X.QLA r0 = r8.A07
            X.Q8n r1 = r0.A04()
            r8.A0D(r1)
            java.lang.String r0 = "updateSavedDataEnd"
            r4.A02(r2, r12, r0, r3)
            java.lang.String r0 = "updateDetectedFieldsDataStart"
            r4.A02(r2, r12, r0, r3)
            r8.A0C(r1)
            java.lang.String r0 = "updateDetectedFieldsDataEnd"
            r4.A02(r2, r12, r0, r3)
            X.1yd r11 = r9.A04
            X.0qQ.A0B(r11, r7)
            X.QP6 r0 = r6.A06
            java.lang.String r6 = r0.A06
            boolean r0 = X.SPo.A03(r11, r7)
            if (r0 != 0) goto L_0x00a5
            com.instagram.common.session.UserSession r10 = r11.A00
            X.0Tu r9 = X.0Tu.A05
            r0 = 36885810498634400(0x830b73000602a0, double:3.390073314349091E-306)
            java.lang.String r1 = X.Pxe.A0w(r9, r10, r0)
            java.lang.String r0 = "PERSISTENT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r11.A0A(r7)
            if (r0 == 0) goto L_0x00d4
        L_0x00a5:
            if (r6 == 0) goto L_0x00d4
            X.QLA r9 = r8.A07
            X.TPH r6 = new X.TPH
            r6.<init>((X.STY) r8, (int) r5)
            android.os.Handler r5 = X.AnonymousClass7TF.A0D()
            java.util.concurrent.CompletableFuture r10 = new java.util.concurrent.CompletableFuture
            r10.<init>()
            r0 = 18
            X.TYA r1 = new X.TYA
            r1.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r6)
            X.TOb r0 = new X.TOb
            r0.<init>(r7, r1)
            r10.thenApplyAsync(r0)
            X.19S r0 = X.SDh.A00()
            r13 = 37
            X.MHP r8 = new X.MHP
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (X.AnonymousClass4D7) r12, (int) r13)
            X.AnonymousClass7TE.A1Z(r8, r0)
        L_0x00d4:
            r4.A01(r2, r12, r3)
            return
        L_0x00d8:
            r4.A01(r2, r12, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11364SPc.DsY(android.view.MotionEvent, android.view.View):void");
    }

    public final void Esf(QLA qla, Boolean bool, Boolean bool2, String str) {
        Object obj;
        SFP sfp;
        if (this instanceof C7582QKx) {
            C7582QKx qKx = (C7582QKx) this;
            if (!AnonymousClass7TF.A1Y(bool, false)) {
                SFP sfp2 = qKx.A00;
                if (!(sfp2 == null || sfp2.A01 == null)) {
                    C7582QKx.A00(qKx);
                }
                if (qKx.A00 == null) {
                    qKx.A00 = new SFP(C51968G9o.A0u(), DbS.A0y(), false);
                }
                if (AnonymousClass7TF.A1Y(bool2, true) && (sfp = qKx.A00) != null) {
                    sfp.A04.add(str);
                }
            }
        } else if (this instanceof C7578QKt) {
            C7578QKt qKt = (C7578QKt) this;
            if (bool != null && bool2 != null && bool.booleanValue()) {
                qKt.A0C.put(str, bool2);
            }
        } else {
            if (this instanceof C7580QKv) {
                obj = ((C7580QKv) this).A0j.get(qla);
            } else if (this instanceof C7579QKu) {
                AnonymousClass7TG.A1N(qla, str);
                obj = ((C7579QKu) this).A06.get(qla);
            } else {
                return;
            }
            BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = (BrowserLiteJSBridgeProxy) obj;
            if (browserLiteJSBridgeProxy != null) {
                browserLiteJSBridgeProxy.A0A(str);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.QcV] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r1.A0K.booleanValue() == false) goto L_0x004e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FNP(X.QLA r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C7579QKu
            if (r0 == 0) goto L_0x0011
            r1 = r4
            X.QKu r1 = (X.C7579QKu) r1
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.util.HashMap r0 = r1.A06
            r0.remove(r5)
        L_0x0010:
            return
        L_0x0011:
            boolean r0 = r4 instanceof X.QL1
            if (r0 == 0) goto L_0x007b
            r0 = r4
            X.QL1 r0 = (X.QL1) r0
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.S6T r2 = r0.A01
            if (r2 == 0) goto L_0x0010
            boolean r0 = r2 instanceof X.QKZ
            if (r0 == 0) goto L_0x0010
            X.QKZ r2 = (X.QKZ) r2
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0073
            java.lang.ref.WeakReference r0 = r2.A00
            if (r0 == 0) goto L_0x0088
            java.lang.Object r1 = r0.get()
            X.QLA r1 = (X.QLA) r1
            if (r1 == 0) goto L_0x0073
            r0 = r1
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            android.webkit.WebSettings r0 = r0.getSettings()
            boolean r0 = r0.supportMultipleWindows()
            if (r0 == 0) goto L_0x004e
            java.lang.Boolean r0 = r1.A0K
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 == 0) goto L_0x0073
            java.lang.ref.WeakReference r0 = r2.A00
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r0.get()
            X.RRE r0 = (X.RRE) r0
            r1 = 0
            if (r0 == 0) goto L_0x006a
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r1 = r0.A04
        L_0x006a:
            boolean r0 = r1 instanceof android.webkit.WebView
            if (r0 == 0) goto L_0x0073
            if (r1 == 0) goto L_0x0073
            X.090.A03(r1)
        L_0x0073:
            java.lang.ref.WeakReference r0 = r2.A00
            if (r0 == 0) goto L_0x0010
            r0.clear()
            return
        L_0x007b:
            boolean r0 = r4 instanceof X.C7580QKv
            if (r0 == 0) goto L_0x0010
            r0 = r4
            X.QKv r0 = (X.C7580QKv) r0
            java.util.Map r0 = r0.A0j
            r0.remove(r5)
            return
        L_0x0088:
            java.lang.String r0 = "browserLiteWebView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11364SPc.FNP(X.QLA):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        STY sty;
        if (this instanceof C7580QKv) {
            C7580QKv qKv = (C7580QKv) this;
            if (i2 == -1 && i == 1000) {
                String stringExtra = intent.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE");
                if ("save_autofill_request_fragment".equals(stringExtra)) {
                    try {
                        QLA C8U = qKv.A04.C8U();
                        AutofillData autofillData = new AutofillData(C66580MXl.A17(intent.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING")));
                        qKv.A08(Bundle.EMPTY, (AutofillSharedJSBridgeProxy) qKv.A0j.get(C8U), autofillData, (Integer) null);
                    } catch (JSONException unused) {
                        throw AnonymousClass7TE.A0z("Illegal JSON for autofill save");
                    }
                } else if ("autofill_request_fragment".equals(stringExtra)) {
                    QLA C8U2 = qKv.A04.C8U();
                    ArrayList A052 = SUR.A05(intent.getStringArrayListExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"));
                    RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = (RequestAutofillJSBridgeCall) intent.getParcelableExtra(C66579MXk.A00(485));
                    QP6 qp6 = qKv.A0b.A00.A06;
                    qp6.A05 = qp6.A05;
                    if (!A052.isEmpty()) {
                        qKv.A0A((AutofillSharedJSBridgeProxy) qKv.A0j.get(C8U2), requestAutofillJSBridgeCall, (Integer) null, A052);
                    }
                }
            }
            if (qKv.A0Q && (sty = qKv.A07) != null) {
                if (i == 1001) {
                    sty.A0A(i2, intent);
                }
                qKv.A07.A08();
            }
        }
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        AnonymousClass37D r1;
        FragmentActivity activity;
        if (this instanceof QL0) {
            C340027ka r0 = this.A03;
            if (r0 == null || (activity = r0.getActivity()) == null) {
                r1 = null;
            } else {
                r1 = DbT.A0i(activity);
            }
            if (r1 instanceof AnonymousClass37F) {
                AnonymousClass37F r12 = (AnonymousClass37F) r1;
                boolean z = true;
                if (!r12.A0f ? i2 != 0 : i2 != -1) {
                    z = false;
                }
                C7218Pzn pzn = r12.A0D;
                if (pzn != null) {
                    int i5 = 2;
                    if (z) {
                        i5 = 1;
                    }
                    pzn.A06 = i5;
                }
            }
        } else if (this instanceof C7577QKs) {
            C7577QKs qKs = (C7577QKs) this;
            float f = (float) (i2 - i4);
            if (Math.abs((float) (i - i3)) > Math.abs(f)) {
                return;
            }
            if (f < 0.0f) {
                LinearLayout linearLayout = qKs.A00;
                if (linearLayout == null) {
                    return;
                }
                if (qKs.A02) {
                    linearLayout.setVisibility(8);
                    qKs.A01 = false;
                    return;
                }
                if (!qKs.A01) {
                    linearLayout.setVisibility(0);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, AnonymousClass7TE.A03(linearLayout), 0.0f);
                    translateAnimation.setDuration(500);
                    Pxg.A1I(translateAnimation);
                    linearLayout.startAnimation(translateAnimation);
                }
                qKs.A01 = true;
                return;
            }
            qKs.A02();
        }
    }

    public static void A03(C7580QKv qKv, RRP rrp) {
        rrp.A0P = !qKv.A0H();
    }
}
