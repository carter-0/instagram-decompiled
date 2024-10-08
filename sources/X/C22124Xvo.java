package X;

/* renamed from: X.Xvo  reason: case insensitive filesystem */
public final class C22124Xvo implements YAN {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public C21505XdL A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final ST7 A09 = new ST7(new byte[10]);
    public final C22557YAo A0A;

    public final void EKt() {
        this.A03 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A0A.EKt();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0145 A[SYNTHETIC] */
    public final void AJQ(X.C11389SRd r13, int r14) {
        /*
            r12 = this;
            X.XdL r0 = r12.A04
            X.C11366SPh.A00(r0)
            r0 = r14 & 1
            r6 = -1
            r5 = 3
            r4 = 2
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0036
            int r0 = r12.A03
            if (r0 == 0) goto L_0x0032
            if (r0 == r2) goto L_0x0032
            java.lang.String r8 = "PesReader"
            if (r0 == r4) goto L_0x013e
            int r7 = r12.A02
            if (r7 == r6) goto L_0x0027
            java.lang.String r1 = "Unexpected start indicator: expected "
            java.lang.String r0 = " more bytes"
            java.lang.String r0 = X.002.A0c(r1, r0, r7)
            X.STH.A03(r8, r0)
        L_0x0027:
            int r0 = r13.A00
            boolean r1 = X.AnonymousClass7TF.A1Q(r0)
            X.YAo r0 = r12.A0A
            r0.E1X(r1)
        L_0x0032:
            r12.A03 = r2
        L_0x0034:
            r12.A00 = r3
        L_0x0036:
            int r7 = r13.A00
            int r1 = r13.A01
            int r7 = r7 - r1
            if (r7 <= 0) goto L_0x0145
            int r0 = r12.A03
            if (r0 == 0) goto L_0x0139
            if (r0 == r2) goto L_0x00cd
            if (r0 == r4) goto L_0x0064
            int r0 = r12.A02
            if (r0 == r6) goto L_0x0052
            int r0 = r7 - r0
            if (r0 <= 0) goto L_0x0052
            int r7 = r7 - r0
            int r1 = r1 + r7
            r13.A0N(r1)
        L_0x0052:
            X.YAo r1 = r12.A0A
            r1.AJP(r13)
            int r0 = r12.A02
            if (r0 == r6) goto L_0x0036
            int r0 = r0 - r7
            r12.A02 = r0
            if (r0 != 0) goto L_0x0036
            r1.E1X(r3)
            goto L_0x0032
        L_0x0064:
            r1 = 10
            int r0 = r12.A01
            int r1 = java.lang.Math.min(r1, r0)
            X.ST7 r7 = r12.A09
            byte[] r0 = r7.A03
            boolean r0 = r12.A00(r13, r0, r1)
            if (r0 == 0) goto L_0x0036
            r1 = 0
            int r0 = r12.A01
            boolean r0 = r12.A00(r13, r1, r0)
            if (r0 == 0) goto L_0x0036
            r7.A09(r3)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r8 = r12.A07
            if (r8 == 0) goto L_0x00bd
            r10 = 4
            int r0 = X.ST7.A00(r7, r10, r5)
            long r0 = (long) r0
            r11 = 30
            long r0 = r0 << r11
            r7.A0A(r2)
            long r8 = X.C21056XCh.A03(r7, r0)
            boolean r0 = r12.A08
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x00b7
            int r0 = X.ST7.A00(r7, r10, r5)
            long r0 = (long) r0
            long r0 = r0 << r11
            r7.A0A(r2)
            long r0 = X.C21056XCh.A03(r7, r0)
            X.XdL r7 = r12.A04
            r7.A02(r0)
            r12.A08 = r2
        L_0x00b7:
            X.XdL r0 = r12.A04
            long r0 = r0.A02(r8)
        L_0x00bd:
            boolean r8 = r12.A05
            r7 = 0
            if (r8 == 0) goto L_0x00c3
            r7 = 4
        L_0x00c3:
            r14 = r14 | r7
            X.YAo r7 = r12.A0A
            r7.E1Y(r0, r14)
            r12.A03 = r5
            goto L_0x0034
        L_0x00cd:
            X.ST7 r7 = r12.A09
            byte[] r1 = r7.A03
            r0 = 9
            boolean r0 = r12.A00(r13, r1, r0)
            if (r0 == 0) goto L_0x0036
            r7.A09(r3)
            r0 = 24
            int r1 = r7.A06(r0)
            java.lang.String r8 = "PesReader"
            if (r1 == r2) goto L_0x00f6
            java.lang.String r0 = "Unexpected start code prefix: "
            java.lang.String r0 = X.002.A0O(r0, r1)
            X.STH.A03(r8, r0)
            r12.A02 = r6
            r0 = 0
        L_0x00f2:
            r12.A03 = r0
            goto L_0x0034
        L_0x00f6:
            r1 = 8
            r7.A0A(r1)
            r0 = 16
            int r9 = r7.A06(r0)
            r0 = 5
            r7.A0A(r0)
            boolean r0 = r7.A0F()
            r12.A05 = r0
            r7.A0A(r4)
            boolean r0 = r7.A0F()
            r12.A07 = r0
            boolean r0 = r7.A0F()
            r12.A06 = r0
            r0 = 6
            int r7 = X.ST7.A00(r7, r0, r1)
            r12.A01 = r7
            if (r9 == 0) goto L_0x0135
            int r0 = r9 + 6
            int r1 = r0 + -9
            int r1 = r1 - r7
            r12.A02 = r1
            if (r1 >= 0) goto L_0x0137
            java.lang.String r0 = "Found negative packet payload size: "
            java.lang.String r0 = X.002.A0O(r0, r1)
            X.STH.A03(r8, r0)
        L_0x0135:
            r12.A02 = r6
        L_0x0137:
            r0 = 2
            goto L_0x00f2
        L_0x0139:
            r13.A0P(r7)
            goto L_0x0036
        L_0x013e:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            X.STH.A03(r8, r0)
            goto L_0x0032
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22124Xvo.AJQ(X.SRd, int):void");
    }

    public final void CMT(C21505XdL xdL, YBZ ybz, SR8 sr8) {
        this.A04 = xdL;
        this.A0A.ANC(ybz, sr8);
    }

    public C22124Xvo(C22557YAo yAo) {
        this.A0A = yAo;
    }

    private boolean A00(C11389SRd sRd, byte[] bArr, int i) {
        int A062 = Pxe.A06(sRd);
        int i2 = this.A00;
        int min = Math.min(A062, i - i2);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            sRd.A0P(min);
        } else {
            sRd.A0R(bArr, i2, min);
        }
        int i3 = this.A00 + min;
        this.A00 = i3;
        if (i3 != i) {
            return false;
        }
        return true;
    }
}
