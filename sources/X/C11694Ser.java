package X;

import androidx.media3.common.Metadata;
import com.facebook.common.dextricks.Constants;
import java.io.EOFException;

/* renamed from: X.Ser  reason: case insensitive filesystem */
public final class C11694Ser implements C13809Thc {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Metadata A05;
    public YBZ A06;
    public C13900TjN A07;
    public C13900TjN A08;
    public C13911TlB A09;
    public final C11389SRd A0A;
    public final C11237SGx A0B;
    public final S03 A0C;
    public final S36 A0D;
    public final C13900TjN A0E;

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final void EKu(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0;
        this.A00 = 0;
    }

    public final boolean Evx(C13910TlA tlA) {
        return A01(tlA, true);
    }

    private boolean A00(C13910TlA tlA) {
        C13911TlB tlB = this.A09;
        if (tlB != null) {
            long AvI = tlB.AvI();
            if (AvI != -1 && tlA.BbM() > AvI - 4) {
                return true;
            }
        }
        try {
            return !tlA.E2G(this.A0A.A02, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private boolean A01(C13910TlA tlA, boolean z) {
        int i;
        int i2;
        int A002;
        int i3 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        if (z) {
            i3 = Constants.LOAD_RESULT_PGO;
        }
        C13910TlA tlA2 = tlA;
        tlA2.EI7();
        if (tlA2.Bdl() == 0) {
            Metadata A003 = this.A0C.A00(tlA2, (TZa) null);
            this.A05 = A003;
            if (A003 != null) {
                this.A0B.A00(A003);
            }
            i2 = (int) tlA2.BbM();
            if (!z) {
                tlA2.Evk(i2);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!A00(tlA2)) {
                int A062 = Pxf.A06(this.A0A, 0);
                if ((i == 0 || ((long) (-128000 & A062)) == (((long) i) & -128000)) && (A002 = SDB.A00(A062)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.A0D.A00(A062);
                        i = A062;
                    }
                    tlA2.AAu(A002 - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            tlA2.EI7();
                            tlA2.AAu(i2 + i6);
                        } else {
                            tlA2.Evk(1);
                        }
                        i5 = i6;
                        i = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw new XQX("Searched too many bytes.", (Throwable) null, 1, true);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            tlA2.Evk(i2 + i5);
        } else {
            tlA2.EI7();
        }
        this.A01 = i;
        return true;
    }

    public final void CMU(YBZ ybz) {
        this.A06 = ybz;
        C13900TjN FHV = ybz.FHV(0, 1);
        this.A08 = FHV;
        this.A07 = FHV;
        this.A06.ASU();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.QDx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.QDx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.SfL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: X.QDx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: X.QDx} */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r12v6, types: [X.QDx] */
    /* JADX WARNING: type inference failed for: r21v4, types: [X.SfK] */
    /* JADX WARNING: type inference failed for: r29v3, types: [X.SfK] */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0234, code lost:
        if (X.Pxf.A06(r6, 36) == 1447187017) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r5 != 1483304551) goto L_0x005f;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E67(X.C13910TlA r41, X.C21363XYr r42) {
        /*
            r40 = this;
            r2 = r40
            X.TjN r0 = r2.A08
            X.C11366SPh.A00(r0)
            int r0 = r2.A01
            r39 = r41
            if (r0 != 0) goto L_0x0016
            r1 = 0
            r0 = r39
            r2.A01(r0, r1)     // Catch:{ EOFException -> 0x0014 }
            goto L_0x0016
        L_0x0014:
            r0 = -1
            return r0
        L_0x0016:
            X.TlB r0 = r2.A09
            if (r0 != 0) goto L_0x02f6
            X.S36 r10 = r2.A0D
            int r4 = r10.A02
            X.SRd r6 = X.Pxe.A0P(r4)
            byte[] r3 = r6.A02
            r20 = 0
            r1 = r39
            r0 = r20
            r1.E2F(r3, r0, r4)
            int r0 = r10.A05
            r13 = 1
            r1 = r0 & 1
            r3 = 21
            int r0 = r10.A01
            if (r1 == 0) goto L_0x02ea
            if (r0 == r13) goto L_0x003c
            r3 = 36
        L_0x003c:
            int r1 = r6.A00
            int r0 = r3 + 4
            if (r1 < r0) goto L_0x0225
            int r5 = X.Pxf.A06(r6, r3)
            r1 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r5 == r1) goto L_0x0050
            r0 = 1231971951(0x496e666f, float:976486.94)
            if (r5 != r0) goto L_0x0225
        L_0x0050:
            r0 = 1231971951(0x496e666f, float:976486.94)
            r16 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r5 == r0) goto L_0x00d1
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r5 == r0) goto L_0x0236
            if (r5 == r1) goto L_0x00d1
        L_0x005f:
            r5 = 0
            r39.EI7()
        L_0x0063:
            androidx.media3.common.Metadata r0 = r2.A05
            long r15 = r39.Bdl()
            if (r0 == 0) goto L_0x030e
            androidx.media3.common.Metadata$Entry[] r7 = r0.A01
            int r6 = r7.length
            r1 = 0
        L_0x006f:
            if (r1 >= r6) goto L_0x030e
            r8 = r7[r1]
            boolean r0 = r8 instanceof androidx.media3.extractor.metadata.id3.MlltFrame
            if (r0 == 0) goto L_0x00ce
            androidx.media3.extractor.metadata.id3.MlltFrame r8 = (androidx.media3.extractor.metadata.id3.MlltFrame) r8
            r4 = 0
        L_0x007a:
            if (r4 >= r6) goto L_0x00c8
            r3 = r7[r4]
            boolean r0 = r3 instanceof androidx.media3.extractor.metadata.id3.TextInformationFrame
            if (r0 == 0) goto L_0x00c5
            androidx.media3.extractor.metadata.id3.TextInformationFrame r3 = (androidx.media3.extractor.metadata.id3.TextInformationFrame) r3
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "TLEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c5
            com.google.common.collect.ImmutableList r1 = r3.A00
            r0 = r20
            long r0 = X.Pxg.A0J(r1, r0)
            long r3 = androidx.media3.common.util.Util.A03(r0)
        L_0x009a:
            int[] r11 = r8.A03
            int r9 = r11.length
            int r0 = r9 + 1
            long[] r7 = new long[r0]
            long[] r6 = new long[r0]
            r7[r20] = r15
            r13 = 0
            r6[r20] = r13
            r5 = 1
        L_0x00aa:
            if (r5 > r9) goto L_0x02f0
            int r1 = r8.A00
            int r12 = r5 + -1
            r0 = r11[r12]
            int r1 = r1 + r0
            long r0 = (long) r1
            long r15 = r15 + r0
            int r1 = r8.A01
            int[] r0 = r8.A04
            r0 = r0[r12]
            int r1 = r1 + r0
            long r0 = (long) r1
            long r13 = r13 + r0
            r7[r5] = r15
            r6[r5] = r13
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00c5:
            int r4 = r4 + 1
            goto L_0x007a
        L_0x00c8:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x009a
        L_0x00ce:
            int r1 = r1 + 1
            goto L_0x006f
        L_0x00d1:
            int r13 = r6.A01()
            r0 = r13 & 1
            if (r0 == 0) goto L_0x00fe
            int r7 = r6.A07()
        L_0x00dd:
            r0 = r13 & 2
            if (r0 == 0) goto L_0x00fb
            long r0 = r6.A0C()
        L_0x00e5:
            r3 = r13 & 4
            r12 = 4
            if (r3 != r12) goto L_0x0100
            r11 = 100
            long[] r9 = new long[r11]
            r8 = 0
        L_0x00ef:
            int r3 = r6.A05()
            long r3 = (long) r3
            r9[r8] = r3
            int r8 = r8 + 1
            if (r8 >= r11) goto L_0x0101
            goto L_0x00ef
        L_0x00fb:
            r0 = -1
            goto L_0x00e5
        L_0x00fe:
            r7 = -1
            goto L_0x00dd
        L_0x0100:
            r9 = 0
        L_0x0101:
            r3 = r13 & 8
            if (r3 == 0) goto L_0x0108
            r6.A0P(r12)
        L_0x0108:
            r8 = 21
            int r4 = X.Pxe.A06(r6)
            r3 = 24
            if (r4 < r3) goto L_0x01b0
            r6.A0P(r8)
            int r4 = r6.A06()
            r3 = 16773120(0xfff000, float:2.3504147E-38)
            r3 = r3 & r4
            int r14 = r3 >> 12
            r13 = r4 & 4095(0xfff, float:5.738E-42)
        L_0x0121:
            long r3 = (long) r7
            int r12 = r10.A02
            int r11 = r10.A03
            int r6 = r10.A00
            r21 = r6
            int r6 = r10.A04
            X.SGx r15 = r2.A0B
            int r7 = r15.A00
            r8 = -1
            if (r7 == r8) goto L_0x01a7
            int r7 = r15.A01
            if (r7 == r8) goto L_0x01a7
        L_0x0137:
            long r25 = r39.Bdl()
            long r34 = r39.getLength()
            r29 = -1
            int r7 = (r34 > r29 ? 1 : (r34 == r29 ? 0 : -1))
            if (r7 == 0) goto L_0x015c
            int r7 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r7 == 0) goto L_0x015c
            long r36 = r0 + r25
            int r7 = (r34 > r36 ? 1 : (r34 == r36 ? 0 : -1))
            if (r7 == 0) goto L_0x015c
            java.lang.String r31 = "Data size mismatch between stream ("
            java.lang.String r32 = ") and Xing frame ("
            java.lang.String r33 = "), using Xing value."
            java.lang.String r7 = X.002.A0t(r31, r32, r33, r34, r36)
            X.STH.A01(r7)
        L_0x015c:
            int r8 = r10.A02
            r7 = r39
            r7.Evk(r8)
            int r8 = (r3 > r29 ? 1 : (r3 == r29 ? 0 : -1))
            r7 = r16
            if (r5 != r7) goto L_0x01c6
            if (r8 == 0) goto L_0x01c3
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01c3
            long r5 = (long) r6
            long r3 = r3 * r5
            r5 = 1
            long r3 = r3 - r5
            long r5 = (long) r11
            java.math.RoundingMode r13 = java.math.RoundingMode.FLOOR
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r14 = r3
            r18 = r5
            long r27 = androidx.media3.common.util.Util.A07(r13, r14, r16, r18)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x01c3
            int r3 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r3 == 0) goto L_0x01b4
            if (r9 == 0) goto L_0x01b4
            X.SfK r5 = new X.SfK
            r29 = r5
            r30 = r9
            r31 = r12
            r32 = r21
            r33 = r25
            r35 = r27
            r37 = r0
            r29.<init>(r30, r31, r32, r33, r35, r37)
            goto L_0x0063
        L_0x01a7:
            if (r14 == r8) goto L_0x0137
            if (r13 == r8) goto L_0x0137
            r15.A00 = r14
            r15.A01 = r13
            goto L_0x0137
        L_0x01b0:
            r14 = -1
            r13 = -1
            goto L_0x0121
        L_0x01b4:
            r22 = 0
            X.SfK r5 = new X.SfK
            r23 = r12
            r24 = r21
            r21 = r5
            r21.<init>(r22, r23, r24, r25, r27, r29)
            goto L_0x0063
        L_0x01c3:
            r5 = 0
            goto L_0x0063
        L_0x01c6:
            if (r8 == 0) goto L_0x021f
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x021f
            long r5 = (long) r6
            long r14 = r3 * r5
            r5 = 1
            long r14 = r14 - r5
            long r5 = (long) r11
            java.math.RoundingMode r13 = java.math.RoundingMode.FLOOR
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r18 = r5
            long r18 = androidx.media3.common.util.Util.A07(r13, r14, r16, r18)
        L_0x01e0:
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0063
            int r6 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r6 == 0) goto L_0x0218
            long r34 = r25 + r0
        L_0x01f0:
            long r5 = (long) r12
            long r0 = r0 - r5
            r16 = 8000000(0x7a1200, double:3.952525E-317)
            java.math.RoundingMode r5 = java.math.RoundingMode.HALF_UP
            r13 = r5
            r14 = r0
            long r6 = androidx.media3.common.util.Util.A07(r13, r14, r16, r18)
            int r13 = X.1WJ.A01(r6)
            long r0 = X.C7258Q1h.A03(r5, r0, r3)
            int r14 = X.1WJ.A01(r0)
            long r0 = (long) r12
            long r25 = r25 + r0
            X.QDx r5 = new X.QDx
            r12 = r5
            r15 = r34
            r17 = r25
            r12.<init>(r13, r14, r15, r17)
            goto L_0x0063
        L_0x0218:
            int r0 = (r34 > r29 ? 1 : (r34 == r29 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            long r0 = r34 - r25
            goto L_0x01f0
        L_0x021f:
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01e0
        L_0x0225:
            int r1 = r6.A00
            r0 = 40
            if (r1 < r0) goto L_0x005f
            r0 = 36
            int r1 = X.Pxf.A06(r6, r0)
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r1 != r0) goto L_0x005f
        L_0x0236:
            long r29 = r39.getLength()
            long r0 = r39.Bdl()
            r3 = 10
            r6.A0P(r3)
            int r3 = r6.A01()
            r5 = 0
            if (r3 <= 0) goto L_0x02e1
            int r9 = r10.A03
            long r7 = (long) r3
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r4 = 32000(0x7d00, float:4.4842E-41)
            r3 = 576(0x240, float:8.07E-43)
            if (r9 < r4) goto L_0x0258
            r3 = 1152(0x480, float:1.614E-42)
        L_0x0258:
            long r3 = (long) r3
            long r16 = r16 * r3
            long r3 = (long) r9
            r14 = r7
            r18 = r3
            long r25 = androidx.media3.common.util.Util.A06(r14, r16, r18)
            int r9 = r6.A08()
            int r19 = r6.A08()
            int r8 = r6.A08()
            r14 = 2
            r6.A0P(r14)
            int r3 = r10.A02
            long r3 = (long) r3
            long r17 = r0 + r3
            long[] r3 = new long[r9]
            r16 = r3
            long[] r3 = new long[r9]
            r15 = r3
            r7 = 0
        L_0x0280:
            if (r7 >= r9) goto L_0x02b7
            long r3 = (long) r7
            long r3 = r3 * r25
            long r11 = (long) r9
            long r3 = r3 / r11
            r16[r7] = r3
            r3 = r17
            long r3 = java.lang.Math.max(r0, r3)
            r15[r7] = r3
            if (r8 == r13) goto L_0x02b2
            if (r8 == r14) goto L_0x02ad
            r3 = 3
            if (r8 == r3) goto L_0x02a8
            r3 = 4
            if (r8 != r3) goto L_0x02e1
            int r3 = r6.A07()
        L_0x029f:
            long r3 = (long) r3
            r11 = r19
            long r11 = (long) r11
            long r3 = r3 * r11
            long r0 = r0 + r3
            int r7 = r7 + 1
            goto L_0x0280
        L_0x02a8:
            int r3 = r6.A06()
            goto L_0x029f
        L_0x02ad:
            int r3 = r6.A08()
            goto L_0x029f
        L_0x02b2:
            int r3 = r6.A05()
            goto L_0x029f
        L_0x02b7:
            r4 = -1
            int r3 = (r29 > r4 ? 1 : (r29 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x02d0
            int r3 = (r29 > r0 ? 1 : (r29 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x02d0
            java.lang.String r27 = "VBRI data size mismatch: "
            java.lang.String r28 = ", "
            r31 = r0
            java.lang.String r4 = X.002.A0f(r27, r28, r29, r31)
            java.lang.String r3 = "VbriSeeker"
            X.STH.A03(r3, r4)
        L_0x02d0:
            int r3 = r10.A00
            X.SfJ r5 = new X.SfJ
            r22 = r16
            r23 = r15
            r24 = r3
            r27 = r0
            r21 = r5
            r21.<init>(r22, r23, r24, r25, r27)
        L_0x02e1:
            int r1 = r10.A02
            r0 = r39
            r0.Evk(r1)
            goto L_0x0063
        L_0x02ea:
            if (r0 != r13) goto L_0x003c
            r3 = 13
            goto L_0x003c
        L_0x02f0:
            X.SfL r5 = new X.SfL
            r5.<init>(r7, r6, r3)
            goto L_0x0337
        L_0x02f6:
            long r5 = r2.A03
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0379
            long r3 = r39.Bdl()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0379
            long r5 = r5 - r3
            int r1 = (int) r5
            r0 = r39
            r0.Evk(r1)
            goto L_0x0379
        L_0x030e:
            if (r5 != 0) goto L_0x0337
            X.SRd r5 = r2.A0A
            byte[] r4 = r5.A02
            r3 = 4
            r1 = r39
            r0 = r20
            r1.E2F(r4, r0, r3)
            int r0 = X.Pxf.A06(r5, r0)
            r10.A00(r0)
            long r14 = r39.getLength()
            long r16 = r39.Bdl()
            int r1 = r10.A00
            int r0 = r10.A02
            X.QDx r5 = new X.QDx
            r12 = r1
            r13 = r0
            r11 = r5
            r11.<init>(r12, r13, r14, r16)
        L_0x0337:
            r2.A09 = r5
            X.YBZ r0 = r2.A06
            r0.EKw(r5)
            X.SOW r3 = X.SOW.A00()
            java.lang.String r0 = r10.A06
            r3.A01(r0)
            r0 = 4096(0x1000, float:5.74E-42)
            r3.A0A = r0
            int r0 = r10.A01
            r3.A04 = r0
            int r0 = r10.A03
            r3.A0G = r0
            X.SGx r1 = r2.A0B
            int r0 = r1.A00
            r3.A07 = r0
            int r0 = r1.A01
            r3.A08 = r0
            androidx.media3.common.Metadata r0 = r2.A05
            r3.A0P = r0
            X.TlB r0 = r2.A09
            int r1 = r0.Aea()
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r1 == r0) goto L_0x036e
            r3.A03 = r1
        L_0x036e:
            X.TjN r0 = r2.A07
            X.C13900TjN.A00(r3, r0)
            long r0 = r39.Bdl()
            r2.A03 = r0
        L_0x0379:
            int r3 = r2.A00
            r10 = 1
            r5 = -1
            r12 = 0
            if (r3 != 0) goto L_0x03c7
            r39.EI7()
            r0 = r39
            boolean r0 = r2.A00(r0)
            if (r0 != 0) goto L_0x0403
            X.SRd r0 = r2.A0A
            int r9 = X.Pxf.A06(r0, r12)
            int r0 = r2.A01
            long r3 = (long) r0
            r0 = -128000(0xfffffffffffe0c00, float:NaN)
            r0 = r0 & r9
            long r0 = (long) r0
            r6 = -128000(0xfffffffffffe0c00, double:NaN)
            long r3 = r3 & r6
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x03fb
            int r0 = X.SDB.A00(r9)
            if (r0 == r5) goto L_0x03fb
            X.S36 r8 = r2.A0D
            r8.A00(r9)
            long r3 = r2.A02
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x03c3
            X.TlB r3 = r2.A09
            long r0 = r39.Bdl()
            long r0 = r3.C7P(r0)
            r2.A02 = r0
        L_0x03c3:
            int r3 = r8.A02
            r2.A00 = r3
        L_0x03c7:
            X.TjN r1 = r2.A07
            r0 = r39
            int r1 = r1.EJe(r0, r3, r10)
            if (r1 == r5) goto L_0x0403
            int r0 = r2.A00
            int r0 = r0 - r1
            r2.A00 = r0
            if (r0 > 0) goto L_0x03f9
            X.TjN r8 = r2.A07
            long r0 = r2.A04
            long r13 = r2.A02
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r3
            X.S36 r5 = r2.A0D
            int r3 = r5.A03
            long r3 = (long) r3
            long r0 = r0 / r3
            long r13 = r13 + r0
            int r11 = r5.A02
            r9 = 0
            r8.EJm(r9, r10, r11, r12, r13)
            long r3 = r2.A04
            int r0 = r5.A04
            long r0 = (long) r0
            long r3 = r3 + r0
            r2.A04 = r3
            r2.A00 = r12
        L_0x03f9:
            r0 = 0
            return r0
        L_0x03fb:
            r0 = r39
            r0.Evk(r10)
            r2.A01 = r12
            goto L_0x03f9
        L_0x0403:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11694Ser.E67(X.TlA, X.XYr):int");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.S36] */
    public C11694Ser(int i) {
        this.A0A = Pxe.A0P(10);
        this.A0D = new Object();
        this.A0B = new C11237SGx();
        this.A02 = -9223372036854775807L;
        this.A0C = new S03();
        C11715SfC sfC = new C11715SfC();
        this.A0E = sfC;
        this.A07 = sfC;
    }

    public C11694Ser() {
        this(0);
    }
}
