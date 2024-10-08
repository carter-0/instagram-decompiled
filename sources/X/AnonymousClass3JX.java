package X;

import android.graphics.Path;

/* renamed from: X.3JX  reason: invalid class name */
public abstract class AnonymousClass3JX {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r2 < r1) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(float[] r5, float r6, int r7) {
        /*
            r3 = 0
            if (r3 != r7) goto L_0x0004
            return r3
        L_0x0004:
            int r0 = r7 + -1
        L_0x0006:
            if (r3 > r0) goto L_0x0028
            int r1 = r3 + r0
            int r4 = r1 >>> 1
            r2 = r5[r4]
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0022
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0025
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r1 = java.lang.Float.floatToIntBits(r6)
            if (r2 == r1) goto L_0x002b
            if (r2 >= r1) goto L_0x0025
        L_0x0022:
            int r3 = r4 + 1
            goto L_0x0006
        L_0x0025:
            int r0 = r4 + -1
            goto L_0x0006
        L_0x0028:
            int r0 = r3 + 1
            int r4 = -r0
        L_0x002b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3JX.A02(float[], float, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        r3 = 0.0f;
        r10 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
        if (r20 >= 0.0f) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        r10 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        if (r20 > 1.0f) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0091, code lost:
        r2 = ((((r14 * r1) + r5) * r1) + r16) * r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (java.lang.Math.abs(r2 - r20) < r11) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (r20 <= r2) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        r1 = ((r10 - r3) * 0.5f) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        if (r3 >= r10) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        r10 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float A00(X.AnonymousClass6BG r17, float r18, float r19, float r20, float r21) {
        /*
            float r20 = r20 - r18
            float r19 = r19 - r18
            float r20 = r20 / r19
            r0 = r17
            byte r1 = r0.A00
            r18 = 0
            if (r1 == 0) goto L_0x0012
            r0 = 1
            if (r1 != r0) goto L_0x00b6
            return r20
        L_0x0012:
            X.3JV r2 = r0.A01
            X.3JV r1 = r0.A02
            if (r2 == 0) goto L_0x00b6
            if (r1 == 0) goto L_0x00b6
            float r19 = r19 * r21
            float r0 = r2.A00
            r17 = 1077936128(0x40400000, float:3.0)
            float r16 = r0 * r17
            float r5 = r1.A00
            float r5 = r5 - r0
            float r5 = r5 * r17
            float r5 = r5 - r16
            r15 = 1065353216(0x3f800000, float:1.0)
            float r14 = r15 - r16
            float r14 = r14 - r5
            float r0 = r2.A01
            float r13 = r0 * r17
            float r4 = r1.A01
            float r4 = r4 - r0
            float r4 = r4 * r17
            float r4 = r4 - r13
            float r12 = r15 - r13
            float r12 = r12 - r4
            r0 = 1128792064(0x43480000, float:200.0)
            float r19 = r19 * r0
            float r1 = r15 / r19
            r0 = 1000593162(0x3ba3d70a, float:0.005)
            float r11 = java.lang.Math.min(r0, r1)
            r8 = 0
            r10 = r20
        L_0x004b:
            float r9 = r14 * r10
            float r9 = r9 + r5
            float r9 = r9 * r10
            float r9 = r9 + r16
            float r9 = r9 * r10
            float r9 = r9 - r20
            float r0 = java.lang.Math.abs(r9)
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0085
            float r3 = r14 * r17
            float r3 = r3 * r10
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r5
            float r3 = r3 + r0
            float r3 = r3 * r10
            float r3 = r3 + r16
            float r0 = java.lang.Math.abs(r3)
            double r6 = (double) r0
            r1 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007d
            float r9 = r9 / r3
            float r10 = r10 - r9
            int r8 = r8 + 1
            r0 = 8
            if (r8 >= r0) goto L_0x007d
            goto L_0x004b
        L_0x007d:
            r3 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x008b
            r10 = 0
        L_0x0085:
            float r12 = r12 * r10
            float r12 = r12 + r4
            float r12 = r12 * r10
            float r12 = r12 + r13
            float r12 = r12 * r10
            return r12
        L_0x008b:
            int r0 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x0085
            r1 = r20
        L_0x0091:
            float r2 = r14 * r1
            float r2 = r2 + r5
            float r2 = r2 * r1
            float r2 = r2 + r16
            float r2 = r2 * r1
            float r0 = r2 - r20
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00b4
            int r0 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            r3 = r1
        L_0x00a7:
            float r1 = r10 - r3
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            float r1 = r1 + r3
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b4
            goto L_0x0091
        L_0x00b2:
            r10 = r1
            goto L_0x00a7
        L_0x00b4:
            r10 = r1
            goto L_0x0085
        L_0x00b6:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3JX.A00(X.6BG, float, float, float, float):float");
    }

    public static int A01(Path path, 2dt r9, float f, float f2, int i, int i2) {
        byte[] bArr = r9.A02;
        float[] fArr = r9.A03;
        byte b = bArr[i];
        Path path2 = path;
        if (b == 4) {
            path.close();
        } else {
            int i3 = i2 + 1;
            float f3 = fArr[i2] * f;
            i2 = i3 + 1;
            float f4 = fArr[i3] * f2;
            if (b == 0) {
                path2.moveTo(f3, f4);
                return i2;
            } else if (b == 1) {
                path2.lineTo(f3, f4);
                return i2;
            } else if (b == 2) {
                int i4 = i2 + 1;
                int i5 = i4 + 1;
                path2.quadTo(fArr[i2] * f, fArr[i4] * f2, f3, f4);
                return i5;
            } else if (b == 3) {
                int i6 = i2 + 1;
                int i7 = i6 + 1;
                int i8 = i7 + 1;
                int i9 = i8 + 1;
                path2.cubicTo(fArr[i2] * f, fArr[i6] * f2, fArr[i7] * f, fArr[i8] * f2, f3, f4);
                return i9;
            }
        }
        return i2;
    }

    public static Path A03(Path path, AnonymousClass6B0 r2, 2dt r3, 2dt r4, float f, float f2, float f3, float f4) {
        if (r3 == null || path == null || path.isEmpty()) {
            2dt A00 = AnonymousClass3JW.A00(r3, r4, r2, f, f2);
            if (A00 == null) {
                return null;
            }
            if (path == null) {
                path = new Path();
            } else if (!path.isEmpty()) {
                path.reset();
            }
            int i = 0;
            for (int i2 = 0; i2 < A00.A00; i2++) {
                i = A01(path, A00, f3, f4, i2, i);
            }
        }
        return path;
    }
}
