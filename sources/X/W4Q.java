package X;

import android.animation.ValueAnimator;

public final class W4Q implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public W4Q(W1m w1m, int i) {
        this.A00 = i;
        this.A01 = w1m;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new W4Q(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016f, code lost:
        ((X.AnonymousClass528) r2).A00(X.C51970G9q.A04(r4.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0202, code lost:
        r7.invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0205, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0236, code lost:
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0238, code lost:
        r0.setAlpha(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r17) {
        /*
            r16 = this;
            r5 = r16
            int r0 = r5.A00
            r4 = r17
            switch(r0) {
                case 0: goto L_0x02c7;
                case 1: goto L_0x02bf;
                case 2: goto L_0x02af;
                case 3: goto L_0x025f;
                case 4: goto L_0x0251;
                case 5: goto L_0x023c;
                case 6: goto L_0x022e;
                case 7: goto L_0x021d;
                case 8: goto L_0x0214;
                case 9: goto L_0x0206;
                case 10: goto L_0x00cc;
                case 11: goto L_0x01a2;
                case 12: goto L_0x0192;
                case 13: goto L_0x01fe;
                case 14: goto L_0x017f;
                case 15: goto L_0x0165;
                case 16: goto L_0x015a;
                case 17: goto L_0x0137;
                case 18: goto L_0x026f;
                default: goto L_0x0009;
            }
        L_0x0009:
            float r8 = X.AnonymousClass7TH.A00(r4)
            java.lang.Object r7 = r5.A01
            X.U3I r7 = (X.U3I) r7
            java.util.List r0 = X.U3I.A0G
            java.util.List r5 = r7.A03
            r13 = 1053609164(0x3ecccccc, float:0.39999998)
            java.util.Iterator r12 = r5.iterator()
            r9 = 0
            r4 = 0
        L_0x001e:
            boolean r0 = r12.hasNext()
            r14 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r12.next()
            int r6 = r4 + 1
            if (r4 < 0) goto L_0x00c4
            java.lang.Number r0 = (java.lang.Number) r0
            r0.floatValue()
            double r2 = (double) r8
            double r0 = (double) r4
            double r0 = r0 * r14
            r10 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r0 = r0 / r10
            double r2 = r2 - r0
            double r2 = java.lang.Math.sin(r2)
            float r1 = (float) r2
            float r1 = r1 * r13
            r0 = 1058642330(0x3f19999a, float:0.6)
            float r1 = r1 + r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            r1 = 1058642330(0x3f19999a, float:0.6)
        L_0x004e:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r5.set(r4, r0)
            r4 = r6
            goto L_0x001e
        L_0x0057:
            java.util.List r5 = r7.A04
            java.util.Iterator r13 = r5.iterator()
            r4 = 0
        L_0x005e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r13.next()
            int r12 = r4 + 1
            if (r4 < 0) goto L_0x00c4
            java.lang.Number r0 = (java.lang.Number) r0
            r0.floatValue()
            r6 = 1022739087(0x3cf5c28f, float:0.03)
            double r2 = (double) r8
            double r0 = (double) r4
            double r0 = r0 * r14
            r10 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r0 = r0 / r10
            double r2 = r2 - r0
            double r2 = java.lang.Math.sin(r2)
            float r1 = (float) r2
            float r1 = r1 * r6
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
            r1 = 0
        L_0x0087:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r5.set(r4, r0)
            r4 = r12
            goto L_0x005e
        L_0x0090:
            java.util.List r6 = r7.A02
            java.util.Iterator r11 = r6.iterator()
        L_0x0096:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0202
            java.lang.Object r0 = r11.next()
            int r10 = r9 + 1
            if (r9 < 0) goto L_0x00c4
            java.lang.Number r0 = (java.lang.Number) r0
            r0.floatValue()
            double r4 = (double) r8
            double r2 = (double) r9
            double r2 = r2 * r14
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r2 = r2 / r0
            double r4 = r4 - r2
            double r2 = java.lang.Math.sin(r4)
            float r1 = (float) r2
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bb
            r1 = 0
        L_0x00bb:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r6.set(r9, r0)
            r9 = r10
            goto L_0x0096
        L_0x00c4:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00cc:
            java.lang.Object r0 = r4.getAnimatedValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r10 = r5.A01
            X.VaI r10 = (X.C17564VaI) r10
            long r3 = (long) r0
            java.util.ArrayList r9 = r10.A03
            monitor-enter(r9)
            r8 = 0
        L_0x00dd:
            int r0 = r9.size()     // Catch:{ all -> 0x0134 }
            if (r8 >= r0) goto L_0x012a
            java.lang.Object r7 = r9.get(r8)     // Catch:{ all -> 0x0134 }
            X.Vct r7 = (X.C17724Vct) r7     // Catch:{ all -> 0x0134 }
            r5 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0127
            int r0 = r7.A0A     // Catch:{ all -> 0x0134 }
            float r1 = (float) r0     // Catch:{ all -> 0x0134 }
            float r0 = r7.A06     // Catch:{ all -> 0x0134 }
            float r2 = (float) r3     // Catch:{ all -> 0x0134 }
            float r0 = r0 * r2
            float r1 = r1 + r0
            float r0 = r7.A00     // Catch:{ all -> 0x0134 }
            float r0 = r0 * r2
            float r0 = r0 * r2
            float r1 = r1 + r0
            r7.A02 = r1     // Catch:{ all -> 0x0134 }
            int r0 = r7.A0B     // Catch:{ all -> 0x0134 }
            float r1 = (float) r0     // Catch:{ all -> 0x0134 }
            float r0 = r7.A07     // Catch:{ all -> 0x0134 }
            float r0 = r0 * r2
            float r1 = r1 + r0
            float r0 = r7.A01     // Catch:{ all -> 0x0134 }
            float r0 = r0 * r2
            float r0 = r0 * r2
            float r1 = r1 + r0
            r7.A03 = r1     // Catch:{ all -> 0x0134 }
            int r11 = r7.A09     // Catch:{ all -> 0x0134 }
            if (r11 <= 0) goto L_0x0127
            long r0 = (long) r11     // Catch:{ all -> 0x0134 }
            long r12 = r5 - r0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x011a
            r0 = 255(0xff, float:3.57E-43)
            goto L_0x0125
        L_0x011a:
            r2 = 1132396544(0x437f0000, float:255.0)
            long r5 = r5 - r3
            float r1 = (float) r5     // Catch:{ all -> 0x0134 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            float r0 = (float) r11     // Catch:{ all -> 0x0134 }
            float r1 = r1 / r0
            float r1 = r1 * r2
            int r0 = (int) r1     // Catch:{ all -> 0x0134 }
        L_0x0125:
            r7.A08 = r0     // Catch:{ all -> 0x0134 }
        L_0x0127:
            int r8 = r8 + 1
            goto L_0x00dd
        L_0x012a:
            monitor-exit(r9)     // Catch:{ all -> 0x0134 }
            X.U37 r0 = r10.A01
            r0.getClass()
            r0.postInvalidate()
            return
        L_0x0134:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0134 }
            throw r0
        L_0x0137:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r5.A01
            X.VuI r0 = (X.C18566VuI) r0
            android.view.View r2 = r0.A04
            java.lang.Object r0 = r4.getAnimatedValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r0, r1)
            r2.setScaleX(r0)
            java.lang.Object r0 = r4.getAnimatedValue()
            float r0 = X.C51970G9q.A04(r0, r1)
            r2.setScaleY(r0)
            return
        L_0x015a:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r5.A01
            X.Uo1 r0 = (X.C16074Uo1) r0
            X.529 r2 = r0.A03
            goto L_0x016f
        L_0x0165:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r5.A01
            X.Uo2 r0 = (X.C16075Uo2) r0
            X.529 r2 = r0.A04
        L_0x016f:
            java.lang.Object r1 = r4.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r1, r0)
            X.528 r2 = (X.AnonymousClass528) r2
            r2.A00(r0)
            return
        L_0x017f:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r7 = r5.A01
            com.instagram.direct.ui.countertextview.CounterTextView r7 = (com.instagram.direct.ui.countertextview.CounterTextView) r7
            float r0 = r4.getAnimatedFraction()
            com.instagram.direct.ui.countertextview.CounterTextView.A05(r7, r0)
            com.instagram.direct.ui.countertextview.CounterTextView.A02(r7)
            goto L_0x0202
        L_0x0192:
            float r1 = X.AnonymousClass7TH.A00(r4)
            java.lang.Object r0 = r5.A01
            X.UB3 r0 = (X.UB3) r0
            X.0eM r0 = r0.A0B
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            goto L_0x0238
        L_0x01a2:
            float r4 = X.AnonymousClass7TH.A00(r4)
            java.lang.Object r3 = r5.A01
            X.UB3 r3 = (X.UB3) r3
            int r5 = r3.A05
            int r0 = -r5
            float r6 = (float) r0
            float r6 = r6 * r4
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r0
            X.0eM r0 = r3.A09
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            int r0 = r3.A04
            int r0 = -r0
            float r2 = (float) r0
            float r2 = r2 * r4
            float r2 = r2 + r6
            r1.setTranslationY(r2)
            X.0eM r1 = r3.A0A
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            r0.setTranslationY(r2)
            X.0eM r0 = r3.A0D
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            r0.setTranslationY(r6)
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            r0.setAlpha(r4)
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x01fb
            X.0eM r0 = r3.A0B
        L_0x01e0:
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            float r0 = (float) r5
            float r4 = r4 * r0
            int r0 = r3.A03
            float r0 = (float) r0
            float r4 = r4 + r0
            int r0 = (int) r4
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.height = r0
            X.0eM r0 = r3.A0C
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            r0.setLayoutParams(r1)
            return
        L_0x01fb:
            X.0eM r0 = r3.A0C
            goto L_0x01e0
        L_0x01fe:
            java.lang.Object r7 = r5.A01
            android.view.View r7 = (android.view.View) r7
        L_0x0202:
            r7.invalidate()
            return
        L_0x0206:
            java.lang.Object r0 = r5.A01
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            X.TqO r1 = r0.A1G
            float r0 = X.C13989Tnp.A02(r4)
            r1.A07(r0)
            return
        L_0x0214:
            float r1 = X.C13989Tnp.A02(r4)
            java.lang.Object r0 = r5.A01
            X.VV7 r0 = (X.VV7) r0
            goto L_0x0236
        L_0x021d:
            float r1 = X.C13989Tnp.A02(r4)
            java.lang.Object r0 = r5.A01
            X.VV7 r0 = (X.VV7) r0
            com.google.android.material.internal.CheckableImageButton r0 = r0.A01
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x022e:
            float r1 = X.C13989Tnp.A02(r4)
            java.lang.Object r0 = r5.A01
            X.VV7 r0 = (X.VV7) r0
        L_0x0236:
            com.google.android.material.internal.CheckableImageButton r0 = r0.A01
        L_0x0238:
            r0.setAlpha(r1)
            return
        L_0x023c:
            java.lang.Object r0 = r4.getAnimatedValue()
            int r2 = X.AnonymousClass7TE.A0M(r0)
            android.os.Handler r0 = X.W1m.A0D
            java.lang.Object r0 = r5.A01
            X.W1m r0 = (X.W1m) r0
            X.U4W r1 = r0.A09
            float r0 = (float) r2
            r1.setTranslationY(r0)
            return
        L_0x0251:
            java.lang.Object r0 = r5.A01
            X.W1m r0 = (X.W1m) r0
            X.U4W r1 = r0.A09
            float r0 = X.C13989Tnp.A02(r4)
            r1.setAlpha(r0)
            return
        L_0x025f:
            float r1 = X.C13989Tnp.A02(r4)
            java.lang.Object r0 = r5.A01
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            X.5sV r0 = r0.A0K
            if (r0 == 0) goto L_0x02ab
            r0.A0B(r1)
            return
        L_0x026f:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r1 = r5.A01
            X.Vsj r1 = (X.C18488Vsj) r1
            android.view.View r5 = r1.A02
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            r0 = 6
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r3, r0)
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            r0 = 0
            r3.weight = r0
            java.lang.String r0 = "width"
            java.lang.Object r0 = r4.getAnimatedValue(r0)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.DbW.A04(r0, r2)
            r3.width = r0
            boolean r1 = r1.A04
            java.lang.String r0 = "margin"
            java.lang.Object r0 = r4.getAnimatedValue(r0)
            int r0 = X.DbW.A04(r0, r2)
            if (r1 == 0) goto L_0x02ac
            r3.leftMargin = r0
        L_0x02a8:
            r5.setLayoutParams(r3)
        L_0x02ab:
            return
        L_0x02ac:
            r3.rightMargin = r0
            goto L_0x02a8
        L_0x02af:
            java.lang.Object r1 = r5.A01
            com.google.android.material.appbar.CollapsingToolbarLayout r1 = (com.google.android.material.appbar.CollapsingToolbarLayout) r1
            java.lang.Object r0 = r4.getAnimatedValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r1.setScrimAlpha(r0)
            return
        L_0x02bf:
            java.lang.Object r0 = r5.A01
            android.view.View r0 = (android.view.View) r0
            r0.postInvalidateOnAnimation()
            return
        L_0x02c7:
            float r3 = r4.getAnimatedFraction()
            long r1 = r4.getDuration()
            float r0 = (float) r1
            float r3 = r3 * r0
            long r2 = (long) r3
            java.lang.Object r6 = r5.A01
            X.U15 r6 = (X.U15) r6
            X.VL3[] r10 = r6.A07
            int r0 = r10.length
            int r9 = r0 + -1
            r7 = 3000(0xbb8, double:1.482E-320)
            long r4 = r2 / r7
            int r0 = (int) r4
            int r0 = java.lang.Math.min(r0, r9)
            r4 = 0
            int r1 = java.lang.Math.max(r0, r4)
            if (r1 == r9) goto L_0x02ed
            int r4 = r1 + 1
        L_0x02ed:
            r0 = r10[r1]
            r6.A01 = r0
            r0 = r10[r4]
            r6.A02 = r0
            long r0 = (long) r1
            long r0 = r0 * r7
            long r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1161527296(0x453b8000, float:3000.0)
            float r1 = r1 / r0
            r6.A00 = r1
            r6.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W4Q.onAnimationUpdate(android.animation.ValueAnimator):void");
    }

    public W4Q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
