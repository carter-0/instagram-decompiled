package X;

/* renamed from: X.Si1  reason: case insensitive filesystem */
public final class C11874Si1 implements C13691Tf9 {
    public final ST0 A00;
    public final C11416SSr A01;

    /* JADX WARNING: type inference failed for: r3v3, types: [java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C13796ThF ANe(X.C11856Shi r13, java.lang.Object r14, int r15, int r16) {
        /*
            r12 = this;
            java.io.InputStream r14 = (java.io.InputStream) r14
            boolean r0 = r14 instanceof X.RC9
            if (r0 == 0) goto L_0x000d
            X.RC9 r14 = (X.RC9) r14
            r5 = 0
        L_0x0009:
            java.util.Queue r4 = X.C8851RCr.A02
            monitor-enter(r4)
            goto L_0x0017
        L_0x000d:
            X.ST0 r1 = r12.A00
            X.RC9 r0 = new X.RC9
            r0.<init>(r1, r14)
            r14 = r0
            r5 = 1
            goto L_0x0009
        L_0x0017:
            java.lang.Object r3 = r4.poll()     // Catch:{ all -> 0x006b }
            X.RCr r3 = (X.C8851RCr) r3     // Catch:{ all -> 0x006b }
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            if (r3 != 0) goto L_0x0025
            X.RCr r3 = new X.RCr
            r3.<init>()
        L_0x0025:
            r3.A01 = r14
            X.RC7 r2 = new X.RC7
            r2.<init>(r3)
            X.Sjj r7 = new X.Sjj
            r7.<init>(r14, r3)
            X.SSr r8 = r12.A01     // Catch:{ all -> 0x0057 }
            java.util.List r1 = r8.A04     // Catch:{ all -> 0x0057 }
            X.ST0 r0 = r8.A02     // Catch:{ all -> 0x0057 }
            X.Sjl r9 = new X.Sjl     // Catch:{ all -> 0x0057 }
            r9.<init>(r0, r2, r1)     // Catch:{ all -> 0x0057 }
            r6 = r13
            r10 = r15
            r11 = r16
            X.Sik r1 = X.C11416SSr.A01(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0057 }
            r0 = 0
            r3.A00 = r0
            r3.A01 = r0
            monitor-enter(r4)
            r4.offer(r3)     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x0053
            r14.A01()
        L_0x0053:
            return r1
        L_0x0054:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            throw r1
        L_0x0057:
            r1 = move-exception
            r0 = 0
            r3.A00 = r0
            r3.A01 = r0
            monitor-enter(r4)
            r4.offer(r3)     // Catch:{ all -> 0x0068 }
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            if (r5 == 0) goto L_0x0067
            r14.A01()
        L_0x0067:
            throw r1
        L_0x0068:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            throw r1
        L_0x006b:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11874Si1.ANe(X.Shi, java.lang.Object, int, int):X.ThF");
    }

    public final /* bridge */ /* synthetic */ boolean CJU(C11856Shi shi, Object obj) {
        SJ8 sj8 = C11416SSr.A05;
        return true;
    }

    public C11874Si1(ST0 st0, C11416SSr sSr) {
        this.A01 = sSr;
        this.A00 = st0;
    }
}
