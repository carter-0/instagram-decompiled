package X;

/* renamed from: X.S2w  reason: case insensitive filesystem */
public final class C10964S2w {
    public Integer A00 = AnonymousClass05K.A00;
    public final long A01;
    public final long A02;
    public final SNO A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:76|75|77|78|(3:80|81|226)(1:225)|221) */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02fb, code lost:
        if (r6 != r0) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0326, code lost:
        if (r1 != 5) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        r2 = new X.SHB(r3, r5 + 1, 0);
        r8 = new X.C10671Rw6[]{new X.C10671Rw6(r2, r2.A00 + 4)};
        r7 = X.Pxe.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r1 = new byte[12];
        r1[0] = (byte) ((65280 & r14) >>> 8);
        X.Pxe.A1H(r14, r1, 1);
        r1[2] = 0;
        r1[2] = 0;
        r1[2] = 0;
        r1[2] = 0;
        r1[2] = 0;
        r1[2] = 1;
        r1[3] = 0;
        r1[3] = 0;
        r1[3] = 0;
        r1[4] = 0;
        r1[5] = 1;
        r1[6] = 0;
        r1[7] = 0;
        r1[8] = 0;
        r1[9] = 0;
        r1[10] = 0;
        r1[11] = 0;
        r7.write(r1);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        if (r0 >= 1) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00da, code lost:
        r5 = r8[r0].A01.A02;
        r4 = r5.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e4, code lost:
        if (r3 >= r4) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e6, code lost:
        r1 = r5[r3].getBytes(com.facebook.react.views.webview.ReactWebViewManager.HTML_ENCODING);
        r0 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
        if (r0 > 63) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f1, code lost:
        r7.write(r0);
        r7.write(r1);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fa, code lost:
        r7.write(0);
        r7.write(0);
        r7.write(1);
        r7.write(0);
        r7.write(1);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0112, code lost:
        throw X.AnonymousClass7TE.A0z("token may not be longer than 63 bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r5 = r7.toByteArray();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x015d */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03fe A[SYNTHETIC, Splitter:B:180:0x03fe] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0438 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0401 A[EDGE_INSN: B:217:0x0401->B:182:0x0401 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03ef A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x012f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0135 A[Catch:{ IOException -> 0x0402 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016a A[SYNTHETIC, Splitter:B:80:0x016a] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0178 A[SYNTHETIC, Splitter:B:87:0x0178] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00(java.lang.String r37) {
        /*
            r36 = this;
            r12 = r36
            r11 = r37
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ UnknownHostException -> 0x003d }
            r12.A00 = r0     // Catch:{ UnknownHostException -> 0x003d }
            r7 = 5
            r5 = 0
        L_0x000c:
            java.net.InetAddress[] r4 = java.net.InetAddress.getAllByName(r11)     // Catch:{ UnknownHostException -> 0x0024 }
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ UnknownHostException -> 0x0024 }
            if (r4 == 0) goto L_0x0434
            r2 = 0
            int r1 = r4.length     // Catch:{ UnknownHostException -> 0x0024 }
        L_0x0018:
            if (r2 >= r1) goto L_0x0434
            r0 = r4[r2]     // Catch:{ UnknownHostException -> 0x0024 }
            if (r0 == 0) goto L_0x0021
            r3.add(r0)     // Catch:{ UnknownHostException -> 0x0024 }
        L_0x0021:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0024:
            r3 = move-exception
            long r1 = r12.A01     // Catch:{ UnknownHostException -> 0x003d }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003c
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ UnknownHostException -> 0x003d }
            r12.A00 = r0     // Catch:{ UnknownHostException -> 0x003d }
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0037
            r0 = 1
            long r5 = r5 + r0
            goto L_0x000c
        L_0x0037:
            java.net.UnknownHostException r3 = new java.net.UnknownHostException     // Catch:{ UnknownHostException -> 0x003d }
            r3.<init>()     // Catch:{ UnknownHostException -> 0x003d }
        L_0x003c:
            throw r3     // Catch:{ UnknownHostException -> 0x003d }
        L_0x003d:
            r3 = move-exception
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x044c
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r12.A00 = r0
            r18 = 5
            r16 = 0
        L_0x004a:
            X.SNO r6 = r12.A03     // Catch:{ UnknownHostException -> 0x041f }
            r10 = 0
            java.lang.String r0 = "\\."
            java.lang.String[] r3 = r11.split(r0)     // Catch:{ UnknownHostException -> 0x041f }
            java.util.concurrent.atomic.AtomicInteger r0 = X.C9940Rjt.A00     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r0.getAndIncrement()     // Catch:{ UnknownHostException -> 0x041f }
            short r14 = (short) r0     // Catch:{ UnknownHostException -> 0x041f }
            r9 = 1
            int r4 = r3.length     // Catch:{ UnknownHostException -> 0x041f }
            r2 = 0
            r5 = 0
        L_0x005e:
            if (r2 >= r4) goto L_0x007c
            r1 = r3[r2]     // Catch:{ UnknownHostException -> 0x041f }
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0418 }
            int r1 = r0.length     // Catch:{ UnknownHostException -> 0x041f }
            r0 = 63
            if (r1 > r0) goto L_0x0073
            int r0 = r1 + 1
            int r5 = r5 + r0
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0073:
            java.lang.String r0 = "token may not be longer than 63 bytes"
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x041e
        L_0x007c:
            int r0 = r5 + 1
            X.SHB r2 = new X.SHB     // Catch:{ UnknownHostException -> 0x041f }
            r2.<init>(r3, r0, r10)     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r2.A00     // Catch:{ UnknownHostException -> 0x041f }
            int r1 = r0 + 4
            X.Rw6 r0 = new X.Rw6     // Catch:{ UnknownHostException -> 0x041f }
            r0.<init>(r2, r1)     // Catch:{ UnknownHostException -> 0x041f }
            X.Rw6[] r8 = new X.C10671Rw6[]{r0}     // Catch:{ UnknownHostException -> 0x041f }
            java.io.ByteArrayOutputStream r7 = X.Pxe.A0b()     // Catch:{ UnknownHostException -> 0x041f }
            r0 = 12
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x0113 }
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r14
            int r0 = r0 >>> 8
            byte r0 = (byte) r0     // Catch:{ IOException -> 0x0113 }
            r1[r10] = r0     // Catch:{ IOException -> 0x0113 }
            X.Pxe.A1H(r14, r1, r9)     // Catch:{ IOException -> 0x0113 }
            r0 = 2
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r1[r0] = r9     // Catch:{ IOException -> 0x0113 }
            r0 = 3
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r0 = 4
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r0 = 5
            r1[r0] = r9     // Catch:{ IOException -> 0x0113 }
            r0 = 6
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r0 = 7
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r0 = 8
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r0 = 9
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r0 = 10
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r0 = 11
            r1[r0] = r10     // Catch:{ IOException -> 0x0113 }
            r7.write(r1)     // Catch:{ IOException -> 0x0113 }
            r0 = 0
        L_0x00d8:
            if (r0 >= r9) goto L_0x0115
            r0 = r8[r0]     // Catch:{ IOException -> 0x0113 }
            X.SHB r0 = r0.A01     // Catch:{ IOException -> 0x0113 }
            java.lang.String[] r5 = r0.A02     // Catch:{ IOException -> 0x0113 }
            int r4 = r5.length     // Catch:{ IOException -> 0x0113 }
            r3 = 0
        L_0x00e2:
            r2 = 63
            if (r3 >= r4) goto L_0x00fa
            r1 = r5[r3]     // Catch:{ IOException -> 0x0113 }
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch:{ IOException -> 0x0113 }
            int r0 = r1.length     // Catch:{ IOException -> 0x0113 }
            if (r0 > r2) goto L_0x010b
            r7.write(r0)     // Catch:{ IOException -> 0x0113 }
            r7.write(r1)     // Catch:{ IOException -> 0x0113 }
            int r3 = r3 + 1
            goto L_0x00e2
        L_0x00fa:
            r7.write(r10)     // Catch:{ IOException -> 0x0113 }
            r7.write(r10)     // Catch:{ IOException -> 0x0113 }
            r7.write(r9)     // Catch:{ IOException -> 0x0113 }
            r7.write(r10)     // Catch:{ IOException -> 0x0113 }
            r7.write(r9)     // Catch:{ IOException -> 0x0113 }
            r0 = 1
            goto L_0x00d8
        L_0x010b:
            java.lang.String r0 = "token may not be longer than 63 bytes"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IOException -> 0x0113 }
            throw r0     // Catch:{ IOException -> 0x0113 }
        L_0x0113:
            r5 = 0
            goto L_0x0119
        L_0x0115:
            byte[] r5 = r7.toByteArray()     // Catch:{ UnknownHostException -> 0x041f }
        L_0x0119:
            r0 = 512(0x200, float:7.175E-43)
            byte[] r8 = new byte[r0]     // Catch:{ UnknownHostException -> 0x041f }
            java.net.DatagramPacket r4 = new java.net.DatagramPacket     // Catch:{ UnknownHostException -> 0x041f }
            r4.<init>(r8, r0)     // Catch:{ UnknownHostException -> 0x041f }
            java.util.List r1 = r6.A01     // Catch:{ IOException -> 0x0402 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0402 }
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r1)     // Catch:{ all -> 0x03fb }
            monitor-exit(r1)     // Catch:{ all -> 0x03fb }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x0402 }
            r13 = 0
        L_0x012f:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x0402 }
            if (r0 == 0) goto L_0x0176
            java.lang.Object r3 = r15.next()     // Catch:{ IOException -> 0x0402 }
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3     // Catch:{ IOException -> 0x0402 }
            if (r13 != 0) goto L_0x0176
            r7 = 0
            int r0 = r6.A00     // Catch:{ InterruptedIOException -> 0x015d }
            java.net.DatagramSocket r2 = new java.net.DatagramSocket     // Catch:{ InterruptedIOException -> 0x015d }
            r2.<init>()     // Catch:{ InterruptedIOException -> 0x015d }
            r2.connect(r3)     // Catch:{ InterruptedIOException -> 0x015c, all -> 0x016e }
            r2.setSoTimeout(r0)     // Catch:{ InterruptedIOException -> 0x015c, all -> 0x016e }
            int r1 = r5.length     // Catch:{ InterruptedIOException -> 0x015c, all -> 0x016e }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x015c, all -> 0x016e }
            r0.<init>(r5, r1)     // Catch:{ InterruptedIOException -> 0x015c, all -> 0x016e }
            r2.send(r0)     // Catch:{ InterruptedIOException -> 0x015c, all -> 0x016e }
            r2.receive(r4)     // Catch:{ InterruptedIOException -> 0x015c, all -> 0x016e }
            r2.close()     // Catch:{ IOException -> 0x0402 }
            r13 = 1
            goto L_0x012f
        L_0x015c:
            r7 = r2
        L_0x015d:
            java.lang.String r1 = X.SNO.A02     // Catch:{ all -> 0x0171 }
            java.lang.String r0 = "Timeout while querying %s for %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r11}     // Catch:{ all -> 0x0171 }
            X.0KC.A0P(r1, r0, r2)     // Catch:{ all -> 0x0171 }
            if (r7 == 0) goto L_0x012f
            r7.close()     // Catch:{ IOException -> 0x0402 }
            goto L_0x012f
        L_0x016e:
            r0 = move-exception
            r7 = r2
            goto L_0x0172
        L_0x0171:
            r0 = move-exception
        L_0x0172:
            if (r7 == 0) goto L_0x0401
            goto L_0x03fe
        L_0x0176:
            if (r13 == 0) goto L_0x03ef
            byte r1 = r8[r10]     // Catch:{ UnknownHostException -> 0x041f }
            byte r0 = r8[r9]     // Catch:{ UnknownHostException -> 0x041f }
            int r1 = r1 << 8
            r27 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r27
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r0 = (short) r1     // Catch:{ UnknownHostException -> 0x041f }
            r35 = r0
            r0 = 2
            byte r0 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            r0 = r0 & 2
            boolean r26 = X.AnonymousClass7TF.A1P(r0)
            r0 = 3
            byte r0 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            r0 = r0 & 15
            byte r2 = (byte) r0     // Catch:{ UnknownHostException -> 0x041f }
            r0 = 4
            byte r1 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            r0 = 5
            byte r0 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            int r1 = r1 << 8
            r1 = r1 & r27
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r4 = (short) r1     // Catch:{ UnknownHostException -> 0x041f }
            r0 = 6
            byte r1 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            r0 = 7
            byte r0 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            int r1 = r1 << 8
            r1 = r1 & r27
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r7 = (short) r1     // Catch:{ UnknownHostException -> 0x041f }
            short r15 = (short) r2     // Catch:{ UnknownHostException -> 0x041f }
            r13 = 12
            r6 = 0
            r3 = 0
        L_0x01b9:
            if (r3 >= r4) goto L_0x01d7
            X.SHB r0 = X.SHB.A00(r8, r13)     // Catch:{ UnknownHostException -> 0x041f }
            int r2 = r0.A00     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r13 + r2
            r1 = 512(0x200, float:7.175E-43)
            int r0 = r0 + 4
            if (r1 < r0) goto L_0x01cf
            int r0 = r2 + 4
            int r13 = r13 + r0
            int r3 = r3 + 1
            goto L_0x01b9
        L_0x01cf:
            java.lang.String r0 = "insufficient data"
            java.lang.IllegalArgumentException r2 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x041e
        L_0x01d7:
            X.S2x[] r0 = new X.C10965S2x[r7]     // Catch:{ UnknownHostException -> 0x041f }
            r25 = r0
        L_0x01db:
            if (r6 >= r7) goto L_0x0277
            X.SHB r5 = X.SHB.A00(r8, r13)     // Catch:{ UnknownHostException -> 0x041f }
            int r4 = r5.A00     // Catch:{ UnknownHostException -> 0x041f }
            int r24 = r13 + r4
            r0 = 512(0x200, float:7.175E-43)
            r3 = 512(0x200, float:7.175E-43)
            int r2 = r24 + 10
            java.lang.String r23 = "Insufficient data"
            if (r0 < r2) goto L_0x0271
            byte r1 = r8[r24]     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r24 + 1
            byte r0 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            int r1 = r1 << 8
            r1 = r1 & r27
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r0 = (short) r1     // Catch:{ UnknownHostException -> 0x041f }
            r33 = r0
            int r0 = r24 + 2
            byte r1 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r0 + 1
            byte r0 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            int r1 = r1 << 8
            r1 = r1 & r27
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r0 = (short) r1     // Catch:{ UnknownHostException -> 0x041f }
            r34 = r0
            int r22 = r24 + 4
            byte r1 = r8[r22]     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r22 + 1
            byte r20 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r22 + 2
            byte r21 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r22 + 3
            byte r0 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            int r31 = r1 << 24
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r31 = r31 & r1
            int r20 = r20 << 16
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r20 = r20 & r1
            r31 = r31 | r20
            int r1 = r21 << 8
            r1 = r1 & r27
            r31 = r31 | r1
            r0 = r0 & 255(0xff, float:3.57E-43)
            r31 = r31 | r0
            int r0 = r24 + 8
            byte r1 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r0 + 1
            byte r0 = r8[r0]     // Catch:{ UnknownHostException -> 0x041f }
            int r1 = r1 << 8
            r1 = r1 & r27
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r1 = (short) r1     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r2 + r1
            if (r3 < r0) goto L_0x026b
            byte[] r0 = new byte[r1]     // Catch:{ UnknownHostException -> 0x041f }
            java.lang.System.arraycopy(r8, r2, r0, r10, r1)     // Catch:{ UnknownHostException -> 0x041f }
            int r2 = r4 + 10
            int r1 = r1 + r2
            X.S2x r2 = new X.S2x     // Catch:{ UnknownHostException -> 0x041f }
            r28 = r2
            r29 = r5
            r30 = r0
            r32 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34)     // Catch:{ UnknownHostException -> 0x041f }
            r25[r6] = r2     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r2.A00     // Catch:{ UnknownHostException -> 0x041f }
            int r13 = r13 + r0
            int r6 = r6 + 1
            goto L_0x01db
        L_0x026b:
            java.lang.IllegalArgumentException r2 = X.AnonymousClass7TE.A0w(r23)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x041e
        L_0x0271:
            java.lang.IllegalArgumentException r2 = X.AnonymousClass7TE.A0w(r23)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x041e
        L_0x0277:
            r0 = r35
            if (r0 != r14) goto L_0x03e3
            if (r26 != 0) goto L_0x03d7
            if (r15 != 0) goto L_0x03cb
            if (r7 == 0) goto L_0x03bf
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ UnknownHostException -> 0x041f }
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ UnknownHostException -> 0x041f }
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()     // Catch:{ UnknownHostException -> 0x041f }
            r4 = 0
        L_0x028e:
            if (r4 >= r7) goto L_0x035e
            r3 = r25[r4]     // Catch:{ UnknownHostException -> 0x041f }
            X.SHB r5 = r3.A02     // Catch:{ UnknownHostException -> 0x041f }
            java.lang.StringBuilder r13 = X.AnonymousClass7TE.A1A()     // Catch:{ UnknownHostException -> 0x041f }
            java.lang.String[] r1 = r5.A02     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r1.length     // Catch:{ UnknownHostException -> 0x041f }
            r23 = r0
            r14 = 0
            r15 = 0
        L_0x029f:
            r6 = 46
            r0 = r23
            if (r15 >= r0) goto L_0x02b0
            r0 = r1[r15]     // Catch:{ UnknownHostException -> 0x041f }
            r13.append(r0)     // Catch:{ UnknownHostException -> 0x041f }
            r13.append(r6)     // Catch:{ UnknownHostException -> 0x041f }
            int r15 = r15 + 1
            goto L_0x029f
        L_0x02b0:
            short r0 = r5.A01     // Catch:{ UnknownHostException -> 0x041f }
            if (r0 == 0) goto L_0x02c8
            X.SHB r0 = X.SHB.A00(r8, r0)     // Catch:{ UnknownHostException -> 0x041f }
            java.lang.String[] r5 = r0.A02     // Catch:{ UnknownHostException -> 0x041f }
            int r1 = r5.length     // Catch:{ UnknownHostException -> 0x041f }
        L_0x02bb:
            if (r14 >= r1) goto L_0x02c8
            r0 = r5[r14]     // Catch:{ UnknownHostException -> 0x041f }
            r13.append(r0)     // Catch:{ UnknownHostException -> 0x041f }
            r13.append(r6)     // Catch:{ UnknownHostException -> 0x041f }
            int r14 = r14 + 1
            goto L_0x02bb
        L_0x02c8:
            int r0 = r13.length()     // Catch:{ UnknownHostException -> 0x041f }
            if (r0 <= 0) goto L_0x02d7
            int r0 = r13.length()     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r0 + -1
            r13.setLength(r0)     // Catch:{ UnknownHostException -> 0x041f }
        L_0x02d7:
            java.lang.String r13 = r13.toString()     // Catch:{ UnknownHostException -> 0x041f }
            java.lang.String r5 = X.SNO.A02     // Catch:{ UnknownHostException -> 0x041f }
            int r4 = r4 + 1
            short r1 = r3.A03     // Catch:{ UnknownHostException -> 0x041f }
            if (r1 != r9) goto L_0x02fd
            short r6 = r3.A04     // Catch:{ UnknownHostException -> 0x041f }
            r0 = 5
            if (r6 == r0) goto L_0x02fd
            if (r6 != r9) goto L_0x02f0
            byte[] r0 = r3.A05     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r0.length     // Catch:{ UnknownHostException -> 0x041f }
            short r6 = (short) r0     // Catch:{ UnknownHostException -> 0x041f }
            r0 = 4
            goto L_0x02fa
        L_0x02f0:
            r0 = 28
            if (r6 != r0) goto L_0x02fd
            byte[] r0 = r3.A05     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r0.length     // Catch:{ UnknownHostException -> 0x041f }
            short r6 = (short) r0     // Catch:{ UnknownHostException -> 0x041f }
            r0 = 16
        L_0x02fa:
            r14 = 1
            if (r6 == r0) goto L_0x02fe
        L_0x02fd:
            r14 = 0
        L_0x02fe:
            if (r14 == 0) goto L_0x031a
            byte[] r0 = r3.A05     // Catch:{ UnknownHostException -> 0x041f }
            java.net.InetAddress r5 = java.net.InetAddress.getByAddress(r13, r0)     // Catch:{ UnknownHostException -> 0x041f }
            int r0 = r3.A01     // Catch:{ UnknownHostException -> 0x041f }
            long r0 = X.Pxf.A0E(r0)     // Catch:{ UnknownHostException -> 0x041f }
            long r0 = r0 + r21
            X.S19 r3 = new X.S19     // Catch:{ UnknownHostException -> 0x041f }
            r3.<init>(r5, r0)     // Catch:{ UnknownHostException -> 0x041f }
            r0 = r20
            r0.add(r3)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x028e
        L_0x031a:
            if (r1 != r9) goto L_0x0328
            short r1 = r3.A04     // Catch:{ UnknownHostException -> 0x041f }
            if (r1 == r9) goto L_0x0328
            r0 = 28
            if (r1 == r0) goto L_0x0328
            r0 = 5
            r6 = 1
            if (r1 == r0) goto L_0x0329
        L_0x0328:
            r6 = 0
        L_0x0329:
            if (r6 == 0) goto L_0x0353
            byte[] r0 = r3.A05     // Catch:{ UnknownHostException -> 0x041f }
            X.SHB r0 = X.SHB.A00(r0, r10)     // Catch:{ UnknownHostException -> 0x041f }
            java.lang.String[] r6 = r0.A02     // Catch:{ UnknownHostException -> 0x041f }
            java.lang.String r5 = "."
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ UnknownHostException -> 0x041f }
            r1 = 0
        L_0x033a:
            int r0 = r6.length     // Catch:{ UnknownHostException -> 0x041f }
            if (r1 >= r0) goto L_0x034a
            if (r1 <= 0) goto L_0x0342
            r3.append(r5)     // Catch:{ UnknownHostException -> 0x041f }
        L_0x0342:
            r0 = r6[r1]     // Catch:{ UnknownHostException -> 0x041f }
            r3.append(r0)     // Catch:{ UnknownHostException -> 0x041f }
            int r1 = r1 + 1
            goto L_0x033a
        L_0x034a:
            java.lang.String r0 = r3.toString()     // Catch:{ UnknownHostException -> 0x041f }
            r2.put(r0, r13)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x028e
        L_0x0353:
            java.lang.Object[] r1 = new java.lang.Object[]{r3}     // Catch:{ UnknownHostException -> 0x041f }
            java.lang.String r0 = "Unexpected DNS record skipped: %s"
            X.0KC.A0P(r5, r0, r1)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x028e
        L_0x035e:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ UnknownHostException -> 0x041f }
            java.util.Iterator r7 = r20.iterator()     // Catch:{ UnknownHostException -> 0x041f }
        L_0x0366:
            boolean r0 = r7.hasNext()     // Catch:{ UnknownHostException -> 0x041f }
            if (r0 == 0) goto L_0x03a2
            java.lang.Object r6 = r7.next()     // Catch:{ UnknownHostException -> 0x041f }
            X.S19 r6 = (X.S19) r6     // Catch:{ UnknownHostException -> 0x041f }
            java.net.InetAddress r3 = r6.A01     // Catch:{ UnknownHostException -> 0x041f }
            java.lang.String r1 = r3.getHostName()     // Catch:{ UnknownHostException -> 0x041f }
            boolean r0 = r11.equals(r1)     // Catch:{ UnknownHostException -> 0x041f }
            if (r0 == 0) goto L_0x0382
            r5.add(r6)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x0366
        L_0x0382:
            if (r1 == 0) goto L_0x0366
            boolean r0 = r11.equals(r1)     // Catch:{ UnknownHostException -> 0x041f }
            if (r0 != 0) goto L_0x038f
            java.lang.String r1 = X.DbS.A0r(r1, r2)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x0382
        L_0x038f:
            byte[] r0 = r3.getAddress()     // Catch:{ UnknownHostException -> 0x041f }
            java.net.InetAddress r4 = java.net.InetAddress.getByAddress(r1, r0)     // Catch:{ UnknownHostException -> 0x041f }
            long r0 = r6.A00     // Catch:{ UnknownHostException -> 0x041f }
            X.S19 r3 = new X.S19     // Catch:{ UnknownHostException -> 0x041f }
            r3.<init>(r4, r0)     // Catch:{ UnknownHostException -> 0x041f }
            r5.add(r3)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x0366
        L_0x03a2:
            r5.size()     // Catch:{ UnknownHostException -> 0x041f }
            java.util.ArrayList r3 = X.Pxg.A14(r5)     // Catch:{ UnknownHostException -> 0x041f }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ UnknownHostException -> 0x041f }
        L_0x03ad:
            boolean r0 = r1.hasNext()     // Catch:{ UnknownHostException -> 0x041f }
            if (r0 == 0) goto L_0x0434
            java.lang.Object r0 = r1.next()     // Catch:{ UnknownHostException -> 0x041f }
            X.S19 r0 = (X.S19) r0     // Catch:{ UnknownHostException -> 0x041f }
            java.net.InetAddress r0 = r0.A01     // Catch:{ UnknownHostException -> 0x041f }
            r3.add(r0)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x03ad
        L_0x03bf:
            java.lang.String r0 = "No answers received in response while trying to resolve "
            java.lang.String r0 = X.002.A0R(r0, r11)     // Catch:{ UnknownHostException -> 0x041f }
            java.net.UnknownHostException r2 = new java.net.UnknownHostException     // Catch:{ UnknownHostException -> 0x041f }
            r2.<init>(r0)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x041e
        L_0x03cb:
            java.lang.String r0 = "Error code was set in response while trying to resolve "
            java.lang.String r0 = X.002.A0R(r0, r11)     // Catch:{ UnknownHostException -> 0x041f }
            java.net.UnknownHostException r2 = new java.net.UnknownHostException     // Catch:{ UnknownHostException -> 0x041f }
            r2.<init>(r0)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x041e
        L_0x03d7:
            java.lang.String r0 = "Received truncated DNS response while trying to resolve "
            java.lang.String r0 = X.002.A0R(r0, r11)     // Catch:{ UnknownHostException -> 0x041f }
            java.net.UnknownHostException r2 = new java.net.UnknownHostException     // Catch:{ UnknownHostException -> 0x041f }
            r2.<init>(r0)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x041e
        L_0x03e3:
            java.lang.String r0 = "Received DNS response with unexpected id while trying to resolve "
            java.lang.String r0 = X.002.A0R(r0, r11)     // Catch:{ UnknownHostException -> 0x041f }
            java.net.UnknownHostException r2 = new java.net.UnknownHostException     // Catch:{ UnknownHostException -> 0x041f }
            r2.<init>(r0)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x041e
        L_0x03ef:
            java.lang.String r0 = "Failed to resolve "
            java.lang.String r0 = X.002.A0R(r0, r11)     // Catch:{ UnknownHostException -> 0x041f }
            java.net.UnknownHostException r2 = new java.net.UnknownHostException     // Catch:{ UnknownHostException -> 0x041f }
            r2.<init>(r0)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x041e
        L_0x03fb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03fb }
            goto L_0x0401
        L_0x03fe:
            r7.close()     // Catch:{ IOException -> 0x0402 }
        L_0x0401:
            throw r0     // Catch:{ IOException -> 0x0402 }
        L_0x0402:
            r2 = move-exception
            java.lang.String r0 = "I/O Exception while trying to resolve "
            java.lang.String r1 = X.002.A0R(r0, r11)     // Catch:{ UnknownHostException -> 0x041f }
            boolean r0 = r2 instanceof java.net.SocketException     // Catch:{ UnknownHostException -> 0x041f }
            if (r0 != 0) goto L_0x0412
            java.lang.String r0 = X.SNO.A02     // Catch:{ UnknownHostException -> 0x041f }
            X.0KC.A0I(r0, r1, r2)     // Catch:{ UnknownHostException -> 0x041f }
        L_0x0412:
            java.net.UnknownHostException r2 = new java.net.UnknownHostException     // Catch:{ UnknownHostException -> 0x041f }
            r2.<init>(r1)     // Catch:{ UnknownHostException -> 0x041f }
            goto L_0x041e
        L_0x0418:
            r0 = move-exception
            java.lang.Error r2 = new java.lang.Error     // Catch:{ UnknownHostException -> 0x041f }
            r2.<init>(r0)     // Catch:{ UnknownHostException -> 0x041f }
        L_0x041e:
            throw r2     // Catch:{ UnknownHostException -> 0x041f }
        L_0x041f:
            r3 = move-exception
            long r1 = r12.A02
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0450
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r12.A00 = r0
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0446
            r0 = 1
            long r16 = r16 + r0
            goto L_0x004a
        L_0x0434:
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x0439
            return r3
        L_0x0439:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r3)
            X.TLa r0 = new X.TLa
            r0.<init>()
            X.01V.A1D(r1, r0)
            return r1
        L_0x0446:
            java.net.UnknownHostException r3 = new java.net.UnknownHostException
            r3.<init>()
            throw r3
        L_0x044c:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r12.A00 = r0
        L_0x0450:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10964S2w.A00(java.lang.String):java.util.ArrayList");
    }

    public C10964S2w(long j, long j2, long j3, boolean z, boolean z2) {
        this.A04 = z;
        this.A05 = z2;
        this.A03 = new SNO((int) j);
        this.A01 = j2;
        this.A02 = j3;
    }
}
