package X;

/* renamed from: X.Sfj  reason: case insensitive filesystem */
public final class C11748Sfj implements C22557YAo {
    public static final double[] A0G = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C13900TjN A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C11389SRd A0B;
    public final S2Y A0C;
    public final S6P A0D;
    public final S46 A0E;
    public final boolean[] A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01df, code lost:
        if (r5 >= 0) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AJP(X.C11389SRd r25) {
        /*
            r24 = this;
            r9 = r24
            X.TjN r5 = r9.A05
            X.C11366SPh.A00(r5)
            r23 = r25
            r0 = r23
            int r8 = r0.A01
            r20 = r8
            int r7 = r0.A00
            byte[] r15 = r0.A02
            long r2 = r9.A04
            int r4 = r7 - r8
            long r0 = (long) r4
            long r2 = r2 + r0
            r9.A04 = r2
            r0 = r23
            r5.EJf(r0, r4)
        L_0x0020:
            boolean[] r0 = r9.A0F
            int r4 = X.SS3.A01(r15, r0, r8, r7)
            if (r4 != r7) goto L_0x0039
            boolean r0 = r9.A07
            if (r0 != 0) goto L_0x0031
            X.S2Y r0 = r9.A0C
            r0.A00(r15, r8, r7)
        L_0x0031:
            X.S6P r0 = r9.A0D
            if (r0 == 0) goto L_0x0038
            r0.A01(r15, r8, r7)
        L_0x0038:
            return
        L_0x0039:
            r0 = r23
            byte[] r0 = r0.A02
            int r8 = r4 + 3
            byte r0 = r0[r8]
            r6 = r0 & 255(0xff, float:3.57E-43)
            int r5 = r4 - r20
            boolean r0 = r9.A07
            r14 = 0
            r13 = 1
            if (r0 != 0) goto L_0x0070
            if (r5 <= 0) goto L_0x01de
            X.S2Y r1 = r9.A0C
            r0 = r20
            r1.A00(r15, r0, r4)
        L_0x0054:
            r3 = 0
        L_0x0055:
            X.S2Y r1 = r9.A0C
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x01d6
            int r2 = r1.A00
            int r2 = r2 - r3
            r1.A00 = r2
            int r0 = r1.A01
            if (r0 != 0) goto L_0x011e
            r0 = 181(0xb5, float:2.54E-43)
            if (r6 != r0) goto L_0x011e
            r1.A01 = r2
        L_0x006a:
            byte[] r2 = X.S2Y.A04
            r0 = 3
            r1.A00(r2, r14, r0)
        L_0x0070:
            X.S6P r2 = r9.A0D
            if (r2 == 0) goto L_0x00af
            if (r5 <= 0) goto L_0x00ad
            r0 = r20
            r2.A01(r15, r0, r4)
            r0 = 0
        L_0x007c:
            boolean r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x0098
            byte[] r1 = r2.A03
            int r0 = r2.A00
            int r1 = X.SS3.A00(r1, r0)
            X.SRd r5 = r9.A0B
            byte[] r0 = r2.A03
            r5.A0Q(r0, r1)
            X.S46 r3 = r9.A0E
            long r0 = r9.A03
            r3.A00(r5, r0)
        L_0x0098:
            r0 = 178(0xb2, float:2.5E-43)
            if (r6 != r0) goto L_0x00af
            r0 = r23
            byte[] r1 = r0.A02
            int r0 = r4 + 2
            byte r0 = r1[r0]
            if (r0 != r13) goto L_0x00a9
            r2.A00(r6)
        L_0x00a9:
            r20 = r8
            goto L_0x0020
        L_0x00ad:
            int r0 = -r5
            goto L_0x007c
        L_0x00af:
            if (r6 == 0) goto L_0x00bc
            r0 = 179(0xb3, float:2.51E-43)
            if (r6 == r0) goto L_0x00bc
            r0 = 184(0xb8, float:2.58E-43)
            if (r6 != r0) goto L_0x00a9
            r9.A09 = r13
            goto L_0x00a9
        L_0x00bc:
            int r12 = r7 - r4
            boolean r0 = r9.A08
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x00ed
            long r10 = r9.A03
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r9.A09
            r16 = r0
            long r0 = r9.A04
            long r2 = r9.A02
            long r0 = r0 - r2
            int r2 = (int) r0
            int r2 = r2 - r12
            X.TjN r0 = r9.A05
            r17 = 0
            r18 = r16
            r19 = r2
            r20 = r12
            r21 = r10
            r16 = r0
            r16.EJm(r17, r18, r19, r20, r21)
        L_0x00ed:
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0112
        L_0x00f5:
            long r2 = r9.A04
            long r0 = (long) r12
            long r2 = r2 - r0
            r9.A02 = r2
            long r2 = r9.A01
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x010a
            long r2 = r9.A03
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0118
            long r0 = r9.A00
            long r2 = r2 + r0
        L_0x010a:
            r9.A03 = r2
            r9.A09 = r14
            r9.A01 = r4
            r9.A0A = r13
        L_0x0112:
            if (r6 != 0) goto L_0x0115
            r14 = 1
        L_0x0115:
            r9.A08 = r14
            goto L_0x00a9
        L_0x0118:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x010a
        L_0x011e:
            r1.A02 = r14
            java.lang.String r10 = r9.A06
            r10.getClass()
            byte[] r2 = r1.A03
            int r0 = r1.A00
            byte[] r19 = java.util.Arrays.copyOf(r2, r0)
            r12 = 4
            byte r0 = r19[r12]
            r3 = r0 & 255(0xff, float:3.57E-43)
            r18 = 5
            byte r0 = r19[r18]
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = 6
            byte r0 = r19[r0]
            r11 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r12
            int r0 = r2 >> 4
            r3 = r3 | r0
            r0 = r2 & 15
            int r2 = r0 << 8
            r2 = r2 | r11
            r16 = 7
            byte r0 = r19[r16]
            r11 = r0 & 240(0xf0, float:3.36E-43)
            int r11 = r11 >> r12
            r0 = 2
            if (r11 == r0) goto L_0x01c8
            r0 = 3
            if (r11 == r0) goto L_0x01c2
            if (r11 == r12) goto L_0x01ce
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x0157:
            X.SOW r12 = X.SOW.A00()
            r12.A0T = r10
            java.lang.String r0 = "video/mpeg2"
            r12.A01(r0)
            r12.A0L = r3
            r12.A09 = r2
            r12.A01 = r11
            java.util.List r0 = java.util.Collections.singletonList(r19)
            r12.A0X = r0
            X.SJM r10 = X.Pxe.A0O(r12)
            r2 = 0
            byte r0 = r19[r16]
            r0 = r0 & 15
            int r12 = r0 + -1
            if (r12 < 0) goto L_0x01a5
            double[] r11 = A0G
            r0 = 8
            if (r12 >= r0) goto L_0x01a5
            r16 = r11[r12]
            int r0 = r1.A01
            int r0 = r0 + 9
            byte r1 = r19[r0]
            r0 = r1 & 96
            int r0 = r0 >> r18
            r11 = r1 & 31
            if (r0 == r11) goto L_0x019d
            double r2 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 + r0
            int r0 = r11 + 1
            double r0 = (double) r0
            double r2 = r2 / r0
            double r16 = r16 * r2
        L_0x019d:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r16
            long r2 = (long) r0
        L_0x01a5:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r2 = android.util.Pair.create(r10, r0)
            X.TjN r1 = r9.A05
            java.lang.Object r0 = r2.first
            X.SJM r0 = (X.SJM) r0
            r1.AWO(r0)
            java.lang.Object r0 = r2.second
            long r0 = X.AnonymousClass7TE.A0R(r0)
            r9.A00 = r0
            r9.A07 = r13
            goto L_0x0070
        L_0x01c2:
            int r0 = r2 * 16
            float r11 = (float) r0
            int r0 = r3 * 9
            goto L_0x01d3
        L_0x01c8:
            int r0 = r2 * 4
            float r11 = (float) r0
            int r0 = r3 * 3
            goto L_0x01d3
        L_0x01ce:
            int r0 = r2 * 121
            float r11 = (float) r0
            int r0 = r3 * 100
        L_0x01d3:
            float r0 = (float) r0
            float r11 = r11 / r0
            goto L_0x0157
        L_0x01d6:
            r0 = 179(0xb3, float:2.51E-43)
            if (r6 != r0) goto L_0x006a
            r1.A02 = r13
            goto L_0x006a
        L_0x01de:
            int r3 = -r5
            if (r5 < 0) goto L_0x0055
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11748Sfj.AJP(X.SRd):void");
    }

    public final void E1X(boolean z) {
        C13900TjN tjN = this.A05;
        C11366SPh.A00(tjN);
        if (z) {
            boolean z2 = this.A09;
            long j = this.A03;
            tjN.EJm((S4h) null, z2 ? 1 : 0, (int) (this.A04 - this.A02), 0, j);
        }
    }

    public final void EKt() {
        boolean[] zArr = this.A0F;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        S2Y s2y = this.A0C;
        s2y.A02 = false;
        s2y.A00 = 0;
        s2y.A01 = 0;
        S6P s6p = this.A0D;
        if (s6p != null) {
            s6p.A02 = false;
            s6p.A01 = false;
        }
        this.A04 = 0;
        this.A0A = false;
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.S2Y] */
    public C11748Sfj(S46 s46) {
        C11389SRd sRd;
        this.A0E = s46;
        this.A0F = new boolean[4];
        ? obj = new Object();
        obj.A03 = new byte[128];
        this.A0C = obj;
        if (s46 != null) {
            this.A0D = new S6P(178);
            sRd = new C11389SRd();
        } else {
            sRd = null;
            this.A0D = null;
        }
        this.A0B = sRd;
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    public final void ANC(YBZ ybz, SR8 sr8) {
        this.A06 = SR8.A01(sr8);
        SR8.A02(sr8);
        this.A05 = ybz.FHV(sr8.A00, 2);
        S46 s46 = this.A0E;
        if (s46 != null) {
            s46.A01(ybz, sr8);
        }
    }

    public final void E1Y(long j, int i) {
        this.A01 = j;
    }

    public C11748Sfj() {
        this((S46) null);
    }
}
