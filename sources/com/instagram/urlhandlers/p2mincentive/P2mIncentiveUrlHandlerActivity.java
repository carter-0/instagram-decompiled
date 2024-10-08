package com.instagram.urlhandlers.p2mincentive;

import X.08y;
import X.09i;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class P2mIncentiveUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.p2mincentive.P2mIncentiveUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = 317844858(0x12f1ed7a, float:1.5267781E-27)
            int r17 = X.AnonymousClass0fD.A00(r0)
            r10 = r18
            r0 = r19
            super.onCreate(r0)
            if (r19 == 0) goto L_0x0019
            r1 = -1759732490(0xffffffff971c9cf6, float:-5.060443E-25)
        L_0x0013:
            r0 = r17
            X.AnonymousClass0fD.A07(r1, r0)
            return
        L_0x0019:
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x00df
            android.os.Bundle r1 = X.DbT.A0A(r0)
            if (r1 == 0) goto L_0x00df
            boolean r0 = X.DbT.A1Z(r10)
            if (r0 != 0) goto L_0x0032
            X.FFQ.A03(r1, r10)
        L_0x002e:
            r1 = -273635136(0xffffffffefb0a8c0, float:-1.0934674E29)
            goto L_0x0013
        L_0x0032:
            java.lang.String r1 = X.DbS.A0m(r1)
            if (r1 == 0) goto L_0x00da
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00da
            r9 = 0
            android.net.Uri r1 = X.0cp.A03(r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00d5 }
            java.lang.String r15 = "offer_id"
            java.lang.String r2 = r1.getQueryParameter(r15)
            java.lang.String r14 = X.Dbe.A00()
            java.lang.String r0 = r1.getQueryParameter(r14)
            java.lang.String r13 = "is_buyer"
            java.lang.String r3 = r1.getQueryParameter(r13)
            java.lang.String r12 = "entry_point"
            java.lang.String r11 = r1.getQueryParameter(r12)
            if (r2 == 0) goto L_0x00da
            int r1 = r2.length()
            if (r1 == 0) goto L_0x00da
            if (r3 == 0) goto L_0x00da
            int r1 = r3.length()
            if (r1 == 0) goto L_0x00da
            java.lang.String r1 = "1"
            boolean r16 = r3.equals(r1)
            X.0wW r1 = r10.getSession()
            com.instagram.bloks.hosting.IgBloksScreenConfig r8 = X.DbS.A0N(r1)
            java.lang.String r7 = "com.bloks.www.bloks.p2m.incentive.landing.page.screen"
            r8.A0R = r7
            r8.A0R = r7
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            r3 = 2
            java.util.BitSet r1 = X.DbS.A0w(r3)
            boolean r2 = X.Dba.A1Z(r15, r2, r6, r1)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = X.AnonymousClass7TG.A0j()
        L_0x009c:
            r6.put(r14, r0)
            r0 = 1
            r1.set(r0)
            r0 = r16
            X.DbU.A1Y(r13, r6, r0)
            if (r11 != 0) goto L_0x00ac
            java.lang.String r11 = "unknown"
        L_0x00ac:
            r6.put(r12, r11)
            int r0 = r1.nextClearBit(r2)
            if (r0 < r3) goto L_0x00e7
            X.DiU r0 = X.C46649DiU.A05(r7, r6, r5)
            r0.A03 = r9
            r0.A02 = r9
            r0.A04 = r9
            r0.A0H(r4)
            X.3M3 r1 = r0.A0C(r10, r8)
            X.0wW r0 = r10.getSession()
            X.6Yo r0 = X.DbU.A0P(r9, r1, r10, r0)
            r0.A0D = r2
            r0.A04()
            goto L_0x002e
        L_0x00d5:
            r10.finish()
            goto L_0x002e
        L_0x00da:
            r10.finish()
            goto L_0x002e
        L_0x00df:
            r10.finish()
            r1 = 475155013(0x1c524a45, float:6.9579163E-22)
            goto L_0x0013
        L_0x00e7:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.p2mincentive.P2mIncentiveUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
