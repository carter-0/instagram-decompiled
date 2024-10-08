package X;

/* renamed from: X.5PC  reason: invalid class name */
public final class AnonymousClass5PC extends AnonymousClass5PD {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5PC(X.AnonymousClass5P8 r5, int r6) {
        /*
            r4 = this;
            java.lang.Object r3 = X.AnonymousClass5P3.A07
            monitor-enter(r3)
            java.util.List r2 = X.AnonymousClass5P3.A03     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = X.00k.A0N(r2)     // Catch:{ all -> 0x001a }
            X.0sP r1 = (X.0sP) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0014
            r0 = 38
            X.9L6 r1 = new X.9L6     // Catch:{ all -> 0x001a }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x001a }
        L_0x0014:
            monitor-exit(r3)
            r0 = 0
            r4.<init>(r5, r0, r1, r6)
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5PC.<init>(X.5P8, int):void");
    }

    public final void A0H() {
        synchronized (AnonymousClass5P3.A07) {
            int i = this.A01;
            if (i >= 0) {
                AnonymousClass5P3.A0F(i);
                this.A01 = -1;
            }
        }
    }
}
