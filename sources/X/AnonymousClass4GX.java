package X;

/* renamed from: X.4GX  reason: invalid class name */
public final class AnonymousClass4GX extends C255963v0 {
    public boolean A00;
    public final int A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0097, code lost:
        if (r12 >= -1.0f) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a2, code lost:
        if (r8 == false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E3E(android.view.View r10, com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r11, float r12, int r13) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r11, r0)
            r3 = 1
            X.0qQ.A0B(r10, r3)
            super.E3E(r10, r11, r12, r13)
            int r7 = r9.A01
            if (r7 < 0) goto L_0x0021
            float r0 = r10.getRotation()
            r8 = 0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x0022
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            return
        L_0x0022:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r7 != 0) goto L_0x003f
            if (r13 == 0) goto L_0x0099
            if (r13 != r3) goto L_0x006c
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x00a6
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a6
            r0 = 1082130432(0x40800000, float:4.0)
            float r12 = r12 * r0
            float r12 = r12 * r6
        L_0x0038:
            r10.setRotation(r12)
            r10.setTranslationX(r1)
            return
        L_0x003f:
            int r0 = r7 + -1
            r4 = 0
            if (r13 != r0) goto L_0x0045
            r4 = 1
        L_0x0045:
            r2 = 0
            if (r13 != r7) goto L_0x0049
            r2 = 1
        L_0x0049:
            int r0 = r7 + 1
            if (r13 != r0) goto L_0x004e
            r8 = 1
        L_0x004e:
            if (r4 == 0) goto L_0x005b
            r0 = -1081711002(0xffffffffbf866666, float:-1.05)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x005b
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0068
        L_0x005b:
            if (r8 == 0) goto L_0x008f
            r0 = 1065772646(0x3f866666, float:1.05)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x008f
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x008f
        L_0x0068:
            r0 = 1082130432(0x40800000, float:4.0)
            float r12 = r12 * r0
            goto L_0x0038
        L_0x006c:
            r0 = 2
            if (r13 != r0) goto L_0x00a4
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00a6
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00a6
            float r1 = r12 - r5
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r0
            r10.setRotation(r1)
            float r2 = r2 - r12
            int r0 = r11.getPageSize()
            float r1 = (float) r0
            float r0 = r11.A00
            float r1 = r1 + r0
            float r2 = r2 * r1
            r10.setTranslationX(r2)
            return
        L_0x008f:
            if (r2 == 0) goto L_0x00a0
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x00a6
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00a6
        L_0x0099:
            r10.setRotation(r1)
            r10.bringToFront()
            return
        L_0x00a0:
            if (r4 != 0) goto L_0x00a6
            if (r8 != 0) goto L_0x00a6
        L_0x00a4:
            r9.A00 = r3
        L_0x00a6:
            r10.setRotation(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4GX.E3E(android.view.View, com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager, float, int):void");
    }

    public AnonymousClass4GX(int i, boolean z) {
        this.A01 = i;
        this.A02 = z;
    }
}
