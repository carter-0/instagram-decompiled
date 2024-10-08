package X;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: X.WqG  reason: case insensitive filesystem */
public final class C20375WqG implements Comparator {
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();
    public final C267184b6 A02;
    public final boolean A03;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            android.graphics.Rect r5 = r6.A00
            android.graphics.Rect r4 = r6.A01
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r7
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.mInfo
            r0.getBoundsInParent(r5)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r8 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r8
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo
            r0.getBoundsInParent(r4)
            int r1 = r5.top
            int r0 = r4.top
            r3 = -1
            if (r1 < r0) goto L_0x0040
            r2 = 1
            if (r1 > r0) goto L_0x0035
            int r1 = r5.left
            int r0 = r4.left
            if (r1 < r0) goto L_0x003b
            if (r1 > r0) goto L_0x0036
            int r1 = r5.bottom
            int r0 = r4.bottom
            if (r1 < r0) goto L_0x0040
            if (r1 > r0) goto L_0x0035
            int r1 = r5.right
            int r0 = r4.right
            if (r1 < r0) goto L_0x003b
            if (r1 > r0) goto L_0x0036
            r2 = 0
        L_0x0035:
            return r2
        L_0x0036:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x003f
            return r3
        L_0x003b:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0040
        L_0x003f:
            r3 = 1
        L_0x0040:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20375WqG.compare(java.lang.Object, java.lang.Object):int");
    }

    public C20375WqG(C267184b6 r2, boolean z) {
        this.A03 = z;
        this.A02 = r2;
    }
}
