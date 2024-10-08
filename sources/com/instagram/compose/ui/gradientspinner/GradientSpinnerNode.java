package com.instagram.compose.ui.gradientspinner;

import X.0qQ;
import X.0sK;
import X.AnonymousClass5Q4;
import X.AnonymousClass5QC;
import X.AnonymousClass5QF;
import X.AnonymousClass6GW;
import X.AnonymousClass9LM;
import X.C262204Co;
import X.C267794cD;
import X.C267814cG;
import X.C267824cH;
import X.C288025bF;
import X.C52402GRc;
import X.C52412GRo;
import X.C52415GRs;
import android.graphics.Matrix;
import android.graphics.Shader;

public final class GradientSpinnerNode extends C267794cD implements C267814cG, C267824cH {
    public float A00;
    public C52412GRo A01;
    public C52402GRc A02;
    public C52415GRs A03;
    public 0sK A04;
    public C262204Co A05;

    /* JADX INFO: finally extract failed */
    public final void AQM(AnonymousClass5Q4 r9) {
        float A012;
        0qQ.A0B(r9, 0);
        C52415GRs gRs = this.A03;
        float f = this.A01.A00;
        Shader shader = gRs.A01;
        if (shader != null) {
            Matrix matrix = gRs.A02;
            long j = gRs.A00;
            matrix.setRotate(f, C288025bF.A02(j) / 2.0f, C288025bF.A00(j) / 2.0f);
            shader.setLocalMatrix(matrix);
        }
        float f2 = this.A00;
        if (!Float.isNaN(f2)) {
            A012 = r9.F06(f2);
        } else {
            A012 = C288025bF.A01(r9.Bwg());
        }
        long Bwg = r9.Bwg();
        float A022 = (C288025bF.A02(Bwg) - A012) / 2.0f;
        float A002 = (C288025bF.A00(Bwg) - A012) / 2.0f;
        AnonymousClass5QF r3 = ((AnonymousClass5QC) r9.Ayw()).A01;
        r3.CNZ(A022, A002, A022, A002);
        try {
            this.A04.invoke(r9, this.A01, this.A03);
            float f3 = -A022;
            float f4 = -A002;
            r3.CNZ(f3, f4, f3, f4);
            r9.AQW();
        } catch (Throwable th) {
            float f5 = -A022;
            float f6 = -A002;
            r3.CNZ(f5, f6, f5, f6);
            throw th;
        }
    }

    public final /* synthetic */ void DPk() {
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.4D7, X.9JY] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0117 A[RETURN] */
    public static final X.1Hj A00(com.instagram.compose.ui.gradientspinner.GradientSpinnerNode r18, X.AnonymousClass4D7 r19) {
        /*
            r6 = r18
            r3 = 3
            r4 = r19
            boolean r0 = X.AnonymousClass9JY.A00(r3, r4)
            if (r0 == 0) goto L_0x0136
            r9 = r4
            X.9JY r9 = (X.AnonymousClass9JY) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0136
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0019:
            java.lang.Object r2 = r9.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r9.A00
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L_0x00a8
            if (r0 == r1) goto L_0x00b8
            if (r0 != r7) goto L_0x013d
            long r3 = r9.A01
            java.lang.Object r6 = r9.A02
            com.instagram.compose.ui.gradientspinner.GradientSpinnerNode r6 = (com.instagram.compose.ui.gradientspinner.GradientSpinnerNode) r6
            X.0eS.A00(r2)
        L_0x0030:
            java.lang.Number r2 = (java.lang.Number) r2
            long r1 = r2.longValue()
            long r1 = r1 - r3
            float r12 = (float) r1
            r0 = 1232348160(0x49742400, float:1000000.0)
            float r12 = r12 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0044
            r12 = 1120403456(0x42c80000, float:100.0)
        L_0x0044:
            X.GRo r10 = r6.A01
            X.5Oz r0 = r10.A09
            r19 = r0
            java.lang.Object r0 = r19.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r18 = 0
            if (r0 == 0) goto L_0x0105
            java.lang.Float r0 = r10.A02
            if (r0 == 0) goto L_0x00a5
            int r0 = r10.A05
        L_0x005e:
            float r0 = (float) r0
            float r17 = r12 / r0
            java.util.List r13 = r10.A0B
            java.util.Iterator r16 = r13.iterator()
        L_0x0067:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r11 = r16.next()
            com.instagram.compose.ui.gradientspinner.Segment r11 = (com.instagram.compose.ui.gradientspinner.Segment) r11
            float r14 = r11.A01
            int r0 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x009c
            float r14 = r14 - r17
        L_0x007b:
            r11.A01 = r14
            float r15 = r11.A00
            r14 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            int r5 = r11.A02
            if (r5 <= 0) goto L_0x0093
            int r0 = (int) r15
            int r5 = r5 - r0
            r0 = r18
            int r5 = java.lang.Math.max(r5, r0)
            r11.A02 = r5
        L_0x0093:
            if (r5 != 0) goto L_0x0098
            r11.A00 = r14
            goto L_0x0067
        L_0x0098:
            float r15 = r15 % r14
            r11.A00 = r15
            goto L_0x0067
        L_0x009c:
            float r5 = r11.A00
            float r0 = r17 - r14
            float r5 = r5 + r0
            r11.A00 = r5
            r14 = 0
            goto L_0x007b
        L_0x00a5:
            int r0 = r10.A07
            goto L_0x005e
        L_0x00a8:
            X.0eS.A00(r2)
            X.Az1 r0 = X.C41710Az1.A00
            r9.A02 = r6
            r9.A00 = r1
            java.lang.Object r2 = X.C3026564t.A01(r9, r0)
            if (r2 != r8) goto L_0x00bf
            return r8
        L_0x00b8:
            java.lang.Object r6 = r9.A02
            com.instagram.compose.ui.gradientspinner.GradientSpinnerNode r6 = (com.instagram.compose.ui.gradientspinner.GradientSpinnerNode) r6
            X.0eS.A00(r2)
        L_0x00bf:
            java.lang.Number r2 = (java.lang.Number) r2
            long r3 = r2.longValue()
            goto L_0x0109
        L_0x00c6:
            float r5 = r10.A01
            int r0 = r10.A06
            float r0 = (float) r0
            float r0 = r12 / r0
            r11 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 * r11
            float r5 = r5 + r0
            r10.A01 = r5
            java.lang.Float r0 = r10.A02
            if (r0 == 0) goto L_0x012d
            float r5 = r0.floatValue()
            float r0 = r10.A00
            float r5 = r5 * r12
            float r0 = r0 + r5
            float r12 = java.lang.Math.min(r0, r11)
        L_0x00e3:
            r10.A00 = r12
            boolean r0 = r13 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0118
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0118
        L_0x00ef:
            java.lang.Float r0 = r10.A02
            if (r0 == 0) goto L_0x0102
            float r0 = r10.A00
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0102
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r18)
            r0 = r19
            r0.Epw(r5)
        L_0x0102:
            r19.getValue()
        L_0x0105:
            X.C288785cT.A00(r6)
            long r3 = r3 + r1
        L_0x0109:
            X.Az2 r0 = X.C41711Az2.A00
            r9.A02 = r6
            r9.A01 = r3
            r9.A00 = r7
            java.lang.Object r2 = X.C3026564t.A01(r9, r0)
            if (r2 != r8) goto L_0x0030
            return r8
        L_0x0118:
            java.util.Iterator r5 = r13.iterator()
        L_0x011c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r5.next()
            com.instagram.compose.ui.gradientspinner.Segment r0 = (com.instagram.compose.ui.gradientspinner.Segment) r0
            int r0 = r0.A02
            if (r0 != 0) goto L_0x0102
            goto L_0x011c
        L_0x012d:
            float r5 = r10.A00
            int r0 = r10.A04
            float r0 = (float) r0
            float r12 = r12 / r0
            float r12 = r12 * r11
            float r12 = r12 + r5
            goto L_0x00e3
        L_0x0136:
            X.9JY r9 = new X.9JY
            r9.<init>(r6, r4, r3)
            goto L_0x0019
        L_0x013d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.ui.gradientspinner.GradientSpinnerNode.A00(com.instagram.compose.ui.gradientspinner.GradientSpinnerNode, X.4D7):X.1Hj");
    }

    public final void DUu() {
        AnonymousClass6GW.A00(this, new AnonymousClass9LM(this, 30));
    }
}
