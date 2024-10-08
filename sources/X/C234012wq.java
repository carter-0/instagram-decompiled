package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2wq  reason: invalid class name and case insensitive filesystem */
public final class C234012wq {
    public final int A00;
    public final long A01;
    public final UserSession A02;
    public final C234022wr A03;

    public C234012wq(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        C234022wr r0 = new C234022wr(userSession);
        this.A03 = r0;
        UserSession userSession2 = r0.A00;
        0Tu r4 = 0Tu.A06;
        this.A01 = ((long) ((int) 182.A01(r4, userSession2, 36606315502441853L))) * 1000;
        this.A00 = (int) 182.A01(r4, userSession2, 36606315504211328L);
    }

    public final void A00() {
        UserSession userSession = this.A03.A00;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36324840527311258L) || 182.A06(r2, userSession, 36324840527835549L) || 182.A06(r2, userSession, 36324840527770012L)) {
            0xY AR4 = 1Au.A00(this.A02).A01.AR4();
            AR4.E5T(AnonymousClass000.A00(2984), false);
            AR4.apply();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r6 != 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r6 > 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01() {
        /*
            r8 = this;
            com.instagram.common.session.UserSession r3 = r8.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 36324840529146275(0x810d40004331a3, double:3.0353136468000416E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            X.1Av r0 = X.1Au.A00(r3)
            X.0xa r3 = r0.A01
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = "delayed_skip_display_time_stamp"
            r1 = 0
            long r6 = r3.getLong(r0, r1)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002d
        L_0x0021:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r6
            long r2 = r8.A01
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            return r0
        L_0x002f:
            r0 = 684(0x2ac, float:9.58E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1 = 0
            long r6 = r3.getLong(r0, r1)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234012wq.A01():boolean");
    }
}
