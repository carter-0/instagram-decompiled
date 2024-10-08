package com.instagram.urlhandlers.adslider;

import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class AdSliderUrlhandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = -1599862962(0xffffffffa0a4074e, float:-2.7787515E-19)
            int r3 = X.AnonymousClass0fD.A00(r0)
            r4 = r18
            r0 = r19
            super.onCreate(r0)
            X.0hq r1 = r4.getSupportFragmentManager()
            r0 = 3
            X.C50128FQl.A00(r1, r4, r0)
            android.content.Intent r0 = r4.getIntent()
            if (r0 == 0) goto L_0x0097
            android.os.Bundle r1 = X.DbT.A0A(r0)
            if (r1 == 0) goto L_0x0097
            X.0wW r5 = X.DbS.A0S(r4)
            boolean r0 = r5 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0034
            X.FFQ.A01(r4, r1, r5)
        L_0x002d:
            r0 = 1216218926(0x487e072e, float:260124.72)
        L_0x0030:
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x0034:
            java.lang.String r0 = X.DbS.A0m(r1)
            if (r0 != 0) goto L_0x0041
            r4.finish()
            r0 = -354986765(0xffffffffead754f3, float:-1.3016011E26)
            goto L_0x0030
        L_0x0041:
            r10 = 0
            android.net.Uri r0 = X.DbT.A09(r0)
            java.lang.String r9 = X.DbZ.A0h(r0)
            if (r9 != 0) goto L_0x004e
            java.lang.String r9 = "unknown"
        L_0x004e:
            java.lang.String r8 = "media_id"
            java.lang.String r7 = r0.getQueryParameter(r8)
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            r1 = 0
            java.util.BitSet r2 = X.DbS.A0w(r1)
            java.lang.String r0 = "entrypoint"
            r6.put(r0, r9)
            r6.put(r8, r7)
            int r0 = r2.nextClearBit(r1)
            if (r0 < r1) goto L_0x009e
            X.0sm r13 = X.0Yt.A0E()
            java.util.Map r12 = X.0Yt.A0B(r6)
            r15 = 0
            r2 = 1
            r14 = 719983200(0x2aea1260, float:4.15795E-13)
            r0 = 2825(0xb09, float:3.959E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.ShW r8 = new X.ShW
            r11 = r10
            r17 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)
            X.6Qj r1 = X.C48721Ej6.A00(r5, r1)
            X.WF5 r0 = new X.WF5
            r0.<init>(r10, r10, r10, r10)
            X.0qQ.A0B(r1, r2)
            r8.E0s(r4, r0, r1)
            goto L_0x002d
        L_0x0097:
            r4.finish()
            r0 = 1867198547(0x6f4b3053, float:6.2883877E28)
            goto L_0x0030
        L_0x009e:
            java.lang.IllegalStateException r0 = X.DbT.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.adslider.AdSliderUrlhandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
