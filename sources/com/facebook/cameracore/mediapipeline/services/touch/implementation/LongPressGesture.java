package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

public class LongPressGesture extends Gesture {
    public final Gesture.GestureType getGestureType() {
        return Gesture.GestureType.LONG_PRESS;
    }
}
