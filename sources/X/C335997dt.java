package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7dt  reason: invalid class name and case insensitive filesystem */
public final class C335997dt {
    public static final C335997dt A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:93:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C49723F3m A00(com.instagram.common.session.UserSession r6, X.1Xj r7, java.lang.Integer r8, java.lang.Integer r9) {
        /*
            r3 = 0
            if (r7 == 0) goto L_0x0017
            boolean r0 = r7.A5G()
            if (r0 == 0) goto L_0x0011
            X.1Xy r0 = r7.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 != 0) goto L_0x0018
        L_0x0011:
            boolean r0 = r7.A5T()
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            return r3
        L_0x0018:
            boolean r0 = X.C338007hG.A02(r7)
            if (r0 == 0) goto L_0x0042
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r9 != r0) goto L_0x0017
            if (r8 != r0) goto L_0x0017
            boolean r0 = X.C46342Dck.A01(r6, r7)
            if (r0 != 0) goto L_0x0017
            boolean r0 = X.C338007hG.A01(r7)
            if (r0 == 0) goto L_0x0036
            X.ER6 r3 = new X.ER6
            r3.<init>(r7)
            return r3
        L_0x0036:
            boolean r0 = X.C338007hG.A00(r6, r7)
            if (r0 == 0) goto L_0x0017
            X.ER5 r3 = new X.ER5
            r3.<init>(r7)
            return r3
        L_0x0042:
            X.1Xy r0 = r7.A0C
            java.util.List r1 = r0.At1()
            r4 = 1
            if (r1 == 0) goto L_0x014d
            java.lang.String r0 = "FB"
            boolean r0 = r1.contains(r0)
            if (r0 != r4) goto L_0x014d
            X.1Xy r0 = r7.A0C
            X.DTf r0 = r0.At2()
            if (r0 == 0) goto L_0x00ad
            java.lang.Boolean r1 = r0.CBS()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
        L_0x0067:
            if (r0 == 0) goto L_0x0017
            boolean r0 = r7.A5G()
            if (r0 == 0) goto L_0x00d6
            X.1Xy r0 = r7.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x00d6
            int r0 = r9.intValue()
            r5 = 0
            if (r0 == r5) goto L_0x00af
            X.1Xy r0 = r7.A0C
            java.lang.Integer r0 = r0.B47()
            if (r0 == 0) goto L_0x0017
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0017
            int r0 = r8.intValue()
            if (r0 == r5) goto L_0x0103
            boolean r0 = X.C338007hG.A00(r6, r7)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0017
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320854795756443(0x8109a0000a239b, double:3.032793052955052E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0017
            X.ER7 r3 = new X.ER7
            r3.<init>(r6, r7, r5)
            return r3
        L_0x00ad:
            r0 = 0
            goto L_0x0067
        L_0x00af:
            boolean r0 = X.C338007hG.A01(r7)
            if (r0 == 0) goto L_0x0017
            int r0 = r8.intValue()
            if (r0 == r5) goto L_0x0134
            boolean r0 = X.C338007hG.A00(r6, r7)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0017
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320854795821980(0x8109a0000b239c, double:3.0327930529964976E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0017
            X.ER8 r3 = new X.ER8
            r3.<init>(r6, r7, r5, r4)
            return r3
        L_0x00d6:
            boolean r0 = r7.A5T()
            if (r0 == 0) goto L_0x0017
            int r0 = r9.intValue()
            r5 = 0
            if (r0 == r5) goto L_0x011c
            X.1Xy r0 = r7.A0C
            java.lang.Integer r0 = r0.B47()
            if (r0 == 0) goto L_0x0017
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0017
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r8 != r0) goto L_0x0017
            boolean r0 = X.C338007hG.A00(r6, r7)
            if (r0 == 0) goto L_0x0017
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328126174739404(0x81103d00003bcc, double:3.037391502303369E-306)
            goto L_0x0110
        L_0x0103:
            boolean r0 = X.C338007hG.A00(r6, r7)
            if (r0 == 0) goto L_0x0017
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320854795101076(0x8109a000002394, double:3.032793052540595E-306)
        L_0x0110:
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0017
            X.ER7 r3 = new X.ER7
            r3.<init>(r6, r7, r4)
            return r3
        L_0x011c:
            boolean r0 = X.C338007hG.A01(r7)
            if (r0 == 0) goto L_0x0017
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r8 != r0) goto L_0x0017
            boolean r0 = X.C338007hG.A00(r6, r7)
            if (r0 == 0) goto L_0x0017
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328126174870478(0x81103d00023bce, double:3.037391502386261E-306)
            goto L_0x0141
        L_0x0134:
            boolean r0 = X.C338007hG.A00(r6, r7)
            if (r0 == 0) goto L_0x0017
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320854795166613(0x8109a000012395, double:3.032793052582041E-306)
        L_0x0141:
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0017
            X.ER8 r3 = new X.ER8
            r3.<init>(r6, r7, r4, r5)
            return r3
        L_0x014d:
            boolean r0 = X.C338007hG.A00(r6, r7)
            if (r0 == 0) goto L_0x0017
            boolean r0 = A01(r6)
            if (r0 == 0) goto L_0x0017
            X.ER4 r3 = new X.ER4
            r3.<init>(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335997dt.A00(com.instagram.common.session.UserSession, X.1Xj, java.lang.Integer, java.lang.Integer):X.F3m");
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!C347167wN.A00.A00(userSession, true) || 182.A06(0Tu.A05, userSession, 36320300744319194L) || 0eE.A00(userSession).A00().A0N() != AnonymousClass05K.A01 || 2D5.A00(userSession).A0C() || C367288qV.A01.A0D((BBV) null, userSession, false) || !2D5.A00(userSession).A04.getBoolean(AnonymousClass000.A00(995), false)) {
            return false;
        }
        return true;
    }
}
