package X;

import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.concurrent.Callable;

/* renamed from: X.5Mj  reason: invalid class name and case insensitive filesystem */
public final class C284405Mj implements Callable {
    public final /* synthetic */ TouchInterceptorFrameLayout A00;
    public final /* synthetic */ AnonymousClass5Gv A01;

    public C284405Mj(TouchInterceptorFrameLayout touchInterceptorFrameLayout, AnonymousClass5Gv r2) {
        this.A01 = r2;
        this.A00 = touchInterceptorFrameLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0155, code lost:
        if (((r12 + r5.A00) + X.AnonymousClass5Gv.A00(r5)) <= r13.bottom) goto L_0x0157;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r14 = this;
            X.5Gv r5 = r14.A01
            java.lang.Integer r0 = r5.A09
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            r3 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            if (r0 != r10) goto L_0x018d
            X.5Gr r2 = r5.A0J
            android.graphics.Rect r11 = r5.A02
            boolean r1 = r5.A0Q
            boolean r0 = r5.A0P
            boolean r0 = r2.CFc(r11, r1, r0)
            if (r0 == 0) goto L_0x018d
            android.graphics.Rect r13 = r5.A03
            android.view.ViewGroup r0 = r5.A0H
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            r13.set(r3, r3, r1, r0)
            X.2fy r1 = r5.A0M
            boolean r0 = X.AnonymousClass5Gv.A05(r5, r1)
            if (r0 != 0) goto L_0x004e
            int r1 = r1.ordinal()
            if (r1 == r3) goto L_0x0185
            r0 = 1
            if (r1 == r0) goto L_0x0163
            r0 = 2
            if (r1 == r0) goto L_0x015f
            r0 = 3
            if (r1 == r0) goto L_0x015b
            r0 = 4
            if (r1 != r0) goto L_0x017d
            X.2fy r1 = X.C226262fy.LEFT_ANCHOR
        L_0x0046:
            boolean r0 = X.AnonymousClass5Gv.A05(r5, r1)
            if (r0 != 0) goto L_0x004e
            X.2fy r1 = X.C226262fy.CENTER_OF_ANCHOR
        L_0x004e:
            int r12 = X.AnonymousClass5Gv.A02(r5, r1)
            int r8 = X.AnonymousClass5Gv.A01(r5, r1)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r7 = r5.A04
            if (r7 == 0) goto L_0x0175
            float r0 = (float) r8
            r7.setX(r0)
            float r0 = (float) r12
            r7.setY(r0)
            int r1 = r1.ordinal()
            r9 = 3
            r4 = 1
            r6 = 2
            if (r1 == r3) goto L_0x014b
            if (r1 == r4) goto L_0x0076
            if (r1 == r6) goto L_0x0157
            if (r1 == r9) goto L_0x0147
            r0 = 4
            if (r1 != r0) goto L_0x016d
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
        L_0x0076:
            int r11 = r11.centerX()
            int r11 = r11 - r8
            float r0 = (float) r11
            r8 = 0
            float r0 = r0 + r8
            r7.setPivotX(r0)
            X.5Gw r1 = r5.A0K
            r1.A00 = r11
            android.graphics.Rect r0 = r1.getBounds()
            X.0qQ.A07(r0)
            X.C283265Gw.A00(r0, r1)
            r1.A01 = r10
            android.graphics.Rect r0 = r1.getBounds()
            X.0qQ.A07(r0)
            X.C283265Gw.A00(r0, r1)
            int r0 = r10.intValue()
            if (r0 == r3) goto L_0x013b
            if (r0 == r6) goto L_0x012f
            if (r0 == r9) goto L_0x012f
            if (r0 != r4) goto L_0x0167
            int r6 = r5.A0F
            int r0 = X.AnonymousClass5Gv.A00(r5)
            int r0 = r0 + r6
            int r1 = r5.A00
            int r0 = r0 + r1
            float r0 = (float) r0
            float r0 = r0 + r8
            r7.setPivotY(r0)
            X.0nA.A0c(r7, r6)
        L_0x00b9:
            X.0nA.A0X(r7, r1)
        L_0x00bc:
            android.graphics.Rect r1 = r5.A01
            r2.Ahb(r1)
            int r0 = r1.centerX()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A07 = r0
            int r0 = r1.centerY()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A08 = r0
            android.view.View r2 = r2.Acv()
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r1.addOnPreDrawListener(r5)
            X.0qi r0 = X.C62000qj.A02
            X.0sa r0 = r0.A0L
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L_0x0126
            boolean r0 = r1.isAlive()
            if (r0 != 0) goto L_0x0100
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
        L_0x0100:
            r1.removeOnPreDrawListener(r5)
        L_0x0103:
            X.2cs r2 = r5.A0I
            X.2ct r0 = r2.A09
            double r0 = r0.A00
            r2.A05(r0)
            r2.A06 = r3
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A06(r0)
            boolean r0 = r5.A0O
            if (r0 == 0) goto L_0x0121
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r3 = r14.A00
            java.lang.Runnable r2 = r5.A0A
            int r0 = r5.A0E
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
        L_0x0121:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L_0x0126:
            X.8y5 r0 = new X.8y5
            r0.<init>(r2, r2, r1, r5)
            r2.addOnAttachStateChangeListener(r0)
            goto L_0x0103
        L_0x012f:
            r7.setPivotY(r8)
            int r0 = r5.A0F
            X.0nA.A0Y(r7, r0)
            X.0nA.A0a(r7, r0)
            goto L_0x00bc
        L_0x013b:
            r7.setPivotY(r8)
            int r0 = r5.A00
            X.0nA.A0c(r7, r0)
            int r1 = r5.A0F
            goto L_0x00b9
        L_0x0147:
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            goto L_0x0076
        L_0x014b:
            int r0 = r5.A00
            int r12 = r12 + r0
            int r0 = X.AnonymousClass5Gv.A00(r5)
            int r12 = r12 + r0
            int r0 = r13.bottom
            if (r12 > r0) goto L_0x0076
        L_0x0157:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            goto L_0x0076
        L_0x015b:
            X.2fy r1 = X.C226262fy.RIGHT_ANCHOR
            goto L_0x0046
        L_0x015f:
            X.2fy r1 = X.C226262fy.ABOVE_ANCHOR
            goto L_0x0046
        L_0x0163:
            X.2fy r1 = X.C226262fy.BELOW_ANCHOR
            goto L_0x0046
        L_0x0167:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x016d:
            java.lang.String r0 = "Unknown position value"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L_0x0175:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x017d:
            java.lang.String r0 = "Unknown position value"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L_0x0185:
            java.lang.String r0 = "CENTER_OF_ANCHOR should always be accepted"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x018d:
            r5.A08(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284405Mj.call():java.lang.Object");
    }
}
