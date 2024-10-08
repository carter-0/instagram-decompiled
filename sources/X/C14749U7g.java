package X;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.U7g  reason: case insensitive filesystem */
public final class C14749U7g extends 2Vy {
    public static int A04;
    public boolean A00 = true;
    public Spanned A01;
    public final View A02;
    public final List A03 = new ArrayList();

    public C14749U7g(View view) {
        super(view);
        this.A02 = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0h(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r19, int r20) {
        /*
            r18 = this;
            r7 = 1
            r3 = r18
            r2 = r20
            if (r20 < 0) goto L_0x00e9
            java.util.List r1 = r3.A03
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x00e9
            java.lang.Object r0 = r1.get(r2)
            X.VbA r0 = (X.C17618VbA) r0
        L_0x0015:
            java.lang.String r11 = ""
            r6 = 0
            r8 = r19
            if (r0 != 0) goto L_0x002a
            r8.setContentDescription(r11)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r6, r7, r7)
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo
            r0.setBoundsInParent(r1)
        L_0x0029:
            return
        L_0x002a:
            boolean r1 = r0.A06
            r16 = 0
            android.view.View r15 = r3.A02
            if (r1 != 0) goto L_0x00db
            r1 = r15
            X.X8s r1 = (X.C20995X8s) r1
            r17 = r1
            android.text.Layout r13 = r17.getLayout()
            if (r13 == 0) goto L_0x00db
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            int r1 = r0.A01
            double r1 = (double) r1
            int r3 = r0.A00
            double r9 = (double) r3
            int r12 = (int) r1
            float r1 = r13.getPrimaryHorizontal(r12)
            double r3 = (double) r1
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            float r1 = r17.getTextSize()
            r2.setTextSize(r1)
            java.lang.String r1 = r0.A05
            float r1 = r2.measureText(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r14 = (int) r1
            int r2 = r13.getLineForOffset(r12)
            int r1 = (int) r9
            int r1 = r13.getLineForOffset(r1)
            if (r2 == r1) goto L_0x0073
            r16 = 1
        L_0x0073:
            r13.getLineBounds(r2, r5)
            int r2 = r15.getScrollY()
            int r1 = r17.getTotalPaddingTop()
            int r2 = r2 + r1
            int r1 = r5.top
            int r1 = r1 + r2
            r5.top = r1
            int r1 = r5.bottom
            int r1 = r1 + r2
            r5.bottom = r1
            int r9 = r5.left
            int r1 = r17.getTotalPaddingLeft()
            double r1 = (double) r1
            double r3 = r3 + r1
            int r1 = r15.getScrollX()
            double r1 = (double) r1
            double r3 = r3 - r1
            int r1 = (int) r3
            int r9 = r9 + r1
            r5.left = r9
            int r4 = r5.top
            if (r16 == 0) goto L_0x00d8
            int r3 = r5.right
        L_0x00a1:
            int r2 = r5.bottom
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r9, r4, r3, r2)
        L_0x00a8:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00b1
            r1.set(r6, r6, r7, r7)
        L_0x00b1:
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x00b6
            r11 = r2
        L_0x00b6:
            android.view.accessibility.AccessibilityNodeInfo r2 = r8.mInfo
            r2.setText(r11)
            android.view.accessibility.AccessibilityNodeInfo r2 = r8.mInfo
            r2.setBoundsInParent(r1)
            java.lang.Integer r1 = r0.A03
            X.2eS.A05(r8, r1)
            java.lang.String r1 = r0.A04
            if (r1 == 0) goto L_0x0029
            int r0 = r1.length()
            if (r0 != 0) goto L_0x00ec
            r8.setClickable(r6)
            X.04x r0 = X.04x.A08
            r8.removeAction(r0)
            return
        L_0x00d8:
            int r3 = r9 + r14
            goto L_0x00a1
        L_0x00db:
            int r3 = r15.getWidth()
            int r2 = r15.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r6, r3, r2)
            goto L_0x00a8
        L_0x00e9:
            r0 = 0
            goto L_0x0015
        L_0x00ec:
            X.C13989Tnp.A1C(r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14749U7g.A0h(androidx.core.view.accessibility.AccessibilityNodeInfoCompat, int):void");
    }

    public static final void A00(C14749U7g u7g) {
        C20995X8s x8s = (C20995X8s) u7g.A02;
        if (x8s.getText() != u7g.A01 && (x8s.getText() instanceof Spanned)) {
            List list = u7g.A03;
            list.clear();
            CharSequence text = x8s.getText();
            0qQ.A0C(text, C273654mx.A00(17));
            Spanned spanned = (Spanned) text;
            u7g.A01 = spanned;
            if (spanned != null) {
                if (u7g.A00) {
                    C17618VbA vbA = new C17618VbA();
                    vbA.A05 = spanned.toString();
                    vbA.A01 = 0;
                    vbA.A00 = spanned.length();
                    vbA.A06 = true;
                    list.add(vbA);
                }
                ClickableSpan[] A0p = u7g.A0p(0, spanned.length());
                if (A0p != null) {
                    for (ClickableSpan clickableSpan : A0p) {
                        int spanStart = spanned.getSpanStart(clickableSpan);
                        int spanEnd = spanned.getSpanEnd(clickableSpan);
                        C17618VbA vbA2 = new C17618VbA();
                        vbA2.A05 = C13988Tno.A0c(spanned, spanStart, spanEnd);
                        vbA2.A03 = AnonymousClass05K.A01;
                        vbA2.A01 = spanStart;
                        vbA2.A00 = spanEnd;
                        vbA2.A06 = false;
                        vbA2.A02 = clickableSpan;
                        list.add(vbA2);
                    }
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        r0 = r1.getOffsetForHorizontal(r1.getLineForVertical((int) r9), r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0a(float r8, float r9) {
        /*
            r7 = this;
            java.util.List r5 = r7.A03
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x007f
            android.view.View r1 = r7.A02
            r2 = r1
            X.X8s r2 = (X.C20995X8s) r2
            java.lang.CharSequence r0 = r2.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x007f
            int r0 = r2.getTotalPaddingLeft()
            float r0 = (float) r0
            float r8 = r8 - r0
            int r0 = r2.getTotalPaddingTop()
            float r0 = (float) r0
            float r9 = r9 - r0
            int r0 = r1.getScrollX()
            float r0 = (float) r0
            float r8 = r8 + r0
            int r0 = r1.getScrollY()
            float r0 = (float) r0
            float r9 = r9 + r0
            android.text.Layout r1 = r2.getLayout()
            if (r1 == 0) goto L_0x007c
            int r0 = (int) r9
            int r0 = r1.getLineForVertical(r0)
            int r0 = r1.getOffsetForHorizontal(r0, r8)
            android.text.style.ClickableSpan[] r3 = r7.A0p(r0, r0)
            if (r3 == 0) goto L_0x007c
            int r0 = r3.length
            if (r0 == 0) goto L_0x007c
            java.lang.CharSequence r2 = r2.getText()
            r0 = 17
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r2, r0)
            android.text.Spanned r2 = (android.text.Spanned) r2
            r1 = 0
            r0 = r3[r1]
            int r4 = r2.getSpanStart(r0)
            r0 = r3[r1]
            int r3 = r2.getSpanEnd(r0)
            int r2 = r5.size()
            r6 = 0
        L_0x0066:
            if (r6 >= r2) goto L_0x007c
            java.lang.Object r1 = r5.get(r6)
            X.VbA r1 = (X.C17618VbA) r1
            if (r1 == 0) goto L_0x0079
            int r0 = r1.A01
            if (r0 != r4) goto L_0x0079
            int r0 = r1.A00
            if (r0 != r3) goto L_0x0079
            return r6
        L_0x0079:
            int r6 = r6 + 1
            goto L_0x0066
        L_0x007c:
            int r6 = A04
            return r6
        L_0x007f:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14749U7g.A0a(float, float):int");
    }

    public final void A0f(AccessibilityEvent accessibilityEvent, int i) {
        C17618VbA vbA;
        String str;
        if (i >= 0) {
            List list = this.A03;
            if (i < list.size()) {
                vbA = (C17618VbA) list.get(i);
                String str2 = "";
                if (!(vbA == null || (str = vbA.A05) == null)) {
                    str2 = str;
                }
                accessibilityEvent.setContentDescription(str2);
            }
        }
        vbA = null;
        String str22 = "";
        str22 = str;
        accessibilityEvent.setContentDescription(str22);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r2 = r4.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0m(int r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            r0 = 16
            if (r6 != r0) goto L_0x0041
            if (r5 < 0) goto L_0x0041
            java.util.List r1 = r4.A03
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x0041
            java.lang.Object r0 = r1.get(r5)
            X.VbA r0 = (X.C17618VbA) r0
            if (r0 == 0) goto L_0x0041
            android.text.style.ClickableSpan r1 = r0.A02
            if (r1 == 0) goto L_0x0041
            android.view.View r0 = r4.A02
            r1.onClick(r0)
            r3 = 0
            android.view.accessibility.AccessibilityManager r0 = r4.A04
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x003c
            android.view.View r2 = r4.A03
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x003c
            r0 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r0 = X.2Vy.A09(r4, r5, r0)
            r0.setContentChangeTypes(r3)
            r1.requestSendAccessibilityEvent(r2, r0)
        L_0x003c:
            r0 = 1
            r4.A0d(r5, r0)
            return r0
        L_0x0041:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14749U7g.A0m(int, int, android.os.Bundle):boolean");
    }

    public final ClickableSpan[] A0p(int i, int i2) {
        C20995X8s x8s = (C20995X8s) this.A02;
        if (!(x8s.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = x8s.getText();
        0qQ.A0C(text, C273654mx.A00(17));
        return (ClickableSpan[]) ((Spanned) text).getSpans(i, i2, ClickableSpan.class);
    }

    public final void A0i(List list) {
        A00(this);
        int size = this.A03.size();
        for (int i = 0; i < size; i++) {
            G9w.A0x(i, list);
        }
    }
}
