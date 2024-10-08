package X;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;

/* renamed from: X.B2h  reason: case insensitive filesystem */
public interface C41826B2h {
    void addGestureEvent(Gesture gesture);

    void addTouchEvent(TouchEvent touchEvent);

    void dispatchUnconsumedGestures();

    void enqueueForHitTest(Gesture gesture, TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback);
}
