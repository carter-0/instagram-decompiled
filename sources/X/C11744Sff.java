package X;

/* renamed from: X.Sff  reason: case insensitive filesystem */
public final class C11744Sff implements C22557YAo {
    public C13900TjN A00;
    public C11221SFv A01;
    public String A02;
    public boolean A03;
    public long A04 = -9223372036854775807L;
    public long A05;
    public final C11389SRd A06 = new C11389SRd();
    public final S6P A07 = new S6P(34);
    public final S6P A08 = new S6P(39);
    public final S6P A09 = new S6P(33);
    public final S6P A0A = new S6P(40);
    public final S6P A0B = new S6P(32);
    public final C10920S0x A0C;
    public final boolean[] A0D = new boolean[3];

    private void A00(byte[] bArr, int i, int i2) {
        C11221SFv sFv = this.A01;
        if (sFv.A07) {
            int i3 = sFv.A00;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                sFv.A06 = AnonymousClass7TF.A1P(bArr[i4] & 128);
                sFv.A07 = false;
            } else {
                sFv.A00 = i3 + (i2 - i);
            }
        }
        if (!this.A03) {
            this.A0B.A01(bArr, i, i2);
            this.A09.A01(bArr, i, i2);
            this.A07.A01(bArr, i, i2);
        }
        this.A08.A01(bArr, i, i2);
        this.A0A.A01(bArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01d3, code lost:
        if (r4 > 21) goto L_0x01a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AJP(X.C11389SRd r28) {
        /*
            r27 = this;
            r7 = r27
            X.TjN r0 = r7.A00
            X.C11366SPh.A00(r0)
        L_0x0007:
            r9 = r28
            int r6 = r9.A00
            int r5 = r9.A01
            int r4 = r6 - r5
            if (r4 <= 0) goto L_0x002c
            r8 = r5
            byte[] r12 = r9.A02
            long r2 = r7.A05
            long r0 = (long) r4
            long r2 = r2 + r0
            r7.A05 = r2
            X.TjN r0 = r7.A00
            r0.EJf(r9, r4)
        L_0x001f:
            if (r5 >= r6) goto L_0x0007
            boolean[] r0 = r7.A0D
            int r1 = X.SS3.A01(r12, r0, r5, r6)
            if (r1 != r6) goto L_0x002d
            r7.A00(r12, r5, r6)
        L_0x002c:
            return
        L_0x002d:
            int r5 = r1 + 3
            byte r0 = r12[r5]
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r4 = r0 >> 1
            int r9 = r1 - r8
            if (r9 <= 0) goto L_0x003c
            r7.A00(r12, r8, r1)
        L_0x003c:
            int r16 = r6 - r1
            long r2 = r7.A05
            r0 = r16
            long r0 = (long) r0
            long r2 = r2 - r0
            r8 = 0
            if (r9 >= 0) goto L_0x0048
            int r8 = -r9
        L_0x0048:
            long r0 = r7.A04
            r25 = r0
            X.SFv r11 = r7.A01
            boolean r1 = r7.A03
            boolean r0 = r11.A09
            if (r0 == 0) goto L_0x01d6
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x01d6
            boolean r0 = r11.A08
            r11.A0B = r0
            r0 = 0
            r11.A09 = r0
        L_0x005f:
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x0122
            X.S6P r1 = r7.A0B
            r1.A02(r8)
            X.S6P r11 = r7.A09
            r11.A02(r8)
            X.S6P r13 = r7.A07
            r13.A02(r8)
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0122
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x0122
            boolean r0 = r13.A01
            if (r0 == 0) goto L_0x0122
            X.TjN r0 = r7.A00
            r24 = r0
            java.lang.String r0 = r7.A02
            r23 = r0
            int r10 = r1.A00
            int r0 = r11.A00
            int r9 = r10 + r0
            int r0 = r13.A00
            int r9 = r9 + r0
            byte[] r9 = new byte[r9]
            byte[] r0 = r1.A03
            r14 = 0
            java.lang.System.arraycopy(r0, r14, r9, r14, r10)
            byte[] r15 = r11.A03
            int r10 = r1.A00
            int r0 = r11.A00
            java.lang.System.arraycopy(r15, r14, r9, r10, r0)
            byte[] r10 = r13.A03
            int r1 = r1.A00
            int r0 = r11.A00
            int r1 = r1 + r0
            int r0 = r13.A00
            java.lang.System.arraycopy(r10, r14, r9, r1, r0)
            byte[] r10 = r11.A03
            int r1 = r11.A00
            r0 = 5
            X.RzC r10 = X.SS3.A02(r10, r0, r1)
            int r15 = r10.A0A
            boolean r14 = r10.A0E
            int r13 = r10.A09
            int r11 = r10.A08
            int[] r1 = r10.A0F
            int r0 = r10.A07
            r20 = r11
            r21 = r0
            r22 = r14
            r17 = r1
            r18 = r15
            r19 = r13
            java.lang.String r11 = X.SCR.A00(r17, r18, r19, r20, r21, r22)
            X.SOW r1 = X.SOW.A00()
            r0 = r23
            r1.A0T = r0
            java.lang.String r0 = "video/hevc"
            r1.A01(r0)
            r1.A0R = r11
            int r0 = r10.A0D
            r1.A0L = r0
            int r0 = r10.A0B
            r1.A09 = r0
            X.S2u r11 = new X.S2u
            r11.<init>()
            int r0 = r10.A05
            r11.A02 = r0
            int r0 = r10.A04
            r11.A01 = r0
            int r0 = r10.A06
            r11.A03 = r0
            int r0 = r10.A02
            int r0 = r0 + 8
            r11.A04 = r0
            int r0 = r10.A01
            int r0 = r0 + 8
            r11.A00 = r0
            X.SRQ r0 = r11.A00()
            r1.A0N = r0
            float r0 = r10.A00
            r1.A01 = r0
            int r0 = r10.A0C
            r1.A0B = r0
            java.util.List r0 = java.util.Collections.singletonList(r9)
            r1.A0X = r0
            r0 = r24
            X.C13900TjN.A00(r1, r0)
            r0 = 1
            r7.A03 = r0
        L_0x0122:
            X.S6P r9 = r7.A08
            boolean r0 = r9.A02(r8)
            r13 = 5
            if (r0 == 0) goto L_0x0146
            byte[] r1 = r9.A03
            int r0 = r9.A00
            int r1 = X.SS3.A00(r1, r0)
            X.SRd r11 = r7.A06
            byte[] r0 = r9.A03
            r11.A0Q(r0, r1)
            r11.A0P(r13)
            X.S0x r0 = r7.A0C
            X.TjN[] r10 = r0.A00
            r0 = r25
            X.C11053S7y.A00(r11, r10, r0)
        L_0x0146:
            X.S6P r10 = r7.A0A
            boolean r0 = r10.A02(r8)
            if (r0 == 0) goto L_0x0169
            byte[] r1 = r10.A03
            int r0 = r10.A00
            int r1 = X.SS3.A00(r1, r0)
            X.SRd r11 = r7.A06
            byte[] r0 = r10.A03
            r11.A0Q(r0, r1)
            r11.A0P(r13)
            X.S0x r0 = r7.A0C
            X.TjN[] r8 = r0.A00
            r0 = r25
            X.C11053S7y.A00(r11, r8, r0)
        L_0x0169:
            long r0 = r7.A04
            X.SFv r11 = r7.A01
            boolean r13 = r7.A03
            r8 = 0
            r11.A06 = r8
            r11.A05 = r8
            r11.A02 = r0
            r11.A00 = r8
            r11.A01 = r2
            r0 = 32
            if (r4 < r0) goto L_0x01cc
            r0 = 40
            if (r4 == r0) goto L_0x01a4
            r1 = 1
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x0194
            boolean r0 = r11.A09
            if (r0 != 0) goto L_0x0194
            if (r13 == 0) goto L_0x0192
            r0 = r16
            X.C11221SFv.A00(r11, r0)
        L_0x0192:
            r11.A0A = r8
        L_0x0194:
            r0 = 35
            if (r4 <= r0) goto L_0x019c
            r0 = 39
            if (r4 != r0) goto L_0x01a4
        L_0x019c:
            boolean r0 = r11.A09
            r0 = r0 ^ 1
            r11.A05 = r0
            r11.A09 = r1
        L_0x01a4:
            r1 = 0
        L_0x01a5:
            r11.A08 = r1
            if (r1 != 0) goto L_0x01ad
            r0 = 9
            if (r4 > r0) goto L_0x01ae
        L_0x01ad:
            r8 = 1
        L_0x01ae:
            r11.A07 = r8
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x01c3
            X.S6P r0 = r7.A0B
            r0.A00(r4)
            X.S6P r0 = r7.A09
            r0.A00(r4)
            X.S6P r0 = r7.A07
            r0.A00(r4)
        L_0x01c3:
            r9.A00(r4)
            r10.A00(r4)
            r8 = r5
            goto L_0x001f
        L_0x01cc:
            r0 = 16
            if (r4 < r0) goto L_0x01a4
            r0 = 21
            r1 = 1
            if (r4 <= r0) goto L_0x01a5
            goto L_0x01a4
        L_0x01d6:
            boolean r0 = r11.A05
            if (r0 != 0) goto L_0x01de
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x005f
        L_0x01de:
            if (r1 == 0) goto L_0x01ee
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x01ee
            long r9 = r11.A01
            long r0 = r2 - r9
            int r9 = (int) r0
            int r0 = r16 + r9
            X.C11221SFv.A00(r11, r0)
        L_0x01ee:
            long r0 = r11.A01
            r11.A03 = r0
            long r0 = r11.A02
            r11.A04 = r0
            boolean r0 = r11.A08
            r11.A0B = r0
            r0 = 1
            r11.A0A = r0
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11744Sff.AJP(X.SRd):void");
    }

    public final void E1X(boolean z) {
        C11366SPh.A00(this.A00);
        if (z) {
            C11221SFv sFv = this.A01;
            long j = this.A05;
            sFv.A0B = sFv.A08;
            C11221SFv.A00(sFv, (int) (j - sFv.A01));
            sFv.A03 = sFv.A01;
            sFv.A01 = j;
            C11221SFv.A00(sFv, 0);
            sFv.A0A = false;
        }
    }

    public final void EKt() {
        this.A05 = 0;
        this.A04 = -9223372036854775807L;
        boolean[] zArr = this.A0D;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        S6P s6p = this.A0B;
        s6p.A02 = false;
        s6p.A01 = false;
        S6P s6p2 = this.A09;
        s6p2.A02 = false;
        s6p2.A01 = false;
        S6P s6p3 = this.A07;
        s6p3.A02 = false;
        s6p3.A01 = false;
        S6P s6p4 = this.A08;
        s6p4.A02 = false;
        s6p4.A01 = false;
        S6P s6p5 = this.A0A;
        s6p5.A02 = false;
        s6p5.A01 = false;
        C11221SFv sFv = this.A01;
        if (sFv != null) {
            sFv.A07 = false;
            sFv.A06 = false;
            sFv.A05 = false;
            sFv.A0A = false;
            sFv.A09 = false;
        }
    }

    public C11744Sff(C10920S0x s0x) {
        this.A0C = s0x;
    }

    public final void ANC(YBZ ybz, SR8 sr8) {
        this.A02 = SR8.A01(sr8);
        SR8.A02(sr8);
        C13900TjN FHV = ybz.FHV(sr8.A00, 2);
        this.A00 = FHV;
        this.A01 = new C11221SFv(FHV);
        this.A0C.A00(ybz, sr8);
    }

    public final void E1Y(long j, int i) {
        this.A04 = j;
    }
}
