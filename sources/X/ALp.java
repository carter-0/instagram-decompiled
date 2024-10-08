package X;

import android.view.ScaleGestureDetector;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PinchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import java.util.Map;

public final class ALp implements ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public final /* synthetic */ C372038zZ A05;

    public ALp(C372038zZ r1) {
        this.A05 = r1;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float f;
        long j;
        C372038zZ r0 = this.A05;
        AH8 ah8 = r0.A0A;
        if (ah8 != null) {
            ah8.A01(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), this.A03, this.A04);
        }
        float currentSpan = scaleGestureDetector.getCurrentSpan();
        float f2 = this.A00;
        if (f2 > 0.0f) {
            f = currentSpan / f2;
        } else {
            f = 1.0f;
        }
        Map map = r0.A0K;
        Gesture.GestureType gestureType = Gesture.GestureType.PINCH;
        if (!map.containsKey(gestureType) && AnonymousClass7TE.A00(1.0f, f) < 0.1f) {
            return true;
        }
        r0.A0E = true;
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        if (map.containsKey(gestureType)) {
            j = AnonymousClass7TE.A0R(map.get(gestureType));
            if (C372038zZ.A08(r0, j)) {
                return true;
            }
        } else {
            j = C372038zZ.A00(r0, gestureType);
            C372038zZ.A05(r0, new PinchGesture(j, f, focusX, focusY, Gesture.GestureState.BEGAN, true, this.A01, this.A02));
        }
        C372038zZ.A05(r0, new PinchGesture(j, f, focusX, focusY, Gesture.GestureState.CHANGED, true, this.A01, this.A02));
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C372038zZ r3 = this.A05;
        if (r3.A0A == null) {
            return false;
        }
        this.A03 = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        this.A04 = focusY;
        AH8 ah8 = r3.A0A;
        float f = this.A03;
        ah8.A0E = false;
        Float f2 = ah8.A0A;
        if (f2 == null) {
            f2 = Float.valueOf(f);
            ah8.A0A = f2;
            ah8.A0B = Float.valueOf(focusY);
        }
        ah8.A02 = f - f2.floatValue();
        ah8.A03 = focusY - ah8.A0B.floatValue();
        ah8.A09 = null;
        C372038zZ r1 = ah8.A0H.A02;
        r1.A0E = true;
        ah8.A09 = Boolean.valueOf(r1.A0Q.contains(Gesture.GestureType.PAN));
        boolean contains = r3.A0Q.contains(Gesture.GestureType.PINCH);
        if (!contains) {
            return contains;
        }
        this.A00 = scaleGestureDetector.getCurrentSpan();
        return contains;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        float f;
        C372038zZ r2 = this.A05;
        AH8 ah8 = r2.A0A;
        if (ah8 != null) {
            ah8.A0E = true;
            ah8.A09 = null;
        }
        Map map = r2.A0K;
        Gesture.GestureType gestureType = Gesture.GestureType.PINCH;
        if (map.containsKey(gestureType)) {
            long A0R = AnonymousClass7TE.A0R(map.get(gestureType));
            if (C372038zZ.A08(r2, A0R)) {
                r2.A0O.add(gestureType);
                return;
            }
            float currentSpan = scaleGestureDetector.getCurrentSpan();
            float f2 = this.A00;
            if (f2 > 0.0f) {
                f = currentSpan / f2;
            } else {
                f = 1.0f;
            }
            C372038zZ.A05(r2, new PinchGesture(A0R, f, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), Gesture.GestureState.ENDED, true, this.A01, this.A02));
        }
    }
}
