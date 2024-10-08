package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.2gh  reason: invalid class name and case insensitive filesystem */
public final class C226372gh implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public GestureDetector.OnDoubleTapListener A00;
    public final GestureDetector.OnGestureListener A01;

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        GestureDetector.OnDoubleTapListener onDoubleTapListener;
        if (motionEvent == null || (onDoubleTapListener = this.A00) == null) {
            return true;
        }
        return onDoubleTapListener.onDoubleTap(motionEvent);
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        GestureDetector.OnDoubleTapListener onDoubleTapListener;
        if (motionEvent == null || (onDoubleTapListener = this.A00) == null) {
            return true;
        }
        return onDoubleTapListener.onDoubleTapEvent(motionEvent);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        return this.A01.onDown(motionEvent);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null) {
            return true;
        }
        return this.A01.onFling(motionEvent, motionEvent2, f, f2);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.A01.onLongPress(motionEvent);
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null) {
            return true;
        }
        return this.A01.onScroll(motionEvent, motionEvent2, f, f2);
    }

    public final void onShowPress(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.A01.onShowPress(motionEvent);
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        GestureDetector.OnDoubleTapListener onDoubleTapListener;
        if (motionEvent == null || (onDoubleTapListener = this.A00) == null) {
            return true;
        }
        return onDoubleTapListener.onSingleTapConfirmed(motionEvent);
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        return this.A01.onSingleTapUp(motionEvent);
    }

    public C226372gh(GestureDetector.OnGestureListener onGestureListener) {
        this.A01 = onGestureListener;
        if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
            this.A00 = (GestureDetector.OnDoubleTapListener) onGestureListener;
        }
    }
}
