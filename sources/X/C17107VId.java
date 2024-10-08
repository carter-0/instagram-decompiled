package X;

/* renamed from: X.VId  reason: case insensitive filesystem */
public abstract class C17107VId {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0040, code lost:
        if (r1 > r10.getLineRight(r3)) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.text.Layout r10, android.view.MotionEvent r11, android.view.View r12) {
        /*
            r2 = 0
            X.0qQ.A0B(r11, r2)
            r8 = 1
            int r5 = r11.getAction()
            if (r5 == 0) goto L_0x000e
            if (r5 == r8) goto L_0x000e
        L_0x000d:
            return r2
        L_0x000e:
            float r0 = r11.getX()
            int r4 = (int) r0
            float r0 = r11.getY()
            int r1 = (int) r0
            int r0 = r12.getPaddingLeft()
            int r4 = r4 - r0
            int r0 = r12.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r12.getScrollX()
            int r4 = r4 + r0
            int r0 = r12.getScrollY()
            int r1 = r1 + r0
            int r3 = r10.getLineForVertical(r1)
            float r0 = r10.getLineLeft(r3)
            float r1 = (float) r4
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0042
            float r0 = r10.getLineRight(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r11 = 1
            if (r0 <= 0) goto L_0x0043
        L_0x0042:
            r11 = 0
        L_0x0043:
            int r4 = r10.getOffsetForHorizontal(r3, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00a9 }
            r0 = -1
            if (r4 == r0) goto L_0x000d
            java.lang.CharSequence r3 = r10.getText()
            r0 = 17
            java.lang.String r1 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r3, r1)
            android.text.Spanned r3 = (android.text.Spanned) r3
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r9 = r3.getSpans(r4, r4, r0)
            android.text.style.ClickableSpan[] r9 = (android.text.style.ClickableSpan[]) r9
            int r7 = r9.length
            if (r7 == 0) goto L_0x000d
            if (r5 != r8) goto L_0x006d
            if (r7 != r8) goto L_0x006e
            r0 = r9[r2]
        L_0x006a:
            r0.onClick(r12)
        L_0x006d:
            return r8
        L_0x006e:
            java.lang.CharSequence r10 = r10.getText()
            X.0qQ.A0C(r10, r1)
            android.text.Spanned r10 = (android.text.Spanned) r10
            r0 = r9[r2]
            int r6 = r10.getSpanEnd(r0)
            r0 = r9[r2]
            int r0 = r10.getSpanStart(r0)
            int r6 = r6 - r0
            r5 = r6
            r4 = 0
            r3 = 0
            r2 = 1
        L_0x0088:
            r0 = r9[r2]
            int r1 = r10.getSpanEnd(r0)
            r0 = r9[r2]
            int r0 = r10.getSpanStart(r0)
            int r1 = r1 - r0
            if (r1 >= r6) goto L_0x0099
            r3 = r2
            r6 = r1
        L_0x0099:
            if (r1 <= r5) goto L_0x009d
            r4 = r2
            r5 = r1
        L_0x009d:
            int r2 = r2 + 1
            if (r2 < r7) goto L_0x0088
            if (r11 == 0) goto L_0x00a6
            r0 = r9[r3]
            goto L_0x006a
        L_0x00a6:
            r0 = r9[r4]
            goto L_0x006a
        L_0x00a9:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = ""
        L_0x00b2:
            java.lang.String r0 = "IgSpannableTouchHelper HorizontalMeasurementProvider crash...."
            X.0wb.A03(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17107VId.A00(android.text.Layout, android.view.MotionEvent, android.view.View):boolean");
    }
}
