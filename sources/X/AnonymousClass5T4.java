package X;

/* renamed from: X.5T4  reason: invalid class name */
public class AnonymousClass5T4 {
    public final C285045Pl A00 = new C285045Pl(new AnonymousClass5T5[16]);

    public final void A01() {
        int i = 0;
        while (true) {
            C285045Pl r2 = this.A00;
            if (i < r2.A00) {
                AnonymousClass5T5 r1 = (AnonymousClass5T5) r2.A02[i];
                if (!r1.A06.A08) {
                    r1.A00();
                    r2.A00(i);
                } else {
                    i++;
                    r1.A01();
                }
            } else {
                return;
            }
        }
    }

    public final void A00() {
        if (this instanceof AnonymousClass5T5) {
            AnonymousClass5T5 r4 = (AnonymousClass5T5) this;
            C285045Pl r0 = r4.A00;
            int i = r0.A00;
            if (i > 0) {
                Object[] objArr = r0.A02;
                int i2 = 0;
                do {
                    ((AnonymousClass5T4) objArr[i2]).A00();
                    i2++;
                } while (i2 < i);
            }
            C267794cD r6 = r4.A06;
            C285045Pl r3 = null;
            while (r6 != null) {
                if (r6 instanceof AnonymousClass5VD) {
                    ((AnonymousClass5VD) r6).D0Z();
                } else if ((r6.A01 & 16) != 0 && (r6 instanceof C267944cV)) {
                    int i3 = 0;
                    for (C267794cD r2 = ((C267944cV) r6).A00; r2 != null; r2 = r2.A02) {
                        if ((r2.A01 & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                r6 = r2;
                            } else {
                                if (r3 == null) {
                                    r3 = new C285045Pl(new C267794cD[16]);
                                }
                                if (r6 != null) {
                                    r3.A09(r6);
                                    r6 = null;
                                }
                                r3.A09(r2);
                            }
                        }
                    }
                    if (i3 == 1) {
                    }
                }
                r6 = AnonymousClass5WH.A00(r3);
            }
            return;
        }
        C285045Pl r02 = this.A00;
        int i4 = r02.A00;
        if (i4 > 0) {
            int i5 = 0;
            Object[] objArr2 = r02.A02;
            do {
                ((AnonymousClass5T4) objArr2[i5]).A00();
                i5++;
            } while (i5 < i4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 >= 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.0vt r8, long r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass5T5
            if (r0 == 0) goto L_0x004b
            r4 = r7
            X.5T5 r4 = (X.AnonymousClass5T5) r4
            X.Pzi r5 = r4.A07
            int r6 = r5.A00
            r3 = 0
        L_0x000c:
            if (r3 >= r6) goto L_0x0027
            long[] r0 = r5.A01
            r1 = r0[r3]
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0048
            r3 = 0
            java.lang.Object[] r2 = r8.A01
            int r1 = r8.A00
        L_0x001b:
            if (r3 >= r1) goto L_0x003f
            r0 = r2[r3]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x003c
            if (r3 < 0) goto L_0x003f
        L_0x0027:
            X.5Pl r0 = r4.A00
        L_0x0029:
            int r3 = r0.A00
            if (r3 <= 0) goto L_0x003b
            r2 = 0
            java.lang.Object[] r1 = r0.A02
        L_0x0030:
            r0 = r1[r2]
            X.5T4 r0 = (X.AnonymousClass5T4) r0
            r0.A02(r8, r9)
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x0030
        L_0x003b:
            return
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x003f:
            r5.A01(r9)
            X.01c r0 = r4.A05
            r0.A08(r9)
            goto L_0x0027
        L_0x0048:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x004b:
            X.5Pl r0 = r7.A00
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5T4.A02(X.0vt, long):void");
    }

    public void A03(GPV gpv) {
        C285045Pl r2 = this.A00;
        int i = r2.A00;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((AnonymousClass5T5) r2.A02[i]).A07.A00 == 0) {
                r2.A00(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.01c r6, X.GPV r7, X.C268064ch r8, boolean r9) {
        /*
            r5 = this;
            X.5Pl r0 = r5.A00
            int r4 = r0.A00
            r1 = 0
            if (r4 <= 0) goto L_0x001d
            java.lang.Object[] r3 = r0.A02
            r2 = 0
        L_0x000a:
            r0 = r3[r2]
            X.5T4 r0 = (X.AnonymousClass5T4) r0
            boolean r0 = r0.A04(r6, r7, r8, r9)
            if (r0 != 0) goto L_0x0018
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r1 = 1
        L_0x0019:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x000a
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5T4.A04(X.01c, X.GPV, X.4ch, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0102, code lost:
        if (r0 != false) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.01c r17, X.GPV r18, X.C268064ch r19, boolean r20) {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = r1 instanceof X.AnonymousClass5T5
            r10 = r18
            r5 = r20
            if (r0 == 0) goto L_0x00e8
            r14 = r1
            X.5T5 r14 = (X.AnonymousClass5T5) r14
            X.01c r13 = r14.A05
            int r1 = r13.A00()
            r0 = 0
            if (r1 != 0) goto L_0x0017
            r0 = 1
        L_0x0017:
            r1 = 0
            r8 = 1
            if (r0 != 0) goto L_0x0109
            X.4cD r7 = r14.A06
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0109
            X.6Ft r9 = r14.A00
            X.0qQ.A0A(r9)
            X.4ch r0 = r14.A01
            X.0qQ.A0A(r0)
            long r2 = r0.Bwh()
            r12 = r7
            r6 = 16
            r15 = 0
            r11 = r15
        L_0x0034:
            boolean r0 = r12 instanceof X.AnonymousClass5VD
            if (r0 == 0) goto L_0x00af
            X.5VD r12 = (X.AnonymousClass5VD) r12
            X.GWN r0 = X.GWN.Initial
            r12.DXw(r9, r0, r2)
        L_0x003f:
            X.4cD r12 = X.AnonymousClass5WH.A00(r11)
        L_0x0043:
            if (r12 != 0) goto L_0x0034
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0062
            X.5Pl r0 = r14.A00
            int r12 = r0.A00
            if (r12 <= 0) goto L_0x0062
            java.lang.Object[] r11 = r0.A02
            r4 = 0
        L_0x0052:
            r1 = r11[r4]
            X.5T4 r1 = (X.AnonymousClass5T4) r1
            X.4ch r0 = r14.A01
            X.0qQ.A0A(r0)
            r1.A05(r13, r10, r0, r5)
            int r4 = r4 + 1
            if (r4 < r12) goto L_0x0052
        L_0x0062:
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x00e6
            r5 = r15
        L_0x0067:
            boolean r0 = r7 instanceof X.AnonymousClass5VD
            if (r0 == 0) goto L_0x0079
            X.5VD r7 = (X.AnonymousClass5VD) r7
            X.GWN r0 = X.GWN.Main
            r7.DXw(r9, r0, r2)
        L_0x0072:
            X.4cD r7 = X.AnonymousClass5WH.A00(r5)
        L_0x0076:
            if (r7 == 0) goto L_0x00e6
            goto L_0x0067
        L_0x0079:
            int r0 = r7.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0072
            boolean r0 = r7 instanceof X.C267944cV
            if (r0 == 0) goto L_0x0072
            r0 = r7
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r4 = r0.A00
            r1 = 0
        L_0x0089:
            if (r4 == 0) goto L_0x00ac
            int r0 = r4.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0096
            int r1 = r1 + 1
            if (r1 != r8) goto L_0x0099
            r7 = r4
        L_0x0096:
            X.4cD r4 = r4.A02
            goto L_0x0089
        L_0x0099:
            if (r5 != 0) goto L_0x00a2
            X.4cD[] r0 = new X.C267794cD[r6]
            X.5Pl r5 = new X.5Pl
            r5.<init>(r0)
        L_0x00a2:
            if (r7 == 0) goto L_0x00a8
            r5.A09(r7)
            r7 = r15
        L_0x00a8:
            r5.A09(r4)
            goto L_0x0096
        L_0x00ac:
            if (r1 != r8) goto L_0x0072
            goto L_0x0076
        L_0x00af:
            int r0 = r12.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x003f
            boolean r0 = r12 instanceof X.C267944cV
            if (r0 == 0) goto L_0x003f
            r0 = r12
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r4 = r0.A00
            r1 = 0
        L_0x00bf:
            if (r4 == 0) goto L_0x00e2
            int r0 = r4.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00cc
            int r1 = r1 + 1
            if (r1 != r8) goto L_0x00cf
            r12 = r4
        L_0x00cc:
            X.4cD r4 = r4.A02
            goto L_0x00bf
        L_0x00cf:
            if (r11 != 0) goto L_0x00d8
            X.4cD[] r0 = new X.C267794cD[r6]
            X.5Pl r11 = new X.5Pl
            r11.<init>(r0)
        L_0x00d8:
            if (r12 == 0) goto L_0x00de
            r11.A09(r12)
            r12 = r15
        L_0x00de:
            r11.A09(r4)
            goto L_0x00cc
        L_0x00e2:
            if (r1 != r8) goto L_0x003f
            goto L_0x0043
        L_0x00e6:
            r1 = 1
            return r1
        L_0x00e8:
            X.5Pl r0 = r1.A00
            int r4 = r0.A00
            r1 = 0
            if (r4 <= 0) goto L_0x0109
            java.lang.Object[] r3 = r0.A02
            r2 = 0
        L_0x00f2:
            r0 = r3[r2]
            X.5T4 r0 = (X.AnonymousClass5T4) r0
            r6 = r19
            r7 = r17
            boolean r0 = r0.A05(r7, r10, r6, r5)
            if (r0 != 0) goto L_0x0104
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L_0x0105
        L_0x0104:
            r1 = 1
        L_0x0105:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x00f2
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5T4.A05(X.01c, X.GPV, X.4ch, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ae, code lost:
        if (r0 != false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06(X.GPV r17) {
        /*
            r16 = this;
            r6 = r16
            boolean r0 = r6 instanceof X.AnonymousClass5T5
            r5 = r17
            if (r0 == 0) goto L_0x0098
            r9 = r6
            X.5T5 r9 = (X.AnonymousClass5T5) r9
            X.01c r8 = r9.A05
            int r0 = r8.A00()
            if (r0 == 0) goto L_0x0096
            r1 = 1
            r7 = 0
            X.4cD r14 = r9.A06
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0096
            X.6Ft r13 = r9.A00
            X.0qQ.A0A(r13)
            X.4ch r0 = r9.A01
            X.0qQ.A0A(r0)
            long r2 = r0.Bwh()
            r12 = r14
            r11 = 16
            r15 = 0
            r10 = r15
        L_0x002e:
            boolean r0 = r12 instanceof X.AnonymousClass5VD
            if (r0 == 0) goto L_0x0060
            X.5VD r12 = (X.AnonymousClass5VD) r12
            X.GWN r0 = X.GWN.Final
            r12.DXw(r13, r0, r2)
        L_0x0039:
            X.4cD r12 = X.AnonymousClass5WH.A00(r10)
        L_0x003d:
            if (r12 != 0) goto L_0x002e
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0056
            X.5Pl r0 = r9.A00
            int r3 = r0.A00
            if (r3 <= 0) goto L_0x0056
            java.lang.Object[] r2 = r0.A02
        L_0x004b:
            r0 = r2[r7]
            X.5T4 r0 = (X.AnonymousClass5T4) r0
            r0.A06(r5)
            int r7 = r7 + 1
            if (r7 < r3) goto L_0x004b
        L_0x0056:
            r9.A03(r5)
            r8.A07()
            r0 = 0
            r9.A01 = r0
            return r1
        L_0x0060:
            int r0 = r12.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0039
            boolean r0 = r12 instanceof X.C267944cV
            if (r0 == 0) goto L_0x0039
            r0 = r12
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r6 = r0.A00
            r4 = 0
        L_0x0070:
            if (r6 == 0) goto L_0x0093
            int r0 = r6.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x007d
            int r4 = r4 + 1
            if (r4 != r1) goto L_0x0080
            r12 = r6
        L_0x007d:
            X.4cD r6 = r6.A02
            goto L_0x0070
        L_0x0080:
            if (r10 != 0) goto L_0x0089
            X.4cD[] r0 = new X.C267794cD[r11]
            X.5Pl r10 = new X.5Pl
            r10.<init>(r0)
        L_0x0089:
            if (r12 == 0) goto L_0x008f
            r10.A09(r12)
            r12 = r15
        L_0x008f:
            r10.A09(r6)
            goto L_0x007d
        L_0x0093:
            if (r4 != r1) goto L_0x0039
            goto L_0x003d
        L_0x0096:
            r1 = 0
            goto L_0x0056
        L_0x0098:
            X.5Pl r0 = r6.A00
            int r4 = r0.A00
            r1 = 0
            if (r4 <= 0) goto L_0x00b5
            java.lang.Object[] r3 = r0.A02
            r2 = 0
        L_0x00a2:
            r0 = r3[r2]
            X.5T4 r0 = (X.AnonymousClass5T4) r0
            boolean r0 = r0.A06(r5)
            if (r0 != 0) goto L_0x00b0
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L_0x00b1
        L_0x00b0:
            r1 = 1
        L_0x00b1:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x00a2
        L_0x00b5:
            r6.A03(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5T4.A06(X.GPV):boolean");
    }
}
