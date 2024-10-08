package X;

import java.io.IOException;

/* renamed from: X.Y4e  reason: case insensitive filesystem */
public final class C22447Y4e implements YAG {
    public final /* synthetic */ C21464Xbw A00;
    public final /* synthetic */ Xo0 A01;

    public C22447Y4e(C21464Xbw xbw, Xo0 xo0) {
        this.A01 = xo0;
        this.A00 = xbw;
    }

    public final void DEl(IOException iOException, Y1T y1t) {
        this.A01.A00(iOException);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 208 */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010a, code lost:
        r4 = r8.A05;
        r2 = r8.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010e, code lost:
        if (r7 != 1) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0110, code lost:
        r7 = r2.A05();
        r5 = (X.Y7C) r4.A0L;
        r5.A00.scheduleCallback(new X.Y2X(r5, r7), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0134, code lost:
        r2.A08();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DfC(X.Y1T r16, X.Y1H r17) {
        /*
            r15 = this;
            r4 = r17
            X.Xcc r5 = r4.A0C
            X.Xo0 r3 = r15.A01     // Catch:{ IOException -> 0x01bc }
            int r7 = r4.A00     // Catch:{ IOException -> 0x01bc }
            java.lang.String r6 = "'"
            r0 = 101(0x65, float:1.42E-43)
            if (r7 != r0) goto L_0x01a7
            java.lang.String r0 = "Connection"
            r7 = 0
            r1 = r7
            X.Xt4 r8 = r4.A05     // Catch:{ IOException -> 0x01bc }
            java.lang.String r0 = r8.A03(r0)     // Catch:{ IOException -> 0x01bc }
            if (r0 == 0) goto L_0x001b
            r1 = r0
        L_0x001b:
            java.lang.String r2 = "Upgrade"
            boolean r0 = r2.equalsIgnoreCase(r1)     // Catch:{ IOException -> 0x01bc }
            if (r0 == 0) goto L_0x019b
            r1 = r7
            java.lang.String r0 = r8.A03(r2)     // Catch:{ IOException -> 0x01bc }
            if (r0 == 0) goto L_0x002b
            r1 = r0
        L_0x002b:
            java.lang.String r0 = "websocket"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ IOException -> 0x01bc }
            if (r0 == 0) goto L_0x018f
            java.lang.String r0 = "Sec-WebSocket-Accept"
            java.lang.String r0 = r8.A03(r0)     // Catch:{ IOException -> 0x01bc }
            if (r0 == 0) goto L_0x003c
            r7 = r0
        L_0x003c:
            java.lang.String r1 = r3.A0G     // Catch:{ IOException -> 0x01bc }
            java.lang.String r0 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ IOException -> 0x01bc }
            X.TAH r2 = X.TAH.A02(r0)     // Catch:{ IOException -> 0x01bc }
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0188 }
            byte[] r0 = r2.data     // Catch:{ NoSuchAlgorithmException -> 0x0188 }
            byte[] r0 = r1.digest(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0188 }
            X.TAH r0 = X.TAH.A03(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0188 }
            java.lang.String r2 = r0.A06()     // Catch:{ IOException -> 0x01bc }
            boolean r0 = r2.equals(r7)     // Catch:{ IOException -> 0x01bc }
            if (r0 == 0) goto L_0x017a
            if (r5 == 0) goto L_0x0172
            X.Xp1 r1 = r5.A03     // Catch:{ IOException -> 0x01bc }
            boolean r0 = r1.A08     // Catch:{ IOException -> 0x01bc }
            if (r0 != 0) goto L_0x01b7
            r6 = 1
            r1.A08 = r6     // Catch:{ IOException -> 0x01bc }
            X.TZ6 r0 = r1.A0E     // Catch:{ IOException -> 0x01bc }
            r0.A0C()     // Catch:{ IOException -> 0x01bc }
            X.YAz r0 = r5.A04     // Catch:{ IOException -> 0x01bc }
            X.Y7U r2 = r0.AJK()     // Catch:{ IOException -> 0x01bc }
            java.net.Socket r0 = r2.A06     // Catch:{ IOException -> 0x01bc }
            r8 = 0
            r0.setSoTimeout(r8)     // Catch:{ IOException -> 0x01bc }
            r2.A01()     // Catch:{ IOException -> 0x01bc }
            X.YCT r1 = r2.A0B     // Catch:{ IOException -> 0x01bc }
            X.YCS r0 = r2.A0A     // Catch:{ IOException -> 0x01bc }
            X.Y1F r7 = new X.Y1F     // Catch:{ IOException -> 0x01bc }
            r7.<init>(r5, r2, r0, r1)     // Catch:{ IOException -> 0x01bc }
            java.lang.String r1 = "OkHttp WebSocket "
            X.Xbw r0 = r15.A00     // Catch:{ Exception -> 0x016d }
            X.STm r0 = r0.A03     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = r0.A0A()     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x016d }
            monitor-enter(r3)     // Catch:{ Exception -> 0x016d }
            r3.A08 = r7     // Catch:{ all -> 0x00e3 }
            X.YCS r2 = r7.A00     // Catch:{ all -> 0x00e3 }
            java.util.Random r1 = r3.A0J     // Catch:{ all -> 0x00e3 }
            X.SHq r0 = new X.SHq     // Catch:{ all -> 0x00e3 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00e3 }
            r3.A0A = r0     // Catch:{ all -> 0x00e3 }
            X.Xt4 r0 = X.SUS.A04     // Catch:{ all -> 0x00e3 }
            X.Y4C r0 = new X.Y4C     // Catch:{ all -> 0x00e3 }
            r0.<init>(r4, r8)     // Catch:{ all -> 0x00e3 }
            java.util.concurrent.ScheduledThreadPoolExecutor r8 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch:{ all -> 0x00e3 }
            r8.<init>(r6, r0)     // Catch:{ all -> 0x00e3 }
            r3.A05 = r8     // Catch:{ all -> 0x00e3 }
            long r10 = r3.A0E     // Catch:{ all -> 0x00e3 }
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00c7
            X.Y2F r9 = new X.Y2F     // Catch:{ all -> 0x00e3 }
            r9.<init>(r3)     // Catch:{ all -> 0x00e3 }
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00e3 }
            r12 = r10
            r8.scheduleAtFixedRate(r9, r10, r12, r14)     // Catch:{ all -> 0x00e3 }
        L_0x00c7:
            java.util.ArrayDeque r2 = r3.A0H     // Catch:{ all -> 0x00e3 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00e3 }
            if (r2 != 0) goto L_0x00d8
            java.util.concurrent.ScheduledExecutorService r4 = r3.A05     // Catch:{ all -> 0x00e3 }
            if (r4 == 0) goto L_0x00d8
            java.lang.Runnable r2 = r3.A0F     // Catch:{ all -> 0x00e3 }
            r4.execute(r2)     // Catch:{ all -> 0x00e3 }
        L_0x00d8:
            monitor-exit(r3)     // Catch:{ all -> 0x00e3 }
            X.YCT r4 = r7.A01     // Catch:{ Exception -> 0x016d }
            X.XqA r2 = new X.XqA     // Catch:{ Exception -> 0x016d }
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x016d }
            r3.A09 = r2     // Catch:{ Exception -> 0x016d }
            goto L_0x0122
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e3 }
            goto L_0x0105
        L_0x00e6:
            boolean r2 = r8.A02     // Catch:{ Exception -> 0x016d }
            if (r2 != 0) goto L_0x0168
            long r4 = r8.A01     // Catch:{ Exception -> 0x016d }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0106
            X.YCT r2 = r8.A07     // Catch:{ Exception -> 0x016d }
            X.TPe r9 = r8.A06     // Catch:{ Exception -> 0x016d }
            r2.E6S(r9, r4)     // Catch:{ Exception -> 0x016d }
            boolean r2 = r8.A08     // Catch:{ Exception -> 0x016d }
            if (r2 != 0) goto L_0x0106
            r0 = 0
            r9.A0H(r0)     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = "seek"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ Exception -> 0x016d }
        L_0x0105:
            throw r0     // Catch:{ Exception -> 0x016d }
        L_0x0106:
            boolean r2 = r8.A04     // Catch:{ Exception -> 0x016d }
            if (r2 == 0) goto L_0x014a
            X.Xo0 r4 = r8.A05     // Catch:{ Exception -> 0x016d }
            X.TPe r2 = r8.A06     // Catch:{ Exception -> 0x016d }
            if (r7 != r6) goto L_0x0134
            java.lang.String r7 = r2.A05()     // Catch:{ Exception -> 0x016d }
            X.XTa r5 = r4.A0L     // Catch:{ Exception -> 0x016d }
            X.Y7C r5 = (X.Y7C) r5     // Catch:{ Exception -> 0x016d }
            com.facebook.react.devsupport.CxxInspectorPackagerConnection$DelegateImpl r4 = r5.A00     // Catch:{ Exception -> 0x016d }
            X.Y2X r2 = new X.Y2X     // Catch:{ Exception -> 0x016d }
            r2.<init>(r5, r7)     // Catch:{ Exception -> 0x016d }
            r4.scheduleCallback(r2, r0)     // Catch:{ Exception -> 0x016d }
        L_0x0122:
            int r4 = r3.A00     // Catch:{ Exception -> 0x016d }
            r2 = -1
            if (r4 != r2) goto L_0x0171
            X.XqA r8 = r3.A09     // Catch:{ Exception -> 0x016d }
            X.C22001XqA.A01(r8)     // Catch:{ Exception -> 0x016d }
            boolean r2 = r8.A03     // Catch:{ Exception -> 0x016d }
            if (r2 == 0) goto L_0x0138
            X.C22001XqA.A00(r8)     // Catch:{ Exception -> 0x016d }
            goto L_0x0122
        L_0x0134:
            r2.A08()     // Catch:{ Exception -> 0x016d }
            goto L_0x0122
        L_0x0138:
            int r7 = r8.A00     // Catch:{ Exception -> 0x016d }
            if (r7 == r6) goto L_0x00e6
            r2 = 2
            if (r7 == r2) goto L_0x00e6
            java.lang.String r1 = "Unknown opcode: "
            java.lang.String r0 = java.lang.Integer.toHexString(r7)     // Catch:{ Exception -> 0x016d }
            java.net.ProtocolException r0 = X.C21055XCg.A0V(r1, r0)     // Catch:{ Exception -> 0x016d }
            goto L_0x0105
        L_0x014a:
            boolean r2 = r8.A02     // Catch:{ Exception -> 0x016d }
            if (r2 != 0) goto L_0x0159
            X.C22001XqA.A01(r8)     // Catch:{ Exception -> 0x016d }
            boolean r2 = r8.A03     // Catch:{ Exception -> 0x016d }
            if (r2 == 0) goto L_0x0159
            X.C22001XqA.A00(r8)     // Catch:{ Exception -> 0x016d }
            goto L_0x014a
        L_0x0159:
            int r2 = r8.A00     // Catch:{ Exception -> 0x016d }
            if (r2 == 0) goto L_0x00e6
            java.lang.String r1 = "Expected continuation opcode. Got: "
            java.lang.String r0 = java.lang.Integer.toHexString(r2)     // Catch:{ Exception -> 0x016d }
            java.net.ProtocolException r0 = X.C21055XCg.A0V(r1, r0)     // Catch:{ Exception -> 0x016d }
            goto L_0x0105
        L_0x0168:
            java.io.IOException r0 = X.C21055XCg.A0H()     // Catch:{ Exception -> 0x016d }
            goto L_0x0105
        L_0x016d:
            r0 = move-exception
            r3.A00(r0)
        L_0x0171:
            return
        L_0x0172:
            java.lang.String r0 = "Web Socket exchange missing: bad interceptor?"
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch:{ IOException -> 0x01bc }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01bc }
            goto L_0x01bb
        L_0x017a:
            java.lang.String r1 = "Expected 'Sec-WebSocket-Accept' header value '"
            java.lang.String r0 = "' but was '"
            java.lang.String r0 = X.002.A11(r1, r2, r0, r7, r6)     // Catch:{ IOException -> 0x01bc }
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch:{ IOException -> 0x01bc }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01bc }
            goto L_0x01bb
        L_0x0188:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ IOException -> 0x01bc }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01bc }
            goto L_0x01bb
        L_0x018f:
            java.lang.String r0 = "Expected 'Upgrade' header value 'websocket' but was '"
            java.lang.String r0 = X.002.A0g(r0, r1, r6)     // Catch:{ IOException -> 0x01bc }
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch:{ IOException -> 0x01bc }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01bc }
            goto L_0x01bb
        L_0x019b:
            java.lang.String r0 = "Expected 'Connection' header value 'Upgrade' but was '"
            java.lang.String r0 = X.002.A0g(r0, r1, r6)     // Catch:{ IOException -> 0x01bc }
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch:{ IOException -> 0x01bc }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01bc }
            goto L_0x01bb
        L_0x01a7:
            java.lang.String r2 = "Expected HTTP 101 response but was '"
            java.lang.String r1 = " "
            java.lang.String r0 = r4.A03     // Catch:{ IOException -> 0x01bc }
            java.lang.String r0 = X.002.A08(r7, r2, r1, r0, r6)     // Catch:{ IOException -> 0x01bc }
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch:{ IOException -> 0x01bc }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01bc }
            goto L_0x01bb
        L_0x01b7:
            java.lang.IllegalStateException r1 = X.Pxe.A0i()     // Catch:{ IOException -> 0x01bc }
        L_0x01bb:
            throw r1     // Catch:{ IOException -> 0x01bc }
        L_0x01bc:
            r3 = move-exception
            if (r5 == 0) goto L_0x01c6
            r2 = 0
            r1 = 1
            X.Xp1 r0 = r5.A03
            r0.A02(r2, r5, r1, r1)
        L_0x01c6:
            X.Xo0 r0 = r15.A01
            r0.A00(r3)
            X.SUS.A09(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22447Y4e.DfC(X.Y1T, X.Y1H):void");
    }
}
