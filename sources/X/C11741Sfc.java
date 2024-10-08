package X;

/* renamed from: X.Sfc  reason: case insensitive filesystem */
public final class C11741Sfc implements C22557YAo {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public SJM A04;
    public C13900TjN A05;
    public String A06;
    public boolean A07;
    public int A08;
    public final int A09;
    public final ST7 A0A;
    public final String A0B;
    public final C11389SRd A0C;

    public final void E1X(boolean z) {
    }

    public final void EKt() {
        this.A08 = 0;
        this.A00 = 0;
        this.A07 = false;
        this.A03 = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AJP(X.C11389SRd r25) {
        /*
            r24 = this;
            r2 = r24
            X.TjN r0 = r2.A05
            X.C11366SPh.A00(r0)
        L_0x0007:
            r7 = r25
            int r8 = r7.A00
            int r0 = r7.A01
            int r6 = r8 - r0
            if (r6 <= 0) goto L_0x02ec
            int r0 = r2.A08
            r3 = 2
            r22 = 0
            r4 = 1
            if (r0 == 0) goto L_0x02c1
            if (r0 == r4) goto L_0x0055
            int r1 = r2.A01
            int r0 = r2.A00
            int r1 = X.Pxh.A04(r1, r0, r6)
            X.TjN r0 = r2.A05
            r0.EJf(r7, r1)
            int r0 = r2.A00
            int r0 = r0 + r1
            r2.A00 = r0
            int r7 = r2.A01
            if (r0 != r7) goto L_0x0007
            long r0 = r2.A03
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x003d
            r4 = 0
        L_0x003d:
            X.C11366SPh.A02(r4)
            X.TjN r3 = r2.A05
            r5 = 1
            r4 = 0
            r6 = r7
            r7 = r22
            r8 = r0
            r3.EJm(r4, r5, r6, r7, r8)
            long r3 = r2.A03
            long r0 = r2.A02
            long r3 = r3 + r0
            r2.A03 = r3
            r2.A08 = r7
            goto L_0x0007
        L_0x0055:
            X.SRd r0 = r2.A0C
            r23 = r0
            byte[] r5 = r0.A02
            r21 = 128(0x80, float:1.794E-43)
            int r1 = r2.A00
            r0 = r21
            int r0 = X.Pxh.A04(r0, r1, r6)
            r7.A0R(r5, r1, r0)
            int r1 = r2.A00
            int r1 = r1 + r0
            r2.A00 = r1
            r0 = r21
            if (r1 != r0) goto L_0x0007
            X.ST7 r6 = r2.A0A
            r0 = r22
            r6.A09(r0)
            int r0 = r6.A02
            int r1 = r0 * 8
            int r0 = r6.A00
            int r1 = r1 + r0
            r0 = 40
            r6.A0A(r0)
            r14 = 5
            int r0 = r6.A06(r14)
            r13 = 10
            boolean r0 = X.C51970G9q.A1W(r0, r13)
            r6.A09(r1)
            r12 = -1
            r11 = 8
            r7 = 3
            if (r0 == 0) goto L_0x0276
            r8 = 16
            int r0 = X.ST7.A00(r6, r8, r3)
            if (r0 == 0) goto L_0x0273
            if (r0 == r4) goto L_0x0270
            if (r0 != r3) goto L_0x00a5
            r12 = 2
        L_0x00a5:
            r6.A0A(r7)
            r0 = 11
            int r0 = r6.A06(r0)
            int r0 = r0 + 1
            int r20 = r0 * 2
            int r19 = r6.A06(r3)
            r0 = r19
            if (r0 != r7) goto L_0x0262
            int[] r1 = X.SD6.A04
            int r0 = r6.A06(r3)
            r9 = r1[r0]
            r1 = 3
            r15 = 6
        L_0x00c4:
            int r0 = r15 * 256
            r18 = r0
            int r10 = r20 * r9
            int r0 = r15 * 32
            int r10 = r10 / r0
            int r0 = r6.A06(r7)
            boolean r17 = r6.A0F()
            int[] r5 = X.SD6.A02
            r5 = r5[r0]
            int r5 = r5 + r17
            r6.A0A(r13)
            X.ST7.A02(r6, r11)
            if (r0 != 0) goto L_0x00e9
            r6.A0A(r14)
            X.ST7.A02(r6, r11)
        L_0x00e9:
            if (r12 != r4) goto L_0x00ee
            X.ST7.A02(r6, r8)
        L_0x00ee:
            boolean r8 = r6.A0F()
            r13 = 4
            if (r8 == 0) goto L_0x0143
            if (r0 <= r3) goto L_0x00fa
            r6.A0A(r3)
        L_0x00fa:
            r8 = r0 & 1
            if (r8 == 0) goto L_0x025f
            if (r0 <= r3) goto L_0x025f
            r8 = 6
            r6.A0A(r8)
        L_0x0104:
            r16 = r0 & 4
            if (r16 == 0) goto L_0x010b
            r6.A0A(r8)
        L_0x010b:
            if (r17 == 0) goto L_0x0110
            X.ST7.A02(r6, r14)
        L_0x0110:
            if (r12 != 0) goto L_0x0143
            X.ST7.A02(r6, r8)
            if (r0 != 0) goto L_0x011a
            X.ST7.A02(r6, r8)
        L_0x011a:
            X.ST7.A02(r6, r8)
            int r8 = r6.A06(r3)
            if (r8 != r4) goto L_0x0207
            r6.A0A(r14)
        L_0x0126:
            if (r0 >= r3) goto L_0x0138
            boolean r16 = r6.A0F()
            r8 = 14
            if (r16 == 0) goto L_0x0133
            r6.A0A(r8)
        L_0x0133:
            if (r0 != 0) goto L_0x0138
            X.ST7.A02(r6, r8)
        L_0x0138:
            boolean r8 = r6.A0F()
            if (r8 == 0) goto L_0x0143
            if (r1 != 0) goto L_0x01fe
            r6.A0A(r14)
        L_0x0143:
            boolean r8 = r6.A0F()
            if (r8 == 0) goto L_0x0160
            r6.A0A(r14)
            if (r0 != r3) goto L_0x01f6
            r6.A0A(r13)
        L_0x0151:
            X.ST7.A02(r6, r11)
            if (r0 != 0) goto L_0x0159
            X.ST7.A02(r6, r11)
        L_0x0159:
            r0 = r19
            if (r0 >= r7) goto L_0x0160
            r6.A08()
        L_0x0160:
            if (r12 != 0) goto L_0x01e6
            if (r1 == r7) goto L_0x0167
            r6.A08()
        L_0x0167:
            r1 = 6
        L_0x0168:
            boolean r0 = r6.A0F()
            if (r0 == 0) goto L_0x01e3
            int r0 = r6.A06(r1)
            if (r0 != r4) goto L_0x01e3
            int r0 = r6.A06(r11)
            if (r0 != r4) goto L_0x01e3
            java.lang.String r8 = "audio/eac3-joc"
        L_0x017c:
            X.SJM r1 = r2.A04
            if (r1 == 0) goto L_0x0190
            int r0 = r1.A06
            if (r5 != r0) goto L_0x0190
            int r0 = r1.A0I
            if (r9 != r0) goto L_0x0190
            java.lang.String r0 = r1.A0Y
            boolean r0 = androidx.media3.common.util.Util.A0E(r8, r0)
            if (r0 != 0) goto L_0x01be
        L_0x0190:
            X.SOW r1 = X.SOW.A00()
            java.lang.String r0 = r2.A06
            r1.A0T = r0
            r1.A01(r8)
            r1.A04 = r5
            r1.A0G = r9
            java.lang.String r0 = r2.A0B
            r1.A0V = r0
            int r0 = r2.A09
            r1.A0E = r0
            r1.A0D = r10
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01b3
            r1.A03 = r10
        L_0x01b3:
            X.SJM r1 = X.Pxe.A0O(r1)
            r2.A04 = r1
            X.TjN r0 = r2.A05
            r0.AWO(r1)
        L_0x01be:
            r0 = r20
            r2.A01 = r0
            r6 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r18
            long r4 = (long) r0
            long r4 = r4 * r6
            X.SJM r0 = r2.A04
            int r0 = r0.A0I
            long r0 = (long) r0
            long r4 = r4 / r0
            r2.A02 = r4
            r1 = r23
            r0 = r22
            r1.A0O(r0)
            X.TjN r4 = r2.A05
            r0 = r21
            r4.EJf(r1, r0)
            r2.A08 = r3
            goto L_0x0007
        L_0x01e3:
            java.lang.String r8 = "audio/eac3"
            goto L_0x017c
        L_0x01e6:
            if (r12 != r3) goto L_0x0167
            if (r1 == r7) goto L_0x01f0
            boolean r0 = r6.A0F()
            if (r0 == 0) goto L_0x0167
        L_0x01f0:
            r1 = 6
            r6.A0A(r1)
            goto L_0x0168
        L_0x01f6:
            r8 = 6
            if (r0 < r8) goto L_0x0151
            r6.A0A(r3)
            goto L_0x0151
        L_0x01fe:
            r8 = 0
        L_0x01ff:
            if (r8 >= r15) goto L_0x0143
            X.ST7.A02(r6, r14)
            int r8 = r8 + 1
            goto L_0x01ff
        L_0x0207:
            if (r8 != r3) goto L_0x0210
            r8 = 12
            r6.A0A(r8)
            goto L_0x0126
        L_0x0210:
            if (r8 != r7) goto L_0x0126
            int r16 = r6.A06(r14)
            boolean r8 = r6.A0F()
            if (r8 == 0) goto L_0x0240
            r6.A0A(r14)
            X.ST7.A02(r6, r13)
            X.ST7.A02(r6, r13)
            X.ST7.A02(r6, r13)
            X.ST7.A02(r6, r13)
            X.ST7.A02(r6, r13)
            X.ST7.A02(r6, r13)
            X.ST7.A02(r6, r13)
            boolean r8 = r6.A0F()
            if (r8 == 0) goto L_0x0240
            X.ST7.A02(r6, r13)
            X.ST7.A02(r6, r13)
        L_0x0240:
            boolean r8 = r6.A0F()
            if (r8 == 0) goto L_0x0253
            boolean r8 = X.ST7.A03(r6, r14)
            if (r8 == 0) goto L_0x0253
            r8 = 7
            r6.A0A(r8)
            X.ST7.A02(r6, r11)
        L_0x0253:
            int r8 = r16 + 2
            int r8 = r8 * 8
            r6.A0A(r8)
            r6.A07()
            goto L_0x0126
        L_0x025f:
            r8 = 6
            goto L_0x0104
        L_0x0262:
            int r1 = r6.A06(r3)
            int[] r0 = X.SD6.A01
            r15 = r0[r1]
            int[] r0 = X.SD6.A03
            r9 = r0[r19]
            goto L_0x00c4
        L_0x0270:
            r12 = 1
            goto L_0x00a5
        L_0x0273:
            r12 = 0
            goto L_0x00a5
        L_0x0276:
            r0 = 32
            int r9 = X.ST7.A00(r6, r0, r3)
            if (r9 != r7) goto L_0x02be
            r8 = 0
        L_0x027f:
            r0 = 6
            int r5 = r6.A06(r0)
            int[] r1 = X.SD6.A00
            int r0 = r5 / 2
            r0 = r1[r0]
            int r10 = r0 * 1000
            int r20 = X.SD6.A00(r9, r5)
            int r5 = X.ST7.A00(r6, r11, r7)
            r0 = r5 & 1
            if (r0 == 0) goto L_0x029d
            if (r5 == r4) goto L_0x02a9
            r6.A0A(r3)
        L_0x029d:
            r0 = r5 & 4
            if (r0 == 0) goto L_0x02a4
            r6.A0A(r3)
        L_0x02a4:
            if (r5 != r3) goto L_0x02a9
            r6.A0A(r3)
        L_0x02a9:
            int[] r0 = X.SD6.A03
            if (r9 >= r7) goto L_0x02bc
            r9 = r0[r9]
        L_0x02af:
            boolean r1 = r6.A0F()
            int[] r0 = X.SD6.A02
            r5 = r0[r5]
            int r5 = r5 + r1
            r18 = 1536(0x600, float:2.152E-42)
            goto L_0x017c
        L_0x02bc:
            r9 = -1
            goto L_0x02af
        L_0x02be:
            java.lang.String r8 = "audio/ac3"
            goto L_0x027f
        L_0x02c1:
            int r0 = r7.A01
            int r0 = r8 - r0
            r6 = 0
            if (r0 <= 0) goto L_0x0007
            boolean r1 = r2.A07
            r5 = 11
            int r0 = r7.A05()
            if (r1 == 0) goto L_0x02e6
            r1 = 119(0x77, float:1.67E-43)
            if (r0 != r1) goto L_0x02e6
            r2.A07 = r6
            r2.A08 = r4
            X.SRd r0 = r2.A0C
            byte[] r0 = r0.A02
            r0[r22] = r5
            r0[r4] = r1
            r2.A00 = r3
            goto L_0x0007
        L_0x02e6:
            if (r0 != r5) goto L_0x02e9
            r6 = 1
        L_0x02e9:
            r2.A07 = r6
            goto L_0x02c1
        L_0x02ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11741Sfc.AJP(X.SRd):void");
    }

    public C11741Sfc(String str, int i) {
        ST7 st7 = new ST7(new byte[128]);
        this.A0A = st7;
        this.A0C = new C11389SRd(st7.A03);
        this.A08 = 0;
        this.A03 = -9223372036854775807L;
        this.A0B = str;
        this.A09 = i;
    }

    public final void ANC(YBZ ybz, SR8 sr8) {
        this.A06 = SR8.A01(sr8);
        this.A05 = SR8.A00(ybz, sr8);
    }

    public final void E1Y(long j, int i) {
        this.A03 = j;
    }

    public C11741Sfc() {
        this((String) null, 0);
    }
}
