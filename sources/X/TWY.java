package X;

import android.graphics.Matrix;
import androidx.compose.ui.Alignment;
import java.util.Map;

public final class TWY extends 0Yg implements 0sP {
    public final /* synthetic */ Matrix A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ Alignment A02;
    public final /* synthetic */ C288095bM A03;
    public final /* synthetic */ S7N A04;
    public final /* synthetic */ Q6Y A05;
    public final /* synthetic */ C8874RDq A06;
    public final /* synthetic */ Map A07;
    public final /* synthetic */ C62320sa A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWY(Matrix matrix, C284945Oz r3, Alignment alignment, C288095bM r5, S7N s7n, Q6Y q6y, C8874RDq rDq, Map map, C62320sa r10, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.A04 = s7n;
        this.A03 = r5;
        this.A02 = alignment;
        this.A00 = matrix;
        this.A05 = q6y;
        this.A0B = z;
        this.A06 = rDq;
        this.A07 = map;
        this.A0D = z2;
        this.A09 = z3;
        this.A0C = z4;
        this.A0A = z5;
        this.A08 = r10;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0191, code lost:
        if (r10 == false) goto L_0x01ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r29) {
        /*
            r28 = this;
            r11 = r29
            X.5Q3 r11 = (X.AnonymousClass5Q3) r11
            r7 = 0
            X.0qQ.A0B(r11, r7)
            r1 = r28
            X.S7N r6 = r1.A04
            X.5bM r13 = r1.A03
            androidx.compose.ui.Alignment r0 = r1.A02
            r27 = r0
            android.graphics.Matrix r5 = r1.A00
            X.Q6Y r4 = r1.A05
            boolean r12 = r1.A0B
            X.RDq r0 = r1.A06
            r26 = r0
            java.util.Map r10 = r1.A07
            boolean r9 = r1.A0D
            boolean r0 = r1.A09
            r25 = r0
            boolean r0 = r1.A0C
            r24 = r0
            boolean r8 = r1.A0A
            X.0sa r0 = r1.A08
            r23 = r0
            X.5Oz r0 = r1.A01
            r22 = r0
            X.5QD r0 = r11.Ayw()
            X.5QC r0 = (X.AnonymousClass5QC) r0
            X.5Q5 r0 = r0.A02
            X.5QB r0 = r0.A02
            X.5QA r0 = r0.A01
            r21 = r0
            android.graphics.Rect r0 = r6.A05
            int r0 = r0.width()
            float r1 = (float) r0
            android.graphics.Rect r0 = r6.A05
            int r0 = r0.height()
            float r0 = (float) r0
            long r2 = X.C288015bE.A00(r1, r0)
            long r0 = r11.Bwg()
            float r14 = X.C288025bF.A02(r0)
            int r15 = X.AnonymousClass1GB.A01(r14)
            float r14 = X.C288025bF.A00(r0)
            int r14 = X.AnonymousClass1GB.A01(r14)
            long r19 = X.C289155d7.A00(r15, r14)
            long r13 = r13.AIn(r2, r0)
            float r1 = X.C288025bF.A02(r2)
            float r0 = X.C289125d3.A00(r13)
            float r1 = r1 * r0
            int r1 = (int) r1
            float r2 = X.C288025bF.A00(r2)
            float r0 = X.C289125d3.A01(r13)
            float r2 = r2 * r0
            int r0 = (int) r2
            long r17 = X.C289155d7.A00(r1, r0)
            X.5Q8 r16 = r11.getLayoutDirection()
            r15 = r27
            long r2 = r15.AB3(r16, r17, r19)
            r5.reset()
            r0 = 32
            long r0 = r2 >> r0
            int r11 = (int) r0
            float r11 = (float) r11
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r0 = (int) r2
            float r0 = (float) r0
            r5.preTranslate(r11, r0)
            float r1 = X.C289125d3.A00(r13)
            float r0 = X.C289125d3.A01(r13)
            r5.preScale(r1, r0)
            boolean r0 = r4.A0S
            if (r0 == r12) goto L_0x00bc
            r4.A0S = r12
            X.S7N r0 = r4.A0G
            if (r0 == 0) goto L_0x00bc
            X.Q6Y.A03(r4)
        L_0x00bc:
            r0 = r26
            r4.A0H = r0
            X.Q6Y.A04(r4)
            r4.A0K(r6)
            java.util.Map r0 = r4.A0P
            if (r10 == r0) goto L_0x00cf
            r4.A0P = r10
            r4.invalidateSelf()
        L_0x00cf:
            r22.getValue()
            boolean r0 = r4.A0X
            if (r0 == r9) goto L_0x00df
            r4.A0X = r9
            X.QGj r0 = r4.A0L
            if (r0 == 0) goto L_0x00df
            r0.A0E(r9)
        L_0x00df:
            r0 = r25
            r4.A0U = r0
            r0 = r24
            r4.A0W = r0
            boolean r0 = r4.A0R
            if (r8 == r0) goto L_0x00f6
            r4.A0R = r8
            X.QGj r0 = r4.A0L
            if (r0 == 0) goto L_0x00f3
            r0.A01 = r8
        L_0x00f3:
            r4.invalidateSelf()
        L_0x00f6:
            java.lang.Object r0 = r23.invoke()
            float r0 = X.AnonymousClass7TE.A04(r0)
            r4.A0B(r0)
            android.graphics.Rect r0 = r6.A05
            int r1 = r0.width()
            android.graphics.Rect r0 = r6.A05
            int r0 = r0.height()
            r4.setBounds(r7, r7, r1, r0)
            android.graphics.Canvas r6 = X.AnonymousClass5R4.A00(r21)
            X.QGj r3 = r4.A0L
            X.S7N r0 = r4.A0G
            if (r3 == 0) goto L_0x01ab
            if (r0 == 0) goto L_0x01ab
            X.RDf r0 = r4.A0D
            if (r0 != 0) goto L_0x0122
            X.RDf r0 = X.C10110Rmm.A00
        L_0x0122:
            X.RDf r1 = X.C8864RDf.ENABLED
            boolean r10 = X.AnonymousClass7TF.A1W(r0, r1)
            if (r10 == 0) goto L_0x0159
            java.util.concurrent.Semaphore r0 = r4.A0f     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            r0.acquire()     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            X.S7N r9 = r4.A0G     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            r8 = 0
            if (r9 == 0) goto L_0x014e
            float r2 = r4.A00     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            X.Q50 r0 = r4.A0c     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            float r1 = r0.A00()     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            r4.A00 = r1     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            float r0 = r9.A00()     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            float r1 = X.AnonymousClass7TE.A00(r1, r2)     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            float r1 = r1 * r0
            r0 = 1112014848(0x42480000, float:50.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x014e
            r8 = 1
        L_0x014e:
            if (r8 == 0) goto L_0x0159
            X.Q50 r0 = r4.A0c     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            float r0 = r0.A00()     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            r4.A0B(r0)     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
        L_0x0159:
            boolean r0 = r4.A0b     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            if (r0 == 0) goto L_0x016c
            r6.save()     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            r6.concat(r5)     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            X.Q6Y.A01(r6, r4, r3)     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            r6.restore()     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
        L_0x0169:
            r4.A0V = r7     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            goto L_0x0172
        L_0x016c:
            int r0 = r4.A01     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            r3.AQI(r6, r5, r0)     // Catch:{ InterruptedException -> 0x0191, all -> 0x0175 }
            goto L_0x0169
        L_0x0172:
            if (r10 == 0) goto L_0x01ab
            goto L_0x0193
        L_0x0175:
            r2 = move-exception
            if (r10 == 0) goto L_0x0190
            java.util.concurrent.Semaphore r0 = r4.A0f
            r0.release()
            float r1 = r3.A00
            X.Q50 r0 = r4.A0c
            float r0 = r0.A00()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0190
            java.util.concurrent.Executor r1 = X.Q6Y.A0j
            java.lang.Runnable r0 = r4.A0d
            r1.execute(r0)
        L_0x0190:
            throw r2
        L_0x0191:
            if (r10 == 0) goto L_0x01ab
        L_0x0193:
            java.util.concurrent.Semaphore r0 = r4.A0f
            r0.release()
            float r1 = r3.A00
            X.Q50 r0 = r4.A0c
            float r0 = r0.A00()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
            java.util.concurrent.Executor r1 = X.Q6Y.A0j
            java.lang.Runnable r0 = r4.A0d
            r1.execute(r0)
        L_0x01ab:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWY.invoke(java.lang.Object):java.lang.Object");
    }
}
