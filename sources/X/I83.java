package X;

import android.animation.ValueAnimator;

public final class I83 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public I83(2V5 r1, 2V5 r2, int i) {
        this.A00 = i;
        switch (i) {
            case 9:
            case 11:
            case 21:
            case 23:
                this.A01 = r1;
                this.A02 = r2;
                break;
            default:
                this.A02 = r1;
                this.A01 = r2;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
        r1 = java.lang.Float.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0154, code lost:
        r1 = ((android.animation.ValueAnimator) r0).getAnimatedValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015c, code lost:
        if ((r1 instanceof java.lang.Float) == false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015e, code lost:
        r1 = (java.lang.Number) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0160, code lost:
        if (r1 == null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r3.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0162, code lost:
        r4 = r1.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0167, code lost:
        r4 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d4, code lost:
        r4 = r4 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d5, code lost:
        r1 = java.lang.Float.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d9, code lost:
        r5.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r19) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A00
            r4 = r19
            switch(r0) {
                case 0: goto L_0x020c;
                case 1: goto L_0x020c;
                case 2: goto L_0x020c;
                case 3: goto L_0x0009;
                case 4: goto L_0x0009;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x0009;
                case 8: goto L_0x01e2;
                case 9: goto L_0x0121;
                case 10: goto L_0x01b3;
                case 11: goto L_0x00fd;
                case 12: goto L_0x018f;
                case 13: goto L_0x017b;
                case 14: goto L_0x0169;
                case 15: goto L_0x014e;
                case 16: goto L_0x0147;
                case 17: goto L_0x0169;
                case 18: goto L_0x00e4;
                case 19: goto L_0x00e4;
                case 20: goto L_0x001f;
                case 21: goto L_0x0121;
                case 22: goto L_0x01b3;
                case 23: goto L_0x00fd;
                case 24: goto L_0x018f;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r3 = r3.A01
            X.2V5 r3 = (X.2V5) r3
            java.lang.Object r1 = r4.getAnimatedValue()
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
        L_0x001b:
            r3.A00(r1)
        L_0x001e:
            return
        L_0x001f:
            r9 = 0
            X.0qQ.A0B(r4, r9)
            java.lang.Object r0 = r3.A02
            X.GE2 r0 = (X.GE2) r0
            float r2 = r0.A00
            java.lang.Object r1 = r4.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r1, r0)
            float r2 = r2 * r0
            r10 = 0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            r0 = 1064514355(0x3f733333, float:0.95)
            float r2 = r2 * r0
        L_0x003d:
            java.lang.Object r3 = r3.A01
            X.GBj r3 = (X.C52012GBj) r3
            androidx.viewpager2.widget.ViewPager2 r0 = r3.A00
            if (r0 == 0) goto L_0x0096
            X.GD1 r4 = r0.A06
            X.Tp4 r6 = r4.A06
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x0096
            int r0 = r6.A02
            r5 = 1
            if (r0 == r5) goto L_0x0096
            r4.A01 = r9
            r4.A00 = r10
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.A03 = r0
            android.view.VelocityTracker r0 = r4.A04
            if (r0 != 0) goto L_0x00e0
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.A04 = r0
            androidx.viewpager2.widget.ViewPager2 r0 = r4.A07
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledMaximumFlingVelocity()
            r4.A02 = r0
        L_0x0076:
            r0 = 4
            r6.A00 = r0
            X.C14056Tp4.A03(r6, r5)
            int r0 = r6.A02
            if (r0 == 0) goto L_0x0085
            androidx.recyclerview.widget.RecyclerView r0 = r4.A05
            r0.A0l()
        L_0x0085:
            long r5 = r4.A03
            r7 = r5
            r11 = r10
            r12 = r9
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
            android.view.VelocityTracker r0 = r4.A04
            r0.addMovement(r1)
            r1.recycle()
        L_0x0096:
            androidx.viewpager2.widget.ViewPager2 r0 = r3.A00
            if (r0 == 0) goto L_0x001e
            X.GD1 r3 = r0.A06
            X.Tp4 r0 = r3.A06
            boolean r0 = r0.A07
            r5 = 0
            if (r0 == 0) goto L_0x001e
            float r4 = r3.A00
            float r4 = r4 - r2
            r3.A00 = r4
            int r1 = r3.A01
            float r0 = (float) r1
            float r0 = r4 - r0
            int r2 = java.lang.Math.round(r0)
            int r1 = r1 + r2
            r3.A01 = r1
            long r12 = android.os.SystemClock.uptimeMillis()
            androidx.viewpager2.widget.ViewPager2 r0 = r3.A07
            int r0 = r0.getOrientation()
            r1 = r2
            r15 = r4
            r16 = 0
            if (r0 == 0) goto L_0x00c9
            r1 = 0
            r5 = r2
            r15 = 0
            r16 = r4
        L_0x00c9:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A05
            r0.scrollBy(r1, r5)
            r14 = 2
            long r10 = r3.A03
            r17 = r9
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r10, r12, r14, r15, r16, r17)
            android.view.VelocityTracker r0 = r3.A04
            r0.addMovement(r1)
            r1.recycle()
            return
        L_0x00e0:
            r0.clear()
            goto L_0x0076
        L_0x00e4:
            java.lang.Object r1 = X.C51971G9r.A0o(r4)
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
            java.lang.Object r0 = r3.A02
            X.2V5 r0 = (X.2V5) r0
            r0.A00(r1)
            java.lang.Object r0 = r3.A01
            X.2V5 r0 = (X.2V5) r0
            r0.A00(r1)
            return
        L_0x00fd:
            java.lang.Object r1 = X.C51971G9r.A0o(r4)
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x011f
            java.lang.Number r1 = (java.lang.Number) r1
        L_0x0107:
            r2 = 1117126656(0x42960000, float:75.0)
            if (r1 == 0) goto L_0x011c
            float r1 = r1.floatValue()
        L_0x010f:
            java.lang.Object r0 = r3.A01
            X.2V5 r0 = (X.2V5) r0
            X.C51967G9n.A19(r0, r1)
            java.lang.Object r3 = r3.A02
            X.2V5 r3 = (X.2V5) r3
            float r1 = r1 - r2
            goto L_0x013f
        L_0x011c:
            r1 = 1117126656(0x42960000, float:75.0)
            goto L_0x010f
        L_0x011f:
            r1 = 0
            goto L_0x0107
        L_0x0121:
            java.lang.Object r1 = X.C51971G9r.A0o(r4)
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0145
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0145
            float r1 = r1.floatValue()
        L_0x0131:
            java.lang.Object r0 = r3.A01
            X.2V5 r0 = (X.2V5) r0
            X.C51967G9n.A19(r0, r1)
            java.lang.Object r3 = r3.A02
            X.2V5 r3 = (X.2V5) r3
            r0 = 1117126656(0x42960000, float:75.0)
            float r1 = r1 - r0
        L_0x013f:
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x001b
        L_0x0145:
            r1 = 0
            goto L_0x0131
        L_0x0147:
            java.lang.Object r5 = r3.A01
            X.2Wa r5 = (X.2Wa) r5
            java.lang.Object r0 = r3.A02
            goto L_0x0154
        L_0x014e:
            java.lang.Object r5 = r3.A02
            X.2Wa r5 = (X.2Wa) r5
            java.lang.Object r0 = r3.A01
        L_0x0154:
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            java.lang.Object r1 = r0.getAnimatedValue()
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0167
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0167
            float r4 = r1.floatValue()
            goto L_0x01d5
        L_0x0167:
            r4 = 0
            goto L_0x01d5
        L_0x0169:
            java.lang.Object r5 = r3.A01
            X.2Wa r5 = (X.2Wa) r5
            java.lang.Object r0 = r3.A02
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            java.lang.Object r1 = r0.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.0qQ.A0C(r1, r0)
            goto L_0x01d9
        L_0x017b:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r2 = r3.A01
            X.2Wa r2 = (X.2Wa) r2
            java.lang.Object r1 = r3.A02
            r0 = 22
            X.J6R r0 = X.J6R.A00(r1, r4, r0)
            r2.A03(r0)
            return
        L_0x018f:
            java.lang.Object r1 = X.C51971G9r.A0o(r4)
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x01b1
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x01b1
            float r2 = r1.floatValue()
        L_0x019f:
            java.lang.Object r1 = r3.A01
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.A01(r0)
            java.lang.Object r5 = r3.A02
            X.2Wa r5 = (X.2Wa) r5
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01d4
        L_0x01b1:
            r2 = 0
            goto L_0x019f
        L_0x01b3:
            java.lang.Object r1 = X.C51971G9r.A0o(r4)
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x01e0
            java.lang.Number r1 = (java.lang.Number) r1
        L_0x01bd:
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x01dd
            float r2 = r1.floatValue()
        L_0x01c5:
            java.lang.Object r1 = r3.A01
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.A01(r0)
            java.lang.Object r5 = r3.A02
            X.2Wa r5 = (X.2Wa) r5
        L_0x01d4:
            float r4 = r4 - r2
        L_0x01d5:
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
        L_0x01d9:
            r5.A01(r1)
            return
        L_0x01dd:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01c5
        L_0x01e0:
            r1 = 0
            goto L_0x01bd
        L_0x01e2:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r2 = r3.A01
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            java.lang.Object r1 = r4.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.DbW.A04(r1, r0)
            r2.topMargin = r0
            java.lang.Object r0 = r3.A02
            X.NIn r0 = (X.C68449NIn) r0
            com.instagram.common.ui.base.IgEditText r0 = r0.A0I
            if (r0 != 0) goto L_0x0208
            java.lang.String r0 = "promptEditText"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0208:
            r0.setLayoutParams(r2)
            return
        L_0x020c:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.6Tm r2 = X.DbY.A0Q(r4)
            java.lang.Object r1 = r3.A02
            X.4uI r1 = (X.C277014uI) r1
            java.lang.Object r0 = r3.A01
            X.6Rx r0 = (X.C307896Rx) r0
            X.C299275ur.A00(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I83.onAnimationUpdate(android.animation.ValueAnimator):void");
    }

    public I83(ValueAnimator valueAnimator, 2Wa r2, int i) {
        this.A00 = i;
        switch (i) {
            case 14:
            case 16:
            case 17:
                this.A01 = r2;
                this.A02 = valueAnimator;
                break;
            default:
                this.A02 = r2;
                this.A01 = valueAnimator;
                break;
        }
    }

    public I83(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
