package instagram.features.clips.viewer.ui;

import X.0qQ;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.ui.widget.refresh.IgSwipeRefreshLayout;

public final class ClipsSwipeRefreshLayout extends IgSwipeRefreshLayout {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsSwipeRefreshLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [int] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            int r0 = r8.getAction()
            if (r0 != 0) goto L_0x003a
            float r6 = r8.getRawX()
            float r5 = r8.getRawY()
            java.util.Stack r4 = new java.util.Stack
            r4.<init>()
            r4.push(r7)
        L_0x001a:
            boolean r0 = r4.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x0038
            java.lang.Object r2 = r4.pop()
            android.view.View r2 = (android.view.View) r2
            X.0qQ.A0A(r2)
            boolean r0 = X.0nA.A0y(r2, r6, r5)
            if (r0 == 0) goto L_0x001a
            r0 = -1
            boolean r0 = r2.canScrollVertically(r0)
            if (r0 == 0) goto L_0x003f
            r3 = 1
        L_0x0038:
            r7.A00 = r3
        L_0x003a:
            boolean r0 = instagram.features.clips.viewer.ui.ClipsSwipeRefreshLayout.super.onInterceptTouchEvent(r8)
            return r0
        L_0x003f:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0038
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x0038
            int r1 = r2.getChildCount()
        L_0x004b:
            if (r3 >= r1) goto L_0x001a
            android.view.View r0 = r2.getChildAt(r3)
            r4.push(r0)
            int r3 = r3 + 1
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.viewer.ui.ClipsSwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean A0A() {
        if (this.A00 || ClipsSwipeRefreshLayout.super.A0A()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
