package X;

/* renamed from: X.Sep  reason: case insensitive filesystem */
public final class C11692Sep implements C13809Thc {
    public int A00;
    public int A01 = 1;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public YBZ A06;
    public C7460QDz A07;
    public QE0 A08;
    public boolean A09;
    public boolean A0A;
    public final C11389SRd A0B = Pxe.A0P(9);
    public final C11389SRd A0C = Pxe.A0P(11);
    public final QE1 A0D = new QE1();
    public final C11389SRd A0E = Pxe.A0P(4);
    public final C11389SRd A0F = new C11389SRd();

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final void EKu(long j, long j2) {
        if (j == 0) {
            this.A01 = 1;
            this.A09 = false;
        } else {
            this.A01 = 3;
        }
        this.A00 = 0;
    }

    private C11389SRd A00(C13910TlA tlA) {
        int i = this.A02;
        C11389SRd sRd = this.A0F;
        int length = sRd.A02.length;
        if (i > length) {
            sRd.A0Q(new byte[Math.max(length * 2, i)], 0);
        } else {
            sRd.A0O(0);
        }
        sRd.A0N(this.A02);
        tlA.readFully(sRd.A02, 0, this.A02);
        return sRd;
    }

    public final void CMU(YBZ ybz) {
        this.A06 = ybz;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.S04, X.QDz] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (X.JTQ.A1O(r12, 5) != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r11.A03(r10, r0) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r3 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x007d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0005 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E67(X.C13910TlA r15, X.C21363XYr r16) {
        /*
            r14 = this;
            X.YBZ r0 = r14.A06
            X.C11366SPh.A00(r0)
        L_0x0005:
            int r0 = r14.A01
            r6 = 1
            r4 = -1
            if (r0 == r6) goto L_0x0182
            r7 = 2
            if (r0 == r7) goto L_0x01da
            r8 = 3
            if (r0 == r8) goto L_0x014d
            r8 = 4
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x0138
            long r0 = r14.A04
            long r2 = r14.A05
            long r0 = r0 + r2
        L_0x001b:
            int r9 = r14.A03
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            r2 = 8
            if (r9 != r2) goto L_0x00eb
            X.QDz r2 = r14.A07
            if (r2 == 0) goto L_0x0130
            boolean r2 = r14.A0A
            if (r2 != 0) goto L_0x0036
            X.YBZ r2 = r14.A06
            X.C11710Sf7.A00(r2, r4)
            r14.A0A = r6
        L_0x0036:
            X.QDz r11 = r14.A07
        L_0x0038:
            X.SRd r10 = r14.A00(r15)
            boolean r2 = r11 instanceof X.QE0
            if (r2 == 0) goto L_0x0082
            r13 = r11
            X.QE0 r13 = (X.QE0) r13
            int r9 = r10.A05()
            int r2 = r9 >> 4
            r12 = r2 & 15
            r9 = r9 & 15
            r2 = 7
            if (r9 != r2) goto L_0x01e7
            r13.A00 = r12
            r2 = 5
            boolean r2 = X.JTQ.A1O(r12, r2)
            if (r2 == 0) goto L_0x0060
        L_0x0059:
            boolean r0 = r11.A03(r10, r0)
            r3 = 1
            if (r0 != 0) goto L_0x0061
        L_0x0060:
            r3 = 0
        L_0x0061:
            r9 = 1
        L_0x0062:
            boolean r0 = r14.A09
            if (r0 != 0) goto L_0x0077
            if (r3 == 0) goto L_0x0077
            r14.A09 = r6
            X.QE1 r0 = r14.A0D
            long r0 = r0.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x007f
            long r2 = r14.A05
            long r0 = -r2
        L_0x0075:
            r14.A04 = r0
        L_0x0077:
            r14.A00 = r8
            r14.A01 = r7
            if (r9 == 0) goto L_0x0005
            r4 = 0
        L_0x007e:
            return r4
        L_0x007f:
            r0 = 0
            goto L_0x0075
        L_0x0082:
            boolean r2 = r11 instanceof X.QE1
            if (r2 != 0) goto L_0x0059
            r9 = r11
            X.QDz r9 = (X.C7460QDz) r9
            boolean r2 = r9.A02
            if (r2 != 0) goto L_0x00e6
            int r13 = r10.A05()
            int r2 = r13 >> 4
            r12 = r2 & 15
            r9.A00 = r12
            if (r12 != r7) goto L_0x00bb
            int r13 = r13 >> r7
            r3 = r13 & 3
            int[] r2 = X.C7460QDz.A03
            r12 = r2[r3]
            X.SOW r3 = X.SOW.A00()
            java.lang.String r2 = "audio/mpeg"
            r3.A01(r2)
            r3.A04 = r6
            r3.A0G = r12
        L_0x00ad:
            X.SJM r3 = X.Pxe.A0O(r3)
            X.TjN r2 = r9.A00
            r2.AWO(r3)
            r9.A01 = r6
        L_0x00b8:
            r9.A02 = r6
            goto L_0x0059
        L_0x00bb:
            r2 = 7
            if (r12 == r2) goto L_0x00d2
            r2 = 8
            if (r12 != r2) goto L_0x00d5
            java.lang.String r2 = "audio/g711-mlaw"
        L_0x00c4:
            X.SOW r3 = X.SOW.A00()
            r3.A01(r2)
            r3.A04 = r6
            r2 = 8000(0x1f40, float:1.121E-41)
            r3.A0G = r2
            goto L_0x00ad
        L_0x00d2:
            java.lang.String r2 = "audio/g711-alaw"
            goto L_0x00c4
        L_0x00d5:
            r2 = 10
            if (r12 == r2) goto L_0x00b8
            java.lang.String r0 = "Audio format not supported: "
            java.lang.String r2 = X.002.A0O(r0, r12)
            r0 = 0
            X.QDb r1 = new X.QDb
            r1.<init>(r2, r0, r6, r3)
            throw r1
        L_0x00e6:
            r10.A0P(r6)
            goto L_0x0059
        L_0x00eb:
            r2 = 9
            if (r9 != r2) goto L_0x0102
            X.QE0 r2 = r14.A08
            if (r2 == 0) goto L_0x0130
            boolean r2 = r14.A0A
            if (r2 != 0) goto L_0x00fe
            X.YBZ r2 = r14.A06
            X.C11710Sf7.A00(r2, r4)
            r14.A0A = r6
        L_0x00fe:
            X.QE0 r11 = r14.A08
            goto L_0x0038
        L_0x0102:
            r2 = 18
            if (r9 != r2) goto L_0x0130
            boolean r2 = r14.A0A
            if (r2 != 0) goto L_0x0130
            X.QE1 r9 = r14.A0D
            X.SRd r2 = r14.A00(r15)
            boolean r0 = r9.A03(r2, r0)
            boolean r3 = X.AnonymousClass7TF.A1P(r0)
            long r0 = r9.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0061
            X.YBZ r11 = r14.A06
            long[] r10 = r9.A01
            long[] r9 = r9.A02
            X.Sf4 r2 = new X.Sf4
            r2.<init>(r10, r9, r0)
            r11.EKw(r2)
            r14.A0A = r6
            goto L_0x0061
        L_0x0130:
            int r0 = r14.A02
            r15.Evk(r0)
            r9 = 0
            goto L_0x0062
        L_0x0138:
            X.QE1 r0 = r14.A0D
            long r0 = r0.A00
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0149
            r0 = 0
            goto L_0x001b
        L_0x0149:
            long r0 = r14.A05
            goto L_0x001b
        L_0x014d:
            X.SRd r7 = r14.A0C
            byte[] r2 = r7.A02
            r1 = 0
            r0 = 11
            boolean r0 = r15.E6T(r2, r1, r0, r6)
            if (r0 == 0) goto L_0x007e
            r7.A0O(r1)
            int r0 = r7.A05()
            r14.A03 = r0
            int r0 = r7.A06()
            r14.A02 = r0
            int r0 = r7.A06()
            long r4 = (long) r0
            r14.A05 = r4
            int r0 = r7.A05()
            int r0 = r0 << 24
            long r2 = (long) r0
            long r2 = r2 | r4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r14.A05 = r2
            r7.A0P(r8)
            r4 = 4
            goto L_0x01e3
        L_0x0182:
            X.SRd r3 = r14.A0B
            byte[] r0 = r3.A02
            r5 = 0
            r2 = 9
            boolean r0 = r15.E6T(r0, r5, r2, r6)
            if (r0 == 0) goto L_0x007e
            r3.A0O(r5)
            r0 = 4
            int r4 = X.Pxf.A07(r3, r0)
            r0 = r4 & 4
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            r0 = r4 & 1
            if (r0 == 0) goto L_0x01a2
            r5 = 1
        L_0x01a2:
            if (r1 == 0) goto L_0x01b7
            X.QDz r0 = r14.A07
            if (r0 != 0) goto L_0x01b7
            X.YBZ r1 = r14.A06
            r0 = 8
            X.TjN r1 = r1.FHV(r0, r6)
            X.QDz r0 = new X.QDz
            r0.<init>(r1)
            r14.A07 = r0
        L_0x01b7:
            r4 = 2
            if (r5 == 0) goto L_0x01cb
            X.QE0 r0 = r14.A08
            if (r0 != 0) goto L_0x01cb
            X.YBZ r0 = r14.A06
            X.TjN r1 = r0.FHV(r2, r4)
            X.QE0 r0 = new X.QE0
            r0.<init>(r1)
            r14.A08 = r0
        L_0x01cb:
            X.YBZ r0 = r14.A06
            r0.ASU()
            int r0 = r3.A01()
            int r0 = r0 - r2
            int r0 = r0 + 4
            r14.A00 = r0
            goto L_0x01e3
        L_0x01da:
            int r0 = r14.A00
            r15.Evk(r0)
            r0 = 0
            r14.A00 = r0
            r4 = 3
        L_0x01e3:
            r14.A01 = r4
            goto L_0x0005
        L_0x01e7:
            java.lang.String r0 = "Video format not supported: "
            java.lang.String r2 = X.002.A0O(r0, r9)
            r0 = 0
            X.QDb r1 = new X.QDb
            r1.<init>(r2, r0, r6, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11692Sep.E67(X.TlA, X.XYr):int");
    }

    public final boolean Evx(C13910TlA tlA) {
        C11389SRd sRd = this.A0E;
        tlA.E2F(sRd.A02, 0, 3);
        sRd.A0O(0);
        if (sRd.A06() != 4607062) {
            return false;
        }
        tlA.E2F(sRd.A02, 0, 2);
        sRd.A0O(0);
        if ((sRd.A08() & C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        tlA.E2F(sRd.A02, 0, 4);
        int A062 = Pxf.A06(sRd, 0);
        tlA.EI7();
        tlA.AAu(A062);
        tlA.E2F(sRd.A02, 0, 4);
        if (Pxf.A06(sRd, 0) == 0) {
            return true;
        }
        return false;
    }
}
