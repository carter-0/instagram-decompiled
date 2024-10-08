package X;

@Deprecated
public final class S4g {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public C13505TbW A03;

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.onCancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r0 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        ((android.os.CancellationSignal) r0).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.A01 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3.A01 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r2 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A02     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            r0 = 1
            r3.A02 = r0     // Catch:{ all -> 0x0036 }
            r3.A01 = r0     // Catch:{ all -> 0x0036 }
            X.TbW r2 = r3.A03     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            r1 = 0
            if (r2 == 0) goto L_0x0017
            r2.onCancel()     // Catch:{ all -> 0x001f }
        L_0x0017:
            if (r0 == 0) goto L_0x002b
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0     // Catch:{ all -> 0x001f }
            r0.cancel()     // Catch:{ all -> 0x001f }
            goto L_0x002b
        L_0x001f:
            r0 = move-exception
            monitor-enter(r3)
            r3.A01 = r1     // Catch:{ all -> 0x0028 }
            r3.notifyAll()     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            r0 = move-exception
            goto L_0x0026
        L_0x002a:
            throw r0
        L_0x002b:
            monitor-enter(r3)
            r3.A01 = r1     // Catch:{ all -> 0x0033 }
            r3.notifyAll()     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S4g.A00():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:20:0x0001, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C13505TbW r2) {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            boolean r0 = r1.A01     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0009
            r1.wait()     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0009:
            X.TbW r0 = r1.A03     // Catch:{ all -> 0x001a }
            if (r0 == r2) goto L_0x0018
            r1.A03 = r2     // Catch:{ all -> 0x001a }
            boolean r0 = r1.A02     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0018
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            r2.onCancel()
            return
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S4g.A01(X.TbW):void");
    }
}
