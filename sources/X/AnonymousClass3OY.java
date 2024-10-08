package X;

/* renamed from: X.3OY  reason: invalid class name */
public final class AnonymousClass3OY {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;

    /* JADX WARNING: Can't wrap try/catch for region: R(10:18|19|20|(5:24|(5:26|(5:28|(2:30|(2:32|(1:(4:35|(4:38|(1:118)(2:40|(2:42|117)(1:115))|43|36)|116|70)(2:109|76)))(1:(1:(4:46|(3:56|(1:58)|59)(1:(5:51|(2:53|(1:55))|75|108|76))|60|(4:64|75|108|76)))))(1:(2:110|76))|66|111|76)(2:67|(1:69))|71|112|76)(1:(3:73|113|76))|74|114|76)|77|78|(1:83)(1:82)|84|85|89) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x00c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x00eb */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00d1 A[Catch:{ IOException -> 0x00eb, all -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00d2 A[Catch:{ IOException -> 0x00eb, all -> 0x00df }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(X.C227052iZ r18) {
        /*
            r17 = this;
            r8 = r17
            int r0 = r8.A05
            r7 = 0
            r6 = 6
            if (r0 == r6) goto L_0x00f7
            r2 = r18
            if (r18 == 0) goto L_0x00f7
            int r1 = r2.A00
            int r0 = r8.A02
            if (r1 <= r0) goto L_0x00f7
            byte[] r0 = r2.A02
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r0, r7, r1)
            int r0 = r8.A02     // Catch:{ IOException -> 0x00eb, all -> 0x00df }
            long r0 = (long) r0     // Catch:{ IOException -> 0x00eb, all -> 0x00df }
        L_0x001c:
            r15 = 0
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0035
            long r3 = r5.skip(r0)     // Catch:{ IOException -> 0x00eb, all -> 0x00df }
            int r2 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r2 > 0) goto L_0x0033
            int r3 = r5.read()     // Catch:{ IOException -> 0x00eb, all -> 0x00df }
            r2 = -1
            if (r3 == r2) goto L_0x0035
            r3 = 1
        L_0x0033:
            long r0 = r0 - r3
            goto L_0x001c
        L_0x0035:
            int r4 = r8.A01     // Catch:{ IOException -> 0x00eb, all -> 0x00df }
        L_0x0037:
            r3 = 1
            int r0 = r8.A05     // Catch:{ IOException -> 0x00c9 }
            if (r0 == r6) goto L_0x00c9
            int r9 = r5.read()     // Catch:{ IOException -> 0x00c9 }
            r0 = -1
            if (r9 == r0) goto L_0x00c9
            int r0 = r8.A02     // Catch:{ IOException -> 0x00c9 }
            int r12 = r0 + 1
            r8.A02 = r12     // Catch:{ IOException -> 0x00c9 }
            int r11 = r8.A05     // Catch:{ IOException -> 0x00c9 }
            r1 = 255(0xff, float:3.57E-43)
            if (r11 == 0) goto L_0x00bb
            r2 = 2
            if (r11 == r3) goto L_0x00ae
            r0 = 3
            if (r11 == r2) goto L_0x00a9
            r10 = 4
            if (r11 == r0) goto L_0x007b
            r0 = 5
            if (r11 == r10) goto L_0x00ab
            if (r11 != r0) goto L_0x00c5
            int r0 = r8.A03     // Catch:{ IOException -> 0x00c9 }
            int r12 = r0 << 8
            int r12 = r12 + r9
            int r12 = r12 - r2
            long r0 = (long) r12     // Catch:{ IOException -> 0x00c9 }
        L_0x0064:
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x00b3
            long r13 = r5.skip(r0)     // Catch:{ IOException -> 0x00c9 }
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 > 0) goto L_0x0079
            int r11 = r5.read()     // Catch:{ IOException -> 0x00c9 }
            r10 = -1
            if (r11 == r10) goto L_0x00b3
            r13 = 1
        L_0x0079:
            long r0 = r0 - r13
            goto L_0x0064
        L_0x007b:
            if (r9 == r1) goto L_0x00ab
            if (r9 == 0) goto L_0x00b8
            r0 = 218(0xda, float:3.05E-43)
            if (r9 == r0) goto L_0x0092
            r0 = 217(0xd9, float:3.04E-43)
            if (r9 == r0) goto L_0x0092
            if (r9 == r3) goto L_0x00b8
            r0 = 208(0xd0, float:2.91E-43)
            if (r9 < r0) goto L_0x00c3
            r0 = 215(0xd7, float:3.01E-43)
            if (r9 > r0) goto L_0x00a0
            goto L_0x00b8
        L_0x0092:
            int r0 = r12 + -2
            int r1 = r8.A04     // Catch:{ IOException -> 0x00c9 }
            if (r1 <= 0) goto L_0x009a
            r8.A00 = r0     // Catch:{ IOException -> 0x00c9 }
        L_0x009a:
            int r0 = r1 + 1
            r8.A04 = r0     // Catch:{ IOException -> 0x00c9 }
            r8.A01 = r1     // Catch:{ IOException -> 0x00c9 }
        L_0x00a0:
            r0 = 217(0xd9, float:3.04E-43)
            if (r9 == r0) goto L_0x00b8
            r0 = 216(0xd8, float:3.03E-43)
            if (r9 == r0) goto L_0x00b8
            goto L_0x00c3
        L_0x00a9:
            if (r9 != r1) goto L_0x00c5
        L_0x00ab:
            r8.A05 = r0     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00c5
        L_0x00ae:
            r0 = 216(0xd8, float:3.03E-43)
            if (r9 != r0) goto L_0x00c0
            goto L_0x00b8
        L_0x00b3:
            int r0 = r8.A02     // Catch:{ IOException -> 0x00c9 }
            int r0 = r0 + r12
            r8.A02 = r0     // Catch:{ IOException -> 0x00c9 }
        L_0x00b8:
            r8.A05 = r2     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00c5
        L_0x00bb:
            if (r9 != r1) goto L_0x00c0
            r8.A05 = r3     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00c5
        L_0x00c0:
            r8.A05 = r6     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00c5
        L_0x00c3:
            r8.A05 = r10     // Catch:{ IOException -> 0x00c9 }
        L_0x00c5:
            r8.A03 = r9     // Catch:{ IOException -> 0x00c9 }
            goto L_0x0037
        L_0x00c9:
            int r0 = r8.A05     // Catch:{ IOException -> 0x00eb, all -> 0x00df }
            if (r0 == r6) goto L_0x00d2
            int r0 = r8.A01     // Catch:{ IOException -> 0x00eb, all -> 0x00df }
            if (r0 == r4) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            r5.close()     // Catch:{ IOException -> 0x00d7 }
            goto L_0x00de
        L_0x00d7:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x00de:
            return r3
        L_0x00df:
            r0 = move-exception
            r5.close()     // Catch:{ IOException -> 0x00e4 }
            throw r0
        L_0x00e4:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x00eb:
            r5.close()     // Catch:{ IOException -> 0x00ef }
            goto L_0x00f6
        L_0x00ef:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x00f6:
            return r7
        L_0x00f7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OY.A00(X.2iZ):boolean");
    }
}
