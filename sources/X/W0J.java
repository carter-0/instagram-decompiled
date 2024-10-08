package X;

public final class W0J {
    public int A00;
    public int A01 = -1;
    public int A02 = 0;
    public int A03 = -1;
    public W1g A04;
    public W1g A05;
    public W1g A06;

    private String A00(W1g w1g, int i) {
        if (i < 0) {
            return "<snip>";
        }
        if (w1g == null) {
            return "\n{x}";
        }
        String A0R = 002.A0R("\n", w1g.toString());
        W1g[] w1gArr = w1g.A09;
        int i2 = 0;
        do {
            A0R = 002.A0R(A0R, A00(w1gArr[i2], i - 1).replace("\n", "\n-"));
            i2++;
        } while (i2 < 4);
        return A0R;
    }

    public static void A01(W0J w0j, W1g w1g) {
        if (w1g == w0j.A04) {
            w0j.A04 = w1g.A07;
        }
        if (w1g == w0j.A05) {
            w0j.A05 = w1g.A06;
        }
        W1g w1g2 = w1g.A07;
        if (w1g2 != null) {
            w1g2.A06 = w1g.A06;
        }
        W1g w1g3 = w1g.A06;
        if (w1g3 != null) {
            w1g3.A07 = w1g2;
        }
        w1g.A07 = null;
        w1g.A06 = null;
    }

    public final String toString() {
        return 002.A0R(A00(this.A06, 10), "\n");
    }

    public W0J() {
        W1g w1g = new W1g(-1, -1);
        this.A06 = w1g;
        w1g.A02 = 0;
        w1g.A03 = 0;
        w1g.A04 = 0;
        this.A04 = w1g;
        this.A05 = w1g;
        this.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x009d, code lost:
        X.C13989Tnp.A1L(X.1yR.A0W, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a2, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r14 = this;
            long r2 = java.lang.System.nanoTime()
            int r5 = r14.A01     // Catch:{ all -> 0x009c }
            r4 = -1
            if (r5 == r4) goto L_0x004b
            int r0 = r14.A02     // Catch:{ all -> 0x009c }
            int r5 = r5 - r0
            int r1 = r14.A03     // Catch:{ all -> 0x009c }
            r11 = 1
            r0 = 0
            if (r1 == r4) goto L_0x0015
            int r1 = r1 << r11
            int r0 = r11 << r1
        L_0x0015:
            int r5 = r5 + r0
            int r0 = r14.A00     // Catch:{ all -> 0x009c }
            if (r0 <= r5) goto L_0x004b
            X.W1g r4 = r14.A04     // Catch:{ all -> 0x009c }
        L_0x001c:
            int r0 = r14.A00     // Catch:{ all -> 0x009c }
            r10 = 0
            if (r0 <= r5) goto L_0x0051
            if (r4 == 0) goto L_0x0051
            android.graphics.Bitmap r0 = r4.A02()     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0043
            int r1 = r4.A04     // Catch:{ all -> 0x009c }
            int r0 = r14.A03     // Catch:{ all -> 0x009c }
            if (r1 == r0) goto L_0x0043
            int r0 = r4.A0B     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x0043
            monitor-enter(r4)     // Catch:{ all -> 0x009c }
            android.graphics.Bitmap r0 = r4.A05     // Catch:{ all -> 0x0046 }
            if (r0 == r10) goto L_0x003b
            X.W1g.A01(r4)     // Catch:{ all -> 0x0046 }
        L_0x003b:
            r4.A05 = r10     // Catch:{ all -> 0x0046 }
            monitor-exit(r4)     // Catch:{ all -> 0x009c }
            int r0 = r14.A00     // Catch:{ all -> 0x009c }
            int r0 = r0 - r11
            r14.A00 = r0     // Catch:{ all -> 0x009c }
        L_0x0043:
            X.W1g r4 = r4.A07     // Catch:{ all -> 0x009c }
            goto L_0x001c
        L_0x0046:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x0049:
            if (r13 != 0) goto L_0x0051
        L_0x004b:
            X.1yR r0 = X.1yR.A0W
            X.C13989Tnp.A1L(r0, r2)
            return
        L_0x0051:
            X.W1g r9 = r14.A04     // Catch:{ all -> 0x009c }
            r13 = 0
        L_0x0054:
            if (r9 == 0) goto L_0x0049
            r8 = 0
        L_0x0057:
            r12 = 4
            if (r8 >= r12) goto L_0x0099
            X.W1g[] r0 = r9.A09     // Catch:{ all -> 0x009c }
            r7 = r0[r8]     // Catch:{ all -> 0x009c }
            if (r7 == 0) goto L_0x0096
            int r0 = r7.A0B     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x0096
            android.graphics.Bitmap r0 = r7.A02()     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x0096
            r6 = 0
            r1 = 0
            r5 = -1
        L_0x006d:
            X.W1g[] r4 = r7.A09     // Catch:{ all -> 0x009c }
            r0 = r4[r6]     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0076
            int r1 = r1 + 1
            r5 = r6
        L_0x0076:
            int r6 = r6 + 1
            if (r6 < r12) goto L_0x006d
            if (r1 != r11) goto L_0x0089
            X.W1g[] r1 = r9.A09     // Catch:{ all -> 0x009c }
            r0 = r4[r5]     // Catch:{ all -> 0x009c }
            r1[r8] = r0     // Catch:{ all -> 0x009c }
            A01(r14, r7)     // Catch:{ all -> 0x009c }
            r7.A03()     // Catch:{ all -> 0x009c }
            goto L_0x0095
        L_0x0089:
            if (r1 != 0) goto L_0x0096
            X.W1g[] r0 = r9.A09     // Catch:{ all -> 0x009c }
            r0[r8] = r10     // Catch:{ all -> 0x009c }
            A01(r14, r7)     // Catch:{ all -> 0x009c }
            r7.A03()     // Catch:{ all -> 0x009c }
        L_0x0095:
            r13 = 1
        L_0x0096:
            int r8 = r8 + 1
            goto L_0x0057
        L_0x0099:
            X.W1g r9 = r9.A07     // Catch:{ all -> 0x009c }
            goto L_0x0054
        L_0x009c:
            r1 = move-exception
            X.1yR r0 = X.1yR.A0W
            X.C13989Tnp.A1L(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W0J.A02():void");
    }

    public final void A03(W1g w1g) {
        int i;
        int i2;
        int i3;
        int A09;
        W1g[] w1gArr;
        int i4;
        if (w1g.A02() != null) {
            this.A00++;
        }
        W1g w1g2 = this.A06;
        while (true) {
            i = w1g.A02;
            i2 = w1g.A03;
            i3 = w1g.A04;
            A09 = C13989Tnp.A09(i3, w1g2.A04, i, i2);
            w1gArr = w1g2.A09;
            W1g w1g3 = w1gArr[A09];
            if (w1g3 == null || i3 <= (i4 = w1g3.A04)) {
                break;
            }
            int i5 = i3 - i4;
            if ((i >> i5) != w1g3.A02 || (i2 >> i5) != w1g3.A03) {
                break;
            }
            w1g2 = w1gArr[A09];
        }
        W1g w1g4 = w1gArr[A09];
        if (w1g4 == null) {
            w1gArr[A09] = w1g;
        } else {
            int i6 = w1g4.A04;
            if (i3 < i6) {
                w1gArr[A09] = w1g;
                w1g.A09[C13989Tnp.A09(w1g4.A04, i3, w1g4.A02, w1g4.A03)] = w1g4;
            } else if (i6 == i3 && w1g4.A02 == i && w1g4.A03 == i2) {
                A01(this, w1g4);
                System.arraycopy(w1g4.A09, 0, w1g.A09, 0, 4);
                w1gArr[A09] = w1g;
                if (w1g4.A02() != null) {
                    this.A00--;
                }
                w1g4.A03();
            } else {
                int i7 = i3 - i6;
                int i8 = i >> i7;
                int i9 = i2 >> i7;
                int i10 = w1g4.A02;
                int i11 = w1g4.A03;
                while (true) {
                    if (i8 == i10 && i9 == i11) {
                        break;
                    }
                    i8 >>= 1;
                    i9 >>= 1;
                    i10 >>= 1;
                    i11 >>= 1;
                    i6--;
                }
                W1g w1g5 = new W1g(-1, -1);
                w1g5.A02 = i8;
                w1g5.A03 = i9;
                w1g5.A04 = i6;
                w1gArr[A09] = w1g5;
                W1g[] w1gArr2 = w1g5.A09;
                w1gArr2[C13989Tnp.A09(w1g4.A04, i6, w1g4.A02, w1g4.A03)] = w1g4;
                w1gArr2[C13989Tnp.A09(w1g.A04, i6, w1g.A02, w1g.A03)] = w1g;
                A01(this, w1g5);
                W1g w1g6 = this.A05;
                w1g6.A07 = w1g5;
                w1g5.A06 = w1g6;
                this.A05 = w1g5;
            }
        }
        A01(this, w1g);
        W1g w1g7 = this.A05;
        w1g7.A07 = w1g;
        w1g.A06 = w1g7;
        this.A05 = w1g;
        A02();
    }
}
