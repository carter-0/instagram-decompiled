package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PIp  reason: case insensitive filesystem */
public final class C72753PIp implements AnonymousClass5IX {
    public final UserSession A00;
    public final 2cX A01;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        r7 = X.2L2.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r1 != false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E1z(X.AnonymousClass5IY r12) {
        /*
            r11 = this;
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r5 = r11.A00
            com.instagram.user.model.User r3 = r0.A01(r5)
            boolean r0 = X.2Ek.A02(r3)
            r10 = 1
            r4 = 0
            if (r0 == 0) goto L_0x001d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322997983783653(0x810b9300002ae5, double:3.034148413693385E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0030
        L_0x001d:
            boolean r0 = X.2Ek.A03(r3)
            if (r0 == 0) goto L_0x0087
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322997983914726(0x810b9300022ae6, double:3.034148413776276E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0087
        L_0x0030:
            X.2cX r1 = r11.A01
            if (r1 == 0) goto L_0x0087
            java.lang.String r0 = "target_thread_id"
            java.lang.String r3 = r1.A00(r0)
            if (r3 == 0) goto L_0x0087
            X.2Dm r7 = X.2L2.A00(r5)
            X.3U9 r6 = X.C66580MXl.A0d(r7, r3)
            if (r6 == 0) goto L_0x0087
            boolean r0 = r6.CUG()
            if (r0 == 0) goto L_0x0087
            boolean r0 = r6.CZA()
            if (r0 != 0) goto L_0x0087
            r8 = 3
            int r2 = r6.B6d()
            X.3S9 r0 = r6.A01
            X.3Te r0 = r0.A0s
            if (r0 == 0) goto L_0x0063
            boolean r1 = r0.A0L
            r0 = 1
            if (r1 == 0) goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            int r0 = r7.BcZ(r2, r0)
            long r1 = (long) r0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            com.instagram.model.direct.DirectThreadKey r0 = r6.BJz()
            java.util.ArrayList r2 = r7.Aax(r0, r4)
            int r1 = r2.size()
            r0 = 20
            if (r1 < r0) goto L_0x0087
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0088
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0088
        L_0x0087:
            return r4
        L_0x0088:
            java.util.Iterator r1 = r2.iterator()
        L_0x008c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0087
            X.3su r0 = X.C66580MXl.A0a(r1)
            boolean r0 = r0.A2N
            if (r0 == 0) goto L_0x008c
            X.0xa r2 = X.AnonymousClass7TE.A0q(r5)
            java.lang.String r1 = "direct_pin_upsell_thread_ids"
            java.util.Set r0 = r2.C1t(r1)
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0087
            java.util.Set r0 = r2.C1t(r1)
            java.util.Set r0 = X.00k.A0j(r0)
            r0.add(r3)
            X.JTU.A1E(r2, r1, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72753PIp.E1z(X.5IY):boolean");
    }

    public C72753PIp(UserSession userSession, 2cX r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
