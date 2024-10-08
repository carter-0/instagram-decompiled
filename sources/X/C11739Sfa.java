package X;

/* renamed from: X.Sfa  reason: case insensitive filesystem */
public final class C11739Sfa implements C22557YAo {
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public C13900TjN A0A;
    public C10516RtV A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G = 0;
    public boolean A0H;
    public final ST7 A0I;
    public final C11389SRd A0J;
    public final C11389SRd A0K;

    public final void E1X(boolean z) {
    }

    public final void EKt() {
        this.A0G = 0;
        this.A07 = 0;
        this.A0J.A0M(2);
        this.A04 = 0;
        this.A03 = 0;
        this.A05 = -2147483647;
        this.A06 = -1;
        this.A08 = 0;
        this.A09 = -1;
        this.A0D = false;
        this.A0E = false;
        this.A0H = true;
        this.A0F = true;
        this.A00 = -9.223372036854776E18d;
        this.A01 = -9.223372036854776E18d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0396, code lost:
        throw new X.XQX(r0, (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0449, code lost:
        r5.A05 = (int) (((double) r0) * r9);
        r5.A06 = (int) (((double) r8) * r9);
        r2 = r5.A09;
        r6 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0459, code lost:
        if (r2 == r6) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x045b, code lost:
        r5.A09 = r6;
        r3 = "mhm1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0463, code lost:
        if (r20 == -1) goto L_0x0473;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0465, code lost:
        r3 = X.002.A0R(r3, java.lang.String.format(".%02X", X.AnonymousClass7TF.A1b(r20)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0473, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0474, code lost:
        if (r1 == null) goto L_0x047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0477, code lost:
        if (r1.length <= 0) goto L_0x047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0479, code lost:
        r2 = com.google.common.collect.ImmutableList.of(androidx.media3.common.util.Util.A07, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x047f, code lost:
        r1 = X.SOW.A00();
        r1.A0T = r5.A0C;
        r1.A01("audio/mhm1");
        r1.A0G = r5.A05;
        r1.A0R = r3;
        r1.A0X = r2;
        r5.A0A.AWO(X.Pxe.A0O(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x049d, code lost:
        r5.A0D = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r2 == 3) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0378  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AJP(X.C11389SRd r22) {
        /*
            r21 = this;
            r5 = r21
            X.TjN r0 = r5.A0A
            X.C11366SPh.A00(r0)
        L_0x0007:
            r2 = r22
            int r6 = r2.A00
            int r8 = r2.A01
            int r7 = r6 - r8
            if (r7 <= 0) goto L_0x04a3
            int r0 = r5.A0G
            r4 = 1
            if (r0 == 0) goto L_0x0411
            r9 = 2
            if (r0 == r4) goto L_0x02d1
            X.RtV r13 = r5.A0B
            int r1 = r13.A01
            if (r1 == r4) goto L_0x0023
            r0 = 17
            if (r1 != r0) goto L_0x0038
        L_0x0023:
            X.SRd r6 = r5.A0K
            int r0 = r6.A00
            int r3 = r6.A01
            int r1 = X.Pxh.A04(r0, r3, r7)
            byte[] r0 = r6.A02
            r2.A0R(r0, r3, r1)
            r6.A0P(r1)
            r2.A0O(r8)
        L_0x0038:
            int r3 = X.Pxe.A06(r2)
            int r1 = r13.A00
            int r0 = r5.A04
            int r3 = X.Pxh.A04(r1, r0, r3)
            X.TjN r0 = r5.A0A
            r0.EJf(r2, r3)
            int r1 = r5.A04
            int r1 = r1 + r3
            r5.A04 = r1
            int r0 = r13.A00
            if (r1 != r0) goto L_0x0007
            int r1 = r13.A01
            if (r1 != r4) goto L_0x026f
            X.SRd r0 = r5.A0K
            byte[] r0 = r0.A02
            X.ST7 r12 = new X.ST7
            r12.<init>(r0)
            r11 = 8
            int r20 = r12.A06(r11)
            r0 = 5
            int r1 = r12.A06(r0)
            r0 = 31
            if (r1 != r0) goto L_0x01ec
            r0 = 24
            int r0 = r12.A06(r0)
        L_0x0074:
            r10 = 3
            int r2 = r12.A06(r10)
            if (r2 == 0) goto L_0x01e8
            if (r2 == r4) goto L_0x01e4
            if (r2 == r9) goto L_0x01e0
            if (r2 == r10) goto L_0x01e0
            r1 = 4
            if (r2 != r1) goto L_0x01d2
            r8 = 4096(0x1000, float:5.74E-42)
        L_0x0086:
            if (r2 == 0) goto L_0x01cf
            if (r2 == r4) goto L_0x01cf
            r1 = 2
            if (r2 == r9) goto L_0x0092
            r1 = 3
            r19 = 1
            if (r2 != r10) goto L_0x0094
        L_0x0092:
            r19 = r1
        L_0x0094:
            r12.A0A(r9)
            X.C11054S7z.A01(r12)
            r6 = 5
            int r7 = r12.A06(r6)
            r3 = 0
            r18 = 0
        L_0x00a2:
            int r1 = r7 + 1
            if (r3 >= r1) goto L_0x00c4
            int r2 = r12.A06(r10)
            r1 = 16
            int r1 = X.C11054S7z.A00(r12, r6, r11, r1)
            int r1 = r1 + 1
            int r18 = r18 + r1
            if (r2 == 0) goto L_0x00b8
            if (r2 != r9) goto L_0x00c1
        L_0x00b8:
            boolean r1 = r12.A0F()
            if (r1 == 0) goto L_0x00c1
            X.C11054S7z.A01(r12)
        L_0x00c1:
            int r3 = r3 + 1
            goto L_0x00a2
        L_0x00c4:
            r7 = 4
            r6 = 16
            int r1 = X.C11054S7z.A00(r12, r7, r11, r6)
            int r17 = r1 + 1
            r12.A08()
            r16 = 0
            r3 = 0
        L_0x00d3:
            r1 = r17
            if (r3 >= r1) goto L_0x0194
            int r1 = r12.A06(r9)
            if (r1 == 0) goto L_0x0171
            if (r1 == r4) goto L_0x0100
            if (r1 != r10) goto L_0x00fd
            X.C11054S7z.A00(r12, r7, r11, r6)
            int r2 = X.C11054S7z.A00(r12, r7, r11, r6)
            boolean r1 = r12.A0F()
            if (r1 == 0) goto L_0x00f3
            r1 = r16
            X.C11054S7z.A00(r12, r11, r6, r1)
        L_0x00f3:
            r12.A08()
            if (r2 <= 0) goto L_0x00fd
            int r1 = r2 * 8
        L_0x00fa:
            r12.A0A(r1)
        L_0x00fd:
            int r3 = r3 + 1
            goto L_0x00d3
        L_0x0100:
            boolean r1 = X.ST7.A03(r12, r10)
            if (r1 == 0) goto L_0x010e
            r1 = 13
            r12.A0A(r1)
            r12.A08()
        L_0x010e:
            if (r19 <= 0) goto L_0x0148
            r12.A0A(r10)
            boolean r1 = X.ST7.A03(r12, r11)
            boolean r2 = r12.A0F()
            if (r1 == 0) goto L_0x0121
            r1 = 5
            r12.A0A(r1)
        L_0x0121:
            if (r2 == 0) goto L_0x0127
            r1 = 6
            r12.A0A(r1)
        L_0x0127:
            int r15 = r12.A06(r9)
            if (r15 <= 0) goto L_0x0148
            r14 = 6
            int r2 = X.ST7.A00(r12, r14, r9)
            boolean r1 = X.ST7.A03(r12, r7)
            if (r1 == 0) goto L_0x013c
            r1 = 5
            r12.A0A(r1)
        L_0x013c:
            if (r15 == r9) goto L_0x0140
            if (r15 != r10) goto L_0x0143
        L_0x0140:
            r12.A0A(r14)
        L_0x0143:
            if (r2 != r9) goto L_0x0148
            r12.A08()
        L_0x0148:
            int r1 = r18 + -1
            double r1 = (double) r1
            double r14 = java.lang.Math.log(r1)
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = java.lang.Math.log(r1)
            double r14 = r14 / r1
            double r1 = java.lang.Math.floor(r14)
            int r14 = (int) r1
            int r2 = r14 + 1
            int r1 = r12.A06(r9)
            if (r1 <= 0) goto L_0x0166
            X.ST7.A02(r12, r2)
        L_0x0166:
            X.ST7.A02(r12, r2)
            if (r19 != 0) goto L_0x00fd
            if (r1 != 0) goto L_0x00fd
            r12.A08()
            goto L_0x00fd
        L_0x0171:
            boolean r1 = X.ST7.A03(r12, r10)
            if (r1 == 0) goto L_0x017c
            r1 = 13
            r12.A0A(r1)
        L_0x017c:
            if (r19 <= 0) goto L_0x00fd
            r12.A0A(r10)
            boolean r1 = X.ST7.A03(r12, r11)
            boolean r2 = r12.A0F()
            if (r1 == 0) goto L_0x018f
            r1 = 5
            r12.A0A(r1)
        L_0x018f:
            if (r2 == 0) goto L_0x00fd
            r1 = 6
            goto L_0x00fa
        L_0x0194:
            boolean r2 = r12.A0F()
            r1 = 0
            if (r2 == 0) goto L_0x03de
            int r2 = X.C11054S7z.A00(r12, r9, r7, r11)
            int r10 = r2 + 1
            r9 = 0
        L_0x01a2:
            if (r9 >= r10) goto L_0x03de
            int r14 = X.C11054S7z.A00(r12, r7, r11, r6)
            int r3 = X.C11054S7z.A00(r12, r7, r11, r6)
            r2 = 7
            if (r14 != r2) goto L_0x01c7
            int r1 = r12.A06(r7)
            int r14 = r1 + 1
            r12.A0A(r7)
            byte[] r1 = new byte[r14]
            r3 = 0
        L_0x01bb:
            if (r3 >= r14) goto L_0x01cc
            int r2 = r12.A06(r11)
            byte r2 = (byte) r2
            r1[r3] = r2
            int r3 = r3 + 1
            goto L_0x01bb
        L_0x01c7:
            int r2 = r3 * 8
            r12.A0A(r2)
        L_0x01cc:
            int r9 = r9 + 1
            goto L_0x01a2
        L_0x01cf:
            r1 = 0
            goto L_0x0092
        L_0x01d2:
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported coreSbrFrameLengthIndex "
            r5.append(r0)
            r5.append(r2)
            goto L_0x03ed
        L_0x01e0:
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x01e4:
            r8 = 1024(0x400, float:1.435E-42)
            goto L_0x0086
        L_0x01e8:
            r8 = 768(0x300, float:1.076E-42)
            goto L_0x0086
        L_0x01ec:
            switch(r1) {
                case 0: goto L_0x01fd;
                case 1: goto L_0x0202;
                case 2: goto L_0x0207;
                case 3: goto L_0x020c;
                case 4: goto L_0x0211;
                case 5: goto L_0x0216;
                case 6: goto L_0x021a;
                case 7: goto L_0x021e;
                case 8: goto L_0x0222;
                case 9: goto L_0x0226;
                case 10: goto L_0x022a;
                case 11: goto L_0x022e;
                case 12: goto L_0x0232;
                case 13: goto L_0x01ef;
                case 14: goto L_0x01ef;
                case 15: goto L_0x0236;
                case 16: goto L_0x023b;
                case 17: goto L_0x0240;
                case 18: goto L_0x0245;
                case 19: goto L_0x024a;
                case 20: goto L_0x024f;
                case 21: goto L_0x0253;
                case 22: goto L_0x0257;
                case 23: goto L_0x025b;
                case 24: goto L_0x025f;
                case 25: goto L_0x0263;
                case 26: goto L_0x0267;
                case 27: goto L_0x026b;
                default: goto L_0x01ef;
            }
        L_0x01ef:
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported sampling rate index "
            r5.append(r0)
            r5.append(r1)
            goto L_0x03ed
        L_0x01fd:
            r0 = 96000(0x17700, float:1.34525E-40)
            goto L_0x0074
        L_0x0202:
            r0 = 88200(0x15888, float:1.23595E-40)
            goto L_0x0074
        L_0x0207:
            r0 = 64000(0xfa00, float:8.9683E-41)
            goto L_0x0074
        L_0x020c:
            r0 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0074
        L_0x0211:
            r0 = 44100(0xac44, float:6.1797E-41)
            goto L_0x0074
        L_0x0216:
            r0 = 32000(0x7d00, float:4.4842E-41)
            goto L_0x0074
        L_0x021a:
            r0 = 24000(0x5dc0, float:3.3631E-41)
            goto L_0x0074
        L_0x021e:
            r0 = 22050(0x5622, float:3.0899E-41)
            goto L_0x0074
        L_0x0222:
            r0 = 16000(0x3e80, float:2.2421E-41)
            goto L_0x0074
        L_0x0226:
            r0 = 12000(0x2ee0, float:1.6816E-41)
            goto L_0x0074
        L_0x022a:
            r0 = 11025(0x2b11, float:1.545E-41)
            goto L_0x0074
        L_0x022e:
            r0 = 8000(0x1f40, float:1.121E-41)
            goto L_0x0074
        L_0x0232:
            r0 = 7350(0x1cb6, float:1.03E-41)
            goto L_0x0074
        L_0x0236:
            r0 = 57600(0xe100, float:8.0715E-41)
            goto L_0x0074
        L_0x023b:
            r0 = 51200(0xc800, float:7.1746E-41)
            goto L_0x0074
        L_0x0240:
            r0 = 40000(0x9c40, float:5.6052E-41)
            goto L_0x0074
        L_0x0245:
            r0 = 38400(0x9600, float:5.381E-41)
            goto L_0x0074
        L_0x024a:
            r0 = 34150(0x8566, float:4.7854E-41)
            goto L_0x0074
        L_0x024f:
            r0 = 28800(0x7080, float:4.0357E-41)
            goto L_0x0074
        L_0x0253:
            r0 = 25600(0x6400, float:3.5873E-41)
            goto L_0x0074
        L_0x0257:
            r0 = 20000(0x4e20, float:2.8026E-41)
            goto L_0x0074
        L_0x025b:
            r0 = 19200(0x4b00, float:2.6905E-41)
            goto L_0x0074
        L_0x025f:
            r0 = 17075(0x42b3, float:2.3927E-41)
            goto L_0x0074
        L_0x0263:
            r0 = 14400(0x3840, float:2.0179E-41)
            goto L_0x0074
        L_0x0267:
            r0 = 12800(0x3200, float:1.7937E-41)
            goto L_0x0074
        L_0x026b:
            r0 = 9600(0x2580, float:1.3452E-41)
            goto L_0x0074
        L_0x026f:
            r0 = 17
            if (r1 != r0) goto L_0x0291
            X.SRd r0 = r5.A0K
            byte[] r0 = r0.A02
            X.ST7 r1 = new X.ST7
            r1.<init>(r0)
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x028f
            r1.A0A(r9)
            r0 = 13
            int r0 = r1.A06(r0)
        L_0x028b:
            r5.A08 = r0
            goto L_0x049f
        L_0x028f:
            r0 = 0
            goto L_0x028b
        L_0x0291:
            if (r1 != r9) goto L_0x049f
            boolean r0 = r5.A0D
            r7 = 0
            if (r0 == 0) goto L_0x02cf
            r5.A0F = r7
            r10 = 1
        L_0x029b:
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            int r1 = r5.A06
            int r0 = r5.A08
            int r1 = r1 - r0
            double r2 = (double) r1
            double r2 = r2 * r8
            int r0 = r5.A05
            double r0 = (double) r0
            double r2 = r2 / r0
            double r0 = r5.A00
            long r13 = java.lang.Math.round(r0)
            boolean r6 = r5.A0E
            if (r6 == 0) goto L_0x02cd
            r5.A0E = r7
            double r0 = r5.A01
        L_0x02b9:
            r5.A00 = r0
            X.TjN r8 = r5.A0A
            int r0 = r5.A03
            r9 = 0
            r11 = r0
            r12 = r7
            r8.EJm(r9, r10, r11, r12, r13)
            r5.A0D = r7
            r5.A08 = r7
            r5.A03 = r7
            goto L_0x049f
        L_0x02cd:
            double r0 = r0 + r2
            goto L_0x02b9
        L_0x02cf:
            r10 = 0
            goto L_0x029b
        L_0x02d1:
            X.SRd r8 = r5.A0J
            r15 = 0
            int r0 = r8.A00
            int r3 = r8.A01
            int r1 = X.Pxh.A04(r0, r3, r7)
            byte[] r0 = r8.A02
            r2.A0R(r0, r3, r1)
            r8.A0P(r1)
            int r0 = r8.A00
            r20 = r0
            int r0 = r8.A01
            int r0 = r20 - r0
            if (r0 != 0) goto L_0x040d
            X.ST7 r10 = r5.A0I
            byte[] r0 = r8.A02
            r10.A03 = r0
            r10.A02 = r15
            r10.A00 = r15
            r0 = r20
            r10.A01 = r0
            X.RtV r14 = r5.A0B
            r10.A05()
            r0 = 3
            r13 = 8
            int r1 = X.C11054S7z.A00(r10, r0, r13, r13)
            r14.A01 = r1
            r19 = -1
            r0 = r19
            if (r1 == r0) goto L_0x0402
            r18 = 32
            int r1 = java.lang.Math.max(r9, r13)
            r0 = r18
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 63
            boolean r0 = X.Pxg.A1T(r1, r0)
            X.C11366SPh.A01(r0)
            r2 = 1
            long r6 = r2 << r9
            long r6 = r6 - r2
            long r11 = r2 << r13
            long r11 = r11 - r2
            long r16 = X.C7258Q1h.A00(r6, r11)
            long r2 = r2 << r18
            r0 = r16
            X.C7258Q1h.A00(r0, r2)
            int r0 = r10.A04()
            if (r0 < r9) goto L_0x039d
            int r0 = r10.A06(r9)
            long r2 = (long) r0
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r16
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0370
            int r0 = r10.A04()
            if (r0 < r13) goto L_0x039d
            int r0 = r10.A06(r13)
            long r0 = (long) r0
            long r0 = r0 & r16
            long r2 = r2 + r0
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0370
            int r1 = r10.A04()
            r0 = r18
            if (r1 < r0) goto L_0x039d
            int r0 = r10.A06(r0)
            long r0 = (long) r0
            long r0 = r0 & r16
            long r2 = r2 + r0
        L_0x0370:
            r14.A02 = r2
            r6 = -1
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0402
            r6 = 16
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x03d1
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x03a0
            int r2 = r14.A01
            r1 = 0
            if (r2 == r4) goto L_0x039a
            if (r2 == r9) goto L_0x0397
            r0 = 17
            if (r2 != r0) goto L_0x03a0
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
        L_0x0391:
            X.XQX r3 = new X.XQX
            r3.<init>(r0, r1, r4, r4)
            throw r3
        L_0x0397:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            goto L_0x0391
        L_0x039a:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            goto L_0x0391
        L_0x039d:
            r2 = -1
            goto L_0x0370
        L_0x03a0:
            r1 = 11
            r0 = 24
            int r1 = X.C11054S7z.A00(r10, r1, r0, r0)
            r14.A00 = r1
            r0 = r19
            if (r1 == r0) goto L_0x0402
            r5.A04 = r15
            int r0 = r5.A03
            int r1 = r1 + r20
            int r0 = r0 + r1
            r5.A03 = r0
            r8.A0O(r15)
            X.TjN r1 = r5.A0A
            int r0 = r8.A00
            r1.EJf(r8, r0)
            r8.A0M(r9)
            X.SRd r1 = r5.A0K
            int r0 = r14.A00
            r1.A0M(r0)
            r5.A0H = r4
            r5.A0G = r9
            goto L_0x0007
        L_0x03d1:
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Contains sub-stream with an invalid packet label "
            r5.append(r0)
            r5.append(r2)
            goto L_0x03ed
        L_0x03de:
            switch(r0) {
                case 14700: goto L_0x03f9;
                case 16000: goto L_0x03f9;
                case 22050: goto L_0x03fc;
                case 24000: goto L_0x03fc;
                case 29400: goto L_0x03ff;
                case 32000: goto L_0x03ff;
                case 44100: goto L_0x0447;
                case 48000: goto L_0x0447;
                case 58800: goto L_0x03ff;
                case 64000: goto L_0x03ff;
                case 88200: goto L_0x0447;
                case 96000: goto L_0x0447;
                default: goto L_0x03e1;
            }
        L_0x03e1:
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Unsupported sampling rate "
            r5.append(r1)
            r5.append(r0)
        L_0x03ed:
            java.lang.String r2 = r5.toString()
            r1 = 0
            r0 = 0
            X.XQX r3 = new X.XQX
            r3.<init>(r2, r1, r4, r0)
            throw r3
        L_0x03f9:
            r9 = 4613937818241073152(0x4008000000000000, double:3.0)
            goto L_0x0449
        L_0x03fc:
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            goto L_0x0449
        L_0x03ff:
            r9 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            goto L_0x0449
        L_0x0402:
            int r1 = r8.A00
            r0 = 15
            if (r1 >= r0) goto L_0x0007
            int r0 = r1 + 1
            r8.A0N(r0)
        L_0x040d:
            r5.A0H = r15
            goto L_0x0007
        L_0x0411:
            int r1 = r5.A02
            r0 = r1 & 2
            r3 = 0
            if (r0 != 0) goto L_0x041d
            r2.A0O(r6)
            goto L_0x0007
        L_0x041d:
            r0 = r1 & 4
            if (r0 != 0) goto L_0x049f
        L_0x0421:
            int r0 = r2.A01
            int r0 = r6 - r0
            if (r0 <= 0) goto L_0x0007
            int r0 = r5.A07
            int r1 = r0 << 8
            r5.A07 = r1
            int r0 = r2.A05()
            r1 = r1 | r0
            r5.A07 = r1
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            r0 = 12583333(0xc001a5, float:1.7633005E-38)
            if (r1 != r0) goto L_0x0421
            int r0 = r2.A01
            int r0 = r0 + -3
            r2.A0O(r0)
            r5.A07 = r3
            goto L_0x049f
        L_0x0447:
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0449:
            double r2 = (double) r0
            double r2 = r2 * r9
            int r6 = (int) r2
            double r2 = (double) r8
            double r2 = r2 * r9
            int r0 = (int) r2
            r5.A05 = r6
            r5.A06 = r0
            long r2 = r5.A09
            long r6 = r13.A02
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x049d
            r5.A09 = r6
            java.lang.String r3 = "mhm1"
            r2 = -1
            r0 = r20
            if (r0 == r2) goto L_0x0473
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r20)
            java.lang.String r0 = ".%02X"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.String r3 = X.002.A0R(r3, r0)
        L_0x0473:
            r2 = 0
            if (r1 == 0) goto L_0x047f
            int r0 = r1.length
            if (r0 <= 0) goto L_0x047f
            byte[] r0 = androidx.media3.common.util.Util.A07
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r0, r1)
        L_0x047f:
            X.SOW r1 = X.SOW.A00()
            java.lang.String r0 = r5.A0C
            r1.A0T = r0
            java.lang.String r0 = "audio/mhm1"
            r1.A01(r0)
            int r0 = r5.A05
            r1.A0G = r0
            r1.A0R = r3
            r1.A0X = r2
            X.SJM r1 = X.Pxe.A0O(r1)
            X.TjN r0 = r5.A0A
            r0.AWO(r1)
        L_0x049d:
            r5.A0D = r4
        L_0x049f:
            r5.A0G = r4
            goto L_0x0007
        L_0x04a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11739Sfa.AJP(X.SRd):void");
    }

    public final void E1Y(long j, int i) {
        this.A02 = i;
        if (!this.A0F && (this.A03 != 0 || !this.A0H)) {
            this.A0E = true;
        }
        if (j != -9223372036854775807L) {
            double d = (double) j;
            if (this.A0E) {
                this.A01 = d;
            } else {
                this.A00 = d;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.SRd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.RtV, java.lang.Object] */
    public C11739Sfa() {
        ? obj = new Object();
        obj.A02 = new byte[15];
        obj.A00 = 2;
        this.A0J = obj;
        this.A0I = new ST7();
        this.A0K = new C11389SRd();
        this.A0B = new Object();
        this.A05 = -2147483647;
        this.A06 = -1;
        this.A09 = -1;
        this.A0F = true;
        this.A0H = true;
        this.A00 = -9.223372036854776E18d;
        this.A01 = -9.223372036854776E18d;
    }

    public final void ANC(YBZ ybz, SR8 sr8) {
        this.A0C = SR8.A01(sr8);
        this.A0A = SR8.A00(ybz, sr8);
    }
}
