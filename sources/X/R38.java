package X;

public final class R38 extends C11363SPb {
    public int A00 = Integer.MAX_VALUE;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final byte[] A06;

    public static void A00(R38 r38) {
        int i = r38.A02 + r38.A05;
        r38.A02 = i;
        int i2 = i - r38.A04;
        int i3 = r38.A00;
        if (i2 > i3) {
            int i4 = i2 - i3;
            r38.A05 = i4;
            r38.A02 = i - i4;
            return;
        }
        r38.A05 = 0;
    }

    public final int A0W() {
        int i = this.A03;
        if (this.A02 - i >= 4) {
            byte[] bArr = this.A06;
            this.A03 = i + 4;
            return Pxk.A02(bArr, i);
        }
        throw AnonymousClass5I7.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4[r2] < 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0X() {
        /*
            r5 = this;
            int r0 = r5.A03
            int r1 = r5.A02
            if (r1 == r0) goto L_0x003c
            byte[] r4 = r5.A06
            int r2 = r0 + 1
            byte r3 = r4[r0]
            if (r3 < 0) goto L_0x005d
            r5.A03 = r2
            return r3
        L_0x0011:
            int r2 = r1 + 1
            byte r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
        L_0x003c:
            long r0 = r5.A0a()
            int r3 = (int) r0
            return r3
        L_0x0042:
            int r2 = r1 + 1
            byte r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L_0x004f
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L_0x004d:
            r1 = r2
            goto L_0x006d
        L_0x004f:
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0011
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L_0x006d
        L_0x005d:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L_0x003c
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0042
            r3 = r3 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x006d:
            r5.A03 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R38.A0X():int");
    }

    public final long A0Y() {
        int i = this.A03;
        if (this.A02 - i >= 8) {
            byte[] bArr = this.A06;
            this.A03 = i + 8;
            return C11363SPb.A06(bArr, i);
        }
        throw AnonymousClass5I7.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (((long) r7[r11]) < 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0Z() {
        /*
            r12 = this;
            int r0 = r12.A03
            int r3 = r12.A02
            if (r3 == r0) goto L_0x002f
            byte[] r7 = r12.A06
            int r2 = r0 + 1
            byte r1 = r7[r0]
            if (r1 < 0) goto L_0x00a0
            r12.A03 = r2
            long r3 = (long) r1
            return r3
        L_0x0012:
            int r11 = r8 + 1
            byte r0 = r7[r8]
            long r1 = (long) r0
            r0 = 56
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            r0 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r5 ^ r0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
            int r8 = r11 + 1
            byte r0 = r7[r11]
            long r1 = (long) r0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b1
        L_0x002f:
            long r3 = r12.A0a()
            return r3
        L_0x0034:
            int r11 = r8 + 1
            byte r0 = r7[r8]
            int r0 = r0 << 14
            r1 = r1 ^ r0
            if (r1 < 0) goto L_0x0042
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            long r3 = (long) r0
        L_0x0040:
            r8 = r11
            goto L_0x00b1
        L_0x0042:
            int r8 = r11 + 1
            byte r0 = r7[r11]
            int r0 = r0 << 21
            r1 = r1 ^ r0
            if (r1 >= 0) goto L_0x0050
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r1 = r1 ^ r0
            goto L_0x00b0
        L_0x0050:
            long r5 = (long) r1
            int r11 = r8 + 1
            byte r0 = r7[r8]
            long r1 = (long) r0
            r0 = 28
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            r9 = 0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0065
            r3 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0063:
            long r3 = r3 ^ r5
            goto L_0x0040
        L_0x0065:
            int r8 = r11 + 1
            byte r0 = r7[r11]
            long r1 = (long) r0
            r0 = 35
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x007a
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0077:
            long r3 = r5 ^ r0
            goto L_0x00b1
        L_0x007a:
            int r11 = r8 + 1
            byte r0 = r7[r8]
            long r1 = (long) r0
            r0 = 42
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x008d
            r3 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0063
        L_0x008d:
            int r8 = r11 + 1
            byte r0 = r7[r11]
            long r1 = (long) r0
            r0 = 49
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0077
        L_0x00a0:
            int r3 = r3 - r2
            r0 = 9
            if (r3 < r0) goto L_0x002f
            int r8 = r2 + 1
            byte r0 = r7[r2]
            int r0 = r0 << 7
            r1 = r1 ^ r0
            if (r1 >= 0) goto L_0x0034
            r1 = r1 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x00b0:
            long r3 = (long) r1
        L_0x00b1:
            r12.A03 = r8
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R38.A0Z():long");
    }

    public final long A0a() {
        long j = 0;
        int i = 0;
        do {
            int i2 = this.A03;
            if (i2 != this.A02) {
                byte[] bArr = this.A06;
                this.A03 = i2 + 1;
                byte b = bArr[i2];
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
                i += 7;
            } else {
                throw AnonymousClass5I7.A02();
            }
        } while (i < 64);
        throw Pxg.A0T("CodedInputStream encountered a malformed varint.");
    }

    public R38(byte[] bArr, int i, int i2) {
        this.A06 = bArr;
        this.A02 = i2 + i;
        this.A03 = i;
        this.A04 = i;
    }
}
