package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

public class TapGesture extends Gesture {
    public final Gesture.GestureType getGestureType() {
        return Gesture.GestureType.TAP;
    }
}
