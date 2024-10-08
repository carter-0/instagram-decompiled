package X;

import android.animation.ValueAnimator;

public final class I84 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public static Object A00(I84 i84, Object obj) {
        0qQ.A0B(obj, 0);
        return i84.A01;
    }

    public I84(2V5 r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public static void A01(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new I84(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.Gcr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.Gcp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.GAM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.Gb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.Gcr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.Gcr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.Gcr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.Gcr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.Gcr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.Gcr} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        r1 = r5.getAnimatedValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        if ((r1 instanceof java.lang.Float) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        r1 = (java.lang.Number) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r1 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        r0 = r1.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        r1 = java.lang.Float.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r2.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0146, code lost:
        r3.invalidateSelf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0149, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016d, code lost:
        r0 = (X.2V5) r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0171, code lost:
        r0.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0174, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0164;
                case 1: goto L_0x014a;
                case 2: goto L_0x011f;
                case 3: goto L_0x0108;
                case 4: goto L_0x0108;
                case 5: goto L_0x0108;
                case 6: goto L_0x0108;
                case 7: goto L_0x0108;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0082;
                case 14: goto L_0x0082;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x00f5;
                case 19: goto L_0x00f5;
                case 20: goto L_0x00e2;
                case 21: goto L_0x00cc;
                case 22: goto L_0x00b7;
                case 23: goto L_0x009c;
                case 24: goto L_0x008e;
                case 25: goto L_0x008e;
                case 26: goto L_0x0082;
                case 27: goto L_0x0082;
                case 28: goto L_0x0065;
                case 29: goto L_0x0065;
                case 30: goto L_0x0065;
                case 31: goto L_0x0065;
                case 32: goto L_0x005c;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x0049;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = A00(r4, r5)
            X.2V5 r2 = (X.2V5) r2
            java.lang.Object r1 = r5.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.0qQ.A0C(r1, r0)
        L_0x0014:
            r2.A00(r1)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r2 = A00(r4, r5)
            X.GE5 r2 = (X.GE5) r2
            boolean r0 = r2.A0G
            if (r0 != 0) goto L_0x0017
            int r1 = r2.A02
            int r0 = r2.A03
            if (r1 != r0) goto L_0x0017
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x0017
            java.lang.Object r1 = r5.getAnimatedValue()
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0046
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0046
            float r0 = r1.floatValue()
        L_0x003c:
            r2.A00 = r0
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = r2.A0A
            if (r1 == 0) goto L_0x0017
            r1.A09(r0)
            return
        L_0x0046:
            float r0 = r2.A00
            goto L_0x003c
        L_0x0049:
            java.lang.Object r1 = X.C51971G9r.A0o(r5)
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0017
            if (r1 == 0) goto L_0x0017
            java.lang.Object r0 = r4.A01
            X.2V5 r0 = (X.2V5) r0
            r0.A00(r1)
            goto L_0x0171
        L_0x005c:
            java.lang.Object r0 = A00(r4, r5)
            X.GdV r0 = (X.C52839GdV) r0
            X.2V5 r2 = r0.A05
            goto L_0x006b
        L_0x0065:
            java.lang.Object r2 = A00(r4, r5)
            X.2V5 r2 = (X.2V5) r2
        L_0x006b:
            java.lang.Object r1 = r5.getAnimatedValue()
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0080
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0080
            float r0 = r1.floatValue()
        L_0x007b:
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            goto L_0x0014
        L_0x0080:
            r0 = 0
            goto L_0x007b
        L_0x0082:
            java.lang.Object r1 = X.C51971G9r.A0o(r5)
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0017
            if (r1 == 0) goto L_0x0017
            goto L_0x016d
        L_0x008e:
            java.lang.Object r1 = A00(r4, r5)
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r5.getAnimatedValue()
            X.C51974G9v.A0e(r5, r1, r0)
            return
        L_0x009c:
            java.lang.Object r3 = r4.A01
            X.Gb1 r3 = (X.C52689Gb1) r3
            android.animation.TimeInterpolator r0 = X.C52689Gb1.A09
            android.graphics.Paint r2 = r3.A05
            int r1 = r3.A02
            java.lang.Object r0 = r5.getAnimatedValue()
            float r0 = X.AnonymousClass7TE.A04(r0)
            int r0 = X.C52686Gay.A00(r1, r0)
            r2.setColor(r0)
            goto L_0x0146
        L_0x00b7:
            float r1 = X.AnonymousClass7TH.A00(r5)
            java.lang.Object r3 = r4.A01
            X.GAM r3 = (X.GAM) r3
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x00ca
            int r0 = r3.A01
            float r0 = (float) r0
            float r1 = r1 * r0
        L_0x00c7:
            r3.A00 = r1
            goto L_0x0146
        L_0x00ca:
            r1 = 0
            goto L_0x00c7
        L_0x00cc:
            java.lang.Object r2 = A00(r4, r5)
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r2 = (com.instagram.igds.components.stepperheader.IgdsStepperHeader) r2
            java.lang.Object r1 = r5.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r1, r0)
            r2.A00 = r0
            r2.invalidate()
            return
        L_0x00e2:
            java.lang.Object r2 = A00(r4, r5)
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r5.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.0qQ.A0C(r1, r0)
            r2.invoke(r1)
            return
        L_0x00f5:
            java.lang.Object r2 = A00(r4, r5)
            X.2Wa r2 = (X.2Wa) r2
            java.lang.Object r1 = r5.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.0qQ.A0C(r1, r0)
            r2.A01(r1)
            return
        L_0x0108:
            java.lang.Object r3 = A00(r4, r5)
            X.Gcp r3 = (X.C52798Gcp) r3
            r2 = 1132396544(0x437f0000, float:255.0)
            java.lang.Object r1 = r5.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r1, r0)
            float r2 = r2 * r0
            int r0 = (int) r2
            r3.A02 = r0
            goto L_0x0146
        L_0x011f:
            java.lang.Object r3 = A00(r4, r5)
            X.Gcr r3 = (X.C52800Gcr) r3
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0146
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0146
            long r0 = r5.getCurrentPlayTime()
            float r2 = (float) r0
            r0 = 1143930880(0x442f0000, float:700.0)
            float r2 = r2 / r0
            X.6Ly r1 = r3.A01
            r0 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r2
            int r0 = (int) r0
            r1.setAlpha(r0)
            android.view.animation.OvershootInterpolator r0 = r3.A09
            float r0 = r0.getInterpolation(r2)
            r3.A00 = r0
        L_0x0146:
            r3.invalidateSelf()
            return
        L_0x014a:
            java.lang.Object r3 = A00(r4, r5)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            java.lang.Object r1 = r5.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.DbW.A04(r1, r0)
            r2.height = r0
            r3.requestLayout()
            return
        L_0x0164:
            java.lang.Object r1 = X.C51971G9r.A0o(r5)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.0qQ.A0C(r1, r0)
        L_0x016d:
            java.lang.Object r0 = r4.A01
            X.2V5 r0 = (X.2V5) r0
        L_0x0171:
            r0.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I84.onAnimationUpdate(android.animation.ValueAnimator):void");
    }

    public I84(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
