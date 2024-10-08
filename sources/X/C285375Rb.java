package X;

import java.util.Arrays;

/* renamed from: X.5Rb  reason: invalid class name and case insensitive filesystem */
public final class C285375Rb extends C285385Rc {
    public static final C285405Re A0E = new C285395Rd();
    public final float A00;
    public final float A01;
    public final C285405Re A02;
    public final C285405Re A03;
    public final C285405Re A04;
    public final C285405Re A05;
    public final AnonymousClass5RY A06;
    public final C285365Ra A07;
    public final 0sP A08;
    public final 0sP A09;
    public final boolean A0A;
    public final float[] A0B;
    public final float[] A0C;
    public final float[] A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C285375Rb r5 = (C285375Rb) obj;
            if (Float.compare(r5.A01, this.A01) != 0 || Float.compare(r5.A00, this.A00) != 0 || !0qQ.A0K(this.A07, r5.A07) || !Arrays.equals(this.A0C, r5.A0C)) {
                return false;
            }
            AnonymousClass5RY r1 = this.A06;
            AnonymousClass5RY r0 = r5.A06;
            if (r1 != null) {
                return r1.equals(r0);
            }
            if (r0 != null) {
                if (0qQ.A0K(this.A05, r5.A05)) {
                    return 0qQ.A0K(this.A03, r5.A03);
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01a9, code lost:
        r0 = false;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C285375Rb(X.C285405Re r35, X.C285405Re r36, X.AnonymousClass5RY r37, X.C285365Ra r38, java.lang.String r39, float[] r40, float[] r41, float r42, float r43, int r44) {
        /*
            r34 = this;
            r11 = r41
            long r0 = X.C285435Rh.A02
            r7 = r34
            r2 = r39
            r10 = r44
            r7.<init>(r10, r2, r0)
            r8 = r38
            r7.A07 = r8
            r3 = r42
            r7.A01 = r3
            r2 = r43
            r7.A00 = r2
            r0 = r37
            r7.A06 = r0
            r6 = r35
            r7.A05 = r6
            r1 = 45
            X.9L6 r0 = new X.9L6
            r0.<init>(r7, r1)
            r7.A09 = r0
            X.5Ri r0 = new X.5Ri
            r0.<init>(r7)
            r7.A04 = r0
            r5 = r36
            r7.A03 = r5
            r1 = 44
            X.9L6 r0 = new X.9L6
            r0.<init>(r7, r1)
            r7.A08 = r0
            X.5Rj r0 = new X.5Rj
            r0.<init>(r7)
            r7.A02 = r0
            r14 = r40
            int r12 = r14.length
            r0 = 9
            r9 = 6
            if (r12 == r9) goto L_0x0057
            if (r12 == r0) goto L_0x0057
            java.lang.String r1 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0057:
            int r1 = (r42 > r43 ? 1 : (r42 == r43 ? 0 : -1))
            if (r1 >= 0) goto L_0x0216
            float[] r4 = new float[r9]
            if (r12 != r0) goto L_0x0211
            r17 = 0
            r16 = r40[r17]
            r15 = 1
            r13 = r40[r15]
            float r12 = r16 + r13
            r19 = 2
            r1 = r40[r19]
            float r12 = r12 + r1
            float r16 = r16 / r12
            r4[r17] = r16
            float r13 = r13 / r12
            r4[r15] = r13
            r18 = 3
            r15 = r40[r18]
            r17 = 4
            r13 = r40[r17]
            float r12 = r15 + r13
            r16 = 5
            r1 = r40[r16]
            float r12 = r12 + r1
            float r15 = r15 / r12
            r4[r19] = r15
            float r13 = r13 / r12
            r4[r18] = r13
            r15 = r40[r9]
            r1 = 7
            r13 = r40[r1]
            float r12 = r15 + r13
            r1 = 8
            r1 = r40[r1]
            float r12 = r12 + r1
            float r15 = r15 / r12
            r4[r17] = r15
            float r13 = r13 / r12
            r4[r16] = r13
        L_0x009b:
            r7.A0C = r4
            if (r41 != 0) goto L_0x0202
            r33 = 0
            r32 = r4[r33]
            r31 = 1
            r30 = r4[r31]
            r29 = 2
            r28 = r4[r29]
            r27 = 3
            r26 = r4[r27]
            r25 = 4
            r24 = r4[r25]
            r23 = 5
            r22 = r4[r23]
            float r14 = r8.A00
            float r1 = r8.A01
            r21 = 1065353216(0x3f800000, float:1.0)
            float r20 = r21 - r32
            float r19 = r20 / r30
            float r18 = r21 - r28
            float r17 = r18 / r26
            float r16 = r21 - r24
            float r15 = r16 / r22
            float r21 = r21 - r14
            float r21 = r21 / r1
            float r13 = r32 / r30
            float r12 = r28 / r26
            float r11 = r24 / r22
            float r14 = r14 / r1
            float r21 = r21 - r19
            float r12 = r12 - r13
            float r21 = r21 * r12
            float r14 = r14 - r13
            float r17 = r17 - r19
            float r1 = r14 * r17
            float r21 = r21 - r1
            float r15 = r15 - r19
            float r15 = r15 * r12
            float r11 = r11 - r13
            float r17 = r17 * r11
            float r15 = r15 - r17
            float r21 = r21 / r15
            float r11 = r11 * r21
            float r14 = r14 - r11
            float r14 = r14 / r12
            r15 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 - r14
            float r15 = r15 - r21
            float r13 = r15 / r30
            float r12 = r14 / r26
            float r1 = r21 / r22
            float[] r11 = new float[r0]
            float r0 = r13 * r32
            r11[r33] = r0
            r11[r31] = r15
            float r20 = r20 - r30
            float r13 = r13 * r20
            r11[r29] = r13
            float r0 = r12 * r28
            r11[r27] = r0
            r11[r25] = r14
            float r18 = r18 - r26
            float r12 = r12 * r18
            r11[r23] = r12
            float r0 = r1 * r24
            r11[r9] = r0
            r0 = 7
            r11[r0] = r21
            float r16 = r16 - r22
            float r1 = r1 * r16
            r0 = 8
            r11[r0] = r1
        L_0x0122:
            r7.A0D = r11
            float[] r0 = X.C285465Rk.A04(r11)
            r7.A0B = r0
            float r1 = X.C285475Rl.A00(r4)
            float[] r0 = X.AnonymousClass5RX.A0I
            float r0 = X.C285475Rl.A00(r0)
            float r1 = r1 / r0
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x018a
            float[] r21 = X.AnonymousClass5RX.A0J
            float[] r12 = new float[r9]
            r20 = 0
            r19 = r4[r20]
            r0 = r21[r20]
            float r19 = r19 - r0
            r12[r20] = r19
            r18 = 1
            r17 = r4[r18]
            r0 = r21[r18]
            float r17 = r17 - r0
            r12[r18] = r17
            r16 = 2
            r1 = r4[r16]
            r0 = r21[r16]
            float r1 = r1 - r0
            r12[r16] = r1
            r15 = 3
            r1 = r4[r15]
            r0 = r21[r15]
            float r1 = r1 - r0
            r12[r15] = r1
            r13 = 4
            r1 = r4[r13]
            r0 = r21[r13]
            float r1 = r1 - r0
            r12[r13] = r1
            r11 = 5
            r1 = r4[r11]
            r0 = r21[r11]
            float r1 = r1 - r0
            r12[r11] = r1
            r14 = r21[r20]
            r0 = r21[r13]
            float r1 = r14 - r0
            r13 = r21[r18]
            r0 = r21[r11]
            float r0 = r13 - r0
            float r19 = r19 * r0
            float r17 = r17 * r1
            float r19 = r19 - r17
            r11 = 0
            int r0 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
        L_0x018a:
            if (r44 == 0) goto L_0x0200
            float[] r11 = X.AnonymousClass5RX.A0J
            r10 = 0
        L_0x018f:
            r1 = r4[r10]
            r0 = r11[r10]
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 == 0) goto L_0x01ad
            r1 = r4[r10]
            r0 = r11[r10]
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            r0 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ad
        L_0x01a9:
            r0 = 0
        L_0x01aa:
            r7.A0A = r0
            return
        L_0x01ad:
            int r10 = r10 + 1
            if (r10 < r9) goto L_0x018f
            X.5Ra r0 = X.AnonymousClass5RZ.A03
            boolean r0 = X.C285465Rk.A03(r8, r0)
            if (r0 == 0) goto L_0x01a9
            r0 = 0
            int r0 = (r42 > r0 ? 1 : (r42 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01a9
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r43 > r0 ? 1 : (r43 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01a9
            X.5Rb r8 = X.AnonymousClass5RX.A0G
            r3 = 0
        L_0x01c8:
            X.5Re r0 = r8.A05
            double r9 = r6.CNq(r3)
            double r0 = r0.CNq(r3)
            double r9 = r9 - r0
            double r1 = java.lang.Math.abs(r9)
            r11 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x01a9
            X.5Re r0 = r8.A03
            double r9 = r5.CNq(r3)
            double r0 = r0.CNq(r3)
            double r9 = r9 - r0
            double r1 = java.lang.Math.abs(r9)
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x01a9
            r0 = 4571171282956062736(0x3f70101010101010, double:0.00392156862745098)
            double r3 = r3 + r0
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0200
            goto L_0x01c8
        L_0x0200:
            r0 = 1
            goto L_0x01aa
        L_0x0202:
            int r1 = r11.length
            if (r1 == r0) goto L_0x0122
            java.lang.String r0 = "Transform must have 9 entries! Has "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0211:
            X.0Yw.A0S(r14, r4, r9)
            goto L_0x009b
        L_0x0216:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid range: min="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", max="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; min must be strictly < max"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285375Rb.<init>(X.5Re, X.5Re, X.5RY, X.5Ra, java.lang.String, float[], float[], float, float, int):void");
    }

    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = ((((super.hashCode() * 31) + this.A07.hashCode()) * 31) + Arrays.hashCode(this.A0C)) * 31;
        float f = this.A01;
        int i = 0;
        if (f == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (hashCode + floatToIntBits) * 31;
        float f2 = this.A00;
        if (f2 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        AnonymousClass5RY r0 = this.A06;
        if (r0 != null) {
            i = r0.hashCode();
        }
        int i4 = i3 + i;
        if (r0 == null) {
            return (((i4 * 31) + this.A05.hashCode()) * 31) + this.A03.hashCode();
        }
        return i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C285375Rb(X.C285365Ra r20, java.lang.String r21, float[] r22, double r23, float r25, float r26, int r27) {
        /*
            r19 = this;
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = r23
            int r0 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            X.5Re r1 = A0E
        L_0x000a:
            int r0 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            X.5Re r2 = A0E
        L_0x0010:
            r7 = 0
            r13 = 0
            X.5RY r3 = new X.5RY
            r8 = r3
            r15 = r13
            r17 = r13
            r8.<init>(r9, r11, r13, r15, r17)
            r0 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r25
            r9 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x002e:
            X.5Rp r2 = new X.5Rp
            r2.<init>(r9)
            goto L_0x0010
        L_0x0034:
            X.5Ro r1 = new X.5Ro
            r1.<init>(r9)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285375Rb.<init>(X.5Ra, java.lang.String, float[], double, float, float, int):void");
    }

    public C285375Rb(AnonymousClass5RY r12, C285365Ra r13, String str, float[] fArr, int i) {
        this(new C285415Rf(r12), new C285425Rg(r12), r12, r13, str, fArr, (float[]) null, 0.0f, 1.0f, i);
    }
}
