package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GDg  reason: case insensitive filesystem */
public final class C52060GDg extends C320876t6 {
    public final C61042Jvg A00;
    public final int A01;
    public final C52058GDe A02;
    public final UserSession A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52060GDg(C61042Jvg jvg, C267324bN r8, C52058GDe gDe, UserSession userSession, boolean z) {
        super(r8);
        0qQ.A0B(r8, 1);
        0qQ.A0B(jvg, 3);
        0qQ.A0B(gDe, 4);
        this.A00 = jvg;
        this.A02 = gDe;
        this.A03 = userSession;
        this.A04 = z;
        int ordinal = r8.A01.ordinal();
        int i = 0;
        if (ordinal == 0) {
            i = A00(true);
        } else if (ordinal == 3 || ordinal == 2 || ordinal == 1) {
            i = A00(false);
        }
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        if (r1.A29 != true) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00(boolean r10) {
        /*
            r9 = this;
            boolean r0 = r9.A04
            r2 = 1
            if (r0 != 0) goto L_0x0025
            X.Jvg r0 = r9.A00
            boolean r0 = r0.A01
            if (r10 == 0) goto L_0x001c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.GDe r0 = r9.A02
            X.HLU r0 = r0.A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
        L_0x0017:
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
        L_0x001c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            goto L_0x0017
        L_0x0025:
            X.4bN r6 = r9.A00
            X.1Xj r1 = r6.A02
            r5 = 0
            if (r1 == 0) goto L_0x00b1
            com.instagram.common.session.UserSession r4 = r9.A03
            X.0q2 r0 = X.0q2.A00(r4)
            boolean r3 = r0.A0N(r1)
            int r8 = r1.A0v()
            int r7 = r1.A0r()
            if (r10 == 0) goto L_0x00ae
            X.1Xy r0 = r1.A0C
            com.instagram.user.model.User r1 = r0.CCd()
            if (r1 == 0) goto L_0x00ac
            X.2f1 r0 = X.AnonymousClass2f1.A00(r4)
            com.instagram.user.model.FollowStatus r4 = r0.A0N(r1)
        L_0x0050:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r1, r0, r4}
            int r0 = java.util.Arrays.hashCode(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x0068:
            X.GDe r3 = r9.A02
            X.3W1 r1 = r3.A0E
            if (r1 == 0) goto L_0x00aa
            boolean r0 = r1.A1q
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x0074:
            if (r10 != 0) goto L_0x007d
            if (r1 == 0) goto L_0x007d
            boolean r1 = r1.A29
            r0 = 1
            if (r1 == r2) goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            X.HLU r1 = r3.A0C
            X.Jvg r0 = r9.A00
            boolean r0 = r0.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r2, r1, r0}
            int r0 = java.util.Arrays.hashCode(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.GGn r1 = X.GJD.A00
            com.instagram.common.session.UserSession r0 = r9.A03
            boolean r0 = r1.A00(r5, r6, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r2, r0}
            goto L_0x0017
        L_0x00aa:
            r7 = r5
            goto L_0x0074
        L_0x00ac:
            r4 = r5
            goto L_0x0050
        L_0x00ae:
            com.instagram.user.model.FollowStatus r4 = com.instagram.user.model.FollowStatus.A06
            goto L_0x0050
        L_0x00b1:
            r4 = r5
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52060GDg.A00(boolean):int");
    }

    public final int A01() {
        return this.A01;
    }

    public final C295365o2 A02() {
        return this.A00.A01;
    }
}
