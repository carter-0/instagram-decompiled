package X;

import android.content.Context;

/* renamed from: X.8jr  reason: invalid class name and case insensitive filesystem */
public final class C363518jr {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public float A04;
    public final float A05;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.MotionEvent r11, android.view.View r12) {
        /*
            r10 = this;
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x004d
            android.view.ViewParent r7 = r12.getParent()
            r7.getClass()
            int r0 = r11.getAction()
            if (r0 == 0) goto L_0x005f
            r8 = 2
            if (r0 != r8) goto L_0x004d
            float r9 = r11.getRawY()
            float r0 = r10.A04
            float r9 = r9 - r0
            float r1 = java.lang.Math.abs(r9)
            float r0 = r10.A05
            r6 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            r5 = 1
            r0 = -1
            boolean r4 = r12.canScrollVertically(r0)
            boolean r3 = r12.canScrollVertically(r5)
            boolean r2 = r10.A01
            r1 = 3
            int r0 = r10.A00
            if (r2 == 0) goto L_0x004e
            if (r0 == r5) goto L_0x005c
            if (r0 == r8) goto L_0x0059
            if (r0 != r1) goto L_0x004d
            r1 = 0
            if (r4 != 0) goto L_0x0044
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004a
        L_0x0044:
            if (r3 != 0) goto L_0x004d
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004d
        L_0x004a:
            r7.requestDisallowInterceptTouchEvent(r6)
        L_0x004d:
            return
        L_0x004e:
            if (r0 == r5) goto L_0x005c
            if (r0 == r8) goto L_0x0059
            if (r0 != r1) goto L_0x004d
            if (r4 == 0) goto L_0x004a
            if (r3 != 0) goto L_0x004d
            goto L_0x004a
        L_0x0059:
            if (r3 == 0) goto L_0x004a
            return
        L_0x005c:
            if (r4 == 0) goto L_0x004a
            return
        L_0x005f:
            r11.getRawX()
            float r0 = r11.getRawY()
            r10.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363518jr.A00(android.view.MotionEvent, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r0 != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.view.MotionEvent r6, android.view.View r7, boolean r8) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0040
            android.view.ViewParent r4 = r7.getParent()
            r4.getClass()
            int r0 = r6.getActionMasked()
            if (r0 != 0) goto L_0x0040
            r6.getRawX()
            float r0 = r6.getRawY()
            r5.A04 = r0
            r3 = 1
            r2 = -1
            if (r8 == 0) goto L_0x0041
            android.content.Context r0 = r7.getContext()
            boolean r0 = X.0mk.A02(r0)
            if (r0 != 0) goto L_0x0028
            r3 = -1
            r2 = 1
        L_0x0028:
            boolean r1 = r7.canScrollHorizontally(r3)
            boolean r0 = r7.canScrollHorizontally(r2)
        L_0x0030:
            r2 = 1
            if (r1 != 0) goto L_0x0036
            r1 = 0
            if (r0 == 0) goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0040
            if (r1 == 0) goto L_0x0040
            r4.requestDisallowInterceptTouchEvent(r2)
        L_0x0040:
            return
        L_0x0041:
            boolean r1 = r7.canScrollVertically(r2)
            boolean r0 = r7.canScrollVertically(r3)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363518jr.A01(android.view.MotionEvent, android.view.View, boolean):void");
    }

    public C363518jr(Context context) {
        this.A05 = 0nA.A04(context, 20);
    }
}
