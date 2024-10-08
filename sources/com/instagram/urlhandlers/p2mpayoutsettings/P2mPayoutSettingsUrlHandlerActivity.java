package com.instagram.urlhandlers.p2mpayoutsettings;

import X.08y;
import X.09i;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class P2mPayoutSettingsUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.p2mpayoutsettings.P2mPayoutSettingsUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = -1132824033(0xffffffffbc7a7a1f, float:-0.015287905)
            int r3 = X.AnonymousClass0fD.A00(r0)
            r15 = r20
            r0 = r21
            super.onCreate(r0)
            if (r21 == 0) goto L_0x0017
            r0 = -1331189073(0xffffffffb0a7aaaf, float:-1.219936E-9)
        L_0x0013:
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x0017:
            android.content.Intent r0 = r15.getIntent()
            if (r0 == 0) goto L_0x0146
            android.os.Bundle r7 = X.DbT.A0A(r0)
            if (r7 == 0) goto L_0x0146
            X.0wW r4 = r15.getSession()
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0032
            X.FFQ.A01(r15, r7, r4)
        L_0x002e:
            r0 = 1800696800(0x6b5473e0, float:2.5683948E26)
            goto L_0x0013
        L_0x0032:
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r8 = "original_url"
            java.lang.String r1 = r7.getString(r8)
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0141
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0141
            r2 = 0
            android.net.Uri r10 = X.0cp.A03(r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0136 }
            java.lang.String r0 = "user_id"
            java.lang.String r9 = r10.getQueryParameter(r0)
            java.lang.String r0 = X.Dbe.A00()
            java.lang.String r13 = r10.getQueryParameter(r0)
            java.lang.String r1 = "show_payouts"
            java.lang.String r14 = r10.getQueryParameter(r1)
            if (r9 == 0) goto L_0x0141
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = r4.A06
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00d2
            com.instagram.bloks.hosting.IgBloksScreenConfig r10 = X.DbS.A0N(r4)
            java.lang.String r11 = "com.bloks.www.payments.igp2m.payout_management"
            r10.A0R = r11
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()
            java.util.BitSet r12 = X.DbS.A0w(r6)
            if (r13 == 0) goto L_0x008d
            int r0 = r13.length()
            if (r0 != 0) goto L_0x0091
        L_0x008d:
            java.lang.String r13 = X.C2818159r.A01()
        L_0x0091:
            java.lang.String r0 = "logging_session_id"
            r9.put(r0, r13)
            r12.set(r5)
            if (r14 == 0) goto L_0x00cd
            int r0 = r14.length()
            if (r0 == 0) goto L_0x00cd
            java.lang.Boolean r0 = X.DbV.A0m(r14)
        L_0x00a5:
            r9.put(r1, r0)
            X.6Yo r1 = X.DbS.A0M(r15, r4)
            int r0 = r12.nextClearBit(r5)
            if (r0 < r6) goto L_0x014e
            X.DiU r0 = X.C46649DiU.A05(r11, r9, r8)
            r0.A03 = r2
            r0.A02 = r2
            r0.A04 = r2
            r0.A0H(r7)
            X.3M3 r0 = r0.A0C(r15, r10)
            r1.A0B(r2, r0)
            r1.A0D = r5
            r1.A04()
            goto L_0x002e
        L_0x00cd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            goto L_0x00a5
        L_0x00d2:
            X.0BQ r14 = X.AnonymousClass0BO.A00(r4)
            r0 = r14
            X.0tB r0 = (X.0tB) r0
            java.util.List r0 = r0.BNy(r2)
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0126
            com.instagram.user.model.User r5 = r14.BNw(r9)
            if (r5 == 0) goto L_0x002e
            boolean r0 = r14.AG1(r15, r4, r5)
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = r7.getString(r8)
            if (r1 == 0) goto L_0x002e
            int r0 = r1.length()
            if (r0 == 0) goto L_0x002e
            android.net.Uri r2 = X.DbT.A09(r1)     // Catch:{ SecurityException -> 0x002e }
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent     // Catch:{ SecurityException -> 0x002e }
            r1.<init>(r0, r2)     // Catch:{ SecurityException -> 0x002e }
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.Intent r1 = r1.setFlags(r0)     // Catch:{ SecurityException -> 0x002e }
            X.0qQ.A07(r1)     // Catch:{ SecurityException -> 0x002e }
            java.lang.String r0 = r15.getPackageName()     // Catch:{ SecurityException -> 0x002e }
            r1.setPackage(r0)     // Catch:{ SecurityException -> 0x002e }
            java.lang.String r19 = "deep_link"
            r17 = r4
            r18 = r5
            r16 = r1
            r14.E2S(r15, r16, r17, r18, r19)     // Catch:{ SecurityException -> 0x002e }
            r15.finish()     // Catch:{ SecurityException -> 0x002e }
            goto L_0x002e
        L_0x0126:
            boolean r0 = X.FFT.A02(r4)
            if (r0 == 0) goto L_0x013b
            java.lang.String r0 = "IS_ADD_ACCOUNT_FLOW"
            r7.putBoolean(r0, r6)
            X.FFQ.A01(r15, r7, r4)
            goto L_0x002e
        L_0x0136:
            r15.finish()
            goto L_0x002e
        L_0x013b:
            r0 = 2131965890(0x7f1337c2, float:1.9568603E38)
            X.C59689JTv.A01(r15, r2, r0, r5)
        L_0x0141:
            r15.finish()
            goto L_0x002e
        L_0x0146:
            r15.finish()
            r0 = -1735864818(0xffffffff9888ce0e, float:-3.536324E-24)
            goto L_0x0013
        L_0x014e:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.p2mpayoutsettings.P2mPayoutSettingsUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
