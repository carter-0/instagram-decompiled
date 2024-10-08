package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2yU  reason: invalid class name and case insensitive filesystem */
public final class C234692yU implements C250603lj {
    public final UserSession A00;
    public final C232852uY A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass2yT A03;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (r10 < 500) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r13, X.C252093oY r14) {
        /*
            r12 = this;
            r0 = 0
            X.0qQ.A0B(r13, r0)
            r0 = 1
            X.0qQ.A0B(r14, r0)
            java.lang.Integer r1 = r14.CEk(r13)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0064
            X.2yT r2 = r12.A03
            java.lang.Object r3 = r13.A03
            r7 = r3
            X.1Xj r7 = (X.1Xj) r7
            java.lang.String r4 = r7.getId()
            if (r4 == 0) goto L_0x0065
            long r0 = r14.BlK()
            X.2nC r5 = r2.A01
            long r10 = r5.A00(r4, r0)
            X.01r r0 = r2.A00
            java.lang.Object r6 = r0.remove(r4)
            X.3s8 r6 = (X.C254223s8) r6
            if (r6 == 0) goto L_0x0038
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            X.01r r0 = r5.A01
            r0.remove(r4)
            if (r1 == 0) goto L_0x0064
            if (r6 == 0) goto L_0x0064
            X.2uY r5 = r12.A01
            X.4DU r8 = r12.A02
            X.0qQ.A06(r3)
            java.lang.Object r0 = r13.A04
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r9 = r0.getPosition()
            X.3sc r2 = r5.A01(r6, r7, r8, r9, r10)
            r2.A03()
            r2.A02()
            com.instagram.common.session.UserSession r1 = r12.A00
            X.1Xl r3 = (X.1Xl) r3
            int r0 = r0.A03
            X.C233822wX.A0E(r1, r2, r3, r8, r0)
        L_0x0064:
            return
        L_0x0065:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234692yU.ATF(X.30Y, X.3oY):void");
    }

    public C234692yU(UserSession userSession, C232852uY r2, AnonymousClass4DU r3, AnonymousClass2yT r4) {
        this.A00 = userSession;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
