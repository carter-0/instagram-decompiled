package X;

import android.view.MotionEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AiI  reason: case insensitive filesystem */
public final class C40731AiI implements Runnable {
    public final /* synthetic */ AH8 A00;

    public C40731AiI(AH8 ah8) {
        this.A00 = ah8;
    }

    public final void run() {
        MotionEvent motionEvent;
        long j;
        AH8 ah8 = this.A00;
        Boolean A0u = AnonymousClass7TE.A0u();
        int i = AH8.A0K;
        ah8.A07 = A0u;
        A8p a8p = ah8.A0H;
        C372038zZ r0 = a8p.A02;
        boolean z = true;
        r0.A0E = true;
        Set set = r0.A0Q;
        Gesture.GestureType gestureType = Gesture.GestureType.LONG_PRESS;
        if (!set.contains(gestureType)) {
            if (r0.A00 == 0 && r0.A01 == 0) {
                C372038zZ.A01(r0);
            }
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        ah8.A06 = valueOf;
        if (valueOf.booleanValue() && (motionEvent = ah8.A05) != null) {
            ah8.A00 = motionEvent.getX();
            float y = ah8.A05.getY();
            ah8.A01 = y;
            float f = ah8.A00;
            Map map = r0.A0K;
            if (map.containsKey(gestureType)) {
                j = AnonymousClass7TE.A0R(map.get(gestureType));
                if (C372038zZ.A08(r0, j)) {
                    return;
                }
            } else {
                j = C372038zZ.A00(r0, gestureType);
                C372038zZ.A05(r0, new Gesture(j, f, y, Gesture.GestureState.BEGAN, true, a8p.A00, a8p.A01));
            }
            C372038zZ.A05(r0, new Gesture(j, f, y, Gesture.GestureState.CHANGED, true, a8p.A00, a8p.A01));
        }
    }
}
