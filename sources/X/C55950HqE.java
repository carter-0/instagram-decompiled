package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HqE  reason: case insensitive filesystem */
public final class C55950HqE {
    public final UserSession A00;
    public final 0xa A01;

    public C55950HqE(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 1Al.A01(userSession).A03(1An.A0n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if ((r5 - X.DbW.A06(r3, "KEY_FIRST_NUDGE_TIMESTAMP_MS")) <= r7) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A00(X.C267324bN r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r4 = 0
            boolean r0 = r10.CcK()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x004c
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ all -> 0x004e }
            com.instagram.common.session.UserSession r3 = r9.A00     // Catch:{ all -> 0x004e }
            X.0Tu r2 = X.0Tu.A06     // Catch:{ all -> 0x004e }
            r0 = 36599018355559785(0x82069d00360d69, double:3.208704808249437E-306)
            long r0 = X.182.A01(r2, r3, r0)     // Catch:{ all -> 0x004e }
            long r7 = r5.toMillis(r0)     // Catch:{ all -> 0x004e }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004e }
            r0 = 36599018355494248(0x82069d00350d68, double:3.208704808207991E-306)
            int r1 = X.DbS.A04(r2, r3, r0)     // Catch:{ all -> 0x004e }
            X.0xa r3 = r9.A01     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "KEY_NUDGE_SHOWN_COUNT"
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x004e }
            boolean r2 = X.AnonymousClass7TF.A1T(r0, r1)
            java.lang.String r1 = "KEY_FIRST_NUDGE_TIMESTAMP_MS"
            boolean r0 = r3.contains(r1)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0046
            long r0 = X.DbW.A06(r3, r1)     // Catch:{ all -> 0x004e }
            long r5 = r5 - r0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r2 != 0) goto L_0x004b
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            r4 = 1
        L_0x004c:
            monitor-exit(r9)
            return r4
        L_0x004e:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55950HqE.A00(X.4bN):boolean");
    }
}
