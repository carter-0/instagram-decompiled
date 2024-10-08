package X;

/* renamed from: X.Jlt  reason: case insensitive filesystem */
public final class C60461Jlt extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r5 < r4) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r7, android.view.View r8, androidx.recyclerview.widget.RecyclerView r9, X.AnonymousClass3AW r10) {
        /*
            r6 = this;
            r1 = 0
            X.C51973G9u.A1E(r7, r8, r9)
            int r5 = androidx.recyclerview.widget.RecyclerView.A03(r8)
            r0 = -1
            if (r5 == r0) goto L_0x0011
            boolean r3 = r6.A03
            if (r3 == 0) goto L_0x001a
            if (r5 != 0) goto L_0x001a
        L_0x0011:
            r7.left = r1
            r7.right = r1
        L_0x0015:
            r7.top = r1
        L_0x0017:
            r7.bottom = r1
            return
        L_0x001a:
            X.2Rw r0 = r9.A0A
            if (r0 == 0) goto L_0x002e
            r2 = 5
            int r0 = r0.getItemViewType(r5)
            if (r2 != r0) goto L_0x002e
            int r0 = r6.A00
            r7.left = r0
            r7.right = r0
            r7.top = r0
            goto L_0x0017
        L_0x002e:
            if (r3 == 0) goto L_0x0032
            int r5 = r5 + -1
        L_0x0032:
            int r4 = r6.A01
            int r3 = r5 % r4
            boolean r2 = r6.A02
            int r1 = r6.A00
            int r0 = r3 * r1
            int r0 = r0 / r4
            int r0 = r1 - r0
            if (r2 == 0) goto L_0x004c
            r7.right = r0
            int r0 = r3 + 1
            int r0 = r0 * r1
            int r0 = r0 / r4
            r7.left = r0
        L_0x0049:
            if (r5 >= r4) goto L_0x0017
            goto L_0x0015
        L_0x004c:
            r7.left = r0
            int r0 = r3 + 1
            int r0 = r0 * r1
            int r0 = r0 / r4
            r7.right = r0
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60461Jlt.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.3AW):void");
    }

    public C60461Jlt(int i, int i2, boolean z, boolean z2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
        this.A02 = z2;
    }
}
