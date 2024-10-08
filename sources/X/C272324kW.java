package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.4kW  reason: invalid class name and case insensitive filesystem */
public final class C272324kW {
    private final boolean A00(C245403cq r5, GKD gkd, UserSession userSession, boolean z) {
        GKD gkd2;
        if (r5 == null) {
            return false;
        }
        int ordinal = r5.Bfg().ordinal();
        if (ordinal == 1) {
            gkd2 = GKD.NORMAL;
        } else if (ordinal == 2) {
            gkd2 = GKD.DEFAULT_ON;
        } else if (ordinal == 0 || ordinal == 3) {
            gkd2 = GKD.UNRECOGNIZED;
        } else {
            throw new RuntimeException();
        }
        if (gkd2 != gkd) {
            return false;
        }
        int ordinal2 = r5.AYX().ordinal();
        if (ordinal2 == 3) {
            return !z || !182.A06(0Tu.A05, userSession, 36328860614213258L);
        }
        if (ordinal2 == 2) {
            return 182.A06(0Tu.A05, userSession, 36318453908379778L);
        }
        if (ordinal2 == 1) {
            return A03(userSession, AnonymousClass05K.A0C, true);
        }
        if (ordinal2 == 0) {
            return false;
        }
        throw new RuntimeException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        return A03(r2, X.AnonymousClass05K.A0C, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return X.182.A06(r4, r2, 36318453908379778L);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.GKD r18, com.instagram.common.session.UserSession r19, X.1Xj r20, java.lang.Integer r21) {
        /*
            r17 = this;
            r5 = 1
            r7 = 3
            r3 = r18
            X.0qQ.A0B(r3, r7)
            r6 = 0
            r4 = r20
            if (r20 == 0) goto L_0x00ce
            r2 = r19
            com.instagram.user.model.User r8 = r4.A2A(r2)
            X.1s2 r12 = r4.A1M()
            X.AnonymousClass2BF.A00()
            r0 = 38
            X.MMK r1 = new X.MMK
            r1.<init>(r2, r0)
            java.lang.Class<X.2BJ> r0 = X.2BJ.class
            java.lang.Object r11 = r2.A01(r0, r1)
            X.2BJ r11 = (X.2BJ) r11
            r9 = 0
            if (r8 == 0) goto L_0x007b
            java.lang.String r14 = r8.getId()
        L_0x002f:
            java.lang.String r15 = r4.A30()
            if (r15 == 0) goto L_0x00c6
            X.0Tu r4 = X.0Tu.A05
            r0 = 36316508288455076(0x8105ac000411a4, double:3.030044304235687E-306)
            boolean r16 = X.182.A06(r4, r2, r0)
            X.JUF r10 = new X.JUF
            r13 = r21
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.2BJ.A00(r11, r10)
            if (r12 == 0) goto L_0x0050
            X.3cs r9 = r12.B21()
        L_0x0050:
            if (r8 == 0) goto L_0x00ce
            if (r9 == 0) goto L_0x00ce
            int r0 = r13.intValue()
            r8 = r17
            switch(r0) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00ae;
                case 2: goto L_0x00ba;
                case 3: goto L_0x007f;
                default: goto L_0x005d;
            }
        L_0x005d:
            X.3cm r1 = r9.ApB()
            r0 = 0
            if (r1 == 0) goto L_0x00ad
            com.instagram.api.schemas.OnboardingEntryActionType r1 = r1.AYX()
            int r3 = r1.ordinal()
            if (r3 == r7) goto L_0x007d
            r1 = 2
            if (r3 == r1) goto L_0x00a4
            if (r3 == r5) goto L_0x009d
            if (r3 == r6) goto L_0x00ad
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x007b:
            r14 = r9
            goto L_0x002f
        L_0x007d:
            r0 = 1
            return r0
        L_0x007f:
            X.5AT r1 = r9.BZd()
            r0 = 0
            if (r1 == 0) goto L_0x00ad
            com.instagram.api.schemas.OnboardingEntryActionType r1 = r1.AYX()
            int r3 = r1.ordinal()
            if (r3 == r7) goto L_0x00ad
            r1 = 2
            if (r3 == r1) goto L_0x00a4
            if (r3 == r5) goto L_0x009d
            if (r3 == r6) goto L_0x00ad
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x009d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r0 = r8.A03(r2, r0, r5)
            return r0
        L_0x00a4:
            r0 = 36318453908379778(0x81077100001882, double:3.031274722110451E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
        L_0x00ad:
            return r0
        L_0x00ae:
            X.3cq r0 = r9.BcP()
            r9.CB3()
            boolean r6 = r8.A00(r0, r3, r2, r5)
            return r6
        L_0x00ba:
            X.3cq r0 = r9.BcP()
            r9.CB3()
            boolean r6 = r8.A00(r0, r3, r2, r6)
            return r6
        L_0x00c6:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00ce:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C272324kW.A01(X.GKD, com.instagram.common.session.UserSession, X.1Xj, java.lang.Integer):boolean");
    }

    public final boolean A02(UserSession userSession) {
        if (!182.A06(0Tu.A05, userSession, 36316508288455076L)) {
            return false;
        }
        if (AnonymousClass2o3.A00(userSession).A05(UserMonetizationProductType.CONTENT_APPRECIATION) || A03(userSession, AnonymousClass05K.A0C, false)) {
            return true;
        }
        return false;
    }

    public final boolean A03(UserSession userSession, Integer num, boolean z) {
        0Tu r2;
        long j;
        0Tu r22;
        int intValue = num.intValue();
        if (intValue == 1) {
            if (z) {
                r22 = 0Tu.A05;
            } else {
                r22 = 0Tu.A06;
            }
            j = 36316508288455076L;
        } else if (intValue != 2) {
            return 182.A06(0Tu.A05, userSession, 36316508288455076L);
        } else {
            if (z) {
                r2 = 0Tu.A05;
            } else {
                r2 = 0Tu.A06;
            }
            j = 36316508289241511L;
        }
        boolean A06 = 182.A06(r2, userSession, j);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }
}
