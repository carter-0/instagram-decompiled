package X;

import androidx.media3.common.util.Util;

/* renamed from: X.XvV  reason: case insensitive filesystem */
public final class C22105XvV implements C13809Thc {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public YBZ A04;
    public C22116Xvg A05;
    public C21471Xc3 A06;
    public boolean A07;
    public C21471Xc3[] A08;
    public int A09;
    public int A0A;
    public int A0B;
    public final C11389SRd A0C;
    public final C21377XZk A0D;
    public final C13890TjD A0E;
    public final boolean A0F;

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final void CMU(YBZ ybz) {
        this.A0B = 0;
        if (this.A0F) {
            ybz = new C11703Sf0(ybz, this.A0E);
        }
        this.A04 = ybz;
        this.A03 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02b3, code lost:
        r8.A0B = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b5, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03a6, code lost:
        r8.A03 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03a8, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0225, code lost:
        r1 = X.Pxg.A0t(r0, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0235, code lost:
        throw new X.XQX(r1, (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E67(X.C13910TlA r23, X.C21363XYr r24) {
        /*
            r22 = this;
            r8 = r22
            long r5 = r8.A03
            r0 = -1
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r4 = r23
            if (r2 == 0) goto L_0x0021
            long r11 = r4.Bdl()
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x0028
            r9 = 262144(0x40000, double:1.295163E-318)
            long r9 = r9 + r11
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0028
            long r5 = r5 - r11
            int r2 = (int) r5
            r4.Evk(r2)
        L_0x0021:
            r2 = 0
        L_0x0022:
            r8.A03 = r0
            r10 = 1
            if (r2 == 0) goto L_0x002e
            return r10
        L_0x0028:
            r2 = r24
            r2.A00 = r5
            r2 = 1
            goto L_0x0022
        L_0x002e:
            int r2 = r8.A0B
            r14 = 0
            r5 = 6
            r6 = 4
            r9 = 12
            r7 = 0
            switch(r2) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x01ed;
                case 2: goto L_0x0103;
                case 3: goto L_0x0236;
                case 4: goto L_0x0381;
                case 5: goto L_0x02bf;
                default: goto L_0x0039;
            }
        L_0x0039:
            long r12 = r4.Bdl()
            long r0 = r8.A01
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0045
            r11 = -1
        L_0x0044:
            return r11
        L_0x0045:
            X.Xc3 r5 = r8.A06
            r11 = 0
            if (r5 == 0) goto L_0x0084
            int r1 = r5.A00
            X.TjN r13 = r5.A0B
            int r0 = r13.EJe(r4, r1, r7)
            int r1 = r1 - r0
            r5.A00 = r1
            if (r1 != 0) goto L_0x0044
            int r0 = r5.A02
            if (r0 <= 0) goto L_0x007a
            int r4 = r5.A01
            long r0 = r5.A0A
            long r2 = (long) r4
            long r0 = r0 * r2
            int r2 = r5.A09
            long r2 = (long) r2
            long r0 = r0 / r2
            int[] r2 = r5.A05
            int r2 = java.util.Arrays.binarySearch(r2, r4)
            boolean r15 = X.Pxf.A1R(r2)
            int r2 = r5.A02
            r18 = r0
            r17 = r7
            r16 = r2
            r13.EJm(r14, r15, r16, r17, r18)
        L_0x007a:
            int r0 = r5.A01
            int r0 = r0 + 1
            r5.A01 = r0
            r1 = 0
        L_0x0081:
            r8.A06 = r1
            return r11
        L_0x0084:
            r1 = 1
            long r12 = r12 & r1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x008e
            r4.Evk(r10)
        L_0x008e:
            X.SRd r3 = r8.A0C
            byte[] r0 = r3.A02
            r2 = 12
            r4.E2F(r0, r7, r9)
            r3.A0O(r7)
            int r7 = r3.A02()
            r0 = 1414744396(0x5453494c, float:3.62987127E12)
            r1 = 8
            if (r7 != r0) goto L_0x00ba
            r3.A0O(r1)
            int r1 = r3.A02()
            r0 = 1769369453(0x69766f6d, float:1.8620122E25)
            if (r1 == r0) goto L_0x00b3
            r2 = 8
        L_0x00b3:
            r4.Evk(r2)
            r4.EI7()
            return r11
        L_0x00ba:
            int r6 = r3.A02()
            r0 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r7 != r0) goto L_0x00cf
            long r2 = r4.Bdl()
            long r0 = (long) r6
            long r2 = r2 + r0
            r0 = 8
        L_0x00cb:
            long r2 = r2 + r0
            r8.A03 = r2
            return r11
        L_0x00cf:
            r4.Evk(r1)
            r4.EI7()
            X.Xc3[] r5 = r8.A08
            int r3 = r5.length
            r2 = 0
        L_0x00d9:
            if (r2 >= r3) goto L_0x00e8
            r1 = r5[r2]
            int r0 = r1.A08
            if (r0 == r7) goto L_0x00ee
            int r0 = r1.A07
            if (r0 == r7) goto L_0x00ee
            int r2 = r2 + 1
            goto L_0x00d9
        L_0x00e8:
            long r2 = r4.Bdl()
            long r0 = (long) r6
            goto L_0x00cb
        L_0x00ee:
            r1.A02 = r6
            r1.A00 = r6
            goto L_0x0081
        L_0x00f3:
            boolean r0 = r8.Evx(r4)
            if (r0 == 0) goto L_0x00ff
            r4.Evk(r9)
            r8.A0B = r10
            return r7
        L_0x00ff:
            java.lang.String r1 = "AVI Header List not found"
            goto L_0x0230
        L_0x0103:
            int r2 = r8.A09
            int r2 = r2 - r6
            X.SRd r1 = X.Pxe.A0P(r2)
            byte[] r0 = r1.A02
            r4.readFully(r0, r7, r2)
            r0 = 1819436136(0x6c726468, float:1.1721368E27)
            X.Xvi r4 = X.C22118Xvi.A00(r1, r0)
            int r3 = r4.A00
            if (r3 != r0) goto L_0x021f
            java.lang.Class<X.Xvg> r0 = X.C22116Xvg.class
            X.Y92 r1 = r4.A01(r0)
            X.Xvg r1 = (X.C22116Xvg) r1
            if (r1 == 0) goto L_0x01ea
            r8.A05 = r1
            int r0 = r1.A02
            long r2 = (long) r0
            int r0 = r1.A01
            long r0 = (long) r0
            long r2 = r2 * r0
            r8.A00 = r2
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            com.google.common.collect.ImmutableList r0 = r4.A01
            X.3kO r14 = r0.iterator()
            r6 = 0
        L_0x013a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r5 = r14.next()
            X.Y92 r5 = (X.Y92) r5
            int r1 = r5.getType()
            r0 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r1 != r0) goto L_0x013a
            X.Xvi r5 = (X.C22118Xvi) r5
            int r13 = r6 + 1
            java.lang.Class<X.Xvh> r0 = X.C22117Xvh.class
            X.Y92 r4 = r5.A01(r0)
            X.Xvh r4 = (X.C22117Xvh) r4
            java.lang.Class<X.Xve> r0 = X.C22114Xve.class
            X.Y92 r3 = r5.A01(r0)
            X.Xve r3 = (X.C22114Xve) r3
            java.lang.String r1 = "AviExtractor"
            if (r4 != 0) goto L_0x016e
            java.lang.String r0 = "Missing Stream Header"
        L_0x0169:
            X.STH.A03(r1, r0)
        L_0x016c:
            r6 = r13
            goto L_0x013a
        L_0x016e:
            if (r3 != 0) goto L_0x0173
            java.lang.String r0 = "Missing Stream Format"
            goto L_0x0169
        L_0x0173:
            int r2 = r4.A00
            long r15 = (long) r2
            int r0 = r4.A02
            long r0 = (long) r0
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r11
            int r11 = r4.A01
            long r11 = (long) r11
            r17 = r0
            r19 = r11
            long r0 = androidx.media3.common.util.Util.A06(r15, r17, r19)
            X.SJM r12 = r3.A00
            X.SOW r11 = new X.SOW
            r11.<init>(r12)
            java.lang.String r3 = java.lang.Integer.toString(r6)
            r11.A0T = r3
            int r3 = r4.A04
            if (r3 == 0) goto L_0x019b
            r11.A0A = r3
        L_0x019b:
            java.lang.Class<X.Xvf> r3 = X.C22115Xvf.class
            X.Y92 r3 = r5.A01(r3)
            X.Xvf r3 = (X.C22115Xvf) r3
            if (r3 == 0) goto L_0x01a9
            java.lang.String r3 = r3.A00
            r11.A0U = r3
        L_0x01a9:
            java.lang.String r3 = r12.A0Y
            int r5 = X.SQX.A00(r3)
            if (r5 == r10) goto L_0x01b4
            r3 = 2
            if (r5 != r3) goto L_0x016c
        L_0x01b4:
            X.YBZ r3 = r8.A04
            X.TjN r4 = r3.FHV(r6, r5)
            X.SJM r3 = new X.SJM
            r3.<init>(r11)
            r4.AWO(r3)
            X.Xc3 r3 = new X.Xc3
            r15 = r3
            r16 = r4
            r17 = r6
            r18 = r5
            r19 = r2
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            r8.A00 = r0
            r9.add(r3)
            goto L_0x016c
        L_0x01d8:
            X.Xc3[] r0 = new X.C21471Xc3[r7]
            java.lang.Object[] r0 = r9.toArray(r0)
            X.Xc3[] r0 = (X.C21471Xc3[]) r0
            r8.A08 = r0
            X.YBZ r0 = r8.A04
            r0.ASU()
            r5 = 3
            goto L_0x02b3
        L_0x01ea:
            java.lang.String r1 = "AviHeader not found"
            goto L_0x0230
        L_0x01ed:
            X.SRd r1 = r8.A0C
            byte[] r0 = r1.A02
            r4.readFully(r0, r7, r9)
            r1.A0O(r7)
            X.XZk r0 = r8.A0D
            int r3 = r1.A02()
            r0.A00 = r3
            int r2 = r1.A02()
            r0.A01 = r2
            r0 = 1414744396(0x5453494c, float:3.62987127E12)
            if (r3 != r0) goto L_0x0218
            int r1 = r1.A02()
            r0 = 1819436136(0x6c726468, float:1.1721368E27)
            if (r1 != r0) goto L_0x022a
            r8.A09 = r2
            r5 = 2
            goto L_0x02b3
        L_0x0218:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "LIST expected, found: "
            goto L_0x0225
        L_0x021f:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected header list type "
        L_0x0225:
            java.lang.String r1 = X.Pxg.A0t(r0, r1, r3)
            goto L_0x0230
        L_0x022a:
            java.lang.String r0 = "hdrl expected, found: "
            java.lang.String r1 = X.002.A0O(r0, r1)
        L_0x0230:
            X.XQX r0 = new X.XQX
            r0.<init>(r1, r14, r10, r10)
            throw r0
        L_0x0236:
            long r2 = r8.A02
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x0246
            long r11 = r4.Bdl()
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0246
            goto L_0x03a6
        L_0x0246:
            X.SRd r2 = r8.A0C
            byte[] r0 = r2.A02
            r4.E2F(r0, r7, r9)
            r4.EI7()
            r2.A0O(r7)
            X.XZk r0 = r8.A0D
            int r3 = r2.A02()
            r0.A00 = r3
            int r1 = r2.A02()
            r0.A01 = r1
            int r2 = r2.A02()
            r0 = 1179011410(0x46464952, float:12690.33)
            if (r3 != r0) goto L_0x026e
            r4.Evk(r9)
            return r7
        L_0x026e:
            r0 = 1414744396(0x5453494c, float:3.62987127E12)
            r11 = 8
            if (r3 != r0) goto L_0x02b6
            r0 = 1769369453(0x69766f6d, float:1.8620122E25)
            if (r2 != r0) goto L_0x02b6
            long r2 = r4.Bdl()
            r8.A02 = r2
            long r0 = (long) r1
            long r2 = r2 + r0
            long r2 = r2 + r11
            r8.A01 = r2
            boolean r0 = r8.A07
            if (r0 != 0) goto L_0x02aa
            X.Xvg r0 = r8.A05
            r0.getClass()
            int r0 = r0.A00
            r1 = 16
            r0 = r0 & 16
            if (r0 != r1) goto L_0x029c
            r8.A0B = r6
            long r2 = r8.A01
            goto L_0x03a6
        L_0x029c:
            X.YBZ r3 = r8.A04
            long r0 = r8.A00
            X.Sf7 r2 = new X.Sf7
            r2.<init>(r0)
            r3.EKw(r2)
            r8.A07 = r10
        L_0x02aa:
            long r2 = r4.Bdl()
            r0 = 12
            long r2 = r2 + r0
            r8.A03 = r2
        L_0x02b3:
            r8.A0B = r5
            return r7
        L_0x02b6:
            long r2 = r4.Bdl()
            long r0 = (long) r1
            long r2 = r2 + r0
            long r2 = r2 + r11
            goto L_0x03a6
        L_0x02bf:
            int r1 = r8.A0A
            X.SRd r6 = X.Pxe.A0P(r1)
            byte[] r0 = r6.A02
            r4.readFully(r0, r7, r1)
            int r0 = r6.A00
            int r13 = r6.A01
            int r0 = r0 - r13
            r11 = 0
            r9 = 16
            if (r0 < r9) goto L_0x02eb
            r0 = 8
            r6.A0P(r0)
            int r0 = r6.A02()
            long r2 = (long) r0
            long r0 = r8.A02
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x02e8
            r11 = 8
            long r11 = r11 + r0
        L_0x02e8:
            r6.A0O(r13)
        L_0x02eb:
            int r0 = X.Pxe.A06(r6)
            if (r0 < r9) goto L_0x034f
            int r15 = r6.A02()
            int r16 = r6.A02()
            int r0 = r6.A02()
            long r0 = (long) r0
            long r0 = r0 + r11
            r6.A02()
            X.Xc3[] r14 = r8.A08
            int r13 = r14.length
            r4 = 0
        L_0x0306:
            if (r4 >= r13) goto L_0x02eb
            r3 = r14[r4]
            int r2 = r3.A08
            if (r2 == r15) goto L_0x0315
            int r2 = r3.A07
            if (r2 == r15) goto L_0x0315
            int r4 = r4 + 1
            goto L_0x0306
        L_0x0315:
            r2 = r16 & 16
            if (r2 != r9) goto L_0x0348
            int r4 = r3.A04
            int[] r13 = r3.A05
            int r2 = r13.length
            if (r4 != r2) goto L_0x033a
            long[] r4 = r3.A06
            int r2 = r4.length
            int r2 = r2 * 3
            int r2 = r2 / 2
            long[] r2 = java.util.Arrays.copyOf(r4, r2)
            r3.A06 = r2
            int[] r4 = r3.A05
            int r2 = r4.length
            int r2 = r2 * 3
            int r2 = r2 / 2
            int[] r13 = java.util.Arrays.copyOf(r4, r2)
            r3.A05 = r13
        L_0x033a:
            long[] r4 = r3.A06
            int r2 = r3.A04
            r4[r2] = r0
            int r0 = r3.A03
            r13[r2] = r0
            int r0 = r2 + 1
            r3.A04 = r0
        L_0x0348:
            int r0 = r3.A03
            int r0 = r0 + 1
            r3.A03 = r0
            goto L_0x02eb
        L_0x034f:
            X.Xc3[] r6 = r8.A08
            int r4 = r6.length
            r3 = 0
        L_0x0353:
            if (r3 >= r4) goto L_0x036e
            r2 = r6[r3]
            long[] r1 = r2.A06
            int r0 = r2.A04
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r2.A06 = r0
            int[] r1 = r2.A05
            int r0 = r2.A04
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r2.A05 = r0
            int r3 = r3 + 1
            goto L_0x0353
        L_0x036e:
            r8.A07 = r10
            X.YBZ r3 = r8.A04
            long r1 = r8.A00
            X.Xvb r0 = new X.Xvb
            r0.<init>(r8, r1)
            r3.EKw(r0)
            r8.A0B = r5
            long r2 = r8.A02
            goto L_0x03a6
        L_0x0381:
            X.SRd r3 = r8.A0C
            byte[] r1 = r3.A02
            r0 = 8
            r4.readFully(r1, r7, r0)
            r3.A0O(r7)
            int r2 = r3.A02()
            int r1 = r3.A02()
            r0 = 829973609(0x31786469, float:3.6145826E-9)
            if (r2 != r0) goto L_0x03a0
            r0 = 5
            r8.A0B = r0
            r8.A0A = r1
            return r7
        L_0x03a0:
            long r2 = r4.Bdl()
            long r0 = (long) r1
            long r2 = r2 + r0
        L_0x03a6:
            r8.A03 = r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22105XvV.E67(X.TlA, X.XYr):int");
    }

    public final void EKu(long j, long j2) {
        this.A03 = -1;
        this.A06 = null;
        int i = 0;
        for (C21471Xc3 xc3 : this.A08) {
            if (xc3.A04 == 0) {
                xc3.A01 = 0;
            } else {
                xc3.A01 = xc3.A05[Util.A02(xc3.A06, j, true)];
            }
        }
        if (j != 0) {
            i = 6;
        } else if (this.A08.length != 0) {
            i = 3;
        }
        this.A0B = i;
    }

    public final boolean Evx(C13910TlA tlA) {
        C11389SRd sRd = this.A0C;
        tlA.E2F(sRd.A02, 0, 12);
        sRd.A0O(0);
        if (sRd.A02() != 1179011410) {
            return false;
        }
        sRd.A0P(4);
        if (sRd.A02() == 541677121) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.XZk] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.YBZ, java.lang.Object] */
    public C22105XvV(C13890TjD tjD, int i) {
        this.A0E = tjD;
        this.A0F = (i & 1) != 0 ? false : true;
        this.A0C = Pxe.A0P(12);
        this.A0D = new Object();
        this.A04 = new Object();
        this.A08 = new C21471Xc3[0];
        this.A02 = -1;
        this.A01 = -1;
        this.A09 = -1;
        this.A00 = -9223372036854775807L;
    }

    @Deprecated
    public C22105XvV() {
        this(C13890TjD.A00, 1);
    }
}
