package X;

/* renamed from: X.8PF  reason: invalid class name */
public final class AnonymousClass8PF extends AnonymousClass3NK {
    public final /* synthetic */ C355048Oj A00;

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0159, code lost:
        if (r0.A04 == false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dqe(android.view.View r20) {
        /*
            r19 = this;
            r13 = 0
            r4 = r20
            X.0qQ.A0B(r4, r13)
            r0 = r19
            X.8Oj r3 = r0.A00
            X.8Be r0 = r3.A0q
            X.8BA r2 = r0.A00
            X.80U r5 = r2.A1M
            X.80V r1 = r5.Atr()
            X.8T3 r0 = X.AnonymousClass8T3.A00
            r5.E3H(r0)
            boolean r0 = r5.CQ0(r1)
            if (r0 == 0) goto L_0x0068
            X.0eK r0 = r2.A1v
            java.lang.Object r6 = r0.get()
            X.8Wi r6 = (X.C357068Wi) r6
            X.89Y r5 = r2.A0D
            X.6if r1 = r2.A1j
            java.lang.Object r0 = r1.get()
            if (r5 != r0) goto L_0x0071
            java.lang.Object r1 = r1.get()
            X.AaB r1 = (X.C40316AaB) r1
            X.88K r0 = r1.A01
            java.util.List r0 = r0.A09
            r0.remove(r1)
            X.8BQ r0 = r1.A00
            r0.A02(r13)
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r0 = r1.A03
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A05(r0, r13)
            X.6iH r0 = r1.A02
            r0.D48(r1)
            X.8BQ r0 = r2.A17
            X.8BS r0 = r0.A01
            r0.A01 = r13
        L_0x0057:
            if (r6 == 0) goto L_0x0068
            X.8BA r0 = r6.A0A
            X.0t0 r1 = X.C357068Wi.A01(r6)
            X.8BQ r0 = r0.A17
            r0.A04 = r1
            java.util.ArrayList r0 = r0.A06
            r0.clear()
        L_0x0068:
            boolean r0 = r3.A16
            if (r0 == 0) goto L_0x006f
            r4.performClick()
        L_0x006f:
            r0 = 1
            return r0
        L_0x0071:
            X.89Y r5 = r2.A0D
            X.6if r1 = r2.A1b
            java.lang.Object r0 = r1.get()
            if (r5 != r0) goto L_0x0085
            java.lang.Object r0 = r1.get()
            X.AaC r0 = (X.C40317AaC) r0
            r0.A04()
            goto L_0x0057
        L_0x0085:
            X.89Y r5 = r2.A0D
            X.6if r1 = r2.A1c
            java.lang.Object r0 = r1.get()
            if (r5 != r0) goto L_0x0068
            java.lang.Object r0 = r1.get()
            X.8O4 r0 = (X.AnonymousClass8O4) r0
            r0.A0A()
            java.lang.Object r0 = r1.get()
            X.8O4 r0 = (X.AnonymousClass8O4) r0
            boolean r0 = r0.CJj()
            if (r0 == 0) goto L_0x0068
            X.80D r6 = r2.A18
            boolean r0 = r6.A0K()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r1.get()
            X.8O4 r0 = (X.AnonymousClass8O4) r0
            X.A56 r0 = X.AnonymousClass8O4.A00(r0)
            com.instagram.ui.widget.drawing.gl.GLDrawingView r0 = r0.A00
            android.graphics.Bitmap r11 = r0.getBitmap()
            if (r11 == 0) goto L_0x0068
            boolean r0 = X.1MF.A02
            int r14 = r11.getWidth()
            int r18 = r11.getHeight()
            int r9 = r14 + -1
            int r7 = r18 + -1
            int r0 = r14 * r18
            int[] r12 = new int[r0]
            r1 = 0
            r15 = r13
            r16 = r13
            r17 = r14
            r11.getPixels(r12, r13, r14, r15, r16, r17, r18)
            r10 = 0
            r5 = 0
        L_0x00db:
            int r0 = r11.getHeight()
            if (r10 >= r0) goto L_0x0107
            r8 = 0
        L_0x00e2:
            int r0 = r11.getWidth()
            if (r8 >= r0) goto L_0x0104
            int r0 = r10 * r14
            int r0 = r0 + r8
            r0 = r12[r0]
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 <= 0) goto L_0x00f9
            if (r8 >= r9) goto L_0x0100
            r9 = r8
        L_0x00f6:
            if (r10 >= r7) goto L_0x00fc
            r7 = r10
        L_0x00f9:
            int r8 = r8 + 1
            goto L_0x00e2
        L_0x00fc:
            if (r10 <= r5) goto L_0x00f9
            r5 = r10
            goto L_0x00f9
        L_0x0100:
            if (r8 <= r1) goto L_0x00f6
            r1 = r8
            goto L_0x00f6
        L_0x0104:
            int r10 = r10 + 1
            goto L_0x00db
        L_0x0107:
            if (r1 < r9) goto L_0x0068
            if (r5 < r7) goto L_0x0068
            int r1 = r1 - r9
            r8 = 1
            int r1 = r1 + 1
            int r5 = r5 - r7
            int r0 = r5 + 1
            X.0fO.A03(r11)
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r11, r9, r7, r1, r0)
            int[] r1 = new int[]{r9, r7}
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r5, r1)
            java.lang.Object r12 = r0.first
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            java.lang.Object r11 = r0.second
            int[] r11 = (int[]) r11
            if (r12 == 0) goto L_0x0068
            java.lang.String r1 = "drawing_sticker_"
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = X.002.A0R(r1, r0)
            android.view.View r0 = r2.A0o
            android.content.Context r10 = r0.getContext()
            int r5 = r12.getWidth()
            int r1 = r12.getHeight()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r13, r13, r5, r1)
            X.9XC r7 = new X.9XC
            r7.<init>((android.content.Context) r10, (android.graphics.Bitmap) r12, (android.graphics.Rect) r0, (java.lang.String) r9)
            X.82n r0 = r6.A12
            if (r0 == 0) goto L_0x015b
            boolean r0 = r0.A04
            r10 = 3
            if (r0 != 0) goto L_0x015c
        L_0x015b:
            r10 = -1
        L_0x015c:
            X.6if r0 = r2.A1g
            java.lang.Object r6 = r0.get()
            X.8ME r6 = (X.AnonymousClass8ME) r6
            java.util.List r5 = java.util.Collections.singletonList(r9)
            X.ADo r2 = new X.ADo
            r2.<init>()
            r9 = 8388659(0x800033, float:1.1755015E-38)
            r1 = 0
            X.Ut8 r0 = new X.Ut8
            r0.<init>(r9, r1, r1)
            r2.A06 = r0
            r0 = r11[r13]
            float r1 = (float) r0
            r0 = r11[r8]
            float r0 = (float) r0
            r2.A01(r1, r0)
            r2.A05 = r10
            java.lang.String r0 = "drawing_sticker"
            r2.A0C = r0
            r2.A0H = r8
            r2.A0Q = r13
            r2.A0R = r13
            r2.A0F = r13
            X.6b1 r0 = new X.6b1
            r0.<init>(r2)
            r6.A1K(r7, r0, r5)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PF.Dqe(android.view.View):boolean");
    }

    public AnonymousClass8PF(C355048Oj r1) {
        this.A00 = r1;
    }
}
