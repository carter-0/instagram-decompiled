package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.TyS  reason: case insensitive filesystem */
public final class C14563TyS extends TouchDelegate {
    public static final Rect A01 = new Rect();
    public final List A00 = new ArrayList();

    public C14563TyS(C70682Ty r5, List list) {
        super(A01, r5);
        for (int i = 0; i < list.size(); i++) {
            this.A00.add(new C14564TyT((C14565TyU) list.get(i), r5));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0129, code lost:
        if (r12.contains(r11, r10) != false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0130, code lost:
        if (r15.getAction() == 1) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            java.util.List r4 = r14.A00
            int r3 = r4.size()
            r2 = 1
            int r3 = r3 - r2
        L_0x0008:
            if (r3 < 0) goto L_0x0140
            java.lang.Object r5 = r4.get(r3)
            X.TyT r5 = (X.C14564TyT) r5
            if (r5 == 0) goto L_0x013c
            float r0 = r15.getX()
            int r11 = (int) r0
            float r0 = r15.getY()
            int r10 = (int) r0
            int r0 = r15.getAction()
            if (r0 != 0) goto L_0x00c0
            r0 = 0
            r5.A01 = r0
            r5.A00 = r0
            r7 = 0
        L_0x0028:
            X.2Ty r1 = r5.A04
            int r0 = r1.getMountItemCount()
            if (r7 >= r0) goto L_0x00c0
            X.3e2 r9 = r1.A0H(r7)
            if (r9 == 0) goto L_0x0090
            com.facebook.rendercore.RenderTreeNode r0 = r9.A01
            X.2Th r0 = r0.A06
            long r12 = r0.A0H()
            X.TyU r6 = r5.A03
            int r0 = r6.A06
            long r0 = (long) r0
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0090
            java.lang.Object r0 = r9.A04
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x0090
            java.lang.Object r9 = r9.A04
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L_0x0090
            r5.A01 = r9
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r9.getHitRect(r8)
            float r0 = r6.A04
            r1 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0093
            float r0 = r6.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0093
            int r0 = r8.left
            float r1 = (float) r0
            float r0 = r6.A02
            float r1 = r1 - r0
            int r0 = (int) r1
            r8.left = r0
            int r0 = r8.right
            float r1 = (float) r0
            float r0 = r6.A03
        L_0x0078:
            float r1 = r1 + r0
            int r0 = (int) r1
            r8.right = r0
            int r0 = r8.top
            float r1 = (float) r0
            float r0 = r6.A05
            float r1 = r1 - r0
            int r0 = (int) r1
            r8.top = r0
            int r0 = r8.bottom
            float r1 = (float) r0
            float r0 = r6.A00
            float r1 = r1 + r0
            int r0 = (int) r1
            r8.bottom = r0
            r5.A00 = r8
        L_0x0090:
            int r7 = r7 + 1
            goto L_0x0028
        L_0x0093:
            android.content.res.Resources r0 = X.DbU.A05(r9)
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            boolean r9 = X.C13988Tno.A1W(r0, r2)
            int r0 = r8.left
            float r1 = (float) r0
            if (r9 == 0) goto L_0x00b4
            float r0 = r6.A01
            float r1 = r1 - r0
            int r0 = (int) r1
            r8.left = r0
            int r0 = r8.right
            float r1 = (float) r0
            float r0 = r6.A04
            goto L_0x0078
        L_0x00b4:
            float r0 = r6.A04
            float r1 = r1 - r0
            int r0 = (int) r1
            r8.left = r0
            int r0 = r8.right
            float r1 = (float) r0
            float r0 = r6.A01
            goto L_0x0078
        L_0x00c0:
            android.graphics.Rect r0 = r5.A00
            r9 = 0
            if (r0 == 0) goto L_0x013c
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x013c
            X.2Ty r0 = r5.A04
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r8 = r0.getScaledTouchSlop()
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            android.graphics.Rect r0 = r5.A00
            r12.set(r0)
            int r0 = -r8
            r12.inset(r0, r0)
            int r7 = r15.getAction()
            r1 = 1
            r6 = 2
            if (r7 == 0) goto L_0x0133
            if (r7 == r2) goto L_0x0120
            if (r7 == r6) goto L_0x0120
            r0 = 3
            if (r7 != r0) goto L_0x013c
            boolean r7 = r5.A02
        L_0x00f6:
            r5.A02 = r9
        L_0x00f8:
            if (r7 == 0) goto L_0x013c
            if (r1 == 0) goto L_0x0118
            android.view.View r0 = r5.A01
            int r0 = r0.getWidth()
            int r0 = r0 / r6
            float r1 = (float) r0
            android.view.View r0 = r5.A01
            int r0 = r0.getHeight()
            int r0 = r0 / r6
            float r0 = (float) r0
            r15.setLocation(r1, r0)
        L_0x010f:
            android.view.View r0 = r5.A01
            boolean r0 = r0.dispatchTouchEvent(r15)
            if (r0 == 0) goto L_0x013c
            return r2
        L_0x0118:
            int r0 = r8 * 2
            int r0 = -r0
            float r0 = (float) r0
            r15.setLocation(r0, r0)
            goto L_0x010f
        L_0x0120:
            boolean r7 = r5.A02
            if (r7 == 0) goto L_0x012b
            boolean r0 = r12.contains(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x012c
        L_0x012b:
            r1 = 1
        L_0x012c:
            int r0 = r15.getAction()
            if (r0 != r2) goto L_0x00f8
            goto L_0x00f6
        L_0x0133:
            android.graphics.Rect r0 = r5.A00
            boolean r7 = r0.contains(r11, r10)
            r5.A02 = r7
            goto L_0x00f8
        L_0x013c:
            int r3 = r3 + -1
            goto L_0x0008
        L_0x0140:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14563TyS.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
