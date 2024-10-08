package X;

public final class Y5I extends Thread {
    public final /* synthetic */ C21411XaK A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Y5I(C21411XaK xaK) {
        super("PhantomDestructor");
        this.A00 = xaK;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r4.A02.isEmpty() == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r4.A00 = false;
        r4.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x001a A[EDGE_INSN: B:26:0x001a->B:9:0x001a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            X.XaK r4 = r5.A00
        L_0x0002:
            r0 = 0
        L_0x0003:
            java.lang.ref.ReferenceQueue r1 = r4.A01     // Catch:{ InterruptedException -> 0x000c }
            java.lang.ref.Reference r1 = r1.remove()     // Catch:{ InterruptedException -> 0x000c }
            X.Y5S r1 = (X.Y5S) r1     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x0018
        L_0x000c:
            if (r0 == 0) goto L_0x0003
            java.lang.ref.ReferenceQueue r3 = r4.A01     // Catch:{ InterruptedException -> 0x000c }
            r1 = 15000(0x3a98, double:7.411E-320)
            java.lang.ref.Reference r1 = r3.remove(r1)     // Catch:{ InterruptedException -> 0x000c }
            X.Y5S r1 = (X.Y5S) r1     // Catch:{ InterruptedException -> 0x000c }
        L_0x0018:
            if (r1 != 0) goto L_0x001c
            monitor-enter(r4)
            goto L_0x0032
        L_0x001c:
            X.Y9I r0 = r1.A00
            r0.targetDestructed()
            monitor-enter(r4)
            java.util.HashSet r2 = r4.A02     // Catch:{ all -> 0x0045 }
            boolean r1 = r2.remove(r1)     // Catch:{ all -> 0x0045 }
            r0 = 0
            X.02V.A07(r1, r0)     // Catch:{ all -> 0x0045 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0045 }
            monitor-exit(r4)
            goto L_0x000c
        L_0x0032:
            java.util.HashSet r0 = r4.A02     // Catch:{ all -> 0x0045 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0045 }
            r0 = 0
            if (r1 == 0) goto L_0x0041
            r4.A00 = r0     // Catch:{ all -> 0x0045 }
            r4.notifyAll()     // Catch:{ all -> 0x0045 }
            goto L_0x0043
        L_0x0041:
            monitor-exit(r4)
            goto L_0x0002
        L_0x0043:
            monitor-exit(r4)
            return
        L_0x0045:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y5I.run():void");
    }
}
