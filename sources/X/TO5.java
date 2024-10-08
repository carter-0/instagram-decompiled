package X;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

public final class TO5 implements Executor {
    public static final 1K8 A05 = new 1K8(TO5.class);
    public long A00 = 0;
    public Integer A01 = AnonymousClass05K.A00;
    public final Deque A02 = new ArrayDeque();
    public final C13086TKs A03 = new C13086TKs(this);
    public final Executor A04;

    public TO5(Executor executor) {
        executor.getClass();
        this.A04 = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r10.A04.execute(r10.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r10.A01 != r7) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r10.A00 != r3) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r10.A01 != r7) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r10.A01 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003e, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r1 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004f, code lost:
        if ((r2 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0052, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0058, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r6 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r11) {
        /*
            r10 = this;
            r11.getClass()
            java.util.Deque r5 = r10.A02
            monitor-enter(r5)
            java.lang.Integer r1 = r10.A01     // Catch:{ all -> 0x0061 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0061 }
            if (r1 == r0) goto L_0x005c
            java.lang.Integer r9 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0061 }
            if (r1 == r9) goto L_0x005c
            long r3 = r10.A00     // Catch:{ all -> 0x0061 }
            X.TKr r8 = new X.TKr     // Catch:{ all -> 0x0061 }
            r8.<init>(r11)     // Catch:{ all -> 0x0061 }
            r5.add(r8)     // Catch:{ all -> 0x0061 }
            java.lang.Integer r7 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0061 }
            r10.A01 = r7     // Catch:{ all -> 0x0061 }
            monitor-exit(r5)     // Catch:{ all -> 0x0061 }
            r6 = 1
            java.util.concurrent.Executor r1 = r10.A04     // Catch:{ all -> 0x003d }
            X.TKs r0 = r10.A03     // Catch:{ all -> 0x003d }
            r1.execute(r0)     // Catch:{ all -> 0x003d }
            java.lang.Integer r0 = r10.A01
            if (r0 != r7) goto L_0x0060
            monitor-enter(r5)
            long r1 = r10.A00     // Catch:{ all -> 0x003a }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            java.lang.Integer r0 = r10.A01     // Catch:{ all -> 0x003a }
            if (r0 != r7) goto L_0x0038
            r10.A01 = r9     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r5)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003a }
            throw r0
        L_0x003d:
            r2 = move-exception
            monitor-enter(r5)
            java.lang.Integer r1 = r10.A01     // Catch:{ all -> 0x0059 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0059 }
            if (r1 == r0) goto L_0x0047
            if (r1 != r7) goto L_0x0052
        L_0x0047:
            boolean r0 = r5.removeLastOccurrence(r8)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0052
        L_0x004d:
            boolean r0 = r2 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0058
            goto L_0x0054
        L_0x0052:
            r6 = 0
            goto L_0x004d
        L_0x0054:
            if (r6 != 0) goto L_0x0058
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            return
        L_0x0058:
            throw r2     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r0
        L_0x005c:
            r5.add(r11)     // Catch:{ all -> 0x0061 }
            monitor-exit(r5)     // Catch:{ all -> 0x0061 }
        L_0x0060:
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0061 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TO5.execute(java.lang.Runnable):void");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SequentialExecutor@");
        A1A.append(System.identityHashCode(this));
        A1A.append("{");
        return C66582MXn.A0v(this.A04, A1A);
    }
}
