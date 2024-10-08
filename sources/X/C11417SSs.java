package X;

import java.util.Arrays;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.SSs  reason: case insensitive filesystem */
public final class C11417SSs {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public static short[] A04(C11417SSs sSs, short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = sSs.A0G;
        int i4 = length / i3;
        if (i + i2 > i4) {
            return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
        }
        return sArr;
    }

    private int A00(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.A0G;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.A02 = i5 / i7;
        this.A01 = i8 / i6;
        return i7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C11417SSs r24) {
        /*
            r10 = r24
            int r9 = r10.A05
            float r8 = r10.A0F
            float r0 = r10.A0D
            float r8 = r8 / r0
            float r7 = r10.A0E
            float r7 = r7 * r0
            double r1 = (double) r8
            r3 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00dc
            r3 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00dc
            short[] r1 = r10.A0A
            int r0 = r10.A00
            r3 = 0
            r10.A02(r1, r3, r0)
        L_0x0027:
            r10.A00 = r3
        L_0x0029:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0079
            int r6 = r10.A05
            if (r6 == r9) goto L_0x0079
            int r8 = r10.A0H
            float r0 = (float) r8
            float r0 = r0 / r7
            int r7 = (int) r0
        L_0x0038:
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r7 > r0) goto L_0x00d6
            if (r8 > r0) goto L_0x00d6
            int r6 = r6 - r9
            short[] r1 = r10.A0C
            int r0 = r10.A06
            short[] r4 = A04(r10, r1, r0, r6)
            r10.A0C = r4
            short[] r3 = r10.A0B
            int r5 = r10.A0G
            int r2 = r9 * r5
            int r1 = r10.A06
            int r1 = r1 * r5
            int r0 = r5 * r6
            java.lang.System.arraycopy(r3, r2, r4, r1, r0)
            r10.A05 = r9
            int r0 = r10.A06
            int r0 = r0 + r6
            r10.A06 = r0
            r4 = 0
            r6 = 0
        L_0x0060:
            int r11 = r10.A06
            int r0 = r11 + -1
            r3 = 1
            if (r6 < r0) goto L_0x007a
            int r2 = r11 - r3
            if (r2 == 0) goto L_0x0079
            short[] r1 = r10.A0C
            int r0 = r2 * r5
            int r11 = r11 - r2
            int r11 = r11 * r5
            java.lang.System.arraycopy(r1, r0, r1, r4, r11)
            int r0 = r10.A06
            int r0 = r0 - r2
            r10.A06 = r0
        L_0x0079:
            return
        L_0x007a:
            int r0 = r10.A04
            int r11 = r0 + 1
            int r2 = r11 * r7
            int r1 = r10.A03
            int r0 = r1 * r8
            if (r2 <= r0) goto L_0x00c5
            short[] r0 = r10.A0B
            short[] r12 = A04(r10, r0, r9, r3)
            r10.A0B = r12
            r11 = 0
        L_0x008f:
            if (r11 >= r5) goto L_0x00b8
            int r9 = r10.A05
            int r9 = r9 * r5
            int r9 = r9 + r11
            short[] r1 = r10.A0C
            int r0 = r5 * r6
            int r0 = r0 + r11
            short r13 = r1[r0]
            int r0 = r0 + r5
            short r15 = r1[r0]
            int r14 = r10.A03
            int r14 = r14 * r8
            int r0 = r10.A04
            int r2 = r0 * r7
            int r1 = r0 + 1
            int r1 = r1 * r7
            int r0 = r1 - r14
            int r1 = r1 - r2
            int r13 = r13 * r0
            int r0 = r1 - r0
            int r0 = r0 * r15
            int r13 = r13 + r0
            int r13 = r13 / r1
            short r0 = (short) r13
            r12[r9] = r0
            int r11 = r11 + 1
            goto L_0x008f
        L_0x00b8:
            int r0 = r10.A03
            int r0 = r0 + 1
            r10.A03 = r0
            int r0 = r10.A05
            int r9 = r0 + 1
            r10.A05 = r9
            goto L_0x007a
        L_0x00c5:
            r10.A04 = r11
            if (r11 != r8) goto L_0x00d3
            r10.A04 = r4
            if (r1 == r7) goto L_0x00ce
            r3 = 0
        L_0x00ce:
            X.C256703wD.A04(r3)
            r10.A03 = r4
        L_0x00d3:
            int r6 = r6 + 1
            goto L_0x0060
        L_0x00d6:
            int r7 = r7 / 2
            int r8 = r8 / 2
            goto L_0x0038
        L_0x00dc:
            int r0 = r10.A00
            r24 = r0
            int r0 = r10.A0J
            r23 = r0
            r3 = r24
            if (r3 < r0) goto L_0x0029
            r6 = 0
        L_0x00e9:
            int r3 = r10.A09
            if (r3 <= 0) goto L_0x0113
            r0 = r23
            int r11 = java.lang.Math.min(r0, r3)
            short[] r0 = r10.A0A
            r10.A02(r0, r6, r11)
            int r0 = r10.A09
            int r0 = r0 - r11
            r10.A09 = r0
        L_0x00fd:
            int r6 = r6 + r11
            int r3 = r23 + r6
            r0 = r24
            if (r3 <= r0) goto L_0x00e9
            int r3 = r10.A00
            int r3 = r3 - r6
            short[] r2 = r10.A0A
            int r1 = r10.A0G
            int r6 = r6 * r1
            int r1 = r1 * r3
            r0 = 0
            java.lang.System.arraycopy(r2, r6, r2, r0, r1)
            goto L_0x0027
        L_0x0113:
            short[] r5 = r10.A0A
            int r13 = r10.A0H
            r0 = 4000(0xfa0, float:5.605E-42)
            r12 = 1
            if (r13 <= r0) goto L_0x01c9
            int r13 = r13 / r0
        L_0x011d:
            int r4 = r10.A0G
            if (r4 != r12) goto L_0x0192
            if (r13 != r12) goto L_0x0192
            int r13 = r10.A0K
            int r3 = r10.A0I
        L_0x0127:
            int r3 = r10.A00(r5, r6, r13, r3)
        L_0x012b:
            int r13 = r10.A02
            int r12 = r10.A01
            if (r13 == 0) goto L_0x0141
            int r11 = r10.A08
            if (r11 == 0) goto L_0x0141
            int r0 = r13 * 3
            if (r12 > r0) goto L_0x0141
            int r12 = r13 * 2
            int r0 = r10.A07
            int r0 = r0 * 3
            if (r12 > r0) goto L_0x0142
        L_0x0141:
            r11 = r3
        L_0x0142:
            r10.A07 = r13
            r10.A08 = r3
            r22 = r11
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L_0x01d3
            r12 = 1073741824(0x40000000, float:2.0)
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            float r3 = (float) r11
            if (r0 < 0) goto L_0x0189
            float r0 = r8 - r13
            float r3 = r3 / r0
            int r11 = (int) r3
        L_0x015b:
            short[] r3 = r10.A0B
            int r0 = r10.A05
            short[] r15 = A04(r10, r3, r0, r11)
            r10.A0B = r15
            int r14 = r10.A05
            int r18 = r6 + r22
            r13 = 0
        L_0x016a:
            if (r13 >= r4) goto L_0x01cc
            int r17 = r14 * r4
            int r17 = r17 + r13
            int r12 = r18 * r4
            int r12 = r12 + r13
            int r3 = r6 * r4
            int r3 = r3 + r13
            r0 = 0
        L_0x0177:
            if (r0 >= r11) goto L_0x0186
            short r16 = X.Pxh.A10(r5, r3, r11, r0, r12)
            r15[r17] = r16
            int r17 = r17 + r4
            int r3 = r3 + r4
            int r12 = r12 + r4
            int r0 = r0 + 1
            goto L_0x0177
        L_0x0186:
            int r13 = r13 + 1
            goto L_0x016a
        L_0x0189:
            float r12 = r12 - r8
            float r3 = r3 * r12
            float r0 = r8 - r13
            float r3 = r3 / r0
            int r0 = (int) r3
            r10.A09 = r0
            goto L_0x015b
        L_0x0192:
            r10.A03(r5, r6, r13)
            short[] r0 = r10.A0L
            r17 = r0
            int r0 = r10.A0K
            r16 = r0
            int r3 = r0 / r13
            int r14 = r10.A0I
            int r0 = r14 / r13
            r11 = 0
            r15 = r3
            r3 = r0
            r0 = r17
            int r3 = r10.A00(r0, r11, r15, r3)
            if (r13 == r12) goto L_0x012b
            int r3 = r3 * r13
            int r0 = r13 * 4
            int r13 = r3 - r0
            int r3 = r3 + r0
            r0 = r16
            if (r13 >= r0) goto L_0x01b9
            r13 = r0
        L_0x01b9:
            if (r3 <= r14) goto L_0x01bc
            r3 = r14
        L_0x01bc:
            if (r4 == r12) goto L_0x0127
            r10.A03(r5, r6, r12)
            r0 = r17
            int r3 = r10.A00(r0, r11, r13, r3)
            goto L_0x012b
        L_0x01c9:
            r13 = 1
            goto L_0x011d
        L_0x01cc:
            int r14 = r14 + r11
            r10.A05 = r14
            int r11 = r22 + r11
            goto L_0x00fd
        L_0x01d3:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            float r3 = (float) r11
            if (r0 >= 0) goto L_0x021f
            float r3 = r3 * r8
            float r13 = r13 - r8
            float r3 = r3 / r13
            int r11 = (int) r3
        L_0x01de:
            short[] r12 = r10.A0B
            int r3 = r10.A05
            int r21 = r22 + r11
            r0 = r21
            short[] r12 = A04(r10, r12, r3, r0)
            r10.A0B = r12
            int r14 = r6 * r4
            int r3 = r10.A05
            int r3 = r3 * r4
            int r0 = r4 * r22
            java.lang.System.arraycopy(r5, r14, r12, r3, r0)
            short[] r0 = r10.A0B
            r20 = r0
            int r15 = r10.A05
            int r19 = r15 + r22
            int r18 = r6 + r22
            r13 = 0
        L_0x0201:
            if (r13 >= r4) goto L_0x022a
            int r17 = r19 * r4
            int r17 = r17 + r13
            int r12 = r14 + r13
            int r3 = r18 * r4
            int r3 = r3 + r13
            r0 = 0
        L_0x020d:
            if (r0 >= r11) goto L_0x021c
            short r16 = X.Pxh.A10(r5, r3, r11, r0, r12)
            r20[r17] = r16
            int r17 = r17 + r4
            int r3 = r3 + r4
            int r12 = r12 + r4
            int r0 = r0 + 1
            goto L_0x020d
        L_0x021c:
            int r13 = r13 + 1
            goto L_0x0201
        L_0x021f:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r8
            float r0 = r0 - r13
            float r3 = r3 * r0
            float r13 = r13 - r8
            float r3 = r3 / r13
            int r0 = (int) r3
            r10.A09 = r0
            goto L_0x01de
        L_0x022a:
            int r15 = r15 + r21
            r10.A05 = r15
            goto L_0x00fd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11417SSs.A01(X.SSs):void");
    }

    private void A02(short[] sArr, int i, int i2) {
        short[] A042 = A04(this, this.A0B, this.A05, i2);
        this.A0B = A042;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, A042, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    private void A03(short[] sArr, int i, int i2) {
        int i3 = this.A0J / i2;
        int i4 = this.A0G;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.A0L[i7] = (short) (i8 / i5);
        }
    }

    public C11417SSs(float f, float f2, int i, int i2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = ((float) i) / ((float) i3);
        this.A0K = i / ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
        int i4 = i / 65;
        this.A0I = i4;
        int i5 = i4 * 2;
        this.A0J = i5;
        this.A0L = new short[i5];
        int i6 = i5 * i2;
        this.A0A = new short[i6];
        this.A0B = new short[i6];
        this.A0C = new short[i6];
    }
}
