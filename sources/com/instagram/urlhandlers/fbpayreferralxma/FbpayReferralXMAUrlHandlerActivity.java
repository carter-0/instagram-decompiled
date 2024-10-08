package com.instagram.urlhandlers.fbpayreferralxma;

import X.AnonymousClass0wW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class FbpayReferralXMAUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = 232033496(0xdd48cd8, float:1.3099416E-30)
            int r18 = X.AnonymousClass0fD.A00(r0)
            r10 = r19
            r0 = r20
            super.onCreate(r0)
            android.os.Bundle r1 = X.DbX.A0A(r10)
            if (r1 != 0) goto L_0x0020
            r10.finish()
            r1 = 249188393(0xeda5029, float:5.381834E-30)
        L_0x001a:
            r0 = r18
            X.AnonymousClass0fD.A07(r1, r0)
            return
        L_0x0020:
            X.0wW r0 = X.DbT.A0W(r1)
            r10.A00 = r0
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x003c
            X.1WK r2 = X.FFQ.A00()
            X.0wW r0 = r10.A00
            if (r0 == 0) goto L_0x00db
            r2.A00(r10, r1, r0)
        L_0x0035:
            r10.finish()
        L_0x0038:
            r1 = 1180726853(0x46607645, float:14365.567)
            goto L_0x001a
        L_0x003c:
            java.lang.String r2 = X.DbS.A0m(r1)
            if (r2 == 0) goto L_0x0035
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0035
            r9 = 0
            android.net.Uri r3 = X.DbT.A09(r2)
            java.util.List r2 = r3.getPathSegments()
            java.lang.String r0 = "fbpay_referral_details"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0035
            java.lang.String r14 = "entrypoint"
            java.lang.String r0 = r3.getQueryParameter(r14)
            if (r0 == 0) goto L_0x0064
            X.DbU.A1B(r3, r1, r14)
        L_0x0064:
            java.lang.String r15 = "referral_id"
            X.DbU.A1B(r3, r1, r15)
            java.lang.String r13 = "sender_id"
            X.DbU.A1B(r3, r1, r13)
            X.0wW r8 = r10.A00
            X.0qQ.A0A(r8)
            r7 = 0
            r12 = 1
            X.0qQ.A0B(r8, r12)
            r17 = 2
            com.instagram.bloks.hosting.IgBloksScreenConfig r11 = X.DbS.A0N(r8)
            java.lang.String r0 = "Invite"
            r11.A0U = r0
            java.lang.String r6 = "com.bloks.www.fbpay.referral.details"
            r11.A0R = r6
            java.lang.String r5 = r1.getString(r15)
            java.lang.String r0 = r1.getString(r13)
            java.lang.String r16 = r1.getString(r14)
            if (r5 == 0) goto L_0x0038
            if (r0 == 0) goto L_0x0038
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.util.BitSet r1 = X.DbS.A0w(r17)
            r4.put(r15, r5)
            r1.set(r7)
            r4.put(r13, r0)
            r1.set(r12)
            r0 = r16
            r4.put(r14, r0)
            int r1 = r1.nextClearBit(r7)
            r0 = r17
            if (r1 < r0) goto L_0x00e0
            X.DiU r0 = X.C46649DiU.A05(r6, r4, r3)
            r0.A03 = r9
            r0.A02 = r9
            r0.A04 = r9
            r0.A0H(r2)
            X.3M3 r0 = r0.A0C(r10, r11)
            X.6Yo r0 = X.DbU.A0P(r9, r0, r10, r8)
            r0.A0D = r7
            r0.A04()
            goto L_0x0038
        L_0x00db:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00e0:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.fbpayreferralxma.FbpayReferralXMAUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
