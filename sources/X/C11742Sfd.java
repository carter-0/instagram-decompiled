package X;

/* renamed from: X.Sfd  reason: case insensitive filesystem */
public final class C11742Sfd implements C22557YAo {
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

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013e, code lost:
        if (r7 == 11) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (r7 != 11) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014a, code lost:
        if (r7 != 8) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0178, code lost:
        r2.A08 = 1;
        r1 = r2.A0C.A02;
        r1[0] = -84;
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0184, code lost:
        if (r5 == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0186, code lost:
        r0 = 65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0188, code lost:
        r1[1] = (byte) r0;
        r2.A00 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AJP(X.C11389SRd r19) {
        /*
            r18 = this;
            r2 = r18
            X.TjN r0 = r2.A05
            X.C11366SPh.A00(r0)
        L_0x0007:
            r7 = r19
            int r8 = r7.A00
            int r0 = r7.A01
            int r5 = r8 - r0
            if (r5 <= 0) goto L_0x018f
            int r0 = r2.A08
            r6 = 2
            r15 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0152
            if (r0 == r4) goto L_0x0052
            int r1 = r2.A01
            int r0 = r2.A00
            int r1 = X.Pxh.A04(r1, r0, r5)
            X.TjN r0 = r2.A05
            r0.EJf(r7, r1)
            int r0 = r2.A00
            int r0 = r0 + r1
            r2.A00 = r0
            int r14 = r2.A01
            if (r0 != r14) goto L_0x0007
            long r0 = r2.A03
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x003c
            r4 = 0
        L_0x003c:
            X.C11366SPh.A02(r4)
            X.TjN r11 = r2.A05
            r13 = 1
            r12 = 0
            r16 = r0
            r11.EJm(r12, r13, r14, r15, r16)
            long r3 = r2.A03
            long r0 = r2.A02
            long r3 = r3 + r0
            r2.A03 = r3
            r2.A08 = r15
            goto L_0x0007
        L_0x0052:
            X.SRd r9 = r2.A0C
            byte[] r3 = r9.A02
            r8 = 16
            int r0 = r2.A00
            int r1 = X.Pxh.A04(r8, r0, r5)
            r7.A0R(r3, r0, r1)
            int r0 = r2.A00
            int r0 = r0 + r1
            r2.A00 = r0
            if (r0 != r8) goto L_0x0007
            X.ST7 r5 = r2.A0A
            r5.A09(r15)
            int r1 = r5.A06(r8)
            int r13 = r5.A06(r8)
            r12 = 4
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r13 != r0) goto L_0x014f
            r0 = 24
            int r13 = r5.A06(r0)
            r0 = 7
        L_0x0082:
            int r13 = r13 + r0
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r0) goto L_0x008a
            int r13 = r13 + 2
        L_0x008a:
            int r0 = r5.A06(r6)
            r11 = 3
            if (r0 != r11) goto L_0x009a
        L_0x0091:
            r5.A06(r6)
            boolean r0 = r5.A0F()
            if (r0 != 0) goto L_0x0091
        L_0x009a:
            r0 = 10
            int r14 = r5.A06(r0)
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x00af
            int r0 = r5.A06(r11)
            if (r0 <= 0) goto L_0x00af
            r5.A0A(r6)
        L_0x00af:
            boolean r3 = r5.A0F()
            r1 = 48000(0xbb80, float:6.7262E-41)
            r0 = 44100(0xac44, float:6.1797E-41)
            r10 = 44100(0xac44, float:6.1797E-41)
            if (r3 == 0) goto L_0x00c1
            r10 = 48000(0xbb80, float:6.7262E-41)
        L_0x00c1:
            int r7 = r5.A06(r12)
            if (r10 != r0) goto L_0x0122
            r0 = 13
            if (r7 != r0) goto L_0x014d
            int[] r0 = X.C9889Rj2.A00
            r5 = r0[r7]
        L_0x00cf:
            X.SJM r1 = r2.A04
            java.lang.String r3 = "audio/ac4"
            if (r1 == 0) goto L_0x00e5
            int r0 = r1.A06
            if (r6 != r0) goto L_0x00e5
            int r0 = r1.A0I
            if (r10 != r0) goto L_0x00e5
            java.lang.String r0 = r1.A0Y
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0107
        L_0x00e5:
            X.SOW r1 = X.SOW.A00()
            java.lang.String r0 = r2.A06
            r1.A0T = r0
            r1.A01(r3)
            r1.A04 = r6
            r1.A0G = r10
            java.lang.String r0 = r2.A0B
            r1.A0V = r0
            int r0 = r2.A09
            r1.A0E = r0
            X.SJM r1 = X.Pxe.A0O(r1)
            r2.A04 = r1
            X.TjN r0 = r2.A05
            r0.AWO(r1)
        L_0x0107:
            r2.A01 = r13
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = (long) r5
            long r3 = r3 * r0
            X.SJM r0 = r2.A04
            int r0 = r0.A0I
            long r0 = (long) r0
            long r3 = r3 / r0
            r2.A02 = r3
            r9.A0O(r15)
            X.TjN r0 = r2.A05
            r0.EJf(r9, r8)
            r2.A08 = r6
            goto L_0x0007
        L_0x0122:
            if (r10 != r1) goto L_0x014d
            int[] r1 = X.C9889Rj2.A00
            r0 = 14
            if (r7 >= r0) goto L_0x014d
            r5 = r1[r7]
            int r3 = r14 % 5
            r1 = 8
            if (r3 == r4) goto L_0x0148
            r0 = 11
            if (r3 == r6) goto L_0x0143
            if (r3 == r11) goto L_0x0148
            if (r3 != r12) goto L_0x00cf
            if (r7 == r11) goto L_0x0140
            if (r7 == r1) goto L_0x0140
            if (r7 != r0) goto L_0x00cf
        L_0x0140:
            int r5 = r5 + 1
            goto L_0x00cf
        L_0x0143:
            if (r7 == r1) goto L_0x0140
            if (r7 != r0) goto L_0x00cf
            goto L_0x0140
        L_0x0148:
            if (r7 == r11) goto L_0x0140
            if (r7 != r1) goto L_0x00cf
            goto L_0x0140
        L_0x014d:
            r5 = 0
            goto L_0x00cf
        L_0x014f:
            r0 = 4
            goto L_0x0082
        L_0x0152:
            int r0 = r7.A01
            int r0 = r8 - r0
            r5 = 0
            if (r0 <= 0) goto L_0x0007
            boolean r1 = r2.A07
            r0 = 172(0xac, float:2.41E-43)
            int r3 = r7.A05()
            if (r1 != 0) goto L_0x0169
            if (r3 != r0) goto L_0x0166
            r5 = 1
        L_0x0166:
            r2.A07 = r5
            goto L_0x0152
        L_0x0169:
            boolean r0 = X.AnonymousClass7TF.A1S(r3, r0)
            r2.A07 = r0
            r1 = 64
            r0 = 65
            if (r3 == r1) goto L_0x0178
            if (r3 != r0) goto L_0x0152
            r5 = 1
        L_0x0178:
            r2.A08 = r4
            X.SRd r0 = r2.A0C
            byte[] r1 = r0.A02
            r0 = -84
            r1[r15] = r0
            r0 = 64
            if (r5 == 0) goto L_0x0188
            r0 = 65
        L_0x0188:
            byte r0 = (byte) r0
            r1[r4] = r0
            r2.A00 = r6
            goto L_0x0007
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11742Sfd.AJP(X.SRd):void");
    }

    public C11742Sfd(String str, int i) {
        ST7 st7 = new ST7(new byte[16]);
        this.A0A = st7;
        this.A0C = new C11389SRd(st7.A03);
        this.A08 = 0;
        this.A00 = 0;
        this.A07 = false;
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

    public C11742Sfd() {
        this((String) null, 0);
    }
}
