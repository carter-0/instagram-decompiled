package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import X.0qQ;
import X.C41826B2h;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;
import com.facebook.jni.HybridData;

public final class TouchGesturesDelegateWrapper implements C41826B2h {
    public final HybridData mHybridData = initHybrid();

    private final native void addGestureEventNative(Gesture gesture);

    private final native void addTouchEventNative(TouchEvent touchEvent);

    private final native void dispatchUnconsumedGesturesNative();

    private final native void enqueueForHitTestNative(Gesture gesture, TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback);

    private final native HybridData initHybrid();

    public void addGestureEvent(Gesture gesture) {
        0qQ.A0B(gesture, 0);
        addGestureEventNative(gesture);
    }

    public void enqueueForHitTest(Gesture gesture, TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback) {
        0qQ.A0B(touchGesturesListener$HitTestCallback, 1);
        enqueueForHitTestNative(gesture, touchGesturesListener$HitTestCallback);
    }

    public void dispatchUnconsumedGestures() {
        dispatchUnconsumedGesturesNative();
    }

    public void addTouchEvent(TouchEvent touchEvent) {
        addTouchEventNative(touchEvent);
    }
}
