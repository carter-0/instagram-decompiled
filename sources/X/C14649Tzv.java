package X;

import android.view.View;

/* renamed from: X.Tzv  reason: case insensitive filesystem */
public final class C14649Tzv implements View.OnTouchListener {
    public final int A00;

    public C14649Tzv(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r0 = 1.0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 2: goto L_0x0007;
                case 3: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            return r0
        L_0x0007:
            int r1 = r4.getAction()
            if (r1 == 0) goto L_0x0014
            r0 = 1
            if (r1 == r0) goto L_0x0025
            r0 = 3
            if (r1 == r0) goto L_0x0025
            goto L_0x0023
        L_0x0014:
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L_0x002b
        L_0x0017:
            boolean r1 = X.AnonymousClass7TG.A1Z(r3, r4)
            int r0 = r4.getAction()
            if (r0 == 0) goto L_0x0028
            if (r0 == r1) goto L_0x0025
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x002b
        L_0x0028:
            r0 = 1060320051(0x3f333333, float:0.7)
        L_0x002b:
            r3.setAlpha(r0)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14649Tzv.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
