package X;

import com.google.protobuf.UnsafeUtil;
import java.nio.ByteBuffer;

public final class R39 extends C11363SPb {
    public int A00 = Integer.MAX_VALUE;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public int A05;
    public final long A06;
    public final ByteBuffer A07;

    public static void A00(R39 r39) {
        long j = r39.A02 + ((long) r39.A05);
        r39.A02 = j;
        int i = (int) (j - r39.A04);
        int i2 = r39.A00;
        if (i > i2) {
            int i3 = i - i2;
            r39.A05 = i3;
            r39.A02 = j - ((long) i3);
            return;
        }
        r39.A05 = 0;
    }

    public final int A0W() {
        long j = this.A03;
        if (this.A02 - j >= 4) {
            this.A03 = 4 + j;
            SK5 sk5 = UnsafeUtil.A02;
            return ((sk5.A01(j + 3) & 255) << 24) | (sk5.A01(j) & 255) | ((sk5.A01(1 + j) & 255) << 8) | ((sk5.A01(2 + j) & 255) << 16);
        }
        throw AnonymousClass5I7.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r6.A01(r3) < 0) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0X() {
        /*
            r11 = this;
            long r0 = r11.A03
            long r3 = r11.A02
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x004e
            r9 = 1
            long r3 = r0 + r9
            X.SK5 r6 = com.google.protobuf.UnsafeUtil.A02
            byte r5 = r6.A01(r0)
            if (r5 < 0) goto L_0x0073
            r11.A03 = r3
            return r5
        L_0x0017:
            long r3 = r1 + r9
            byte r1 = r6.A01(r1)
            int r0 = r1 << 28
            r5 = r5 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r5 = r5 ^ r0
            if (r1 >= 0) goto L_0x0061
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            if (r0 >= 0) goto L_0x0089
            long r3 = r1 + r9
            byte r0 = r6.A01(r1)
            if (r0 >= 0) goto L_0x0061
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            if (r0 >= 0) goto L_0x0089
            long r3 = r1 + r9
            byte r0 = r6.A01(r1)
            if (r0 >= 0) goto L_0x0061
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            if (r0 >= 0) goto L_0x0089
        L_0x004e:
            long r0 = r11.A0a()
            int r5 = (int) r0
            return r5
        L_0x0054:
            long r3 = r1 + r9
            byte r0 = r6.A01(r1)
            int r0 = r0 << 14
            r5 = r5 ^ r0
            if (r5 < 0) goto L_0x0063
            r5 = r5 ^ 16256(0x3f80, float:2.278E-41)
        L_0x0061:
            r1 = r3
            goto L_0x0089
        L_0x0063:
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            int r0 = r0 << 21
            r5 = r5 ^ r0
            if (r5 >= 0) goto L_0x0017
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r5 = r5 ^ r0
            goto L_0x0089
        L_0x0073:
            long r1 = r11.A02
            long r1 = r1 - r3
            r7 = 9
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x004e
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            int r0 = r0 << 7
            r5 = r5 ^ r0
            if (r5 >= 0) goto L_0x0054
            r5 = r5 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0089:
            r11.A03 = r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R39.A0X():int");
    }

    public final long A0Y() {
        long j = this.A03;
        if (this.A02 - j >= 8) {
            this.A03 = 8 + j;
            SK5 sk5 = UnsafeUtil.A02;
            return ((((long) sk5.A01(j + 7)) & 255) << 56) | Pxg.A0C(sk5.A01(2 + j), (((long) sk5.A01(j)) & 255) | ((((long) sk5.A01(1 + j)) & 255) << 8)) | ((((long) sk5.A01(3 + j)) & 255) << 24) | ((((long) sk5.A01(4 + j)) & 255) << 32) | ((((long) sk5.A01(5 + j)) & 255) << 40) | ((((long) sk5.A01(6 + j)) & 255) << 48);
        }
        throw AnonymousClass5I7.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (((long) r7.A01(r1)) < 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0Z() {
        /*
            r12 = this;
            long r2 = r12.A03
            long r4 = r12.A02
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0038
            r10 = 1
            long r0 = r2 + r10
            X.SK5 r7 = com.google.protobuf.UnsafeUtil.A02
            byte r5 = r7.A01(r2)
            if (r5 < 0) goto L_0x00b4
            r12.A03 = r0
            long r5 = (long) r5
            return r5
        L_0x0018:
            long r1 = r3 + r10
            byte r0 = r7.A01(r3)
            long r3 = (long) r0
            r0 = 56
            long r3 = r3 << r0
            long r5 = r5 ^ r3
            r3 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r5 = r5 ^ r3
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x004b
            long r3 = r10 + r1
            byte r0 = r7.A01(r1)
            long r1 = (long) r0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cb
        L_0x0038:
            long r5 = r12.A0a()
            return r5
        L_0x003d:
            long r1 = r3 + r10
            byte r0 = r7.A01(r3)
            int r0 = r0 << 14
            r5 = r5 ^ r0
            if (r5 < 0) goto L_0x004d
            r0 = r5 ^ 16256(0x3f80, float:2.278E-41)
            long r5 = (long) r0
        L_0x004b:
            r3 = r1
            goto L_0x00cb
        L_0x004d:
            long r3 = r1 + r10
            byte r0 = r7.A01(r1)
            int r0 = r0 << 21
            r5 = r5 ^ r0
            if (r5 >= 0) goto L_0x005d
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r5 = r5 ^ r0
            goto L_0x00ca
        L_0x005d:
            long r5 = (long) r5
            long r1 = r3 + r10
            byte r0 = r7.A01(r3)
            long r3 = (long) r0
            r0 = 28
            long r3 = r3 << r0
            long r5 = r5 ^ r3
            r8 = 0
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0074
            r3 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0072:
            long r5 = r5 ^ r3
            goto L_0x004b
        L_0x0074:
            long r3 = r1 + r10
            byte r0 = r7.A01(r1)
            long r1 = (long) r0
            r0 = 35
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x008a
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0088:
            long r5 = r5 ^ r0
            goto L_0x00cb
        L_0x008a:
            long r1 = r3 + r10
            byte r0 = r7.A01(r3)
            long r3 = (long) r0
            r0 = 42
            long r3 = r3 << r0
            long r5 = r5 ^ r3
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x009f
            r3 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0072
        L_0x009f:
            long r3 = r1 + r10
            byte r0 = r7.A01(r1)
            long r1 = (long) r0
            r0 = 49
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0018
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0088
        L_0x00b4:
            long r3 = r12.A02
            long r3 = r3 - r0
            r8 = 9
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0038
            long r3 = r0 + r10
            byte r0 = r7.A01(r0)
            int r0 = r0 << 7
            r5 = r5 ^ r0
            if (r5 >= 0) goto L_0x003d
            r5 = r5 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x00ca:
            long r5 = (long) r5
        L_0x00cb:
            r12.A03 = r3
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R39.A0Z():long");
    }

    public final long A0a() {
        long j = 0;
        int i = 0;
        do {
            long j2 = this.A03;
            if (j2 != this.A02) {
                this.A03 = 1 + j2;
                byte A012 = UnsafeUtil.A02.A01(j2);
                j |= ((long) (A012 & Byte.MAX_VALUE)) << i;
                if ((A012 & 128) == 0) {
                    return j;
                }
                i += 7;
            } else {
                throw AnonymousClass5I7.A02();
            }
        } while (i < 64);
        throw Pxg.A0T("CodedInputStream encountered a malformed varint.");
    }

    public R39(ByteBuffer byteBuffer) {
        this.A07 = byteBuffer;
        long A072 = UnsafeUtil.A02.A07(byteBuffer, UnsafeUtil.A00);
        this.A06 = A072;
        this.A02 = ((long) byteBuffer.limit()) + A072;
        long position = A072 + ((long) byteBuffer.position());
        this.A03 = position;
        this.A04 = position;
    }
}
