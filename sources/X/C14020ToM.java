package X;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.HeaderBehavior;

/* renamed from: X.ToM  reason: case insensitive filesystem */
public final class C14020ToM implements Runnable {
    public final View A00;
    public final CoordinatorLayout A01;
    public final /* synthetic */ HeaderBehavior A02;

    public C14020ToM(View view, CoordinatorLayout coordinatorLayout, HeaderBehavior headerBehavior) {
        this.A02 = headerBehavior;
        this.A01 = coordinatorLayout;
        this.A00 = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r4.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            android.view.View r3 = r4.A00
            if (r3 == 0) goto L_0x001e
            com.google.android.material.appbar.HeaderBehavior r2 = r4.A02
            android.widget.OverScroller r0 = r2.A01
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.computeScrollOffset()
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.A01
            if (r0 == 0) goto L_0x001f
            android.widget.OverScroller r0 = r2.A01
            int r0 = r0.getCurrY()
            r2.A0V(r3, r1, r0)
            r3.postOnAnimation(r4)
        L_0x001e:
            return
        L_0x001f:
            r2.A0U(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14020ToM.run():void");
    }
}
