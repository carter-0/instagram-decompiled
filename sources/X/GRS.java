package X;

public final class GRS implements C59660JSf {
    public C287725af A00;
    public C287725af A01;
    public C287725af A02;
    public C287725af A03;
    public C55424HhU A04;
    public float[] A05;
    public float[] A06;
    public float[] A07;
    public int[] A08;
    public final int A09;
    public final 01K A0A;
    public final 01O A0B;
    public final JNL A0C;

    public final /* synthetic */ C287725af B1n(C287725af r9, C287725af r10, C287725af r11) {
        return CDd(r9, r10, r11, ((long) this.A09) * 1000000);
    }

    private final float A00(int i, int i2, boolean z) {
        JNL jnl;
        float f;
        01K r1 = this.A0A;
        if (i >= r1.A00 - 1) {
            f = (float) i2;
        } else {
            int A002 = r1.A00(i);
            int A003 = r1.A00(i + 1);
            if (i2 == A002) {
                f = (float) A002;
            } else {
                int i3 = A003 - A002;
                GRR grr = (GRR) this.A0B.A03(A002);
                if (grr == null || (jnl = grr.A01) == null) {
                    jnl = this.A0C;
                }
                float f2 = (float) i3;
                float FHc = jnl.FHc(((float) (i2 - A002)) / f2);
                if (z) {
                    return FHc;
                }
                f = (f2 * FHc) + ((float) A002);
            }
        }
        return f / 1000.0f;
    }

    private final int A01(int i) {
        int i2;
        01K r5 = this.A0A;
        int i3 = r5.A00;
        int i4 = 0;
        if (0 > i3) {
            throw AnonymousClass7TE.A0w(002.A0X("fromIndex(", ") > toIndex(", ')', 0, i3));
        } else if (i3 <= i3) {
            int i5 = i3 - 1;
            while (true) {
                if (i4 <= i5) {
                    i2 = (i4 + i5) >>> 1;
                    int A002 = r5.A00(i2);
                    if (A002 >= i) {
                        if (A002 <= i) {
                            break;
                        }
                        i5 = i2 - 1;
                    } else {
                        i4 = i2 + 1;
                    }
                } else {
                    i2 = -(i4 + 1);
                    break;
                }
            }
            if (i2 < -1) {
                return -(i2 + 2);
            }
            return i2;
        } else {
            throw new IndexOutOfBoundsException(002.A0O("Index out of range: ", i3));
        }
    }

    private final void A03(C287725af r10, C287725af r11, C287725af r12) {
        String str;
        float[] fArr;
        boolean A1V = AnonymousClass7TF.A1V(this.A04);
        if (this.A02 == null) {
            this.A02 = AnonymousClass6GZ.A01(r10);
            this.A03 = AnonymousClass6GZ.A01(r12);
            01K r5 = this.A0A;
            int i = r5.A00;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = ((float) r5.A00(i2)) / 1000.0f;
            }
            this.A07 = fArr2;
            int i3 = r5.A00;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                r5.A00(i4);
                iArr[i4] = 0;
            }
            this.A08 = iArr;
        }
        if (A1V) {
            if (this.A04 != null) {
                C287725af r0 = this.A00;
                if (r0 == null) {
                    str = "lastInitialValue";
                } else if (r0.equals(r10)) {
                    C287725af r02 = this.A01;
                    if (r02 == null) {
                        str = "lastTargetValue";
                    } else if (r02.equals(r11)) {
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            this.A00 = r10;
            this.A01 = r11;
            int A012 = r10.A01();
            int i5 = (A012 % 2) + A012;
            this.A05 = new float[i5];
            this.A06 = new float[i5];
            01K r7 = this.A0A;
            int i6 = r7.A00;
            float[][] fArr3 = new float[i6][];
            for (int i7 = 0; i7 < i6; i7++) {
                int A002 = r7.A00(i7);
                if (A002 == 0) {
                    01O r1 = this.A0B;
                    fArr = new float[i5];
                    if (!r1.A04(A002)) {
                        for (int i8 = 0; i8 < i5; i8++) {
                            fArr[i8] = r10.A00(i8);
                        }
                    } else {
                        C287725af A022 = A02(r1, A002);
                        for (int i9 = 0; i9 < i5; i9++) {
                            fArr[i9] = A022.A00(i9);
                        }
                    }
                } else if (A002 == this.A09) {
                    01O r13 = this.A0B;
                    fArr = new float[i5];
                    if (!r13.A04(A002)) {
                        for (int i10 = 0; i10 < i5; i10++) {
                            fArr[i10] = r11.A00(i10);
                        }
                    } else {
                        C287725af A023 = A02(r13, A002);
                        for (int i11 = 0; i11 < i5; i11++) {
                            fArr[i11] = A023.A00(i11);
                        }
                    }
                } else {
                    fArr = new float[i5];
                    C287725af A024 = A02(this.A0B, A002);
                    for (int i12 = 0; i12 < i5; i12++) {
                        fArr[i12] = A024.A00(i12);
                    }
                }
                fArr3[i7] = fArr;
            }
            int[] iArr2 = this.A08;
            if (iArr2 == null) {
                str = "modes";
            } else {
                float[] fArr4 = this.A07;
                if (fArr4 == null) {
                    str = "times";
                } else {
                    this.A04 = new C55424HhU(fArr4, iArr2, fArr3);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final int Aw8() {
        return 0;
    }

    public final int AzL() {
        return this.A09;
    }

    public final /* synthetic */ long AzR(C287725af r5, C287725af r6, C287725af r7) {
        return ((long) this.A09) * 1000000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c0 A[EDGE_INSN: B:80:0x01c0->B:69:0x01c0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C287725af CDS(X.C287725af r20, X.C287725af r21, X.C287725af r22, long r23) {
        /*
            r19 = this;
            r6 = r21
            r7 = r20
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r23 / r0
            r5 = r19
            int r8 = r5.A09
            long r13 = (long) r8
            r11 = 0
            long r2 = X.C229632nm.A06(r9, r11, r13)
            int r1 = (int) r2
            X.01O r4 = r5.A0B
            boolean r0 = r4.A04(r1)
            if (r0 == 0) goto L_0x0022
            X.5af r0 = A02(r4, r1)
        L_0x0021:
            return r0
        L_0x0022:
            if (r1 < r8) goto L_0x0025
            return r21
        L_0x0025:
            if (r1 > 0) goto L_0x0028
            return r20
        L_0x0028:
            r0 = r22
            r5.A03(r7, r6, r0)
            X.HhU r0 = r5.A04
            r10 = 0
            java.lang.String r18 = "valueVector"
            if (r0 == 0) goto L_0x0179
            int r0 = r5.A01(r1)
            r11 = 0
            float r9 = r5.A00(r0, r1, r10)
            X.HhU r1 = r5.A04
            if (r1 != 0) goto L_0x004b
            java.lang.String r0 = "arcSpline"
        L_0x0043:
            X.0qQ.A0F(r0)
        L_0x0046:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004b:
            float[] r8 = r5.A05
            java.lang.String r0 = "posArray"
            if (r8 == 0) goto L_0x0043
            r2 = 1
            r7 = 0
            X.HrM[][] r6 = r1.A00
            r0 = r6[r10]
            r0 = r0[r10]
            float r1 = r0.A09
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00d1
            int r4 = r6.length
            int r0 = r4 - r2
            r0 = r6[r0]
            r0 = r0[r10]
            float r0 = r0.A0A
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00d1
            r1 = 0
        L_0x006d:
            if (r11 >= r4) goto L_0x016a
            r7 = 0
            r13 = 0
        L_0x0071:
            int r0 = r8.length
            if (r7 >= r0) goto L_0x00cc
            r0 = r6[r11]
            r0 = r0[r13]
            float r0 = r0.A0A
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00ad
            r0 = r6[r11]
            r3 = r0[r13]
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x00b2
            float r0 = r3.A09
            float r2 = r9 - r0
            float r0 = r3.A08
            float r2 = r2 * r0
            float r1 = r3.A0B
            float r0 = r3.A0C
            float r0 = r0 - r1
            float r2 = r2 * r0
            float r1 = r1 + r2
            r8[r7] = r1
            int r12 = r7 + 1
            r0 = r6[r11]
            r3 = r0[r13]
            float r0 = r3.A09
            float r2 = r9 - r0
            float r0 = r3.A08
            float r2 = r2 * r0
            float r1 = r3.A0D
            float r0 = r3.A0E
            float r0 = r0 - r1
        L_0x00a8:
            float r2 = r2 * r0
            float r1 = r1 + r2
            r8[r12] = r1
            r1 = 1
        L_0x00ad:
            int r7 = r7 + 2
            int r13 = r13 + 1
            goto L_0x0071
        L_0x00b2:
            r3.A00(r9)
            r0 = r6[r11]
            r3 = r0[r13]
            float r2 = r3.A06
            float r1 = r3.A04
            float r0 = r3.A02
            float r1 = r1 * r0
            float r2 = r2 + r1
            r8[r7] = r2
            int r12 = r7 + 1
            float r1 = r3.A07
            float r2 = r3.A05
            float r0 = r3.A01
            goto L_0x00a8
        L_0x00cc:
            if (r1 != 0) goto L_0x016a
            int r11 = r11 + 1
            goto L_0x006d
        L_0x00d1:
            int r4 = r6.length
            int r4 = r4 - r2
            r0 = r6[r4]
            r0 = r0[r10]
            float r3 = r0.A0A
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00df
            r3 = r1
            r4 = 0
        L_0x00df:
            float r9 = r9 - r3
            r17 = 0
        L_0x00e2:
            int r0 = r8.length
            if (r7 >= r0) goto L_0x016a
            r12 = r6[r4]
            r11 = r12[r17]
            boolean r0 = r11.A0F
            if (r0 == 0) goto L_0x011e
            float r0 = r11.A09
            float r2 = r3 - r0
            float r0 = r11.A08
            float r2 = r2 * r0
            float r1 = r11.A0B
            float r0 = r11.A0C
            float r0 = r0 - r1
            float r2 = r2 * r0
            float r1 = r1 + r2
            r2 = r12[r17]
            float r0 = r2.A06
            float r0 = r0 * r9
            float r1 = r1 + r0
            r8[r7] = r1
            int r16 = r7 + 1
            float r0 = r2.A09
            float r1 = r3 - r0
            float r0 = r2.A08
            float r1 = r1 * r0
            float r13 = r2.A0D
            float r0 = r2.A0E
            float r0 = r0 - r13
            float r1 = r1 * r0
            float r13 = r13 + r1
            float r12 = r2.A07
        L_0x0115:
            float r12 = r12 * r9
            float r13 = r13 + r12
            r8[r16] = r13
            int r7 = r7 + 2
            int r17 = r17 + 1
            goto L_0x00e2
        L_0x011e:
            r11.A00(r3)
            r2 = r12[r17]
            float r13 = r2.A06
            float r12 = r2.A04
            float r1 = r2.A02
            float r0 = r12 * r1
            float r13 = r13 + r0
            float r0 = r2.A01
            float r12 = r12 * r0
            float r0 = r2.A05
            float r0 = -r0
            float r0 = r0 * r1
            float r11 = r2.A03
            double r14 = (double) r12
            double r0 = (double) r0
            double r0 = java.lang.Math.hypot(r14, r0)
            float r14 = (float) r0
            float r11 = r11 / r14
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x0142
            float r12 = -r12
        L_0x0142:
            float r12 = r12 * r11
            float r12 = r12 * r9
            float r13 = r13 + r12
            r8[r7] = r13
            int r16 = r7 + 1
            float r13 = r2.A07
            float r12 = r2.A05
            float r11 = r2.A01
            float r0 = r12 * r11
            float r13 = r13 + r0
            float r1 = r2.A04
            float r1 = r1 * r11
            float r12 = -r12
            float r0 = r2.A02
            float r12 = r12 * r0
            float r11 = r2.A03
            double r14 = (double) r1
            double r0 = (double) r12
            double r0 = java.lang.Math.hypot(r14, r0)
            float r14 = (float) r0
            float r11 = r11 / r14
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x0168
            float r12 = -r12
        L_0x0168:
            float r12 = r12 * r11
            goto L_0x0115
        L_0x016a:
            int r2 = r8.length
        L_0x016b:
            if (r10 >= r2) goto L_0x01c0
            X.5af r1 = r5.A02
            if (r1 == 0) goto L_0x01c4
            r0 = r8[r10]
            r1.A03(r10, r0)
            int r10 = r10 + 1
            goto L_0x016b
        L_0x0179:
            int r3 = r5.A01(r1)
            r0 = 1
            float r8 = r5.A00(r3, r1, r0)
            X.01K r2 = r5.A0A
            int r1 = r2.A00(r3)
            boolean r0 = r4.A04(r1)
            if (r0 == 0) goto L_0x0192
            X.5af r7 = A02(r4, r1)
        L_0x0192:
            int r0 = r3 + 1
            int r1 = r2.A00(r0)
            boolean r0 = r4.A04(r1)
            if (r0 == 0) goto L_0x01a2
            X.5af r6 = A02(r4, r1)
        L_0x01a2:
            X.5af r4 = r5.A02
            if (r4 == 0) goto L_0x01c4
            int r3 = r4.A01()
        L_0x01aa:
            if (r10 >= r3) goto L_0x01c0
            float r2 = r7.A00(r10)
            float r1 = r6.A00(r10)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r8
            float r2 = r2 * r0
            float r1 = r1 * r8
            float r2 = r2 + r1
            r4.A03(r10, r2)
            int r10 = r10 + 1
            goto L_0x01aa
        L_0x01c0:
            X.5af r0 = r5.A02
            if (r0 != 0) goto L_0x0021
        L_0x01c4:
            X.0qQ.A0F(r18)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GRS.CDS(X.5af, X.5af, X.5af, long):X.5af");
    }

    public final /* synthetic */ boolean CVL() {
        return false;
    }

    public GRS(01K r1, 01O r2, JNL jnl, int i) {
        this.A0A = r1;
        this.A0B = r2;
        this.A09 = i;
        this.A0C = jnl;
    }

    public static C287725af A02(01O r0, int i) {
        Object A032 = r0.A03(i);
        0qQ.A0A(A032);
        return ((GRR) A032).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r8 > r3) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011a, code lost:
        r0 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (r0 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C287725af CDd(X.C287725af r25, X.C287725af r26, X.C287725af r27, long r28) {
        /*
            r24 = this;
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r28 / r8
            r2 = r24
            int r0 = r2.A09
            long r14 = (long) r0
            r12 = 0
            long r0 = X.C229632nm.A06(r10, r12, r14)
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            r5 = r27
            if (r3 >= 0) goto L_0x0017
            return r27
        L_0x0017:
            r11 = r25
            r10 = r26
            r2.A03(r11, r10, r5)
            X.HhU r3 = r2.A04
            r7 = 0
            java.lang.String r17 = "velocityVector"
            if (r3 == 0) goto L_0x00e3
            int r3 = (int) r0
            int r0 = r2.A01(r3)
            r9 = 0
            float r8 = r2.A00(r0, r3, r7)
            X.HhU r1 = r2.A04
            if (r1 != 0) goto L_0x003d
            java.lang.String r0 = "arcSpline"
        L_0x0035:
            X.0qQ.A0F(r0)
        L_0x0038:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003d:
            float[] r6 = r2.A06
            java.lang.String r0 = "slopeArray"
            if (r6 == 0) goto L_0x0035
            X.HrM[][] r5 = r1.A00
            r0 = r5[r7]
            r0 = r0[r7]
            float r3 = r0.A09
            r1 = 1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x005c
            int r0 = r5.length
            int r0 = r0 - r1
            r0 = r5[r0]
            r0 = r0[r7]
            float r3 = r0.A0A
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x005d
        L_0x005c:
            r8 = r3
        L_0x005d:
            int r14 = r5.length
            r1 = 0
        L_0x005f:
            if (r9 >= r14) goto L_0x00d4
            r4 = 0
            r16 = 0
        L_0x0064:
            int r0 = r6.length
            if (r4 >= r0) goto L_0x00cf
            r0 = r5[r9]
            r0 = r0[r16]
            float r0 = r0.A0A
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0088
            r0 = r5[r9]
            r1 = r0[r16]
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x008d
            float r0 = r1.A06
            r6[r4] = r0
            int r15 = r4 + 1
            r0 = r5[r9]
            r0 = r0[r16]
            float r13 = r0.A07
        L_0x0085:
            r6[r15] = r13
            r1 = 1
        L_0x0088:
            int r4 = r4 + 2
            int r16 = r16 + 1
            goto L_0x0064
        L_0x008d:
            r1.A00(r8)
            r0 = r5[r9]
            r3 = r0[r16]
            float r13 = r3.A04
            float r0 = r3.A01
            float r13 = r13 * r0
            float r0 = r3.A05
            float r1 = -r0
            float r0 = r3.A02
            float r1 = r1 * r0
            float r12 = r3.A03
            double r10 = (double) r13
            double r0 = (double) r1
            double r0 = java.lang.Math.hypot(r10, r0)
            float r10 = (float) r0
            float r12 = r12 / r10
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x00ae
            float r13 = -r13
        L_0x00ae:
            float r13 = r13 * r12
            r6[r4] = r13
            int r15 = r4 + 1
            float r1 = r3.A04
            float r0 = r3.A01
            float r1 = r1 * r0
            float r0 = r3.A05
            float r13 = -r0
            float r0 = r3.A02
            float r13 = r13 * r0
            float r12 = r3.A03
            double r10 = (double) r1
            double r0 = (double) r13
            double r0 = java.lang.Math.hypot(r10, r0)
            float r10 = (float) r0
            float r12 = r12 / r10
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x00cd
            float r13 = -r13
        L_0x00cd:
            float r13 = r13 * r12
            goto L_0x0085
        L_0x00cf:
            if (r1 != 0) goto L_0x00d4
            int r9 = r9 + 1
            goto L_0x005f
        L_0x00d4:
            int r3 = r6.length
        L_0x00d5:
            if (r7 >= r3) goto L_0x011a
            X.5af r1 = r2.A03
            if (r1 == 0) goto L_0x011f
            r0 = r6[r7]
            r1.A03(r7, r0)
            int r7 = r7 + 1
            goto L_0x00d5
        L_0x00e3:
            r3 = 1
            long r22 = r0 - r3
            long r22 = r22 * r8
            r18 = r2
            r19 = r11
            r20 = r10
            r21 = r5
            X.5af r6 = r18.CDS(r19, r20, r21, r22)
            long r0 = r0 * r8
            r8 = r2
            r9 = r11
            r11 = r5
            r12 = r0
            X.5af r5 = r8.CDS(r9, r10, r11, r12)
            int r4 = r6.A01()
        L_0x0102:
            if (r7 >= r4) goto L_0x011a
            X.5af r3 = r2.A03
            if (r3 == 0) goto L_0x011f
            float r1 = r6.A00(r7)
            float r0 = r5.A00(r7)
            float r1 = r1 - r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            r3.A03(r7, r1)
            int r7 = r7 + 1
            goto L_0x0102
        L_0x011a:
            X.5af r0 = r2.A03
            if (r0 == 0) goto L_0x011f
            return r0
        L_0x011f:
            X.0qQ.A0F(r17)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GRS.CDd(X.5af, X.5af, X.5af, long):X.5af");
    }
}
