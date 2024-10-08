package X;

import android.view.View;

public final class WBs implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public WBs(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cd, code lost:
        if (((X.C17729Vcy) r1.get(0)).A0E != null) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            if (r0 == 0) goto L_0x0034
            int r0 = r10.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0032
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r8.A02
            int[] r0 = (int[]) r0
            r9.getLocationOnScreen(r0)
        L_0x0016:
            java.lang.Object r4 = r8.A01
            android.graphics.Point r4 = (android.graphics.Point) r4
            float r0 = r10.getX()
            int r3 = (int) r0
            java.lang.Object r2 = r8.A02
            int[] r2 = (int[]) r2
            r0 = r2[r1]
            int r3 = r3 + r0
            float r0 = r10.getY()
            int r1 = (int) r0
            r0 = 1
            r0 = r2[r0]
            int r1 = r1 + r0
            r4.set(r3, r1)
        L_0x0032:
            r0 = 0
            return r0
        L_0x0034:
            int r0 = r10.getActionMasked()
            r4 = 1
            if (r0 != 0) goto L_0x00a5
            java.lang.Object r5 = r8.A02
            X.U4i r5 = (X.U4i) r5
            float r0 = r10.getX()
            boolean r7 = r8.A03
            int r3 = X.U4i.A00(r5, r0, r7)
            java.lang.Object r0 = r8.A01
            X.X3I r0 = (X.X3I) r0
            r0.D7n(r3)
            java.util.List r6 = r5.A0D
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            if (r0 != 0) goto L_0x0076
            java.util.List r0 = r5.A0E
            java.util.Iterator r2 = r0.iterator()
        L_0x005e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r2.next()
            X.Vcy r1 = (X.C17729Vcy) r1
            r0 = 0
            X.U3X r0 = X.U4i.A02(r1, r0, r0, r5)
            X.U4i.A04(r0, r5)
            r6.add(r0)
            goto L_0x005e
        L_0x0076:
            X.VXk r0 = X.U4i.A01(r5, r3, r7)
            r5.A08(r0)
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x009c
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x009c
            boolean r0 = r5.A06
            r2 = 0
            if (r0 == 0) goto L_0x00e1
            java.util.List r1 = r5.A0C
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x00e1
            java.lang.Object r0 = r1.get(r2)
            X.Vcy r0 = (X.C17729Vcy) r0
            X.VRW[] r0 = r0.A0E
            if (r0 == 0) goto L_0x00e1
        L_0x009c:
            r5.A07(r3)
            android.widget.FrameLayout r0 = r5.A09
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L_0x00e1
        L_0x00a5:
            int r1 = r10.getActionMasked()
            r0 = 2
            if (r1 != r0) goto L_0x00e3
            java.lang.Object r3 = r8.A02
            X.U4i r3 = (X.U4i) r3
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r3.A06
            r2 = 0
            if (r0 == 0) goto L_0x00e3
            java.util.List r1 = r3.A0C
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x00e3
            java.lang.Object r0 = r1.get(r2)
            X.Vcy r0 = (X.C17729Vcy) r0
            X.VRW[] r0 = r0.A0E
            if (r0 == 0) goto L_0x00e3
        L_0x00cf:
            float r0 = r10.getX()
            int r1 = X.U4i.A00(r3, r0, r4)
            X.VXk r0 = X.U4i.A01(r3, r1, r4)
            r3.A08(r0)
            r3.A07(r1)
        L_0x00e1:
            r0 = 1
            return r0
        L_0x00e3:
            int r0 = r10.getActionMasked()
            if (r0 != r4) goto L_0x00e1
            java.lang.Object r1 = r8.A02
            X.U4i r1 = (X.U4i) r1
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x00e1
        L_0x00f5:
            android.widget.FrameLayout r1 = r1.A09
            r0 = 0
            r1.requestDisallowInterceptTouchEvent(r0)
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBs.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
