package X;

import java.nio.ShortBuffer;
import java.util.Arrays;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.SSx  reason: case insensitive filesystem */
public final class C11421SSx {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public short[] A0B;
    public short[] A0C;
    public short[] A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public static short[] A04(C11421SSx sSx, short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = sSx.A0G;
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
        this.A03 = i5 / i7;
        this.A02 = i8 / i6;
        return i7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C11421SSx r21) {
        /*
            r5 = r21
            int r4 = r5.A06
            float r7 = r5.A0F
            float r0 = r5.A00
            float r7 = r7 / r0
            float r3 = r5.A0E
            float r3 = r3 * r0
            double r1 = (double) r7
            r8 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00d8
            r8 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00d8
            short[] r1 = r5.A0B
            int r0 = r5.A01
            r6 = 0
            r5.A02(r1, r6, r0)
        L_0x0027:
            r5.A01 = r6
        L_0x0029:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0079
            int r8 = r5.A06
            if (r8 == r4) goto L_0x0079
            int r9 = r5.A0H
            float r0 = (float) r9
            float r0 = r0 / r3
            int r10 = (int) r0
        L_0x0038:
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r10 > r0) goto L_0x00d2
            if (r9 > r0) goto L_0x00d2
            int r8 = r8 - r4
            short[] r1 = r5.A0D
            int r0 = r5.A07
            short[] r6 = A04(r5, r1, r0, r8)
            r5.A0D = r6
            short[] r3 = r5.A0C
            int r7 = r5.A0G
            int r2 = r4 * r7
            int r1 = r5.A07
            int r1 = r1 * r7
            int r0 = r7 * r8
            java.lang.System.arraycopy(r3, r2, r6, r1, r0)
            r5.A06 = r4
            int r0 = r5.A07
            int r0 = r0 + r8
            r5.A07 = r0
            r6 = 0
            r8 = 0
        L_0x0060:
            int r11 = r5.A07
            int r0 = r11 + -1
            r3 = 1
            if (r8 < r0) goto L_0x007a
            int r2 = r11 - r3
            if (r2 == 0) goto L_0x0079
            short[] r1 = r5.A0D
            int r0 = r2 * r7
            int r11 = r11 - r2
            int r11 = r11 * r7
            java.lang.System.arraycopy(r1, r0, r1, r6, r11)
            int r0 = r5.A07
            int r0 = r0 - r2
            r5.A07 = r0
        L_0x0079:
            return
        L_0x007a:
            int r0 = r5.A05
            int r11 = r0 + 1
            int r2 = r11 * r10
            int r1 = r5.A04
            int r0 = r1 * r9
            if (r2 <= r0) goto L_0x00c5
            short[] r0 = r5.A0C
            short[] r12 = A04(r5, r0, r4, r3)
            r5.A0C = r12
            r11 = 0
        L_0x008f:
            if (r11 >= r7) goto L_0x00b8
            int r4 = r5.A06
            int r4 = r4 * r7
            int r4 = r4 + r11
            short[] r1 = r5.A0D
            int r0 = r7 * r8
            int r0 = r0 + r11
            short r13 = r1[r0]
            int r0 = r0 + r7
            short r15 = r1[r0]
            int r14 = r5.A04
            int r14 = r14 * r9
            int r0 = r5.A05
            int r2 = r0 * r10
            int r1 = r0 + 1
            int r1 = r1 * r10
            int r0 = r1 - r14
            int r1 = r1 - r2
            int r13 = r13 * r0
            int r0 = r1 - r0
            int r0 = r0 * r15
            int r13 = r13 + r0
            int r13 = r13 / r1
            short r0 = (short) r13
            r12[r4] = r0
            int r11 = r11 + 1
            goto L_0x008f
        L_0x00b8:
            int r0 = r5.A04
            int r0 = r0 + 1
            r5.A04 = r0
            int r0 = r5.A06
            int r4 = r0 + 1
            r5.A06 = r4
            goto L_0x007a
        L_0x00c5:
            r5.A05 = r11
            if (r11 != r9) goto L_0x00cf
            r5.A05 = r6
            if (r1 != r10) goto L_0x0218
            r5.A04 = r6
        L_0x00cf:
            int r8 = r8 + 1
            goto L_0x0060
        L_0x00d2:
            int r10 = r10 / 2
            int r9 = r9 / 2
            goto L_0x0038
        L_0x00d8:
            int r0 = r5.A01
            r21 = r0
            int r8 = r5.A0J
            if (r0 < r8) goto L_0x0029
            r9 = 0
        L_0x00e1:
            int r0 = r5.A0A
            if (r0 <= 0) goto L_0x0109
            int r10 = java.lang.Math.min(r8, r0)
            short[] r0 = r5.A0B
            r5.A02(r0, r9, r10)
            int r0 = r5.A0A
            int r0 = r0 - r10
            r5.A0A = r0
        L_0x00f3:
            int r9 = r9 + r10
            int r1 = r8 + r9
            r0 = r21
            if (r1 <= r0) goto L_0x00e1
            int r6 = r5.A01
            int r6 = r6 - r9
            short[] r2 = r5.A0B
            int r1 = r5.A0G
            int r9 = r9 * r1
            int r1 = r1 * r6
            r0 = 0
            java.lang.System.arraycopy(r2, r9, r2, r0, r1)
            goto L_0x0027
        L_0x0109:
            short[] r6 = r5.A0B
            int r15 = r5.A0H
            r0 = 4000(0xfa0, float:5.605E-42)
            r14 = 1
            if (r15 <= r0) goto L_0x01b4
            int r15 = r15 / r0
        L_0x0113:
            int r2 = r5.A0G
            if (r2 != r14) goto L_0x0189
            if (r15 != r14) goto L_0x0189
            int r15 = r5.A0K
            int r1 = r5.A0I
        L_0x011d:
            int r1 = r5.A00(r6, r9, r15, r1)
        L_0x0121:
            int r12 = r5.A03
            int r11 = r5.A02
            if (r12 == 0) goto L_0x0137
            int r10 = r5.A09
            if (r10 == 0) goto L_0x0137
            int r0 = r12 * 3
            if (r11 > r0) goto L_0x0137
            int r11 = r12 * 2
            int r0 = r5.A08
            int r0 = r0 * 3
            if (r11 > r0) goto L_0x0138
        L_0x0137:
            r10 = r1
        L_0x0138:
            r5.A08 = r12
            r5.A09 = r1
            r18 = r10
            double r0 = (double) r7
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 <= 0) goto L_0x01be
            r11 = 1073741824(0x40000000, float:2.0)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            float r1 = (float) r10
            if (r0 < 0) goto L_0x0180
            float r0 = r7 - r12
            float r1 = r1 / r0
            int r10 = (int) r1
        L_0x0152:
            short[] r1 = r5.A0C
            int r0 = r5.A06
            short[] r15 = A04(r5, r1, r0, r10)
            r5.A0C = r15
            int r14 = r5.A06
            int r17 = r9 + r18
            r13 = 0
        L_0x0161:
            if (r13 >= r2) goto L_0x01b7
            int r16 = r14 * r2
            int r16 = r16 + r13
            int r12 = r17 * r2
            int r12 = r12 + r13
            int r11 = r9 * r2
            int r11 = r11 + r13
            r1 = 0
        L_0x016e:
            if (r1 >= r10) goto L_0x017d
            short r0 = X.Pxh.A10(r6, r11, r10, r1, r12)
            r15[r16] = r0
            int r16 = r16 + r2
            int r11 = r11 + r2
            int r12 = r12 + r2
            int r1 = r1 + 1
            goto L_0x016e
        L_0x017d:
            int r13 = r13 + 1
            goto L_0x0161
        L_0x0180:
            float r11 = r11 - r7
            float r1 = r1 * r11
            float r0 = r7 - r12
            float r1 = r1 / r0
            int r0 = (int) r1
            r5.A0A = r0
            goto L_0x0152
        L_0x0189:
            r5.A03(r6, r9, r15)
            short[] r13 = r5.A0L
            int r12 = r5.A0K
            int r1 = r12 / r15
            int r11 = r5.A0I
            int r0 = r11 / r15
            r10 = 0
            int r1 = r5.A00(r13, r10, r1, r0)
            if (r15 == r14) goto L_0x0121
            int r1 = r1 * r15
            int r0 = r15 * 4
            int r15 = r1 - r0
            int r1 = r1 + r0
            if (r15 >= r12) goto L_0x01a6
            r15 = r12
        L_0x01a6:
            if (r1 <= r11) goto L_0x01a9
            r1 = r11
        L_0x01a9:
            if (r2 == r14) goto L_0x011d
            r5.A03(r6, r9, r14)
            int r1 = r5.A00(r13, r10, r15, r1)
            goto L_0x0121
        L_0x01b4:
            r15 = 1
            goto L_0x0113
        L_0x01b7:
            int r14 = r14 + r10
            r5.A06 = r14
            int r10 = r18 + r10
            goto L_0x00f3
        L_0x01be:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            float r1 = (float) r10
            if (r0 >= 0) goto L_0x0208
            float r1 = r1 * r7
            float r12 = r12 - r7
            float r1 = r1 / r12
            int r10 = (int) r1
        L_0x01c9:
            short[] r1 = r5.A0C
            int r0 = r5.A06
            int r14 = r18 + r10
            short[] r11 = A04(r5, r1, r0, r14)
            r5.A0C = r11
            int r13 = r9 * r2
            int r1 = r5.A06
            int r1 = r1 * r2
            int r0 = r2 * r18
            java.lang.System.arraycopy(r6, r13, r11, r1, r0)
            short[] r0 = r5.A0C
            r20 = r0
            int r15 = r5.A06
            int r19 = r15 + r18
            int r18 = r9 + r18
            r12 = 0
        L_0x01ea:
            if (r12 >= r2) goto L_0x0213
            int r17 = r19 * r2
            int r17 = r17 + r12
            int r11 = r13 + r12
            int r1 = r18 * r2
            int r1 = r1 + r12
            r0 = 0
        L_0x01f6:
            if (r0 >= r10) goto L_0x0205
            short r16 = X.Pxh.A10(r6, r1, r10, r0, r11)
            r20[r17] = r16
            int r17 = r17 + r2
            int r1 = r1 + r2
            int r11 = r11 + r2
            int r0 = r0 + 1
            goto L_0x01f6
        L_0x0205:
            int r12 = r12 + 1
            goto L_0x01ea
        L_0x0208:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r7
            float r0 = r0 - r12
            float r1 = r1 * r0
            float r12 = r12 - r7
            float r1 = r1 / r12
            int r0 = (int) r1
            r5.A0A = r0
            goto L_0x01c9
        L_0x0213:
            int r15 = r15 + r14
            r5.A06 = r15
            goto L_0x00f3
        L_0x0218:
            java.lang.String r0 = "Wrong sample rate"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11421SSx.A01(X.SSx):void");
    }

    private void A02(short[] sArr, int i, int i2) {
        short[] A042 = A04(this, this.A0C, this.A06, i2);
        this.A0C = A042;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, A042, this.A06 * i3, i3 * i2);
        this.A06 += i2;
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

    public C11421SSx(float f, float f2, int i, int i2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A00 = f2;
        this.A0E = ((float) i) / ((float) i3);
        this.A0K = i / ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
        int i4 = i / 65;
        this.A0I = i4;
        int i5 = i4 * 2;
        this.A0J = i5;
        this.A0L = new short[i5];
        int i6 = i5 * i2;
        this.A0B = new short[i6];
        this.A0C = new short[i6];
        this.A0D = new short[i6];
    }

    public final void A05(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.A0G;
        int min = Math.min(remaining / i, this.A06);
        shortBuffer.put(this.A0C, 0, i * min);
        int i2 = this.A06 - min;
        this.A06 = i2;
        short[] sArr = this.A0C;
        System.arraycopy(sArr, min * i, sArr, 0, i2 * i);
    }
}
