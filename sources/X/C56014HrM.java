package X;

/* renamed from: X.HrM  reason: case insensitive filesystem */
public final class C56014HrM {
    public static float[] A0I;
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final float[] A0H;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: int} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56014HrM(float r19, float r20, float r21, float r22, float r23, float r24, int r25) {
        /*
            r18 = this;
            r7 = r18
            r10 = r22
            r3 = r21
            r9 = r20
            r7.<init>()
            r13 = r19
            r7.A09 = r13
            r7.A0A = r9
            r7.A0B = r3
            r7.A0D = r10
            r2 = r23
            r7.A0C = r2
            r1 = r24
            r7.A0E = r1
            float r6 = r23 - r21
            float r4 = r24 - r22
            r14 = 0
            r8 = 1
            r12 = r25
            if (r12 == r8) goto L_0x0032
            r0 = 4
            r5 = 0
            if (r12 == r0) goto L_0x00c2
            r0 = 5
            if (r12 != r0) goto L_0x00c8
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c8
        L_0x0032:
            r11 = 1
        L_0x0033:
            r7.A0G = r11
            r5 = 1065353216(0x3f800000, float:1.0)
            float r9 = r20 - r19
            float r5 = r5 / r9
            r7.A08 = r5
            r0 = 3
            if (r0 != r12) goto L_0x0040
            r14 = 1
        L_0x0040:
            r13 = 101(0x65, float:1.42E-43)
            if (r14 != 0) goto L_0x00e1
            float r0 = java.lang.Math.abs(r6)
            r12 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x00e1
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x00e1
            float[] r0 = new float[r13]
            r7.A0H = r0
            r0 = 1
            if (r11 == 0) goto L_0x005f
            r0 = -1
        L_0x005f:
            float r0 = (float) r0
            float r0 = r0 * r6
            r7.A04 = r0
            if (r11 != 0) goto L_0x0066
            r8 = -1
        L_0x0066:
            float r0 = (float) r8
            float r4 = r4 * r0
            r7.A05 = r4
            if (r11 == 0) goto L_0x006d
            r3 = r2
        L_0x006d:
            r7.A06 = r3
            r0 = r1
            if (r11 == 0) goto L_0x0073
            r0 = r10
        L_0x0073:
            r7.A07 = r0
            float r10 = r22 - r24
            float[] r0 = X.C54733HQo.A00()
            int r14 = r0.length
            r4 = 0
            r17 = 0
            r3 = 0
            r2 = 0
            r16 = 0
            r15 = 0
        L_0x0084:
            if (r3 >= r14) goto L_0x00cb
            r8 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r0 = (double) r3
            double r0 = r0 * r8
            float[] r8 = X.C54733HQo.A00()
            int r8 = r8.length
            int r8 = r8 + -1
            double r8 = (double) r8
            double r0 = r0 / r8
            double r0 = java.lang.Math.toRadians(r0)
            float r8 = (float) r0
            double r11 = (double) r8
            double r0 = java.lang.Math.sin(r11)
            float r8 = (float) r0
            double r0 = java.lang.Math.cos(r11)
            float r9 = (float) r0
            float r8 = r8 * r6
            float r9 = r9 * r10
            if (r3 <= 0) goto L_0x00bc
            float r0 = r8 - r16
            double r11 = (double) r0
            float r0 = r9 - r15
            double r0 = (double) r0
            double r0 = java.lang.Math.hypot(r11, r0)
            float r11 = (float) r0
            float r2 = r2 + r11
            float[] r0 = X.C54733HQo.A00()
            r0[r3] = r2
        L_0x00bc:
            int r3 = r3 + 1
            r15 = r9
            r16 = r8
            goto L_0x0084
        L_0x00c2:
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c8
            goto L_0x0032
        L_0x00c8:
            r11 = 0
            goto L_0x0033
        L_0x00cb:
            r7.A00 = r2
            float[] r0 = X.C54733HQo.A00()
            int r6 = r0.length
            r3 = 0
        L_0x00d3:
            if (r3 >= r6) goto L_0x00fe
            float[] r1 = X.C54733HQo.A00()
            r0 = r1[r3]
            float r0 = r0 / r2
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x00d3
        L_0x00e1:
            double r2 = (double) r4
            double r0 = (double) r6
            double r0 = java.lang.Math.hypot(r2, r0)
            float r2 = (float) r0
            r7.A00 = r2
            float r2 = r2 * r5
            r7.A03 = r2
            float r6 = r6 / r9
            r7.A06 = r6
            float r4 = r4 / r9
            r7.A07 = r4
            float[] r0 = new float[r13]
            r7.A0H = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r7.A04 = r0
            r7.A05 = r0
            goto L_0x0126
        L_0x00fe:
            float[] r3 = r7.A0H
        L_0x0100:
            float r6 = (float) r4
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r0
            float[] r2 = X.C54733HQo.A00()
            r1 = 0
            int r0 = r2.length
            int r1 = java.util.Arrays.binarySearch(r2, r1, r0, r6)
            if (r1 < 0) goto L_0x0129
            float r8 = (float) r1
        L_0x0111:
            float[] r0 = X.C54733HQo.A00()
            int r0 = r0.length
            int r0 = r0 + -1
            float r0 = (float) r0
            float r8 = r8 / r0
            r3[r4] = r8
        L_0x011c:
            int r4 = r4 + 1
            if (r4 < r13) goto L_0x0100
            float r0 = r7.A00
            float r0 = r0 * r5
            r7.A03 = r0
            r8 = 0
        L_0x0126:
            r7.A0F = r8
            return
        L_0x0129:
            r0 = -1
            if (r1 != r0) goto L_0x012f
            r3[r4] = r17
            goto L_0x011c
        L_0x012f:
            int r0 = -r1
            int r2 = r0 + -2
            int r1 = r0 + -1
            float r8 = (float) r2
            float[] r0 = X.C54733HQo.A00()
            r0 = r0[r2]
            float r6 = r6 - r0
            float[] r0 = X.C54733HQo.A00()
            r1 = r0[r1]
            float[] r0 = X.C54733HQo.A00()
            r0 = r0[r2]
            float r1 = r1 - r0
            float r6 = r6 / r1
            float r8 = r8 + r6
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56014HrM.<init>(float, float, float, float, float, float, int):void");
    }

    public final void A00(float f) {
        float f2;
        if (this.A0G) {
            f2 = this.A0A - f;
        } else {
            f2 = f - this.A09;
        }
        float f3 = f2 * this.A08;
        float f4 = 0.0f;
        if (f3 > 0.0f) {
            f4 = 1.0f;
            if (f3 < 1.0f) {
                float[] fArr = this.A0H;
                float f5 = f3 * 100.0f;
                int i = (int) f5;
                float f6 = fArr[i];
                f4 = f6 + ((f5 - ((float) i)) * (fArr[i + 1] - f6));
            }
        }
        double d = (double) (f4 * 1.5707964f);
        this.A02 = (float) Math.sin(d);
        this.A01 = (float) Math.cos(d);
    }
}
