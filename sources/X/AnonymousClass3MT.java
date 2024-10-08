package X;

/* renamed from: X.3MT  reason: invalid class name */
public abstract class AnonymousClass3MT {
    public static int A00;
    public static int A01;
    public static AnonymousClass2d8 A02 = new Object();

    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.Object, X.2d8] */
    /* JADX WARNING: type inference failed for: r0v47, types: [java.lang.Object, X.2d8] */
    /* JADX WARNING: type inference failed for: r0v74, types: [java.lang.Object, X.2d8] */
    /* JADX WARNING: type inference failed for: r0v77, types: [java.lang.Object, X.2d8] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r6 = r4.A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0134, code lost:
        r6 = r2.A0a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.2d3 r15, X.C71472dN r16, int r17) {
        /*
            r8 = r15
            boolean r0 = r15.A0x
            if (r0 != 0) goto L_0x023b
            int r0 = A01
            int r0 = r0 + 1
            A01 = r0
            boolean r0 = r15 instanceof X.2d1
            r9 = r16
            if (r0 != 0) goto L_0x0025
            boolean r0 = r15.A0a()
            if (r0 == 0) goto L_0x0025
            boolean r0 = A06(r15)
            if (r0 == 0) goto L_0x0025
            X.2d8 r0 = new X.2d8
            r0.<init>()
            X.2d1.A00(r15, r0, r9)
        L_0x0025:
            X.2d5 r0 = X.2d5.A08
            X.2d6 r4 = r15.A0A(r0)
            X.2d5 r0 = X.2d5.A02
            X.2d6 r2 = r15.A0A(r0)
            int r16 = r4.A00()
            int r15 = r2.A00()
            java.util.HashSet r1 = r4.A05
            r14 = 0
            r3 = 8
            if (r1 == 0) goto L_0x00fc
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x00fc
            java.util.Iterator r13 = r1.iterator()
        L_0x0048:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r10 = r13.next()
            X.2d6 r10 = (X.2d6) r10
            X.2d3 r4 = r10.A08
            int r1 = r17 + 1
            boolean r12 = A06(r4)
            boolean r0 = r4.A0a()
            if (r0 == 0) goto L_0x006c
            if (r12 == 0) goto L_0x006c
            X.2d8 r0 = new X.2d8
            r0.<init>()
            X.2d1.A00(r4, r0, r9)
        L_0x006c:
            X.2d6 r7 = r4.A0g
            if (r10 != r7) goto L_0x007a
            X.2d6 r6 = r4.A0a
            X.2d6 r0 = r6.A04
            if (r0 == 0) goto L_0x007a
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x0086
        L_0x007a:
            X.2d6 r6 = r4.A0a
            if (r10 != r6) goto L_0x00fa
            X.2d6 r0 = r7.A04
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00fa
        L_0x0086:
            r11 = 1
        L_0x0087:
            java.lang.Integer[] r5 = r4.A14
            r0 = 1
            r5 = r5[r0]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r5 != r0) goto L_0x00b8
            if (r12 != 0) goto L_0x00b8
            int r0 = r4.A0I
            if (r0 < 0) goto L_0x0048
            int r0 = r4.A0K
            if (r0 < 0) goto L_0x0048
            int r0 = r4.A0R
            if (r0 == r3) goto L_0x00a8
            int r0 = r4.A0G
            if (r0 != 0) goto L_0x0048
            float r0 = r4.A01
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0048
        L_0x00a8:
            boolean r0 = r4.A0Z()
            if (r0 != 0) goto L_0x0048
            boolean r0 = r4.A0s
            if (r0 != 0) goto L_0x0048
            if (r11 == 0) goto L_0x0048
            A00(r8, r4, r9, r1)
            goto L_0x0048
        L_0x00b8:
            boolean r0 = r4.A0a()
            if (r0 != 0) goto L_0x0048
            if (r10 != r7) goto L_0x00d7
            X.2d6 r0 = r6.A04
            if (r0 != 0) goto L_0x00d7
            int r5 = r7.A01()
            int r5 = r5 + r16
            int r0 = r4.A06()
            int r0 = r0 + r5
            r4.A0K(r5, r0)
        L_0x00d2:
            A02(r4, r9, r1)
            goto L_0x0048
        L_0x00d7:
            if (r10 != r6) goto L_0x00ed
            X.2d6 r0 = r7.A04
            if (r0 != 0) goto L_0x00ed
            int r0 = r6.A01()
            int r5 = r16 - r0
            int r0 = r4.A06()
            int r0 = r5 - r0
            r4.A0K(r0, r5)
            goto L_0x00d2
        L_0x00ed:
            if (r11 == 0) goto L_0x0048
            boolean r0 = r4.A0Z()
            if (r0 != 0) goto L_0x0048
            A03(r4, r9, r1)
            goto L_0x0048
        L_0x00fa:
            r11 = 0
            goto L_0x0087
        L_0x00fc:
            boolean r0 = r8 instanceof X.AnonymousClass3MQ
            if (r0 != 0) goto L_0x023b
            java.util.HashSet r1 = r2.A05
            if (r1 == 0) goto L_0x01bf
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x01bf
            java.util.Iterator r12 = r1.iterator()
        L_0x010c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r10 = r12.next()
            X.2d6 r10 = (X.2d6) r10
            X.2d3 r2 = r10.A08
            int r1 = r17 + 1
            boolean r11 = A06(r2)
            boolean r0 = r2.A0a()
            if (r0 == 0) goto L_0x0130
            if (r11 == 0) goto L_0x0130
            X.2d8 r0 = new X.2d8
            r0.<init>()
            X.2d1.A00(r2, r0, r9)
        L_0x0130:
            X.2d6 r7 = r2.A0g
            if (r10 != r7) goto L_0x013e
            X.2d6 r6 = r2.A0a
            X.2d6 r0 = r6.A04
            if (r0 == 0) goto L_0x013e
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x014a
        L_0x013e:
            X.2d6 r6 = r2.A0a
            if (r10 != r6) goto L_0x01bd
            X.2d6 r0 = r7.A04
            if (r0 == 0) goto L_0x01bd
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x01bd
        L_0x014a:
            r5 = 1
        L_0x014b:
            java.lang.Integer[] r4 = r2.A14
            r0 = 1
            r4 = r4[r0]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 != r0) goto L_0x017c
            if (r11 != 0) goto L_0x017c
            int r0 = r2.A0I
            if (r0 < 0) goto L_0x010c
            int r0 = r2.A0K
            if (r0 < 0) goto L_0x010c
            int r0 = r2.A0R
            if (r0 == r3) goto L_0x016c
            int r0 = r2.A0G
            if (r0 != 0) goto L_0x010c
            float r0 = r2.A01
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x010c
        L_0x016c:
            boolean r0 = r2.A0Z()
            if (r0 != 0) goto L_0x010c
            boolean r0 = r2.A0s
            if (r0 != 0) goto L_0x010c
            if (r5 == 0) goto L_0x010c
            A00(r8, r2, r9, r1)
            goto L_0x010c
        L_0x017c:
            boolean r0 = r2.A0a()
            if (r0 != 0) goto L_0x010c
            if (r10 != r7) goto L_0x019a
            X.2d6 r0 = r6.A04
            if (r0 != 0) goto L_0x019a
            int r4 = r7.A01()
            int r4 = r4 + r15
            int r0 = r2.A06()
            int r0 = r0 + r4
            r2.A0K(r4, r0)
        L_0x0195:
            A02(r2, r9, r1)
            goto L_0x010c
        L_0x019a:
            if (r10 != r6) goto L_0x01b0
            X.2d6 r0 = r7.A04
            if (r0 != 0) goto L_0x01b0
            int r0 = r6.A01()
            int r4 = r15 - r0
            int r0 = r2.A06()
            int r0 = r4 - r0
            r2.A0K(r0, r4)
            goto L_0x0195
        L_0x01b0:
            if (r5 == 0) goto L_0x010c
            boolean r0 = r2.A0Z()
            if (r0 != 0) goto L_0x010c
            A03(r2, r9, r1)
            goto L_0x010c
        L_0x01bd:
            r5 = 0
            goto L_0x014b
        L_0x01bf:
            X.2d5 r0 = X.2d5.A01
            X.2d6 r2 = r8.A0A(r0)
            java.util.HashSet r1 = r2.A05
            if (r1 == 0) goto L_0x0238
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0238
            int r11 = r2.A00()
            java.util.Iterator r10 = r1.iterator()
        L_0x01d5:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0238
            java.lang.Object r3 = r10.next()
            X.2d6 r3 = (X.2d6) r3
            X.2d3 r7 = r3.A08
            int r6 = r17 + 1
            boolean r2 = A06(r7)
            boolean r0 = r7.A0a()
            if (r0 == 0) goto L_0x01f9
            if (r2 == 0) goto L_0x01f9
            X.2d8 r0 = new X.2d8
            r0.<init>()
            X.2d1.A00(r7, r0, r9)
        L_0x01f9:
            java.lang.Integer[] r0 = r7.A14
            r5 = 1
            r1 = r0[r5]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0204
            if (r2 == 0) goto L_0x01d5
        L_0x0204:
            boolean r0 = r7.A0a()
            if (r0 != 0) goto L_0x01d5
            X.2d6 r4 = r7.A0Z
            if (r3 != r4) goto L_0x01d5
            int r3 = r3.A01()
            int r3 = r3 + r11
            boolean r0 = r7.A0q
            if (r0 == 0) goto L_0x0232
            int r0 = r7.A08
            int r2 = r3 - r0
            int r1 = r7.A0A
            int r1 = r1 + r2
            r7.A0W = r2
            X.2d6 r0 = r7.A0g
            r0.A00 = r2
            r0.A06 = r5
            X.2d6 r0 = r7.A0a
            r0.A00 = r1
            r0.A06 = r5
            r4.A00 = r3
            r4.A06 = r5
            r7.A0w = r5
        L_0x0232:
            A02(r7, r9, r6)     // Catch:{ all -> 0x0236 }
            goto L_0x01d5
        L_0x0236:
            r0 = move-exception
            throw r0
        L_0x0238:
            r0 = 1
            r8.A0x = r0
        L_0x023b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MT.A02(X.2d3, X.2dN, int):void");
    }

    public static void A00(2d3 r7, 2d3 r8, C71472dN r9, int i) {
        float f = r8.A06;
        2d6 r1 = r8.A0g;
        int A002 = r1.A04.A00() + r1.A01();
        2d6 r12 = r8.A0a;
        int A003 = r12.A04.A00() - r12.A01();
        if (A003 >= A002) {
            int A06 = r8.A06();
            if (r8.A0R != 8) {
                int i2 = r8.A0G;
                if (i2 == 2) {
                    if (!(r7 instanceof 2d1)) {
                        r7 = r7.A0h;
                    }
                    A06 = (int) (f * 0.5f * ((float) r7.A06()));
                } else if (i2 == 0) {
                    A06 = A003 - A002;
                }
                A06 = Math.max(r8.A0K, A06);
                int i3 = r8.A0I;
                if (i3 > 0) {
                    A06 = Math.min(i3, A06);
                }
            }
            int i4 = A002 + ((int) ((f * ((float) ((A003 - A002) - A06))) + 0.5f));
            r8.A0K(i4, A06 + i4);
            A02(r8, r9, i + 1);
        }
    }

    public static void A01(2d3 r7, 2d3 r8, C71472dN r9, int i, boolean z) {
        float f = r8.A02;
        2d6 r1 = r8.A0e;
        int A002 = r1.A04.A00() + r1.A01();
        2d6 r12 = r8.A0f;
        int A003 = r12.A04.A00() - r12.A01();
        if (A003 >= A002) {
            int A07 = r8.A07();
            if (r8.A0R != 8) {
                int i2 = r8.A0H;
                if (i2 == 2) {
                    if (!(r7 instanceof 2d1)) {
                        r7 = r7.A0h;
                    }
                    A07 = (int) (f * 0.5f * ((float) r7.A07()));
                } else if (i2 == 0) {
                    A07 = A003 - A002;
                }
                A07 = Math.max(r8.A0L, A07);
                int i3 = r8.A0J;
                if (i3 > 0) {
                    A07 = Math.min(i3, A07);
                }
            }
            int i4 = A002 + ((int) ((f * ((float) ((A003 - A002) - A07))) + 0.5f));
            r8.A0J(i4, A07 + i4);
            A04(r8, r9, i + 1, z);
        }
    }

    public static void A03(2d3 r7, C71472dN r8, int i) {
        float f = r7.A06;
        2d6 r1 = r7.A0g;
        int A002 = r1.A04.A00();
        2d6 r2 = r7.A0a;
        int A003 = r2.A04.A00();
        int A012 = r1.A01() + A002;
        int A013 = A003 - r2.A01();
        if (A002 == A003) {
            f = 0.5f;
        } else {
            A002 = A012;
            A003 = A013;
        }
        int A06 = r7.A06();
        int i2 = (A003 - A002) - A06;
        if (A002 > A003) {
            i2 = (A002 - A003) - A06;
        }
        float f2 = f * ((float) i2);
        if (i2 > 0) {
            f2 += 0.5f;
        }
        int i3 = (int) f2;
        int i4 = A002 + i3;
        int i5 = i4 + A06;
        if (A002 > A003) {
            i4 = A002 - i3;
            i5 = i4 - A06;
        }
        r7.A0K(i4, i5);
        A02(r7, r8, i + 1);
    }

    /* JADX WARNING: type inference failed for: r0v34, types: [java.lang.Object, X.2d8] */
    /* JADX WARNING: type inference failed for: r0v61, types: [java.lang.Object, X.2d8] */
    /* JADX WARNING: type inference failed for: r0v64, types: [java.lang.Object, X.2d8] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        r9 = r7.A0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0137, code lost:
        r8 = r2.A0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.2d3 r16, X.C71472dN r17, int r18, boolean r19) {
        /*
            r5 = r16
            boolean r0 = r5.A0r
            if (r0 != 0) goto L_0x01c6
            int r0 = A00
            int r0 = r0 + 1
            A00 = r0
            boolean r0 = r5 instanceof X.2d1
            r6 = r17
            if (r0 != 0) goto L_0x0026
            boolean r0 = r5.A0a()
            if (r0 == 0) goto L_0x0026
            boolean r0 = A06(r5)
            if (r0 == 0) goto L_0x0026
            X.2d8 r0 = new X.2d8
            r0.<init>()
            X.2d1.A00(r5, r0, r6)
        L_0x0026:
            X.2d5 r0 = X.2d5.A06
            X.2d6 r7 = r5.A0A(r0)
            X.2d5 r0 = X.2d5.A07
            X.2d6 r2 = r5.A0A(r0)
            int r17 = r7.A00()
            int r16 = r2.A00()
            java.util.HashSet r1 = r7.A05
            r15 = 0
            r3 = 8
            r4 = r19
            if (r1 == 0) goto L_0x00ff
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x00ff
            java.util.Iterator r14 = r1.iterator()
        L_0x004b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r11 = r14.next()
            X.2d6 r11 = (X.2d6) r11
            X.2d3 r7 = r11.A08
            int r1 = r18 + 1
            boolean r13 = A06(r7)
            boolean r0 = r7.A0a()
            if (r0 == 0) goto L_0x006f
            if (r13 == 0) goto L_0x006f
            X.2d8 r0 = new X.2d8
            r0.<init>()
            X.2d1.A00(r7, r0, r6)
        L_0x006f:
            X.2d6 r10 = r7.A0e
            if (r11 != r10) goto L_0x007d
            X.2d6 r9 = r7.A0f
            X.2d6 r0 = r9.A04
            if (r0 == 0) goto L_0x007d
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x0089
        L_0x007d:
            X.2d6 r9 = r7.A0f
            if (r11 != r9) goto L_0x00fd
            X.2d6 r0 = r10.A04
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00fd
        L_0x0089:
            r12 = 1
        L_0x008a:
            java.lang.Integer[] r8 = r7.A14
            r0 = 0
            r8 = r8[r0]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r8 != r0) goto L_0x00bb
            if (r13 != 0) goto L_0x00bb
            int r0 = r7.A0J
            if (r0 < 0) goto L_0x004b
            int r0 = r7.A0L
            if (r0 < 0) goto L_0x004b
            int r0 = r7.A0R
            if (r0 == r3) goto L_0x00ab
            int r0 = r7.A0H
            if (r0 != 0) goto L_0x004b
            float r0 = r7.A01
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x004b
        L_0x00ab:
            boolean r0 = r7.A0Y()
            if (r0 != 0) goto L_0x004b
            boolean r0 = r7.A0s
            if (r0 != 0) goto L_0x004b
            if (r12 == 0) goto L_0x004b
            A01(r5, r7, r6, r1, r4)
            goto L_0x004b
        L_0x00bb:
            boolean r0 = r7.A0a()
            if (r0 != 0) goto L_0x004b
            if (r11 != r10) goto L_0x00da
            X.2d6 r0 = r9.A04
            if (r0 != 0) goto L_0x00da
            int r8 = r10.A01()
            int r8 = r8 + r17
            int r0 = r7.A07()
            int r0 = r0 + r8
            r7.A0J(r8, r0)
        L_0x00d5:
            A04(r7, r6, r1, r4)
            goto L_0x004b
        L_0x00da:
            if (r11 != r9) goto L_0x00f0
            X.2d6 r0 = r10.A04
            if (r0 != 0) goto L_0x00f0
            int r0 = r9.A01()
            int r8 = r17 - r0
            int r0 = r7.A07()
            int r0 = r8 - r0
            r7.A0J(r0, r8)
            goto L_0x00d5
        L_0x00f0:
            if (r12 == 0) goto L_0x004b
            boolean r0 = r7.A0Y()
            if (r0 != 0) goto L_0x004b
            A05(r7, r6, r1, r4)
            goto L_0x004b
        L_0x00fd:
            r12 = 0
            goto L_0x008a
        L_0x00ff:
            boolean r0 = r5 instanceof X.AnonymousClass3MQ
            if (r0 != 0) goto L_0x01c6
            java.util.HashSet r1 = r2.A05
            if (r1 == 0) goto L_0x01c3
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x01c3
            java.util.Iterator r13 = r1.iterator()
        L_0x010f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r10 = r13.next()
            X.2d6 r10 = (X.2d6) r10
            X.2d3 r2 = r10.A08
            int r1 = r18 + 1
            boolean r12 = A06(r2)
            boolean r0 = r2.A0a()
            if (r0 == 0) goto L_0x0133
            if (r12 == 0) goto L_0x0133
            X.2d8 r0 = new X.2d8
            r0.<init>()
            X.2d1.A00(r2, r0, r6)
        L_0x0133:
            X.2d6 r9 = r2.A0e
            if (r10 != r9) goto L_0x0141
            X.2d6 r8 = r2.A0f
            X.2d6 r0 = r8.A04
            if (r0 == 0) goto L_0x0141
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x014d
        L_0x0141:
            X.2d6 r8 = r2.A0f
            if (r10 != r8) goto L_0x01c1
            X.2d6 r0 = r9.A04
            if (r0 == 0) goto L_0x01c1
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x01c1
        L_0x014d:
            r11 = 1
        L_0x014e:
            java.lang.Integer[] r7 = r2.A14
            r0 = 0
            r7 = r7[r0]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r7 != r0) goto L_0x017f
            if (r12 != 0) goto L_0x017f
            int r0 = r2.A0J
            if (r0 < 0) goto L_0x010f
            int r0 = r2.A0L
            if (r0 < 0) goto L_0x010f
            int r0 = r2.A0R
            if (r0 == r3) goto L_0x016f
            int r0 = r2.A0H
            if (r0 != 0) goto L_0x010f
            float r0 = r2.A01
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x010f
        L_0x016f:
            boolean r0 = r2.A0Y()
            if (r0 != 0) goto L_0x010f
            boolean r0 = r2.A0s
            if (r0 != 0) goto L_0x010f
            if (r11 == 0) goto L_0x010f
            A01(r5, r2, r6, r1, r4)
            goto L_0x010f
        L_0x017f:
            boolean r0 = r2.A0a()
            if (r0 != 0) goto L_0x010f
            if (r10 != r9) goto L_0x019e
            X.2d6 r0 = r8.A04
            if (r0 != 0) goto L_0x019e
            int r7 = r9.A01()
            int r7 = r7 + r16
            int r0 = r2.A07()
            int r0 = r0 + r7
            r2.A0J(r7, r0)
        L_0x0199:
            A04(r2, r6, r1, r4)
            goto L_0x010f
        L_0x019e:
            if (r10 != r8) goto L_0x01b4
            X.2d6 r0 = r9.A04
            if (r0 != 0) goto L_0x01b4
            int r0 = r8.A01()
            int r7 = r16 - r0
            int r0 = r2.A07()
            int r0 = r7 - r0
            r2.A0J(r0, r7)
            goto L_0x0199
        L_0x01b4:
            if (r11 == 0) goto L_0x010f
            boolean r0 = r2.A0Y()
            if (r0 != 0) goto L_0x010f
            A05(r2, r6, r1, r4)
            goto L_0x010f
        L_0x01c1:
            r11 = 0
            goto L_0x014e
        L_0x01c3:
            r0 = 1
            r5.A0r = r0
        L_0x01c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MT.A04(X.2d3, X.2dN, int, boolean):void");
    }

    public static void A05(2d3 r7, C71472dN r8, int i, boolean z) {
        float f = r7.A02;
        2d6 r1 = r7.A0e;
        int A002 = r1.A04.A00();
        2d6 r2 = r7.A0f;
        int A003 = r2.A04.A00();
        int A012 = r1.A01() + A002;
        int A013 = A003 - r2.A01();
        if (A002 == A003) {
            f = 0.5f;
        } else {
            A002 = A012;
            A003 = A013;
        }
        int A07 = r7.A07();
        int i2 = (A003 - A002) - A07;
        if (A002 > A003) {
            i2 = (A002 - A003) - A07;
        }
        float f2 = f * ((float) i2);
        if (i2 > 0) {
            f2 += 0.5f;
        }
        int i3 = ((int) f2) + A002;
        int i4 = i3 + A07;
        if (A002 > A003) {
            i4 = i3 - A07;
        }
        r7.A0J(i3, i4);
        A04(r7, r8, i + 1, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (((r1.A00() - r3.A01()) - (r4.A00() + r6.A01())) >= r8) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a9, code lost:
        if (((r1.A00() - r3.A01()) - (r4.A00() + r5.A01())) >= r6) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(X.2d3 r12) {
        /*
            java.lang.Integer[] r0 = r12.A14
            r2 = 0
            r1 = r0[r2]
            r7 = 1
            r5 = r0[r7]
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r11 = 0
            r10 = 0
            if (r1 == r9) goto L_0x005b
            boolean r0 = r12.A0W()
            if (r0 != 0) goto L_0x005b
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x005b
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00b9
            int r1 = r12.A0H
            if (r1 != 0) goto L_0x002c
            float r0 = r12.A01
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            boolean r0 = r12.A0b(r2)
            if (r0 != 0) goto L_0x005b
        L_0x002c:
            if (r1 != r7) goto L_0x00b9
            int r8 = r12.A07()
            X.2d6 r6 = r12.A0e
            X.2d6 r4 = r6.A04
            if (r4 == 0) goto L_0x00b9
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x00b9
            X.2d6 r3 = r12.A0f
            X.2d6 r1 = r3.A04
            if (r1 == 0) goto L_0x00b9
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x00b9
            int r2 = r1.A00()
            int r0 = r3.A01()
            int r2 = r2 - r0
            int r1 = r4.A00()
            int r0 = r6.A01()
            int r1 = r1 + r0
            int r2 = r2 - r1
            if (r2 < r8) goto L_0x00b9
        L_0x005b:
            r8 = 1
        L_0x005c:
            if (r5 == r9) goto L_0x00ab
            boolean r0 = r12.A0X()
            if (r0 != 0) goto L_0x00ab
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r5 == r0) goto L_0x00ab
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r5 != r0) goto L_0x00b7
            int r1 = r12.A0G
            if (r1 != 0) goto L_0x007c
            float r0 = r12.A01
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x007c
            boolean r0 = r12.A0b(r7)
            if (r0 != 0) goto L_0x00ab
        L_0x007c:
            if (r1 != r7) goto L_0x00b7
            int r6 = r12.A06()
            X.2d6 r5 = r12.A0g
            X.2d6 r4 = r5.A04
            if (r4 == 0) goto L_0x00b7
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x00b7
            X.2d6 r3 = r12.A0a
            X.2d6 r1 = r3.A04
            if (r1 == 0) goto L_0x00b7
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x00b7
            int r2 = r1.A00()
            int r0 = r3.A01()
            int r2 = r2 - r0
            int r1 = r4.A00()
            int r0 = r5.A01()
            int r1 = r1 + r0
            int r2 = r2 - r1
            if (r2 < r6) goto L_0x00b7
        L_0x00ab:
            r1 = 1
        L_0x00ac:
            float r0 = r12.A01
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bb
            if (r8 != 0) goto L_0x00b6
            if (r1 == 0) goto L_0x00c0
        L_0x00b6:
            return r7
        L_0x00b7:
            r1 = 0
            goto L_0x00ac
        L_0x00b9:
            r8 = 0
            goto L_0x005c
        L_0x00bb:
            if (r8 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r10 = 1
        L_0x00c0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MT.A06(X.2d3):boolean");
    }
}
