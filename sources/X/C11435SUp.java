package X;

import android.animation.ValueAnimator;

/* renamed from: X.SUp  reason: case insensitive filesystem */
public final class C11435SUp implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public C11435SUp(W1m w1m, int i) {
        this.A00 = i;
        this.A01 = w1m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.facebook.smartcapture.components.DarkenedFrameView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.facebook.smartcapture.components.DottedAlignmentView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.facebook.smartcapture.components.DarkenedFrameView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.facebook.smartcapture.components.DarkenedFrameView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x0138;
                case 2: goto L_0x008f;
                case 3: goto L_0x010e;
                case 4: goto L_0x0143;
                case 5: goto L_0x0072;
                case 6: goto L_0x00f9;
                case 7: goto L_0x00e4;
                case 8: goto L_0x00cc;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r1 = r11.getAnimatedValue()
            r0 = 338(0x152, float:4.74E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            float r0 = X.C51970G9q.A04(r1, r0)
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r6, r0)
            r0 = 0
            float r7 = java.lang.Math.max(r0, r1)
            r0 = 1082130432(0x40800000, float:4.0)
            float r7 = r7 * r0
            int r4 = (int) r7
            float r0 = (float) r4
            float r7 = r7 - r0
            float[] r2 = X.C7293Q2s.A0C
            android.view.animation.Interpolator r1 = X.C7293Q2s.A0A
            r9 = r2[r4]
            int r8 = r4 + 1
            r0 = 5
            int r8 = r8 % r0
            r2 = r2[r8]
            float r1 = r1.getInterpolation(r7)
            float r0 = r6 - r1
            float r9 = r9 * r0
            float r2 = r2 * r1
            float r9 = r9 + r2
            float[] r0 = X.C7293Q2s.A0D
            android.view.animation.Interpolator r3 = X.C7293Q2s.A09
            r5 = r0[r4]
            r2 = r0[r8]
            float r1 = r3.getInterpolation(r7)
            float r0 = r6 - r1
            float r5 = r5 * r0
            float r2 = r2 * r1
            float r5 = r5 + r2
            float[] r0 = X.C7293Q2s.A0B
            r4 = r0[r4]
            r1 = r0[r8]
            float r0 = r3.getInterpolation(r7)
            float r6 = r6 - r0
            float r4 = r4 * r6
            float r1 = r1 * r0
            float r4 = r4 + r1
            java.lang.Object r3 = r10.A01
            X.Q2s r3 = (X.C7293Q2s) r3
            r2 = 1135869952(0x43b40000, float:360.0)
            float r1 = r5 * r2
            float r1 = r1 + r9
            r0 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 - r0
            r3.A01 = r1
            float r4 = r4 - r5
            float r4 = r4 * r2
            r3.A00 = r4
            r3.invalidateSelf()
        L_0x0071:
            return
        L_0x0072:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.String r0 = "animation_property"
            java.lang.Object r1 = r11.getAnimatedValue(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r1 = X.DbW.A04(r1, r0)
            java.lang.Object r4 = r10.A01
            com.facebook.smartcapture.components.DottedAlignmentView r4 = (com.facebook.smartcapture.components.DottedAlignmentView) r4
            int r0 = r4.A02
            if (r1 == r0) goto L_0x0071
            r4.A02 = r1
            goto L_0x018c
        L_0x008f:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r2 = r0.getWindow()
            if (r2 == 0) goto L_0x0071
            java.lang.Object r1 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.DbW.A04(r1, r0)
            r2.setStatusBarColor(r0)
            return
        L_0x00ac:
            java.lang.Object r2 = r10.A01
            X.Q6Y r2 = (X.Q6Y) r2
            X.RDf r0 = r2.A0D
            if (r0 != 0) goto L_0x00b6
            X.RDf r0 = X.C10110Rmm.A00
        L_0x00b6:
            X.RDf r1 = X.C8864RDf.ENABLED
            if (r0 != r1) goto L_0x00be
            r2.invalidateSelf()
            return
        L_0x00be:
            X.QGj r1 = r2.A0L
            if (r1 == 0) goto L_0x0071
            X.Q50 r0 = r2.A0c
            float r0 = r0.A00()
            r1.A0A(r0)
            return
        L_0x00cc:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A01
            X.RvJ r0 = (X.C10625RvJ) r0
            X.2V5 r2 = r0.A02
            java.lang.Object r1 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.0qQ.A0C(r1, r0)
            r2.A00(r1)
            return
        L_0x00e4:
            java.lang.Object r0 = r11.getAnimatedValue()
            int r2 = X.AnonymousClass7TE.A0M(r0)
            android.os.Handler r0 = X.W1m.A0D
            java.lang.Object r0 = r10.A01
            X.W1m r0 = (X.W1m) r0
            X.U4W r1 = r0.A09
            float r0 = (float) r2
            r1.setTranslationY(r0)
            return
        L_0x00f9:
            java.lang.Object r0 = r11.getAnimatedValue()
            float r1 = X.AnonymousClass7TE.A04(r0)
            java.lang.Object r0 = r10.A01
            X.W1m r0 = (X.W1m) r0
            X.U4W r0 = r0.A09
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x010e:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r1 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r2 = X.DbW.A04(r1, r0)
            java.lang.Object r1 = r10.A01
            com.facebook.smartcapture.components.ContourView r1 = (com.facebook.smartcapture.components.ContourView) r1
            android.widget.ImageView r0 = r1.A08
            r0.setColorFilter(r2)
            android.widget.ImageView r0 = r1.A09
            r0.setColorFilter(r2)
            android.widget.ImageView r0 = r1.A06
            r0.setColorFilter(r2)
            android.widget.ImageView r0 = r1.A07
            r0.setColorFilter(r2)
            r1.A00 = r2
            return
        L_0x0138:
            java.lang.Object r2 = r10.A01
            X.Q3Q r2 = (X.Q3Q) r2
            long r0 = X.C11435SUp.super.getCurrentPlayTime()
            r2.A01 = r0
            return
        L_0x0143:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r4 = r10.A01
            com.facebook.smartcapture.components.DarkenedFrameView r4 = (com.facebook.smartcapture.components.DarkenedFrameView) r4
            android.graphics.RectF r3 = r4.A03
            java.lang.String r0 = "left"
            java.lang.Object r1 = r11.getAnimatedValue(r0)
            r0 = 338(0x152, float:4.74E-43)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            float r5 = X.C51970G9q.A04(r1, r6)
            java.lang.String r0 = "top"
            java.lang.Object r0 = r11.getAnimatedValue(r0)
            float r2 = X.C51970G9q.A04(r0, r6)
            java.lang.String r0 = "right"
            java.lang.Object r0 = r11.getAnimatedValue(r0)
            float r1 = X.C51970G9q.A04(r0, r6)
            java.lang.String r0 = "bottom"
            java.lang.Object r0 = r11.getAnimatedValue(r0)
            float r0 = X.C51970G9q.A04(r0, r6)
            r3.set(r5, r2, r1, r0)
            android.graphics.Path r2 = r4.A02
            r2.reset()
            float r1 = r4.A00
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r2.addRoundRect(r3, r1, r1, r0)
        L_0x018c:
            r4.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11435SUp.onAnimationUpdate(android.animation.ValueAnimator):void");
    }

    public C11435SUp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
