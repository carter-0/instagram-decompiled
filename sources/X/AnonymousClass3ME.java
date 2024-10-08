package X;

/* renamed from: X.3ME  reason: invalid class name */
public final class AnonymousClass3ME extends AnonymousClass3MF {
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02 = true;
    public boolean A03 = false;

    public final boolean A0V() {
        return true;
    }

    public final boolean A0e() {
        int i;
        2d5 r0;
        2d5 r02;
        2d5 r03;
        boolean A0W;
        int i2 = 0;
        boolean z = true;
        while (true) {
            i = this.A00;
            if (i2 >= i) {
                break;
            }
            2d3 r1 = this.A01[i2];
            if (this.A02 || r1.A0V()) {
                int i3 = this.A00;
                if (i3 == 0 || i3 == 1) {
                    A0W = r1.A0W();
                } else if (i3 == 2 || i3 == 3) {
                    A0W = r1.A0X();
                }
                if (!A0W) {
                    z = false;
                }
            }
            i2++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i4 = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.A00; i5++) {
            2d3 r6 = this.A01[i5];
            if (this.A02 || r6.A0V()) {
                if (!z2) {
                    int i6 = this.A00;
                    if (i6 == 0) {
                        r03 = 2d5.A06;
                    } else if (i6 == 1) {
                        r03 = 2d5.A07;
                    } else if (i6 == 2) {
                        r03 = 2d5.A08;
                    } else {
                        if (i6 == 3) {
                            r03 = 2d5.A02;
                        }
                        z2 = true;
                    }
                    i4 = r6.A0A(r03).A00();
                    z2 = true;
                }
                int i7 = this.A00;
                if (i7 == 0) {
                    r02 = 2d5.A06;
                } else {
                    if (i7 == 1) {
                        r0 = 2d5.A07;
                    } else if (i7 == 2) {
                        r02 = 2d5.A08;
                    } else if (i7 == 3) {
                        r0 = 2d5.A02;
                    }
                    i4 = Math.max(i4, r6.A0A(r0).A00());
                }
                i4 = Math.min(i4, r6.A0A(r02).A00());
            }
        }
        int i8 = i4 + this.A01;
        int i9 = this.A00;
        if (i9 == 0 || i9 == 1) {
            A0J(i8, i8);
        } else {
            A0K(i8, i8);
        }
        this.A03 = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bf, code lost:
        if (r20.A08() != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cd, code lost:
        if (r19.A08() != false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d8, code lost:
        if (r1 == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (r2 == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015e, code lost:
        if (r1 != false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0160, code lost:
        r17 = 5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(X.2dA r22, boolean r23) {
        /*
            r21 = this;
            r5 = r21
            X.2d6[] r2 = r5.A11
            X.2d6 r9 = r5.A0e
            r6 = 0
            r2[r6] = r9
            X.2d6 r8 = r5.A0g
            r11 = 2
            r2[r11] = r8
            X.2d6 r0 = r5.A0f
            r20 = r0
            r12 = 1
            r2[r12] = r0
            X.2d6 r0 = r5.A0a
            r19 = r0
            r13 = 3
            r2[r13] = r0
            r3 = 0
        L_0x001d:
            int r0 = r2.length
            r7 = r22
            if (r3 >= r0) goto L_0x002d
            r1 = r2[r3]
            X.2dB r0 = r7.A09(r1)
            r1.A03 = r0
            int r3 = r3 + 1
            goto L_0x001d
        L_0x002d:
            int r0 = r5.A00
            if (r0 < 0) goto L_0x005d
            r4 = 4
            if (r0 >= r4) goto L_0x005d
            r18 = r2[r0]
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x003d
            r5.A0e()
        L_0x003d:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x006c
            r5.A03 = r6
            int r0 = r5.A00
            if (r0 == 0) goto L_0x005e
            if (r0 == r12) goto L_0x005e
            if (r0 == r11) goto L_0x004d
            if (r0 != r13) goto L_0x005d
        L_0x004d:
            X.2dB r1 = r8.A03
            int r0 = r5.A0W
            r7.A0D(r1, r0)
            r0 = r19
            X.2dB r1 = r0.A03
            int r0 = r5.A0W
        L_0x005a:
            r7.A0D(r1, r0)
        L_0x005d:
            return
        L_0x005e:
            X.2dB r1 = r9.A03
            int r0 = r5.A0V
            r7.A0D(r1, r0)
            r0 = r20
            X.2dB r1 = r0.A03
            int r0 = r5.A0V
            goto L_0x005a
        L_0x006c:
            r2 = 0
        L_0x006d:
            int r0 = r5.A00
            if (r2 >= r0) goto L_0x00b3
            X.2d3[] r0 = r5.A01
            r3 = r0[r2]
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0082
            boolean r0 = r3.A0V()
            if (r0 != 0) goto L_0x0082
        L_0x007f:
            int r2 = r2 + 1
            goto L_0x006d
        L_0x0082:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x00a2
            if (r0 == r12) goto L_0x00a2
            if (r0 == r11) goto L_0x008c
            if (r0 != r13) goto L_0x007f
        L_0x008c:
            java.lang.Integer[] r0 = r3.A14
            r1 = r0[r12]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x007f
            X.2d6 r0 = r3.A0g
            X.2d6 r0 = r0.A04
            if (r0 == 0) goto L_0x007f
            X.2d6 r0 = r3.A0a
        L_0x009c:
            X.2d6 r0 = r0.A04
            if (r0 == 0) goto L_0x007f
            r3 = 1
            goto L_0x00b4
        L_0x00a2:
            java.lang.Integer[] r0 = r3.A14
            r1 = r0[r6]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x007f
            X.2d6 r0 = r3.A0e
            X.2d6 r0 = r0.A04
            if (r0 == 0) goto L_0x007f
            X.2d6 r0 = r3.A0f
            goto L_0x009c
        L_0x00b3:
            r3 = 0
        L_0x00b4:
            boolean r0 = r9.A08()
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r20.A08()
            r2 = 0
            if (r0 == 0) goto L_0x00c2
        L_0x00c1:
            r2 = 1
        L_0x00c2:
            boolean r0 = r8.A08()
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r19.A08()
            r1 = 0
            if (r0 == 0) goto L_0x00d0
        L_0x00cf:
            r1 = 1
        L_0x00d0:
            if (r3 != 0) goto L_0x00da
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0157
            if (r0 != r11) goto L_0x015a
            if (r1 != 0) goto L_0x0160
        L_0x00da:
            r17 = 4
        L_0x00dc:
            r10 = 0
        L_0x00dd:
            int r0 = r5.A00
            if (r10 >= r0) goto L_0x0164
            X.2d3[] r0 = r5.A01
            r1 = r0[r10]
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r1.A0V()
            if (r0 != 0) goto L_0x00f2
        L_0x00ef:
            int r10 = r10 + 1
            goto L_0x00dd
        L_0x00f2:
            X.2d6[] r1 = r1.A11
            int r0 = r5.A00
            r0 = r1[r0]
            X.2dB r3 = r7.A09(r0)
            int r14 = r5.A00
            r1 = r1[r14]
            r1.A03 = r3
            X.2d6 r0 = r1.A04
            if (r0 == 0) goto L_0x0155
            X.2d3 r0 = r0.A08
            if (r0 != r5) goto L_0x0155
            int r2 = r1.A02
        L_0x010c:
            if (r14 == 0) goto L_0x013a
            if (r14 == r11) goto L_0x013a
            r0 = r18
            X.2dB r0 = r0.A03
            r1 = r0
            int r0 = r5.A01
            int r16 = r0 + r2
            X.2dC r14 = r7.A06()
            X.2dB r0 = r7.A07()
            r0.A04 = r6
            r15 = r1
            r1 = r0
            r0 = r16
            r14.A05(r15, r3, r1, r0)
        L_0x012a:
            r7.A0C(r14)
            r0 = r18
            X.2dB r0 = r0.A03
            int r14 = r5.A01
            int r14 = r14 + r2
            r1 = r17
            r7.A0E(r0, r3, r14, r1)
            goto L_0x00ef
        L_0x013a:
            r0 = r18
            X.2dB r0 = r0.A03
            r1 = r0
            int r0 = r5.A01
            int r16 = r0 - r2
            X.2dC r14 = r7.A06()
            X.2dB r0 = r7.A07()
            r0.A04 = r6
            r15 = r1
            r1 = r0
            r0 = r16
            r14.A06(r15, r3, r1, r0)
            goto L_0x012a
        L_0x0155:
            r2 = 0
            goto L_0x010c
        L_0x0157:
            if (r2 != 0) goto L_0x0160
            goto L_0x00da
        L_0x015a:
            if (r0 == r12) goto L_0x0157
            if (r0 != r13) goto L_0x00da
            if (r1 == 0) goto L_0x00da
        L_0x0160:
            r17 = 5
            goto L_0x00dc
        L_0x0164:
            int r0 = r5.A00
            r2 = 8
            if (r0 != 0) goto L_0x018a
            r0 = r20
            X.2dB r1 = r0.A03
            X.2dB r0 = r9.A03
            r7.A0E(r1, r0, r6, r2)
            X.2dB r1 = r9.A03
            X.2d3 r0 = r5.A0h
            X.2d6 r0 = r0.A0f
            X.2dB r0 = r0.A03
            r7.A0E(r1, r0, r6, r4)
            X.2dB r1 = r9.A03
            X.2d3 r0 = r5.A0h
            X.2d6 r0 = r0.A0e
        L_0x0184:
            X.2dB r0 = r0.A03
            r7.A0E(r1, r0, r6, r6)
            return
        L_0x018a:
            if (r0 != r12) goto L_0x01a7
            X.2dB r1 = r9.A03
            r0 = r20
            X.2dB r0 = r0.A03
            r7.A0E(r1, r0, r6, r2)
            X.2dB r1 = r9.A03
            X.2d3 r0 = r5.A0h
            X.2d6 r0 = r0.A0e
            X.2dB r0 = r0.A03
            r7.A0E(r1, r0, r6, r4)
            X.2dB r1 = r9.A03
            X.2d3 r0 = r5.A0h
            X.2d6 r0 = r0.A0f
            goto L_0x0184
        L_0x01a7:
            if (r0 != r11) goto L_0x01c4
            r0 = r19
            X.2dB r1 = r0.A03
            X.2dB r0 = r8.A03
            r7.A0E(r1, r0, r6, r2)
            X.2dB r1 = r8.A03
            X.2d3 r0 = r5.A0h
            X.2d6 r0 = r0.A0a
            X.2dB r0 = r0.A03
            r7.A0E(r1, r0, r6, r4)
            X.2dB r1 = r8.A03
            X.2d3 r0 = r5.A0h
            X.2d6 r0 = r0.A0g
            goto L_0x0184
        L_0x01c4:
            if (r0 != r13) goto L_0x005d
            X.2dB r1 = r8.A03
            r0 = r19
            X.2dB r0 = r0.A03
            r7.A0E(r1, r0, r6, r2)
            X.2dB r1 = r8.A03
            X.2d3 r0 = r5.A0h
            X.2d6 r0 = r0.A0g
            X.2dB r0 = r0.A03
            r7.A0E(r1, r0, r6, r4)
            X.2dB r1 = r8.A03
            X.2d3 r0 = r5.A0h
            X.2d6 r0 = r0.A0a
            goto L_0x0184
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ME.A0O(X.2dA, boolean):void");
    }

    public final boolean A0W() {
        return this.A03;
    }

    public final boolean A0X() {
        return this.A03;
    }

    public final int A0d() {
        int i = this.A00;
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        return -1;
    }

    public final String toString() {
        String A0g = 002.A0g("[Barrier] ", this.A0n, " {");
        for (int i = 0; i < this.A00; i++) {
            2d3 r1 = this.A01[i];
            if (i > 0) {
                A0g = 002.A0R(A0g, ", ");
            }
            A0g = 002.A0R(A0g, r1.A0n);
        }
        return 002.A0R(A0g, "}");
    }
}
