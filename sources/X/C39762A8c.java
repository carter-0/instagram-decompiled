package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.A8c  reason: case insensitive filesystem */
public final class C39762A8c {
    public final UserSession A00;

    public C39762A8c(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (X.182.A06(r2, r7, 36325742469199039L) != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (X.182.A06(r2, r7, 36325742469067965L) != false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(com.instagram.model.direct.DirectThreadKey r15, boolean r16) {
        /*
            r14 = this;
            r12 = 0
            X.0qQ.A0B(r15, r12)
            com.instagram.common.session.UserSession r7 = r14.A00
            X.2Dm r0 = X.2L2.A00(r7)
            X.2Dr r0 = (X.2Dr) r0
            X.3U9 r6 = X.2Dr.A03(r0, r15)
            r5 = 0
            if (r6 != 0) goto L_0x0021
            java.lang.String r1 = "ExtendedDirectThread shouldn't be null for the thread "
            java.lang.String r0 = r15.A00
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "DirectMediaOptimisticUploadGating"
            X.0KC.A0C(r0, r1)
            return r12
        L_0x0021:
            if (r16 == 0) goto L_0x00e6
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
        L_0x0025:
            com.instagram.model.direct.DirectThreadKey r8 = r6.BJz()
            boolean r11 = r6.CVE()
            boolean r0 = r6.Axj()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r13 = r12
            X.797 r0 = X.AnonymousClass796.A02(r7, r8, r9, r10, r11, r12, r13)
            boolean r4 = r0.A00()
            r3 = r16 ^ 1
            if (r16 == 0) goto L_0x0069
            r1 = 1
            com.instagram.user.model.User r0 = r6.BZK()
            if (r0 == 0) goto L_0x0069
            boolean r0 = r0.A1X()
            if (r0 != r1) goto L_0x0069
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325742468215985(0x810e12000534b1, double:3.0358840366995434E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0069
            r0 = 36325742469199039(0x810e12001434bf, double:3.035884037321231E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0069
        L_0x0067:
            r5 = 1
        L_0x0068:
            return r5
        L_0x0069:
            if (r4 != 0) goto L_0x008b
            if (r16 == 0) goto L_0x007b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330007370482075(0x8111f30001419b, double:3.0385811780660017E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x007b
            goto L_0x0067
        L_0x007b:
            if (r3 == 0) goto L_0x008b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330007370678686(0x8111f30004419e, double:3.038581178190339E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x008b
            goto L_0x0067
        L_0x008b:
            if (r16 == 0) goto L_0x00c4
            int r2 = r6.C6a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            com.instagram.user.model.User r0 = r6.BZK()
            if (r0 == 0) goto L_0x00a3
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.IGAIAgentType r0 = r0.AaX()
            if (r0 != 0) goto L_0x00c4
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
            boolean r0 = X.AnonymousClass48O.A04(r2)
            if (r0 != 0) goto L_0x00c4
        L_0x00ab:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325742468019374(0x810e12000234ae, double:3.035884036575206E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00c4
            r0 = 36325742469067965(0x810e12001234bd, double:3.035884037238339E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00c4
            goto L_0x0067
        L_0x00c4:
            if (r4 == 0) goto L_0x0068
            if (r16 == 0) goto L_0x00d6
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330007370547612(0x8111f30002419c, double:3.0385811781074475E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00d6
            goto L_0x0067
        L_0x00d6:
            if (r3 == 0) goto L_0x0068
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330007370744223(0x8111f30005419f, double:3.038581178231785E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0068
            goto L_0x0067
        L_0x00e6:
            java.lang.Integer r10 = X.AnonymousClass05K.A0Y
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39762A8c.A00(com.instagram.model.direct.DirectThreadKey, boolean):boolean");
    }
}
