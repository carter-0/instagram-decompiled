package X;

import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class AJ3 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Surface A06;
    public Surface A07;
    public C344587s6 A08;
    public C345937uK A09;
    public C345937uK A0A;
    public C345937uK A0B;
    public C345557ti A0C;
    public AnonymousClass8HJ A0D;
    public AnonymousClass8HW A0E;
    public AHA A0F;
    public SSS A0G;
    public String A0H;
    public boolean A0I;
    public final long A0J;
    public final Handler A0K;
    public final A3M A0L;
    public final A3N A0M;
    public final C343967r6 A0N;
    public final C368538so A0O;
    public final AnonymousClass8HX A0P;
    public final Object A0Q;
    public final String A0R;
    public final List A0S;
    public final List A0T = AnonymousClass7TE.A1C();
    public final AtomicBoolean A0U;
    public final AtomicInteger A0V = new AtomicInteger(0);
    public final boolean A0W;
    public final float[] A0X;
    public volatile boolean A0Y;

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0130, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0139, code lost:
        if (r2 <= 3000000000L) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013c, code lost:
        if (r4 >= 3) goto L_0x0179;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AJ3 r22, float r23, float r24) {
        /*
            r8 = 1
            r9 = r22
            X.7uK r1 = r9.A09     // Catch:{ RuntimeException -> 0x015e }
            java.lang.String r0 = "Output surface should be created before encoding frames"
            X.17k.A07(r1, r0)     // Catch:{ RuntimeException -> 0x015e }
            long r4 = r9.A04     // Catch:{ RuntimeException -> 0x015e }
            long r0 = r9.A05     // Catch:{ RuntimeException -> 0x015e }
            long r4 = r4 - r0
            java.util.List r11 = r9.A0T     // Catch:{ RuntimeException -> 0x015e }
            int r0 = r11.size()     // Catch:{ RuntimeException -> 0x015e }
            float r3 = (float) r0     // Catch:{ RuntimeException -> 0x015e }
            double r1 = (double) r4     // Catch:{ RuntimeException -> 0x015e }
            r4 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r1 = r1 / r4
            float r0 = (float) r1     // Catch:{ RuntimeException -> 0x015e }
            float r3 = r3 / r0
            X.8HJ r0 = r9.A0D     // Catch:{ RuntimeException -> 0x015e }
            X.8HL[] r10 = r0.A01     // Catch:{ RuntimeException -> 0x015e }
            r7 = 0
            X.0qQ.A0B(r10, r7)     // Catch:{ RuntimeException -> 0x015e }
            int r5 = r10.length     // Catch:{ RuntimeException -> 0x015e }
            r4 = 0
            r6 = 0
        L_0x002a:
            if (r4 >= r5) goto L_0x0042
            r2 = r10[r4]     // Catch:{ RuntimeException -> 0x015e }
            float r1 = r2.A00     // Catch:{ RuntimeException -> 0x015e }
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x003d
            float r1 = r2.A00     // Catch:{ RuntimeException -> 0x015e }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x003f
        L_0x003d:
            int r6 = r6 + 1
        L_0x003f:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x0042:
            int[] r5 = new int[r6]     // Catch:{ RuntimeException -> 0x015e }
            X.8HJ r0 = r9.A0D     // Catch:{ RuntimeException -> 0x015e }
            X.8HL[] r0 = r0.A01     // Catch:{ RuntimeException -> 0x015e }
            r15 = r23
            r16 = r24
            r12 = r5
            r13 = r0
            r14 = r3
            java.util.ArrayList r11 = X.AHI.A01(r11, r12, r13, r14, r15, r16)     // Catch:{ RuntimeException -> 0x015e }
            java.util.List r10 = r9.A0S     // Catch:{ RuntimeException -> 0x015e }
            r10.clear()     // Catch:{ RuntimeException -> 0x015e }
            X.AHA r0 = r9.A0F     // Catch:{ RuntimeException -> 0x015e }
            if (r0 == 0) goto L_0x0157
            X.7uK r0 = r9.A09     // Catch:{ RuntimeException -> 0x015e }
            r0.A05()     // Catch:{ RuntimeException -> 0x015e }
            int r1 = r9.A03     // Catch:{ RuntimeException -> 0x015e }
            int r0 = r9.A02     // Catch:{ RuntimeException -> 0x015e }
            android.opengl.GLES20.glViewport(r7, r7, r1, r0)     // Catch:{ RuntimeException -> 0x015e }
            r2 = 0
            r4 = 0
        L_0x006b:
            r12 = 0
        L_0x006c:
            boolean r0 = r9.A0Y     // Catch:{ RuntimeException -> 0x015e }
            r15 = 1000000(0xf4240, double:4.940656E-318)
            if (r0 != 0) goto L_0x0179
            X.AHA r13 = r9.A0F     // Catch:{ RuntimeException -> 0x015e }
            X.8HJ r0 = r9.A0D     // Catch:{ RuntimeException -> 0x015e }
            r22 = r5[r7]     // Catch:{ RuntimeException -> 0x015e }
            int r1 = r0.ordinal()     // Catch:{ RuntimeException -> 0x015e }
            r0 = 4
            if (r1 == r0) goto L_0x0096
            r0 = 5
            if (r1 == r0) goto L_0x00aa
            X.8so r14 = r9.A0O     // Catch:{ RuntimeException -> 0x015e }
            java.lang.Object r0 = r11.get(r12)     // Catch:{ RuntimeException -> 0x015e }
            X.8tg r0 = (X.C369008tg) r0     // Catch:{ RuntimeException -> 0x015e }
            X.7v0 r1 = r0.A03     // Catch:{ RuntimeException -> 0x015e }
            float[] r0 = r9.A0X     // Catch:{ RuntimeException -> 0x015e }
            r14.A01(r1, r0, r2)     // Catch:{ RuntimeException -> 0x015e }
            r13.A04(r14)     // Catch:{ RuntimeException -> 0x015e }
            goto L_0x00bd
        L_0x0096:
            X.8so r1 = r9.A0O     // Catch:{ RuntimeException -> 0x015e }
            float[] r0 = r9.A0X     // Catch:{ RuntimeException -> 0x015e }
            r17 = r13
            r18 = r1
            r19 = r11
            r20 = r0
            r21 = r12
            r22 = r2
            X.AHI.A03(r17, r18, r19, r20, r21, r22)     // Catch:{ RuntimeException -> 0x015e }
            goto L_0x00bd
        L_0x00aa:
            X.8so r1 = r9.A0O     // Catch:{ RuntimeException -> 0x015e }
            float[] r0 = r9.A0X     // Catch:{ RuntimeException -> 0x015e }
            r23 = r2
            r19 = r11
            r20 = r0
            r21 = r12
            r17 = r13
            r18 = r1
            X.AHI.A02(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ RuntimeException -> 0x015e }
        L_0x00bd:
            X.7uK r1 = r9.A09     // Catch:{ RuntimeException -> 0x015e }
            if (r1 == 0) goto L_0x014c
            X.SSS r0 = r9.A0G     // Catch:{ RuntimeException -> 0x015e }
            if (r0 == 0) goto L_0x014c
            r1.A04(r2)     // Catch:{ RuntimeException -> 0x015e }
            X.7uK r0 = r9.A09     // Catch:{ RuntimeException -> 0x015e }
            r0.A03()     // Catch:{ RuntimeException -> 0x015e }
            X.SSS r0 = r9.A0G     // Catch:{ RuntimeException -> 0x015e }
            if (r0 == 0) goto L_0x00e0
            X.Q7n r1 = r0.A05     // Catch:{ RuntimeException -> 0x015e }
            if (r1 != 0) goto L_0x0118
            java.lang.String r1 = "BoomerangEncoder"
            r0 = 245(0xf5, float:3.43E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ RuntimeException -> 0x015e }
            X.0KC.A0C(r1, r0)     // Catch:{ RuntimeException -> 0x015e }
        L_0x00e0:
            int r0 = r10.size()     // Catch:{ RuntimeException -> 0x015e }
            int r0 = r0 % r6
            r0 = r5[r0]     // Catch:{ RuntimeException -> 0x015e }
            if (r12 != r0) goto L_0x00f3
            long r0 = r2 / r15
            int r13 = (int) r0     // Catch:{ RuntimeException -> 0x015e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ RuntimeException -> 0x015e }
            r10.add(r0)     // Catch:{ RuntimeException -> 0x015e }
        L_0x00f3:
            long r0 = r9.A0J     // Catch:{ RuntimeException -> 0x015e }
            long r2 = r2 + r0
            int r14 = r11.size()     // Catch:{ RuntimeException -> 0x015e }
            float r1 = (float) r4     // Catch:{ RuntimeException -> 0x015e }
            r0 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r0
            float r13 = (float) r12     // Catch:{ RuntimeException -> 0x015e }
            float r0 = (float) r14     // Catch:{ RuntimeException -> 0x015e }
            float r13 = r13 / r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r13 = r13 * r0
            float r1 = r1 + r13
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            float r1 = r1 + r0
            r13 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r13, r1)     // Catch:{ RuntimeException -> 0x015e }
            X.8HW r0 = r9.A0E     // Catch:{ RuntimeException -> 0x015e }
            if (r0 == 0) goto L_0x0124
            r0.DaW(r1)     // Catch:{ RuntimeException -> 0x015e }
            goto L_0x011d
        L_0x0118:
            r0 = 2
            r1.sendEmptyMessage(r0)     // Catch:{ RuntimeException -> 0x015e }
            goto L_0x00e0
        L_0x011d:
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0124
            r0 = 0
            r9.A0E = r0     // Catch:{ RuntimeException -> 0x015e }
        L_0x0124:
            int r0 = r11.size()     // Catch:{ RuntimeException -> 0x015e }
            int r0 = r0 - r8
            if (r12 < r0) goto L_0x012c
            goto L_0x0130
        L_0x012c:
            int r12 = r12 + 1
            goto L_0x006c
        L_0x0130:
            int r4 = r4 + 1
            r12 = 3000000000(0xb2d05e00, double:1.4821969375E-314)
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x013e
            r0 = 3
            if (r4 >= r0) goto L_0x0179
        L_0x013e:
            long r0 = (long) r4     // Catch:{ RuntimeException -> 0x015e }
            long r14 = r2 / r0
            long r14 = r14 + r2
            r12 = 15000000000(0x37e11d600, double:7.4109846876E-314)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
            goto L_0x0179
        L_0x014c:
            r0 = 553(0x229, float:7.75E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ RuntimeException -> 0x015e }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ RuntimeException -> 0x015e }
            goto L_0x015d
        L_0x0157:
            java.lang.String r0 = "Frame GL Renderer cannot be null while writing frames"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ RuntimeException -> 0x015e }
        L_0x015d:
            throw r0     // Catch:{ RuntimeException -> 0x015e }
        L_0x015e:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "BoomerangFramesHandlerImpl"
            if (r0 == 0) goto L_0x016e
            java.lang.String r0 = r2.getMessage()
            X.0KC.A0F(r1, r0, r2)
        L_0x016e:
            r0 = 907(0x38b, float:1.271E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0KC.A0F(r1, r0, r2)
            r9.A0Y = r8
        L_0x0179:
            boolean r0 = r9.A0Y
            r0 = r0 ^ 1
            A05(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJ3.A02(X.AJ3, float, float):void");
    }

    public static void A00(AnonymousClass8HJ r5, AnonymousClass8HW r6, AJ3 aj3, String str, float f, float f2) {
        String A002;
        if (aj3.A08 == null || aj3.A0C == null) {
            A002 = C66579MXk.A00(624);
        } else {
            AtomicInteger atomicInteger = aj3.A0V;
            if (atomicInteger.get() != 3) {
                A002 = 002.A0O(Pxd.A00(586), atomicInteger.get());
            } else {
                if (!(aj3.A09 == null && aj3.A0G == null)) {
                    0KC.A0C("BoomerangFramesHandlerImpl", "GL resources have not yet been released");
                    aj3.A0K.post(new C40740AiS(aj3));
                }
                aj3.A0E = r6;
                aj3.A0H = str;
                aj3.A0D = r5;
                aj3.A01 = f;
                aj3.A00 = f2;
                atomicInteger.set(4);
                aj3.A0K.post(new AiT(aj3));
                return;
            }
        }
        0KC.A0C("BoomerangFramesHandlerImpl", A002);
        A04(aj3, false);
    }

    public static void A01(AJ3 aj3) {
        Surface surface;
        if (aj3.A08 != null) {
            SSS sss = new SSS();
            aj3.A0G = sss;
            sss.A06 = aj3.A0N;
            sss.A04 = new ATE(aj3);
            int i = aj3.A03;
            int i2 = aj3.A02;
            if (!sss.A05(i, i2, (int) (((double) (i * i2)) * (1.0E9d / ((double) aj3.A0J)) * 4.0d * 0.07d), 0) || (surface = aj3.A0G.A03) == null || !surface.isValid()) {
                A03(aj3, false);
                return;
            }
            try {
                C345937uK AMY = aj3.A08.AMY(surface);
                aj3.A09 = AMY;
                AMY.A05();
                aj3.A0G.A04(aj3.A0H);
                AtomicInteger atomicInteger = aj3.A0V;
                if (atomicInteger.get() == 4) {
                    A02(aj3, aj3.A01, aj3.A00);
                } else {
                    atomicInteger.set(1);
                }
            } catch (Exception unused) {
                A03(aj3, false);
            }
        }
    }

    public static void A03(AJ3 aj3, boolean z) {
        AnonymousClass8HW r0 = aj3.A0E;
        if (r0 != null) {
            r0.DaW(1.0f);
            aj3.A0E = null;
        }
        AnonymousClass8HX r2 = aj3.A0P;
        String str = aj3.A0R;
        if (!z) {
            C342917pN r02 = r2.A00.A05;
            r02.getClass();
            C344377rl r03 = ((C345367tN) C342917pN.A00(r02)).A00;
            if (r03 != null) {
                r03.AOr();
            }
        }
        if (AnonymousClass8HF.A03(r2.A00, str)) {
            C342057ny.A00(new C41017An1(r2, z));
        }
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [java.lang.Object, X.A7b] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (r21 != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AJ3 r20, boolean r21) {
        /*
            r11 = 1065353216(0x3f800000, float:1.0)
            r10 = r20
            X.8HW r0 = r10.A0E
            if (r0 == 0) goto L_0x000e
            r0.DaW(r11)
            r0 = 0
            r10.A0E = r0
        L_0x000e:
            X.8HX r4 = r10.A0P
            java.lang.String r3 = r10.A0R
            java.lang.String r9 = r10.A0H
            X.8HJ r6 = r10.A0D
            int r8 = r10.A03
            int r5 = r10.A02
            r7 = r21
            if (r21 == 0) goto L_0x00e6
            java.util.List r0 = r10.A0S
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
            java.util.List r0 = r10.A0T
            int r1 = r0.size()
            X.A7b r12 = new X.A7b
            r12.<init>()
            r0 = 0
            r12.A00 = r0
            r12.A01 = r11
            r0 = 0
            r12.A03 = r0
            r12.A04 = r9
            r12.A06 = r2
            r12.A02 = r1
        L_0x003d:
            float r11 = r10.A01
            float r10 = r10.A00
            X.8HF r4 = r4.A00
            boolean r0 = X.AnonymousClass8HF.A03(r4, r3)
            if (r0 == 0) goto L_0x00e5
            if (r8 == 0) goto L_0x00ed
            if (r5 == 0) goto L_0x00ed
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A0M
            r0 = 3
            int r1 = r1.getAndSet(r0)
            r0 = 5
            boolean r14 = X.AnonymousClass7TF.A1S(r1, r0)
            if (r21 == 0) goto L_0x005f
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x0073
        L_0x005f:
            X.7pN r0 = r4.A05
            r0.getClass()
            X.7tO r0 = X.C342917pN.A00(r0)
            X.7tN r0 = (X.C345367tN) r0
            X.7rl r0 = r0.A00
            if (r0 == 0) goto L_0x0071
            r0.AOr()
        L_0x0071:
            if (r21 == 0) goto L_0x00be
        L_0x0073:
            long r2 = r4.A02
            r0 = 0
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x0083
            X.80X r3 = r4.A0U
            X.80X r2 = X.AnonymousClass80X.UNINITIALIZED
            if (r3 == r2) goto L_0x0083
            r4.A02 = r0
        L_0x0083:
            java.util.Map r2 = r4.A0L
            boolean r0 = r2.containsKey(r6)
            if (r0 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x0090
            r2.put(r6, r12)
        L_0x0090:
            android.content.Context r1 = r4.A0D
            r0 = 0
            X.0qQ.A0B(r1, r0)
            boolean r0 = X.C305756Jk.A00(r1)
            if (r0 == 0) goto L_0x00be
            java.lang.Object r2 = r2.get(r6)
            X.A7b r2 = (X.C39735A7b) r2
            if (r2 == 0) goto L_0x00be
            java.lang.String r0 = r2.A05
            X.C39735A7b.A00(r0)
            r2.A05 = r9
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00b2
            r2.A00 = r11
        L_0x00b2:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00be
            float r0 = r2.A00
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00be
            r2.A01 = r10
        L_0x00be:
            r2 = 0
            r20 = 0
            java.lang.Integer r0 = r4.A05
            r0.getClass()
            int r21 = r0.intValue()
            X.Xnz r15 = new X.Xnz
            r19 = r5
            r18 = r8
            r17 = r9
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.Xoh r1 = new X.Xoh
            r1.<init>(r15)
            if (r14 != 0) goto L_0x00e5
            X.8HJ r0 = r4.A0T
            if (r0 == r6) goto L_0x00e9
            X.AnonymousClass8HF.A00(r2, r4)
        L_0x00e5:
            return
        L_0x00e6:
            r12 = 0
            goto L_0x003d
        L_0x00e9:
            X.AnonymousClass8HF.A01(r1, r4, r7)
            return
        L_0x00ed:
            java.lang.String r1 = "encoding: w or h == 0, w= "
            java.lang.String r0 = " h="
            java.lang.String r1 = X.002.A02(r8, r5, r1, r0)
            java.lang.String r0 = "GLBoomerangCaptureController"
            X.0kD.A03(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJ3.A04(X.AJ3, boolean):void");
    }

    public static void A05(AJ3 aj3, boolean z) {
        if (aj3.A09 == null || aj3.A0G == null) {
            0KC.A0C("incorrect boomerang state", "Boomerang tried to finish after rendering resources were released");
            A03(aj3, false);
            return;
        }
        aj3.A0V.set(3);
        SSS sss = aj3.A0G;
        if (sss != null) {
            Q7n q7n = sss.A05;
            if (q7n == null) {
                0KC.A0C("BoomerangEncoder", Pxd.A00(245));
            } else {
                q7n.sendEmptyMessage(3);
            }
        }
        aj3.A0K.post(new C40740AiS(aj3));
        if (!z) {
            File A0t = AnonymousClass7TE.A0t(aj3.A0H);
            if (A0t.exists()) {
                A0t.deleteOnExit();
            }
        }
    }

    public AJ3(AnonymousClass8HJ r7, A3M a3m, C343967r6 r9, AnonymousClass8HX r10, Object obj, String str, String str2, boolean z) {
        float[] fArr = new float[16];
        this.A0X = fArr;
        this.A0O = new C368538so();
        this.A05 = -1;
        this.A04 = -1;
        this.A0S = AnonymousClass7TE.A1C();
        this.A01 = -1.0f;
        this.A00 = -1.0f;
        this.A0U = new AtomicBoolean(false);
        this.A0R = str;
        this.A0H = str2;
        this.A0P = r10;
        this.A0D = r7;
        this.A0Q = obj;
        this.A0N = r9;
        this.A0M = new A3N(this);
        this.A0J = (long) (33.0d * 1000000.0d);
        Matrix.setIdentityM(fArr, 0);
        C365268mo.A01(fArr);
        this.A0L = a3m;
        this.A0W = z;
        HandlerThread handlerThread = new HandlerThread("BoomerangRenderThread");
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.A0K = new Handler(looper);
        for (AnonymousClass8HL r1 : AnonymousClass8HJ.NORMAL.A01) {
            ((AnonymousClass8HK) r1).A00 = 1.2f;
        }
    }
}
