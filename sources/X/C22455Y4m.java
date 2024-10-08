package X;

import java.util.List;

/* renamed from: X.Y4m  reason: case insensitive filesystem */
public final class C22455Y4m implements YAz {
    public static final List A06 = SUS.A06("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List A07 = SUS.A06("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final XRO A00;
    public final Y7U A01;
    public final C21469Xc1 A02;
    public final Y1K A03;
    public volatile C21989Xp3 A04;
    public volatile boolean A05;

    public final void cancel() {
        this.A05 = true;
        if (this.A04 != null) {
            this.A04.A05(AnonymousClass05K.A0j);
        }
    }

    public final C13972Tma AMs(C21464Xbw xbw, long j) {
        return this.A04.A01();
    }

    public final void AVZ() {
        this.A04.A01().close();
    }

    public final void AW5() {
        this.A03.A0J.A00();
    }

    public final C13970TmY E1F(Y1H y1h) {
        return this.A04.A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.Pxe.A1F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r1.isEmpty() != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r0 = (X.C22023Xt4) r1.removeFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r1 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        if (r1 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        r1 = new X.RCb(r3.A03);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.Xny E6d(boolean r10) {
        /*
            r9 = this;
            X.Xp3 r3 = r9.A04
            monitor-enter(r3)
            X.Y7W r2 = r3.A0A     // Catch:{ all -> 0x00a9 }
            r2.A0A()     // Catch:{ all -> 0x00a9 }
        L_0x0008:
            java.util.Deque r1 = r3.A06     // Catch:{ all -> 0x00a4 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0021
            java.lang.Integer r0 = r3.A03     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x0021
            r3.wait()     // Catch:{ InterruptedException -> 0x0018 }
            goto L_0x0008
        L_0x0018:
            X.Pxe.A1F()     // Catch:{ all -> 0x00a4 }
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00a4 }
            r0.<init>()     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x0021:
            r2.A0D()     // Catch:{ all -> 0x00a9 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x0098
            java.lang.Object r0 = r1.removeFirst()     // Catch:{ all -> 0x00a9 }
            X.Xt4 r0 = (X.C22023Xt4) r0     // Catch:{ all -> 0x00a9 }
            monitor-exit(r3)
            X.XRO r6 = r9.A00
            X.XoG r3 = new X.XoG
            r3.<init>()
            java.lang.String[] r7 = r0.A00
            int r0 = r7.length
            int r5 = r0 / 2
            r4 = 0
            r2 = 0
        L_0x003f:
            if (r2 >= r5) goto L_0x006a
            int r0 = r2 * 2
            r8 = r7[r0]
            int r0 = r0 + 1
            r1 = r7[r0]
            java.lang.String r0 = ":status"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "HTTP/1.1 "
            java.lang.String r0 = X.002.A0R(r0, r1)
            X.Xnu r4 = X.Xnu.A00(r0)
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x003f
        L_0x005e:
            java.util.List r0 = A07
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x005b
            r3.A02(r8, r1)
            goto L_0x005b
        L_0x006a:
            if (r4 == 0) goto L_0x0090
            X.Xny r2 = new X.Xny
            r2.<init>()
            r2.A06 = r6
            int r0 = r4.A00
            r2.A00 = r0
            java.lang.String r0 = r4.A01
            r2.A03 = r0
            X.Xt4 r0 = new X.Xt4
            r0.<init>((X.C21971XoG) r3)
            X.XoG r0 = X.C21971XoG.A00(r0)
            r2.A05 = r0
            if (r10 == 0) goto L_0x008f
            int r1 = r2.A00
            r0 = 100
            if (r1 != r0) goto L_0x008f
            r2 = 0
        L_0x008f:
            return r2
        L_0x0090:
            java.lang.String r1 = "Expected ':status' header not present"
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r1)
            throw r0
        L_0x0098:
            java.io.IOException r1 = r3.A02     // Catch:{ all -> 0x00a9 }
            if (r1 != 0) goto L_0x00a8
            java.lang.Integer r0 = r3.A03     // Catch:{ all -> 0x00a9 }
            X.RCb r1 = new X.RCb     // Catch:{ all -> 0x00a9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a8
        L_0x00a4:
            r1 = move-exception
            r2.A0D()     // Catch:{ all -> 0x00a9 }
        L_0x00a8:
            throw r1     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22455Y4m.E6d(boolean):X.Xny");
    }

    public final long EHG(Y1H y1h) {
        TAH tah = SQZ.A00;
        String A032 = y1h.A05.A03("Content-Length");
        if (A032 == null) {
            return -1;
        }
        try {
            return Long.parseLong(A032);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dc, code lost:
        if (r3 == 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0196, code lost:
        if (r1 != -1) goto L_0x0198;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:111:0x026a=Splitter:B:111:0x026a, B:130:0x02aa=Splitter:B:130:0x02aa} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FO2(X.C21464Xbw r24) {
        /*
            r23 = this;
            r6 = r23
            X.Xp3 r0 = r6.A04
            if (r0 != 0) goto L_0x02ae
            r3 = r24
            X.Xml r0 = r3.A04
            boolean r11 = X.AnonymousClass7TF.A1V(r0)
            X.Xt4 r8 = r3.A02
            java.lang.String[] r5 = r8.A00
            int r0 = r5.length
            int r4 = r0 / 2
            int r0 = r4 + 4
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            X.TAH r2 = X.Xs6.A06
            java.lang.String r1 = r3.A00
            X.Xs6 r0 = new X.Xs6
            r0.<init>((java.lang.String) r1, (X.TAH) r2)
            r10.add(r0)
            X.TAH r7 = X.Xs6.A07
            X.STm r3 = r3.A03
            java.lang.String r2 = r3.A07()
            java.lang.String r1 = r3.A08()
            if (r1 == 0) goto L_0x003c
            r0 = 63
            java.lang.String r2 = X.002.A0T(r2, r1, r0)
        L_0x003c:
            X.Xs6 r0 = new X.Xs6
            r0.<init>((java.lang.String) r2, (X.TAH) r7)
            r10.add(r0)
            java.lang.String r0 = "Host"
            java.lang.String r2 = r8.A03(r0)
            if (r2 == 0) goto L_0x0056
            X.TAH r1 = X.Xs6.A05
            X.Xs6 r0 = new X.Xs6
            r0.<init>((java.lang.String) r2, (X.TAH) r1)
            r10.add(r0)
        L_0x0056:
            X.TAH r2 = X.Xs6.A08
            java.lang.String r1 = r3.A03
            X.Xs6 r0 = new X.Xs6
            r0.<init>((java.lang.String) r1, (X.TAH) r2)
            r10.add(r0)
            r3 = 0
        L_0x0063:
            if (r3 >= r4) goto L_0x009e
            int r0 = r3 * 2
            r1 = r5[r0]
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r1.toLowerCase(r0)
            java.util.List r0 = A06
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "te"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x009b
            int r0 = r3 * 2
            int r0 = r0 + 1
            r1 = r5[r0]
            java.lang.String r0 = "trailers"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009b
        L_0x008d:
            int r0 = r3 * 2
            int r0 = r0 + 1
            r1 = r5[r0]
            X.Xs6 r0 = new X.Xs6
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r10.add(r0)
        L_0x009b:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x009e:
            X.Y1K r2 = r6.A03
            r21 = r11 ^ 1
            r9 = 0
            X.Y1J r5 = r2.A0J
            monitor-enter(r5)
            monitor-enter(r2)     // Catch:{ all -> 0x02ab }
            int r1 = r2.A01     // Catch:{ all -> 0x02a8 }
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 <= r0) goto L_0x00b3
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x02a8 }
            r2.A06(r0)     // Catch:{ all -> 0x02a8 }
        L_0x00b3:
            boolean r0 = r2.A0B     // Catch:{ all -> 0x02a8 }
            if (r0 != 0) goto L_0x02a2
            int r8 = r2.A01     // Catch:{ all -> 0x02a8 }
            int r0 = r8 + 2
            r2.A01 = r0     // Catch:{ all -> 0x02a8 }
            r18 = 0
            X.Xp3 r7 = new X.Xp3     // Catch:{ all -> 0x02a8 }
            r19 = r2
            r20 = r8
            r22 = r9
            r17 = r7
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x02a8 }
            if (r11 == 0) goto L_0x00de
            long r0 = r2.A03     // Catch:{ all -> 0x02a8 }
            r11 = 0
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x00de
            long r0 = r7.A00     // Catch:{ all -> 0x02a8 }
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r17 = 0
            if (r3 != 0) goto L_0x00e0
        L_0x00de:
            r17 = 1
        L_0x00e0:
            boolean r0 = r7.A07()     // Catch:{ all -> 0x02a8 }
            if (r0 == 0) goto L_0x00ef
            java.util.Map r1 = r2.A0E     // Catch:{ all -> 0x02a8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x02a8 }
            r1.put(r0, r7)     // Catch:{ all -> 0x02a8 }
        L_0x00ef:
            monitor-exit(r2)     // Catch:{ all -> 0x02a8 }
            boolean r0 = r5.A01     // Catch:{ all -> 0x02a0 }
            if (r0 != 0) goto L_0x029b
            X.XoQ r14 = r5.A02     // Catch:{ all -> 0x02a0 }
            boolean r0 = r14.A05     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x0113
            int r3 = r14.A04     // Catch:{ all -> 0x02a0 }
            int r0 = r14.A02     // Catch:{ all -> 0x02a0 }
            r2 = 32
            r1 = 31
            if (r3 >= r0) goto L_0x0107
            r14.A01(r3, r1, r2)     // Catch:{ all -> 0x02a0 }
        L_0x0107:
            r14.A05 = r9     // Catch:{ all -> 0x02a0 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            r14.A04 = r0     // Catch:{ all -> 0x02a0 }
            int r0 = r14.A02     // Catch:{ all -> 0x02a0 }
            r14.A01(r0, r1, r2)     // Catch:{ all -> 0x02a0 }
        L_0x0113:
            int r16 = r10.size()     // Catch:{ all -> 0x02a0 }
            r13 = 0
        L_0x0118:
            r0 = r16
            if (r13 >= r0) goto L_0x0225
            java.lang.Object r12 = r10.get(r13)     // Catch:{ all -> 0x02a0 }
            X.Xs6 r12 = (X.Xs6) r12     // Catch:{ all -> 0x02a0 }
            X.TAH r0 = r12.A01     // Catch:{ all -> 0x02a0 }
            X.TAH r11 = r0.A0A()     // Catch:{ all -> 0x02a0 }
            X.TAH r4 = r12.A02     // Catch:{ all -> 0x02a0 }
            java.util.Map r0 = X.C11317SMr.A00     // Catch:{ all -> 0x02a0 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x02a0 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x02a0 }
            r3 = -1
            r2 = 1
            if (r0 == 0) goto L_0x0163
            int r0 = r0.intValue()     // Catch:{ all -> 0x02a0 }
            int r1 = r0 + 1
            if (r1 <= r2) goto L_0x0161
            r0 = 8
            if (r1 >= r0) goto L_0x0161
            X.Xs6[] r2 = X.C11317SMr.A01     // Catch:{ all -> 0x02a0 }
            int r0 = r1 + -1
            r0 = r2[r0]     // Catch:{ all -> 0x02a0 }
            X.TAH r0 = r0.A02     // Catch:{ all -> 0x02a0 }
            boolean r0 = X.2Ob.A00(r0, r4)     // Catch:{ all -> 0x02a0 }
            if (r0 != 0) goto L_0x0198
            r0 = r2[r1]     // Catch:{ all -> 0x02a0 }
            X.TAH r0 = r0.A02     // Catch:{ all -> 0x02a0 }
            boolean r0 = X.2Ob.A00(r0, r4)     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x0161
            int r0 = r1 + 1
            r2 = r1
            r1 = r0
            if (r0 != r3) goto L_0x0196
            goto L_0x0164
        L_0x0161:
            r2 = r1
            goto L_0x0164
        L_0x0163:
            r2 = -1
        L_0x0164:
            int r0 = r14.A03     // Catch:{ all -> 0x02a0 }
            int r1 = r0 + 1
            X.Xs6[] r0 = r14.A06     // Catch:{ all -> 0x02a0 }
            int r15 = r0.length     // Catch:{ all -> 0x02a0 }
        L_0x016b:
            if (r1 >= r15) goto L_0x01a1
            X.Xs6[] r0 = r14.A06     // Catch:{ all -> 0x02a0 }
            r0 = r0[r1]     // Catch:{ all -> 0x02a0 }
            X.TAH r0 = r0.A01     // Catch:{ all -> 0x02a0 }
            boolean r0 = X.2Ob.A00(r0, r11)     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x0193
            X.Xs6[] r0 = r14.A06     // Catch:{ all -> 0x02a0 }
            r0 = r0[r1]     // Catch:{ all -> 0x02a0 }
            X.TAH r0 = r0.A02     // Catch:{ all -> 0x02a0 }
            boolean r0 = X.2Ob.A00(r0, r4)     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x018b
            int r0 = r14.A03     // Catch:{ all -> 0x02a0 }
            int r1 = r1 - r0
            int r1 = r1 + 61
            goto L_0x0196
        L_0x018b:
            if (r2 != r3) goto L_0x0193
            int r0 = r14.A03     // Catch:{ all -> 0x02a0 }
            int r0 = r1 - r0
            int r2 = r0 + 61
        L_0x0193:
            int r1 = r1 + 1
            goto L_0x016b
        L_0x0196:
            if (r1 == r3) goto L_0x01a1
        L_0x0198:
            r2 = 127(0x7f, float:1.78E-43)
            r0 = 128(0x80, float:1.794E-43)
            r14.A01(r1, r2, r0)     // Catch:{ all -> 0x02a0 }
            goto L_0x0221
        L_0x01a1:
            r1 = 64
            if (r2 != r3) goto L_0x01a6
            goto L_0x01c9
        L_0x01a6:
            X.TAH r3 = X.Xs6.A03     // Catch:{ all -> 0x02a0 }
            int r0 = r3.A05()     // Catch:{ all -> 0x02a0 }
            boolean r0 = r11.A0C(r3, r0)     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x01c3
            X.TAH r0 = X.Xs6.A05     // Catch:{ all -> 0x02a0 }
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x02a0 }
            if (r0 != 0) goto L_0x01c3
            r0 = 15
            r14.A01(r2, r0, r9)     // Catch:{ all -> 0x02a0 }
            r14.A02(r4)     // Catch:{ all -> 0x02a0 }
            goto L_0x0221
        L_0x01c3:
            r0 = 63
            r14.A01(r2, r0, r1)     // Catch:{ all -> 0x02a0 }
            goto L_0x01d1
        L_0x01c9:
            X.TPe r0 = r14.A07     // Catch:{ all -> 0x02a0 }
            r0.A0B(r1)     // Catch:{ all -> 0x02a0 }
            r14.A02(r11)     // Catch:{ all -> 0x02a0 }
        L_0x01d1:
            r14.A02(r4)     // Catch:{ all -> 0x02a0 }
            int r2 = r12.A00     // Catch:{ all -> 0x02a0 }
            int r1 = r14.A02     // Catch:{ all -> 0x02a0 }
            if (r2 <= r1) goto L_0x01ee
            X.Xs6[] r1 = r14.A06     // Catch:{ all -> 0x02a0 }
            r0 = r18
            java.util.Arrays.fill(r1, r0)     // Catch:{ all -> 0x02a0 }
            X.Xs6[] r0 = r14.A06     // Catch:{ all -> 0x02a0 }
            int r0 = r0.length     // Catch:{ all -> 0x02a0 }
            int r0 = r0 + -1
            r14.A03 = r0     // Catch:{ all -> 0x02a0 }
            r0 = 0
            r14.A01 = r9     // Catch:{ all -> 0x02a0 }
        L_0x01eb:
            r14.A00 = r0     // Catch:{ all -> 0x02a0 }
            goto L_0x0221
        L_0x01ee:
            int r0 = r14.A00     // Catch:{ all -> 0x02a0 }
            int r0 = r0 + r2
            int r0 = r0 - r1
            X.C21978XoQ.A00(r14, r0)     // Catch:{ all -> 0x02a0 }
            int r0 = r14.A01     // Catch:{ all -> 0x02a0 }
            int r0 = r0 + 1
            X.Xs6[] r3 = r14.A06     // Catch:{ all -> 0x02a0 }
            int r4 = r3.length     // Catch:{ all -> 0x02a0 }
            if (r0 <= r4) goto L_0x020f
            int r0 = r4 * 2
            X.Xs6[] r1 = new X.Xs6[r0]     // Catch:{ all -> 0x02a0 }
            java.lang.System.arraycopy(r3, r9, r1, r4, r4)     // Catch:{ all -> 0x02a0 }
            X.Xs6[] r0 = r14.A06     // Catch:{ all -> 0x02a0 }
            int r0 = r0.length     // Catch:{ all -> 0x02a0 }
            int r0 = r0 + -1
            r14.A03 = r0     // Catch:{ all -> 0x02a0 }
            r14.A06 = r1     // Catch:{ all -> 0x02a0 }
            r3 = r1
        L_0x020f:
            int r1 = r14.A03     // Catch:{ all -> 0x02a0 }
            int r0 = r1 + -1
            r14.A03 = r0     // Catch:{ all -> 0x02a0 }
            r3[r1] = r12     // Catch:{ all -> 0x02a0 }
            int r0 = r14.A01     // Catch:{ all -> 0x02a0 }
            int r0 = r0 + 1
            r14.A01 = r0     // Catch:{ all -> 0x02a0 }
            int r0 = r14.A00     // Catch:{ all -> 0x02a0 }
            int r0 = r0 + r2
            goto L_0x01eb
        L_0x0221:
            int r13 = r13 + 1
            goto L_0x0118
        L_0x0225:
            X.TPe r4 = r5.A03     // Catch:{ all -> 0x02a0 }
            long r2 = r4.A00     // Catch:{ all -> 0x02a0 }
            int r0 = r5.A00     // Catch:{ all -> 0x02a0 }
            long r0 = (long) r0     // Catch:{ all -> 0x02a0 }
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x02a0 }
            int r11 = (int) r0     // Catch:{ all -> 0x02a0 }
            long r0 = (long) r11     // Catch:{ all -> 0x02a0 }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r10 = 0
            if (r9 != 0) goto L_0x0238
            r10 = 4
        L_0x0238:
            if (r21 == 0) goto L_0x023d
            r9 = r10 | 1
            byte r10 = (byte) r9     // Catch:{ all -> 0x02a0 }
        L_0x023d:
            r9 = 1
            r5.A01(r9, r10, r8, r11)     // Catch:{ all -> 0x02a0 }
            X.YCS r9 = r5.A04     // Catch:{ all -> 0x02a0 }
            r9.FNi(r4, r0)     // Catch:{ all -> 0x02a0 }
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x026a
            long r2 = r2 - r0
        L_0x024b:
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x026a
            int r0 = r5.A00     // Catch:{ all -> 0x02a0 }
            long r0 = (long) r0     // Catch:{ all -> 0x02a0 }
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x02a0 }
            int r13 = (int) r0     // Catch:{ all -> 0x02a0 }
            long r0 = (long) r13     // Catch:{ all -> 0x02a0 }
            long r2 = r2 - r0
            r12 = 9
            int r11 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            r10 = 0
            if (r11 != 0) goto L_0x0263
            r10 = 4
        L_0x0263:
            r5.A01(r12, r10, r8, r13)     // Catch:{ all -> 0x02a0 }
            r9.FNi(r4, r0)     // Catch:{ all -> 0x02a0 }
            goto L_0x024b
        L_0x026a:
            monitor-exit(r5)     // Catch:{ all -> 0x02ab }
            if (r17 == 0) goto L_0x0270
            r5.A00()
        L_0x0270:
            r6.A04 = r7
            boolean r0 = r6.A05
            X.Xp3 r1 = r6.A04
            if (r0 != 0) goto L_0x028f
            X.Y7W r2 = r1.A0A
            X.Xc1 r4 = r6.A02
            int r0 = r4.A02
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.A05(r3, r0)
            X.Xp3 r0 = r6.A04
            X.Y7W r2 = r0.A0B
            int r0 = r4.A03
            long r0 = (long) r0
            r2.A05(r3, r0)
            return
        L_0x028f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            r1.A05(r0)
            java.lang.String r0 = "Canceled"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x029b:
            java.io.IOException r0 = X.C21055XCg.A0H()     // Catch:{ all -> 0x02a0 }
            throw r0     // Catch:{ all -> 0x02a0 }
        L_0x02a0:
            r0 = move-exception
            goto L_0x02aa
        L_0x02a2:
            X.XQW r0 = new X.XQW     // Catch:{ all -> 0x02a8 }
            r0.<init>()     // Catch:{ all -> 0x02a8 }
            throw r0     // Catch:{ all -> 0x02a8 }
        L_0x02a8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02a8 }
        L_0x02aa:
            throw r0     // Catch:{ all -> 0x02ab }
        L_0x02ab:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02ab }
            throw r0
        L_0x02ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22455Y4m.FO2(X.Xbw):void");
    }

    public C22455Y4m(Y1U y1u, Y7U y7u, C21469Xc1 xc1, Y1K y1k) {
        this.A01 = y7u;
        this.A02 = xc1;
        this.A03 = y1k;
        List list = y1u.A0A;
        XRO xro = XRO.H2_PRIOR_KNOWLEDGE;
        this.A00 = !list.contains(xro) ? XRO.HTTP_2 : xro;
    }

    public final Y7U AJK() {
        return this.A01;
    }
}
