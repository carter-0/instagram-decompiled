package X;

/* renamed from: X.VyW  reason: case insensitive filesystem */
public abstract class C18705VyW {
    public static final int[] A00 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0691, code lost:
        r17 = r17 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x06fb, code lost:
        r17 = r17 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x027d A[LOOP:8: B:147:0x027b->B:148:0x027d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0071 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x023a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024 A[SYNTHETIC, Splitter:B:8:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C17880VhX A00(java.lang.Integer r29, java.lang.String r30, java.util.Map r31) {
        /*
            r9 = r31
            if (r31 == 0) goto L_0x0020
            X.UwV r1 = X.C16526UwV.CHARACTER_SET
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L_0x0020
            r11 = 1
            java.lang.Object r0 = r9.get(r1)
            java.lang.String r10 = r0.toString()
        L_0x0015:
            java.lang.String r7 = "Shift_JIS"
            boolean r0 = r7.equals(r10)
            r6 = r30
            if (r0 == 0) goto L_0x002e
            goto L_0x0024
        L_0x0020:
            r11 = 0
            java.lang.String r10 = "ISO-8859-1"
            goto L_0x0015
        L_0x0024:
            byte[] r4 = r6.getBytes(r7)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            int r3 = r4.length
            int r0 = r3 % 2
            r2 = 0
            if (r0 == 0) goto L_0x0054
        L_0x002e:
            r4 = 0
            r1 = 0
            r3 = 0
        L_0x0031:
            int r0 = r6.length()
            if (r4 >= r0) goto L_0x0071
            char r2 = r6.charAt(r4)
            r0 = 48
            if (r2 < r0) goto L_0x0047
            r0 = 57
            if (r2 > r0) goto L_0x0047
            r3 = 1
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x0031
        L_0x0047:
            int[] r1 = A00
            r0 = 96
            if (r2 >= r0) goto L_0x00d6
            r1 = r1[r2]
            r0 = -1
            if (r1 == r0) goto L_0x00d6
            r1 = 1
            goto L_0x0044
        L_0x0054:
            if (r2 >= r3) goto L_0x006e
            byte r0 = r4[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 129(0x81, float:1.81E-43)
            if (r1 < r0) goto L_0x002e
            r0 = 159(0x9f, float:2.23E-43)
            if (r1 <= r0) goto L_0x006b
            r0 = 224(0xe0, float:3.14E-43)
            if (r1 < r0) goto L_0x002e
            r0 = 235(0xeb, float:3.3E-43)
            if (r1 <= r0) goto L_0x006b
            goto L_0x002e
        L_0x006b:
            int r2 = r2 + 2
            goto L_0x0054
        L_0x006e:
            X.UzH r8 = X.C16681UzH.A09
            goto L_0x0075
        L_0x0071:
            if (r1 == 0) goto L_0x00d1
            X.UzH r8 = X.C16681UzH.A03
        L_0x0075:
            X.Wgy r5 = new X.Wgy
            r5.<init>()
            X.UzH r2 = X.C16681UzH.A04
            if (r8 != r2) goto L_0x0099
            if (r11 == 0) goto L_0x0099
            java.util.Map r0 = X.C16683UzQ.A02
            java.lang.Object r3 = r0.get(r10)
            X.UzQ r3 = (X.C16683UzQ) r3
            if (r3 == 0) goto L_0x0099
            r1 = 7
            r0 = 4
            r5.A01(r1, r0)
            int[] r1 = r3.A00
            r0 = 0
            r1 = r1[r0]
            r0 = 8
            r5.A01(r1, r0)
        L_0x0099:
            if (r31 == 0) goto L_0x00b6
            X.UwV r1 = X.C16526UwV.GS1_FORMAT
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r9.get(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x00b6
            r1 = 5
            r0 = 4
            r5.A01(r1, r0)
        L_0x00b6:
            int r0 = r8.A00
            r4 = 4
            r5.A01(r0, r4)
            X.Wgy r3 = new X.Wgy
            r3.<init>()
            int r1 = r8.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x01a4
            r0 = 2
            if (r1 == r0) goto L_0x0163
            if (r1 == r4) goto L_0x014a
            r0 = 6
            if (r1 != r0) goto L_0x0135
            goto L_0x00d9
        L_0x00d1:
            if (r3 == 0) goto L_0x00d6
            X.UzH r8 = X.C16681UzH.A0A
            goto L_0x0075
        L_0x00d6:
            X.UzH r8 = X.C16681UzH.A04
            goto L_0x0075
        L_0x00d9:
            byte[] r11 = r6.getBytes(r7)     // Catch:{ UnsupportedEncodingException -> 0x012e }
            int r1 = r11.length
            int r0 = r1 % 2
            if (r0 != 0) goto L_0x0126
            int r10 = r1 + -1
            r7 = 0
        L_0x00e5:
            if (r7 >= r10) goto L_0x01e8
            byte r0 = r11[r7]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r7 + 1
            byte r0 = r11[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r12 = r1 << 8
            r12 = r12 | r0
            r13 = 33088(0x8140, float:4.6366E-41)
            r1 = -1
            if (r12 < r13) goto L_0x011e
            r0 = 40956(0x9ffc, float:5.7392E-41)
            if (r12 <= r0) goto L_0x010c
            r0 = 57408(0xe040, float:8.0446E-41)
            if (r12 < r0) goto L_0x011e
            r0 = 60351(0xebbf, float:8.457E-41)
            if (r12 > r0) goto L_0x011e
            r13 = 49472(0xc140, float:6.9325E-41)
        L_0x010c:
            int r12 = r12 - r13
            if (r12 == r1) goto L_0x011e
            int r0 = r12 >> 8
            int r1 = r0 * 192
            r0 = r12 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r0
            r0 = 13
            r3.A01(r1, r0)
            int r7 = r7 + 2
            goto L_0x00e5
        L_0x011e:
            java.lang.String r1 = "Invalid byte sequence"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x0126:
            java.lang.String r1 = "Kanji byte size not even"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x012e:
            r1 = move-exception
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x0135:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 242(0xf2, float:3.39E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r8, r0, r1)
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x014a:
            byte[] r11 = r6.getBytes(r10)     // Catch:{ UnsupportedEncodingException -> 0x015c }
            int r10 = r11.length
            r7 = 0
        L_0x0150:
            if (r7 >= r10) goto L_0x01e8
            byte r1 = r11[r7]
            r0 = 8
            r3.A01(r1, r0)
            int r7 = r7 + 1
            goto L_0x0150
        L_0x015c:
            r1 = move-exception
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x0163:
            int r11 = r6.length()
            r12 = 0
        L_0x0168:
            if (r12 >= r11) goto L_0x01e8
            char r0 = r6.charAt(r12)
            int[] r14 = A00
            r13 = 96
            if (r0 >= r13) goto L_0x019e
            r10 = r14[r0]
            r7 = -1
            if (r10 == r7) goto L_0x019e
            int r1 = r12 + 1
            if (r1 >= r11) goto L_0x0192
            char r0 = r6.charAt(r1)
            if (r0 >= r13) goto L_0x0198
            r0 = r14[r0]
            if (r0 == r7) goto L_0x0198
            int r1 = r10 * 45
            int r1 = r1 + r0
            r0 = 11
            r3.A01(r1, r0)
            int r12 = r12 + 2
            goto L_0x0168
        L_0x0192:
            r0 = 6
            r3.A01(r10, r0)
            r12 = r1
            goto L_0x0168
        L_0x0198:
            X.V1s r0 = new X.V1s
            r0.<init>()
            throw r0
        L_0x019e:
            X.V1s r0 = new X.V1s
            r0.<init>()
            throw r0
        L_0x01a4:
            int r11 = r6.length()
            r13 = 0
        L_0x01a9:
            if (r13 >= r11) goto L_0x01e8
            char r0 = r6.charAt(r13)
            int r1 = r0 + -48
            int r7 = r13 + 2
            if (r7 >= r11) goto L_0x01d1
            int r0 = r13 + 1
            char r0 = r6.charAt(r0)
            int r12 = r0 + -48
            char r0 = r6.charAt(r7)
            int r10 = r0 + -48
            int r7 = r1 * 100
            r1 = 10
            int r0 = r12 * 10
            int r7 = r7 + r0
            int r7 = r7 + r10
            r3.A01(r7, r1)
            int r13 = r13 + 3
            goto L_0x01a9
        L_0x01d1:
            int r13 = r13 + 1
            if (r13 >= r11) goto L_0x01e4
            char r0 = r6.charAt(r13)
            int r0 = r0 + -48
            int r1 = r1 * 10
            int r1 = r1 + r0
            r0 = 7
            r3.A01(r1, r0)
            r13 = r7
            goto L_0x01a9
        L_0x01e4:
            r3.A01(r1, r4)
            goto L_0x01a9
        L_0x01e8:
            r31 = r29
            if (r9 == 0) goto L_0x021e
            X.UwV r1 = X.C16526UwV.QR_VERSION
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L_0x021e
            java.lang.Object r0 = r9.get(r1)
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            X.W3o r7 = X.C18811W3o.A09(r0)
            int r1 = r5.A00
            int r0 = r8.A00(r7)
            int r1 = r1 + r0
            int r0 = r3.A00
            int r1 = r1 + r0
            r0 = r31
            boolean r0 = A01(r7, r0, r1)
            if (r0 != 0) goto L_0x026d
            java.lang.String r1 = "Data too big for requested version"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x021e:
            X.W3o[] r1 = X.C18811W3o.A04
            r0 = 0
            r0 = r1[r0]
            int r10 = r5.A00
            int r0 = r8.A00(r0)
            int r10 = r10 + r0
            int r0 = r3.A00
            int r10 = r10 + r0
            r7 = 1
        L_0x022e:
            X.W3o r1 = X.C18811W3o.A09(r7)
            r0 = r31
            boolean r0 = A01(r1, r0, r10)
            if (r0 == 0) goto L_0x025f
            int r10 = r5.A00
            int r0 = r8.A00(r1)
            int r10 = r10 + r0
            int r0 = r3.A00
            int r10 = r10 + r0
            r1 = 1
        L_0x0245:
            X.W3o r7 = X.C18811W3o.A09(r1)
            r0 = r31
            boolean r0 = A01(r7, r0, r10)
            if (r0 != 0) goto L_0x026d
            int r1 = r1 + 1
            r0 = 40
            if (r1 <= r0) goto L_0x0245
            java.lang.String r1 = "Data too big"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x025f:
            int r7 = r7 + 1
            r0 = 40
            if (r7 <= r0) goto L_0x022e
            java.lang.String r1 = "Data too big"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x026d:
            X.Wgy r10 = new X.Wgy
            r10.<init>()
            int r11 = r5.A00
            int r0 = r10.A00
            int r0 = r0 + r11
            X.C19871Wgy.A00(r10, r0)
            r1 = 0
        L_0x027b:
            if (r1 >= r11) goto L_0x0287
            boolean r0 = r5.A03(r1)
            r10.A02(r0)
            int r1 = r1 + 1
            goto L_0x027b
        L_0x0287:
            if (r8 != r2) goto L_0x02b0
            int r0 = r3.A00
            int r0 = r0 + 7
            int r2 = r0 / 8
        L_0x028f:
            int r0 = r8.A00(r7)
            r6 = 1
            int r1 = r6 << r0
            if (r2 >= r1) goto L_0x0772
            r10.A01(r2, r0)
            int r2 = r3.A00
            int r0 = r10.A00
            int r0 = r0 + r2
            X.C19871Wgy.A00(r10, r0)
            r1 = 0
        L_0x02a4:
            if (r1 >= r2) goto L_0x02b5
            boolean r0 = r3.A03(r1)
            r10.A02(r0)
            int r1 = r1 + 1
            goto L_0x02a4
        L_0x02b0:
            int r2 = r6.length()
            goto L_0x028f
        L_0x02b5:
            X.VR9[] r1 = r7.A03
            int r0 = r31.intValue()
            r12 = r1[r0]
            int r5 = r7.A00
            int r13 = r12.A00
            X.VR8[] r11 = r12.A01
            int r3 = r11.length
            r2 = 0
            r1 = 0
        L_0x02c6:
            if (r2 >= r3) goto L_0x02d0
            r0 = r11[r2]
            int r0 = r0.A00
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L_0x02c6
        L_0x02d0:
            int r13 = r13 * r1
            int r30 = r5 - r13
            int r3 = r30 * 8
            int r2 = r10.A00
            if (r2 > r3) goto L_0x0764
            r11 = 0
            r1 = 0
        L_0x02db:
            int r0 = r10.A00
            if (r0 >= r3) goto L_0x02e7
            r10.A02(r11)
            int r1 = r1 + 1
            if (r1 >= r4) goto L_0x02e7
            goto L_0x02db
        L_0x02e7:
            int r0 = r10.A00
            r0 = r0 & 7
            r4 = 8
            if (r0 <= 0) goto L_0x02f7
        L_0x02ef:
            if (r0 >= r4) goto L_0x02f7
            r10.A02(r11)
            int r0 = r0 + 1
            goto L_0x02ef
        L_0x02f7:
            int r0 = r10.A00
            int r0 = r0 + 7
            int r0 = r0 / 8
            int r2 = r30 - r0
        L_0x02ff:
            if (r11 >= r2) goto L_0x030f
            r1 = r11 & 1
            r0 = 17
            if (r1 != 0) goto L_0x0309
            r0 = 236(0xec, float:3.31E-43)
        L_0x0309:
            r10.A01(r0, r4)
            int r11 = r11 + 1
            goto L_0x02ff
        L_0x030f:
            int r11 = r10.A00
            if (r11 != r3) goto L_0x075c
            X.VR8[] r3 = r12.A01
            int r2 = r3.length
            r1 = 0
            r4 = 0
        L_0x0318:
            if (r1 >= r2) goto L_0x0322
            r0 = r3[r1]
            int r0 = r0.A00
            int r4 = r4 + r0
            int r1 = r1 + 1
            goto L_0x0318
        L_0x0322:
            int r0 = r11 + 7
            int r1 = r0 / 8
            r0 = r30
            if (r1 != r0) goto L_0x0754
            java.util.ArrayList r29 = new java.util.ArrayList
            r0 = r29
            r0.<init>(r4)
            r3 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r25 = 0
        L_0x033a:
            r0 = r28
            if (r0 >= r4) goto L_0x0504
            int[] r0 = new int[r6]
            r24 = r0
            int[] r12 = new int[r6]
            r0 = r28
            if (r0 >= r4) goto L_0x04fc
            int r16 = r5 % r4
            int r13 = r4 - r16
            int r2 = r5 / r4
            int r11 = r2 + 1
            int r15 = r30 / r4
            int r14 = r15 + 1
            int r2 = r2 - r15
            int r11 = r11 - r14
            if (r2 != r11) goto L_0x04f4
            int r0 = r13 + r16
            if (r4 != r0) goto L_0x04ec
            int r1 = r15 + r2
            int r1 = r1 * r13
            int r0 = r14 + r11
            int r0 = r0 * r16
            int r1 = r1 + r0
            if (r5 != r1) goto L_0x04e4
            r0 = r28
            if (r0 >= r13) goto L_0x04c5
            r24[r3] = r15
            r12[r3] = r2
        L_0x036e:
            r1 = r24[r3]
            byte[] r0 = new byte[r1]
            r23 = r0
            int r13 = r27 * 8
            r12 = 0
        L_0x0377:
            if (r12 >= r1) goto L_0x0394
            r14 = 0
            r11 = 0
        L_0x037b:
            boolean r0 = r10.A03(r13)
            if (r0 == 0) goto L_0x0386
            int r0 = 7 - r14
            int r0 = r6 << r0
            r11 = r11 | r0
        L_0x0386:
            int r13 = r13 + 1
            int r14 = r14 + 1
            r0 = 8
            if (r14 < r0) goto L_0x037b
            byte r0 = (byte) r11
            r23[r12] = r0
            int r12 = r12 + 1
            goto L_0x0377
        L_0x0394:
            int r11 = r1 + r2
            int[] r0 = new int[r11]
            r22 = r0
            r21 = 0
            r12 = 0
        L_0x039d:
            if (r12 >= r1) goto L_0x03a8
            byte r0 = r23[r12]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r22[r12] = r0
            int r12 = r12 + 1
            goto L_0x039d
        L_0x03a8:
            X.Vw6 r17 = X.C18652Vw6.A0D
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            int[] r13 = new int[]{r6}
            X.Vl2 r12 = new X.Vl2
            r0 = r17
            r12.<init>(r0, r13)
            r0 = r16
            r0.add(r12)
            if (r2 == 0) goto L_0x04dc
            int r11 = r11 - r2
            if (r11 <= 0) goto L_0x04d4
            int r0 = r16.size()
            if (r2 < r0) goto L_0x03fc
            int r12 = r16.size()
            int r12 = r12 - r6
            r0 = r16
            java.lang.Object r13 = r0.get(r12)
            X.Vl2 r13 = (X.C18074Vl2) r13
            int r12 = r16.size()
        L_0x03db:
            if (r12 > r2) goto L_0x03fc
            int r14 = r12 + -1
            r0 = r17
            int[] r0 = r0.A03
            r0 = r0[r14]
            int[] r0 = new int[]{r6, r0}
            X.Vl2 r15 = new X.Vl2
            r14 = r17
            r15.<init>(r14, r0)
            X.Vl2 r13 = r13.A04(r15)
            r0 = r16
            r0.add(r13)
            int r12 = r12 + 1
            goto L_0x03db
        L_0x03fc:
            r0 = r16
            java.lang.Object r13 = r0.get(r2)
            X.Vl2 r13 = (X.C18074Vl2) r13
            int[] r14 = new int[r11]
            r0 = r22
            java.lang.System.arraycopy(r0, r3, r14, r3, r11)
            X.Vl2 r12 = new X.Vl2
            r0 = r17
            r12.<init>(r0, r14)
            X.Vl2 r14 = r12.A02(r2, r6)
            X.Vw6 r12 = r14.A00
            X.Vw6 r0 = r13.A00
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x04cc
            int[] r0 = r13.A01
            r15 = r0
            r0 = r0[r3]
            if (r0 != 0) goto L_0x042f
            java.lang.String r1 = "Divide by 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x042f:
            X.Vl2 r0 = r12.A02
            r20 = r0
            int r0 = r15.length
            int r19 = r0 + -1
            int r0 = r19 - r19
            r0 = r15[r0]
            int r18 = r12.A00(r0)
        L_0x043e:
            int[] r0 = r14.A01
            int r0 = r0.length
            int r0 = r0 + -1
            r15 = r0
            r0 = r19
            if (r15 < r0) goto L_0x0477
            int[] r0 = r14.A01
            r0 = r0[r3]
            if (r0 == 0) goto L_0x0477
            int[] r0 = r14.A01
            r15 = r0
            int r0 = r0.length
            int r0 = r0 + -1
            int r17 = r0 - r19
            int r0 = r0 - r0
            r0 = r15[r0]
            r15 = r0
            r0 = r18
            int r0 = r12.A01(r15, r0)
            r15 = r17
            X.Vl2 r16 = r13.A02(r15, r0)
            X.Vl2 r0 = r12.A02(r15, r0)
            r15 = r20
            X.Vl2 r20 = r15.A03(r0)
            r0 = r16
            X.Vl2 r14 = r14.A03(r0)
            goto L_0x043e
        L_0x0477:
            r0 = r20
            X.Vl2[] r0 = new X.C18074Vl2[]{r0, r14}
            r0 = r0[r6]
            int[] r0 = r0.A01
            r15 = r0
            int r13 = r0.length
            int r14 = r2 - r13
            r12 = 0
        L_0x0486:
            if (r12 >= r14) goto L_0x048f
            int r0 = r11 + r12
            r22[r0] = r3
            int r12 = r12 + 1
            goto L_0x0486
        L_0x048f:
            int r11 = r11 + r14
            r0 = r22
            java.lang.System.arraycopy(r15, r3, r0, r11, r13)
            byte[] r12 = new byte[r2]
        L_0x0497:
            r0 = r21
            if (r0 >= r2) goto L_0x04a5
            int r0 = r1 + r21
            r0 = r22[r0]
            byte r0 = (byte) r0
            r12[r21] = r0
            int r21 = r21 + 1
            goto L_0x0497
        L_0x04a5:
            X.VRA r11 = new X.VRA
            r0 = r23
            r11.<init>(r0, r12)
            r0 = r29
            r0.add(r11)
            r0 = r26
            int r26 = java.lang.Math.max(r0, r1)
            r0 = r25
            int r25 = java.lang.Math.max(r0, r2)
            r0 = r24[r3]
            int r27 = r27 + r0
            int r28 = r28 + 1
            goto L_0x033a
        L_0x04c5:
            r24[r3] = r14
            r12[r3] = r11
            r2 = r11
            goto L_0x036e
        L_0x04cc:
            java.lang.String r1 = "GenericGFPolys do not have same GenericGF field"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x04d4:
            java.lang.String r1 = "No data bytes provided"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x04dc:
            java.lang.String r1 = "No error correction bytes"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x04e4:
            java.lang.String r1 = "Total bytes mismatch"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x04ec:
            java.lang.String r1 = "RS blocks mismatch"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x04f4:
            java.lang.String r1 = "EC bytes mismatch"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x04fc:
            java.lang.String r1 = "Block ID too large"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x0504:
            r1 = r30
            r0 = r27
            if (r1 != r0) goto L_0x074c
            X.Wgy r2 = new X.Wgy
            r2.<init>()
            r11 = 0
        L_0x0510:
            r1 = 8
            r0 = r26
            if (r11 >= r0) goto L_0x0534
            java.util.Iterator r10 = r29.iterator()
        L_0x051a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0531
            java.lang.Object r0 = r10.next()
            X.VRA r0 = (X.VRA) r0
            byte[] r4 = r0.A00
            int r0 = r4.length
            if (r11 >= r0) goto L_0x051a
            byte r0 = r4[r11]
            r2.A01(r0, r1)
            goto L_0x051a
        L_0x0531:
            int r11 = r11 + 1
            goto L_0x0510
        L_0x0534:
            r0 = r25
            if (r3 >= r0) goto L_0x0556
            java.util.Iterator r10 = r29.iterator()
        L_0x053c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0553
            java.lang.Object r0 = r10.next()
            X.VRA r0 = (X.VRA) r0
            byte[] r4 = r0.A01
            int r0 = r4.length
            if (r3 >= r0) goto L_0x053c
            byte r0 = r4[r3]
            r2.A01(r0, r1)
            goto L_0x053c
        L_0x0553:
            int r3 = r3 + 1
            goto L_0x0534
        L_0x0556:
            int r0 = r2.A00
            int r0 = r0 + 7
            int r3 = r0 / 8
            if (r5 != r3) goto L_0x073c
            X.VhX r3 = new X.VhX
            r3.<init>()
            r0 = r31
            r3.A04 = r0
            r3.A01 = r8
            r3.A02 = r7
            int r0 = r7.A01
            int r0 = r0 * 4
            int r0 = r0 + 17
            X.Vgd r4 = new X.Vgd
            r4.<init>(r0, r0)
            if (r9 == 0) goto L_0x059a
            X.UwV r5 = X.C16526UwV.QR_MASK_PATTERN
            boolean r0 = r9.containsKey(r5)
            if (r0 == 0) goto L_0x059a
            java.lang.Object r0 = r9.get(r5)
            java.lang.String r0 = r0.toString()
            int r5 = java.lang.Integer.parseInt(r0)
            if (r5 < 0) goto L_0x059a
            if (r5 >= r1) goto L_0x059a
        L_0x0590:
            r3.A00 = r5
            r0 = r31
            X.W23.A00(r2, r7, r4, r0, r5)
            r3.A03 = r4
            return r3
        L_0x059a:
            r19 = 2147483647(0x7fffffff, float:NaN)
            r5 = -1
            r18 = 0
        L_0x05a0:
            r1 = r18
            r0 = r31
            X.W23.A00(r2, r7, r4, r0, r1)
            int r10 = r4.A00
            int r13 = r4.A01
            byte[][] r12 = r4.A02
            r9 = 0
            r8 = 0
        L_0x05af:
            if (r9 >= r10) goto L_0x05d6
            r15 = -1
            r11 = 0
            r14 = 0
        L_0x05b4:
            r0 = 5
            if (r11 >= r13) goto L_0x05cc
            r1 = r12[r9]
            byte r1 = r1[r11]
            if (r1 != r15) goto L_0x05c2
            int r14 = r14 + 1
        L_0x05bf:
            int r11 = r11 + 1
            goto L_0x05b4
        L_0x05c2:
            if (r14 < r0) goto L_0x05c9
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r8 = r8 + r0
        L_0x05c9:
            r15 = r1
            r14 = 1
            goto L_0x05bf
        L_0x05cc:
            if (r14 < r0) goto L_0x05d3
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r8 = r8 + r0
        L_0x05d3:
            int r9 = r9 + 1
            goto L_0x05af
        L_0x05d6:
            r9 = 0
            r16 = 0
        L_0x05d9:
            if (r9 >= r13) goto L_0x0602
            r15 = -1
            r11 = 0
            r14 = 0
        L_0x05de:
            r0 = 5
            if (r11 >= r10) goto L_0x05f7
            r1 = r12[r11]
            byte r1 = r1[r9]
            if (r1 != r15) goto L_0x05ec
            int r14 = r14 + 1
        L_0x05e9:
            int r11 = r11 + 1
            goto L_0x05de
        L_0x05ec:
            if (r14 < r0) goto L_0x05f4
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r16 = r16 + r0
        L_0x05f4:
            r15 = r1
            r14 = 1
            goto L_0x05e9
        L_0x05f7:
            if (r14 < r0) goto L_0x05ff
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r16 = r16 + r0
        L_0x05ff:
            int r9 = r9 + 1
            goto L_0x05d9
        L_0x0602:
            int r8 = r8 + r16
            r11 = 0
            r17 = 0
        L_0x0607:
            int r0 = r10 + -1
            if (r11 >= r0) goto L_0x062d
            r16 = r12[r11]
            r14 = 0
        L_0x060e:
            int r0 = r13 + -1
            if (r14 >= r0) goto L_0x062a
            byte r9 = r16[r14]
            int r15 = r14 + 1
            byte r0 = r16[r15]
            if (r9 != r0) goto L_0x0628
            int r0 = r11 + 1
            r1 = r12[r0]
            byte r0 = r1[r14]
            if (r9 != r0) goto L_0x0628
            byte r0 = r1[r15]
            if (r9 != r0) goto L_0x0628
            int r17 = r17 + 1
        L_0x0628:
            r14 = r15
            goto L_0x060e
        L_0x062a:
            int r11 = r11 + 1
            goto L_0x0607
        L_0x062d:
            int r0 = r17 * 3
            int r8 = r8 + r0
            r9 = 0
            r17 = 0
        L_0x0633:
            if (r9 >= r10) goto L_0x0705
            r1 = 0
        L_0x0636:
            if (r1 >= r13) goto L_0x0701
            r14 = r12[r9]
            int r11 = r1 + 6
            if (r11 >= r13) goto L_0x0693
            byte r0 = r14[r1]
            if (r0 != r6) goto L_0x0693
            int r0 = r1 + 1
            byte r0 = r14[r0]
            if (r0 != 0) goto L_0x0693
            int r0 = r1 + 2
            byte r0 = r14[r0]
            if (r0 != r6) goto L_0x0693
            int r0 = r1 + 3
            byte r0 = r14[r0]
            if (r0 != r6) goto L_0x0693
            int r0 = r1 + 4
            byte r0 = r14[r0]
            if (r0 != r6) goto L_0x0693
            int r0 = r1 + 5
            byte r0 = r14[r0]
            if (r0 != 0) goto L_0x0693
            byte r0 = r14[r11]
            if (r0 != r6) goto L_0x0693
            int r0 = r1 + -4
            r15 = 0
            int r11 = java.lang.Math.max(r0, r15)
            int r0 = r14.length
            int r16 = java.lang.Math.min(r1, r0)
        L_0x0670:
            r0 = r16
            if (r11 >= r0) goto L_0x0691
            byte r0 = r14[r11]
            if (r0 != r6) goto L_0x068e
            int r0 = r1 + 7
            int r11 = r1 + 11
            int r15 = java.lang.Math.max(r0, r15)
            int r0 = r14.length
            int r11 = java.lang.Math.min(r11, r0)
        L_0x0685:
            if (r15 >= r11) goto L_0x0691
            byte r0 = r14[r15]
            if (r0 == r6) goto L_0x0693
            int r15 = r15 + 1
            goto L_0x0685
        L_0x068e:
            int r11 = r11 + 1
            goto L_0x0670
        L_0x0691:
            int r17 = r17 + 1
        L_0x0693:
            int r11 = r9 + 6
            if (r11 >= r10) goto L_0x06fd
            r0 = r12[r9]
            byte r0 = r0[r1]
            if (r0 != r6) goto L_0x06fd
            int r0 = r9 + 1
            r0 = r12[r0]
            byte r0 = r0[r1]
            if (r0 != 0) goto L_0x06fd
            int r0 = r9 + 2
            r0 = r12[r0]
            byte r0 = r0[r1]
            if (r0 != r6) goto L_0x06fd
            int r0 = r9 + 3
            r0 = r12[r0]
            byte r0 = r0[r1]
            if (r0 != r6) goto L_0x06fd
            int r0 = r9 + 4
            r0 = r12[r0]
            byte r0 = r0[r1]
            if (r0 != r6) goto L_0x06fd
            int r0 = r9 + 5
            r0 = r12[r0]
            byte r0 = r0[r1]
            if (r0 != 0) goto L_0x06fd
            r0 = r12[r11]
            byte r0 = r0[r1]
            if (r0 != r6) goto L_0x06fd
            int r0 = r9 + -4
            r14 = 0
            int r15 = java.lang.Math.max(r0, r14)
            int r11 = r12.length
            int r16 = java.lang.Math.min(r9, r11)
        L_0x06d7:
            r0 = r16
            if (r15 >= r0) goto L_0x06fb
            r0 = r12[r15]
            byte r0 = r0[r1]
            if (r0 != r6) goto L_0x06f8
            int r15 = r9 + 7
            int r0 = r9 + 11
            int r14 = java.lang.Math.max(r15, r14)
            int r11 = java.lang.Math.min(r0, r11)
        L_0x06ed:
            if (r14 >= r11) goto L_0x06fb
            r0 = r12[r14]
            byte r0 = r0[r1]
            if (r0 == r6) goto L_0x06fd
            int r14 = r14 + 1
            goto L_0x06ed
        L_0x06f8:
            int r15 = r15 + 1
            goto L_0x06d7
        L_0x06fb:
            int r17 = r17 + 1
        L_0x06fd:
            int r1 = r1 + 1
            goto L_0x0636
        L_0x0701:
            int r9 = r9 + 1
            goto L_0x0633
        L_0x0705:
            int r0 = r17 * 40
            int r8 = r8 + r0
            r14 = 0
            r11 = 0
        L_0x070a:
            if (r14 >= r10) goto L_0x071d
            r9 = r12[r14]
            r1 = 0
        L_0x070f:
            if (r1 >= r13) goto L_0x071a
            byte r0 = r9[r1]
            if (r0 != r6) goto L_0x0717
            int r11 = r11 + 1
        L_0x0717:
            int r1 = r1 + 1
            goto L_0x070f
        L_0x071a:
            int r14 = r14 + 1
            goto L_0x070a
        L_0x071d:
            int r10 = r10 * r13
            int r0 = r11 * 2
            int r0 = X.C13988Tno.A06(r0, r10)
            int r0 = r0 * 10
            int r0 = r0 / r10
            int r0 = r0 * 10
            int r8 = r8 + r0
            r0 = r19
            if (r8 >= r0) goto L_0x0732
            r5 = r18
            r19 = r8
        L_0x0732:
            int r18 = r18 + 1
            r1 = 8
            r0 = r18
            if (r0 >= r1) goto L_0x0590
            goto L_0x05a0
        L_0x073c:
            java.lang.String r2 = "Interleaving error: "
            java.lang.String r1 = " and "
            java.lang.String r0 = " differ."
            java.lang.String r1 = X.002.A0n(r2, r1, r0, r5, r3)
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x074c:
            java.lang.String r1 = "Data bytes does not match offset"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x0754:
            java.lang.String r1 = "Number of bits and data bytes does not match"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x075c:
            java.lang.String r1 = "Bits size does not equal capacity"
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x0764:
            java.lang.String r1 = "data bits cannot fit in the QR Code"
            java.lang.String r0 = " > "
            java.lang.String r1 = X.002.A02(r2, r3, r1, r0)
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        L_0x0772:
            java.lang.String r0 = " is bigger than "
            int r1 = r1 - r6
            java.lang.String r1 = X.002.A0P(r0, r2, r1)
            X.V1s r0 = new X.V1s
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18705VyW.A00(java.lang.Integer, java.lang.String, java.util.Map):X.VhX");
    }

    public static boolean A01(C18811W3o w3o, Integer num, int i) {
        int i2 = w3o.A00;
        VR9 vr9 = w3o.A03[num.intValue()];
        int i3 = vr9.A00;
        int i4 = 0;
        for (VR8 vr8 : vr9.A01) {
            i4 += vr8.A00;
        }
        return JTQ.A1P(i2 - (i3 * i4), (i + 7) / 8);
    }
}
