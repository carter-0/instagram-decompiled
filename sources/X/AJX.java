package X;

import android.animation.ValueAnimator;

public final class AJX implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public AJX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, C384879i2 r2, int i) {
        C384879i2.A04(new AJX(r2, i), valueAnimator, r2);
        valueAnimator.start();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0121, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0128, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0131, code lost:
        r1 = r6.getAnimatedValue();
        X.0qQ.A0C(r1, "null cannot be cast to non-null type kotlin.Float");
        r2.setAlpha(X.AnonymousClass7TE.A04(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0141, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0108;
                case 1: goto L_0x0113;
                case 2: goto L_0x0113;
                case 3: goto L_0x0046;
                case 4: goto L_0x008c;
                case 5: goto L_0x0046;
                case 6: goto L_0x0063;
                case 7: goto L_0x0032;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x001e;
                case 11: goto L_0x0129;
                case 12: goto L_0x00d7;
                case 13: goto L_0x00a6;
                default: goto L_0x0005;
            }
        L_0x0005:
            float r2 = X.AnonymousClass7TH.A00(r6)
            java.lang.Object r1 = r5.A01
            X.9i2 r1 = (X.C384879i2) r1
            android.widget.TextView r0 = r1.A0K
            java.lang.String r4 = "gameOverLabel"
            if (r0 == 0) goto L_0x0121
            r0.setScaleX(r2)
            android.widget.TextView r0 = r1.A0K
        L_0x0018:
            if (r0 == 0) goto L_0x0121
            r0.setScaleY(r2)
        L_0x001d:
            return
        L_0x001e:
            float r2 = X.AnonymousClass7TH.A00(r6)
            java.lang.Object r1 = r5.A01
            X.9i2 r1 = (X.C384879i2) r1
            android.widget.TextView r0 = r1.A0O
            java.lang.String r4 = "newHighScoreText"
            if (r0 == 0) goto L_0x0121
            r0.setScaleX(r2)
            android.widget.TextView r0 = r1.A0O
            goto L_0x0018
        L_0x0032:
            float r2 = X.AnonymousClass7TH.A00(r6)
            java.lang.Object r1 = r5.A01
            X.9i2 r1 = (X.C384879i2) r1
            android.widget.TextView r0 = r1.A0J
            java.lang.String r4 = "finalScoreText"
            if (r0 == 0) goto L_0x0121
            r0.setScaleX(r2)
            android.widget.TextView r0 = r1.A0J
            goto L_0x0018
        L_0x0046:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r5.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.0qQ.A0C(r1, r0)
            int r1 = X.AnonymousClass7TE.A0M(r1)
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L_0x001d
            r0.setBackgroundColor(r1)
            return
        L_0x0063:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r3 = r5.A01
            X.9i2 r3 = (X.C384879i2) r3
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.0qQ.A0C(r1, r0)
            float r2 = X.AnonymousClass7TE.A04(r1)
            r3.A03 = r2
            android.view.View r1 = r3.A06
            java.lang.String r4 = "paddleView"
            if (r1 == 0) goto L_0x0121
            int r0 = r1.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r2 = r2 - r0
            r1.setX(r2)
            return
        L_0x008c:
            float r3 = X.AnonymousClass7TH.A00(r6)
            java.lang.Object r0 = r5.A01
            X.9i2 r0 = (X.C384879i2) r0
            android.widget.TextView r2 = r0.A0P
            java.lang.String r4 = "projectileView"
            if (r2 == 0) goto L_0x0121
            float r1 = r2.getY()
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r3
            float r1 = r1 + r0
            r2.setY(r1)
            return
        L_0x00a6:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r3 = r5.A01
            X.6Oy r3 = (X.C307136Oy) r3
            float r2 = r6.getAnimatedFraction()
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00c5
            int r1 = r3.A01
        L_0x00b9:
            X.3oV r0 = r3.A05
            android.view.View r0 = r0.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r1)
            return
        L_0x00c5:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00ce
            int r1 = r3.A00
            goto L_0x00b9
        L_0x00ce:
            int r1 = r3.A01
            int r0 = r3.A00
            int r1 = X.0nH.A02(r2, r1, r0)
            goto L_0x00b9
        L_0x00d7:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.3Nf r0 = (X.C240933Nf) r0
            X.0eM r3 = r0.A07
            android.view.View r1 = X.AnonymousClass7TH.A06(r3)
            java.lang.Object r0 = r6.getAnimatedValue()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Float"
            X.0qQ.A0C(r0, r2)
            float r0 = X.AnonymousClass7TE.A04(r0)
            r1.setScaleX(r0)
            android.view.View r1 = X.AnonymousClass7TH.A06(r3)
            java.lang.Object r0 = r6.getAnimatedValue()
            X.0qQ.A0C(r0, r2)
            float r0 = X.AnonymousClass7TE.A04(r0)
            r1.setScaleY(r0)
            return
        L_0x0108:
            java.lang.Object r1 = r5.A01
            X.AJN r1 = (X.AJN) r1
            float r0 = r6.getAnimatedFraction()
            r1.A00 = r0
            return
        L_0x0113:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.9i2 r0 = (X.C384879i2) r0
            android.widget.TextView r2 = r0.A0E
            if (r2 != 0) goto L_0x0131
            java.lang.String r4 = "ballView"
        L_0x0121:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0129:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r5.A01
            android.view.View r2 = (android.view.View) r2
        L_0x0131:
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.0qQ.A0C(r1, r0)
            float r0 = X.AnonymousClass7TE.A04(r1)
            r2.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJX.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
