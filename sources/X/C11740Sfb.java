package X;

/* renamed from: X.Sfb  reason: case insensitive filesystem */
public final class C11740Sfb implements C22557YAo {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07 = -9223372036854775807L;
    public SJM A08;
    public C13900TjN A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public final int A0I;
    public final ST7 A0J;
    public final C11389SRd A0K;
    public final String A0L;

    public final void E1X(boolean z) {
    }

    public final void EKt() {
        this.A0H = 0;
        this.A07 = -9223372036854775807L;
        this.A0D = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013a, code lost:
        if (r15.A0D == false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0226, code lost:
        throw new X.XQX((java.lang.String) null, (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AJP(X.C11389SRd r16) {
        /*
            r15 = this;
            X.TjN r0 = r15.A09
            X.C11366SPh.A00(r0)
        L_0x0005:
            r5 = r16
            int r2 = X.Pxe.A06(r5)
            if (r2 <= 0) goto L_0x022d
            int r0 = r15.A0H
            r3 = 86
            r10 = 1
            if (r0 == 0) goto L_0x0217
            r7 = 2
            r12 = 0
            if (r0 == r10) goto L_0x0168
            r8 = 3
            if (r0 == r7) goto L_0x013e
            int r0 = r15.A0F
            int r1 = r15.A0E
            int r2 = X.Pxh.A04(r0, r1, r2)
            X.ST7 r4 = r15.A0J
            byte[] r0 = r4.A03
            r5.A0R(r0, r1, r2)
            int r1 = r15.A0E
            int r1 = r1 + r2
            r15.A0E = r1
            int r0 = r15.A0F
            if (r1 != r0) goto L_0x0005
            r4.A09(r12)
            boolean r0 = r4.A0F()
            if (r0 != 0) goto L_0x0138
            r15.A0D = r10
            int r6 = r4.A06(r10)
            if (r6 != r10) goto L_0x0135
            int r0 = r4.A06(r10)
        L_0x0048:
            r15.A00 = r0
            r2 = 0
            if (r0 != 0) goto L_0x0221
            if (r6 != r10) goto L_0x005a
            int r0 = r4.A06(r7)
            int r0 = r0 + 1
            int r0 = r0 * 8
            r4.A06(r0)
        L_0x005a:
            boolean r0 = r4.A0F()
            if (r0 == 0) goto L_0x0221
            r0 = 6
            int r0 = r4.A06(r0)
            r15.A03 = r0
            r0 = 4
            int r1 = r4.A06(r0)
            int r0 = r4.A06(r8)
            if (r1 != 0) goto L_0x0221
            if (r0 != 0) goto L_0x0221
            r5 = 8
            if (r6 != 0) goto L_0x0109
            int r0 = r4.A02
            int r2 = r0 * 8
            int r0 = r4.A00
            int r2 = r2 + r0
            int r3 = r4.A04()
            X.RtO r1 = X.SMh.A01(r4, r10)
            java.lang.String r0 = r1.A02
            r15.A0A = r0
            int r0 = r1.A01
            r15.A04 = r0
            int r0 = r1.A00
            r15.A01 = r0
            int r0 = r4.A04()
            int r3 = r3 - r0
            r4.A09(r2)
            int r0 = r3 + 7
            int r0 = r0 / r5
            byte[] r2 = new byte[r0]
            r4.A0D(r2, r3)
            X.SOW r1 = X.SOW.A00()
            java.lang.String r0 = r15.A0B
            r1.A0T = r0
            java.lang.String r0 = "audio/mp4a-latm"
            r1.A01(r0)
            java.lang.String r0 = r15.A0A
            r1.A0R = r0
            int r0 = r15.A01
            r1.A04 = r0
            int r0 = r15.A04
            r1.A0G = r0
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r1.A0X = r0
            java.lang.String r0 = r15.A0L
            r1.A0V = r0
            int r0 = r15.A0I
            r1.A0E = r0
            X.SJM r9 = X.Pxe.A0O(r1)
            X.SJM r0 = r15.A08
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00e6
            r15.A08 = r9
            r0 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r2 = r9.A0I
            long r2 = (long) r2
            long r0 = r0 / r2
            r15.A06 = r0
            X.TjN r0 = r15.A09
            r0.AWO(r9)
        L_0x00e6:
            int r2 = r4.A06(r8)
            r15.A02 = r2
            if (r2 == 0) goto L_0x017b
            r1 = 9
            if (r2 == r10) goto L_0x017d
            r1 = 6
            if (r2 == r8) goto L_0x017d
            r0 = 4
            if (r2 == r0) goto L_0x017d
            r0 = 5
            if (r2 == r0) goto L_0x017d
            if (r2 == r1) goto L_0x0105
            r0 = 7
            if (r2 == r0) goto L_0x0105
            java.lang.IllegalStateException r0 = X.Pxe.A0i()
            throw r0
        L_0x0105:
            r4.A0A(r10)
            goto L_0x0180
        L_0x0109:
            int r0 = r4.A06(r7)
            int r0 = r0 + 1
            int r0 = r0 * 8
            int r0 = r4.A06(r0)
            long r0 = (long) r0
            int r2 = (int) r0
            int r3 = r4.A04()
            X.RtO r1 = X.SMh.A01(r4, r10)
            java.lang.String r0 = r1.A02
            r15.A0A = r0
            int r0 = r1.A01
            r15.A04 = r0
            int r0 = r1.A00
            r15.A01 = r0
            int r0 = r4.A04()
            int r3 = r3 - r0
            int r2 = r2 - r3
            r4.A0A(r2)
            goto L_0x00e6
        L_0x0135:
            r0 = 0
            goto L_0x0048
        L_0x0138:
            boolean r0 = r15.A0D
            if (r0 != 0) goto L_0x01a2
            goto L_0x01f8
        L_0x013e:
            int r0 = r15.A0G
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r2 = r0 << 8
            int r0 = r5.A05()
            r2 = r2 | r0
            r15.A0F = r2
            X.SRd r1 = r15.A0K
            byte[] r0 = r1.A02
            int r0 = r0.length
            if (r2 <= r0) goto L_0x0162
            r1.A0M(r2)
            X.ST7 r2 = r15.A0J
            byte[] r1 = r1.A02
            int r0 = r1.length
            r2.A03 = r1
            r2.A02 = r12
            r2.A00 = r12
            r2.A01 = r0
        L_0x0162:
            r15.A0E = r12
            r15.A0H = r8
            goto L_0x0005
        L_0x0168:
            int r2 = r5.A05()
            r1 = r2 & 224(0xe0, float:3.14E-43)
            r0 = 224(0xe0, float:3.14E-43)
            if (r1 != r0) goto L_0x0178
            r15.A0G = r2
            r15.A0H = r7
            goto L_0x0005
        L_0x0178:
            if (r2 == r3) goto L_0x0005
            goto L_0x01f8
        L_0x017b:
            r1 = 8
        L_0x017d:
            r4.A0A(r1)
        L_0x0180:
            boolean r8 = r4.A0F()
            r15.A0C = r8
            r0 = 0
            r15.A05 = r0
            r2 = 0
            if (r8 == 0) goto L_0x019f
            if (r6 != r10) goto L_0x0207
            int r0 = r4.A06(r7)
            int r0 = r0 + 1
            int r0 = r0 * 8
            int r0 = r4.A06(r0)
            long r0 = (long) r0
            r15.A05 = r0
        L_0x019f:
            X.ST7.A02(r4, r5)
        L_0x01a2:
            int r0 = r15.A00
            r9 = 0
            if (r0 != 0) goto L_0x0227
            int r0 = r15.A03
            if (r0 != 0) goto L_0x0227
            int r0 = r15.A02
            if (r0 != 0) goto L_0x0227
            r11 = 0
        L_0x01b0:
            r0 = 8
            int r1 = r4.A06(r0)
            int r11 = r11 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L_0x01b0
            int r0 = r4.A02
            int r1 = r0 * 8
            int r0 = r4.A00
            int r1 = r1 + r0
            r0 = r1 & 7
            r3 = 0
            X.SRd r2 = r15.A0K
            if (r0 != 0) goto L_0x01fc
            int r0 = r1 >> 3
            r2.A0O(r0)
        L_0x01ce:
            X.TjN r0 = r15.A09
            r0.EJf(r2, r11)
            long r13 = r15.A07
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01df
            r3 = 1
        L_0x01df:
            X.C11366SPh.A02(r3)
            X.TjN r8 = r15.A09
            r8.EJm(r9, r10, r11, r12, r13)
            long r2 = r15.A07
            long r0 = r15.A06
            long r2 = r2 + r0
            r15.A07 = r2
            boolean r0 = r15.A0C
            if (r0 == 0) goto L_0x01f8
            long r1 = r15.A05
            int r0 = (int) r1
            r4.A0A(r0)
        L_0x01f8:
            r15.A0H = r12
            goto L_0x0005
        L_0x01fc:
            byte[] r1 = r2.A02
            int r0 = r11 * 8
            r4.A0D(r1, r0)
            r2.A0O(r12)
            goto L_0x01ce
        L_0x0207:
            boolean r6 = r4.A0F()
            long r2 = r2 << r5
            int r0 = r4.A06(r5)
            long r0 = (long) r0
            long r2 = r2 + r0
            r15.A05 = r2
            if (r6 != 0) goto L_0x0207
            goto L_0x019f
        L_0x0217:
            int r0 = r5.A05()
            if (r0 != r3) goto L_0x0005
            r15.A0H = r10
            goto L_0x0005
        L_0x0221:
            X.XQX r0 = new X.XQX
            r0.<init>(r2, r2, r10, r10)
            throw r0
        L_0x0227:
            X.XQX r0 = new X.XQX
            r0.<init>(r9, r9, r10, r10)
            throw r0
        L_0x022d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11740Sfb.AJP(X.SRd):void");
    }

    public C11740Sfb(String str, int i) {
        this.A0L = str;
        this.A0I = i;
        C11389SRd A0P = Pxe.A0P(1024);
        this.A0K = A0P;
        this.A0J = new ST7(A0P.A02);
    }

    public final void ANC(YBZ ybz, SR8 sr8) {
        sr8.A03();
        this.A09 = SR8.A00(ybz, sr8);
        SR8.A02(sr8);
        this.A0B = sr8.A01;
    }

    public final void E1Y(long j, int i) {
        this.A07 = j;
    }
}
