package X;

import android.net.Uri;

public final class XEX implements C266204Xy {
    public long A00;
    public C257263x7 A01;
    public boolean A02 = true;
    public final long A03 = AnonymousClass4Y0.A03.getAndIncrement();
    public final C265044Sh A04 = new Object();
    public final C266214Xz A05;
    public final Uri A06;
    public final C265004Sd A07;
    public final C22530Y8b A08;
    public final AnonymousClass4Q3 A09;
    public volatile boolean A0A;
    public final /* synthetic */ XDJ A0B;

    public final void AGO() {
        this.A0A = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r11.A00 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x009c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cg1() {
        /*
            r35 = this;
            r7 = 0
            r2 = 0
        L_0x0002:
            r6 = r35
            boolean r0 = r6.A0A
            if (r0 != 0) goto L_0x0183
            r8 = 1
            r32 = -1
            X.4Sh r9 = r6.A04     // Catch:{ all -> 0x0166 }
            long r0 = r9.A00     // Catch:{ all -> 0x0166 }
            X.3x7 r3 = X.C257263x7.A0B     // Catch:{ all -> 0x0166 }
            android.net.Uri r3 = r6.A06     // Catch:{ all -> 0x0166 }
            r34 = r3
            X.XDJ r5 = r6.A0B     // Catch:{ all -> 0x0166 }
            java.util.Map r3 = X.XDJ.A0d     // Catch:{ all -> 0x0166 }
            java.lang.String r4 = r5.A0V     // Catch:{ all -> 0x0166 }
            java.util.Map r24 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0166 }
            X.3x6 r22 = new X.3x6     // Catch:{ all -> 0x0166 }
            r22.<init>()     // Catch:{ all -> 0x0166 }
            r28 = 0
            r25 = 0
            X.3x7 r3 = new X.3x7     // Catch:{ all -> 0x0166 }
            r23 = r4
            r26 = r8
            r27 = r7
            r30 = r0
            r20 = r3
            r21 = r34
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r30, r32)     // Catch:{ all -> 0x0166 }
            r6.A01 = r3     // Catch:{ all -> 0x0166 }
            X.4Xz r4 = r6.A05     // Catch:{ all -> 0x0166 }
            r21 = r4
            long r24 = r4.open(r3)     // Catch:{ all -> 0x0166 }
            int r3 = (r24 > r32 ? 1 : (r24 == r32 ? 0 : -1))
            if (r3 == 0) goto L_0x0053
            long r24 = r24 + r0
            android.os.Handler r4 = r5.A0L     // Catch:{ all -> 0x0166 }
            X.XEk r3 = new X.XEk     // Catch:{ all -> 0x0166 }
            r3.<init>(r5)     // Catch:{ all -> 0x0166 }
            r4.post(r3)     // Catch:{ all -> 0x0166 }
        L_0x0053:
            X.Y8b r11 = r6.A08     // Catch:{ all -> 0x0166 }
            r21.getResponseHeaders()     // Catch:{ all -> 0x0166 }
            X.4Sd r13 = r6.A07     // Catch:{ all -> 0x0166 }
            X.XEZ r11 = (X.XEZ) r11     // Catch:{ all -> 0x0166 }
            X.4Y6 r10 = new X.4Y6     // Catch:{ all -> 0x0166 }
            r20 = r10
            r22 = r0
            r20.<init>(r21, r22, r24)     // Catch:{ all -> 0x0166 }
            r11.A01 = r10     // Catch:{ all -> 0x0166 }
            X.4XT r3 = r11.A00     // Catch:{ all -> 0x0166 }
            if (r3 != 0) goto L_0x007d
            X.Y9S r3 = r11.A02     // Catch:{ all -> 0x0166 }
            X.4XT[] r14 = r3.AM2()     // Catch:{ all -> 0x0166 }
            int r12 = r14.length     // Catch:{ all -> 0x0166 }
            r17 = 0
            if (r12 != r8) goto L_0x008e
            r3 = r14[r7]     // Catch:{ all -> 0x0166 }
            r11.A00 = r3     // Catch:{ all -> 0x0166 }
        L_0x007a:
            r3.CMc(r13)     // Catch:{ all -> 0x0166 }
        L_0x007d:
            boolean r3 = r6.A02     // Catch:{ all -> 0x0166 }
            if (r3 == 0) goto L_0x00c7
            long r3 = r6.A00     // Catch:{ all -> 0x0166 }
            X.4XT r10 = r11.A00     // Catch:{ all -> 0x0166 }
            r10.getClass()     // Catch:{ all -> 0x0166 }
            r10.EKu(r0, r3)     // Catch:{ all -> 0x0166 }
            r6.A02 = r7     // Catch:{ all -> 0x0166 }
            goto L_0x00c7
        L_0x008e:
            r15 = 0
        L_0x008f:
            if (r15 >= r12) goto L_0x00b7
            r4 = r14[r15]     // Catch:{ all -> 0x0166 }
            boolean r3 = r4.Evy(r10)     // Catch:{ EOFException -> 0x009c, all -> 0x0122 }
            if (r3 == 0) goto L_0x00a1
            r11.A00 = r4     // Catch:{ EOFException -> 0x009c, all -> 0x0122 }
            goto L_0x00b5
        L_0x009c:
            X.4XT r3 = r11.A00     // Catch:{ all -> 0x0166 }
            if (r3 != 0) goto L_0x00ac
            goto L_0x00a5
        L_0x00a1:
            X.4XT r3 = r11.A00     // Catch:{ all -> 0x0166 }
            if (r3 != 0) goto L_0x00ac
        L_0x00a5:
            long r3 = r10.A02     // Catch:{ all -> 0x0166 }
            int r16 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r3 = 0
            if (r16 != 0) goto L_0x00ad
        L_0x00ac:
            r3 = 1
        L_0x00ad:
            X.C256703wD.A04(r3)     // Catch:{ all -> 0x0166 }
            r10.A01 = r7     // Catch:{ all -> 0x0166 }
            int r15 = r15 + 1
            goto L_0x008f
        L_0x00b5:
            r10.A01 = r7     // Catch:{ all -> 0x0166 }
        L_0x00b7:
            X.4XT r3 = r11.A00     // Catch:{ all -> 0x0166 }
            if (r3 != 0) goto L_0x007a
            r0 = 537(0x219, float:7.52E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ all -> 0x0166 }
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0166 }
            r3 = 0
            goto L_0x0135
        L_0x00c7:
            r14 = r0
        L_0x00c8:
            if (r2 != 0) goto L_0x0106
            boolean r0 = r6.A0A     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x010a
            X.4Q3 r4 = r6.A09     // Catch:{ InterruptedException -> 0x0160 }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x0160 }
        L_0x00d1:
            boolean r0 = r4.A00     // Catch:{ all -> 0x011f }
            if (r0 != 0) goto L_0x00d9
            r4.wait()     // Catch:{ all -> 0x011f }
            goto L_0x00d1
        L_0x00d9:
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x0160 }
            X.4XT r1 = r11.A00     // Catch:{ all -> 0x0166 }
            r1.getClass()     // Catch:{ all -> 0x0166 }
            X.4Y7 r0 = r11.A01     // Catch:{ all -> 0x0166 }
            r0.getClass()     // Catch:{ all -> 0x0166 }
            int r2 = r1.E68(r0, r9)     // Catch:{ all -> 0x0166 }
            X.4Y7 r0 = r11.A01     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x00f1
            X.4Y6 r0 = (X.AnonymousClass4Y6) r0     // Catch:{ all -> 0x0166 }
            long r0 = r0.A02     // Catch:{ all -> 0x0166 }
            goto L_0x00f3
        L_0x00f1:
            r0 = -1
        L_0x00f3:
            r12 = 2097152(0x200000, double:1.0361308E-317)
            long r12 = r12 + r14
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c8
            r4.A01()     // Catch:{ all -> 0x0166 }
            android.os.Handler r4 = r5.A0L     // Catch:{ all -> 0x0166 }
            java.lang.Runnable r3 = r5.A0U     // Catch:{ all -> 0x0166 }
            r4.post(r3)     // Catch:{ all -> 0x0166 }
            goto L_0x00c7
        L_0x0106:
            if (r2 != r8) goto L_0x010a
            r2 = 0
            goto L_0x0118
        L_0x010a:
            X.4Y7 r0 = r11.A01
            if (r0 == 0) goto L_0x0118
            X.4Y6 r0 = (X.AnonymousClass4Y6) r0
            long r3 = r0.A02
            int r0 = (r3 > r32 ? 1 : (r3 == r32 ? 0 : -1))
            if (r0 == 0) goto L_0x0118
            r9.A00 = r3
        L_0x0118:
            r21.close()     // Catch:{ IOException -> 0x011b }
        L_0x011b:
            if (r2 != 0) goto L_0x0183
            goto L_0x0002
        L_0x011f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x0160 }
            throw r0     // Catch:{ InterruptedException -> 0x0160 }
        L_0x0122:
            r9 = move-exception
            X.4XT r3 = r11.A00     // Catch:{ all -> 0x0166 }
            if (r3 != 0) goto L_0x012d
            long r3 = r10.A02     // Catch:{ all -> 0x0166 }
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x012f
        L_0x012d:
            r17 = 1
        L_0x012f:
            X.C256703wD.A04(r17)     // Catch:{ all -> 0x0166 }
            r10.A01 = r7     // Catch:{ all -> 0x0166 }
            goto L_0x0165
        L_0x0135:
            if (r3 >= r12) goto L_0x014e
            r1 = r14[r3]     // Catch:{ all -> 0x0166 }
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ all -> 0x0166 }
            r4.append(r1)     // Catch:{ all -> 0x0166 }
            if (r3 >= r8) goto L_0x014b
            java.lang.String r1 = ", "
            r4.append(r1)     // Catch:{ all -> 0x0166 }
        L_0x014b:
            int r3 = r3 + 1
            goto L_0x0135
        L_0x014e:
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = ") could read the stream."
            java.lang.String r1 = X.002.A0g(r0, r3, r1)     // Catch:{ all -> 0x0166 }
            X.Qo1 r9 = new X.Qo1     // Catch:{ all -> 0x0166 }
            r0 = r34
            r9.<init>(r1, r0)     // Catch:{ all -> 0x0166 }
            goto L_0x0165
        L_0x0160:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0166 }
            r9.<init>()     // Catch:{ all -> 0x0166 }
        L_0x0165:
            throw r9     // Catch:{ all -> 0x0166 }
        L_0x0166:
            r5 = move-exception
            if (r2 == r8) goto L_0x017d
            X.Y8b r0 = r6.A08
            X.XEZ r0 = (X.XEZ) r0
            X.4Y7 r0 = r0.A01
            if (r0 == 0) goto L_0x017d
            X.4Y6 r0 = (X.AnonymousClass4Y6) r0
            long r3 = r0.A02
            int r0 = (r3 > r32 ? 1 : (r3 == r32 ? 0 : -1))
            if (r0 == 0) goto L_0x017d
            X.4Sh r0 = r6.A04
            r0.A00 = r3
        L_0x017d:
            X.4Xz r0 = r6.A05
            r0.close()     // Catch:{ IOException -> 0x0182 }
        L_0x0182:
            throw r5
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XEX.Cg1():void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.4Sh] */
    public XEX(Uri uri, C265004Sd r4, C22530Y8b y8b, XDJ xdj, C257113ws r7, AnonymousClass4Q3 r8) {
        this.A0B = xdj;
        this.A06 = uri;
        this.A05 = new C266214Xz(r7);
        this.A08 = y8b;
        this.A07 = r4;
        this.A09 = r8;
    }
}
