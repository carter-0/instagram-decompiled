package X;

import com.facebook.odin.model.Matrix;

/* renamed from: X.3zh  reason: invalid class name and case insensitive filesystem */
public final class C258823zh implements C258833zi {
    public final C258813zg A00;

    public C258823zh(C258813zg r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public static final float[] A01(float[] fArr) {
        float exp;
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            if (f < 0.0f) {
                exp = 1.0f - (1.0f / (((float) Math.exp((double) f)) + 1.0f));
            } else {
                exp = 1.0f / (((float) Math.exp((double) (f * -1.0f))) + 1.0f);
            }
            fArr2[i] = exp;
        }
        return fArr2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c1, code lost:
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c2, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass40G E3X(X.C258993zy r21, java.util.List r22) {
        /*
            r20 = this;
            r6 = 0
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0216 }
            r5.<init>()     // Catch:{ Exception -> 0x0216 }
            java.util.Iterator r19 = r22.iterator()     // Catch:{ Exception -> 0x0216 }
        L_0x000a:
            boolean r0 = r19.hasNext()     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x020e
            java.lang.Object r0 = r19.next()     // Catch:{ Exception -> 0x0216 }
            com.facebook.odin.model.Example r0 = (com.facebook.odin.model.Example) r0     // Catch:{ Exception -> 0x0216 }
            java.util.HashMap r13 = r0.A02     // Catch:{ Exception -> 0x0216 }
            r7 = r20
            X.3zg r1 = r7.A00     // Catch:{ Exception -> 0x0216 }
            X.411 r4 = r1.BWO()     // Catch:{ Exception -> 0x0216 }
            boolean r0 = r13.isEmpty()     // Catch:{ Exception -> 0x0216 }
            if (r0 != 0) goto L_0x0204
            int[] r0 = r4.BVv()     // Catch:{ Exception -> 0x0216 }
            int r12 = r0.length     // Catch:{ Exception -> 0x0216 }
            r3 = 1
            if (r12 == 0) goto L_0x0204
            java.util.List r18 = r4.BTc()     // Catch:{ Exception -> 0x0216 }
            X.411 r1 = r1.BWO()     // Catch:{ Exception -> 0x0216 }
            java.util.List r11 = r1.BeY()     // Catch:{ Exception -> 0x0216 }
            int r0 = r11.size()     // Catch:{ Exception -> 0x0216 }
            float[] r2 = new float[r0]     // Catch:{ Exception -> 0x0216 }
            int r0 = r11.size()     // Catch:{ Exception -> 0x0216 }
            float[] r17 = r1.BPc(r0)     // Catch:{ Exception -> 0x0216 }
            int r0 = r11.size()     // Catch:{ Exception -> 0x0216 }
            float[] r16 = r1.CDE(r0)     // Catch:{ Exception -> 0x0216 }
            int r0 = r11.size()     // Catch:{ Exception -> 0x0216 }
            float[] r15 = r1.CDF(r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r10 = r1.BWX()     // Catch:{ Exception -> 0x0216 }
            int r14 = r11.size()     // Catch:{ Exception -> 0x0216 }
            r9 = 0
        L_0x0061:
            if (r9 >= r14) goto L_0x00d2
            java.lang.Object r0 = r11.get(r9)     // Catch:{ Exception -> 0x0216 }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ Exception -> 0x0216 }
            com.facebook.odin.model.FeatureData r0 = (com.facebook.odin.model.FeatureData) r0     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x0078
            com.facebook.odin.model.Type r0 = r0.A02     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x0078
            int r0 = r0.ordinal()     // Catch:{ Exception -> 0x0216 }
            goto L_0x0079
        L_0x0078:
            r0 = -1
        L_0x0079:
            r8 = 0
            if (r0 == r3) goto L_0x008e
            if (r0 != r6) goto L_0x009d
            java.lang.Object r0 = r11.get(r9)     // Catch:{ Exception -> 0x0216 }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ Exception -> 0x0216 }
            com.facebook.odin.model.FeatureData r0 = (com.facebook.odin.model.FeatureData) r0     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x009d
            long r0 = r0.A01     // Catch:{ Exception -> 0x0216 }
            float r8 = (float) r0     // Catch:{ Exception -> 0x0216 }
            goto L_0x009d
        L_0x008e:
            java.lang.Object r0 = r11.get(r9)     // Catch:{ Exception -> 0x0216 }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ Exception -> 0x0216 }
            com.facebook.odin.model.FeatureData r0 = (com.facebook.odin.model.FeatureData) r0     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x009d
            double r0 = r0.A00     // Catch:{ Exception -> 0x0216 }
            float r8 = (float) r0     // Catch:{ Exception -> 0x0216 }
        L_0x009d:
            int r1 = r10.hashCode()     // Catch:{ Exception -> 0x0216 }
            r0 = 114211(0x1be23, float:1.60044E-40)
            if (r1 == r0) goto L_0x00b6
            r0 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 != r0) goto L_0x00c7
            java.lang.String r0 = "none"
            boolean r0 = r10.equals(r0)     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x00c7
            r2[r9] = r8     // Catch:{ Exception -> 0x0216 }
            goto L_0x00cf
        L_0x00b6:
            java.lang.String r0 = "std"
            boolean r0 = r10.equals(r0)     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x00c7
            r0 = r17[r9]     // Catch:{ Exception -> 0x0216 }
            float r8 = r8 - r0
            r0 = r15[r9]     // Catch:{ Exception -> 0x0216 }
            float r8 = r8 / r0
            r2[r9] = r8     // Catch:{ Exception -> 0x0216 }
            goto L_0x00cf
        L_0x00c7:
            r0 = r17[r9]     // Catch:{ Exception -> 0x0216 }
            float r8 = r8 - r0
            r0 = r16[r9]     // Catch:{ Exception -> 0x0216 }
            float r8 = r8 / r0
            r2[r9] = r8     // Catch:{ Exception -> 0x0216 }
        L_0x00cf:
            int r9 = r9 + 1
            goto L_0x0061
        L_0x00d2:
            r10 = r21
            if (r21 == 0) goto L_0x00db
            java.lang.String r0 = "normalize_features_complete"
            r10.A01(r0)     // Catch:{ Exception -> 0x0216 }
        L_0x00db:
            boolean r0 = r18.isEmpty()     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x0134
            int r13 = r12 - r3
            r11 = 0
        L_0x00e4:
            if (r11 >= r13) goto L_0x010a
            int r11 = r11 + 1
            float[] r2 = r7.A02(r2, r11)     // Catch:{ Exception -> 0x0216 }
            com.facebook.odin.model.Matrix r1 = r4.CGO(r11)     // Catch:{ Exception -> 0x0216 }
            float[] r0 = r4.Afk(r11)     // Catch:{ Exception -> 0x0216 }
            float[] r9 = A00(r1, r2, r0)     // Catch:{ Exception -> 0x0216 }
            int r8 = r9.length     // Catch:{ Exception -> 0x0216 }
            float[] r2 = new float[r8]     // Catch:{ Exception -> 0x0216 }
            r3 = 0
        L_0x00fc:
            if (r3 >= r8) goto L_0x00e4
            r1 = 0
            r0 = r9[r3]     // Catch:{ Exception -> 0x0216 }
            float r0 = java.lang.Math.max(r1, r0)     // Catch:{ Exception -> 0x0216 }
            r2[r3] = r0     // Catch:{ Exception -> 0x0216 }
            int r3 = r3 + 1
            goto L_0x00fc
        L_0x010a:
            float[] r2 = r7.A02(r2, r12)     // Catch:{ Exception -> 0x0216 }
            com.facebook.odin.model.Matrix r1 = r4.CGO(r12)     // Catch:{ Exception -> 0x0216 }
            float[] r0 = r4.Afk(r12)     // Catch:{ Exception -> 0x0216 }
            float[] r0 = A00(r1, r2, r0)     // Catch:{ Exception -> 0x0216 }
            float[] r4 = A01(r0)     // Catch:{ Exception -> 0x0216 }
            int r3 = r4.length     // Catch:{ Exception -> 0x0216 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0216 }
            r7.<init>(r3)     // Catch:{ Exception -> 0x0216 }
            r2 = 0
        L_0x0125:
            if (r2 >= r3) goto L_0x01ea
            r0 = r4[r2]     // Catch:{ Exception -> 0x0216 }
            double r0 = (double) r0     // Catch:{ Exception -> 0x0216 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
            r7.add(r0)     // Catch:{ Exception -> 0x0216 }
            int r2 = r2 + 1
            goto L_0x0125
        L_0x0134:
            java.util.Iterator r14 = r18.iterator()     // Catch:{ Exception -> 0x0216 }
        L_0x0138:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r1 = r14.next()     // Catch:{ Exception -> 0x0216 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0216 }
            int r0 = r1.hashCode()     // Catch:{ Exception -> 0x0216 }
            switch(r0) {
                case -2018804923: goto L_0x014c;
                case -542065042: goto L_0x0161;
                case 2542364: goto L_0x016e;
                case 2575999: goto L_0x0188;
                case 1456754377: goto L_0x01c6;
                default: goto L_0x014b;
            }     // Catch:{ Exception -> 0x0216 }
        L_0x014b:
            goto L_0x0138
        L_0x014c:
            java.lang.String r0 = "Linear"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x0138
            com.facebook.odin.model.Matrix r1 = r4.CGO(r3)     // Catch:{ Exception -> 0x0216 }
            float[] r0 = r4.Afk(r3)     // Catch:{ Exception -> 0x0216 }
            float[] r2 = A00(r1, r2, r0)     // Catch:{ Exception -> 0x0216 }
            goto L_0x0138
        L_0x0161:
            java.lang.String r0 = "Sigmoid"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x0138
            float[] r2 = A01(r2)     // Catch:{ Exception -> 0x0216 }
            goto L_0x01c2
        L_0x016e:
            java.lang.String r0 = "ReLU"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x0138
            int r9 = r2.length     // Catch:{ Exception -> 0x0216 }
            float[] r11 = new float[r9]     // Catch:{ Exception -> 0x0216 }
            r8 = 0
        L_0x017a:
            if (r8 >= r9) goto L_0x01c1
            r1 = 0
            r0 = r2[r8]     // Catch:{ Exception -> 0x0216 }
            float r0 = java.lang.Math.max(r1, r0)     // Catch:{ Exception -> 0x0216 }
            r11[r8] = r0     // Catch:{ Exception -> 0x0216 }
            int r8 = r8 + 1
            goto L_0x017a
        L_0x0188:
            java.lang.String r0 = "SiLU"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x0138
            X.0qQ.A0B(r2, r6)     // Catch:{ Exception -> 0x0216 }
            int r9 = r2.length     // Catch:{ Exception -> 0x0216 }
            float[] r11 = new float[r9]     // Catch:{ Exception -> 0x0216 }
            r8 = 0
        L_0x0197:
            if (r8 >= r9) goto L_0x01c1
            r1 = r2[r8]     // Catch:{ Exception -> 0x0216 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= 0) goto L_0x01b2
            double r0 = (double) r1     // Catch:{ Exception -> 0x0216 }
            double r0 = java.lang.Math.exp(r0)     // Catch:{ Exception -> 0x0216 }
            float r12 = (float) r0     // Catch:{ Exception -> 0x0216 }
            float r12 = r12 + r13
            float r0 = r13 / r12
            float r13 = r13 - r0
        L_0x01ac:
            r0 = r2[r8]     // Catch:{ Exception -> 0x0216 }
            float r0 = r0 * r13
            r11[r8] = r0     // Catch:{ Exception -> 0x0216 }
            goto L_0x01be
        L_0x01b2:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r1 * r0
            double r0 = (double) r1     // Catch:{ Exception -> 0x0216 }
            double r0 = java.lang.Math.exp(r0)     // Catch:{ Exception -> 0x0216 }
            float r12 = (float) r0     // Catch:{ Exception -> 0x0216 }
            float r12 = r12 + r13
            float r13 = r13 / r12
            goto L_0x01ac
        L_0x01be:
            int r8 = r8 + 1
            goto L_0x0197
        L_0x01c1:
            r2 = r11
        L_0x01c2:
            int r3 = r3 + 1
            goto L_0x0138
        L_0x01c6:
            java.lang.String r0 = "BatchNorm1d"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x0138
            float[] r2 = r7.A02(r2, r3)     // Catch:{ Exception -> 0x0216 }
            goto L_0x0138
        L_0x01d4:
            int r4 = r2.length     // Catch:{ Exception -> 0x0216 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0216 }
            r7.<init>(r4)     // Catch:{ Exception -> 0x0216 }
            r3 = 0
        L_0x01db:
            if (r3 >= r4) goto L_0x01ea
            r0 = r2[r3]     // Catch:{ Exception -> 0x0216 }
            double r0 = (double) r0     // Catch:{ Exception -> 0x0216 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
            r7.add(r0)     // Catch:{ Exception -> 0x0216 }
            int r3 = r3 + 1
            goto L_0x01db
        L_0x01ea:
            if (r21 == 0) goto L_0x01f1
            java.lang.String r0 = "prediction_computations_complete"
            r10.A01(r0)     // Catch:{ Exception -> 0x0216 }
        L_0x01f1:
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x0216 }
            if (r0 != 0) goto L_0x0204
            java.lang.Object r0 = r7.get(r6)     // Catch:{ Exception -> 0x0216 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x0204
            r5.add(r0)     // Catch:{ Exception -> 0x0216 }
            goto L_0x000a
        L_0x0204:
            X.0sn r2 = X.0sn.A00     // Catch:{ Exception -> 0x0216 }
            java.lang.String r1 = "no LiteNN forward result"
            X.40G r0 = new X.40G     // Catch:{ Exception -> 0x0216 }
            r0.<init>(r2, r1, r6)     // Catch:{ Exception -> 0x0216 }
            return r0
        L_0x020e:
            r2 = 0
            r1 = 1
            X.40G r0 = new X.40G     // Catch:{ Exception -> 0x0216 }
            r0.<init>(r5, r2, r1)     // Catch:{ Exception -> 0x0216 }
            return r0
        L_0x0216:
            r0 = move-exception
            X.0sn r2 = X.0sn.A00
            java.lang.String r1 = r0.getMessage()
            X.40G r0 = new X.40G
            r0.<init>(r2, r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258823zh.E3X(X.3zy, java.util.List):X.40G");
    }

    public static final float[] A00(Matrix matrix, float[] fArr, float[] fArr2) {
        float f;
        float[][] fArr3 = matrix.A00;
        int length = fArr3.length;
        float[] fArr4 = new float[length];
        for (int i = 0; i < length; i++) {
            int length2 = fArr.length;
            int i2 = 0;
            while (true) {
                f = fArr4[i];
                if (i2 >= length2) {
                    break;
                }
                fArr4[i] = f + (fArr[i2] * fArr3[i][i2]);
                i2++;
            }
            fArr4[i] = f + fArr2[i];
        }
        return fArr4;
    }

    private final float[] A02(float[] fArr, int i) {
        C258813zg r1 = this.A00;
        if (r1.BWO().AfW(i).length == 0 || r1.BWO().AfX(i).length == 0) {
            return fArr;
        }
        int length = fArr.length;
        float[] fArr2 = new float[length];
        float[] AfW = r1.BWO().AfW(i);
        float[] AfX = r1.BWO().AfX(i);
        for (int i2 = 0; i2 < length; i2++) {
            fArr2[i2] = (fArr[i2] * AfW[i2]) + AfX[i2];
        }
        return fArr2;
    }
}
