package X;

import android.view.View;

/* renamed from: X.Tz3  reason: case insensitive filesystem */
public final class C14599Tz3 implements C20941X5k {
    public int A00 = -1;
    public int A01 = 0;
    public boolean A02 = false;
    public final /* synthetic */ 2Tb A03;

    public C14599Tz3(2Tb r2) {
        this.A03 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r3 == r9.getHeight()) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DYF(android.view.View r9, int r10) {
        /*
            r8 = this;
            android.view.ViewParent r1 = r9.getParent()
            boolean r0 = r1 instanceof android.view.View
            r5 = 0
            if (r0 == 0) goto L_0x008c
            android.view.View r1 = (android.view.View) r1
            int r4 = r1.getPaddingBottom()
        L_0x000f:
            int r3 = r8.A00
            r2 = 1
            if (r3 <= 0) goto L_0x001b
            int r0 = r9.getHeight()
            r1 = 1
            if (r3 != r0) goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            int r0 = r8.A01
            if (r0 == r4) goto L_0x0021
            r5 = 1
        L_0x0021:
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x008e
            if (r1 != 0) goto L_0x008e
            if (r5 != 0) goto L_0x008e
            int r2 = r9.getTop()
            int r10 = r10 - r4
            X.2Tb r5 = r8.A03
            boolean r0 = r5.A0H
            if (r0 == 0) goto L_0x0087
            r1 = r10
        L_0x0035:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            int r10 = r10 - r2
            float r7 = (float) r10
            float r0 = (float) r1
            float r7 = r7 / r0
        L_0x003f:
            r5.A00 = r7
            X.VL4 r0 = r5.A05
            if (r0 == 0) goto L_0x0076
            X.TyL r0 = r0.A00
            X.TyM r0 = r0.A08
            if (r0 == 0) goto L_0x0076
            X.TyL r0 = X.C14557TyM.A01(r0)
            X.TyJ r6 = r0.A03
            if (r6 == 0) goto L_0x0076
            X.TyI r4 = r6.A08
            if (r4 == 0) goto L_0x0076
            r0 = 0
            r3 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            int r2 = r6.A02
            int r0 = r6.A01
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r7, r0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r0 = X.2eL.A06(r2, r0)
            if (r0 == 0) goto L_0x0080
            r4.A01(r0)
            r6.setForeground(r4)
        L_0x0076:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x007f
            float r0 = r5.A00
            X.2Tb.A01(r5, r0)
        L_0x007f:
            return
        L_0x0080:
            r6.setForeground(r3)
            goto L_0x0076
        L_0x0084:
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003f
        L_0x0087:
            int r1 = r9.getHeight()
            goto L_0x0035
        L_0x008c:
            r4 = 0
            goto L_0x000f
        L_0x008e:
            r8.A01 = r4
            r8.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14599Tz3.DYF(android.view.View, int):void");
    }

    public final void DYK(View view, C70652Tj r4) {
        this.A00 = view.getHeight();
        this.A02 = false;
        2Tb r1 = this.A03;
        r1.A09.A05.A09();
        if (r4 == 2Tb.A0M) {
            if (!r1.A0F) {
                r1.A06(AnonymousClass05K.A00);
            }
            r1.A03();
        }
    }
}
