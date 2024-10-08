package X;

import androidx.media3.common.Metadata;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.XvX  reason: case insensitive filesystem */
public final class C22107XvX implements C13809Thc {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Metadata A05;
    public YBZ A06;
    public C22017XrB A07;
    public C13900TjN A08;
    public C21152XGt A09;
    public final C11389SRd A0A;
    public final XYq A0B;
    public final byte[] A0C;

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final void EKu(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.A03 = 0;
        } else {
            C21152XGt xGt = this.A09;
            if (xGt != null) {
                xGt.A01(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.A04 = j3;
        this.A00 = 0;
        this.A0A.A0M(0);
    }

    private void A00() {
        this.A08.EJm((S4h) null, 1, this.A00, 0, (this.A04 * 1000000) / ((long) this.A07.A07));
    }

    public final void CMU(YBZ ybz) {
        this.A06 = ybz;
        this.A08 = ybz.FHV(0, 1);
        ybz.ASU();
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [X.XGt, X.Xca] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0217, code lost:
        if (r1 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00da, code lost:
        r1 = r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E67(X.C13910TlA r30, X.C21363XYr r31) {
        /*
            r29 = this;
            r5 = r29
            int r1 = r5.A03
            r4 = 0
            r3 = r30
            if (r1 == 0) goto L_0x0254
            r0 = 1
            if (r1 == r0) goto L_0x0248
            r0 = 2
            if (r1 == r0) goto L_0x022c
            r7 = 3
            if (r1 == r7) goto L_0x0142
            r0 = 4
            if (r1 == r0) goto L_0x027a
            X.TjN r0 = r5.A08
            r0.getClass()
            X.XrB r0 = r5.A07
            r0.getClass()
            X.XGt r1 = r5.A09
            if (r1 == 0) goto L_0x002e
            X.XnH r0 = r1.A00
            if (r0 == 0) goto L_0x002e
            r0 = r31
            int r1 = r1.A00(r3, r0)
            return r1
        L_0x002e:
            long r1 = r5.A04
            r9 = -1
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0083
            X.XrB r9 = r5.A07
            r3.EI7()
            r8 = 1
            r3.AAu(r8)
            byte[] r0 = new byte[r8]
            r3.E2F(r0, r4, r8)
            byte r0 = r0[r4]
            r0 = r0 & 1
            if (r0 == r8) goto L_0x004b
            r8 = 0
        L_0x004b:
            r0 = 2
            r3.AAu(r0)
            r7 = 6
            if (r8 == 0) goto L_0x0053
            r7 = 7
        L_0x0053:
            X.SRd r6 = X.Pxe.A0P(r7)
            byte[] r4 = r6.A02
            r2 = 0
        L_0x005a:
            int r0 = r7 - r2
            int r1 = r3.E2C(r4, r2, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0067
            int r2 = r2 + r1
            if (r2 >= r7) goto L_0x0067
            goto L_0x005a
        L_0x0067:
            r6.A0N(r2)
            r3.EI7()
            long r2 = r6.A0E()     // Catch:{ NumberFormatException -> 0x007b }
            if (r8 != 0) goto L_0x0077
            int r0 = r9.A03
            long r0 = (long) r0
            long r2 = r2 * r0
        L_0x0077:
            r5.A04 = r2
            goto L_0x010b
        L_0x007b:
            r2 = 0
            r1 = 1
            X.XQX r0 = new X.XQX
            r0.<init>(r2, r2, r1, r1)
            throw r0
        L_0x0083:
            X.SRd r6 = r5.A0A
            int r2 = r6.A00
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r2 >= r1) goto L_0x00a1
            byte[] r0 = r6.A02
            int r1 = r1 - r2
            int r0 = r3.read(r0, r2, r1)
            r1 = -1
            if (r0 != r1) goto L_0x00a3
            r8 = 1
            int r0 = X.Pxe.A06(r6)
            if (r0 != 0) goto L_0x00a8
            r5.A00()
            return r1
        L_0x00a1:
            r8 = 0
            goto L_0x00a8
        L_0x00a3:
            r8 = 0
            int r2 = r2 + r0
            r6.A0N(r2)
        L_0x00a8:
            int r7 = r6.A01
            int r0 = r5.A00
            int r1 = r5.A02
            if (r0 >= r1) goto L_0x00bb
            int r1 = r1 - r0
            int r0 = r6.A00
            int r0 = r0 - r7
            int r0 = java.lang.Math.min(r1, r0)
            r6.A0P(r0)
        L_0x00bb:
            X.XrB r0 = r5.A07
            r0.getClass()
            int r3 = r6.A01
        L_0x00c2:
            int r2 = r6.A00
            int r0 = r2 + -16
            if (r3 > r0) goto L_0x0110
            r6.A0O(r3)
            X.XrB r2 = r5.A07
            int r0 = r5.A01
            X.XYq r1 = r5.A0B
            boolean r0 = X.C21510Xdc.A01(r6, r1, r2, r0)
            if (r0 == 0) goto L_0x010d
            r6.A0O(r3)
        L_0x00da:
            long r1 = r1.A00
        L_0x00dc:
            int r3 = r6.A01
            int r3 = r3 - r7
            r6.A0O(r7)
            X.TjN r0 = r5.A08
            r0.EJf(r6, r3)
            int r0 = r5.A00
            int r0 = r0 + r3
            r5.A00 = r0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00f7
            r5.A00()
            r5.A00 = r4
            r5.A04 = r1
        L_0x00f7:
            int r2 = r6.A00
            int r1 = r6.A01
            int r2 = r2 - r1
            r0 = 16
            if (r2 >= r0) goto L_0x010b
            byte[] r0 = r6.A02
            java.lang.System.arraycopy(r0, r1, r0, r4, r2)
            r6.A0O(r4)
            r6.A0N(r2)
        L_0x010b:
            r1 = 0
            return r1
        L_0x010d:
            int r3 = r3 + 1
            goto L_0x00c2
        L_0x0110:
            if (r8 != 0) goto L_0x0118
            r6.A0O(r3)
        L_0x0115:
            r1 = -1
            goto L_0x00dc
        L_0x0118:
            int r0 = r5.A02
            int r0 = r2 - r0
            if (r3 > r0) goto L_0x013e
            r6.A0O(r3)
            X.XrB r2 = r5.A07     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            int r1 = r5.A01     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            X.XYq r0 = r5.A0B     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            boolean r1 = X.C21510Xdc.A01(r6, r0, r2, r1)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            goto L_0x012d
        L_0x012c:
            r1 = 0
        L_0x012d:
            int r0 = r6.A01
            int r2 = r6.A00
            if (r0 > r2) goto L_0x013b
            if (r1 == 0) goto L_0x013b
            r6.A0O(r3)
            X.XYq r1 = r5.A0B
            goto L_0x00da
        L_0x013b:
            int r3 = r3 + 1
            goto L_0x0118
        L_0x013e:
            r6.A0O(r2)
            goto L_0x0115
        L_0x0142:
            X.XrB r6 = r5.A07
        L_0x0144:
            r3.EI7()
            r9 = 4
            byte[] r0 = new byte[r9]
            X.ST7 r2 = new X.ST7
            r2.<init>(r0)
            byte[] r0 = r2.A03
            r3.E2F(r0, r4, r9)
            boolean r16 = r2.A0F()
            r0 = 7
            int r1 = r2.A06(r0)
            r0 = 24
            int r0 = r2.A06(r0)
            int r2 = r0 + 4
            if (r1 != 0) goto L_0x018f
            r1 = 38
            byte[] r0 = new byte[r1]
            r3.readFully(r0, r4, r1)
            X.XrB r6 = new X.XrB
            r6.<init>(r0, r9)
        L_0x0173:
            r5.A07 = r6
            if (r16 == 0) goto L_0x0144
            int r1 = r6.A06
            r0 = 6
            int r0 = java.lang.Math.max(r1, r0)
            r5.A02 = r0
            X.TjN r2 = r5.A08
            byte[] r1 = r5.A0C
            androidx.media3.common.Metadata r0 = r5.A05
            X.SJM r0 = r6.A02(r0, r1)
            r2.AWO(r0)
            goto L_0x02b4
        L_0x018f:
            if (r6 == 0) goto L_0x0226
            if (r1 != r7) goto L_0x01a5
            X.SRd r1 = X.Pxe.A0P(r2)
            byte[] r0 = r1.A02
            r3.readFully(r0, r4, r2)
            X.XZj r0 = X.XUG.A00(r1)
            X.XrB r6 = r6.A03(r0)
            goto L_0x0173
        L_0x01a5:
            if (r1 != r9) goto L_0x01f9
            X.SRd r1 = X.Pxe.A0P(r2)
            byte[] r0 = r1.A02
            r3.readFully(r0, r4, r2)
            r1.A0P(r9)
            X.XYs r0 = X.C21990XpD.A01(r1, r4, r4)
            java.lang.String[] r0 = r0.A00
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.media3.common.Metadata r13 = X.C21990XpD.A00(r0)
            androidx.media3.common.Metadata r1 = r6.A0A
            if (r1 == 0) goto L_0x01c8
            if (r13 != 0) goto L_0x021a
            r13 = r1
        L_0x01c8:
            int r0 = r6.A05
            r17 = r0
            int r15 = r6.A03
            int r14 = r6.A06
            int r12 = r6.A04
            int r11 = r6.A07
            int r10 = r6.A02
            int r8 = r6.A00
            long r0 = r6.A09
            X.XZj r2 = r6.A0B
            X.XrB r6 = new X.XrB
            r26 = r8
            r27 = r0
            r24 = r11
            r25 = r10
            r22 = r14
            r23 = r12
            r20 = r17
            r21 = r15
            r18 = r13
            r19 = r2
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0173
        L_0x01f9:
            r0 = 6
            if (r1 != r0) goto L_0x0221
            X.SRd r1 = X.Pxe.A0P(r2)
            byte[] r0 = r1.A02
            r3.readFully(r0, r4, r2)
            r1.A0P(r9)
            androidx.media3.extractor.metadata.flac.PictureFrame r0 = androidx.media3.extractor.metadata.flac.PictureFrame.A00(r1)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
            androidx.media3.common.Metadata r13 = new androidx.media3.common.Metadata
            r13.<init>((java.util.List) r0)
            androidx.media3.common.Metadata r1 = r6.A0A
            if (r1 != 0) goto L_0x021a
            goto L_0x01c8
        L_0x021a:
            androidx.media3.common.Metadata$Entry[] r0 = r13.A01
            androidx.media3.common.Metadata r13 = r1.A00(r0)
            goto L_0x01c8
        L_0x0221:
            r3.Evk(r2)
            goto L_0x0173
        L_0x0226:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x022c:
            r2 = 4
            X.SRd r1 = X.Pxe.A0P(r2)
            byte[] r0 = r1.A02
            r3.readFully(r0, r4, r2)
            long r6 = r1.A0C()
            r1 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0243
            r9 = 3
            goto L_0x02b4
        L_0x0243:
            r1 = 0
            java.lang.String r0 = "Failed to read FLAC stream marker."
            goto L_0x0348
        L_0x0248:
            byte[] r1 = r5.A0C
            r0 = 42
            r3.E2F(r1, r4, r0)
            r3.EI7()
            r9 = 2
            goto L_0x02b4
        L_0x0254:
            r9 = 1
            r3.EI7()
            long r7 = r3.BbM()
            r6 = 0
            X.S03 r0 = new X.S03
            r0.<init>()
            androidx.media3.common.Metadata r1 = r0.A00(r3, r6)
            if (r1 == 0) goto L_0x026e
            androidx.media3.common.Metadata$Entry[] r0 = r1.A01
            int r0 = r0.length
            if (r0 == 0) goto L_0x026e
            r6 = r1
        L_0x026e:
            long r1 = r3.BbM()
            long r1 = r1 - r7
            int r0 = (int) r1
            r3.Evk(r0)
            r5.A05 = r6
            goto L_0x02b4
        L_0x027a:
            r3.EI7()
            r2 = 2
            X.SRd r1 = X.Pxe.A0P(r2)
            byte[] r0 = r1.A02
            r3.E2F(r0, r4, r2)
            int r2 = r1.A08()
            int r1 = r2 >> 2
            r0 = 16382(0x3ffe, float:2.2956E-41)
            if (r1 != r0) goto L_0x0342
            r3.EI7()
            r5.A01 = r2
            X.YBZ r11 = r5.A06
            long r9 = r3.Bdl()
            long r22 = r3.getLength()
            X.XrB r0 = r5.A07
            r0.getClass()
            X.XrB r6 = r5.A07
            X.XZj r0 = r6.A0B
            if (r0 == 0) goto L_0x02b7
            X.Xva r2 = new X.Xva
            r2.<init>(r6, r9)
        L_0x02b0:
            r11.EKw(r2)
            r9 = 5
        L_0x02b4:
            r5.A03 = r9
            return r4
        L_0x02b7:
            r1 = -1
            int r0 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0325
            long r2 = r6.A09
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0325
            int r0 = r5.A01
            X.XvO r13 = new X.XvO
            r13.<init>(r6)
            X.XvR r14 = new X.XvR
            r14.<init>(r6, r0)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x031a
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02da:
            int r0 = r6.A04
            if (r0 <= 0) goto L_0x0300
            long r0 = (long) r0
            int r7 = r6.A06
            long r7 = (long) r7
            long r0 = r0 + r7
            r7 = 2
            long r0 = r0 / r7
            r7 = 1
        L_0x02e8:
            long r0 = r0 + r7
            int r7 = r6.A06
            r6 = 6
            int r15 = java.lang.Math.max(r6, r7)
            X.XGt r12 = new X.XGt
            r24 = r0
            r20 = r9
            r18 = r2
            r12.<init>(r13, r14, r15, r16, r18, r20, r22, r24)
            r5.A09 = r12
            X.Xvd r2 = r12.A01
            goto L_0x02b0
        L_0x0300:
            int r1 = r6.A05
            int r0 = r6.A03
            if (r1 != r0) goto L_0x0317
            if (r1 <= 0) goto L_0x0317
            long r0 = (long) r1
        L_0x0309:
            int r7 = r6.A02
            long r7 = (long) r7
            long r0 = r0 * r7
            int r7 = r6.A00
            long r7 = (long) r7
            long r0 = r0 * r7
            r7 = 8
            long r0 = r0 / r7
            r7 = 64
            goto L_0x02e8
        L_0x0317:
            r0 = 4096(0x1000, double:2.0237E-320)
            goto L_0x0309
        L_0x031a:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r16 = r2 * r0
            int r0 = r6.A07
            long r0 = (long) r0
            long r16 = r16 / r0
            goto L_0x02da
        L_0x0325:
            long r0 = r6.A09
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0339
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0332:
            X.Sf7 r2 = new X.Sf7
            r2.<init>(r0)
            goto L_0x02b0
        L_0x0339:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            int r2 = r6.A07
            long r2 = (long) r2
            long r0 = r0 / r2
            goto L_0x0332
        L_0x0342:
            r3.EI7()
            r1 = 0
            java.lang.String r0 = "First frame does not start with sync code."
        L_0x0348:
            X.XQX r0 = X.Pxf.A0L(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22107XvX.E67(X.TlA, X.XYr):int");
    }

    public final boolean Evx(C13910TlA tlA) {
        new S03().A00(tlA, QE2.A01);
        C11389SRd A0P = Pxe.A0P(4);
        tlA.E2F(A0P.A02, 0, 4);
        if (A0P.A0C() == 1716281667) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.SRd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.XYq, java.lang.Object] */
    public C22107XvX(int i) {
        this.A0C = new byte[42];
        byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
        ? obj = new Object();
        obj.A02 = bArr;
        obj.A00 = 0;
        this.A0A = obj;
        this.A0B = new Object();
        this.A03 = 0;
    }

    public C22107XvX() {
        this(0);
    }
}
