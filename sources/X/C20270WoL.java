package X;

/* renamed from: X.WoL  reason: case insensitive filesystem */
public final class C20270WoL implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C18758Vzt A02;

    public C20270WoL(C18758Vzt vzt, int i, int i2) {
        this.A02 = vzt;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011e, code lost:
        r11 = r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0122, code lost:
        if (r11 == null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0124, code lost:
        if (r15 >= r4) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r14 = (android.graphics.Bitmap) r11.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0130, code lost:
        if (r6.A06() == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013a, code lost:
        if (X.0qQ.A0K(r6.A05(), r14) != false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
        r13 = new android.graphics.Canvas((android.graphics.Bitmap) r6.A05());
        r13.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        r13.drawBitmap(r14, 0.0f, 0.0f, (android.graphics.Paint) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0151, code lost:
        r13 = new X.2HY(r15 + 1, r4).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0160, code lost:
        if (r13.hasNext() == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0162, code lost:
        r3.A06.A00((android.graphics.Bitmap) r6.A05(), r13.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0179, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0180, code lost:
        if (r6.A06() == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0182, code lost:
        new android.graphics.Canvas((android.graphics.Bitmap) r6.A05()).drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0192, code lost:
        r11 = new X.2HY(0, r4).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019f, code lost:
        if (r11.hasNext() == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a1, code lost:
        r3.A06.A00((android.graphics.Bitmap) r6.A05(), r11.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        X.1zE.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cb, code lost:
        X.1zE.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ce, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
        L_0x0000:
            r1 = r22
            X.Vzt r3 = r1.A02
            int r7 = r3.A00
            r2 = 0
            if (r7 >= r2) goto L_0x000a
            r7 = 0
        L_0x000a:
            int r0 = r1.A01
            r21 = r0
            int r0 = r1.A00
            r20 = r0
            X.VLT r0 = r3.A05
            r19 = r0
            int r0 = r3.A03
            r18 = r0
            X.2HY r0 = X.C229632nm.A0C(r2, r0)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0026:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0047
            r0 = r5
            X.0sh r0 = (X.0sh) r0
            int r4 = r0.A00()
            int r4 = r4 + r7
            r0 = r19
            int r1 = r0.A00
            int r4 = r4 % r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            if (r4 < 0) goto L_0x0045
            if (r0 == 0) goto L_0x0045
        L_0x0041:
            X.AnonymousClass7TF.A1M(r6, r4)
            goto L_0x0026
        L_0x0045:
            int r4 = r4 + r1
            goto L_0x0041
        L_0x0047:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0050:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r4 = r6.next()
            int r1 = X.AnonymousClass7TE.A0M(r4)
            java.util.Set r0 = r3.A02
            boolean r0 = X.Pxf.A1U(r0, r1)
            if (r0 == 0) goto L_0x0050
            r5.add(r4)
            goto L_0x0050
        L_0x006a:
            java.util.Set r9 = X.00k.A0k(r5)
            java.util.concurrent.ConcurrentHashMap r8 = r3.A08
            java.util.Set r0 = r8.keySet()
            X.0qQ.A07(r0)
            java.util.Set r1 = X.094.A02(r9, r0)
            java.util.ArrayDeque r17 = new java.util.ArrayDeque
            r0 = r17
            r0.<init>(r1)
            java.util.Iterator r16 = r5.iterator()
        L_0x0086:
            boolean r0 = r16.hasNext()
            r11 = 1
            if (r0 == 0) goto L_0x01cf
            int r4 = X.AnonymousClass7TG.A0F(r16)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r8.get(r10)
            if (r0 != 0) goto L_0x0086
            int r0 = r3.A00
            r1 = -1
            if (r0 == r1) goto L_0x00a8
            boolean r0 = X.Pxf.A1U(r9, r0)
            if (r0 != 0) goto L_0x00a8
            goto L_0x0000
        L_0x00a8:
            java.lang.Object r0 = r17.pollFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00b4
            int r1 = r0.intValue()
        L_0x00b4:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.lang.Object r12 = r8.get(r7)
            X.VQj r12 = (X.VQj) r12
            if (r12 == 0) goto L_0x00cb
            X.3kY r0 = r12.A01
            X.3kY r6 = r0.A04()
            if (r6 == 0) goto L_0x00cb
        L_0x00c8:
            r12.A00 = r11
            goto L_0x00e3
        L_0x00cb:
            X.1TV r12 = r3.A07
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            r1 = r21
            r0 = r20
            X.3kY r0 = r12.A00(r6, r1, r0)
            X.VQj r12 = new X.VQj
            r12.<init>(r0)
            X.3kY r0 = r12.A01
            X.3kY r6 = r0.A03()
            goto L_0x00c8
        L_0x00e3:
            r0 = r19
            int r11 = r0.A00     // Catch:{ all -> 0x01c8 }
            X.2HY r0 = new X.2HY     // Catch:{ all -> 0x01c8 }
            r0.<init>(r2, r11)     // Catch:{ all -> 0x01c8 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x01c8 }
        L_0x00f0:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x017c
            r0 = r13
            X.0sh r0 = (X.0sh) r0     // Catch:{ all -> 0x01c8 }
            int r0 = r0.A00()     // Catch:{ all -> 0x01c8 }
            int r15 = r4 - r0
            int r15 = r15 % r11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x01c8 }
            if (r15 < 0) goto L_0x0109
            if (r0 == 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            int r15 = r15 + r11
        L_0x010a:
            java.lang.Object r1 = X.C51968G9o.A0z(r8, r15)     // Catch:{ all -> 0x01c8 }
            X.VQj r1 = (X.VQj) r1     // Catch:{ all -> 0x01c8 }
            if (r1 == 0) goto L_0x00f0
            boolean r0 = r1.A00     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x00f0
            X.3kY r1 = r1.A01     // Catch:{ all -> 0x01c8 }
            boolean r0 = r1.A06()     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x00f0
            X.3kY r11 = r1.A04()     // Catch:{ all -> 0x01c8 }
            if (r11 == 0) goto L_0x017c
            if (r15 >= r4) goto L_0x0179
            java.lang.Object r14 = r11.A05()     // Catch:{ all -> 0x01c1 }
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch:{ all -> 0x01c1 }
            boolean r0 = r6.A06()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x0151
            java.lang.Object r0 = r6.A05()     // Catch:{ all -> 0x01c1 }
            boolean r0 = X.0qQ.A0K(r0, r14)     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x0151
            java.lang.Object r0 = r6.A05()     // Catch:{ all -> 0x01c1 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x01c1 }
            android.graphics.Canvas r13 = new android.graphics.Canvas     // Catch:{ all -> 0x01c1 }
            r13.<init>(r0)     // Catch:{ all -> 0x01c1 }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x01c1 }
            r13.drawColor(r2, r0)     // Catch:{ all -> 0x01c1 }
            r0 = 0
            r1 = 0
            r13.drawBitmap(r14, r1, r1, r0)     // Catch:{ all -> 0x01c1 }
        L_0x0151:
            int r1 = r15 + 1
            X.2HY r0 = new X.2HY     // Catch:{ all -> 0x01c1 }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x01c1 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x01c1 }
        L_0x015c:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x0175
            r0 = r13
            X.0sh r0 = (X.0sh) r0     // Catch:{ all -> 0x01c1 }
            int r4 = r0.A00()     // Catch:{ all -> 0x01c1 }
            X.VhT r1 = r3.A06     // Catch:{ all -> 0x01c1 }
            java.lang.Object r0 = r6.A05()     // Catch:{ all -> 0x01c1 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x01c1 }
            r1.A00(r0, r4)     // Catch:{ all -> 0x01c1 }
            goto L_0x015c
        L_0x0175:
            r11.close()     // Catch:{ all -> 0x01c8 }
            goto L_0x01b4
        L_0x0179:
            r11.close()     // Catch:{ all -> 0x01c8 }
        L_0x017c:
            boolean r0 = r6.A06()     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x0192
            java.lang.Object r0 = r6.A05()     // Catch:{ all -> 0x01c8 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x01c8 }
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch:{ all -> 0x01c8 }
            r1.<init>(r0)     // Catch:{ all -> 0x01c8 }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x01c8 }
            r1.drawColor(r2, r0)     // Catch:{ all -> 0x01c8 }
        L_0x0192:
            X.2HY r0 = new X.2HY     // Catch:{ all -> 0x01c8 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x01c8 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x01c8 }
        L_0x019b:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x01b4
            r0 = r11
            X.0sh r0 = (X.0sh) r0     // Catch:{ all -> 0x01c8 }
            int r4 = r0.A00()     // Catch:{ all -> 0x01c8 }
            X.VhT r1 = r3.A06     // Catch:{ all -> 0x01c8 }
            java.lang.Object r0 = r6.A05()     // Catch:{ all -> 0x01c8 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x01c8 }
            r1.A00(r0, r4)     // Catch:{ all -> 0x01c8 }
            goto L_0x019b
        L_0x01b4:
            r6.close()
            r8.remove(r7)
            r12.A00 = r2
            r8.put(r10, r12)
            goto L_0x0086
        L_0x01c1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            r0 = move-exception
            X.1zE.A00(r11, r1)     // Catch:{ all -> 0x01c8 }
            throw r0     // Catch:{ all -> 0x01c8 }
        L_0x01c8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ca }
        L_0x01ca:
            r0 = move-exception
            X.1zE.A00(r6, r1)
            throw r0
        L_0x01cf:
            boolean r0 = r5.isEmpty()
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01e1
            r0 = r18
            float r0 = (float) r0
            float r0 = r0 * r4
            int r0 = (int) r0
        L_0x01dc:
            r3.A0A = r0
            r3.A0B = r2
            return
        L_0x01e1:
            int r1 = r5.size()
            float r0 = (float) r1
            float r0 = r0 * r4
            int r0 = (int) r0
            int r1 = r1 - r11
            int r0 = X.C229632nm.A03(r0, r2, r1)
            int r0 = X.C51971G9r.A0I(r5, r0)
            goto L_0x01dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20270WoL.run():void");
    }
}
