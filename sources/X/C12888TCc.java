package X;

/* renamed from: X.TCc  reason: case insensitive filesystem */
public final class C12888TCc implements Runnable {
    public final /* synthetic */ ST3 A00;

    public C12888TCc(ST3 st3) {
        this.A00 = st3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        X.ST3.A03(r4, X.C8889REg.PING, X.C8947RGw.A00(r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            X.ST3 r4 = r5.A00
            java.util.EnumSet r0 = X.ST3.A0c
            java.lang.Integer r1 = r4.A0Y     // Catch:{ all -> 0x002a }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x002a }
            if (r1 != r0) goto L_0x0034
            X.SRA r3 = r4.A0E     // Catch:{ all -> 0x002a }
            monitor-enter(r3)     // Catch:{ all -> 0x002a }
            X.RFZ r0 = X.RFZ.PINGREQ     // Catch:{ all -> 0x0027 }
            X.SNX r2 = new X.SNX     // Catch:{ all -> 0x0027 }
            r2.<init>(r0)     // Catch:{ all -> 0x0027 }
            r0 = 0
            X.S1r r1 = new X.S1r     // Catch:{ all -> 0x0027 }
            r1.<init>(r2, r0, r0)     // Catch:{ all -> 0x0027 }
            X.RwG r0 = r3.A01     // Catch:{ all -> 0x0027 }
            X.SRA.A02(r3, r1, r0)     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x002a }
            r4.A0U = r0     // Catch:{ all -> 0x002a }
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r2 = move-exception
            X.RGw r1 = X.C8947RGw.A00(r2)
            X.REg r0 = X.C8889REg.PING
            X.ST3.A03(r4, r0, r1, r2)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12888TCc.run():void");
    }
}
