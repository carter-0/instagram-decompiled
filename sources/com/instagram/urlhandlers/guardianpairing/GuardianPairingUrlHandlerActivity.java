package com.instagram.urlhandlers.guardianpairing;

import X.08y;
import X.09i;
import X.AnonymousClass06Q;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C50128FQl;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class GuardianPairingUrlHandlerActivity extends BaseFragmentActivity {
    public final AnonymousClass06Q A00 = new C50128FQl(this, 15);

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.app.Activity, com.instagram.urlhandlers.guardianpairing.GuardianPairingUrlHandlerActivity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = 1261131020(0x4b2b550c, float:1.1228428E7)
            int r4 = X.AnonymousClass0fD.A00(r0)
            r5 = r20
            r0 = r21
            super.onCreate(r0)
            android.os.Bundle r6 = X.DbX.A0A(r5)
            if (r6 != 0) goto L_0x001e
            r5.finish()
            r0 = -992028840(0xffffffffc4ded758, float:-1782.7295)
        L_0x001a:
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x001e:
            java.lang.String r2 = X.DbS.A0m(r6)
            if (r2 != 0) goto L_0x002b
            r5.finish()
            r0 = 1464126140(0x5744cabc, float:2.16375017E14)
            goto L_0x001a
        L_0x002b:
            X.0hq r1 = r5.getSupportFragmentManager()
            X.06Q r0 = r5.A00
            r1.A0s(r0)
            X.0wW r3 = r5.getSession()
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0043
            X.FFQ.A01(r5, r6, r3)
        L_0x003f:
            r0 = -246218643(0xfffffffff153006d, float:-1.0448296E30)
            goto L_0x001a
        L_0x0043:
            r15 = 0
            android.net.Uri r1 = X.DbT.A09(r2)
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = X.DbZ.A0h(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x005b }
            java.lang.Integer r2 = X.F63.A00(r0)     // Catch:{ IllegalArgumentException -> 0x005b }
            goto L_0x005d
        L_0x005b:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x005d:
            r14 = 0
            r0 = 2
            X.0qQ.A0B(r2, r0)
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.String r6 = r3.A06
            java.lang.String r1 = "user_id"
            X.1vR r9 = X.DbU.A0J(r8, r1, r6)
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.BnT> r13 = X.BnT.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "GetIsSupervisionEnabledQuery"
            java.lang.String r18 = "xdt_users__info"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1vn r6 = X.1vm.A01(r3)
            X.DFU r1 = new X.DFU
            r1.<init>(r0, r5, r2, r3)
            r0 = 8
            X.FS6.A00(r1, r8, r6, r3, r0)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.guardianpairing.GuardianPairingUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
