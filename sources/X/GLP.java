package X;

public final class GLP extends 0Yg implements C62320sa {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GLP(Object obj, Object obj2, float f, int i) {
        super(0);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = f;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009d, code lost:
        ((android.widget.TextView) r1).setTextSize(r2.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r20 = this;
            r2 = r20
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x0081;
                case 2: goto L_0x0097;
                case 3: goto L_0x00a5;
                case 4: goto L_0x00b9;
                case 5: goto L_0x00d0;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r2.A02
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            r3 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            X.9JQ r0 = new X.9JQ
            r0.<init>(r5, r3, r1)
            r9 = 0
            X.2WX r8 = new X.2WX
            r8.<init>(r9, r0)
            float r0 = r2.A00
            double r0 = (double) r0
            long r5 = java.lang.Double.doubleToRawLongBits(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r7 = 0
            X.9JR r0 = new X.9JR
            r0.<init>(r1, r7, r5)
            X.2WX r3 = new X.2WX
            r3.<init>(r8, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            X.9JR r0 = new X.9JR
            r0.<init>(r1, r7, r5)
            X.2WX r1 = new X.2WX
            r1.<init>(r3, r0)
            java.lang.Object r5 = r2.A03
            X.GsI r5 = (X.C53665GsI) r5
            X.2WX r0 = r5.A01
            X.2WX r3 = r1.A00(r0)
            X.2V1 r1 = r4.A05
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.2Wb r2 = new X.2Wb
            r2.<init>(r1, r0)
            X.2he r8 = r5.A00
            X.J57 r17 = X.J57.A00
            r0 = 4627448617123184640(0x4038000000000000, double:24.0)
            long r18 = java.lang.Double.doubleToRawLongBits(r0)
            if (r8 == 0) goto L_0x0077
            X.Id4 r11 = X.C57577Id4.A00
        L_0x0061:
            X.JMT r11 = (X.JMT) r11
            X.5tc r7 = new X.5tc
            r10 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.A00(r7)
            X.2Tl r0 = X.C243563Zg.A03(r2, r4, r3)
            return r0
        L_0x0077:
            X.Id3 r11 = X.C57576Id3.A00
            goto L_0x0061
        L_0x007a:
            java.lang.Object r0 = r2.A03
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r1 = r2.A02
            goto L_0x009d
        L_0x0081:
            java.lang.Object r0 = r2.A03
            X.3bF r0 = (X.C244473bF) r0
            java.lang.Float r0 = r0.A07
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r3 = r2.A02
            android.widget.TextView r3 = (android.widget.TextView) r3
            float r1 = r3.getLineSpacingExtra()
            float r0 = r2.A00
            r3.setLineSpacing(r1, r0)
            goto L_0x00fd
        L_0x0097:
            java.lang.Object r0 = r2.A02
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r1 = r2.A03
        L_0x009d:
            android.widget.TextView r1 = (android.widget.TextView) r1
            float r0 = r2.A00
            r1.setTextSize(r0)
            goto L_0x00fd
        L_0x00a5:
            java.lang.Object r3 = r2.A02
            android.graphics.Canvas r3 = (android.graphics.Canvas) r3
            java.lang.Object r5 = r2.A03
            com.meta.metaai.components.animation.ui.view.SpeechIndicatorView r5 = (com.meta.metaai.components.animation.ui.view.SpeechIndicatorView) r5
            int[] r0 = com.meta.metaai.components.animation.ui.view.SpeechIndicatorView.A0b
            float r0 = r5.A01
            r4 = 0
            r3.rotate(r0, r4, r4)
            float[] r1 = r5.A0V
            r0 = 0
            goto L_0x00e4
        L_0x00b9:
            java.lang.Object r3 = r2.A02
            android.graphics.Canvas r3 = (android.graphics.Canvas) r3
            java.lang.Object r5 = r2.A03
            com.meta.metaai.components.animation.ui.view.SpeechIndicatorView r5 = (com.meta.metaai.components.animation.ui.view.SpeechIndicatorView) r5
            int[] r0 = com.meta.metaai.components.animation.ui.view.SpeechIndicatorView.A0b
            float r1 = r5.A01
            r0 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r0
            r4 = 0
            r3.rotate(r1, r4, r4)
            float[] r1 = r5.A0V
            r0 = 1
            goto L_0x00e4
        L_0x00d0:
            java.lang.Object r3 = r2.A02
            android.graphics.Canvas r3 = (android.graphics.Canvas) r3
            java.lang.Object r5 = r2.A03
            com.meta.metaai.components.animation.ui.view.SpeechIndicatorView r5 = (com.meta.metaai.components.animation.ui.view.SpeechIndicatorView) r5
            int[] r0 = com.meta.metaai.components.animation.ui.view.SpeechIndicatorView.A0b
            float r0 = r5.A01
            float r0 = -r0
            r4 = 0
            r3.rotate(r0, r4, r4)
            float[] r1 = r5.A0V
            r0 = 2
        L_0x00e4:
            r1 = r1[r0]
            float r0 = r2.A00
            r3.scale(r1, r0, r4, r4)
            android.graphics.Paint r2 = r5.A0R
            X.I1w r0 = r5.A0D
            float r1 = r0.A00
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r2.setAlpha(r0)
            r0 = 1112014848(0x42480000, float:50.0)
            r3.drawCircle(r4, r4, r0, r2)
        L_0x00fd:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLP.invoke():java.lang.Object");
    }
}
