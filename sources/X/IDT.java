package X;

import android.view.View;

public final class IDT implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IDT(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r7 > (((float) r1) + r5)) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A02
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            boolean r2 = r0.onTouchEvent(r11)
            int r1 = r11.getActionMasked()
            r0 = 1
            if (r1 == r0) goto L_0x0018
            r0 = 3
            if (r1 == r0) goto L_0x0018
            return r2
        L_0x0018:
            java.lang.Object r0 = r9.A01
            X.6Zf r0 = (X.C309686Zf) r0
            r0.DvB(r2)
            return r2
        L_0x0020:
            X.AnonymousClass7TG.A1N(r10, r11)
            float r8 = r11.getX()
            float r7 = r11.getY()
            r0 = 2131443398(0x7f0b3ec6, float:1.8508863E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r10, r0)
            float r6 = r0.getX()
            float r5 = r0.getY()
            int r4 = r0.getMeasuredWidth()
            int r1 = r0.getMeasuredHeight()
            java.lang.Object r3 = r9.A01
            X.0r1 r3 = (X.0r1) r3
            r2 = 1
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x005c
            float r0 = (float) r4
            float r6 = r6 + r0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x005c
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x005c
            float r0 = (float) r1
            float r0 = r0 + r5
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x005d
        L_0x005c:
            r0 = 1
        L_0x005d:
            r3.A00 = r0
            java.lang.Object r1 = r9.A02
            X.0r1 r1 = (X.0r1) r1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0068
            r2 = 0
        L_0x0068:
            r1.A00 = r2
            r2 = 0
            return r2
        L_0x006c:
            int r2 = r11.getActionMasked()
            r0 = 1
            if (r2 == 0) goto L_0x0092
            r1 = 8
            if (r2 == r0) goto L_0x0085
            r0 = 3
            if (r2 != r0) goto L_0x0083
            java.lang.Object r0 = r9.A01
            X.IO5 r0 = (X.IO5) r0
            android.view.View r0 = r0.A03
            r0.setVisibility(r1)
        L_0x0083:
            r2 = 1
            return r2
        L_0x0085:
            java.lang.Object r0 = r9.A01
            X.IO5 r0 = (X.IO5) r0
            android.view.View r0 = r0.A03
            r0.setVisibility(r1)
            r10.performClick()
            goto L_0x0083
        L_0x0092:
            java.lang.Object r3 = r9.A01
            X.IO5 r3 = (X.IO5) r3
            android.view.View r2 = r3.A03
            r0 = 0
            r2.setVisibility(r0)
            java.lang.Object r0 = r9.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            boolean r1 = r0.A29
            X.HoT r0 = r3.A06
            if (r1 == 0) goto L_0x00ac
            int r0 = r0.A03
        L_0x00a8:
            r2.setBackgroundColor(r0)
            goto L_0x0083
        L_0x00ac:
            int r0 = r0.A04
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDT.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
