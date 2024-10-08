package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.84M  reason: invalid class name */
public final class AnonymousClass84M {
    public int A00 = -1;
    public C370308wB A01;
    public C370288w9 A02;
    public String A03;
    public C348037xm A04;
    public final AnonymousClass84O A05;
    public final Context A06;
    public final UserSession A07;

    /* JADX WARNING: Removed duplicated region for block: B:121:0x02d5 A[Catch:{ Exception -> 0x02d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r28 = this;
            r14 = r28
            java.lang.String r1 = r14.A03
            r0 = 0
            if (r1 == 0) goto L_0x0008
            r0 = 1
        L_0x0008:
            r26 = 0
            if (r0 != 0) goto L_0x0016
            X.8w9 r1 = r14.A02
            if (r1 == 0) goto L_0x0015
            r0 = r26
            r1.DYh(r0)
        L_0x0015:
            return
        L_0x0016:
            X.7xm r3 = r14.A04
            if (r3 != 0) goto L_0x0020
            X.7xm r3 = X.C347997xi.A00(r1)
            r14.A04 = r3
        L_0x0020:
            X.8wB r1 = r14.A01     // Catch:{ Exception -> 0x02d9 }
            boolean r0 = r1 instanceof X.C370298wA     // Catch:{ Exception -> 0x02d9 }
            if (r0 == 0) goto L_0x02bd
            if (r3 == 0) goto L_0x02bd
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.onecamera.components.ml.intf.MlInputBitmap"
            X.0qQ.A0C(r1, r0)     // Catch:{ Exception -> 0x02d9 }
            X.8wA r1 = (X.C370298wA) r1     // Catch:{ Exception -> 0x02d9 }
            android.graphics.Bitmap r0 = r1.A00     // Catch:{ Exception -> 0x02d9 }
            r13 = 0
            X.0qQ.A0B(r0, r13)     // Catch:{ Exception -> 0x02d9 }
            int r2 = r0.getWidth()     // Catch:{ Exception -> 0x02d9 }
            int r6 = r0.getHeight()     // Catch:{ Exception -> 0x02d9 }
            int r9 = r6 * r2
            int[] r8 = new int[r9]     // Catch:{ Exception -> 0x02d9 }
            r15 = r0
            r16 = r8
            r17 = r13
            r18 = r2
            r19 = r13
            r20 = r13
            r21 = r2
            r22 = r6
            r15.getPixels(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x02d9 }
            int r17 = r9 * 2
            int r0 = r2 * 3
            int r0 = r0 * r6
            java.nio.FloatBuffer r5 = org.pytorch.Tensor.allocateFloatBuffer(r0)     // Catch:{ Exception -> 0x02d9 }
            r7 = 0
        L_0x005d:
            r12 = 1
            r16 = 2
            if (r7 >= r9) goto L_0x009c
            r4 = r8[r7]     // Catch:{ Exception -> 0x02d9 }
            int r0 = r4 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r1 = (float) r0     // Catch:{ Exception -> 0x02d9 }
            r11 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r11
            int r0 = r4 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r10 = (float) r0     // Catch:{ Exception -> 0x02d9 }
            float r10 = r10 / r11
            r0 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r0     // Catch:{ Exception -> 0x02d9 }
            float r4 = r4 / r11
            float[] r15 = X.C379309Ti.A00     // Catch:{ Exception -> 0x02d9 }
            r0 = r15[r13]     // Catch:{ Exception -> 0x02d9 }
            float r1 = r1 - r0
            float[] r11 = X.C379309Ti.A01     // Catch:{ Exception -> 0x02d9 }
            r0 = r11[r13]     // Catch:{ Exception -> 0x02d9 }
            float r1 = r1 / r0
            r5.put(r7, r1)     // Catch:{ Exception -> 0x02d9 }
            int r1 = r9 + r7
            r0 = r15[r12]     // Catch:{ Exception -> 0x02d9 }
            float r10 = r10 - r0
            r0 = r11[r12]     // Catch:{ Exception -> 0x02d9 }
            float r10 = r10 / r0
            r5.put(r1, r10)     // Catch:{ Exception -> 0x02d9 }
            int r1 = r17 + r7
            r0 = r15[r16]     // Catch:{ Exception -> 0x02d9 }
            float r4 = r4 - r0
            r0 = r11[r16]     // Catch:{ Exception -> 0x02d9 }
            float r4 = r4 / r0
            r5.put(r1, r4)     // Catch:{ Exception -> 0x02d9 }
            int r7 = r7 + 1
            goto L_0x005d
        L_0x009c:
            r0 = 4
            long[] r4 = new long[r0]     // Catch:{ Exception -> 0x02d9 }
            r0 = 1
            r4[r13] = r0     // Catch:{ Exception -> 0x02d9 }
            r0 = 3
            r4[r12] = r0     // Catch:{ Exception -> 0x02d9 }
            long r0 = (long) r6     // Catch:{ Exception -> 0x02d9 }
            r4[r16] = r0     // Catch:{ Exception -> 0x02d9 }
            long r1 = (long) r2     // Catch:{ Exception -> 0x02d9 }
            r0 = 3
            r4[r0] = r1     // Catch:{ Exception -> 0x02d9 }
            X.XF6 r0 = X.XF6.CONTIGUOUS     // Catch:{ Exception -> 0x02d9 }
            org.pytorch.Tensor r0 = org.pytorch.Tensor.fromBlob((java.nio.FloatBuffer) r5, (long[]) r4, (X.XF6) r0)     // Catch:{ Exception -> 0x02d9 }
            org.pytorch.IValue r0 = org.pytorch.IValue.from((org.pytorch.Tensor) r0)     // Catch:{ Exception -> 0x02d9 }
            org.pytorch.IValue[] r1 = new org.pytorch.IValue[]{r0}     // Catch:{ Exception -> 0x02d9 }
            X.8EJ r0 = r3.A00     // Catch:{ Exception -> 0x02d9 }
            org.pytorch.IValue r0 = r0.forward(r1)     // Catch:{ Exception -> 0x02d9 }
            org.pytorch.Tensor r3 = r0.toTensor()     // Catch:{ Exception -> 0x02d9 }
            X.0qQ.A0A(r3)     // Catch:{ Exception -> 0x02d9 }
            int r0 = r14.A00     // Catch:{ Exception -> 0x02d9 }
            r27 = r0
            X.0qQ.A0B(r3, r13)     // Catch:{ Exception -> 0x02d9 }
            long[] r1 = r3.shape     // Catch:{ Exception -> 0x02d9 }
            int r0 = r1.length     // Catch:{ Exception -> 0x02d9 }
            long[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ Exception -> 0x02d9 }
            if (r0 == 0) goto L_0x02bd
            long[] r1 = r3.shape     // Catch:{ Exception -> 0x02d9 }
            int r0 = r1.length     // Catch:{ Exception -> 0x02d9 }
            long[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ Exception -> 0x02d9 }
            int r1 = r0.length     // Catch:{ Exception -> 0x02d9 }
            r0 = 2
            if (r1 != r0) goto L_0x02bd
            long[] r1 = r3.shape     // Catch:{ Exception -> 0x02d9 }
            int r0 = r1.length     // Catch:{ Exception -> 0x02d9 }
            long[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ Exception -> 0x02d9 }
            r0 = r0[r13]     // Catch:{ Exception -> 0x02d9 }
            int r11 = (int) r0     // Catch:{ Exception -> 0x02d9 }
            long[] r1 = r3.shape     // Catch:{ Exception -> 0x02d9 }
            int r0 = r1.length     // Catch:{ Exception -> 0x02d9 }
            long[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ Exception -> 0x02d9 }
            r0 = r0[r12]     // Catch:{ Exception -> 0x02d9 }
            int r10 = (int) r0     // Catch:{ Exception -> 0x02d9 }
            float[] r4 = r3.getDataAsFloatArray()     // Catch:{ Exception -> 0x02d9 }
            int r0 = r4.length     // Catch:{ Exception -> 0x02d9 }
            if (r0 != 0) goto L_0x0105
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x02d9 }
            r0.<init>()     // Catch:{ Exception -> 0x02d9 }
        L_0x0104:
            throw r0     // Catch:{ Exception -> 0x02d9 }
        L_0x0105:
            r7 = r4[r13]     // Catch:{ Exception -> 0x02d9 }
            int r2 = r0 + -1
            if (r12 > r2) goto L_0x0117
            r1 = 1
        L_0x010c:
            r0 = r4[r1]     // Catch:{ Exception -> 0x02d9 }
            float r7 = java.lang.Math.min(r7, r0)     // Catch:{ Exception -> 0x02d9 }
            if (r1 == r2) goto L_0x0117
            int r1 = r1 + 1
            goto L_0x010c
        L_0x0117:
            float[] r4 = r3.getDataAsFloatArray()     // Catch:{ Exception -> 0x02d9 }
            int r0 = r4.length     // Catch:{ Exception -> 0x02d9 }
            if (r0 != 0) goto L_0x0124
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x02d9 }
            r0.<init>()     // Catch:{ Exception -> 0x02d9 }
            goto L_0x0104
        L_0x0124:
            r6 = r4[r13]     // Catch:{ Exception -> 0x02d9 }
            int r2 = r0 + -1
            if (r12 > r2) goto L_0x0136
            r1 = 1
        L_0x012b:
            r0 = r4[r1]     // Catch:{ Exception -> 0x02d9 }
            float r6 = java.lang.Math.max(r6, r0)     // Catch:{ Exception -> 0x02d9 }
            if (r1 == r2) goto L_0x0136
            int r1 = r1 + 1
            goto L_0x012b
        L_0x0136:
            int r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x02bd
            float[] r5 = r3.getDataAsFloatArray()     // Catch:{ Exception -> 0x02d9 }
            int r3 = r5.length     // Catch:{ Exception -> 0x02d9 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x02d9 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x02d9 }
            r1 = 0
        L_0x0145:
            r4 = 255(0xff, float:3.57E-43)
            if (r1 >= r3) goto L_0x015d
            r4 = r5[r1]     // Catch:{ Exception -> 0x02d9 }
            float r4 = r4 - r7
            float r0 = r6 - r7
            float r4 = r4 / r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r0
            int r0 = (int) r4     // Catch:{ Exception -> 0x02d9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02d9 }
            r2.add(r0)     // Catch:{ Exception -> 0x02d9 }
            int r1 = r1 + 1
            goto L_0x0145
        L_0x015d:
            int[] r5 = X.00k.A0x(r2)     // Catch:{ Exception -> 0x02d9 }
            int[][] r9 = new int[r11][]     // Catch:{ Exception -> 0x02d9 }
            r1 = 0
        L_0x0164:
            if (r1 >= r11) goto L_0x016d
            int[] r0 = new int[r10]     // Catch:{ Exception -> 0x02d9 }
            r9[r1] = r0     // Catch:{ Exception -> 0x02d9 }
            int r1 = r1 + 1
            goto L_0x0164
        L_0x016d:
            r3 = 0
        L_0x016e:
            if (r3 >= r10) goto L_0x018a
            r2 = 0
        L_0x0171:
            if (r2 >= r11) goto L_0x0187
            r1 = r9[r2]     // Catch:{ Exception -> 0x02d9 }
            int r0 = r2 * r10
            int r0 = r0 + r3
            r0 = r5[r0]     // Catch:{ Exception -> 0x02d9 }
            int r0 = java.lang.Math.min(r0, r4)     // Catch:{ Exception -> 0x02d9 }
            int r0 = java.lang.Math.max(r0, r13)     // Catch:{ Exception -> 0x02d9 }
            r1[r3] = r0     // Catch:{ Exception -> 0x02d9 }
            int r2 = r2 + 1
            goto L_0x0171
        L_0x0187:
            int r3 = r3 + 1
            goto L_0x016e
        L_0x018a:
            int r3 = r5.length     // Catch:{ Exception -> 0x02d9 }
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
        L_0x0191:
            if (r1 >= r3) goto L_0x01a0
            r0 = r5[r1]     // Catch:{ Exception -> 0x02d9 }
            int r2 = java.lang.Math.min(r2, r0)     // Catch:{ Exception -> 0x02d9 }
            int r4 = java.lang.Math.max(r4, r0)     // Catch:{ Exception -> 0x02d9 }
            int r1 = r1 + 1
            goto L_0x0191
        L_0x01a0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x02d9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x02d9 }
            X.0eP r1 = new X.0eP     // Catch:{ Exception -> 0x02d9 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x02d9 }
            java.lang.Object r0 = r1.A00     // Catch:{ Exception -> 0x02d9 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x02d9 }
            int r25 = r0.intValue()     // Catch:{ Exception -> 0x02d9 }
            java.lang.Object r0 = r1.A01     // Catch:{ Exception -> 0x02d9 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x02d9 }
            int r24 = r0.intValue()     // Catch:{ Exception -> 0x02d9 }
            r4 = 256(0x100, float:3.59E-43)
            int[] r15 = new int[r4]     // Catch:{ Exception -> 0x02d9 }
            r2 = 0
        L_0x01c2:
            if (r2 >= r3) goto L_0x01cf
            r1 = r5[r2]     // Catch:{ Exception -> 0x02d9 }
            r0 = r15[r1]     // Catch:{ Exception -> 0x02d9 }
            int r0 = r0 + 1
            r15[r1] = r0     // Catch:{ Exception -> 0x02d9 }
            int r2 = r2 + 1
            goto L_0x01c2
        L_0x01cf:
            r2 = 0
            r1 = 0
        L_0x01d1:
            r0 = r15[r2]     // Catch:{ Exception -> 0x02d9 }
            int r0 = r0 * r2
            int r1 = r1 + r0
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x01d1
            double r7 = (double) r1     // Catch:{ Exception -> 0x02d9 }
            double r5 = (double) r3     // Catch:{ Exception -> 0x02d9 }
            double r7 = r7 / r5
            int r0 = r25 + -1
            int r4 = java.lang.Math.max(r0, r13)     // Catch:{ Exception -> 0x02d9 }
            r22 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r16 = 0
            r20 = 0
        L_0x01e8:
            r0 = r24
            if (r4 > r0) goto L_0x021c
            double r18 = r7 - r20
            double r1 = r16 * r5
            double r1 = r1 * r18
            double r1 = r1 * r18
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fc
            r25 = r4
            r22 = r1
        L_0x01fc:
            r0 = r24
            if (r4 > r0) goto L_0x0207
            r0 = r15[r4]     // Catch:{ Exception -> 0x02d9 }
            if (r0 != 0) goto L_0x0207
            int r4 = r4 + 1
            goto L_0x01fc
        L_0x0207:
            double r20 = r20 * r16
            r0 = r15[r4]     // Catch:{ Exception -> 0x02d9 }
            int r1 = r0 * r4
            double r2 = (double) r1     // Catch:{ Exception -> 0x02d9 }
            double r20 = r20 + r2
            double r0 = (double) r0     // Catch:{ Exception -> 0x02d9 }
            double r16 = r0 + r16
            double r20 = r20 / r16
            double r7 = r7 * r5
            double r7 = r7 - r2
            double r5 = r5 - r0
            double r7 = r7 / r5
            int r4 = r4 + 1
            goto L_0x01e8
        L_0x021c:
            X.9SU r1 = X.AnonymousClass9SU.A00     // Catch:{ Exception -> 0x02d9 }
            r0 = r25
            X.0eP r0 = r1.A01(r9, r0)     // Catch:{ Exception -> 0x02d9 }
            java.lang.Object r8 = r0.A01     // Catch:{ Exception -> 0x02d9 }
            int[][] r8 = (int[][]) r8     // Catch:{ Exception -> 0x02d9 }
            java.lang.Object r0 = r0.A00     // Catch:{ Exception -> 0x02d9 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x02d9 }
            int r7 = r0.intValue()     // Catch:{ Exception -> 0x02d9 }
            r0 = r27
            float r1 = (float) r0     // Catch:{ Exception -> 0x02d9 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x02d9 }
            float r1 = r1 / r0
            X.0qQ.A0B(r8, r12)     // Catch:{ Exception -> 0x02d9 }
            r0 = r9[r13]     // Catch:{ Exception -> 0x02d9 }
            int r15 = r0.length     // Catch:{ Exception -> 0x02d9 }
            int r2 = r7 + 1
            int[] r10 = new int[r2]     // Catch:{ Exception -> 0x02d9 }
            r0 = 0
        L_0x0240:
            if (r0 >= r2) goto L_0x0247
            r10[r0] = r13     // Catch:{ Exception -> 0x02d9 }
            int r0 = r0 + 1
            goto L_0x0240
        L_0x0247:
            int[] r6 = new int[r2]     // Catch:{ Exception -> 0x02d9 }
            r0 = 0
        L_0x024a:
            if (r0 >= r2) goto L_0x0251
            r6[r0] = r13     // Catch:{ Exception -> 0x02d9 }
            int r0 = r0 + 1
            goto L_0x024a
        L_0x0251:
            r2 = 0
        L_0x0252:
            r13 = 1
            if (r2 >= r11) goto L_0x0273
            r3 = 0
        L_0x0256:
            if (r3 >= r15) goto L_0x0270
            r0 = r8[r2]     // Catch:{ Exception -> 0x02d9 }
            r5 = r0[r3]     // Catch:{ Exception -> 0x02d9 }
            if (r5 == 0) goto L_0x026d
            r4 = r10[r5]     // Catch:{ Exception -> 0x02d9 }
            r0 = r9[r2]     // Catch:{ Exception -> 0x02d9 }
            r0 = r0[r3]     // Catch:{ Exception -> 0x02d9 }
            int r4 = r4 + r0
            r10[r5] = r4     // Catch:{ Exception -> 0x02d9 }
            r0 = r6[r5]     // Catch:{ Exception -> 0x02d9 }
            int r0 = r0 + 1
            r6[r5] = r0     // Catch:{ Exception -> 0x02d9 }
        L_0x026d:
            int r3 = r3 + 1
            goto L_0x0256
        L_0x0270:
            int r2 = r2 + 1
            goto L_0x0252
        L_0x0273:
            r16 = 0
            if (r12 > r7) goto L_0x0282
            r9 = 1
            goto L_0x02a8
        L_0x0279:
            r9 = r13
            r16 = r4
        L_0x027c:
            r0 = r13
            int r13 = r13 + 1
            if (r0 != r7) goto L_0x02a8
            r13 = r9
        L_0x0282:
            r7 = r11
            r4 = r15
            r3 = 0
            r6 = 0
            r5 = 0
        L_0x0287:
            if (r3 >= r11) goto L_0x02b4
            r2 = 0
        L_0x028a:
            if (r2 >= r15) goto L_0x02a5
            r0 = r8[r3]     // Catch:{ Exception -> 0x02d9 }
            r0 = r0[r2]     // Catch:{ Exception -> 0x02d9 }
            if (r0 != r13) goto L_0x02a2
            int r4 = java.lang.Math.min(r4, r2)     // Catch:{ Exception -> 0x02d9 }
            int r7 = java.lang.Math.min(r7, r3)     // Catch:{ Exception -> 0x02d9 }
            int r6 = java.lang.Math.max(r6, r2)     // Catch:{ Exception -> 0x02d9 }
            int r5 = java.lang.Math.max(r5, r3)     // Catch:{ Exception -> 0x02d9 }
        L_0x02a2:
            int r2 = r2 + 1
            goto L_0x028a
        L_0x02a5:
            int r3 = r3 + 1
            goto L_0x0287
        L_0x02a8:
            r0 = r10[r13]     // Catch:{ Exception -> 0x02d9 }
            double r4 = (double) r0     // Catch:{ Exception -> 0x02d9 }
            r0 = r6[r13]     // Catch:{ Exception -> 0x02d9 }
            double r2 = (double) r0     // Catch:{ Exception -> 0x02d9 }
            double r4 = r4 / r2
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x027c
            goto L_0x0279
        L_0x02b4:
            if (r4 != r6) goto L_0x02b8
            int r6 = r4 + 1
        L_0x02b8:
            if (r7 != r5) goto L_0x02c0
            int r5 = r7 + 1
            goto L_0x02c0
        L_0x02bd:
            r1 = r26
            goto L_0x02d1
        L_0x02c0:
            float r0 = (float) r4     // Catch:{ Exception -> 0x02d9 }
            float r0 = r0 * r1
            int r4 = (int) r0     // Catch:{ Exception -> 0x02d9 }
            float r0 = (float) r7     // Catch:{ Exception -> 0x02d9 }
            float r0 = r0 * r1
            int r3 = (int) r0     // Catch:{ Exception -> 0x02d9 }
            float r0 = (float) r6     // Catch:{ Exception -> 0x02d9 }
            float r0 = r0 * r1
            int r2 = (int) r0     // Catch:{ Exception -> 0x02d9 }
            float r0 = (float) r5     // Catch:{ Exception -> 0x02d9 }
            float r0 = r0 * r1
            int r0 = (int) r0     // Catch:{ Exception -> 0x02d9 }
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ Exception -> 0x02d9 }
            r1.<init>(r4, r3, r2, r0)     // Catch:{ Exception -> 0x02d9 }
        L_0x02d1:
            X.8w9 r0 = r14.A02     // Catch:{ Exception -> 0x02d9 }
            if (r0 == 0) goto L_0x0015
            r0.DYh(r1)     // Catch:{ Exception -> 0x02d9 }
            goto L_0x02e3
        L_0x02d9:
            X.8w9 r1 = r14.A02
            if (r1 == 0) goto L_0x0015
            r0 = r26
            r1.DYh(r0)
            return
        L_0x02e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass84M.A00():void");
    }

    public AnonymousClass84M(Context context, UserSession userSession) {
        this.A06 = context;
        this.A07 = userSession;
        AnonymousClass84O r1 = new AnonymousClass84O(new AnonymousClass84N(context, userSession), "saliency");
        this.A05 = r1;
        if (this.A03 == null) {
            r1.A00(new AnonymousClass84P(this));
        }
    }
}
