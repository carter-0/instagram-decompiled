package X;

import java.util.zip.Inflater;

/* renamed from: X.SfS  reason: case insensitive filesystem */
public final class C11731SfS implements C13684Tf1 {
    public Inflater A00;
    public final C11389SRd A01 = new C11389SRd();
    public final C11389SRd A02 = new C11389SRd();
    public final C10814Rya A03 = new C10814Rya();

    public final /* synthetic */ void reset() {
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 209 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E1l(X.C13507TbY r38, X.C11115SAs r39, byte[] r40, int r41, int r42) {
        /*
            r37 = this;
            r4 = r37
            X.SRd r10 = r4.A02
            r1 = r41
            int r0 = r42 + r41
            r2 = r40
            r10.A0Q(r2, r0)
            r10.A0O(r1)
            int r0 = r10.A00
            int r1 = r10.A01
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0092
            byte[] r0 = r10.A02
            byte r0 = r0[r1]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 120(0x78, float:1.68E-43)
            if (r1 != r0) goto L_0x0092
            java.util.zip.Inflater r5 = r4.A00
            if (r5 != 0) goto L_0x002c
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
            r4.A00 = r5
        L_0x002c:
            X.SRd r3 = r4.A01
            int r1 = X.Pxe.A06(r10)
            if (r1 <= 0) goto L_0x0092
            byte[] r0 = r3.A02
            int r0 = r0.length
            if (r0 >= r1) goto L_0x003e
            int r0 = r1 * 2
            r3.A0L(r0)
        L_0x003e:
            if (r5 != 0) goto L_0x0045
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L_0x0045:
            byte[] r2 = r10.A02
            int r1 = r10.A01
            int r0 = r10.A00
            int r0 = r0 - r1
            r5.setInput(r2, r1, r0)
            r2 = 0
            goto L_0x0056
        L_0x0051:
            int r0 = r0 * 2
            r3.A0L(r0)     // Catch:{ DataFormatException -> 0x0084, all -> 0x007f }
        L_0x0056:
            byte[] r1 = r3.A02     // Catch:{ DataFormatException -> 0x0084, all -> 0x007f }
            int r0 = r1.length     // Catch:{ DataFormatException -> 0x0084, all -> 0x007f }
            int r0 = r0 - r2
            int r0 = r5.inflate(r1, r2, r0)     // Catch:{ DataFormatException -> 0x0084, all -> 0x007f }
            int r2 = r2 + r0
            boolean r0 = r5.finished()     // Catch:{ DataFormatException -> 0x0084, all -> 0x007f }
            if (r0 == 0) goto L_0x0069
            r3.A0N(r2)     // Catch:{ DataFormatException -> 0x0084, all -> 0x007f }
            goto L_0x0088
        L_0x0069:
            boolean r0 = r5.needsDictionary()     // Catch:{ DataFormatException -> 0x0084, all -> 0x007f }
            if (r0 != 0) goto L_0x007b
            boolean r0 = r5.needsInput()     // Catch:{ DataFormatException -> 0x0084, all -> 0x007f }
            if (r0 != 0) goto L_0x007b
            byte[] r0 = r3.A02     // Catch:{ DataFormatException -> 0x0084, all -> 0x007f }
            int r0 = r0.length     // Catch:{ DataFormatException -> 0x0084, all -> 0x007f }
            if (r2 != r0) goto L_0x0056
            goto L_0x0051
        L_0x007b:
            r5.reset()
            goto L_0x0092
        L_0x007f:
            r0 = move-exception
            r5.reset()
            throw r0
        L_0x0084:
            r5.reset()
            goto L_0x0092
        L_0x0088:
            r5.reset()
            byte[] r1 = r3.A02
            int r0 = r3.A00
            r10.A0Q(r1, r0)
        L_0x0092:
            X.Rya r9 = r4.A03
            r0 = 0
            r9.A05 = r0
            r9.A04 = r0
            r9.A02 = r0
            r9.A03 = r0
            r9.A01 = r0
            r9.A00 = r0
            X.SRd r8 = r9.A07
            r8.A0M(r0)
            r9.A06 = r0
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
        L_0x00ac:
            int r2 = r10.A00
            int r0 = r10.A01
            int r0 = r2 - r0
            r4 = 3
            if (r0 < r4) goto L_0x026f
            int r1 = r10.A05()
            int r3 = r10.A08()
            int r11 = r10.A01
            int r11 = r11 + r3
            r15 = 0
            if (r11 <= r2) goto L_0x00c7
            r10.A0O(r2)
            goto L_0x00ac
        L_0x00c7:
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x01b1
            switch(r1) {
                case 20: goto L_0x013d;
                case 21: goto L_0x00fb;
                case 22: goto L_0x00d9;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            r10.A0O(r11)
            if (r15 == 0) goto L_0x00ac
            r0 = r20
            r0.add(r15)
            goto L_0x00ac
        L_0x00d9:
            r0 = 19
            if (r3 < r0) goto L_0x00ce
            int r0 = r10.A08()
            r9.A05 = r0
            int r0 = r10.A08()
            r9.A04 = r0
            r0 = 11
            r10.A0P(r0)
            int r0 = r10.A08()
            r9.A02 = r0
            int r0 = r10.A08()
            r9.A03 = r0
            goto L_0x00ce
        L_0x00fb:
            r2 = 4
            if (r3 < r2) goto L_0x00ce
            int r0 = X.Pxf.A07(r10, r4)
            r0 = r0 & 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            int r3 = r3 + -4
            if (r0 == 0) goto L_0x0127
            r0 = 7
            if (r3 < r0) goto L_0x00ce
            int r1 = r10.A06()
            if (r1 < r2) goto L_0x00ce
            int r0 = r10.A08()
            r9.A01 = r0
            int r0 = r10.A08()
            r9.A00 = r0
            int r1 = r1 - r2
            r8.A0M(r1)
            int r3 = r3 + -7
        L_0x0127:
            int r2 = r8.A01
            int r0 = r8.A00
            if (r2 >= r0) goto L_0x00ce
            if (r3 <= 0) goto L_0x00ce
            int r1 = X.Pxh.A04(r0, r2, r3)
            byte[] r0 = r8.A02
            r10.A0R(r0, r2, r1)
            int r2 = r2 + r1
            r8.A0O(r2)
            goto L_0x00ce
        L_0x013d:
            int r1 = r3 % 5
            r0 = 2
            if (r1 != r0) goto L_0x00ce
            r10.A0P(r0)
            int[] r14 = r9.A08
            r13 = 0
            java.util.Arrays.fill(r14, r13)
            int r0 = r3 / 5
            r22 = r0
            r12 = 0
        L_0x0150:
            r0 = r22
            if (r12 >= r0) goto L_0x026a
            int r19 = r10.A05()
            int r0 = r10.A05()
            int r2 = r10.A05()
            int r3 = r10.A05()
            int r18 = r10.A05()
            double r6 = (double) r0
            r0 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            int r2 = r2 + -128
            double r4 = (double) r2
            double r0 = r0 * r4
            double r0 = r0 + r6
            int r2 = (int) r0
            r21 = r2
            r16 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            int r0 = r3 + -128
            double r2 = (double) r0
            double r16 = r16 * r2
            double r0 = r6 - r16
            r16 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r4 = r4 * r16
            double r0 = r0 - r4
            int r4 = (int) r0
            r0 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r2 = r2 * r0
            double r6 = r6 + r2
            int r2 = (int) r6
            int r5 = r18 << 24
            r3 = 255(0xff, float:3.57E-43)
            r0 = r21
            int r0 = X.Pxf.A01(r0, r3, r13)
            int r0 = r0 << 16
            r5 = r5 | r0
            int r0 = X.Pxf.A01(r4, r3, r13)
            int r1 = r0 << 8
            r1 = r1 | r5
            int r0 = X.Pxf.A01(r2, r3, r13)
            r0 = r0 | r1
            r14[r19] = r0
            int r12 = r12 + 1
            goto L_0x0150
        L_0x01b1:
            int r0 = r9.A05
            if (r0 == 0) goto L_0x0212
            int r0 = r9.A04
            if (r0 == 0) goto L_0x0212
            int r0 = r9.A01
            if (r0 == 0) goto L_0x0212
            int r0 = r9.A00
            if (r0 == 0) goto L_0x0212
            int r1 = r8.A00
            if (r1 == 0) goto L_0x0212
            int r0 = r8.A01
            if (r0 != r1) goto L_0x0212
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x0212
            r4 = 0
            r8.A0O(r4)
            int r6 = r9.A01
            int r0 = r9.A00
            int r6 = r6 * r0
            int[] r3 = new int[r6]
            r5 = 0
        L_0x01d9:
            if (r5 >= r6) goto L_0x0215
            int r1 = r8.A05()
            if (r1 == 0) goto L_0x01eb
            int r2 = r5 + 1
            int[] r0 = r9.A08
            r0 = r0[r1]
            r3[r5] = r0
        L_0x01e9:
            r5 = r2
            goto L_0x01d9
        L_0x01eb:
            int r1 = r8.A05()
            if (r1 == 0) goto L_0x01d9
            r0 = r1 & 64
            r2 = r1 & 63
            if (r0 == 0) goto L_0x01fe
            int r2 = r2 << 8
            int r0 = r8.A05()
            r2 = r2 | r0
        L_0x01fe:
            r0 = r1 & 128(0x80, float:1.794E-43)
            int[] r1 = r9.A08
            if (r0 != 0) goto L_0x020b
            r0 = r1[r4]
        L_0x0206:
            int r2 = r2 + r5
            java.util.Arrays.fill(r3, r5, r2, r0)
            goto L_0x01e9
        L_0x020b:
            int r0 = r8.A05()
            r0 = r1[r0]
            goto L_0x0206
        L_0x0212:
            r21 = 0
            goto L_0x0257
        L_0x0215:
            int r2 = r9.A01
            int r1 = r9.A00
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r22 = android.graphics.Bitmap.createBitmap(r3, r2, r1, r0)
            int r0 = r9.A02
            float r3 = (float) r0
            int r0 = r9.A05
            float r6 = (float) r0
            float r3 = r3 / r6
            int r0 = r9.A03
            float r2 = (float) r0
            int r0 = r9.A04
            float r5 = (float) r0
            float r2 = r2 / r5
            int r0 = r9.A01
            float r1 = (float) r0
            float r1 = r1 / r6
            int r0 = r9.A00
            float r0 = (float) r0
            float r0 = r0 / r5
            r35 = -2147483648(0xffffffff80000000, float:-0.0)
            r28 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r31 = 0
            X.SIh r21 = new X.SIh
            r23 = r15
            r24 = r15
            r25 = r15
            r26 = r2
            r27 = r3
            r29 = r1
            r30 = r0
            r32 = r4
            r33 = r4
            r34 = r4
            r36 = r35
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x0257:
            r15 = r21
            r0 = 0
            r9.A05 = r0
            r9.A04 = r0
            r9.A02 = r0
            r9.A03 = r0
            r9.A01 = r0
            r9.A00 = r0
            r8.A0M(r0)
            goto L_0x026b
        L_0x026a:
            r0 = 1
        L_0x026b:
            r9.A06 = r0
            goto L_0x00ce
        L_0x026f:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.RtS r0 = new X.RtS
            r1 = r20
            r4 = r2
            r0.<init>(r1, r2, r4)
            r1 = r38
            r1.accept(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11731SfS.E1l(X.TbY, X.SAs, byte[], int, int):void");
    }
}
