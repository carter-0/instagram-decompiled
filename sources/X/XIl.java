package X;

import java.io.IOException;

public final class XIl extends C22292Xz1 {
    public int A00;
    public C250813m6 A01;
    public C250813m6 A02;
    public C257093wq A03;
    public IOException A04 = null;
    public boolean A05;
    public boolean A06;
    public C257263x7 A07;
    public final int A08;
    public final int A09;
    public final 28X A0A;
    public final 28N A0B;
    public final String A0C;
    public final boolean A0D;

    private int A00(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3 = this.A00;
        if (i3 < 0) {
            this.A00 = 0;
            i3 = 0;
        }
        int i4 = this.A00 - i3;
        if (i4 == 0 || (bArr2 = this.A03) == null) {
            return 0;
        }
        if (i4 <= i2) {
            i2 = i4;
        }
        System.arraycopy(bArr2, i3, bArr, i, i2);
        this.A00 += i2;
        return i2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r4 = this;
            X.3m6 r3 = r4.A02
            r2 = 0
            if (r3 == 0) goto L_0x0013
            X.3x7 r1 = r4.A07
            X.3x7 r0 = X.C257263x7.A0B
            if (r1 != 0) goto L_0x000d
            X.3x7 r1 = X.C257263x7.A0B
        L_0x000d:
            r0 = 1
            r3.DtX(r4, r1, r0)
            r4.A02 = r2
        L_0x0013:
            monitor-enter(r4)
            r0 = 0
            r4.A06 = r0     // Catch:{ all -> 0x0022 }
            X.3wr r0 = r4.A02     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            r0.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            r4.A02 = r2     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XIl.close():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|20|21|22|(4:26|(1:28)|29|30)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0026 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long open(X.C257263x7 r4) {
        /*
            r3 = this;
            r3.A07 = r4
            monitor-enter(r3)
            boolean r0 = r3.A03()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x000d
            X.3wz r1 = X.C257183wz.CACHED     // Catch:{ all -> 0x005c }
        L_0x000b:
            monitor-exit(r3)     // Catch:{ all -> 0x005c }
            goto L_0x0010
        L_0x000d:
            X.3wz r1 = X.C257183wz.SEMI_CACHED     // Catch:{ all -> 0x005c }
            goto L_0x000b
        L_0x0010:
            X.3m6 r0 = r3.A02
            if (r0 == 0) goto L_0x0017
            r0.Dtd(r1, r4)
        L_0x0017:
            monitor-enter(r3)
            int r0 = r3.A01     // Catch:{ all -> 0x0059 }
            if (r0 >= 0) goto L_0x0043
            int r0 = r3.A00     // Catch:{ all -> 0x0059 }
            if (r0 >= 0) goto L_0x0043
            int r0 = r3.A08     // Catch:{ all -> 0x0059 }
            long r0 = (long) r0     // Catch:{ all -> 0x0059 }
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x0026 }
        L_0x0026:
            int r0 = r3.A01     // Catch:{ all -> 0x0059 }
            if (r0 >= 0) goto L_0x0043
            int r0 = r3.A00     // Catch:{ all -> 0x0059 }
            if (r0 >= 0) goto L_0x0043
            r0 = 0
            r3.A06 = r0     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "prefetch no bytes after connect wait"
            java.io.IOException r1 = X.JTO.A0u(r0)     // Catch:{ all -> 0x0059 }
            r3.A04 = r1     // Catch:{ all -> 0x0059 }
            X.3m6 r0 = r3.A02     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0040
            r0.DtY(r1)     // Catch:{ all -> 0x0059 }
        L_0x0040:
            java.io.IOException r0 = r3.A04     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0043:
            X.3m6 r1 = r3.A02     // Catch:{ all -> 0x0059 }
            boolean r0 = r3.A0D     // Catch:{ all -> 0x0059 }
            r3.A02(r1, r0)     // Catch:{ all -> 0x0059 }
            monitor-exit(r3)     // Catch:{ all -> 0x0059 }
            X.3m6 r2 = r3.A02
            if (r2 == 0) goto L_0x0055
            r1 = 1
            boolean r0 = r3.A05
            r2.Dtf(r3, r4, r1, r0)
        L_0x0055:
            int r0 = r3.A01
            long r0 = (long) r0
            return r0
        L_0x0059:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0059 }
            throw r0
        L_0x005c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XIl.open(X.3x7):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        return r3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
        L_0x0000:
            boolean r0 = r6.A06
            r5 = 1
            if (r0 == 0) goto L_0x0029
            monitor-enter(r6)
            int r3 = r6.A00(r7, r8, r9)     // Catch:{ all -> 0x0026 }
            if (r3 <= 0) goto L_0x0015
            X.3m6 r2 = r6.A02     // Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x0024
            X.3x7 r1 = r6.A07     // Catch:{ all -> 0x0026 }
            X.3x7 r0 = X.C257263x7.A0B     // Catch:{ all -> 0x0026 }
            goto L_0x001d
        L_0x0015:
            int r0 = r6.A09     // Catch:{ all -> 0x0026 }
            long r0 = (long) r0     // Catch:{ all -> 0x0026 }
            r6.wait(r0)     // Catch:{ InterruptedException -> 0x001b }
        L_0x001b:
            monitor-exit(r6)     // Catch:{ all -> 0x0026 }
            goto L_0x0000
        L_0x001d:
            if (r1 != 0) goto L_0x0021
            X.3x7 r1 = X.C257263x7.A0B     // Catch:{ all -> 0x0026 }
        L_0x0021:
            r2.Czk(r6, r1, r3, r5)     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r6)     // Catch:{ all -> 0x0026 }
            return r3
        L_0x0026:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0026 }
            throw r1
        L_0x0029:
            java.io.IOException r1 = r6.A04
            if (r1 == 0) goto L_0x0037
            X.3m6 r0 = r6.A02
            if (r0 == 0) goto L_0x0034
            r0.DtY(r1)
        L_0x0034:
            java.io.IOException r1 = r6.A04
            throw r1
        L_0x0037:
            int r3 = r6.A00(r7, r8, r9)
            if (r3 <= 0) goto L_0x004d
            X.3m6 r2 = r6.A02
            if (r2 == 0) goto L_0x004c
            X.3x7 r1 = r6.A07
            X.3x7 r0 = X.C257263x7.A0B
            if (r1 != 0) goto L_0x0049
            X.3x7 r1 = X.C257263x7.A0B
        L_0x0049:
            r2.Czk(r6, r1, r3, r5)
        L_0x004c:
            return r3
        L_0x004d:
            monitor-enter(r6)
            X.3wr r4 = r6.A02     // Catch:{ all -> 0x007a }
            monitor-exit(r6)     // Catch:{ all -> 0x007a }
            if (r4 != 0) goto L_0x0055
            r3 = -1
            return r3
        L_0x0055:
            int r3 = r4.read(r7, r8, r9)     // Catch:{ IOException -> 0x006b }
            if (r3 <= 0) goto L_0x004c
            X.3m6 r2 = r6.A02     // Catch:{ IOException -> 0x006b }
            if (r2 == 0) goto L_0x004c
            X.3x7 r1 = r6.A07     // Catch:{ IOException -> 0x006b }
            X.3x7 r0 = X.C257263x7.A0B     // Catch:{ IOException -> 0x006b }
            if (r1 != 0) goto L_0x0067
            X.3x7 r1 = X.C257263x7.A0B     // Catch:{ IOException -> 0x006b }
        L_0x0067:
            r2.Czk(r6, r1, r3, r5)     // Catch:{ IOException -> 0x006b }
            return r3
        L_0x006b:
            r1 = move-exception
            X.3m6 r0 = r6.A02
            if (r0 == 0) goto L_0x0073
            r0.DtY(r1)
        L_0x0073:
            r4.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            r0 = 0
            r6.A02 = r0
            throw r1
        L_0x007a:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x007a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XIl.read(byte[], int, int):int");
    }

    public XIl(28X r2, 28N r3, C250813m6 r4, C257093wq r5, String str, int i, int i2, boolean z) {
        this.A0B = r3;
        this.A0C = str;
        this.A08 = i;
        this.A09 = i2;
        this.A0A = r2;
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = null;
        this.A03 = null;
        this.A01 = -1;
        this.A00 = -1;
        this.A00 = -1;
        this.A06 = false;
        this.A0D = z;
    }

    public final void addTransferListener(C250823m7 r2) {
        C250813m6 xx0;
        r2.getClass();
        if (r2 instanceof C250813m6) {
            xx0 = (C250813m6) r2;
        } else {
            xx0 = new C22189Xx0(r2);
        }
        this.A02 = xx0;
    }

    public final void cancel() {
    }
}
