package X;

/* renamed from: X.Sfh  reason: case insensitive filesystem */
public final class C11746Sfh implements C22557YAo {
    public static final float[] A0B = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public long A00;
    public long A01;
    public C13900TjN A02;
    public C11003S4x A03;
    public String A04;
    public boolean A05;
    public final C11389SRd A06;
    public final C10960S2s A07;
    public final S6P A08;
    public final S46 A09;
    public final boolean[] A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b8, code lost:
        if (r8 == 179) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0202, code lost:
        if (r8 != 181) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021e, code lost:
        if (r9 >= 0) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AJP(X.C11389SRd r24) {
        /*
            r23 = this;
            r5 = r23
            X.S4x r0 = r5.A03
            X.C11366SPh.A00(r0)
            X.TjN r9 = r5.A02
            X.C11366SPh.A00(r9)
            r22 = r24
            r0 = r22
            int r7 = r0.A01
            r19 = r7
            int r6 = r0.A00
            byte[] r4 = r0.A02
            long r2 = r5.A01
            int r8 = r6 - r7
            long r0 = (long) r8
            long r2 = r2 + r0
            r5.A01 = r2
            r0 = r22
            r9.EJf(r0, r8)
        L_0x0025:
            boolean[] r0 = r5.A0A
            int r2 = X.SS3.A01(r4, r0, r7, r6)
            if (r2 != r6) goto L_0x0043
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x0036
            X.S2s r0 = r5.A07
            r0.A00(r4, r7, r6)
        L_0x0036:
            X.S4x r0 = r5.A03
            r0.A01(r4, r7, r6)
            X.S6P r0 = r5.A08
            if (r0 == 0) goto L_0x0042
            r0.A01(r4, r7, r6)
        L_0x0042:
            return
        L_0x0043:
            r0 = r22
            byte[] r0 = r0.A02
            int r7 = r2 + 3
            byte r0 = r0[r7]
            r8 = r0 & 255(0xff, float:3.57E-43)
            int r9 = r2 - r19
            boolean r0 = r5.A05
            r3 = 1
            r1 = 0
            if (r0 != 0) goto L_0x015d
            if (r9 <= 0) goto L_0x021d
            X.S2s r10 = r5.A07
            r0 = r19
            r10.A00(r4, r0, r2)
        L_0x005e:
            r13 = 0
        L_0x005f:
            X.S2s r10 = r5.A07
            int r0 = r10.A01
            if (r0 == 0) goto L_0x01eb
            r15 = 181(0xb5, float:2.54E-43)
            r14 = 2
            java.lang.String r16 = "Unexpected start code value"
            java.lang.String r11 = "H263Reader"
            if (r0 == r3) goto L_0x0202
            r12 = 3
            if (r0 == r14) goto L_0x01f4
            r14 = 4
            if (r0 == r12) goto L_0x0210
            r0 = 179(0xb3, float:2.51E-43)
            if (r8 == r0) goto L_0x007a
            if (r8 != r15) goto L_0x01fa
        L_0x007a:
            int r0 = r10.A00
            int r0 = r0 - r13
            r10.A00 = r0
            r10.A03 = r1
            X.TjN r0 = r5.A02
            r21 = r0
            int r13 = r10.A02
            java.lang.String r0 = r5.A04
            r20 = r0
            r20.getClass()
            byte[] r15 = r10.A04
            int r0 = r10.A00
            byte[] r18 = java.util.Arrays.copyOf(r15, r0)
            X.ST7 r10 = new X.ST7
            r0 = r18
            r10.<init>(r0)
            r10.A0B(r13)
            r10.A0B(r14)
            r10.A08()
            r0 = 8
            boolean r13 = X.ST7.A03(r10, r0)
            if (r13 == 0) goto L_0x00b4
            r10.A0A(r14)
            r10.A0A(r12)
        L_0x00b4:
            int r15 = r10.A06(r14)
            r13 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r17 = "Invalid aspect ratio"
            r14 = 15
            if (r15 != r14) goto L_0x01db
            int r16 = r10.A06(r0)
            int r15 = r10.A06(r0)
            if (r15 == 0) goto L_0x01e4
            r0 = r16
            float r13 = (float) r0
            float r0 = (float) r15
            float r13 = r13 / r0
        L_0x00cf:
            boolean r0 = r10.A0F()
            r15 = 2
            if (r0 == 0) goto L_0x0102
            r10.A0A(r15)
            boolean r0 = X.ST7.A03(r10, r3)
            if (r0 == 0) goto L_0x0102
            r10.A0A(r14)
            r10.A08()
            r10.A0A(r14)
            r10.A08()
            r10.A0A(r14)
            r10.A08()
            r10.A0A(r12)
            r0 = 11
            r10.A0A(r0)
            r10.A08()
            r10.A0A(r14)
            r10.A08()
        L_0x0102:
            int r0 = r10.A06(r15)
            if (r0 == 0) goto L_0x010d
            java.lang.String r0 = "Unhandled video object layer shape"
            X.STH.A03(r11, r0)
        L_0x010d:
            r10.A08()
            r0 = 16
            int r12 = r10.A06(r0)
            r10.A08()
            boolean r0 = r10.A0F()
            if (r0 == 0) goto L_0x0126
            if (r12 != 0) goto L_0x01cc
            java.lang.String r0 = "Invalid vop_increment_time_resolution"
            X.STH.A03(r11, r0)
        L_0x0126:
            r10.A08()
            r0 = 13
            int r12 = r10.A06(r0)
            r10.A08()
            int r11 = r10.A06(r0)
            r10.A08()
            r10.A08()
            X.SOW r10 = X.SOW.A00()
            r0 = r20
            r10.A0T = r0
            java.lang.String r0 = "video/mp4v-es"
            r10.A01(r0)
            r10.A0L = r12
            r10.A09 = r11
            r10.A01 = r13
            java.util.List r0 = java.util.Collections.singletonList(r18)
            r10.A0X = r0
            r0 = r21
            X.C13900TjN.A00(r10, r0)
            r5.A05 = r3
        L_0x015d:
            X.S4x r10 = r5.A03
            r0 = r19
            r10.A01(r4, r0, r2)
            X.S6P r10 = r5.A08
            if (r10 == 0) goto L_0x019a
            if (r9 <= 0) goto L_0x01ca
            r10.A01(r4, r0, r2)
        L_0x016d:
            boolean r0 = r10.A02(r1)
            if (r0 == 0) goto L_0x0189
            byte[] r1 = r10.A03
            int r0 = r10.A00
            int r1 = X.SS3.A00(r1, r0)
            X.SRd r11 = r5.A06
            byte[] r0 = r10.A03
            r11.A0Q(r0, r1)
            X.S46 r9 = r5.A09
            long r0 = r5.A00
            r9.A00(r11, r0)
        L_0x0189:
            r0 = 178(0xb2, float:2.5E-43)
            if (r8 != r0) goto L_0x019a
            r0 = r22
            byte[] r1 = r0.A02
            int r0 = r2 + 2
            byte r0 = r1[r0]
            if (r0 != r3) goto L_0x019a
            r10.A00(r8)
        L_0x019a:
            int r9 = r6 - r2
            long r2 = r5.A01
            long r0 = (long) r9
            long r2 = r2 - r0
            X.S4x r1 = r5.A03
            boolean r0 = r5.A05
            r1.A00(r2, r9, r0)
            X.S4x r12 = r5.A03
            long r0 = r5.A00
            r12.A00 = r8
            r11 = 0
            r12.A05 = r11
            r10 = 1
            r9 = 182(0xb6, float:2.55E-43)
            if (r8 == r9) goto L_0x01ba
            r3 = 179(0xb3, float:2.51E-43)
            r2 = 0
            if (r8 != r3) goto L_0x01bb
        L_0x01ba:
            r2 = 1
        L_0x01bb:
            r12.A04 = r2
            if (r8 == r9) goto L_0x01c0
            r10 = 0
        L_0x01c0:
            r12.A03 = r10
            r12.A01 = r11
            r12.A02 = r0
            r19 = r7
            goto L_0x0025
        L_0x01ca:
            int r1 = -r9
            goto L_0x016d
        L_0x01cc:
            int r11 = r12 + -1
            r0 = 0
        L_0x01cf:
            if (r11 <= 0) goto L_0x01d6
            int r0 = r0 + 1
            int r11 = r11 >> 1
            goto L_0x01cf
        L_0x01d6:
            r10.A0A(r0)
            goto L_0x0126
        L_0x01db:
            float[] r16 = A0B
            r0 = 7
            if (r15 >= r0) goto L_0x01e4
            r13 = r16[r15]
            goto L_0x00cf
        L_0x01e4:
            r0 = r17
            X.STH.A03(r11, r0)
            goto L_0x00cf
        L_0x01eb:
            r0 = 176(0xb0, float:2.47E-43)
            if (r8 != r0) goto L_0x01fa
            r10.A01 = r3
            r10.A03 = r3
            goto L_0x01fa
        L_0x01f4:
            r0 = 31
            if (r8 > r0) goto L_0x0204
            r10.A01 = r12
        L_0x01fa:
            byte[] r11 = X.C10960S2s.A05
            r0 = 3
            r10.A00(r11, r1, r0)
            goto L_0x015d
        L_0x0202:
            if (r8 == r15) goto L_0x021a
        L_0x0204:
            r0 = r16
            X.STH.A03(r11, r0)
            r10.A03 = r1
            r10.A00 = r1
            r10.A01 = r1
            goto L_0x01fa
        L_0x0210:
            r12 = r8 & 240(0xf0, float:3.36E-43)
            r0 = 32
            if (r12 != r0) goto L_0x0204
            int r0 = r10.A00
            r10.A02 = r0
        L_0x021a:
            r10.A01 = r14
            goto L_0x01fa
        L_0x021d:
            int r13 = -r9
            if (r9 < 0) goto L_0x005f
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11746Sfh.AJP(X.SRd):void");
    }

    public final void E1X(boolean z) {
        C11003S4x s4x = this.A03;
        C11366SPh.A00(s4x);
        if (z) {
            s4x.A00(this.A01, 0, this.A05);
            C11003S4x s4x2 = this.A03;
            s4x2.A04 = false;
            s4x2.A03 = false;
            s4x2.A05 = false;
            s4x2.A00 = -1;
        }
    }

    public final void EKt() {
        boolean[] zArr = this.A0A;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        C10960S2s s2s = this.A07;
        s2s.A03 = false;
        s2s.A00 = 0;
        s2s.A01 = 0;
        C11003S4x s4x = this.A03;
        if (s4x != null) {
            s4x.A04 = false;
            s4x.A03 = false;
            s4x.A05 = false;
            s4x.A00 = -1;
        }
        S6P s6p = this.A08;
        if (s6p != null) {
            s6p.A02 = false;
            s6p.A01 = false;
        }
        this.A01 = 0;
        this.A00 = -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.S2s, java.lang.Object] */
    public C11746Sfh(S46 s46) {
        C11389SRd sRd;
        this.A09 = s46;
        this.A0A = new boolean[4];
        ? obj = new Object();
        obj.A04 = new byte[128];
        this.A07 = obj;
        this.A00 = -9223372036854775807L;
        if (s46 != null) {
            this.A08 = new S6P(178);
            sRd = new C11389SRd();
        } else {
            sRd = null;
            this.A08 = null;
        }
        this.A06 = sRd;
    }

    public final void ANC(YBZ ybz, SR8 sr8) {
        this.A04 = SR8.A01(sr8);
        SR8.A02(sr8);
        C13900TjN FHV = ybz.FHV(sr8.A00, 2);
        this.A02 = FHV;
        this.A03 = new C11003S4x(FHV);
        S46 s46 = this.A09;
        if (s46 != null) {
            s46.A01(ybz, sr8);
        }
    }

    public final void E1Y(long j, int i) {
        this.A00 = j;
    }

    public C11746Sfh() {
        this((S46) null);
    }
}
