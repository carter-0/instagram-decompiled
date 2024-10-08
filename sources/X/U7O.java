package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.NestedScrollView;

public final class U7O extends 02Z {
    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        U7O.super.A0S(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(AnonymousClass7TF.A1R(nestedScrollView.getScrollRange()));
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r7 != 16908346) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0V(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r0 = X.U7O.super.A0V(r6, r7, r8)
            r3 = 1
            if (r0 != 0) goto L_0x007e
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            boolean r0 = r6.isEnabled()
            r4 = 0
            if (r0 == 0) goto L_0x003f
            int r2 = r6.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r0 = r6.getMatrix()
            boolean r0 = r0.isIdentity()
            if (r0 == 0) goto L_0x002d
            boolean r0 = r6.getGlobalVisibleRect(r1)
            if (r0 == 0) goto L_0x002d
            int r2 = r1.height()
        L_0x002d:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r7 == r0) goto L_0x0040
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r7 == r0) goto L_0x0058
            r0 = 16908344(0x1020038, float:2.3877386E-38)
            if (r7 == r0) goto L_0x0058
            r0 = 16908346(0x102003a, float:2.3877392E-38)
            if (r7 == r0) goto L_0x0040
        L_0x003f:
            return r4
        L_0x0040:
            int r0 = r6.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r6.getPaddingTop()
            int r2 = r2 - r0
            int r1 = r6.getScrollY()
            int r1 = r1 + r2
            int r0 = r6.getScrollRange()
            int r2 = java.lang.Math.min(r1, r0)
            goto L_0x006b
        L_0x0058:
            int r0 = r6.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r6.getPaddingTop()
            int r2 = r2 - r0
            int r0 = r6.getScrollY()
            int r0 = r0 - r2
            int r2 = java.lang.Math.max(r0, r4)
        L_0x006b:
            int r0 = r6.getScrollY()
            if (r2 == r0) goto L_0x003f
            int r0 = r6.getScrollX()
            int r1 = -r0
            int r0 = r6.getScrollY()
            int r2 = r2 - r0
            androidx.core.widget.NestedScrollView.A04(r6, r1, r2, r3)
        L_0x007e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7O.A0V(android.view.View, int, android.os.Bundle):boolean");
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int scrollRange;
        U7O.super.A0Y(view, accessibilityNodeInfoCompat);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfoCompat.mInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.addAction(04x.A0X);
                accessibilityNodeInfoCompat.addAction(04x.A0e);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfoCompat.addAction(04x.A0Z);
                accessibilityNodeInfoCompat.addAction(04x.A0Y);
            }
        }
    }
}
