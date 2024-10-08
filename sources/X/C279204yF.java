package X;

/* renamed from: X.4yF  reason: invalid class name and case insensitive filesystem */
public final class C279204yF implements 29x {
    public static C279204yF A04;
    public C279234yI A00;
    public C279214yG A01;
    public String A02;
    public boolean A03;

    public final void DCr(String str, String str2, int i, int i2) {
    }

    public final void Dls(C251073mW r1, 2R9 r2) {
    }

    public final void DmT(C251073mW r1, String str, long j, long j2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r0 > -1) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass5AJ r20) {
        /*
            r19 = this;
            r2 = r19
            X.4yG r3 = r2.A01
            if (r3 == 0) goto L_0x005b
            r7 = r20
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x005b
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0072
            int r1 = r7.A01
            if (r1 != 0) goto L_0x0062
            X.5AB r10 = X.AnonymousClass5AB.CACHE_HIT
        L_0x0016:
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x005b
            X.3wn r6 = r7.A0A
            java.lang.String r11 = r6.A03
            X.28e r0 = r6.A00
            java.lang.String r12 = r0.name()
            java.lang.String r13 = r7.A07
            long r15 = r7.A03
            r8 = r15
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
            long r0 = r7.A02
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x005f
        L_0x003a:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005c
            long r0 = r7.A02
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x005c
        L_0x004b:
            android.util.Pair r9 = r7.A06
            java.lang.String r14 = r6.A06
            X.5AC r8 = new X.5AC
            r17 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)
            java.util.List r0 = r3.A01
            r0.add(r8)
        L_0x005b:
            return
        L_0x005c:
            long r0 = r7.A04
            goto L_0x004b
        L_0x005f:
            long r15 = r7.A05
            goto L_0x003a
        L_0x0062:
            int r0 = r7.A00
            if (r0 != 0) goto L_0x006b
            if (r1 <= 0) goto L_0x007d
            X.5AB r10 = X.AnonymousClass5AB.CACHE_PARTIAL_MISS
            goto L_0x0016
        L_0x006b:
            if (r0 <= 0) goto L_0x007d
            if (r1 <= 0) goto L_0x007d
            X.5AB r10 = X.AnonymousClass5AB.CACHE_PARTIAL_HIT
            goto L_0x0016
        L_0x0072:
            int r0 = r7.A00
            if (r0 != 0) goto L_0x007d
            int r0 = r7.A01
            if (r0 <= 0) goto L_0x007d
            X.5AB r10 = X.AnonymousClass5AB.CACHE_MISS
            goto L_0x0016
        L_0x007d:
            X.5AB r10 = X.AnonymousClass5AB.CACHE_UNKNOWN
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C279204yF.A00(X.5AJ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = r20;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dlr(X.C251073mW r19, X.2R9 r20) {
        /*
            r18 = this;
            r4 = r18
            X.4yG r0 = r4.A01
            if (r0 == 0) goto L_0x004f
            r3 = r20
            java.lang.String r7 = r3.A06
            if (r7 == 0) goto L_0x004f
            java.lang.String r6 = "UNKNOWN"
            X.4yI r2 = r4.A00
            monitor-enter(r2)
            java.util.TreeSet r0 = r2.A01     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r0.floor(r3)     // Catch:{ all -> 0x004c }
            X.2R9 r1 = (X.2R9) r1     // Catch:{ all -> 0x004c }
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x004c }
            X.5AA r0 = (X.AnonymousClass5AA) r0     // Catch:{ all -> 0x004c }
            monitor-exit(r2)
            java.lang.String r5 = "unknown"
            if (r0 == 0) goto L_0x004a
            X.3wn r1 = r0.A00
            java.lang.String r5 = r1.A03
            X.28e r0 = r1.A00
            java.lang.String r6 = r0.name()
            java.lang.String r9 = r1.A06
        L_0x0032:
            X.4yG r0 = r4.A01
            long r10 = r3.A04
            long r12 = r3.A03
            X.5AB r4 = X.AnonymousClass5AB.SPAN_ADDED
            r14 = 0
            r8 = 0
            X.5AC r3 = new X.5AC
            r16 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r14, r16)
            java.util.List r0 = r0.A01
            r0.add(r3)
            return
        L_0x004a:
            r9 = r5
            goto L_0x0032
        L_0x004c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C279204yF.Dlr(X.3mW, X.2R9):void");
    }

    public final void Dlt(C251073mW r2, 2R9 r3, 2R9 r4) {
        Dlu(r2, r3, r4, AnonymousClass05K.A0C);
    }

    public final void Dlu(C251073mW r18, 2R9 r19, 2R9 r20, Integer num) {
        C279214yG r1 = this.A01;
        if (r1 != null) {
            2R9 r3 = r19;
            if (r19 != null && num != AnonymousClass05K.A0N) {
                2R9 r0 = r20;
                r1.A01.add(new AnonymousClass5AC(AnonymousClass5AB.SPAN_TOUCHED, (String) null, (String) null, r3.A06, (String) null, "unknown", r3.A04, r3.A03, r0.A04, r0.A03));
            }
        }
    }
}
