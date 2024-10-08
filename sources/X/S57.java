package X;

import com.google.protobuf.UnsafeUtil;
import java.nio.ByteBuffer;

public abstract class S57 {
    public static final String A01(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r13 < i4) {
                byte b = byteBuffer.get(r13);
                if (b < 0) {
                    break;
                }
                i = r13 + 1;
                cArr[i3] = (char) b;
                i5 = i3 + 1;
            }
            while (true) {
                int i6 = i3;
                if (r13 < i4) {
                    int i7 = r13 + 1;
                    byte b2 = byteBuffer.get(r13);
                    if (b2 < 0) {
                        if (b2 >= -32) {
                            if (b2 >= -16) {
                                if (i7 >= i4 - 2) {
                                    break;
                                }
                                int i8 = i7 + 1;
                                int i9 = i8 + 1;
                                r13 = i9 + 1;
                                C11311SKz.A00(cArr, b2, byteBuffer.get(i7), byteBuffer.get(i8), byteBuffer.get(i9), i3);
                                i3 = i3 + 1 + 1;
                            } else if (i7 >= i4 - 1) {
                                break;
                            } else {
                                int i10 = i7 + 1;
                                r13 = i10 + 1;
                                i3++;
                                C11311SKz.A01(cArr, b2, byteBuffer.get(i7), byteBuffer.get(i10), i6);
                            }
                        } else if (i7 >= i4) {
                            break;
                        } else {
                            r13 = i7 + 1;
                            i3++;
                            C11311SKz.A02(cArr, b2, byteBuffer.get(i7), i6);
                        }
                    } else {
                        i3++;
                        cArr[i6] = (char) b2;
                        while (i7 < i4) {
                            byte b3 = byteBuffer.get(i7);
                            if (b3 < 0) {
                                break;
                            }
                            i7++;
                            cArr[i3] = (char) b3;
                            i3++;
                        }
                        r13 = i7;
                    }
                } else {
                    return new String(cArr, 0, i3);
                }
            }
            throw Pxg.A0T("Protocol message had invalid UTF-8.");
        }
        throw Pxf.A0V("buffer limit=%d, index=%d, limit=%d", Pxh.A1a(byteBuffer.limit(), i, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r12 < 2048) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0173, code lost:
        if (r4 < 2048) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[LOOP:1: B:15:0x003c->B:21:0x004e, LOOP_START, PHI: r1 r2 r13 
      PHI: (r1v18 char) = (r1v17 char), (r1v23 char) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v14 long) = (r2v13 long), (r2v25 long) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
        /*
            r20 = this;
            r0 = r20
            r9 = r24
            r1 = r23
            boolean r0 = r0 instanceof X.R5k
            r8 = r21
            r7 = r22
            if (r0 == 0) goto L_0x013c
            long r2 = (long) r1
            long r5 = (long) r9
            long r5 = r5 + r2
            int r4 = r8.length()
            java.lang.String r11 = " at index "
            java.lang.String r19 = "Failed writing "
            if (r4 > r9) goto L_0x0120
            int r0 = r7.length
            int r0 = r0 - r24
            if (r0 < r1) goto L_0x0120
            r13 = 0
        L_0x0021:
            r1 = 128(0x80, float:1.794E-43)
            r17 = 1
            if (r13 >= r4) goto L_0x0038
            char r0 = r8.charAt(r13)
            if (r0 >= r1) goto L_0x0038
            long r17 = r17 + r2
            byte r0 = (byte) r0
            com.google.protobuf.UnsafeUtil.A08(r7, r0, r2)
            int r13 = r13 + 1
            r2 = r17
            goto L_0x0021
        L_0x0038:
            if (r13 != r4) goto L_0x003c
        L_0x003a:
            int r0 = (int) r2
            return r0
        L_0x003c:
            if (r13 >= r4) goto L_0x003a
            char r12 = r8.charAt(r13)
            if (r12 >= r1) goto L_0x0054
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            long r14 = r2 + r17
            byte r0 = (byte) r12
            com.google.protobuf.UnsafeUtil.A08(r7, r0, r2)
        L_0x004e:
            int r13 = r13 + 1
            r1 = 128(0x80, float:1.794E-43)
            r2 = r14
            goto L_0x003c
        L_0x0054:
            r0 = 2048(0x800, float:2.87E-42)
            if (r12 >= r0) goto L_0x0076
        L_0x0058:
            r0 = 2
            long r9 = r5 - r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0076
            long r0 = r2 + r17
            int r9 = r12 >>> 6
            r9 = r9 | 960(0x3c0, float:1.345E-42)
            byte r9 = (byte) r9
            com.google.protobuf.UnsafeUtil.A08(r7, r9, r2)
            long r14 = r0 + r17
            r9 = r12 & 63
            r2 = 128(0x80, float:1.794E-43)
            r9 = r9 | r2
        L_0x0071:
            byte r2 = (byte) r9
            com.google.protobuf.UnsafeUtil.A08(r7, r2, r0)
            goto L_0x004e
        L_0x0076:
            r14 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r1) goto L_0x0080
            if (r14 >= r12) goto L_0x00a5
        L_0x0080:
            r15 = 3
            long r9 = r5 - r15
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00a5
            long r9 = r2 + r17
            int r0 = r12 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            com.google.protobuf.UnsafeUtil.A08(r7, r0, r2)
            long r0 = r9 + r17
            int r2 = r12 >>> 6
            r2 = r2 & 63
            r3 = 128(0x80, float:1.794E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            com.google.protobuf.UnsafeUtil.A08(r7, r2, r9)
            long r14 = r0 + r17
            r9 = r12 & 63
            r9 = r9 | r3
            goto L_0x0071
        L_0x00a5:
            r15 = 4
            long r9 = r5 - r15
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00f7
            int r9 = r13 + 1
            if (r9 == r4) goto L_0x00ef
            char r1 = r8.charAt(r9)
            boolean r0 = java.lang.Character.isSurrogatePair(r12, r1)
            if (r0 == 0) goto L_0x00ee
            int r13 = java.lang.Character.toCodePoint(r12, r1)
            long r0 = r2 + r17
            int r10 = r13 >>> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A08(r7, r10, r2)
            long r2 = r0 + r17
            int r10 = r13 >>> 12
            r10 = r10 & 63
            r12 = 128(0x80, float:1.794E-43)
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A08(r7, r10, r0)
            long r0 = r2 + r17
            int r10 = r13 >>> 6
            r10 = r10 & 63
            r10 = r10 | r12
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A08(r7, r10, r2)
            long r14 = r0 + r17
            r2 = r13 & 63
            r2 = r2 | r12
            byte r2 = (byte) r2
            com.google.protobuf.UnsafeUtil.A08(r7, r2, r0)
            r13 = r9
            goto L_0x004e
        L_0x00ee:
            r13 = r9
        L_0x00ef:
            int r1 = r13 + -1
            X.RKu r0 = new X.RKu
            r0.<init>(r1, r4)
            throw r0
        L_0x00f7:
            if (r1 > r12) goto L_0x010f
            if (r12 > r14) goto L_0x010f
            int r0 = r13 + 1
            if (r0 == r4) goto L_0x0109
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r12, r0)
            if (r0 != 0) goto L_0x010f
        L_0x0109:
            X.RKu r0 = new X.RKu
            r0.<init>(r13, r4)
            throw r0
        L_0x010f:
            java.lang.StringBuilder r0 = X.AnonymousClass7TF.A0n(r19)
            r0.append(r12)
            java.lang.String r1 = X.Pxg.A0u(r11, r0, r2)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0120:
            java.lang.StringBuilder r2 = X.AnonymousClass7TF.A0n(r19)
            int r0 = r4 + -1
            char r0 = r8.charAt(r0)
            r2.append(r0)
            r2.append(r11)
            int r1 = r23 + r24
            java.lang.String r1 = X.Pxe.A0z(r2, r1)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x013c:
            int r3 = r8.length()
            int r9 = r24 + r23
            r10 = 0
        L_0x0143:
            r6 = 128(0x80, float:1.794E-43)
            if (r10 >= r3) goto L_0x0157
            int r2 = r10 + r23
            if (r2 >= r9) goto L_0x0157
            char r0 = r8.charAt(r10)
            if (r0 >= r6) goto L_0x0157
            byte r0 = (byte) r0
            r22[r2] = r0
            int r10 = r10 + 1
            goto L_0x0143
        L_0x0157:
            int r2 = r23 + r10
            if (r10 != r3) goto L_0x015e
            int r2 = r23 + r3
        L_0x015d:
            return r2
        L_0x015e:
            if (r10 >= r3) goto L_0x015d
            char r4 = r8.charAt(r10)
            if (r4 >= r6) goto L_0x0171
            if (r2 >= r9) goto L_0x0175
            int r1 = r2 + 1
        L_0x016a:
            byte r0 = (byte) r4
            r22[r2] = r0
            r2 = r1
        L_0x016e:
            int r10 = r10 + 1
            goto L_0x015e
        L_0x0171:
            r0 = 2048(0x800, float:2.87E-42)
            if (r4 >= r0) goto L_0x0188
        L_0x0175:
            int r0 = r9 + -2
            if (r2 > r0) goto L_0x0188
            int r1 = r2 + 1
            int r0 = r4 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            byte r0 = (byte) r0
            r22[r2] = r0
            int r2 = r1 + 1
            X.Pxe.A1I(r4, r7, r1)
            goto L_0x016e
        L_0x0188:
            r5 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r1) goto L_0x0192
            if (r5 >= r4) goto L_0x01ac
        L_0x0192:
            int r0 = r9 + -3
            if (r2 > r0) goto L_0x01ac
            int r1 = r2 + 1
            int r0 = r4 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            r22[r2] = r0
            int r2 = r1 + 1
            int r0 = r4 >>> 6
            X.Pxe.A1I(r0, r7, r1)
            int r1 = r2 + 1
            r4 = r4 & 63
            r4 = r4 | r6
            goto L_0x016a
        L_0x01ac:
            int r0 = r9 + -4
            if (r2 > r0) goto L_0x01ed
            int r5 = r10 + 1
            int r0 = r8.length()
            if (r5 == r0) goto L_0x01e5
            char r1 = r8.charAt(r5)
            boolean r0 = java.lang.Character.isSurrogatePair(r4, r1)
            if (r0 == 0) goto L_0x01e4
            int r4 = java.lang.Character.toCodePoint(r4, r1)
            int r1 = r2 + 1
            int r0 = r4 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0
            r22[r2] = r0
            int r2 = r1 + 1
            int r0 = r4 >>> 12
            X.Pxe.A1I(r0, r7, r1)
            int r1 = r2 + 1
            int r0 = r4 >>> 6
            X.Pxe.A1I(r0, r7, r2)
            int r2 = r1 + 1
            X.Pxe.A1I(r4, r7, r1)
            r10 = r5
            goto L_0x016e
        L_0x01e4:
            r10 = r5
        L_0x01e5:
            int r0 = r10 + -1
            X.RKu r1 = new X.RKu
            r1.<init>(r0, r3)
            throw r1
        L_0x01ed:
            if (r1 > r4) goto L_0x0209
            if (r4 > r5) goto L_0x0209
            int r1 = r10 + 1
            int r0 = r8.length()
            if (r1 == r0) goto L_0x0203
            char r0 = r8.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r4, r0)
            if (r0 != 0) goto L_0x0209
        L_0x0203:
            X.RKu r1 = new X.RKu
            r1.<init>(r10, r3)
            throw r1
        L_0x0209:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " at index "
            java.lang.String r0 = X.Pxg.A0t(r0, r1, r2)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S57.A02(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0037 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008f A[LOOP:0: B:5:0x0017->B:51:0x008f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.R5k
            if (r0 == 0) goto L_0x0028
            r2 = r14 | r15
            int r1 = r13.length
            int r0 = r1 - r15
            r2 = r2 | r0
            if (r2 < 0) goto L_0x00f1
            long r0 = (long) r14
            long r2 = (long) r15
            long r2 = r2 - r0
            int r6 = (int) r2
            int r2 = X.R5k.A00(r13, r6, r0)
            int r6 = r6 - r2
            long r2 = (long) r2
            long r0 = r0 + r2
        L_0x0017:
            r7 = 0
        L_0x0018:
            r10 = 1
            if (r6 <= 0) goto L_0x0072
            long r2 = r0 + r10
            byte r7 = com.google.protobuf.UnsafeUtil.A00(r13, r0)
            if (r7 < 0) goto L_0x0076
            int r6 = r6 + -1
            r0 = r2
            goto L_0x0018
        L_0x0028:
            if (r14 >= r15) goto L_0x0031
            byte r0 = r13[r14]
            if (r0 < 0) goto L_0x0031
            int r14 = r14 + 1
            goto L_0x0028
        L_0x0031:
            if (r14 < r15) goto L_0x0034
            goto L_0x0074
        L_0x0034:
            if (r14 < r15) goto L_0x0038
            r9 = 0
        L_0x0037:
            return r9
        L_0x0038:
            int r4 = r14 + 1
            byte r7 = r13[r14]
            if (r7 >= 0) goto L_0x00ee
            r6 = -32
            r9 = -1
            r5 = -65
            if (r7 >= r6) goto L_0x0052
            if (r4 >= r15) goto L_0x0075
            r0 = -62
            if (r7 < r0) goto L_0x0037
            int r14 = r4 + 1
            byte r0 = r13[r4]
        L_0x004f:
            if (r0 <= r5) goto L_0x0034
            return r9
        L_0x0052:
            r0 = -16
            if (r7 >= r0) goto L_0x00d1
            int r0 = r15 + -1
            if (r4 >= r0) goto L_0x00fc
            int r3 = r4 + 1
            byte r2 = r13[r4]
            if (r2 > r5) goto L_0x0037
            r1 = -96
            if (r7 != r6) goto L_0x006b
            if (r2 < r1) goto L_0x0037
        L_0x0066:
            int r14 = r3 + 1
            byte r0 = r13[r3]
            goto L_0x004f
        L_0x006b:
            r0 = -19
            if (r7 != r0) goto L_0x0066
            if (r2 >= r1) goto L_0x0037
            goto L_0x0066
        L_0x0072:
            if (r6 != 0) goto L_0x0077
        L_0x0074:
            r7 = 0
        L_0x0075:
            return r7
        L_0x0076:
            r0 = r2
        L_0x0077:
            int r3 = r6 + -1
            r8 = -32
            r5 = -65
            r9 = -1
            if (r7 >= r8) goto L_0x0091
            if (r3 == 0) goto L_0x0075
            int r6 = r3 + -1
            r2 = -62
            if (r7 < r2) goto L_0x0037
        L_0x0088:
            long r10 = r10 + r0
            byte r0 = com.google.protobuf.UnsafeUtil.A00(r13, r0)
        L_0x008d:
            if (r0 > r5) goto L_0x0037
            r0 = r10
            goto L_0x0017
        L_0x0091:
            r2 = -16
            if (r7 >= r2) goto L_0x00b5
            r2 = 2
            if (r3 < r2) goto L_0x0122
            int r6 = r3 + -2
            long r2 = r0 + r10
            byte r4 = com.google.protobuf.UnsafeUtil.A00(r13, r0)
            if (r4 > r5) goto L_0x0037
            r1 = -96
            if (r7 != r8) goto L_0x00ae
            if (r4 < r1) goto L_0x0037
        L_0x00a8:
            long r10 = r10 + r2
            byte r0 = com.google.protobuf.UnsafeUtil.A00(r13, r2)
            goto L_0x008d
        L_0x00ae:
            r0 = -19
            if (r7 != r0) goto L_0x00a8
            if (r4 >= r1) goto L_0x0037
            goto L_0x00a8
        L_0x00b5:
            r2 = 3
            if (r3 < r2) goto L_0x0122
            int r6 = r3 + -3
            long r2 = r0 + r10
            byte r0 = com.google.protobuf.UnsafeUtil.A00(r13, r0)
            if (r0 > r5) goto L_0x0037
            int r0 = X.Pxi.A04(r7, r0)
            if (r0 != 0) goto L_0x0037
            long r0 = r2 + r10
            byte r2 = com.google.protobuf.UnsafeUtil.A00(r13, r2)
            if (r2 > r5) goto L_0x0037
            goto L_0x0088
        L_0x00d1:
            int r0 = r15 + -2
            if (r4 >= r0) goto L_0x00fc
            int r2 = r4 + 1
            byte r0 = r13[r4]
            if (r0 > r5) goto L_0x0037
            int r0 = X.Pxi.A04(r7, r0)
            if (r0 != 0) goto L_0x0037
            int r1 = r2 + 1
            byte r0 = r13[r2]
            if (r0 > r5) goto L_0x0037
            int r4 = r1 + 1
            byte r0 = r13[r1]
            if (r0 <= r5) goto L_0x00ee
            return r9
        L_0x00ee:
            r14 = r4
            goto L_0x0034
        L_0x00f1:
            java.lang.Object[] r1 = X.Pxh.A1a(r1, r14, r15)
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.Pxf.A0V(r0, r1)
            throw r0
        L_0x00fc:
            X.S57 r0 = X.SC5.A00
            int r0 = r4 + -1
            byte r7 = r13[r0]
            int r15 = r15 - r4
            if (r15 == 0) goto L_0x011c
            r0 = 1
            if (r15 == r0) goto L_0x0117
            r0 = 2
            if (r15 != r0) goto L_0x0112
            byte r2 = r13[r4]
            int r0 = r4 + 1
            byte r1 = r13[r0]
            goto L_0x0135
        L_0x0112:
            java.lang.AssertionError r0 = X.Pxe.A0d()
            throw r0
        L_0x0117:
            byte r1 = r13[r4]
            goto L_0x014a
        L_0x011a:
            X.S57 r0 = X.SC5.A00
        L_0x011c:
            r0 = -12
            if (r7 <= r0) goto L_0x0143
        L_0x0120:
            r7 = -1
            return r7
        L_0x0122:
            if (r3 == 0) goto L_0x011a
            r2 = 1
            if (r3 == r2) goto L_0x0144
            r2 = 2
            if (r3 != r2) goto L_0x0153
            byte r2 = com.google.protobuf.UnsafeUtil.A00(r13, r0)
            long r0 = r0 + r10
            byte r1 = com.google.protobuf.UnsafeUtil.A00(r13, r0)
            X.S57 r0 = X.SC5.A00
        L_0x0135:
            r0 = -12
            if (r7 > r0) goto L_0x0120
            if (r2 > r5) goto L_0x0120
            if (r1 > r5) goto L_0x0120
            int r0 = r2 << 8
            r7 = r7 ^ r0
            int r0 = r1 << 16
        L_0x0142:
            r7 = r7 ^ r0
        L_0x0143:
            return r7
        L_0x0144:
            byte r1 = com.google.protobuf.UnsafeUtil.A00(r13, r0)
            X.S57 r0 = X.SC5.A00
        L_0x014a:
            r0 = -12
            if (r7 > r0) goto L_0x0120
            if (r1 > r5) goto L_0x0120
            int r0 = r1 << 8
            goto L_0x0142
        L_0x0153:
            java.lang.AssertionError r0 = X.Pxe.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S57.A03(byte[], int, int):int");
    }

    public final String A04(byte[] bArr, int i, int i2) {
        int i3;
        char[] cArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i2;
        if (this instanceof R5k) {
            int length = bArr.length;
            i4 = 0;
            if ((i | i2 | ((length - i) - i2)) >= 0) {
                int A00 = R5k.A00(bArr, i10, (long) i9) + i;
                int i11 = i + i2;
                while (i7 < i11 && UnsafeUtil.A00(bArr, (long) i7) >= 0) {
                    A00 = i7 + 1;
                }
                if (i7 == i11) {
                    return Pxe.A11(SD9.A03, bArr, i9, i10);
                }
                cArr = new char[i10];
                int i12 = 0;
                while (i9 < i7) {
                    cArr[i8] = (char) UnsafeUtil.A00(bArr, (long) i9);
                    i9++;
                    i12 = i8 + 1;
                }
                loop2:
                while (true) {
                    int i13 = i3;
                    while (i7 < i11) {
                        int i14 = i7 + 1;
                        byte A002 = UnsafeUtil.A00(bArr, (long) i7);
                        if (A002 < 0) {
                            if (A002 >= -32) {
                                if (A002 >= -16) {
                                    if (i14 >= i11 - 2) {
                                        break;
                                    }
                                    int i15 = i14 + 1;
                                    byte A003 = UnsafeUtil.A00(bArr, (long) i14);
                                    int i16 = i15 + 1;
                                    byte A004 = UnsafeUtil.A00(bArr, (long) i15);
                                    i7 = i16 + 1;
                                    C11311SKz.A00(cArr, A002, A003, A004, UnsafeUtil.A00(bArr, (long) i16), i3);
                                    i8 = i3 + 1 + 1;
                                } else if (i14 >= i11 - 1) {
                                    break;
                                } else {
                                    int i17 = i14 + 1;
                                    i7 = i17 + 1;
                                    i8 = i3 + 1;
                                    C11311SKz.A01(cArr, A002, UnsafeUtil.A00(bArr, (long) i14), UnsafeUtil.A00(bArr, (long) i17), i13);
                                }
                            } else if (i14 >= i11) {
                                break;
                            } else {
                                i7 = i14 + 1;
                                i8 = i3 + 1;
                                C11311SKz.A02(cArr, A002, UnsafeUtil.A00(bArr, (long) i14), i13);
                            }
                        } else {
                            i3++;
                            cArr[i13] = (char) A002;
                            while (i14 < i11) {
                                byte A005 = UnsafeUtil.A00(bArr, (long) i14);
                                if (A005 < 0) {
                                    break;
                                }
                                i14++;
                                cArr[i3] = (char) A005;
                                i3++;
                            }
                            i13 = i3;
                            i7 = i14;
                        }
                    }
                    break loop2;
                }
                throw Pxg.A0T("Protocol message had invalid UTF-8.");
            }
            throw Pxf.A0V("buffer length=%d, index=%d, size=%d", Pxh.A1a(length, i9, i10));
        }
        int length2 = bArr.length;
        i4 = 0;
        if ((i | i2 | ((length2 - i) - i2)) >= 0) {
            int i18 = i + i2;
            cArr = new char[i10];
            int i19 = 0;
            while (i6 < i18) {
                byte b = bArr[i6];
                if (b < 0) {
                    break;
                }
                i9 = i6 + 1;
                cArr[i5] = (char) b;
                i19 = i5 + 1;
            }
            while (true) {
                int i20 = i3;
                if (i6 >= i18) {
                    break;
                }
                int i21 = i6 + 1;
                byte b2 = bArr[i6];
                if (b2 < 0) {
                    if (b2 >= -32) {
                        if (b2 >= -16) {
                            if (i21 >= i18 - 2) {
                                break;
                            }
                            int i22 = i21 + 1;
                            int i23 = i22 + 1;
                            i6 = i23 + 1;
                            C11311SKz.A00(cArr, b2, bArr[i21], bArr[i22], bArr[i23], i3);
                            i5 = i3 + 1 + 1;
                        } else if (i21 >= i18 - 1) {
                            break;
                        } else {
                            int i24 = i21 + 1;
                            i6 = i24 + 1;
                            i5 = i3 + 1;
                            C11311SKz.A01(cArr, b2, bArr[i21], bArr[i24], i20);
                        }
                    } else if (i21 >= i18) {
                        break;
                    } else {
                        i6 = i21 + 1;
                        i5 = i3 + 1;
                        C11311SKz.A02(cArr, b2, bArr[i21], i20);
                    }
                } else {
                    i5 = i3 + 1;
                    cArr[i20] = (char) b2;
                    while (i21 < i18) {
                        byte b3 = bArr[i21];
                        if (b3 < 0) {
                            break;
                        }
                        i21++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                    i6 = i21;
                }
            }
            throw Pxg.A0T("Protocol message had invalid UTF-8.");
        }
        throw Pxf.A0V("buffer length=%d, index=%d, size=%d", Pxh.A1a(length2, i9, i10));
        return new String(cArr, i4, i3);
    }
}
