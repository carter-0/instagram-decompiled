package X;

/* renamed from: X.Sfe  reason: case insensitive filesystem */
public final class C11743Sfe implements C22557YAo {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C13900TjN A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final C11389SRd A0A;
    public final S36 A0B;
    public final String A0C;

    public final void E1X(boolean z) {
    }

    public final void EKt() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00df, code lost:
        if ((r2 & 224) != 224) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AJP(X.C11389SRd r16) {
        /*
            r15 = this;
            X.TjN r0 = r15.A05
            X.C11366SPh.A00(r0)
        L_0x0005:
            r6 = r16
            int r8 = r6.A00
            int r7 = r6.A01
            int r3 = r8 - r7
            if (r3 <= 0) goto L_0x0102
            int r0 = r15.A02
            if (r0 == 0) goto L_0x00c6
            r10 = 1
            if (r0 == r10) goto L_0x004f
            int r1 = r15.A01
            int r0 = r15.A00
            int r1 = X.Pxh.A04(r1, r0, r3)
            X.TjN r0 = r15.A05
            r0.EJf(r6, r1)
            int r0 = r15.A00
            int r0 = r0 + r1
            r15.A00 = r0
            int r11 = r15.A01
            if (r0 < r11) goto L_0x0005
            long r13 = r15.A04
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            X.C11366SPh.A02(r0)
            X.TjN r8 = r15.A05
            r9 = 0
            r8.EJm(r9, r10, r11, r12, r13)
            long r2 = r15.A04
            long r0 = r15.A03
            long r2 = r2 + r0
            r15.A04 = r2
            r15.A00 = r12
        L_0x004c:
            r15.A02 = r12
            goto L_0x0005
        L_0x004f:
            int r2 = r15.A00
            r5 = 4
            int r0 = 4 - r2
            int r1 = java.lang.Math.min(r3, r0)
            X.SRd r4 = r15.A0A
            byte[] r0 = r4.A02
            r6.A0R(r0, r2, r1)
            int r0 = r15.A00
            int r0 = r0 + r1
            r15.A00 = r0
            if (r0 < r5) goto L_0x0005
            r6 = 0
            r4.A0O(r6)
            X.S36 r7 = r15.A0B
            int r0 = r4.A01()
            boolean r0 = r7.A00(r0)
            if (r0 != 0) goto L_0x007b
            r15.A00 = r6
            r15.A02 = r10
            goto L_0x0005
        L_0x007b:
            int r0 = r7.A02
            r15.A01 = r0
            boolean r0 = r15.A07
            if (r0 != 0) goto L_0x00bc
            r8 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = r7.A04
            long r2 = (long) r0
            long r2 = r2 * r8
            int r0 = r7.A03
            long r0 = (long) r0
            long r2 = r2 / r0
            r15.A03 = r2
            X.SOW r1 = X.SOW.A00()
            java.lang.String r0 = r15.A06
            r1.A0T = r0
            java.lang.String r0 = r7.A06
            r1.A01(r0)
            r0 = 4096(0x1000, float:5.74E-42)
            r1.A0A = r0
            int r0 = r7.A01
            r1.A04 = r0
            int r0 = r7.A03
            r1.A0G = r0
            java.lang.String r0 = r15.A0C
            r1.A0V = r0
            int r0 = r15.A09
            r1.A0E = r0
            X.SJM r1 = X.Pxe.A0O(r1)
            X.TjN r0 = r15.A05
            r0.AWO(r1)
            r15.A07 = r10
        L_0x00bc:
            r4.A0O(r6)
            X.TjN r0 = r15.A05
            r0.EJf(r4, r5)
            r12 = 2
            goto L_0x004c
        L_0x00c6:
            byte[] r5 = r6.A02
        L_0x00c8:
            if (r7 >= r8) goto L_0x00fd
            byte r2 = r5[r7]
            r1 = r2 & 255(0xff, float:3.57E-43)
            r0 = 255(0xff, float:3.57E-43)
            r4 = 0
            r12 = 1
            boolean r3 = X.AnonymousClass7TF.A1S(r1, r0)
            boolean r0 = r15.A08
            if (r0 == 0) goto L_0x00e1
            r2 = r2 & 224(0xe0, float:3.14E-43)
            r1 = 224(0xe0, float:3.14E-43)
            r0 = 1
            if (r2 == r1) goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            r15.A08 = r3
            if (r0 == 0) goto L_0x00fa
            int r0 = r7 + 1
            r6.A0O(r0)
            r15.A08 = r4
            X.SRd r0 = r15.A0A
            byte[] r1 = r0.A02
            byte r0 = r5[r7]
            r1[r12] = r0
            r0 = 2
            r15.A00 = r0
            goto L_0x004c
        L_0x00fa:
            int r7 = r7 + 1
            goto L_0x00c8
        L_0x00fd:
            r6.A0O(r8)
            goto L_0x0005
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11743Sfe.AJP(X.SRd):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.S36] */
    public C11743Sfe(String str, int i) {
        this.A02 = 0;
        C11389SRd A0P = Pxe.A0P(4);
        this.A0A = A0P;
        A0P.A02[0] = -1;
        this.A0B = new Object();
        this.A04 = -9223372036854775807L;
        this.A0C = str;
        this.A09 = i;
    }

    public final void ANC(YBZ ybz, SR8 sr8) {
        this.A06 = SR8.A01(sr8);
        this.A05 = SR8.A00(ybz, sr8);
    }

    public final void E1Y(long j, int i) {
        this.A04 = j;
    }

    public C11743Sfe() {
        this((String) null, 0);
    }
}
