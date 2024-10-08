package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.We3  reason: case insensitive filesystem */
public final class C19701We3 implements C317956o7, GestureDetector.OnGestureListener {
    public boolean A00;
    public boolean A01;
    public final GestureDetector A02;
    public final VN5 A03;

    public C19701We3(Context context, VN5 vn5) {
        this.A03 = vn5;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A02 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
    }

    public final boolean DL9(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (!this.A00 || !this.A02.onTouchEvent(C13989Tnp.A0N(motionEvent))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1 != 3) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DsV(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r2 = 0
            X.0qQ.A0B(r5, r2)
            android.view.GestureDetector r1 = r4.A02
            android.view.MotionEvent r0 = X.C13989Tnp.A0N(r5)
            r1.onTouchEvent(r0)
            boolean r3 = r4.A00
            int r1 = r5.getActionMasked()
            r0 = 1
            if (r1 == r0) goto L_0x0031
            r0 = 2
            if (r1 == r0) goto L_0x001d
            r0 = 3
            if (r1 == r0) goto L_0x0031
        L_0x001c:
            return r3
        L_0x001d:
            if (r3 == 0) goto L_0x001c
            X.VN5 r0 = r4.A03
            float r2 = r5.getX()
            float r1 = r5.getY()
            X.We2 r0 = r0.A00
            X.XCF r0 = r0.A01
            r0.Dqp(r2, r1)
            return r3
        L_0x0031:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x001c
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x001c
            X.VN5 r0 = r4.A03
            X.We2 r0 = r0.A00
            X.XCF r0 = r0.A01
            r0.Dqo()
            r4.A00 = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19701We3.DsV(android.view.MotionEvent):boolean");
    }

    public final void EHq(float f, float f2) {
    }

    public final void destroy() {
        this.A01 = true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (!this.A01) {
            this.A00 = true;
            VN5 vn5 = this.A03;
            vn5.A00.A01.Dqn(motionEvent.getX(), motionEvent.getY());
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
