package X;

import android.view.View;

public final class W8J implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;

    public W8J(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onViewAttachedToWindow(View view) {
        if (3 - this.A00 == 0) {
            U1A.A04(view, (U1A) this.A01);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r2.removeGlobalOnLayoutListener(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewDetachedFromWindow(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x005c;
                case 1: goto L_0x0043;
                case 2: goto L_0x002f;
                case 3: goto L_0x003b;
                case 4: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r3.A01
            X.KVJ r1 = (X.KVJ) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.os.Handler r1 = r1.A03
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
        L_0x0011:
            return
        L_0x0012:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r4.removeOnAttachStateChangeListener(r3)
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x0011
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            java.lang.Object r0 = r3.A01
            android.view.ViewTreeObserver$OnPreDrawListener r0 = (android.view.ViewTreeObserver.OnPreDrawListener) r0
            r1.removeOnPreDrawListener(r0)
            return
        L_0x002f:
            java.lang.Object r0 = r3.A01
            X.S71 r0 = (X.S71) r0
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x0011
            X.S71.A00(r4)
            return
        L_0x003b:
            java.lang.Object r0 = r3.A01
            X.U1A r0 = (X.U1A) r0
            X.U1A.A03(r4, r0)
            return
        L_0x0043:
            java.lang.Object r1 = r3.A01
            X.U5x r1 = (X.C14735U5x) r1
            android.view.ViewTreeObserver r0 = r1.A04
            if (r0 == 0) goto L_0x0077
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L_0x0057
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r1.A04 = r0
        L_0x0057:
            android.view.ViewTreeObserver r2 = r1.A04
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r1.A0D
            goto L_0x0074
        L_0x005c:
            java.lang.Object r1 = r3.A01
            X.U5w r1 = (X.C14734U5w) r1
            android.view.ViewTreeObserver r0 = r1.A07
            if (r0 == 0) goto L_0x0077
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L_0x0070
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r1.A07 = r0
        L_0x0070:
            android.view.ViewTreeObserver r2 = r1.A07
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r1.A0J
        L_0x0074:
            r2.removeGlobalOnLayoutListener(r0)
        L_0x0077:
            r4.removeOnAttachStateChangeListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W8J.onViewDetachedFromWindow(android.view.View):void");
    }
}
