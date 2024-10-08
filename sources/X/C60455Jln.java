package X;

/* renamed from: X.Jln  reason: case insensitive filesystem */
public final class C60455Jln extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;

    public C60455Jln(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0091, code lost:
        if (r3 != false) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView r8, X.AnonymousClass3AW r9) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x00a2;
                case 2: goto L_0x00a2;
                case 3: goto L_0x00a2;
                case 4: goto L_0x0041;
                case 5: goto L_0x006c;
                case 6: goto L_0x0030;
                case 7: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.getItemOffsets(r6, r7, r8, r9)
        L_0x0008:
            return
        L_0x0009:
            X.C51974G9v.A1O(r6, r7, r8, r9)
            super.getItemOffsets(r6, r7, r8, r9)
            int r2 = r5.A01
            r6.right = r2
            int r1 = androidx.recyclerview.widget.RecyclerView.A03(r7)
            if (r1 != 0) goto L_0x001e
            int r0 = r2 * 2
            r6.left = r0
            return
        L_0x001e:
            X.2Rw r0 = r8.A0A
            if (r0 == 0) goto L_0x002e
            int r0 = r0.getItemCount()
        L_0x0026:
            int r0 = r0 + -1
            if (r1 != r0) goto L_0x0008
            int r4 = r2 * 2
            goto L_0x00ca
        L_0x002e:
            r0 = 0
            goto L_0x0026
        L_0x0030:
            int r0 = androidx.recyclerview.widget.RecyclerView.A03(r7)
            r1 = 0
            if (r0 <= 0) goto L_0x003d
            int r0 = r5.A01
            r6.set(r0, r1, r1, r1)
            return
        L_0x003d:
            r6.set(r1, r1, r1, r1)
            return
        L_0x0041:
            r4 = 0
            boolean r3 = X.C51973G9u.A1b(r6, r7, r8)
            androidx.recyclerview.widget.RecyclerView.A03(r7)
            r2 = 1
            int r1 = androidx.recyclerview.widget.RecyclerView.A03(r7)
            X.2Rw r0 = r8.A0A
            if (r0 == 0) goto L_0x006a
            int r0 = r0.getItemCount()
        L_0x0056:
            int r0 = r0 - r3
            if (r1 == r0) goto L_0x005a
            r2 = 0
        L_0x005a:
            r6.top = r4
            int r1 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r2 == 0) goto L_0x0066
            if (r0 != 0) goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            r6.bottom = r1
            return
        L_0x006a:
            r0 = 0
            goto L_0x0056
        L_0x006c:
            X.AnonymousClass7TG.A1N(r6, r7)
            r0 = 2131433492(0x7f0b1814, float:1.8488771E38)
            android.view.View r0 = r7.findViewById(r0)
            r3 = 1
            r4 = 0
            boolean r2 = X.AnonymousClass7TF.A1V(r0)
            r0 = 2131431953(0x7f0b1211, float:1.848565E38)
            android.view.View r0 = r7.findViewById(r0)
            if (r0 != 0) goto L_0x0086
            r3 = 0
        L_0x0086:
            int r1 = r5.A01
            r0 = r1
            if (r2 == 0) goto L_0x008c
            r0 = 0
        L_0x008c:
            r6.top = r0
            if (r2 != 0) goto L_0x0093
            r0 = r1
            if (r3 == 0) goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            r6.left = r0
            r0 = r1
            if (r2 == 0) goto L_0x009a
            r0 = 0
        L_0x009a:
            r6.bottom = r0
            if (r2 != 0) goto L_0x00ca
            if (r3 != 0) goto L_0x00ca
            r4 = r1
            goto L_0x00ca
        L_0x00a2:
            r4 = 0
            X.AnonymousClass7TF.A1H(r6, r7)
            r3 = 2
            X.AnonymousClass7TF.A1C(r8, r3, r9)
            super.getItemOffsets(r6, r7, r8, r9)
            int r2 = r5.A01
            int r0 = r2 * 2
            int r1 = r0 / 3
            int r0 = androidx.recyclerview.widget.RecyclerView.A03(r7)
            int r0 = r0 % 3
            r6.bottom = r2
            if (r0 == 0) goto L_0x00c5
            if (r0 == r3) goto L_0x00c8
            int r1 = r1 / r3
            r6.left = r1
        L_0x00c2:
            r6.right = r1
            return
        L_0x00c5:
            r6.left = r4
            goto L_0x00c2
        L_0x00c8:
            r6.left = r1
        L_0x00ca:
            r6.right = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60455Jln.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.3AW):void");
    }
}
