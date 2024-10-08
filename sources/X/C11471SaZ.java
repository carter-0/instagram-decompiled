package X;

import android.view.Choreographer;

/* renamed from: X.SaZ  reason: case insensitive filesystem */
public abstract class C11471SaZ implements Choreographer.FrameCallback {
    public final Q6H A00;

    public C11471SaZ(Q6H q6h) {
        0qQ.A0B(q6h, 1);
        this.A00 = q6h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r36.size() > 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(long r40) {
        /*
            r39 = this;
            r0 = r39
            X.Qb9 r0 = (X.C7833Qb9) r0
            com.facebook.react.animated.NativeAnimatedModule r0 = r0.A00     // Catch:{ Exception -> 0x035d }
            r38 = r0
            r35 = 0
            r1 = r35
            r0.mEnqueuedAnimationOnFrame = r1     // Catch:{ Exception -> 0x035d }
            X.SSb r30 = r38.getNodesManager()     // Catch:{ Exception -> 0x035d }
            if (r30 == 0) goto L_0x035c
            r0 = r30
            android.util.SparseArray r0 = r0.A04     // Catch:{ Exception -> 0x035d }
            r37 = r0
            int r0 = r37.size()     // Catch:{ Exception -> 0x035d }
            if (r0 > 0) goto L_0x002c
            r0 = r30
            android.util.SparseArray r0 = r0.A06     // Catch:{ Exception -> 0x035d }
            r36 = r0
            int r0 = r36.size()     // Catch:{ Exception -> 0x035d }
            if (r0 <= 0) goto L_0x033f
        L_0x002c:
            r2 = 0
        L_0x002d:
            r0 = r30
            android.util.SparseArray r0 = r0.A06     // Catch:{ Exception -> 0x035d }
            r36 = r0
            int r0 = r36.size()     // Catch:{ Exception -> 0x035d }
            if (r2 >= r0) goto L_0x0049
            r0 = r36
            java.lang.Object r1 = r0.valueAt(r2)     // Catch:{ Exception -> 0x035d }
            r0 = r30
            java.util.List r0 = r0.A09     // Catch:{ Exception -> 0x035d }
            r0.add(r1)     // Catch:{ Exception -> 0x035d }
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0049:
            r36.clear()     // Catch:{ Exception -> 0x035d }
            r34 = 0
            r33 = 0
        L_0x0050:
            int r1 = r37.size()     // Catch:{ Exception -> 0x035d }
            r32 = 1
            r0 = r34
            if (r0 >= r1) goto L_0x02d8
            r1 = r37
            java.lang.Object r31 = r1.valueAt(r0)     // Catch:{ Exception -> 0x035d }
            r0 = r31
            X.S2L r0 = (X.S2L) r0     // Catch:{ Exception -> 0x035d }
            r31 = r0
            boolean r2 = r0 instanceof X.C7823QYi     // Catch:{ Exception -> 0x035d }
            r0 = r40
            if (r2 == 0) goto L_0x0178
            r12 = r31
            X.QYi r12 = (X.C7823QYi) r12     // Catch:{ Exception -> 0x035d }
            X.QYz r2 = r12.A01     // Catch:{ Exception -> 0x035d }
            r29 = r2
            if (r2 == 0) goto L_0x02c3
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r27 = r40 / r2
            boolean r0 = r12.A0E     // Catch:{ Exception -> 0x035d }
            if (r0 != 0) goto L_0x00a3
            int r0 = r12.A0A     // Catch:{ Exception -> 0x035d }
            if (r0 != 0) goto L_0x008d
            r0 = r29
            double r0 = r0.A00     // Catch:{ Exception -> 0x035d }
            r12.A03 = r0     // Catch:{ Exception -> 0x035d }
            r0 = r32
            r12.A0A = r0     // Catch:{ Exception -> 0x035d }
        L_0x008d:
            X.S5X r2 = r12.A0F     // Catch:{ Exception -> 0x035d }
            r0 = r29
            double r0 = r0.A00     // Catch:{ Exception -> 0x035d }
            r2.A00 = r0     // Catch:{ Exception -> 0x035d }
            r12.A08 = r0     // Catch:{ Exception -> 0x035d }
            r0 = r27
            r12.A0C = r0     // Catch:{ Exception -> 0x035d }
            r0 = 0
            r12.A09 = r0     // Catch:{ Exception -> 0x035d }
            r0 = r32
            r12.A0E = r0     // Catch:{ Exception -> 0x035d }
        L_0x00a3:
            long r2 = r12.A0C     // Catch:{ Exception -> 0x035d }
            long r0 = r27 - r2
            double r3 = (double) r0     // Catch:{ Exception -> 0x035d }
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r0
            boolean r0 = X.C7823QYi.A00(r12)     // Catch:{ Exception -> 0x035d }
            if (r0 != 0) goto L_0x027b
            r1 = 4589276106681592316(0x3fb0624dd2f1a9fc, double:0.064)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00be
            r1 = r3
        L_0x00be:
            double r8 = r12.A09     // Catch:{ Exception -> 0x035d }
            double r8 = r8 + r1
            r12.A09 = r8     // Catch:{ Exception -> 0x035d }
            double r6 = r12.A05     // Catch:{ Exception -> 0x035d }
            double r0 = r12.A06     // Catch:{ Exception -> 0x035d }
            double r13 = r12.A07     // Catch:{ Exception -> 0x035d }
            double r2 = r12.A02     // Catch:{ Exception -> 0x035d }
            double r4 = -r2
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r13 * r0
            double r2 = java.lang.Math.sqrt(r2)     // Catch:{ Exception -> 0x035d }
            double r10 = r10 * r2
            double r6 = r6 / r10
            double r2 = r13 / r0
            double r2 = java.lang.Math.sqrt(r2)     // Catch:{ Exception -> 0x035d }
            double r10 = r6 * r6
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r19 - r10
            double r25 = java.lang.Math.sqrt(r0)     // Catch:{ Exception -> 0x035d }
            double r25 = r25 * r2
            double r0 = r12.A01     // Catch:{ Exception -> 0x035d }
            double r15 = r12.A08     // Catch:{ Exception -> 0x035d }
            double r23 = r0 - r15
            int r10 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x0137
            double r10 = -r6
            double r10 = r10 * r2
            double r10 = r10 * r8
            double r21 = java.lang.Math.exp(r10)     // Catch:{ Exception -> 0x035d }
            double r6 = r6 * r2
            double r2 = r6 * r23
            double r4 = r4 + r2
            double r2 = r4 / r25
            double r8 = r8 * r25
            double r19 = java.lang.Math.sin(r8)     // Catch:{ Exception -> 0x035d }
            double r2 = r2 * r19
            double r17 = java.lang.Math.cos(r8)     // Catch:{ Exception -> 0x035d }
            double r8 = r17 * r23
            double r2 = r2 + r8
            double r2 = r2 * r21
            double r10 = r0 - r2
            double r6 = r6 * r21
            double r2 = r19 * r4
            double r2 = r2 / r25
            double r2 = r2 + r8
            double r6 = r6 * r2
            double r17 = r17 * r4
            double r25 = r25 * r23
            double r25 = r25 * r19
            double r17 = r17 - r25
            double r17 = r17 * r21
            double r6 = r6 - r17
        L_0x0126:
            X.S5X r5 = r12.A0F     // Catch:{ Exception -> 0x035d }
            r5.A00 = r10     // Catch:{ Exception -> 0x035d }
            r5.A01 = r6     // Catch:{ Exception -> 0x035d }
            boolean r2 = X.C7823QYi.A00(r12)     // Catch:{ Exception -> 0x035d }
            if (r2 != 0) goto L_0x016c
            boolean r2 = r12.A0D     // Catch:{ Exception -> 0x035d }
            if (r2 == 0) goto L_0x027b
            goto L_0x0156
        L_0x0137:
            double r6 = -r2
            double r6 = r6 * r8
            double r6 = java.lang.Math.exp(r6)     // Catch:{ Exception -> 0x035d }
            double r17 = r2 * r23
            double r17 = r17 + r4
            double r17 = r17 * r8
            double r17 = r17 + r23
            double r17 = r17 * r6
            double r10 = r0 - r17
            double r17 = r8 * r2
            double r17 = r17 - r19
            double r4 = r4 * r17
            double r8 = r8 * r23
            double r2 = r2 * r2
            double r8 = r8 * r2
            double r4 = r4 + r8
            double r6 = r6 * r4
            goto L_0x0126
        L_0x0156:
            r3 = 0
            int r2 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x027b
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0164
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x016c
        L_0x0164:
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x027b
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x027b
        L_0x016c:
            r2 = 0
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0275
            r12.A08 = r0     // Catch:{ Exception -> 0x035d }
            r5.A00 = r0     // Catch:{ Exception -> 0x035d }
            goto L_0x0279
        L_0x0178:
            r2 = r31
            boolean r2 = r2 instanceof X.C7822QYh     // Catch:{ Exception -> 0x035d }
            if (r2 == 0) goto L_0x0206
            r10 = r31
            X.QYh r10 = (X.C7822QYh) r10     // Catch:{ Exception -> 0x035d }
            X.QYz r11 = r10.A01     // Catch:{ Exception -> 0x035d }
            if (r11 == 0) goto L_0x02ca
            long r2 = r10.A05     // Catch:{ Exception -> 0x035d }
            r5 = 0
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x019b
            r10.A05 = r0     // Catch:{ Exception -> 0x035d }
            r2 = r0
            int r5 = r10.A02     // Catch:{ Exception -> 0x035d }
            r4 = r32
            if (r5 != r4) goto L_0x019b
            double r4 = r11.A00     // Catch:{ Exception -> 0x035d }
            r10.A00 = r4     // Catch:{ Exception -> 0x035d }
        L_0x019b:
            long r6 = r40 - r2
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 / r4
            double r4 = (double) r6     // Catch:{ Exception -> 0x035d }
            r6 = 4625384467293973163(0x4030aaaaaaaaaaab, double:16.666666666666668)
            double r4 = r4 / r6
            long r4 = java.lang.Math.round(r4)     // Catch:{ Exception -> 0x035d }
            int r6 = (int) r4     // Catch:{ Exception -> 0x035d }
            if (r6 >= 0) goto L_0x01cc
            java.lang.String r4 = "Calculated frame index should never be lower than 0. Called with frameTimeNanos "
            java.lang.String r5 = " and mStartFrameTimeNanos "
            r6 = r0
            r8 = r2
            java.lang.String r2 = X.002.A0f(r4, r5, r6, r8)     // Catch:{ Exception -> 0x035d }
            int r1 = r10.A04     // Catch:{ Exception -> 0x035d }
            r0 = 100
            if (r1 >= r0) goto L_0x029a
            java.lang.String r0 = "ReactNative"
            X.0I1.A04(r0, r2)     // Catch:{ Exception -> 0x035d }
            int r0 = r10.A04     // Catch:{ Exception -> 0x035d }
            int r0 = r0 + 1
            r10.A04 = r0     // Catch:{ Exception -> 0x035d }
            goto L_0x029a
        L_0x01cc:
            boolean r0 = r10.A03     // Catch:{ Exception -> 0x035d }
            if (r0 != 0) goto L_0x029a
            double[] r3 = r10.A06     // Catch:{ Exception -> 0x035d }
            int r2 = r3.length     // Catch:{ Exception -> 0x035d }
            int r2 = r2 - r32
            if (r6 < r2) goto L_0x01fc
            int r1 = r10.A03     // Catch:{ Exception -> 0x035d }
            r0 = -1
            if (r1 == r0) goto L_0x01e8
            int r0 = r10.A02     // Catch:{ Exception -> 0x035d }
            if (r0 < r1) goto L_0x01e8
            double r8 = r10.A01     // Catch:{ Exception -> 0x035d }
            r0 = r32
            r10.A03 = r0     // Catch:{ Exception -> 0x035d }
            goto L_0x0272
        L_0x01e8:
            double r8 = r10.A00     // Catch:{ Exception -> 0x035d }
            r2 = r3[r2]     // Catch:{ Exception -> 0x035d }
            double r0 = r10.A01     // Catch:{ Exception -> 0x035d }
            double r0 = r0 - r8
            double r2 = r2 * r0
            double r8 = r8 + r2
            r0 = -1
            r10.A05 = r0     // Catch:{ Exception -> 0x035d }
            int r0 = r10.A02     // Catch:{ Exception -> 0x035d }
            int r0 = r0 + 1
            r10.A02 = r0     // Catch:{ Exception -> 0x035d }
            goto L_0x0272
        L_0x01fc:
            double r8 = r10.A00     // Catch:{ Exception -> 0x035d }
            r2 = r3[r6]     // Catch:{ Exception -> 0x035d }
            double r0 = r10.A01     // Catch:{ Exception -> 0x035d }
            double r0 = r0 - r8
            double r2 = r2 * r0
            double r8 = r8 + r2
            goto L_0x0272
        L_0x0206:
            r10 = r31
            X.QYg r10 = (X.C7821QYg) r10     // Catch:{ Exception -> 0x035d }
            X.QYz r11 = r10.A01     // Catch:{ Exception -> 0x035d }
            if (r11 == 0) goto L_0x02d1
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r40 / r2
            long r4 = r10.A06     // Catch:{ Exception -> 0x035d }
            r14 = -1
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x022f
            r0 = 16
            long r4 = r6 - r0
            r10.A06 = r4     // Catch:{ Exception -> 0x035d }
            double r0 = r10.A01     // Catch:{ Exception -> 0x035d }
            double r2 = r10.A02     // Catch:{ Exception -> 0x035d }
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0265
            double r0 = r11.A00     // Catch:{ Exception -> 0x035d }
            r10.A01 = r0     // Catch:{ Exception -> 0x035d }
        L_0x022d:
            r10.A02 = r0     // Catch:{ Exception -> 0x035d }
        L_0x022f:
            double r8 = r10.A01     // Catch:{ Exception -> 0x035d }
            double r2 = r10.A03     // Catch:{ Exception -> 0x035d }
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r10.A00     // Catch:{ Exception -> 0x035d }
            double r12 = r16 - r0
            double r2 = r2 / r12
            double r0 = -r12
            long r6 = r6 - r4
            double r4 = (double) r6     // Catch:{ Exception -> 0x035d }
            double r0 = r0 * r4
            double r0 = java.lang.Math.exp(r0)     // Catch:{ Exception -> 0x035d }
            double r16 = r16 - r0
            double r2 = r2 * r16
            double r8 = r8 + r2
            double r0 = r10.A02     // Catch:{ Exception -> 0x035d }
            double r0 = r0 - r8
            double r3 = java.lang.Math.abs(r0)     // Catch:{ Exception -> 0x035d }
            r1 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0270
            int r1 = r10.A05     // Catch:{ Exception -> 0x035d }
            r0 = -1
            if (r1 == r0) goto L_0x0268
            int r0 = r10.A04     // Catch:{ Exception -> 0x035d }
            if (r0 < r1) goto L_0x0268
            r0 = r32
            r10.A03 = r0     // Catch:{ Exception -> 0x035d }
            goto L_0x029a
        L_0x0265:
            r11.A00 = r0     // Catch:{ Exception -> 0x035d }
            goto L_0x022d
        L_0x0268:
            r10.A06 = r14     // Catch:{ Exception -> 0x035d }
            int r0 = r10.A04     // Catch:{ Exception -> 0x035d }
            int r0 = r0 + 1
            r10.A04 = r0     // Catch:{ Exception -> 0x035d }
        L_0x0270:
            r10.A02 = r8     // Catch:{ Exception -> 0x035d }
        L_0x0272:
            r11.A00 = r8     // Catch:{ Exception -> 0x035d }
            goto L_0x029a
        L_0x0275:
            r12.A01 = r10     // Catch:{ Exception -> 0x035d }
            r12.A08 = r10     // Catch:{ Exception -> 0x035d }
        L_0x0279:
            r5.A01 = r2     // Catch:{ Exception -> 0x035d }
        L_0x027b:
            r0 = r27
            r12.A0C = r0     // Catch:{ Exception -> 0x035d }
            X.S5X r0 = r12.A0F     // Catch:{ Exception -> 0x035d }
            double r1 = r0.A00     // Catch:{ Exception -> 0x035d }
            r0 = r29
            r0.A00 = r1     // Catch:{ Exception -> 0x035d }
            boolean r0 = X.C7823QYi.A00(r12)     // Catch:{ Exception -> 0x035d }
            if (r0 == 0) goto L_0x029a
            int r1 = r12.A0B     // Catch:{ Exception -> 0x035d }
            r0 = -1
            if (r1 == r0) goto L_0x02ac
            int r0 = r12.A0A     // Catch:{ Exception -> 0x035d }
            if (r0 < r1) goto L_0x02ac
            r0 = r32
            r12.A03 = r0     // Catch:{ Exception -> 0x035d }
        L_0x029a:
            r0 = r31
            X.QYz r1 = r0.A01     // Catch:{ Exception -> 0x035d }
            r0 = r30
            java.util.List r0 = r0.A09     // Catch:{ Exception -> 0x035d }
            r0.add(r1)     // Catch:{ Exception -> 0x035d }
            r0 = r31
            boolean r0 = r0.A03     // Catch:{ Exception -> 0x035d }
            if (r0 == 0) goto L_0x02bf
            goto L_0x02bd
        L_0x02ac:
            r0 = r35
            r12.A0E = r0     // Catch:{ Exception -> 0x035d }
            double r1 = r12.A03     // Catch:{ Exception -> 0x035d }
            r0 = r29
            r0.A00 = r1     // Catch:{ Exception -> 0x035d }
            int r0 = r12.A0A     // Catch:{ Exception -> 0x035d }
            int r0 = r0 + 1
            r12.A0A = r0     // Catch:{ Exception -> 0x035d }
            goto L_0x029a
        L_0x02bd:
            r33 = 1
        L_0x02bf:
            int r34 = r34 + 1
            goto L_0x0050
        L_0x02c3:
            java.lang.String r0 = "Animated value should not be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x035d }
            throw r0     // Catch:{ Exception -> 0x035d }
        L_0x02ca:
            java.lang.String r0 = "Animated value should not be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x035d }
            throw r0     // Catch:{ Exception -> 0x035d }
        L_0x02d1:
            java.lang.String r0 = "Animated value should not be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x035d }
            throw r0     // Catch:{ Exception -> 0x035d }
        L_0x02d8:
            r0 = r30
            java.util.List r1 = r0.A09     // Catch:{ Exception -> 0x035d }
            X.C11404SSb.A03(r0, r1)     // Catch:{ Exception -> 0x035d }
            r1.clear()     // Catch:{ Exception -> 0x035d }
            if (r33 == 0) goto L_0x033f
            r3 = 0
            int r5 = r37.size()     // Catch:{ Exception -> 0x035d }
            int r5 = r5 - r32
        L_0x02eb:
            if (r5 < 0) goto L_0x0333
            r0 = r37
            java.lang.Object r4 = r0.valueAt(r5)     // Catch:{ Exception -> 0x035d }
            X.S2L r4 = (X.S2L) r4     // Catch:{ Exception -> 0x035d }
            boolean r0 = r4.A03     // Catch:{ Exception -> 0x035d }
            if (r0 == 0) goto L_0x0330
            com.facebook.react.bridge.Callback r0 = r4.A02     // Catch:{ Exception -> 0x035d }
            if (r0 == 0) goto L_0x0315
            com.facebook.react.bridge.WritableNativeMap r2 = X.Pxe.A0U()     // Catch:{ Exception -> 0x035d }
            r0 = r32
            X.QYz.A00(r4, r2, r0)     // Catch:{ Exception -> 0x035d }
            com.facebook.react.bridge.Callback r1 = r4.A02     // Catch:{ Exception -> 0x035d }
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x035d }
            r1.invoke(r0)     // Catch:{ Exception -> 0x035d }
        L_0x030f:
            r0 = r37
            r0.removeAt(r5)     // Catch:{ Exception -> 0x035d }
            goto L_0x0330
        L_0x0315:
            com.facebook.react.bridge.WritableNativeMap r2 = X.Pxe.A0U()     // Catch:{ Exception -> 0x035d }
            int r1 = r4.A00     // Catch:{ Exception -> 0x035d }
            java.lang.String r0 = "animationId"
            r2.putInt(r0, r1)     // Catch:{ Exception -> 0x035d }
            r0 = r32
            X.QYz.A00(r4, r2, r0)     // Catch:{ Exception -> 0x035d }
            if (r3 != 0) goto L_0x032c
            com.facebook.react.bridge.WritableNativeArray r3 = new com.facebook.react.bridge.WritableNativeArray     // Catch:{ Exception -> 0x035d }
            r3.<init>()     // Catch:{ Exception -> 0x035d }
        L_0x032c:
            r3.pushMap(r2)     // Catch:{ Exception -> 0x035d }
            goto L_0x030f
        L_0x0330:
            int r5 = r5 + -1
            goto L_0x02eb
        L_0x0333:
            if (r3 == 0) goto L_0x033f
            r0 = r30
            X.QZK r1 = r0.A07     // Catch:{ Exception -> 0x035d }
            java.lang.String r0 = "onNativeAnimatedModuleAnimationFinished"
            r1.A0E(r0, r3)     // Catch:{ Exception -> 0x035d }
        L_0x033f:
            r0 = r38
            X.SOf r0 = r0.mReactChoreographer     // Catch:{ Exception -> 0x035d }
            if (r0 == 0) goto L_0x035c
            X.XyL r0 = X.C18401Vr3.A00     // Catch:{ Exception -> 0x035d }
            boolean r0 = r0.lazyAnimationCallbacks()     // Catch:{ Exception -> 0x035d }
            if (r0 == 0) goto L_0x0359
            int r0 = r37.size()     // Catch:{ Exception -> 0x035d }
            if (r0 > 0) goto L_0x0359
            int r0 = r36.size()     // Catch:{ Exception -> 0x035d }
            if (r0 <= 0) goto L_0x035c
        L_0x0359:
            r38.enqueueFrameCallback()     // Catch:{ Exception -> 0x035d }
        L_0x035c:
            return
        L_0x035d:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11471SaZ.A00(long):void");
    }

    public final void doFrame(long j) {
        try {
            A00(j);
        } catch (RuntimeException e) {
            this.A00.A0C(e);
        }
    }
}
