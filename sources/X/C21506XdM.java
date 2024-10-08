package X;

/* renamed from: X.XdM  reason: case insensitive filesystem */
public final class C21506XdM {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05;
    public int A06 = 0;
    public int A07 = 0;
    public int A08 = 0;
    public int A09 = 0;
    public int A0A = 0;
    public int A0B = 0;
    public 2d6 A0C;
    public 2d6 A0D;
    public 2d6 A0E;
    public 2d6 A0F;
    public 2d3 A0G = null;
    public final /* synthetic */ XGQ A0H;

    public C21506XdM(2d6 r2, 2d6 r3, 2d6 r4, 2d6 r5, XGQ xgq, int i, int i2) {
        this.A0H = xgq;
        this.A05 = i;
        this.A0D = r2;
        this.A0F = r3;
        this.A0E = r4;
        this.A0C = r5;
        this.A07 = xgq.A06;
        this.A09 = xgq.A05;
        this.A08 = xgq.A07;
        this.A06 = xgq.A02;
        this.A03 = i2;
    }

    public final int A00() {
        int i = this.A05;
        int i2 = this.A02;
        if (i == 1) {
            return i2 - this.A0H.A0H;
        }
        return i2;
    }

    public final int A01() {
        int i = this.A05;
        int i2 = this.A0B;
        if (i == 0) {
            return i2 - this.A0H.A0A;
        }
        return i2;
    }

    public final void A02(int i) {
        int i2 = this.A04;
        if (i2 != 0) {
            int i3 = this.A01;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.A0A;
                int i7 = i6 + i5;
                XGQ xgq = this.A0H;
                if (i7 >= xgq.A06) {
                    break;
                }
                2d3 r7 = xgq.A0O[i6 + i5];
                if (this.A05 == 0) {
                    if (r7 != null && r7.A14[0] == AnonymousClass05K.A0C && r7.A0H == 0) {
                        xgq.A0d(r7, AnonymousClass05K.A00, r7.A14[1], i4, r7.A06());
                    }
                } else if (r7 != null && r7.A14[1] == AnonymousClass05K.A0C && r7.A0G == 0) {
                    xgq.A0d(r7, r7.A14[0], AnonymousClass05K.A00, r7.A07(), i4);
                }
            }
            this.A0B = 0;
            this.A02 = 0;
            this.A0G = null;
            this.A00 = 0;
            int i8 = this.A01;
            int i9 = 0;
            while (i9 < i8) {
                int i10 = this.A0A;
                int i11 = i10 + i9;
                XGQ xgq2 = this.A0H;
                if (i11 < xgq2.A06) {
                    2d3 r5 = xgq2.A0O[i10 + i9];
                    if (this.A05 == 0) {
                        int A072 = r5.A07();
                        int i12 = xgq2.A0A;
                        if (r5.A0R == 8) {
                            i12 = 0;
                        }
                        this.A0B += A072 + i12;
                        int A002 = XGQ.A00(r5, xgq2, this.A03);
                        if (this.A0G == null || this.A00 < A002) {
                            this.A0G = r5;
                            this.A00 = A002;
                            this.A02 = A002;
                        }
                    } else {
                        int A012 = XGQ.A01(r5, xgq2, this.A03);
                        int A003 = XGQ.A00(r5, xgq2, this.A03);
                        int i13 = xgq2.A0H;
                        if (r5.A0R == 8) {
                            i13 = 0;
                        }
                        this.A02 += A003 + i13;
                        if (this.A0G == null || this.A00 < A012) {
                            this.A0G = r5;
                            this.A00 = A012;
                            this.A0B = A012;
                        }
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x014b, code lost:
        if (r1 != 1) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r18 != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0224, code lost:
        if (r1 != 2) goto L_0x0226;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(int r18, boolean r19, boolean r20) {
        /*
            r17 = this;
            r12 = r17
            int r11 = r12.A01
            r10 = 0
            r4 = 0
        L_0x0006:
            if (r4 >= r11) goto L_0x0031
            int r3 = r12.A0A
            int r2 = r3 + r4
            X.XGQ r1 = r12.A0H
            int r0 = r1.A06
            if (r2 >= r0) goto L_0x0031
            X.2d3[] r0 = r1.A0O
            int r3 = r3 + r4
            r0 = r0[r3]
            if (r0 == 0) goto L_0x002e
            r3 = 0
            java.util.ArrayList r2 = r0.A0p
            int r1 = r2.size()
        L_0x0020:
            if (r3 >= r1) goto L_0x002e
            java.lang.Object r0 = r2.get(r3)
            X.2d6 r0 = (X.2d6) r0
            r0.A03()
            int r3 = r3 + 1
            goto L_0x0020
        L_0x002e:
            int r4 = r4 + 1
            goto L_0x0006
        L_0x0031:
            if (r11 == 0) goto L_0x0282
            X.2d3 r9 = r12.A0G
            if (r9 == 0) goto L_0x0282
            if (r20 == 0) goto L_0x003d
            r16 = 1
            if (r18 == 0) goto L_0x003f
        L_0x003d:
            r16 = 0
        L_0x003f:
            r8 = -1
            r3 = 0
            r7 = -1
            r15 = -1
        L_0x0043:
            if (r3 >= r11) goto L_0x0065
            r0 = r3
            if (r19 == 0) goto L_0x004b
            int r0 = r11 + -1
            int r0 = r0 - r3
        L_0x004b:
            int r2 = r12.A0A
            int r2 = r2 + r0
            X.XGQ r1 = r12.A0H
            int r0 = r1.A06
            if (r2 >= r0) goto L_0x0065
            X.2d3[] r0 = r1.A0O
            r0 = r0[r2]
            if (r0 == 0) goto L_0x0062
            int r0 = r0.A0R
            if (r0 != 0) goto L_0x0062
            if (r7 != r8) goto L_0x0061
            r7 = r3
        L_0x0061:
            r15 = r3
        L_0x0062:
            int r3 = r3 + 1
            goto L_0x0043
        L_0x0065:
            r6 = 0
            int r0 = r12.A05
            if (r0 != 0) goto L_0x0189
            X.XGQ r5 = r12.A0H
            int r0 = r5.A0I
            r9.A0P = r0
            int r2 = r12.A09
            if (r18 <= 0) goto L_0x0077
            int r0 = r5.A0H
            int r2 = r2 + r0
        L_0x0077:
            X.2d6 r1 = r9.A0g
            X.2d6 r0 = r12.A0F
            r1.A05(r0, r2)
            if (r20 == 0) goto L_0x0089
            X.2d6 r2 = r9.A0a
            X.2d6 r1 = r12.A0C
            int r0 = r12.A06
            r2.A05(r1, r0)
        L_0x0089:
            if (r18 <= 0) goto L_0x0096
            X.2d6 r0 = r12.A0F
            X.2d3 r0 = r0.A08
            X.2d6 r1 = r0.A0a
            X.2d6 r0 = r9.A0g
            r1.A05(r0, r10)
        L_0x0096:
            int r1 = r5.A0G
            r0 = 3
            if (r1 != r0) goto L_0x0186
            boolean r0 = r9.A0q
            if (r0 != 0) goto L_0x0186
            r2 = 0
        L_0x00a0:
            if (r2 >= r11) goto L_0x0186
            r0 = r2
            if (r19 == 0) goto L_0x00a8
            int r0 = r11 + -1
            int r0 = r0 - r2
        L_0x00a8:
            int r1 = r12.A0A
            int r1 = r1 + r0
            int r0 = r5.A06
            if (r1 >= r0) goto L_0x0186
            X.2d3[] r0 = r5.A0O
            r13 = r0[r1]
            boolean r0 = r13.A0q
            int r2 = r2 + 1
            if (r0 == 0) goto L_0x00a0
        L_0x00b9:
            r4 = 0
        L_0x00ba:
            if (r4 >= r11) goto L_0x0282
            r14 = r4
            if (r19 == 0) goto L_0x00c2
            int r14 = r11 + -1
            int r14 = r14 - r4
        L_0x00c2:
            int r1 = r12.A0A
            int r1 = r1 + r14
            int r0 = r5.A06
            if (r1 >= r0) goto L_0x0282
            X.2d3[] r0 = r5.A0O
            r3 = r0[r1]
            if (r3 != 0) goto L_0x00d4
            r3 = r6
        L_0x00d0:
            int r4 = r4 + 1
            r6 = r3
            goto L_0x00ba
        L_0x00d4:
            if (r4 != 0) goto L_0x00df
            X.2d6 r2 = r3.A0e
            X.2d6 r1 = r12.A0D
            int r0 = r12.A07
            r3.A0S(r2, r1, r0)
        L_0x00df:
            if (r14 != 0) goto L_0x00fe
            int r14 = r5.A0B
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r5.A02
            if (r19 == 0) goto L_0x00eb
            float r1 = r2 - r1
        L_0x00eb:
            int r0 = r12.A0A
            if (r0 != 0) goto L_0x0175
            int r0 = r5.A07
            if (r0 == r8) goto L_0x0175
            r14 = r0
            if (r19 == 0) goto L_0x0172
            float r0 = r5.A00
        L_0x00f8:
            float r2 = r2 - r0
        L_0x00f9:
            r1 = r2
        L_0x00fa:
            r3.A0C = r14
            r3.A02 = r1
        L_0x00fe:
            int r0 = r11 + -1
            if (r4 != r0) goto L_0x010b
            X.2d6 r2 = r3.A0f
            X.2d6 r1 = r12.A0E
            int r0 = r12.A08
            r3.A0S(r2, r1, r0)
        L_0x010b:
            if (r6 == 0) goto L_0x012f
            X.2d6 r1 = r3.A0e
            X.2d6 r2 = r6.A0f
            int r0 = r5.A0A
            r1.A05(r2, r0)
            if (r4 != r7) goto L_0x0120
            int r6 = r12.A07
            X.2d6 r0 = r1.A04
            if (r0 == 0) goto L_0x0120
            r1.A01 = r6
        L_0x0120:
            r2.A05(r1, r10)
            int r0 = r15 + 1
            if (r4 != r0) goto L_0x012f
            int r1 = r12.A08
            X.2d6 r0 = r2.A04
            if (r0 == 0) goto L_0x012f
            r2.A01 = r1
        L_0x012f:
            if (r3 == r9) goto L_0x00d0
            int r1 = r5.A0G
            r0 = 3
            if (r1 != r0) goto L_0x0148
            boolean r0 = r13.A0q
            if (r0 == 0) goto L_0x014d
            if (r3 == r13) goto L_0x014d
            boolean r0 = r3.A0q
            if (r0 == 0) goto L_0x014d
            X.2d6 r1 = r3.A0Z
            X.2d6 r0 = r13.A0Z
        L_0x0144:
            r1.A05(r0, r10)
            goto L_0x00d0
        L_0x0148:
            if (r1 == 0) goto L_0x016d
            r0 = 1
            if (r1 == r0) goto L_0x0168
        L_0x014d:
            X.2d6 r2 = r3.A0g
            if (r16 == 0) goto L_0x0163
            X.2d6 r1 = r12.A0F
            int r0 = r12.A09
            r2.A05(r1, r0)
            X.2d6 r2 = r3.A0a
            X.2d6 r1 = r12.A0C
            int r0 = r12.A06
            r2.A05(r1, r0)
            goto L_0x00d0
        L_0x0163:
            X.2d6 r0 = r9.A0g
            r2.A05(r0, r10)
        L_0x0168:
            X.2d6 r1 = r3.A0a
            X.2d6 r0 = r9.A0a
            goto L_0x0144
        L_0x016d:
            X.2d6 r1 = r3.A0g
            X.2d6 r0 = r9.A0g
            goto L_0x0144
        L_0x0172:
            float r2 = r5.A00
            goto L_0x00f9
        L_0x0175:
            if (r20 == 0) goto L_0x00fa
            int r0 = r5.A0C
            if (r0 == r8) goto L_0x00fa
            r14 = r0
            if (r19 == 0) goto L_0x0182
            float r0 = r5.A03
            goto L_0x00f8
        L_0x0182:
            float r2 = r5.A03
            goto L_0x00f9
        L_0x0186:
            r13 = r9
            goto L_0x00b9
        L_0x0189:
            X.XGQ r3 = r12.A0H
            int r0 = r3.A0B
            r9.A0C = r0
            int r2 = r12.A07
            if (r18 <= 0) goto L_0x0196
            int r0 = r3.A0A
            int r2 = r2 + r0
        L_0x0196:
            if (r19 == 0) goto L_0x0264
            X.2d6 r1 = r9.A0f
            X.2d6 r0 = r12.A0E
            r1.A05(r0, r2)
            if (r20 == 0) goto L_0x01aa
            X.2d6 r2 = r9.A0e
            X.2d6 r1 = r12.A0D
            int r0 = r12.A08
            r2.A05(r1, r0)
        L_0x01aa:
            if (r18 <= 0) goto L_0x01b7
            X.2d6 r0 = r12.A0E
            X.2d3 r0 = r0.A08
            X.2d6 r1 = r0.A0e
            X.2d6 r0 = r9.A0f
        L_0x01b4:
            r1.A05(r0, r10)
        L_0x01b7:
            r4 = 0
        L_0x01b8:
            if (r4 >= r11) goto L_0x0282
            int r2 = r12.A0A
            int r1 = r2 + r4
            int r0 = r3.A06
            if (r1 >= r0) goto L_0x0282
            X.2d3[] r0 = r3.A0O
            int r2 = r2 + r4
            r2 = r0[r2]
            if (r2 == 0) goto L_0x0227
            if (r4 != 0) goto L_0x01e7
            X.2d6 r5 = r2.A0g
            X.2d6 r1 = r12.A0F
            int r0 = r12.A09
            r2.A0S(r5, r1, r0)
            int r5 = r3.A0I
            float r1 = r3.A05
            int r0 = r12.A0A
            if (r0 != 0) goto L_0x025a
            int r0 = r3.A08
            if (r0 == r8) goto L_0x025a
            r5 = r0
            float r1 = r3.A01
        L_0x01e3:
            r2.A0P = r5
            r2.A06 = r1
        L_0x01e7:
            int r0 = r11 + -1
            if (r4 != r0) goto L_0x01f4
            X.2d6 r5 = r2.A0a
            X.2d6 r1 = r12.A0C
            int r0 = r12.A06
            r2.A0S(r5, r1, r0)
        L_0x01f4:
            if (r6 == 0) goto L_0x0218
            X.2d6 r13 = r2.A0g
            X.2d6 r5 = r6.A0a
            int r0 = r3.A0H
            r13.A05(r5, r0)
            if (r4 != r7) goto L_0x0209
            int r1 = r12.A09
            X.2d6 r0 = r13.A04
            if (r0 == 0) goto L_0x0209
            r13.A01 = r1
        L_0x0209:
            r5.A05(r13, r10)
            int r0 = r15 + 1
            if (r4 != r0) goto L_0x0218
            int r1 = r12.A06
            X.2d6 r0 = r5.A04
            if (r0 == 0) goto L_0x0218
            r5.A01 = r1
        L_0x0218:
            if (r2 == r9) goto L_0x0226
            r5 = 2
            int r1 = r3.A09
            if (r19 == 0) goto L_0x022a
            if (r1 == 0) goto L_0x024d
            r0 = 1
            if (r1 == r0) goto L_0x0252
            if (r1 == r5) goto L_0x0246
        L_0x0226:
            r6 = r2
        L_0x0227:
            int r4 = r4 + 1
            goto L_0x01b8
        L_0x022a:
            if (r1 == 0) goto L_0x0252
            r0 = 1
            if (r1 == r0) goto L_0x024d
            if (r1 != r5) goto L_0x0226
            if (r16 == 0) goto L_0x0246
            X.2d6 r5 = r2.A0e
            X.2d6 r1 = r12.A0D
            int r0 = r12.A07
            r5.A05(r1, r0)
            X.2d6 r5 = r2.A0f
            X.2d6 r1 = r12.A0E
            int r0 = r12.A08
            r5.A05(r1, r0)
            goto L_0x0226
        L_0x0246:
            X.2d6 r1 = r2.A0e
            X.2d6 r0 = r9.A0e
            r1.A05(r0, r10)
        L_0x024d:
            X.2d6 r1 = r2.A0f
            X.2d6 r0 = r9.A0f
            goto L_0x0256
        L_0x0252:
            X.2d6 r1 = r2.A0e
            X.2d6 r0 = r9.A0e
        L_0x0256:
            r1.A05(r0, r10)
            goto L_0x0226
        L_0x025a:
            if (r20 == 0) goto L_0x01e3
            int r0 = r3.A0D
            if (r0 == r8) goto L_0x01e3
            r5 = r0
            float r1 = r3.A04
            goto L_0x01e3
        L_0x0264:
            X.2d6 r1 = r9.A0e
            X.2d6 r0 = r12.A0D
            r1.A05(r0, r2)
            if (r20 == 0) goto L_0x0276
            X.2d6 r2 = r9.A0f
            X.2d6 r1 = r12.A0E
            int r0 = r12.A08
            r2.A05(r1, r0)
        L_0x0276:
            if (r18 <= 0) goto L_0x01b7
            X.2d6 r0 = r12.A0D
            X.2d3 r0 = r0.A08
            X.2d6 r1 = r0.A0f
            X.2d6 r0 = r9.A0e
            goto L_0x01b4
        L_0x0282:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21506XdM.A03(int, boolean, boolean):void");
    }

    public final void A04(2d3 r8) {
        int i = this.A05;
        int i2 = 0;
        XGQ xgq = this.A0H;
        int A012 = XGQ.A01(r8, xgq, this.A03);
        if (i == 0) {
            if (r8.A14[0] == AnonymousClass05K.A0C) {
                this.A04++;
                A012 = 0;
            }
            int i3 = xgq.A0A;
            if (r8.A0R != 8) {
                i2 = i3;
            }
            this.A0B += A012 + i2;
            int A002 = XGQ.A00(r8, xgq, this.A03);
            if (this.A0G == null || this.A00 < A002) {
                this.A0G = r8;
                this.A00 = A002;
                this.A02 = A002;
            }
        } else {
            int A003 = XGQ.A00(r8, xgq, this.A03);
            if (r8.A14[1] == AnonymousClass05K.A0C) {
                this.A04++;
                A003 = 0;
            }
            int i4 = xgq.A0H;
            if (r8.A0R != 8) {
                i2 = i4;
            }
            this.A02 += A003 + i2;
            if (this.A0G == null || this.A00 < A012) {
                this.A0G = r8;
                this.A00 = A012;
                this.A0B = A012;
            }
        }
        this.A01++;
    }
}
