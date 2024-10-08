package X;

/* renamed from: X.8Qn  reason: invalid class name and case insensitive filesystem */
public final class C355578Qn implements Runnable {
    public final /* synthetic */ C355568Qm A00;

    public C355578Qn(C355568Qm r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r4 < 0) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cd, code lost:
        if (r4 > 0) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f3, code lost:
        if (r7 <= 0) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r8 = r21
            X.8Qm r5 = r8.A00
            X.3kE r0 = r5.A0H
            if (r0 == 0) goto L_0x00ab
            r0 = -9223372036854775808
            long r2 = java.lang.System.currentTimeMillis()
            long r6 = r5.A0A
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x00f8
            r14 = 0
        L_0x0016:
            androidx.recyclerview.widget.RecyclerView r4 = r5.A0I
            X.3pI r9 = r4.A0D
            android.graphics.Rect r6 = r5.A0B
            if (r6 != 0) goto L_0x0025
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r5.A0B = r6
        L_0x0025:
            X.3kE r4 = r5.A0H
            android.view.View r4 = r4.itemView
            r9.A0k(r4, r6)
            boolean r4 = r9.A1X()
            r10 = 0
            if (r4 == 0) goto L_0x00f5
            float r6 = r5.A04
            float r4 = r5.A00
            float r6 = r6 + r4
            int r7 = (int) r6
            android.graphics.Rect r4 = r5.A0B
            int r4 = r4.left
            int r12 = r7 - r4
            androidx.recyclerview.widget.RecyclerView r4 = r5.A0I
            int r4 = r4.getPaddingLeft()
            int r12 = r12 - r4
            float r6 = r5.A00
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d2
            if (r12 >= 0) goto L_0x00d2
        L_0x004e:
            boolean r4 = r9.A1Y()
            if (r4 == 0) goto L_0x00d0
            float r6 = r5.A05
            float r4 = r5.A01
            float r6 = r6 + r4
            int r7 = (int) r6
            android.graphics.Rect r4 = r5.A0B
            int r4 = r4.top
            int r4 = r7 - r4
            androidx.recyclerview.widget.RecyclerView r6 = r5.A0I
            int r6 = r6.getPaddingTop()
            int r4 = r4 - r6
            float r9 = r5.A01
            int r6 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ac
            if (r4 >= 0) goto L_0x00ac
        L_0x006f:
            if (r12 == 0) goto L_0x0087
            X.8Qj r9 = r5.A0F
            androidx.recyclerview.widget.RecyclerView r10 = r5.A0I
            X.3kE r6 = r5.A0H
            android.view.View r6 = r6.itemView
            int r11 = r6.getWidth()
            androidx.recyclerview.widget.RecyclerView r6 = r5.A0I
            int r13 = r6.getWidth()
            int r12 = r9.interpolateOutOfBoundsScroll(r10, r11, r12, r13, r14)
        L_0x0087:
            if (r4 == 0) goto L_0x00a5
            X.8Qj r9 = r5.A0F
            androidx.recyclerview.widget.RecyclerView r7 = r5.A0I
            X.3kE r6 = r5.A0H
            android.view.View r6 = r6.itemView
            int r16 = r6.getHeight()
            androidx.recyclerview.widget.RecyclerView r6 = r5.A0I
            int r18 = r6.getHeight()
            r17 = r4
            r19 = r14
            r14 = r9
            r15 = r7
            int r4 = r14.interpolateOutOfBoundsScroll(r15, r16, r17, r18, r19)
        L_0x00a5:
            if (r12 != 0) goto L_0x00fc
            if (r4 != 0) goto L_0x00fc
            r5.A0A = r0
        L_0x00ab:
            return
        L_0x00ac:
            int r4 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d0
            X.3kE r4 = r5.A0H
            android.view.View r4 = r4.itemView
            int r4 = r4.getHeight()
            int r7 = r7 + r4
            android.graphics.Rect r4 = r5.A0B
            int r4 = r4.bottom
            int r7 = r7 + r4
            androidx.recyclerview.widget.RecyclerView r4 = r5.A0I
            int r6 = r4.getHeight()
            androidx.recyclerview.widget.RecyclerView r4 = r5.A0I
            int r4 = r4.getPaddingBottom()
            int r6 = r6 - r4
            int r4 = r7 - r6
            if (r4 <= 0) goto L_0x00d0
            goto L_0x006f
        L_0x00d0:
            r4 = 0
            goto L_0x006f
        L_0x00d2:
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f5
            X.3kE r4 = r5.A0H
            android.view.View r4 = r4.itemView
            int r4 = r4.getWidth()
            int r7 = r7 + r4
            android.graphics.Rect r4 = r5.A0B
            int r4 = r4.right
            int r7 = r7 + r4
            androidx.recyclerview.widget.RecyclerView r4 = r5.A0I
            int r6 = r4.getWidth()
            androidx.recyclerview.widget.RecyclerView r4 = r5.A0I
            int r4 = r4.getPaddingRight()
            int r6 = r6 - r4
            int r7 = r7 - r6
            r12 = r7
            if (r7 > 0) goto L_0x004e
        L_0x00f5:
            r12 = 0
            goto L_0x004e
        L_0x00f8:
            long r14 = r2 - r6
            goto L_0x0016
        L_0x00fc:
            long r6 = r5.A0A
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0104
            r5.A0A = r2
        L_0x0104:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            r0.scrollBy(r12, r4)
            X.3kE r0 = r5.A0H
            if (r0 == 0) goto L_0x0110
            r5.A06(r0)
        L_0x0110:
            androidx.recyclerview.widget.RecyclerView r1 = r5.A0I
            java.lang.Runnable r0 = r5.A0P
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            r0.postOnAnimation(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355578Qn.run():void");
    }
}
