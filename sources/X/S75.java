package X;

public final class S75 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C10650Rvj A04;
    public S39 A05;
    public boolean A06;
    public final C11389SRd A07 = new C11389SRd();
    public final C13900TjN A08;
    public final C10855RzF A09 = new C10855RzF();
    public final C11389SRd A0A = new C11389SRd();
    public final C11389SRd A0B = Pxe.A0P(1);

    public final C10720Rwy A01() {
        if (this.A06) {
            C10855RzF rzF = this.A09;
            int i = rzF.A05.A02;
            C10720Rwy rwy = rzF.A06;
            if (!(rwy == null && (rwy = this.A05.A03.A0A[i]) == null) && rwy.A03) {
                return rwy;
            }
        }
        return null;
    }

    public final void A02() {
        C10855RzF rzF = this.A09;
        rzF.A01 = 0;
        rzF.A04 = 0;
        rzF.A08 = false;
        rzF.A07 = false;
        rzF.A09 = false;
        rzF.A06 = null;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = false;
    }

    public final boolean A03() {
        this.A01++;
        if (this.A06) {
            int i = this.A00 + 1;
            this.A00 = i;
            int[] iArr = this.A09.A0B;
            int i2 = this.A02;
            if (i != iArr[i2]) {
                return true;
            }
            this.A02 = i2 + 1;
            this.A00 = 0;
        }
        return false;
    }

    public S75(C13900TjN tjN, C10650Rvj rvj, S39 s39) {
        this.A08 = tjN;
        this.A05 = s39;
        this.A04 = rvj;
        this.A05 = s39;
        this.A04 = rvj;
        tjN.AWO(s39.A03.A07);
        A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r15 != 0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r11.A0E[r2] == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(int r14, int r15) {
        /*
            r13 = this;
            X.Rwy r0 = r13.A01()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r8 = r0.A00
            if (r8 == 0) goto L_0x0044
            X.RzF r0 = r13.A09
            X.SRd r5 = r0.A0G
        L_0x0010:
            X.RzF r11 = r13.A09
            int r2 = r13.A01
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x001f
            boolean[] r0 = r11.A0E
            boolean r0 = r0[r2]
            r12 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r12 = 0
        L_0x0020:
            r9 = 1
            if (r12 != 0) goto L_0x0026
            r4 = 0
            if (r15 == 0) goto L_0x0027
        L_0x0026:
            r4 = 1
        L_0x0027:
            X.SRd r3 = r13.A0B
            byte[] r2 = r3.A02
            r0 = 0
            if (r4 == 0) goto L_0x0030
            r0 = 128(0x80, float:1.794E-43)
        L_0x0030:
            r0 = r0 | r8
            byte r0 = (byte) r0
            r2[r1] = r0
            r3.A0O(r1)
            X.TjN r7 = r13.A08
            r7.EJg(r3, r9, r9)
            r7.EJg(r5, r8, r9)
            if (r4 != 0) goto L_0x004d
            int r0 = r8 + 1
            return r0
        L_0x0044:
            byte[] r0 = r0.A04
            X.SRd r5 = r13.A0A
            int r8 = r0.length
            r5.A0Q(r0, r8)
            goto L_0x0010
        L_0x004d:
            r4 = 6
            r6 = 3
            r5 = 2
            r10 = 8
            if (r12 != 0) goto L_0x007f
            X.SRd r3 = r13.A07
            r3.A0M(r10)
            byte[] r2 = r3.A02
            r2[r1] = r1
            r2[r9] = r9
            X.Pxg.A1B(r15, r2, r5, r6)
            r1 = 4
            int r0 = r14 >> 24
            X.Pxe.A1H(r0, r2, r1)
            r1 = 5
            int r0 = r14 >> 16
            X.Pxe.A1H(r0, r2, r1)
            int r0 = r14 >> 8
            X.Pxe.A1H(r0, r2, r4)
            r0 = 7
            X.Pxe.A1H(r14, r2, r0)
            r7.EJg(r3, r10, r9)
            int r0 = r8 + 1
            int r0 = r0 + 8
            return r0
        L_0x007f:
            X.SRd r11 = r11.A0G
            int r2 = r11.A08()
            r0 = -2
            r11.A0P(r0)
            int r0 = r2 * 6
            int r4 = r0 + 2
            if (r15 == 0) goto L_0x00a8
            X.SRd r3 = r13.A07
            r3.A0M(r4)
            byte[] r2 = r3.A02
            r11.A0R(r2, r1, r4)
            byte r0 = r2[r5]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r10
            byte r0 = r2[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            int r1 = r1 + r15
            X.Pxg.A1B(r1, r2, r5, r6)
            r11 = r3
        L_0x00a8:
            r7.EJg(r11, r4, r9)
            int r0 = r8 + 1
            int r0 = r0 + r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S75.A00(int, int):int");
    }
}
