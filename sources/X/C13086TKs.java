package X;

/* renamed from: X.TKs  reason: case insensitive filesystem */
public final class C13086TKs implements Runnable {
    public Runnable A00;
    public final /* synthetic */ TO5 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r7 = r7 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r9.A00.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3 = X.TO5.A05.A00();
        r2 = java.util.logging.Level.SEVERE;
        r1 = X.AnonymousClass7TE.A1A();
        r1.append("Exception while executing runnable ");
        r3.log(r2, X.AnonymousClass7TF.A0i(r9.A00, r1), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6.A01 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r9.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0061, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            r8 = 0
            r7 = 0
        L_0x0002:
            X.TO5 r6 = r9.A01     // Catch:{ all -> 0x0062 }
            java.util.Deque r5 = r6.A02     // Catch:{ all -> 0x0062 }
            monitor-enter(r5)     // Catch:{ all -> 0x0062 }
            if (r8 != 0) goto L_0x0019
            java.lang.Integer r0 = r6.A01     // Catch:{ all -> 0x005c }
            java.lang.Integer r4 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x005c }
            if (r0 == r4) goto L_0x0053
            long r2 = r6.A00     // Catch:{ all -> 0x005c }
            r0 = 1
            long r0 = r0 + r2
            r6.A00 = r0     // Catch:{ all -> 0x005c }
            r6.A01 = r4     // Catch:{ all -> 0x005c }
            r8 = 1
        L_0x0019:
            java.lang.Object r0 = r5.poll()     // Catch:{ all -> 0x005c }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x005c }
            r9.A00 = r0     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0024
            goto L_0x004f
        L_0x0024:
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0062 }
            r7 = r7 | r0
            r5 = 0
            java.lang.Runnable r0 = r9.A00     // Catch:{ Exception -> 0x0031 }
            r0.run()     // Catch:{ Exception -> 0x0031 }
            goto L_0x004c
        L_0x0031:
            r4 = move-exception
            X.1K8 r0 = X.TO5.A05     // Catch:{ all -> 0x005a }
            java.util.logging.Logger r3 = r0.A00()     // Catch:{ all -> 0x005a }
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x005a }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "Exception while executing runnable "
            r1.append(r0)     // Catch:{ all -> 0x005a }
            java.lang.Runnable r0 = r9.A00     // Catch:{ all -> 0x005a }
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)     // Catch:{ all -> 0x005a }
            r3.log(r2, r0, r4)     // Catch:{ all -> 0x005a }
        L_0x004c:
            r9.A00 = r5     // Catch:{ all -> 0x0062 }
            goto L_0x0002
        L_0x004f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x005c }
            r6.A01 = r0     // Catch:{ all -> 0x005c }
        L_0x0053:
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x0059
            X.Pxe.A1F()     // Catch:{ Error -> 0x0069 }
        L_0x0059:
            return
        L_0x005a:
            r0 = move-exception
            goto L_0x005f
        L_0x005c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            goto L_0x0061
        L_0x005f:
            r9.A00 = r5     // Catch:{ all -> 0x0062 }
        L_0x0061:
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            if (r7 == 0) goto L_0x0068
            X.Pxe.A1F()     // Catch:{ Error -> 0x0069 }
        L_0x0068:
            throw r0     // Catch:{ Error -> 0x0069 }
        L_0x0069:
            r3 = move-exception
            X.TO5 r2 = r9.A01
            java.util.Deque r1 = r2.A02
            monitor-enter(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0075 }
            r2.A01 = r0     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r1)     // Catch:{ all -> 0x0075 }
            goto L_0x0077
        L_0x0075:
            r3 = move-exception
            goto L_0x0073
        L_0x0077:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13086TKs.run():void");
    }

    public C13086TKs(TO5 to5) {
        this.A01 = to5;
    }

    public final String toString() {
        String str;
        Runnable runnable = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (runnable != null) {
            A1A.append("SequentialExecutorWorker{running=");
            A1A.append(runnable);
        } else {
            A1A.append("SequentialExecutorWorker{state=");
            switch (this.A01.A01.intValue()) {
                case 0:
                    str = "IDLE";
                    break;
                case 1:
                    str = "QUEUING";
                    break;
                case 2:
                    str = "QUEUED";
                    break;
                default:
                    str = "RUNNING";
                    break;
            }
            A1A.append(str);
        }
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
