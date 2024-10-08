package X;

import android.content.Context;

/* renamed from: X.H7u  reason: case insensitive filesystem */
public final class C54325H7u extends C255963v0 {
    public final int A00;
    public final boolean A01;

    public C54325H7u(Context context) {
        this.A00 = C61380mr.A01(context, 10);
        this.A01 = 0mk.A02(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (r3 != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        if (r11 == r5) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E3E(android.view.View r8, com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r9, float r10, int r11) {
        /*
            r7 = this;
            boolean r5 = X.AnonymousClass7TG.A1Z(r9, r8)
            int r1 = r9.getWidth()
            int r0 = r9.getPageSize()
            int r1 = r1 - r0
            int r0 = r1 / 2
            float r2 = (float) r0
            int r0 = r9.getPageSize()
            float r0 = (float) r0
            float r0 = r0 * r10
            float r2 = r2 + r0
            float r0 = r9.A00
            float r10 = r10 * r0
            float r2 = r2 + r10
            android.widget.Adapter r0 = r9.getAdapter()
            if (r0 == 0) goto L_0x00c3
            int r0 = r0.getCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x0029:
            boolean r6 = r7.A01
            r1 = 1
            if (r6 == 0) goto L_0x00b5
            if (r11 != 0) goto L_0x00c0
        L_0x0030:
            r3 = 1
        L_0x0031:
            if (r6 != 0) goto L_0x003b
            if (r4 == 0) goto L_0x00a5
            int r0 = r4.intValue()
            int r1 = r0 + -2
        L_0x003b:
            if (r11 != r1) goto L_0x00a5
            int r1 = r9.getWidth()
            int r0 = r9.getPageSize()
            int r1 = r1 - r0
            int r0 = r9.getPageSize()
            int r1 = r1 - r0
            float r1 = (float) r1
            float r0 = r9.A00
            float r1 = r1 - r0
        L_0x004f:
            int r0 = r7.A00
            float r0 = (float) r0
            float r1 = r1 - r0
        L_0x0053:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            r2 = r1
        L_0x0058:
            android.widget.Adapter r0 = r9.getAdapter()
            if (r0 == 0) goto L_0x00a3
            int r0 = r0.getCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x0066:
            r3 = 1
            if (r6 == 0) goto L_0x0095
            if (r4 == 0) goto L_0x009d
            int r0 = r4.intValue()
            int r0 = r0 - r5
            boolean r1 = X.AnonymousClass7TF.A1S(r11, r0)
            int r0 = r4.intValue()
            int r0 = r0 + -2
            if (r11 == r0) goto L_0x007d
            r3 = 0
        L_0x007d:
            if (r1 != 0) goto L_0x009a
            if (r3 == 0) goto L_0x009d
        L_0x0081:
            int r1 = r7.A00
            int r0 = r9.getPageSize()
            int r1 = r1 + r0
            float r1 = (float) r1
            float r0 = r9.A00
            float r1 = r1 + r0
        L_0x008c:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            r2 = r1
        L_0x0091:
            r8.setTranslationX(r2)
            return
        L_0x0095:
            if (r11 == 0) goto L_0x009a
            if (r11 != r5) goto L_0x009d
            goto L_0x0081
        L_0x009a:
            int r0 = r7.A00
            goto L_0x00a1
        L_0x009d:
            int r0 = r9.getWidth()
        L_0x00a1:
            float r1 = (float) r0
            goto L_0x008c
        L_0x00a3:
            r4 = 0
            goto L_0x0066
        L_0x00a5:
            int r1 = r9.getWidth()
            if (r3 == 0) goto L_0x00b2
            int r0 = r9.getPageSize()
            int r1 = r1 - r0
            float r1 = (float) r1
            goto L_0x004f
        L_0x00b2:
            float r0 = (float) r1
            float r1 = -r0
            goto L_0x0053
        L_0x00b5:
            if (r4 == 0) goto L_0x00c0
            int r0 = r4.intValue()
            int r0 = r0 - r5
            if (r11 != r0) goto L_0x00c0
            goto L_0x0030
        L_0x00c0:
            r3 = 0
            goto L_0x0031
        L_0x00c3:
            r4 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54325H7u.E3E(android.view.View, com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager, float, int):void");
    }
}
