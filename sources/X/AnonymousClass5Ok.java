package X;

/* renamed from: X.5Ok  reason: invalid class name */
public final class AnonymousClass5Ok extends Thread {
    public final /* synthetic */ AnonymousClass5Of A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5Ok(AnonymousClass5Of r2) {
        super("ExoPlayer:SimpleDecoder");
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r7 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if ((r7 & 4) != 4) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r2.A00 |= 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if ((r7 & X.AnonymousClass972.MUTABLE_FLAG_MASK) != Integer.MIN_VALUE) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        r2.A00 = Integer.MIN_VALUE | r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        if ((r3.A00 & 134217728) != 134217728) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        r2.A00 = 134217728 | r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0 = r5.decode(r3, r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0 = r5.createUnexpectedDecodeException(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            X.5Of r5 = r9.A00
        L_0x0002:
            java.lang.Object r4 = r5.A07     // Catch:{ InterruptedException -> 0x00a4 }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x00a4 }
        L_0x0005:
            boolean r0 = r5.A05     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x0015
            java.util.ArrayDeque r0 = r5.A08     // Catch:{ all -> 0x00a1 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x001c
            int r0 = r5.A01     // Catch:{ all -> 0x00a1 }
            if (r0 <= 0) goto L_0x001c
        L_0x0015:
            boolean r0 = r5.A05     // Catch:{ all -> 0x00a1 }
            r6 = 0
            if (r0 == 0) goto L_0x0020
            monitor-exit(r4)     // Catch:{ all -> 0x00a1 }
            goto L_0x0095
        L_0x001c:
            r4.wait()     // Catch:{ all -> 0x00a1 }
            goto L_0x0005
        L_0x0020:
            java.util.ArrayDeque r0 = r5.A08     // Catch:{ all -> 0x00a1 }
            java.lang.Object r3 = r0.removeFirst()     // Catch:{ all -> 0x00a1 }
            X.4PQ r3 = (X.AnonymousClass4PQ) r3     // Catch:{ all -> 0x00a1 }
            X.5Oj[] r2 = r5.A0B     // Catch:{ all -> 0x00a1 }
            int r1 = r5.A01     // Catch:{ all -> 0x00a1 }
            r0 = 1
            int r1 = r1 - r0
            r5.A01 = r1     // Catch:{ all -> 0x00a1 }
            r2 = r2[r1]     // Catch:{ all -> 0x00a1 }
            boolean r8 = r5.A04     // Catch:{ all -> 0x00a1 }
            r5.A04 = r6     // Catch:{ all -> 0x00a1 }
            monitor-exit(r4)     // Catch:{ all -> 0x00a1 }
            r1 = 4
            int r7 = r3.A00     // Catch:{ InterruptedException -> 0x00a4 }
            r0 = r7 & 4
            if (r0 != r1) goto L_0x0046
            int r0 = r2.A00     // Catch:{ InterruptedException -> 0x00a4 }
            r0 = r0 | 4
            r2.A00 = r0     // Catch:{ InterruptedException -> 0x00a4 }
        L_0x0044:
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x00a4 }
            goto L_0x0069
        L_0x0046:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 & r1
            if (r7 != r1) goto L_0x0050
            int r0 = r2.A00     // Catch:{ InterruptedException -> 0x00a4 }
            r1 = r1 | r0
            r2.A00 = r1     // Catch:{ InterruptedException -> 0x00a4 }
        L_0x0050:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            int r0 = r3.A00     // Catch:{ InterruptedException -> 0x00a4 }
            r0 = r0 & r1
            if (r0 != r1) goto L_0x005c
            int r0 = r2.A00     // Catch:{ InterruptedException -> 0x00a4 }
            r1 = r1 | r0
            r2.A00 = r1     // Catch:{ InterruptedException -> 0x00a4 }
        L_0x005c:
            X.4Ay r0 = r5.decode(r3, r2, r8)     // Catch:{ OutOfMemoryError | RuntimeException -> 0x0061 }
            goto L_0x0066
        L_0x0061:
            r0 = move-exception
            X.4Ay r0 = r5.createUnexpectedDecodeException(r0)     // Catch:{ InterruptedException -> 0x00a4 }
        L_0x0066:
            if (r0 == 0) goto L_0x0044
            goto L_0x0099
        L_0x0069:
            boolean r0 = r5.A04     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x007a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2.A00     // Catch:{ all -> 0x0096 }
            r0 = r0 & r1
            if (r0 != r1) goto L_0x008d
            int r0 = r5.A02     // Catch:{ all -> 0x0096 }
            int r0 = r0 + 1
            r5.A02 = r0     // Catch:{ all -> 0x0096 }
        L_0x007a:
            r2.release()     // Catch:{ all -> 0x0096 }
        L_0x007d:
            r3.clear()     // Catch:{ all -> 0x0096 }
            X.4PQ[] r2 = r5.A0A     // Catch:{ all -> 0x0096 }
            int r1 = r5.A00     // Catch:{ all -> 0x0096 }
            int r0 = r1 + 1
            r5.A00 = r0     // Catch:{ all -> 0x0096 }
            r2[r1] = r3     // Catch:{ all -> 0x0096 }
            monitor-exit(r4)     // Catch:{ all -> 0x0096 }
            goto L_0x0002
        L_0x008d:
            r5.A02 = r6     // Catch:{ all -> 0x0096 }
            java.util.ArrayDeque r0 = r5.A09     // Catch:{ all -> 0x0096 }
            r0.addLast(r2)     // Catch:{ all -> 0x0096 }
            goto L_0x007d
        L_0x0095:
            return
        L_0x0096:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0096 }
            goto L_0x00a3
        L_0x0099:
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x00a4 }
            r5.A03 = r0     // Catch:{ all -> 0x009e }
            monitor-exit(r4)     // Catch:{ all -> 0x009e }
            return
        L_0x009e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x009e }
            goto L_0x00a3
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a1 }
        L_0x00a3:
            throw r0     // Catch:{ InterruptedException -> 0x00a4 }
        L_0x00a4:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Ok.run():void");
    }
}
