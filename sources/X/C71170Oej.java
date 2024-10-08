package X;

import android.animation.ValueAnimator;

/* renamed from: X.Oej  reason: case insensitive filesystem */
public final class C71170Oej implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public C71170Oej(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C71170Oej(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.MrW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.NEm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: X.MrW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: X.MrW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: android.graphics.drawable.ShapeDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: android.graphics.drawable.ShapeDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: X.MrV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: X.MrV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v120, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: X.NQn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: X.NQq} */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.NR1, android.view.View, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0101, code lost:
        r0.setAlpha(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0104, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x023e, code lost:
        r4.invalidateSelf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0241, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0267, code lost:
        if (r0 > r4) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0283, code lost:
        if (r14 > r4) goto L_0x0285;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02c5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r19) {
        /*
            r18 = this;
            r2 = r18
            int r0 = r2.A00
            r6 = r19
            switch(r0) {
                case 0: goto L_0x022a;
                case 1: goto L_0x01fd;
                case 2: goto L_0x01f8;
                case 3: goto L_0x01e2;
                case 4: goto L_0x01c6;
                case 5: goto L_0x0190;
                case 6: goto L_0x0160;
                case 7: goto L_0x0105;
                case 8: goto L_0x00f0;
                case 9: goto L_0x00da;
                case 10: goto L_0x00bf;
                case 11: goto L_0x009f;
                case 12: goto L_0x0022;
                case 13: goto L_0x008a;
                case 14: goto L_0x0073;
                case 15: goto L_0x0057;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r6.getAnimatedValue()
            int r3 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r1 = r2.A01
            android.view.View r1 = (android.view.View) r1
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L_0x0021
            X.C66580MXl.A1B(r1, r3)
            r1.requestLayout()
        L_0x0021:
            return
        L_0x0022:
            r9 = 0
            X.0qQ.A0B(r6, r9)
            java.lang.Object r5 = r2.A01
            X.NR1 r5 = (X.NR1) r5
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r1, r0)
            r5.A00 = r0
            r5.invalidate()
            java.util.List r0 = r5.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0021
            float r0 = r5.A00
            double r3 = (double) r0
            r1 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0021
            int r1 = r5.A01
            r0 = 6
            if (r1 >= r0) goto L_0x0242
            int r0 = r1 + 1
            r5.A01 = r0
            return
        L_0x0057:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r2.A01
            X.PMU r0 = (X.PMU) r0
            X.Ocu r2 = r0.A0M
            int r0 = r0.A00
            float r1 = (float) r0
            float r0 = r6.getAnimatedFraction()
            float r1 = r1 * r0
            int r1 = (int) r1
            X.PN7 r0 = new X.PN7
            r0.<init>(r1)
            r2.A05(r0)
            return
        L_0x0073:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            float r3 = r6.getAnimatedFraction()
            java.lang.Object r2 = r2.A01
            X.Mfl r2 = (X.C66952Mfl) r2
            android.view.View r1 = r2.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r3
            r1.setAlpha(r0)
            android.view.View r0 = r2.A03
            goto L_0x0101
        L_0x008a:
            java.lang.Object r0 = r6.getAnimatedValue()
            float r1 = X.AnonymousClass7TE.A04(r0)
            java.lang.Object r4 = r2.A01
            X.NQq r4 = (X.C68637NQq) r4
            int r0 = r4.A0A
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            r4.A00 = r0
            goto L_0x023e
        L_0x009f:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r3 = r2.A01
            X.MqP r3 = (X.C67591MqP) r3
            r2 = 1135869952(0x43b40000, float:360.0)
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r1, r0)
            float r2 = r2 * r0
            r3.A00 = r2
            r3.invalidateSelf()
            X.0sa r0 = r3.A0G
            r0.invoke()
            return
        L_0x00bf:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r2.A01
            X.MqP r2 = (X.C67591MqP) r2
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.DbW.A04(r1, r0)
            r2.A02 = r0
            X.C67591MqP.A02(r2)
            X.C67591MqP.A03(r2)
            return
        L_0x00da:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r4 = r2.A01
            X.NQn r4 = (X.C68634NQn) r4
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r1, r0)
            r4.A00 = r0
            goto L_0x023e
        L_0x00f0:
            float r3 = X.AnonymousClass7TH.A00(r6)
            java.lang.Object r0 = r2.A01
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.C66583MXo.A0w(r0, r3)
            r0.setScaleX(r3)
            r0.setScaleY(r3)
        L_0x0101:
            r0.setAlpha(r3)
            return
        L_0x0105:
            r8 = 0
            X.0qQ.A0B(r6, r8)
            java.lang.Object r4 = r2.A01
            X.MrV r4 = (X.C67642MrV) r4
            java.lang.Object r0 = r6.getAnimatedValue()
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r0, r7)
            r4.A00 = r0
            android.graphics.Paint r5 = r4.A08
            java.lang.Object r0 = r6.getAnimatedValue()
            float r1 = X.C51970G9q.A04(r0, r7)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x012b
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x012b:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            r0 = 1124073472(0x43000000, float:128.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0136
            r1 = 1124073472(0x43000000, float:128.0)
        L_0x0136:
            int r0 = (int) r1
            r5.setAlpha(r0)
            r0 = 2
            float[] r2 = new float[r0]
            float r1 = r4.A01
            r2[r8] = r1
            r0 = 1
            r2[r0] = r1
            java.lang.Object r0 = r6.getAnimatedValue()
            float r0 = X.C51970G9q.A04(r0, r7)
            float r3 = r3 - r0
            float r0 = r4.A01
            float r3 = r3 * r0
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0156
            r3 = 0
        L_0x0156:
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r0.<init>(r2, r3)
            r5.setPathEffect(r0)
            goto L_0x023e
        L_0x0160:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r4 = r2.A01
            X.MrV r4 = (X.C67642MrV) r4
            android.graphics.Paint r5 = r4.A09
            java.lang.Object r0 = r6.getAnimatedValue()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Float"
            float r2 = X.C51970G9q.A04(r0, r3)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x017c
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x017c:
            float r1 = r1 - r2
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r5.setAlpha(r0)
            java.lang.Object r0 = r6.getAnimatedValue()
            float r0 = X.C51970G9q.A04(r0, r3)
            r4.A02 = r0
            goto L_0x023e
        L_0x0190:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r3 = X.C51970G9q.A04(r1, r0)
            java.lang.Object r0 = r2.A01
            X.Oc5 r0 = (X.C71090Oc5) r0
            android.graphics.drawable.ShapeDrawable r4 = r0.A09
            int r0 = r4.getIntrinsicWidth()
            float r2 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            int r0 = r4.getIntrinsicHeight()
            float r0 = (float) r0
            float r0 = r0 / r1
            r5.setRotate(r3, r2, r0)
            android.graphics.Paint r0 = r4.getPaint()
            android.graphics.Shader r0 = r0.getShader()
            r0.setLocalMatrix(r5)
            goto L_0x023e
        L_0x01c6:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r2.A01
            X.Oc5 r0 = (X.C71090Oc5) r0
            android.graphics.drawable.ShapeDrawable r4 = r0.A08
            android.graphics.Paint r2 = r4.getPaint()
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.DbW.A04(r1, r0)
            r2.setColor(r0)
            goto L_0x023e
        L_0x01e2:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r2.A01
            X.Oc5 r2 = (X.C71090Oc5) r2
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r1, r0)
            X.C71090Oc5.A01(r2, r0)
            return
        L_0x01f8:
            java.lang.Object r4 = r2.A01
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            goto L_0x023e
        L_0x01fd:
            float r3 = X.AnonymousClass7TH.A00(r6)
            java.lang.Object r4 = r2.A01
            X.NEm r4 = (X.C68385NEm) r4
            r1 = 1086324736(0x40c00000, float:6.0)
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 * r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.AnonymousClass7TE.A00(r2, r0)
            float r0 = r2 - r0
            float r0 = r0 + r2
            float r0 = java.lang.Math.abs(r0)
            float r0 = r2 - r0
            float r1 = r1 * r0
            r4.A01 = r1
            r1 = 1106247680(0x41f00000, float:30.0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r0
            float r0 = X.AnonymousClass7TE.A00(r2, r3)
            float r2 = r2 - r0
            float r1 = r1 * r2
            r4.A00 = r1
            goto L_0x023e
        L_0x022a:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r4 = r2.A01
            X.MrW r4 = (X.C67643MrW) r4
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.DbW.A04(r1, r0)
            r4.A00 = r0
        L_0x023e:
            r4.invalidateSelf()
            return
        L_0x0242:
            r5.A01 = r9
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r5.getGlobalVisibleRect(r0)
            int r11 = r0.left
            int r10 = r0.top
            int r8 = r5.A06
            int r7 = r8 * 4
            int r6 = r8 / 4
            int r13 = r8 / 8
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A00
            float r1 = r1 - r0
            float r0 = (float) r7
            float r1 = r1 * r0
            int r4 = (int) r1
            int r3 = r5.A07
            int r0 = r8 - r3
            if (r4 > r8) goto L_0x0269
            r17 = 1
            if (r0 <= r4) goto L_0x026b
        L_0x0269:
            r17 = 0
        L_0x026b:
            int r0 = r8 + r3
            if (r4 > r0) goto L_0x0304
            if (r8 > r4) goto L_0x0304
        L_0x0271:
            r16 = 1
        L_0x0273:
            int r12 = r8 * 2
            int r0 = r12 + r3
            if (r4 > r0) goto L_0x02f7
            if (r12 > r4) goto L_0x02f7
        L_0x027b:
            r15 = 1
        L_0x027c:
            int r14 = r8 * 3
            int r0 = r14 + r3
            if (r4 > r0) goto L_0x0285
            r0 = 1
            if (r14 <= r4) goto L_0x0286
        L_0x0285:
            r0 = 0
        L_0x0286:
            if (r4 < 0) goto L_0x02f0
            if (r4 > r8) goto L_0x02f0
        L_0x028a:
            r2 = r6
            r6 = r13
        L_0x028c:
            int r1 = r13 / 2
            if (r0 == 0) goto L_0x02eb
            int r0 = -r3
        L_0x0291:
            int r0 = r0 + r1
            if (r17 == 0) goto L_0x02e7
            int r3 = -r3
        L_0x0295:
            int r1 = r1 + r3
            if (r4 < 0) goto L_0x02b6
            if (r4 > r8) goto L_0x02b6
            int r11 = r11 + r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
        L_0x029f:
            int r10 = r10 - r1
        L_0x02a0:
            X.0eP r0 = X.AnonymousClass7TF.A0x(r0, r10)
        L_0x02a4:
            int r1 = X.C51970G9q.A0B(r0)
            int r0 = X.C51969G9p.A0A(r0)
            if (r1 != 0) goto L_0x0312
            if (r0 != 0) goto L_0x0312
            com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView r0 = r5.A09
            r0.A01()
            return
        L_0x02b6:
            if (r4 > r12) goto L_0x02c3
            if (r8 > r4) goto L_0x02c3
            int r11 = r11 + r8
            int r11 = r11 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            int r4 = r4 - r8
            int r10 = r10 + r4
            goto L_0x02a0
        L_0x02c3:
            if (r4 > r14) goto L_0x02d0
            if (r12 > r4) goto L_0x02d0
            int r11 = r11 + r8
            int r4 = r4 - r12
            int r11 = r11 - r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            int r10 = r10 + r8
            goto L_0x029f
        L_0x02d0:
            if (r14 > r4) goto L_0x02dd
            if (r4 > r7) goto L_0x02dd
            int r11 = r11 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            int r10 = r10 + r8
            int r4 = r4 - r14
            int r10 = r10 - r4
            goto L_0x02a0
        L_0x02dd:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r1)
            goto L_0x02a4
        L_0x02e7:
            if (r15 != 0) goto L_0x0295
            r3 = 0
            goto L_0x0295
        L_0x02eb:
            r0 = 0
            if (r16 == 0) goto L_0x0291
            r0 = r3
            goto L_0x0291
        L_0x02f0:
            if (r4 > r14) goto L_0x02f5
            if (r12 > r4) goto L_0x02f5
            goto L_0x028a
        L_0x02f5:
            r2 = r13
            goto L_0x028c
        L_0x02f7:
            int r1 = r8 * 3
            int r0 = r1 - r3
            if (r4 > r1) goto L_0x0301
            if (r0 > r4) goto L_0x0301
            goto L_0x027b
        L_0x0301:
            r15 = 0
            goto L_0x027c
        L_0x0304:
            int r1 = r8 * 2
            int r0 = r1 - r3
            if (r4 > r1) goto L_0x030e
            if (r0 > r4) goto L_0x030e
            goto L_0x0271
        L_0x030e:
            r16 = 0
            goto L_0x0273
        L_0x0312:
            int r2 = r2 + r1
            int r6 = r6 + r0
            android.graphics.Rect r4 = X.C66580MXl.A0C(r1, r0, r2, r6)
            X.4Cq r3 = r5.A0B
            r2 = 0
            r1 = 30
            X.MGd r0 = new X.MGd
            r0.<init>(r5, r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71170Oej.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
