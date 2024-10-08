package X;

/* renamed from: X.9Rj  reason: invalid class name and case insensitive filesystem */
public final class C378829Rj extends AnonymousClass4M2 {
    public final /* synthetic */ C378809Rh A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r0 != null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DiU(X.AnonymousClass4MN r7, long r8) {
        /*
            r6 = this;
            r5 = 0
            X.9Rh r4 = r6.A00
            java.lang.Object r3 = r4.A0C
            X.0qQ.A06(r3)
            monitor-enter(r3)
            boolean r0 = r4.A0D     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            r4.A0B = r5     // Catch:{ all -> 0x004a }
            r7.getCurrentPosition()     // Catch:{ all -> 0x004a }
            int r1 = r4.A01     // Catch:{ all -> 0x004a }
            r0 = -1
            if (r1 == r0) goto L_0x001e
            r4.A01 = r0     // Catch:{ all -> 0x004a }
            r0 = 1
            X.C378809Rh.A04(r4, r1, r0)     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x001e:
            int r1 = r4.A02     // Catch:{ all -> 0x004a }
            int r0 = r4.A03     // Catch:{ all -> 0x004a }
            int r1 = r1 - r0
            r0 = -3000(0xfffffffffffff448, float:NaN)
            if (r1 >= r0) goto L_0x0035
            int r0 = r7.getCurrentPosition()     // Catch:{ all -> 0x004a }
            r4.A02 = r0     // Catch:{ all -> 0x004a }
            X.9Sq r0 = r4.A02     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
        L_0x0031:
            r0.A00()     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x0035:
            int r2 = r7.getCurrentPosition()     // Catch:{ all -> 0x004a }
            int r1 = r4.A02     // Catch:{ all -> 0x004a }
            int r0 = r1 + 500
            if (r2 <= r0) goto L_0x0043
            X.C378809Rh.A06(r4, r1, r5)     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x0043:
            X.9Sq r0 = r4.A02     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            goto L_0x0031
        L_0x0048:
            monitor-exit(r3)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378829Rj.DiU(X.4MN, long):void");
    }

    public C378829Rj(C378809Rh r1) {
        this.A00 = r1;
    }

    public final void D5H(AnonymousClass4MN r5) {
        C378809Rh r3 = this.A00;
        Object obj = r3.A0C;
        0qQ.A06(obj);
        synchronized (obj) {
            if (r3.A0D && !r3.A0B && r3.A0B) {
                AnonymousClass4MM r1 = r3.A04;
                if (r1 != null) {
                    r1.seekTo(C378809Rh.A00(r3));
                    AnonymousClass4MM r0 = r3.A04;
                    if (r0 != null) {
                        r0.start();
                    }
                    AnonymousClass9T2 r02 = r3.A06;
                    if (r02 != null) {
                        r02.A01.run();
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else if (!r3.A0B) {
                C378809Rh.A05(r3, true);
            }
        }
    }

    public final void DPP(AnonymousClass4MN r2) {
        AnonymousClass9T2 r0 = this.A00.A06;
        if (r0 != null) {
            r0.A01.run();
        }
    }
}
