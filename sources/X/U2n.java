package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public abstract class U2n extends GestureDetector.SimpleOnGestureListener {
    public boolean A00;

    public abstract void A00(MotionEvent motionEvent);

    public final boolean onDown(MotionEvent motionEvent) {
        this.A00 = false;
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A00) {
            return false;
        }
        A00(motionEvent);
        this.A00 = true;
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A00 || motionEvent.getEventTime() - motionEvent.getDownTime() <= ((long) ViewConfiguration.getDoubleTapTimeout())) {
            return false;
        }
        A00(motionEvent);
        this.A00 = true;
        return true;
    }
}
