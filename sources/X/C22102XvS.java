package X;

/* renamed from: X.XvS  reason: case insensitive filesystem */
public final class C22102XvS implements C13809Thc {
    public int A00 = -1;
    public int A01 = 0;
    public long A02 = -1;
    public long A03 = -1;
    public YBZ A04;
    public C13900TjN A05;
    public YAO A06;

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final void CMU(YBZ ybz) {
        this.A04 = ybz;
        this.A05 = ybz.FHV(0, 1);
        ybz.ASU();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        if (r4 != 65534) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e2, code lost:
        if (r12 != 0) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E67(X.C13910TlA r18, X.C21363XYr r19) {
        /*
            r17 = this;
            r0 = r17
            X.TjN r1 = r0.A05
            X.C11366SPh.A00(r1)
            int r2 = r0.A01
            r3 = 0
            r4 = r18
            if (r2 == 0) goto L_0x0135
            r1 = 1
            if (r2 == r1) goto L_0x0102
            r1 = 2
            if (r2 == r1) goto L_0x0036
            r1 = 3
            if (r2 == r1) goto L_0x0165
            long r1 = r0.A02
            r6 = -1
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            boolean r5 = X.AnonymousClass7TF.A1P(r5)
            X.C11366SPh.A02(r5)
            long r5 = r4.Bdl()
            long r1 = r1 - r5
            X.YAO r0 = r0.A06
            r0.getClass()
            boolean r0 = r0.EJj(r4, r1)
            if (r0 == 0) goto L_0x0035
            r3 = -1
        L_0x0035:
            return r3
        L_0x0036:
            r6 = 16
            X.SRd r7 = X.Pxe.A0P(r6)
            r1 = 1718449184(0x666d7420, float:2.8033575E23)
            X.Xmp r1 = X.C21511Xdd.A00(r7, r4, r1)
            long r1 = r1.A01
            r8 = 16
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            boolean r5 = X.Pxf.A1R(r5)
            X.C11366SPh.A02(r5)
            byte[] r5 = r7.A02
            r4.E2F(r5, r3, r6)
            r7.A0O(r3)
            int r8 = r7.A03()
            int r9 = r7.A03()
            int r10 = r7.A02()
            if (r10 < 0) goto L_0x00fb
            int r5 = r7.A02()
            if (r5 < 0) goto L_0x00f4
            int r11 = r7.A03()
            int r12 = r7.A03()
            int r5 = (int) r1
            int r5 = r5 - r6
            if (r5 <= 0) goto L_0x00f1
            byte[] r7 = new byte[r5]
            r4.E2F(r7, r3, r5)
        L_0x007d:
            long r1 = r4.BbM()
            long r5 = r4.Bdl()
            long r1 = r1 - r5
            int r5 = (int) r1
            r4.Evk(r5)
            X.Xav r6 = new X.Xav
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r4 = r6.A02
            r1 = 17
            if (r4 != r1) goto L_0x00a3
            X.YBZ r2 = r0.A04
            X.TjN r1 = r0.A05
            X.Xvq r7 = new X.Xvq
            r7.<init>(r2, r1, r6)
        L_0x009e:
            r0.A06 = r7
            r7 = 3
            goto L_0x01d4
        L_0x00a3:
            r1 = 6
            if (r4 != r1) goto L_0x00b8
            X.YBZ r8 = r0.A04
            X.TjN r9 = r0.A05
            r12 = -1
            r1 = 4496(0x1190, float:6.3E-42)
        L_0x00ad:
            java.lang.String r11 = X.AnonymousClass000.A00(r1)
        L_0x00b1:
            X.Xvp r7 = new X.Xvp
            r10 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x009e
        L_0x00b8:
            r1 = 7
            if (r4 != r1) goto L_0x00c3
            X.YBZ r8 = r0.A04
            X.TjN r9 = r0.A05
            r12 = -1
            r1 = 4497(0x1191, float:6.302E-42)
            goto L_0x00ad
        L_0x00c3:
            int r2 = r6.A00
            r1 = 1
            if (r4 == r1) goto L_0x00de
            r1 = 3
            if (r4 == r1) goto L_0x00e5
            r1 = 65534(0xfffe, float:9.1833E-41)
            if (r4 == r1) goto L_0x00de
        L_0x00d0:
            java.lang.String r0 = "Unsupported WAV format type: "
            java.lang.String r4 = X.002.A0O(r0, r4)
            r1 = 0
            r0 = 1
            X.XQX r2 = new X.XQX
            r2.<init>(r4, r1, r0, r3)
            throw r2
        L_0x00de:
            int r12 = androidx.media3.common.util.Util.A00(r2)
            if (r12 == 0) goto L_0x00d0
            goto L_0x00ea
        L_0x00e5:
            r1 = 32
            if (r2 != r1) goto L_0x00d0
            r12 = 4
        L_0x00ea:
            X.YBZ r8 = r0.A04
            X.TjN r9 = r0.A05
            java.lang.String r11 = "audio/raw"
            goto L_0x00b1
        L_0x00f1:
            byte[] r7 = androidx.media3.common.util.Util.A07
            goto L_0x007d
        L_0x00f4:
            java.lang.String r0 = "Top bit not zero: "
            java.lang.IllegalStateException r2 = X.DbW.A0b(r0, r5)
            throw r2
        L_0x00fb:
            java.lang.String r0 = "Top bit not zero: "
            java.lang.IllegalStateException r2 = X.DbW.A0b(r0, r10)
            throw r2
        L_0x0102:
            r6 = 8
            X.SRd r5 = X.Pxe.A0P(r6)
            X.Xmp r7 = X.C21960Xmp.A00(r5, r4)
            int r2 = r7.A00
            r1 = 1685272116(0x64733634, float:1.7945858E22)
            if (r2 == r1) goto L_0x011d
            r4.EI7()
            r5 = -1
        L_0x0118:
            r0.A03 = r5
            r7 = 2
            goto L_0x01d4
        L_0x011d:
            r4.AAu(r6)
            r5.A0O(r3)
            byte[] r1 = r5.A02
            r4.E2F(r1, r3, r6)
            long r5 = r5.A09()
            long r7 = r7.A01
            int r1 = (int) r7
            int r1 = r1 + 8
            r4.Evk(r1)
            goto L_0x0118
        L_0x0135:
            long r8 = r4.Bdl()
            r7 = 1
            r5 = 0
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1Q(r1)
            X.C11366SPh.A02(r1)
            int r2 = r0.A00
            r1 = -1
            if (r2 == r1) goto L_0x0151
            r4.Evk(r2)
            r1 = 4
            r0.A01 = r1
            return r3
        L_0x0151:
            boolean r1 = X.C21511Xdd.A01(r4)
            if (r1 == 0) goto L_0x01d7
            long r5 = r4.BbM()
            long r1 = r4.Bdl()
            long r5 = r5 - r1
            int r1 = (int) r5
            r4.Evk(r1)
            goto L_0x01d4
        L_0x0165:
            r4.EI7()
            r5 = 8
            X.SRd r2 = X.Pxe.A0P(r5)
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            X.Xmp r6 = X.C21511Xdd.A00(r2, r4, r1)
            r4.Evk(r5)
            long r1 = r4.Bdl()
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            long r1 = r6.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            android.util.Pair r1 = android.util.Pair.create(r5, r1)
            int r2 = X.Pxf.A05(r1)
            r0.A00 = r2
            java.lang.Object r1 = r1.second
            long r11 = X.AnonymousClass7TE.A0R(r1)
            long r7 = r0.A03
            r9 = -1
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x01a8
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x01a8
            r11 = r7
        L_0x01a8:
            long r13 = (long) r2
            long r13 = r13 + r11
            r0.A02 = r13
            long r15 = r4.getLength()
            int r1 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x01c7
            int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x01c7
            java.lang.String r11 = "Data exceeds input length: "
            java.lang.String r12 = ", "
            java.lang.String r2 = X.002.A0f(r11, r12, r13, r15)
            java.lang.String r1 = "WavExtractor"
            X.STH.A03(r1, r2)
            r0.A02 = r15
        L_0x01c7:
            X.YAO r5 = r0.A06
            r5.getClass()
            int r4 = r0.A00
            long r1 = r0.A02
            r5.CMR(r4, r1)
            r7 = 4
        L_0x01d4:
            r0.A01 = r7
            return r3
        L_0x01d7:
            r1 = 0
            java.lang.String r0 = "Unsupported or unrecognized wav file type."
            X.XQX r2 = new X.XQX
            r2.<init>(r0, r1, r7, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22102XvS.E67(X.TlA, X.XYr):int");
    }

    public final void EKu(long j, long j2) {
        int i = 4;
        if (j == 0) {
            i = 0;
        }
        this.A01 = i;
        YAO yao = this.A06;
        if (yao != null) {
            yao.EHr(j2);
        }
    }

    public final boolean Evx(C13910TlA tlA) {
        return C21511Xdd.A01(tlA);
    }
}
