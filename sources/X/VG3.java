package X;

public abstract class VG3 {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005f, code lost:
        if (r6 != r11) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass59G A00(android.text.style.ClickableSpan r14, android.view.View r15, boolean r16) {
        /*
            r13 = 0
            r1 = 1
            X.0qQ.A0B(r14, r1)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r4 = 2
            int[] r2 = new int[r4]
            android.widget.TextView r15 = (android.widget.TextView) r15
            java.lang.CharSequence r6 = r15.getText()
            r0 = 817(0x331, float:1.145E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r6, r0)
            android.text.SpannableString r6 = (android.text.SpannableString) r6
            android.text.Layout r10 = r15.getLayout()
            if (r10 == 0) goto L_0x00fb
            int r3 = r6.getSpanStart(r14)
            int r0 = r6.getSpanEnd(r14)
            float r7 = r10.getPrimaryHorizontal(r3)
            float r12 = r10.getPrimaryHorizontal(r0)
            int r11 = r10.getLineForOffset(r3)
            int r9 = r10.getLineForOffset(r0)
            boolean r0 = X.JTQ.A1O(r11, r9)
            r10.getLineBounds(r11, r5)
            if (r16 == 0) goto L_0x006c
            if (r0 == 0) goto L_0x006c
            int r8 = r9 - r11
            int r6 = r8 / 2
            int r6 = r6 + r11
            int r8 = r8 % r4
            int r8 = r8 + r6
            if (r6 == r8) goto L_0x0061
            float r3 = r10.getLineRight(r11)
            float r0 = r10.getLineLeft(r9)
            float r3 = r3 - r7
            float r0 = r12 - r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ec
            if (r6 == r11) goto L_0x0068
        L_0x0061:
            r10.getLineBounds(r6, r5)
            float r7 = r10.getLineLeft(r6)
        L_0x0068:
            float r12 = r10.getLineRight(r6)
        L_0x006c:
            r15.getLocationOnScreen(r2)
            float r6 = r15.getScaleX()
            float r3 = r15.getScaleY()
            float r7 = r7 * r6
            float r12 = r12 * r6
            int r0 = r5.left
            float r0 = (float) r0
            float r0 = r0 * r6
            int r0 = (int) r0
            r5.left = r0
            int r0 = r5.right
            float r0 = (float) r0
            float r0 = r0 * r6
            int r0 = (int) r0
            r5.right = r0
            int r0 = r5.top
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.top = r0
            int r0 = r5.bottom
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.bottom = r0
            r0 = r2[r1]
            float r1 = (float) r0
            int r0 = r15.getScrollY()
            float r0 = (float) r0
            float r0 = r0 * r3
            float r1 = r1 - r0
            int r0 = r15.getCompoundPaddingTop()
            float r0 = (float) r0
            float r0 = r0 * r3
            float r1 = r1 + r0
            int r1 = (int) r1
            int r0 = r5.top
            int r0 = r0 + r1
            r5.top = r0
            int r0 = r5.bottom
            int r0 = r0 + r1
            r5.bottom = r0
            int r3 = r5.left
            r0 = r2[r13]
            float r1 = (float) r0
            float r1 = r1 + r7
            int r0 = r15.getCompoundPaddingLeft()
            float r0 = (float) r0
            float r0 = r0 * r6
            float r1 = r1 + r0
            int r0 = r15.getScrollX()
            float r0 = (float) r0
            float r0 = r0 * r6
            float r1 = r1 - r0
            int r0 = (int) r1
            int r3 = r3 + r0
            r5.left = r3
            float r0 = (float) r3
            float r0 = r0 + r12
            float r0 = r0 - r7
            int r0 = (int) r0
            r5.right = r0
            int r0 = r0 - r3
            int r0 = r0 / r4
            int r3 = r3 + r0
            int r2 = r5.top
            int r1 = r5.bottom
            int r1 = r1 - r2
            int r0 = r1 / r4
            int r2 = r2 + r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.59G r0 = new X.59G
            r0.<init>(r3, r2, r1)
            return r0
        L_0x00ec:
            if (r8 == r9) goto L_0x00f2
            float r12 = r10.getLineRight(r8)
        L_0x00f2:
            r10.getLineBounds(r8, r5)
            float r7 = r10.getLineLeft(r8)
            goto L_0x006c
        L_0x00fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VG3.A00(android.text.style.ClickableSpan, android.view.View, boolean):X.59G");
    }
}
