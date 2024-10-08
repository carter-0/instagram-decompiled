package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.7nd  reason: invalid class name and case insensitive filesystem */
public final class C341857nd implements GestureDetector.OnGestureListener {
    public final C340547lR A00;

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.A00.A07(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public C341857nd(C340547lR r1) {
        this.A00 = r1;
    }
}
