package X;

public final class Y2F implements Runnable {
    public final /* synthetic */ Xo0 A00;

    public Y2F(Xo0 xo0) {
        this.A00 = xo0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r5 == -1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r2 = X.AnonymousClass7TE.A1A();
        r2.append("sent ping but didn't receive pong within ");
        r2.append(r4.A0E);
        r2.append("ms (after ");
        r2.append(r5 - 1);
        r4.A00(new java.net.SocketTimeoutException(X.AnonymousClass7TF.A0l(" successful ping/pongs)", r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C11256SHq.A00(r2, X.TAH.A02, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r4.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            X.Xo0 r4 = r6.A00
            monitor-enter(r4)
            boolean r0 = r4.A0D     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            return
        L_0x0009:
            X.SHq r2 = r4.A0A     // Catch:{ all -> 0x0054 }
            boolean r0 = r4.A0B     // Catch:{ all -> 0x0054 }
            r1 = -1
            if (r0 == 0) goto L_0x001d
            int r5 = r4.A03     // Catch:{ all -> 0x0054 }
        L_0x0012:
            int r0 = r4.A03     // Catch:{ all -> 0x0054 }
            r3 = 1
            int r0 = r0 + 1
            r4.A03 = r0     // Catch:{ all -> 0x0054 }
            r4.A0B = r3     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            goto L_0x001f
        L_0x001d:
            r5 = -1
            goto L_0x0012
        L_0x001f:
            if (r5 == r1) goto L_0x0047
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "sent ping but didn't receive pong within "
            r2.append(r0)
            long r0 = r4.A0E
            r2.append(r0)
            java.lang.String r0 = "ms (after "
            r2.append(r0)
            int r5 = r5 - r3
            r2.append(r5)
            java.lang.String r0 = " successful ping/pongs)"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r2)
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            r0.<init>(r1)
            r4.A00(r0)
            return
        L_0x0047:
            X.TAH r1 = X.TAH.A02     // Catch:{ IOException -> 0x004f }
            r0 = 9
            X.C11256SHq.A00(r2, r1, r0)     // Catch:{ IOException -> 0x004f }
            return
        L_0x004f:
            r0 = move-exception
            r4.A00(r0)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y2F.run():void");
    }
}
