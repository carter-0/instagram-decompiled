package X;

public abstract class UH2 extends UH3 {
    public final C21007X9g A00;

    public UH2(WFU wfu, W0J w0j, C21007X9g x9g) {
        super(wfu, w0j);
        this.A04 = true;
        this.A00 = x9g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c7, code lost:
        if (r12 != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x025e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        X.1yR.A0S.A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0264, code lost:
        if (r4 != null) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0272, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x01f5 */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0200 A[SYNTHETIC, Splitter:B:123:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x025e A[ExcHandler: IOException (r1v8 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r4 
      PHI: (r4v1 java.io.InputStream) = (r4v2 java.io.InputStream), (r4v5 java.io.InputStream) binds: [B:120:0x01fa, B:117:0x01f5] A[DONT_GENERATE, DONT_INLINE], Splitter:B:117:0x01f5] */
    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f4 A[Catch:{ MalformedURLException -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0106 A[Catch:{ MalformedURLException -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.W1g A0H(int r21, int r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            X.X9g r6 = r0.A00
            X.UHJ r6 = (X.UHJ) r6
            r9 = r21
            if (r21 < 0) goto L_0x0295
            r8 = r22
            if (r22 < 0) goto L_0x028d
            r2 = 2
            r7 = r23
            int r0 = r23 + -1
            int r2 = r2 << r0
            java.lang.String r1 = " for zoom level "
            if (r9 > r2) goto L_0x0286
            if (r8 > r2) goto L_0x027f
            java.lang.String r0 = r6.A00     // Catch:{ MalformedURLException -> 0x0274 }
            r17 = r0
            boolean r0 = r17.isEmpty()     // Catch:{ MalformedURLException -> 0x0274 }
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = "&_nc_client_caller="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0274 }
            r3.<init>(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            X.Vuc r2 = r6.A03     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r0 = r2.A05     // Catch:{ MalformedURLException -> 0x0274 }
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = android.net.Uri.encode(r0)     // Catch:{ MalformedURLException -> 0x0274 }
        L_0x0035:
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r1 = r2.A06     // Catch:{ MalformedURLException -> 0x0274 }
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = "&_nc_client_id="
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r0 = android.net.Uri.encode(r1)     // Catch:{ MalformedURLException -> 0x0274 }
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
        L_0x0048:
            java.lang.String r0 = r6.A01     // Catch:{ MalformedURLException -> 0x0274 }
            if (r0 != 0) goto L_0x0054
            boolean r0 = r2.A08     // Catch:{ MalformedURLException -> 0x0274 }
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "dark"
        L_0x0052:
            r6.A01 = r0     // Catch:{ MalformedURLException -> 0x0274 }
        L_0x0054:
            java.lang.String r17 = r3.toString()     // Catch:{ MalformedURLException -> 0x0274 }
            r0 = r17
            r6.A00 = r0     // Catch:{ MalformedURLException -> 0x0274 }
        L_0x005c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0274 }
            r5.<init>()     // Catch:{ MalformedURLException -> 0x0274 }
            boolean r0 = X.2R6.A05     // Catch:{ MalformedURLException -> 0x0274 }
            X.2R6.A01(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            X.2R5 r14 = X.2R6.A0B     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String[] r13 = r14.A05     // Catch:{ MalformedURLException -> 0x0274 }
            if (r13 == 0) goto L_0x00b5
            r12 = 1
            int r12 = r12 << r23
            int r0 = r13.length     // Catch:{ MalformedURLException -> 0x0274 }
            r19 = r0
            r4 = 0
            goto L_0x0080
        L_0x0074:
            r0 = 0
            goto L_0x0052
        L_0x0076:
            java.lang.String r0 = "MapTileProvider"
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r0 = ".java"
            goto L_0x0035
        L_0x007e:
            int r4 = r4 + 1
        L_0x0080:
            r0 = r19
            if (r4 >= r0) goto L_0x00b5
            X.2R4[][] r0 = r14.A06     // Catch:{ MalformedURLException -> 0x0274 }
            r16 = r0
            r0 = r0[r4]     // Catch:{ MalformedURLException -> 0x0274 }
            int r0 = r0.length     // Catch:{ MalformedURLException -> 0x0274 }
            r18 = r0
            r10 = 0
            goto L_0x0091
        L_0x008f:
            int r10 = r10 + 1
        L_0x0091:
            r0 = r18
            if (r10 >= r0) goto L_0x007e
            r0 = r16[r4]     // Catch:{ MalformedURLException -> 0x0274 }
            r11 = r0[r10]     // Catch:{ MalformedURLException -> 0x0274 }
            double r0 = r11.A01     // Catch:{ MalformedURLException -> 0x0274 }
            double r2 = (double) r12     // Catch:{ MalformedURLException -> 0x0274 }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x0274 }
            if (r15 > r9) goto L_0x008f
            double r0 = r11.A02     // Catch:{ MalformedURLException -> 0x0274 }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x0274 }
            if (r9 > r15) goto L_0x008f
            double r0 = r11.A03     // Catch:{ MalformedURLException -> 0x0274 }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x0274 }
            if (r15 > r8) goto L_0x008f
            double r0 = r11.A00     // Catch:{ MalformedURLException -> 0x0274 }
            double r0 = r0 * r2
            int r2 = (int) r0     // Catch:{ MalformedURLException -> 0x0274 }
            if (r8 > r2) goto L_0x008f
            r0 = r13[r4]     // Catch:{ MalformedURLException -> 0x0274 }
            goto L_0x00b7
        L_0x00b5:
            java.lang.String r0 = r14.A01     // Catch:{ MalformedURLException -> 0x0274 }
        L_0x00b7:
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r0 = "&x="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            r5.append(r9)     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r0 = "&y="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            r5.append(r8)     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r0 = "&z="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            r5.append(r7)     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r0 = "&size="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            int r0 = r6.A00     // Catch:{ MalformedURLException -> 0x0274 }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r0 = "&ppi="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            int r0 = r6.A02     // Catch:{ MalformedURLException -> 0x0274 }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r0 = "&language="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r0 = X.2R6.A03     // Catch:{ MalformedURLException -> 0x0274 }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            java.lang.String r1 = r6.A01     // Catch:{ MalformedURLException -> 0x0274 }
            if (r1 == 0) goto L_0x0106
            java.lang.String r0 = "&theme="
            java.lang.String r1 = X.002.A0R(r0, r1)     // Catch:{ MalformedURLException -> 0x0274 }
        L_0x00fa:
            r0 = r17
            java.lang.String r0 = X.Pxg.A0s(r1, r0, r5)     // Catch:{ MalformedURLException -> 0x0274 }
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0274 }
            r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x0274 }
            goto L_0x0109
        L_0x0106:
            java.lang.String r1 = ""
            goto L_0x00fa
        L_0x0109:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            java.lang.String r1 = "_"
            r2.append(r1)
            r2.append(r8)
            r2.append(r1)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r0 = X.2R6.A04
            r2.append(r0)
            r2.append(r1)
            X.2R5 r0 = X.2R6.A0B
            java.lang.String r0 = r0.A02
            r2.append(r0)
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x0148
            java.lang.String r0 = X.002.A0R(r1, r0)
        L_0x0139:
            java.lang.String r7 = X.AnonymousClass7TF.A0l(r0, r2)
            X.Wgt r0 = X.UHJ.A09
            if (r0 == 0) goto L_0x01e6
            r4 = 0
            X.Wgt r0 = X.UHJ.A09
            r3 = 0
            if (r0 == 0) goto L_0x01e6
            goto L_0x014b
        L_0x0148:
            java.lang.String r0 = ""
            goto L_0x0139
        L_0x014b:
            X.Wgt r8 = X.UHJ.A09     // Catch:{ IOException -> 0x01c0, all -> 0x01e4 }
            monitor-enter(r8)     // Catch:{ IOException -> 0x01c0, all -> 0x01e4 }
            java.io.Writer r0 = r8.A03     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x01b5
            X.C19866Wgt.A05(r7)     // Catch:{ all -> 0x01bd }
            java.util.LinkedHashMap r0 = r8.A0A     // Catch:{ all -> 0x01bd }
            java.lang.Object r13 = r0.get(r7)     // Catch:{ all -> 0x01bd }
            X.VjW r13 = (X.C17994VjW) r13     // Catch:{ all -> 0x01bd }
            r12 = 0
            if (r13 == 0) goto L_0x01a6
            boolean r0 = r13.A01     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x01a6
            int r11 = r8.A06     // Catch:{ all -> 0x01bd }
            java.io.InputStream[] r9 = new java.io.InputStream[r11]     // Catch:{ all -> 0x01bd }
            r10 = 0
            r2 = 0
        L_0x016a:
            if (r2 >= r11) goto L_0x0184
            java.io.File r1 = r13.A00()     // Catch:{ FileNotFoundException -> 0x0179 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0179 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0179 }
            r9[r2] = r0     // Catch:{ FileNotFoundException -> 0x0179 }
            r2 = 1
            goto L_0x016a
        L_0x0179:
            if (r10 >= r11) goto L_0x01a6
            r0 = r9[r10]     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x01a6
            X.C19866Wgt.A02(r0)     // Catch:{ all -> 0x01bd }
            r10 = 1
            goto L_0x0179
        L_0x0184:
            int r0 = r8.A00     // Catch:{ all -> 0x01bd }
            int r0 = r0 + 1
            r8.A00 = r0     // Catch:{ all -> 0x01bd }
            java.io.Writer r2 = r8.A03     // Catch:{ all -> 0x01bd }
            java.lang.String r1 = "READ "
            r0 = 10
            java.lang.String r0 = X.002.A0S(r1, r7, r0)     // Catch:{ all -> 0x01bd }
            r2.append(r0)     // Catch:{ all -> 0x01bd }
            boolean r0 = X.C19866Wgt.A06(r8)     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x01a4
            java.util.concurrent.ThreadPoolExecutor r1 = r8.A0C     // Catch:{ all -> 0x01bd }
            java.util.concurrent.Callable r0 = r8.A0B     // Catch:{ all -> 0x01bd }
            r1.submit(r0)     // Catch:{ all -> 0x01bd }
        L_0x01a4:
            r12 = 1
            r4 = r9
        L_0x01a6:
            monitor-exit(r8)     // Catch:{ IOException -> 0x01c0, all -> 0x01e4 }
            if (r12 == 0) goto L_0x01e6
            r1 = 0
            r0 = r4[r1]     // Catch:{ IOException -> 0x01b3 }
            if (r0 == 0) goto L_0x01c9
            X.V3b r3 = X.C18973WFa.A00(r0, r1)     // Catch:{ IOException -> 0x01b3 }
            goto L_0x01c9
        L_0x01b3:
            r1 = move-exception
            goto L_0x01c2
        L_0x01b5:
            java.lang.String r1 = "cache is closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01bd }
            r0.<init>(r1)     // Catch:{ all -> 0x01bd }
            throw r0     // Catch:{ all -> 0x01bd }
        L_0x01bd:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ IOException -> 0x01c0, all -> 0x01e4 }
            throw r0     // Catch:{ IOException -> 0x01c0, all -> 0x01e4 }
        L_0x01c0:
            r1 = move-exception
            r12 = 0
        L_0x01c2:
            X.1yR r0 = X.1yR.A0D     // Catch:{ all -> 0x01d5 }
            r0.A04(r1)     // Catch:{ all -> 0x01d5 }
            if (r12 == 0) goto L_0x01e6
        L_0x01c9:
            int r2 = r4.length
            r1 = 0
        L_0x01cb:
            if (r1 >= r2) goto L_0x0243
            r0 = r4[r1]
            X.C19866Wgt.A02(r0)
            int r1 = r1 + 1
            goto L_0x01cb
        L_0x01d5:
            r3 = move-exception
            if (r12 == 0) goto L_0x01e5
            int r2 = r4.length
            r1 = 0
        L_0x01da:
            if (r1 >= r2) goto L_0x01e5
            r0 = r4[r1]
            X.C19866Wgt.A02(r0)
            int r1 = r1 + 1
            goto L_0x01da
        L_0x01e4:
            r3 = move-exception
        L_0x01e5:
            throw r3
        L_0x01e6:
            java.util.concurrent.atomic.AtomicLong r0 = r6.A05
            r0.incrementAndGet()
            r4 = 0
            long r2 = java.lang.System.nanoTime()
            java.io.InputStream r4 = r5.openStream()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01f5 }
            goto L_0x01f9
        L_0x01f5:
            java.io.InputStream r4 = r5.openStream()     // Catch:{ IOException -> 0x025e, all -> 0x0272 }
        L_0x01f9:
            r0 = 1
            X.V3b r5 = X.C18973WFa.A00(r4, r0)     // Catch:{ IOException -> 0x025e }
            if (r4 == 0) goto L_0x0203
            r4.close()     // Catch:{ IOException -> 0x0203 }
        L_0x0203:
            if (r5 == 0) goto L_0x0269
            java.util.concurrent.atomic.AtomicLong r4 = r6.A01
            int r0 = r5.A00
            long r0 = (long) r0
            r4.getAndAdd(r0)
            X.1yR r4 = X.1yR.A0T
            int r0 = r5.A00
            long r0 = (long) r0
            r4.A02(r0)
            X.1yR r0 = X.1yR.A0U
            X.C13989Tnp.A1L(r0, r2)
            int r1 = r5.A00
            if (r1 == 0) goto L_0x0269
            byte[] r0 = r5.A02
            X.W1g r2 = X.W1g.A00(r0, r1)
            if (r2 == 0) goto L_0x025a
            X.Wgt r0 = X.UHJ.A09
            if (r0 != 0) goto L_0x022d
            X.C18973WFa.A01(r5)
        L_0x022d:
            r5.A01 = r7
        L_0x022f:
            java.util.concurrent.BlockingQueue r1 = X.UHJ.A07
            boolean r0 = r1.offer(r5)
            if (r0 != 0) goto L_0x0259
            java.lang.Object r0 = r1.poll()
            X.V3b r0 = (X.C16718V3b) r0
            if (r0 == 0) goto L_0x022f
            X.C18973WFa.A01(r0)
            goto L_0x022f
        L_0x0243:
            if (r3 == 0) goto L_0x01e6
            int r1 = r3.A00
            if (r1 == 0) goto L_0x01e6
            byte[] r0 = r3.A02
            X.W1g r2 = X.W1g.A00(r0, r1)
            X.C18973WFa.A01(r3)
            if (r2 == 0) goto L_0x01e6
            java.util.concurrent.atomic.AtomicLong r0 = r6.A04
            r0.incrementAndGet()
        L_0x0259:
            return r2
        L_0x025a:
            X.C18973WFa.A01(r5)
            return r2
        L_0x025e:
            r1 = move-exception
            X.1yR r0 = X.1yR.A0S     // Catch:{ all -> 0x026b }
            r0.A04(r1)     // Catch:{ all -> 0x026b }
            if (r4 == 0) goto L_0x0269
            r4.close()     // Catch:{ IOException -> 0x0269 }
        L_0x0269:
            r2 = 0
            return r2
        L_0x026b:
            r0 = move-exception
            if (r4 == 0) goto L_0x0273
            r4.close()     // Catch:{ IOException -> 0x0273 }
            throw r0
        L_0x0272:
            r0 = move-exception
        L_0x0273:
            throw r0
        L_0x0274:
            r2 = move-exception
            java.lang.String r1 = "MapTileProvider"
            java.lang.String r0 = "Broken URL provided"
            android.util.Log.e(r1, r0, r2)
            X.W1g r2 = X.C21007X9g.A00
            return r2
        L_0x027f:
            java.lang.String r0 = "y cannot exceed "
            java.lang.IllegalArgumentException r0 = X.C51971G9r.A0l(r0, r1, r2, r7)
            throw r0
        L_0x0286:
            java.lang.String r0 = "x cannot exceed "
            java.lang.IllegalArgumentException r0 = X.C51971G9r.A0l(r0, r1, r2, r7)
            throw r0
        L_0x028d:
            java.lang.String r1 = "y cannot deceed 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0295:
            java.lang.String r1 = "x cannot deceed 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UH2.A0H(int, int, int):X.W1g");
    }
}
