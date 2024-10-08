package X;

import android.util.Pair;

/* renamed from: X.4YC  reason: invalid class name */
public abstract class AnonymousClass4YC {
    public static final byte[] A00 = "OpusHead".getBytes(AnonymousClass2RN.A05);

    public static Pair A00(AnonymousClass4XV r21, int i, int i2) {
        int i3;
        int i4;
        AnonymousClass4XV r5 = r21;
        int i5 = r5.A01;
        while (i5 - i < i2) {
            r5.A0G(i5);
            int A01 = r5.A01();
            boolean z = false;
            if (A01 > 0) {
                z = true;
            }
            AnonymousClass4YE.A00(z, "childAtomSize must be positive");
            if (r5.A01() == 1936289382) {
                int i6 = i5 + 8;
                AnonymousClass4YD r14 = null;
                boolean z2 = false;
                String str = null;
                Integer num = null;
                int i7 = -1;
                int i8 = 0;
                while (i6 - i5 < A01) {
                    r5.A0G(i6);
                    int A012 = r5.A01();
                    int A013 = r5.A01();
                    if (A013 == 1718775137) {
                        num = Integer.valueOf(r5.A01());
                    } else if (A013 == 1935894637) {
                        r5.A0H(4);
                        str = new String(r5.A02, r5.A01, 4, AnonymousClass2RN.A05);
                        r5.A01 += 4;
                    } else if (A013 == 1935894633) {
                        i7 = i6;
                        i8 = A012;
                    }
                    i6 += A012;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    boolean z3 = false;
                    if (num != null) {
                        z3 = true;
                    }
                    AnonymousClass4YE.A00(z3, Pxd.A00(746));
                    boolean z4 = false;
                    if (i7 != -1) {
                        z4 = true;
                    }
                    AnonymousClass4YE.A00(z4, Pxd.A00(869));
                    int i9 = i7 + 8;
                    while (true) {
                        byte[] bArr = null;
                        if (i9 - i7 >= i8) {
                            break;
                        }
                        r5.A0G(i9);
                        int A014 = r5.A01();
                        if (r5.A01() == 1952804451) {
                            int A015 = (r5.A01() >> 24) & 255;
                            r5.A0H(1);
                            if (A015 == 0) {
                                r5.A0H(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int A02 = r5.A02();
                                i3 = (A02 & 240) >> 4;
                                i4 = A02 & 15;
                            }
                            boolean z5 = false;
                            if (r5.A02() == 1) {
                                z5 = true;
                            }
                            int A022 = r5.A02();
                            byte[] bArr2 = new byte[16];
                            r5.A0J(bArr2, 0, 16);
                            if (z5 && A022 == 0) {
                                int A023 = r5.A02();
                                bArr = new byte[A023];
                                r5.A0J(bArr, 0, A023);
                            }
                            r14 = new AnonymousClass4YD(str, bArr2, bArr, A022, i3, i4, z5);
                            z2 = true;
                        } else {
                            i9 += A014;
                        }
                    }
                    AnonymousClass4YE.A00(z2, Pxd.A00(898));
                    Pair create = Pair.create(num, r14);
                    if (create != null) {
                        return create;
                    }
                }
            }
            i5 += A01;
        }
        return null;
    }

    public static C296415q1 A01(AnonymousClass4XV r10, int i) {
        r10.A0G(i + 8 + 4);
        r10.A0H(1);
        do {
        } while ((r10.A02() & 128) == 128);
        r10.A0H(2);
        int A02 = r10.A02();
        if ((A02 & 128) != 0) {
            r10.A0H(2);
        }
        if ((A02 & 64) != 0) {
            r10.A0H(r10.A02());
        }
        if ((A02 & 32) != 0) {
            r10.A0H(2);
        }
        r10.A0H(1);
        do {
        } while ((r10.A02() & 128) == 128);
        String A01 = 2Kn.A01(r10.A02());
        if ("audio/mpeg".equals(A01) || "audio/vnd.dts".equals(A01) || "audio/vnd.dts.hd".equals(A01)) {
            return new C296415q1(A01, (byte[]) null, -1, -1);
        }
        r10.A0H(4);
        long A07 = r10.A07();
        long A072 = r10.A07();
        r10.A0H(1);
        int A022 = r10.A02();
        int i2 = A022 & 127;
        while ((A022 & 128) == 128) {
            A022 = r10.A02();
            i2 = (i2 << 7) | (A022 & 127);
        }
        byte[] bArr = new byte[i2];
        r10.A0J(bArr, 0, i2);
        long j = -1;
        if (A072 <= 0) {
            A072 = -1;
        }
        if (A07 > 0) {
            j = A07;
        }
        return new C296415q1(A01, bArr, A072, j);
    }

    /* JADX WARNING: type inference failed for: r37v1, types: [X.Tgz] */
    /* JADX WARNING: type inference failed for: r0v94, types: [X.SwT] */
    /* JADX WARNING: type inference failed for: r0v95, types: [X.Q0R] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A03(com.google.android.exoplayer2.drm.DrmInitData r51, X.Q0Q r52, X.AnonymousClass4Y8 r53, X.AnonymousClass2hV r54, long r55, boolean r57, boolean r58) {
        /*
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            r23 = 0
        L_0x0007:
            r3 = r53
            java.util.List r2 = r3.A01
            int r1 = r2.size()
            r0 = r23
            if (r0 >= r1) goto L_0x0570
            java.lang.Object r2 = r2.get(r0)
            X.4Y8 r2 = (X.AnonymousClass4Y8) r2
            int r1 = r2.A00
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r1 != r0) goto L_0x0092
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            X.4YA r3 = r3.A01(r0)
            r3.getClass()
            r1 = r51
            r4 = r55
            r6 = r57
            r7 = r58
            X.4YI r0 = A02(r1, r2, r3, r4, r6, r7)
            r1 = r54
            java.lang.Object r14 = r1.apply(r0)
            X.4YI r14 = (X.AnonymousClass4YI) r14
            if (r14 == 0) goto L_0x0092
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            X.4Y8 r1 = r2.A00(r0)
            r1.getClass()
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.4Y8 r1 = r1.A00(r0)
            r1.getClass()
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.4Y8 r2 = r1.A00(r0)
            r2.getClass()
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            X.4YA r3 = r2.A01(r0)
            if (r3 == 0) goto L_0x0552
            X.3wB r1 = r14.A07
            X.Q0R r37 = new X.Q0R
            r0 = r37
            r0.<init>(r1, r3)
        L_0x0070:
            int r36 = r37.BpA()
            r15 = 0
            if (r36 != 0) goto L_0x0096
            long[] r4 = new long[r15]
            int[] r3 = new int[r15]
            long[] r2 = new long[r15]
            int[] r0 = new int[r15]
            r12 = 0
            X.Q0S r1 = new X.Q0S
            r5 = r1
            r6 = r14
            r7 = r3
            r8 = r0
            r9 = r4
            r10 = r2
            r11 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x008d:
            r0 = r22
            r0.add(r1)
        L_0x0092:
            int r23 = r23 + 1
            goto L_0x0007
        L_0x0096:
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            X.4YA r0 = r2.A01(r0)
            r3 = 1
            if (r0 != 0) goto L_0x01c2
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            X.4YA r0 = r2.A01(r0)
            r0.getClass()
            r35 = 1
        L_0x00ac:
            X.4XV r0 = r0.A00
            r41 = r0
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            X.4YA r0 = r2.A01(r0)
            r0.getClass()
            X.4XV r0 = r0.A00
            r40 = r0
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            X.4YA r0 = r2.A01(r0)
            r0.getClass()
            X.4XV r0 = r0.A00
            r38 = r0
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            X.4YA r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x01be
            X.4XV r0 = r0.A00
            r34 = r0
        L_0x00d9:
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            X.4YA r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x01ba
            X.4XV r0 = r0.A00
            r33 = r0
        L_0x00e6:
            r6 = 0
            r28 = 0
            r1 = 12
            r0 = r41
            r0.A0G(r1)
            int r32 = r41.A04()
            r0 = r40
            r0.A0G(r1)
            int r31 = r40.A04()
            int r0 = r40.A01()
            r2 = 1
            if (r0 == r3) goto L_0x0105
            r2 = 0
        L_0x0105:
            java.lang.String r0 = "first_chunk must be 1"
            X.AnonymousClass4YE.A00(r2, r0)
            r9 = -1
            r0 = r38
            r0.A0G(r1)
            int r11 = r38.A04()
            int r11 = r11 - r3
            int r13 = r38.A04()
            int r18 = r38.A04()
            if (r33 == 0) goto L_0x01b6
            r0 = r33
            r0.A0G(r1)
            int r30 = r33.A04()
        L_0x0128:
            if (r34 == 0) goto L_0x01af
            r0 = r34
            r0.A0G(r1)
            int r10 = r34.A04()
            if (r10 <= 0) goto L_0x01b1
            int r0 = r34.A04()
            int r29 = r0 + -1
        L_0x013b:
            int r7 = r37.B6R()
            X.3wB r0 = r14.A07
            r39 = r0
            java.lang.String r1 = r0.A0W
            if (r7 == r9) goto L_0x020a
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x015f
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x015f
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x020a
        L_0x015f:
            if (r11 != 0) goto L_0x020a
            if (r30 != 0) goto L_0x020a
            if (r10 != 0) goto L_0x020a
            r0 = r32
            long[] r12 = new long[r0]
            int[] r10 = new int[r0]
        L_0x016b:
            int r9 = r9 + 1
            r0 = r32
            if (r9 != r0) goto L_0x0188
            r0 = r18
            long r0 = (long) r0
            r11 = 8192(0x2000, float:1.14794E-41)
            int r11 = r11 / r7
            r9 = 0
            r5 = 0
            r4 = 0
        L_0x017a:
            r2 = r32
            if (r5 >= r2) goto L_0x01c6
            r2 = r10[r5]
            int r2 = r2 + r11
            int r2 = r2 + -1
            int r2 = r2 / r11
            int r4 = r4 + r2
            int r5 = r5 + 1
            goto L_0x017a
        L_0x0188:
            if (r35 == 0) goto L_0x01aa
            long r4 = r41.A08()
        L_0x018e:
            if (r9 != r6) goto L_0x01a3
            int r28 = r40.A04()
            r1 = 4
            r0 = r40
            r0.A0H(r1)
            int r31 = r31 - r3
            if (r31 <= 0) goto L_0x01a8
            int r6 = r40.A04()
            int r6 = r6 - r3
        L_0x01a3:
            r12[r9] = r4
            r10[r9] = r28
            goto L_0x016b
        L_0x01a8:
            r6 = -1
            goto L_0x01a3
        L_0x01aa:
            long r4 = r41.A07()
            goto L_0x018e
        L_0x01af:
            r10 = 0
            goto L_0x01b3
        L_0x01b1:
            r34 = 0
        L_0x01b3:
            r29 = -1
            goto L_0x013b
        L_0x01b6:
            r30 = 0
            goto L_0x0128
        L_0x01ba:
            r33 = 0
            goto L_0x00e6
        L_0x01be:
            r34 = 0
            goto L_0x00d9
        L_0x01c2:
            r35 = 0
            goto L_0x00ac
        L_0x01c6:
            long[] r2 = new long[r4]
            r25 = r2
            int[] r2 = new int[r4]
            r27 = r2
            long[] r2 = new long[r4]
            int[] r4 = new int[r4]
            r26 = r4
            r8 = 0
            r18 = 0
            r24 = 0
        L_0x01d9:
            r4 = r32
            if (r9 >= r4) goto L_0x0206
            r6 = r10[r9]
            r16 = r12[r9]
        L_0x01e1:
            if (r6 <= 0) goto L_0x0203
            int r13 = java.lang.Math.min(r11, r6)
            r25[r18] = r16
            int r5 = r7 * r13
            r27[r18] = r5
            r4 = r24
            int r24 = java.lang.Math.max(r4, r5)
            long r4 = (long) r8
            long r4 = r4 * r0
            r2[r18] = r4
            r26[r18] = r3
            r4 = r27[r18]
            long r4 = (long) r4
            long r16 = r16 + r4
            int r8 = r8 + r13
            int r6 = r6 - r13
            int r18 = r18 + 1
            goto L_0x01e1
        L_0x0203:
            int r9 = r9 + 1
            goto L_0x01d9
        L_0x0206:
            long r4 = (long) r8
            long r0 = r0 * r4
            goto L_0x02d9
        L_0x020a:
            r0 = r36
            long[] r0 = new long[r0]
            r25 = r0
            r0 = r36
            int[] r0 = new int[r0]
            r27 = r0
            r0 = r36
            long[] r2 = new long[r0]
            int[] r0 = new int[r0]
            r26 = r0
            r8 = 0
            r24 = 0
            r12 = 0
            r21 = 0
            r7 = 0
            r0 = 0
            r19 = 0
        L_0x0229:
            java.lang.String r16 = "AtomParsers"
            r4 = r36
            if (r8 >= r4) goto L_0x025b
        L_0x022f:
            if (r12 != 0) goto L_0x03f2
            int r9 = r9 + 1
            r4 = r32
            if (r9 != r4) goto L_0x03cc
            r4 = 597(0x255, float:8.37E-43)
            java.lang.String r5 = X.Pxd.A00(r4)
            r4 = r16
            X.2AG.A04(r4, r5)
            r4 = r25
            long[] r25 = java.util.Arrays.copyOf(r4, r8)
            r4 = r27
            int[] r27 = java.util.Arrays.copyOf(r4, r8)
            long[] r2 = java.util.Arrays.copyOf(r2, r8)
            r4 = r26
            int[] r26 = java.util.Arrays.copyOf(r4, r8)
            r36 = r8
            r12 = 0
        L_0x025b:
            r4 = r21
            long r4 = (long) r4
            long r0 = r0 + r4
            if (r33 == 0) goto L_0x03c9
        L_0x0261:
            if (r30 <= 0) goto L_0x03c9
            int r4 = r33.A04()
            if (r4 == 0) goto L_0x03c2
            r6 = 0
        L_0x026a:
            if (r10 != 0) goto L_0x0276
            if (r13 != 0) goto L_0x0276
            if (r12 != 0) goto L_0x0276
            if (r11 != 0) goto L_0x0276
            if (r7 != 0) goto L_0x0276
            if (r6 != 0) goto L_0x02d9
        L_0x0276:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r4 = 512(0x200, float:7.175E-43)
            java.lang.String r4 = X.Pxd.A00(r4)
            r5.append(r4)
            int r4 = r14.A00
            r5.append(r4)
            r4 = 341(0x155, float:4.78E-43)
            java.lang.String r4 = X.Pxd.A00(r4)
            r5.append(r4)
            r5.append(r10)
            r4 = 328(0x148, float:4.6E-43)
            java.lang.String r4 = X.Pxd.A00(r4)
            r5.append(r4)
            r5.append(r13)
            r4 = 330(0x14a, float:4.62E-43)
            java.lang.String r4 = X.Pxd.A00(r4)
            r5.append(r4)
            r5.append(r12)
            r4 = 331(0x14b, float:4.64E-43)
            java.lang.String r4 = X.Pxd.A00(r4)
            r5.append(r4)
            r5.append(r11)
            r4 = 329(0x149, float:4.61E-43)
            java.lang.String r4 = X.Pxd.A00(r4)
            r5.append(r4)
            r5.append(r7)
            if (r6 != 0) goto L_0x03be
            r4 = 314(0x13a, float:4.4E-43)
            java.lang.String r4 = X.Pxd.A00(r4)
        L_0x02cd:
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            r4 = r16
            X.2AG.A04(r4, r5)
        L_0x02d9:
            r30 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r14.A06
            r49 = r4
            r28 = r0
            r32 = r4
            long r10 = com.google.android.exoplayer2.util.Util.A09(r28, r30, r32)
            long[] r8 = r14.A08
            if (r8 != 0) goto L_0x0301
            com.google.android.exoplayer2.util.Util.A0F(r2, r4)
        L_0x02ef:
            X.Q0S r1 = new X.Q0S
            r3 = r1
            r4 = r14
            r5 = r27
            r6 = r26
            r7 = r25
            r8 = r2
            r9 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x008d
        L_0x0301:
            int r9 = r8.length
            if (r9 != r3) goto L_0x0390
            int r4 = r14.A03
            if (r4 != r3) goto L_0x0390
            int r5 = r2.length
            r4 = 2
            if (r5 < r4) goto L_0x0390
            long[] r4 = r14.A09
            r4.getClass()
            r37 = r4[r15]
            r16 = r8[r15]
            long r10 = r14.A05
            r18 = r49
            r20 = r10
            long r6 = com.google.android.exoplayer2.util.Util.A09(r16, r18, r20)
            long r17 = r37 + r6
            int r7 = r5 - r3
            r6 = 4
            int r4 = java.lang.Math.min(r6, r7)
            int r16 = java.lang.Math.max(r15, r4)
            int r5 = r5 - r6
            int r4 = java.lang.Math.min(r5, r7)
            int r7 = java.lang.Math.max(r15, r4)
            r12 = r2[r15]
            int r4 = (r12 > r37 ? 1 : (r12 == r37 ? 0 : -1))
            if (r4 > 0) goto L_0x0390
            r5 = r2[r16]
            int r4 = (r37 > r5 ? 1 : (r37 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0390
            r5 = r2[r7]
            int r4 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r4 >= 0) goto L_0x0390
            int r4 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0390
            long r43 = r0 - r17
            long r37 = r37 - r12
            r4 = r39
            int r4 = r4.A0G
            long r6 = (long) r4
            r39 = r6
            r41 = r49
            long r4 = com.google.android.exoplayer2.util.Util.A09(r37, r39, r41)
            r45 = r6
            r47 = r49
            long r6 = com.google.android.exoplayer2.util.Util.A09(r43, r45, r47)
            r16 = 0
            int r12 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x036e
            int r12 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r12 == 0) goto L_0x0390
        L_0x036e:
            r16 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r12 > 0) goto L_0x0390
            int r12 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r12 > 0) goto L_0x0390
            int r0 = (int) r4
            r1 = r52
            r1.A00 = r0
            int r0 = (int) r6
            r1.A01 = r0
            r0 = r49
            com.google.android.exoplayer2.util.Util.A0F(r2, r0)
            r28 = r8[r15]
            r32 = r10
            long r10 = com.google.android.exoplayer2.util.Util.A09(r28, r30, r32)
            goto L_0x02ef
        L_0x0390:
            if (r9 != r3) goto L_0x0451
            r10 = r8[r15]
            r5 = 0
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0451
            long[] r3 = r14.A09
            r3.getClass()
            r6 = r3[r15]
            r5 = 0
        L_0x03a2:
            int r3 = r2.length
            if (r5 >= r3) goto L_0x03b2
            r28 = r2[r5]
            long r28 = r28 - r6
            long r3 = com.google.android.exoplayer2.util.Util.A09(r28, r30, r32)
            r2[r5] = r3
            int r5 = r5 + 1
            goto L_0x03a2
        L_0x03b2:
            long r0 = r0 - r6
            r3 = r0
            r5 = r30
            r7 = r49
            long r10 = com.google.android.exoplayer2.util.Util.A09(r3, r5, r7)
            goto L_0x02ef
        L_0x03be:
            java.lang.String r4 = ""
            goto L_0x02cd
        L_0x03c2:
            r33.A01()
            int r30 = r30 + -1
            goto L_0x0261
        L_0x03c9:
            r6 = 1
            goto L_0x026a
        L_0x03cc:
            if (r35 == 0) goto L_0x03ed
            long r19 = r41.A08()
        L_0x03d2:
            if (r9 != r6) goto L_0x03e7
            int r28 = r40.A04()
            r5 = 4
            r4 = r40
            r4.A0H(r5)
            int r31 = r31 - r3
            if (r31 <= 0) goto L_0x03eb
            int r6 = r40.A04()
            int r6 = r6 - r3
        L_0x03e7:
            r12 = r28
            goto L_0x022f
        L_0x03eb:
            r6 = -1
            goto L_0x03e7
        L_0x03ed:
            long r19 = r41.A07()
            goto L_0x03d2
        L_0x03f2:
            if (r33 == 0) goto L_0x0405
        L_0x03f4:
            if (r7 != 0) goto L_0x0403
            if (r30 <= 0) goto L_0x0403
            int r7 = r33.A04()
            int r21 = r33.A01()
            int r30 = r30 + -1
            goto L_0x03f4
        L_0x0403:
            int r7 = r7 + -1
        L_0x0405:
            r25[r8] = r19
            int r5 = r37.E6b()
            r27[r8] = r5
            r4 = r24
            if (r5 <= r4) goto L_0x0413
            r24 = r5
        L_0x0413:
            r4 = r21
            long r4 = (long) r4
            long r4 = r4 + r0
            r2[r8] = r4
            r4 = 0
            if (r34 != 0) goto L_0x041d
            r4 = 1
        L_0x041d:
            r26[r8] = r4
            r4 = r29
            if (r8 != r4) goto L_0x0432
            r26[r8] = r3
            int r10 = r10 + -1
            if (r10 <= 0) goto L_0x0432
            r34.getClass()
            int r29 = r34.A04()
            int r29 = r29 - r3
        L_0x0432:
            r4 = r18
            long r4 = (long) r4
            long r0 = r0 + r4
            int r13 = r13 + -1
            if (r13 != 0) goto L_0x0446
            if (r11 <= 0) goto L_0x0446
            int r13 = r38.A04()
            int r18 = r38.A01()
            int r11 = r11 + -1
        L_0x0446:
            r4 = r27[r8]
            long r4 = (long) r4
            long r19 = r19 + r4
            int r12 = r12 + -1
            int r8 = r8 + 1
            goto L_0x0229
        L_0x0451:
            int r0 = r14.A03
            r18 = 0
            if (r0 != r3) goto L_0x0459
            r18 = 1
        L_0x0459:
            int[] r4 = new int[r9]
            int[] r7 = new int[r9]
            long[] r15 = r14.A09
            r15.getClass()
            r10 = 0
            r21 = 0
            r5 = 0
            r6 = 0
        L_0x0467:
            if (r10 >= r9) goto L_0x04bf
            r0 = r15[r10]
            r12 = -1
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x04b0
            r37 = r8[r10]
            long r11 = r14.A05
            r39 = r49
            r41 = r11
            long r12 = com.google.android.exoplayer2.util.Util.A09(r37, r39, r41)
            int r11 = com.google.android.exoplayer2.util.Util.A04(r2, r0, r3)
            r4[r10] = r11
            long r0 = r0 + r12
            int r12 = java.util.Arrays.binarySearch(r2, r0)
            if (r12 >= 0) goto L_0x049f
            r12 = r12 ^ -1
        L_0x048c:
            r7[r10] = r12
        L_0x048e:
            r11 = r4[r10]
            r1 = r7[r10]
            if (r11 >= r1) goto L_0x04b2
            r0 = r26[r11]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x04b2
            int r0 = r11 + 1
            r4[r10] = r0
            goto L_0x048e
        L_0x049f:
            int r12 = r12 + 1
            int r11 = r2.length
            if (r12 >= r11) goto L_0x04ab
            r16 = r2[r12]
            int r11 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x04ab
            goto L_0x049f
        L_0x04ab:
            if (r18 == 0) goto L_0x048c
            int r12 = r12 + -1
            goto L_0x048c
        L_0x04b0:
            r1 = r6
            goto L_0x04bb
        L_0x04b2:
            int r0 = r1 - r11
            int r5 = r5 + r0
            r0 = 0
            if (r6 == r11) goto L_0x04b9
            r0 = 1
        L_0x04b9:
            r21 = r21 | r0
        L_0x04bb:
            int r10 = r10 + 1
            r6 = r1
            goto L_0x0467
        L_0x04bf:
            r3 = 0
            r1 = 1
            r0 = r36
            if (r5 != r0) goto L_0x04c6
            r1 = 0
        L_0x04c6:
            r21 = r21 | r1
            if (r21 == 0) goto L_0x0532
            long[] r0 = new long[r5]
            r39 = r0
            int[] r13 = new int[r5]
            r24 = 0
            int[] r0 = new int[r5]
            r38 = r0
        L_0x04d6:
            long[] r0 = new long[r5]
            r20 = r0
            r28 = 0
            r6 = 0
        L_0x04dd:
            if (r3 >= r9) goto L_0x0539
            r18 = r15[r3]
            r5 = r4[r3]
            r12 = r7[r3]
            if (r21 == 0) goto L_0x04fc
            int r10 = r12 - r5
            r1 = r25
            r0 = r39
            java.lang.System.arraycopy(r1, r5, r0, r6, r10)
            r0 = r27
            java.lang.System.arraycopy(r0, r5, r13, r6, r10)
            r1 = r26
            r0 = r38
            java.lang.System.arraycopy(r1, r5, r0, r6, r10)
        L_0x04fc:
            if (r5 >= r12) goto L_0x052b
            long r0 = r14.A05
            r32 = r0
            long r16 = com.google.android.exoplayer2.util.Util.A09(r28, r30, r32)
            r0 = r2[r5]
            long r0 = r0 - r18
            r10 = 0
            long r32 = java.lang.Math.max(r10, r0)
            r34 = r30
            r36 = r49
            long r0 = com.google.android.exoplayer2.util.Util.A09(r32, r34, r36)
            long r16 = r16 + r0
            r20[r6] = r16
            if (r21 == 0) goto L_0x0526
            r1 = r13[r6]
            r0 = r24
            if (r1 <= r0) goto L_0x0526
            r24 = r27[r5]
        L_0x0526:
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L_0x04fc
        L_0x052b:
            r0 = r8[r3]
            long r28 = r28 + r0
            int r3 = r3 + 1
            goto L_0x04dd
        L_0x0532:
            r39 = r25
            r13 = r27
            r38 = r26
            goto L_0x04d6
        L_0x0539:
            long r0 = r14.A05
            r32 = r0
            long r8 = com.google.android.exoplayer2.util.Util.A09(r28, r30, r32)
            X.Q0S r1 = new X.Q0S
            r2 = r14
            r3 = r13
            r4 = r38
            r5 = r39
            r6 = r20
            r7 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x008d
        L_0x0552:
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            X.4YA r1 = r2.A01(r0)
            if (r1 == 0) goto L_0x0564
            X.SwT r37 = new X.SwT
            r0 = r37
            r0.<init>(r1)
            goto L_0x0070
        L_0x0564:
            r0 = 576(0x240, float:8.07E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 0
            X.47p r0 = X.C2609347p.A00(r1, r0)
            throw r0
        L_0x0570:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YC.A03(com.google.android.exoplayer2.drm.DrmInitData, X.Q0Q, X.4Y8, X.2hV, long, boolean, boolean):java.util.ArrayList");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: X.4YD[]} */
    /* JADX WARNING: type inference failed for: r6v21, types: [java.lang.Object, X.5Ob] */
    /* JADX WARNING: type inference failed for: r2v75, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v21, types: [java.lang.Object, X.5Ob] */
    /* JADX WARNING: type inference failed for: r7v22, types: [java.lang.Object, X.5Ob] */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08c5, code lost:
        if (r1 != null) goto L_0x08c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x08f5, code lost:
        if (r36 <= 0) goto L_0x08f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0b0b, code lost:
        if (r14 != 1) goto L_0x0ad4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0c96, code lost:
        if ((r5.A02() & 128) == 0) goto L_0x0c98;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x07fa  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x08d4  */
    /* JADX WARNING: Removed duplicated region for block: B:633:0x0dbb  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4YI A02(com.google.android.exoplayer2.drm.DrmInitData r57, X.AnonymousClass4Y8 r58, X.AnonymousClass4YA r59, long r60, boolean r62, boolean r63) {
        /*
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            r48 = r58
            r0 = r48
            X.4Y8 r1 = r0.A00(r1)
            r1.getClass()
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.4YA r0 = r1.A01(r0)
            r0.getClass()
            X.4XV r2 = r0.A00
            r0 = 16
            r2.A0G(r0)
            int r3 = r2.A01()
            r2 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r3 != r2) goto L_0x0cfd
            r18 = 1
        L_0x002a:
            r21 = 0
            r9 = -1
            r2 = r18
            if (r2 == r9) goto L_0x0de6
            r3 = 1953196132(0x746b6864, float:7.46037E31)
            r2 = r48
            X.4YA r2 = r2.A01(r3)
            r2.getClass()
            X.4XV r4 = r2.A00
            r7 = 8
            r4.A0G(r7)
            int r2 = r4.A01()
            int r2 = r2 >> 24
            r6 = r2 & 255(0xff, float:3.57E-43)
            r28 = 16
            r2 = 16
            if (r6 != 0) goto L_0x0054
            r2 = 8
        L_0x0054:
            r4.A0H(r2)
            int r47 = r4.A01()
            r5 = 4
            r4.A0H(r5)
            int r8 = r4.A01
            if (r6 != 0) goto L_0x0064
            r7 = 4
        L_0x0064:
            r20 = 0
            r3 = 0
        L_0x0067:
            byte[] r2 = r4.A02
            int r10 = r8 + r3
            byte r2 = r2[r10]
            if (r2 == r9) goto L_0x0cf6
            r2 = 0
        L_0x0070:
            r49 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0ce1
            r4.A0H(r7)
        L_0x007a:
            r4.A0H(r0)
            int r7 = r4.A01()
            int r6 = r4.A01()
            r4.A0H(r5)
            int r5 = r4.A01()
            int r4 = r4.A01()
            r3 = 65536(0x10000, float:9.18355E-41)
            r2 = -65536(0xffffffffffff0000, float:NaN)
            if (r7 != 0) goto L_0x0cd5
            if (r6 != r3) goto L_0x0ccb
            if (r5 != r2) goto L_0x009e
            if (r4 != 0) goto L_0x009e
            r20 = 90
        L_0x009e:
            r55 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r60 > r55 ? 1 : (r60 == r55 ? 0 : -1))
            if (r2 == 0) goto L_0x00a9
            r49 = r60
        L_0x00a9:
            r2 = r59
            X.4XV r4 = r2.A00
            r3 = 8
            r4.A0G(r3)
            int r2 = r4.A01()
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x00be
            r3 = 16
        L_0x00be:
            r4.A0H(r3)
            long r53 = r4.A07()
            int r2 = (r49 > r55 ? 1 : (r49 == r55 ? 0 : -1))
            if (r2 == 0) goto L_0x00d0
            r51 = 1000000(0xf4240, double:4.940656E-318)
            long r55 = com.google.android.exoplayer2.util.Util.A09(r49, r51, r53)
        L_0x00d0:
            r2 = 1835626086(0x6d696e66, float:4.515217E27)
            X.4Y8 r3 = r1.A00(r2)
            r3.getClass()
            r2 = 1937007212(0x7374626c, float:1.9362132E31)
            X.4Y8 r2 = r3.A00(r2)
            r2.getClass()
            r3 = 1835296868(0x6d646864, float:4.418049E27)
            X.4YA r1 = r1.A01(r3)
            r1.getClass()
            X.4XV r4 = r1.A00
            r3 = 8
            r4.A0G(r3)
            int r1 = r4.A01()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != 0) goto L_0x0101
            r0 = 8
        L_0x0101:
            r4.A0H(r0)
            long r5 = r4.A07()
            if (r1 != 0) goto L_0x010b
            r3 = 4
        L_0x010b:
            r4.A0H(r3)
            int r3 = r4.A05()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = ""
            r1.append(r0)
            int r0 = r3 >> 10
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            int r0 = r3 >> 5
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            r0 = r3 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            android.util.Pair r27 = android.util.Pair.create(r0, r1)
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            X.4YA r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0dd9
            X.4XV r5 = r0.A00
            r0 = r27
            java.lang.Object r0 = r0.second
            r24 = r0
            r0 = r24
            java.lang.String r0 = (java.lang.String) r0
            r24 = r0
            r0 = 12
            r5.A0G(r0)
            int r25 = r5.A01()
            r3 = 0
            r26 = 0
            r0 = r25
            X.4YD[] r0 = new X.AnonymousClass4YD[r0]
            r22 = r0
            r49 = 0
            r17 = 0
        L_0x0171:
            r1 = r17
            r0 = r25
            if (r1 >= r0) goto L_0x0d42
            int r0 = r5.A01
            r16 = r0
            int r19 = r5.A01()
            r1 = 0
            if (r19 <= 0) goto L_0x0183
            r1 = 1
        L_0x0183:
            java.lang.String r23 = "childAtomSize must be positive"
            r0 = r23
            X.AnonymousClass4YE.A00(r1, r0)
            int r7 = r5.A01()
            r0 = 1635148593(0x61766331, float:2.840654E20)
            r2 = r57
            if (r7 == r0) goto L_0x0811
            r0 = 1635148595(0x61766333, float:2.8406544E20)
            if (r7 == r0) goto L_0x0811
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r7 == r0) goto L_0x0811
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r7 == r0) goto L_0x0811
            r0 = 1836070006(0x6d703476, float:4.646239E27)
            if (r7 == r0) goto L_0x0811
            r0 = 1752589105(0x68766331, float:4.6541277E24)
            if (r7 == r0) goto L_0x0811
            r0 = 1751479857(0x68657631, float:4.3344087E24)
            if (r7 == r0) goto L_0x0811
            r0 = 1932670515(0x73323633, float:1.4119387E31)
            if (r7 == r0) goto L_0x0811
            r0 = 1211250227(0x48323633, float:182488.8)
            if (r7 == r0) goto L_0x0811
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 == r0) goto L_0x0811
            r0 = 1987063865(0x76703039, float:1.2178997E33)
            if (r7 == r0) goto L_0x0811
            r0 = 1635135537(0x61763031, float:2.8383572E20)
            if (r7 == r0) goto L_0x0811
            r0 = 1685479798(0x64766176, float:1.8179687E22)
            if (r7 == r0) goto L_0x0811
            r0 = 1685479729(0x64766131, float:1.817961E22)
            if (r7 == r0) goto L_0x0811
            r0 = 1685481573(0x64766865, float:1.8181686E22)
            if (r7 == r0) goto L_0x0811
            r0 = 1685481521(0x64766831, float:1.8181627E22)
            if (r7 == r0) goto L_0x0811
            r0 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r7 == r0) goto L_0x032c
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r7 == r0) goto L_0x032c
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r7 == r0) goto L_0x032c
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r7 == r0) goto L_0x032c
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 == r0) goto L_0x032c
            r0 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r7 == r0) goto L_0x032c
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 == r0) goto L_0x032c
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 == r0) goto L_0x032c
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 == r0) goto L_0x032c
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 == r0) goto L_0x032c
            r0 = 1685353336(0x64747378, float:1.8037304E22)
            if (r7 == r0) goto L_0x032c
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 == r0) goto L_0x032c
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 == r0) goto L_0x032c
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r7 == r0) goto L_0x032c
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 == r0) goto L_0x032c
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r7 == r0) goto L_0x032c
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r7 == r0) goto L_0x032c
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 == r0) goto L_0x032c
            r0 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r7 == r0) goto L_0x032c
            r0 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r7 == r0) goto L_0x032c
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r7 == r0) goto L_0x032c
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 == r0) goto L_0x032c
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 == r0) goto L_0x032c
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 == r0) goto L_0x032c
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 == r0) goto L_0x032c
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r7 == r0) goto L_0x02c6
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r7 == r0) goto L_0x02c6
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r7 == r0) goto L_0x02c6
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r7 == r0) goto L_0x02c6
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r7 == r0) goto L_0x02c6
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r7 != r0) goto L_0x02a8
            int r0 = r16 + 8
            int r0 = r0 + 8
            r5.A0G(r0)
            r5.A09()
            java.lang.String r1 = r5.A09()
            if (r1 == 0) goto L_0x029d
            X.3w8 r0 = new X.3w8
            r0.<init>()
            java.lang.String r2 = java.lang.Integer.toString(r47)
            r0.A0R = r2
            r0.A0U = r1
            X.3wB r3 = new X.3wB
            r3.<init>(r0)
        L_0x029d:
            int r16 = r16 + r19
            r0 = r16
            r5.A0G(r0)
            int r17 = r17 + 1
            goto L_0x0171
        L_0x02a8:
            r0 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r7 != r0) goto L_0x029d
            X.3w8 r0 = new X.3w8
            r0.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r47)
            r0.A0R = r1
            r1 = 1092(0x444, float:1.53E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r0.A0U = r1
            X.3wB r3 = new X.3wB
            r3.<init>(r0)
            goto L_0x029d
        L_0x02c6:
            int r0 = r16 + 8
            int r0 = r0 + 8
            r5.A0G(r0)
            r0 = 4477(0x117d, float:6.274E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            r3 = 0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r7 == r2) goto L_0x02f7
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r7 != r2) goto L_0x0312
            int r2 = r19 + -8
            int r4 = r2 + -8
            byte[] r3 = new byte[r4]
            r2 = 0
            r5.A0J(r3, r2, r4)
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3)
            r2 = 4478(0x117e, float:6.275E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r2)
        L_0x02f7:
            X.3w8 r2 = new X.3w8
            r2.<init>()
            java.lang.String r6 = java.lang.Integer.toString(r47)
            r2.A0R = r6
            r2.A0U = r4
            r4 = r24
            r2.A0T = r4
            r2.A0K = r0
            r2.A0V = r3
            X.3wB r3 = new X.3wB
            r3.<init>(r2)
            goto L_0x029d
        L_0x0312:
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r7 != r2) goto L_0x031a
            java.lang.String r4 = "application/x-mp4-vtt"
            goto L_0x02f7
        L_0x031a:
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r7 != r2) goto L_0x0322
            r0 = 0
            goto L_0x02f7
        L_0x0322:
            r2 = 1664495672(0x63363038, float:3.360782E21)
            if (r7 != r2) goto L_0x0d29
            r49 = 1
            java.lang.String r4 = "application/x-mp4-cea-608"
            goto L_0x02f7
        L_0x032c:
            r31 = r2
            int r0 = r16 + 8
            r29 = 8
            int r0 = r0 + 8
            r5.A0G(r0)
            r0 = 6
            if (r63 == 0) goto L_0x07c8
            int r4 = r5.A05()
            r5.A0H(r0)
        L_0x0341:
            r30 = 4
            r6 = 2
            r1 = 1
            if (r4 == 0) goto L_0x0798
            if (r4 == r1) goto L_0x0798
            if (r4 != r6) goto L_0x029d
            r0 = r28
            r5.A0H(r0)
            long r0 = r5.A06()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r0 = java.lang.Math.round(r0)
            int r10 = (int) r0
            int r15 = r5.A04()
            r0 = 20
            r5.A0H(r0)
            r34 = 0
        L_0x0368:
            int r6 = r5.A01
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r7 != r0) goto L_0x038c
            r1 = r16
            r0 = r19
            android.util.Pair r1 = A00(r5, r1, r0)
            if (r1 == 0) goto L_0x0389
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            if (r57 != 0) goto L_0x078c
            r31 = 0
        L_0x0385:
            java.lang.Object r0 = r1.second
            r22[r17] = r0
        L_0x0389:
            r5.A0G(r6)
        L_0x038c:
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r4 = "audio/raw"
            if (r7 != r0) goto L_0x06bc
            java.lang.String r4 = "audio/ac3"
        L_0x0398:
            r33 = -1
        L_0x039a:
            r14 = 0
            r32 = 0
            r2 = 0
        L_0x039e:
            int r1 = r6 - r16
            r0 = r19
            if (r1 >= r0) goto L_0x07d0
            r5.A0G(r6)
            int r9 = r5.A01()
            r1 = 0
            if (r9 <= 0) goto L_0x03af
            r1 = 1
        L_0x03af:
            r0 = r23
            X.AnonymousClass4YE.A00(r1, r0)
            int r1 = r5.A01()
            r0 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r1 != r0) goto L_0x03d0
            int r2 = r9 + -13
            byte[] r1 = new byte[r2]
            int r0 = r6 + 13
            r5.A0G(r0)
            r0 = 0
            r5.A0J(r1, r0, r2)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r1)
        L_0x03ce:
            int r6 = r6 + r9
            goto L_0x039e
        L_0x03d0:
            r8 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 == r8) goto L_0x0694
            if (r63 == 0) goto L_0x0403
            r0 = 2002876005(0x77617665, float:4.5729223E33)
            if (r1 != r0) goto L_0x0403
            int r1 = r5.A01
            r7 = 0
            if (r1 < r6) goto L_0x03e2
            r7 = 1
        L_0x03e2:
            r0 = r21
            X.AnonymousClass4YE.A00(r7, r0)
        L_0x03e7:
            int r0 = r1 - r6
            if (r0 >= r9) goto L_0x03ce
            r5.A0G(r1)
            int r11 = r5.A01()
            r7 = 0
            if (r11 <= 0) goto L_0x03f6
            r7 = 1
        L_0x03f6:
            r0 = r23
            X.AnonymousClass4YE.A00(r7, r0)
            int r0 = r5.A01()
            if (r0 == r8) goto L_0x0695
            int r1 = r1 + r11
            goto L_0x03e7
        L_0x0403:
            r0 = 1684103987(0x64616333, float:1.6630662E22)
            if (r1 != r0) goto L_0x047c
            int r0 = r6 + 8
            r5.A0G(r0)
            java.lang.String r11 = java.lang.Integer.toString(r47)
            X.5Ob r7 = new X.5Ob
            r7.<init>()
            r7.A04(r5)
            r0 = 2
            int r1 = r7.A01(r0)
            int[] r0 = X.C21350XYd.A03
            r8 = r0[r1]
            r0 = r29
            r7.A03(r0)
            int[] r1 = X.C21350XYd.A02
            r0 = 3
            int r0 = r7.A01(r0)
            r3 = r1[r0]
            r0 = 1
            int r0 = r7.A01(r0)
            if (r0 == 0) goto L_0x0439
            int r3 = r3 + 1
        L_0x0439:
            r0 = 5
            int r1 = r7.A01(r0)
            int[] r0 = X.C21350XYd.A00
            r0 = r0[r1]
            int r1 = r0 * 1000
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0454
            r0 = 0
            r7.A00 = r0
            int r0 = r7.A02
            int r0 = r0 + 1
            r7.A02 = r0
            X.C284825Ob.A00(r7)
        L_0x0454:
            int r0 = r7.A02
            r5.A0G(r0)
            X.3w8 r0 = new X.3w8
            r0.<init>()
            r0.A0R = r11
            java.lang.String r7 = "audio/ac3"
            r0.A0U = r7
            r0.A04 = r3
            r0.A0E = r8
            r3 = r31
            r0.A00(r3)
            r3 = r24
            r0.A0T = r3
            r0.A03 = r1
            r0.A0B = r1
            X.3wB r3 = new X.3wB
            r3.<init>(r0)
            goto L_0x03ce
        L_0x047c:
            r0 = 1684366131(0x64656333, float:1.692581E22)
            if (r1 != r0) goto L_0x0537
            int r0 = r6 + 8
            r5.A0G(r0)
            java.lang.String r13 = java.lang.Integer.toString(r47)
            X.5Ob r7 = new X.5Ob
            r7.<init>()
            r7.A04(r5)
            r0 = 13
            int r0 = r7.A01(r0)
            int r12 = r0 * 1000
            r0 = 3
            r7.A03(r0)
            r1 = 2
            int r3 = r7.A01(r1)
            int[] r1 = X.C21350XYd.A03
            r11 = r1[r3]
            r1 = 10
            r7.A03(r1)
            int[] r3 = X.C21350XYd.A02
            int r1 = r7.A01(r0)
            r3 = r3[r1]
            r1 = 1
            int r8 = r7.A01(r1)
            if (r8 == 0) goto L_0x04bd
            int r3 = r3 + 1
        L_0x04bd:
            r7.A03(r0)
            r0 = r30
            int r0 = r7.A01(r0)
            r7.A03(r1)
            if (r0 <= 0) goto L_0x04e8
            int r0 = r7.A00
            r8 = 0
            if (r0 != 0) goto L_0x04d1
            r8 = 1
        L_0x04d1:
            X.C256703wD.A04(r8)
            int r0 = r7.A02
            int r0 = r0 + 6
            r7.A02 = r0
            X.C284825Ob.A00(r7)
            int r0 = r7.A01(r1)
            if (r0 == 0) goto L_0x04e5
            int r3 = r3 + 2
        L_0x04e5:
            r7.A03(r1)
        L_0x04e8:
            int r0 = r7.A01
            int r8 = r7.A02
            int r0 = r0 - r8
            int r0 = r0 * 8
            int r8 = r7.A00
            int r0 = r0 - r8
            r8 = 7
            if (r0 <= r8) goto L_0x0534
            r7.A03(r8)
            int r0 = r7.A01(r1)
            if (r0 == 0) goto L_0x0534
            java.lang.String r1 = "audio/eac3-joc"
        L_0x0500:
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0510
            r0 = 0
            r7.A00 = r0
            int r0 = r7.A02
            int r0 = r0 + 1
            r7.A02 = r0
            X.C284825Ob.A00(r7)
        L_0x0510:
            int r0 = r7.A02
            r5.A0G(r0)
            X.3w8 r0 = new X.3w8
            r0.<init>()
            r0.A0R = r13
            r0.A0U = r1
            r0.A04 = r3
            r0.A0E = r11
            r1 = r31
            r0.A00(r1)
            r1 = r24
            r0.A0T = r1
            r0.A0B = r12
            X.3wB r3 = new X.3wB
            r3.<init>(r0)
            goto L_0x03ce
        L_0x0534:
            java.lang.String r1 = "audio/eac3"
            goto L_0x0500
        L_0x0537:
            r0 = 1684103988(0x64616334, float:1.6630663E22)
            if (r1 != r0) goto L_0x0579
            int r0 = r6 + 8
            r5.A0G(r0)
            java.lang.String r3 = java.lang.Integer.toString(r47)
            r7 = 1
            r5.A0H(r7)
            int r0 = r5.A02()
            r0 = r0 & 32
            int r0 = r0 >> 5
            r1 = 44100(0xac44, float:6.1797E-41)
            if (r0 != r7) goto L_0x0559
            r1 = 48000(0xbb80, float:6.7262E-41)
        L_0x0559:
            X.3w8 r0 = new X.3w8
            r0.<init>()
            r0.A0R = r3
            java.lang.String r3 = "audio/ac4"
            r0.A0U = r3
            r3 = 2
            r0.A04 = r3
            r0.A0E = r1
            r1 = r31
            r0.A00(r1)
            r1 = r24
            r0.A0T = r1
            X.3wB r3 = new X.3wB
            r3.<init>(r0)
            goto L_0x03ce
        L_0x0579:
            r0 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r1 != r0) goto L_0x0585
            if (r34 <= 0) goto L_0x0d2f
            r10 = r34
            r15 = 2
            goto L_0x03ce
        L_0x0585:
            r0 = 1684305011(0x64647473, float:1.6856995E22)
            if (r1 == r0) goto L_0x0673
            r0 = 1969517683(0x75647473, float:2.8960097E32)
            if (r1 == r0) goto L_0x0673
            r0 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r1 != r0) goto L_0x05f9
            int r2 = r9 + -8
            byte[] r7 = A00
            int r1 = r7.length
            int r0 = r1 + r2
            byte[] r7 = java.util.Arrays.copyOf(r7, r0)
            int r0 = r6 + 8
            r5.A0G(r0)
            r5.A0J(r7, r1, r2)
            r0 = 11
            byte r0 = r7[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 8
            r0 = 10
            byte r0 = r7[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            long r0 = (long) r0
            r11 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 * r11
            r11 = 48000(0xbb80, double:2.3715E-319)
            long r0 = r0 / r11
            r8 = 3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r8)
            r2.add(r7)
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r29)
            java.nio.ByteOrder r7 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r7 = r8.order(r7)
            r7.putLong(r0)
            byte[] r0 = r7.array()
            r2.add(r0)
            r0 = 80000000(0x4c4b400, double:3.95252517E-316)
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r29)
            java.nio.ByteOrder r7 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r7 = r8.order(r7)
            r7.putLong(r0)
            byte[] r0 = r7.array()
            r2.add(r0)
            goto L_0x03ce
        L_0x05f9:
            r0 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r1 != r0) goto L_0x0628
            int r2 = r9 + -12
            int r0 = r2 + 4
            byte[] r1 = new byte[r0]
            r7 = 102(0x66, float:1.43E-43)
            r0 = 0
            r1[r0] = r7
            r7 = 76
            r0 = 1
            r1[r0] = r7
            r7 = 97
            r0 = 2
            r1[r0] = r7
            r7 = 3
            r0 = 67
            r1[r7] = r0
            int r0 = r6 + 12
            r5.A0G(r0)
            r0 = r30
            r5.A0J(r1, r0, r2)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r1)
            goto L_0x03ce
        L_0x0628:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r1 != r0) goto L_0x03ce
            int r2 = r9 + -12
            byte[] r1 = new byte[r2]
            int r0 = r6 + 12
            r5.A0G(r0)
            r0 = 0
            r5.A0J(r1, r0, r2)
            X.4XV r2 = new X.4XV
            r2.<init>((byte[]) r1)
            r0 = 9
            r2.A0G(r0)
            int r7 = r2.A02()
            r0 = 20
            r2.A0G(r0)
            int r0 = r2.A04()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            java.lang.Object r2 = r0.first
            java.lang.Number r2 = (java.lang.Number) r2
            int r10 = r2.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r15 = r0.intValue()
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r1)
            goto L_0x03ce
        L_0x0673:
            X.3w8 r0 = new X.3w8
            r0.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r47)
            r0.A0R = r1
            r0.A0U = r4
            r0.A04 = r15
            r0.A0E = r10
            r1 = r31
            r0.A00(r1)
            r1 = r24
            r0.A0T = r1
            X.3wB r3 = new X.3wB
            r3.<init>(r0)
            goto L_0x03ce
        L_0x0694:
            r1 = r6
        L_0x0695:
            r0 = -1
            if (r1 == r0) goto L_0x03ce
            X.5q1 r14 = A01(r5, r1)
            java.lang.String r4 = r14.A02
            byte[] r0 = r14.A03
            if (r0 == 0) goto L_0x03ce
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x06b6
            X.5q3 r1 = X.C296425q2.A01(r0)
            int r10 = r1.A01
            int r15 = r1.A00
            java.lang.String r1 = r1.A02
            r32 = r1
        L_0x06b6:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r0)
            goto L_0x03ce
        L_0x06bc:
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r7 != r0) goto L_0x06c5
            java.lang.String r4 = "audio/eac3"
            goto L_0x0398
        L_0x06c5:
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 != r0) goto L_0x06ce
            java.lang.String r4 = "audio/ac4"
            goto L_0x0398
        L_0x06ce:
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 != r0) goto L_0x06d7
            java.lang.String r4 = "audio/vnd.dts"
            goto L_0x0398
        L_0x06d7:
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 == r0) goto L_0x0788
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 == r0) goto L_0x0788
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 != r0) goto L_0x06ee
            r0 = 1118(0x45e, float:1.567E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            goto L_0x0398
        L_0x06ee:
            r0 = 1685353336(0x64747378, float:1.8037304E22)
            if (r7 != r0) goto L_0x06fb
            r0 = 1119(0x45f, float:1.568E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            goto L_0x0398
        L_0x06fb:
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 != r0) goto L_0x0704
            java.lang.String r4 = "audio/3gpp"
            goto L_0x0398
        L_0x0704:
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 != r0) goto L_0x0711
            r0 = 4495(0x118f, float:6.299E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            goto L_0x0398
        L_0x0711:
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r7 == r0) goto L_0x0784
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 == r0) goto L_0x0784
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r7 != r0) goto L_0x0724
            r33 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039a
        L_0x0724:
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r7 == r0) goto L_0x0780
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 == r0) goto L_0x0780
            r0 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r7 != r0) goto L_0x073b
            r0 = 2668(0xa6c, float:3.739E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            goto L_0x0398
        L_0x073b:
            r0 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r7 != r0) goto L_0x0744
            java.lang.String r4 = "audio/mhm1"
            goto L_0x0398
        L_0x0744:
            if (r7 != r1) goto L_0x074a
            java.lang.String r4 = "audio/alac"
            goto L_0x0398
        L_0x074a:
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 != r0) goto L_0x0753
            java.lang.String r4 = "audio/g711-alaw"
            goto L_0x0398
        L_0x0753:
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 != r0) goto L_0x075c
            java.lang.String r4 = "audio/g711-mlaw"
            goto L_0x0398
        L_0x075c:
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 != r0) goto L_0x0765
            java.lang.String r4 = "audio/opus"
            goto L_0x0398
        L_0x0765:
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 != r0) goto L_0x0772
            r0 = 2667(0xa6b, float:3.737E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            goto L_0x0398
        L_0x0772:
            r0 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r7 != r0) goto L_0x077b
            java.lang.String r4 = "audio/true-hd"
            goto L_0x0398
        L_0x077b:
            r33 = -1
            r4 = 0
            goto L_0x039a
        L_0x0780:
            java.lang.String r4 = "audio/mpeg"
            goto L_0x0398
        L_0x0784:
            r33 = 2
            goto L_0x039a
        L_0x0788:
            java.lang.String r4 = "audio/vnd.dts.hd"
            goto L_0x0398
        L_0x078c:
            java.lang.Object r0 = r1.second
            X.4YD r0 = (X.AnonymousClass4YD) r0
            java.lang.String r0 = r0.A02
            com.google.android.exoplayer2.drm.DrmInitData r31 = r2.A00(r0)
            goto L_0x0385
        L_0x0798:
            int r15 = r5.A05()
            r5.A0H(r0)
            byte[] r6 = r5.A02
            int r0 = r5.A01
            int r10 = r0 + 1
            byte r0 = r6[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r9 = r0 << 8
            int r8 = r10 + 1
            byte r0 = r6[r10]
            r10 = r0 & 255(0xff, float:3.57E-43)
            r10 = r10 | r9
            int r0 = r8 + 2
            r5.A01 = r0
            int r0 = r0 - r30
            r5.A0G(r0)
            int r34 = r5.A01()
            if (r4 != r1) goto L_0x0368
            r0 = r28
            r5.A0H(r0)
            goto L_0x0368
        L_0x07c8:
            r1 = r29
            r5.A0H(r1)
            r4 = 0
            goto L_0x0341
        L_0x07d0:
            if (r3 != 0) goto L_0x029d
            if (r4 == 0) goto L_0x029d
            X.3w8 r6 = new X.3w8
            r6.<init>()
            java.lang.String r0 = java.lang.Integer.toString(r47)
            r6.A0R = r0
            r6.A0U = r4
            r0 = r32
            r6.A0P = r0
            r6.A04 = r15
            r6.A0E = r10
            r0 = r33
            r6.A0A = r0
            r6.A0V = r2
            r0 = r31
            r6.A00(r0)
            r0 = r24
            r6.A0T = r0
            if (r14 == 0) goto L_0x080a
            long r0 = r14.A00
            int r0 = X.1WJ.A02(r0)
            r6.A03 = r0
            long r0 = r14.A01
            int r0 = X.1WJ.A02(r0)
            r6.A0B = r0
        L_0x080a:
            X.3wB r3 = new X.3wB
            r3.<init>(r6)
            goto L_0x029d
        L_0x0811:
            r46 = r2
            int r0 = r16 + 8
            int r0 = r0 + 8
            r5.A0G(r0)
            r0 = r28
            r5.A0H(r0)
            int r45 = r5.A05()
            int r44 = r5.A05()
            r0 = 50
            r5.A0H(r0)
            int r0 = r5.A01
            r43 = r0
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r7 != r0) goto L_0x0854
            r1 = r16
            r0 = r19
            android.util.Pair r1 = A00(r5, r1, r0)
            if (r1 == 0) goto L_0x084f
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            if (r57 != 0) goto L_0x0cbf
            r46 = 0
        L_0x084b:
            java.lang.Object r0 = r1.second
            r22[r17] = r0
        L_0x084f:
            r0 = r43
            r5.A0G(r0)
        L_0x0854:
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            java.lang.String r42 = "video/3gpp"
            if (r7 != r0) goto L_0x0cb5
            java.lang.String r4 = "video/mpeg"
        L_0x085d:
            r30 = 1065353216(0x3f800000, float:1.0)
            r41 = 0
            r40 = 0
            r29 = 0
            r39 = -1
            r14 = -1
            r2 = -1
            r12 = -1
            r1 = 0
            r38 = 0
            r37 = 0
        L_0x086f:
            int r6 = r43 - r16
            r0 = r19
            if (r6 >= r0) goto L_0x088a
            r0 = r43
            r5.A0G(r0)
            int r6 = r5.A01
            int r36 = r5.A01()
            if (r36 != 0) goto L_0x08f4
            int r8 = r5.A01
            int r8 = r8 - r16
            r0 = r19
            if (r8 != r0) goto L_0x08f7
        L_0x088a:
            if (r4 == 0) goto L_0x029d
            X.3w8 r6 = new X.3w8
            r6.<init>()
            java.lang.String r0 = java.lang.Integer.toString(r47)
            r6.A0R = r0
            r6.A0U = r4
            r0 = r41
            r6.A0P = r0
            r0 = r45
            r6.A0J = r0
            r0 = r44
            r6.A08 = r0
            r0 = r30
            r6.A01 = r0
            r0 = r20
            r6.A0D = r0
            r0 = r29
            r6.A0W = r0
            r0 = r39
            r6.A0G = r0
            r0 = r40
            r6.A0V = r0
            r0 = r46
            r6.A00(r0)
            r0 = -1
            if (r14 != r0) goto L_0x08ef
            if (r2 != r0) goto L_0x08ef
            if (r12 != r0) goto L_0x08ef
            if (r1 == 0) goto L_0x08d2
        L_0x08c7:
            byte[] r1 = r1.array()
        L_0x08cb:
            com.google.android.exoplayer2.video.ColorInfo r0 = new com.google.android.exoplayer2.video.ColorInfo
            r0.<init>(r14, r2, r12, r1)
            r6.A0O = r0
        L_0x08d2:
            if (r38 == 0) goto L_0x08e8
            r0 = r38
            long r0 = r0.A00
            int r0 = X.1WJ.A02(r0)
            r6.A03 = r0
            r0 = r38
            long r0 = r0.A01
            int r0 = X.1WJ.A02(r0)
            r6.A0B = r0
        L_0x08e8:
            X.3wB r3 = new X.3wB
            r3.<init>(r6)
            goto L_0x029d
        L_0x08ef:
            if (r1 != 0) goto L_0x08c7
            r1 = r21
            goto L_0x08cb
        L_0x08f4:
            r8 = 1
            if (r36 > 0) goto L_0x08f8
        L_0x08f7:
            r8 = 0
        L_0x08f8:
            r0 = r23
            X.AnonymousClass4YE.A00(r8, r0)
            int r0 = r5.A01()
            r8 = 1635148611(0x61766343, float:2.8406573E20)
            if (r0 != r8) goto L_0x0930
            r0 = 0
            if (r4 != 0) goto L_0x090a
            r0 = 1
        L_0x090a:
            r4 = r21
            X.AnonymousClass4YE.A00(r0, r4)
            int r0 = r6 + 8
            r5.A0G(r0)
            X.5h1 r4 = X.AnonymousClass5h1.A00(r5)
            java.util.List r0 = r4.A03
            r40 = r0
            int r0 = r4.A01
            r26 = r0
            if (r37 != 0) goto L_0x0926
            float r0 = r4.A00
            r30 = r0
        L_0x0926:
            java.lang.String r0 = r4.A02
            r41 = r0
            java.lang.String r4 = "video/avc"
        L_0x092c:
            int r43 = r43 + r36
            goto L_0x086f
        L_0x0930:
            r8 = 1752589123(0x68766343, float:4.6541328E24)
            if (r0 != r8) goto L_0x0962
            r0 = 0
            if (r4 != 0) goto L_0x0939
            r0 = 1
        L_0x0939:
            r2 = r21
            X.AnonymousClass4YE.A00(r0, r2)
            int r0 = r6 + 8
            r5.A0G(r0)
            X.SFb r0 = X.C11201SFb.A00(r5)
            java.util.List r2 = r0.A06
            r40 = r2
            int r2 = r0.A04
            r26 = r2
            if (r37 != 0) goto L_0x0955
            float r2 = r0.A00
            r30 = r2
        L_0x0955:
            java.lang.String r2 = r0.A05
            r41 = r2
            int r14 = r0.A02
            int r2 = r0.A01
            int r12 = r0.A03
            java.lang.String r4 = "video/hevc"
            goto L_0x092c
        L_0x0962:
            r8 = 1685480259(0x64766343, float:1.8180206E22)
            if (r0 == r8) goto L_0x0ca7
            r8 = 1685485123(0x64767643, float:1.8185683E22)
            if (r0 == r8) goto L_0x0ca7
            r8 = 1987076931(0x76706343, float:1.21891066E33)
            r9 = 2
            if (r0 != r8) goto L_0x09b0
            r0 = 0
            if (r4 != 0) goto L_0x0976
            r0 = 1
        L_0x0976:
            r2 = r21
            X.AnonymousClass4YE.A00(r0, r2)
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 != r0) goto L_0x09ad
            r0 = 1922(0x782, float:2.693E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
        L_0x0986:
            int r0 = r6 + 12
            r5.A0G(r0)
            r5.A0H(r9)
            int r0 = r5.A02()
            r0 = r0 & 1
            r6 = 0
            if (r0 == 0) goto L_0x0998
            r6 = 1
        L_0x0998:
            int r2 = r5.A02()
            int r0 = r5.A02()
            int r14 = com.google.android.exoplayer2.video.ColorInfo.A00(r2)
            r2 = 2
            if (r6 == 0) goto L_0x09a8
            r2 = 1
        L_0x09a8:
            int r12 = com.google.android.exoplayer2.video.ColorInfo.A01(r0)
            goto L_0x092c
        L_0x09ad:
            java.lang.String r4 = "video/x-vnd.on2.vp9"
            goto L_0x0986
        L_0x09b0:
            r8 = 1635135811(0x61763143, float:2.8384055E20)
            if (r0 != r8) goto L_0x0b0e
            r0 = 0
            if (r4 != 0) goto L_0x09b9
            r0 = 1
        L_0x09b9:
            r2 = r21
            X.AnonymousClass4YE.A00(r0, r2)
            int r0 = r6 + 8
            r5.A0G(r0)
            r32 = -1
            r35 = -1
            r31 = -1
            byte[] r2 = r5.A02
            int r0 = r2.length
            X.5Ob r6 = new X.5Ob
            r6.<init>()
            r6.A03 = r2
            r6.A01 = r0
            int r0 = r5.A01
            r8 = 8
            int r0 = r0 * 8
            int r2 = r0 / 8
            r6.A02 = r2
            int r4 = r2 * 8
            int r0 = r0 - r4
            r6.A00 = r0
            X.C284825Ob.A00(r6)
            r4 = 1
            r10 = 0
            if (r0 != 0) goto L_0x09ec
            r10 = 1
        L_0x09ec:
            X.C256703wD.A04(r10)
            int r0 = r2 + 1
            r6.A02 = r0
            X.C284825Ob.A00(r6)
            r2 = 3
            r6.A01(r2)
            r0 = 6
            r6.A03(r0)
            r6.A02()
            r6.A02()
            r15 = 13
            r6.A03(r15)
            r6.A02()
            r12 = 4
            int r0 = r6.A01(r12)
            if (r0 == r4) goto L_0x0a36
            r2 = 609(0x261, float:8.53E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            X.002.A0O(r2, r0)
        L_0x0a1c:
            X.2AG.A02()
        L_0x0a1f:
            com.google.android.exoplayer2.video.ColorInfo r8 = new com.google.android.exoplayer2.video.ColorInfo
            r6 = r32
            r4 = r35
            r2 = r31
            r0 = r21
            r8.<init>(r6, r4, r2, r0)
            int r14 = r8.A02
            int r2 = r8.A01
            int r12 = r8.A03
            java.lang.String r4 = "video/av01"
            goto L_0x092c
        L_0x0a36:
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x0a1c
            boolean r0 = r6.A05()
            r6.A02()
            if (r0 == 0) goto L_0x0a4e
            int r10 = r6.A01(r8)
            r0 = 127(0x7f, float:1.78E-43)
            if (r10 <= r0) goto L_0x0a4e
            goto L_0x0a1c
        L_0x0a4e:
            int r14 = r6.A01(r2)
            r6.A02()
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x0a1c
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x0a1c
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x0a1c
            r13 = 5
            int r34 = r6.A01(r13)
            r33 = 0
            r11 = 0
        L_0x0a6f:
            r10 = 7
            r0 = r34
            if (r11 > r0) goto L_0x0a85
            r0 = 12
            r6.A03(r0)
            int r0 = r6.A01(r13)
            if (r0 <= r10) goto L_0x0a82
            r6.A02()
        L_0x0a82:
            int r11 = r11 + 1
            goto L_0x0a6f
        L_0x0a85:
            int r0 = r6.A01(r12)
            int r11 = r6.A01(r12)
            int r0 = r0 + 1
            r6.A03(r0)
            int r0 = r11 + 1
            r6.A03(r0)
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x0aa0
            r6.A03(r10)
        L_0x0aa0:
            r6.A03(r10)
            boolean r10 = r6.A05()
            if (r10 == 0) goto L_0x0aac
            r6.A03(r9)
        L_0x0aac:
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x0ab8
            int r0 = r6.A01(r4)
            if (r0 <= 0) goto L_0x0ac1
        L_0x0ab8:
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x0ac1
            r6.A03(r4)
        L_0x0ac1:
            if (r10 == 0) goto L_0x0ac6
            r6.A03(r2)
        L_0x0ac6:
            r6.A03(r2)
            boolean r0 = r6.A05()
            if (r14 != r9) goto L_0x0b0b
            if (r0 == 0) goto L_0x0ad4
            r6.A02()
        L_0x0ad4:
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x0adc
            r33 = 1
        L_0x0adc:
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x0a1f
            int r2 = r6.A01(r8)
            int r0 = r6.A01(r8)
            int r8 = r6.A01(r8)
            if (r33 != 0) goto L_0x0b06
            if (r2 != r4) goto L_0x0b06
            if (r0 != r15) goto L_0x0b06
            if (r8 != 0) goto L_0x0b06
            r6 = 1
        L_0x0af7:
            int r32 = com.google.android.exoplayer2.video.ColorInfo.A00(r2)
            if (r6 == r4) goto L_0x0afe
            r4 = 2
        L_0x0afe:
            r35 = r4
            int r31 = com.google.android.exoplayer2.video.ColorInfo.A01(r0)
            goto L_0x0a1f
        L_0x0b06:
            int r6 = r6.A01(r4)
            goto L_0x0af7
        L_0x0b0b:
            if (r14 == r4) goto L_0x0adc
            goto L_0x0ad4
        L_0x0b0e:
            r8 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r0 != r8) goto L_0x0b36
            if (r1 != 0) goto L_0x0b21
            r0 = 25
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r0)
        L_0x0b21:
            r0 = 21
            r1.position(r0)
            short r0 = r5.A0D()
            r1.putShort(r0)
            short r0 = r5.A0D()
            r1.putShort(r0)
            goto L_0x092c
        L_0x0b36:
            r8 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r0 != r8) goto L_0x0ba9
            if (r1 != 0) goto L_0x0b49
            r0 = 25
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r0)
        L_0x0b49:
            short r35 = r5.A0D()
            short r34 = r5.A0D()
            short r33 = r5.A0D()
            short r32 = r5.A0D()
            short r13 = r5.A0D()
            short r6 = r5.A0D()
            short r31 = r5.A0D()
            short r15 = r5.A0D()
            long r10 = r5.A07()
            long r8 = r5.A07()
            r0 = 1
            r1.position(r0)
            r1.putShort(r13)
            r1.putShort(r6)
            r0 = r35
            r1.putShort(r0)
            r0 = r34
            r1.putShort(r0)
            r0 = r33
            r1.putShort(r0)
            r0 = r32
            r1.putShort(r0)
            r0 = r31
            r1.putShort(r0)
            r1.putShort(r15)
            r31 = 10000(0x2710, double:4.9407E-320)
            long r10 = r10 / r31
            int r0 = (int) r10
            short r0 = (short) r0
            r1.putShort(r0)
            long r8 = r8 / r31
            int r0 = (int) r8
            short r0 = (short) r0
            r1.putShort(r0)
            goto L_0x092c
        L_0x0ba9:
            r8 = 1681012275(0x64323633, float:1.3149704E22)
            if (r0 != r8) goto L_0x0bbb
            r0 = 0
            if (r4 != 0) goto L_0x0bb2
            r0 = 1
        L_0x0bb2:
            r4 = r21
            X.AnonymousClass4YE.A00(r0, r4)
            r4 = r42
            goto L_0x092c
        L_0x0bbb:
            r8 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 != r8) goto L_0x0bdb
            r0 = 0
            if (r4 != 0) goto L_0x0bc4
            r0 = 1
        L_0x0bc4:
            r4 = r21
            X.AnonymousClass4YE.A00(r0, r4)
            X.5q1 r38 = A01(r5, r6)
            r0 = r38
            java.lang.String r4 = r0.A02
            byte[] r0 = r0.A03
            if (r0 == 0) goto L_0x092c
            com.google.common.collect.ImmutableList r40 = com.google.common.collect.ImmutableList.of(r0)
            goto L_0x092c
        L_0x0bdb:
            r8 = 1885434736(0x70617370, float:2.7909473E29)
            if (r0 != r8) goto L_0x0bf7
            int r0 = r6 + 8
            r5.A0G(r0)
            int r0 = r5.A04()
            int r6 = r5.A04()
            float r0 = (float) r0
            r30 = r0
            float r0 = (float) r6
            float r30 = r30 / r0
            r37 = 1
            goto L_0x092c
        L_0x0bf7:
            r8 = 1937126244(0x73763364, float:1.9506033E31)
            if (r0 != r8) goto L_0x0c23
            int r8 = r6 + 8
        L_0x0bfe:
            int r9 = r8 - r6
            r0 = r36
            if (r9 >= r0) goto L_0x0c1f
            r5.A0G(r8)
            int r0 = r5.A01()
            int r10 = r5.A01()
            r9 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r10 != r9) goto L_0x0c1d
            byte[] r6 = r5.A02
            int r0 = r0 + r8
            byte[] r29 = java.util.Arrays.copyOfRange(r6, r8, r0)
            goto L_0x092c
        L_0x0c1d:
            int r8 = r8 + r0
            goto L_0x0bfe
        L_0x0c1f:
            r29 = 0
            goto L_0x092c
        L_0x0c23:
            r6 = 1936995172(0x73743364, float:1.9347576E31)
            if (r0 != r6) goto L_0x0c4f
            int r0 = r5.A02()
            r6 = 3
            r5.A0H(r6)
            if (r0 != 0) goto L_0x092c
            int r0 = r5.A02()
            if (r0 == 0) goto L_0x0c4b
            r8 = 1
            if (r0 == r8) goto L_0x0c47
            if (r0 == r9) goto L_0x0c43
            if (r0 != r6) goto L_0x092c
            r39 = 3
            goto L_0x092c
        L_0x0c43:
            r39 = 2
            goto L_0x092c
        L_0x0c47:
            r39 = 1
            goto L_0x092c
        L_0x0c4b:
            r39 = 0
            goto L_0x092c
        L_0x0c4f:
            r6 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r0 != r6) goto L_0x092c
            r0 = -1
            if (r14 != r0) goto L_0x092c
            if (r2 != r0) goto L_0x092c
            if (r12 != r0) goto L_0x092c
            int r0 = r5.A01()
            r6 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r0 == r6) goto L_0x0c7e
            r6 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r0 == r6) goto L_0x0c7e
            r6 = 607(0x25f, float:8.5E-43)
            java.lang.String r6 = X.Pxd.A00(r6)
            java.lang.String r0 = X.AnonymousClass4Y9.A00(r0)
            java.lang.String r6 = X.002.A0R(r6, r0)
            java.lang.String r0 = "AtomParsers"
            X.2AG.A04(r0, r6)
            goto L_0x092c
        L_0x0c7e:
            int r10 = r5.A05()
            int r8 = r5.A05()
            r5.A0H(r9)
            r2 = 19
            r0 = r36
            if (r0 != r2) goto L_0x0c98
            int r0 = r5.A02()
            r0 = r0 & 128(0x80, float:1.794E-43)
            r6 = 1
            if (r0 != 0) goto L_0x0c99
        L_0x0c98:
            r6 = 0
        L_0x0c99:
            int r14 = com.google.android.exoplayer2.video.ColorInfo.A00(r10)
            r2 = 2
            if (r6 == 0) goto L_0x0ca1
            r2 = 1
        L_0x0ca1:
            int r12 = com.google.android.exoplayer2.video.ColorInfo.A01(r8)
            goto L_0x092c
        L_0x0ca7:
            X.SDd r0 = X.C11166SDd.A00(r5)
            if (r0 == 0) goto L_0x092c
            java.lang.String r0 = r0.A00
            r41 = r0
            java.lang.String r4 = "video/dolby-vision"
            goto L_0x092c
        L_0x0cb5:
            r0 = 1211250227(0x48323633, float:182488.8)
            r4 = 0
            if (r7 != r0) goto L_0x085d
            r4 = r42
            goto L_0x085d
        L_0x0cbf:
            java.lang.Object r0 = r1.second
            X.4YD r0 = (X.AnonymousClass4YD) r0
            java.lang.String r0 = r0.A02
            com.google.android.exoplayer2.drm.DrmInitData r46 = r2.A00(r0)
            goto L_0x084b
        L_0x0ccb:
            if (r6 != r2) goto L_0x009e
            if (r5 != r3) goto L_0x009e
            if (r4 != 0) goto L_0x009e
            r20 = 270(0x10e, float:3.78E-43)
            goto L_0x009e
        L_0x0cd5:
            if (r7 != r2) goto L_0x009e
            if (r6 != 0) goto L_0x009e
            if (r5 != 0) goto L_0x009e
            if (r4 != r2) goto L_0x009e
            r20 = 180(0xb4, float:2.52E-43)
            goto L_0x009e
        L_0x0ce1:
            if (r6 != 0) goto L_0x0cf1
            long r8 = r4.A07()
        L_0x0ce7:
            r6 = 0
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007a
            r49 = r8
            goto L_0x007a
        L_0x0cf1:
            long r8 = r4.A08()
            goto L_0x0ce7
        L_0x0cf6:
            int r3 = r3 + 1
            if (r3 < r7) goto L_0x0067
            r2 = 1
            goto L_0x0070
        L_0x0cfd:
            r2 = 1986618469(0x76696465, float:1.1834389E33)
            if (r3 != r2) goto L_0x0d06
            r18 = 2
            goto L_0x002a
        L_0x0d06:
            r2 = 1952807028(0x74657874, float:7.272211E31)
            if (r3 == r2) goto L_0x0d25
            r2 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r3 == r2) goto L_0x0d25
            r2 = 1937072756(0x73756274, float:1.944137E31)
            if (r3 == r2) goto L_0x0d25
            r2 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r3 == r2) goto L_0x0d25
            r2 = 1835365473(0x6d657461, float:4.4382975E27)
            r18 = -1
            if (r3 != r2) goto L_0x002a
            r18 = 5
            goto L_0x002a
        L_0x0d25:
            r18 = 3
            goto L_0x002a
        L_0x0d29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0d2f:
            r0 = 517(0x205, float:7.24E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = r34
            java.lang.String r1 = X.002.A0O(r1, r0)
            r0 = r21
            X.47p r0 = X.C2609347p.A00(r1, r0)
            throw r0
        L_0x0d42:
            if (r62 != 0) goto L_0x0da7
            r1 = 1701082227(0x65647473, float:6.742798E22)
            r0 = r48
            X.4Y8 r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x0da7
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            X.4YA r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0da7
            X.4XV r9 = r0.A00
            r0 = 8
            r9.A0G(r0)
            int r0 = r9.A01()
            int r0 = r0 >> 24
            r8 = r0 & 255(0xff, float:3.57E-43)
            int r7 = r9.A04()
            long[] r6 = new long[r7]
            long[] r5 = new long[r7]
            r4 = 0
        L_0x0d70:
            if (r4 >= r7) goto L_0x0dab
            r2 = 1
            if (r8 != r2) goto L_0x0d96
            long r0 = r9.A08()
        L_0x0d79:
            r6[r4] = r0
            if (r8 != r2) goto L_0x0d90
            long r0 = r9.A06()
        L_0x0d81:
            r5[r4] = r0
            short r0 = r9.A0D()
            if (r0 != r2) goto L_0x0d9b
            r0 = 2
            r9.A0H(r0)
            int r4 = r4 + 1
            goto L_0x0d70
        L_0x0d90:
            int r0 = r9.A01()
            long r0 = (long) r0
            goto L_0x0d81
        L_0x0d96:
            long r0 = r9.A07()
            goto L_0x0d79
        L_0x0d9b:
            r0 = 608(0x260, float:8.52E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0da7:
            r1 = r21
            r0 = r1
            goto L_0x0db9
        L_0x0dab:
            android.util.Pair r0 = android.util.Pair.create(r6, r5)
            if (r0 == 0) goto L_0x0da7
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
        L_0x0db9:
            if (r3 == 0) goto L_0x0de6
            r2 = r27
            java.lang.Object r2 = r2.first
            java.lang.Number r2 = (java.lang.Number) r2
            long r51 = r2.longValue()
            X.4YI r21 = new X.4YI
            r42 = r21
            r43 = r3
            r44 = r1
            r45 = r0
            r46 = r22
            r48 = r18
            r50 = r26
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r53, r55)
            return r21
        L_0x0dd9:
            r0 = 527(0x20f, float:7.38E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = r21
            X.47p r0 = X.C2609347p.A00(r1, r0)
            throw r0
        L_0x0de6:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YC.A02(com.google.android.exoplayer2.drm.DrmInitData, X.4Y8, X.4YA, long, boolean, boolean):X.4YI");
    }
}
