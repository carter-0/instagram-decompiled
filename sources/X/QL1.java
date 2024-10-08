package X;

import android.content.Intent;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.instagram.common.session.UserSession;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

public final class QL1 extends C11364SPc implements Thread.UncaughtExceptionHandler, B3J, C13923TlR, C13922TlQ {
    public static final List A0C = 0sr.A1P(new String[]{"facebookpay", "fbpay", "ecp", "expresscheckout", "offsite"});
    public C10981S3p A00;
    public S6T A01;
    public UserSession A02;
    public C8124QhG A03;
    public String A04;
    public String A05;
    public Thread.UncaughtExceptionHandler A06;
    public ArrayList A07;
    public AnonymousClass0eM A08;
    public C262204Co A09;
    public final AnonymousClass2gO A0A = C11649Sdr.A00(this, 18);
    public final IABAdsContext A0B;

    public final void destroy() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A06;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            this.A06 = null;
        }
        super.destroy();
    }

    public QL1(IABAdsContext iABAdsContext, UserSession userSession) {
        this.A0B = iABAdsContext;
        this.A02 = userSession;
        this.A07 = AnonymousClass7TE.A1C();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r1 == false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.QL1 r10) {
        /*
            com.instagram.common.session.UserSession r2 = X.C11431STx.A00()
            X.0Tu r9 = X.0Tu.A05
            r0 = 36313514697361455(0x8102f30015082f, double:3.0281511451738574E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x0146
            X.0eM r0 = r10.A08
            if (r0 == 0) goto L_0x0146
            com.facebookpay.offsite.base.CheckoutHandler r2 = X.C11364SPc.A02(r10)
            X.Til r0 = r2.A03
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()
            if (r0 == 0) goto L_0x006a
            java.lang.String r1 = com.facebookpay.offsite.base.CheckoutHandler.A02(r2)
            java.lang.String r0 = "PRODUCT_ID"
            r8.put(r0, r1)
            X.S7g r0 = com.facebookpay.offsite.base.CheckoutHandler.A00(r2)
            java.lang.String r1 = r0.A03()
            if (r1 == 0) goto L_0x003d
            java.lang.String r0 = "PARTNER_ID"
            r8.put(r0, r1)
        L_0x003d:
            X.S7g r0 = com.facebookpay.offsite.base.CheckoutHandler.A00(r2)
            java.lang.String r1 = r0.A04()
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "PARTNER_MERCHANT_ID"
            r8.put(r0, r1)
        L_0x004c:
            java.lang.String r1 = r2.A09
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = "SESSION_ID"
            r8.put(r0, r1)
        L_0x0055:
            java.lang.String r1 = r2.A09
            if (r1 != 0) goto L_0x005d
            java.lang.String r1 = X.C2818159r.A01()
        L_0x005d:
            java.lang.String r0 = com.facebookpay.offsite.base.CheckoutHandler.A02(r2)
            com.facebookpay.logging.LoggingContext r1 = X.C11418SSt.A00(r1, r0)
            java.lang.String r0 = "logging_context"
            r8.put(r0, r1)
        L_0x006a:
            X.7ka r0 = r10.A03
            if (r0 == 0) goto L_0x0146
            X.QLA r0 = r0.C8U()
            if (r0 == 0) goto L_0x0146
            java.lang.String r7 = r0.A05()
            if (r7 == 0) goto L_0x0146
            com.facebookpay.offsite.base.CheckoutHandler r2 = X.C11364SPc.A02(r10)
            boolean r0 = r2.A0H
            if (r0 == 0) goto L_0x009b
            java.lang.String r1 = X.C9649ReT.A00(r7)
            X.S7g r0 = com.facebookpay.offsite.base.CheckoutHandler.A00(r2)
            X.S6a r0 = r0.A04
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r0.A04
        L_0x0090:
            java.lang.String r0 = X.C9649ReT.A00(r0)
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            java.lang.String r5 = "Product config is not initialized"
            java.lang.String r4 = "BaseOffsiteFbPaySDKController"
            r6 = 0
            if (r0 == 0) goto L_0x0157
            com.facebookpay.offsite.base.CheckoutHandler r0 = X.C11364SPc.A02(r10)
            X.OV5 r1 = r0.A0T
            java.lang.String r0 = X.C9649ReT.A00(r7)
            com.facebookpay.offsite.models.message.OffsiteData r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r6 = r0.script
        L_0x00b5:
            X.STx r3 = X.AnonymousClass2E0.A0D()
            com.instagram.common.session.UserSession r2 = r3.A00
            r0 = 36313514697885747(0x8102f3001d0833, double:3.028151145505422E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            r2 = 0
            if (r0 == 0) goto L_0x00f8
            X.0xa r1 = r3.A01
            java.lang.String r0 = "script_injection"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x00f8
            if (r6 != 0) goto L_0x00d6
            java.lang.String r6 = ""
        L_0x00d6:
            com.facebookpay.offsite.base.CheckoutHandler r0 = X.C11364SPc.A02(r10)
            java.lang.String r0 = r0.A0C
            if (r0 == 0) goto L_0x00fa
            com.facebookpay.offsite.base.CheckoutHandler r0 = X.C11364SPc.A02(r10)
            java.lang.String r0 = r0.A0D
            java.lang.String r1 = X.C9649ReT.A00(r0)
            java.lang.String r0 = X.C9649ReT.A00(r7)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00fa
            com.facebookpay.offsite.base.CheckoutHandler r0 = X.C11364SPc.A02(r10)
            java.lang.String r6 = r0.A0C
        L_0x00f8:
            if (r6 == 0) goto L_0x0146
        L_0x00fa:
            X.S6T r0 = r10.A01
            if (r0 == 0) goto L_0x014d
            java.lang.ref.WeakReference r0 = r0.A00
            if (r0 == 0) goto L_0x0146
            com.facebookpay.offsite.base.CheckoutHandler r1 = X.C11364SPc.A02(r10)
            X.REu r0 = X.C8902REu.CLIENT_EXECUTE_OFFSITEMERCHANTJAVASCRIPT_INIT
            r1.A0H(r0, r8)
            X.S6T r3 = r10.A01
            if (r3 == 0) goto L_0x014d
            com.facebookpay.offsite.base.CheckoutHandler r0 = X.C11364SPc.A02(r10)
            boolean r2 = r0.A0a
            java.lang.ref.WeakReference r0 = r3.A00
            if (r0 == 0) goto L_0x014a
            java.lang.Object r1 = r0.get()
            X.QLA r1 = (X.QLA) r1
            r3.A01 = r8
            r3.A02 = r2
            if (r1 == 0) goto L_0x012d
            X.TIS r0 = new X.TIS
            r0.<init>(r3, r1, r6)
            X.SB5.A00(r0)
        L_0x012d:
            r10.A05 = r7
            com.facebookpay.offsite.base.CheckoutHandler r0 = X.C11364SPc.A02(r10)
            X.Til r0 = r0.A03
            if (r0 == 0) goto L_0x016f
            com.facebookpay.offsite.base.CheckoutHandler r0 = X.C11364SPc.A02(r10)
            X.Til r0 = r0.A0A()
            X.RRI r0 = r0.AZu()
            r0.A02()
        L_0x0146:
            return
        L_0x0147:
            r0 = 0
            goto L_0x0090
        L_0x014a:
            java.lang.String r0 = "browserLiteWebView"
            goto L_0x014f
        L_0x014d:
            java.lang.String r0 = "jSInjector"
        L_0x014f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0157:
            com.facebookpay.offsite.base.CheckoutHandler r0 = X.C11364SPc.A02(r10)
            X.Til r0 = r0.A03
            if (r0 == 0) goto L_0x016f
            com.facebookpay.offsite.base.CheckoutHandler r0 = X.C11364SPc.A02(r10)
            X.Til r0 = r0.A0A()
            X.RRI r0 = r0.AZu()
            r0.A01()
            return
        L_0x016f:
            X.0KC.A0C(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL1.A00(X.QL1):void");
    }

    public static final void A01(QL1 ql1, Throwable th) {
        Intent intent;
        String str;
        String str2;
        String A002 = 2Og.A00(th);
        0KC.A0G("BaseOffsiteFbPaySDKController", A002, th);
        C340027ka r0 = ql1.A03;
        if (r0 != null && (intent = r0.getIntent()) != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_LOGGING_ENABLED", true)) {
            List list = A0C;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (00l.A0d(A002, AnonymousClass7TE.A18(it), true)) {
                        LinkedHashMap A1H = AnonymousClass7TE.A1H();
                        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
                        Locale locale = Locale.ROOT;
                        0qQ.A08(locale);
                        A1H2.put(DbT.A12(locale, "ERROR_MESSAGE"), A002);
                        A1H.put("EVENT_EXTRA", A1H2);
                        if (ql1.A08 == null || (str = C11364SPc.A02(ql1).A09) == null) {
                            str = C2818159r.A01();
                        }
                        if (ql1.A08 == null || C11364SPc.A02(ql1).A03 == null) {
                            str2 = "-1";
                        } else {
                            str2 = CheckoutHandler.A02(C11364SPc.A02(ql1));
                        }
                        A1H.put("logging_context", C11418SSt.A00(str, str2));
                        if (ql1.A08 != null) {
                            C11364SPc.A02(ql1).A0K(A1H);
                        }
                        C11418SSt.A03(C8902REu.CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL, A1H);
                        return;
                    }
                }
            }
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        AnonymousClass7TG.A1N(thread, th);
        A01(this, th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A06;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
