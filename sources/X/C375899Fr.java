package X;

/* renamed from: X.9Fr  reason: invalid class name and case insensitive filesystem */
public final class C375899Fr implements Runnable {
    public final /* synthetic */ 0TG A00;
    public final /* synthetic */ 2PW A01;

    public C375899Fr(0TG r1, 2PW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.addAll(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        r2 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (r2.hasNext() == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        ((X.0TN) r2.next()).DD0(r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        r0 = new java.util.ArrayList();
        r1 = r1.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        monitor-enter(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            X.2PW r1 = r3.A01
            monitor-enter(r1)
            boolean r0 = r1.A05     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r1 = r1.A0E
            monitor-enter(r1)
            r0.addAll(r1)     // Catch:{ all -> 0x002d }
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            java.util.Iterator r2 = r0.iterator()
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r1 = r2.next()
            X.0TN r1 = (X.0TN) r1
            X.0TG r0 = r3.A00
            r1.DD0(r0)
            goto L_0x001a
        L_0x002c:
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            throw r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C375899Fr.run():void");
    }
}
