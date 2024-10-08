package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PanGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PinchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.RawTouchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9b2  reason: invalid class name and case insensitive filesystem */
public final class C381019b2 extends C372028zY implements C41801B1g {
    public final List A00 = AnonymousClass7TE.A1C();
    public final List A01 = AnonymousClass7TE.A1C();
    public final TouchGesturesListener$HitTestCallback A02 = new AS4(this);

    public final List EzQ(Bundle bundle) {
        Bundle bundle2 = bundle;
        0qQ.A0B(bundle2, 0);
        if (bundle2.containsKey("commandType")) {
            int i = bundle2.getInt("commandType");
            if (i == 0) {
                if (bundle2.containsKey("touchEventId") && bundle2.containsKey("touchEventX") && bundle2.containsKey("touchEventY") && bundle2.containsKey("touchEventTime") && bundle2.containsKey("touchEventType")) {
                    float f = bundle2.getFloat("touchEventX");
                    float f2 = bundle2.getFloat("touchEventY");
                    long j = bundle2.getLong("touchEventId");
                    long j2 = bundle2.getLong("touchEventTime");
                    int i2 = bundle2.getInt("touchEventType");
                    TouchEvent.TouchEventType touchEventType = TouchEvent.TouchEventType.DOWN;
                    if (i2 != touchEventType.ordinal()) {
                        touchEventType = TouchEvent.TouchEventType.MOVE;
                        if (i2 != touchEventType.ordinal()) {
                            touchEventType = TouchEvent.TouchEventType.UP;
                            if (i2 != touchEventType.ordinal()) {
                                touchEventType = TouchEvent.TouchEventType.CANCEL;
                            }
                        }
                    }
                    TouchEvent touchEvent = new TouchEvent(f, f2, j, touchEventType, j2, true, 0.0f, 0.0f);
                    for (C41826B2h addTouchEvent : this.A01) {
                        addTouchEvent.addTouchEvent(touchEvent);
                    }
                }
            } else if (i == 1) {
                Gesture A04 = A04(bundle2);
                if (A04 != null) {
                    for (C41826B2h addGestureEvent : this.A01) {
                        addGestureEvent.addGestureEvent(A04);
                    }
                }
            } else if (i == 2) {
                Gesture A042 = A04(bundle2);
                if (A042 != null) {
                    for (C41826B2h enqueueForHitTest : this.A01) {
                        enqueueForHitTest.enqueueForHitTest(A042, this.A02);
                    }
                }
            } else if (i == 4) {
                for (C41826B2h dispatchUnconsumedGestures : this.A01) {
                    dispatchUnconsumedGestures.dispatchUnconsumedGestures();
                }
            }
        }
        List list = this.A00;
        ArrayList A0U = 00k.A0U(list);
        list.clear();
        return A0U;
    }

    public static final Gesture.GestureState A00(int i) {
        Gesture.GestureState gestureState = Gesture.GestureState.BEGAN;
        if (i == gestureState.ordinal()) {
            return gestureState;
        }
        Gesture.GestureState gestureState2 = Gesture.GestureState.CHANGED;
        if (i == gestureState2.ordinal()) {
            return gestureState2;
        }
        Gesture.GestureState gestureState3 = Gesture.GestureState.ENDED;
        if (i == gestureState3.ordinal()) {
            return gestureState3;
        }
        Gesture.GestureState gestureState4 = Gesture.GestureState.CANCELLED;
        if (i != gestureState4.ordinal()) {
            return Gesture.GestureState.FAILED;
        }
        return gestureState4;
    }

    public final Gesture A04(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!bundle2.containsKey("gestureId") || !bundle2.containsKey("gestureX") || !bundle2.containsKey("gestureY") || !bundle2.containsKey("gestureState") || !bundle2.containsKey("gestureType")) {
            return null;
        }
        float f = bundle2.getFloat("gestureX");
        float f2 = bundle2.getFloat("gestureY");
        long j = bundle2.getLong("gestureId");
        int i = bundle2.getInt("gestureState");
        int i2 = bundle2.getInt("gestureType");
        if (i2 == Gesture.GestureType.LONG_PRESS.ordinal()) {
            return new Gesture(j, f, f2, A00(i), true, 0.0f, 0.0f);
        } else if (i2 == Gesture.GestureType.TAP.ordinal()) {
            return new Gesture(j, f, f2, A00(i), true, 0.0f, 0.0f);
        } else if (i2 == Gesture.GestureType.PAN.ordinal()) {
            if (!bundle2.containsKey("panGestureTranslateX") || !bundle2.containsKey("panGestureTranslateY")) {
                return null;
            }
            return new PanGesture(j, bundle2.getFloat("panGestureTranslateX"), bundle2.getFloat("panGestureTranslateY"), f, f2, A00(i), true, 0.0f, 0.0f);
        } else if (i2 == Gesture.GestureType.ROTATE.ordinal()) {
            if (!bundle2.containsKey("rotationGestureAngle")) {
                return null;
            }
            return new RotationGesture(j, bundle2.getFloat("rotationGestureAngle"), f, f2, A00(i), true, 0.0f, 0.0f);
        } else if (i2 == Gesture.GestureType.RAW_TOUCH.ordinal()) {
            if (!bundle2.containsKey("rawTouchGestureTranslateX") || !bundle2.containsKey("rawTouchGestureTranslateY")) {
                return null;
            }
            return new RawTouchGesture(j, bundle2.getFloat("rawTouchGestureTranslateX"), bundle2.getFloat("rawTouchGestureTranslateY"), f, f2, A00(i), true, 0.0f, 0.0f);
        } else if (i2 != Gesture.GestureType.PINCH.ordinal() || !bundle2.containsKey("pinchGestureScale")) {
            return null;
        } else {
            return new PinchGesture(j, bundle2.getFloat("pinchGestureScale"), f, f2, A00(i), true, 0.0f, 0.0f);
        }
    }
}
