package X;

import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;

/* renamed from: X.3e9  reason: invalid class name and case insensitive filesystem */
public abstract class C246173e9 {
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0066 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f A[Catch:{ all -> 0x00d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.graphics.Rect r7, X.C249753kJ r8, java.lang.Object r9, int r10, int r11, int r12, int r13, boolean r14) {
        /*
            r2 = 1
            if (r8 == 0) goto L_0x0010
            boolean r0 = r8.isTracing()
            if (r0 != r2) goto L_0x0010
            r6 = 1
            java.lang.String r0 = "applyBoundsToMountContent"
            r8.ADG(r0)
            goto L_0x0011
        L_0x0010:
            r6 = 0
        L_0x0011:
            boolean r0 = r9 instanceof android.view.View     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0082
            android.view.View r9 = (android.view.View) r9     // Catch:{ all -> 0x00d0 }
            int r4 = r12 - r10
            int r3 = r13 - r11
            if (r7 == 0) goto L_0x002c
            boolean r0 = r9 instanceof X.C70682Ty     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x002c
            int r5 = r7.left     // Catch:{ all -> 0x00d0 }
            int r2 = r7.top     // Catch:{ all -> 0x00d0 }
            int r1 = r7.right     // Catch:{ all -> 0x00d0 }
            int r0 = r7.bottom     // Catch:{ all -> 0x00d0 }
            r9.setPadding(r5, r2, r1, r0)     // Catch:{ all -> 0x00d0 }
        L_0x002c:
            if (r14 != 0) goto L_0x003a
            int r0 = r9.getMeasuredHeight()     // Catch:{ all -> 0x00d0 }
            if (r0 != r3) goto L_0x003a
            int r0 = r9.getMeasuredWidth()     // Catch:{ all -> 0x00d0 }
            if (r0 == r4) goto L_0x0047
        L_0x003a:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)     // Catch:{ all -> 0x00d0 }
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)     // Catch:{ all -> 0x00d0 }
            r9.measure(r1, r0)     // Catch:{ all -> 0x00d0 }
        L_0x0047:
            r2 = 0
            if (r14 != 0) goto L_0x0062
            int r0 = r9.getLeft()     // Catch:{ all -> 0x00d0 }
            if (r0 != r10) goto L_0x0062
            int r0 = r9.getTop()     // Catch:{ all -> 0x00d0 }
            if (r0 != r11) goto L_0x0062
            int r0 = r9.getRight()     // Catch:{ all -> 0x00d0 }
            if (r0 != r12) goto L_0x0062
            int r0 = r9.getBottom()     // Catch:{ all -> 0x00d0 }
            if (r0 == r13) goto L_0x00b1
        L_0x0062:
            r9.layout(r10, r11, r12, r13)     // Catch:{ NullPointerException -> 0x0066 }
            goto L_0x0080
        L_0x0066:
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x00d0 }
            X.0qQ.A08(r1)     // Catch:{ all -> 0x00d0 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x00d0 }
            X.0qQ.A08(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ all -> 0x00d0 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "huawei"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0080
            goto L_0x00b1
        L_0x0080:
            r2 = 1
            goto L_0x00b1
        L_0x0082:
            boolean r0 = r9 instanceof android.graphics.drawable.Drawable     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00b9
            if (r7 == 0) goto L_0x0094
            int r0 = r7.left     // Catch:{ all -> 0x00d0 }
            int r10 = r10 + r0
            int r0 = r7.top     // Catch:{ all -> 0x00d0 }
            int r11 = r11 + r0
            int r0 = r7.right     // Catch:{ all -> 0x00d0 }
            int r12 = r12 - r0
            int r0 = r7.bottom     // Catch:{ all -> 0x00d0 }
            int r13 = r13 - r0
        L_0x0094:
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9     // Catch:{ all -> 0x00d0 }
            android.graphics.Rect r1 = r9.getBounds()     // Catch:{ all -> 0x00d0 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x00d0 }
            r9.setBounds(r10, r11, r12, r13)     // Catch:{ all -> 0x00d0 }
            int r0 = r1.left     // Catch:{ all -> 0x00d0 }
            if (r0 != r10) goto L_0x00b1
            int r0 = r1.top     // Catch:{ all -> 0x00d0 }
            if (r0 != r11) goto L_0x00b1
            int r0 = r1.right     // Catch:{ all -> 0x00d0 }
            if (r0 != r12) goto L_0x00b1
            int r0 = r1.bottom     // Catch:{ all -> 0x00d0 }
            if (r0 != r13) goto L_0x00b1
            r2 = 0
        L_0x00b1:
            if (r6 == 0) goto L_0x00b8
            if (r8 == 0) goto L_0x00b8
            r8.ASS()
        L_0x00b8:
            return r2
        L_0x00b9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r1.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "Unsupported mounted content "
            r1.append(r0)     // Catch:{ all -> 0x00d0 }
            r1.append(r9)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d0 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d0 }
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            if (r6 == 0) goto L_0x00d8
            if (r8 == 0) goto L_0x00d8
            r8.ASS()
        L_0x00d8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246173e9.A00(android.graphics.Rect, X.3kJ, java.lang.Object, int, int, int, int, boolean):boolean");
    }

    public static final boolean A01(RenderTreeNode renderTreeNode, C249753kJ r8, Object obj, boolean z) {
        Rect rect = renderTreeNode.A03;
        return A00(renderTreeNode.A04, r8, obj, rect.left, rect.top, rect.right, rect.bottom, z);
    }
}
