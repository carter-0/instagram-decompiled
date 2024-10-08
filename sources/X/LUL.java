package X;

import android.content.DialogInterface;

public final class LUL implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public LUL(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        r1.A00(new X.C64652Lfe(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c0, code lost:
        r1.A00 = java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c6, code lost:
        r3.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x00a0;
                case 2: goto L_0x0097;
                case 3: goto L_0x007c;
                case 4: goto L_0x0068;
                case 5: goto L_0x0053;
                case 6: goto L_0x003f;
                case 7: goto L_0x0030;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r4.A01
            X.Kag r3 = (X.C62130Kag) r3
            X.OQg r0 = r3.A00
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "analyticsLogger"
        L_0x000f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0017:
            java.lang.String r2 = "SETTINGS"
            r0 = 2
            X.C70888OQg.A00(r0, r2)
            boolean r2 = r4.A02
            X.630 r1 = r3.A01
            if (r1 != 0) goto L_0x0027
            java.lang.String r0 = "manager"
            goto L_0x000f
        L_0x0027:
            X.Lr3 r0 = new X.Lr3
            r0.<init>(r3, r2)
            r1.A00(r0, r2)
            return
        L_0x0030:
            java.lang.Object r0 = r4.A01
            X.LpZ r0 = (X.C65229LpZ) r0
            com.instagram.common.session.UserSession r0 = r0.A0J
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            boolean r0 = r4.A02
            r2 = r0 ^ 1
            goto L_0x005f
        L_0x003f:
            java.lang.Object r0 = r4.A01
            X.LpZ r0 = (X.C65229LpZ) r0
            com.instagram.common.session.UserSession r1 = r0.A0J
            X.7wr r0 = X.C347457wq.A00(r1)
            boolean r2 = r4.A02
            r0.A01(r2)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r1)
            goto L_0x005f
        L_0x0053:
            java.lang.Object r0 = r4.A01
            X.LpZ r0 = (X.C65229LpZ) r0
            com.instagram.common.session.UserSession r0 = r0.A0J
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            boolean r2 = r4.A02
        L_0x005f:
            X.Lfe r0 = new X.Lfe
            r0.<init>(r2)
            r1.A00(r0)
            return
        L_0x0068:
            java.lang.Object r1 = r4.A01
            X.Lp6 r1 = (X.C65201Lp6) r1
            X.KOV r0 = r1.A05
            boolean r3 = r4.A02
            r0.A0A(r3)
            X.0iw r2 = r1.A03
            com.instagram.common.session.UserSession r1 = r1.A04
            r0 = 0
            X.C52086GEg.A0g(r2, r1, r0, r3)
            return
        L_0x007c:
            java.lang.Object r1 = r4.A01
            X.Lp6 r1 = (X.C65201Lp6) r1
            X.KOV r0 = r1.A05
            boolean r3 = r4.A02
            r0.A0A(r3)
            X.4DH r0 = r1.A02
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = r1.A04
            java.lang.String r0 = r0.getModuleName()
            X.LTW.A04(r2, r1, r0, r3)
            return
        L_0x0097:
            java.lang.Object r3 = r4.A01
            X.LFW r3 = (X.LFW) r3
            boolean r0 = r4.A02
            r2 = r0 ^ 1
            goto L_0x00c6
        L_0x00a0:
            java.lang.Object r3 = r4.A01
            X.LFW r3 = (X.LFW) r3
            com.instagram.common.session.UserSession r0 = r3.A03
            X.7wr r0 = X.C347457wq.A00(r0)
            boolean r2 = r4.A02
            r0.A01(r2)
            X.LE1 r1 = r3.A05
            r0 = 1
            r1.A05 = r0
            goto L_0x00c0
        L_0x00b5:
            java.lang.Object r3 = r4.A01
            X.LFW r3 = (X.LFW) r3
            X.LE1 r1 = r3.A05
            r0 = 1
            r1.A05 = r0
            boolean r2 = r4.A02
        L_0x00c0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A00 = r0
        L_0x00c6:
            r3.A01(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LUL.onClick(android.content.DialogInterface, int):void");
    }
}
