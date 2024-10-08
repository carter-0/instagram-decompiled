package com.facebook.cameracore.mediapipeline.services.touch.interfaces;

public abstract class Gesture {
    public final GestureState gestureState;
    public final long id;
    public final float x;
    public final float y;

    public enum GestureState {
        BEGAN,
        CHANGED,
        ENDED,
        CANCELLED,
        FAILED
    }

    public enum GestureType {
        TAP,
        PAN,
        PINCH,
        ROTATE,
        LONG_PRESS,
        RAW_TOUCH
    }

    public abstract GestureType getGestureType();

    public String getGestureStateName() {
        return this.gestureState.name();
    }

    public Gesture(long j, float f, float f2, GestureState gestureState2, boolean z, float f3, float f4) {
        this.id = j;
        this.gestureState = gestureState2;
        this.x = f;
        this.y = f2;
    }

    public String getGestureTypeName() {
        return getGestureType().name();
    }
}
