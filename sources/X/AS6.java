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
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class AS6 implements C41826B2h, B38 {
    public TouchGesturesListener$HitTestCallback A00;
    public final BlockingQueue A01 = new LinkedBlockingQueue();

    public final void FKT(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        if (bundle.containsKey("commandType") && bundle.getInt("commandType") == 3 && bundle.containsKey("consumed") && bundle.containsKey("gestureId")) {
            long j = bundle.getLong("gestureId");
            boolean z = bundle.getBoolean("consumed");
            TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback = this.A00;
            if (touchGesturesListener$HitTestCallback != null) {
                touchGesturesListener$HitTestCallback.hitTestResult(j, z);
            }
        }
    }

    public final void addGestureEvent(Gesture gesture) {
        0qQ.A0B(gesture, 0);
        this.A01.add(A00(gesture, 1));
    }

    public final void enqueueForHitTest(Gesture gesture, TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback) {
        0qQ.A0B(touchGesturesListener$HitTestCallback, 1);
        if (this.A00 == null) {
            this.A00 = touchGesturesListener$HitTestCallback;
        }
        this.A01.add(A00(gesture, 2));
    }

    public final Bundle BH4() {
        return AnonymousClass7TH.A05(91);
    }

    public final void CMw(C371698yt r3) {
        C372008zW r0;
        C372028zY r1;
        List list;
        if (r3 != null) {
            C371628yi r12 = C372008zW.A01;
            if (C371698yt.A01(r3, r12) && (r0 = (C372008zW) r3.A02(r12)) != null && (r1 = r0.A00) != null) {
                if (r1 instanceof C372018zX) {
                    list = ((C372018zX) r1).A03;
                } else {
                    list = ((C381019b2) r1).A01;
                }
                list.add(this);
            }
        }
    }

    public final void addTouchEvent(TouchEvent touchEvent) {
        Bundle A002 = Q21.A00(AnonymousClass7TF.A0x("serviceType", 91), AnonymousClass7TH.A0J(AnonymousClass05K.A00), AnonymousClass7TE.A1L("touchEventX", Float.valueOf(touchEvent.x)), AnonymousClass7TE.A1L("touchEventY", Float.valueOf(touchEvent.y)), AnonymousClass7TE.A1L("touchEventType", Integer.valueOf(touchEvent.eventType.ordinal())));
        A002.putLong("touchEventTime", touchEvent.time);
        A002.putLong("touchEventId", touchEvent.id);
        this.A01.add(A002);
    }

    public final void dispatchUnconsumedGestures() {
        this.A01.add(AnonymousClass7TG.A0P("commandType", AnonymousClass05K.A0Y, AnonymousClass7TF.A0x("serviceType", 91)));
    }

    public static final Bundle A00(Gesture gesture, int i) {
        float f;
        String str;
        Gesture.GestureType gestureType = gesture.getGestureType();
        0qQ.A07(gestureType);
        0eP A0x = AnonymousClass7TF.A0x("serviceType", 91);
        0eP A0J = AnonymousClass7TH.A0J(Integer.valueOf(i));
        0eP A1L = AnonymousClass7TE.A1L("gestureX", Float.valueOf(gesture.x));
        0eP A1L2 = AnonymousClass7TE.A1L("gestureY", Float.valueOf(gesture.y));
        0eP A1L3 = AnonymousClass7TE.A1L("gestureState", Integer.valueOf(gesture.gestureState.ordinal()));
        int ordinal = gestureType.ordinal();
        Bundle A002 = Q21.A00(A0x, A0J, A1L, A1L2, A1L3, AnonymousClass7TE.A1L("gestureType", Integer.valueOf(ordinal)));
        A002.putLong("gestureId", gesture.id);
        switch (ordinal) {
            case 0:
            case 4:
                return A002;
            case 1:
                PanGesture panGesture = (PanGesture) gesture;
                A002.putFloat("panGestureTranslateX", panGesture.translateX);
                f = panGesture.translateY;
                str = "panGestureTranslateY";
                break;
            case 2:
                f = ((PinchGesture) gesture).scale;
                str = "pinchGestureScale";
                break;
            case 3:
                f = ((RotationGesture) gesture).angle;
                str = "rotationGestureAngle";
                break;
            case 5:
                RawTouchGesture rawTouchGesture = (RawTouchGesture) gesture;
                A002.putFloat("rawTouchGestureTranslateX", rawTouchGesture.translateX);
                f = rawTouchGesture.translateY;
                str = "rawTouchGestureTranslateY";
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        A002.putFloat(str, f);
        return A002;
    }

    public final List EzR() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A01.drainTo(A1C);
        if (A1C.isEmpty()) {
            A1C.add(AnonymousClass7TH.A05(91));
        }
        return A1C;
    }
}
