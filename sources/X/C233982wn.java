package X;

/* renamed from: X.2wn  reason: invalid class name and case insensitive filesystem */
public final class C233982wn implements C233992wo {
    public final /* synthetic */ C233972wm A00;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        if (r5 >= ((int) X.182.A01(r8, r9, 36609991993595853L))) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r4.A06 != X.1UQ.A0Y) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x003a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List CsY(java.util.List r34) {
        /*
            r33 = this;
            r1 = 0
            r34.size()
            java.lang.System.currentTimeMillis()
            r0 = r33
            X.2wm r0 = r0.A00
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            X.2rI r7 = r0.A05
            java.util.List r2 = r7.A07()
            boolean r16 = X.1Xi.A04(r2)
            X.2rX r6 = r7.A00
            X.2rW r6 = (X.AnonymousClass2rW) r6
            java.util.List r2 = r6.A01
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            if (r2 != 0) goto L_0x00be
            com.instagram.common.session.UserSession r5 = r0.A04
            X.0Tu r4 = X.0Tu.A05
            r2 = 36609991993595853(0x821098000217cd, double:3.21564458113074E-306)
            long r2 = X.182.A01(r4, r5, r2)
            int r5 = (int) r2
        L_0x0036:
            java.util.Iterator r15 = r34.iterator()
        L_0x003a:
            boolean r2 = r15.hasNext()
            r14 = 1
            if (r2 == 0) goto L_0x00e1
            java.lang.Object r4 = r15.next()
            X.1Xg r4 = (X.1Xg) r4
            if (r16 != 0) goto L_0x0050
            X.1UQ r3 = r4.A06
            X.1UQ r2 = X.1UQ.A0Y
            r13 = 1
            if (r3 == r2) goto L_0x0051
        L_0x0050:
            r13 = 0
        L_0x0051:
            boolean r2 = X.AnonymousClass3VP.A02(r4)
            if (r2 == 0) goto L_0x00bc
            com.instagram.common.session.UserSession r9 = r0.A04
            boolean r2 = X.1Uh.A03(r9)
            if (r2 == 0) goto L_0x00bc
            X.0Tu r8 = X.0Tu.A05
            r2 = 36328517017222538(0x81109800073d8a, double:3.0376386726634996E-306)
            boolean r2 = X.182.A06(r8, r9, r2)
            if (r2 == 0) goto L_0x0095
            int r12 = r7.B5I()
            int r2 = r10.size()
            int r12 = r12 + r2
            boolean r2 = X.1Uh.A03(r9)
            if (r2 == 0) goto L_0x00bc
            if (r16 != 0) goto L_0x00bc
            r2 = 36609991993530316(0x821098000117cc, double:3.215644581089294E-306)
            long r2 = X.182.A01(r8, r9, r2)
            int r11 = (int) r2
            if (r12 < r11) goto L_0x00bc
            r2 = 36609991993595853(0x821098000217cd, double:3.21564458113074E-306)
            long r2 = X.182.A01(r8, r9, r2)
            int r8 = (int) r2
            if (r5 < r8) goto L_0x00bc
        L_0x0095:
            r8 = 1
        L_0x0096:
            if (r16 == 0) goto L_0x00ba
            X.1UQ r3 = r4.A06
            X.1UQ r2 = X.1UQ.A0H
            if (r3 != r2) goto L_0x00ba
        L_0x009e:
            if (r13 != 0) goto L_0x00a4
            if (r8 != 0) goto L_0x00a4
            if (r14 == 0) goto L_0x003a
        L_0x00a4:
            java.lang.String r3 = r4.A09
            X.0qQ.A0B(r3, r1)
            java.util.Map r2 = r6.A04
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L_0x003a
            r10.add(r4)
            int r5 = r5 + 1
            if (r8 == 0) goto L_0x003a
            r5 = 0
            goto L_0x003a
        L_0x00ba:
            r14 = 0
            goto L_0x009e
        L_0x00bc:
            r8 = 0
            goto L_0x0096
        L_0x00be:
            r5 = 0
            java.util.List r3 = r7.A07()
            X.097 r2 = new X.097
            r2.<init>(r3)
            java.util.Iterator r3 = r2.iterator()
        L_0x00cc:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r3.next()
            X.1Xg r2 = (X.1Xg) r2
            boolean r2 = X.AnonymousClass3VP.A02(r2)
            if (r2 != 0) goto L_0x0036
            int r5 = r5 + 1
            goto L_0x00cc
        L_0x00e1:
            boolean r2 = r10.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0199
            r17 = 0
            if (r16 == 0) goto L_0x01a0
            X.2lr r2 = r0.A06
            X.3Do r2 = X.C228552lr.A01(r2)
            java.lang.String r3 = r2.A03
            java.lang.String r2 = "feed_recs"
        L_0x00f7:
            X.1FI r5 = X.1FI.A0G
            X.3kK r4 = r0.A07
            java.lang.String r22 = r4.getSessionId()
            com.instagram.common.session.UserSession r4 = r0.A04
            r12 = 0
            X.1FQ r20 = X.1FP.A00(r4, r5, r3, r2, r1)
            X.0sm r28 = X.0Yt.A0E()
            X.0sm r29 = X.0Yt.A0E()
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r26 = r6.toString()
            X.0qQ.A07(r26)
            java.util.concurrent.atomic.AtomicInteger r6 = X.1FS.A0G
            int r30 = r6.incrementAndGet()
            X.1FS r15 = new X.1FS
            r16 = r15
            r18 = r12
            r19 = r5
            r21 = r12
            r23 = r3
            r24 = r12
            r25 = r12
            r27 = r12
            r31 = r1
            r32 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.2ll r18 = X.C228482lk.A00(r4)
            X.2md r5 = new X.2md
            r5.<init>(r15)
            java.lang.Object r4 = X.00k.A0I(r10)
            X.1Xg r4 = (X.1Xg) r4
            X.1UQ r4 = r4.A06
            java.lang.String r23 = r4.toString()
            java.lang.Object r4 = X.00k.A0I(r10)
            X.1Xg r4 = (X.1Xg) r4
            X.1Xn r4 = r4.A05
            X.1Xj r4 = X.1Xi.A02(r4)
            if (r4 == 0) goto L_0x0161
            X.1Xy r4 = r4.A0C
            java.lang.String r17 = r4.BIl()
        L_0x0161:
            java.lang.String r21 = "LOCAL"
            java.lang.String r22 = "feed_pool_delegate"
            r19 = r5
            r20 = r12
            r24 = r17
            r18.A05(r19, r20, r21, r22, r23, r24)
            X.2wf r11 = r0.A08
            X.3PG r16 = X.AnonymousClass3PG.LOCAL
            r26 = -1
            r13 = r12
            r14 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r21 = r12
            r24 = r12
            r25 = r10
            r28 = r1
            r29 = r1
            r22 = r2
            r23 = r3
            r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29)
            int r2 = r0.A00
            if (r2 <= 0) goto L_0x0199
            int r2 = r2 + -1
            r0.A00 = r2
            if (r2 != 0) goto L_0x0199
            r0.A03 = r1
        L_0x0199:
            r10.size()
            java.lang.System.currentTimeMillis()
            return r10
        L_0x01a0:
            r3 = r17
            r2 = r3
            goto L_0x00f7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233982wn.CsY(java.util.List):java.util.List");
    }

    public C233982wn(C233972wm r1) {
        this.A00 = r1;
    }

    public final void DFr(boolean z) {
        if (z) {
            this.A00.A01 = System.currentTimeMillis();
        }
        this.A00.A02 = 0;
    }
}
