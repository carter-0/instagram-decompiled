package com.instagram.urlhandlers.payoutsupport;

import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class PayoutSupportUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "payment_support_url_handler_activity";
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.urlhandlers.payoutsupport.PayoutSupportUrlHandlerActivity, android.app.Activity] */
    public final void onBackPressed() {
        finish();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = -1604272144(0xffffffffa060bff0, float:-1.9037045E-19)
            int r17 = X.AnonymousClass0fD.A00(r0)
            r8 = r18
            r0 = r19
            super.onCreate(r0)
            android.os.Bundle r2 = X.DbX.A0A(r8)
            if (r2 == 0) goto L_0x00ce
            X.08y r1 = X.09i.A0A
            X.0wW r0 = r1.A05(r8)
            if (r0 == 0) goto L_0x00ce
            X.0wW r0 = r1.A05(r8)
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0033
            X.FFQ.A02(r8, r2, r1)
            r8.finish()
            r1 = -831819146(0xffffffffce6b7276, float:-9.8753677E8)
        L_0x002d:
            r0 = r17
            X.AnonymousClass0fD.A07(r1, r0)
            return
        L_0x0033:
            java.lang.String r0 = X.DbS.A0m(r2)
            if (r0 == 0) goto L_0x00c6
            X.0wW r16 = r1.A05(r8)
            r7 = 0
            android.net.Uri r14 = X.DbT.A09(r0)
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            r10 = 1
            java.util.BitSet r12 = X.DbS.A0w(r10)
            java.lang.String r15 = "ref"
            java.lang.String r13 = r14.getQueryParameter(r15)
            java.lang.String r5 = "financial_entity_id"
            java.lang.String r4 = r14.getQueryParameter(r5)
            java.lang.String r3 = "payout_batch_id"
            java.lang.String r2 = r14.getQueryParameter(r3)
            java.lang.String r1 = "transaction_id"
            java.lang.String r0 = r14.getQueryParameter(r1)
            if (r13 == 0) goto L_0x0070
            r11.put(r15, r13)
        L_0x0070:
            if (r4 == 0) goto L_0x0075
            r11.put(r5, r4)
        L_0x0075:
            if (r2 == 0) goto L_0x007a
            r11.put(r3, r2)
        L_0x007a:
            if (r0 == 0) goto L_0x007f
            r11.put(r1, r0)
        L_0x007f:
            java.lang.String r1 = "logging_session_id"
            java.lang.String r0 = r14.getQueryParameter(r1)
            boolean r5 = X.Dba.A1Z(r1, r0, r11, r12)
            com.instagram.bloks.hosting.IgBloksScreenConfig r4 = X.DbS.A0N(r16)
            r4.A0U = r7
            r0 = r16
            X.6Yo r3 = X.DbS.A0M(r8, r0)
            int r0 = r12.nextClearBit(r5)
            if (r0 < r10) goto L_0x00d6
            java.util.HashMap r2 = X.C359608dC.A01(r11)
            java.lang.String r0 = "com.bloks.www.fbpay.care.receipt_help"
            X.DiU r1 = new X.DiU
            r1.<init>(r2, r9, r0)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r7
            r1.A02 = r7
            r1.A04 = r7
            r1.A0H(r6)
            X.3M3 r0 = r1.A0C(r8, r4)
            r3.A0B(r7, r0)
            r3.A0D = r5
            r3.A04()
            r1 = -542570362(0xffffffffdfa90886, float:-2.4360265E19)
            goto L_0x002d
        L_0x00c6:
            r8.finish()
            r1 = -221081408(0xfffffffff2d290c0, float:-8.341356E30)
            goto L_0x002d
        L_0x00ce:
            r8.finish()
            r1 = -1166148510(0xffffffffba7dfc62, float:-9.688792E-4)
            goto L_0x002d
        L_0x00d6:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.payoutsupport.PayoutSupportUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
