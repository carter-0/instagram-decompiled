package X;

import android.view.View;

public final class AP3 implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public AP3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r0.onTouchEvent(r9) == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r0.onTouchEvent(r9) == false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0012;
                case 2: goto L_0x0010;
                case 3: goto L_0x0119;
                case 4: goto L_0x00bb;
                case 5: goto L_0x00ae;
                case 6: goto L_0x006d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r7.A01
            X.9Yq r1 = (X.C380559Yq) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.U10 r0 = r1.A00
            r0.A00(r9)
        L_0x0010:
            r4 = 0
        L_0x0011:
            return r4
        L_0x0012:
            int r1 = r9.getAction()
            r0 = 1
            if (r1 != r0) goto L_0x0010
            java.lang.Object r0 = r7.A01
            X.AZW r0 = (X.AZW) r0
            X.87D r0 = r0.A00
            X.87A r0 = r0.A0C
            X.86y r2 = r0.A00
            boolean r0 = r2.A0A()
            if (r0 == 0) goto L_0x0010
            X.87B r0 = r2.A0F
            r0.A00()
            X.AA8 r1 = X.C3509386y.A00(r2)
            X.80U r0 = r2.A0K
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r0 = r0.A01
            r1.A0C(r0)
            goto L_0x0010
        L_0x003c:
            java.lang.Object r3 = r7.A01
            X.9Zh r3 = (X.C380729Zh) r3
            android.view.View$OnTouchListener r0 = r3.A02
            r4 = 1
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.onTouch(r8, r9)
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            android.view.GestureDetector r0 = r3.A00
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.onTouchEvent(r9)
            r2 = 1
            if (r0 != 0) goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            android.view.ScaleGestureDetector r0 = r3.A01
            if (r0 == 0) goto L_0x0063
            boolean r0 = r0.onTouchEvent(r9)
            r1 = 1
            if (r0 != 0) goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0010
            if (r2 != 0) goto L_0x0011
            if (r1 == 0) goto L_0x0010
            return r4
        L_0x006d:
            java.lang.Object r6 = r7.A01
            X.9i2 r6 = (X.C384879i2) r6
            float r5 = r9.getX()
            android.view.View r0 = r6.A06
            java.lang.String r4 = "paddleView"
            if (r0 == 0) goto L_0x00a6
            float r3 = X.AnonymousClass7TE.A02(r0)
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r2
            float r1 = X.AnonymousClass7TE.A02(r8)
            android.view.View r0 = r6.A06
            if (r0 == 0) goto L_0x00a6
            float r0 = X.AnonymousClass7TE.A02(r0)
            float r0 = r0 / r2
            float r1 = r1 - r0
            float r2 = X.C229632nm.A02(r5, r3, r1)
            r6.A03 = r2
            android.view.View r1 = r6.A06
            if (r1 == 0) goto L_0x00a6
            int r0 = r1.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r2 = r2 - r0
            r1.setX(r2)
            goto L_0x010d
        L_0x00a6:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ae:
            r0 = 1
            X.0qQ.A0B(r9, r0)
            java.lang.Object r0 = r7.A01
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            boolean r4 = r0.onTouchEvent(r9)
            return r4
        L_0x00bb:
            java.lang.Object r4 = r7.A01
            X.ALg r4 = (X.C39964ALg) r4
            com.instagram.user.model.User r0 = r4.A09
            if (r0 != 0) goto L_0x0100
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r4.A08
            if (r0 == 0) goto L_0x0114
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r0)
            boolean r0 = X.0mp.A0B(r2)
            if (r0 != 0) goto L_0x0100
            X.7fy r0 = r4.A0O
            java.lang.Object r1 = r0.Bo1()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0100
            r0 = 1
            java.lang.String r3 = r2.substring(r0)
            X.0qQ.A07(r3)
            java.util.Iterator r2 = r1.iterator()
        L_0x00e7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r1 = r2.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r0 = r1.getUsername()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00e7
            X.C39964ALg.A01(r4, r1)
        L_0x0100:
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x010f
            r1 = 0
            r0.setOnTouchListener(r1)
            android.view.View r0 = r4.A0F
            r0.setOnTouchListener(r1)
        L_0x010d:
            r4 = 1
            return r4
        L_0x010f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0114:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0119:
            boolean r4 = r8.onTouchEvent(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AP3.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
