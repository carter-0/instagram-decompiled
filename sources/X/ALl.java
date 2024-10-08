package X;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

public final class ALl implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ AH8 A00;

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public ALl(AH8 ah8) {
        this.A00 = ah8;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        AH8 ah8 = this.A00;
        int i = AH8.A0K;
        MotionEvent motionEvent2 = ah8.A05;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        ah8.A05 = MotionEvent.obtain(motionEvent);
        Handler handler = ah8.A0F;
        Runnable runnable = ah8.A0I;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, (long) (AH8.A0L + AH8.A0K));
        ah8.A07 = AnonymousClass7TE.A0v();
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float y;
        AH8 ah8 = this.A00;
        int i = AH8.A0K;
        if (ah8.A0E && !ah8.A06.booleanValue()) {
            ah8.A0F.removeCallbacks(ah8.A0I);
            ah8.A07 = false;
            float x = motionEvent2.getX();
            float y2 = motionEvent2.getY();
            Boolean bool = ah8.A09;
            if (bool == null) {
                if (motionEvent != null) {
                    ah8.A0C = Float.valueOf(motionEvent.getX());
                    y = motionEvent.getY();
                } else {
                    ah8.A0C = Float.valueOf(motionEvent2.getX());
                    y = motionEvent2.getY();
                }
                ah8.A0D = Float.valueOf(y);
                C372038zZ r1 = ah8.A0H.A02;
                r1.A0E = true;
                bool = Boolean.valueOf(r1.A0Q.contains(Gesture.GestureType.PAN));
                ah8.A09 = bool;
                Float f3 = ah8.A0A;
                if (f3 == null) {
                    f3 = Float.valueOf(x);
                    ah8.A0A = f3;
                    ah8.A0B = Float.valueOf(y2);
                }
                ah8.A02 = x - f3.floatValue();
                ah8.A03 = y2 - ah8.A0B.floatValue();
            }
            if (bool.booleanValue()) {
                ah8.A01(x, y2, ah8.A0C.floatValue(), ah8.A0D.floatValue());
                return true;
            }
        }
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        AH8 ah8 = this.A00;
        int i = AH8.A0K;
        if (ah8.A06.booleanValue()) {
            return false;
        }
        if (ah8.A0C == null || ah8.A0A == null) {
            return ah8.A0H.A00(motionEvent);
        }
        return false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        AH8 ah8 = this.A00;
        int i = AH8.A0K;
        A8p a8p = ah8.A0H;
        a8p.A02.A0D = true;
        a8p.A00(motionEvent);
        return true;
    }
}
