package com.instagram.urlhandlers.messaginghub;

import X.08y;
import X.09i;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class MessagingHubUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.messaginghub.MessagingHubUrlHandlerActivity, android.app.Activity] */
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
    public final void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r0 = -1492247491(0xffffffffa70e1c3d, float:-1.9721767E-15)
            int r3 = X.AnonymousClass0fD.A00(r0)
            r5 = r23
            r0 = r24
            super.onCreate(r0)
            android.os.Bundle r1 = X.DbX.A0A(r5)
            if (r1 == 0) goto L_0x00f4
            X.0wW r0 = r5.getSession()
            if (r0 == 0) goto L_0x00f4
            boolean r0 = X.DbT.A1Z(r5)
            if (r0 != 0) goto L_0x002a
            X.FFQ.A03(r1, r5)
        L_0x0023:
            r0 = 1558290320(0x5ce19f90, float:5.08058485E17)
        L_0x0026:
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x002a:
            java.lang.String r0 = X.DbS.A0m(r1)
            if (r0 != 0) goto L_0x0037
            r5.finish()
            r0 = -1797563289(0xffffffff94db5c67, float:-2.2149795E-26)
            goto L_0x0026
        L_0x0037:
            r14 = 0
            android.net.Uri r0 = X.DbT.A09(r0)
            java.lang.String r13 = "entry_point"
            java.lang.String r12 = r0.getQueryParameter(r13)
            if (r12 != 0) goto L_0x0046
            java.lang.String r12 = "unknown"
        L_0x0046:
            java.lang.String r11 = "messaging_guidance_hub_type"
            java.lang.String r10 = r0.getQueryParameter(r11)
            if (r10 != 0) goto L_0x0050
            java.lang.String r10 = "CTD"
        L_0x0050:
            java.lang.String r9 = "media_id"
            java.lang.String r8 = r0.getQueryParameter(r9)
            if (r8 != 0) goto L_0x005a
            java.lang.String r8 = ""
        L_0x005a:
            X.0wW r7 = r5.getSession()
            java.util.HashMap r6 = X.Dba.A0f(r13, r12)
            r6.put(r11, r10)
            r6.put(r9, r8)
            r2 = 0
            X.0Tu r4 = X.DbS.A0J(r7, r2)
            r0 = 36327138332260540(0x810f57000038bc, double:3.0367667867420133E-306)
            boolean r0 = X.182.A06(r4, r7, r0)
            if (r0 == 0) goto L_0x00d2
            X.6Qj r4 = X.C48721Ej6.A00(r7, r2)
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            r7 = 2
            java.util.BitSet r0 = X.DbS.A0w(r7)
            r6.put(r13, r12)
            r0.set(r2)
            r6.put(r11, r10)
            r1 = 1
            r0.set(r1)
            r6.put(r9, r8)
            int r0 = r0.nextClearBit(r2)
            if (r0 < r7) goto L_0x00fc
            X.0sm r17 = X.0Yt.A0E()
            java.util.Map r16 = X.0Yt.A0B(r6)
            r19 = 0
            r18 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r13 = "com.bloks.www.screen_query.BloksIGBoostMessagingHubScreenQuery"
            X.ShW r12 = new X.ShW
            r15 = r14
            r21 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21)
            java.lang.String r18 = ""
            X.Vbz r13 = new X.Vbz
            r16 = r14
            r17 = r14
            r19 = r14
            r20 = r14
            r21 = r2
            r22 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.WF5 r0 = new X.WF5
            r0.<init>(r13, r14, r14, r14)
            X.0qQ.A0B(r4, r1)
            r12.E0s(r5, r0, r4)
            goto L_0x0023
        L_0x00d2:
            X.6Yo r4 = X.DbS.A0M(r5, r7)
            r0 = 558(0x22e, float:7.82E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DiU r1 = X.C46649DiU.A04(r0, r6)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.DbS.A0N(r7)
            r0.A0k = r2
            X.3M3 r0 = X.C49891FBs.A02(r0, r1)
            r4.A0B(r14, r0)
            r4.A0D = r2
            r4.A04()
            goto L_0x0023
        L_0x00f4:
            r5.finish()
            r0 = -196514653(0xfffffffff4496ca3, float:-6.383393E31)
            goto L_0x0026
        L_0x00fc:
            java.lang.IllegalStateException r0 = X.DbT.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.messaginghub.MessagingHubUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
