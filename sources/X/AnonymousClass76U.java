package X;

import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;

/* renamed from: X.76U  reason: invalid class name */
public final class AnonymousClass76U extends LinkMovementMethod {
    public final GestureDetector A00;
    public final AnonymousClass76T A01;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004c, code lost:
        if (r1 != null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.widget.TextView r7, android.text.Spannable r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            r3 = 0
            X.0qQ.A0B(r7, r3)
            r4 = 1
            X.0qQ.A0B(r8, r4)
            r0 = 2
            X.0qQ.A0B(r9, r0)
            float r0 = r9.getX()
            int r5 = (int) r0
            float r0 = r9.getY()
            int r1 = (int) r0
            int r0 = r7.getTotalPaddingLeft()
            int r5 = r5 - r0
            int r0 = r7.getTotalPaddingTop()
            int r1 = r1 - r0
            int r0 = r7.getScrollX()
            int r5 = r5 + r0
            int r0 = r7.getScrollY()
            int r1 = r1 + r0
            android.text.Layout r2 = r7.getLayout()
            int r1 = r2.getLineForVertical(r1)
            float r0 = (float) r5
            int r1 = r2.getOffsetForHorizontal(r1, r0)
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r2 = r8.getSpans(r1, r1, r0)
            android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2
            int r1 = r9.getAction()
            int r0 = r2.length
            if (r0 == 0) goto L_0x005d
            if (r1 == 0) goto L_0x0061
            if (r1 != r4) goto L_0x0070
            r1 = r2[r3]
            if (r1 == 0) goto L_0x0070
        L_0x004e:
            X.76T r0 = r6.A01
            X.76S r0 = (X.AnonymousClass76S) r0
            r0.A01 = r1
            r0.A00 = r8
            android.view.GestureDetector r0 = r6.A00
            boolean r0 = r0.onTouchEvent(r9)
            return r0
        L_0x005d:
            android.text.Selection.removeSelection(r8)
            goto L_0x0070
        L_0x0061:
            r0 = r2[r3]
            int r1 = r8.getSpanStart(r0)
            r0 = r2[r3]
            int r0 = r8.getSpanEnd(r0)
            android.text.Selection.setSelection(r8, r1, r0)
        L_0x0070:
            r1 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass76U.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }

    public AnonymousClass76U(GestureDetector gestureDetector, AnonymousClass76T r2) {
        this.A00 = gestureDetector;
        this.A01 = r2;
    }
}
