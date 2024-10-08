package X;

import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;

public final class W16 {
    public C18421VrQ A00 = new C18421VrQ();
    public final C18470VsM A01;
    public final C16761V4u A02;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r5 != -1) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        if (r2 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        if (java.lang.Character.isLowSurrogate(r1) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0074, code lost:
        if (r2 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0081, code lost:
        if (java.lang.Character.isHighSurrogate(r1) == false) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(android.text.Editable r9, android.view.inputmethod.InputConnection r10, int r11, int r12, boolean r13) {
        /*
            r7 = 0
            if (r9 == 0) goto L_0x003a
            if (r11 < 0) goto L_0x003a
            if (r12 < 0) goto L_0x003a
            int r6 = android.text.Selection.getSelectionStart(r9)
            int r5 = android.text.Selection.getSelectionEnd(r9)
            r3 = -1
            if (r6 == r3) goto L_0x003a
            if (r5 == r3) goto L_0x003a
            if (r6 != r5) goto L_0x003a
            if (r13 == 0) goto L_0x0097
            int r4 = java.lang.Math.max(r11, r7)
            int r0 = r9.length()
            if (r6 < 0) goto L_0x0026
            if (r0 < r6) goto L_0x0026
            if (r4 >= 0) goto L_0x006b
        L_0x0026:
            r6 = -1
        L_0x0027:
            int r8 = java.lang.Math.max(r12, r7)
            int r4 = r9.length()
            if (r5 < 0) goto L_0x0035
            if (r4 < r5) goto L_0x0035
            if (r8 >= 0) goto L_0x003b
        L_0x0035:
            r5 = -1
        L_0x0036:
            if (r6 == r3) goto L_0x003a
            if (r5 != r3) goto L_0x00a5
        L_0x003a:
            return r7
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r8 != 0) goto L_0x003f
            goto L_0x0036
        L_0x003f:
            if (r5 < r4) goto L_0x0045
            r5 = r4
            if (r2 == 0) goto L_0x0036
            goto L_0x0035
        L_0x0045:
            char r1 = r9.charAt(r5)
            if (r2 == 0) goto L_0x0056
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 == 0) goto L_0x0035
            int r8 = r8 + -1
            int r5 = r5 + 1
            goto L_0x003b
        L_0x0056:
            boolean r0 = java.lang.Character.isSurrogate(r1)
            if (r0 != 0) goto L_0x0061
            int r8 = r8 + -1
            int r5 = r5 + 1
            goto L_0x003c
        L_0x0061:
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 != 0) goto L_0x0035
            int r5 = r5 + 1
            r2 = 1
            goto L_0x003f
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r4 != 0) goto L_0x006f
            goto L_0x0027
        L_0x006f:
            int r6 = r6 + -1
            if (r6 >= 0) goto L_0x0077
            r6 = 0
            if (r2 == 0) goto L_0x0027
            goto L_0x0026
        L_0x0077:
            char r1 = r9.charAt(r6)
            if (r2 == 0) goto L_0x0086
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 == 0) goto L_0x0026
            int r4 = r4 + -1
            goto L_0x006b
        L_0x0086:
            boolean r0 = java.lang.Character.isSurrogate(r1)
            if (r0 != 0) goto L_0x008f
            int r4 = r4 + -1
            goto L_0x006c
        L_0x008f:
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 != 0) goto L_0x0026
            r2 = 1
            goto L_0x006f
        L_0x0097:
            int r6 = r6 - r11
            int r6 = java.lang.Math.max(r6, r7)
            int r5 = r5 + r12
            int r0 = r9.length()
            int r5 = java.lang.Math.min(r5, r0)
        L_0x00a5:
            java.lang.Class<X.U2Y> r0 = X.U2Y.class
            java.lang.Object[] r4 = r9.getSpans(r6, r5, r0)
            X.U2Y[] r4 = (X.U2Y[]) r4
            if (r4 == 0) goto L_0x003a
            int r3 = r4.length
            if (r3 <= 0) goto L_0x003a
            r2 = 0
        L_0x00b3:
            r0 = r4[r2]
            int r1 = r9.getSpanStart(r0)
            int r0 = r9.getSpanEnd(r0)
            int r6 = java.lang.Math.min(r1, r6)
            int r5 = java.lang.Math.max(r0, r5)
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x00b3
            int r1 = java.lang.Math.max(r6, r7)
            int r0 = r9.length()
            int r0 = java.lang.Math.min(r5, r0)
            r10.beginBatchEdit()
            r9.delete(r1, r0)
            r10.endBatchEdit()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W16.A01(android.text.Editable, android.view.inputmethod.InputConnection, int, int, boolean):boolean");
    }

    public static boolean A02(C18749Vzk vzk, W16 w16, CharSequence charSequence, int i, int i2) {
        if (vzk.A02 == 0) {
            C18421VrQ vrQ = w16.A00;
            ThreadLocal threadLocal = C18421VrQ.A01;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            int i3 = 1;
            if (vrQ.A00.hasGlyph(sb.toString())) {
                i3 = 2;
            }
            vzk.A02 = i3;
        }
        return vzk.A02 == 2;
    }

    public W16(C16761V4u v4u, C18470VsM vsM) {
        this.A02 = v4u;
        this.A01 = vsM;
    }

    public static boolean A00(Editable editable, KeyEvent keyEvent, boolean z) {
        U2Y[] u2yArr;
        int length;
        if (!(!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()))) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd || (u2yArr = (U2Y[]) editable.getSpans(selectionStart, selectionEnd, U2Y.class)) == null || (length = u2yArr.length) <= 0)) {
                int i = 0;
                do {
                    U2Y u2y = u2yArr[i];
                    int spanStart = editable.getSpanStart(u2y);
                    int spanEnd = editable.getSpanEnd(u2y);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else if (spanEnd == selectionStart) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                    if (selectionStart <= spanStart || selectionStart >= spanEnd) {
                        i++;
                    } else {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                } while (i < length);
            }
        }
        return false;
    }
}
