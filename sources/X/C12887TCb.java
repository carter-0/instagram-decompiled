package X;

/* renamed from: X.TCb  reason: case insensitive filesystem */
public final class C12887TCb implements Runnable {
    public final /* synthetic */ ST3 A00;

    public C12887TCb(ST3 st3) {
        this.A00 = st3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        X.ST3.A03(r4.A00, X.C8889REg.PINGRESP, X.C8947RGw.A00(r3), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            X.ST3 r2 = r4.A00     // Catch:{ all -> 0x002b }
            java.util.EnumSet r0 = X.ST3.A0c     // Catch:{ all -> 0x002b }
            X.3RQ r1 = r2.A03     // Catch:{ all -> 0x002b }
            X.SJJ r0 = r2.A0C     // Catch:{ all -> 0x002b }
            r0.A03()     // Catch:{ all -> 0x002b }
            boolean r0 = r1.A00     // Catch:{ all -> 0x002b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0037
            X.SRA r3 = r2.A0E     // Catch:{ all -> 0x002b }
            monitor-enter(r3)     // Catch:{ all -> 0x002b }
            X.RFZ r0 = X.RFZ.PINGRESP     // Catch:{ all -> 0x0028 }
            X.SNX r2 = new X.SNX     // Catch:{ all -> 0x0028 }
            r2.<init>(r0)     // Catch:{ all -> 0x0028 }
            r0 = 0
            X.S1r r1 = new X.S1r     // Catch:{ all -> 0x0028 }
            r1.<init>(r2, r0, r0)     // Catch:{ all -> 0x0028 }
            X.RwG r0 = r3.A01     // Catch:{ all -> 0x0028 }
            X.SRA.A02(r3, r1, r0)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x002b:
            r3 = move-exception
            X.ST3 r2 = r4.A00
            X.RGw r1 = X.C8947RGw.A00(r3)
            X.REg r0 = X.C8889REg.PINGRESP
            X.ST3.A03(r2, r0, r1, r3)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12887TCb.run():void");
    }
}
