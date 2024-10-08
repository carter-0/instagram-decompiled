package X;

public final class GQO {
    public int A00;
    public final int A01;
    public final float[] A02;
    public final float[] A03;
    public final float[] A04;
    public final C54729HQj[] A05;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r6 >= 3) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r7 = r11.A04;
        r4 = new float[3][];
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r4[r1] = new float[r6];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r1 < 3) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r3 >= r6) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r4[0][r3] = 1.0f;
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        r4[r2][r3] = r4[r2 - 1][r3] * r12[r3];
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r2 < 3) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        r8 = new float[3][];
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        r8[r1] = new float[r6];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r1 < 3) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        r5 = new float[3][];
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r5[r1] = new float[3];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
        if (r1 < 3) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        r3 = r8[r11];
        X.0Yw.A0S(r4[r11], r3, r6);
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        if (r12 >= r11) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        r16 = r8[r12];
        r15 = r3.length;
        r14 = 0.0f;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
        if (r2 >= r15) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a5, code lost:
        r14 = r14 + (r3[r2] * r16[r2]);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00af, code lost:
        r3[r2] = r3[r2] - (r16[r2] * r14);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        if (r2 < r6) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bb, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00be, code lost:
        r2 = r3.length;
        r12 = 0.0f;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c1, code lost:
        if (r1 >= r2) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        r0 = r3[r1];
        r12 = r12 + (r0 * r0);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ca, code lost:
        r12 = (float) java.lang.Math.sqrt((double) r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d5, code lost:
        if (r12 >= 1.0E-6f) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d7, code lost:
        r12 = 1.0E-6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
        r12 = 1.0f / r12;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00dd, code lost:
        r3[r1] = r3[r1] * r12;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        if (r1 < r6) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e6, code lost:
        r17 = r5[r11];
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e9, code lost:
        if (r15 >= r11) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00eb, code lost:
        r14 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ed, code lost:
        r16 = r4[r15];
        r14 = 0.0f;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f1, code lost:
        if (r12 >= r2) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f3, code lost:
        r14 = r14 + (r3[r12] * r16[r12]);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fc, code lost:
        r17[r15] = r14;
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0100, code lost:
        if (r15 < 3) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0102, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0104, code lost:
        if (r11 < 3) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0106, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0108, code lost:
        r4 = r8[r6];
        r3 = r4.length;
        r11 = 0.0f;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010d, code lost:
        if (r2 >= r3) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010f, code lost:
        r11 = r11 + (r4[r2] * r13[r2]);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0118, code lost:
        r4 = r5[r6];
        r3 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011c, code lost:
        if (r3 > 2) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x011e, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011f, code lost:
        r11 = r11 - (r4[r2] * r7[r2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0125, code lost:
        if (r2 == r3) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0127, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012a, code lost:
        r7[r6] = r11 / r4[r6];
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0132, code lost:
        if (-1 < r6) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0134, code lost:
        r2 = r7[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0137, code lost:
        r2 = 0.0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A00(float r22) {
        /*
            r21 = this;
            r20 = 0
            r10 = r22
            int r0 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            r11 = r21
            float[] r13 = r11.A02
            float[] r12 = r11.A03
            int r9 = r11.A00
            X.HQj[] r8 = r11.A05
            r7 = r8[r9]
            if (r7 == 0) goto L_0x0155
            r6 = 0
            r14 = r7
        L_0x0018:
            r5 = r8[r9]
            r19 = 1
            if (r5 == 0) goto L_0x004d
            long r0 = r7.A01
            long r3 = r5.A01
            long r0 = r0 - r3
            float r2 = (float) r0
            long r0 = r14.A01
            long r3 = r3 - r0
            long r0 = java.lang.Math.abs(r3)
            float r3 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x004d
            r0 = 1109393408(0x42200000, float:40.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x004d
            float r0 = r5.A00
            r13[r6] = r0
            float r0 = -r2
            r12[r6] = r0
            r0 = 20
            if (r9 != 0) goto L_0x0045
            r9 = 20
        L_0x0045:
            int r9 = r9 - r19
            int r6 = r6 + 1
            if (r6 >= r0) goto L_0x0050
            r14 = r5
            goto L_0x0018
        L_0x004d:
            r0 = 3
            if (r6 < r0) goto L_0x0155
        L_0x0050:
            r5 = 0
            float[] r7 = r11.A04     // Catch:{ IllegalArgumentException -> 0x0137 }
            r9 = 3
            float[][] r4 = new float[r9][]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r1 = 0
        L_0x0057:
            float[] r0 = new float[r6]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r4[r1] = r0     // Catch:{ IllegalArgumentException -> 0x0137 }
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x0057
            r3 = 0
        L_0x0060:
            r18 = 1065353216(0x3f800000, float:1.0)
            if (r3 >= r6) goto L_0x007d
            r0 = r4[r5]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r0[r3] = r18     // Catch:{ IllegalArgumentException -> 0x0137 }
            r2 = 1
        L_0x0069:
            int r0 = r2 + -1
            r0 = r4[r0]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r1 = r0[r3]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r0 = r12[r3]     // Catch:{ IllegalArgumentException -> 0x0137 }
            float r1 = r1 * r0
            r0 = r4[r2]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r0[r3] = r1     // Catch:{ IllegalArgumentException -> 0x0137 }
            int r2 = r2 + 1
            if (r2 < r9) goto L_0x0069
            int r3 = r3 + 1
            goto L_0x0060
        L_0x007d:
            float[][] r8 = new float[r9][]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r1 = 0
        L_0x0080:
            float[] r0 = new float[r6]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r8[r1] = r0     // Catch:{ IllegalArgumentException -> 0x0137 }
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x0080
            float[][] r5 = new float[r9][]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r1 = 0
        L_0x008b:
            float[] r0 = new float[r9]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r5[r1] = r0     // Catch:{ IllegalArgumentException -> 0x0137 }
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x008b
            r11 = 0
        L_0x0094:
            r3 = r8[r11]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r0 = r4[r11]     // Catch:{ IllegalArgumentException -> 0x0137 }
            X.0Yw.A0S(r0, r3, r6)     // Catch:{ IllegalArgumentException -> 0x0137 }
            r12 = 0
        L_0x009c:
            if (r12 >= r11) goto L_0x00be
            r16 = r8[r12]     // Catch:{ IllegalArgumentException -> 0x0137 }
            int r15 = r3.length     // Catch:{ IllegalArgumentException -> 0x0137 }
            r14 = 0
            r2 = 0
        L_0x00a3:
            if (r2 >= r15) goto L_0x00ae
            r1 = r3[r2]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r0 = r16[r2]     // Catch:{ IllegalArgumentException -> 0x0137 }
            float r1 = r1 * r0
            float r14 = r14 + r1
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00ae:
            r2 = 0
        L_0x00af:
            r1 = r3[r2]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r0 = r16[r2]     // Catch:{ IllegalArgumentException -> 0x0137 }
            float r0 = r0 * r14
            float r1 = r1 - r0
            r3[r2] = r1     // Catch:{ IllegalArgumentException -> 0x0137 }
            int r2 = r2 + 1
            if (r2 < r6) goto L_0x00af
            int r12 = r12 + 1
            goto L_0x009c
        L_0x00be:
            int r2 = r3.length     // Catch:{ IllegalArgumentException -> 0x0137 }
            r12 = 0
            r1 = 0
        L_0x00c1:
            if (r1 >= r2) goto L_0x00ca
            r0 = r3[r1]     // Catch:{ IllegalArgumentException -> 0x0137 }
            float r0 = r0 * r0
            float r12 = r12 + r0
            int r1 = r1 + 1
            goto L_0x00c1
        L_0x00ca:
            double r0 = (double) r12     // Catch:{ IllegalArgumentException -> 0x0137 }
            double r0 = java.lang.Math.sqrt(r0)     // Catch:{ IllegalArgumentException -> 0x0137 }
            float r12 = (float) r0     // Catch:{ IllegalArgumentException -> 0x0137 }
            r0 = 897988541(0x358637bd, float:1.0E-6)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00da
            r12 = 897988541(0x358637bd, float:1.0E-6)
        L_0x00da:
            float r12 = r18 / r12
            r1 = 0
        L_0x00dd:
            r0 = r3[r1]     // Catch:{ IllegalArgumentException -> 0x0137 }
            float r0 = r0 * r12
            r3[r1] = r0     // Catch:{ IllegalArgumentException -> 0x0137 }
            int r1 = r1 + 1
            if (r1 < r6) goto L_0x00dd
            r17 = r5[r11]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r15 = 0
        L_0x00e9:
            if (r15 >= r11) goto L_0x00ed
            r14 = 0
            goto L_0x00fc
        L_0x00ed:
            r16 = r4[r15]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r14 = 0
            r12 = 0
        L_0x00f1:
            if (r12 >= r2) goto L_0x00fc
            r1 = r3[r12]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r0 = r16[r12]     // Catch:{ IllegalArgumentException -> 0x0137 }
            float r1 = r1 * r0
            float r14 = r14 + r1
            int r12 = r12 + 1
            goto L_0x00f1
        L_0x00fc:
            r17[r15] = r14     // Catch:{ IllegalArgumentException -> 0x0137 }
            int r15 = r15 + 1
            if (r15 < r9) goto L_0x00e9
            int r11 = r11 + 1
            if (r11 < r9) goto L_0x0094
            r9 = 2
            r6 = 2
        L_0x0108:
            r4 = r8[r6]     // Catch:{ IllegalArgumentException -> 0x0137 }
            int r3 = r4.length     // Catch:{ IllegalArgumentException -> 0x0137 }
            r11 = 0
            r2 = 0
        L_0x010d:
            if (r2 >= r3) goto L_0x0118
            r1 = r4[r2]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r0 = r13[r2]     // Catch:{ IllegalArgumentException -> 0x0137 }
            float r1 = r1 * r0
            float r11 = r11 + r1
            int r2 = r2 + 1
            goto L_0x010d
        L_0x0118:
            r4 = r5[r6]     // Catch:{ IllegalArgumentException -> 0x0137 }
            int r3 = r6 + 1
            if (r3 > r9) goto L_0x012a
            r2 = 2
        L_0x011f:
            r1 = r4[r2]     // Catch:{ IllegalArgumentException -> 0x0137 }
            r0 = r7[r2]     // Catch:{ IllegalArgumentException -> 0x0137 }
            float r1 = r1 * r0
            float r11 = r11 - r1
            if (r2 == r3) goto L_0x012a
            int r2 = r2 + -1
            goto L_0x011f
        L_0x012a:
            r0 = r4[r6]     // Catch:{ IllegalArgumentException -> 0x0137 }
            float r11 = r11 / r0
            r7[r6] = r11     // Catch:{ IllegalArgumentException -> 0x0137 }
            int r6 = r6 + -1
            r0 = -1
            if (r0 < r6) goto L_0x0108
            r2 = r7[r19]     // Catch:{ IllegalArgumentException -> 0x0137 }
            goto L_0x0138
        L_0x0137:
            r2 = 0
        L_0x0138:
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r0
            int r0 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0155
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L_0x0155
            int r0 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x014e
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0154
            return r10
        L_0x014e:
            float r1 = -r10
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0154
            return r1
        L_0x0154:
            return r2
        L_0x0155:
            return r20
        L_0x0156:
            java.lang.String r0 = "maximumVelocity should be a positive value. You specified="
            java.lang.String r0 = X.002.A0N(r0, r10)
            X.I2E.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQO.A00(float):float");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.HQj[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.HQj} */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.HQj, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(long r4, float r6) {
        /*
            r3 = this;
            int r0 = r3.A00
            int r0 = r0 + 1
            int r2 = r0 % 20
            r3.A00 = r2
            X.HQj[] r1 = r3.A05
            r0 = r1[r2]
            if (r0 != 0) goto L_0x001a
            X.HQj r0 = new X.HQj
            r0.<init>()
            r0.A01 = r4
            r0.A00 = r6
            r1[r2] = r0
            return
        L_0x001a:
            r0.A01 = r4
            r0.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQO.A01(long, float):void");
    }

    public GQO(Integer num, boolean z) {
        this.A01 = 3;
        this.A05 = new C54729HQj[20];
        this.A02 = new float[20];
        this.A03 = new float[20];
        this.A04 = new float[3];
    }

    public GQO() {
        this(AnonymousClass05K.A00, false);
    }
}
