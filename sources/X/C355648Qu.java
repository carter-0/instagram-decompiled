package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.8Qu  reason: invalid class name and case insensitive filesystem */
public final class C355648Qu extends GestureDetector.SimpleOnGestureListener {
    public boolean A00 = true;
    public final /* synthetic */ C355568Qm A01;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C355648Qu(C355568Qm r2) {
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLongPress(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0046
            X.8Qm r4 = r5.A01
            android.view.View r1 = r4.A03(r6)
            if (r1 == 0) goto L_0x0046
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0I
            X.3kE r3 = r0.A0Z(r1)
            if (r3 == 0) goto L_0x0046
            X.8Qj r2 = r4.A0F
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0I
            boolean r0 = r2.hasDragFlag(r0, r3)
            if (r0 == 0) goto L_0x0046
            r0 = 0
            int r1 = r6.getPointerId(r0)
            int r0 = r4.A07
            if (r1 != r0) goto L_0x0046
            int r0 = r6.findPointerIndex(r0)
            float r1 = r6.getX(r0)
            float r0 = r6.getY(r0)
            r4.A02 = r1
            r4.A03 = r0
            r0 = 0
            r4.A01 = r0
            r4.A00 = r0
            boolean r0 = r2.isLongPressDragEnabled()
            if (r0 == 0) goto L_0x0046
            r0 = 2
            r4.A08(r3, r0)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355648Qu.onLongPress(android.view.MotionEvent):void");
    }
}
