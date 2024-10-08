package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.We0  reason: case insensitive filesystem */
public final class C19698We0 implements C317956o7 {
    public final /* synthetic */ GestureDetector A00;

    public final boolean DL9(MotionEvent motionEvent) {
        return true;
    }

    public final boolean DsV(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A00.onTouchEvent(motionEvent);
        return true;
    }

    public final void EHq(float f, float f2) {
    }

    public final void destroy() {
    }

    public C19698We0(GestureDetector gestureDetector) {
        this.A00 = gestureDetector;
    }
}
