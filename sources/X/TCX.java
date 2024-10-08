package X;

public final class TCX implements Runnable {
    public final /* synthetic */ ST9 A00;

    public TCX(ST9 st9) {
        this.A00 = st9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r3 != X.AnonymousClass05K.A0C) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            X.ST9 r2 = r5.A00
            X.TiD r0 = r2.A0M
            boolean r0 = r0.Ero()
            java.lang.String r4 = "keep_alive"
            if (r0 == 0) goto L_0x0073
            X.ST3 r0 = r2.A0w
            if (r0 == 0) goto L_0x0017
            java.lang.Integer r3 = r0.A0Y
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 1
            if (r3 == r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            X.TjG r1 = r2.A08
            if (r0 == 0) goto L_0x0029
            if (r1 == 0) goto L_0x0024
            java.lang.String r0 = "send ping"
            r1.Cgj(r4, r0)
        L_0x0024:
            r0 = 0
            r2.A0F(r0)
        L_0x0028:
            return
        L_0x0029:
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "not connected"
            r1.Cgj(r4, r0)
        L_0x0031:
            X.ST3 r0 = r2.A0w
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x003c
            return
        L_0x003c:
            r2.A0C()
            X.SHw r1 = r2.A0V
            monitor-enter(r1)
            java.util.concurrent.Future r0 = r1.A09     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x004d
            goto L_0x0063
        L_0x004d:
            X.Tgr r0 = r1.A06     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x005e
            int r0 = r1.A00     // Catch:{ all -> 0x006e }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x006e }
            X.C11262SHw.A00(r1)     // Catch:{ all -> 0x006e }
            r1.A01()     // Catch:{ all -> 0x006e }
            goto L_0x0061
        L_0x005e:
            r1.A01()     // Catch:{ all -> 0x0070 }
        L_0x0061:
            r0 = 1
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0028
            X.ST2 r1 = r2.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            r1.A0F = r0
            return
        L_0x006e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0073:
            X.TjG r1 = r2.A08
            if (r1 == 0) goto L_0x007d
            java.lang.String r0 = "should_not_be_connected"
            r1.Cgj(r4, r0)
        L_0x007d:
            X.RGw r0 = X.C8947RGw.KEEPALIVE_SHOULD_NOT_CONNECT
            r2.A08(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TCX.run():void");
    }
}
