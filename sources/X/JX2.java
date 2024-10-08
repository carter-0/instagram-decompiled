package X;

import android.view.View;
import android.view.ViewStub;

public final class JX2 {
    public View A00;
    public View A01;
    public View A02;
    public Integer A03 = AnonymousClass05K.A0C;
    public float A04;
    public final ViewStub A05;

    public JX2(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A05 = viewStub;
    }

    public final float A00() {
        if (this.A03 == AnonymousClass05K.A0C) {
            return 1.0f;
        }
        return this.A04;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r7, int r8, float r9) {
        /*
            r6 = this;
            android.view.View r0 = r6.A01
            if (r0 != 0) goto L_0x0025
            android.view.ViewStub r0 = r6.A05
            android.view.View r1 = r0.inflate()
            r6.A01 = r1
            r2 = 0
            if (r1 == 0) goto L_0x00a8
            r0 = 2131432129(0x7f0b12c1, float:1.8486007E38)
            android.view.View r0 = r1.findViewById(r0)
        L_0x0016:
            r6.A02 = r0
            android.view.View r1 = r6.A01
            if (r1 == 0) goto L_0x0023
            r0 = 2131432128(0x7f0b12c0, float:1.8486005E38)
            android.view.View r2 = r1.findViewById(r0)
        L_0x0023:
            r6.A00 = r2
        L_0x0025:
            android.view.View r0 = r6.A01
            X.AnonymousClass7TF.A16(r0)
            r6.A04 = r9
            android.view.View r0 = r6.A02
            r3 = 0
            if (r0 == 0) goto L_0x00a6
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
        L_0x0035:
            boolean r0 = r4 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x00a4
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
        L_0x003b:
            android.view.View r0 = r6.A00
            if (r0 == 0) goto L_0x00a2
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L_0x0043:
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x004a
            r3 = r1
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
        L_0x004a:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0082
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r6.A03 = r0
            float r2 = (float) r7
            float r1 = (float) r8
            float r0 = r6.A00()
            float r1 = r1 * r0
            float r2 = r2 - r1
            int r0 = (int) r2
            int r5 = r0 / 2
            if (r4 == 0) goto L_0x0069
            r1 = 3
            r0 = -1
            r4.gravity = r1
            r4.width = r5
            r4.height = r0
        L_0x0069:
            if (r3 == 0) goto L_0x0073
            r0 = 5
            r2 = -1
        L_0x006d:
            r3.gravity = r0
            r3.width = r5
            r3.height = r2
        L_0x0073:
            android.view.View r0 = r6.A02
            if (r0 == 0) goto L_0x007a
            r0.setLayoutParams(r4)
        L_0x007a:
            android.view.View r0 = r6.A00
            if (r0 == 0) goto L_0x0081
            r0.setLayoutParams(r3)
        L_0x0081:
            return
        L_0x0082:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6.A03 = r0
            float r2 = (float) r8
            float r1 = (float) r7
            float r0 = r6.A00()
            float r1 = r1 / r0
            float r2 = r2 - r1
            int r0 = (int) r2
            int r2 = r0 / 2
            if (r4 == 0) goto L_0x009c
            r1 = 48
            r0 = -1
            r4.gravity = r1
            r4.width = r0
            r4.height = r2
        L_0x009c:
            if (r3 == 0) goto L_0x0073
            r0 = 80
            r5 = -1
            goto L_0x006d
        L_0x00a2:
            r1 = r3
            goto L_0x0043
        L_0x00a4:
            r4 = r3
            goto L_0x003b
        L_0x00a6:
            r4 = r3
            goto L_0x0035
        L_0x00a8:
            r0 = r2
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JX2.A01(int, int, float):void");
    }
}
