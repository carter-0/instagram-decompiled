package com.instagram.urlhandlers.payments;

import X.AnonymousClass0wW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class PaymentsUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.payments.PaymentsUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0086, code lost:
        if (r1.getBoolean("com.instagram.url.extra.IS_ON_CREATE") == false) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1923392144(0x72a4a290, float:6.5218647E30)
            int r5 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r10)
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r8 = "com.instagram.url.extra.BUNDLE"
            android.os.Bundle r2 = r0.getBundleExtra(r8)
            if (r2 == 0) goto L_0x00d5
            java.lang.String r1 = "original_url"
            java.lang.String r0 = r2.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d5
            X.0wW r0 = X.DbT.A0W(r2)
            r9.A00 = r0
            java.lang.String r0 = X.DbU.A0l(r2, r1)
            android.net.Uri r0 = X.0cp.A03(r0)
            android.os.Bundle r6 = X.DbU.A06(r9)
            r6.getClass()
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()
            java.lang.String r4 = r0.getHost()
            r4.getClass()
            java.lang.String r2 = "fbpay_hub"
            r3 = r2
            boolean r0 = r4.equals(r2)
            java.lang.String r1 = "PAYMENTS_URL_TYPE"
            if (r0 != 0) goto L_0x00d1
            java.lang.String r2 = "settings_payments"
            boolean r0 = r4.equals(r2)
            if (r0 != 0) goto L_0x00d1
            r7 = 0
        L_0x0056:
            r7.getClass()
            r6.putAll(r7)
            X.0wW r0 = r9.A00
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0075
            X.1WK r1 = X.FFQ.A00()
            X.0wW r0 = r9.A00
            r0.getClass()
            r1.A00(r9, r6, r0)
        L_0x006e:
            r0 = 366718100(0x15dbac94, float:8.8725676E-26)
        L_0x0071:
            X.AnonymousClass0fD.A07(r0, r5)
            return
        L_0x0075:
            java.lang.String r2 = r6.getString(r1)
            android.os.Bundle r1 = r6.getBundle(r8)
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = "com.instagram.url.extra.IS_ON_CREATE"
            boolean r0 = r1.getBoolean(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0089
        L_0x0088:
            r4 = 0
        L_0x0089:
            X.0wW r0 = r9.A00
            X.DbW.A0w(r6, r0)
            r2.getClass()
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = "settings_payments"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006e
            X.0wW r3 = r9.A00
            r2 = 0
            com.instagram.settings.common.PaymentOptionsFragment r1 = new com.instagram.settings.common.PaymentOptionsFragment
            r1.<init>()
            r1.setArguments(r6)
        L_0x00aa:
            X.6Yo r0 = X.DbS.A0M(r9, r3)
            X.0qQ.A0A(r1)
            r0.A0D(r1)
            if (r4 == 0) goto L_0x00b8
            r0.A0D = r2
        L_0x00b8:
            r0.A04()
            goto L_0x006e
        L_0x00bc:
            X.0wW r3 = r9.A00
            r2 = 0
            java.lang.String r1 = "referrer"
            java.lang.String r0 = r6.getString(r1)
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "deeplink"
            r6.putString(r1, r0)
        L_0x00cc:
            androidx.fragment.app.Fragment r1 = X.SAY.A00(r6)
            goto L_0x00aa
        L_0x00d1:
            r7.putString(r1, r2)
            goto L_0x0056
        L_0x00d5:
            r9.finish()
            r0 = 499709393(0x1dc8f5d1, float:5.3193727E-21)
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.payments.PaymentsUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
