package X;

public abstract class AHG {
    public static float[] A02(C306756Nj[] r18) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        while (true) {
            int length = r18.length;
            if (i < length) {
                C306756Nj r4 = r18[i % length];
                i++;
                C306756Nj r3 = r18[i % length];
                double d = r4.A00;
                double d2 = r3.A01;
                double d3 = r3.A00;
                double d4 = r4.A01;
                double d5 = (d * d2) - (d3 * d4);
                f = (float) (((double) f) + d5);
                f2 = (float) (((double) f2) + ((d + d3) * d5));
                f3 = (float) (((double) f3) + ((d4 + d2) * d5));
            } else {
                float f4 = (f / 2.0f) * 6.0f;
                return new float[]{f2 / f4, f3 / f4};
            }
        }
    }

    public static double A00(C306756Nj r5, C306756Nj r6, C306756Nj r7) {
        C306756Nj A00 = C306756Nj.A00(r5, r6);
        return (r7.A00 * A00.A01) - (r7.A01 * A00.A00);
    }

    public static boolean A01(C306756Nj r2, C306756Nj r3, C306756Nj r4) {
        return AnonymousClass7TF.A1R((A00(r4, r2, C306756Nj.A00(r3, r2)) > -4.9E-324d ? 1 : (A00(r4, r2, C306756Nj.A00(r3, r2)) == -4.9E-324d ? 0 : -1)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.6Nj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: X.6Nj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: X.6Nj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: X.6Nj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.6Nj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.6Nj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: X.6Nj} */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.6Nj, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C306756Nj[] A03(X.C306756Nj[] r32, double r33) {
        /*
            java.lang.Object r16 = r32.clone()
            r0 = r16
            X.6Nj[] r0 = (X.C306756Nj[]) r0
            r16 = r0
            r31 = 0
        L_0x000c:
            r7 = 4
            r0 = r31
            if (r0 >= r7) goto L_0x013f
            X.6Nj r10 = new X.6Nj
            r10.<init>()
            X.6Nj r30 = new X.6Nj
            r30.<init>()
            r6 = r32[r31]
            int r31 = r31 + 1
            int r0 = r31 % r7
            r5 = r32[r0]
            double[] r9 = new double[r7]
            r9 = {-4616189618054758400, -4616189618054758400, 4607182418800017408, 4607182418800017408} // fill-array
            double[] r8 = new double[r7]
            r8 = {-4616189618054758400, 4607182418800017408, -4616189618054758400, 4607182418800017408} // fill-array
            r4 = 0
        L_0x002e:
            r14 = r9[r4]
            r12 = r8[r4]
            double r0 = r6.A00
            double r14 = r14 * r33
            double r0 = r0 + r14
            double r2 = r6.A01
            X.6Nj r11 = new X.6Nj
            r11.<init>(r0, r2)
            boolean r0 = A01(r6, r5, r11)
            if (r0 == 0) goto L_0x0139
            double r2 = r6.A00
            double r0 = r6.A01
            double r12 = r12 * r33
            double r0 = r0 + r12
            X.6Nj r11 = new X.6Nj
            r11.<init>(r2, r0)
            boolean r0 = A01(r6, r5, r11)
            if (r0 == 0) goto L_0x0139
            double r2 = r6.A00
            double r2 = r2 + r14
            double r0 = r6.A01
            double r0 = r0 + r12
            X.6Nj r11 = new X.6Nj
            r11.<init>(r2, r0)
            boolean r0 = A01(r6, r5, r11)
            if (r0 == 0) goto L_0x0139
            double r0 = r6.A00
            r10.A00 = r0
            double r0 = r6.A01
            r10.A01 = r0
            double r0 = r5.A00
            r2 = r30
            r2.A00 = r0
            double r0 = r5.A01
            r2.A01 = r0
            double r0 = r6.A00
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r14 / r2
            double r0 = r0 + r14
            r10.A00 = r0
            double r0 = r6.A01
            double r12 = r12 / r2
            double r0 = r0 + r12
            r10.A01 = r0
            double r1 = r5.A00
            double r1 = r1 + r14
            r0 = r30
            r0.A00 = r1
            double r1 = r5.A01
            double r1 = r1 + r12
            r0.A01 = r1
        L_0x0093:
            java.util.ArrayList r29 = X.AnonymousClass7TE.A1C()
            r28 = 0
            r27 = 0
        L_0x009b:
            r0 = r16
            int r2 = r0.length
            r0 = r27
            if (r0 >= r2) goto L_0x0127
            r1 = r16[r27]
            int r27 = r27 + 1
            int r0 = r27 % r2
            r11 = r16[r0]
            X.6Nj r2 = X.C306756Nj.A00(r1, r10)
            r0 = r30
            double r4 = A00(r0, r10, r2)
            X.6Nj r2 = X.C306756Nj.A00(r11, r10)
            double r2 = A00(r0, r10, r2)
            double r4 = r4 * r2
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x010f
            r0 = r30
            X.6Nj r0 = X.C306756Nj.A00(r10, r0)
            double r25 = A00(r11, r1, r0)
            double r8 = r1.A00
            double r6 = r11.A01
            double r23 = r8 * r6
            double r0 = r1.A01
            r21 = r0
            double r0 = r11.A00
            r19 = r0
            double r0 = r21 * r0
            double r23 = r23 - r0
            double r4 = r10.A00
            r0 = r30
            double r14 = r0.A00
            double r0 = r4 - r14
            double r2 = r23 * r0
            r0 = r30
            double r0 = r0.A01
            double r4 = r4 * r0
            double r12 = r10.A01
            double r17 = r12 * r14
            double r4 = r4 - r17
            double r8 = r8 - r19
            double r14 = r4 * r8
            double r2 = r2 - r14
            double r6 = r6 - r21
            double r4 = r4 * r6
            double r0 = r0 - r12
            double r23 = r23 * r0
            double r4 = r4 - r23
            double r2 = r2 / r25
            double r4 = r4 / r25
            X.6Nj r1 = new X.6Nj
            r1.<init>(r2, r4)
            r0 = r29
            r0.add(r1)
        L_0x010f:
            r0 = r30
            boolean r0 = A01(r10, r0, r11)
            if (r0 == 0) goto L_0x009b
            double r0 = r11.A00
            double r2 = r11.A01
            X.6Nj r4 = new X.6Nj
            r4.<init>(r0, r2)
            r0 = r29
            r0.add(r4)
            goto L_0x009b
        L_0x0127:
            r0 = r28
            X.6Nj[] r1 = new X.C306756Nj[r0]
            r0 = r29
            java.lang.Object[] r16 = r0.toArray(r1)
            r0 = r16
            X.6Nj[] r0 = (X.C306756Nj[]) r0
            r16 = r0
            goto L_0x000c
        L_0x0139:
            int r4 = r4 + 1
            if (r4 >= r7) goto L_0x0093
            goto L_0x002e
        L_0x013f:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHG.A03(X.6Nj[], double):X.6Nj[]");
    }
}
