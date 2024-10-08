package X;

/* renamed from: X.XvU  reason: case insensitive filesystem */
public final class C22104XvU implements C13809Thc {
    public YBZ A00;
    public C21472Xc5 A01;
    public boolean A02;

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    private boolean A00(C13910TlA tlA) {
        C21472Xc5 xc5;
        C21487Xce xce = new C21487Xce();
        if (xce.A01(tlA, true) && (xce.A03 & 2) == 2) {
            int min = Math.min(xce.A00, 8);
            C11389SRd A0P = Pxe.A0P(min);
            tlA.E2F(A0P.A02, 0, min);
            A0P.A0O(0);
            if (Pxe.A06(A0P) >= 5 && A0P.A05() == 127 && A0P.A0C() == 1179402563) {
                xc5 = new C21472Xc5();
            } else {
                A0P.A0O(0);
                try {
                    if (C21990XpD.A02(A0P, 1, true)) {
                        xc5 = new C21472Xc5();
                    }
                } catch (XQX unused) {
                }
                A0P.A0O(0);
                if (C21155XGy.A00(A0P, C21155XGy.A02)) {
                    xc5 = new C21472Xc5();
                }
            }
            this.A01 = xc5;
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.YAM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.Xvl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: X.Xvl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: X.Xvl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: X.Xvl} */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.Xvj, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x048f, code lost:
        r23.A00.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0496, code lost:
        r3 = r0.A09.A00;
        r0.A00 = r3.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04a1, code lost:
        if (r0.A0A != false) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04a3, code lost:
        r0.A07.AWO(r3);
        r0.A0A = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04aa, code lost:
        r9 = r0.A09.A01;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04af, code lost:
        if (r9 != null) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04b1, code lost:
        r15 = r24.getLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04b9, code lost:
        if (r15 != -1) goto L_0x04dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04bb, code lost:
        r9 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04c0, code lost:
        r0.A08 = r9;
        r0.A01 = 2;
        r2 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04cb, code lost:
        if (r2.length == 65025) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04cd, code lost:
        r6.A0Q(java.util.Arrays.copyOf(r2, java.lang.Math.max(65025, r6.A00)), r6.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04dc, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04dd, code lost:
        r5 = r5.A03;
        r11 = new X.C22121Xvl(r0, r0.A04, r15, (long) (r5.A01 + r5.A00), r5.A04, X.AnonymousClass7TF.A1P(r5.A03 & 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0642, code lost:
        if (r3 != 3) goto L_0x0644;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        return 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E67(X.C13910TlA r26, X.C21363XYr r27) {
        /*
            r25 = this;
            r4 = r25
            X.YBZ r0 = r4.A00
            X.C11366SPh.A00(r0)
            X.Xc5 r0 = r4.A01
            r24 = r26
            if (r0 != 0) goto L_0x0018
            r0 = r24
            boolean r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x06ca
            r24.EI7()
        L_0x0018:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0036
            X.YBZ r1 = r4.A00
            r0 = 0
            r3 = 1
            X.TjN r2 = r1.FHV(r0, r3)
            X.YBZ r0 = r4.A00
            r0.ASU()
            X.Xc5 r1 = r4.A01
            X.YBZ r0 = r4.A00
            r1.A06 = r0
            r1.A07 = r2
            r1.A01(r3)
            r4.A02 = r3
        L_0x0036:
            X.Xc5 r0 = r4.A01
            X.TjN r1 = r0.A07
            X.C11366SPh.A00(r1)
            int r1 = r0.A01
            if (r1 == 0) goto L_0x005b
            r7 = 1
            r9 = 2
            if (r1 == r7) goto L_0x0672
            if (r1 != r9) goto L_0x06c8
            X.YAM r2 = r0.A08
            r1 = r24
            long r3 = r2.E6B(r1)
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x04fe
            r0 = r27
            r0.A00 = r3
            r10 = 1
        L_0x005a:
            return r10
        L_0x005b:
            X.Xbs r5 = r0.A0C
            r1 = r24
            boolean r1 = r5.A00(r1)
            if (r1 == 0) goto L_0x06c5
            long r1 = r24.Bdl()
            long r3 = r0.A04
            long r1 = r1 - r3
            r0.A03 = r1
            X.SRd r6 = r5.A02
            X.XZl r1 = r0.A09
            r23 = r1
            boolean r1 = r0 instanceof X.XGx
            if (r1 == 0) goto L_0x03bb
            r1 = r0
            X.XGx r1 = (X.XGx) r1
            r22 = r1
            X.Xak r1 = r1.A03
            if (r1 != 0) goto L_0x048f
            r1 = r22
            X.Xay r1 = r1.A02
            r20 = r1
            r5 = 0
            if (r1 != 0) goto L_0x0131
            r2 = 1
            r1 = 0
            X.C21990XpD.A02(r6, r2, r1)
            int r1 = r6.A02()
            if (r1 < 0) goto L_0x0685
            int r8 = r6.A05()
            int r9 = r6.A02()
            if (r9 < 0) goto L_0x067e
            int r10 = r6.A02()
            if (r10 > 0) goto L_0x00a6
            r10 = -1
        L_0x00a6:
            int r11 = r6.A02()
            if (r11 > 0) goto L_0x00ad
            r11 = -1
        L_0x00ad:
            r6.A02()
            int r7 = r6.A05()
            r1 = r7 & 15
            double r3 = (double) r1
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r1, r3)
            int r12 = (int) r3
            r3 = r7 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> 4
            double r3 = (double) r3
            double r1 = java.lang.Math.pow(r1, r3)
            int r13 = (int) r1
            r6.A05()
            byte[] r2 = r6.A02
            int r1 = r6.A00
            byte[] r7 = java.util.Arrays.copyOf(r2, r1)
            X.Xay r6 = new X.Xay
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r1 = r22
            r1.A02 = r6
        L_0x00dc:
            r1 = r22
            r1.A03 = r5
            if (r5 == 0) goto L_0x0129
            X.Xay r4 = r5.A02
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            byte[] r1 = r4.A06
            r3.add(r1)
            byte[] r1 = r5.A03
            r3.add(r1)
            X.XYs r1 = r5.A01
            java.lang.String[] r1 = r1.A00
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.lang.Object[]) r1)
            androidx.media3.common.Metadata r2 = X.C21990XpD.A00(r1)
            X.SOW r5 = new X.SOW
            r5.<init>()
            r1 = 4500(0x1194, float:6.306E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r5.A01(r1)
            int r1 = r4.A01
            r5.A03 = r1
            int r1 = r4.A00
            r5.A0D = r1
            int r1 = r4.A04
            r5.A04 = r1
            int r1 = r4.A05
            r5.A0G = r1
            r5.A0X = r3
        L_0x011e:
            r5.A0P = r2
        L_0x0120:
            X.SJM r2 = new X.SJM
            r2.<init>(r5)
        L_0x0125:
            r1 = r23
            r1.A00 = r2
        L_0x0129:
            long r1 = r24.Bdl()
            r0.A04 = r1
            goto L_0x005b
        L_0x0131:
            r1 = r22
            X.XYs r1 = r1.A01
            r19 = r1
            if (r1 != 0) goto L_0x0143
            r1 = 1
            X.XYs r2 = X.C21990XpD.A01(r6, r1, r1)
            r1 = r22
            r1.A01 = r2
            goto L_0x00dc
        L_0x0143:
            int r4 = r6.A00
            byte[] r1 = new byte[r4]
            r21 = r1
            byte[] r3 = r6.A02
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r4)
            r1 = r20
            int r1 = r1.A04
            r18 = r1
            r9 = 5
            r11 = 0
            X.C21990XpD.A02(r6, r9, r2)
            int r1 = r6.A05()
            int r13 = r1 + 1
            byte[] r1 = r6.A02
            X.Xd5 r8 = new X.Xd5
            r8.<init>(r1)
            int r1 = r6.A01
            int r1 = r1 * 8
            r8.A01(r1)
            r10 = 0
        L_0x016f:
            if (r10 >= r13) goto L_0x01f9
            r3 = 24
            int r2 = r8.A00(r3)
            r1 = 5653314(0x564342, float:7.92198E-39)
            if (r2 != r1) goto L_0x068c
            r1 = 16
            int r6 = r8.A00(r1)
            int r7 = r8.A00(r3)
            boolean r1 = r8.A02()
            r3 = 0
            if (r1 != 0) goto L_0x01a1
            boolean r2 = r8.A02()
        L_0x0191:
            if (r3 >= r7) goto L_0x01b6
            if (r2 == 0) goto L_0x019b
            boolean r1 = r8.A02()
            if (r1 == 0) goto L_0x019e
        L_0x019b:
            r8.A01(r9)
        L_0x019e:
            int r3 = r3 + 1
            goto L_0x0191
        L_0x01a1:
            r8.A01(r9)
        L_0x01a4:
            if (r3 >= r7) goto L_0x01b6
            int r2 = r7 - r3
            r1 = 0
        L_0x01a9:
            if (r2 <= 0) goto L_0x01b0
            int r1 = r1 + 1
            int r2 = r2 >>> 1
            goto L_0x01a9
        L_0x01b0:
            int r1 = r8.A00(r1)
            int r3 = r3 + r1
            goto L_0x01a4
        L_0x01b6:
            r4 = 4
            int r1 = r8.A00(r4)
            r2 = 2
            if (r1 > r2) goto L_0x06b0
            r3 = 1
            if (r1 == r3) goto L_0x01c3
            if (r1 != r2) goto L_0x01ee
        L_0x01c3:
            r2 = 32
            r8.A01(r2)
            r8.A01(r2)
            int r2 = r8.A00(r4)
            int r12 = r2 + 1
            r8.A01(r3)
            if (r1 != r3) goto L_0x01f5
            if (r6 == 0) goto L_0x01f2
            long r3 = (long) r7
            long r1 = (long) r6
            double r6 = (double) r3
            double r3 = (double) r1
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r1 / r3
            double r1 = java.lang.Math.pow(r6, r1)
            double r1 = java.lang.Math.floor(r1)
            long r3 = (long) r1
        L_0x01e8:
            long r1 = (long) r12
            long r3 = r3 * r1
            int r1 = (int) r3
            r8.A01(r1)
        L_0x01ee:
            int r10 = r10 + 1
            goto L_0x016f
        L_0x01f2:
            r3 = 0
            goto L_0x01e8
        L_0x01f5:
            long r1 = (long) r7
            long r3 = (long) r6
            long r3 = r3 * r1
            goto L_0x01e8
        L_0x01f9:
            r1 = 6
            int r1 = r8.A00(r1)
            int r2 = r1 + 1
        L_0x0200:
            if (r11 >= r2) goto L_0x020d
            r1 = 16
            int r1 = r8.A00(r1)
            if (r1 != 0) goto L_0x069d
            int r11 = r11 + 1
            goto L_0x0200
        L_0x020d:
            r6 = 6
            int r1 = r8.A00(r6)
            r7 = 1
            int r17 = r1 + 1
            r10 = 0
        L_0x0216:
            r1 = r17
            if (r10 >= r1) goto L_0x02a3
            r2 = 16
            int r1 = r8.A00(r2)
            r15 = 4
            r3 = 8
            if (r1 == 0) goto L_0x0281
            if (r1 != r7) goto L_0x06a0
            int r14 = r8.A00(r9)
            r4 = -1
            int[] r13 = new int[r14]
            r2 = 0
        L_0x022f:
            if (r2 >= r14) goto L_0x023d
            int r1 = r8.A00(r15)
            r13[r2] = r1
            if (r1 <= r4) goto L_0x023a
            r4 = r1
        L_0x023a:
            int r2 = r2 + 1
            goto L_0x022f
        L_0x023d:
            int r11 = r4 + 1
            int[] r12 = new int[r11]
            r4 = 0
        L_0x0242:
            r2 = 2
            if (r4 >= r11) goto L_0x0265
            r1 = 3
            int r1 = r8.A00(r1)
            int r1 = r1 + 1
            r12[r4] = r1
            int r16 = r8.A00(r2)
            if (r16 <= 0) goto L_0x0257
            r8.A01(r3)
        L_0x0257:
            r2 = 0
        L_0x0258:
            int r1 = r7 << r16
            if (r2 >= r1) goto L_0x0262
            r8.A01(r3)
            int r2 = r2 + 1
            goto L_0x0258
        L_0x0262:
            int r4 = r4 + 1
            goto L_0x0242
        L_0x0265:
            r8.A01(r2)
            int r11 = r8.A00(r15)
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x026f:
            if (r4 >= r14) goto L_0x029f
            r1 = r13[r4]
            r1 = r12[r1]
            int r3 = r3 + r1
        L_0x0276:
            if (r2 >= r3) goto L_0x027e
            r8.A01(r11)
            int r2 = r2 + 1
            goto L_0x0276
        L_0x027e:
            int r4 = r4 + 1
            goto L_0x026f
        L_0x0281:
            r8.A01(r3)
            r8.A01(r2)
            r8.A01(r2)
            r8.A01(r6)
            r8.A01(r3)
            int r1 = r8.A00(r15)
            int r2 = r1 + 1
            r1 = 0
        L_0x0297:
            if (r1 >= r2) goto L_0x029f
            r8.A01(r3)
            int r1 = r1 + 1
            goto L_0x0297
        L_0x029f:
            int r10 = r10 + 1
            goto L_0x0216
        L_0x02a3:
            r14 = 6
            int r1 = r8.A00(r6)
            int r13 = r1 + 1
            r12 = 0
        L_0x02ab:
            if (r12 >= r13) goto L_0x0302
            r1 = 16
            int r2 = r8.A00(r1)
            r1 = 2
            if (r2 > r1) goto L_0x06a7
            r1 = 24
            r8.A01(r1)
            r8.A01(r1)
            r8.A01(r1)
            int r1 = r8.A00(r14)
            int r11 = r1 + 1
            r10 = 8
            r8.A01(r10)
            int[] r6 = new int[r11]
            r3 = 0
        L_0x02cf:
            if (r3 >= r11) goto L_0x02ea
            r1 = 3
            int r2 = r8.A00(r1)
            boolean r1 = r8.A02()
            if (r1 == 0) goto L_0x02e8
            int r1 = r8.A00(r9)
        L_0x02e0:
            int r1 = r1 * 8
            int r1 = r1 + r2
            r6[r3] = r1
            int r3 = r3 + 1
            goto L_0x02cf
        L_0x02e8:
            r1 = 0
            goto L_0x02e0
        L_0x02ea:
            r4 = 0
        L_0x02eb:
            if (r4 >= r11) goto L_0x02ff
            r3 = 0
        L_0x02ee:
            r2 = r6[r4]
            int r1 = r7 << r3
            r2 = r2 & r1
            if (r2 == 0) goto L_0x02f8
            r8.A01(r10)
        L_0x02f8:
            int r3 = r3 + 1
            if (r3 < r10) goto L_0x02ee
            int r4 = r4 + 1
            goto L_0x02eb
        L_0x02ff:
            int r12 = r12 + 1
            goto L_0x02ab
        L_0x0302:
            int r1 = r8.A00(r14)
            int r10 = r1 + 1
            r9 = 0
        L_0x0309:
            if (r9 >= r10) goto L_0x0377
            r1 = 16
            int r2 = r8.A00(r1)
            if (r2 == 0) goto L_0x0321
            java.lang.String r1 = "mapping type other than 0 not supported: "
            java.lang.String r2 = X.002.A0O(r1, r2)
            java.lang.String r1 = "VorbisUtil"
            X.STH.A02(r1, r2)
        L_0x031e:
            int r9 = r9 + 1
            goto L_0x0309
        L_0x0321:
            boolean r1 = r8.A02()
            r11 = 4
            if (r1 == 0) goto L_0x0352
            int r1 = r8.A00(r11)
            int r6 = r1 + 1
        L_0x032e:
            boolean r1 = r8.A02()
            r4 = 8
            if (r1 == 0) goto L_0x0354
            int r1 = r8.A00(r4)
            int r12 = r1 + 1
            r3 = 0
        L_0x033d:
            if (r3 >= r12) goto L_0x0354
            int r2 = r18 + -1
            r1 = 0
        L_0x0342:
            if (r2 <= 0) goto L_0x0349
            int r1 = r1 + 1
            int r2 = r2 >>> 1
            goto L_0x0342
        L_0x0349:
            r8.A01(r1)
            r8.A01(r1)
            int r3 = r3 + 1
            goto L_0x033d
        L_0x0352:
            r6 = 1
            goto L_0x032e
        L_0x0354:
            r1 = 2
            int r1 = r8.A00(r1)
            if (r1 != 0) goto L_0x06aa
            if (r6 <= r7) goto L_0x0368
            r2 = 0
        L_0x035e:
            r1 = r18
            if (r2 >= r1) goto L_0x0368
            r8.A01(r11)
            int r2 = r2 + 1
            goto L_0x035e
        L_0x0368:
            r1 = 0
        L_0x0369:
            if (r1 >= r6) goto L_0x031e
            r8.A01(r4)
            r8.A01(r4)
            r8.A01(r4)
            int r1 = r1 + 1
            goto L_0x0369
        L_0x0377:
            int r1 = r8.A00(r14)
            int r6 = r1 + 1
            X.XYt[] r4 = new X.C21365XYt[r6]
            r3 = 0
        L_0x0380:
            if (r3 >= r6) goto L_0x039d
            boolean r2 = r8.A02()
            r1 = 16
            r8.A00(r1)
            r8.A00(r1)
            r1 = 8
            r8.A00(r1)
            X.XYt r1 = new X.XYt
            r1.<init>(r2)
            r4[r3] = r1
            int r3 = r3 + 1
            goto L_0x0380
        L_0x039d:
            boolean r1 = r8.A02()
            if (r1 == 0) goto L_0x06ad
            int r1 = r6 + -1
            r10 = 0
        L_0x03a6:
            if (r1 <= 0) goto L_0x03ad
            int r10 = r10 + 1
            int r1 = r1 >>> 1
            goto L_0x03a6
        L_0x03ad:
            X.Xak r5 = new X.Xak
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x00dc
        L_0x03bb:
            boolean r1 = r0 instanceof X.C21155XGy
            if (r1 == 0) goto L_0x043c
            r7 = r0
            X.XGy r7 = (X.C21155XGy) r7
            byte[] r1 = X.C21155XGy.A02
            boolean r1 = X.C21155XGy.A00(r6, r1)
            r4 = 1
            if (r1 == 0) goto L_0x03f8
            byte[] r2 = r6.A02
            int r1 = r6.A00
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)
            r1 = 9
            byte r1 = r2[r1]
            r3 = r1 & 255(0xff, float:3.57E-43)
            java.util.ArrayList r2 = X.RS3.A00(r2)
            r1 = r23
            X.SJM r1 = r1.A00
            if (r1 != 0) goto L_0x0129
            X.SOW r5 = new X.SOW
            r5.<init>()
            java.lang.String r1 = "audio/opus"
            r5.A01(r1)
            r5.A04 = r3
            r1 = 48000(0xbb80, float:6.7262E-41)
            r5.A0G = r1
            r5.A0X = r2
            goto L_0x0120
        L_0x03f8:
            byte[] r1 = X.C21155XGy.A01
            boolean r3 = X.C21155XGy.A00(r6, r1)
            r2 = 0
            r1 = r23
            X.SJM r1 = r1.A00
            if (r3 == 0) goto L_0x0438
            X.C11366SPh.A00(r1)
            boolean r1 = r7.A00
            if (r1 != 0) goto L_0x0129
            r7.A00 = r4
            r1 = 8
            r6.A0P(r1)
            X.XYs r1 = X.C21990XpD.A01(r6, r2, r2)
            java.lang.String[] r1 = r1.A00
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.lang.Object[]) r1)
            androidx.media3.common.Metadata r2 = X.C21990XpD.A00(r1)
            if (r2 == 0) goto L_0x0129
            r1 = r23
            X.SJM r1 = r1.A00
            X.SOW r5 = new X.SOW
            r5.<init>(r1)
            androidx.media3.common.Metadata r1 = r1.A0R
            if (r1 == 0) goto L_0x011e
            androidx.media3.common.Metadata$Entry[] r1 = r1.A01
            androidx.media3.common.Metadata r2 = r2.A00(r1)
            goto L_0x011e
        L_0x0438:
            X.C11366SPh.A00(r1)
            goto L_0x0496
        L_0x043c:
            r8 = r0
            X.XGw r8 = (X.XGw) r8
            byte[] r7 = r6.A02
            X.XrB r9 = r8.A00
            if (r9 != 0) goto L_0x045d
            r1 = 17
            X.XrB r3 = new X.XrB
            r3.<init>(r7, r1)
            r8.A00 = r3
            r2 = 9
            int r1 = r6.A00
            byte[] r2 = java.util.Arrays.copyOfRange(r7, r2, r1)
            r1 = 0
            X.SJM r2 = r3.A02(r1, r2)
            goto L_0x0125
        L_0x045d:
            r1 = 0
            byte r7 = r7[r1]
            r2 = r7 & 127(0x7f, float:1.78E-43)
            r1 = 3
            if (r2 != r1) goto L_0x0482
            X.XZj r2 = X.XUG.A00(r6)
            X.XrB r1 = r9.A03(r2)
            r8.A00 = r1
            X.Xvj r3 = new X.Xvj
            r3.<init>()
            r3.A03 = r1
            r3.A02 = r2
            r1 = -1
            r3.A00 = r1
            r3.A01 = r1
            r8.A01 = r3
            goto L_0x0129
        L_0x0482:
            r1 = -1
            if (r7 != r1) goto L_0x0129
            X.Xvj r2 = r8.A01
            if (r2 == 0) goto L_0x048f
            r2.A00 = r3
            r1 = r23
            r1.A01 = r2
        L_0x048f:
            r1 = r23
            X.SJM r1 = r1.A00
            r1.getClass()
        L_0x0496:
            X.XZl r1 = r0.A09
            X.SJM r3 = r1.A00
            int r1 = r3.A0I
            r0.A00 = r1
            boolean r1 = r0.A0A
            r2 = 1
            if (r1 != 0) goto L_0x04aa
            X.TjN r1 = r0.A07
            r1.AWO(r3)
            r0.A0A = r2
        L_0x04aa:
            X.XZl r1 = r0.A09
            X.YAM r9 = r1.A01
            r10 = 0
            if (r9 != 0) goto L_0x04c0
            long r15 = r24.getLength()
            r2 = -1
            int r1 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x04dd
            X.Xvk r9 = new X.Xvk
            r9.<init>()
        L_0x04c0:
            r0.A08 = r9
            r1 = 2
            r0.A01 = r1
            byte[] r2 = r6.A02
            int r0 = r2.length
            r1 = 65025(0xfe01, float:9.112E-41)
            if (r0 == r1) goto L_0x005a
            int r0 = r6.A00
            int r0 = java.lang.Math.max(r1, r0)
            byte[] r1 = java.util.Arrays.copyOf(r2, r0)
            int r0 = r6.A00
            r6.A0Q(r1, r0)
            return r10
        L_0x04dd:
            X.Xce r5 = r5.A03
            int r1 = r5.A03
            r1 = r1 & 4
            boolean r21 = X.AnonymousClass7TF.A1P(r1)
            long r7 = r0.A04
            int r2 = r5.A01
            int r1 = r5.A00
            int r2 = r2 + r1
            long r3 = (long) r2
            long r1 = r5.A04
            X.Xvl r9 = new X.Xvl
            r11 = r9
            r12 = r0
            r13 = r7
            r17 = r3
            r19 = r1
            r11.<init>(r12, r13, r15, r17, r19, r21)
            goto L_0x04c0
        L_0x04fe:
            r13 = -1
            int r1 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x0522
            r1 = 2
            long r3 = r3 + r1
            long r1 = -r3
            boolean r3 = r0 instanceof X.XGx
            if (r3 == 0) goto L_0x066e
            r8 = r0
            X.XGx r8 = (X.XGx) r8
            r8.A02 = r1
            r4 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1P(r3)
            r8.A04 = r1
            X.Xay r1 = r8.A02
            if (r1 == 0) goto L_0x0520
            int r4 = r1.A02
        L_0x0520:
            r8.A00 = r4
        L_0x0522:
            boolean r1 = r0.A0B
            if (r1 != 0) goto L_0x0536
            X.YAM r1 = r0.A08
            X.Tbc r2 = r1.AMz()
            X.C11366SPh.A00(r2)
            X.YBZ r1 = r0.A06
            r1.EKw(r2)
            r0.A0B = r7
        L_0x0536:
            long r1 = r0.A03
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0546
            X.Xbs r2 = r0.A0C
            r1 = r24
            boolean r1 = r2.A00(r1)
            if (r1 == 0) goto L_0x06c5
        L_0x0546:
            r0.A03 = r5
            X.Xbs r1 = r0.A0C
            X.SRd r8 = r1.A02
            boolean r1 = r0 instanceof X.XGx
            if (r1 == 0) goto L_0x0604
            r10 = r0
            X.XGx r10 = (X.XGx) r10
            byte[] r9 = r8.A02
            r3 = 0
            byte r11 = r9[r3]
            r1 = r11 & 1
            if (r1 == r7) goto L_0x066b
            X.Xak r4 = r10.A03
            X.C11366SPh.A00(r4)
            int r1 = r4.A00
            int r11 = r11 >> r7
            int r2 = 8 - r1
            r1 = 255(0xff, float:3.57E-43)
            int r1 = r1 >>> r2
            r11 = r11 & r1
            X.XYt[] r1 = r4.A04
            r1 = r1[r11]
            boolean r2 = r1.A00
            X.Xay r1 = r4.A02
            if (r2 != 0) goto L_0x0600
            int r12 = r1.A02
        L_0x0576:
            boolean r1 = r10.A04
            if (r1 == 0) goto L_0x057f
            int r1 = r10.A00
            int r1 = r1 + r12
            int r3 = r1 / 4
        L_0x057f:
            long r1 = (long) r3
            int r4 = r9.length
            int r3 = r8.A00
            int r3 = r3 + 4
            if (r4 >= r3) goto L_0x05fc
            byte[] r4 = java.util.Arrays.copyOf(r9, r3)
            int r3 = r4.length
            r8.A0Q(r4, r3)
        L_0x058f:
            byte[] r9 = r8.A02
            int r11 = r8.A00
            int r16 = r11 + -4
            r17 = 255(0xff, double:1.26E-321)
            long r3 = r1 & r17
            int r15 = (int) r3
            byte r3 = (byte) r15
            r9[r16] = r3
            int r16 = r11 + -3
            r3 = 8
            long r3 = r1 >>> r3
            long r3 = r3 & r17
            int r15 = (int) r3
            byte r3 = (byte) r15
            r9[r16] = r3
            int r16 = r11 + -2
            r3 = 16
            long r3 = r1 >>> r3
            long r3 = r3 & r17
            int r15 = (int) r3
            byte r3 = (byte) r15
            r9[r16] = r3
            int r15 = r11 + -1
            r3 = 24
            long r3 = r1 >>> r3
            long r3 = r3 & r17
            int r11 = (int) r3
            byte r3 = (byte) r11
            r9[r15] = r3
            r10.A04 = r7
            r10.A00 = r12
        L_0x05c5:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x05f5
            long r3 = r0.A02
            long r10 = r3 + r1
            long r5 = r0.A05
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x05f5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r5
            int r5 = r0.A00
            long r5 = (long) r5
            long r3 = r3 / r5
            X.TjN r6 = r0.A07
            int r5 = r8.A00
            r6.EJf(r8, r5)
            X.TjN r15 = r0.A07
            int r5 = r8.A00
            r19 = 0
            r16 = 0
            r17 = r7
            r18 = r5
            r20 = r3
            r15.EJm(r16, r17, r18, r19, r20)
            r0.A05 = r13
        L_0x05f5:
            long r3 = r0.A02
            long r3 = r3 + r1
            r0.A02 = r3
            goto L_0x067c
        L_0x05fc:
            r8.A0N(r3)
            goto L_0x058f
        L_0x0600:
            int r12 = r1.A03
            goto L_0x0576
        L_0x0604:
            boolean r1 = r0 instanceof X.C21155XGy
            byte[] r10 = r8.A02
            if (r1 == 0) goto L_0x0649
            r3 = 0
            byte r2 = r10[r3]
            int r1 = r10.length
            if (r1 <= r7) goto L_0x0612
            byte r3 = r10[r7]
        L_0x0612:
            r11 = r2 & 255(0xff, float:3.57E-43)
            r1 = r11 & 3
            r10 = 2
            if (r1 == 0) goto L_0x0647
            if (r1 == r7) goto L_0x061f
            if (r1 == r9) goto L_0x061f
            r10 = r3 & 63
        L_0x061f:
            r4 = 3
            int r11 = r11 >> r4
            r3 = r11 & 3
            r1 = 16
            r2 = 2500(0x9c4, float:3.503E-42)
            if (r11 >= r1) goto L_0x0644
            r1 = 12
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r11 < r1) goto L_0x063f
            r1 = r3 & 1
            int r1 = r2 << r1
        L_0x0633:
            long r3 = (long) r10
            long r1 = (long) r1
            long r3 = r3 * r1
            int r1 = r0.A00
            long r1 = (long) r1
            long r1 = r1 * r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r3
            goto L_0x05c5
        L_0x063f:
            r1 = 60000(0xea60, float:8.4078E-41)
            if (r3 == r4) goto L_0x0633
        L_0x0644:
            int r1 = r2 << r3
            goto L_0x0633
        L_0x0647:
            r10 = 1
            goto L_0x061f
        L_0x0649:
            r4 = 0
            byte r2 = r10[r4]
            r1 = -1
            if (r2 != r1) goto L_0x066b
            byte r1 = r10[r9]
            r3 = r1 & 255(0xff, float:3.57E-43)
            r2 = 4
            int r3 = r3 >> r2
            r1 = 6
            if (r3 == r1) goto L_0x065b
            r1 = 7
            if (r3 != r1) goto L_0x0661
        L_0x065b:
            r8.A0P(r2)
            r8.A0E()
        L_0x0661:
            int r1 = X.C21510Xdc.A00(r8, r3)
            r8.A0O(r4)
            long r1 = (long) r1
            goto L_0x05c5
        L_0x066b:
            r1 = -1
            goto L_0x05f5
        L_0x066e:
            r0.A02 = r1
            goto L_0x0522
        L_0x0672:
            long r3 = r0.A04
            int r2 = (int) r3
            r1 = r24
            r1.Evk(r2)
            r0.A01 = r9
        L_0x067c:
            r10 = 0
            return r10
        L_0x067e:
            java.lang.String r0 = "Top bit not zero: "
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r9)
            throw r0
        L_0x0685:
            java.lang.String r0 = "Top bit not zero: "
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r1)
            throw r0
        L_0x068c:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r2.append(r0)
            int r0 = r8.A01
            int r1 = r0 * 8
            int r0 = r8.A00
            int r1 = r1 + r0
            goto L_0x06b9
        L_0x069d:
            java.lang.String r0 = "placeholder of time domain transforms not zeroed out"
            goto L_0x06c0
        L_0x06a0:
            java.lang.String r0 = "floor type greater than 1 not decodable: "
            java.lang.String r0 = X.002.A0O(r0, r1)
            goto L_0x06c0
        L_0x06a7:
            java.lang.String r0 = "residueType greater than 2 is not decodable"
            goto L_0x06c0
        L_0x06aa:
            java.lang.String r0 = "to reserved bits must be zero after mapping coupling steps"
            goto L_0x06c0
        L_0x06ad:
            java.lang.String r0 = "framing bit after modes not set as expected"
            goto L_0x06c0
        L_0x06b0:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "lookup type greater than 2 not decodable: "
            r2.append(r0)
        L_0x06b9:
            r2.append(r1)
            java.lang.String r0 = r2.toString()
        L_0x06c0:
            X.XQX r0 = X.Pxf.A0L(r0, r5)
            throw r0
        L_0x06c5:
            r1 = 3
            r0.A01 = r1
        L_0x06c8:
            r10 = -1
            return r10
        L_0x06ca:
            r1 = 0
            java.lang.String r0 = "Failed to determine bitstream type"
            X.XQX r0 = X.Pxf.A0L(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22104XvU.E67(X.TlA, X.XYr):int");
    }

    public final void EKu(long j, long j2) {
        C21472Xc5 xc5 = this.A01;
        if (xc5 != null) {
            C21463Xbs xbs = xc5.A0C;
            C21487Xce xce = xbs.A03;
            xce.A03 = 0;
            xce.A04 = 0;
            xce.A02 = 0;
            xce.A01 = 0;
            xce.A00 = 0;
            xbs.A02.A0M(0);
            xbs.A00 = -1;
            xbs.A01 = false;
            if (j == 0) {
                xc5.A01(!xc5.A0B);
            } else if (xc5.A01 != 0) {
                long j3 = (((long) xc5.A00) * j2) / 1000000;
                xc5.A05 = j3;
                xc5.A08.Exb(j3);
                xc5.A01 = 2;
            }
        }
    }

    public final boolean Evx(C13910TlA tlA) {
        try {
            return A00(tlA);
        } catch (XQX unused) {
            return false;
        }
    }

    public final void CMU(YBZ ybz) {
        this.A00 = ybz;
    }
}
