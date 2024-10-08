package X;

/* renamed from: X.Vtu  reason: case insensitive filesystem */
public final class C18542Vtu {
    public final C17192VLw A00 = new C17192VLw(C18652Vw6.A0D);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.UzQ} */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0438, code lost:
        if (r7[2] != -65) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x06b6, code lost:
        if (r2 < 10) goto L_0x06b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04b0 A[Catch:{ UnsupportedEncodingException -> 0x0731, UnsupportedEncodingException -> 0x071d, UnsupportedEncodingException -> 0x070e, IllegalArgumentException -> 0x076a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C10801RyN A00(X.C18605Vuy r42, java.util.Map r43) {
        /*
            r41 = this;
            r3 = r42
            X.W3o r31 = r3.A02()
            X.Vzy r0 = r3.A01()
            java.lang.Integer r0 = r0.A01
            r34 = r0
            X.Vzy r0 = r3.A01()
            X.W3o r2 = r3.A02()
            X.XQf[] r1 = X.C21234XQf.values()
            byte r0 = r0.A00
            r4 = r1[r0]
            X.Wgz r8 = r3.A03
            int r7 = r8.A00
            r3 = 0
        L_0x0023:
            if (r3 >= r7) goto L_0x0037
            r1 = 0
        L_0x0026:
            if (r1 >= r7) goto L_0x0034
            boolean r0 = r4.A00(r3, r1)
            if (r0 == 0) goto L_0x0031
            r8.A00(r1, r3)
        L_0x0031:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0034:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0037:
            int r4 = r2.A01
            int r0 = r4 * 4
            int r3 = r0 + 17
            X.Wgz r6 = new X.Wgz
            r6.<init>(r3, r3)
            r13 = 0
            r32 = 9
            r1 = r32
            r0 = r1
            r6.A02(r13, r13, r1, r1)
            int r5 = r3 + -8
            r1 = 8
            r6.A02(r5, r13, r1, r0)
            r6.A02(r13, r5, r0, r1)
            int[] r12 = r2.A02
            int r11 = r12.length
            r10 = 0
        L_0x0059:
            if (r10 >= r11) goto L_0x007e
            r0 = r12[r10]
            int r9 = r0 + -2
            r5 = 0
        L_0x0060:
            if (r5 >= r11) goto L_0x007b
            if (r10 != 0) goto L_0x006a
            if (r5 == 0) goto L_0x0078
            int r0 = r11 + -1
            if (r5 == r0) goto L_0x0078
        L_0x006a:
            int r0 = r11 + -1
            if (r10 != r0) goto L_0x0070
            if (r5 == 0) goto L_0x0078
        L_0x0070:
            r0 = r12[r5]
            int r1 = r0 + -2
            r0 = 5
            r6.A02(r1, r9, r0, r0)
        L_0x0078:
            int r5 = r5 + 1
            goto L_0x0060
        L_0x007b:
            int r10 = r10 + 1
            goto L_0x0059
        L_0x007e:
            int r5 = r3 + -17
            r12 = 6
            r1 = 1
            r0 = r32
            r6.A02(r12, r0, r1, r5)
            r6.A02(r0, r12, r5, r1)
            if (r4 <= r12) goto L_0x0095
            int r1 = r3 + -11
            r0 = 3
            r6.A02(r1, r13, r0, r12)
            r6.A02(r13, r1, r12, r0)
        L_0x0095:
            int r11 = r2.A00
            byte[] r10 = new byte[r11]
            int r17 = r7 + -1
            r16 = 1
            r14 = r17
            r9 = 0
            r5 = 0
            r1 = 0
        L_0x00a2:
            if (r14 <= 0) goto L_0x00dd
            if (r14 != r12) goto L_0x00a7
            r14 = 5
        L_0x00a7:
            r4 = 0
        L_0x00a8:
            if (r4 >= r7) goto L_0x00d8
            r3 = r4
            if (r16 == 0) goto L_0x00af
            int r3 = r17 - r4
        L_0x00af:
            r2 = 0
        L_0x00b0:
            int r0 = r14 - r2
            boolean r15 = r6.A03(r0, r3)
            if (r15 != 0) goto L_0x00d0
            int r5 = r5 + 1
            int r1 = r1 << 1
            boolean r0 = r8.A03(r0, r3)
            if (r0 == 0) goto L_0x00c4
            r1 = r1 | 1
        L_0x00c4:
            r0 = 8
            if (r5 != r0) goto L_0x00d0
            int r5 = r9 + 1
            byte r0 = (byte) r1
            r10[r9] = r0
            r9 = r5
            r5 = 0
            r1 = 0
        L_0x00d0:
            int r2 = r2 + 1
            r0 = 2
            if (r2 < r0) goto L_0x00b0
            int r4 = r4 + 1
            goto L_0x00a8
        L_0x00d8:
            r16 = r16 ^ 1
            int r14 = r14 + -2
            goto L_0x00a2
        L_0x00dd:
            if (r9 != r11) goto L_0x0775
            r0 = r31
            int r0 = r0.A00
            if (r11 != r0) goto L_0x076f
            r0 = r31
            X.VR9[] r1 = r0.A03
            int r0 = r34.intValue()
            r3 = r1[r0]
            X.VR8[] r12 = r3.A01
            int r11 = r12.length
            r1 = 0
            r4 = 0
        L_0x00f4:
            if (r1 >= r11) goto L_0x00fe
            r0 = r12[r1]
            int r0 = r0.A00
            int r4 = r4 + r0
            int r1 = r1 + 1
            goto L_0x00f4
        L_0x00fe:
            r26 = r4
            X.VR7[] r1 = new X.VR7[r4]
            r8 = 0
            r9 = 0
        L_0x0104:
            if (r8 >= r11) goto L_0x0124
            r7 = r12[r8]
            r6 = 0
        L_0x0109:
            int r0 = r7.A00
            if (r6 >= r0) goto L_0x0121
            int r5 = r7.A01
            int r0 = r3.A00
            int r0 = r0 + r5
            int r14 = r9 + 1
            byte[] r2 = new byte[r0]
            X.VR7 r0 = new X.VR7
            r0.<init>(r5, r2)
            r1[r9] = r0
            int r6 = r6 + 1
            r9 = r14
            goto L_0x0109
        L_0x0121:
            int r8 = r8 + 1
            goto L_0x0104
        L_0x0124:
            r0 = r1[r13]
            byte[] r0 = r0.A01
            int r8 = r0.length
        L_0x0129:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0134
            r0 = r1[r4]
            byte[] r0 = r0.A01
            int r0 = r0.length
            if (r0 != r8) goto L_0x0129
        L_0x0134:
            int r7 = r4 + 1
            int r0 = r3.A00
            int r6 = r8 - r0
            r5 = 0
            r11 = 0
        L_0x013c:
            if (r5 >= r6) goto L_0x0152
            r4 = 0
        L_0x013f:
            if (r4 >= r9) goto L_0x014f
            r0 = r1[r4]
            byte[] r3 = r0.A01
            int r2 = r11 + 1
            byte r0 = r10[r11]
            r3[r5] = r0
            int r4 = r4 + 1
            r11 = r2
            goto L_0x013f
        L_0x014f:
            int r5 = r5 + 1
            goto L_0x013c
        L_0x0152:
            r4 = r7
        L_0x0153:
            if (r4 >= r9) goto L_0x0163
            r0 = r1[r4]
            byte[] r3 = r0.A01
            int r2 = r11 + 1
            byte r0 = r10[r11]
            r3[r6] = r0
            int r4 = r4 + 1
            r11 = r2
            goto L_0x0153
        L_0x0163:
            if (r6 >= r8) goto L_0x017e
            r5 = 0
        L_0x0166:
            if (r5 >= r9) goto L_0x017b
            int r4 = r6 + 1
            if (r5 >= r7) goto L_0x016d
            r4 = r6
        L_0x016d:
            r0 = r1[r5]
            byte[] r3 = r0.A01
            int r2 = r11 + 1
            byte r0 = r10[r11]
            r3[r4] = r0
            int r5 = r5 + 1
            r11 = r2
            goto L_0x0166
        L_0x017b:
            int r6 = r6 + 1
            goto L_0x0163
        L_0x017e:
            r3 = 0
            r2 = 0
        L_0x0180:
            r0 = r26
            if (r3 >= r0) goto L_0x018c
            r0 = r1[r3]
            int r0 = r0.A00
            int r2 = r2 + r0
            int r3 = r3 + 1
            goto L_0x0180
        L_0x018c:
            byte[] r0 = new byte[r2]
            r33 = r0
            r22 = 0
            r21 = 0
        L_0x0194:
            r2 = r22
            r0 = r26
            if (r2 >= r0) goto L_0x0366
            r2 = r1[r22]
            byte[] r0 = r2.A01
            r20 = r0
            int r0 = r2.A00
            r19 = r0
            r0 = r20
            int r7 = r0.length
            int[] r6 = new int[r7]
            r5 = 0
            r2 = 0
        L_0x01ab:
            if (r2 >= r7) goto L_0x01b6
            byte r0 = r20[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6[r2] = r0
            int r2 = r2 + 1
            goto L_0x01ab
        L_0x01b6:
            r0 = r41
            X.VLw r0 = r0.A00     // Catch:{ V1l -> 0x0359 }
            int r9 = r7 - r19
            X.Vw6 r4 = r0.A00     // Catch:{ V1l -> 0x0359 }
            X.Vl2 r10 = new X.Vl2     // Catch:{ V1l -> 0x0359 }
            r10.<init>(r4, r6)     // Catch:{ V1l -> 0x0359 }
            int[] r11 = new int[r9]     // Catch:{ V1l -> 0x0359 }
            r3 = 0
            r2 = 1
            r8 = 0
            r14 = 1
        L_0x01c9:
            if (r8 >= r9) goto L_0x01de
            int[] r0 = r4.A03     // Catch:{ V1l -> 0x0359 }
            r0 = r0[r8]     // Catch:{ V1l -> 0x0359 }
            int r12 = r10.A00(r0)     // Catch:{ V1l -> 0x0359 }
            int r0 = r9 + -1
            int r0 = r0 - r8
            r11[r0] = r12     // Catch:{ V1l -> 0x0359 }
            if (r12 == 0) goto L_0x01db
            r14 = 0
        L_0x01db:
            int r8 = r8 + 1
            goto L_0x01c9
        L_0x01de:
            if (r14 != 0) goto L_0x0339
            X.Vl2 r10 = new X.Vl2     // Catch:{ V1l -> 0x0359 }
            r10.<init>(r4, r11)     // Catch:{ V1l -> 0x0359 }
            X.Vl2 r17 = r4.A02(r9, r2)     // Catch:{ V1l -> 0x0359 }
            r8 = r10
            r0 = r17
            int[] r0 = r0.A01     // Catch:{ V1l -> 0x0359 }
            int r0 = r0.length     // Catch:{ V1l -> 0x0359 }
            int r11 = r0 + -1
            int[] r0 = r10.A01     // Catch:{ V1l -> 0x0359 }
            int r0 = r0.length     // Catch:{ V1l -> 0x0359 }
            int r0 = r0 + -1
            if (r11 >= r0) goto L_0x01fc
            r8 = r17
            r17 = r10
        L_0x01fc:
            X.Vl2 r0 = r4.A02     // Catch:{ V1l -> 0x0359 }
            r25 = r0
            r24 = r0
            X.Vl2 r12 = r4.A01     // Catch:{ V1l -> 0x0359 }
        L_0x0204:
            r23 = r8
            r8 = r17
            r17 = r23
            r18 = r24
            r24 = r12
            r0 = r23
            int[] r0 = r0.A01     // Catch:{ V1l -> 0x0359 }
            int r10 = r0.length     // Catch:{ V1l -> 0x0359 }
            int r11 = r10 + -1
            int r10 = r9 / 2
            if (r11 < r10) goto L_0x0278
            r10 = r0[r13]     // Catch:{ V1l -> 0x0359 }
            if (r10 != 0) goto L_0x0225
            java.lang.String r0 = "r_{i-1} was zero"
            X.V1l r1 = new X.V1l     // Catch:{ V1l -> 0x0359 }
            r1.<init>(r0)     // Catch:{ V1l -> 0x0359 }
        L_0x0224:
            throw r1     // Catch:{ V1l -> 0x0359 }
        L_0x0225:
            r14 = r25
            int r10 = r11 - r11
            r0 = r0[r10]     // Catch:{ V1l -> 0x0359 }
            int r16 = r4.A00(r0)     // Catch:{ V1l -> 0x0359 }
        L_0x022f:
            int[] r0 = r8.A01     // Catch:{ V1l -> 0x0359 }
            int r0 = r0.length     // Catch:{ V1l -> 0x0359 }
            int r0 = r0 + -1
            if (r0 < r11) goto L_0x025f
            int[] r0 = r8.A01     // Catch:{ V1l -> 0x0359 }
            r0 = r0[r13]     // Catch:{ V1l -> 0x0359 }
            if (r0 == 0) goto L_0x025f
            int[] r15 = r8.A01     // Catch:{ V1l -> 0x0359 }
            int r0 = r15.length     // Catch:{ V1l -> 0x0359 }
            int r0 = r0 + -1
            int r10 = r0 - r11
            int r0 = r0 - r0
            r15 = r15[r0]     // Catch:{ V1l -> 0x0359 }
            r0 = r16
            int r15 = r4.A01(r15, r0)     // Catch:{ V1l -> 0x0359 }
            X.Vl2 r0 = r4.A02(r10, r15)     // Catch:{ V1l -> 0x0359 }
            X.Vl2 r14 = r14.A03(r0)     // Catch:{ V1l -> 0x0359 }
            r0 = r23
            X.Vl2 r0 = r0.A02(r10, r15)     // Catch:{ V1l -> 0x0359 }
            X.Vl2 r8 = r8.A03(r0)     // Catch:{ V1l -> 0x0359 }
            goto L_0x022f
        L_0x025f:
            X.Vl2 r10 = r14.A04(r12)     // Catch:{ V1l -> 0x0359 }
            r0 = r18
            X.Vl2 r12 = r10.A03(r0)     // Catch:{ V1l -> 0x0359 }
            int[] r0 = r8.A01     // Catch:{ V1l -> 0x0359 }
            int r0 = r0.length     // Catch:{ V1l -> 0x0359 }
            int r0 = r0 + -1
            if (r0 < r11) goto L_0x0204
            java.lang.String r0 = "Division algorithm failed to reduce polynomial?"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ V1l -> 0x0359 }
            r1.<init>(r0)     // Catch:{ V1l -> 0x0359 }
            goto L_0x0224
        L_0x0278:
            int[] r8 = r12.A01     // Catch:{ V1l -> 0x0359 }
            int r0 = r8.length     // Catch:{ V1l -> 0x0359 }
            int r0 = r0 + -1
            r0 = r8[r0]     // Catch:{ V1l -> 0x0359 }
            if (r0 == 0) goto L_0x0330
            int r9 = r4.A00(r0)     // Catch:{ V1l -> 0x0359 }
            X.Vl2 r8 = r12.A01(r9)     // Catch:{ V1l -> 0x0359 }
            r0 = r23
            X.Vl2 r0 = r0.A01(r9)     // Catch:{ V1l -> 0x0359 }
            X.Vl2[] r0 = new X.C18074Vl2[]{r8, r0}     // Catch:{ V1l -> 0x0359 }
            r11 = r0[r13]     // Catch:{ V1l -> 0x0359 }
            r18 = r0[r2]     // Catch:{ V1l -> 0x0359 }
            int[] r0 = r11.A01     // Catch:{ V1l -> 0x0359 }
            int r8 = r0.length     // Catch:{ V1l -> 0x0359 }
            int r10 = r8 + -1
            r9 = 0
            r8 = 1
            if (r10 != r2) goto L_0x02ab
            r0 = r0[r13]     // Catch:{ V1l -> 0x0359 }
            int[] r14 = new int[]{r0}     // Catch:{ V1l -> 0x0359 }
        L_0x02a6:
            int r12 = r14.length     // Catch:{ V1l -> 0x0359 }
            int[] r11 = new int[r12]     // Catch:{ V1l -> 0x0359 }
            r10 = 0
            goto L_0x02c8
        L_0x02ab:
            int[] r14 = new int[r10]     // Catch:{ V1l -> 0x0359 }
            goto L_0x02b2
        L_0x02ae:
            r0 = 256(0x100, float:3.59E-43)
            if (r8 >= r0) goto L_0x02c5
        L_0x02b2:
            if (r9 >= r10) goto L_0x02c5
            int r0 = r11.A00(r8)     // Catch:{ V1l -> 0x0359 }
            if (r0 != 0) goto L_0x02c2
            int r0 = r4.A00(r8)     // Catch:{ V1l -> 0x0359 }
            r14[r9] = r0     // Catch:{ V1l -> 0x0359 }
            int r9 = r9 + 1
        L_0x02c2:
            int r8 = r8 + 1
            goto L_0x02ae
        L_0x02c5:
            if (r9 == r10) goto L_0x02a6
            goto L_0x0327
        L_0x02c8:
            if (r10 >= r12) goto L_0x02fe
            r0 = r14[r10]     // Catch:{ V1l -> 0x0359 }
            int r9 = r4.A00(r0)     // Catch:{ V1l -> 0x0359 }
            r8 = 1
            r15 = 0
        L_0x02d2:
            if (r15 >= r12) goto L_0x02eb
            if (r10 == r15) goto L_0x02e8
            r0 = r14[r15]     // Catch:{ V1l -> 0x0359 }
            int r17 = r4.A01(r0, r9)     // Catch:{ V1l -> 0x0359 }
            r16 = r17 & 1
            r0 = r17 & -2
            if (r16 != 0) goto L_0x02e4
            r0 = r17 | 1
        L_0x02e4:
            int r8 = r4.A01(r8, r0)     // Catch:{ V1l -> 0x0359 }
        L_0x02e8:
            int r15 = r15 + 1
            goto L_0x02d2
        L_0x02eb:
            r0 = r18
            int r0 = r0.A00(r9)     // Catch:{ V1l -> 0x0359 }
            int r8 = r4.A00(r8)     // Catch:{ V1l -> 0x0359 }
            int r0 = r4.A01(r0, r8)     // Catch:{ V1l -> 0x0359 }
            r11[r10] = r0     // Catch:{ V1l -> 0x0359 }
            int r10 = r10 + 1
            goto L_0x02c8
        L_0x02fe:
            if (r3 >= r12) goto L_0x0339
            int r9 = r7 - r2
            r8 = r14[r3]     // Catch:{ V1l -> 0x0359 }
            if (r8 == 0) goto L_0x0320
            int[] r0 = r4.A04     // Catch:{ V1l -> 0x0359 }
            r0 = r0[r8]     // Catch:{ V1l -> 0x0359 }
            int r9 = r9 - r0
            if (r9 < 0) goto L_0x0317
            r8 = r6[r9]     // Catch:{ V1l -> 0x0359 }
            r0 = r11[r3]     // Catch:{ V1l -> 0x0359 }
            r8 = r8 ^ r0
            r6[r9] = r8     // Catch:{ V1l -> 0x0359 }
            int r3 = r3 + 1
            goto L_0x02fe
        L_0x0317:
            java.lang.String r0 = "Bad error location"
            X.V1l r1 = new X.V1l     // Catch:{ V1l -> 0x0359 }
            r1.<init>(r0)     // Catch:{ V1l -> 0x0359 }
            goto L_0x0224
        L_0x0320:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ V1l -> 0x0359 }
            r1.<init>()     // Catch:{ V1l -> 0x0359 }
            goto L_0x0224
        L_0x0327:
            java.lang.String r0 = "Error locator degree does not match number of roots"
            X.V1l r1 = new X.V1l     // Catch:{ V1l -> 0x0359 }
            r1.<init>(r0)     // Catch:{ V1l -> 0x0359 }
            goto L_0x0224
        L_0x0330:
            java.lang.String r0 = "sigmaTilde(0) was zero"
            X.V1l r1 = new X.V1l     // Catch:{ V1l -> 0x0359 }
            r1.<init>(r0)     // Catch:{ V1l -> 0x0359 }
            goto L_0x0224
        L_0x0339:
            r0 = r19
            if (r5 >= r0) goto L_0x0345
            r0 = r6[r5]
            byte r0 = (byte) r0
            r20[r5] = r0
            int r5 = r5 + 1
            goto L_0x0339
        L_0x0345:
            r3 = 0
        L_0x0346:
            r0 = r19
            if (r3 >= r0) goto L_0x0355
            int r2 = r21 + 1
            byte r0 = r20[r3]
            r33[r21] = r0
            int r3 = r3 + 1
            r21 = r2
            goto L_0x0346
        L_0x0355:
            int r22 = r22 + 1
            goto L_0x0194
        L_0x0359:
            boolean r0 = X.RKY.A00
            if (r0 == 0) goto L_0x0363
            X.R7D r0 = new X.R7D
            r0.<init>()
            throw r0
        L_0x0363:
            X.R7D r0 = X.R7D.A00
            throw r0
        L_0x0366:
            X.VjH r12 = new X.VjH
            r0 = r33
            r12.<init>(r0)
            r0 = 50
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            r10 = 1
            java.util.ArrayList r30 = new java.util.ArrayList
            r0 = r30
            r0.<init>(r10)
            r29 = 0
            r16 = r29
            r28 = 0
            r39 = -1
            r40 = -1
        L_0x0386:
            int r0 = r12.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            r3 = 4
            r2 = 6
            if (r0 >= r3) goto L_0x06c4
            X.UzH r0 = X.C16681UzH.A0C     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0390:
            int r4 = r0.ordinal()     // Catch:{ IllegalArgumentException -> 0x076a }
            switch(r4) {
                case 0: goto L_0x06bf;
                case 1: goto L_0x0397;
                case 2: goto L_0x0397;
                case 3: goto L_0x05fa;
                case 4: goto L_0x0397;
                case 5: goto L_0x0666;
                case 6: goto L_0x0397;
                case 7: goto L_0x0663;
                case 8: goto L_0x0663;
                case 9: goto L_0x060e;
                default: goto L_0x0397;
            }     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0397:
            r1 = r31
            int r1 = r0.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r9 = r12.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r4 == r10) goto L_0x05a6
            r8 = 2
            if (r4 == r8) goto L_0x0541
            if (r4 == r3) goto L_0x03ec
            if (r4 != r2) goto L_0x0718
            int r2 = r9 * 13
            int r1 = r12.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r2 > r1) goto L_0x0713
            int r1 = r9 * 2
            byte[] r3 = new byte[r1]     // Catch:{ IllegalArgumentException -> 0x076a }
            r5 = 0
        L_0x03b7:
            if (r9 <= 0) goto L_0x03e0
            r1 = 13
            int r2 = r12.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r2 / 192
            int r1 = r1 << 8
            int r4 = r2 % 192
            r4 = r4 | r1
            r2 = 7936(0x1f00, float:1.1121E-41)
            r1 = 49472(0xc140, float:6.9325E-41)
            if (r4 >= r2) goto L_0x03d0
            r1 = 33088(0x8140, float:4.6366E-41)
        L_0x03d0:
            int r4 = r4 + r1
            int r1 = r4 >> 8
            byte r1 = (byte) r1     // Catch:{ IllegalArgumentException -> 0x076a }
            r3[r5] = r1     // Catch:{ IllegalArgumentException -> 0x076a }
            int r2 = r5 + 1
            byte r1 = (byte) r4     // Catch:{ IllegalArgumentException -> 0x076a }
            r3[r2] = r1     // Catch:{ IllegalArgumentException -> 0x076a }
            int r5 = r5 + 2
            int r9 = r9 + -1
            goto L_0x03b7
        L_0x03e0:
            java.lang.String r2 = "SJIS"
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x070e }
            r1.<init>(r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x070e }
            r11.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x070e }
            goto L_0x06bf
        L_0x03ec:
            int r2 = r9 * 8
            int r1 = r12.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r2 > r1) goto L_0x0722
            byte[] r7 = new byte[r9]     // Catch:{ IllegalArgumentException -> 0x076a }
            r2 = 0
        L_0x03f7:
            if (r2 >= r9) goto L_0x0405
            r1 = 8
            int r1 = r12.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            byte r1 = (byte) r1     // Catch:{ IllegalArgumentException -> 0x076a }
            r7[r2] = r1     // Catch:{ IllegalArgumentException -> 0x076a }
            int r2 = r2 + 1
            goto L_0x03f7
        L_0x0405:
            if (r16 != 0) goto L_0x052e
            boolean r1 = X.VKZ.A01     // Catch:{ IllegalArgumentException -> 0x076a }
            r3 = r43
            if (r43 == 0) goto L_0x041f
            X.UwS r2 = X.C16523UwS.CHARACTER_SET     // Catch:{ IllegalArgumentException -> 0x076a }
            boolean r1 = r3.containsKey(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 == 0) goto L_0x041f
            java.lang.Object r1 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            java.lang.String r2 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0532
        L_0x041f:
            r1 = 3
            r27 = 1
            r26 = 0
            if (r9 <= r1) goto L_0x043a
            byte r2 = r7[r13]     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = -17
            if (r2 != r1) goto L_0x043a
            byte r2 = r7[r10]     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = -69
            if (r2 != r1) goto L_0x043a
            byte r2 = r7[r8]     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = -65
            r25 = 1
            if (r2 == r1) goto L_0x043c
        L_0x043a:
            r25 = 0
        L_0x043c:
            r6 = 0
            r24 = 1
            r23 = 1
            r5 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r4 = 0
            r17 = 0
            r1 = 0
            r2 = 0
        L_0x0451:
            if (r5 >= r9) goto L_0x04ea
            if (r27 != 0) goto L_0x0459
            if (r24 != 0) goto L_0x0459
            if (r23 == 0) goto L_0x04f6
        L_0x0459:
            byte r3 = r7[r5]     // Catch:{ IllegalArgumentException -> 0x076a }
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r23 == 0) goto L_0x0467
            r14 = r3 & 128(0x80, float:1.794E-43)
            if (r22 <= 0) goto L_0x04c5
            if (r14 == 0) goto L_0x04e6
            int r22 = r22 + -1
        L_0x0467:
            r14 = 127(0x7f, float:1.78E-43)
            if (r27 == 0) goto L_0x0473
            if (r3 <= r14) goto L_0x0473
            r15 = 160(0xa0, float:2.24E-43)
            if (r3 >= r15) goto L_0x04b6
            r27 = 0
        L_0x0473:
            if (r24 == 0) goto L_0x0483
            if (r21 <= 0) goto L_0x0486
            r15 = 64
            if (r3 < r15) goto L_0x04b3
            if (r3 == r14) goto L_0x04b3
            r14 = 252(0xfc, float:3.53E-43)
            if (r3 > r14) goto L_0x04b3
            r21 = 0
        L_0x0483:
            int r5 = r5 + 1
            goto L_0x0451
        L_0x0486:
            r14 = 128(0x80, float:1.794E-43)
            if (r3 == r14) goto L_0x04b3
            r14 = 160(0xa0, float:2.24E-43)
            if (r3 == r14) goto L_0x04b3
            r15 = 239(0xef, float:3.35E-43)
            if (r3 > r15) goto L_0x04b3
            if (r3 <= r14) goto L_0x04a1
            r14 = 224(0xe0, float:3.14E-43)
            if (r3 >= r14) goto L_0x04a8
            int r6 = r6 + 1
            int r2 = r2 + 1
            if (r2 <= r4) goto L_0x049f
            r4 = r2
        L_0x049f:
            r1 = 0
            goto L_0x0483
        L_0x04a1:
            r2 = 127(0x7f, float:1.78E-43)
            if (r3 > r2) goto L_0x04a8
            r1 = 0
        L_0x04a6:
            r2 = 0
            goto L_0x0483
        L_0x04a8:
            r21 = 1
            int r1 = r1 + 1
            r2 = r26
            if (r1 <= r2) goto L_0x04a6
            r26 = r1
            goto L_0x04a6
        L_0x04b3:
            r24 = 0
            goto L_0x0483
        L_0x04b6:
            r15 = 192(0xc0, float:2.69E-43)
            if (r3 < r15) goto L_0x04c2
            r15 = 215(0xd7, float:3.01E-43)
            if (r3 == r15) goto L_0x04c2
            r15 = 247(0xf7, float:3.46E-43)
            if (r3 != r15) goto L_0x0473
        L_0x04c2:
            int r17 = r17 + 1
            goto L_0x0473
        L_0x04c5:
            if (r14 == 0) goto L_0x0467
            r14 = r3 & 64
            if (r14 == 0) goto L_0x04e6
            int r22 = r22 + 1
            r14 = r3 & 32
            if (r14 != 0) goto L_0x04d4
            int r20 = r20 + 1
            goto L_0x0467
        L_0x04d4:
            int r22 = r22 + 1
            r14 = r3 & 16
            if (r14 != 0) goto L_0x04dd
            int r19 = r19 + 1
            goto L_0x0467
        L_0x04dd:
            int r22 = r22 + 1
            r14 = r3 & 8
            if (r14 != 0) goto L_0x04e6
            int r18 = r18 + 1
            goto L_0x0467
        L_0x04e6:
            r23 = 0
            goto L_0x0467
        L_0x04ea:
            if (r23 == 0) goto L_0x04f0
            if (r22 <= 0) goto L_0x04f0
            r23 = 0
        L_0x04f0:
            if (r24 == 0) goto L_0x04f6
            if (r21 <= 0) goto L_0x04f6
            r24 = 0
        L_0x04f6:
            java.lang.String r2 = "UTF8"
            if (r23 == 0) goto L_0x0503
            if (r25 != 0) goto L_0x0532
            int r20 = r20 + r19
            int r20 = r20 + r18
            if (r20 <= 0) goto L_0x0503
            goto L_0x0532
        L_0x0503:
            java.lang.String r5 = "SJIS"
            if (r24 == 0) goto L_0x0513
            boolean r1 = X.VKZ.A01     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 != 0) goto L_0x052a
            r3 = 3
            if (r4 >= r3) goto L_0x052a
            r1 = r26
            if (r1 < r3) goto L_0x0513
            goto L_0x052a
        L_0x0513:
            java.lang.String r3 = "ISO8859_1"
            if (r27 == 0) goto L_0x0518
            goto L_0x051f
        L_0x0518:
            if (r24 != 0) goto L_0x052a
            if (r23 != 0) goto L_0x0532
            java.lang.String r2 = X.VKZ.A00     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0532
        L_0x051f:
            if (r24 == 0) goto L_0x052c
            if (r4 != r8) goto L_0x0525
            if (r6 == r8) goto L_0x052a
        L_0x0525:
            int r1 = r17 * 10
            if (r1 >= r9) goto L_0x052a
            r5 = r3
        L_0x052a:
            r2 = r5
            goto L_0x0532
        L_0x052c:
            r2 = r3
            goto L_0x0532
        L_0x052e:
            java.lang.String r2 = r16.name()     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0532:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x071d }
            r1.<init>(r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x071d }
            r11.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x071d }
            r1 = r30
            r1.add(r7)     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x06bf
        L_0x0541:
            int r4 = r11.length()     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0545:
            if (r9 <= r10) goto L_0x0568
            int r3 = r12.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = 11
            if (r3 < r1) goto L_0x0727
            int r3 = r12.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r3 / 45
            char r1 = X.C18297VpL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r11.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r3 % 45
            char r1 = X.C18297VpL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r11.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r9 = r9 + -2
            goto L_0x0545
        L_0x0568:
            if (r9 != r10) goto L_0x057b
            int r1 = r12.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 < r2) goto L_0x0727
            int r1 = r12.A01(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            char r1 = X.C18297VpL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r11.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x057b:
            if (r28 == 0) goto L_0x06bf
        L_0x057d:
            int r1 = r11.length()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r4 >= r1) goto L_0x06bf
            char r1 = r11.charAt(r4)     // Catch:{ IllegalArgumentException -> 0x076a }
            r3 = 37
            if (r1 != r3) goto L_0x05a3
            int r1 = r11.length()     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r1 - r10
            if (r4 >= r1) goto L_0x059e
            int r2 = r4 + 1
            char r1 = r11.charAt(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 != r3) goto L_0x059e
            r11.deleteCharAt(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x05a3
        L_0x059e:
            r1 = 29
            r11.setCharAt(r4, r1)     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x05a3:
            int r4 = r4 + 1
            goto L_0x057d
        L_0x05a6:
            r1 = 3
            r4 = 10
            if (r9 < r1) goto L_0x05d8
            int r1 = r12.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 < r4) goto L_0x0755
            int r2 = r12.A01(r4)     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r2 >= r1) goto L_0x0755
            int r1 = r2 / 100
            char r1 = X.C18297VpL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r11.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r2 / 10
            int r1 = r1 % r4
            char r1 = X.C18297VpL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r11.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r2 % 10
            char r1 = X.C18297VpL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r11.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r9 = r9 + -3
            goto L_0x05a6
        L_0x05d8:
            r1 = 2
            if (r9 != r1) goto L_0x05f6
            int r2 = r12.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = 7
            if (r2 < r1) goto L_0x0755
            int r2 = r12.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = 100
            if (r2 >= r1) goto L_0x0755
            int r1 = r2 / 10
            char r1 = X.C18297VpL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r11.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r2 = r2 % r4
            goto L_0x06b8
        L_0x05f6:
            if (r9 != r10) goto L_0x06bf
            goto L_0x06ac
        L_0x05fa:
            int r2 = r12.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = 16
            if (r2 < r1) goto L_0x072c
            r1 = 8
            int r39 = r12.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r40 = r12.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x06bf
        L_0x060e:
            int r2 = r12.A01(r3)     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = r31
            int r1 = r0.A00(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r6 = r12.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r2 != r10) goto L_0x06bf
            int r2 = r6 * 13
            int r1 = r12.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r2 > r1) goto L_0x0736
            int r1 = r6 * 2
            byte[] r3 = new byte[r1]     // Catch:{ IllegalArgumentException -> 0x076a }
            r5 = 0
        L_0x062b:
            if (r6 <= 0) goto L_0x0658
            r1 = 13
            int r2 = r12.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            int r1 = r2 / 96
            int r1 = r1 << 8
            int r4 = r2 % 96
            r4 = r4 | r1
            r2 = 2560(0xa00, float:3.587E-42)
            r1 = 42657(0xa6a1, float:5.9775E-41)
            if (r4 >= r2) goto L_0x0644
            r1 = 41377(0xa1a1, float:5.7982E-41)
        L_0x0644:
            int r4 = r4 + r1
            int r1 = r4 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1     // Catch:{ IllegalArgumentException -> 0x076a }
            r3[r5] = r1     // Catch:{ IllegalArgumentException -> 0x076a }
            int r2 = r5 + 1
            r1 = r4 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1     // Catch:{ IllegalArgumentException -> 0x076a }
            r3[r2] = r1     // Catch:{ IllegalArgumentException -> 0x076a }
            int r5 = r5 + 2
            int r6 = r6 + -1
            goto L_0x062b
        L_0x0658:
            java.lang.String r2 = "GB2312"
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0731 }
            r1.<init>(r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x0731 }
            r11.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0731 }
            goto L_0x06bf
        L_0x0663:
            r28 = 1
            goto L_0x06bf
        L_0x0666:
            r4 = 8
            int r3 = r12.A01(r4)     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = r3 & 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x0673
            r2 = r3 & 127(0x7f, float:1.78E-43)
            goto L_0x0693
        L_0x0673:
            r2 = r3 & 192(0xc0, float:2.69E-43)
            r1 = 128(0x80, float:1.794E-43)
            if (r2 != r1) goto L_0x0682
            int r2 = r12.A01(r4)     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = r3 & 63
            int r1 = r1 << 8
            goto L_0x0692
        L_0x0682:
            r2 = r3 & 224(0xe0, float:3.14E-43)
            r1 = 192(0xc0, float:2.69E-43)
            if (r2 != r1) goto L_0x075f
            r1 = 16
            int r2 = r12.A01(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = r3 & 31
            int r1 = r1 << 16
        L_0x0692:
            r2 = r2 | r1
        L_0x0693:
            if (r2 < 0) goto L_0x075a
            r1 = 900(0x384, float:1.261E-42)
            if (r2 >= r1) goto L_0x075a
            java.util.Map r1 = X.C16683UzQ.A03     // Catch:{ IllegalArgumentException -> 0x076a }
            java.lang.Object r16 = X.C51968G9o.A10(r1, r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            r1 = r16
            X.UzQ r1 = (X.C16683UzQ) r1     // Catch:{ IllegalArgumentException -> 0x076a }
            r16 = r1
            if (r1 != 0) goto L_0x06bf
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x06ac:
            int r1 = r12.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 < r3) goto L_0x0755
            int r2 = r12.A01(r3)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r2 >= r4) goto L_0x0755
        L_0x06b8:
            char r1 = X.C18297VpL.A00(r2)     // Catch:{ IllegalArgumentException -> 0x076a }
            r11.append(r1)     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x06bf:
            X.UzH r1 = X.C16681UzH.A0C     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r0 != r1) goto L_0x0386
            goto L_0x073b
        L_0x06c4:
            int r1 = r12.A01(r3)     // Catch:{ IllegalArgumentException -> 0x076a }
            if (r1 == 0) goto L_0x070a
            if (r1 == r10) goto L_0x0706
            r0 = 2
            if (r1 == r0) goto L_0x0702
            r0 = 3
            if (r1 == r0) goto L_0x06fe
            if (r1 == r3) goto L_0x06fa
            r0 = 5
            if (r1 == r0) goto L_0x06f6
            r0 = 7
            if (r1 == r0) goto L_0x06f2
            r0 = 8
            if (r1 == r0) goto L_0x06ee
            r0 = r32
            if (r1 == r0) goto L_0x06ea
            r0 = 13
            if (r1 != r0) goto L_0x0764
            X.UzH r0 = X.C16681UzH.A08     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0390
        L_0x06ea:
            X.UzH r0 = X.C16681UzH.A07     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0390
        L_0x06ee:
            X.UzH r0 = X.C16681UzH.A09     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0390
        L_0x06f2:
            X.UzH r0 = X.C16681UzH.A05     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0390
        L_0x06f6:
            X.UzH r0 = X.C16681UzH.A06     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0390
        L_0x06fa:
            X.UzH r0 = X.C16681UzH.A04     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0390
        L_0x06fe:
            X.UzH r0 = X.C16681UzH.A0B     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0390
        L_0x0702:
            X.UzH r0 = X.C16681UzH.A03     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0390
        L_0x0706:
            X.UzH r0 = X.C16681UzH.A0A     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0390
        L_0x070a:
            X.UzH r0 = X.C16681UzH.A0C     // Catch:{ IllegalArgumentException -> 0x076a }
            goto L_0x0390
        L_0x070e:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0713:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0718:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x071d:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0722:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0727:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x072c:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0731:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0736:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x073b:
            java.lang.String r35 = r11.toString()
            boolean r0 = r30.isEmpty()
            if (r0 == 0) goto L_0x0747
            r30 = r29
        L_0x0747:
            java.lang.String r36 = X.C18298VpM.A00(r34)
            X.RyN r34 = new X.RyN
            r37 = r30
            r38 = r33
            r34.<init>(r35, r36, r37, r38, r39, r40)
            return r34
        L_0x0755:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x075a:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x075f:
            X.R7F r0 = X.R7F.A00()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x0764:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x076a }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x076a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x076a }
        L_0x076a:
            X.R7F r0 = X.R7F.A00()
            throw r0
        L_0x076f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0775:
            X.R7F r0 = X.R7F.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18542Vtu.A00(X.Vuy, java.util.Map):X.RyN");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[Catch:{ R7D | R7F -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c A[Catch:{ R7D | R7F -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0068 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C10801RyN A01(X.C19872Wgz r10, java.util.Map r11) {
        /*
            r9 = this;
            X.Vuy r6 = new X.Vuy
            r6.<init>(r10)
            r8 = 0
            X.RyN r1 = r9.A00(r6, r11)     // Catch:{ R7F -> 0x000d, R7D -> 0x000b }
            return r1
        L_0x000b:
            r7 = move-exception
            goto L_0x0010
        L_0x000d:
            r0 = move-exception
            r7 = r8
            r8 = r0
        L_0x0010:
            X.Vzy r0 = r6.A00     // Catch:{ R7D | R7F -> 0x0074 }
            if (r0 == 0) goto L_0x0037
            X.XQf[] r1 = X.C21234XQf.values()     // Catch:{ R7D | R7F -> 0x0074 }
            X.Vzy r0 = r6.A00     // Catch:{ R7D | R7F -> 0x0074 }
            byte r0 = r0.A00     // Catch:{ R7D | R7F -> 0x0074 }
            r5 = r1[r0]     // Catch:{ R7D | R7F -> 0x0074 }
            X.Wgz r4 = r6.A03     // Catch:{ R7D | R7F -> 0x0074 }
            int r3 = r4.A00     // Catch:{ R7D | R7F -> 0x0074 }
            r2 = 0
        L_0x0023:
            if (r2 >= r3) goto L_0x0037
            r1 = 0
        L_0x0026:
            if (r1 >= r3) goto L_0x0034
            boolean r0 = r5.A00(r2, r1)     // Catch:{ R7D | R7F -> 0x0074 }
            if (r0 == 0) goto L_0x0031
            r4.A00(r1, r2)     // Catch:{ R7D | R7F -> 0x0074 }
        L_0x0031:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0037:
            r1 = 1
            r0 = 0
            r6.A01 = r0     // Catch:{ R7D | R7F -> 0x0074 }
            r6.A00 = r0     // Catch:{ R7D | R7F -> 0x0074 }
            r6.A02 = r1     // Catch:{ R7D | R7F -> 0x0074 }
            r6.A02()     // Catch:{ R7D | R7F -> 0x0074 }
            r6.A01()     // Catch:{ R7D | R7F -> 0x0074 }
            r5 = 0
        L_0x0046:
            X.Wgz r4 = r6.A03     // Catch:{ R7D | R7F -> 0x0074 }
            int r0 = r4.A02     // Catch:{ R7D | R7F -> 0x0074 }
            if (r5 >= r0) goto L_0x0068
            int r3 = r5 + 1
            r2 = r3
        L_0x004f:
            int r0 = r4.A00     // Catch:{ R7D | R7F -> 0x0074 }
            if (r2 >= r0) goto L_0x0066
            boolean r1 = r4.A03(r5, r2)     // Catch:{ R7D | R7F -> 0x0074 }
            boolean r0 = r4.A03(r2, r5)     // Catch:{ R7D | R7F -> 0x0074 }
            if (r1 == r0) goto L_0x0063
            r4.A00(r2, r5)     // Catch:{ R7D | R7F -> 0x0074 }
            r4.A00(r5, r2)     // Catch:{ R7D | R7F -> 0x0074 }
        L_0x0063:
            int r2 = r2 + 1
            goto L_0x004f
        L_0x0066:
            r5 = r3
            goto L_0x0046
        L_0x0068:
            X.RyN r1 = r9.A00(r6, r11)     // Catch:{ R7D | R7F -> 0x0074 }
            X.V6v r0 = new X.V6v     // Catch:{ R7D | R7F -> 0x0074 }
            r0.<init>()     // Catch:{ R7D | R7F -> 0x0074 }
            r1.A00 = r0     // Catch:{ R7D | R7F -> 0x0074 }
            return r1
        L_0x0074:
            if (r8 == 0) goto L_0x0077
            throw r8
        L_0x0077:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18542Vtu.A01(X.Wgz, java.util.Map):X.RyN");
    }
}
