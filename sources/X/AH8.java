package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PanGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.RawTouchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import java.util.Map;

public final class AH8 {
    public static final int A0K = ViewConfiguration.getLongPressTimeout();
    public static final int A0L = ViewConfiguration.getTapTimeout();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public MotionEvent A05;
    public Boolean A06 = false;
    public Boolean A07 = false;
    public Boolean A08 = false;
    public Boolean A09;
    public Float A0A;
    public Float A0B;
    public Float A0C;
    public Float A0D;
    public boolean A0E;
    public final Handler A0F = AnonymousClass7TF.A0D();
    public final GestureDetector A0G;
    public final A8p A0H;
    public final Runnable A0I = new C40731AiI(this);
    public final Map A0J;

    public static void A00(AH8 ah8, float f, float f2, float f3, float f4, long j) {
        A8p a8p = ah8.A0H;
        float f5 = f3;
        float f6 = f4;
        long j2 = j;
        TouchEvent touchEvent = new TouchEvent(f5, f6, j2, TouchEvent.TouchEventType.UP, System.currentTimeMillis(), true, a8p.A00, a8p.A01);
        C372038zZ r1 = a8p.A02;
        C372038zZ.A06(r1, touchEvent);
        Map map = r1.A0J;
        Number number = (Number) map.remove(Long.valueOf(j2));
        if (number == null) {
            return;
        }
        if (!map.isEmpty() || !C372038zZ.A08(r1, number.longValue())) {
            C372038zZ.A05(r1, new RawTouchGesture(number.longValue(), f3 - f, f4 - f2, f5, f6, Gesture.GestureState.ENDED, true, a8p.A00, a8p.A01));
        } else {
            r1.A0P.add(number);
        }
    }

    public final void A01(float f, float f2, float f3, float f4) {
        long j;
        Boolean bool = this.A09;
        if (bool != null && bool.booleanValue()) {
            float f5 = f - this.A02;
            this.A0A = Float.valueOf(f5);
            float f6 = f2 - this.A03;
            this.A0B = Float.valueOf(f6);
            Float f7 = this.A0C;
            if (f7 == null) {
                f7 = Float.valueOf(f3);
                this.A0C = f7;
                this.A0D = Float.valueOf(f4);
            }
            A8p a8p = this.A0H;
            float floatValue = f7.floatValue();
            float floatValue2 = this.A0D.floatValue();
            C372038zZ r1 = a8p.A02;
            Map map = r1.A0K;
            Gesture.GestureType gestureType = Gesture.GestureType.PAN;
            if (map.containsKey(gestureType)) {
                j = AnonymousClass7TE.A0R(map.get(gestureType));
                if (C372038zZ.A08(r1, j)) {
                    return;
                }
            } else {
                j = C372038zZ.A00(r1, gestureType);
                C372038zZ.A05(r1, new PanGesture(j, f5 - floatValue, f6 - floatValue2, f5, f6, Gesture.GestureState.BEGAN, true, a8p.A00, a8p.A01));
            }
            C372038zZ.A05(r1, new PanGesture(j, f5 - floatValue, f6 - floatValue2, f5, f6, Gesture.GestureState.CHANGED, true, a8p.A00, a8p.A01));
        }
    }

    public final void A02(long j, float f, float f2) {
        A8p a8p = this.A0H;
        long j2 = j;
        float f3 = f;
        float f4 = f2;
        TouchEvent touchEvent = new TouchEvent(f3, f4, j2, TouchEvent.TouchEventType.DOWN, System.currentTimeMillis(), true, a8p.A00, a8p.A01);
        C372038zZ r4 = a8p.A02;
        C372038zZ.A06(r4, touchEvent);
        Map map = r4.A0J;
        Long valueOf = Long.valueOf(j2);
        if (!map.containsKey(valueOf)) {
            long j3 = r4.A03;
            r4.A03 = 1 + j3;
            Long valueOf2 = Long.valueOf(j3);
            map.put(valueOf, valueOf2);
            r4.A0L.put(valueOf2, C390819rt.HIT_TESTING);
            C372038zZ.A05(r4, new RawTouchGesture(j3, 0.0f, 0.0f, f3, f4, Gesture.GestureState.BEGAN, true, a8p.A00, a8p.A01));
        }
    }

    public AH8(Context context, Handler handler, A8p a8p) {
        GestureDetector gestureDetector = new GestureDetector(context, new ALl(this), handler);
        this.A0G = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A0H = a8p;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A04 = scaledTouchSlop * scaledTouchSlop;
        this.A0J = AnonymousClass7TE.A1E();
    }
}
