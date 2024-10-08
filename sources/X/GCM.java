package X;

import com.instagram.common.session.UserSession;

public final class GCM implements C250603lj {
    public boolean A00;
    public long A01 = System.currentTimeMillis();
    public C267324bN A02;
    public final UserSession A03;
    public final C52012GBj A04;

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        if (java.lang.Long.valueOf(r1) != null) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r9, X.C252093oY r10) {
        /*
            r8 = this;
            r7 = 0
            X.0qQ.A0B(r9, r7)
            r6 = 1
            X.0qQ.A0B(r10, r6)
            float r5 = r10.CFe(r9)
            X.0eM r0 = X.C52204GIv.A02
            java.lang.Object r3 = r0.getValue()
            X.GIv r3 = (X.C52204GIv) r3
            com.instagram.common.session.UserSession r4 = r8.A03
            X.0Tu r2 = X.0Tu.A06
            r0 = 36317543381931335(0x81069d00651547, double:3.03069890151806E-306)
            boolean r2 = X.182.A06(r2, r4, r0)
            java.lang.Integer r0 = r10.CEk(r9)
            int r1 = r0.intValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r7) goto L_0x009f
            if (r1 == r6) goto L_0x006b
            java.lang.Object r0 = r9.A04
            X.GDe r0 = (X.C52058GDe) r0
            X.3W1 r2 = r0.A0E
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0057
            if (r2 == 0) goto L_0x0057
            boolean r0 = r2.A1m
            if (r0 != 0) goto L_0x0057
            r5 = 0
        L_0x0041:
            r3.A00 = r5
            java.lang.Object r0 = r9.A03
            X.4bN r0 = (X.C267324bN) r0
            boolean r0 = r0.CcK()
            if (r0 != 0) goto L_0x0056
            if (r2 == 0) goto L_0x0056
            X.5kj r0 = X.C293415kh.A00(r4)
            r0.A00(r2)
        L_0x0056:
            return
        L_0x0057:
            java.lang.Long r0 = r3.A01
            if (r0 == 0) goto L_0x0068
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r0.longValue()
            long r5 = r5 - r0
            long r0 = r3.A00
            long r5 = r5 + r0
            goto L_0x0041
        L_0x0068:
            long r5 = r3.A00
            goto L_0x0041
        L_0x006b:
            if (r2 == 0) goto L_0x0091
            java.lang.Object r1 = r9.A03
            X.4bN r1 = (X.C267324bN) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0091
            X.4bN r0 = r8.A02
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0091
            r8.A02 = r1
            long r1 = r8.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 != 0) goto L_0x008b
            long r1 = java.lang.System.currentTimeMillis()
        L_0x008b:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.A01 = r0
        L_0x0091:
            java.lang.Object r0 = r9.A04
            X.GDe r0 = (X.C52058GDe) r0
            X.3W1 r1 = r0.A0E
            if (r1 == 0) goto L_0x0056
            r0 = 63
            X.AnonymousClass3W1.A00(r1, r0)
            return
        L_0x009f:
            if (r2 == 0) goto L_0x00d3
            long r1 = java.lang.System.currentTimeMillis()
            r8.A01 = r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00b7
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto L_0x00d3
        L_0x00b1:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.A01 = r0
        L_0x00b7:
            java.lang.Object r0 = r9.A03
            X.4bN r0 = (X.C267324bN) r0
            boolean r0 = r0.CcK()
            if (r0 != 0) goto L_0x0056
            java.lang.Object r0 = r9.A04
            X.GDe r0 = (X.C52058GDe) r0
            X.3W1 r3 = r0.A0E
            if (r3 == 0) goto L_0x0056
            X.5kj r2 = X.C293415kh.A00(r4)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.A01(r3, r0)
            return
        L_0x00d3:
            long r1 = java.lang.System.currentTimeMillis()
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCM.ATF(X.30Y, X.3oY):void");
    }

    public GCM(UserSession userSession, C52012GBj gBj) {
        AnonymousClass7TG.A1O(userSession, gBj);
        this.A03 = userSession;
        this.A04 = gBj;
    }
}
