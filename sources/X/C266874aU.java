package X;

import java.util.concurrent.Executor;

/* renamed from: X.4aU  reason: invalid class name and case insensitive filesystem */
public final class C266874aU implements Runnable {
    public final /* synthetic */ 1yV A00;
    public final /* synthetic */ C266834aQ A01;
    public final /* synthetic */ C266844aR A02;
    public final /* synthetic */ Executor A03;

    public C266874aU(1yV r1, C266834aQ r2, C266844aR r3, Executor executor) {
        this.A00 = r1;
        this.A03 = executor;
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d A[LOOP:2: B:15:0x002d->B:59:0x002d, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            X.1yV r10 = r14.A00
            java.lang.String r9 = r10.A06
            java.lang.String r8 = "LocalSocketVideoProxy"
            r7 = 0
            android.net.LocalServerSocket r6 = new android.net.LocalServerSocket     // Catch:{ IOException -> 0x0086 }
            r6.<init>(r9)     // Catch:{ IOException -> 0x0086 }
            java.lang.String r1 = "Socket server started, address: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r9}     // Catch:{ IOException -> 0x0086 }
            X.27B.A01(r8, r1, r0)     // Catch:{ IOException -> 0x0086 }
            java.lang.Object r5 = r10.A03
            monitor-enter(r5)
            java.util.Map r4 = r10.A05     // Catch:{ all -> 0x0083 }
            r4.put(r9, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)     // Catch:{ all -> 0x0083 }
            r13 = 0
        L_0x001f:
            r3 = r13
        L_0x0020:
            java.io.FileDescriptor r0 = r6.getFileDescriptor()
            if (r0 == 0) goto L_0x007a
            android.net.LocalSocket r3 = r6.accept()     // Catch:{ IOException -> 0x0065 }
            java.lang.Object r2 = r10.A02     // Catch:{ IOException -> 0x0065 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0065 }
        L_0x002d:
            java.util.List r12 = r10.A04     // Catch:{ all -> 0x0062 }
            int r1 = r12.size()     // Catch:{ all -> 0x0062 }
            int r0 = r10.A01     // Catch:{ all -> 0x0062 }
            if (r1 <= r0) goto L_0x0054
            java.lang.Object r11 = r12.remove(r7)     // Catch:{ all -> 0x0062 }
            android.net.LocalSocket r11 = (android.net.LocalSocket) r11     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "Closing client %s due to excess limit %d"
            int r0 = r12.size()     // Catch:{ all -> 0x0062 }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0062 }
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}     // Catch:{ all -> 0x0062 }
            X.27B.A01(r8, r1, r0)     // Catch:{ all -> 0x0062 }
            r11.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x002d
        L_0x0054:
            monitor-exit(r2)     // Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x0020
            java.util.concurrent.Executor r1 = r14.A03
            X.Pyo r0 = new X.Pyo
            r0.<init>(r3, r14)
            r1.execute(r0)
            goto L_0x001f
        L_0x0062:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            r2 = move-exception
            java.lang.String r1 = "Error connecting to client"
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r8, r0, r2)
            if (r3 == 0) goto L_0x0076
            r3.close()     // Catch:{ IOException -> 0x0076, all -> 0x0078 }
        L_0x0076:
            r3 = r13
            goto L_0x0020
        L_0x0078:
            r0 = move-exception
            throw r0
        L_0x007a:
            monitor-enter(r5)
            r4.remove(r9)     // Catch:{ all -> 0x0080 }
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            return
        L_0x0080:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            throw r2
        L_0x0083:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0083 }
            throw r2
        L_0x0086:
            r1 = move-exception
            java.lang.String r0 = "Error initializing server"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C266874aU.run():void");
    }
}
