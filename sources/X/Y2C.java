package X;

public final /* synthetic */ class Y2C implements Runnable {
    public final /* synthetic */ Xnx A00;

    public /* synthetic */ Y2C(Xnx xnx) {
        this.A00 = xnx;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r0 = r18
            X.Xnx r7 = r0.A00
        L_0x0004:
            long r16 = java.lang.System.nanoTime()
            monitor-enter(r7)
            java.util.Deque r10 = r7.A04     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r15 = r10.iterator()     // Catch:{ all -> 0x00c1 }
            r9 = 0
            r8 = 0
            r13 = -9223372036854775808
            r4 = 0
            r12 = 0
        L_0x0015:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r5 = r15.next()     // Catch:{ all -> 0x00c1 }
            X.Y7U r5 = (X.Y7U) r5     // Catch:{ all -> 0x00c1 }
            java.util.List r6 = r5.A0D     // Catch:{ all -> 0x00c1 }
            r3 = 0
        L_0x0024:
            int r0 = r6.size()     // Catch:{ all -> 0x00c1 }
            if (r3 >= r0) goto L_0x0039
            java.lang.Object r11 = r6.get(r3)     // Catch:{ all -> 0x00c1 }
            java.lang.ref.Reference r11 = (java.lang.ref.Reference) r11     // Catch:{ all -> 0x00c1 }
            java.lang.Object r0 = r11.get()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0042
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0039:
            int r0 = r6.size()     // Catch:{ all -> 0x00c1 }
            if (r0 <= 0) goto L_0x0075
            int r12 = r12 + 1
            goto L_0x0015
        L_0x0042:
            X.Y5W r11 = (X.Y5W) r11     // Catch:{ all -> 0x00c1 }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "A connection to "
            r1.append(r0)     // Catch:{ all -> 0x00c1 }
            X.Xd1 r0 = r5.A0E     // Catch:{ all -> 0x00c1 }
            X.XdI r0 = r0.A02     // Catch:{ all -> 0x00c1 }
            X.STm r0 = r0.A0A     // Catch:{ all -> 0x00c1 }
            r1.append(r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = " was leaked. Did you forget to close a response body?"
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ all -> 0x00c1 }
            X.SPU r1 = X.SPU.A00     // Catch:{ all -> 0x00c1 }
            java.lang.Object r0 = r11.A00     // Catch:{ all -> 0x00c1 }
            r1.A04(r2, r0)     // Catch:{ all -> 0x00c1 }
            r6.remove(r3)     // Catch:{ all -> 0x00c1 }
            r0 = 1
            r5.A0C = r0     // Catch:{ all -> 0x00c1 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0024
            long r2 = r7.A02     // Catch:{ all -> 0x00c1 }
            long r0 = r16 - r2
            r5.A04 = r0     // Catch:{ all -> 0x00c1 }
        L_0x0075:
            int r4 = r4 + 1
            long r0 = r5.A04     // Catch:{ all -> 0x00c1 }
            long r2 = r16 - r0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            r8 = r5
            r13 = r2
            goto L_0x0015
        L_0x0082:
            long r5 = r7.A02     // Catch:{ all -> 0x00c1 }
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b3
            int r0 = r7.A01     // Catch:{ all -> 0x00c1 }
            if (r4 > r0) goto L_0x00b3
            if (r4 <= 0) goto L_0x0090
            long r5 = r5 - r13
            goto L_0x0096
        L_0x0090:
            if (r12 > 0) goto L_0x0096
            r7.A00 = r9     // Catch:{ all -> 0x00c1 }
            r5 = -1
        L_0x0096:
            monitor-exit(r7)     // Catch:{ all -> 0x00c1 }
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x009e
            return
        L_0x009e:
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0004
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r5 / r3
            long r3 = r3 * r1
            long r5 = r5 - r3
            monitor-enter(r7)
            int r0 = (int) r5
            r7.wait(r1, r0)     // Catch:{ InterruptedException -> 0x00b0 }
        L_0x00b0:
            monitor-exit(r7)     // Catch:{ all -> 0x00be }
            goto L_0x0004
        L_0x00b3:
            r10.remove(r8)     // Catch:{ all -> 0x00c1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00c1 }
            java.net.Socket r0 = r8.A06
            X.SUS.A0A(r0)
            goto L_0x0004
        L_0x00be:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00be }
            throw r0
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00c1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y2C.run():void");
    }
}
